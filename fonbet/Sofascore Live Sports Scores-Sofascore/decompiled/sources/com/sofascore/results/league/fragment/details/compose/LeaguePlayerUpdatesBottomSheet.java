package com.sofascore.results.league.fragment.details.compose;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.results.R;
import com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog;
import defpackage.duf;
import defpackage.faa;
import defpackage.gz8;
import defpackage.hkg;
import defpackage.kva;
import defpackage.mya;
import defpackage.otk;
import defpackage.tc3;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/league/fragment/details/compose/LeaguePlayerUpdatesBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "Lgv9;", "Llxe;", "updates", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LeaguePlayerUpdatesBottomSheet extends ComposeModalBottomSheetDialog {
    public final otk x = new otk(duf.a.getOrCreateKotlinClass(kva.class), new mya(this, 0), new mya(this, 2), new mya(this, 1));

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H */
    public final tc3 getF() {
        return new tc3(1240413330, new faa(this, 10), true);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        this.t.a = (Integer) gz8.M(requireArguments, "UNIQUE_TOURNAMENT_ID", Integer.class);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "AllTradesInjuriesModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        Gender gender = (Gender) gz8.M(requireArguments, "PLAYER_GENDER", Gender.class);
        Context requireContext = requireContext();
        requireContext.getClass();
        return hkg.Q(requireContext, R.string.player_updates, gender, new Object[0]);
    }
}
