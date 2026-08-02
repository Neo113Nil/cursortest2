package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.util.Base64;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.b;
import com.facebook.c0;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ilrd.e;
import com.moloco.sdk.internal.ilrd.l;
import com.moloco.sdk.internal.ilrd.n;
import com.moloco.sdk.internal.j0;
import com.moloco.sdk.internal.k0;
import com.moloco.sdk.internal.ortb.d;
import com.moloco.sdk.internal.utils.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r;
import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.Colors;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.AiAnalystDemoEvent;
import com.sofascore.model.mvvm.model.Description;
import com.sofascore.model.mvvm.model.StandingsTable;
import com.sofascore.model.mvvm.model.StandingsTableRow;
import com.sofascore.model.newNetwork.FootballShotmapItem;
import com.sofascore.model.newNetwork.StandingsResponse;
import com.sofascore.results.R;
import com.sofascore.results.ads.UpgradeSofascoreActivity;
import com.sofascore.results.ads.ui.SofascoreAnalystDemoEventBottomSheet;
import com.sofascore.results.event.details.view.odds.FeaturedOddsView;
import com.sofascore.results.profile.UserProfileActivity;
import com.sofascore.results.service.WatchService;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeUserDailyBonusModal;
import com.sofascore.results.weeklyChallenge.predictions.WeeklyPredictionsFragment;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.zip.GZIPInputStream;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class pdk extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pdk(Object obj, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = obj;
        this.t = obj2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.t;
        switch (i) {
            case 0:
                pdk pdkVar = new pdk((UpgradeSofascoreActivity) obj2, rq3Var, 0);
                pdkVar.s = obj;
                return pdkVar;
            case 1:
                pdk pdkVar2 = new pdk((xdk) obj2, rq3Var, 1);
                pdkVar2.s = obj;
                return pdkVar2;
            case 2:
                pdk pdkVar3 = new pdk((bfk) obj2, rq3Var, 2);
                pdkVar3.s = obj;
                return pdkVar3;
            case 3:
                pdk pdkVar4 = new pdk((UserProfileActivity) obj2, rq3Var, 3);
                pdkVar4.s = obj;
                return pdkVar4;
            case 4:
                return new pdk((ComposeView) this.s, (e1d) obj2, rq3Var, 4);
            case 5:
                pdk pdkVar5 = new pdk((agk) obj2, rq3Var, 5);
                pdkVar5.s = obj;
                return pdkVar5;
            case 6:
                return new pdk((WatchService) this.s, (List) obj2, rq3Var, 6);
            case 7:
                pdk pdkVar6 = new pdk((WeeklyChallengeUserDailyBonusModal) obj2, rq3Var, 7);
                pdkVar6.s = obj;
                return pdkVar6;
            case 8:
                pdk pdkVar7 = new pdk((WeeklyPredictionsFragment) obj2, rq3Var, 8);
                pdkVar7.s = obj;
                return pdkVar7;
            case 9:
                pdk pdkVar8 = new pdk((udl) obj2, rq3Var, 9);
                pdkVar8.s = obj;
                return pdkVar8;
            case 10:
                pdk pdkVar9 = new pdk((qkl) obj2, rq3Var, 10);
                pdkVar9.s = obj;
                return pdkVar9;
            case 11:
                return new pdk((StandingsResponse) this.s, (qkl) obj2, rq3Var, 11);
            case 12:
                return new pdk((String) this.s, (String) obj2, rq3Var, 12);
            case 13:
                return new pdk((g6b) this.s, (e) obj2, rq3Var, 13);
            case 14:
                return new pdk((e) this.s, (String) obj2, rq3Var, 14);
            case 15:
                pdk pdkVar10 = new pdk((n) obj2, rq3Var, 15);
                pdkVar10.s = obj;
                return pdkVar10;
            case 16:
                return new pdk((d) this.s, (String) obj2, rq3Var, 16);
            case 17:
                return new pdk((b) this.s, (String) obj2, rq3Var, 17);
            case 18:
                pdk pdkVar11 = new pdk((f) obj2, rq3Var, 18);
                pdkVar11.s = obj;
                return pdkVar11;
            case 19:
                return new pdk((List) this.s, (k) obj2, rq3Var, 19);
            case 20:
                return new pdk((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n) this.s, (a) obj2, rq3Var, 20);
            case 21:
                pdk pdkVar12 = new pdk((o) obj2, rq3Var, 21);
                pdkVar12.s = obj;
                return pdkVar12;
            case 22:
                pdk pdkVar13 = new pdk((c40) obj2, rq3Var, 22);
                pdkVar13.s = obj;
                return pdkVar13;
            case 23:
                return new pdk((c0) this.s, (String) obj2, rq3Var, 23);
            case 24:
                return new pdk((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f) this.s, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e) obj2, rq3Var, 24);
            case 25:
                return new pdk((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.d) this.s, (String) obj2, rq3Var, 25);
            case 26:
                pdk pdkVar14 = new pdk((com.appsflyer.f) obj2, rq3Var, 26);
                pdkVar14.s = obj;
                return pdkVar14;
            case 27:
                pdk pdkVar15 = new pdk((u) obj2, rq3Var, 27);
                pdkVar15.s = obj;
                return pdkVar15;
            case 28:
                return new pdk((j) this.s, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u) obj2, rq3Var, 28);
            default:
                return new pdk((fsf) this.s, (i0) obj2, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
        }
        return ((pdk) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (kotlin.text.StringsKt.J(r0, "mraid.js", true) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (kotlin.text.StringsKt.J(r0, "mraid.js", true) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if (kotlin.text.StringsKt.J(r0, "mraid.js", true) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        r10 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v18 */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fdi fdiVar;
        Object value;
        old oldVar;
        Integer num;
        Integer valueOf;
        ByteArrayInputStream byteArrayInputStream;
        GZIPInputStream gZIPInputStream;
        StringBuilder sb;
        byte[] bArr;
        int read;
        c cVar;
        String str;
        int i = 3;
        r8 = true;
        boolean z = true;
        int i2 = 0;
        String str2 = 0;
        r10 = null;
        r10 = null;
        r10 = null;
        String str3 = null;
        r10 = null;
        String str4 = null;
        str2 = 0;
        switch (this.r) {
            case 0:
                AiAnalystDemoEvent aiAnalystDemoEvent = (AiAnalystDemoEvent) this.s;
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                if (aiAnalystDemoEvent != null) {
                    UpgradeSofascoreActivity upgradeSofascoreActivity = (UpgradeSofascoreActivity) this.t;
                    SofascoreAnalystDemoEventBottomSheet sofascoreAnalystDemoEventBottomSheet = new SofascoreAnalystDemoEventBottomSheet();
                    sofascoreAnalystDemoEventBottomSheet.setArguments(fz8.C(fz8.F("ANALYST_DEMO_EVENT", aiAnalystDemoEvent), fz8.H("REFERRAL_TYPE", null)));
                    UpgradeSofascoreActivity upgradeSofascoreActivity2 = upgradeSofascoreActivity instanceof AppCompatActivity ? upgradeSofascoreActivity : null;
                    if (upgradeSofascoreActivity2 != null) {
                        wca.x(upgradeSofascoreActivity2.getLifecycle()).b(new r1(sofascoreAnalystDemoEventBottomSheet, upgradeSofascoreActivity2, str2, i));
                    }
                }
                return Unit.a;
            case 1:
                Set set = (Set) this.s;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                if (set != null) {
                    xdk xdkVar = (xdk) this.t;
                    Set set2 = set;
                    ArrayList arrayList = new ArrayList(k13.r(set2, 10));
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new gli((eli) it.next(), true));
                    }
                    LinkedHashSet V0 = CollectionsKt.V0(arrayList);
                    UserAccount b = xdkVar.e.b();
                    if (Intrinsics.c(b.getHasPremium(), Boolean.TRUE)) {
                        if (!V0.isEmpty()) {
                            Iterator it2 = V0.iterator();
                            while (it2.hasNext()) {
                                if (((gli) it2.next()).a == eli.AI) {
                                }
                            }
                        }
                        V0.add(new gli(eli.AI, false));
                    }
                    if (!jca.G(b)) {
                        if (!V0.isEmpty()) {
                            Iterator it3 = V0.iterator();
                            while (it3.hasNext()) {
                                if (((gli) it3.next()).a == eli.ADS) {
                                }
                            }
                        }
                        V0.add(new gli(eli.ADS, false));
                    }
                    if (!V0.isEmpty()) {
                        Iterator it4 = V0.iterator();
                        while (it4.hasNext()) {
                            if (((gli) it4.next()).a == eli.AI) {
                                fdiVar = xdkVar.h;
                                do {
                                    value = fdiVar.getValue();
                                } while (!fdiVar.k(value, V0));
                            }
                        }
                    }
                    xw3.L(un0.z(xdkVar), null, null, new vki(xdkVar, (rq3) str2, 26), 3);
                    fdiVar = xdkVar.h;
                    do {
                        value = fdiVar.getValue();
                    } while (!fdiVar.k(value, V0));
                }
                return Unit.a;
            case 2:
                UserAccount userAccount = (UserAccount) this.s;
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                ((bfk) this.t).b = userAccount;
                return Unit.a;
            case 3:
                AiAnalystDemoEvent aiAnalystDemoEvent2 = (AiAnalystDemoEvent) this.s;
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                if (aiAnalystDemoEvent2 != null) {
                    UserProfileActivity userProfileActivity = (UserProfileActivity) this.t;
                    int i3 = UserProfileActivity.S;
                    String str5 = userProfileActivity.R().t;
                    SofascoreAnalystDemoEventBottomSheet sofascoreAnalystDemoEventBottomSheet2 = new SofascoreAnalystDemoEventBottomSheet();
                    sofascoreAnalystDemoEventBottomSheet2.setArguments(fz8.C(fz8.F("ANALYST_DEMO_EVENT", aiAnalystDemoEvent2), fz8.H("REFERRAL_TYPE", str5)));
                    UserProfileActivity userProfileActivity2 = userProfileActivity instanceof AppCompatActivity ? userProfileActivity : null;
                    if (userProfileActivity2 != null) {
                        wca.x(userProfileActivity2.getLifecycle()).b(new r1(sofascoreAnalystDemoEventBottomSheet2, userProfileActivity2, str2, i));
                    }
                }
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                ComposeView composeView = (ComposeView) this.s;
                e1d e1dVar = (e1d) this.t;
                int i4 = UserProfileActivity.S;
                composeView.setVisibility(((ush) e1dVar.getValue()).a ? 0 : 8);
                return Unit.a;
            case 5:
                ku3 ku3Var = (ku3) this.s;
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                xw3.L(ku3Var, null, null, new yfk((agk) this.t, str2, i), 3);
                return Unit.a;
            case 6:
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                yf2 yf2Var = ((WatchService) this.s).n;
                if (yf2Var != null) {
                    yf2Var.a((List) this.t);
                }
                return Unit.a;
            case 7:
                WeeklyChallengeUserDailyBonusModal weeklyChallengeUserDailyBonusModal = (WeeklyChallengeUserDailyBonusModal) this.t;
                xmd xmdVar = (xmd) this.s;
                lu3 lu3Var8 = lu3.a;
                y6a.M(obj);
                if (xmdVar != null) {
                    ((FeaturedOddsView) weeklyChallengeUserDailyBonusModal.E.getValue()).n(xmdVar);
                    and andVar = (and) CollectionsKt.firstOrNull(xmdVar.a);
                    if (andVar == null || (oldVar = andVar.a) == null) {
                        return Unit.a;
                    }
                    xz0 xz0Var = weeklyChallengeUserDailyBonusModal.C;
                    if (xz0Var == null) {
                        Intrinsics.i("dialogBinding");
                        throw null;
                    }
                    TextView textView = xz0Var.b;
                    Context requireContext = weeklyChallengeUserDailyBonusModal.requireContext();
                    requireContext.getClass();
                    textView.setText(rld.f(requireContext, Intrinsics.c(oldVar.e, Boolean.TRUE)));
                    if (oldVar.c) {
                        yld yldVar = oldVar.a;
                        Colors colors = yldVar.b;
                        String primary = colors != null ? colors.getPrimary() : null;
                        Integer num2 = (primary == null || primary.length() == 0) ? null : new Integer(Color.parseColor(colors.getPrimary()));
                        xz0 xz0Var2 = weeklyChallengeUserDailyBonusModal.C;
                        if (xz0Var2 == null) {
                            Intrinsics.i("dialogBinding");
                            throw null;
                        }
                        ImageView imageView = xz0Var2.c;
                        imageView.setVisibility(0);
                        as9.k(imageView, yldVar.a);
                        if (num2 != null) {
                            v9g.K(imageView.getBackground().mutate(), num2.intValue());
                        }
                        imageView.setOnClickListener(new r2(imageView, yldVar, xmdVar, oldVar, 6));
                    }
                }
                return Unit.a;
            case 8:
                WeeklyPredictionsFragment weeklyPredictionsFragment = (WeeklyPredictionsFragment) this.t;
                p33 p33Var = (p33) this.s;
                lu3 lu3Var9 = lu3.a;
                y6a.M(obj);
                r8 = ((p33Var.a instanceof pfb) && weeklyPredictionsFragment.C().getItemCount() == 0) ? 1 : 0;
                ConstraintLayout constraintLayout = weeklyPredictionsFragment.x;
                if (constraintLayout == null) {
                    krk krkVar = weeklyPredictionsFragment.l;
                    krkVar.getClass();
                    v82 d = v82.d(((oo8) krkVar).b.inflate());
                    iz8.E(d, weeklyPredictionsFragment.requireContext().getDrawable(R.drawable.predictions_1x2));
                    String string = ((m5l) weeklyPredictionsFragment.r.getValue()) == m5l.c ? weeklyPredictionsFragment.getString(R.string.weekly_challenge_finished_empty) : weeklyPredictionsFragment.getString(R.string.weekly_challenge_active_empty);
                    string.getClass();
                    iz8.F(d, string);
                    constraintLayout = (ConstraintLayout) d.b;
                    weeklyPredictionsFragment.x = constraintLayout;
                    constraintLayout.getClass();
                }
                constraintLayout.setVisibility(r8 != 0 ? 0 : 8);
                krk krkVar2 = weeklyPredictionsFragment.l;
                krkVar2.getClass();
                ((oo8) krkVar2).d.setVisibility(r8 == 0 ? 0 : 8);
                return Unit.a;
            case 9:
                ku3 ku3Var2 = (ku3) this.s;
                lu3 lu3Var10 = lu3.a;
                y6a.M(obj);
                udl udlVar = (udl) this.t;
                xw3.L(ku3Var2, null, null, new ndl(udlVar, str2, 4), 3);
                xw3.L(ku3Var2, null, null, new ndl(udlVar, str2, 5), 3);
                xw3.L(ku3Var2, null, null, new ndl(udlVar, str2, 6), 3);
                xw3.L(ku3Var2, null, null, new ndl(udlVar, str2, 7), 3);
                return xw3.L(ku3Var2, null, null, new i3l(udlVar, null), 3);
            case 10:
                rfl rflVar = (rfl) this.s;
                lu3 lu3Var11 = lu3.a;
                y6a.M(obj);
                ((qkl) this.t).n(null, new qdj(rflVar, 22));
                return Unit.a;
            case 11:
                lu3 lu3Var12 = lu3.a;
                y6a.M(obj);
                StandingsResponse standingsResponse = (StandingsResponse) this.s;
                List<StandingsTable> standings = standingsResponse.getStandings();
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it5 = standings.iterator();
                while (it5.hasNext()) {
                    List<StandingsTableRow> rows = ((StandingsTable) it5.next()).getRows();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<T> it6 = rows.iterator();
                    while (it6.hasNext()) {
                        Description promotion = ((StandingsTableRow) it6.next()).getPromotion();
                        Integer num3 = promotion != null ? new Integer(promotion.getId()) : null;
                        if (num3 != null) {
                            arrayList3.add(num3);
                        }
                    }
                    o13.v(arrayList3, arrayList2);
                }
                LinkedHashMap D = ktm.D(CollectionsKt.W0(arrayList2));
                List<StandingsTable> standings2 = standingsResponse.getStandings();
                qkl qklVar = (qkl) this.t;
                int c = sub.c(k13.r(standings2, 10));
                if (c < 16) {
                    c = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                for (StandingsTable standingsTable : standings2) {
                    ArrayList a = y9i.a(Sports.FOOTBALL);
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it7 = a.iterator();
                    while (it7.hasNext()) {
                        Object next = it7.next();
                        if (((t9i) next).d.invoke(CollectionsKt.firstOrNull(standingsTable.getRows())) != null) {
                            arrayList4.add(next);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(k13.r(arrayList4, 10));
                    Iterator it8 = arrayList4.iterator();
                    while (it8.hasNext()) {
                        arrayList5.add(new q9k(((t9i) it8.next()).b(Sports.FOOTBALL)));
                    }
                    pil pilVar = new pil(l6g.W(arrayList5));
                    xbb b2 = kotlin.collections.a.b();
                    b2.add(pilVar);
                    List<StandingsTableRow> rows2 = standingsTable.getRows();
                    ArrayList arrayList6 = new ArrayList(k13.r(rows2, 10));
                    int i5 = 0;
                    for (Object obj2 : rows2) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            kotlin.collections.b.q();
                            throw null;
                        }
                        StandingsTableRow standingsTableRow = (StandingsTableRow) obj2;
                        int id = standingsTableRow.getTeam().getId();
                        String A = tba.A(qklVar.i(), standingsTableRow.getTeam());
                        if (A == null) {
                            A = tba.p(qklVar.i(), standingsTableRow.getTeam());
                        }
                        String str6 = A;
                        ArrayList arrayList7 = new ArrayList(k13.r(arrayList4, 10));
                        Iterator it9 = arrayList4.iterator();
                        while (it9.hasNext()) {
                            Object invoke = ((t9i) it9.next()).d.invoke(standingsTableRow);
                            String obj3 = invoke != null ? invoke.toString() : null;
                            if (obj3 == null) {
                                obj3 = "";
                            }
                            arrayList7.add(obj3);
                        }
                        gv9 W = l6g.W(arrayList7);
                        Description promotion2 = standingsTableRow.getPromotion();
                        if (promotion2 != null) {
                            Integer num4 = (Integer) D.get(new Integer(promotion2.getId()));
                            switch (num4 != null ? num4.intValue() : -1) {
                                case 1:
                                    valueOf = Integer.valueOf(R.color.prom_to_x);
                                    break;
                                case 2:
                                    valueOf = Integer.valueOf(R.color.playoff_for_prom_to_x);
                                    break;
                                case 3:
                                    valueOf = Integer.valueOf(R.color.prom_to_y);
                                    break;
                                case 4:
                                    valueOf = Integer.valueOf(R.color.playoff_for_prom_to_y);
                                    break;
                                case 5:
                                    valueOf = Integer.valueOf(R.color.other_prom_1);
                                    break;
                                case 6:
                                    valueOf = Integer.valueOf(R.color.other_prom_2);
                                    break;
                                case 7:
                                    valueOf = Integer.valueOf(R.color.other_prom_3);
                                    break;
                                case 8:
                                    valueOf = Integer.valueOf(R.color.po_for_releg);
                                    break;
                                case 9:
                                    valueOf = Integer.valueOf(R.color.releg);
                                    break;
                                default:
                                    valueOf = null;
                                    break;
                            }
                            num = valueOf;
                        } else {
                            num = null;
                        }
                        arrayList6.add(new qil(i6, id, str6, W, num));
                        i5 = i6;
                    }
                    b2.addAll(arrayList6);
                    gv9 W2 = l6g.W(kotlin.collections.a.a(b2));
                    String groupName = standingsTable.getTournament().getGroupName();
                    if (groupName == null) {
                        groupName = standingsTable.getName();
                    }
                    linkedHashMap.put(groupName, W2);
                }
                return linkedHashMap;
            case 12:
                lu3 lu3Var13 = lu3.a;
                y6a.M(obj);
                ArrayList arrayList8 = com.moloco.sdk.acm.services.c.c;
                String str7 = (String) this.s;
                Iterator it10 = arrayList8.iterator();
                if (!it10.hasNext()) {
                    return Unit.a;
                }
                if (it10.next() != null) {
                    pvd.j();
                    return null;
                }
                mqi mqiVar = com.moloco.sdk.acm.services.c.a;
                com.moloco.sdk.acm.services.c.f(str7);
                throw null;
            case 13:
                lu3 lu3Var14 = lu3.a;
                y6a.M(obj);
                ((g6b) this.s).a((e) this.t);
                return Unit.a;
            case 14:
                lu3 lu3Var15 = lu3.a;
                y6a.M(obj);
                return new com.moloco.sdk.internal.ilrd.j(((e) this.s).h, (String) this.t);
            case 15:
                lu3 lu3Var16 = lu3.a;
                y6a.M(obj);
                l lVar = (l) this.s;
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdService", "Revenue event: " + lVar, null, false, 12, null);
                e eVar = (e) ((n) this.t).c;
                lVar.getClass();
                xw3.K(eVar.a, g.a, nu3.a, new i(eVar, lVar, str2, r8));
                return Unit.a;
            case 16:
                lu3 lu3Var17 = lu3.a;
                y6a.M(obj);
                try {
                    yea yeaVar = ((d) this.s).a;
                    String str8 = (String) this.t;
                    yeaVar.getClass();
                    return new k0(com.moloco.sdk.internal.ortb.f.a((com.moloco.sdk.internal.ortb.model.c0) yeaVar.b(com.moloco.sdk.internal.ortb.model.c0.Companion.serializer(), str8)));
                } catch (CancellationException e) {
                    throw e;
                } catch (rkc e2) {
                    return new j0(new com.moloco.sdk.internal.ortb.b(e2.a));
                } catch (Exception e3) {
                    return new j0(new com.moloco.sdk.internal.ortb.a(e3));
                }
            case 17:
                lu3 lu3Var18 = lu3.a;
                y6a.M(obj);
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.debug$default(molocoLogger, "Base64GzippedBidProcessor", "Starting bid response pre-process with base64 decode and gunzip", false, 4, null);
                try {
                    byte[] decode = Base64.decode((String) this.t, 0);
                    decode.getClass();
                    MolocoLogger.debug$default(molocoLogger, "Base64GzippedBidProcessor", "Base64 decoded bidresponse: " + decode, false, 4, null);
                    byteArrayInputStream = new ByteArrayInputStream(decode);
                    gZIPInputStream = new GZIPInputStream(byteArrayInputStream, com.ironsource.mediationsdk.metadata.a.o);
                    sb = new StringBuilder();
                    bArr = new byte[com.ironsource.mediationsdk.metadata.a.o];
                } catch (Exception unused) {
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, "Base64GzippedBidProcessor", "Failed to base64 decode bidresponse, perhpas a non-base64 encoded response", null, false, 12, null);
                }
                while (true) {
                    try {
                        try {
                            read = gZIPInputStream.read(bArr);
                        } catch (Exception unused2) {
                            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "Base64GzippedBidProcessor", "Failed to unzip bidresponse, perhaps a non-gzipped response", null, false, 12, null);
                            byteArrayInputStream.close();
                            gZIPInputStream.close();
                        }
                        if (read == -1) {
                            byteArrayInputStream.close();
                            gZIPInputStream.close();
                            str2 = sb.toString();
                            MolocoLogger.debug$default(molocoLogger, "Base64GzippedBidProcessor", dmi.q("Processed bidresponse: ", str2), false, 4, null);
                            return str2;
                        }
                        sb.append(new String(bArr, 0, read, Charsets.UTF_8));
                    } catch (Throwable th) {
                        byteArrayInputStream.close();
                        gZIPInputStream.close();
                        throw th;
                    }
                }
            case 18:
                lu3 lu3Var19 = lu3.a;
                y6a.M(obj);
                ku3 ku3Var3 = (ku3) this.s;
                f fVar = (f) this.t;
                xw3.L(ku3Var3, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e(fVar, str2, i2), 3);
                xw3.L(ku3Var3, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e(fVar, str2, r8), 3);
                b bVar = fVar.l;
                Context context = fVar.g;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c cVar2 = fVar.i;
                bVar.getClass();
                FrameLayout c2 = b.c(context, cVar2);
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b) fVar.getWatermark()).b(c2);
                fVar.setAdView(c2);
                return Unit.a;
            case 19:
                lu3 lu3Var20 = lu3.a;
                y6a.M(obj);
                Iterator it11 = ((List) this.s).iterator();
                while (it11.hasNext()) {
                    ((yda) it11.next()).e(null);
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateFullscreenAd", "Calling close()", null, false, 12, null);
                WeakReference weakReference = FullscreenWebviewActivity.j;
                com.facebook.appevents.j.e();
                new Handler(Looper.getMainLooper()).postDelayed(new com.appsflyer.b((k) this.t, 11), 1000L);
                return Unit.a;
            case 20:
                lu3 lu3Var21 = lu3.a;
                y6a.M(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n nVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n) this.s;
                File file = ((a) this.t).a.b;
                try {
                    String parent = file.getParent();
                    if (parent == null) {
                        parent = file.getAbsolutePath();
                    }
                    StatFs statFs = new StatFs(parent);
                    cVar = new c(statFs.getAvailableBytes(), statFs.getTotalBytes());
                } catch (Exception unused3) {
                    cVar = null;
                }
                if (cVar != null) {
                    long j = cVar.b;
                    Integer valueOf2 = j > 0 ? Integer.valueOf((int) (((j - cVar.a) * 100) / j)) : null;
                    if (valueOf2 != null) {
                        int intValue = valueOf2.intValue();
                        str4 = intValue < 50 ? "low" : intValue < 75 ? "medium" : FootballShotmapItem.GOAL_HIGH;
                    }
                }
                nVar.l = str4;
                return Unit.a;
            case 21:
                o oVar = (o) this.t;
                lu3 lu3Var22 = lu3.a;
                y6a.M(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.d) this.s;
                if (Intrinsics.c(dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.g)) {
                    r rVar = (r) oVar.getAdShowListener();
                    if (rVar != null) {
                        rVar.a(true);
                    }
                } else if (!Intrinsics.c(dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.h)) {
                    if (Intrinsics.c(dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.b)) {
                        r rVar2 = (r) oVar.getAdShowListener();
                        if (rVar2 != null) {
                            rVar2.a(false);
                        }
                    } else if (Intrinsics.c(dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a.a)) {
                        r rVar3 = (r) oVar.getAdShowListener();
                        if (rVar3 != null) {
                            rVar3.b();
                        }
                    } else if (dVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.c) {
                        r rVar4 = (r) oVar.getAdShowListener();
                        if (rVar4 != null) {
                            rVar4.a(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.c) dVar).a);
                        }
                    } else if (!Intrinsics.c(dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.e) && !Intrinsics.c(dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.a) && !Intrinsics.c(dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.c) && !Intrinsics.c(dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.f) && !Intrinsics.c(dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b.d)) {
                        zzl.b();
                        return null;
                    }
                }
                return Unit.a;
            case 22:
                lu3 lu3Var23 = lu3.a;
                y6a.M(obj);
                ((c0) ((c40) this.t).f).e(((e0) this.s).a);
                return Unit.a;
            case 23:
                lu3 lu3Var24 = lu3.a;
                y6a.M(obj);
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f) ((c0) this.s).b).loadUrl("javascript:".concat((String) this.t));
                return Unit.a;
            case 24:
                lu3 lu3Var25 = lu3.a;
                y6a.M(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f fVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f) this.s;
                WebSettings settings = fVar2.getSettings();
                int i7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.d.a[((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.e) this.t).ordinal()];
                settings.setMediaPlaybackRequiresUserGesture(i7 != 1 ? i7 != 2 ? fVar2.getSettings().getMediaPlaybackRequiresUserGesture() : false : true);
                return Unit.a;
            case 25:
                lu3 lu3Var26 = lu3.a;
                y6a.M(obj);
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.d) this.s).a.a((String) this.t);
                return Unit.a;
            case 26:
                lu3 lu3Var27 = lu3.a;
                y6a.M(obj);
                ((com.appsflyer.f) this.t).invoke((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.d) this.s);
                return Unit.a;
            case 27:
                lu3 lu3Var28 = lu3.a;
                y6a.M(obj);
                h hVar = (h) this.s;
                if (hVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f) {
                    MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                    StringBuilder sb2 = new StringBuilder("Stream status: ");
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.g gVar = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f) hVar).b;
                    sb2.append(gVar.a);
                    sb2.append('/');
                    MolocoLogger.info$default(molocoLogger2, "VastAdLoaderImpl", lnb.l(gVar.b, " bytes downloaded", sb2), null, false, 12, null);
                }
                if (!(hVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d) && !(hVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                lu3 lu3Var29 = lu3.a;
                y6a.M(obj);
                j jVar = (j) this.s;
                if (((Boolean) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.u) this.t).a).booleanValue()) {
                    jVar.play();
                } else {
                    jVar.pause();
                }
                return Unit.a;
            default:
                lu3 lu3Var30 = lu3.a;
                y6a.M(obj);
                fsf fsfVar = (fsf) this.s;
                i0 i0Var = (i0) this.t;
                i0Var.getClass();
                if (!(i0Var instanceof f0)) {
                    if (!(i0Var instanceof g0)) {
                        if (!(i0Var instanceof h0)) {
                            zzl.b();
                            return null;
                        }
                        a0 a0Var = ((h0) i0Var).a;
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n nVar2 = a0Var.b;
                        str = a0Var.a;
                        if (nVar2 == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n.b) {
                            Regex regex = l0.a;
                            str.getClass();
                            break;
                        }
                        fsfVar.a = str3;
                        return Unit.a;
                    }
                    Regex regex2 = l0.a;
                    str = ((g0) i0Var).a.a;
                    break;
                } else {
                    Regex regex3 = l0.a;
                    str = ((f0) i0Var).a.a;
                    break;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pdk(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
    }
}
