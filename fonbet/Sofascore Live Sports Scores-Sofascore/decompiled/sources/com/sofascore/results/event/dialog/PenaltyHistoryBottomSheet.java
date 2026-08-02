package com.sofascore.results.event.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.sofascore.results.R;
import defpackage.ade;
import defpackage.duf;
import defpackage.jmc;
import defpackage.joa;
import defpackage.otk;
import defpackage.tc3;
import defpackage.uce;
import defpackage.vce;
import defpackage.wya;
import defpackage.x2e;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yso;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/event/dialog/PenaltyHistoryBottomSheet;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PenaltyHistoryBottomSheet extends Hilt_PenaltyHistoryBottomSheet {
    public final otk B;
    public final boolean C;

    public PenaltyHistoryBottomSheet() {
        joa a = ypa.a(ysa.c, new vce(new jmc(this, 29), 0));
        this.B = new otk(duf.a.getOrCreateKotlinClass(ade.class), new x2e(a, 1), new wya(25, this, a), new x2e(a, 2));
        this.C = true;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        return yso.s(this, new tc3(-366030682, new uce(this, 0), true));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.t.a = Integer.valueOf(requireArguments().getInt("takerPlayerId"));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "PlayerCareerPenaltyModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getC() {
        return this.C;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(R.string.football_player_penalty_record);
        string.getClass();
        return string;
    }
}
