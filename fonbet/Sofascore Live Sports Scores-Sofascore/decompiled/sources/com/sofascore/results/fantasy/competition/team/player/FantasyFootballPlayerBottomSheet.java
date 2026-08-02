package com.sofascore.results.fantasy.competition.team.player;

import android.os.Bundle;
import android.view.View;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import defpackage.duf;
import defpackage.fi5;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.iz2;
import defpackage.iz6;
import defpackage.joa;
import defpackage.l0;
import defpackage.lz6;
import defpackage.otk;
import defpackage.rq3;
import defpackage.rse;
import defpackage.t06;
import defpackage.tc3;
import defpackage.un0;
import defpackage.wca;
import defpackage.xp6;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z45;
import defpackage.zy6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/competition/team/player/FantasyFootballPlayerBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public class FantasyFootballPlayerBottomSheet extends Hilt_FantasyFootballPlayerBottomSheet {
    public final otk C;

    public FantasyFootballPlayerBottomSheet() {
        joa a = ypa.a(ysa.c, new t06(new t06(this, 27), 28));
        this.C = new otk(duf.a.getOrCreateKotlinClass(lz6.class), new xp6(a, 17), new fi5(this, a, 27), new xp6(a, 18));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final void E() {
        lz6 M = M();
        int i = M.k;
        int i2 = M.m;
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = M.j;
        int i3 = fantasyRoundPlayerUiModel.g.a;
        boolean z = fantasyRoundPlayerUiModel.m;
        boolean z2 = M.n;
        iz2 z3 = un0.z(M);
        hs4 hs4Var = z45.a;
        xw3.L(z3, hq4.c, null, new iz6(i2, M, z, z2, i3, i, null), 2);
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H */
    public final tc3 getC() {
        return new tc3(-1413631406, new zy6(this, 1), true);
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    public final Function2 I() {
        return new tc3(-1385558152, new zy6(this, 0), true);
    }

    public rse L() {
        return null;
    }

    public final lz6 M() {
        return (lz6) this.C.getValue();
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        this.t.a = Integer.valueOf(M().j.a);
        rq3 rq3Var = null;
        if (M().j.w) {
            wca.x(getLifecycle()).b(new l0(this, rq3Var, 24));
            return;
        }
        lz6 M = M();
        int i = M.k;
        int i2 = M.m;
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = M.j;
        int i3 = fantasyRoundPlayerUiModel.g.a;
        boolean z = fantasyRoundPlayerUiModel.m;
        boolean z2 = M.n;
        iz2 z3 = un0.z(M);
        hs4 hs4Var = z45.a;
        xw3.L(z3, hq4.c, null, new iz6(i2, M, z, z2, i3, i, null), 2);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "FantasyPlayerDetailsModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: u */
    public final int getV() {
        return 30;
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog, com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x */
    public final boolean getY() {
        return true;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
