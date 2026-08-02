package com.sofascore.results.fantasy.league.settings;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import defpackage.a99;
import defpackage.duf;
import defpackage.fuf;
import defpackage.j37;
import defpackage.krk;
import defpackage.m57;
import defpackage.n57;
import defpackage.otk;
import defpackage.r57;
import defpackage.tc3;
import defpackage.wrh;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/fantasy/league/settings/FantasyLeagueSettingsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lwrh;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyLeagueSettingsFragment extends Hilt_FantasyLeagueSettingsFragment<wrh> {
    public final otk r;
    public final otk s;

    public FantasyLeagueSettingsFragment() {
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(r57.class), new n57(this, 0), new n57(this, 2), new n57(this, 1));
        this.s = new otk(fufVar.getOrCreateKotlinClass(j37.class), new n57(this, 3), new n57(this, 5), new n57(this, 4));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return wrh.b(getLayoutInflater(), null, false);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "SettingsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        ComposeView composeView = ((wrh) krkVar).b;
        composeView.setViewCompositionStrategy(a99.i);
        composeView.setContent(new tc3(-1232112581, new m57(this, 0), true));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
    }
}
