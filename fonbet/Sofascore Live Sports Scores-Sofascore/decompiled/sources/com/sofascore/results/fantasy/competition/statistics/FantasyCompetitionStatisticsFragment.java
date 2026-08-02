package com.sofascore.results.fantasy.competition.statistics;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import defpackage.cv6;
import defpackage.duf;
import defpackage.e6b;
import defpackage.fi5;
import defpackage.jo6;
import defpackage.joa;
import defpackage.k0;
import defpackage.otk;
import defpackage.t06;
import defpackage.tc3;
import defpackage.u6b;
import defpackage.xp6;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0012²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\nX\u008a\u0084\u0002²\u0006\u000e\u0010\t\u001a\u0004\u0018\u00010\b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000b\u001a\u0004\u0018\u00010\n8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\r\u001a\u0004\u0018\u00010\f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/fantasy/competition/statistics/FantasyCompetitionStatisticsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "", "hasFDR", "Lw28;", "filters", "Lho1;", "team", "", "price", "", "position", "Lmei;", "sortCategory", "Lnei;", "sortOrder", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyCompetitionStatisticsFragment extends Hilt_FantasyCompetitionStatisticsFragment {
    public final otk r;

    public FantasyCompetitionStatisticsFragment() {
        joa a = ypa.a(ysa.c, new t06(new t06(this, 21), 22));
        this.r = new otk(duf.a.getOrCreateKotlinClass(cv6.class), new xp6(a, 7), new fi5(this, a, 22), new xp6(a, 8));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getS() {
        return new tc3(-1370862813, new jo6(this, 7), true);
    }

    public final cv6 D() {
        return (cv6) this.r.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        FragmentActivity requireActivity = requireActivity();
        k0 k0Var = new k0(this, 8);
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        requireActivity.addMenuProvider(k0Var, viewLifecycleOwner, e6b.e);
        this.i.b = D().u.c.d.getAnalyticsName();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "StatisticsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        D().o();
    }
}
