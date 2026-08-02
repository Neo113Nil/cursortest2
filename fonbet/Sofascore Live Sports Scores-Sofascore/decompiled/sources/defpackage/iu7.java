package defpackage;

import android.content.Context;
import android.graphics.Color;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.Colors;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.odds.ProviderOdds;
import com.sofascore.results.R;
import com.sofascore.results.event.odds.model.OddsEventUIModel;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class iu7 {
    public static final mqi a;

    static {
        ypa.b(new go7(10));
        a = ypa.b(new go7(11));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i, int i2, Function0 function0, xtc xtcVar, of3 of3Var, int i3, int i4) {
        xtc xtcVar2;
        xtc xtcVar3;
        eqf u;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1675588499);
        int i5 = (av8Var.e(i) ? 4 : 2) | i3 | (av8Var.e(i2) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i6 = i4 & 8;
        if (i6 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            xtcVar2 = xtcVar;
            i5 |= av8Var.g(xtcVar2) ? a.o : 1024;
            if (av8Var.T(i5 & 1, (i5 & 1171) == 1170)) {
                av8Var.W();
                xtcVar3 = xtcVar2;
            } else {
                utc utcVar = utc.a;
                xtcVar3 = i6 != 0 ? utcVar : xtcVar2;
                xtc q = n9e.q(wnn.A(l98.d0(xtcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), o7g.a(8.0f)), lz.D(R.color.surface_1, av8Var), oyn.e);
                long D = lz.D(R.color.n_lv_4, av8Var);
                Object O = av8Var.O();
                a99 a99Var = nf3.a;
                if (O == a99Var) {
                    O = mz1.e(av8Var);
                }
                wzc wzcVar = (wzc) O;
                Object[] objArr = new Object[0];
                Object O2 = av8Var.O();
                if (O2 == a99Var) {
                    O2 = o67.k;
                    av8Var.n0(O2);
                }
                xtc c0 = l98.c0(tol.y(q, true, true, true, D, wzcVar, new gm((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function0, 28), av8Var, 0), 16.0f, 8.0f);
                l8g a2 = k8g.a(ww9.b, uxf.l, av8Var, 0);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, c0);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a2, hf3.g);
                waa.K(av8Var, m, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                xtc O3 = kda.O(ljg.g(av8Var, C, hf3.d, 1.0f, true), "affiliate_link_description_text", av8Var);
                String v = oea.v(i, av8Var);
                yf8 yf8Var = xth.a;
                udj.c(v, O3, lz.D(R.color.n_lv_2, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131064);
                udj.c(oea.v(i2, av8Var), kda.O(utcVar, "cta_affiliate_link", av8Var), lz.D(R.color.primary_default, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131064);
                av8Var = av8Var;
                av8Var.s(true);
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new hu7(i, i2, function0, xtcVar3, i3, i4);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if (av8Var.T(i5 & 1, (i5 & 1171) == 1170)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void b(final xtc xtcVar, final r13 r13Var, of3 of3Var, final int i) {
        eqf u;
        Function2 function2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1170126994);
        int i2 = (av8Var.g(xtcVar) ? 4 : 2) | i | (av8Var.g(r13Var) ? 32 : 16);
        final int i3 = 1;
        final int i4 = 0;
        if (!av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            av8Var.W();
        } else {
            if (r13Var == null) {
                u = av8Var.u();
                if (u != null) {
                    function2 = new Function2(xtcVar, r13Var, i, i4) { // from class: eu7
                        public final /* synthetic */ int a;
                        public final /* synthetic */ xtc b;
                        public final /* synthetic */ r13 c;

                        {
                            this.a = i4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.a;
                            of3 of3Var2 = (of3) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    iu7.b(this.b, this.c, of3Var2, aba.K(1));
                                    break;
                                default:
                                    iu7.b(this.b, this.c, of3Var2, aba.K(1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    u.d = function2;
                }
                return;
            }
            e12.a(0, av8Var, n9e.p(xtcVar, new v7b(b.j(r13Var, new r13(lz.D(R.color.darken_overlay_1, av8Var)), r13Var), null, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L)), null, 6));
            e12.a(0, av8Var, n9e.q(u6h.C(xtcVar, 0.8f), lz.D(R.color.surface_1, av8Var), oyn.e));
        }
        u = av8Var.u();
        if (u != null) {
            function2 = new Function2(xtcVar, r13Var, i, i3) { // from class: eu7
                public final /* synthetic */ int a;
                public final /* synthetic */ xtc b;
                public final /* synthetic */ r13 c;

                {
                    this.a = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.a;
                    of3 of3Var2 = (of3) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            iu7.b(this.b, this.c, of3Var2, aba.K(1));
                            break;
                        default:
                            iu7.b(this.b, this.c, of3Var2, aba.K(1));
                            break;
                    }
                    return Unit.a;
                }
            };
            u.d = function2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x039d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x047e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final int i, final xmd xmdVar, final vmd vmdVar, final Function1 function1, final xtc xtcVar, final long j, of3 of3Var, final int i2) {
        eqf eqfVar;
        Function2 function2;
        boolean z;
        boolean z2;
        r9k r9kVar;
        String a2;
        String n;
        vmd vmdVar2;
        boolean z3;
        av8 av8Var;
        boolean z4;
        Context context;
        tld tldVar;
        boolean z5;
        boolean z6;
        Context context2;
        vmd vmdVar3;
        OddsEventUIModel oddsEventUIModel;
        old oldVar;
        boolean i3;
        Object O;
        ald h;
        old oldVar2;
        OddsEventUIModel oddsEventUIModel2;
        String primary;
        vmdVar.getClass();
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1325785599);
        int i4 = i2 | (av8Var2.e(i) ? 4 : 2) | (av8Var2.g(xmdVar) ? 32 : 16) | (av8Var2.e(vmdVar.ordinal()) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function1) ? a.o : 1024) | (av8Var2.f(j) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var2.T(i4 & 1, (74899 & i4) != 74898)) {
            av8Var2.Y();
            if ((i2 & 1) != 0 && !av8Var2.B()) {
                av8Var2.W();
            }
            av8Var2.t();
            if (xmdVar != null) {
                gv9<and> gv9Var = xmdVar.a;
                if (!gv9Var.isEmpty()) {
                    Context context3 = (Context) av8Var2.k(nz.b);
                    boolean booleanValue = ((Boolean) av8Var2.k(f5a.a)).booleanValue();
                    OddsEventUIModel oddsEventUIModel3 = xmdVar.c;
                    boolean z7 = gv9Var.size() == 1;
                    old oldVar3 = ((and) CollectionsKt.Y(gv9Var)).a;
                    fgf fgfVar = ((and) CollectionsKt.Y(gv9Var)).b;
                    if (!booleanValue) {
                        if (!rld.v(context3, oddsEventUIModel3.d, oddsEventUIModel3.b)) {
                            z = false;
                            boolean z8 = !z7 && xmdVar.d && (!z || vmdVar == vmd.CHAT);
                            xtc w = kda.w(gz8.x(xtcVar, null, null, 3));
                            p4h p4hVar = ww9.d;
                            int i5 = i4;
                            kv1 kv1Var = uxf.o;
                            u23 a3 = t23.a(p4hVar, kv1Var, av8Var2, 0);
                            int hashCode = Long.hashCode(av8Var2.T);
                            aee m = av8Var2.m();
                            xtc C = fqj.C(av8Var2, w);
                            if3.k7.getClass();
                            zg3 zg3Var = hf3.b;
                            av8Var2.h0();
                            if (av8Var2.S) {
                                av8Var2.q0();
                            } else {
                                av8Var2.l(zg3Var);
                            }
                            f50 f50Var = hf3.g;
                            waa.K(av8Var2, a3, f50Var);
                            ff3 ff3Var = hf3.f;
                            waa.K(av8Var2, m, ff3Var);
                            Integer valueOf = Integer.valueOf(hashCode);
                            f50 f50Var2 = hf3.j;
                            waa.K(av8Var2, valueOf, f50Var2);
                            ry ryVar = hf3.k;
                            waa.J(av8Var2, ryVar);
                            f50 f50Var3 = hf3.d;
                            waa.K(av8Var2, C, f50Var3);
                            utc utcVar = utc.a;
                            xtc q = n9e.q(wnn.A(yso.o(bkh.d(utcVar, 1.0f), 2.0f, lz.D(R.color.surface_1, av8Var2), o7g.a(16.0f)), o7g.a(16.0f)), j, oyn.e);
                            k1c c = e12.c(uxf.c, false);
                            int hashCode2 = Long.hashCode(av8Var2.T);
                            aee m2 = av8Var2.m();
                            xtc C2 = fqj.C(av8Var2, q);
                            av8Var2.h0();
                            if (av8Var2.S) {
                                av8Var2.q0();
                            } else {
                                av8Var2.l(zg3Var);
                            }
                            waa.K(av8Var2, c, f50Var);
                            waa.K(av8Var2, m2, ff3Var);
                            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                            waa.K(av8Var2, C2, f50Var3);
                            if (oldVar3.c || !z7) {
                                z2 = false;
                                av8Var2.d0(441182695);
                                av8Var2.s(false);
                            } else {
                                av8Var2.d0(440922264);
                                Colors colors = oldVar3.a.b;
                                z2 = false;
                                b(n12.a.b(utcVar), (colors == null || (primary = colors.getPrimary()) == null) ? null : new r13(hkg.b(Color.parseColor(primary))), av8Var2, 0);
                                av8Var2.s(false);
                            }
                            r9kVar = fgfVar.b;
                            String str = fgfVar.g;
                            ProviderOdds.Type type = fgfVar.f;
                            if (r9kVar != null) {
                                av8Var2.d0(441267324);
                                av8Var2.s(z2);
                                a2 = null;
                            } else {
                                av8Var2.d0(-817049563);
                                a2 = r9kVar.a(av8Var2);
                                av8Var2.s(false);
                            }
                            String str2 = oddsEventUIModel3.c;
                            context3.getClass();
                            type.getClass();
                            n = rld.n(context3, a2, str2);
                            if (n == null) {
                                n = "";
                            }
                            String w2 = rld.w(n, type, str);
                            type.getClass();
                            if (a2 == null) {
                                a2 = "";
                            }
                            String w3 = rld.w(a2, type, str);
                            xtc O2 = kda.O(l98.c0(utcVar, 16.0f, 8.0f), "base_odds_container", av8Var2);
                            u23 a4 = t23.a(p4hVar, kv1Var, av8Var2, 0);
                            int hashCode3 = Long.hashCode(av8Var2.T);
                            aee m3 = av8Var2.m();
                            xtc C3 = fqj.C(av8Var2, O2);
                            av8Var2.h0();
                            if (av8Var2.S) {
                                av8Var2.q0();
                            } else {
                                av8Var2.l(zg3Var);
                            }
                            waa.K(av8Var2, a4, f50Var);
                            waa.K(av8Var2, m3, ff3Var);
                            bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
                            waa.K(av8Var2, C3, f50Var3);
                            xtc d0 = l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
                            if (z7) {
                                vmdVar2 = vmdVar;
                            } else {
                                vmdVar2 = vmdVar;
                                if (vmdVar2 == vmd.EVENT_DETAILS || vmdVar2 == vmd.EVENT_MATCHES || vmdVar2 == vmd.CHAT) {
                                    z3 = true;
                                    char c2 = 2;
                                    int i6 = NotificationCompat.FLAG_LOCAL_ONLY;
                                    boolean z9 = false;
                                    boolean z10 = true;
                                    OddsEventUIModel oddsEventUIModel4 = oddsEventUIModel3;
                                    Context context4 = context3;
                                    int i7 = a.o;
                                    d(w2, oldVar3, i, vmdVar2, fgfVar.d, d0, z3, Integer.valueOf(oddsEventUIModel3.a), w3, av8Var2, ((i5 << 3) & 7168) | ((i5 << 6) & 896) | 196608, 0);
                                    av8 av8Var3 = av8Var2;
                                    av8Var3.d0(-1254905832);
                                    for (and andVar : gv9Var) {
                                        av8Var3.a0(-17799925, Integer.valueOf(andVar.b.a));
                                        int i8 = oddsEventUIModel4.a;
                                        int i9 = i7;
                                        String str3 = oddsEventUIModel4.b;
                                        String str4 = oddsEventUIModel4.c;
                                        old oldVar4 = andVar.a;
                                        fgf fgfVar2 = andVar.b;
                                        boolean z11 = (Intrinsics.c(str3, StatusKt.STATUS_NOT_STARTED) || Intrinsics.c(oddsEventUIModel4.b, StatusKt.STATUS_IN_PROGRESS)) ? z10 : z9;
                                        bgf bgfVar = cgf.a;
                                        boolean z12 = andVar.a.c;
                                        bgfVar.getClass();
                                        boolean z13 = z9;
                                        av8 av8Var4 = av8Var3;
                                        nld.d(i8, str3, str4, oldVar4, fgfVar2, vmdVar, "featured", null, 0L, z11, z7 ? cgf.c : z12 ? cgf.b : cgf.d, false, false, null, null, av8Var4, ((i5 << 9) & 458752) | 1572864, 0, 31104);
                                        av8Var4.s(z13);
                                        oddsEventUIModel4 = oddsEventUIModel4;
                                        av8Var3 = av8Var4;
                                        i6 = i6;
                                        z10 = z10;
                                        i7 = i9;
                                        c2 = c2;
                                        i5 = i5;
                                        context4 = context4;
                                        z9 = z13;
                                    }
                                    OddsEventUIModel oddsEventUIModel5 = oddsEventUIModel4;
                                    av8Var = av8Var3;
                                    int i10 = i7;
                                    z4 = z10;
                                    int i11 = i6;
                                    int i12 = i5;
                                    context = context4;
                                    av8Var.s(z9);
                                    tldVar = xmdVar.e;
                                    z5 = tldVar.a;
                                    a99 a99Var = nf3.a;
                                    if (z5 || !z7) {
                                        z6 = z4;
                                        context2 = context;
                                        av8Var2 = av8Var;
                                        vmdVar3 = vmdVar;
                                        if (tldVar.c) {
                                            av8Var2.d0(-1254844460);
                                            boolean i13 = ((i12 & 7168) == i10 ? z6 : false) | av8Var2.i(context2) | av8Var2.g(oddsEventUIModel5);
                                            Object O3 = av8Var2.O();
                                            if (i13 || O3 == a99Var) {
                                                O3 = new l97(function1, context2, oddsEventUIModel5);
                                                av8Var2.n0(O3);
                                            }
                                            oldVar = oldVar3;
                                            oddsEventUIModel = oddsEventUIModel5;
                                            a(R.string.check_available_boosts, R.string.bet_boost_button, (Function0) O3, null, av8Var2, 0, 8);
                                            av8Var2.s(false);
                                        } else {
                                            oddsEventUIModel = oddsEventUIModel5;
                                            oldVar = oldVar3;
                                            av8Var2.d0(-245021327);
                                            av8Var2.s(false);
                                        }
                                    } else {
                                        av8Var.d0(-1254875897);
                                        boolean i14 = av8Var.i(context) | av8Var.g(oldVar3) | av8Var.g(w3) | av8Var.g(oddsEventUIModel5) | ((i12 & 896) == i11 ? z4 : false);
                                        Object O4 = av8Var.O();
                                        if (i14 || O4 == a99Var) {
                                            z6 = z4;
                                            l31 l31Var = new l31(context, oldVar3, w3, oddsEventUIModel5, vmdVar);
                                            context2 = context;
                                            oldVar2 = oldVar3;
                                            oddsEventUIModel2 = oddsEventUIModel5;
                                            vmdVar3 = vmdVar;
                                            av8Var.n0(l31Var);
                                            O4 = l31Var;
                                        } else {
                                            oldVar2 = oldVar3;
                                            z6 = z4;
                                            oddsEventUIModel2 = oddsEventUIModel5;
                                            context2 = context;
                                            vmdVar3 = vmdVar;
                                        }
                                        av8Var2 = av8Var;
                                        a(R.string.odds_cta_text_2, R.string.claim_your_bonus_button, (Function0) O4, null, av8Var2, 0, 8);
                                        av8Var2.s(false);
                                        oldVar = oldVar2;
                                        oddsEventUIModel = oddsEventUIModel2;
                                    }
                                    boolean c3 = Intrinsics.c(oldVar.e, Boolean.TRUE);
                                    boolean z14 = vmdVar3 == vmd.CHAT ? z6 : false;
                                    i3 = av8Var2.i(context2) | av8Var2.g(oddsEventUIModel);
                                    O = av8Var2.O();
                                    if (!i3 || O == a99Var) {
                                        O = new n37(25, context2, oddsEventUIModel);
                                        av8Var2.n0(O);
                                    }
                                    e(c3, z14, z8, (Function0) O, av8Var2, 0);
                                    av8Var2.s(z6);
                                    av8Var2.s(z6);
                                    h = rld.h(i, vmdVar3 != vmd.WEEKLY_CHALLENGE ? z6 : false);
                                    if (h == null) {
                                        av8Var2.d0(-1978558118);
                                        av8Var2.s(false);
                                    } else {
                                        av8Var2.d0(-1978558117);
                                        qx9.a(h, l98.d0(l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 0L, av8Var2, 48, 4);
                                        Unit unit = Unit.a;
                                        av8Var2.s(false);
                                    }
                                    av8Var2.s(z6);
                                }
                            }
                            z3 = false;
                            char c22 = 2;
                            int i62 = NotificationCompat.FLAG_LOCAL_ONLY;
                            boolean z92 = false;
                            boolean z102 = true;
                            OddsEventUIModel oddsEventUIModel42 = oddsEventUIModel3;
                            Context context42 = context3;
                            int i72 = a.o;
                            d(w2, oldVar3, i, vmdVar2, fgfVar.d, d0, z3, Integer.valueOf(oddsEventUIModel3.a), w3, av8Var2, ((i5 << 3) & 7168) | ((i5 << 6) & 896) | 196608, 0);
                            av8 av8Var32 = av8Var2;
                            av8Var32.d0(-1254905832);
                            while (r0.hasNext()) {
                            }
                            OddsEventUIModel oddsEventUIModel52 = oddsEventUIModel42;
                            av8Var = av8Var32;
                            int i102 = i72;
                            z4 = z102;
                            int i112 = i62;
                            int i122 = i5;
                            context = context42;
                            av8Var.s(z92);
                            tldVar = xmdVar.e;
                            z5 = tldVar.a;
                            a99 a99Var2 = nf3.a;
                            if (z5) {
                            }
                            z6 = z4;
                            context2 = context;
                            av8Var2 = av8Var;
                            vmdVar3 = vmdVar;
                            if (tldVar.c) {
                            }
                            boolean c32 = Intrinsics.c(oldVar.e, Boolean.TRUE);
                            if (vmdVar3 == vmd.CHAT) {
                            }
                            i3 = av8Var2.i(context2) | av8Var2.g(oddsEventUIModel);
                            O = av8Var2.O();
                            if (!i3) {
                            }
                            O = new n37(25, context2, oddsEventUIModel);
                            av8Var2.n0(O);
                            e(c32, z14, z8, (Function0) O, av8Var2, 0);
                            av8Var2.s(z6);
                            av8Var2.s(z6);
                            h = rld.h(i, vmdVar3 != vmd.WEEKLY_CHALLENGE ? z6 : false);
                            if (h == null) {
                            }
                            av8Var2.s(z6);
                        }
                    }
                    z = true;
                    if (z7) {
                    }
                    xtc w4 = kda.w(gz8.x(xtcVar, null, null, 3));
                    p4h p4hVar2 = ww9.d;
                    int i52 = i4;
                    kv1 kv1Var2 = uxf.o;
                    u23 a32 = t23.a(p4hVar2, kv1Var2, av8Var2, 0);
                    int hashCode4 = Long.hashCode(av8Var2.T);
                    aee m4 = av8Var2.m();
                    xtc C4 = fqj.C(av8Var2, w4);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                    }
                    f50 f50Var4 = hf3.g;
                    waa.K(av8Var2, a32, f50Var4);
                    ff3 ff3Var2 = hf3.f;
                    waa.K(av8Var2, m4, ff3Var2);
                    Integer valueOf2 = Integer.valueOf(hashCode4);
                    f50 f50Var22 = hf3.j;
                    waa.K(av8Var2, valueOf2, f50Var22);
                    ry ryVar2 = hf3.k;
                    waa.J(av8Var2, ryVar2);
                    f50 f50Var32 = hf3.d;
                    waa.K(av8Var2, C4, f50Var32);
                    utc utcVar2 = utc.a;
                    xtc q2 = n9e.q(wnn.A(yso.o(bkh.d(utcVar2, 1.0f), 2.0f, lz.D(R.color.surface_1, av8Var2), o7g.a(16.0f)), o7g.a(16.0f)), j, oyn.e);
                    k1c c4 = e12.c(uxf.c, false);
                    int hashCode22 = Long.hashCode(av8Var2.T);
                    aee m22 = av8Var2.m();
                    xtc C22 = fqj.C(av8Var2, q2);
                    av8Var2.h0();
                    if (av8Var2.S) {
                    }
                    waa.K(av8Var2, c4, f50Var4);
                    waa.K(av8Var2, m22, ff3Var2);
                    bf3.s(hashCode22, av8Var2, f50Var22, av8Var2, ryVar2);
                    waa.K(av8Var2, C22, f50Var32);
                    if (oldVar3.c) {
                    }
                    z2 = false;
                    av8Var2.d0(441182695);
                    av8Var2.s(false);
                    r9kVar = fgfVar.b;
                    String str5 = fgfVar.g;
                    ProviderOdds.Type type2 = fgfVar.f;
                    if (r9kVar != null) {
                    }
                    String str22 = oddsEventUIModel3.c;
                    context3.getClass();
                    type2.getClass();
                    n = rld.n(context3, a2, str22);
                    if (n == null) {
                    }
                    String w22 = rld.w(n, type2, str5);
                    type2.getClass();
                    if (a2 == null) {
                    }
                    String w32 = rld.w(a2, type2, str5);
                    xtc O22 = kda.O(l98.c0(utcVar2, 16.0f, 8.0f), "base_odds_container", av8Var2);
                    u23 a42 = t23.a(p4hVar2, kv1Var2, av8Var2, 0);
                    int hashCode32 = Long.hashCode(av8Var2.T);
                    aee m32 = av8Var2.m();
                    xtc C32 = fqj.C(av8Var2, O22);
                    av8Var2.h0();
                    if (av8Var2.S) {
                    }
                    waa.K(av8Var2, a42, f50Var4);
                    waa.K(av8Var2, m32, ff3Var2);
                    bf3.s(hashCode32, av8Var2, f50Var22, av8Var2, ryVar2);
                    waa.K(av8Var2, C32, f50Var32);
                    xtc d02 = l98.d0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
                    if (z7) {
                    }
                    z3 = false;
                    char c222 = 2;
                    int i622 = NotificationCompat.FLAG_LOCAL_ONLY;
                    boolean z922 = false;
                    boolean z1022 = true;
                    OddsEventUIModel oddsEventUIModel422 = oddsEventUIModel3;
                    Context context422 = context3;
                    int i722 = a.o;
                    d(w22, oldVar3, i, vmdVar2, fgfVar.d, d02, z3, Integer.valueOf(oddsEventUIModel3.a), w32, av8Var2, ((i52 << 3) & 7168) | ((i52 << 6) & 896) | 196608, 0);
                    av8 av8Var322 = av8Var2;
                    av8Var322.d0(-1254905832);
                    while (r0.hasNext()) {
                    }
                    OddsEventUIModel oddsEventUIModel522 = oddsEventUIModel422;
                    av8Var = av8Var322;
                    int i1022 = i722;
                    z4 = z1022;
                    int i1122 = i622;
                    int i1222 = i52;
                    context = context422;
                    av8Var.s(z922);
                    tldVar = xmdVar.e;
                    z5 = tldVar.a;
                    a99 a99Var22 = nf3.a;
                    if (z5) {
                    }
                    z6 = z4;
                    context2 = context;
                    av8Var2 = av8Var;
                    vmdVar3 = vmdVar;
                    if (tldVar.c) {
                    }
                    boolean c322 = Intrinsics.c(oldVar.e, Boolean.TRUE);
                    if (vmdVar3 == vmd.CHAT) {
                    }
                    i3 = av8Var2.i(context2) | av8Var2.g(oddsEventUIModel);
                    O = av8Var2.O();
                    if (!i3) {
                    }
                    O = new n37(25, context2, oddsEventUIModel);
                    av8Var2.n0(O);
                    e(c322, z14, z8, (Function0) O, av8Var2, 0);
                    av8Var2.s(z6);
                    av8Var2.s(z6);
                    h = rld.h(i, vmdVar3 != vmd.WEEKLY_CHALLENGE ? z6 : false);
                    if (h == null) {
                    }
                    av8Var2.s(z6);
                }
            }
            eqfVar = av8Var2.u();
            if (eqfVar != null) {
                final int i15 = 0;
                function2 = new Function2(i, xmdVar, vmdVar, function1, xtcVar, j, i2, i15) { // from class: fu7
                    public final /* synthetic */ int a;
                    public final /* synthetic */ int b;
                    public final /* synthetic */ xmd c;
                    public final /* synthetic */ vmd d;
                    public final /* synthetic */ Function1 e;
                    public final /* synthetic */ xtc f;
                    public final /* synthetic */ long g;

                    {
                        this.a = i15;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int K = aba.K(24577);
                                iu7.c(this.b, this.c, this.d, this.e, this.f, this.g, (of3) obj, K);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int K2 = aba.K(24577);
                                iu7.c(this.b, this.c, this.d, this.e, this.f, this.g, (of3) obj, K2);
                                break;
                        }
                        return Unit.a;
                    }
                };
                eqfVar.d = function2;
            }
            return;
        }
        av8Var2.W();
        eqfVar = av8Var2.u();
        if (eqfVar != null) {
            final int i16 = 1;
            function2 = new Function2(i, xmdVar, vmdVar, function1, xtcVar, j, i2, i16) { // from class: fu7
                public final /* synthetic */ int a;
                public final /* synthetic */ int b;
                public final /* synthetic */ xmd c;
                public final /* synthetic */ vmd d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ xtc f;
                public final /* synthetic */ long g;

                {
                    this.a = i16;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int K = aba.K(24577);
                            iu7.c(this.b, this.c, this.d, this.e, this.f, this.g, (of3) obj, K);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int K2 = aba.K(24577);
                            iu7.c(this.b, this.c, this.d, this.e, this.f, this.g, (of3) obj, K2);
                            break;
                    }
                    return Unit.a;
                }
            };
            eqfVar.d = function2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(String str, old oldVar, int i, vmd vmdVar, boolean z, xtc xtcVar, boolean z2, Integer num, String str2, of3 of3Var, int i2, int i3) {
        int i4;
        boolean z3;
        int i5;
        Integer num2;
        boolean z4;
        eqf u;
        utc utcVar;
        boolean z5;
        Integer num3;
        oldVar.getClass();
        vmdVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1267062353);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var.g(oldVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var.e(i) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= av8Var.e(vmdVar.ordinal()) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= av8Var.h(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= av8Var.g(xtcVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i6 = i3 & 64;
        if (i6 != 0) {
            i4 |= 1572864;
        } else if ((1572864 & i2) == 0) {
            z3 = z2;
            i4 |= av8Var.h(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            i5 = i3 & 128;
            if (i5 == 0) {
                i4 |= 12582912;
            } else if ((12582912 & i2) == 0) {
                i4 |= av8Var.g(num) ? 8388608 : 4194304;
                if ((100663296 & i2) == 0) {
                    i4 |= av8Var.g(str2) ? 67108864 : 33554432;
                }
                if (av8Var.T(i4 & 1, (38347923 & i4) != 38347922)) {
                    boolean z6 = i6 != 0 ? true : z3;
                    Integer num4 = i5 != 0 ? null : num;
                    lv1 lv1Var = uxf.m;
                    int i7 = i4 >> 15;
                    wxf wxfVar = ww9.b;
                    l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 48);
                    Integer num5 = num4;
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, xtcVar);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    int i8 = i4;
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var, a2, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var, C, f50Var3);
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    xtc f0 = l98.f0(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                    l8g a3 = k8g.a(wxfVar, uxf.l, av8Var, 0);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, f0);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a3, f50Var);
                    waa.K(av8Var, m2, ff3Var);
                    bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C2, f50Var3);
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    xtc O = kda.O(new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), "base_odds_header_text", av8Var);
                    String str3 = str == null ? "" : str;
                    yf8 yf8Var = xth.a;
                    udj.c(str3, O, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.k(), av8Var, 0, 24960, 110584);
                    utc utcVar2 = utc.a;
                    if (z) {
                        av8Var.d0(1993648234);
                        utcVar = utcVar2;
                        udj.c(oea.v(R.string.standings_live, av8Var), l98.f0(utcVar2, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.value, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.k(), av8Var, 48, 0, 131064);
                        z5 = false;
                        av8Var.s(false);
                    } else {
                        utcVar = utcVar2;
                        z5 = false;
                        av8Var.d0(1993907177);
                        av8Var.s(false);
                    }
                    av8Var.s(true);
                    int i9 = i8 >> 6;
                    f(i, i9 & 14, 2, av8Var, null);
                    if (oldVar.c && z6) {
                        av8Var.d0(636438901);
                        num3 = num5;
                        nld.f(oldVar, vmdVar, str2, "featured", num3, kda.O(l98.f0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), "base_odds_logo", av8Var), false, av8Var, ((i8 >> 3) & 14) | 24960 | (i9 & 112) | (i7 & 7168) | (i9 & 458752), 128);
                        av8Var.s(z5);
                    } else {
                        num3 = num5;
                        av8Var.d0(636902413);
                        av8Var.s(z5);
                    }
                    av8Var.s(true);
                    num2 = num3;
                    z4 = z6;
                } else {
                    av8Var.W();
                    num2 = num;
                    z4 = z3;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new du7(str, oldVar, i, vmdVar, z, xtcVar, z4, num2, str2, i2, i3);
                    return;
                }
                return;
            }
            if ((100663296 & i2) == 0) {
            }
            if (av8Var.T(i4 & 1, (38347923 & i4) != 38347922)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        z3 = z2;
        i5 = i3 & 128;
        if (i5 == 0) {
        }
        if ((100663296 & i2) == 0) {
        }
        if (av8Var.T(i4 & 1, (38347923 & i4) != 38347922)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void e(final boolean z, final boolean z2, final boolean z3, final Function0 function0, of3 of3Var, final int i) {
        av8 av8Var;
        int i2;
        utc utcVar;
        boolean z4;
        p8g p8gVar;
        boolean z5;
        float f;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(37038303);
        int i3 = i | (av8Var2.h(z) ? 4 : 2) | (av8Var2.h(z2) ? 32 : 16) | (av8Var2.h(z3) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function0) ? a.o : 1024);
        if (av8Var2.T(i3 & 1, (i3 & 1171) != 1170)) {
            Context context = (Context) av8Var2.k(nz.b);
            utc utcVar2 = utc.a;
            xtc O = kda.O(bkh.d(utcVar2, 1.0f), "regulation_container", av8Var2);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, O);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            p8g p8gVar2 = p8g.a;
            if (z2) {
                av8Var2.d0(-486103710);
                xtc O2 = kda.O(l98.d0(p8gVar2.a(2.0f, utcVar2, true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), "regulations_text", av8Var2);
                String f2 = rld.f(context, z);
                yf8 yf8Var = xth.a;
                dfj g = xth.g();
                long D = lz.D(R.color.n_lv_3, av8Var2);
                i2 = i3;
                utcVar = utcVar2;
                p8gVar = p8gVar2;
                z4 = true;
                z5 = false;
                udj.c(f2, O2, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, g, av8Var2, 0, 0, 131064);
                av8Var = av8Var2;
                av8Var.s(false);
                f = 1.0f;
            } else {
                i2 = i3;
                utcVar = utcVar2;
                z4 = true;
                p8gVar = p8gVar2;
                av8Var = av8Var2;
                z5 = false;
                av8Var.d0(-485749597);
                f = 1.0f;
                nq8.h(av8Var, p8gVar.a(1.0f, utcVar, true));
                av8Var.s(false);
            }
            if (z3) {
                av8Var.d0(-485597325);
                av8 av8Var3 = av8Var;
                mha.h(oea.v(R.string.additional_odds, av8Var), function0, kda.O(p8gVar.a(f, utcVar, z4), "base_odds_additional_odds", av8Var), rqh.a, null, false, false, false, 0L, 0, 3, av8Var3, ((i2 >> 6) & 112) | 3072, 6, 1008);
                av8Var = av8Var3;
                av8Var.s(z5);
            } else {
                av8Var.d0(-485237601);
                av8Var.s(z5);
            }
            av8Var.s(z4);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(z, z2, z3, function0, i) { // from class: gu7
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ Function0 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(1);
                    iu7.e(this.a, this.b, this.c, this.d, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(int i, int i2, int i3, of3 of3Var, xtc xtcVar) {
        int i4;
        xtc xtcVar2;
        av8 av8Var;
        eqf u;
        xtc xtcVar3;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1856414649);
        if ((i2 & 6) == 0) {
            i4 = (av8Var2.e(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            xtcVar2 = xtcVar;
            i4 |= av8Var2.g(xtcVar2) ? 32 : 16;
            if (av8Var2.T(i4 & 1, (i4 & 19) == 18)) {
                av8Var = av8Var2;
                av8Var.W();
            } else {
                utc utcVar = utc.a;
                xtc xtcVar4 = i5 != 0 ? utcVar : xtcVar2;
                if (zu3.J.hasMcc(Integer.valueOf(i))) {
                    av8Var2.d0(-1844912067);
                    av8Var = av8Var2;
                    wkn.l(s6a.N(R.drawable.ic_aams_logo, 6, av8Var2), bkh.e(l98.d0(xtcVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1), 16.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 48, 120);
                    av8Var.s(false);
                    xtcVar3 = xtcVar4;
                } else {
                    av8Var = av8Var2;
                    if (zu3.k.hasMcc(Integer.valueOf(i))) {
                        av8Var.d0(1603065574);
                        xtc d0 = l98.d0(xtcVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 1);
                        l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
                        int hashCode = Long.hashCode(av8Var.T);
                        aee m = av8Var.m();
                        xtc C = fqj.C(av8Var, d0);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(zg3Var);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, a2, hf3.g);
                        waa.K(av8Var, m, hf3.f);
                        waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                        waa.J(av8Var, hf3.k);
                        waa.K(av8Var, C, hf3.d);
                        xtcVar3 = xtcVar4;
                        wkn.k(haa.t(R.drawable.igaming_eng, 0, av8Var), null, bkh.e(utcVar, 14.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 440, 120);
                        td4.N(n9e.q(bkh.e(l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 16.0f), lz.D(R.color.n_lv_4, av8Var), oyn.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, av8Var, 0, 6);
                        wkn.k(haa.t(R.drawable.igaming_fra, 0, av8Var), null, bkh.e(utcVar, 14.0f), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 440, 120);
                        av8Var = av8Var;
                        av8Var.s(true);
                        av8Var.s(false);
                    } else {
                        xtcVar3 = xtcVar4;
                        av8Var.d0(-1843756759);
                        av8Var.s(false);
                    }
                }
                xtcVar2 = xtcVar3;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new cu7(i, xtcVar2, i2, i3);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if (av8Var2.T(i4 & 1, (i4 & 19) == 18)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }
}
