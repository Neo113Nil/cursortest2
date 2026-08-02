package com.sofascore.results.wc26.bottomSheet;

import android.os.Parcelable;
import com.sofascore.results.R;
import com.sofascore.results.wc26.data.WorldCupLastDanceUiModel;
import defpackage.av8;
import defpackage.eqf;
import defpackage.kch;
import defpackage.l4a;
import defpackage.nmi;
import defpackage.of3;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/wc26/bottomSheet/WorldCupLastDanceShareBottomSheet;", "Lcom/sofascore/results/sharemodal/compose/BaseShareComposeBottomSheetModal;", "Lcom/sofascore/results/wc26/data/WorldCupLastDanceUiModel;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WorldCupLastDanceShareBottomSheet extends Hilt_WorldCupLastDanceShareBottomSheet<WorldCupLastDanceUiModel> {
    public final Class E = WorldCupLastDanceUiModel.class;
    public final kch F = kch.LAST_DANCE;
    public final int G = R.string.fifa_wc_2026_end_of_an_era;
    public final int H = R.string.fifa_wc_2026_end_of_an_era_share;

    @Override // com.sofascore.results.sharemodal.compose.BaseShareComposeBottomSheetModal
    public final int L(Parcelable parcelable) {
        return ((WorldCupLastDanceUiModel) parcelable).a;
    }

    @Override // com.sofascore.results.sharemodal.compose.BaseShareComposeBottomSheetModal
    /* renamed from: M, reason: from getter */
    public final kch getF() {
        return this.F;
    }

    @Override // com.sofascore.results.sharemodal.compose.BaseShareComposeBottomSheetModal
    /* renamed from: N, reason: from getter */
    public final Class getE() {
        return this.E;
    }

    @Override // com.sofascore.results.sharemodal.compose.BaseShareComposeBottomSheetModal
    /* renamed from: O, reason: from getter */
    public final int getH() {
        return this.H;
    }

    @Override // com.sofascore.results.sharemodal.compose.BaseShareComposeBottomSheetModal
    /* renamed from: P, reason: from getter */
    public final int getG() {
        return this.G;
    }

    @Override // com.sofascore.results.sharemodal.compose.BaseShareComposeBottomSheetModal
    public final String Q(Parcelable parcelable) {
        return ((WorldCupLastDanceUiModel) parcelable).b;
    }

    @Override // com.sofascore.results.sharemodal.compose.BaseShareComposeBottomSheetModal
    public final String R(Parcelable parcelable) {
        return ((WorldCupLastDanceUiModel) parcelable).f;
    }

    @Override // com.sofascore.results.sharemodal.compose.BaseShareComposeBottomSheetModal
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final void K(WorldCupLastDanceUiModel worldCupLastDanceUiModel, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-25213709);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(worldCupLastDanceUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            l4a.d(worldCupLastDanceUiModel, null, av8Var, i2 & 14);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(this, worldCupLastDanceUiModel, i, 21);
        }
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "WorldCupLastDanceShareModal";
    }
}
