package com.vk.im.ui.components.msg_search.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.im.ui.components.msg_search.analytics.ImSearchItemLoggingInfo;
import xsna.bh10;
import xsna.epx;
import xsna.shy;
import xsna.zcl;

/* compiled from: ImSearchLoggingInfo.kt */
/* loaded from: classes2.dex */
public final class ImSearchLocalItemLoggingInfo extends ImSearchItemLoggingInfo {
    public static final Parcelable.Creator<ImSearchLocalItemLoggingInfo> CREATOR = new a();
    public final ImSearchLocalRequestLoggingInfo b;
    public final int c;
    public final UserId d;
    public final ImSearchItemLoggingInfo.ClickDocType e;

    /* compiled from: ImSearchLoggingInfo.kt */
    public static final class a implements Parcelable.Creator<ImSearchLocalItemLoggingInfo> {
        @Override // android.os.Parcelable.Creator
        public final ImSearchLocalItemLoggingInfo createFromParcel(Parcel parcel) {
            return new ImSearchLocalItemLoggingInfo(ImSearchLocalRequestLoggingInfo.CREATOR.createFromParcel(parcel), parcel.readInt(), (UserId) parcel.readParcelable(ImSearchLocalItemLoggingInfo.class.getClassLoader()), ImSearchItemLoggingInfo.ClickDocType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ImSearchLocalItemLoggingInfo[] newArray(int i) {
            return new ImSearchLocalItemLoggingInfo[i];
        }
    }

    public /* synthetic */ ImSearchLocalItemLoggingInfo(ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo, int i, UserId userId, ImSearchItemLoggingInfo.ClickDocType clickDocType, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? new ImSearchLocalRequestLoggingInfo(null, null, 0L, 0, null, null, 0, false, 255, null) : imSearchLocalRequestLoggingInfo, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? new UserId(0L) : userId, clickDocType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImSearchLocalItemLoggingInfo)) {
            return false;
        }
        ImSearchLocalItemLoggingInfo imSearchLocalItemLoggingInfo = (ImSearchLocalItemLoggingInfo) obj;
        return epx.f(this.b, imSearchLocalItemLoggingInfo.b) && this.c == imSearchLocalItemLoggingInfo.c && epx.f(this.d, imSearchLocalItemLoggingInfo.d) && this.e == imSearchLocalItemLoggingInfo.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + bh10.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d.b);
    }

    public final String toString() {
        return "ImSearchLocalItemLoggingInfo(searchLocalRequestLoggingInfo=" + this.b + ", itemPosition=" + this.c + ", docOwnerId=" + this.d + ", docType=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e.name());
    }

    public ImSearchLocalItemLoggingInfo(ImSearchLocalRequestLoggingInfo imSearchLocalRequestLoggingInfo, int i, UserId userId, ImSearchItemLoggingInfo.ClickDocType clickDocType) {
        super(clickDocType, null);
        this.b = imSearchLocalRequestLoggingInfo;
        this.c = i;
        this.d = userId;
        this.e = clickDocType;
    }
}
