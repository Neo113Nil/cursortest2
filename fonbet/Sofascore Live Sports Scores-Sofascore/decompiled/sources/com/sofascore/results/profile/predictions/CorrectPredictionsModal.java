package com.sofascore.results.profile.predictions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.profile.VoteStatistics;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.gz8;
import defpackage.nq8;
import defpackage.t22;
import defpackage.yhk;
import defpackage.yid;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/profile/predictions/CorrectPredictionsModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CorrectPredictionsModal extends BaseModalBottomSheetDialog {
    public t22 w;
    public final boolean x = true;

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.modal_correct_predictions, (ViewGroup) v().l, false);
        int i = R.id.with_odds;
        TextView textView = (TextView) nq8.B(R.id.with_odds, inflate);
        if (textView != null) {
            i = R.id.without_odds;
            TextView textView2 = (TextView) nq8.B(R.id.without_odds, inflate);
            if (textView2 != null) {
                this.w = new t22((LinearLayout) inflate, textView, textView2, 8);
                Bundle requireArguments = requireArguments();
                requireArguments.getClass();
                Serializable M = gz8.M(requireArguments, "VOTE_STATISTICS", VoteStatistics.class);
                if (M == null) {
                    a70.p("Serializable VOTE_STATISTICS not found");
                    return null;
                }
                VoteStatistics voteStatistics = (VoteStatistics) M;
                float totalVotesWithOdds = voteStatistics.getTotalVotesWithOdds();
                Number valueOf = totalVotesWithOdds > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.valueOf((voteStatistics.getCorrectVotesWithOdds() / totalVotesWithOdds) * 100.0f) : r2;
                t22 t22Var = this.w;
                if (t22Var == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                t22Var.c.setText(getString(R.string.profile_predictions_format, Integer.valueOf(voteStatistics.getCorrectVotesWithOdds()), Integer.valueOf(voteStatistics.getTotalVotesWithOdds()), yid.r(valueOf.intValue())));
                float totalVotesWithoutOdds = voteStatistics.getTotalVotesWithoutOdds();
                r2 = totalVotesWithoutOdds > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.valueOf((voteStatistics.getCorrectVotesWithoutOdds() / totalVotesWithoutOdds) * 100.0f) : 0;
                t22 t22Var2 = this.w;
                if (t22Var2 == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                t22Var2.d.setText(getString(R.string.profile_predictions_format, Integer.valueOf(voteStatistics.getCorrectVotesWithoutOdds()), Integer.valueOf(voteStatistics.getTotalVotesWithoutOdds()), yid.r(r2.intValue())));
                t22 t22Var3 = this.w;
                if (t22Var3 == null) {
                    Intrinsics.i("modalBinding");
                    throw null;
                }
                LinearLayout linearLayout = t22Var3.b;
                linearLayout.getClass();
                return linearLayout;
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        Serializable M = gz8.M(requireArguments, "ANALYTICS_TYPE", String.class);
        if (M != null) {
            this.t.b = (String) M;
        } else {
            a70.p("Serializable ANALYTICS_TYPE not found");
        }
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "CorrectPredictionsModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getW() {
        return this.x;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(R.string.correct_predictions);
        string.getClass();
        return string;
    }
}
