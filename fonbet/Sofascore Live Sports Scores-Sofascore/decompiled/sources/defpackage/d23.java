package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d23 {
    public final int a;
    public final uef b;
    public u4a c;
    public u4a d;
    public vef e;
    public final ColorDrawable f;
    public boolean g;
    public int h;

    static {
        new PathInterpolator(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        new PathInterpolator(0.6f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f);
        new PathInterpolator(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.2f, 1.0f);
        new PathInterpolator(0.4f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f);
    }

    public d23(int i, int i2) {
        uef uefVar = new uef();
        uefVar.a = -1;
        uefVar.b = -1;
        u4a u4aVar = u4a.e;
        uefVar.c = u4aVar;
        uefVar.d = false;
        uefVar.e = null;
        uefVar.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        uefVar.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        uefVar.h = 1.0f;
        this.b = uefVar;
        this.c = u4aVar;
        this.d = u4aVar;
        this.e = null;
        if (i != 1 && i != 2 && i != 4 && i != 8) {
            a70.p(ljg.j(i, "Unexpected side: "));
            throw null;
        }
        this.a = i;
        ColorDrawable colorDrawable = new ColorDrawable();
        this.f = colorDrawable;
        this.h = 0;
        this.g = true;
        if (i2 != 0) {
            this.h = i2;
            colorDrawable.setColor(i2);
            uefVar.e = colorDrawable;
            k1d k1dVar = uefVar.i;
            if (k1dVar != null) {
                ((View) k1dVar.c).setBackground(colorDrawable);
            }
        }
    }

    public final void a(float f) {
        float f2 = f * 1.0f;
        uef uefVar = this.b;
        if (uefVar.h != f2) {
            uefVar.h = f2;
            k1d k1dVar = uefVar.i;
            if (k1dVar != null) {
                ((View) k1dVar.c).setAlpha(f2);
            }
        }
    }

    public final void b(float f) {
        float f2 = f * 1.0f;
        uef uefVar = this.b;
        int i = this.a;
        if (i == 1) {
            float f3 = (-(1.0f - f2)) * uefVar.a;
            if (uefVar.f != f3) {
                uefVar.f = f3;
                k1d k1dVar = uefVar.i;
                if (k1dVar != null) {
                    ((View) k1dVar.c).setTranslationX(f3);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            float f4 = (-(1.0f - f2)) * uefVar.b;
            if (uefVar.g != f4) {
                uefVar.g = f4;
                k1d k1dVar2 = uefVar.i;
                if (k1dVar2 != null) {
                    ((View) k1dVar2.c).setTranslationY(f4);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            float f5 = (1.0f - f2) * uefVar.a;
            if (uefVar.f != f5) {
                uefVar.f = f5;
                k1d k1dVar3 = uefVar.i;
                if (k1dVar3 != null) {
                    ((View) k1dVar3.c).setTranslationX(f5);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 8) {
            return;
        }
        float f6 = (1.0f - f2) * uefVar.b;
        if (uefVar.g != f6) {
            uefVar.g = f6;
            k1d k1dVar4 = uefVar.i;
            if (k1dVar4 != null) {
                ((View) k1dVar4.c).setTranslationY(f6);
            }
        }
    }
}
