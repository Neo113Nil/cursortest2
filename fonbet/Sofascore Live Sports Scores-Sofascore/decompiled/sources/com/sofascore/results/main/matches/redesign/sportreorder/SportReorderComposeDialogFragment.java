package com.sofascore.results.main.matches.redesign.sportreorder;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import defpackage.a0i;
import defpackage.aal;
import defpackage.bka;
import defpackage.bte;
import defpackage.duf;
import defpackage.fuf;
import defpackage.fvg;
import defpackage.hkg;
import defpackage.joa;
import defpackage.otk;
import defpackage.pea;
import defpackage.rzh;
import defpackage.tc3;
import defpackage.vce;
import defpackage.wsf;
import defpackage.y9l;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z9l;
import defpackage.zqb;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/main/matches/redesign/sportreorder/SportReorderComposeDialogFragment;", "Lcom/sofascore/results/base/compose/architecture/ComposeFullScreenDialogFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SportReorderComposeDialogFragment extends Hilt_SportReorderComposeDialogFragment {
    public final otk A;
    public final otk B;

    public SportReorderComposeDialogFragment() {
        joa a = ypa.a(ysa.c, new vce(new rzh(this, 3), 29));
        fuf fufVar = duf.a;
        this.A = new otk(fufVar.getOrCreateKotlinClass(a0i.class), new wsf(a, 5), new bte(this, a, 10), new wsf(a, 6));
        this.B = new otk(fufVar.getOrCreateKotlinClass(zqb.class), new rzh(this, 0), new rzh(this, 2), new rzh(this, 1));
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog, androidx.fragment.app.DialogFragment
    public final Dialog l(Bundle bundle) {
        Dialog l = super.l(bundle);
        Window window = l.getWindow();
        if (window != null) {
            bka bkaVar = new bka(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            pea aalVar = i >= 35 ? new aal(window, bkaVar) : i >= 30 ? new z9l(window, bkaVar) : new y9l(window, bkaVar);
            l.getContext().getClass();
            aalVar.C(!hkg.b0(r4));
            l.getContext().getClass();
            aalVar.B(!hkg.b0(r4));
        }
        return l;
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog
    public final String q() {
        return "ReorderSportsModal";
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeFullScreenDialogFragment
    /* renamed from: u */
    public final tc3 getW() {
        return new tc3(-1773085409, new fvg(this, 19), true);
    }
}
