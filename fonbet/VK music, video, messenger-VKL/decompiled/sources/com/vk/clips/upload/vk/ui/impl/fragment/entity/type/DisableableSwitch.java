package com.vk.clips.upload.vk.ui.impl.fragment.entity.type;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;

/* compiled from: DisableableSwitch.kt */
/* loaded from: classes17.dex */
public final class DisableableSwitch implements Parcelable {
    public static final Parcelable.Creator<DisableableSwitch> CREATOR = new a();
    public final boolean b;
    public final boolean c;

    /* compiled from: DisableableSwitch.kt */
    public static final class a implements Parcelable.Creator<DisableableSwitch> {
        @Override // android.os.Parcelable.Creator
        public final DisableableSwitch createFromParcel(Parcel parcel) {
            return new DisableableSwitch(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final DisableableSwitch[] newArray(int i) {
            return new DisableableSwitch[i];
        }
    }

    public DisableableSwitch(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    public static DisableableSwitch a(DisableableSwitch disableableSwitch, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = disableableSwitch.b;
        }
        if ((i & 2) != 0) {
            z2 = disableableSwitch.c;
        }
        return new DisableableSwitch(z, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisableableSwitch)) {
            return false;
        }
        DisableableSwitch disableableSwitch = (DisableableSwitch) obj;
        return this.b == disableableSwitch.b && this.c == disableableSwitch.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisableableSwitch(data=");
        sb.append(this.b);
        sb.append(", enabled=");
        return q0.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
