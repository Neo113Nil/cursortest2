package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kl3 {
    public static final /* synthetic */ KProperty[] j;
    public final Object a;
    public final hd2 b;
    public final rl3 d;
    public final rl3 e;
    public final rl3 f;
    public final rl3 g;
    public final ll3 c = new ll3("parent");
    public final il3 h = new il3(this, new c35("wrap"));
    public final il3 i = new il3(this, new c35("wrap"));

    static {
        t0d t0dVar = new t0d(kl3.class, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;", 0);
        fuf fufVar = duf.a;
        j = new KProperty[]{fufVar.mutableProperty1(t0dVar), bf3.q(kl3.class, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;", 0, fufVar), bf3.q(kl3.class, "visibility", "getVisibility()Landroidx/constraintlayout/compose/Visibility;", 0, fufVar), bf3.q(kl3.class, "scaleX", "getScaleX()F", 0, fufVar), bf3.q(kl3.class, "scaleY", "getScaleY()F", 0, fufVar), bf3.q(kl3.class, "rotationX", "getRotationX()F", 0, fufVar), bf3.q(kl3.class, "rotationY", "getRotationY()F", 0, fufVar), bf3.q(kl3.class, "rotationZ", "getRotationZ()F", 0, fufVar), bf3.q(kl3.class, "translationX", "getTranslationX-D9Ej5fM()F", 0, fufVar), bf3.q(kl3.class, "translationY", "getTranslationY-D9Ej5fM()F", 0, fufVar), bf3.q(kl3.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0, fufVar), bf3.q(kl3.class, "pivotX", "getPivotX()F", 0, fufVar), bf3.q(kl3.class, "pivotY", "getPivotY()F", 0, fufVar), bf3.q(kl3.class, "horizontalChainWeight", "getHorizontalChainWeight()F", 0, fufVar), bf3.q(kl3.class, "verticalChainWeight", "getVerticalChainWeight()F", 0, fufVar)};
    }

    public kl3(Object obj, hd2 hd2Var) {
        this.a = obj;
        this.b = hd2Var;
        this.d = new rl3(hd2Var, -2, 1);
        this.e = new rl3(hd2Var, 0, 0);
        this.f = new rl3(hd2Var, -1, 1);
        this.g = new rl3(hd2Var, 1, 0);
        new jl3(this, 1.0f, null);
        new jl3(this, 1.0f, null);
        new jl3(this, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
        new jl3(this, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
        new jl3(this, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null);
        new il3(this);
        new il3(this);
        new il3(this);
        new jl3(this, 0.5f, null);
        new jl3(this, 0.5f, null);
        new jl3(this, Float.NaN, "hWeight");
        new jl3(this, Float.NaN, "vWeight");
    }

    public final void a(ll3 ll3Var) {
        xl3 xl3Var = ll3Var.d;
        wl3 wl3Var = ll3Var.e;
        xl3 xl3Var2 = ll3Var.f;
        wl3 wl3Var2 = ll3Var.g;
        this.d.b(xl3Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f.b(xl3Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        fd2 fd2Var = new fd2(0.5f);
        hd2 hd2Var = this.b;
        hd2Var.C("hRtlBias", fd2Var);
        this.e.a(wl3Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.g.a(wl3Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        hd2Var.C("vBias", new fd2(0.5f));
    }

    public final void b(c35 c35Var) {
        this.i.setValue(this, j[1], c35Var);
    }

    public final void c(float f) {
        if (Float.isNaN(f)) {
            return;
        }
        this.b.C("hBias", new fd2(f));
    }

    public final void d(c35 c35Var) {
        this.h.setValue(this, j[0], c35Var);
    }
}
