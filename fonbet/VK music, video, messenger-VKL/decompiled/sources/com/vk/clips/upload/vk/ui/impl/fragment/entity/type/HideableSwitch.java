package com.vk.clips.upload.vk.ui.impl.fragment.entity.type;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;

/* compiled from: HideableSwitch.kt */
/* loaded from: classes17.dex */
public final class HideableSwitch implements Parcelable {
    public static final Parcelable.Creator<HideableSwitch> CREATOR = new a();
    public final boolean b;
    public final boolean c;

    /* compiled from: HideableSwitch.kt */
    public static final class a implements Parcelable.Creator<HideableSwitch> {
        @Override // android.os.Parcelable.Creator
        public final HideableSwitch createFromParcel(Parcel parcel) {
            return new HideableSwitch(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final HideableSwitch[] newArray(int i) {
            return new HideableSwitch[i];
        }
    }

    public HideableSwitch(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HideableSwitch)) {
            return false;
        }
        HideableSwitch hideableSwitch = (HideableSwitch) obj;
        return this.b == hideableSwitch.b && this.c == hideableSwitch.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HideableSwitch(data=");
        sb.append(this.b);
        sb.append(", show=");
        return q0.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
