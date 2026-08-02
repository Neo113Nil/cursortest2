package com.vk.uxpolls.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4313f8;
import java.util.Date;
import xsna.pmi0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: UxPollsShownData.kt */
/* loaded from: classes6.dex */
public final class UxPollsShownData implements Parcelable {
    public static final Parcelable.Creator<UxPollsShownData> CREATOR = new a();

    @pmi0(C4313f8.m)
    private final boolean isShown;

    @pmi0("timestamp")
    private final long timestamp;

    /* compiled from: UxPollsShownData.kt */
    public static final class a implements Parcelable.Creator<UxPollsShownData> {
        @Override // android.os.Parcelable.Creator
        public final UxPollsShownData createFromParcel(Parcel parcel) {
            return new UxPollsShownData(parcel.readInt() != 0, parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final UxPollsShownData[] newArray(int i) {
            return new UxPollsShownData[i];
        }
    }

    public UxPollsShownData(boolean z, long j) {
        this.isShown = z;
        this.timestamp = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UxPollsShownData)) {
            return false;
        }
        UxPollsShownData uxPollsShownData = (UxPollsShownData) obj;
        return this.isShown == uxPollsShownData.isShown && this.timestamp == uxPollsShownData.timestamp;
    }

    public final int hashCode() {
        return Long.hashCode(this.timestamp) + (Boolean.hashCode(this.isShown) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UxPollsShownData(isShown=");
        sb.append(this.isShown);
        sb.append(", timestamp=");
        return vu5.a(')', this.timestamp, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isShown ? 1 : 0);
        parcel.writeLong(this.timestamp);
    }

    public /* synthetic */ UxPollsShownData(boolean z, long j, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? new Date().getTime() : j);
    }
}
