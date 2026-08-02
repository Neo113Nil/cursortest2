package com.vk.clips.upload.vk.ui.impl.fragment.entity.params;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.qoy;
import xsna.shy;

/* compiled from: EasyPromoteData.kt */
/* loaded from: classes17.dex */
public final class EasyPromoteData implements Parcelable {
    public static final Parcelable.Creator<EasyPromoteData> CREATOR = new a();
    public final int b;
    public final int c;
    public final boolean d;
    public final EasyPromoteUnavalabilityReason e;

    /* compiled from: EasyPromoteData.kt */
    public static final class a implements Parcelable.Creator<EasyPromoteData> {
        @Override // android.os.Parcelable.Creator
        public final EasyPromoteData createFromParcel(Parcel parcel) {
            return new EasyPromoteData(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : EasyPromoteUnavalabilityReason.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final EasyPromoteData[] newArray(int i) {
            return new EasyPromoteData[i];
        }
    }

    public EasyPromoteData(int i, int i2, boolean z, EasyPromoteUnavalabilityReason easyPromoteUnavalabilityReason) {
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = easyPromoteUnavalabilityReason;
    }

    public static EasyPromoteData a(EasyPromoteData easyPromoteData, int i, int i2, boolean z, EasyPromoteUnavalabilityReason easyPromoteUnavalabilityReason, int i3) {
        if ((i3 & 1) != 0) {
            i = easyPromoteData.b;
        }
        if ((i3 & 2) != 0) {
            i2 = easyPromoteData.c;
        }
        if ((i3 & 4) != 0) {
            z = easyPromoteData.d;
        }
        if ((i3 & 8) != 0) {
            easyPromoteUnavalabilityReason = easyPromoteData.e;
        }
        easyPromoteData.getClass();
        return new EasyPromoteData(i, i2, z, easyPromoteUnavalabilityReason);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EasyPromoteData)) {
            return false;
        }
        EasyPromoteData easyPromoteData = (EasyPromoteData) obj;
        return this.b == easyPromoteData.b && this.c == easyPromoteData.c && this.d == easyPromoteData.d && this.e == easyPromoteData.e;
    }

    public final int hashCode() {
        int b = qoy.b(shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31, this.d);
        EasyPromoteUnavalabilityReason easyPromoteUnavalabilityReason = this.e;
        return b + (easyPromoteUnavalabilityReason == null ? 0 : easyPromoteUnavalabilityReason.hashCode());
    }

    public final String toString() {
        return "EasyPromoteData(durationDays=" + this.b + ", budgetRub=" + this.c + ", allowEasyPromote=" + this.d + ", unavalabilityReason=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        EasyPromoteUnavalabilityReason easyPromoteUnavalabilityReason = this.e;
        if (easyPromoteUnavalabilityReason == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(easyPromoteUnavalabilityReason.name());
        }
    }
}
