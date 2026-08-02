package com.sofascore.results.fantasy.comparison.selectplayer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import defpackage.a99;
import defpackage.aba;
import defpackage.ay5;
import defpackage.duf;
import defpackage.fi5;
import defpackage.fuf;
import defpackage.gk7;
import defpackage.joa;
import defpackage.krk;
import defpackage.otk;
import defpackage.qo6;
import defpackage.ro6;
import defpackage.so6;
import defpackage.t06;
import defpackage.tc3;
import defpackage.wrh;
import defpackage.yc7;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/fantasy/comparison/selectplayer/FantasyComparisonPlayersDialogFragment;", "Lcom/sofascore/results/dialog/BaseFullScreenDialog;", "Lwrh;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyComparisonPlayersDialogFragment extends Hilt_FantasyComparisonPlayersDialogFragment<wrh> {
    public final joa A;
    public final otk B;
    public final otk C;

    public FantasyComparisonPlayersDialogFragment() {
        qo6 qo6Var = new qo6(this, 0);
        ysa ysaVar = ysa.c;
        this.A = ypa.a(ysaVar, qo6Var);
        joa a = ypa.a(ysaVar, new t06(new so6(this, 3), 14));
        fuf fufVar = duf.a;
        this.B = new otk(fufVar.getOrCreateKotlinClass(gk7.class), new ay5(a, 27), new fi5(this, a, 17), new ay5(a, 28));
        this.C = new otk(fufVar.getOrCreateKotlinClass(yc7.class), new so6(this, 0), new so6(this, 2), new so6(this, 1));
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ((gk7) this.B.getValue()).o();
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog
    public final String q() {
        return "SelectReplacementTab";
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog
    public final krk s(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        wrh b = wrh.b(layoutInflater, viewGroup, false);
        ComposeView composeView = b.b;
        composeView.setViewCompositionStrategy(a99.i);
        aba.F(composeView);
        composeView.setContent(new tc3(1290547824, new ro6(this, composeView, 0), true));
        return b;
    }
}
