package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.glance.session.SessionWorker;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import androidx.viewpager2.widget.ViewPager2;
import com.sofascore.model.favorites.FavoritesStagesData;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.StageDriverPerformance;
import com.sofascore.model.newNetwork.StatisticsSeasonsResponse;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.competition.FantasyCompetitionActivity;
import com.sofascore.results.fantasy.league.FantasyLeagueActivity;
import com.sofascore.results.fantasy.onboarding.FantasyOnboardingActivity;
import com.sofascore.results.main.MainActivity;
import com.sofascore.results.main.start.StartActivity;
import com.sofascore.results.profile.LoginScreenActivity;
import com.sofascore.results.profile.predictions.ProfilePredictionsFragment;
import com.sofascore.results.referral.ReferralActivity;
import com.sofascore.results.service.StartWorker;
import com.sofascore.results.stagesport.StageCategoryActivity;
import com.sofascore.results.stagesport.StageDetailsActivity;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceTeam;
import com.sofascore.results.team.lastnext.TeamEventsFragment;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.unity3d.services.UnityAdsConstants;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class m1f extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1f(Object obj, Object obj2, rq3 rq3Var, int i) {
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
                return new m1f((p1f) this.s, (j1f) obj2, rq3Var, 0);
            case 1:
                m1f m1fVar = new m1f((ProfilePredictionsFragment) obj2, rq3Var, 1);
                m1fVar.s = obj;
                return m1fVar;
            case 2:
                return new m1f((sbf) this.s, (gta) obj2, rq3Var, 2);
            case 3:
                m1f m1fVar2 = new m1f((ReferralActivity) obj2, rq3Var, 3);
                m1fVar2.s = obj;
                return m1fVar2;
            case 4:
                return new m1f((ge3) this.s, (e6b) obj2, rq3Var, 4);
            case 5:
                m1f m1fVar3 = new m1f((Function2) obj2, rq3Var, 5);
                m1fVar3.s = obj;
                return m1fVar3;
            case 6:
                return new m1f((zag) this.s, (String) obj2, rq3Var, 6);
            case 7:
                return new m1f((zag) this.s, (blg) obj2, rq3Var, 7);
            case 8:
                return new m1f((zag) this.s, (View) obj2, rq3Var, 8);
            case 9:
                return new m1f((hcg) this.s, (String) obj2, rq3Var, 9);
            case 10:
                return new m1f((URL) this.s, (String[]) obj2, rq3Var, 10);
            case 11:
                return new m1f((tdg) this.s, (eig) obj2, rq3Var, 11);
            case 12:
                return new m1f((eig) this.s, (String) obj2, rq3Var, 12);
            case 13:
                return new m1f((String) this.s, (e1d) obj2, rq3Var, 13);
            case 14:
                m1f m1fVar4 = new m1f((SessionWorker) obj2, rq3Var, 14);
                m1fVar4.s = obj;
                return m1fVar4;
            case 15:
                return new m1f((RecyclerView) this.s, (Context) obj2, rq3Var, 15);
            case 16:
                return new m1f((String) this.s, (scj) obj2, rq3Var, 16);
            case 17:
                m1f m1fVar5 = new m1f((a0i) obj2, rq3Var, 17);
                m1fVar5.s = obj;
                return m1fVar5;
            case 18:
                m1f m1fVar6 = new m1f((StageCategoryActivity) obj2, rq3Var, 18);
                m1fVar6.s = obj;
                return m1fVar6;
            case 19:
                m1f m1fVar7 = new m1f((StageDetailsActivity) obj2, rq3Var, 19);
                m1fVar7.s = obj;
                return m1fVar7;
            case 20:
                return new m1f((List) this.s, (Context) obj2, rq3Var, 20);
            case 21:
                m1f m1fVar8 = new m1f((d3i) obj2, rq3Var, 21);
                m1fVar8.s = obj;
                return m1fVar8;
            case 22:
                m1f m1fVar9 = new m1f((StartActivity) obj2, rq3Var, 22);
                m1fVar9.s = obj;
                return m1fVar9;
            case 23:
                m1f m1fVar10 = new m1f((StartWorker) obj2, rq3Var, 23);
                m1fVar10.s = obj;
                return m1fVar10;
            case 24:
                return new m1f((epi) this.s, (Function1) obj2, rq3Var, 24);
            case 25:
                m1f m1fVar11 = new m1f((ng2) obj2, rq3Var, 25);
                m1fVar11.s = obj;
                return m1fVar11;
            case 26:
                m1f m1fVar12 = new m1f((TeamEventsFragment) obj2, rq3Var, 26);
                m1fVar12.s = obj;
                return m1fVar12;
            case 27:
                return new m1f((n3j) this.s, (rnj) obj2, rq3Var, 27);
            case 28:
                m1f m1fVar13 = new m1f((lcj) obj2, rq3Var, 28);
                m1fVar13.s = obj;
                return m1fVar13;
            default:
                return new m1f((flb) this.s, (Function0) obj2, rq3Var, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
        }
        return ((m1f) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0206, code lost:
    
        r15.u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0204, code lost:
    
        if (r15.E().l.d() == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01f2, code lost:
    
        if (r15.E().p.a.getValue() == null) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r14v3, types: [p03] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Context requireContext;
        int i;
        FrameLayout frameLayout;
        String str;
        Object value;
        NotificationsActionButton notificationsActionButton;
        NotificationsActionButton notificationsActionButton2;
        int color;
        do7 do7Var;
        List list;
        String str2;
        Map<Integer, Map<Integer, List<String>>> typesMap;
        Map<Integer, List<String>> map;
        Function0 function0;
        int i2 = this.r;
        int i3 = 13;
        int i4 = 11;
        int i5 = 9;
        int i6 = 14;
        int i7 = 6;
        int i8 = 2;
        int i9 = 10;
        int i10 = 3;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        p03 p03Var = 0;
        r14 = null;
        r14 = null;
        List<String> list2 = null;
        Object obj2 = this.t;
        switch (i2) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                p1f p1fVar = (p1f) this.s;
                j1f j1fVar = (j1f) obj2;
                p1fVar.f = p1fVar.f.a(j1fVar);
                p1fVar.c.k(j1fVar);
                return Unit.a;
            case 1:
                ProfilePredictionsFragment profilePredictionsFragment = (ProfilePredictionsFragment) obj2;
                p33 p33Var = (p33) this.s;
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                r13 = ((p33Var.a instanceof pfb) && profilePredictionsFragment.C().getItemCount() == 0) ? 1 : 0;
                ConstraintLayout constraintLayout = profilePredictionsFragment.x;
                if (constraintLayout == null) {
                    krk krkVar = profilePredictionsFragment.l;
                    krkVar.getClass();
                    v82 d = v82.d(((oo8) krkVar).b.inflate());
                    iz8.E(d, profilePredictionsFragment.requireContext().getDrawable(R.drawable.predictions_1x2));
                    if (((fbf) profilePredictionsFragment.r.getValue()).g == t6e.b) {
                        requireContext = profilePredictionsFragment.requireContext();
                        i = R.string.no_upcoming_voted;
                    } else {
                        requireContext = profilePredictionsFragment.requireContext();
                        i = R.string.no_voted_matches;
                    }
                    String string = requireContext.getString(i);
                    string.getClass();
                    iz8.F(d, string);
                    constraintLayout = (ConstraintLayout) d.b;
                    profilePredictionsFragment.x = constraintLayout;
                    constraintLayout.getClass();
                }
                constraintLayout.setVisibility(r13 != 0 ? 0 : 8);
                krk krkVar2 = profilePredictionsFragment.l;
                krkVar2.getClass();
                ((oo8) krkVar2).d.setVisibility(r13 == 0 ? 0 : 8);
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                sbf sbfVar = (sbf) this.s;
                gta gtaVar = (gta) obj2;
                sbfVar.getClass();
                gtaVar.getClass();
                xw3.L(un0.z(sbfVar), null, null, new h10(gtaVar, sbfVar, (rq3) p03Var, 18), 3);
                return Unit.a;
            case 3:
                ReferralActivity referralActivity = (ReferralActivity) obj2;
                stf stfVar = (stf) this.s;
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                if (stfVar instanceof rtf) {
                    String str3 = ((rtf) stfVar).a;
                    if (str3 != null) {
                        String string2 = referralActivity.getString(R.string.referral_program_open_within_two_hours);
                        string2.getClass();
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", string2 + "\n" + str3);
                        referralActivity.startActivity(intent);
                    }
                } else {
                    if (!(stfVar instanceof qtf)) {
                        zzl.b();
                        return null;
                    }
                    z8e.C(referralActivity, -1, new Intent());
                }
                return Unit.a;
            case 4:
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                ge3 ge3Var = (ge3) this.s;
                ge3Var.c = (e6b) obj2;
                ge3Var.a();
                return Unit.a;
            case 5:
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                CoroutineContext.Element element = ((ku3) this.s).getCoroutineContext().get(d.Q7);
                element.getClass();
                d dVar = (d) element;
                qa3 c = qx9.c();
                xw3.K(c09.a, dVar, nu3.d, new v1f(c, (Function2) obj2, (rq3) p03Var, i5));
                while (!c.t()) {
                    try {
                        return td4.t0(dVar, new w9g(c, p03Var, objArr == true ? 1 : 0));
                    } catch (InterruptedException unused) {
                    }
                }
                return c.G();
            case 6:
                String str4 = (String) obj2;
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                asf asfVar = new asf();
                zag zagVar = (zag) this.s;
                if (new Date().getTime() - (zagVar.s + zagVar.b) > 0) {
                    if (str4 == null || StringsKt.R(str4)) {
                        gcg gcgVar = zagVar.l;
                        str4 = gcgVar != null ? gcgVar.e : null;
                    }
                    if (str4 != null) {
                        try {
                            zagVar.e.b(str4);
                            xw3.L(zagVar.k, null, null, new yag(zagVar, p03Var, i10), 3);
                            asfVar.a = true;
                        } catch (ActivityNotFoundException e) {
                            jeg jegVar = jeg.d;
                            e.toString();
                            jegVar.f(3);
                        }
                    }
                }
                return Boolean.valueOf(asfVar.a);
            case 7:
                blg blgVar = (blg) obj2;
                lu3 lu3Var8 = lu3.a;
                y6a.M(obj);
                zag zagVar2 = (zag) this.s;
                jhg jhgVar = zagVar2.q;
                if (jhgVar != null) {
                    jhgVar.e = blgVar;
                }
                Iterator it = zagVar2.t.iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(blgVar);
                }
                return Unit.a;
            case 8:
                View view = (View) obj2;
                lu3 lu3Var9 = lu3.a;
                y6a.M(obj);
                zag zagVar3 = (zag) this.s;
                Context context = zagVar3.a;
                View decorView = context instanceof Activity ? ((Activity) context).getWindow().getDecorView() : view.getRootView();
                if (decorView instanceof FrameLayout) {
                    frameLayout = (FrameLayout) decorView;
                } else {
                    if (decorView != null) {
                        View findViewById = decorView.findViewById(android.R.id.content);
                        if (findViewById instanceof FrameLayout) {
                            frameLayout = (FrameLayout) findViewById;
                        }
                    }
                    frameLayout = null;
                }
                if (frameLayout != null) {
                    p03Var = new p03(i3, (boolean) (objArr2 == true ? 1 : 0));
                    p03Var.b = view;
                    p03Var.c = frameLayout;
                    p03Var.d = zagVar3;
                }
                zagVar3.p = p03Var;
                return Unit.a;
            case 9:
                lu3 lu3Var10 = lu3.a;
                y6a.M(obj);
                ((TextView) ((hcg) this.s).b.e).setText((String) obj2);
                return Unit.a;
            case 10:
                lu3 lu3Var11 = lu3.a;
                y6a.M(obj);
                return cga.y((URL) this.s, (String[]) obj2);
            case 11:
                WebView webView = ((eig) obj2).c;
                lu3 lu3Var12 = lu3.a;
                y6a.M(obj);
                tdg tdgVar = (tdg) this.s;
                nig nigVar = tdgVar.d;
                sdg sdgVar = tdgVar.n;
                if (sdgVar == null) {
                    Intrinsics.i("rootLayout");
                    throw null;
                }
                sdgVar.addView(webView, new ViewGroup.LayoutParams(-1, -1));
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                sdg sdgVar2 = tdgVar.n;
                if (sdgVar2 == null) {
                    Intrinsics.i("rootLayout");
                    throw null;
                }
                LinearLayout linearLayout = tdgVar.o;
                if (linearLayout == null) {
                    Intrinsics.i("buttonsLayout");
                    throw null;
                }
                sdgVar2.addView(linearLayout, layoutParams);
                LinearLayout linearLayout2 = tdgVar.o;
                if (linearLayout2 == null) {
                    Intrinsics.i("buttonsLayout");
                    throw null;
                }
                qz.y(linearLayout2, gkg.a, new kdg(tdgVar, r13));
                if (nigVar != null) {
                    LinearLayout linearLayout3 = tdgVar.o;
                    if (linearLayout3 == null) {
                        Intrinsics.i("buttonsLayout");
                        throw null;
                    }
                    linearLayout3.addView(((pig) nigVar).m);
                }
                LinearLayout linearLayout4 = tdgVar.o;
                if (linearLayout4 == null) {
                    Intrinsics.i("buttonsLayout");
                    throw null;
                }
                kcg kcgVar = tdgVar.m;
                if (kcgVar == null) {
                    Intrinsics.i("closeController");
                    throw null;
                }
                linearLayout4.addView(kcgVar.f);
                tdgVar.i();
                rjg d2 = tdgVar.c.d(webView, null, false, tdgVar.a.f, tdgVar.b);
                if (d2 == null) {
                    return null;
                }
                kcg kcgVar2 = tdgVar.m;
                if (kcgVar2 == null) {
                    Intrinsics.i("closeController");
                    throw null;
                }
                d2.a(2, kcgVar2.f);
                if (nigVar != null) {
                    d2.a(4, ((pig) nigVar).m);
                }
                hkg.T().post(new ojg(d2, 7));
                return Unit.a;
            case 12:
                lu3 lu3Var13 = lu3.a;
                y6a.M(obj);
                eig eigVar = (eig) this.s;
                String str5 = (String) obj2;
                eigVar.e = str5;
                y3g y3gVar = eigVar.b;
                y3gVar.getClass();
                str5.getClass();
                ((WebView) y3gVar.b).loadUrl(str5);
                return Unit.a;
            case 13:
                lu3 lu3Var14 = lu3.a;
                y6a.M(obj);
                e1d e1dVar = (e1d) obj2;
                float f = fyg.a;
                if (((String) e1dVar.getValue()) == null && (str = (String) this.s) != null) {
                    e1dVar.setValue(str);
                }
                return Unit.a;
            case 14:
                lu3 lu3Var15 = lu3.a;
                y6a.M(obj);
                return (af0) ((k8h) this.s).a.get(((SessionWorker) obj2).e);
            case 15:
                lu3 lu3Var16 = lu3.a;
                y6a.M(obj);
                RecyclerView recyclerView = (RecyclerView) this.s;
                recyclerView.measure(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                Bitmap createBitmap = Bitmap.createBitmap(recyclerView.getWidth(), recyclerView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                createBitmap.getClass();
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(((Context) obj2).getColor(R.color.surface_0));
                recyclerView.draw(canvas);
                return createBitmap;
            case 16:
                lu3 lu3Var17 = lu3.a;
                y6a.M(obj);
                String str6 = (String) this.s;
                scj scjVar = (scj) obj2;
                if (!Intrinsics.c(str6, scjVar.c().c.toString())) {
                    w1a.E(scjVar, str6);
                }
                return Unit.a;
            case 17:
                p2h p2hVar = (p2h) this.s;
                lu3 lu3Var18 = lu3.a;
                y6a.M(obj);
                fdi fdiVar = ((a0i) obj2).e;
                do {
                    value = fdiVar.getValue();
                } while (!fdiVar.k(value, new unb(p2hVar)));
                return Unit.a;
            case 18:
                FavoritesStagesData favoritesStagesData = (FavoritesStagesData) this.s;
                lu3 lu3Var19 = lu3.a;
                y6a.M(obj);
                if (favoritesStagesData != null && (notificationsActionButton = ((StageCategoryActivity) obj2).Q) != null) {
                    notificationsActionButton.h(favoritesStagesData);
                }
                return Unit.a;
            case 19:
                FavoritesStagesData favoritesStagesData2 = (FavoritesStagesData) this.s;
                lu3 lu3Var20 = lu3.a;
                y6a.M(obj);
                if (favoritesStagesData2 != null && (notificationsActionButton2 = ((StageDetailsActivity) obj2).Q) != null) {
                    notificationsActionButton2.h(favoritesStagesData2);
                }
                return Unit.a;
            case 20:
                lu3 lu3Var21 = lu3.a;
                y6a.M(obj);
                List list3 = (List) this.s;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    Team parentTeam = ((StageDriverPerformance) it2.next()).getParentTeam();
                    if (parentTeam != null) {
                        arrayList.add(parentTeam);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (hashSet.add(new Integer(((Team) next).getId()))) {
                        arrayList2.add(next);
                    }
                }
                Context context2 = (Context) obj2;
                ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    Team team = (Team) it4.next();
                    int id = team.getId();
                    String p = tba.p(context2, team);
                    String primary = team.getTeamColors().getPrimary();
                    if (primary != null) {
                        color = Color.parseColor(primary);
                        if (Color.blue(color) > 220 && Color.green(color) > 220 && Color.red(color) > 220) {
                            color = context2.getColor(R.color.neutral_default);
                        }
                    } else {
                        color = context2.getColor(R.color.neutral_default);
                    }
                    arrayList3.add(new RaceFlowModels$RaceTeam(id, p, color));
                }
                return CollectionsKt.H0(arrayList3, new laf(22));
            case 21:
                d3i d3iVar = (d3i) obj2;
                a3i a3iVar = (a3i) this.s;
                lu3 lu3Var22 = lu3.a;
                y6a.M(obj);
                Integer num = a3iVar.l;
                if (num == null && d3iVar.o) {
                    return Unit.a;
                }
                d3iVar.o = num == null;
                d3iVar.n(null, new l2i(5));
                return Unit.a;
            case 22:
                StartActivity startActivity = (StartActivity) obj2;
                wv6 wv6Var = (wv6) this.s;
                lu3 lu3Var23 = lu3.a;
                y6a.M(obj);
                if (Intrinsics.c(wv6Var, uv6.a)) {
                    if (StartActivity.u()) {
                        yv6 q = startActivity.q();
                        if (q.h != null) {
                            xw3.L(un0.z(q), null, null, new xv6(q, p03Var, objArr3 == true ? 1 : 0), 3);
                        }
                    } else {
                        de deVar = startActivity.o;
                        int i11 = LoginScreenActivity.M;
                        deVar.a(wxf.v(startActivity, null, 6), null);
                    }
                } else if (Intrinsics.c(wv6Var, vv6.a)) {
                    boolean z = MainActivity.n0;
                    f8h.y(startActivity, fz8.C(fz8.J("FANTASY_UNSUPPORTED_COUNTRY_ERROR", true)), true);
                    startActivity.finishAfterTransition();
                } else if (Intrinsics.c(wv6Var, tv6.a)) {
                    de deVar2 = startActivity.p;
                    int i12 = FantasyOnboardingActivity.M;
                    ev6 ev6Var = startActivity.q().j;
                    deVar2.a(uic.m(startActivity, ev6Var != null ? new Integer(ev6Var.c) : null, true, true), null);
                } else if (Intrinsics.c(wv6Var, qv6.a)) {
                    int i13 = StartActivity.q;
                    yv6 q2 = startActivity.q();
                    if (q2.h != null) {
                        xw3.L(un0.z(q2), null, null, new xv6(q2, p03Var, r13), 3);
                    }
                } else if (Intrinsics.c(wv6Var, rv6.a)) {
                    boolean z2 = MainActivity.n0;
                    f8h.y(startActivity, fz8.C(fz8.J("FANTASY_INVALID_CODE_ERROR", true)), true);
                    startActivity.finishAfterTransition();
                } else {
                    if (!(wv6Var instanceof sv6)) {
                        zzl.b();
                        return null;
                    }
                    int i14 = StartActivity.q;
                    j67 j67Var = startActivity.q().k;
                    if (j67Var != null && (do7Var = startActivity.q().i) != null) {
                        ArrayList arrayList4 = new ArrayList();
                        boolean z3 = MainActivity.n0;
                        arrayList4.add(f8h.s(startActivity, fz8.C(fz8.H("open_action", "select_fantasy_tab"))));
                        int i15 = FantasyCompetitionActivity.R;
                        arrayList4.add(mx9.t(startActivity, do7Var, null));
                        int i16 = FantasyLeagueActivity.N;
                        arrayList4.add(inb.y(startActivity, j67Var, do7Var.c, false));
                        if (arrayList4.isEmpty()) {
                            a70.r("No intents added to TaskStackBuilder; cannot startActivities");
                            return null;
                        }
                        Intent[] intentArr = (Intent[]) arrayList4.toArray(new Intent[0]);
                        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                        startActivity.startActivities(intentArr, null);
                        startActivity.finishAfterTransition();
                    }
                }
                return Unit.a;
            case 23:
                ku3 ku3Var = (ku3) this.s;
                lu3 lu3Var24 = lu3.a;
                y6a.M(obj);
                StartWorker startWorker = (StartWorker) obj2;
                xw3.L(ku3Var, null, null, new nci(startWorker, p03Var, i9), 3);
                xw3.L(ku3Var, null, null, new nci(startWorker, p03Var, i4), 3);
                xw3.L(ku3Var, null, null, new nci(startWorker, p03Var, 12), 3);
                xw3.L(ku3Var, null, null, new nci(startWorker, p03Var, i3), 3);
                xw3.L(ku3Var, null, null, new nci(startWorker, p03Var, i6), 3);
                return xw3.L(ku3Var, null, null, new big(startWorker, p03Var, 28), 3);
            case 24:
                lu3 lu3Var25 = lu3.a;
                y6a.M(obj);
                epi epiVar = (epi) this.s;
                dx dxVar = epiVar.a;
                dx dxVar2 = epiVar.a;
                fpi fpiVar = (fpi) ((eoh) ((e1d) dxVar.d)).getValue();
                fpi fpiVar2 = fpi.c;
                if (fpiVar != fpiVar2) {
                    Function1 function1 = (Function1) obj2;
                    if (((xnh) dxVar2.f).h() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !Float.isNaN(((xnh) dxVar2.f).h())) {
                        fpiVar2 = ((xnh) dxVar2.f).h() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? fpi.a : fpi.b;
                    }
                    function1.invoke(fpiVar2);
                }
                return Unit.a;
            case 25:
                Enum r0 = (Enum) this.s;
                lu3 lu3Var26 = lu3.a;
                y6a.M(obj);
                ng2 ng2Var = (ng2) obj2;
                ViewPager2 viewPager2 = (ViewPager2) ng2Var.d;
                l adapter = viewPager2.getAdapter();
                if (adapter != null) {
                    l lVar = adapter.getItemCount() > 0 ? adapter : null;
                    if (lVar != null) {
                        long itemId = lVar.getItemId(viewPager2.getCurrentItem());
                        if (((Boolean) ((k1e) ng2Var.e).invoke(r0)).booleanValue()) {
                            dsi dsiVar = (dsi) ng2Var.b;
                            if (!dsiVar.d) {
                                dsiVar.e = itemId;
                                dsiVar.d = true;
                            }
                            ng2Var.e(true);
                        }
                    }
                }
                return Unit.a;
            case 26:
                twi twiVar = (twi) this.s;
                lu3 lu3Var27 = lu3.a;
                y6a.M(obj);
                final TeamEventsFragment teamEventsFragment = (TeamEventsFragment) obj2;
                if (!teamEventsFragment.w) {
                    uwi uwiVar = (uwi) teamEventsFragment.E().j.d();
                    if (Intrinsics.c(uwiVar != null ? Boolean.valueOf(uwiVar.c) : null, Boolean.TRUE)) {
                        teamEventsFragment.w = true;
                        kp5<twi> kp5Var = twi.g;
                        ArrayList arrayList5 = new ArrayList(k13.r(kp5Var, 10));
                        for (twi twiVar2 : kp5Var) {
                            String name = twiVar2.name();
                            q9k q9kVar = twiVar2.a;
                            Context requireContext2 = teamEventsFragment.requireContext();
                            requireContext2.getClass();
                            arrayList5.add(new s1h(name, q9kVar.b(requireContext2), true));
                        }
                        krk krkVar3 = teamEventsFragment.l;
                        krkVar3.getClass();
                        SegmentedButtonsView segmentedButtonsView = ((dq8) krkVar3).g;
                        Boolean bool = Boolean.FALSE;
                        Pair pair = new Pair(bool, bool);
                        final Object[] objArr6 = objArr5 == true ? 1 : 0;
                        Function2 function2 = new Function2() { // from class: nwi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Object value2;
                                switch (objArr6) {
                                    case 0:
                                        String str7 = (String) obj3;
                                        ((Integer) obj4).getClass();
                                        str7.getClass();
                                        TeamEventsFragment teamEventsFragment2 = teamEventsFragment;
                                        teamEventsFragment2.G();
                                        teamEventsFragment2.y = yaa.v();
                                        xwi E = teamEventsFragment2.E();
                                        twi valueOf = twi.valueOf(str7);
                                        valueOf.getClass();
                                        fdi fdiVar2 = E.m;
                                        do {
                                            value2 = fdiVar2.getValue();
                                        } while (!fdiVar2.k(value2, valueOf));
                                        xw3.L(un0.z(E), null, null, new vki(E, valueOf, null, 10), 3);
                                        break;
                                    default:
                                        of3 of3Var = (of3) obj3;
                                        int intValue = ((Integer) obj4).intValue();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                                            TeamEventsFragment teamEventsFragment3 = teamEventsFragment;
                                            xwi E2 = teamEventsFragment3.E();
                                            boolean i17 = av8Var.i(teamEventsFragment3);
                                            Object O = av8Var.O();
                                            if (i17 || O == nf3.a) {
                                                fl8 fl8Var = new fl8(0, teamEventsFragment3, TeamEventsFragment.class, "showCalendarMonthPicker", "showCalendarMonthPicker()V", 0, 29);
                                                av8Var.n0(fl8Var);
                                                O = fl8Var;
                                            }
                                            kda.j(E2, (Function0) ((KFunction) O), null, av8Var, 0);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        s1h[] s1hVarArr = (s1h[]) arrayList5.toArray(new s1h[0]);
                        t1h[] t1hVarArr = (t1h[]) Arrays.copyOf(s1hVarArr, s1hVarArr.length);
                        rlh rlhVar = rlh.b;
                        rlhVar.getClass();
                        hfe d3 = rlhVar.d();
                        o13.w(d3, t1hVarArr);
                        b7 d4 = d3.d();
                        twi twiVar3 = (twi) teamEventsFragment.E().n.a.getValue();
                        if (twiVar3 == null || (str2 = twiVar3.name()) == null) {
                            str2 = "List";
                        }
                        segmentedButtonsView.k = function2;
                        segmentedButtonsView.g = false;
                        segmentedButtonsView.h = pair;
                        segmentedButtonsView.j = v1h.f;
                        segmentedButtonsView.i = new z1h(objArr4 == true ? 1 : 0);
                        segmentedButtonsView.setSelectedItem(str2);
                        if (d4 == null) {
                            d4 = rlh.b;
                        }
                        if (!d4.isEmpty()) {
                            SegmentedButtonsView.t(segmentedButtonsView, d4, null, 6);
                        }
                    }
                }
                int ordinal = twiVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        zzl.b();
                        return null;
                    }
                    break;
                } else {
                    break;
                }
                int ordinal2 = twiVar.ordinal();
                if (ordinal2 == 0) {
                    uwi uwiVar2 = (uwi) teamEventsFragment.E().j.d();
                    r13 = yid.m((uwiVar2 == null || (list = uwiVar2.b) == null) ? null : new Integer(list.size())) <= 1 ? 0 : 1;
                    if (r13 != 0) {
                        krk krkVar4 = teamEventsFragment.l;
                        krkVar4.getClass();
                        hz8.C(((dq8) krkVar4).e, new Long(150L), 9);
                    }
                    krk krkVar5 = teamEventsFragment.l;
                    krkVar5.getClass();
                    ((dq8) krkVar5).e.setVisibility(r13 != 0 ? 0 : 8);
                    krk krkVar6 = teamEventsFragment.l;
                    krkVar6.getClass();
                    tgj.G(((dq8) krkVar6).d, 150L, 2);
                    krk krkVar7 = teamEventsFragment.l;
                    krkVar7.getClass();
                    tgj.E(((dq8) krkVar7).h, 150L, null, 14);
                    teamEventsFragment.H();
                } else {
                    if (ordinal2 != 1) {
                        zzl.b();
                        return null;
                    }
                    krk krkVar8 = teamEventsFragment.l;
                    krkVar8.getClass();
                    hz8.B(((dq8) krkVar8).e, new Long(150L));
                    krk krkVar9 = teamEventsFragment.l;
                    krkVar9.getClass();
                    tgj.G(((dq8) krkVar9).h, 150L, 2);
                    krk krkVar10 = teamEventsFragment.l;
                    krkVar10.getClass();
                    tgj.E(((dq8) krkVar10).d, 150L, null, 14);
                    krk krkVar11 = teamEventsFragment.l;
                    krkVar11.getClass();
                    ((dq8) krkVar11).b.y(1);
                    if (teamEventsFragment.v) {
                        teamEventsFragment.v = false;
                        krk krkVar12 = teamEventsFragment.l;
                        krkVar12.getClass();
                        ((dq8) krkVar12).c.setContent(new tc3(2095151203, new Function2() { // from class: nwi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Object value2;
                                switch (r2) {
                                    case 0:
                                        String str7 = (String) obj3;
                                        ((Integer) obj4).getClass();
                                        str7.getClass();
                                        TeamEventsFragment teamEventsFragment2 = teamEventsFragment;
                                        teamEventsFragment2.G();
                                        teamEventsFragment2.y = yaa.v();
                                        xwi E = teamEventsFragment2.E();
                                        twi valueOf = twi.valueOf(str7);
                                        valueOf.getClass();
                                        fdi fdiVar2 = E.m;
                                        do {
                                            value2 = fdiVar2.getValue();
                                        } while (!fdiVar2.k(value2, valueOf));
                                        xw3.L(un0.z(E), null, null, new vki(E, valueOf, null, 10), 3);
                                        break;
                                    default:
                                        of3 of3Var = (of3) obj3;
                                        int intValue = ((Integer) obj4).intValue();
                                        av8 av8Var = (av8) of3Var;
                                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                                            TeamEventsFragment teamEventsFragment3 = teamEventsFragment;
                                            xwi E2 = teamEventsFragment3.E();
                                            boolean i17 = av8Var.i(teamEventsFragment3);
                                            Object O = av8Var.O();
                                            if (i17 || O == nf3.a) {
                                                fl8 fl8Var = new fl8(0, teamEventsFragment3, TeamEventsFragment.class, "showCalendarMonthPicker", "showCalendarMonthPicker()V", 0, 29);
                                                av8Var.n0(fl8Var);
                                                O = fl8Var;
                                            }
                                            kda.j(E2, (Function0) ((KFunction) O), null, av8Var, 0);
                                        } else {
                                            av8Var.W();
                                        }
                                        break;
                                }
                                return Unit.a;
                            }
                        }, true));
                    }
                }
                return Unit.a;
            case 27:
                lu3 lu3Var28 = lu3.a;
                y6a.M(obj);
                n3j n3jVar = (n3j) this.s;
                rnj rnjVar = (rnj) obj2;
                Integer num2 = new Integer(rnjVar.a);
                Integer num3 = new Integer(rnjVar.b);
                String str7 = rnjVar.c;
                StatisticsSeasonsResponse statisticsSeasonsResponse = n3jVar.o;
                if (statisticsSeasonsResponse != null && (typesMap = statisticsSeasonsResponse.getTypesMap()) != null && (map = typesMap.get(num2)) != null) {
                    list2 = map.get(num3);
                }
                if (list2 == null) {
                    list2 = km5.a;
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj3 : list2) {
                    String str8 = (String) obj3;
                    jp5 entries = Season.SubSeasonType.getEntries();
                    if (entries == null || !entries.isEmpty()) {
                        Iterator<E> it5 = entries.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                break;
                            }
                            if (Intrinsics.c(((Season.SubSeasonType) it5.next()).getLabel(), str8)) {
                                arrayList6.add(obj3);
                            }
                        }
                    }
                }
                List<String> H0 = CollectionsKt.H0(arrayList6, new q6i(i7));
                ArrayList arrayList7 = new ArrayList(k13.r(H0, 10));
                for (String str9 : H0) {
                    Set set = f5k.a;
                    arrayList7.add(new s1h(str9, f5k.b(n3jVar.i(), str9, str7), true));
                }
                return l6g.W(arrayList7);
            case 28:
                lu3 lu3Var29 = lu3.a;
                y6a.M(obj);
                ku3 ku3Var2 = (ku3) this.s;
                lcj lcjVar = (lcj) obj2;
                xw3.L(ku3Var2, null, null, new w43(lcjVar, p03Var, i8), 3);
                return xw3.L(ku3Var2, null, null, new w43(lcjVar, p03Var, i10), 3);
            default:
                lu3 lu3Var30 = lu3.a;
                y6a.M(obj);
                if (((Boolean) ((flb) this.s).n.getValue()).booleanValue() && (function0 = (Function0) obj2) != null) {
                    function0.invoke();
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1f(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
    }
}
