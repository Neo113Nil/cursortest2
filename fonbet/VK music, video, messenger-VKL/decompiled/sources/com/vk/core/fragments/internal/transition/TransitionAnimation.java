package com.vk.core.fragments.internal.transition;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.qj2;
import xsna.zcl;

/* compiled from: TransitionAnimation.kt */
/* loaded from: classes17.dex */
public interface TransitionAnimation extends Parcelable {
    public static final a W6 = a.a;

    /* compiled from: TransitionAnimation.kt */
    public static final class Animations implements Parcelable {
        public static final Parcelable.Creator<Animations> CREATOR = new a();
        public final TransitionAnimation b;
        public final TransitionAnimation c;
        public final TransitionAnimation d;
        public final TransitionAnimation e;

        /* compiled from: TransitionAnimation.kt */
        public static final class a implements Parcelable.Creator<Animations> {
            @Override // android.os.Parcelable.Creator
            public final Animations createFromParcel(Parcel parcel) {
                return new Animations((TransitionAnimation) parcel.readParcelable(Animations.class.getClassLoader()), (TransitionAnimation) parcel.readParcelable(Animations.class.getClassLoader()), (TransitionAnimation) parcel.readParcelable(Animations.class.getClassLoader()), (TransitionAnimation) parcel.readParcelable(Animations.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Animations[] newArray(int i) {
                return new Animations[i];
            }
        }

        public Animations() {
            this(null, null, null, null, 15, null);
        }

        public final TransitionAnimation d() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final TransitionAnimation e() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Animations)) {
                return false;
            }
            Animations animations = (Animations) obj;
            return epx.f(this.b, animations.b) && epx.f(this.c, animations.c) && epx.f(this.d, animations.d) && epx.f(this.e, animations.e);
        }

        public final TransitionAnimation f() {
            return this.d;
        }

        public final TransitionAnimation g() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Animations(destinationEnterAnimation=" + this.b + ", destinationExitAnimation=" + this.c + ", sourceEnterAnimation=" + this.d + ", sourceExitAnimation=" + this.e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
            parcel.writeParcelable(this.e, i);
        }

        public Animations(TransitionAnimation transitionAnimation, TransitionAnimation transitionAnimation2, TransitionAnimation transitionAnimation3, TransitionAnimation transitionAnimation4) {
            this.b = transitionAnimation;
            this.c = transitionAnimation2;
            this.d = transitionAnimation3;
            this.e = transitionAnimation4;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Animations(TransitionAnimation transitionAnimation, TransitionAnimation transitionAnimation2, TransitionAnimation transitionAnimation3, TransitionAnimation transitionAnimation4, int i, zcl zclVar) {
            this(transitionAnimation, transitionAnimation2, transitionAnimation3, transitionAnimation4);
            if ((i & 1) != 0) {
                TransitionAnimation.W6.getClass();
                transitionAnimation = a.b;
            }
            if ((i & 2) != 0) {
                TransitionAnimation.W6.getClass();
                transitionAnimation2 = a.b;
            }
            if ((i & 4) != 0) {
                TransitionAnimation.W6.getClass();
                transitionAnimation3 = a.b;
            }
            if ((i & 8) != 0) {
                TransitionAnimation.W6.getClass();
                transitionAnimation4 = a.b;
            }
        }
    }

    /* compiled from: TransitionAnimation.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final TransitionAnimation b = new EmptyTransitionAnimation();
    }

    void X4(androidx.fragment.app.a aVar, qj2 qj2Var);

    void s3(qj2 qj2Var);

    /* compiled from: TransitionAnimation.kt */
    public static final class EmptyTransitionAnimation implements TransitionAnimation {
        public static final Parcelable.Creator<EmptyTransitionAnimation> CREATOR = new a();

        /* compiled from: TransitionAnimation.kt */
        public static final class a implements Parcelable.Creator<EmptyTransitionAnimation> {
            @Override // android.os.Parcelable.Creator
            public final EmptyTransitionAnimation createFromParcel(Parcel parcel) {
                parcel.readInt();
                return new EmptyTransitionAnimation();
            }

            @Override // android.os.Parcelable.Creator
            public final EmptyTransitionAnimation[] newArray(int i) {
                return new EmptyTransitionAnimation[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }

        @Override // com.vk.core.fragments.internal.transition.TransitionAnimation
        public final void s3(qj2 qj2Var) {
        }

        @Override // com.vk.core.fragments.internal.transition.TransitionAnimation
        public final void X4(androidx.fragment.app.a aVar, qj2 qj2Var) {
        }
    }
}
