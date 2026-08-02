package com.vk.media.filters.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import io.reactivex.rxjava3.subjects.b;
import xsna.xq;
import xsna.zcl;

/* compiled from: Correction.kt */
/* loaded from: classes3.dex */
public final class Correction implements Parcelable {
    public static final Parcelable.Creator<Correction> CREATOR = new a();
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final boolean l;
    public final boolean m;
    public final boolean n;

    /* compiled from: Correction.kt */
    public static final class a implements Parcelable.Creator<Correction> {
        @Override // android.os.Parcelable.Creator
        public final Correction createFromParcel(Parcel parcel) {
            return new Correction(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final Correction[] newArray(int i) {
            return new Correction[i];
        }
    }

    public Correction() {
        this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Correction)) {
            return false;
        }
        Correction correction = (Correction) obj;
        return Float.compare(this.b, correction.b) == 0 && Float.compare(this.c, correction.c) == 0 && Float.compare(this.d, correction.d) == 0 && Float.compare(this.e, correction.e) == 0 && Float.compare(this.f, correction.f) == 0 && Float.compare(this.g, correction.g) == 0 && Float.compare(this.h, correction.h) == 0 && Float.compare(this.i, correction.i) == 0 && Float.compare(this.j, correction.j) == 0 && Float.compare(this.k, correction.k) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.k) + b.a(this.j, b.a(this.i, b.a(this.h, b.a(this.g, b.a(this.f, b.a(this.e, b.a(this.d, b.a(this.c, Float.hashCode(this.b) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Correction(exposure=");
        sb.append(this.b);
        sb.append(", brightness=");
        sb.append(this.c);
        sb.append(", contrast=");
        sb.append(this.d);
        sb.append(", saturation=");
        sb.append(this.e);
        sb.append(", temperature=");
        sb.append(this.f);
        sb.append(", shadow=");
        sb.append(this.g);
        sb.append(", highlight=");
        sb.append(this.h);
        sb.append(", sharpness=");
        sb.append(this.i);
        sb.append(", grain=");
        sb.append(this.j);
        sb.append(", blur=");
        return xq.c(')', this.k, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
        parcel.writeFloat(this.g);
        parcel.writeFloat(this.h);
        parcel.writeFloat(this.i);
        parcel.writeFloat(this.j);
        parcel.writeFloat(this.k);
    }

    public Correction(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = f8;
        this.j = f9;
        this.k = f10;
        boolean z = f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.l = !z;
        boolean z2 = (f == 0.5f && f2 == 0.5f && f3 == 0.5f && f4 == 0.5f && f5 == 0.5f && f6 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f7 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f8 == 0.5f && f9 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? false : true;
        this.m = z2;
        this.n = z2 || !z;
    }

    public /* synthetic */ Correction(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, int i, zcl zclVar) {
        this((i & 1) != 0 ? 0.5f : f, (i & 2) != 0 ? 0.5f : f2, (i & 4) != 0 ? 0.5f : f3, (i & 8) != 0 ? 0.5f : f4, (i & 16) != 0 ? 0.5f : f5, (i & 32) != 0 ? 0.0f : f6, (i & 64) != 0 ? 0.0f : f7, (i & 128) != 0 ? 0.5f : f8, (i & 256) != 0 ? 0.0f : f9, (i & 512) != 0 ? 0.0f : f10);
    }
}
