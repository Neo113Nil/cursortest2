package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.EsportsGame;
import com.sofascore.model.newNetwork.EsportsGameStatistics;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fg5 extends o8 {
    public final p12 d;
    public final int e;
    public final int f;
    public Event g;
    public EsportsGame h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg5(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.background_image;
        ImageView imageView = (ImageView) nq8.B(R.id.background_image, root);
        if (imageView != null) {
            i = R.id.first_icons_container;
            LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.first_icons_container, root);
            if (linearLayout != null) {
                i = R.id.first_team_cs_indicator;
                TextView textView = (TextView) nq8.B(R.id.first_team_cs_indicator, root);
                if (textView != null) {
                    i = R.id.first_team_logo;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.first_team_logo, root);
                    if (imageView2 != null) {
                        i = R.id.first_team_side_indicator;
                        View B = nq8.B(R.id.first_team_side_indicator, root);
                        if (B != null) {
                            i = R.id.score_container;
                            View B2 = nq8.B(R.id.score_container, root);
                            if (B2 != null) {
                                v82 c = v82.c(B2);
                                i = R.id.second_icons_container;
                                LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.second_icons_container, root);
                                if (linearLayout2 != null) {
                                    i = R.id.second_team_cs_indicator;
                                    TextView textView2 = (TextView) nq8.B(R.id.second_team_cs_indicator, root);
                                    if (textView2 != null) {
                                        i = R.id.second_team_logo;
                                        ImageView imageView3 = (ImageView) nq8.B(R.id.second_team_logo, root);
                                        if (imageView3 != null) {
                                            i = R.id.second_team_side_indicator;
                                            View B3 = nq8.B(R.id.second_team_side_indicator, root);
                                            if (B3 != null) {
                                                this.d = new p12((ConstraintLayout) root, imageView, linearLayout, textView, imageView2, B, c, linearLayout2, textView2, imageView3, B3);
                                                this.e = ao2.s(Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE, context);
                                                this.f = ao2.s(140, context);
                                                setVisibility(8);
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer getIndicatorsLOL$lambda$0() {
        return Integer.valueOf(R.drawable.ic_cloud_drake);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer getIndicatorsLOL$lambda$1() {
        return Integer.valueOf(R.drawable.ic_infernal_drake);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer getIndicatorsLOL$lambda$2() {
        return Integer.valueOf(R.drawable.ic_mountain_drake);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer getIndicatorsLOL$lambda$3() {
        return Integer.valueOf(R.drawable.ic_ocean_drake);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer getIndicatorsLOL$lambda$4() {
        return Integer.valueOf(R.drawable.ic_hextech_drake);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer getIndicatorsLOL$lambda$5() {
        return Integer.valueOf(R.drawable.ic_chemtech_drake);
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.esports_games_header_layout;
    }

    public final ArrayList r(EsportsGameStatistics esportsGameStatistics) {
        Integer chemtechDrakeKills;
        Integer hextechDrakeKills;
        Integer oceanDrakeKills;
        Integer mountainDrakeKills;
        Integer infernalDrakeKills;
        Integer cloudDrakeKills;
        int i = 0;
        List q = i5h.q(i5h.p(e5h.d(new ag5(11)), (esportsGameStatistics == null || (cloudDrakeKills = esportsGameStatistics.getCloudDrakeKills()) == null) ? 0 : cloudDrakeKills.intValue()));
        List q2 = i5h.q(i5h.p(e5h.d(new ag5(12)), (esportsGameStatistics == null || (infernalDrakeKills = esportsGameStatistics.getInfernalDrakeKills()) == null) ? 0 : infernalDrakeKills.intValue()));
        List q3 = i5h.q(i5h.p(e5h.d(new ag5(13)), (esportsGameStatistics == null || (mountainDrakeKills = esportsGameStatistics.getMountainDrakeKills()) == null) ? 0 : mountainDrakeKills.intValue()));
        List q4 = i5h.q(i5h.p(e5h.d(new ag5(14)), (esportsGameStatistics == null || (oceanDrakeKills = esportsGameStatistics.getOceanDrakeKills()) == null) ? 0 : oceanDrakeKills.intValue()));
        List q5 = i5h.q(i5h.p(e5h.d(new ag5(15)), (esportsGameStatistics == null || (hextechDrakeKills = esportsGameStatistics.getHextechDrakeKills()) == null) ? 0 : hextechDrakeKills.intValue()));
        ml3 d = e5h.d(new ag5(16));
        if (esportsGameStatistics != null && (chemtechDrakeKills = esportsGameStatistics.getChemtechDrakeKills()) != null) {
            i = chemtechDrakeKills.intValue();
        }
        ArrayList w0 = CollectionsKt.w0(i5h.q(i5h.p(d, i)), CollectionsKt.w0(q5, CollectionsKt.w0(q4, CollectionsKt.w0(q3, CollectionsKt.w0(q2, q)))));
        ArrayList arrayList = new ArrayList();
        Iterator it = w0.iterator();
        while (it.hasNext()) {
            Drawable drawable = getContext().getDrawable(((Number) it.next()).intValue());
            if (drawable != null) {
                arrayList.add(drawable);
            }
        }
        return arrayList;
    }

    public final void s(EsportsGameStatistics esportsGameStatistics, EsportsGameStatistics esportsGameStatistics2) {
        p12 p12Var = this.d;
        v82 v82Var = (v82) p12Var.h;
        Context context = getContext();
        context.getClass();
        EsportsGame esportsGame = this.h;
        if (esportsGame == null) {
            Intrinsics.i("game");
            throw null;
        }
        Event event = this.g;
        if (event == null) {
            Intrinsics.i("event");
            throw null;
        }
        tol.x(v82Var, context, esportsGame, event.getTournament().getCategory().getId() == 1572, true);
        Context context2 = getContext();
        context2.getClass();
        int s = ao2.s(24, context2);
        LinearLayout linearLayout = (LinearLayout) p12Var.f;
        LinearLayout linearLayout2 = (LinearLayout) p12Var.i;
        linearLayout.removeAllViews();
        linearLayout2.removeAllViews();
        ArrayList r = r(esportsGameStatistics);
        List<Drawable> B0 = CollectionsKt.B0(r(esportsGameStatistics2));
        ArrayList arrayList = new ArrayList(k13.r(r, 10));
        Iterator it = r.iterator();
        while (it.hasNext()) {
            Drawable drawable = (Drawable) it.next();
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawable);
            arrayList.add(imageView);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ImageView imageView2 = (ImageView) it2.next();
            linearLayout.addView(imageView2);
            imageView2.getLayoutParams().width = s;
            imageView2.getLayoutParams().height = s;
        }
        ArrayList arrayList2 = new ArrayList(k13.r(B0, 10));
        for (Drawable drawable2 : B0) {
            ImageView imageView3 = new ImageView(getContext());
            imageView3.setImageDrawable(drawable2);
            arrayList2.add(imageView3);
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            ImageView imageView4 = (ImageView) it3.next();
            linearLayout2.addView(imageView4);
            imageView4.getLayoutParams().width = s;
            imageView4.getLayoutParams().height = s;
        }
        linearLayout.setVisibility(linearLayout.getChildCount() > 0 ? 0 : 8);
        linearLayout2.setVisibility(linearLayout2.getChildCount() <= 0 ? 8 : 0);
    }
}
