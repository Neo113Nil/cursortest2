package com.sofascore.results.fantasy.league.details;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import defpackage.a99;
import defpackage.d47;
import defpackage.duf;
import defpackage.fuf;
import defpackage.j37;
import defpackage.joa;
import defpackage.krk;
import defpackage.l07;
import defpackage.l27;
import defpackage.otk;
import defpackage.tc3;
import defpackage.wrh;
import defpackage.x37;
import defpackage.y37;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z07;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/fantasy/league/details/FantasyLeagueDetailsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lwrh;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyLeagueDetailsFragment extends Hilt_FantasyLeagueDetailsFragment<wrh> {
    public final otk r;
    public final otk s;

    public FantasyLeagueDetailsFragment() {
        joa a = ypa.a(ysa.c, new l07(new y37(this, 3), 10));
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(d47.class), new l27(a, 1), new z07(4, this, a), new l27(a, 2));
        this.s = new otk(fufVar.getOrCreateKotlinClass(j37.class), new y37(this, 0), new y37(this, 2), new y37(this, 1));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return wrh.b(getLayoutInflater(), null, false);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "DetailsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        ComposeView composeView = ((wrh) krkVar).b;
        composeView.setViewCompositionStrategy(a99.i);
        composeView.setContent(new tc3(-811845998, new x37(this, 0), true));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
    }
}
