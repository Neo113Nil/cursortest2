package com.vk.fullscreen.promo.core;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.ozl;

/* compiled from: FullscreenPromoEvent.kt */
/* loaded from: classes.dex */
public class FullscreenPromoEvent implements Parcelable {
    public static final Parcelable.Creator<FullscreenPromoEvent> CREATOR = new a();
    public final String b;

    /* compiled from: FullscreenPromoEvent.kt */
    public static final class FeedStart extends FullscreenPromoEvent {
        public static final FeedStart c = new FeedStart("FeedStart");
        public static final Parcelable.Creator<FeedStart> CREATOR = new a();

        /* compiled from: FullscreenPromoEvent.kt */
        public static final class a implements Parcelable.Creator<FeedStart> {
            @Override // android.os.Parcelable.Creator
            public final FeedStart createFromParcel(Parcel parcel) {
                parcel.readInt();
                return FeedStart.c;
            }

            @Override // android.os.Parcelable.Creator
            public final FeedStart[] newArray(int i) {
                return new FeedStart[i];
            }
        }

        @Override // com.vk.fullscreen.promo.core.FullscreenPromoEvent, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.vk.fullscreen.promo.core.FullscreenPromoEvent, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FullscreenPromoEvent.kt */
    @ozl
    public static final class MainActivityResume extends FullscreenPromoEvent {
        public static final MainActivityResume c = new MainActivityResume("MainActivityResume");
        public static final Parcelable.Creator<MainActivityResume> CREATOR = new a();

        /* compiled from: FullscreenPromoEvent.kt */
        public static final class a implements Parcelable.Creator<MainActivityResume> {
            @Override // android.os.Parcelable.Creator
            public final MainActivityResume createFromParcel(Parcel parcel) {
                parcel.readInt();
                return MainActivityResume.c;
            }

            @Override // android.os.Parcelable.Creator
            public final MainActivityResume[] newArray(int i) {
                return new MainActivityResume[i];
            }
        }

        @Override // com.vk.fullscreen.promo.core.FullscreenPromoEvent, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.vk.fullscreen.promo.core.FullscreenPromoEvent, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FullscreenPromoEvent.kt */
    public static final class SignUp extends FullscreenPromoEvent {
        public static final SignUp c = new SignUp("SignUp");
        public static final Parcelable.Creator<SignUp> CREATOR = new a();

        /* compiled from: FullscreenPromoEvent.kt */
        public static final class a implements Parcelable.Creator<SignUp> {
            @Override // android.os.Parcelable.Creator
            public final SignUp createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SignUp.c;
            }

            @Override // android.os.Parcelable.Creator
            public final SignUp[] newArray(int i) {
                return new SignUp[i];
            }
        }

        @Override // com.vk.fullscreen.promo.core.FullscreenPromoEvent, android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.vk.fullscreen.promo.core.FullscreenPromoEvent, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FullscreenPromoEvent.kt */
    public static final class a implements Parcelable.Creator<FullscreenPromoEvent> {
        @Override // android.os.Parcelable.Creator
        public final FullscreenPromoEvent createFromParcel(Parcel parcel) {
            return new FullscreenPromoEvent(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FullscreenPromoEvent[] newArray(int i) {
            return new FullscreenPromoEvent[i];
        }
    }

    public FullscreenPromoEvent(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }
}
