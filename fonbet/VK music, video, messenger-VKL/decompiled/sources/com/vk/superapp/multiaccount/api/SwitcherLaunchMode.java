package com.vk.superapp.multiaccount.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;

/* compiled from: SwitcherLaunchMode.kt */
/* loaded from: classes6.dex */
public interface SwitcherLaunchMode extends Parcelable {

    /* compiled from: SwitcherLaunchMode.kt */
    public static final class DefaultMode implements SwitcherLaunchMode {
        public static final DefaultMode b = new DefaultMode();
        public static final Parcelable.Creator<DefaultMode> CREATOR = new a();

        /* compiled from: SwitcherLaunchMode.kt */
        public static final class a implements Parcelable.Creator<DefaultMode> {
            @Override // android.os.Parcelable.Creator
            public final DefaultMode createFromParcel(Parcel parcel) {
                parcel.readInt();
                return DefaultMode.b;
            }

            @Override // android.os.Parcelable.Creator
            public final DefaultMode[] newArray(int i) {
                return new DefaultMode[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DefaultMode);
        }

        public final int hashCode() {
            return -1341983105;
        }

        public final String toString() {
            return "DefaultMode";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: SwitcherLaunchMode.kt */
    public static final class SwitcherCallbackMode implements SwitcherLaunchMode {
        public static final Parcelable.Creator<SwitcherCallbackMode> CREATOR = new a();
        public final SwitcherActionCallback b;
        public final UserId c;

        /* compiled from: SwitcherLaunchMode.kt */
        public static final class a implements Parcelable.Creator<SwitcherCallbackMode> {
            @Override // android.os.Parcelable.Creator
            public final SwitcherCallbackMode createFromParcel(Parcel parcel) {
                return new SwitcherCallbackMode((SwitcherActionCallback) parcel.readParcelable(SwitcherCallbackMode.class.getClassLoader()), (UserId) parcel.readParcelable(SwitcherCallbackMode.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SwitcherCallbackMode[] newArray(int i) {
                return new SwitcherCallbackMode[i];
            }
        }

        public SwitcherCallbackMode(SwitcherActionCallback switcherActionCallback, UserId userId) {
            this.b = switcherActionCallback;
            this.c = userId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SwitcherCallbackMode)) {
                return false;
            }
            SwitcherCallbackMode switcherCallbackMode = (SwitcherCallbackMode) obj;
            return epx.f(this.b, switcherCallbackMode.b) && epx.f(this.c, switcherCallbackMode.c);
        }

        public final int hashCode() {
            return Long.hashCode(this.c.b) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SwitcherCallbackMode(switcherActionCallback=");
            sb.append(this.b);
            sb.append(", selectedUserId=");
            return gp.b(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
        }
    }
}
