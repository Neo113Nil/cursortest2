package com.sofascore.results.fantasy.teammanagement.transfers.selectreplacement;

import android.os.Bundle;
import android.view.View;
import defpackage.ao7;
import defpackage.duf;
import defpackage.fuf;
import defpackage.gk7;
import defpackage.hl7;
import defpackage.joa;
import defpackage.l07;
import defpackage.l27;
import defpackage.mqi;
import defpackage.otk;
import defpackage.pi;
import defpackage.ps4;
import defpackage.tc3;
import defpackage.vz6;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z07;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/fantasy/teammanagement/transfers/selectreplacement/FantasyTransfersSelectReplacementDialogFragment;", "Lcom/sofascore/results/base/compose/architecture/ComposeFullScreenDialogFragment;", "<init>", "()V", "Lvn7;", "state", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyTransfersSelectReplacementDialogFragment extends Hilt_FantasyTransfersSelectReplacementDialogFragment {
    public final otk A;
    public final otk B;

    public FantasyTransfersSelectReplacementDialogFragment() {
        joa a = ypa.a(ysa.c, new l07(new l07(this, 25), 26));
        fuf fufVar = duf.a;
        this.A = new otk(fufVar.getOrCreateKotlinClass(gk7.class), new l27(a, 19), new z07(13, this, a), new l27(a, 20));
        mqi b = ypa.b(new ps4(this, 3));
        vz6 vz6Var = new vz6(b, 9);
        this.B = new otk(fufVar.getOrCreateKotlinClass(ao7.class), vz6Var, new pi(12, this, b), new vz6(b, 10));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        w().s = null;
        super.onDestroyView();
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ((gk7) this.A.getValue()).o();
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog
    public final String q() {
        return "SelectReplacementTab";
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeFullScreenDialogFragment
    /* renamed from: u */
    public final tc3 getW() {
        return new tc3(18557283, new hl7(this, 6), true);
    }

    public final ao7 w() {
        return (ao7) this.B.getValue();
    }
}
