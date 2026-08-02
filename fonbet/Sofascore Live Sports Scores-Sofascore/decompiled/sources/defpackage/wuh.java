package defpackage;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.Sports;
import com.sofascore.model.network.response.TeamAverageRatingVersion;
import com.sofascore.results.dialog.SofascoreRatingBottomSheetDialog;
import com.sofascore.results.featureWalkthrough.FeatureWalkthroughFullScreenDialog;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class wuh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SofascoreRatingBottomSheetDialog b;

    public /* synthetic */ wuh(SofascoreRatingBottomSheetDialog sofascoreRatingBottomSheetDialog, int i) {
        this.a = i;
        this.b = sofascoreRatingBottomSheetDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object u2gVar;
        int i = this.a;
        vt7 vt7Var = null;
        Object obj = null;
        SofascoreRatingBottomSheetDialog sofascoreRatingBottomSheetDialog = this.b;
        switch (i) {
            case 0:
                sofascoreRatingBottomSheetDialog.j();
                String F = sofascoreRatingBottomSheetDialog.F();
                if (F.equals(Sports.FOOTBALL)) {
                    vt7Var = ut7.a;
                } else if (F.equals(Sports.BASKETBALL)) {
                    vt7Var = tt7.a;
                }
                if (vt7Var != null) {
                    FeatureWalkthroughFullScreenDialog featureWalkthroughFullScreenDialog = new FeatureWalkthroughFullScreenDialog();
                    featureWalkthroughFullScreenDialog.setArguments(hz8.E(new Pair("TYPE", vt7Var.getKey())));
                    featureWalkthroughFullScreenDialog.p(sofascoreRatingBottomSheetDialog.requireActivity().k(), "FeatureWalkthroughFullScreenDialog");
                }
                return Unit.a;
            case 1:
                return sofascoreRatingBottomSheetDialog.requireArguments().getString("sport_slug", Sports.FOOTBALL);
            case 2:
                Iterator<E> it = gvh.i.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((gvh) next).ordinal() == sofascoreRatingBottomSheetDialog.requireArguments().getInt("rating_type", 0)) {
                            obj = next;
                        }
                    }
                }
                gvh gvhVar = (gvh) obj;
                return gvhVar == null ? gvh.g : gvhVar;
            case 3:
                if (sofascoreRatingBottomSheetDialog.requireArguments().containsKey(CampaignEx.JSON_KEY_STAR)) {
                    return Double.valueOf(sofascoreRatingBottomSheetDialog.requireArguments().getDouble(CampaignEx.JSON_KEY_STAR));
                }
                return null;
            case 4:
                if (sofascoreRatingBottomSheetDialog.requireArguments().containsKey("entity_id")) {
                    return Integer.valueOf(sofascoreRatingBottomSheetDialog.requireArguments().getInt("entity_id"));
                }
                return null;
            default:
                String string = sofascoreRatingBottomSheetDialog.requireArguments().getString("avg_rating_version");
                if (string != null) {
                    try {
                        p2g p2gVar = w2g.b;
                        u2gVar = TeamAverageRatingVersion.valueOf(string);
                    } catch (Throwable th) {
                        p2g p2gVar2 = w2g.b;
                        u2gVar = new u2g(th);
                    }
                    TeamAverageRatingVersion teamAverageRatingVersion = (TeamAverageRatingVersion) (u2gVar instanceof u2g ? null : u2gVar);
                    if (teamAverageRatingVersion != null) {
                        return teamAverageRatingVersion;
                    }
                }
                return TeamAverageRatingVersion.ORIGINAL;
        }
    }
}
