package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.sofascore.results.R;
import com.sofascore.results.media.news.TopNewsActivity;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class mlj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TopNewsActivity b;

    public /* synthetic */ mlj(TopNewsActivity topNewsActivity, int i) {
        this.a = i;
        this.b = topNewsActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        TopNewsActivity topNewsActivity = this.b;
        int i2 = 1;
        int i3 = 2;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                int i4 = TopNewsActivity.O;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(858783399, av8Var, new mlj(topNewsActivity, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i5 = TopNewsActivity.O;
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    q5a.p(null, yqo.H(-1625255829, av8Var2, new mlj(topNewsActivity, i3)), null, null, null, 0, r13.h, 0L, new i68(0, 0, 0, 0), yqo.H(1296306934, av8Var2, new e6i(12, rfo.x(((qlj) topNewsActivity.K.getValue()).k, av8Var2, 0), topNewsActivity)), av8Var2, 806879280, PsExtractor.PRIVATE_STREAM_1);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i6 = TopNewsActivity.O;
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    float f = alj.a;
                    long j = r13.h;
                    long j2 = r13.i;
                    g23 g23Var = (g23) av8Var3.k(i23.a);
                    zkj zkjVar = g23Var.Z;
                    if (zkjVar == null) {
                        zkj zkjVar2 = new zkj(i23.c(g23Var, ya0.a), i23.c(g23Var, ya0.c), i23.c(g23Var, ya0.b), i23.c(g23Var, ya0.e), i23.c(g23Var, ya0.f), i23.c(g23Var, ya0.d));
                        g23Var.Z = zkjVar2;
                        zkjVar = zkjVar2;
                    }
                    if (j == 16) {
                        j = zkjVar.a;
                    }
                    long j3 = j;
                    long j4 = j2 != 16 ? j2 : zkjVar.b;
                    long j5 = j2 != 16 ? j2 : zkjVar.c;
                    long j6 = j2 != 16 ? j2 : zkjVar.d;
                    long j7 = j2 != 16 ? j2 : zkjVar.e;
                    if (j2 == 16) {
                        j2 = zkjVar.f;
                    }
                    oa0.b(null, yqo.H(-987471515, av8Var3, new mlj(topNewsActivity, 3)), null, 48.0f, null, new zkj(j3, j4, j5, j6, j7, j2), av8Var3, 24966);
                } else {
                    av8Var3.W();
                }
                break;
            default:
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i7 = TopNewsActivity.O;
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(1 & intValue4, (intValue4 & 3) != 2)) {
                    ImageVector N = s6a.N(R.drawable.ic_arrow_back, 6, av8Var4);
                    long D = lz.D(R.color.on_color_primary, av8Var4);
                    xtc l = bkh.l(l98.f0(utc.a, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 40.0f);
                    long D2 = lz.D(R.color.darken_overlay_3, av8Var4);
                    n7g n7gVar = o7g.a;
                    hde hdeVar = new hde(50.0f);
                    xtc b0 = l98.b0(n9e.q(l, D2, new n7g(hdeVar, hdeVar, hdeVar, hdeVar)), 8.0f);
                    boolean i8 = av8Var4.i(topNewsActivity);
                    Object O = av8Var4.O();
                    if (i8 || O == nf3.a) {
                        O = new llj(topNewsActivity, 2);
                        av8Var4.n0(O);
                    }
                    kq9.b(N, null, tol.y(b0, false, false, false, 0L, null, (Function0) O, av8Var4, 29), D, av8Var4, 48, 0);
                } else {
                    av8Var4.W();
                }
                break;
        }
        return Unit.a;
    }
}
