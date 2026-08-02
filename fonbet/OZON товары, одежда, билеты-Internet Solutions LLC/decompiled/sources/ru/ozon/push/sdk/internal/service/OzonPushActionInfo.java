package ru.ozon.push.sdk.internal.service;

import C.o0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/push/sdk/internal/service/OzonPushActionInfo;", "Landroid/os/Parcelable;", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class OzonPushActionInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OzonPushActionInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final int f97694a;

    /* renamed from: b, reason: collision with root package name */
    private final String f97695b;

    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<OzonPushActionInfo> {
        @Override // android.os.Parcelable.Creator
        public final OzonPushActionInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OzonPushActionInfo(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OzonPushActionInfo[] newArray(int i11) {
            return new OzonPushActionInfo[i11];
        }
    }

    public OzonPushActionInfo() {
        this(-1, null);
    }

    /* renamed from: a, reason: from getter */
    public final int getF97694a() {
        return this.f97694a;
    }

    /* renamed from: b, reason: from getter */
    public final String getF97695b() {
        return this.f97695b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OzonPushActionInfo)) {
            return false;
        }
        OzonPushActionInfo ozonPushActionInfo = (OzonPushActionInfo) obj;
        return this.f97694a == ozonPushActionInfo.f97694a && Intrinsics.d(this.f97695b, ozonPushActionInfo.f97695b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f97694a) * 31;
        String str = this.f97695b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OzonPushActionInfo(notificationId=");
        sb2.append(this.f97694a);
        sb2.append(", url=");
        return o0.c(sb2, this.f97695b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f97694a);
        dest.writeString(this.f97695b);
    }

    public OzonPushActionInfo(int i11, String str) {
        this.f97694a = i11;
        this.f97695b = str;
    }
}
