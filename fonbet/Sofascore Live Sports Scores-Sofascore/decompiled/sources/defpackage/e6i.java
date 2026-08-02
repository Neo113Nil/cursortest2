package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.runtime.e;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.blaze.blazesdk.features.stories.widgets.compose.BlazeComposeWidgetStoriesStateHandler;
import com.ironsource.V2;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.results.R;
import com.sofascore.results.media.news.TopNewsActivity;
import com.sofascore.results.team.TeamActivity;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeUserDailyBonusModal;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class e6i implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e6i(old oldVar, f6i f6iVar) {
        this.a = 1;
        this.c = oldVar;
        this.b = f6iVar;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        cdi cdiVar = (cdi) this.b;
        TopNewsActivity topNewsActivity = (TopNewsActivity) this.c;
        p3e p3eVar = (p3e) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        int i = TopNewsActivity.O;
        p3eVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(p3eVar) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            l98.b(Boolean.valueOf(((plj) cdiVar.getValue()).c), null, null, null, null, null, yqo.H(107986835, av8Var, new nlj(p3eVar, topNewsActivity, (Context) av8Var.k(nz.b), cdiVar, 0)), av8Var, 1572864, 62);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        vte vteVar = (vte) this.b;
        lmj lmjVar = (lmj) this.c;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((v23) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            i56.c(vteVar, lmjVar.p, lmjVar.o, null, lmjVar.q, lmjVar.getShowVotingBubble(), lmjVar.m(), av8Var, 0);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        muj mujVar = (muj) this.b;
        qug qugVar = (qug) this.c;
        cuj cujVar = (cuj) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        cujVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(cujVar) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            boolean i = av8Var.i(mujVar);
            Object O = av8Var.O();
            if (i || O == nf3.a) {
                O = new wlj(1, mujVar, muj.class, "onAction", "onAction(Lcom/sofascore/results/tracker/data/TrackerAction;)V", 0, 1);
                av8Var.n0(O);
            }
            buj.a(cujVar, (Function1) ((KFunction) O), qugVar, av8Var, intValue & 14);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.b;
        cqk cqkVar = (cqk) this.c;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((v23) obj).getClass();
        int i = 1;
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            xtc A = wnn.A(qx9.p(l98.f0(bkh.d(utc.a, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7), 1.7777778f), o7g.a(12.0f));
            boolean g = av8Var.g(function1) | av8Var.i(cqkVar);
            Object O = av8Var.O();
            if (g || O == nf3.a) {
                O = new bqk(function1, cqkVar, 2);
                av8Var.n0(O);
            }
            un0.a(tol.y(A, false, false, false, 0L, null, (Function0) O, av8Var, 31), o7g.a(12.0f), rd0.t(lz.D(R.color.surface_1, av8Var), av8Var, 0), rd0.u(2.0f, 62), null, yqo.H(-939924432, av8Var, new w39(cqkVar, i)), av8Var, 196608, 16);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        Context context = (Context) this.b;
        g3l g3lVar = (g3l) this.c;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((xpa) obj).getClass();
        int i = 1;
        int i2 = 16;
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            String v = oea.v(R.string.weekly_streak_title, av8Var);
            tc3 H = yqo.H(-535754201, av8Var, new d3l(g3lVar, i));
            boolean i3 = av8Var.i(context);
            Object O = av8Var.O();
            if (i3 || O == nf3.a) {
                O = new k9f(context, i2);
                av8Var.n0(O);
            }
            h5a.y(v, H, null, true, (Function0) O, av8Var, 3120, 4);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        Event event = (Event) this.b;
        WeeklyChallengeUserDailyBonusModal weeklyChallengeUserDailyBonusModal = (WeeklyChallengeUserDailyBonusModal) this.c;
        w3f w3fVar = (w3f) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        if (w3fVar != null) {
            av8 av8Var = (av8) of3Var;
            av8Var.d0(1741743092);
            int id = Event.getHomeTeam$default(event, null, 1, null).getId();
            int id2 = Event.getAwayTeam$default(event, null, 1, null).getId();
            boolean i = av8Var.i(weeklyChallengeUserDailyBonusModal);
            Object O = av8Var.O();
            if (i || O == nf3.a) {
                O = new lqj(weeklyChallengeUserDailyBonusModal, 15);
                av8Var.n0(O);
            }
            z5l.a(id, id2, w3fVar, false, (Function2) O, null, null, null, null, null, av8Var, ((intValue << 6) & 896) | 3072, 992);
            av8Var.s(false);
        } else {
            av8 av8Var2 = (av8) of3Var;
            av8Var2.d0(1742370408);
            t6a.b(null, 30.0f, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, V2.b.f, 1);
            av8Var2.s(false);
        }
        return Unit.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        efi efiVar = (efi) this.b;
        w3l w3lVar = (w3l) this.c;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((n8g) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            nq8.i(oea.w(efiVar.a, new Object[]{Integer.valueOf(w3lVar.c)}, av8Var), haa.t(efiVar.b, 0, av8Var), l98.b0(utc.a, 8.0f), 0L, true, av8Var, 25024, 8);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        w3f w3fVar = (w3f) this.b;
        List list = (List) this.c;
        xtc xtcVar = (xtc) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        xtcVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(xtcVar) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (!av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            av8Var.W();
        } else if (w3fVar.b == y3f.g) {
            av8Var.d0(-542670609);
            kq9.a(haa.t(R.drawable.ic_no_goal, 0, av8Var), "", bkh.l(xtcVar, 24.0f), lz.D(R.color.n_lv_1, av8Var), av8Var, 56, 0);
            av8Var.s(false);
        } else {
            av8Var.d0(-542346163);
            String str = (String) CollectionsKt.a0(1, list);
            if (str == null) {
                str = "X";
            }
            z5l.c((intValue << 3) & 112, av8Var, xtcVar, str);
            av8Var.s(false);
        }
        return Unit.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        tee teeVar = (tee) this.b;
        y7l y7lVar = (y7l) this.c;
        ((Integer) obj3).getClass();
        ((w23) obj).getClass();
        av8 av8Var = (av8) ((of3) obj2);
        Context context = (Context) av8Var.k(bh3.b);
        vy8 A = nq8.A(ty8.a);
        boolean i = av8Var.i(teeVar) | av8Var.e(y7lVar.ordinal()) | av8Var.i(context) | av8Var.h(false);
        Object O = av8Var.O();
        if (i || O == nf3.a) {
            O = new ncj(11, teeVar, y7lVar, context);
            av8Var.n0(O);
        }
        kda.a(A, (Function1) O, av8Var, 0);
        return Unit.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        tc3 tc3Var = (tc3) this.b;
        tc3 tc3Var2 = (tc3) this.c;
        of3 of3Var = (of3) obj2;
        ((Integer) obj3).getClass();
        ((o8g) obj).getClass();
        ty8 ty8Var = ty8.a;
        lz.c(nq8.y(ty8Var), ho.d, yqo.H(-198329946, of3Var, new b25(tc3Var, 14)), of3Var, 384, 0);
        aba.i(o8g.a(), of3Var, 0);
        lz.c(nq8.y(ty8Var), ho.f, yqo.H(1060720477, of3Var, new b25(tc3Var2, 15)), of3Var, 384, 0);
        return Unit.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        Bitmap bitmap = (Bitmap) this.b;
        jfj jfjVar = (jfj) this.c;
        of3 of3Var = (of3) obj2;
        ((Integer) obj3).getClass();
        ((o8g) obj).getClass();
        if (bitmap != null) {
            av8 av8Var = (av8) of3Var;
            av8Var.d0(-1891690163);
            c5n.n(new bx1(bitmap), nq8.K(16.0f), 0, null, av8Var, 48, 24);
            av8Var.s(false);
        } else {
            av8 av8Var2 = (av8) of3Var;
            av8Var2.d0(-1891441419);
            c5n.n(new v20(R.drawable.ic_flag_placeholder), nq8.K(16.0f), 0, null, av8Var2, 48, 24);
            av8Var2.s(false);
        }
        aba.i(nq8.N(ty8.a, 8.0f), of3Var, 0);
        String str = jfjVar.a;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        yf8 yf8Var = xth.a;
        o3a.i(str2, null, l98.j0(xth.c(), Integer.valueOf(R.color.n_lv_1), of3Var), 1, of3Var, 3072, 2);
        return Unit.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        rfl rflVar = (rfl) this.b;
        Function1 function1 = (Function1) this.c;
        of3 of3Var = (of3) obj2;
        ((Integer) obj3).getClass();
        ((r70) obj).getClass();
        utc utcVar = utc.a;
        xtc f0 = l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
        p4h p4hVar = ww9.d;
        kv1 kv1Var = uxf.o;
        u23 a = t23.a(p4hVar, kv1Var, of3Var, 0);
        av8 av8Var = (av8) of3Var;
        int hashCode = Long.hashCode(av8Var.T);
        aee m = av8Var.m();
        xtc C = fqj.C(of3Var, f0);
        if3.k7.getClass();
        zg3 zg3Var = hf3.b;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.h0();
        if (av8Var2.S) {
            av8Var2.l(zg3Var);
        } else {
            av8Var2.q0();
        }
        waa.K(of3Var, a, hf3.g);
        waa.K(of3Var, m, hf3.f);
        waa.K(of3Var, Integer.valueOf(hashCode), hf3.j);
        waa.J(of3Var, hf3.k);
        waa.K(of3Var, C, hf3.d);
        xtc d0 = l98.d0(utcVar, 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
        gv9 gv9Var = rflVar.a;
        u1h u1hVar = u1h.f;
        Object O = av8Var2.O();
        a99 a99Var = nf3.a;
        if (O == a99Var) {
            O = new pcl(8);
            av8Var2.n0(O);
        }
        l4a.a(gv9Var, null, (Function1) O, d0, u1hVar, false, of3Var, 28080, 32);
        xtc f02 = l98.f0(utcVar, 16.0f, 24.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
        String v = oea.v(R.string.team_spotlight_matches_unselected, of3Var);
        yf8 yf8Var = xth.a;
        udj.c(v, f02, lz.D(R.color.on_color_primary, of3Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.e(), of3Var, 0, 0, 130040);
        xtc O2 = kda.O(l98.f0(new we9(uxf.p), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), "wc26_my_team_select_button", of3Var);
        bqh bqhVar = new bqh(s6a.N(R.drawable.ic_add, 6, of3Var), kv1Var);
        String upperCase = oea.v(R.string.select_team, of3Var).toUpperCase(Locale.ROOT);
        upperCase.getClass();
        boolean g = av8Var2.g(function1);
        Object O3 = av8Var2.O();
        if (g || O3 == a99Var) {
            O3 = new b4j(10, function1);
            av8Var2.n0(O3);
        }
        mha.h(upperCase, (Function0) O3, O2, pqh.a, bqhVar, false, false, false, 0L, 0, 0, of3Var, 3072, 0, 2016);
        av8Var2.s(true);
        return Unit.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        List list = (List) this.b;
        Function1 function1 = (Function1) this.c;
        int intValue = ((Integer) obj).intValue();
        of3 of3Var = (of3) obj2;
        int intValue2 = ((Integer) obj3).intValue();
        if ((intValue2 & 6) == 0) {
            intValue2 |= ((av8) of3Var).e(intValue) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue2 & 1, (intValue2 & 19) != 18)) {
            s6a.m((ydl) list.get(intValue), function1, bkh.g(l98.d0(utc.a, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 120.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), av8Var, 384);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        Context context = (Context) this.b;
        oll ollVar = (oll) this.c;
        of3 of3Var = (of3) obj2;
        ((Integer) obj3).getClass();
        ((w23) obj).getClass();
        String string = context.getString(R.string.player_best);
        string.getClass();
        yf8 yf8Var = xth.a;
        o3a.i(string, null, l98.j0(xth.c(), Integer.valueOf(R.color.on_color_secondary), of3Var), 1, of3Var, 3072, 2);
        kda.d(ollVar, w23.a(), of3Var, 0);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x07f5, code lost:
    
        if (r5 == r4) goto L176;
     */
    @Override // defpackage.ct8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        g6i g6iVar;
        g6i g6iVar2;
        ServerType serverType;
        v5i v5iVar;
        Object obj4;
        String k;
        int i = this.a;
        int i2 = 3;
        Object obj5 = nf3.a;
        utc utcVar = utc.a;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i) {
            case 0:
                f6i f6iVar = (f6i) obj7;
                xhf xhfVar = (xhf) obj6;
                m12 m12Var = (m12) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                m12Var.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(m12Var) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    phf.a.a(xhfVar, f6iVar.a, m12Var.a(utcVar, uxf.d), lz.D(R.color.surface_P, av8Var), lz.D(R.color.primary_default, av8Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 0, 32);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                Integer num = null;
                old oldVar = (old) obj6;
                f6i f6iVar2 = (f6i) obj7;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    utc utcVar2 = utc.a;
                    xtc d0 = l98.d0(bkh.d(utcVar2, 1.0f), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    l8g a = k8g.a(ww9.c, uxf.m, av8Var2, 54);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, d0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a, hf3.g);
                    waa.K(av8Var2, m, hf3.f);
                    waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var2, hf3.k);
                    waa.K(av8Var2, C, hf3.d);
                    xtc f0 = l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
                    yf8 yf8Var = xth.a;
                    udj.c(oea.v(R.string.featured_by, av8Var2), f0, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var2, 48, 0, 131064);
                    vmd vmdVar = f6iVar2.g;
                    gv9 gv9Var = f6iVar2.e;
                    if (gv9Var == null || (g6iVar2 = (g6i) CollectionsKt.firstOrNull(gv9Var)) == null) {
                        str = null;
                    } else {
                        wmd wmdVar = g6iVar2.f;
                        wmd wmdVar2 = wmdVar.h;
                        if (wmdVar2 == null || (serverType = wmdVar2.b) == null) {
                            serverType = wmdVar.b;
                        }
                        switch (serverType == null ? -1 : y5i.a[serverType.ordinal()]) {
                            case 1:
                            case 2:
                                v5iVar = v5i.Practice;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                v5iVar = v5i.Qualifying;
                                break;
                            case 7:
                            default:
                                v5iVar = v5i.Race;
                                break;
                            case 8:
                                v5iVar = v5i.Season;
                                break;
                        }
                        str = v5iVar.a;
                    }
                    if (gv9Var != null && (g6iVar = (g6i) CollectionsKt.firstOrNull(gv9Var)) != null) {
                        num = Integer.valueOf(g6iVar.f.a);
                    }
                    nld.f(oldVar, vmdVar, str, "additional", num, null, false, av8Var2, 24960, PsExtractor.AUDIO_STREAM);
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 2:
                jai jaiVar = (jai) obj7;
                gai gaiVar = (gai) obj6;
                lrh lrhVar = (lrh) obj;
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                lrhVar.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((av8) of3Var3).g(lrhVar) ? 4 : 2;
                }
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 19) != 18)) {
                    String str2 = jaiVar.l;
                    cai caiVar = jaiVar.t;
                    lrh lrhVar2 = frh.m;
                    if (!lrhVar.equals(lrhVar2)) {
                        lrhVar2 = irh.m;
                    }
                    lrh lrhVar3 = lrhVar2;
                    boolean i3 = av8Var3.i(jaiVar) | av8Var3.i(gaiVar);
                    Object O = av8Var3.O();
                    if (i3 || O == obj5) {
                        O = new aaf(24, jaiVar, gaiVar);
                        av8Var3.n0(O);
                    }
                    g7a.j(caiVar, (Function1) O, str2, lrhVar3, av8Var3, 0, 0);
                } else {
                    av8Var3.W();
                }
                return Unit.a;
            case 3:
                Function1 function1 = (Function1) obj7;
                jwi jwiVar = (jwi) obj6;
                iwi iwiVar = (iwi) obj;
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                iwiVar.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((av8) of3Var4).g(iwiVar) ? 4 : 2;
                }
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 19) != 18)) {
                    boolean g = av8Var4.g(function1) | av8Var4.i(jwiVar);
                    Object O2 = av8Var4.O();
                    if (g || O2 == obj5) {
                        O2 = new dvi(2, function1, jwiVar);
                        av8Var4.n0(O2);
                    }
                    wba.g(iwiVar, (Function1) O2, av8Var4, intValue4 & 14);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 4:
                g4j g4jVar = (g4j) obj7;
                vnb vnbVar = (vnb) obj6;
                xpa xpaVar = (xpa) obj;
                of3 of3Var5 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                xpaVar.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((av8) of3Var5).g(xpaVar) ? 4 : 2;
                }
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 19) != 18)) {
                    nq8.h(av8Var5, bkh.e(utcVar, 8.0f));
                    wk2 wk2Var = g4jVar.a;
                    g4j g4jVar2 = (g4j) CollectionsKt.j0(((i4j) ((unb) vnbVar).a).c);
                    if (wk2Var != (g4jVar2 != null ? g4jVar2.a : null)) {
                        av8Var5.d0(-1092910472);
                        tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 14, 0L, 0L, av8Var5, xpa.a(xpaVar, utcVar, 3));
                        av8Var5.s(false);
                    } else {
                        av8Var5.d0(-1092774010);
                        av8Var5.s(false);
                    }
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 5:
                xpa xpaVar2 = (xpa) obj6;
                of3 of3Var6 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                Object obj8 = ((unb) ((vnb) obj7)).a;
                if (((i4j) obj8).e != null) {
                    av8 av8Var6 = (av8) of3Var6;
                    av8Var6.d0(-149121291);
                    y6a.a(((i4j) obj8).e, xpa.a(xpaVar2, utcVar, 7), av8Var6, 0);
                    av8Var6.s(false);
                } else {
                    av8 av8Var7 = (av8) of3Var6;
                    av8Var7.d0(-148857016);
                    av8Var7.s(false);
                }
                return Unit.a;
            case 6:
                Function1 function12 = (Function1) obj6;
                of3 of3Var7 = (of3) obj2;
                ((Integer) obj3).intValue();
                ((r70) obj).getClass();
                i4j i4jVar = (i4j) ((vnb) obj7).a();
                y6a.c(Boolean.valueOf(i4jVar != null ? i4jVar.d : true), function12, of3Var7, 0);
                return Unit.a;
            case 7:
                ksa ksaVar = (ksa) obj7;
                Function1 function13 = (Function1) obj6;
                vnb vnbVar2 = (vnb) obj;
                of3 of3Var8 = (of3) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                vnbVar2.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((av8) of3Var8).g(vnbVar2) ? 4 : 2;
                }
                av8 av8Var8 = (av8) of3Var8;
                if (!av8Var8.T(intValue6 & 1, (intValue6 & 19) != 18)) {
                    av8Var8.W();
                } else if (vnbVar2.equals(tnb.a) || (vnbVar2 instanceof snb)) {
                    av8Var8.d0(1044302323);
                    t6a.b(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var8, 6, 14);
                    av8Var8.s(false);
                } else {
                    if (!(vnbVar2 instanceof unb)) {
                        throw dmi.h(av8Var8, 1044303580, false);
                    }
                    av8Var8.d0(-1986137139);
                    xtc x = gz8.x(n9e.q(utcVar, lz.D(R.color.surface_1, av8Var8), oyn.e), null, null, 3);
                    kv1 kv1Var = uxf.p;
                    WeakHashMap weakHashMap = cal.w;
                    int i4 = intValue6;
                    t3e t3eVar = new t3e(8.0f, 8.0f, 8.0f, xw3.s(qea.p(av8Var8).e, av8Var8).a() + 8.0f);
                    boolean g2 = av8Var8.g(x23.a) | ((i4 & 14) == 4) | av8Var8.g(function13);
                    Object O3 = av8Var8.O();
                    if (g2 || O3 == obj5) {
                        O3 = new dvi(11, vnbVar2, function13);
                        av8Var8.n0(O3);
                    }
                    v8a.a(x, ksaVar, t3eVar, null, kv1Var, null, false, null, (Function1) O3, av8Var8, 196608, 472);
                    av8Var8.s(false);
                }
                return Unit.a;
            case 8:
                final Context context = (Context) obj7;
                final q5j q5jVar = (q5j) obj6;
                of3 of3Var9 = (of3) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var9 = (av8) of3Var9;
                if (av8Var9.T(intValue7 & 1, (intValue7 & 17) != 16)) {
                    xtc c0 = l98.c0(utcVar, 16.0f, 8.0f);
                    kv1 kv1Var2 = uxf.p;
                    p4h p4hVar = ww9.d;
                    u23 a2 = t23.a(p4hVar, kv1Var2, av8Var9, 48);
                    int hashCode2 = Long.hashCode(av8Var9.T);
                    aee m2 = av8Var9.m();
                    xtc C2 = fqj.C(av8Var9, c0);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var9.h0();
                    if (av8Var9.S) {
                        av8Var9.l(zg3Var2);
                    } else {
                        av8Var9.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var9, a2, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var9, m2, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var9, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var9, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var9, C2, f50Var3);
                    xtc b0 = l98.b0(utcVar, 6.0f);
                    String v = oea.v(R.string.rankings, av8Var9);
                    yf8 yf8Var2 = xth.a;
                    udj.c(v, b0, lz.D(R.color.n_lv_1, av8Var9), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var9, 48, 0, 131064);
                    xtc d = bkh.d(utcVar, 1.0f);
                    l8g a3 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var9, 54);
                    int hashCode3 = Long.hashCode(av8Var9.T);
                    aee m3 = av8Var9.m();
                    xtc C3 = fqj.C(av8Var9, d);
                    av8Var9.h0();
                    if (av8Var9.S) {
                        av8Var9.l(zg3Var2);
                    } else {
                        av8Var9.q0();
                    }
                    waa.K(av8Var9, a3, f50Var);
                    waa.K(av8Var9, m3, ff3Var);
                    bf3.s(hashCode3, av8Var9, f50Var2, av8Var9, ryVar);
                    waa.K(av8Var9, C3, f50Var3);
                    xtc l = bkh.l(utcVar, 40.0f);
                    boolean i5 = av8Var9.i(context) | av8Var9.g(q5jVar);
                    Object O4 = av8Var9.O();
                    if (!i5) {
                        obj4 = obj5;
                        break;
                    } else {
                        obj4 = obj5;
                    }
                    final int i6 = 0;
                    O4 = new Function0() { // from class: u5j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i7 = i6;
                            q5j q5jVar2 = q5jVar;
                            switch (i7) {
                                case 0:
                                    int i8 = TeamActivity.Z;
                                    jle.r(context, q5jVar2.a, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                    break;
                                default:
                                    int i9 = TeamActivity.Z;
                                    jle.r(context, q5jVar2.b, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    av8Var9.n0(O4);
                    xtc y = tol.y(l, false, false, false, 0L, null, (Function0) O4, av8Var9, 29);
                    int i7 = q5jVar.a;
                    gv9 gv9Var2 = q5jVar.c;
                    td4.G(i7, y, false, 0L, av8Var9, 0, 12);
                    goa goaVar = new goa(1.0f, true);
                    u23 a4 = t23.a(p4hVar, uxf.o, av8Var9, 0);
                    Object obj9 = obj4;
                    int hashCode4 = Long.hashCode(av8Var9.T);
                    aee m4 = av8Var9.m();
                    xtc C4 = fqj.C(av8Var9, goaVar);
                    av8Var9.h0();
                    if (av8Var9.S) {
                        av8Var9.l(zg3Var2);
                    } else {
                        av8Var9.q0();
                    }
                    waa.K(av8Var9, a4, f50Var);
                    waa.K(av8Var9, m4, ff3Var);
                    bf3.s(hashCode4, av8Var9, f50Var2, av8Var9, ryVar);
                    Iterator p = ljg.p(av8Var9, C4, f50Var3, 529970810, gv9Var2);
                    int i8 = 0;
                    while (p.hasNext()) {
                        Object next = p.next();
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            b.q();
                            throw null;
                        }
                        haa.e(q5jVar.a, q5jVar.b, (p5j) next, av8Var9, 0);
                        if (i8 < gv9Var2.size() - 1) {
                            av8Var9.d0(1171381207);
                            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 14, 0L, 0L, av8Var9, l98.d0(utcVar, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2));
                            av8Var9.s(false);
                        } else {
                            av8Var9.d0(1171497488);
                            av8Var9.s(false);
                        }
                        i8 = i9;
                    }
                    av8Var9.s(false);
                    av8Var9.s(true);
                    xtc l2 = bkh.l(utcVar, 40.0f);
                    boolean i10 = av8Var9.i(context) | av8Var9.g(q5jVar);
                    Object O5 = av8Var9.O();
                    if (i10 || O5 == obj9) {
                        final int i11 = 1;
                        O5 = new Function0() { // from class: u5j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i72 = i11;
                                q5j q5jVar2 = q5jVar;
                                switch (i72) {
                                    case 0:
                                        int i82 = TeamActivity.Z;
                                        jle.r(context, q5jVar2.a, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                        break;
                                    default:
                                        int i92 = TeamActivity.Z;
                                        jle.r(context, q5jVar2.b, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var9.n0(O5);
                    }
                    td4.G(q5jVar.b, tol.y(l2, false, false, false, 0L, null, (Function0) O5, av8Var9, 29), false, 0L, av8Var9, 0, 12);
                    av8Var9.s(true);
                    av8Var9.s(true);
                } else {
                    av8Var9.W();
                }
                return Unit.a;
            case 9:
                Context context2 = (Context) obj7;
                y5j y5jVar = (y5j) obj6;
                of3 of3Var10 = (of3) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                lv1 lv1Var = uxf.m;
                ((v23) obj).getClass();
                av8 av8Var10 = (av8) of3Var10;
                if (av8Var10.T(intValue8 & 1, (intValue8 & 17) != 16)) {
                    utc utcVar3 = utc.a;
                    xtc e0 = l98.e0(utcVar3, 16.0f, 12.0f, 16.0f, 4.0f);
                    l8g a5 = k8g.a(new ng0(16.0f, true, new a70(6)), lv1Var, av8Var10, 54);
                    int hashCode5 = Long.hashCode(av8Var10.T);
                    aee m5 = av8Var10.m();
                    xtc C5 = fqj.C(av8Var10, e0);
                    if3.k7.getClass();
                    zg3 zg3Var3 = hf3.b;
                    av8Var10.h0();
                    if (av8Var10.S) {
                        av8Var10.l(zg3Var3);
                    } else {
                        av8Var10.q0();
                    }
                    f50 f50Var4 = hf3.g;
                    waa.K(av8Var10, a5, f50Var4);
                    ff3 ff3Var2 = hf3.f;
                    waa.K(av8Var10, m5, ff3Var2);
                    Integer valueOf2 = Integer.valueOf(hashCode5);
                    f50 f50Var5 = hf3.j;
                    waa.K(av8Var10, valueOf2, f50Var5);
                    ry ryVar2 = hf3.k;
                    waa.J(av8Var10, ryVar2);
                    f50 f50Var6 = hf3.d;
                    waa.K(av8Var10, C5, f50Var6);
                    nq8.h(av8Var10, bkh.l(utcVar3, 24.0f));
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    goa goaVar2 = new goa(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                    String v2 = oea.v(R.string.tennis_grand_slam_record, av8Var10);
                    yf8 yf8Var3 = xth.a;
                    udj.c(v2, goaVar2, lz.D(R.color.n_lv_1, av8Var10), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.j(), av8Var10, 0, 0, 130040);
                    xtc l3 = bkh.l(utcVar3, 24.0f);
                    long D = lz.D(R.color.n_lv_4, av8Var10);
                    Object O6 = av8Var10.O();
                    if (O6 == obj5) {
                        O6 = mz1.e(av8Var10);
                    }
                    wzc wzcVar = (wzc) O6;
                    Object[] objArr = new Object[0];
                    Object O7 = av8Var10.O();
                    if (O7 == obj5) {
                        O7 = nuh.v;
                        av8Var10.n0(O7);
                    }
                    kq9.b(s6a.N(R.drawable.ic_info, 6, av8Var10), null, tol.y(l3, true, false, true, D, wzcVar, new he7((boh) o3a.N(objArr, (Function0) O7, av8Var10, 48), context2, 5), av8Var10, 0), lz.D(R.color.n_lv_1, av8Var10), av8Var10, 48, 0);
                    av8Var10.s(true);
                    xtc b02 = l98.b0(utcVar3, 16.0f);
                    u23 a6 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var10, 6);
                    int hashCode6 = Long.hashCode(av8Var10.T);
                    aee m6 = av8Var10.m();
                    xtc C6 = fqj.C(av8Var10, b02);
                    av8Var10.h0();
                    if (av8Var10.S) {
                        av8Var10.l(zg3Var3);
                    } else {
                        av8Var10.q0();
                    }
                    waa.K(av8Var10, a6, f50Var4);
                    waa.K(av8Var10, m6, ff3Var2);
                    bf3.s(hashCode6, av8Var10, f50Var5, av8Var10, ryVar2);
                    waa.K(av8Var10, C6, f50Var6);
                    xtc f02 = l98.f0(utcVar3, 80.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                    Context context3 = context2;
                    l8g a7 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.l, av8Var10, 6);
                    int hashCode7 = Long.hashCode(av8Var10.T);
                    aee m7 = av8Var10.m();
                    xtc C7 = fqj.C(av8Var10, f02);
                    av8Var10.h0();
                    if (av8Var10.S) {
                        av8Var10.l(zg3Var3);
                    } else {
                        av8Var10.q0();
                    }
                    waa.K(av8Var10, a7, f50Var4);
                    waa.K(av8Var10, m7, ff3Var2);
                    bf3.s(hashCode7, av8Var10, f50Var5, av8Var10, ryVar2);
                    waa.K(av8Var10, C7, f50Var6);
                    av8Var10.d0(212202119);
                    Iterator<E> it = y5jVar.a.iterator();
                    while (it.hasNext()) {
                        int intValue9 = ((Number) it.next()).intValue();
                        if (1.0f <= 0.0d) {
                            p3a.a("invalid weight; must be greater than zero");
                        }
                        goa goaVar3 = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        String valueOf3 = String.valueOf(intValue9);
                        yf8 yf8Var4 = xth.a;
                        q5a.w(valueOf3, goaVar3, lz.D(R.color.n_lv_3, av8Var10), null, 0L, 0L, new p7j(3), 0L, 0, false, 1, 0, xth.b(), av8Var10, 0, 24576, 113656);
                    }
                    av8Var10.s(false);
                    av8Var10.s(true);
                    av8Var10.d0(-1659571750);
                    for (g29 g29Var : y5jVar.b) {
                        xtc e = bkh.e(utcVar3, 32.0f);
                        l8g a8 = k8g.a(new ng0(8.0f, true, new a70(6)), lv1Var, av8Var10, 54);
                        int hashCode8 = Long.hashCode(av8Var10.T);
                        aee m8 = av8Var10.m();
                        xtc C8 = fqj.C(av8Var10, e);
                        if3.k7.getClass();
                        zg3 zg3Var4 = hf3.b;
                        av8Var10.h0();
                        if (av8Var10.S) {
                            av8Var10.l(zg3Var4);
                        } else {
                            av8Var10.q0();
                        }
                        waa.K(av8Var10, a8, hf3.g);
                        waa.K(av8Var10, m8, hf3.f);
                        waa.K(av8Var10, Integer.valueOf(hashCode8), hf3.j);
                        waa.J(av8Var10, hf3.k);
                        waa.K(av8Var10, C8, hf3.d);
                        xtc p2 = bkh.p(utcVar3, 72.0f);
                        String a9 = g29Var.a.a(av8Var10);
                        yf8 yf8Var5 = xth.a;
                        q5a.w(a9, p2, lz.D(R.color.n_lv_3, av8Var10), null, 0L, 0L, null, 0L, 2, false, 2, 0, xth.b(), av8Var10, 48, 24960, 110584);
                        av8Var10.d0(2079422755);
                        for (f29 f29Var : g29Var.c) {
                            goa goaVar4 = new goa(1.0f, true);
                            Context context4 = context3;
                            boolean i12 = av8Var10.i(context4) | av8Var10.g(g29Var) | av8Var10.g(f29Var);
                            Object O8 = av8Var10.O();
                            if (i12 || O8 == obj5) {
                                O8 = new mth(3, context4, g29Var, f29Var);
                                av8Var10.n0(O8);
                            }
                            a6j.a(f29Var, (Function0) O8, goaVar4, av8Var10, 0);
                            context3 = context4;
                        }
                        av8Var10.s(false);
                        av8Var10.s(true);
                    }
                    av8Var10.s(false);
                    av8Var10.s(true);
                } else {
                    av8Var10.W();
                }
                return Unit.a;
            case 10:
                gv9<e6j> gv9Var3 = (gv9) obj7;
                e1d e1dVar = (e1d) obj6;
                of3 of3Var11 = (of3) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var11 = (av8) of3Var11;
                if (av8Var11.T(intValue10 & 1, (intValue10 & 17) != 16)) {
                    xtc d2 = bkh.d(l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), 1.0f);
                    u23 a10 = t23.a(ww9.d, uxf.p, av8Var11, 48);
                    int hashCode9 = Long.hashCode(av8Var11.T);
                    aee m9 = av8Var11.m();
                    xtc C9 = fqj.C(av8Var11, d2);
                    if3.k7.getClass();
                    zg3 zg3Var5 = hf3.b;
                    av8Var11.h0();
                    if (av8Var11.S) {
                        av8Var11.l(zg3Var5);
                    } else {
                        av8Var11.q0();
                    }
                    waa.K(av8Var11, a10, hf3.g);
                    waa.K(av8Var11, m9, hf3.f);
                    waa.K(av8Var11, Integer.valueOf(hashCode9), hf3.j);
                    waa.J(av8Var11, hf3.k);
                    waa.K(av8Var11, C9, hf3.d);
                    xtc b03 = l98.b0(utcVar, 6.0f);
                    if (gv9Var3.size() == 1) {
                        av8Var11.d0(1166241908);
                        av8Var11.s(false);
                        k = ((e6j) e1dVar.getValue()).a.b;
                    } else {
                        k = ljg.k(av8Var11, 1166242510, R.string.rankings, av8Var11, false);
                    }
                    String str3 = k;
                    yf8 yf8Var6 = xth.a;
                    udj.c(str3, b03, lz.D(R.color.n_lv_1, av8Var11), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var11, 48, 0, 131064);
                    if (gv9Var3.size() > 1) {
                        av8Var11.d0(1793970497);
                        ArrayList arrayList = new ArrayList(k13.r(gv9Var3, 10));
                        for (e6j e6jVar : gv9Var3) {
                            arrayList.add(new s1h(e6jVar, e6jVar.a.b, true));
                        }
                        gv9 W = l6g.W(arrayList);
                        e6j e6jVar2 = (e6j) e1dVar.getValue();
                        Object O9 = av8Var11.O();
                        if (O9 == obj5) {
                            O9 = new eqh(6, e1dVar);
                            av8Var11.n0(O9);
                        }
                        l4a.a(W, e6jVar2, (Function1) O9, null, null, false, av8Var11, 384, 56);
                        av8Var11.s(false);
                    } else {
                        av8Var11.d0(1794455802);
                        av8Var11.s(false);
                    }
                    l98.b((e6j) e1dVar.getValue(), null, null, null, null, null, c5n.b, av8Var11, 1572864, 62);
                    av8Var11.s(true);
                } else {
                    av8Var11.W();
                }
                return Unit.a;
            case 11:
                rrh rrhVar = (rrh) obj7;
                wzc wzcVar2 = (wzc) obj6;
                ((Integer) obj3).getClass();
                av8 av8Var12 = (av8) ((of3) obj2);
                av8Var12.d0(-102778667);
                Object O10 = av8Var12.O();
                if (O10 == obj5) {
                    O10 = hz8.G(g.a, av8Var12);
                    av8Var12.n0(O10);
                }
                ku3 ku3Var = (ku3) O10;
                Object O11 = av8Var12.O();
                if (O11 == obj5) {
                    O11 = e.f(null);
                    av8Var12.n0(O11);
                }
                e1d e1dVar2 = (e1d) O11;
                e1d g3 = e.g(rrhVar, av8Var12);
                boolean g4 = av8Var12.g(wzcVar2);
                Object O12 = av8Var12.O();
                if (g4 || O12 == obj5) {
                    O12 = new dvi(15, e1dVar2, wzcVar2);
                    av8Var12.n0(O12);
                }
                hz8.d(wzcVar2, (Function1) O12, av8Var12);
                boolean i13 = av8Var12.i(ku3Var) | av8Var12.g(wzcVar2) | av8Var12.g(g3);
                Object O13 = av8Var12.O();
                if (i13 || O13 == obj5) {
                    O13 = new jbj(ku3Var, e1dVar2, wzcVar2, g3);
                    av8Var12.n0(O13);
                }
                xtc a11 = koi.a(utcVar, wzcVar2, (PointerInputEventHandler) O13);
                av8Var12.s(false);
                return a11;
            case 12:
                return a(obj, obj2, obj3);
            case 13:
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                oyn.p(0, (of3) obj2, (xtc) obj7, (Function0) obj6);
                return Unit.a;
            case 14:
                return b(obj, obj2, obj3);
            case 15:
                return c(obj, obj2, obj3);
            case 16:
                return d(obj, obj2, obj3);
            case 17:
                return e(obj, obj2, obj3);
            case 18:
                return f(obj, obj2, obj3);
            case 19:
                return g(obj, obj2, obj3);
            case 20:
                return h(obj, obj2, obj3);
            case 21:
                return i(obj, obj2, obj3);
            case 22:
                return j(obj, obj2, obj3);
            case 23:
                return k(obj, obj2, obj3);
            case 24:
                return l(obj, obj2, obj3);
            case 25:
                return m(obj, obj2, obj3);
            case 26:
                return n(obj, obj2, obj3);
            default:
                BlazeComposeWidgetStoriesStateHandler blazeComposeWidgetStoriesStateHandler = (BlazeComposeWidgetStoriesStateHandler) obj7;
                n5c n5cVar = (n5c) obj6;
                of3 of3Var12 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                xtc q = n9e.q(n12.a.b(utcVar), lz.D(R.color.neutral_variant, of3Var12), oyn.e);
                av8 av8Var13 = (av8) of3Var12;
                boolean i14 = av8Var13.i(blazeComposeWidgetStoriesStateHandler) | av8Var13.g(n5cVar);
                Object O14 = av8Var13.O();
                if (i14 || O14 == obj5) {
                    O14 = new ufl(i2, blazeComposeWidgetStoriesStateHandler, n5cVar);
                    av8Var13.n0(O14);
                }
                xtc y2 = tol.y(q, false, false, false, 0L, null, (Function0) O14, av8Var13, 31);
                u23 a12 = t23.a(ww9.f, uxf.p, av8Var13, 54);
                int hashCode10 = Long.hashCode(av8Var13.T);
                aee m10 = av8Var13.m();
                xtc C10 = fqj.C(av8Var13, y2);
                if3.k7.getClass();
                zg3 zg3Var6 = hf3.b;
                av8Var13.h0();
                if (av8Var13.S) {
                    av8Var13.l(zg3Var6);
                } else {
                    av8Var13.q0();
                }
                waa.K(av8Var13, a12, hf3.g);
                waa.K(av8Var13, m10, hf3.f);
                waa.K(av8Var13, Integer.valueOf(hashCode10), hf3.j);
                waa.J(av8Var13, hf3.k);
                waa.K(av8Var13, C10, hf3.d);
                String v3 = oea.v(R.string.video_not_loading, av8Var13);
                long D2 = lz.D(R.color.on_color_primary, av8Var13);
                yf8 yf8Var7 = xth.a;
                udj.c(v3, null, D2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var13, 0, 0, 131066);
                udj.c(oea.v(R.string.tap_to_retry, av8Var13), l98.b0(utcVar, 6.0f), lz.D(R.color.on_color_primary, av8Var13), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var13, 48, 0, 131064);
                av8Var13.s(true);
                return Unit.a;
        }
    }

    public /* synthetic */ e6i(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ e6i(Function1 function1, jwi jwiVar) {
        this.a = 3;
        this.b = function1;
        this.c = jwiVar;
    }
}
