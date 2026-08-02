package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.blaze.blazesdk.features.moments.container.BlazeMomentsPlayerContainer;
import com.blaze.blazesdk.features.moments.models.args.b;
import com.blaze.blazesdk.players.inline.BlazeBaseInlinePlayerContainer;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.local_persistance.Brand;
import com.sofascore.model.Sports;
import com.sofascore.model.branding.PartnerOfferType;
import com.sofascore.model.chat.TeamOfTheRoundChatInterface;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TournamentRoundWrapper;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.results.R;
import com.sofascore.results.chat.ChatActivity;
import com.sofascore.results.dialog.SofascoreRatingBottomSheetDialog;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import com.sofascore.results.fantasy.onboarding.steps.FantasyOnboardingStepsNavigation;
import com.sofascore.results.fantasy.ui.model.FantasyFootballPlayerPlaceholder;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.featureWalkthrough.FeatureWalkthroughFullScreenDialog;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.league.fragment.details.compose.totr.share.TeamOfTheRoundShareBottomSheet;
import com.sofascore.results.league.fragment.details.compose.totr.share.TotrSharePayload;
import com.sofascore.results.media.highlights.MediaHighlightsActivity;
import com.sofascore.results.media.news.TopNewsActivity;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.team.TeamActivity;
import com.sofascore.results.wc26.bottomSheet.WorldCupLastDanceShareBottomSheet;
import com.sofascore.results.wc26.bottomSheet.WorldCupTeamPickerBottomSheet;
import com.sofascore.results.wc26.bottomSheet.WorldCupTimelineBottomSheet;
import com.sofascore.results.wc26.data.WorldCupLastDanceUiModel;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ke implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ke(scj scjVar, Function1 function1, e1d e1dVar, wd8 wd8Var, e1d e1dVar2) {
        this.a = 12;
        this.b = scjVar;
        this.c = function1;
        this.f = e1dVar;
        this.d = wd8Var;
        this.e = e1dVar2;
    }

    private final Object a(Object obj) {
        vp7 vp7Var = (vp7) this.b;
        Function0 function0 = (Function0) this.c;
        Context context = (Context) this.d;
        Function1 function1 = (Function1) this.e;
        Function1 function12 = (Function1) this.f;
        bp7 bp7Var = (bp7) obj;
        bp7Var.getClass();
        rq3 rq3Var = null;
        if (bp7Var.equals(yo7.a)) {
            vp7Var.p = null;
            qp7 k = vp7Var.k();
            gv9<Object> gv9Var = vp7Var.k().d;
            ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
            for (Object obj2 : gv9Var) {
                if (obj2 instanceof FantasyRoundPlayerUiModel) {
                    obj2 = FantasyRoundPlayerUiModel.b((FantasyRoundPlayerUiModel) obj2, null, 0, false, false, false, null, null, 536870891);
                } else if (obj2 instanceof FantasyFootballPlayerPlaceholder) {
                    obj2 = FantasyFootballPlayerPlaceholder.b((FantasyFootballPlayerPlaceholder) obj2, null, false, 21);
                }
                arrayList.add(obj2);
            }
            vp7Var.m(qp7.a(k, l6g.W(arrayList), 0, false, false, null, null, 439));
        } else {
            int i = 1;
            if (bp7Var.equals(zo7.a)) {
                function0.invoke();
                vp7Var.getClass();
                xw3.L(un0.z(vp7Var), null, null, new up7(vp7Var, null, 1), 3);
            } else if (!bp7Var.equals(xo7.a)) {
                if (!(bp7Var instanceof ap7)) {
                    zzl.b();
                    return null;
                }
                oz6 oz6Var = ((ap7) bp7Var).a;
                if (oz6Var instanceof FantasyRoundPlayerUiModel) {
                    if (vp7Var.p != null) {
                        vp7Var.l(oz6Var);
                    } else {
                        function1.invoke(oz6Var);
                    }
                } else if (oz6Var instanceof FantasyFootballPlayerPlaceholder) {
                    if (vp7Var.p != null) {
                        vp7Var.l(oz6Var);
                    } else {
                        vp7Var.o = oz6Var;
                        function12.invoke(oz6Var);
                    }
                }
            } else if (vp7Var.k().e > 0) {
                zic.P(context, R.string.fantasy_auto_select_confirm_title, R.string.fantasy_auto_select_confirm_text, R.string.fantasy_auto_select, new l97(4, context, function0, vp7Var), 48);
            } else {
                nv.A(context, "auto_select", null);
                function0.invoke();
                xw3.L(un0.z(vp7Var), null, null, new zi7(vp7Var, rq3Var, i), 3);
            }
        }
        return Unit.a;
    }

    private final Object b(Object obj) {
        List list;
        asf asfVar = (asf) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        dsf dsfVar = (dsf) this.d;
        k6d k6dVar = (k6d) this.e;
        Bundle bundle = (Bundle) this.f;
        d6d d6dVar = (d6d) obj;
        d6dVar.getClass();
        asfVar.a = true;
        int indexOf = arrayList.indexOf(d6dVar);
        if (indexOf != -1) {
            int i = indexOf + 1;
            list = arrayList.subList(dsfVar.a, i);
            dsfVar.a = i;
        } else {
            list = km5.a;
        }
        k6dVar.a(d6dVar.b, bundle, d6dVar, list);
        return Unit.a;
    }

    private final Object c(Object obj) {
        d2j d2jVar = (d2j) this.b;
        List list = (List) this.c;
        n52 n52Var = (n52) this.d;
        Function1 function1 = (Function1) this.e;
        Context context = (Context) this.f;
        esa esaVar = (esa) obj;
        esaVar.getClass();
        if (d2jVar.a.size() > 1) {
            esa.b(esaVar, null, new tc3(335147895, new c61(13, d2jVar, n52Var, function1), true), 3);
        }
        esaVar.a(list.size(), new wsd(12, new m04(context, 2), list), new dyg(list, 4), new tc3(2039820996, new l46(list, d2jVar, function1, 9), true));
        return Unit.a;
    }

    private final Object d(Object obj) {
        w84 w84Var = (w84) this.b;
        nnd nndVar = (nnd) this.c;
        wcj wcjVar = (wcj) this.d;
        q5b q5bVar = (q5b) this.e;
        pvh pvhVar = (pvh) this.f;
        yma ymaVar = (yma) obj;
        ymaVar.a();
        float h = w84Var.c.h();
        if (h != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            long j = wcjVar.b;
            int i = pej.c;
            int v = nndVar.v((int) (j >> 32));
            bej d = q5bVar.d();
            oqf c = d != null ? d.a.c(v) : new oqf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float floor = (float) Math.floor(ymaVar.H0(2.0f));
            float f = floor < 1.0f ? 1.0f : floor;
            float f2 = f / 2.0f;
            float f3 = c.a + f2;
            float intBitsToFloat = Float.intBitsToFloat((int) (ymaVar.a.n() >> 32)) - f2;
            if (f3 > intBitsToFloat) {
                f3 = intBitsToFloat;
            }
            if (f3 >= f2) {
                f2 = f3;
            }
            float floor2 = ((int) f) % 2 == 1 ? ((float) Math.floor(f2)) + 0.5f : (float) Math.rint(f2);
            ha5.j0(ymaVar, pvhVar, (Float.floatToRawIntBits(c.b) & 4294967295L) | (Float.floatToRawIntBits(floor2) << 32), (Float.floatToRawIntBits(floor2) << 32) | (Float.floatToRawIntBits(c.d) & 4294967295L), f, 0, h, 432);
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04a9  */
    /* JADX WARN: Type inference failed for: r3v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r3v1, types: [hsk] */
    /* JADX WARN: Type inference failed for: r3v35 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Unit createMomentsPlayerWrapperView$lambda$7;
        gv9 gv9Var;
        xoe xoeVar;
        Object obj2;
        Object obj3;
        TotrSharePayload totrSharePayload;
        xxi xxiVar;
        Highlight highlight;
        String str;
        gv9 gv9Var2;
        Object obj4;
        iel ielVar;
        iel ielVar2;
        iel ielVar3;
        iel ielVar4;
        iel ielVar5;
        int i = this.a;
        int i2 = 6;
        r3 = null;
        Integer num = null;
        int i3 = 2;
        Object obj5 = this.b;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        int i4 = 3;
        switch (i) {
            case 0:
                ee eeVar = (ee) obj5;
                eeVar.a = ((je) obj9).c((String) obj8, (ce) obj7, new l1((e1d) obj6, 2));
                return new le(eeVar, 0);
            case 1:
                r5b r5bVar = (r5b) obj;
                k5b k5bVar = ((i10) obj9).a;
                r5bVar.h = (wcj) obj5;
                r5bVar.i = (qu9) obj8;
                r5bVar.c = (vsc) obj7;
                r5bVar.d = (Function1) obj6;
                r5bVar.e = k5bVar != null ? k5bVar.p : null;
                r5bVar.f = k5bVar != null ? k5bVar.q : null;
                r5bVar.g = k5bVar != null ? (hsk) tgj.x(k5bVar, dh3.t) : 0;
                return Unit.a;
            case 2:
                return BlazeBaseInlinePlayerContainer.a((BlazeBaseInlinePlayerContainer) obj5, (Context) obj9, (hom) obj8, (u6b) obj7, (ttk) obj6, (rpl) obj);
            case 3:
                createMomentsPlayerWrapperView$lambda$7 = BlazeMomentsPlayerContainer.createMomentsPlayerWrapperView$lambda$7((BlazeMomentsPlayerContainer) obj5, (u6b) obj9, (Context) obj8, (b) obj7, (ttk) obj6, (rpl) obj);
                return createMomentsPlayerWrapperView$lambda$7;
            case 4:
                int intValue = ((Integer) obj).intValue();
                t3e t3eVar = oj4.a;
                ((e1d) obj6).setValue(Boolean.valueOf(!((Boolean) r8.getValue()).booleanValue()));
                xw3.L((ku3) obj5, null, null, new z23((ksa) obj9, intValue, (IntRange) obj8, (lg2) obj7, (rq3) null, 1), 3);
                return Unit.a;
            case 5:
                return new rm4(this.b, (Set) obj9, (Set) obj8, (e1d) obj6, (e1d) obj7);
            case 6:
                Activity activity = (Activity) obj5;
                r77 r77Var = (r77) obj9;
                Context context = (Context) obj8;
                Function0 function0 = (Function0) obj7;
                g9a g9aVar = (g9a) obj6;
                c77 c77Var = (c77) obj;
                c77Var.getClass();
                if (c77Var.equals(w67.a)) {
                    if (activity != null) {
                        g9aVar.l(activity, AdType.Interstitial.Fantasy);
                    }
                    r77Var.u(c77Var);
                } else if (c77Var.equals(b77.a)) {
                    nv.A(context, "edit_team_name", "watch_ad");
                    function0.invoke();
                } else if (c77Var instanceof z67) {
                    nv.A(context, "edit_team_name", "save_name");
                    r77Var.u(c77Var);
                } else if (c77Var.equals(y67.a)) {
                    int i5 = r77Var.n.c.c;
                    context.getClass();
                    nv.A(context, "open_rules", null);
                    p4h.w(context, "https://www.sofascore.com/fantasy/rules".concat("?competitionId=" + i5));
                } else if (c77Var.equals(a77.a)) {
                    p4h.w(context, "https://www.sofascore.com/fantasy/terms-and-conditions/");
                } else if (c77Var.equals(x67.a)) {
                    p4h.w(context, "https://www.sofascore.com/privacy-policy");
                } else if (c77Var.equals(u67.a)) {
                    zic.P(context, R.string.delete_fantasy_team_title, R.string.delete_your_fantasy_team_text, R.string.delete_team, new qo6(r77Var, 11), 32);
                } else {
                    r77Var.u(c77Var);
                }
                return Unit.a;
            case 7:
                ComponentActivity componentActivity = (ComponentActivity) obj5;
                Function1 function1 = (Function1) obj9;
                k7d k7dVar = (k7d) obj8;
                et8 et8Var = (et8) obj7;
                Function1 function12 = (Function1) obj6;
                h7d h7dVar = (h7d) obj;
                h7dVar.getClass();
                tc3 tc3Var = new tc3(995011249, new c61(i2, componentActivity, function1, k7dVar), true);
                lm5 lm5Var = lm5.a;
                lm5Var.getClass();
                km5 km5Var = km5.a;
                i4k h0 = s02.h0(300, 0, null, 6);
                w8d w8dVar = new w8d(km5Var, h0, false ? 1 : 0);
                w8d w8dVar2 = new w8d(km5Var, h0, true ? 1 : 0);
                w8d w8dVar3 = new w8d(km5Var, h0, i3);
                w8d w8dVar4 = new w8d(km5Var, h0, i4);
                fuf fufVar = duf.a;
                h5a.F(h7dVar, fufVar.getOrCreateKotlinClass(FantasyOnboardingStepsNavigation.SelectCompetition.class), lm5Var, km5Var, w8dVar, w8dVar2, w8dVar3, w8dVar4, tc3Var);
                tc3 tc3Var2 = new tc3(-205912934, new nlj(componentActivity, function1, et8Var, k7dVar, 4), true);
                i4k h02 = s02.h0(300, 0, null, 6);
                h5a.F(h7dVar, fufVar.getOrCreateKotlinClass(FantasyOnboardingStepsNavigation.CreateTeam.class), lm5Var, km5Var, new w8d(km5Var, h02, false ? 1 : 0), new w8d(km5Var, h02, true ? 1 : 0), new w8d(km5Var, h02, 2), new w8d(km5Var, h02, 3), tc3Var2);
                tc3 tc3Var3 = new tc3(-72326023, new nlj(componentActivity, function1, k7dVar, function12, 5), true);
                i4k h03 = s02.h0(300, 0, null, 6);
                h5a.F(h7dVar, fufVar.getOrCreateKotlinClass(FantasyOnboardingStepsNavigation.NameTeam.class), lm5Var, km5Var, new w8d(km5Var, h03, false ? 1 : 0), new w8d(km5Var, h03, true ? 1 : 0), new w8d(km5Var, h03, 2), new w8d(km5Var, h03, 3), tc3Var3);
                tc3 tc3Var4 = new tc3(61260888, new qb7(function1, function12, false ? 1 : 0), true);
                i4k h04 = s02.h0(300, 0, null, 6);
                h5a.F(h7dVar, fufVar.getOrCreateKotlinClass(FantasyOnboardingStepsNavigation.JoinLeague.class), lm5Var, km5Var, new w8d(km5Var, h04, false ? 1 : 0), new w8d(km5Var, h04, true ? 1 : 0), new w8d(km5Var, h04, 2), new w8d(km5Var, h04, 3), tc3Var4);
                return Unit.a;
            case 8:
                return a(obj);
            case 9:
                ((vnb) obj).getClass();
                String string = ((axb) obj8).i().getString(R.string.match_of_the_week_cta_pick);
                string.getClass();
                return new unb(new rwb((mwb) obj5, (Brand) obj9, new ewb(string, (w3f) obj7), new pwb((PartnerOfferType) obj6, "https://www.sofascore.com")));
            case 10:
                qwc qwcVar = (qwc) obj5;
                fsf fsfVar = (fsf) obj9;
                csf csfVar = (csf) obj8;
                svg svgVar = (svg) obj7;
                asf asfVar = (asf) obj6;
                float floatValue = ((Float) obj).floatValue();
                mwc o = qwc.o(qwcVar.g);
                if (o != null) {
                    fp4 fp4Var = (fp4) qwcVar.e;
                    long j = o.b;
                    long j2 = o.a;
                    ((xmk) fp4Var.b).a(j, Float.intBitsToFloat((int) (j2 >> 32)));
                    ((xmk) fp4Var.c).a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
                    mwc a = ((mwc) fsfVar.a).a(o);
                    fsfVar.a = a;
                    csfVar.a = svgVar.i(svgVar.e(a.a));
                    asfVar.a = !aik.W(r2 - floatValue);
                }
                return Boolean.valueOf(o != null);
            case 11:
                return b(obj);
            case 12:
                bfc bfcVar = (bfc) obj;
                bfcVar.getClass();
                ((e1d) obj6).setValue(Boolean.TRUE);
                w1a.E((scj) obj5, bfcVar.c);
                ((Function1) obj9).invoke(bfcVar.b);
                wd8.a((wd8) obj8);
                ((e1d) obj7).setValue(Boolean.FALSE);
                return Unit.a;
            case 13:
                return c(obj);
            case 14:
                return d(obj);
            default:
                Context context2 = (Context) obj5;
                qkl qklVar = (qkl) obj9;
                d87 d87Var = (d87) obj8;
                FragmentActivity fragmentActivity = (FragmentActivity) obj7;
                e1d e1dVar = (e1d) obj6;
                eil eilVar = (eil) obj;
                eilVar.getClass();
                if (eilVar instanceof thl) {
                    WorldCupTimelineBottomSheet worldCupTimelineBottomSheet = new WorldCupTimelineBottomSheet();
                    context2.getClass();
                    if (context2 instanceof csk) {
                        context2 = ((csk) context2).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity = context2 instanceof AppCompatActivity ? (AppCompatActivity) context2 : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(worldCupTimelineBottomSheet, appCompatActivity, r3, i4));
                    }
                    qklVar.getClass();
                    xw3.L(un0.z(qklVar), null, null, new kkl(qklVar, r3, true ? 1 : 0), 3);
                    Unit unit = Unit.a;
                } else if (eilVar instanceof zgl) {
                    oil oilVar = (oil) qklVar.l().a();
                    if (oilVar != null && (ielVar5 = oilVar.a) != null) {
                        a99.A(LeagueActivity.h0, context2, Integer.valueOf(ielVar5.a), 0, null, y4b.d, null, null, 4056);
                        Unit unit2 = Unit.a;
                    }
                } else if (eilVar instanceof ygl) {
                    oil oilVar2 = (oil) qklVar.l().a();
                    if (oilVar2 != null && (ielVar4 = oilVar2.a) != null) {
                        a99.A(LeagueActivity.h0, context2, Integer.valueOf(ielVar4.a), 0, null, y4b.f, null, null, 4056);
                        Unit unit3 = Unit.a;
                    }
                } else if (eilVar instanceof ahl) {
                    oil oilVar3 = (oil) qklVar.l().a();
                    if (oilVar3 != null && (ielVar3 = oilVar3.a) != null) {
                        a99.A(LeagueActivity.h0, context2, Integer.valueOf(ielVar3.a), 0, null, y4b.e, null, ((ahl) eilVar).a, 2008);
                        Unit unit4 = Unit.a;
                    }
                } else if (eilVar instanceof qhl) {
                    int i6 = TeamActivity.Z;
                    jle.r(context2, ((qhl) eilVar).a, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    Unit unit5 = Unit.a;
                } else if (eilVar instanceof nhl) {
                    oil oilVar4 = (oil) qklVar.l().a();
                    if (oilVar4 != null && (ielVar2 = oilVar4.a) != null) {
                        a99.A(LeagueActivity.h0, context2, Integer.valueOf(ielVar2.a), 0, null, y4b.h, null, null, 4056);
                        Unit unit6 = Unit.a;
                    }
                } else if (eilVar instanceof mhl) {
                    int i7 = TeamActivity.Z;
                    jle.r(context2, ((mhl) eilVar).a, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    Unit unit7 = Unit.a;
                } else if (eilVar instanceof qgl) {
                    nv.g0(context2, yu.NEWS, null, "featured_news", "featured", null);
                    int i8 = TopNewsActivity.O;
                    dff.i(context2, null, 18);
                    Unit unit8 = Unit.a;
                } else if (eilVar instanceof pgl) {
                    yu yuVar = yu.NEWS;
                    pgl pglVar = (pgl) eilVar;
                    int i9 = pglVar.a;
                    nv.g0(context2, yuVar, Integer.valueOf(i9), "featured_news", "featured", pglVar.b);
                    int i10 = TopNewsActivity.O;
                    dff.f(context2, Integer.valueOf(i9), 16, true, "featured_news");
                    Unit unit9 = Unit.a;
                } else if (eilVar instanceof wgl) {
                    nv.A(context2, "open_fantasy", "featured_tournament");
                    if (!((Boolean) ((eoh) d87Var.d).getValue()).booleanValue()) {
                        d87Var.a(true);
                        xw3.L(d87Var.b, null, null, new d17(d87Var, r3, 5), 3);
                    }
                    Unit unit10 = Unit.a;
                } else if (eilVar instanceof tgl) {
                    nv.z0(context2, kv.CLICK, "open_dream_team_picker", "featured_tournament");
                    p4h.w(context2, "https://www.sofascore.com/web-view/squad-builder/world-cup");
                    Unit unit11 = Unit.a;
                } else if (eilVar instanceof rhl) {
                    int i11 = TeamActivity.Z;
                    int i12 = ((rhl) eilVar).a;
                    t4j t4jVar = t4j.e;
                    oil oilVar5 = (oil) qklVar.l().a();
                    if (oilVar5 != null && (ielVar = oilVar5.a) != null) {
                        num = Integer.valueOf(ielVar.a);
                    }
                    jle.r(context2, i12, t4jVar, num, null, 104);
                    Unit unit12 = Unit.a;
                } else if (eilVar instanceof ugl) {
                    wxf wxfVar = EventActivity.h0;
                    wxf.B(context2, ((ugl) eilVar).a, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    Unit unit13 = Unit.a;
                } else if (eilVar instanceof vgl) {
                    wxf wxfVar2 = EventActivity.h0;
                    wxf.B(context2, ((vgl) eilVar).a, rd6.j, null, null, null, 120);
                    Unit unit14 = Unit.a;
                } else if (eilVar instanceof xgl) {
                    xgl xglVar = (xgl) eilVar;
                    nv.g0(context2, yu.HIGHLIGHTS, Integer.valueOf(xglVar.a), "featured_matchday_highlights", "featured", "youtube");
                    int i13 = MediaHighlightsActivity.a0;
                    q1f.u(context2, xglVar.a, null, xglVar.d, xglVar.c, true, null, false, Integer.valueOf(xglVar.b), Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE);
                    Unit unit15 = Unit.a;
                } else if (eilVar instanceof xhl) {
                    xhl xhlVar = (xhl) eilVar;
                    nv.g0(context2, yu.HIGHLIGHTS, Integer.valueOf(xhlVar.a), "featured_videos", "featured", "youtube");
                    int i14 = MediaHighlightsActivity.a0;
                    q1f.u(context2, xhlVar.a, null, xhlVar.c, xhlVar.b, true, null, false, null, 832);
                    Unit unit16 = Unit.a;
                } else if (eilVar instanceof fhl) {
                    WorldCupTeamPickerBottomSheet worldCupTeamPickerBottomSheet = new WorldCupTeamPickerBottomSheet();
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("is_retarget", false);
                    worldCupTeamPickerBottomSheet.setArguments(bundle);
                    context2.getClass();
                    if (context2 instanceof csk) {
                        context2 = ((csk) context2).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity2 = context2 instanceof AppCompatActivity ? (AppCompatActivity) context2 : null;
                    if (appCompatActivity2 != null) {
                        wca.x(appCompatActivity2.getLifecycle()).b(new r1(worldCupTeamPickerBottomSheet, appCompatActivity2, r3, i4));
                    }
                    Unit unit17 = Unit.a;
                } else if (eilVar instanceof rgl) {
                    qklVar.getClass();
                    context2.getClass();
                    qklVar.x.getClass();
                    kgl.e(context2);
                    Unit unit18 = Unit.a;
                } else if (eilVar instanceof lhl) {
                    lhl lhlVar = (lhl) eilVar;
                    int i15 = lhlVar.c;
                    if (i15 == 851) {
                        int i16 = PlayerActivity.Z;
                        jle.q(context2, lhlVar.b, i15, null, zxe.e, false, null, null, 488);
                    } else {
                        int i17 = TeamActivity.Z;
                        jle.r(context2, lhlVar.a, t4j.g, Integer.valueOf(i15), lhlVar.d, 40);
                    }
                    Unit unit19 = Unit.a;
                } else if (eilVar instanceof sgl) {
                    SofascoreRatingBottomSheetDialog e = v9f.e(gvh.d, null, null, Sports.FOOTBALL, null, 22);
                    context2.getClass();
                    if (context2 instanceof csk) {
                        context2 = ((csk) context2).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity3 = context2 instanceof AppCompatActivity ? (AppCompatActivity) context2 : null;
                    if (appCompatActivity3 != null) {
                        wca.x(appCompatActivity3.getLifecycle()).b(new r1(e, appCompatActivity3, r3, i4));
                    }
                    Unit unit20 = Unit.a;
                } else if (eilVar instanceof hhl) {
                    SofascoreRatingBottomSheetDialog e2 = v9f.e(gvh.c, null, null, Sports.FOOTBALL, null, 22);
                    context2.getClass();
                    if (context2 instanceof csk) {
                        context2 = ((csk) context2).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity4 = context2 instanceof AppCompatActivity ? (AppCompatActivity) context2 : null;
                    if (appCompatActivity4 != null) {
                        wca.x(appCompatActivity4.getLifecycle()).b(new r1(e2, appCompatActivity4, r3, i4));
                    }
                    Unit unit21 = Unit.a;
                } else if (eilVar instanceof ghl) {
                    int i18 = PlayerActivity.Z;
                    jle.q(context2, ((ghl) eilVar).a, 0, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                    Unit unit22 = Unit.a;
                } else if (eilVar instanceof khl) {
                    int i19 = PlayerActivity.Z;
                    jle.q(context2, ((khl) eilVar).a, 16, 58210, zxe.d, false, null, null, 480);
                    Unit unit23 = Unit.a;
                } else if (eilVar instanceof ihl) {
                    int i20 = PlayerActivity.Z;
                    jle.q(context2, ((ihl) eilVar).a, 16, 58210, zxe.h, false, null, null, 480);
                    Unit unit24 = Unit.a;
                } else if (eilVar instanceof shl) {
                    int i21 = TeamActivity.Z;
                    jle.r(context2, ((shl) eilVar).a, t4j.h, 16, null, 104);
                    Unit unit25 = Unit.a;
                } else if (eilVar instanceof chl) {
                    oil oilVar6 = (oil) ((vnb) e1dVar.getValue()).a();
                    if (oilVar6 != null && (gv9Var2 = oilVar6.q) != null) {
                        Iterator it = gv9Var2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj4 = it.next();
                                if (((rxb) obj4).a.getId() == ((chl) eilVar).a) {
                                }
                            } else {
                                obj4 = null;
                            }
                        }
                        rxb rxbVar = (rxb) obj4;
                        if (rxbVar != null) {
                            highlight = rxbVar.c;
                            if (highlight != null && fragmentActivity != null) {
                                mqi mqiVar = qhi.a;
                                boolean z = qhi.c(highlight.getUrl(), false) == null || qhi.c(highlight.getUrl(), true) != null;
                                boolean z2 = highlight.getMediaType() != 6;
                                yu yuVar2 = yu.HIGHLIGHTS;
                                int id = highlight.getId();
                                if (!highlight.isDirectStream()) {
                                    zu[] zuVarArr = zu.a;
                                    str = "directStream";
                                } else if (z) {
                                    zu[] zuVarArr2 = zu.a;
                                    str = "youtube";
                                } else {
                                    str = U3.i.I0;
                                }
                                nv.g0(context2, yuVar2, Integer.valueOf(id), "featured_matchday_highlights", "featured", str);
                                uaa.y(fragmentActivity, 0, highlight, "WC26 - matchday highlights", (z || !z2 || y05.a(context2)) ? false : true);
                                int id2 = highlight.getId();
                                qklVar.getClass();
                                xw3.L(un0.z(qklVar), null, null, new xjl(qklVar, id2, r3, i3), 3);
                            }
                            Unit unit26 = Unit.a;
                        }
                    }
                    highlight = null;
                    if (highlight != null) {
                        mqi mqiVar2 = qhi.a;
                        if (qhi.c(highlight.getUrl(), false) == null) {
                        }
                        if (highlight.getMediaType() != 6) {
                        }
                        yu yuVar22 = yu.HIGHLIGHTS;
                        int id3 = highlight.getId();
                        if (!highlight.isDirectStream()) {
                        }
                        nv.g0(context2, yuVar22, Integer.valueOf(id3), "featured_matchday_highlights", "featured", str);
                        uaa.y(fragmentActivity, 0, highlight, "WC26 - matchday highlights", (z || !z2 || y05.a(context2)) ? false : true);
                        int id22 = highlight.getId();
                        qklVar.getClass();
                        xw3.L(un0.z(qklVar), null, null, new xjl(qklVar, id22, r3, i3), 3);
                    }
                    Unit unit262 = Unit.a;
                } else if (eilVar instanceof dhl) {
                    dhl dhlVar = (dhl) eilVar;
                    Event event = dhlVar.a;
                    Team team = dhlVar.c;
                    if (team == null || !Intrinsics.c(event.getHasEventPlayerStatistics(), Boolean.TRUE)) {
                        int i22 = PlayerActivity.Z;
                        jle.q(context2, dhlVar.b.getId(), 0, null, null, false, null, null, IronSourceError.ERROR_CODE_INIT_FAILED);
                    } else {
                        PlayerEventStatisticsModal c = jpe.c(f8h.i(event, dhlVar.b, team, ok3.u(team.getId(), event), dhlVar.d, 96), "featured_matchday_highlights");
                        context2.getClass();
                        if (context2 instanceof csk) {
                            context2 = ((csk) context2).getBaseContext();
                        }
                        AppCompatActivity appCompatActivity5 = context2 instanceof AppCompatActivity ? (AppCompatActivity) context2 : null;
                        if (appCompatActivity5 != null) {
                            me4.n(c, appCompatActivity5, null, wca.x(appCompatActivity5.getLifecycle()));
                        }
                    }
                    Unit unit27 = Unit.a;
                } else if (eilVar instanceof ehl) {
                    ehl ehlVar = (ehl) eilVar;
                    PlayerEventStatisticsModal c2 = jpe.c(f8h.i(ehlVar.a, ehlVar.b, ehlVar.c, ehlVar.e, Double.valueOf(ehlVar.d), 32), "featured_top_performers");
                    context2.getClass();
                    if (context2 instanceof csk) {
                        context2 = ((csk) context2).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity6 = context2 instanceof AppCompatActivity ? (AppCompatActivity) context2 : null;
                    if (appCompatActivity6 != null) {
                        me4.n(c2, appCompatActivity6, null, wca.x(appCompatActivity6.getLifecycle()));
                    }
                    Unit unit28 = Unit.a;
                } else if (eilVar instanceof whl) {
                    oil oilVar7 = (oil) ((vnb) e1dVar.getValue()).a();
                    iel ielVar6 = oilVar7 != null ? oilVar7.a : null;
                    oil oilVar8 = (oil) ((vnb) e1dVar.getValue()).a();
                    if (oilVar8 == null || (xxiVar = oilVar8.w) == null) {
                        totrSharePayload = null;
                    } else {
                        String str2 = ielVar6 != null ? ielVar6.b : null;
                        String str3 = str2 == null ? "" : str2;
                        String str4 = ielVar6 != null ? ielVar6.f : null;
                        String str5 = str4 == null ? "" : str4;
                        String str6 = ielVar6 != null ? ielVar6.g : null;
                        totrSharePayload = i2a.K(xxiVar, str3, true, 58210, str5, str6 == null ? "" : str6);
                    }
                    if (totrSharePayload != null) {
                        nv.u0(context2, Integer.valueOf(totrSharePayload.e), "team_of_the_period");
                        TeamOfTheRoundShareBottomSheet teamOfTheRoundShareBottomSheet = new TeamOfTheRoundShareBottomSheet();
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("ARG_PAYLOAD", totrSharePayload);
                        teamOfTheRoundShareBottomSheet.setArguments(bundle2);
                        if (context2 instanceof csk) {
                            context2 = ((csk) context2).getBaseContext();
                        }
                        AppCompatActivity appCompatActivity7 = context2 instanceof AppCompatActivity ? (AppCompatActivity) context2 : null;
                        if (appCompatActivity7 != null) {
                            wca.x(appCompatActivity7.getLifecycle()).b(new r1(teamOfTheRoundShareBottomSheet, appCompatActivity7, r3, i4));
                        }
                    }
                    Unit unit29 = Unit.a;
                } else if (eilVar instanceof uhl) {
                    oil oilVar9 = (oil) ((vnb) e1dVar.getValue()).a();
                    xxi xxiVar2 = oilVar9 != null ? oilVar9.w : null;
                    TournamentRoundWrapper tournamentRoundWrapper = xxiVar2 != null ? xxiVar2.d : null;
                    if (tournamentRoundWrapper != null) {
                        Iterator it2 = xxiVar2.c.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj3 = it2.next();
                                if (((k7g) obj3).a.getId() == tournamentRoundWrapper.getId()) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        k7g k7gVar = (k7g) obj3;
                        String str7 = k7gVar != null ? k7gVar.b : null;
                        String str8 = str7 == null ? "" : str7;
                        int i23 = ChatActivity.Z;
                        int id4 = tournamentRoundWrapper.getId();
                        rqj.a.getClass();
                        String a2 = pff.a(tournamentRoundWrapper, true);
                        nn6 nn6Var = xxiVar2.k;
                        TeamOfTheRoundChatInterface teamOfTheRoundChatInterface = new TeamOfTheRoundChatInterface(16, 58210, id4, str8, a2, nn6Var != null ? nn6Var.c : null, nn6Var != null ? nn6Var.b : null, nn6Var != null ? Integer.valueOf(nn6Var.a) : null);
                        tu[] tuVarArr = tu.a;
                        uic.w(context2, teamOfTheRoundChatInterface, "team_of_the_round", 56);
                    }
                    Unit unit30 = Unit.a;
                } else if (eilVar instanceof vhl) {
                    oil oilVar10 = (oil) ((vnb) e1dVar.getValue()).a();
                    xxi xxiVar3 = oilVar10 != null ? oilVar10.w : null;
                    gv9 gv9Var3 = xxiVar3 != null ? xxiVar3.m : null;
                    if (gv9Var3 != null) {
                        Iterator it3 = gv9Var3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj2 = it3.next();
                                if (((xoe) obj2).a.getId() == ((vhl) eilVar).a) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        xoeVar = (xoe) obj2;
                    } else {
                        xoeVar = null;
                    }
                    Event event2 = xoeVar != null ? xoeVar.b : null;
                    if (xoeVar == null || event2 == null || xoeVar.e == null) {
                        int i24 = PlayerActivity.Z;
                        jle.q(context2, ((vhl) eilVar).a, 16, null, null, false, null, null, PglCryptUtils.BASE64_FAILED);
                    } else {
                        Integer valueOf = Integer.valueOf(event2.getId());
                        int i25 = ((vhl) eilVar).a;
                        String type = event2.getStatus().getType();
                        Boolean hasXg = event2.getHasXg();
                        long startTimestamp = event2.getStartTimestamp();
                        gv9Var3.getClass();
                        PlayerEventStatisticsModal playerEventStatisticsModal = new PlayerEventStatisticsModal();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj10 : gv9Var3) {
                            if (!((xoe) obj10).a.getDisabled()) {
                                arrayList.add(obj10);
                            }
                        }
                        playerEventStatisticsModal.setArguments(fz8.C(fz8.G("DATA", new hzd(valueOf, null, arrayList, Sports.FOOTBALL, false, true, i25, type, 16, hasXg, startTimestamp, null, null)), fz8.H("ANALYTICS_LOCATION", "team_of_the_round")));
                        context2.getClass();
                        if (context2 instanceof csk) {
                            context2 = ((csk) context2).getBaseContext();
                        }
                        AppCompatActivity appCompatActivity8 = context2 instanceof AppCompatActivity ? (AppCompatActivity) context2 : null;
                        if (appCompatActivity8 != null) {
                            me4.n(playerEventStatisticsModal, appCompatActivity8, null, wca.x(appCompatActivity8.getLifecycle()));
                        }
                    }
                    Unit unit31 = Unit.a;
                } else if (eilVar instanceof phl) {
                    a99.A(LeagueActivity.h0, context2, 16, 0, 58210, y4b.g, null, null, 4048);
                    Unit unit32 = Unit.a;
                } else if (eilVar instanceof bhl) {
                    a99.A(LeagueActivity.h0, context2, 16, 0, 58210, y4b.g, null, null, 4048);
                    Unit unit33 = Unit.a;
                } else if (eilVar.equals(ohl.a)) {
                    FragmentActivity O = hkg.O(context2);
                    if (O != null) {
                        fp8 k = O.k();
                        ut7 ut7Var = ut7.a;
                        FeatureWalkthroughFullScreenDialog featureWalkthroughFullScreenDialog = new FeatureWalkthroughFullScreenDialog();
                        featureWalkthroughFullScreenDialog.setArguments(hz8.E(new Pair("TYPE", ut7.e)));
                        featureWalkthroughFullScreenDialog.p(k, "FeatureWalkthroughFullScreenDialog");
                        Unit unit34 = Unit.a;
                    }
                } else if (eilVar instanceof jhl) {
                    int i26 = PlayerActivity.Z;
                    jle.q(context2, ((jhl) eilVar).a, 0, null, zxe.f, false, null, wk2.j, 236);
                    Unit unit35 = Unit.a;
                } else if (eilVar instanceof mgl) {
                    oil oilVar11 = (oil) qklVar.l().a();
                    if (oilVar11 != null && (gv9Var = oilVar11.x) != null) {
                        if (gv9Var.isEmpty()) {
                            gv9Var = null;
                        }
                        if (gv9Var != null) {
                            int i27 = ((mgl) eilVar).a;
                            WorldCupLastDanceUiModel worldCupLastDanceUiModel = (WorldCupLastDanceUiModel) CollectionsKt.a0(i27, gv9Var);
                            nv.u0(context2, Integer.valueOf(worldCupLastDanceUiModel != null ? worldCupLastDanceUiModel.a : 0), "last_dance");
                            WorldCupLastDanceShareBottomSheet worldCupLastDanceShareBottomSheet = new WorldCupLastDanceShareBottomSheet();
                            Bundle bundle3 = new Bundle();
                            bundle3.putParcelableArrayList("ARG_ITEMS", new ArrayList<>(gv9Var));
                            bundle3.putInt("ARG_INITIAL_PAGE", i27);
                            worldCupLastDanceShareBottomSheet.setArguments(bundle3);
                            if (context2 instanceof csk) {
                                context2 = ((csk) context2).getBaseContext();
                            }
                            AppCompatActivity appCompatActivity9 = context2 instanceof AppCompatActivity ? (AppCompatActivity) context2 : null;
                            if (appCompatActivity9 != null) {
                                wca.x(appCompatActivity9.getLifecycle()).b(new r1(worldCupLastDanceShareBottomSheet, appCompatActivity9, r3, i4));
                            }
                            Unit unit36 = Unit.a;
                        }
                    }
                } else {
                    qklVar.H(eilVar);
                    Unit unit37 = Unit.a;
                }
                return Unit.a;
        }
    }

    public /* synthetic */ ke(ku3 ku3Var, e1d e1dVar, ksa ksaVar, IntRange intRange, lg2 lg2Var) {
        this.a = 4;
        this.b = ku3Var;
        this.f = e1dVar;
        this.c = ksaVar;
        this.d = intRange;
        this.e = lg2Var;
    }

    public /* synthetic */ ke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ ke(Object obj, Set set, Set set2, e1d e1dVar, e1d e1dVar2) {
        this.a = 5;
        this.b = obj;
        this.c = set;
        this.d = set2;
        this.f = e1dVar;
        this.e = e1dVar2;
    }
}
