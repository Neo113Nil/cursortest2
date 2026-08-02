package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.blaze.blazesdk.features.moments.container.BlazeMomentsPlayerContainer;
import com.blaze.gam.custom_native.BlazeCustomNativeAdsProvider;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.sofascore.model.AnalystOfferRemoteConfig;
import com.sofascore.model.chat.Message;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.newNetwork.MmaPostMatchVotingOptions;
import com.sofascore.results.R;
import com.sofascore.results.chat.fragment.AbstractChatFragment;
import com.sofascore.results.event.dialog.PlayerEventStatisticsModal;
import com.sofascore.results.event.odds.additionalodds.AdditionalOddsFragment;
import com.sofascore.results.event.odds.oddscomparison.AdditionalOddsComparisonFragment;
import com.sofascore.results.view.BellButton;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import com.unity3d.ads.core.data.datasource.AndroidUnityBootConfigDataSource;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class s1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v30, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit value$lambda$2$lambda$1$lambda$0;
        gv9 gv9Var;
        Object obj2;
        SharedPreferences d;
        Unit generateAd$lambda$5;
        Unit createMomentsPlayerWrapperView$lambda$8;
        Unit startPlaying$lambda$3;
        int i = 1;
        switch (this.a) {
            case 0:
                AbstractChatFragment abstractChatFragment = (AbstractChatFragment) this.b;
                Message message = (Message) this.c;
                Context requireContext = abstractChatFragment.requireContext();
                requireContext.getClass();
                ur2.a(requireContext, abstractChatFragment.L(), (bq2) obj, message, abstractChatFragment.K());
                return Unit.a;
            case 1:
                ((wzc) this.b).c((k6f) this.c);
                return Unit.a;
            case 2:
                ndb ndbVar = (ndb) this.b;
                AccessibilityManager accessibilityManager = (AccessibilityManager) this.c;
                if (((d6b) obj) == d6b.ON_RESUME) {
                    ndbVar.e(accessibilityManager);
                }
                return Unit.a;
            case 3:
                AdditionalOddsComparisonFragment additionalOddsComparisonFragment = (AdditionalOddsComparisonFragment) this.b;
                cdi cdiVar = (cdi) this.c;
                pld pldVar = (pld) obj;
                pldVar.getClass();
                if (additionalOddsComparisonFragment.t == null) {
                    ou4 ou4Var = new ou4(1);
                    additionalOddsComparisonFragment.t = ou4Var;
                    ou4Var.c(additionalOddsComparisonFragment.isResumed(), new mi(r2, pldVar, additionalOddsComparisonFragment, cdiVar));
                }
                return Unit.a;
            case 4:
                cj cjVar = (cj) obj;
                return cj.a(cjVar, ((ij) this.b).t(cjVar.f, cjVar.g), (gv9) this.c, null, null, null, 252);
            case 5:
                AdditionalOddsFragment additionalOddsFragment = (AdditionalOddsFragment) this.b;
                cdi cdiVar2 = (cdi) this.c;
                pld pldVar2 = (pld) obj;
                pldVar2.getClass();
                if (additionalOddsFragment.u == null) {
                    ou4 ou4Var2 = new ou4(1);
                    additionalOddsFragment.u = ou4Var2;
                    ou4Var2.c(additionalOddsFragment.isResumed(), new mi(i, pldVar2, additionalOddsFragment, cdiVar2));
                }
                return Unit.a;
            case 6:
                AlertDialog alertDialog = (AlertDialog) this.b;
                fsf fsfVar = (fsf) this.c;
                MmaPostMatchVotingOptions mmaPostMatchVotingOptions = (MmaPostMatchVotingOptions) obj;
                mmaPostMatchVotingOptions.getClass();
                alertDialog.getButton(-1).setEnabled(true);
                fsfVar.a = mmaPostMatchVotingOptions;
                return Unit.a;
            case 7:
                AnalystOfferRemoteConfig analystOfferRemoteConfig = (AnalystOfferRemoteConfig) this.b;
                String str = (String) this.c;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                sharedPreferences.getClass();
                return Long.valueOf(sharedPreferences.getLong(lnb.o("PREF_ANALYST_PROMOTION_MODAL_TIMESTAMP", analystOfferRemoteConfig.getStartDate(), str), 0L));
            case 8:
                sw swVar = (sw) this.b;
                ax axVar = (ax) this.c;
                long j = ((q85) obj).a;
                long j2 = swVar.G1() ? dnd.j(j, -1.0f) : dnd.j(j, 1.0f);
                axVar.a(swVar.J.i(Float.intBitsToFloat((int) (swVar.K == ewd.a ? j2 & 4294967295L : j2 >> 32))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return Unit.a;
            case 9:
                value$lambda$2$lambda$1$lambda$0 = AndroidUnityBootConfigDataSource.getValue$lambda$2$lambda$1$lambda$0((String) this.b, (fsf) this.c, (String) obj);
                return value$lambda$2$lambda$1$lambda$0;
            case 10:
                xnh xnhVar = (xnh) this.b;
                e1d e1dVar = (e1d) this.c;
                aej aejVar = (aej) obj;
                aejVar.getClass();
                if (aejVar.d()) {
                    xnhVar.i(xnhVar.h() - 1.0f);
                } else {
                    e1dVar.setValue(Boolean.TRUE);
                }
                return Unit.a;
            case 11:
                mw0 mw0Var = (mw0) this.b;
                nw0 nw0Var = (nw0) this.c;
                kgj kgjVar = mw0Var.o;
                if (kgjVar != null) {
                    kgjVar.b();
                }
                mw0Var.o = null;
                qa3 qa3Var = nw0Var.b;
                if (qa3Var != null) {
                    qa3Var.V(Unit.a);
                }
                nw0Var.b = null;
                return Unit.a;
            case 12:
                qx0 qx0Var = (qx0) this.b;
                zd3 zd3Var = (zd3) this.c;
                qx0Var.a(zd3Var);
                return new vx0(r2, qx0Var, zd3Var);
            case 13:
                fk1 fk1Var = (fk1) this.b;
                gv9 gv9Var2 = (gv9) this.c;
                int intValue = ((Integer) obj).intValue();
                return fk1Var.e + "-" + ((bm1) gv9Var2.get(intValue)).b;
            case 14:
                am1 am1Var = (am1) this.b;
                Season.SubSeasonType subSeasonType = (Season.SubSeasonType) this.c;
                fk1 fk1Var2 = (fk1) obj;
                fk1Var2.getClass();
                return fk1.a(fk1Var2, null, am1Var, subSeasonType, null, null, null, true, null, ModuleDescriptor.MODULE_VERSION);
            case 15:
                Function1 function1 = (Function1) this.b;
                pl1 pl1Var = (pl1) this.c;
                ml1 ml1Var = (ml1) obj;
                ml1Var.getClass();
                ?? r15 = ml1Var.a;
                function1.invoke(Intrinsics.c(pl1Var.c.c, r15) ? null : r15);
                return Unit.a;
            case 16:
                om1 om1Var = (om1) this.b;
                e1d e1dVar2 = (e1d) this.c;
                int intValue2 = ((Integer) obj).intValue();
                wsi wsiVar = (wsi) e1dVar2.getValue();
                if (wsiVar != null && (gv9Var = wsiVar.e) != null) {
                    Iterator it = gv9Var.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((nm1) obj2).a.a == intValue2) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    nm1 nm1Var = (nm1) obj2;
                    if (nm1Var != null) {
                        Integer num = nm1Var.b;
                        Event event = om1Var.e;
                        if (event != null) {
                            Context context = om1Var.getContext();
                            context.getClass();
                            Player player = nm1Var.c;
                            Team homeTeam$default = Event.getHomeTeam$default(event, null, 1, null);
                            int id = homeTeam$default.getId();
                            if (num == null || id != num.intValue()) {
                                homeTeam$default = null;
                            }
                            if (homeTeam$default == null) {
                                homeTeam$default = Event.getAwayTeam$default(event, null, 1, null);
                            }
                            Team team = homeTeam$default;
                            Integer num2 = (num == null || Event.getHomeTeam$default(event, null, 1, null).getId() != num.intValue()) ? null : 1;
                            PlayerEventStatisticsModal c = jpe.c(f8h.i(event, player, team, num2 != null ? num2.intValue() : 2, null, 96), null);
                            if (context instanceof csk) {
                                context = ((csk) context).getBaseContext();
                            }
                            AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
                            if (appCompatActivity != null) {
                                me4.n(c, appCompatActivity, null, wca.x(appCompatActivity.getLifecycle()));
                            }
                        }
                        return Unit.a;
                    }
                }
                return Unit.a;
            case 17:
                wcj wcjVar = (wcj) this.b;
                Function1 function12 = (Function1) this.c;
                wcj wcjVar2 = (wcj) obj;
                if (!Intrinsics.c(wcjVar, wcjVar2)) {
                    function12.invoke(wcjVar2);
                }
                return Unit.a;
            case 18:
                xw3.L((ku3) this.b, null, null, new l0((ie8) obj, (ykj) this.c, r3, 28), 3);
                return Unit.a;
            case 19:
                zr1 zr1Var = (zr1) this.b;
                fsf fsfVar2 = (fsf) this.c;
                Context context2 = (Context) obj;
                context2.getClass();
                ez0 f = ez0.f(LayoutInflater.from(context2));
                SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) f.c;
                Iterable iterable = zr1Var.p;
                if (iterable == null) {
                    iterable = km5.a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : iterable) {
                    if (!((as1) obj3).b) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((as1) it2.next()).a);
                }
                List c2 = a.c("ALL");
                ArrayList arrayList3 = new ArrayList(k13.r(iterable, 10));
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((as1) it3.next()).a);
                }
                ArrayList w0 = CollectionsKt.w0(arrayList3, c2);
                ArrayList arrayList4 = new ArrayList(k13.r(w0, 10));
                Iterator it4 = w0.iterator();
                while (it4.hasNext()) {
                    String str2 = (String) it4.next();
                    Set set = f5k.a;
                    arrayList4.add(new s1h(str2, f5k.a(context2, str2, null), !arrayList2.contains(str2)));
                }
                segmentedButtonsView.setBackgroundColor(context2.getColor(R.color.surface_1));
                Boolean bool = Boolean.FALSE;
                Pair pair = new Pair(bool, bool);
                segmentedButtonsView.k = new cyb(7, fsfVar2, zr1Var, f);
                segmentedButtonsView.g = false;
                segmentedButtonsView.h = pair;
                segmentedButtonsView.j = v1h.f;
                segmentedButtonsView.i = new z1h(0);
                rlh rlhVar = rlh.b;
                if (!rlhVar.isEmpty()) {
                    SegmentedButtonsView.t(segmentedButtonsView, rlhVar, null, 6);
                }
                segmentedButtonsView.s(arrayList4, (String) fsfVar2.a, true);
                segmentedButtonsView.setVisibility(w0.isEmpty() ? 8 : 0);
                return (LinearLayout) f.b;
            case 20:
                Function2 function2 = (Function2) this.b;
                ob6 ob6Var = (ob6) this.c;
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                function2.invoke(bool2, ob6Var.invoke());
                return Unit.a;
            case 21:
                BellButton bellButton = (BellButton) this.b;
                Stage stage = (Stage) this.c;
                ((Boolean) obj).getClass();
                int i2 = BellButton.h;
                Context context3 = bellButton.getContext();
                context3.getClass();
                nv.y(context3, vu.ADD_FAVORITE, xu.STAGE, stage.getId(), bellButton.getFollowSource());
                Context context4 = bellButton.getContext();
                context4.getClass();
                if (f6a.G(context4)) {
                    Context context5 = bellButton.getContext();
                    context5.getClass();
                    zic.W(context5);
                }
                return Unit.a;
            case 22:
                BellButton bellButton2 = (BellButton) this.b;
                UniqueStage uniqueStage = (UniqueStage) this.c;
                ((Boolean) obj).getClass();
                int i3 = BellButton.h;
                Context context6 = bellButton2.getContext();
                context6.getClass();
                SharedPreferences sharedPreferences2 = uic.j;
                if (sharedPreferences2 == null) {
                    Context applicationContext = context6.getApplicationContext();
                    synchronized (uic.i) {
                        d = a5f.d(applicationContext);
                        uic.j = d;
                    }
                    d.getClass();
                    sharedPreferences2 = d;
                }
                if (sharedPreferences2.getBoolean("PREF_SHOW_FOLLOW_UNIQUE_STAGE_INFO", true)) {
                    Context context7 = bellButton2.getContext();
                    context7.getClass();
                    if (zic.B(context7)) {
                        zic.E(context7, new h0(4, context7, uniqueStage));
                    } else {
                        zic.a0(context7, uniqueStage);
                    }
                }
                return Unit.a;
            case 23:
                BellButton bellButton3 = (BellButton) this.b;
                UniqueTournament uniqueTournament = (UniqueTournament) this.c;
                ((Boolean) obj).getClass();
                int i4 = BellButton.h;
                Context context8 = bellButton3.getContext();
                context8.getClass();
                int id2 = uniqueTournament.getId();
                String x = tba.x(uniqueTournament);
                if (x == null) {
                    x = "";
                }
                zic.R(context8, x, uniqueTournament.getCategory().getSport().getSlug(), id2);
                return Unit.a;
            case 24:
                generateAd$lambda$5 = BlazeCustomNativeAdsProvider.generateAd$lambda$5((BlazeCustomNativeAdsProvider) this.b, (qa3) this.c, (String) obj);
                return generateAd$lambda$5;
            case 25:
                createMomentsPlayerWrapperView$lambda$8 = BlazeMomentsPlayerContainer.createMomentsPlayerWrapperView$lambda$8((BlazeMomentsPlayerContainer) this.b, (Context) this.c, (rpl) obj);
                return createMomentsPlayerWrapperView$lambda$8;
            case 26:
                startPlaying$lambda$3 = BlazeMomentsPlayerContainer.startPlaying$lambda$3((BlazeMomentsPlayerContainer) this.b, (Function1) this.c, (View) obj);
                return startPlaying$lambda$3;
            case 27:
                b20 b20Var = (b20) this.b;
                n52 n52Var = (n52) this.c;
                yma ymaVar = (yma) obj;
                ymaVar.a();
                ha5.D(ymaVar, b20Var, n52Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 60);
                return Unit.a;
            case 28:
                cxd cxdVar = (cxd) this.b;
                n52 n52Var2 = (n52) this.c;
                yma ymaVar2 = (yma) obj;
                ymaVar2.a();
                ha5.D(ymaVar2, cxdVar.g, n52Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 60);
                return Unit.a;
            default:
                ((i1d) ((j0l) this.b).b).q((to3) this.c);
                return Unit.a;
        }
    }
}
