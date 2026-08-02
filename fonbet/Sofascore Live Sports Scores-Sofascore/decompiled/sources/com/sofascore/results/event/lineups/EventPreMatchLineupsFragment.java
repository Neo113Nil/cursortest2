package com.sofascore.results.event.lineups;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.mvvm.base.AbstractFragment;
import defpackage.a66;
import defpackage.a70;
import defpackage.ao2;
import defpackage.ay5;
import defpackage.b66;
import defpackage.duf;
import defpackage.fi5;
import defpackage.fuf;
import defpackage.g7;
import defpackage.joa;
import defpackage.krk;
import defpackage.mr5;
import defpackage.oo8;
import defpackage.otk;
import defpackage.s16;
import defpackage.t06;
import defpackage.u56;
import defpackage.u6b;
import defpackage.un0;
import defpackage.v56;
import defpackage.w56;
import defpackage.x16;
import defpackage.xw3;
import defpackage.y7;
import defpackage.ykc;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/event/lineups/EventPreMatchLineupsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventPreMatchLineupsFragment extends Hilt_EventPreMatchLineupsFragment<oo8> {
    public final otk r;
    public final otk s;
    public final joa t;
    public boolean u;
    public final joa v;

    public EventPreMatchLineupsFragment() {
        w56 w56Var = new w56(this, 3);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new t06(w56Var, 8));
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(b66.class), new ay5(a, 17), new fi5(this, a, 12), new ay5(a, 18));
        this.s = new otk(fufVar.getOrCreateKotlinClass(mr5.class), new w56(this, 0), new w56(this, 2), new w56(this, 1));
        this.t = ypa.a(ysaVar, new v56(this, 0));
        this.u = true;
        this.v = ypa.a(ysaVar, new v56(this, 1));
    }

    public final Event C() {
        Object d = ((mr5) this.s.getValue()).v.d();
        if (d != null) {
            return (Event) d;
        }
        a70.r("Required value was null.");
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return oo8.b(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "PreMatchLineupsTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((oo8) krkVar).e;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        joa joaVar = this.t;
        u56 u56Var = (u56) joaVar.getValue();
        s16 s16Var = new s16(this, 3);
        u56Var.getClass();
        u56Var.a.d = s16Var;
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((oo8) krkVar2).d;
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter((u56) joaVar.getValue());
        Context requireContext = requireContext();
        requireContext.getClass();
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), ao2.s(4, requireContext), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
        recyclerView.setHasFixedSize(true);
        g7.o((u56) joaVar.getValue(), (ykc) this.v.getValue(), 6);
        otk otkVar = this.r;
        b66 b66Var = (b66) otkVar.getValue();
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        b66Var.g(viewLifecycleOwner, new v56(this, 2));
        ((b66) otkVar.getValue()).h.e(getViewLifecycleOwner(), new y7(20, new x16(this, 4)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        b66 b66Var = (b66) this.r.getValue();
        xw3.L(un0.z(b66Var), null, null, new a66(C(), b66Var, null), 3);
    }
}
