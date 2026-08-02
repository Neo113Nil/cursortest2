package ru.ozon.push.sdk.external.service;

import B6.b;
import T7.P;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/push/sdk/external/service/RemoteMessage;", "Landroid/os/Parcelable;", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RemoteMessage implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f97687a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f97688b;

    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<RemoteMessage> {
        @Override // android.os.Parcelable.Creator
        public final RemoteMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = b.a(parcel, linkedHashMap, parcel.readString(), i11, 1);
            }
            return new RemoteMessage(readString, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final RemoteMessage[] newArray(int i11) {
            return new RemoteMessage[i11];
        }
    }

    public RemoteMessage(String str, @NotNull Map<String, String> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f97687a = str;
        this.f97688b = data;
    }

    public final String a() {
        return this.f97688b.get("message_id");
    }

    @NotNull
    public final Map<String, String> b() {
        return this.f97688b;
    }

    /* renamed from: c, reason: from getter */
    public final String getF97687a() {
        return this.f97687a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteMessage)) {
            return false;
        }
        RemoteMessage remoteMessage = (RemoteMessage) obj;
        return Intrinsics.d(this.f97687a, remoteMessage.f97687a) && Intrinsics.d(this.f97688b, remoteMessage.f97688b);
    }

    public final int hashCode() {
        String str = this.f97687a;
        return this.f97688b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RemoteMessage(messageId=");
        sb2.append(this.f97687a);
        sb2.append(", data=");
        return P.f(sb2, this.f97688b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97687a);
        Map<String, String> map = this.f97688b;
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
    }
}
