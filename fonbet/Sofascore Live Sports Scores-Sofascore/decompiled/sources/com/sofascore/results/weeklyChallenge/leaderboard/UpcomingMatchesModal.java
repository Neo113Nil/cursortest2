package com.sofascore.results.weeklyChallenge.leaderboard;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import defpackage.duf;
import defpackage.fdk;
import defpackage.gdk;
import defpackage.j72;
import defpackage.otk;
import defpackage.qdj;
import defpackage.tc3;
import defpackage.ygi;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/weeklyChallenge/leaderboard/UpcomingMatchesModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UpcomingMatchesModal extends BaseModalBottomSheetDialog {
    public final otk w = new otk(duf.a.getOrCreateKotlinClass(WeeklyChallengeViewModel.class), new gdk(this, 0), new gdk(this, 2), new gdk(this, 1));
    public final boolean x = true;

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        composeView.setContent(new tc3(-1805705657, new fdk(this, 0), true));
        return composeView;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        j72.t(((WeeklyChallengeViewModel) this.w.getValue()).p).e(getViewLifecycleOwner(), new ygi(12, new qdj(this, 13)));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "UpcomingMatchesModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getX() {
        return this.x;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(R.string.weekly_challenge_every_vote_counts);
        string.getClass();
        return string;
    }
}
