package com.sofascore.results.featureWalkthrough;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.sofascore.results.base.compose.architecture.ComposeFullScreenDialogFragment;
import defpackage.aal;
import defpackage.bka;
import defpackage.hkg;
import defpackage.hl7;
import defpackage.joa;
import defpackage.kt7;
import defpackage.pea;
import defpackage.tc3;
import defpackage.vt7;
import defpackage.y9l;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z9l;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/featureWalkthrough/FeatureWalkthroughFullScreenDialog;", "Lcom/sofascore/results/base/compose/architecture/ComposeFullScreenDialogFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FeatureWalkthroughFullScreenDialog extends ComposeFullScreenDialogFragment {
    public final joa v = ypa.a(ysa.c, new kt7(this, 0));
    public final tc3 w = new tc3(-652414053, new hl7(this, 9), true);

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

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        this.r.b = ((vt7) this.v.getValue()).b();
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog
    public final String q() {
        return ((vt7) this.v.getValue()).a();
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeFullScreenDialogFragment
    /* renamed from: u, reason: from getter */
    public final tc3 getW() {
        return this.w;
    }
}
