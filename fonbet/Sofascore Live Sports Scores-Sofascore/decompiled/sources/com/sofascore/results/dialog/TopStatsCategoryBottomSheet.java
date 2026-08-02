package com.sofascore.results.dialog;

import android.os.Bundle;
import android.view.View;
import defpackage.duf;
import defpackage.joa;
import defpackage.koj;
import defpackage.otk;
import defpackage.q8i;
import defpackage.rmj;
import defpackage.tc3;
import defpackage.w1i;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/dialog/TopStatsCategoryBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "Lvnb;", "Lynj;", "state", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public class TopStatsCategoryBottomSheet extends Hilt_TopStatsCategoryBottomSheet {
    public final otk C = new otk(duf.a.getOrCreateKotlinClass(koj.class), new rmj(this, 0), new rmj(this, 2), new rmj(this, 1));
    public final boolean D = true;
    public final joa E = ypa.a(ysa.c, new w1i(this, 25));
    public final tc3 F = new tc3(235643717, new q8i(this, 28), true);

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H, reason: from getter */
    public final tc3 getE() {
        return this.F;
    }

    /* renamed from: M, reason: from getter */
    public boolean getD() {
        return this.D;
    }

    public koj N() {
        return (koj) this.C.getValue();
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        this.t.b = requireArguments().getString("STATS_TYPE", "");
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "TopPerformanceModal";
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog, com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x */
    public final boolean getX() {
        return false;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return (String) this.E.getValue();
    }
}
