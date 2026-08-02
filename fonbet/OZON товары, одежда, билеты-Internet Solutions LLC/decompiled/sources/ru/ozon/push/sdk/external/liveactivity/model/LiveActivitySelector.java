package ru.ozon.push.sdk.external.liveactivity.model;

import B6.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/push/sdk/external/liveactivity/model/LiveActivitySelector;", "Landroid/os/Parcelable;", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LiveActivitySelector implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LiveActivitySelector> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f97685a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f97686b;

    public static final class a implements Parcelable.Creator<LiveActivitySelector> {
        @Override // android.os.Parcelable.Creator
        public final LiveActivitySelector createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = b.a(parcel, linkedHashMap, parcel.readString(), i11, 1);
            }
            return new LiveActivitySelector(readString, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final LiveActivitySelector[] newArray(int i11) {
            return new LiveActivitySelector[i11];
        }
    }

    public LiveActivitySelector(@NotNull String widgetName, @NotNull Map<String, String> metadata) {
        Intrinsics.checkNotNullParameter(widgetName, "widgetName");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f97685a = widgetName;
        this.f97686b = metadata;
    }

    @NotNull
    public final Map<String, String> a() {
        return this.f97686b;
    }

    @NotNull
    /* renamed from: b, reason: from getter */
    public final String getF97685a() {
        return this.f97685a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LiveActivitySelector.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.push.sdk.external.liveactivity.model.LiveActivitySelector");
        LiveActivitySelector liveActivitySelector = (LiveActivitySelector) obj;
        if (Intrinsics.d(this.f97685a, liveActivitySelector.f97685a)) {
            return Intrinsics.d(this.f97686b, liveActivitySelector.f97686b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f97686b.hashCode() + (this.f97685a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97685a);
        Map<String, String> map = this.f97686b;
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
    }
}
