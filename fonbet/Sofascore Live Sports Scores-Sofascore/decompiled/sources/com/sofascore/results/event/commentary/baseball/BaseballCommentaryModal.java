package com.sofascore.results.event.commentary.baseball;

import android.os.Bundle;
import android.view.View;
import com.sofascore.results.R;
import defpackage.duf;
import defpackage.joa;
import defpackage.otk;
import defpackage.q81;
import defpackage.t21;
import defpackage.tc3;
import defpackage.w1;
import defpackage.x1;
import defpackage.y1;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/event/commentary/baseball/BaseballCommentaryModal;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BaseballCommentaryModal extends Hilt_BaseballCommentaryModal {
    public final otk C;

    public BaseballCommentaryModal() {
        joa a = ypa.a(ysa.c, new w1(new w1(this, 14), 15));
        this.C = new otk(duf.a.getOrCreateKotlinClass(q81.class), new x1(a, 9), new y1(9, this, a), new x1(a, 10));
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H */
    public final tc3 getE() {
        return new tc3(-474171614, new t21(this, 14), true);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        this.t.a = Integer.valueOf(((q81) this.C.getValue()).f);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "AtBatDetailsModal";
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog, com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x */
    public final boolean getX() {
        return false;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(R.string.baseball_at_bat_details);
        string.getClass();
        return string;
    }
}
