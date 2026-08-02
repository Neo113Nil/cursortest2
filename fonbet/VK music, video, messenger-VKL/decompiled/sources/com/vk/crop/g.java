package com.vk.crop;

import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import xsna.dfk;
import xsna.gs20;
import xsna.lik;

/* compiled from: GeometryState.java */
/* loaded from: classes17.dex */
public final class g {
    public static final gs20 m = new gs20();
    public final float b;
    public final float c;
    public float j;

    @Nullable
    public a l;
    public final Matrix a = new Matrix();
    public float d = 1.0f;
    public float e = 1.0f;
    public float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float k = 5.0f;

    /* compiled from: GeometryState.java */
    public interface a {
        void a(float f, float f2, float f3, boolean z);

        void b(float f, float f2, boolean z);
    }

    public g(float f, float f2) {
        this.b = f;
        this.c = f2;
        this.j = f / f2;
    }

    public final void a(float f, float f2, float f3, boolean z) {
        this.a.postScale(f, f, f2, f3);
        this.e *= f;
        a aVar = this.l;
        if (aVar != null) {
            aVar.a(f, f2, f3, z);
        }
    }

    public final void b(float f, float f2, boolean z) {
        this.a.postTranslate(f, f2);
        this.h += f;
        this.i += f2;
        a aVar = this.l;
        if (aVar != null) {
            aVar.b(f, f2, z);
        }
    }

    public final void c() {
        float f = dfk.a;
        int i = (int) f;
        int i2 = (int) (f / this.j);
        Paint paint = lik.a;
        float f2 = i / 2;
        float f3 = i2 / 2;
        Matrix matrix = this.a;
        matrix.reset();
        float f4 = 0;
        this.g = f4;
        this.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f5 = this.b;
        float f6 = this.c;
        matrix.postTranslate(f2 - (f5 / 2.0f), f3 - (f6 / 2.0f));
        float a2 = m.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.b, this.c, i, i2, false);
        this.e = a2;
        this.d = a2;
        matrix.postScale(a2, a2, f2, f3);
        matrix.postRotate(f4, f2, f3);
        this.j = f5 / f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (Float.compare(gVar.j, this.j) != 0) {
            return false;
        }
        return this.a.equals(gVar.a);
    }

    public final int hashCode() {
        float f = this.j;
        return this.a.hashCode() + ((f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f) : 0) * 31);
    }
}
