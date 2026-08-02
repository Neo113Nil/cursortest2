package com.sofascore.results.weeklyChallenge.leaderboard;

import android.view.LayoutInflater;
import android.view.View;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import defpackage.bta;
import defpackage.cta;
import defpackage.duf;
import defpackage.mqi;
import defpackage.otk;
import defpackage.sr8;
import defpackage.tc3;
import defpackage.ypa;
import defpackage.yso;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/weeklyChallenge/leaderboard/LeaderboardInfoModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LeaderboardInfoModal extends BaseModalBottomSheetDialog {
    public final boolean w = true;
    public final otk x = new otk(duf.a.getOrCreateKotlinClass(WeeklyChallengeViewModel.class), new cta(this, 0), new cta(this, 2), new cta(this, 1));
    public final mqi y = ypa.b(new sr8(this, 16));

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        return yso.s(this, new tc3(2025912685, new bta(this, 0), true));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return ((WeeklyChallengeViewModel.LeaderboardInfoType) this.y.getValue()).getAnalyticsName();
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getC() {
        return this.w;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(((WeeklyChallengeViewModel.LeaderboardInfoType) this.y.getValue()).getInfoTitleRes());
        string.getClass();
        return string;
    }
}
