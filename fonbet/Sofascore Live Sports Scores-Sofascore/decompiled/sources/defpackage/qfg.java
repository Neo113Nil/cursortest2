package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import com.appsflyer.sdk_base.referrer.Payload;
import com.equativ.displaysdk.adadapter.SASParallaxBannerAdapter;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.favorites.FavoritesEventsData;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.chat.view.ScoreUpdateView;
import com.sofascore.results.main.matches.redesign.sportreorder.SportReorderComposeDialogFragment;
import com.sofascore.results.settings.SettingsFragment;
import com.sofascore.results.sofaSeason.SofaSeasonActivity;
import com.sofascore.results.stagesport.StageConstructorActivity;
import com.sofascore.results.stagesport.fragments.category.StageCategoryRankingFragment;
import com.sofascore.results.view.follownotification.NotificationsActionButton;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class qfg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qfg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yeg yegVar;
        kbg kbgVar;
        Object value;
        Team team;
        int i = this.a;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((tfg) obj2).a(((Boolean) obj).booleanValue(), true);
                return Unit.a;
            case 1:
                SASParallaxBannerAdapter sASParallaxBannerAdapter = (SASParallaxBannerAdapter) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                yegVar = sASParallaxBannerAdapter.i;
                if (yegVar != null) {
                    ((xeg) yegVar).setMuted(booleanValue);
                }
                kbgVar = sASParallaxBannerAdapter.j;
                if (kbgVar != null) {
                    kbgVar.a(booleanValue, true);
                }
                return Unit.a;
            case 2:
                qig qigVar = (qig) obj2;
                yig yigVar = (yig) obj;
                yigVar.getClass();
                Button button = qigVar.c.getButton(-1);
                if (button != null) {
                    button.setEnabled(true);
                }
                qigVar.b = yigVar;
                return Unit.a;
            case 3:
                spg spgVar = ((ppg) obj2).c;
                return Boolean.valueOf(spgVar != null ? spgVar.d(obj) : true);
            case 4:
                ((mpg) obj2).c(obj);
                return Unit.a;
            case 5:
                ((koh) obj2).remove(obj);
                return Unit.a;
            case 6:
                ((ScoreUpdateView) obj2).i = (Bitmap) obj;
                return Unit.a;
            case 7:
                qug qugVar = (qug) obj2;
                float floatValue = ((Float) obj).floatValue();
                znh znhVar = qugVar.a;
                float h = znhVar.h() + floatValue + qugVar.f;
                float b = llf.b(h, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, qugVar.e.h());
                r3 = h == b;
                float h2 = b - znhVar.h();
                int round = Math.round(h2);
                znhVar.i(znhVar.h() + round);
                qugVar.f = h2 - round;
                if (!r3) {
                    floatValue = h2;
                }
                return Float.valueOf(floatValue);
            case 8:
                Pair pair = (Pair) obj;
                pair.getClass();
                return Boolean.valueOf(Intrinsics.c(pair.a, (HorizontalScrollView) obj2));
            case 9:
                svg svgVar = (svg) obj2;
                return new dnd(svgVar.c(svgVar.k, ((dnd) obj).a, svgVar.j));
            case 10:
                ((List) obj).getClass();
                return Long.valueOf(((CharSequence) ((bxg) obj2).g.getValue()).length() == 0 ? 0L : 150L);
            case 11:
                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                editor.getClass();
                editor.putBoolean("SEASON_RATING_GRAPH_MONTHLY_RATING_VALUES", ((bzg) obj2).e == azg.a);
                return Unit.a;
            case 12:
                mze mzeVar = (mze) obj;
                if (((jwc) obj2).e(mzeVar.c)) {
                    mzeVar.a();
                }
                return Unit.a;
            case 13:
                IntRange intRange = (IntRange) obj2;
                zvj zvjVar = (zvj) obj;
                zvjVar.getClass();
                int[] iArr = zvjVar.a;
                int length = iArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (intRange.d(iArr[i2])) {
                            r3 = true;
                        } else {
                            i2++;
                        }
                    }
                }
                return Boolean.valueOf(r3);
            case 14:
                KSerializer kSerializer = (KSerializer) obj2;
                ((List) obj).getClass();
                return kSerializer;
            case 15:
                SettingsFragment settingsFragment = (SettingsFragment) obj2;
                j52 j52Var = (j52) obj;
                j52Var.getClass();
                xw3.L(wca.x(settingsFragment.getLifecycle()), null, null, new big(j52Var, settingsFragment, objArr == true ? 1 : 0, 8), 3);
                return Unit.a;
            case 16:
                Integer num = (Integer) obj;
                num.getClass();
                Function1 function1 = ((nch) obj2).n;
                if (function1 != null) {
                    function1.invoke(num);
                }
                return Unit.a;
            case 17:
                vih vihVar = (vih) obj2;
                l4h l4hVar = vihVar.g;
                l4hVar.getClass();
                if (!Intrinsics.c(vihVar.g, l4hVar)) {
                    h3f.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                y0d y0dVar = vihVar.f;
                Object obj3 = vihVar.d;
                if (y0dVar != null) {
                    if (obj3 != null) {
                        h3f.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    y0dVar.a(obj);
                } else if (obj3 == null) {
                    vihVar.d = obj;
                } else {
                    y0d y0dVar2 = rrg.a;
                    y0d y0dVar3 = new y0d();
                    y0dVar3.a(obj3);
                    y0dVar3.a(obj);
                    vihVar.f = y0dVar3;
                    vihVar.d = null;
                }
                return Unit.a;
            case 18:
                return Integer.valueOf(((jlh) obj2).a(o02.J(((twc) obj).e)));
            case 19:
                return Boolean.valueOf(Intrinsics.c(((bn6) obj).a, (gmh) obj2));
            case 20:
                a5f a5fVar = (a5f) obj2;
                synchronized (a5fVar.h) {
                    loh lohVar = (loh) a5fVar.j;
                    lohVar.getClass();
                    Object obj4 = lohVar.b;
                    obj4.getClass();
                    int i3 = lohVar.d;
                    h0d h0dVar = lohVar.c;
                    if (h0dVar == null) {
                        h0dVar = new h0d();
                        lohVar.c = h0dVar;
                        lohVar.f.m(obj4, h0dVar);
                        Unit unit = Unit.a;
                    }
                    lohVar.b(obj, i3, obj4, h0dVar);
                }
                return Unit.a;
            case 21:
                ha5 ha5Var = (ha5) obj;
                ha5Var.getClass();
                d7e.h((d7e) obj2, ha5Var, ha5Var.n(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 6);
                return Unit.a;
            case 22:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                int i4 = SofaSeasonActivity.L;
                fdi fdiVar = ((kth) obj2).h;
                do {
                    value = fdiVar.getValue();
                } while (!fdiVar.k(value, hth.a((hth) value, null, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, booleanValue2, false, 47)));
                return Unit.a;
            case 23:
                SofaSeasonActivity sofaSeasonActivity = (SofaSeasonActivity) obj2;
                Bitmap bitmap = (Bitmap) obj;
                int i5 = SofaSeasonActivity.L;
                bitmap.getClass();
                xw3.L(wca.x(sofaSeasonActivity.getLifecycle()), null, null, new big(sofaSeasonActivity, bitmap, objArr2 == true ? 1 : 0, 14), 3);
                return Unit.a;
            case 24:
                vfi vfiVar = (vfi) obj2;
                f4g f4gVar = (f4g) obj;
                f4gVar.getClass();
                f4gVar.k(((Number) vfiVar.h.d()).floatValue());
                f4gVar.l(((Number) vfiVar.i.d()).floatValue());
                f4gVar.b(((Number) vfiVar.j.d()).floatValue());
                return Unit.a;
            case 25:
                zuh zuhVar = (zuh) obj2;
                Context context = (Context) obj;
                context.getClass();
                bzg bzgVar = new bzg(context, true);
                bzgVar.j(zuhVar.o, null, zuhVar.k, null);
                return bzgVar;
            case 26:
                SportReorderComposeDialogFragment sportReorderComposeDialogFragment = (SportReorderComposeDialogFragment) obj2;
                String str = (String) obj;
                str.getClass();
                ((zqb) sportReorderComposeDialogFragment.B.getValue()).n(str);
                sportReorderComposeDialogFragment.k(false, false);
                return Unit.a;
            case 27:
                ((kx4) obj).getClass();
                return new r6a(((int) ((xnh) obj2).h()) & 4294967295L);
            case 28:
                StageCategoryRankingFragment stageCategoryRankingFragment = (StageCategoryRankingFragment) obj2;
                StageSeason stageSeason = (StageSeason) obj;
                stageCategoryRankingFragment.C().l = stageSeason.getUniqueStage();
                stageCategoryRankingFragment.D().g = Integer.valueOf(stageSeason.getId());
                stageCategoryRankingFragment.D().h = stageSeason.getUniqueStage();
                stageCategoryRankingFragment.D().k();
                return Unit.a;
            default:
                StageConstructorActivity stageConstructorActivity = (StageConstructorActivity) obj2;
                mqi mqiVar = stageConstructorActivity.M;
                e8i e8iVar = (e8i) obj;
                int i6 = StageConstructorActivity.R;
                stageConstructorActivity.Q().l.setRefreshing(false);
                as9.o(stageConstructorActivity.R(), stageConstructorActivity.X().g);
                if (e8iVar != null && (team = e8iVar.a) != null && !stageConstructorActivity.P) {
                    stageConstructorActivity.P = true;
                    NotificationsActionButton notificationsActionButton = stageConstructorActivity.Q;
                    if (notificationsActionButton != null) {
                        notificationsActionButton.i(team, (FavoritesEventsData) stageConstructorActivity.X().t.a.getValue(), true);
                    }
                    int id = team.getId();
                    Intent intent = stageConstructorActivity.getIntent();
                    intent.getClass();
                    FirebaseBundle firebaseBundle = new FirebaseBundle();
                    String F = nv.F(intent);
                    if (F != null) {
                        firebaseBundle.putString(Payload.CAMPAIGN_ID, F);
                    }
                    nv.h(firebaseBundle, intent);
                    firebaseBundle.putInt("id", id);
                    firebaseBundle.putString("location", nv.G(intent).a);
                    nv.N(stageConstructorActivity, firebaseBundle, "open_constructor");
                    new c2i(stageConstructorActivity, 2);
                    stageConstructorActivity.Q().l.setEnabled(false);
                    stageConstructorActivity.S(team, tba.p(stageConstructorActivity, team), team.getCountry(), null, false);
                    stageConstructorActivity.Q().d.setBackground(new vy0(team.getId()));
                    stageConstructorActivity.Q().k.setAdapter((n2i) mqiVar.getValue());
                    kp5 kp5Var = m2i.g;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : kp5Var) {
                        if (((Boolean) ((m2i) obj5).b.invoke(e8iVar)).booleanValue()) {
                            arrayList.add(obj5);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        d41.w((n2i) mqiVar.getValue(), (m2i) it.next());
                    }
                    m2i m2iVar = stageConstructorActivity.O;
                    if (m2iVar != null) {
                        stageConstructorActivity.O = null;
                        int D = ((n2i) mqiVar.getValue()).D(m2iVar);
                        Integer valueOf = D >= 0 ? Integer.valueOf(D) : null;
                        if (valueOf != null) {
                            stageConstructorActivity.Q().k.c(valueOf.intValue(), false);
                        }
                    }
                }
                return Unit.a;
        }
    }
}
