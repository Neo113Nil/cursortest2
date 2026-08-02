package com.vk.video.ui.discovery.minimizable.fullscreen_lock;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.qoy;

/* compiled from: FullscreenLockState.kt */
/* loaded from: classes7.dex */
public final class FullscreenLockArgs implements Parcelable {
    public static final Parcelable.Creator<FullscreenLockArgs> CREATOR = new a();
    public final boolean b;
    public final boolean c;
    public final boolean d;

    /* compiled from: FullscreenLockState.kt */
    public static final class a implements Parcelable.Creator<FullscreenLockArgs> {
        @Override // android.os.Parcelable.Creator
        public final FullscreenLockArgs createFromParcel(Parcel parcel) {
            return new FullscreenLockArgs(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final FullscreenLockArgs[] newArray(int i) {
            return new FullscreenLockArgs[i];
        }
    }

    public FullscreenLockArgs(boolean z, boolean z2, boolean z3) {
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FullscreenLockArgs)) {
            return false;
        }
        FullscreenLockArgs fullscreenLockArgs = (FullscreenLockArgs) obj;
        return this.b == fullscreenLockArgs.b && this.c == fullscreenLockArgs.c && this.d == fullscreenLockArgs.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FullscreenLockArgs(isTablet=");
        sb.append(this.b);
        sb.append(", isVerticalVideo=");
        sb.append(this.c);
        sb.append(", isLockFromExpanded=");
        return q0.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
