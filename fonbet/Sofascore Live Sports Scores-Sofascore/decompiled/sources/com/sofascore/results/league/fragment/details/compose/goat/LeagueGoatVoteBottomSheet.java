package com.sofascore.results.league.fragment.details.compose.goat;

import android.os.Bundle;
import android.view.View;
import com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog;
import defpackage.duf;
import defpackage.fxa;
import defpackage.gxa;
import defpackage.hxa;
import defpackage.joa;
import defpackage.kva;
import defpackage.otk;
import defpackage.su;
import defpackage.tc3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/league/fragment/details/compose/goat/LeagueGoatVoteBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "Leva;", "data", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LeagueGoatVoteBottomSheet extends ComposeModalBottomSheetDialog {
    public final tc3 A;
    public final otk x;
    public final joa y;
    public final joa z;

    public LeagueGoatVoteBottomSheet() {
        int i = 0;
        int i2 = 1;
        this.x = new otk(duf.a.getOrCreateKotlinClass(kva.class), new hxa(this, i), new hxa(this, 2), new hxa(this, i2));
        fxa fxaVar = new fxa(this, i);
        ysa ysaVar = ysa.c;
        this.y = ypa.a(ysaVar, fxaVar);
        this.z = ypa.a(ysaVar, new fxa(this, i2));
        this.A = new tc3(-1745092732, new gxa(this, i), true);
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H */
    public final tc3 getD() {
        return new tc3(2058215667, new gxa(this, 1), true);
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    public final Function2 I() {
        return this.A;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        su suVar = this.t;
        suVar.b = "selection";
        suVar.g = (String) this.z.getValue();
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "GoatModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
