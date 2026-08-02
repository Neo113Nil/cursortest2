package com.vk.libvideo.api.minimizable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.vu5;
import xsna.xq;
import xsna.zcl;

/* compiled from: VideoMinimizableState.kt */
/* loaded from: classes.dex */
public abstract class VideoMinimizableState implements Parcelable {

    /* compiled from: VideoMinimizableState.kt */
    /* loaded from: classes2.dex */
    public static final class Animating extends VideoMinimizableState {
        public static final Parcelable.Creator<Animating> CREATOR = new a();
        public final VideoMinimizableState b;
        public final VideoMinimizableState c;
        public final float d;

        /* compiled from: VideoMinimizableState.kt */
        public static final class a implements Parcelable.Creator<Animating> {
            @Override // android.os.Parcelable.Creator
            public final Animating createFromParcel(Parcel parcel) {
                return new Animating((VideoMinimizableState) parcel.readParcelable(Animating.class.getClassLoader()), (VideoMinimizableState) parcel.readParcelable(Animating.class.getClassLoader()), parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            public final Animating[] newArray(int i) {
                return new Animating[i];
            }
        }

        public Animating(VideoMinimizableState videoMinimizableState, VideoMinimizableState videoMinimizableState2, float f) {
            super(null);
            this.b = videoMinimizableState;
            this.c = videoMinimizableState2;
            this.d = f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Animating)) {
                return false;
            }
            Animating animating = (Animating) obj;
            return epx.f(this.b, animating.b) && epx.f(this.c, animating.c) && Float.compare(this.d, animating.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Animating(firstState=");
            sb.append(this.b);
            sb.append(", secondState=");
            sb.append(this.c);
            sb.append(", progress=");
            return xq.c(')', this.d, sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeFloat(this.d);
        }
    }

    /* compiled from: VideoMinimizableState.kt */
    /* loaded from: classes2.dex */
    public static final class Collapsed extends VideoMinimizableState {
        public static final Parcelable.Creator<Collapsed> CREATOR = new a();
        public final int b;

        /* compiled from: VideoMinimizableState.kt */
        public static final class a implements Parcelable.Creator<Collapsed> {
            @Override // android.os.Parcelable.Creator
            public final Collapsed createFromParcel(Parcel parcel) {
                return new Collapsed(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Collapsed[] newArray(int i) {
                return new Collapsed[i];
            }
        }

        public Collapsed(int i) {
            super(null);
            this.b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Collapsed) && this.b == ((Collapsed) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Collapsed(height="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b);
        }
    }

    /* compiled from: VideoMinimizableState.kt */
    /* loaded from: classes2.dex */
    public static abstract class Expanded extends VideoMinimizableState {

        /* compiled from: VideoMinimizableState.kt */
        public static final class Compact extends Expanded {
            public static final Compact b = new Compact();
            public static final Parcelable.Creator<Compact> CREATOR = new a();

            /* compiled from: VideoMinimizableState.kt */
            public static final class a implements Parcelable.Creator<Compact> {
                @Override // android.os.Parcelable.Creator
                public final Compact createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Compact.b;
                }

                @Override // android.os.Parcelable.Creator
                public final Compact[] newArray(int i) {
                    return new Compact[i];
                }
            }

            public Compact() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Compact);
            }

            public final int hashCode() {
                return -1475295746;
            }

            public final String toString() {
                return "Compact";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: VideoMinimizableState.kt */
        public static final class MatchRatio extends Expanded {
            public static final Parcelable.Creator<MatchRatio> CREATOR = new a();
            public final float b;

            /* compiled from: VideoMinimizableState.kt */
            public static final class a implements Parcelable.Creator<MatchRatio> {
                @Override // android.os.Parcelable.Creator
                public final MatchRatio createFromParcel(Parcel parcel) {
                    return new MatchRatio(parcel.readFloat());
                }

                @Override // android.os.Parcelable.Creator
                public final MatchRatio[] newArray(int i) {
                    return new MatchRatio[i];
                }
            }

            public MatchRatio(float f) {
                super(null);
                this.b = f;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MatchRatio) && Float.compare(this.b, ((MatchRatio) obj).b) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.b);
            }

            public final String toString() {
                return xq.c(')', this.b, new StringBuilder("MatchRatio(ratio="));
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeFloat(this.b);
            }
        }

        public /* synthetic */ Expanded(zcl zclVar) {
            this();
        }

        public Expanded() {
            super(null);
        }
    }

    /* compiled from: VideoMinimizableState.kt */
    /* loaded from: classes2.dex */
    public static final class FullscreenHorizontal extends VideoMinimizableState {
        public static final Parcelable.Creator<FullscreenHorizontal> CREATOR = new a();
        public final boolean b;
        public final boolean c;

        /* compiled from: VideoMinimizableState.kt */
        public static final class a implements Parcelable.Creator<FullscreenHorizontal> {
            @Override // android.os.Parcelable.Creator
            public final FullscreenHorizontal createFromParcel(Parcel parcel) {
                return new FullscreenHorizontal(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final FullscreenHorizontal[] newArray(int i) {
                return new FullscreenHorizontal[i];
            }
        }

        public FullscreenHorizontal(boolean z, boolean z2) {
            super(null);
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
            if (!(obj instanceof FullscreenHorizontal)) {
                return false;
            }
            FullscreenHorizontal fullscreenHorizontal = (FullscreenHorizontal) obj;
            return this.b == fullscreenHorizontal.b && this.c == fullscreenHorizontal.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FullscreenHorizontal(isPromoShown=");
            sb.append(this.b);
            sb.append(", isSimilarVideosShown=");
            return q0.a(sb, this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b ? 1 : 0);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    /* compiled from: VideoMinimizableState.kt */
    /* loaded from: classes2.dex */
    public static final class FullscreenVertical extends VideoMinimizableState {
        public static final Parcelable.Creator<FullscreenVertical> CREATOR = new a();
        public final boolean b;

        /* compiled from: VideoMinimizableState.kt */
        public static final class a implements Parcelable.Creator<FullscreenVertical> {
            @Override // android.os.Parcelable.Creator
            public final FullscreenVertical createFromParcel(Parcel parcel) {
                return new FullscreenVertical(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final FullscreenVertical[] newArray(int i) {
                return new FullscreenVertical[i];
            }
        }

        public FullscreenVertical(boolean z) {
            super(null);
            this.b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FullscreenVertical) && this.b == ((FullscreenVertical) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("FullscreenVertical(withDialog="), this.b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.b ? 1 : 0);
        }
    }

    /* compiled from: VideoMinimizableState.kt */
    public static final class Hidden extends VideoMinimizableState {
        public static final Hidden b = new Hidden();
        public static final Parcelable.Creator<Hidden> CREATOR = new a();

        /* compiled from: VideoMinimizableState.kt */
        public static final class a implements Parcelable.Creator<Hidden> {
            @Override // android.os.Parcelable.Creator
            public final Hidden createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Hidden.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Hidden[] newArray(int i) {
                return new Hidden[i];
            }
        }

        public Hidden() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: VideoMinimizableState.kt */
    /* loaded from: classes2.dex */
    public static final class Pip extends VideoMinimizableState {
        public static final Pip b = new Pip(null);
        public static final Parcelable.Creator<Pip> CREATOR = new a();

        /* compiled from: VideoMinimizableState.kt */
        public static final class a implements Parcelable.Creator<Pip> {
            @Override // android.os.Parcelable.Creator
            public final Pip createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Pip.b;
            }

            @Override // android.os.Parcelable.Creator
            public final Pip[] newArray(int i) {
                return new Pip[i];
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
    }

    /* compiled from: VideoMinimizableState.kt */
    /* loaded from: classes2.dex */
    public static final class PreparedToPip extends VideoMinimizableState {
        public static final PreparedToPip b = new PreparedToPip();
        public static final Parcelable.Creator<PreparedToPip> CREATOR = new a();

        /* compiled from: VideoMinimizableState.kt */
        public static final class a implements Parcelable.Creator<PreparedToPip> {
            @Override // android.os.Parcelable.Creator
            public final PreparedToPip createFromParcel(Parcel parcel) {
                parcel.readInt();
                return PreparedToPip.b;
            }

            @Override // android.os.Parcelable.Creator
            public final PreparedToPip[] newArray(int i) {
                return new PreparedToPip[i];
            }
        }

        public PreparedToPip() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ VideoMinimizableState(zcl zclVar) {
        this();
    }

    public VideoMinimizableState() {
    }
}
