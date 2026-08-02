package com.sofascore.results.fantasy.league.settings.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import defpackage.a67;
import defpackage.a99;
import defpackage.aba;
import defpackage.b67;
import defpackage.duf;
import defpackage.fuf;
import defpackage.h67;
import defpackage.j37;
import defpackage.joa;
import defpackage.krk;
import defpackage.l07;
import defpackage.l27;
import defpackage.otk;
import defpackage.tc3;
import defpackage.wrh;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z07;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/fantasy/league/settings/dialog/FantasyLeagueTeamsFullScreenDialog;", "Lcom/sofascore/results/dialog/BaseFullScreenDialog;", "Lwrh;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyLeagueTeamsFullScreenDialog extends Hilt_FantasyLeagueTeamsFullScreenDialog<wrh> {
    public final otk A;
    public final otk B;

    public FantasyLeagueTeamsFullScreenDialog() {
        joa a = ypa.a(ysa.c, new l07(new b67(this, 3), 15));
        fuf fufVar = duf.a;
        this.A = new otk(fufVar.getOrCreateKotlinClass(h67.class), new l27(a, 7), new z07(7, this, a), new l27(a, 8));
        this.B = new otk(fufVar.getOrCreateKotlinClass(j37.class), new b67(this, 0), new b67(this, 2), new b67(this, 1));
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog
    public final String q() {
        return "TeamsModal";
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog
    public final krk s(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        wrh b = wrh.b(layoutInflater, viewGroup, false);
        ComposeView composeView = b.b;
        composeView.setViewCompositionStrategy(a99.i);
        aba.F(composeView);
        composeView.setContent(new tc3(1199330510, new a67(this, 0), true));
        return b;
    }
}
