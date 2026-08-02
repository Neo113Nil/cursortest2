package com.sofascore.results.fantasy.walkthrough.createteam.selectreplacement;

import android.os.Bundle;
import android.view.View;
import defpackage.duf;
import defpackage.fuf;
import defpackage.gk7;
import defpackage.hl7;
import defpackage.joa;
import defpackage.l07;
import defpackage.l27;
import defpackage.op7;
import defpackage.otk;
import defpackage.tc3;
import defpackage.vp7;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z07;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/walkthrough/createteam/selectreplacement/FantasyWalkthroughSelectReplacementDialogFragment;", "Lcom/sofascore/results/base/compose/architecture/ComposeFullScreenDialogFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyWalkthroughSelectReplacementDialogFragment extends Hilt_FantasyWalkthroughSelectReplacementDialogFragment {
    public final otk A;
    public final otk B;

    public FantasyWalkthroughSelectReplacementDialogFragment() {
        joa a = ypa.a(ysa.c, new l07(new op7(this, 3), 27));
        fuf fufVar = duf.a;
        this.A = new otk(fufVar.getOrCreateKotlinClass(gk7.class), new l27(a, 21), new z07(14, this, a), new l27(a, 22));
        this.B = new otk(fufVar.getOrCreateKotlinClass(vp7.class), new op7(this, 0), new op7(this, 2), new op7(this, 1));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        w().o = null;
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
        return new tc3(-282192228, new hl7(this, 8), true);
    }

    public final vp7 w() {
        return (vp7) this.B.getValue();
    }
}
