package com.sofascore.results.league.fragment.details.view;

import android.os.Bundle;
import android.view.View;
import com.sofascore.model.Sports;
import com.sofascore.results.R;
import com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog;
import defpackage.duf;
import defpackage.joa;
import defpackage.kva;
import defpackage.lqj;
import defpackage.nrj;
import defpackage.orj;
import defpackage.otk;
import defpackage.tc3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/league/fragment/details/view/TournamentPreviousWinnersBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TournamentPreviousWinnersBottomSheet extends ComposeModalBottomSheetDialog {
    public final otk x = new otk(duf.a.getOrCreateKotlinClass(kva.class), new orj(this, 0), new orj(this, 2), new orj(this, 1));
    public final joa y = ypa.a(ysa.c, new nrj(this, 0));

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H */
    public final tc3 getY() {
        return new tc3(-19099987, new lqj(this, 1), true);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        this.t.a = Integer.valueOf(requireArguments().getInt("UNIQUE_TOURNAMENT_ID"));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "AllTitlesModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(Intrinsics.c((String) this.y.getValue(), Sports.BASKETBALL) ? R.string.basketball_titles : R.string.tennis_titles);
        string.getClass();
        return string;
    }
}
