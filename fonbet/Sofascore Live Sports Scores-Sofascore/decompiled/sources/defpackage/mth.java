package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.work.impl.WorkDatabase;
import com.blaze.blazesdk.custom_views.BlazeTextWithIconButton;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.features.moments.widgets.compose.BlazeComposeWidgetMomentsStateHandler;
import com.blaze.blazesdk.features.shared.models.ui_shared.i;
import com.blaze.blazesdk.features.stories.widgets.compose.BlazeComposeWidgetStoriesStateHandler;
import com.blaze.blazesdk.features.videos.widgets.compose.BlazeComposeWidgetVideosStateHandler;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerCtaIconStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerCtaStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
import com.blaze.blazesdk.style.shared.models.BlazeDp;
import com.inmobi.media.AbstractC3378e;
import com.inmobi.media.C3401em;
import com.inmobi.media.N0;
import com.inmobi.media.Vg;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.TeamLinkedRound;
import com.sofascore.model.network.response.TeamAverageRatingVersion;
import com.sofascore.model.newNetwork.newRankings.RankingRow;
import com.sofascore.model.profile.ReferralResponse;
import com.sofascore.model.profile.UserBadge;
import com.sofascore.results.dialog.SofascoreRatingBottomSheetDialog;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.league.fragment.topStats.TopStatsCategory;
import com.sofascore.results.profile.UserProfileActivity;
import com.sofascore.results.profile.view.UserBadgesGridView;
import com.sofascore.results.ranking.RankingsActivity;
import com.sofascore.results.referral.ReferralActivity;
import com.sofascore.results.team.statistics.TeamSeasonStatisticsFragment;
import com.unity3d.services.UnityAdsConstants;
import defpackage.lrl;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class mth implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mth(Integer num, Function1 function1, jqk jqkVar) {
        this.a = 10;
        this.b = num;
        this.d = function1;
        this.c = jqkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = 3;
        int i3 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                t1h t1hVar = (t1h) obj2;
                Function1 function1 = (Function1) obj;
                if (!Intrinsics.c(obj3, t1hVar.getItem())) {
                    function1.invoke(t1hVar.getItem());
                }
                return Unit.a;
            case 1:
                ((vt) obj3).invoke((TeamLinkedRound) obj2);
                PopupWindow popupWindow = ((m0j) obj).d;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                }
                return Unit.a;
            case 2:
                TeamSeasonStatisticsFragment teamSeasonStatisticsFragment = (TeamSeasonStatisticsFragment) obj3;
                Double d = (Double) obj2;
                TeamAverageRatingVersion teamAverageRatingVersion = (TeamAverageRatingVersion) obj;
                FragmentActivity requireActivity = teamSeasonStatisticsFragment.requireActivity();
                requireActivity.getClass();
                gvh gvhVar = gvh.c;
                int id = teamSeasonStatisticsFragment.I().getId();
                String H = teamSeasonStatisticsFragment.H();
                H.getClass();
                SofascoreRatingBottomSheetDialog sofascoreRatingBottomSheetDialog = new SofascoreRatingBottomSheetDialog();
                Bundle bundle = new Bundle();
                bundle.putString("sport_slug", H);
                bundle.putInt("rating_type", 3);
                if (d != null) {
                    bundle.putDouble(CampaignEx.JSON_KEY_STAR, d.doubleValue());
                }
                bundle.putInt("entity_id", id);
                bundle.putString("avg_rating_version", teamAverageRatingVersion.name());
                sofascoreRatingBottomSheetDialog.setArguments(bundle);
                AppCompatActivity appCompatActivity = requireActivity instanceof AppCompatActivity ? (AppCompatActivity) requireActivity : null;
                if (appCompatActivity != null) {
                    wca.x(appCompatActivity.getLifecycle()).b(new r1(sofascoreRatingBottomSheetDialog, appCompatActivity, objArr == true ? 1 : 0, i2));
                }
                return Unit.a;
            case 3:
                a99.A(LeagueActivity.h0, (Context) obj3, Integer.valueOf(((g29) obj2).b), null, ((f29) obj).e, null, null, null, 4080);
                return Unit.a;
            case 4:
                Context context = (Context) obj3;
                int i4 = RankingsActivity.O;
                jmf jmfVar = ((c6j) obj2).c;
                Team team = ((RankingRow) obj).getTeam();
                jaa.N(context, jmfVar, team != null ? Integer.valueOf(team.getId()) : null);
                return Unit.a;
            case 5:
                Context context2 = (Context) obj3;
                TopStatsCategory topStatsCategory = (TopStatsCategory) obj2;
                SofascoreRatingBottomSheetDialog e = v9f.e(topStatsCategory.e0(), null, null, (String) obj, topStatsCategory.getE(), 6);
                if (context2 instanceof csk) {
                    context2 = ((csk) context2).getBaseContext();
                }
                AppCompatActivity appCompatActivity2 = context2 instanceof AppCompatActivity ? (AppCompatActivity) context2 : null;
                if (appCompatActivity2 != null) {
                    wca.x(appCompatActivity2.getLifecycle()).b(new r1(e, appCompatActivity2, objArr2 == true ? 1 : 0, i2));
                }
                return Unit.a;
            case 6:
                UserBadge userBadge = (UserBadge) obj2;
                y8f y8fVar = (y8f) obj;
                int i5 = UserBadgesGridView.a;
                c38 c38Var = new c38(i5h.g(new tsk((UserBadgesGridView) obj3), rg2.E));
                while (c38Var.hasNext()) {
                    jfk jfkVar = (jfk) c38Var.next();
                    boolean z = jfkVar.getUserBadgeValue() == userBadge;
                    ((ImageView) jfkVar.o.d).setVisibility(z ? 0 : 8);
                    jfkVar.setSelected(z);
                }
                y8fVar.invoke(userBadge);
                return Unit.a;
            case 7:
                Context context3 = (Context) obj3;
                int i6 = UserProfileActivity.S;
                nv.m0(context3, "referral", "own_profile");
                de deVar = ((UserProfileActivity) obj2).Q;
                ReferralResponse referralResponse = (ReferralResponse) ((e1d) obj).getValue();
                Intent intent = new Intent(context3, (Class<?>) ReferralActivity.class);
                intent.putExtra("extra_referral", referralResponse);
                deVar.a(intent, null);
                return Unit.a;
            case 8:
                Function1 function12 = (Function1) obj;
                e1d e1dVar = (e1d) obj2;
                ((e1d) obj3).setValue(qqk.c);
                ale aleVar = (ale) e1dVar.getValue();
                if (aleVar != null) {
                    aleVar.play();
                }
                if (function12 != null) {
                    function12.invoke((ale) e1dVar.getValue());
                }
                return Unit.a;
            case 9:
                fcl fclVar = (fcl) obj3;
                UUID uuid = (UUID) obj2;
                md4 md4Var = (md4) obj;
                fclVar.getClass();
                String uuid2 = uuid.toString();
                rik o = rik.o();
                uuid.toString();
                Objects.toString(md4Var);
                o.getClass();
                WorkDatabase workDatabase = fclVar.a;
                workDatabase.beginTransaction();
                try {
                    lcl e2 = workDatabase.g().e(uuid2);
                    if (e2 == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (e2.b == sbl.b) {
                        dcl dclVar = new dcl(uuid2, md4Var);
                        ecl f = workDatabase.f();
                        f.getClass();
                        gz8.S(f.a, false, true, new bcl(i3, f, dclVar));
                    } else {
                        rik.o().getClass();
                    }
                    workDatabase.setTransactionSuccessful();
                    return null;
                } catch (Throwable th) {
                    try {
                        rik.o().getClass();
                        throw th;
                    } finally {
                        workDatabase.endTransaction();
                    }
                }
            case 10:
                Integer num = (Integer) obj3;
                Function1 function13 = (Function1) obj;
                jqk jqkVar = (jqk) obj2;
                if (num != null) {
                    function13.invoke(new xgl(jqkVar.a, num.intValue(), jqkVar.b, jqkVar.e));
                }
                return Unit.a;
            case 11:
                return AbstractC3378e.a((Function0) obj3, (N0) obj2, (Vg) obj);
            case 12:
                return C3401em.a((XmlPullParser) obj3, (C3401em) obj2, (dsf) obj);
            case 13:
                return C3401em.a((XmlPullParser) obj3, (C3401em) obj2, (ArrayList) obj);
            case 14:
                e1d e1dVar2 = (e1d) obj3;
                zbm zbmVar = (zbm) obj;
                Object value = e1dVar2.getValue();
                String str = ((lrl.c) ((lrl) obj2)).a;
                if (!Intrinsics.c(value, str)) {
                    e1dVar2.setValue(str);
                    zbmVar.getClass();
                    str.getClass();
                    BlazeDataSourceType.Search search = new BlazeDataSourceType.Search(str, null, null, 6, null);
                    BlazeComposeWidgetStoriesStateHandler.updateDataSource$default(zbmVar.a, search, false, 2, null);
                    BlazeComposeWidgetMomentsStateHandler.updateDataSource$default(zbmVar.b, search, false, 2, null);
                    BlazeComposeWidgetVideosStateHandler.updateDataSource$default(zbmVar.c, search, false, 2, null);
                }
                return Unit.a;
            case 15:
                View view = (View) obj2;
                Function0 function0 = (Function0) obj;
                if (((ovm) obj3).a.a(erm.PLAYER)) {
                    view.setVisibility(8);
                    view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    function0.invoke();
                }
                return Unit.a;
            default:
                BlazeVideosPlayerStyle blazeVideosPlayerStyle = (BlazeVideosPlayerStyle) obj3;
                e0n e0nVar = (e0n) obj2;
                uxm uxmVar = e0nVar.b;
                n4m n4mVar = (n4m) obj;
                boolean z2 = e0n.n;
                BlazeVideosPlayerCtaStyle cta = blazeVideosPlayerStyle.getCta();
                if (!cta.isVisible()) {
                    BlazeTextWithIconButton blazeTextWithIconButton = uxmVar.m;
                    blazeTextWithIconButton.getClass();
                    blazeTextWithIconButton.setVisibility(8);
                    return Unit.a;
                }
                i iVar = n4mVar.i;
                Object[] objArr3 = iVar != null && nq8.s(iVar);
                BlazeTextWithIconButton blazeTextWithIconButton2 = uxmVar.m;
                blazeTextWithIconButton2.setText(iVar != null ? iVar.b : null);
                blazeTextWithIconButton2.setTextSize(cta.getTextSize());
                BlazeTextWithIconButton.setTypefaceFromResource$default(blazeTextWithIconButton2, cta.getFontResId(), null, null, 6, null);
                blazeTextWithIconButton2.setRadius(blazeVideosPlayerStyle.getCta().getCornerRadius().getToPx$blazesdk_release());
                if (iVar != null) {
                    l6g.x(blazeTextWithIconButton2, iVar);
                }
                BlazeVideosPlayerCtaIconStyle icon = blazeVideosPlayerStyle.getCta().getIcon();
                if (icon != null) {
                    if (t0n.c[icon.getIconPositioning().ordinal()] != 1) {
                        zzl.b();
                        return null;
                    }
                    blazeTextWithIconButton2.setDrawableStart(icon.getIconResId());
                    Integer iconTint = icon.getIconTint();
                    if (iconTint != null) {
                        blazeTextWithIconButton2.setDrawableStartTintColor(iconTint.intValue());
                    } else if (iVar != null) {
                        try {
                            Integer rgbaToColorInt$default = ipl.rgbaToColorInt$default(ipl.a, iVar.e, null, 2, null);
                            if (rgbaToColorInt$default != null) {
                                blazeTextWithIconButton2.setDrawableStartTintColor(rgbaToColorInt$default.intValue());
                                Unit unit = Unit.a;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                blazeTextWithIconButton2.setOnClickListener(new ivj(10, e0nVar, n4mVar));
                mm3 mm3Var = new mm3();
                ConstraintLayout constraintLayout = uxmVar.a;
                BlazeTextWithIconButton blazeTextWithIconButton3 = uxmVar.m;
                mm3Var.e(constraintLayout);
                mm3Var.j(blazeTextWithIconButton3.getId()).d.c = blazeVideosPlayerStyle.getCta().getHeight().getToPx$blazesdk_release();
                BlazeDp width = blazeVideosPlayerStyle.getCta().getWidth();
                if (width != null) {
                    mm3Var.j(blazeTextWithIconButton3.getId()).d.b = width.getToPx$blazesdk_release();
                } else {
                    mm3Var.j(blazeTextWithIconButton3.getId()).d.b = -2;
                }
                constraintLayout.getId();
                mm3Var.d(blazeTextWithIconButton3.getId(), 7);
                mm3Var.j(blazeTextWithIconButton3.getId()).b.a = objArr3 == true ? 0 : 8;
                mm3Var.a(constraintLayout);
                return Unit.a;
        }
    }

    public /* synthetic */ mth(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ mth(Function1 function1, e1d e1dVar, e1d e1dVar2) {
        this.a = 8;
        this.d = function1;
        this.b = e1dVar;
        this.c = e1dVar2;
    }
}
