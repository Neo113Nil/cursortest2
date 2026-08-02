package defpackage;

import androidx.compose.runtime.e;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.weekly.FantasyEliteFaceoffRevealDialog;
import com.unity3d.services.UnityAdsConstants;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class vw6 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyEliteFaceoffRevealDialog b;

    public /* synthetic */ vw6(FantasyEliteFaceoffRevealDialog fantasyEliteFaceoffRevealDialog, int i) {
        this.a = i;
        this.b = fantasyEliteFaceoffRevealDialog;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FantasyEliteFaceoffRevealDialog fantasyEliteFaceoffRevealDialog;
        f50 f50Var;
        int i = this.a;
        utc utcVar = utc.a;
        a99 a99Var = nf3.a;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).h(booleanValue) ? 4 : 2;
                }
                int i2 = 0;
                av8 av8Var = (av8) of3Var;
                if (!av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    av8Var.W();
                } else if (booleanValue) {
                    av8Var.d0(816323868);
                    s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 62, 0L, 0L, av8Var, bkh.c);
                    av8Var.s(false);
                } else {
                    av8Var.d0(816633527);
                    qug o0 = hkg.o0(av8Var);
                    Object O = av8Var.O();
                    if (O == a99Var) {
                        O = e.f(Boolean.FALSE);
                        av8Var.n0(O);
                    }
                    e1d e1dVar = (e1d) O;
                    Object O2 = av8Var.O();
                    if (O2 == a99Var) {
                        O2 = new SnapshotStateList();
                        av8Var.n0(O2);
                    }
                    SnapshotStateList snapshotStateList = (SnapshotStateList) O2;
                    Integer valueOf = Integer.valueOf(o0.e.h());
                    boolean g = av8Var.g(o0);
                    Object O3 = av8Var.O();
                    rq3 rq3Var = null;
                    if (g || O3 == a99Var) {
                        O3 = new ww6(o0, rq3Var, i2);
                        av8Var.n0(O3);
                    }
                    hz8.o(av8Var, valueOf, (Function2) O3);
                    FantasyEliteFaceoffRevealDialog fantasyEliteFaceoffRevealDialog2 = this.b;
                    rj5 k = fantasyEliteFaceoffRevealDialog2.v().k();
                    boolean i3 = av8Var.i(fantasyEliteFaceoffRevealDialog2);
                    Object O4 = av8Var.O();
                    if (i3 || O4 == a99Var) {
                        O4 = new nbi(fantasyEliteFaceoffRevealDialog2, snapshotStateList, e1dVar, null);
                        av8Var.n0(O4);
                    }
                    hz8.o(av8Var, k, (Function2) O4);
                    g28 g28Var = bkh.c;
                    p4h p4hVar = ww9.d;
                    u23 a = t23.a(p4hVar, uxf.o, av8Var, 0);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, g28Var);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    f50 f50Var2 = hf3.g;
                    waa.K(av8Var, a, f50Var2);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var, m, ff3Var);
                    Integer valueOf2 = Integer.valueOf(hashCode);
                    f50 f50Var3 = hf3.j;
                    waa.K(av8Var, valueOf2, f50Var3);
                    ry ryVar = hf3.k;
                    waa.J(av8Var, ryVar);
                    f50 f50Var4 = hf3.d;
                    waa.K(av8Var, C, f50Var4);
                    String w = oea.w(R.string.fantasy_round_x_fixtures, new Object[]{Integer.valueOf(fantasyEliteFaceoffRevealDialog2.v().g)}, av8Var);
                    ImageVector N = s6a.N(R.drawable.ic_close, 6, av8Var);
                    long j = r13.h;
                    boolean i4 = av8Var.i(fantasyEliteFaceoffRevealDialog2);
                    Object O5 = av8Var.O();
                    if (i4 || O5 == a99Var) {
                        fantasyEliteFaceoffRevealDialog = fantasyEliteFaceoffRevealDialog2;
                        f50Var = f50Var3;
                        av6 av6Var = new av6(0, fantasyEliteFaceoffRevealDialog, FantasyEliteFaceoffRevealDialog.class, "dismiss", "dismiss()V", 0, 3);
                        av8Var.n0(av6Var);
                        O5 = av6Var;
                    } else {
                        fantasyEliteFaceoffRevealDialog = fantasyEliteFaceoffRevealDialog2;
                        f50Var = f50Var3;
                    }
                    FantasyEliteFaceoffRevealDialog fantasyEliteFaceoffRevealDialog3 = fantasyEliteFaceoffRevealDialog;
                    a99 a99Var2 = a99Var;
                    pea.k(w, (Function0) ((KFunction) O5), null, j, 0L, N, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 12585984, 340);
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    k1c c = e12.c(uxf.c, false);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, goaVar);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, c, f50Var2);
                    waa.K(av8Var, m2, ff3Var);
                    bf3.s(hashCode2, av8Var, f50Var, av8Var, ryVar);
                    waa.K(av8Var, C2, f50Var4);
                    kv1 kv1Var = uxf.p;
                    xtc f0 = l98.f0(hkg.u0(g28Var, o0, false, 14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 124.0f, 7);
                    u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 48);
                    int hashCode3 = Long.hashCode(av8Var.T);
                    aee m3 = av8Var.m();
                    xtc C3 = fqj.C(av8Var, f0);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a2, f50Var2);
                    waa.K(av8Var, m3, ff3Var);
                    bf3.s(hashCode3, av8Var, f50Var, av8Var, ryVar);
                    waa.K(av8Var, C3, f50Var4);
                    String g2 = bf3.g(32.0f, R.string.fantasy_round_reveal_text, av8Var, av8Var, utcVar);
                    yf8 yf8Var = xth.a;
                    udj.c(g2, null, lz.D(R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 130042);
                    nq8.h(av8Var, bkh.e(utcVar, 8.0f));
                    av8Var.d0(227647635);
                    ListIterator listIterator = snapshotStateList.listIterator();
                    while (true) {
                        hc9 hc9Var = (hc9) listIterator;
                        int i5 = 12;
                        if (hc9Var.hasNext()) {
                            int intValue2 = ((Number) hc9Var.next()).intValue();
                            i4k h0 = s02.h0(400, 0, null, 6);
                            Object O6 = av8Var.O();
                            a99 a99Var3 = a99Var2;
                            if (O6 == a99Var3) {
                                O6 = new yt6(i5);
                                av8Var.n0(O6);
                            }
                            n4o.a(uo5.m(h0, (Function1) O6), null, yqo.H(-20889169, av8Var, new sj(fantasyEliteFaceoffRevealDialog3, intValue2, 4)), av8Var, 3126);
                            a99Var2 = a99Var3;
                        } else {
                            a99 a99Var4 = a99Var2;
                            av8Var.s(false);
                            av8Var.s(true);
                            boolean booleanValue2 = ((Boolean) e1dVar.getValue()).booleanValue();
                            xtc a3 = n12.a.a(utcVar, uxf.j);
                            i4k h02 = s02.h0(400, 0, null, 6);
                            Object O7 = av8Var.O();
                            if (O7 == a99Var4) {
                                O7 = new yt6(i5);
                                av8Var.n0(O7);
                            }
                            fz8.e(booleanValue2, a3, uo5.n(h02, (Function1) O7), null, null, yqo.H(125335603, av8Var, new vw6(fantasyEliteFaceoffRevealDialog3, 1)), av8Var, 196608, 24);
                            ljg.t(av8Var, true, true, false);
                        }
                    }
                }
                break;
            default:
                of3 of3Var2 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                String v = oea.v(R.string.fantasy_create_your_lineup_button, of3Var2);
                av8 av8Var2 = (av8) of3Var2;
                FantasyEliteFaceoffRevealDialog fantasyEliteFaceoffRevealDialog4 = this.b;
                boolean i6 = av8Var2.i(fantasyEliteFaceoffRevealDialog4);
                Object O8 = av8Var2.O();
                if (i6 || O8 == a99Var) {
                    O8 = new qo6(fantasyEliteFaceoffRevealDialog4, 4);
                    av8Var2.n0(O8);
                }
                qx9.m(v, (Function0) O8, l98.f0(l98.d0(bkh.d(utcVar, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, 7), 0L, 0L, false, av8Var2, 384, 56);
                break;
        }
        return Unit.a;
    }
}
