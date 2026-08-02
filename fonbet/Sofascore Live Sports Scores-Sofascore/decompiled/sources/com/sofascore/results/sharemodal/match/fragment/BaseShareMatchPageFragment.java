package com.sofascore.results.sharemodal.match.fragment;

import android.content.Context;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.sharemodal.BaseSharePageFragment;
import defpackage.g7;
import defpackage.mqi;
import defpackage.ypa;
import defpackage.z0;
import defpackage.z8e;
import defpackage.zch;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/sharemodal/match/fragment/BaseShareMatchPageFragment;", "Lcom/sofascore/results/sharemodal/BaseSharePageFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseShareMatchPageFragment extends BaseSharePageFragment {
    public final mqi n = ypa.b(new z0(this, 24));

    @Override // com.sofascore.results.sharemodal.BaseSharePageFragment
    public final void A() {
        g7 B = B();
        Context requireContext = requireContext();
        requireContext.getClass();
        zch zchVar = new zch(requireContext);
        zchVar.j(getViewLifecycleOwner().getLifecycle(), E());
        z8e.V(((Number) this.m.getValue()).intValue(), zchVar.d.s);
        B.p(B.g.size(), zchVar);
    }

    public final Event E() {
        return (Event) this.n.getValue();
    }
}
