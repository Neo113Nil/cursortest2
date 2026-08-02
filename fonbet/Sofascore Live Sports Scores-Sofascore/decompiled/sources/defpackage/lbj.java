package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lbj implements jvg {
    public final /* synthetic */ jvg a;
    public final ay4 b;
    public final ay4 c;

    public lbj(jvg jvgVar, final mbj mbjVar) {
        this.a = jvgVar;
        final int i = 0;
        this.b = goh.b(new Function0() { // from class: kbj
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                mbj mbjVar2 = mbjVar;
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(mbjVar2.a.h() < mbjVar2.b.h());
                    default:
                        return Boolean.valueOf(mbjVar2.a.h() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
            }
        });
        final int i2 = 1;
        this.c = goh.b(new Function0() { // from class: kbj
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                mbj mbjVar2 = mbjVar;
                switch (i22) {
                    case 0:
                        return Boolean.valueOf(mbjVar2.a.h() < mbjVar2.b.h());
                    default:
                        return Boolean.valueOf(mbjVar2.a.h() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
            }
        });
    }

    @Override // defpackage.jvg
    public final Object a(m1d m1dVar, Function2 function2, rq3 rq3Var) {
        return this.a.a(m1dVar, function2, rq3Var);
    }

    @Override // defpackage.jvg
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.jvg
    public final boolean c() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.jvg
    public final boolean d() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // defpackage.jvg
    public final float e(float f) {
        return this.a.e(f);
    }
}
