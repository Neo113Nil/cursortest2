package com.airbnb.lottie.utils;

import android.graphics.Color;
import android.graphics.Matrix;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import xsna.b3r0;
import xsna.ls20;
import xsna.xky;

/* compiled from: DropShadow.java */
/* loaded from: classes12.dex */
public final class a {
    public float a;
    public float b;
    public float c;
    public int d;

    @Nullable
    public float[] e = null;

    public a(a aVar) {
        this.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.d = 0;
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
    }

    public final void a(int i, xky xkyVar) {
        int alpha = Color.alpha(this.d);
        int c = ls20.c(i);
        Matrix matrix = b3r0.a;
        int i2 = (int) ((((alpha / 255.0f) * c) / 255.0f) * 255.0f);
        if (i2 <= 0) {
            xkyVar.clearShadowLayer();
        } else {
            xkyVar.setShadowLayer(Math.max(this.a, Float.MIN_VALUE), this.b, this.c, Color.argb(i2, Color.red(this.d), Color.green(this.d), Color.blue(this.d)));
        }
    }

    public final void b(int i) {
        this.d = Color.argb(Math.round((ls20.c(i) * Color.alpha(this.d)) / 255.0f), Color.red(this.d), Color.green(this.d), Color.blue(this.d));
    }

    public final void c(Matrix matrix) {
        if (this.e == null) {
            this.e = new float[2];
        }
        float[] fArr = this.e;
        fArr[0] = this.b;
        fArr[1] = this.c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.e;
        this.b = fArr2[0];
        this.c = fArr2[1];
        this.a = matrix.mapRadius(this.a);
    }
}
