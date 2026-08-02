package com.inmobi.media;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.unity3d.services.UnityAdsConstants;
import defpackage.me4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.y1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3898y1 extends Animation {
    public final float b;
    public final float c;
    public Camera e;
    public final float a = 90.0f;
    public final boolean d = true;

    public C3898y1(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        transformation.getClass();
        float b = me4.b(this.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float f2 = this.b;
        float f3 = this.c;
        Camera camera = this.e;
        Matrix matrix = transformation.getMatrix();
        if (camera != null) {
            camera.save();
            if (this.d) {
                camera.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                camera.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (1.0f - f) * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            camera.rotateX(b);
            camera.getMatrix(matrix);
            camera.restore();
        }
        matrix.preTranslate(-f2, -f3);
        matrix.postTranslate(f2, f3);
    }

    @Override // android.view.animation.Animation
    public final void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.e = new Camera();
    }
}
