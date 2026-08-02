package com.sofascore.results.crowdsourcing;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import defpackage.a44;
import defpackage.a99;
import defpackage.aba;
import defpackage.b44;
import defpackage.duf;
import defpackage.fuf;
import defpackage.ip1;
import defpackage.j63;
import defpackage.joa;
import defpackage.krk;
import defpackage.otk;
import defpackage.p24;
import defpackage.q54;
import defpackage.tc3;
import defpackage.tr3;
import defpackage.wca;
import defpackage.wrh;
import defpackage.x34;
import defpackage.xw3;
import defpackage.y1;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z34;
import defpackage.z8e;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t²\u0006\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\b\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/crowdsourcing/CrowdsourcingIncidentDetailsFullScreenDialog;", "Lcom/sofascore/results/dialog/BaseFullScreenDialog;", "Lwrh;", "<init>", "()V", "Ln44;", "state", "Lr54;", "staticFormData", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CrowdsourcingIncidentDetailsFullScreenDialog extends Hilt_CrowdsourcingIncidentDetailsFullScreenDialog<wrh> {
    public final otk A;
    public final otk B;

    public CrowdsourcingIncidentDetailsFullScreenDialog() {
        fuf fufVar = duf.a;
        this.A = new otk(fufVar.getOrCreateKotlinClass(tr3.class), new b44(this, 0), new b44(this, 2), new b44(this, 1));
        joa a = ypa.a(ysa.c, new j63(new b44(this, 3), 5));
        this.B = new otk(fufVar.getOrCreateKotlinClass(q54.class), new p24(a, 1), new y1(22, this, a), new p24(a, 2));
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog, androidx.fragment.app.DialogFragment
    public final Dialog l(Bundle bundle) {
        Dialog l = super.l(bundle);
        Window window = l.getWindow();
        if (window != null) {
            window.addFlags(67108864);
        }
        Window window2 = l.getWindow();
        if (window2 != null) {
            window2.addFlags(Integer.MIN_VALUE);
        }
        return l;
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        xw3.L(wca.x(getLifecycle()), null, null, new z34(this, null), 3);
        z8e.v(this, v().m, new a44(this, null));
        z8e.v(this, v().k, new ip1(this, null, 9));
        super.onViewCreated(view, bundle);
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog
    public final String q() {
        return "CrowdsourcingAddGoalModal";
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog
    public final krk s(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        wrh b = wrh.b(layoutInflater, viewGroup, false);
        ComposeView composeView = b.b;
        composeView.setViewCompositionStrategy(a99.i);
        aba.F(composeView);
        composeView.setContent(new tc3(245409215, new x34(this, 0), true));
        return b;
    }

    public final q54 v() {
        return (q54) this.B.getValue();
    }
}
