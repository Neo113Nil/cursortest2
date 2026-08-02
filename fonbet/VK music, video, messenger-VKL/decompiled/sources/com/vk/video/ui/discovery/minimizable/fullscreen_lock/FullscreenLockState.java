package com.vk.video.ui.discovery.minimizable.fullscreen_lock;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;

/* compiled from: FullscreenLockState.kt */
/* loaded from: classes7.dex */
public interface FullscreenLockState extends Parcelable {

    /* compiled from: FullscreenLockState.kt */
    public static final class AnimatingToUnlock implements FullscreenLockState {
        public static final AnimatingToUnlock b = new AnimatingToUnlock();
        public static final Parcelable.Creator<AnimatingToUnlock> CREATOR = new a();

        /* compiled from: FullscreenLockState.kt */
        public static final class a implements Parcelable.Creator<AnimatingToUnlock> {
            @Override // android.os.Parcelable.Creator
            public final AnimatingToUnlock createFromParcel(Parcel parcel) {
                parcel.readInt();
                return AnimatingToUnlock.b;
            }

            @Override // android.os.Parcelable.Creator
            public final AnimatingToUnlock[] newArray(int i) {
                return new AnimatingToUnlock[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AnimatingToUnlock);
        }

        public final int hashCode() {
            return 1352673301;
        }

        public final String toString() {
            return "AnimatingToUnlock";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FullscreenLockState.kt */
    public static final class Locked implements FullscreenLockState {
        public static final Parcelable.Creator<Locked> CREATOR = new a();
        public final FullscreenLockArgs b;
        public final FullscreenOrientationLockType c;
        public final boolean d;

        /* compiled from: FullscreenLockState.kt */
        public static final class a implements Parcelable.Creator<Locked> {
            @Override // android.os.Parcelable.Creator
            public final Locked createFromParcel(Parcel parcel) {
                return new Locked(FullscreenLockArgs.CREATOR.createFromParcel(parcel), FullscreenOrientationLockType.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Locked[] newArray(int i) {
                return new Locked[i];
            }
        }

        public Locked(FullscreenLockArgs fullscreenLockArgs, FullscreenOrientationLockType fullscreenOrientationLockType, boolean z) {
            this.b = fullscreenLockArgs;
            this.c = fullscreenOrientationLockType;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Locked)) {
                return false;
            }
            Locked locked = (Locked) obj;
            return epx.f(this.b, locked.b) && this.c == locked.c && this.d == locked.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Locked(args=");
            sb.append(this.b);
            sb.append(", fullscreenOrientationLockType=");
            sb.append(this.c);
            sb.append(", isSilentLockMode=");
            return q0.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
            parcel.writeString(this.c.name());
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    /* compiled from: FullscreenLockState.kt */
    public static final class TemporarilyUnlocked implements FullscreenLockState {
        public static final Parcelable.Creator<TemporarilyUnlocked> CREATOR = new a();
        public final FullscreenLockArgs b;
        public final boolean c;
        public final boolean d;

        /* compiled from: FullscreenLockState.kt */
        public static final class a implements Parcelable.Creator<TemporarilyUnlocked> {
            @Override // android.os.Parcelable.Creator
            public final TemporarilyUnlocked createFromParcel(Parcel parcel) {
                return new TemporarilyUnlocked(FullscreenLockArgs.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final TemporarilyUnlocked[] newArray(int i) {
                return new TemporarilyUnlocked[i];
            }
        }

        public TemporarilyUnlocked(FullscreenLockArgs fullscreenLockArgs, boolean z, boolean z2) {
            this.b = fullscreenLockArgs;
            this.c = z;
            this.d = z2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TemporarilyUnlocked)) {
                return false;
            }
            TemporarilyUnlocked temporarilyUnlocked = (TemporarilyUnlocked) obj;
            return epx.f(this.b, temporarilyUnlocked.b) && this.c == temporarilyUnlocked.c && this.d == temporarilyUnlocked.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TemporarilyUnlocked(lastLockArgs=");
            sb.append(this.b);
            sb.append(", isOrientationLocked=");
            sb.append(this.c);
            sb.append(", isLockAfterMessageNeeded=");
            return q0.a(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    /* compiled from: FullscreenLockState.kt */
    public static final class Unlocked implements FullscreenLockState {
        public static final Unlocked b = new Unlocked();
        public static final Parcelable.Creator<Unlocked> CREATOR = new a();

        /* compiled from: FullscreenLockState.kt */
        public static final class a implements Parcelable.Creator<Unlocked> {
            @Override // android.os.Parcelable.Creator
            public final Unlocked createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Unlocked.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Unlocked[] newArray(int i) {
                return new Unlocked[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unlocked);
        }

        public final int hashCode() {
            return 126820075;
        }

        public final String toString() {
            return "Unlocked";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }
}
