package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.textclassifier.TextClassification;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.impl.WorkDatabase;
import com.blaze.blazesdk.custom_views.BlazeTextView;
import com.blaze.blazesdk.players.ui.StatusIndicatorView;
import com.blaze.blazesdk.widgets.skeletons.SkeletonItemCustomView;
import com.inmobi.media.Rn;
import com.inmobi.media.Sn;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.util.ChatInterface;
import com.sofascore.results.R;
import com.sofascore.results.ads.iml.banner.AdBannerView;
import com.sofascore.results.chat.ChatActivity;
import com.sofascore.results.dialog.PreviousTournamentsModal;
import com.sofascore.results.feed.compose.model.ShortVideoFeedCardModel;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.league.fragment.details.compose.model.TeamOfTheWeekPlayerUIData;
import com.sofascore.results.player.statistics.compare.SeasonComparisonActivity;
import com.sofascore.results.stagesport.StageDetailsActivity;
import com.sofascore.results.stagesport.fragments.media.StageMediaFragment;
import com.sofascore.results.view.SofascoreRatingView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class deh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ deh(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        fqf fqfVar;
        String str;
        pqm binding_delegate$lambda$0;
        float f;
        long j;
        bej d;
        q5b q5bVar;
        q80 q80Var;
        int i = 3;
        int i2 = 2;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                lsb lsbVar = (lsb) this.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.c;
                synchronized (eeh.b) {
                    LinkedHashMap linkedHashMap = eeh.c;
                    linkedHashMap.remove(lsbVar);
                    if (linkedHashMap.isEmpty()) {
                        rik o = rik.o();
                        int i3 = kbl.a;
                        o.getClass();
                        connectivityManager.unregisterNetworkCallback(eeh.a);
                        eeh.f = null;
                        eeh.d = null;
                        eeh.e = false;
                    }
                }
                return Unit.a;
            case 1:
                ((Function1) this.b).invoke((ShortVideoFeedCardModel) this.c);
                return Unit.a;
            case 2:
                Context context = (Context) this.b;
                pv3 pv3Var = (pv3) this.c;
                bea.G(context, pv3Var.g);
                int i4 = pv3Var.a;
                FirebaseBundle firebaseBundle = new FirebaseBundle();
                firebaseBundle.putInt("id", i4);
                firebaseBundle.putString("location", "monetized_odds_tab");
                ia0 ia0Var = ia0.q;
                me4.d((f5d) me4.e(), "offer_click", firebaseBundle, context).a.e(n9e.K(firebaseBundle), null, "offer_click", false);
                return Unit.a;
            case 3:
                Context context2 = (Context) this.b;
                SkeletonItemCustomView skeletonItemCustomView = (SkeletonItemCustomView) this.c;
                int i5 = SkeletonItemCustomView.d;
                View inflate = LayoutInflater.from(context2).inflate(R.layout.blaze_layout_skeleton, (ViewGroup) skeletonItemCustomView, false);
                skeletonItemCustomView.addView(inflate);
                int i6 = R.id.blaze_skeleton_border;
                View B = nq8.B(R.id.blaze_skeleton_border, inflate);
                if (B != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    i6 = R.id.blaze_skeleton_image_container;
                    CardView cardView = (CardView) nq8.B(R.id.blaze_skeleton_image_container, inflate);
                    if (cardView != null) {
                        i6 = R.id.blaze_skeleton_title;
                        BlazeTextView blazeTextView = (BlazeTextView) nq8.B(R.id.blaze_skeleton_title, inflate);
                        if (blazeTextView != null) {
                            i6 = R.id.blaze_skeleton_widget_image;
                            CardView cardView2 = (CardView) nq8.B(R.id.blaze_skeleton_widget_image, inflate);
                            if (cardView2 != null) {
                                return new unm(constraintLayout, B, cardView, blazeTextView, cardView2);
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
                return null;
            case 4:
                return Sn.a((View) this.b, (Rn) this.c);
            case 5:
                gmh gmhVar = (gmh) this.b;
                cn6 cn6Var = (cn6) this.c;
                if (!Intrinsics.c(gmhVar, cn6Var.a)) {
                    o13.A(cn6Var.b, new qfg(gmhVar, 19));
                    eqf eqfVar = cn6Var.c;
                    if (eqfVar != null && (fqfVar = eqfVar.a) != null) {
                        fqfVar.f(eqfVar, null);
                    }
                }
                return Unit.a;
            case 6:
                wd8 wd8Var = (wd8) this.b;
                e1d e1dVar = (e1d) this.c;
                wd8.a(wd8Var);
                e1dVar.setValue(Boolean.FALSE);
                return Unit.a;
            case 7:
                ((Function1) this.b).invoke(new aw7(((euh) this.c).j.a, 14));
                return Unit.a;
            case 8:
                return SofascoreRatingView.l((SofascoreRatingView) this.b, (Context) this.c);
            case 9:
                ((Function1) this.b).invoke((hzh) this.c);
                return Unit.a;
            case 10:
                StageDetailsActivity stageDetailsActivity = (StageDetailsActivity) this.b;
                ChatInterface chatInterface = (ChatInterface) this.c;
                fff fffVar = StageDetailsActivity.T;
                if (stageDetailsActivity.Q().k.getCurrentItem() == 0) {
                    tu[] tuVarArr = tu.a;
                    str = "bubble";
                } else {
                    tu[] tuVarArr2 = tu.a;
                    str = "bubble_other_tab";
                }
                if (chatInterface != null) {
                    int i7 = ChatActivity.Z;
                    uic.w(stageDetailsActivity, chatInterface, str, 56);
                }
                return Unit.a;
            case 11:
                ((y4c) ((StageMediaFragment) this.b).s.getValue()).w((r5c) this.c);
                return Unit.a;
            case 12:
                binding_delegate$lambda$0 = StatusIndicatorView.binding_delegate$lambda$0((Context) this.b, (StatusIndicatorView) this.c);
                return binding_delegate$lambda$0;
            case 13:
                return ((cfi) this.b).invoke((WorkDatabase) this.c);
            case 14:
                bhi bhiVar = (bhi) this.b;
                String str2 = (String) this.c;
                Context context3 = bhiVar.getContext();
                context3.getClass();
                AdBannerView adBannerView = new AdBannerView(context3, null, 6);
                adBannerView.setCustomTargeting(sub.d(new Pair(SearchResponseKt.SPORT_ENTITY, str2)));
                adBannerView.setAdLoadedListener(new fl8(0, bhiVar, bhi.class, "startTimer", "startTimer()V", 0, 24));
                return adBannerView;
            case 15:
                ((keb) this.b).i((skd) this.c);
                return Unit.a;
            case 16:
                ((Function1) this.b).invoke(Integer.valueOf(((hwi) this.c).a));
                return Unit.a;
            case 17:
                ((Function1) this.b).invoke(new fxi(((kxi) this.c).c));
                return Unit.a;
            case 18:
                ((Function1) this.b).invoke(new gxi(((lxi) this.c).a));
                return Unit.a;
            case 19:
                return ccd.A(((Team) ((txi) this.c).u()).getId(), (Application) this.b);
            case 20:
                Function1 function1 = (Function1) this.b;
                TeamOfTheWeekPlayerUIData teamOfTheWeekPlayerUIData = (TeamOfTheWeekPlayerUIData) this.c;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(teamOfTheWeekPlayerUIData.a));
                }
                return Unit.a;
            case 21:
                float C0 = ((kx4) this.b).C0(((ksa) this.c).i());
                return new p75(C0 > 2.0f ? 2.0f : C0);
            case 22:
                g5j g5jVar = (g5j) this.b;
                Event event = (Event) this.c;
                Context context4 = g5jVar.getContext();
                context4.getClass();
                nv.z0(context4, kv.CLICK, "compare_teams_tennis", "details_tab");
                int i8 = SeasonComparisonActivity.L;
                Context context5 = g5jVar.getContext();
                context5.getClass();
                int id = Event.getHomeTeam$default(event, null, 1, null).getId();
                Integer valueOf = Integer.valueOf(Event.getAwayTeam$default(event, null, 1, null).getId());
                UniqueTournament uniqueTournament = event.getTournament().getUniqueTournament();
                Integer valueOf2 = uniqueTournament != null ? Integer.valueOf(uniqueTournament.getId()) : null;
                Season season = event.getTournament().getSeason();
                pxg.d(context5, id, valueOf, valueOf2, season != null ? Integer.valueOf(season.getId()) : null, event.getSeasonStatisticsType(), ok3.s(event), ok3.s(event));
                return Unit.a;
            case 23:
                ((nj8) this.b).p((n5j) this.c, true, true);
                return Unit.a;
            case 24:
                Context context6 = (Context) this.b;
                List list = (List) this.c;
                list.getClass();
                PreviousTournamentsModal previousTournamentsModal = new PreviousTournamentsModal();
                Bundle bundle = new Bundle();
                bundle.putSerializable("TOURNAMENT_LIST", new ArrayList(list));
                previousTournamentsModal.setArguments(bundle);
                if (context6 instanceof csk) {
                    context6 = ((csk) context6).getBaseContext();
                }
                AppCompatActivity appCompatActivity = context6 instanceof AppCompatActivity ? (AppCompatActivity) context6 : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(previousTournamentsModal, appCompatActivity, objArr == true ? 1 : 0, i));
                }
                return Unit.a;
            case 25:
                r6j r6jVar = (r6j) this.b;
                UniqueTournament uniqueTournament2 = (UniqueTournament) this.c;
                a99 a99Var = LeagueActivity.h0;
                Context context7 = r6jVar.getContext();
                context7.getClass();
                a99.A(a99Var, context7, Integer.valueOf(uniqueTournament2.getId()), null, null, null, null, null, 4088);
                return Unit.a;
            case 26:
                Context context8 = (Context) this.b;
                TextClassification textClassification = (TextClassification) this.c;
                String text = textClassification.getText();
                PendingIntent activity = PendingIntent.getActivity(context8, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    q9.D(activity);
                } else {
                    activity.send();
                }
                return Unit.a;
            case 27:
                r9j r9jVar = (r9j) this.b;
                dsf dsfVar = (dsf) this.c;
                r9jVar.t.d();
                if (r9jVar.n && ((ata) ((s8l) tgj.x(r9jVar, dh3.u))).b()) {
                    i2 = 1;
                }
                int i9 = dsfVar.a;
                int i10 = i2 * i9;
                dsfVar.a = i9 * (-1);
                return Integer.valueOf(i10);
            case 28:
                lcj lcjVar = (lcj) this.b;
                caj cajVar = (caj) this.c;
                if (!lcjVar.d) {
                    se8 se8Var = cajVar.A;
                    if (se8Var.n) {
                        ne8.s1(se8Var.v);
                    }
                }
                return Unit.a;
            default:
                tbj tbjVar = (tbj) this.b;
                long j2 = ((c7a) ((e1d) this.c).getValue()).a;
                dnd g = tbjVar.g();
                long j3 = 9205357640488583168L;
                if (g != null) {
                    long j4 = g.a;
                    q80 k = tbjVar.k();
                    if (k != null && k.b.length() != 0) {
                        k69 k69Var = (k69) ((eoh) tbjVar.q).getValue();
                        int i11 = k69Var == null ? -1 : vbj.a[k69Var.ordinal()];
                        if (i11 != -1) {
                            if (i11 == 1 || i11 == 2) {
                                f = 2.0f;
                                long j5 = tbjVar.l().b;
                                int i12 = pej.c;
                                j = j5 >> 32;
                            } else {
                                if (i11 != 3) {
                                    zzl.b();
                                    return null;
                                }
                                f = 2.0f;
                                long j6 = tbjVar.l().b;
                                int i13 = pej.c;
                                j = j6 & 4294967295L;
                            }
                            int i14 = (int) j;
                            q5b q5bVar2 = tbjVar.d;
                            if (q5bVar2 != null && (d = q5bVar2.d()) != null && (q5bVar = tbjVar.d) != null && (q80Var = (q80) q5bVar.a.b) != null) {
                                int c = llf.c(tbjVar.b.v(i14), 0, q80Var.b.length());
                                float intBitsToFloat = Float.intBitsToFloat((int) (d.d(j4) >> 32));
                                aej aejVar = d.a;
                                eyc eycVar = aejVar.b;
                                int d2 = eycVar.d(c);
                                float f2 = aejVar.f(d2);
                                float g2 = aejVar.g(d2);
                                float b = llf.b(intBitsToFloat, Math.min(f2, g2), Math.max(f2, g2));
                                if (c7a.a(j2, 0L) || Math.abs(intBitsToFloat - b) <= ((int) (j2 >> 32)) / 2) {
                                    float f3 = eycVar.f(d2);
                                    j3 = (Float.floatToRawIntBits(b) << 32) | (Float.floatToRawIntBits(((eycVar.b(d2) - f3) / f) + f3) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new dnd(j3);
        }
    }
}
