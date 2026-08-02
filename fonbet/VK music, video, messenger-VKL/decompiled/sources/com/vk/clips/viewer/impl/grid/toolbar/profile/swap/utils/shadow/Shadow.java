package com.vk.clips.viewer.impl.grid.toolbar.profile.swap.utils.shadow;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.services.UnityAdsConstants;
import io.reactivex.rxjava3.subjects.b;
import xsna.bpn0;
import xsna.e43;
import xsna.epx;
import xsna.shy;
import xsna.x750;

/* compiled from: Shadow.kt */
/* loaded from: classes17.dex */
public final class Shadow implements Parcelable {
    public static final Parcelable.Creator<Shadow> CREATOR = new a();
    public static final Shadow i = new Shadow(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new GradientParams(e43.l(new GradientPointAndColorMultiplier(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), new GradientPointAndColorMultiplier(0.75f, 0.12f), new GradientPointAndColorMultiplier(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))));
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final float f;
    public final GradientParams g;
    public final bpn0 h = new bpn0(new x750(this, 23));

    /* compiled from: Shadow.kt */
    public static final class a implements Parcelable.Creator<Shadow> {
        @Override // android.os.Parcelable.Creator
        public final Shadow createFromParcel(Parcel parcel) {
            return new Shadow(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readFloat(), GradientParams.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Shadow[] newArray(int i) {
            return new Shadow[i];
        }
    }

    public Shadow(float f, float f2, float f3, int i2, float f4, GradientParams gradientParams) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = i2;
        this.f = f4;
        this.g = gradientParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        return Float.compare(this.b, shadow.b) == 0 && Float.compare(this.c, shadow.c) == 0 && Float.compare(this.d, shadow.d) == 0 && this.e == shadow.e && Float.compare(this.f, shadow.f) == 0 && epx.f(this.g, shadow.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + b.a(this.f, shy.a(this.e, b.a(this.d, b.a(this.c, Float.hashCode(this.b) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "Shadow(dX=" + this.b + ", dY=" + this.c + ", radius=" + this.d + ", color=" + this.e + ", colorAlpha=" + this.f + ", linearGradientParams=" + this.g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
        parcel.writeInt(this.e);
        parcel.writeFloat(this.f);
        this.g.writeToParcel(parcel, i2);
    }
}
