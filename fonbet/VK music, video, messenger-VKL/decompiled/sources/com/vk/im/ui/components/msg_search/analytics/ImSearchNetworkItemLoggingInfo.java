package com.vk.im.ui.components.msg_search.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import xsna.epx;
import xsna.nr;
import xsna.uqi;
import xsna.zcl;

/* compiled from: ImSearchLoggingInfo.kt */
/* loaded from: classes2.dex */
public final class ImSearchNetworkItemLoggingInfo extends ImSearchItemLoggingInfo {
    public static final Parcelable.Creator<ImSearchNetworkItemLoggingInfo> CREATOR = new a();
    public final ImSearchItemLoggingInfo.ClickDocType b;
    public final String c;
    public final Integer d;

    /* compiled from: ImSearchLoggingInfo.kt */
    public static final class a implements Parcelable.Creator<ImSearchNetworkItemLoggingInfo> {
        @Override // android.os.Parcelable.Creator
        public final ImSearchNetworkItemLoggingInfo createFromParcel(Parcel parcel) {
            return new ImSearchNetworkItemLoggingInfo(ImSearchItemLoggingInfo.ClickDocType.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final ImSearchNetworkItemLoggingInfo[] newArray(int i) {
            return new ImSearchNetworkItemLoggingInfo[i];
        }
    }

    public /* synthetic */ ImSearchNetworkItemLoggingInfo(ImSearchItemLoggingInfo.ClickDocType clickDocType, String str, Integer num, int i, zcl zclVar) {
        this(clickDocType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
    }

    public static ImSearchNetworkItemLoggingInfo a(ImSearchNetworkItemLoggingInfo imSearchNetworkItemLoggingInfo, Integer num) {
        ImSearchItemLoggingInfo.ClickDocType clickDocType = imSearchNetworkItemLoggingInfo.b;
        String str = imSearchNetworkItemLoggingInfo.c;
        imSearchNetworkItemLoggingInfo.getClass();
        return new ImSearchNetworkItemLoggingInfo(clickDocType, str, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImSearchNetworkItemLoggingInfo)) {
            return false;
        }
        ImSearchNetworkItemLoggingInfo imSearchNetworkItemLoggingInfo = (ImSearchNetworkItemLoggingInfo) obj;
        return this.b == imSearchNetworkItemLoggingInfo.b && epx.f(this.c, imSearchNetworkItemLoggingInfo.c) && epx.f(this.d, imSearchNetworkItemLoggingInfo.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImSearchNetworkItemLoggingInfo(docType=");
        sb.append(this.b);
        sb.append(", trackcode=");
        sb.append(this.c);
        sb.append(", position=");
        return uqi.b(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public ImSearchNetworkItemLoggingInfo(ImSearchItemLoggingInfo.ClickDocType clickDocType, String str, Integer num) {
        super(clickDocType, null);
        this.b = clickDocType;
        this.c = str;
        this.d = num;
    }
}
