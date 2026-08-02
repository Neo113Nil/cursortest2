package com.sofascore.results.crowdsourcing;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.sofascore.results.R;
import defpackage.a99;
import defpackage.aba;
import defpackage.duf;
import defpackage.fuf;
import defpackage.hy1;
import defpackage.ip1;
import defpackage.j63;
import defpackage.joa;
import defpackage.m24;
import defpackage.ny;
import defpackage.o24;
import defpackage.otk;
import defpackage.p24;
import defpackage.q3;
import defpackage.rq3;
import defpackage.tc3;
import defpackage.tr3;
import defpackage.w24;
import defpackage.wca;
import defpackage.wrh;
import defpackage.x1;
import defpackage.xw3;
import defpackage.y1;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/crowdsourcing/CrowdsourcingDeleteIncidentModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "Ls24;", "state", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CrowdsourcingDeleteIncidentModal extends Hilt_CrowdsourcingDeleteIncidentModal {
    public final otk B;
    public final otk C;
    public final boolean D;
    public ny E;

    public CrowdsourcingDeleteIncidentModal() {
        fuf fufVar = duf.a;
        this.B = new otk(fufVar.getOrCreateKotlinClass(tr3.class), new o24(this, 0), new o24(this, 2), new o24(this, 1));
        joa a = ypa.a(ysa.c, new j63(new o24(this, 3), 4));
        this.C = new otk(fufVar.getOrCreateKotlinClass(w24.class), new x1(a, 29), new y1(21, this, a), new p24(a, 0));
        this.D = true;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        wrh b = wrh.b(layoutInflater, (FrameLayout) v().l, false);
        ComposeView composeView = b.b;
        composeView.setViewCompositionStrategy(a99.i);
        aba.I(composeView);
        composeView.setContent(new tc3(1253618334, new m24(this, 0), true));
        FrameLayout frameLayout = b.a;
        frameLayout.getClass();
        return frameLayout;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        rq3 rq3Var = null;
        xw3.L(wca.x(getLifecycle()), null, null, new hy1(this, rq3Var, 23), 3);
        otk otkVar = this.C;
        z8e.v(this, ((w24) otkVar.getValue()).h, new q3(this, rq3Var, 17));
        z8e.v(this, ((w24) otkVar.getValue()).j, new ip1(this, rq3Var, 8));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "DeleteItemModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getI() {
        return this.D;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(R.string.crowdsourcing_delete_detail_title);
        string.getClass();
        return string;
    }
}
