package com.vk.dto.clips.filters;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import io.reactivex.rxjava3.subjects.b;
import org.json.JSONObject;
import xsna.bxx;
import xsna.xq;
import xsna.zcl;

/* compiled from: CorrectionsInfo.kt */
/* loaded from: classes18.dex */
public final class CorrectionsInfo implements Parcelable, bxx {
    public static final Parcelable.Creator<CorrectionsInfo> CREATOR = new a();
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

    /* compiled from: CorrectionsInfo.kt */
    public static final class a implements Parcelable.Creator<CorrectionsInfo> {
        @Override // android.os.Parcelable.Creator
        public final CorrectionsInfo createFromParcel(Parcel parcel) {
            return new CorrectionsInfo(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final CorrectionsInfo[] newArray(int i) {
            return new CorrectionsInfo[i];
        }
    }

    public CorrectionsInfo() {
        this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    public static CorrectionsInfo a(CorrectionsInfo correctionsInfo, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, int i) {
        if ((i & 1) != 0) {
            f = correctionsInfo.b;
        }
        float f11 = f;
        if ((i & 2) != 0) {
            f2 = correctionsInfo.c;
        }
        float f12 = f2;
        if ((i & 4) != 0) {
            f3 = correctionsInfo.d;
        }
        float f13 = f3;
        if ((i & 8) != 0) {
            f4 = correctionsInfo.e;
        }
        float f14 = f4;
        float f15 = (i & 16) != 0 ? correctionsInfo.f : f5;
        float f16 = (i & 32) != 0 ? correctionsInfo.g : f6;
        float f17 = (i & 64) != 0 ? correctionsInfo.h : f7;
        float f18 = (i & 128) != 0 ? correctionsInfo.i : f8;
        float f19 = (i & 256) != 0 ? correctionsInfo.j : f9;
        float f20 = (i & 512) != 0 ? correctionsInfo.k : f10;
        correctionsInfo.getClass();
        return new CorrectionsInfo(f11, f12, f13, f14, f15, f16, f17, f18, f19, f20);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("exposure", this.b);
        jSONObject.put("brightness", this.c);
        jSONObject.put("contrast", this.d);
        jSONObject.put("saturation", this.e);
        jSONObject.put("temperature", this.f);
        jSONObject.put("shadow", this.g);
        jSONObject.put("highlight", this.h);
        jSONObject.put("sharpness", this.i);
        jSONObject.put("grain", this.j);
        jSONObject.put("blur", this.k);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CorrectionsInfo)) {
            return false;
        }
        CorrectionsInfo correctionsInfo = (CorrectionsInfo) obj;
        return Float.compare(this.b, correctionsInfo.b) == 0 && Float.compare(this.c, correctionsInfo.c) == 0 && Float.compare(this.d, correctionsInfo.d) == 0 && Float.compare(this.e, correctionsInfo.e) == 0 && Float.compare(this.f, correctionsInfo.f) == 0 && Float.compare(this.g, correctionsInfo.g) == 0 && Float.compare(this.h, correctionsInfo.h) == 0 && Float.compare(this.i, correctionsInfo.i) == 0 && Float.compare(this.j, correctionsInfo.j) == 0 && Float.compare(this.k, correctionsInfo.k) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.k) + b.a(this.j, b.a(this.i, b.a(this.h, b.a(this.g, b.a(this.f, b.a(this.e, b.a(this.d, b.a(this.c, Float.hashCode(this.b) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CorrectionsInfo(exposure=");
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

    public CorrectionsInfo(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
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
        this.l = (f == 0.5f && f2 == 0.5f && f3 == 0.5f && f4 == 0.5f && f5 == 0.5f && f6 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f7 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f8 == 0.5f && f9 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? false : true;
    }

    public /* synthetic */ CorrectionsInfo(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, int i, zcl zclVar) {
        this((i & 1) != 0 ? 0.5f : f, (i & 2) != 0 ? 0.5f : f2, (i & 4) != 0 ? 0.5f : f3, (i & 8) != 0 ? 0.5f : f4, (i & 16) != 0 ? 0.5f : f5, (i & 32) != 0 ? 0.0f : f6, (i & 64) != 0 ? 0.0f : f7, (i & 128) != 0 ? 0.5f : f8, (i & 256) != 0 ? 0.0f : f9, (i & 512) != 0 ? 0.0f : f10);
    }
}
