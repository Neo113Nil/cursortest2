package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.SwitchPreference;
import com.inmobi.media.Rd;
import com.ironsource.U3;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.newNetwork.AttributeOverviewData;
import com.sofascore.results.R;
import com.sofascore.results.dialog.PreviousTournamentsModal;
import com.sofascore.results.dialog.RemoveAdsYearlyOfferBottomSheet;
import com.sofascore.results.event.details.view.promotion.PromotionModal;
import com.sofascore.results.league.fragment.details.PopularPlayersModal;
import com.sofascore.results.player.dialog.PlayerPentagonDescriptionModal;
import com.sofascore.results.player.media.PlayerMediaFragment;
import com.sofascore.results.pots.POTSActivity;
import com.sofascore.results.profile.edit.ProfileEditActivity;
import com.sofascore.results.profile.topLeaderboards.ProfileTopLeaderboardFragment;
import com.sofascore.results.profile.topLeaderboards.ProfileTopLeaderboardInfoModal;
import com.sofascore.results.profile.view.ProfileBadgesExplanationModal;
import com.sofascore.results.profile.view.ProfilePredictionStatisticsView;
import com.sofascore.results.referral.ReferralRedeemRewardBottomSheet;
import com.sofascore.results.view.graph.RatingColorLegendView;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import com.sofascore.results.weeklyChallenge.leaderboard.LeaderboardInfoModal;
import com.sofascore.results.weeklyChallenge.leaderboard.PreviousWeeklyLeaderboardFragment;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.io.File;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlin.text.c;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ate implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ate(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x023f, code lost:
    
        if (r1 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0241, code lost:
    
        r1 = com.sofascore.results.R.string.virtual_return_on_investment_info;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0244, code lost:
    
        r10 = r10.getString(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x024d, code lost:
    
        r10.getClass();
        defpackage.f7a.w(r0, r2, r10, "StatisticsModal", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0257, code lost:
    
        return kotlin.Unit.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0249, code lost:
    
        r1 = com.sofascore.results.R.string.points_VROI_info_bubble;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0234, code lost:
    
        r3 = com.sofascore.results.R.string.points;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x021b, code lost:
    
        if (defpackage.xld.g(r0) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x020c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r2.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18"), "25_or_older") != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x021e, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x021f, code lost:
    
        r0 = r10.getContext();
        r0.getClass();
        r2 = r10.getContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x022a, code lost:
    
        if (r1 == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x022c, code lost:
    
        r3 = com.sofascore.results.R.string.return_on_investment;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x022f, code lost:
    
        r2 = r2.getString(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0238, code lost:
    
        r2.getClass();
        r10 = r10.getContext();
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        SharedPreferences d;
        int T;
        Pair pair;
        Pair pair2;
        ProtoWriter forwardWriter_delegate$lambda$0;
        int i = this.a;
        boolean z = true;
        int i2 = 4;
        int i3 = 6;
        int i4 = 3;
        rq3 rq3Var = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle requireArguments = ((PlayerMediaFragment) obj).requireArguments();
                requireArguments.getClass();
                Serializable M = gz8.M(requireArguments, "PLAYER", Player.class);
                if (M != null) {
                    return (Player) M;
                }
                a70.p("Serializable PLAYER not found");
                return null;
            case 1:
                nue nueVar = (nue) obj;
                nueVar.n();
                int i5 = POTSActivity.O;
                Context context = nueVar.getContext();
                context.getClass();
                Intent intent = new Intent(context, (Class<?>) POTSActivity.class);
                intent.putExtra("InitialTab", (Serializable) null);
                context.startActivity(intent);
                return Unit.a;
            case 2:
                Bundle requireArguments2 = ((PlayerPentagonDescriptionModal) obj).requireArguments();
                requireArguments2.getClass();
                Serializable M2 = gz8.M(requireArguments2, "ATTRIBUTE_OVERVIEW", AttributeOverviewData.class);
                if (M2 != null) {
                    return (AttributeOverviewData) M2;
                }
                a70.p("Serializable ATTRIBUTE_OVERVIEW not found");
                return null;
            case 3:
                ArrayList arrayList = ((vwe) obj).g;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((View) it.next()).getVisibility() == 0) {
                            return Integer.valueOf(i2);
                        }
                    }
                }
                i2 = 0;
                return Integer.valueOf(i2);
            case 4:
                return LayoutInflater.from(((dxe) obj).a);
            case 5:
                a0f a0fVar = (a0f) obj;
                m5h w = aik.w("kotlinx.serialization.Polymorphic", zze.f, new SerialDescriptor[0], new mme(a0fVar, i3));
                KClass kClass = a0fVar.a;
                kClass.getClass();
                return new fq3(w, kClass);
            case 6:
                PopularPlayersModal popularPlayersModal = (PopularPlayersModal) obj;
                Context requireContext = popularPlayersModal.requireContext();
                requireContext.getClass();
                u1f u1fVar = new u1f(requireContext);
                u1fVar.a.d = new pte(popularPlayersModal, i4);
                return u1fVar;
            case 7:
                ((SwitchPreference) obj).z(true);
                return Unit.a;
            case 8:
                Context requireContext2 = ((PreviousTournamentsModal) obj).requireContext();
                requireContext2.getClass();
                return new q6f(requireContext2);
            case 9:
                Context requireContext3 = ((PreviousWeeklyLeaderboardFragment) obj).requireContext();
                requireContext3.getClass();
                WeeklyChallengeViewModel.LeaderboardInfoType leaderboardInfoType = WeeklyChallengeViewModel.LeaderboardInfoType.ZONE_INFO;
                leaderboardInfoType.getClass();
                LeaderboardInfoModal leaderboardInfoModal = new LeaderboardInfoModal();
                Bundle bundle = new Bundle();
                bundle.putSerializable("info_type", leaderboardInfoType);
                leaderboardInfoModal.setArguments(bundle);
                if (requireContext3 instanceof csk) {
                    requireContext3 = ((csk) requireContext3).getBaseContext();
                }
                AppCompatActivity appCompatActivity = requireContext3 instanceof AppCompatActivity ? (AppCompatActivity) requireContext3 : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(leaderboardInfoModal, appCompatActivity, rq3Var, i4));
                }
                return Unit.a;
            case 10:
                ((kjk) obj).getClass();
                UUID randomUUID = UUID.randomUUID();
                randomUUID.getClass();
                String uuid = randomUUID.toString();
                uuid.getClass();
                return uuid;
            case 11:
                ProfileBadgesExplanationModal profileBadgesExplanationModal = (ProfileBadgesExplanationModal) obj;
                Context requireContext4 = profileBadgesExplanationModal.requireContext();
                requireContext4.getClass();
                FirebaseBundle firebaseBundle = new FirebaseBundle();
                ia0 ia0Var = ia0.q;
                me4.d((f5d) me4.e(), "editor_banner_click", firebaseBundle, requireContext4).a.e(n9e.K(firebaseBundle), null, "editor_banner_click", false);
                FragmentActivity requireActivity = profileBadgesExplanationModal.requireActivity();
                requireActivity.getClass();
                bea.G(requireActivity, "https://play.google.com/store/apps/details?id=com.sofascore.editor");
                return Unit.a;
            case 12:
                int i6 = ProfileEditActivity.L;
                Bundle extras = ((ProfileEditActivity) obj).getIntent().getExtras();
                if (extras != null) {
                    return extras.getString("OPEN_PROFILE_ID");
                }
                return null;
            case 13:
                q9f q9fVar = (q9f) obj;
                g9f g9fVar = g9f.a;
                q9fVar.getClass();
                if (g9fVar.equals(g9fVar)) {
                    xw3.L(un0.z(q9fVar), null, null, new gje(q9fVar, rq3Var, 13), 3);
                    return Unit.a;
                }
                zzl.b();
                return null;
            case 14:
                l2d l2dVar = (l2d) obj;
                int i7 = ProfilePredictionStatisticsView.c;
                Context context2 = l2dVar.getContext();
                context2.getClass();
                if (zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = context2.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    ccd ccdVar = vl.b;
                    break;
                }
                bga bgaVar = xld.a;
                Context context3 = l2dVar.getContext();
                context3.getClass();
                break;
            case 15:
                return ((maf) obj).b.getDrawable(R.drawable.ic_daily_10x);
            case 16:
                fbf fbfVar = (fbf) obj;
                return new eaf(fbfVar.e, fbfVar.f, fbfVar.h, fbfVar.g);
            case 17:
                Bundle requireArguments3 = ((ProfileTopLeaderboardFragment) obj).requireArguments();
                requireArguments3.getClass();
                Serializable M3 = gz8.M(requireArguments3, "LEADERBOARD_TYPE", gta.class);
                if (M3 != null) {
                    return (gta) M3;
                }
                a70.p("Serializable LEADERBOARD_TYPE not found");
                return null;
            case 18:
                Bundle requireArguments4 = ((ProfileTopLeaderboardInfoModal) obj).requireArguments();
                requireArguments4.getClass();
                Serializable M4 = gz8.M(requireArguments4, "LEADERBOARD_TYPE", gta.class);
                if (M4 != null) {
                    return (gta) M4;
                }
                a70.p("Serializable LEADERBOARD_TYPE not found");
                return null;
            case 19:
                Bundle requireArguments5 = ((PromotionModal) obj).requireArguments();
                requireArguments5.getClass();
                Serializable M5 = gz8.M(requireArguments5, "promotional_offer", bef.class);
                if (M5 != null) {
                    return (bef) M5;
                }
                a70.p("Serializable promotional_offer not found");
                return null;
            case 20:
                return Float.valueOf(((a88) obj).invoke() < 1.0f ? 0.3f : 1.0f);
            case 21:
                RatingColorLegendView ratingColorLegendView = (RatingColorLegendView) obj;
                int i8 = RatingColorLegendView.f;
                Path path = new Path();
                RectF rectF = ratingColorLegendView.b;
                float f = ratingColorLegendView.c;
                path.addRoundRect(rectF, f, f, Path.Direction.CW);
                return path;
            case 22:
                return Rd.a((Rd) obj);
            case 23:
                return Integer.valueOf(((Context) ((ejg) obj).c).getColor(R.color.n_lv_4));
            case 24:
                ((ReferralRedeemRewardBottomSheet) obj).j();
                return Unit.a;
            case 25:
                r7d[] r7dVarArr = (r7d[]) obj;
                r7d[] r7dVarArr2 = (r7d[]) Arrays.copyOf(r7dVarArr, r7dVarArr.length);
                Object[] copyOf = Arrays.copyOf(r7dVarArr2, r7dVarArr2.length);
                SnapshotStateList snapshotStateList = new SnapshotStateList();
                snapshotStateList.addAll(ph0.X(copyOf));
                return new c6d(snapshotStateList);
            case 26:
                ((RemoveAdsYearlyOfferBottomSheet) obj).j();
                return Unit.a;
            case 27:
                o1g o1gVar = (o1g) obj;
                ClassLoader classLoader = o1gVar.c;
                s18 s18Var = o1gVar.d;
                Enumeration<URL> resources = classLoader.getResources("");
                resources.getClass();
                ArrayList<URL> list = Collections.list(resources);
                list.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (URL url : list) {
                    url.getClass();
                    if (Intrinsics.c(url.getProtocol(), U3.i.b)) {
                        String str = uae.b;
                        pair2 = new Pair(s18Var, tnf.k(new File(url.toURI())));
                    } else {
                        pair2 = null;
                    }
                    if (pair2 != null) {
                        arrayList2.add(pair2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                resources2.getClass();
                ArrayList<URL> list2 = Collections.list(resources2);
                list2.getClass();
                ArrayList arrayList3 = new ArrayList();
                for (URL url2 : list2) {
                    url2.getClass();
                    String url3 = url2.toString();
                    url3.getClass();
                    if (c.v(url3, "jar:file:", false) && (T = StringsKt.T("!", url3, 6)) != -1) {
                        String str2 = uae.b;
                        pair = new Pair(qha.H(tnf.k(new File(URI.create(url3.substring(4, T)))), s18Var, new osf(12)), o1g.f);
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList3.add(pair);
                    }
                }
                return CollectionsKt.w0(arrayList3, arrayList2);
            case 28:
                forwardWriter_delegate$lambda$0 = ReverseProtoWriter.forwardWriter_delegate$lambda$0((ReverseProtoWriter) obj);
                return forwardWriter_delegate$lambda$0;
            default:
                ((Runnable) obj).run();
                return Unit.a;
        }
    }
}
