package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.github.chrisbanes.photoview.PhotoView;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.chat.ChatImage;
import com.sofascore.model.chat.ChatUser;
import com.sofascore.model.chat.Message;
import com.sofascore.model.crowdsourcing.CrowdsourcingContribution;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.model.mvvm.IRecent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.MmaPostMatchVotingOptions;
import com.sofascore.model.newNetwork.StageSportDriverTeamData;
import com.sofascore.results.R;
import com.sofascore.results.bettingtips.fragment.DroppingOddsFragment;
import com.sofascore.results.chat.ChatActivity;
import com.sofascore.results.chat.fragment.AbstractChatFragment;
import com.sofascore.results.chat.fragment.CommentsChatFragment;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.event.commentary.CommentaryGoalModal;
import com.sofascore.results.event.commentary.EventCommentaryFragment;
import com.sofascore.results.event.lineups.BaseEventLineupsFragment;
import com.sofascore.results.event.lineups.cricket.EventCricketLineupsFragment;
import com.sofascore.results.event.lineups.football.EventFootballLineupsFragment;
import com.sofascore.results.event.overs.view.CricketOverDialog;
import com.sofascore.results.feed.compose.model.ShortVideoFeedCardModel;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.profile.ProfileActivity;
import com.sofascore.results.sharemodal.compose.BaseShareComposeBottomSheetModal;
import com.sofascore.results.stagesport.StageConstructorActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class kr1 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kr1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        st3 st3Var = (st3) this.b;
        int intValue = ((Integer) obj).intValue();
        int intValue2 = ((Integer) obj2).intValue();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        if (!booleanValue) {
            intValue = st3Var.v.i(intValue);
        }
        if (!booleanValue) {
            intValue2 = st3Var.v.i(intValue2);
        }
        boolean z = false;
        if (st3Var.u) {
            long j = st3Var.r.b;
            int i = pej.c;
            if (intValue != ((int) (j >> 32)) || intValue2 != ((int) (j & 4294967295L))) {
                if (Math.min(intValue, intValue2) < 0 || Math.max(intValue, intValue2) > st3Var.r.a.b.length()) {
                    tbj tbjVar = st3Var.w;
                    tbjVar.u(false);
                    tbjVar.r(p69.a);
                } else {
                    if (booleanValue || intValue == intValue2) {
                        tbj tbjVar2 = st3Var.w;
                        tbjVar2.u(false);
                        tbjVar2.r(p69.a);
                    } else {
                        st3Var.w.e(true);
                    }
                    st3Var.s.v.invoke(new wcj(st3Var.r.a, t6a.g(intValue, intValue2), (pej) null));
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        CricketOverDialog cricketOverDialog = (CricketOverDialog) this.b;
        wt3.y((Integer) obj2, (View) obj, obj3);
        if (obj3 instanceof cyd) {
            int i = PlayerActivity.Z;
            Context requireContext = cricketOverDialog.requireContext();
            requireContext.getClass();
            jle.q(requireContext, ((cyd) obj3).a, 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
        }
        return Unit.a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        CrowdsourcingContribution crowdsourcingContribution = (CrowdsourcingContribution) this.b;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((xpa) obj).getClass();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
            utc utcVar = utc.a;
            tz9.d(1.0f, 390, 8, lz.D(R.color.surface_0, av8Var), 0L, av8Var, bkh.d(utcVar, 1.0f));
            xtc c0 = l98.c0(n9e.q(bkh.d(utcVar, 1.0f), lz.D(R.color.surface_1, av8Var), o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 3)), 16.0f, 12.0f);
            k1c c = e12.c(uxf.c, false);
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
            waa.K(av8Var, c, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            hkg.f(crowdsourcingContribution, null, av8Var, 0, 2);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        DroppingOddsFragment droppingOddsFragment = (DroppingOddsFragment) this.b;
        ((Integer) obj2).getClass();
        td6 td6Var = (td6) obj3;
        ((View) obj).getClass();
        td6Var.getClass();
        wxf wxfVar = EventActivity.h0;
        Context requireContext = droppingOddsFragment.requireContext();
        requireContext.getClass();
        Event event = td6Var.a;
        wxf.B(requireContext, event.getId(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        Context requireContext2 = droppingOddsFragment.requireContext();
        requireContext2.getClass();
        yu1[] yu1VarArr = yu1.a;
        zu1 zu1Var = (zu1) droppingOddsFragment.A().g.d();
        nv.n(requireContext2, "dropping_odds_event", zu1Var != null ? zu1Var.a : "", Integer.valueOf(event.getId()), null);
        return Unit.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        EventCommentaryFragment eventCommentaryFragment = (EventCommentaryFragment) this.b;
        wt3.y((Integer) obj2, (View) obj, obj3);
        if (obj3 instanceof z33) {
            z33 z33Var = (z33) obj3;
            boolean z = !z33Var.b;
            LinkedHashMap linkedHashMap = eventCommentaryFragment.y;
            String key = eventCommentaryFragment.x.getKey();
            Object obj4 = linkedHashMap.get(key);
            if (obj4 == null) {
                obj4 = new LinkedHashMap();
                linkedHashMap.put(key, obj4);
            }
            ((Map) obj4).put(Integer.valueOf(z33Var.a.getId()), Boolean.valueOf(z));
            krk krkVar = eventCommentaryFragment.l;
            krkVar.getClass();
            eventCommentaryFragment.t(((yq8) krkVar).c, new gk(eventCommentaryFragment, z, obj3, 5));
        }
        return Unit.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        EventCricketLineupsFragment eventCricketLineupsFragment = (EventCricketLineupsFragment) this.b;
        ww5 ww5Var = (ww5) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        ww5Var.getClass();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? ((av8) of3Var).g(ww5Var) : ((av8) of3Var).i(ww5Var) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            zw5 zw5Var = (zw5) eventCricketLineupsFragment.s.getValue();
            boolean i = av8Var.i(zw5Var);
            Object O = av8Var.O();
            if (i || O == nf3.a) {
                O = new k43(1, zw5Var, zw5.class, "onAction", "onAction(Lcom/sofascore/results/event/lineups/cricket/ui/model/EventCricketLineupsAction;)V", 0, 29);
                av8Var.n0(O);
            }
            n9e.e(ww5Var, (Function1) ((KFunction) O), null, av8Var, intValue & 14);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object a10Var;
        ?? r7;
        boolean z;
        String valueOf;
        String valueOf2;
        int i = this.a;
        utc utcVar = utc.a;
        a99 a99Var = nf3.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                v0i v0iVar = (v0i) obj4;
                s22 s22Var = (s22) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                s22Var.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(s22Var) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    float b = s22Var.b() * 0.03797468f;
                    boolean g = av8Var.g(v0iVar);
                    Object O = av8Var.O();
                    if (g || O == a99Var) {
                        a10Var = v0iVar != null ? new a10(v0iVar.a) : null;
                        av8Var.n0(a10Var);
                        O = a10Var;
                    }
                    a10 a10Var2 = (a10) O;
                    if (a10Var2 != null) {
                        av8Var.d0(-1476198781);
                        wkn.m(a10Var2, l98.f0(bkh.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), av8Var, 24624);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-1475924586);
                        av8Var.s(false);
                    }
                    kq9.b(s6a.N(R.drawable.basketball_lines_small, 6, av8Var), null, bkh.c, lz.D(R.color.n_lv_1, av8Var), av8Var, 432, 0);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                s6a.g(0, 0, (of3) obj2, l98.f0(bkh.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((p3e) obj4).a(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13));
                return Unit.a;
            case 2:
                mp6 mp6Var = (mp6) obj4;
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    g28 g28Var = bkh.c;
                    mv1 mv1Var = uxf.c;
                    k1c c = e12.c(mv1Var, false);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, g28Var);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var2, c, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var2, m, ff3Var);
                    Integer valueOf3 = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var2, valueOf3, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var2, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var2, C, f50Var3);
                    kv1 kv1Var = uxf.p;
                    xtc b0 = l98.b0(g28Var, 8.0f);
                    u23 a = t23.a(ww9.d, kv1Var, av8Var2, 48);
                    int hashCode2 = Long.hashCode(av8Var2.T);
                    aee m2 = av8Var2.m();
                    xtc C2 = fqj.C(av8Var2, b0);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a, f50Var);
                    waa.K(av8Var2, m2, ff3Var);
                    bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                    waa.K(av8Var2, C2, f50Var3);
                    FantasyCompetitionType fantasyCompetitionType = mp6Var.c;
                    Long l = mp6Var.i;
                    lp6 lp6Var = mp6Var.h;
                    td4.p(fantasyCompetitionType, mp6Var.d, mp6Var.e, mp6Var.f, bkh.l(utcVar, 28.0f), av8Var2, 24576);
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    nq8.h(av8Var2, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    boolean z2 = mp6Var.g;
                    String str = mp6Var.b;
                    if (z2) {
                        str = dmi.q("[A] ", str);
                    }
                    yf8 yf8Var = xth.a;
                    q5a.w(str, bkh.d(utcVar, 1.0f), lz.D(R.color.n_lv_1, av8Var2), null, 0L, 0L, new p7j(3), 0L, 2, false, 2, 0, xth.k(), av8Var2, 48, 24960, 109560);
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    nq8.h(av8Var2, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    int ordinal = lp6Var.ordinal();
                    if (ordinal == 0) {
                        av8Var2.d0(1975360997);
                        n9e.c(0, av8Var2);
                        av8Var2.s(false);
                    } else {
                        if (ordinal != 1 && ordinal != 2) {
                            throw dmi.h(av8Var2, 1975358244, false);
                        }
                        av8Var2.d0(1106803114);
                        if (l != null) {
                            av8Var2.d0(1106862975);
                            n9e.n(l.longValue(), av8Var2, 0);
                            av8Var2.s(false);
                        } else {
                            av8Var2.d0(1106969646);
                            av8Var2.s(false);
                        }
                        av8Var2.s(false);
                    }
                    av8Var2.s(true);
                    boolean z3 = mp6Var.f;
                    n12 n12Var = n12.a;
                    if (z3) {
                        av8Var2.d0(1354259076);
                        kq9.b(s6a.N(R.drawable.ic_official_checkmark, 6, av8Var2), null, n12Var.a(bkh.l(l98.b0(utcVar, 8.0f), 12.0f), mv1Var), r13.i, av8Var2, 3120, 0);
                        r7 = 0;
                        av8Var2.s(false);
                    } else {
                        r7 = 0;
                        av8Var2.d0(1354641988);
                        av8Var2.s(false);
                    }
                    if (lp6Var == lp6.b) {
                        av8Var2.d0(1354728168);
                        n9e.m(r7, av8Var2, n12Var.a(utcVar, uxf.e));
                        av8Var2.s(r7);
                    } else {
                        av8Var2.d0(1354847332);
                        av8Var2.s(r7);
                    }
                    av8Var2.s(true);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 3:
                x07 x07Var = (x07) obj4;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                kg0 kg0Var = ww9.h;
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((av8) of3Var3).h(booleanValue) ? 4 : 2;
                }
                av8 av8Var3 = (av8) of3Var3;
                if (!av8Var3.T(intValue3 & 1, (intValue3 & 19) != 18)) {
                    av8Var3.W();
                } else if (booleanValue) {
                    av8Var3.d0(-1778019329);
                    s6a.f(36.0f, 4.0f, 438, 56, 0L, 0L, av8Var3, bkh.c);
                    av8Var3.s(false);
                } else {
                    av8Var3.d0(-1777694790);
                    ho7 ho7Var = x07Var.a;
                    if (ho7Var != null) {
                        av8Var3.d0(-1777636913);
                        kg0 kg0Var2 = ww9.f;
                        kv1 kv1Var2 = uxf.p;
                        xtc f0 = l98.f0(bkh.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, 5);
                        u23 a2 = t23.a(kg0Var2, kv1Var2, av8Var3, 54);
                        int hashCode3 = Long.hashCode(av8Var3.T);
                        aee m3 = av8Var3.m();
                        xtc C3 = fqj.C(av8Var3, f0);
                        if3.k7.getClass();
                        zg3 zg3Var2 = hf3.b;
                        av8Var3.h0();
                        if (av8Var3.S) {
                            av8Var3.l(zg3Var2);
                        } else {
                            av8Var3.q0();
                        }
                        f50 f50Var4 = hf3.g;
                        waa.K(av8Var3, a2, f50Var4);
                        ff3 ff3Var2 = hf3.f;
                        waa.K(av8Var3, m3, ff3Var2);
                        Integer valueOf4 = Integer.valueOf(hashCode3);
                        f50 f50Var5 = hf3.j;
                        waa.K(av8Var3, valueOf4, f50Var5);
                        ry ryVar2 = hf3.k;
                        waa.J(av8Var3, ryVar2);
                        f50 f50Var6 = hf3.d;
                        waa.K(av8Var3, C3, f50Var6);
                        rha.b(oea.v(R.string.fantasy_points_scored_overview_title, av8Var3), null, r13.d, av8Var3, 384, 2);
                        utc utcVar2 = utc.a;
                        nq8.h(av8Var3, bkh.e(utcVar2, 48.0f));
                        lv1 lv1Var = uxf.m;
                        xtc Y = fz8.Y(bkh.d(l98.d0(utcVar2, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 1.0f), n9a.b);
                        l8g a3 = k8g.a(ww9.b, lv1Var, av8Var3, 48);
                        int hashCode4 = Long.hashCode(av8Var3.T);
                        aee m4 = av8Var3.m();
                        xtc C4 = fqj.C(av8Var3, Y);
                        av8Var3.h0();
                        if (av8Var3.S) {
                            av8Var3.l(zg3Var2);
                        } else {
                            av8Var3.q0();
                        }
                        waa.K(av8Var3, a3, f50Var4);
                        waa.K(av8Var3, m4, ff3Var2);
                        bf3.s(hashCode4, av8Var3, f50Var5, av8Var3, ryVar2);
                        waa.K(av8Var3, C4, f50Var6);
                        mj7 mj7Var = ho7Var.a;
                        Integer num = ho7Var.b;
                        Float f = mj7Var.g;
                        float floatValue = f != null ? f.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        Integer num2 = mj7Var.i;
                        Integer num3 = mj7Var.i;
                        ww9.f(floatValue, num != null ? num.intValue() : 0, num2 != null ? num2.intValue() : 0, 0, av8Var3, l98.d0(new goa(1.0f, true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7.5f, 1));
                        nq8.h(av8Var3, bkh.p(utcVar2, 12.0f));
                        xtc p = bkh.p(bkh.c(utcVar2, 1.0f), 24.0f);
                        u23 a4 = t23.a(kg0Var, kv1Var2, av8Var3, 54);
                        int hashCode5 = Long.hashCode(av8Var3.T);
                        aee m5 = av8Var3.m();
                        xtc C5 = fqj.C(av8Var3, p);
                        av8Var3.h0();
                        if (av8Var3.S) {
                            av8Var3.l(zg3Var2);
                        } else {
                            av8Var3.q0();
                        }
                        waa.K(av8Var3, a4, f50Var4);
                        waa.K(av8Var3, m5, ff3Var2);
                        bf3.s(hashCode5, av8Var3, f50Var5, av8Var3, ryVar2);
                        waa.K(av8Var3, C5, f50Var6);
                        av8Var3.d0(1846586646);
                        Iterator it = b.j(Integer.valueOf(num3 != null ? num3.intValue() : 0), Integer.valueOf(wzb.b((num3 != null ? num3.intValue() : 0) / 2.0f)), 0).iterator();
                        while (it.hasNext()) {
                            String valueOf5 = String.valueOf(((Number) it.next()).intValue());
                            long j = r13.d;
                            yf8 yf8Var2 = xth.a;
                            fqj.a(valueOf5, xth.b(), j, null, null, av8Var3, 384, 24);
                        }
                        ljg.t(av8Var3, false, true, true);
                        nq8.h(av8Var3, bkh.e(utcVar2, 36.0f));
                        xtc d = bkh.d(l98.f0(utcVar2, 44.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 80.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), 1.0f);
                        l8g a5 = k8g.a(kg0Var, uxf.l, av8Var3, 6);
                        int hashCode6 = Long.hashCode(av8Var3.T);
                        aee m6 = av8Var3.m();
                        xtc C6 = fqj.C(av8Var3, d);
                        if3.k7.getClass();
                        zg3 zg3Var3 = hf3.b;
                        av8Var3.h0();
                        if (av8Var3.S) {
                            av8Var3.l(zg3Var3);
                        } else {
                            av8Var3.q0();
                        }
                        waa.K(av8Var3, a5, hf3.g);
                        waa.K(av8Var3, m6, hf3.f);
                        waa.K(av8Var3, Integer.valueOf(hashCode6), hf3.j);
                        waa.J(av8Var3, hf3.k);
                        waa.K(av8Var3, C6, hf3.d);
                        String v = oea.v(R.string.average, av8Var3);
                        Float f2 = mj7Var.g;
                        String format = f2 != null ? String.format(dla.d(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f2.floatValue())}, 1)) : "-";
                        yf8 yf8Var3 = xth.a;
                        dfj i2 = xth.i();
                        p8g p8gVar = p8g.a;
                        fkf.t(v, format, l98.c0(n9e.q(bkh.p(p8gVar.a(1.0f, utcVar2, false), 72.0f), lz.D(R.color.darken_overlay_1, av8Var3), o7g.a(8.0f)), 4.0f, 8.0f), i2, 0L, 0L, av8Var3, 0, 48);
                        fkf.t(oea.v(R.string.fantasy_your_scored_points, av8Var3), (num == null || (valueOf2 = String.valueOf(num.intValue())) == null) ? "-" : valueOf2, ljg.h(8.0f, bkh.p(p8gVar.a(1.0f, utcVar2, false), 72.0f), lz.D(R.color.darken_overlay_1, av8Var3), 8.0f), xth.i(), 0L, 0L, av8Var3, 0, 48);
                        String v2 = oea.v(R.string.highest_points_scored, av8Var3);
                        String str2 = (num3 == null || (valueOf = String.valueOf(num3.intValue())) == null) ? "-" : valueOf;
                        z = false;
                        fkf.t(v2, str2, ljg.h(8.0f, bkh.p(p8gVar.a(1.0f, utcVar2, false), 72.0f), lz.D(R.color.darken_overlay_1, av8Var3), 8.0f), xth.i(), 0L, 0L, av8Var3, 0, 48);
                        ljg.t(av8Var3, true, true, false);
                    } else {
                        z = false;
                        av8Var3.d0(-1773051548);
                        av8Var3.s(false);
                    }
                    av8Var3.s(z);
                }
                return Unit.a;
            case 4:
                ShortVideoFeedCardModel shortVideoFeedCardModel = (ShortVideoFeedCardModel) obj4;
                of3 of3Var4 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    g28 g28Var2 = bkh.c;
                    k1c c2 = e12.c(uxf.c, false);
                    int hashCode7 = Long.hashCode(av8Var4.T);
                    aee m7 = av8Var4.m();
                    xtc C7 = fqj.C(av8Var4, g28Var2);
                    if3.k7.getClass();
                    zg3 zg3Var4 = hf3.b;
                    av8Var4.h0();
                    if (av8Var4.S) {
                        av8Var4.l(zg3Var4);
                    } else {
                        av8Var4.q0();
                    }
                    f50 f50Var7 = hf3.g;
                    waa.K(av8Var4, c2, f50Var7);
                    ff3 ff3Var3 = hf3.f;
                    waa.K(av8Var4, m7, ff3Var3);
                    Integer valueOf6 = Integer.valueOf(hashCode7);
                    f50 f50Var8 = hf3.j;
                    waa.K(av8Var4, valueOf6, f50Var8);
                    ry ryVar3 = hf3.k;
                    waa.J(av8Var4, ryVar3);
                    f50 f50Var9 = hf3.d;
                    waa.K(av8Var4, C7, f50Var9);
                    td4.O(shortVideoFeedCardModel.m, null, 0L, false, false, av8Var4, 0, 30);
                    xtc b02 = l98.b0(utcVar, 8.0f);
                    u23 a6 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var4, 6);
                    int hashCode8 = Long.hashCode(av8Var4.T);
                    aee m8 = av8Var4.m();
                    xtc C8 = fqj.C(av8Var4, b02);
                    av8Var4.h0();
                    if (av8Var4.S) {
                        av8Var4.l(zg3Var4);
                    } else {
                        av8Var4.q0();
                    }
                    waa.K(av8Var4, a6, f50Var7);
                    waa.K(av8Var4, m8, ff3Var3);
                    bf3.s(hashCode8, av8Var4, f50Var8, av8Var4, ryVar3);
                    nq8.h(av8Var4, ljg.g(av8Var4, C8, f50Var9, 1.0f, true));
                    String str3 = shortVideoFeedCardModel.i;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = str3;
                    yf8 yf8Var4 = xth.a;
                    udj.c(str4, null, lz.D(R.color.on_color_primary, av8Var4), null, 0L, null, 0L, null, null, 0L, 2, false, 3, 0, null, xth.j(), av8Var4, 0, 24960, 110586);
                    av8Var4.s(true);
                    av8Var4.s(true);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 5:
                hth hthVar = (hth) obj4;
                fm8 fm8Var = (fm8) obj;
                of3 of3Var5 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                fm8Var.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((av8) of3Var5).g(fm8Var) ? 4 : 2;
                }
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 19) != 18)) {
                    g28 g28Var3 = bkh.c;
                    k1c c3 = e12.c(uxf.g, false);
                    int hashCode9 = Long.hashCode(av8Var5.T);
                    aee m9 = av8Var5.m();
                    xtc C9 = fqj.C(av8Var5, g28Var3);
                    if3.k7.getClass();
                    zg3 zg3Var5 = hf3.b;
                    av8Var5.h0();
                    if (av8Var5.S) {
                        av8Var5.l(zg3Var5);
                    } else {
                        av8Var5.q0();
                    }
                    waa.K(av8Var5, c3, hf3.g);
                    waa.K(av8Var5, m9, hf3.f);
                    waa.K(av8Var5, Integer.valueOf(hashCode9), hf3.j);
                    waa.J(av8Var5, hf3.k);
                    waa.K(av8Var5, C9, hf3.d);
                    ufi.a(hthVar.e, fm8Var.a(), yqo.H(-409449454, av8Var5, new pte(fm8Var, 19)), av8Var5, 384);
                    av8Var5.s(true);
                } else {
                    av8Var5.W();
                }
                return Unit.a;
            case 6:
                fnk fnkVar = (fnk) obj4;
                of3 of3Var6 = (of3) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue6 & 1, (intValue6 & 17) != 16)) {
                    int i3 = fnkVar.i.a;
                    g28 g28Var4 = bkh.c;
                    Object O2 = av8Var6.O();
                    if (O2 == a99Var) {
                        O2 = new wik(21);
                        av8Var6.n0(O2);
                    }
                    td4.M(i3, 0, av8Var6, td4.Z(g28Var4, (Function1) O2));
                } else {
                    av8Var6.W();
                }
                return Unit.a;
            case 7:
                AbstractChatFragment abstractChatFragment = (AbstractChatFragment) obj4;
                View view = (View) obj;
                wt3.y((Integer) obj2, view, obj3);
                if (obj3 instanceof Message) {
                    Message message = (Message) obj3;
                    if (!s9a.y(message)) {
                        int id = view.getId();
                        if (id == R.id.user_logo || id == R.id.user_name) {
                            ChatUser user = message.getUser();
                            if (user == null) {
                                return Unit.a;
                            }
                            if (message.getIsAd()) {
                                return Unit.a;
                            }
                            if (!abstractChatFragment.K().isLoggedIn()) {
                                Calendar calendar = ke0.a;
                                Context requireContext = abstractChatFragment.requireContext();
                                requireContext.getClass();
                                ke0.f(R.string.login_required, requireContext);
                            } else if (!user.isAdmin() || abstractChatFragment.K().isAdmin()) {
                                abstractChatFragment.G = true;
                                Context requireContext2 = abstractChatFragment.requireContext();
                                requireContext2.getClass();
                                nv.n0(requireContext2, ev.CHAT);
                                int i4 = ProfileActivity.Q;
                                Context requireContext3 = abstractChatFragment.requireContext();
                                requireContext3.getClass();
                                v8a.H(requireContext3, user.getId(), user.getName());
                            } else {
                                Calendar calendar2 = ke0.a;
                                Context requireContext4 = abstractChatFragment.requireContext();
                                requireContext4.getClass();
                                ke0.f(R.string.can_not_open_admin, requireContext4);
                            }
                        } else if (id == R.id.thumbnail) {
                            Dialog dialog = new Dialog(abstractChatFragment.requireContext());
                            dialog.requestWindowFeature(1);
                            View inflate = LayoutInflater.from(abstractChatFragment.getContext()).inflate(R.layout.dialog_chat_image, (ViewGroup) null, false);
                            int i5 = R.id.chat_image_progress;
                            ProgressBar progressBar = (ProgressBar) nq8.B(R.id.chat_image_progress, inflate);
                            if (progressBar != null) {
                                i5 = R.id.image;
                                PhotoView photoView = (PhotoView) nq8.B(R.id.image, inflate);
                                if (photoView != null) {
                                    RelativeLayout relativeLayout = (RelativeLayout) inflate;
                                    dd ddVar = new dd(relativeLayout, progressBar, photoView, 9);
                                    progressBar.setVisibility(0);
                                    photoView.setOnClickListener(new s0(dialog, true ? 1 : 0));
                                    photoView.setOnSingleFlingListener(new l1(dialog, false ? 1 : 0));
                                    dialog.setContentView(relativeLayout);
                                    dialog.show();
                                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                                    Window window = dialog.getWindow();
                                    layoutParams.copyFrom(window != null ? window.getAttributes() : null);
                                    layoutParams.width = -1;
                                    layoutParams.height = -1;
                                    Window window2 = dialog.getWindow();
                                    if (window2 != null) {
                                        window2.setAttributes(layoutParams);
                                    }
                                    ChatImage image = message.getImage();
                                    a10Var = image != null ? image.getUrl() : null;
                                    apf a7 = ajh.a(photoView.getContext());
                                    ht9 ht9Var = new ht9(photoView.getContext());
                                    ht9Var.c = a10Var;
                                    vt9.f(ht9Var, photoView);
                                    ht9Var.q = jrg.b;
                                    ht9Var.d = new g7h(ddVar, dialog, ddVar, abstractChatFragment, 2);
                                    a7.a(ht9Var.a());
                                }
                            }
                            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i5)));
                            return null;
                        }
                        return Unit.a;
                    }
                }
                return Unit.a;
            case 8:
                k8i k8iVar = (k8i) obj4;
                wt3.y((Integer) obj2, (View) obj, obj3);
                if (obj3 instanceof StageSportDriverTeamData) {
                    int i6 = StageConstructorActivity.R;
                    dff.g(((StageSportDriverTeamData) obj3).getParentTeam().getId(), k8iVar.b);
                }
                return Unit.a;
            case 9:
                ek ekVar = (ek) obj4;
                of3 of3Var7 = (of3) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var7 = (av8) of3Var7;
                if (av8Var7.T(intValue7 & 1, (intValue7 & 17) != 16)) {
                    j72.a(ekVar.e, BrandLocation.EventScreen, null, Integer.valueOf(ekVar.a.a), false, av8Var7, 48, 20);
                } else {
                    av8Var7.W();
                }
                return Unit.a;
            case 10:
                BaseEventLineupsFragment baseEventLineupsFragment = (BaseEventLineupsFragment) obj4;
                vnb vnbVar = (vnb) obj;
                of3 of3Var8 = (of3) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                vnbVar.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((av8) of3Var8).g(vnbVar) ? 4 : 2;
                }
                av8 av8Var8 = (av8) of3Var8;
                if (!av8Var8.T(intValue8 & 1, (intValue8 & 19) != 18)) {
                    av8Var8.W();
                } else if ((vnbVar instanceof snb) || vnbVar.equals(tnb.a)) {
                    av8Var8.d0(-751899057);
                    av8Var8.s(false);
                } else {
                    if (!(vnbVar instanceof unb)) {
                        throw dmi.h(av8Var8, -751901319, false);
                    }
                    av8Var8.d0(-1833975354);
                    baseEventLineupsFragment.C().invoke(((unb) vnbVar).a, av8Var8, 0);
                    av8Var8.s(false);
                }
                return Unit.a;
            case 11:
                BaseShareComposeBottomSheetModal baseShareComposeBottomSheetModal = (BaseShareComposeBottomSheetModal) obj4;
                Parcelable parcelable = (Parcelable) obj;
                of3 of3Var9 = (of3) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                parcelable.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= (intValue9 & 8) == 0 ? ((av8) of3Var9).g(parcelable) : ((av8) of3Var9).i(parcelable) ? 4 : 2;
                }
                av8 av8Var9 = (av8) of3Var9;
                if (av8Var9.T(intValue9 & 1, (intValue9 & 19) != 18)) {
                    baseShareComposeBottomSheetModal.K(parcelable, av8Var9, intValue9 & 14);
                } else {
                    av8Var9.W();
                }
                return Unit.a;
            case 12:
                List list = (List) obj4;
                of3 of3Var10 = (of3) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((kb8) obj).getClass();
                av8 av8Var10 = (av8) of3Var10;
                if (av8Var10.T(intValue10 & 1, (intValue10 & 17) != 16)) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        u91.b((bm1) it2.next(), av8Var10, 0);
                    }
                } else {
                    av8Var10.W();
                }
                return Unit.a;
            case 13:
                vj1 vj1Var = (vj1) obj4;
                of3 of3Var11 = (of3) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var11 = (av8) of3Var11;
                if (av8Var11.T(intValue11 & 1, (intValue11 & 17) != 16)) {
                    ek1.f(vj1Var.b, 48, av8Var11, l98.f0(l98.d0(bkh.d(utcVar, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13));
                } else {
                    av8Var11.W();
                }
                return Unit.a;
            case 14:
                am1 am1Var = (am1) obj4;
                xtc xtcVar = (xtc) obj;
                of3 of3Var12 = (of3) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                xtcVar.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((av8) of3Var12).g(xtcVar) ? 4 : 2;
                }
                av8 av8Var12 = (av8) of3Var12;
                if (av8Var12.T(intValue12 & 1, (intValue12 & 19) != 18)) {
                    td4.y(am1Var.b, (intValue12 << 3) & 112, 12, av8Var12, xtcVar, null, false);
                } else {
                    av8Var12.W();
                }
                return Unit.a;
            case 15:
                m1c m1cVar = (m1c) obj;
                qhe J = ((g1c) obj2).J(cn3.e(((an3) obj3).a, cn3.a(0, Integer.MAX_VALUE, m1cVar.e0(((p75) ((eoh) ((cej) obj4).f).getValue()).a), Integer.MAX_VALUE)));
                return m1c.G0(m1cVar, J.a, J.b, new b3(J, 2));
            case 16:
                bt1 bt1Var = (bt1) obj4;
                of3 of3Var13 = (of3) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((m12) obj).getClass();
                av8 av8Var13 = (av8) of3Var13;
                if (av8Var13.T(intValue13 & 1, (intValue13 & 17) != 16)) {
                    String str5 = bt1Var.k;
                    bx7 bx7Var = bt1Var.l;
                    l98.r(str5, bx7Var.c, bx7Var.b, bx7Var.d, av8Var13, 0);
                } else {
                    av8Var13.W();
                }
                return Unit.a;
            case 17:
                return new d67(5, obj3, (g62) obj4, (h2h) obj);
            case 18:
                ((mnc) obj4).invoke((Throwable) obj);
                return Unit.a;
            case 19:
                View view2 = (View) obj;
                wt3.y((Integer) obj2, view2, obj3);
                ((wt2) obj4).O(view2, obj3);
                return Unit.a;
            case 20:
                ((Integer) obj2).getClass();
                f43 f43Var = (f43) obj3;
                ((View) obj).getClass();
                f43Var.getClass();
                int i7 = PlayerActivity.Z;
                Context requireContext5 = ((CommentaryGoalModal) obj4).requireContext();
                requireContext5.getClass();
                jle.q(requireContext5, ((e43) f43Var).a.getId(), 0, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                return Unit.a;
            case 21:
                CommentsChatFragment commentsChatFragment = (CommentsChatFragment) obj4;
                Event event = (Event) obj;
                MmaPostMatchVotingOptions mmaPostMatchVotingOptions = (MmaPostMatchVotingOptions) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                event.getClass();
                mmaPostMatchVotingOptions.getClass();
                ((jqc) commentsChatFragment.R.getValue()).g(event, mmaPostMatchVotingOptions, "chat", intValue14 + 1);
                FragmentActivity requireActivity = commentsChatFragment.requireActivity();
                requireActivity.getClass();
                ((ChatActivity) requireActivity).setResult(-1);
                commentsChatFragment.u();
                return Unit.a;
            case 22:
                c63 c63Var = (c63) obj4;
                wt3.y((Integer) obj2, (View) obj, obj3);
                a10Var = obj3 instanceof IRecent ? (IRecent) obj3 : null;
                if (a10Var != null) {
                    c63Var.g.invoke(a10Var);
                }
                return Unit.a;
            case 23:
                return a(obj, obj2, obj3);
            case 24:
                return b(obj, obj2, obj3);
            case 25:
                return c(obj, obj2, obj3);
            case 26:
                return d(obj, obj2, obj3);
            case 27:
                return e(obj, obj2, obj3);
            case 28:
                return f(obj, obj2, obj3);
            default:
                EventFootballLineupsFragment eventFootballLineupsFragment = (EventFootballLineupsFragment) obj4;
                f06 f06Var = (f06) obj;
                of3 of3Var14 = (of3) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                f06Var.getClass();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= (intValue15 & 8) == 0 ? ((av8) of3Var14).g(f06Var) : ((av8) of3Var14).i(f06Var) ? 4 : 2;
                }
                av8 av8Var14 = (av8) of3Var14;
                if (av8Var14.T(intValue15 & 1, (intValue15 & 19) != 18)) {
                    boolean i8 = av8Var14.i(eventFootballLineupsFragment);
                    Object O3 = av8Var14.O();
                    if (i8 || O3 == a99Var) {
                        O3 = new kz3(eventFootballLineupsFragment, 26);
                        av8Var14.n0(O3);
                    }
                    fkf.d(f06Var, (Function1) O3, null, av8Var14, intValue15 & 14);
                } else {
                    av8Var14.W();
                }
                return Unit.a;
        }
    }
}
