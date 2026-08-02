package defpackage;

import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class vfl implements et8 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vfl(rfl rflVar, Function1 function1, int i, boolean z) {
        this.e = rflVar;
        this.b = function1;
        this.c = i;
        this.d = z;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        boolean z = true;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                ajl ajlVar = (ajl) obj5;
                ajl ajlVar2 = (ajl) obj2;
                of3 of3Var = (of3) obj3;
                int intValue = ((Integer) obj4).intValue();
                ((k60) obj).getClass();
                gv9 gv9Var = ajlVar2 != null ? ajlVar2.a : null;
                utc utcVar = utc.a;
                if (gv9Var == null) {
                    av8 av8Var = (av8) of3Var;
                    av8Var.d0(2047882825);
                    s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 14, lz.D(R.color.on_color_highlight_2, av8Var), lz.D(R.color.on_color_secondary, av8Var), av8Var, bkh.e(bkh.d(utcVar, 1.0f), 274.0f));
                    av8Var.s(false);
                } else if (ajlVar2.a.isEmpty()) {
                    av8 av8Var2 = (av8) of3Var;
                    av8Var2.d0(2048198157);
                    xtc c0 = l98.c0(bkh.d(utcVar, 1.0f), 8.0f, 56.0f);
                    String v = oea.v(R.string.empty_state_data_first_match, av8Var2);
                    yf8 yf8Var = xth.a;
                    udj.c(v, c0, lz.D(R.color.on_color_primary, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.e(), av8Var2, 0, 0, 130040);
                    av8Var2.s(false);
                } else {
                    av8 av8Var3 = (av8) of3Var;
                    av8Var3.d0(2048627135);
                    xtc d = bkh.d(utcVar, 1.0f);
                    t3e B = l98.B(8.0f, 2);
                    ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                    if ((((intValue & 112) ^ 48) <= 32 || !av8Var3.g(ajlVar2)) && (intValue & 48) != 32) {
                        z = false;
                    }
                    boolean g = z | av8Var3.g(ajlVar);
                    boolean z2 = this.d;
                    boolean h = g | av8Var3.h(z2);
                    int i2 = this.c;
                    boolean e = h | av8Var3.e(i2);
                    Function1 function1 = this.b;
                    boolean g2 = av8Var3.g(function1) | e;
                    Object O = av8Var3.O();
                    if (g2 || O == nf3.a) {
                        Object ckVar = new ck(ajlVar2, ajlVar, z2, i2, function1);
                        av8Var3.n0(ckVar);
                        O = ckVar;
                    }
                    v8a.c(d, null, B, ng0Var, null, null, false, null, (Function1) O, av8Var3, 24966, 490);
                    av8Var3.s(false);
                }
                break;
            default:
                rfl rflVar = (rfl) obj5;
                sfl sflVar = (sfl) obj2;
                of3 of3Var2 = (of3) obj3;
                ((Integer) obj4).intValue();
                ((k60) obj).getClass();
                int i3 = sflVar == null ? -1 : zfl.a[sflVar.ordinal()];
                Function1 function12 = this.b;
                if (i3 == 1) {
                    av8 av8Var4 = (av8) of3Var2;
                    av8Var4.d0(1883757805);
                    q5a.h(rflVar.f, function12, av8Var4, 0);
                    av8Var4.s(false);
                } else if (i3 == 2) {
                    av8 av8Var5 = (av8) of3Var2;
                    av8Var5.d0(1883762116);
                    q5a.g(rflVar.h, this.c, this.d, function12, av8Var5, 0);
                    av8Var5.s(false);
                } else if (i3 != 3) {
                    av8 av8Var6 = (av8) of3Var2;
                    av8Var6.d0(1883780843);
                    av8Var6.s(false);
                } else {
                    av8 av8Var7 = (av8) of3Var2;
                    av8Var7.d0(1883772993);
                    gv9 gv9Var2 = rflVar.g;
                    agl aglVar = rflVar.e;
                    q5a.k(gv9Var2, aglVar != null ? aglVar.a : null, function12, av8Var7, 0);
                    av8Var7.s(false);
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ vfl(ajl ajlVar, boolean z, int i, Function1 function1) {
        this.e = ajlVar;
        this.d = z;
        this.c = i;
        this.b = function1;
    }
}
