package com.sofascore.results.event.lineups.football;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import defpackage.a06;
import defpackage.au5;
import defpackage.duf;
import defpackage.e6b;
import defpackage.f06;
import defpackage.k0;
import defpackage.kr1;
import defpackage.otk;
import defpackage.p06;
import defpackage.tc3;
import defpackage.u6b;
import defpackage.x21;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/event/lineups/football/EventFootballLineupsFragment;", "Lcom/sofascore/results/event/lineups/BaseEventLineupsFragment;", "Lf06;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventFootballLineupsFragment extends Hilt_EventFootballLineupsFragment<f06> {
    public final otk s = new otk(duf.a.getOrCreateKotlinClass(p06.class), new a06(this, 0), new a06(this, 2), new a06(this, 1));

    @Override // com.sofascore.results.event.lineups.BaseEventLineupsFragment
    public final tc3 C() {
        return new tc3(1207092005, new kr1(this, 29), true);
    }

    @Override // com.sofascore.results.event.lineups.BaseEventLineupsFragment
    public final x21 D() {
        return (p06) this.s.getValue();
    }

    @Override // com.sofascore.results.event.lineups.BaseEventLineupsFragment
    public final Function1 E() {
        return new au5(7);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        FragmentActivity requireActivity = requireActivity();
        k0 k0Var = new k0(this, 3);
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        requireActivity.addMenuProvider(k0Var, viewLifecycleOwner, e6b.e);
    }
}
