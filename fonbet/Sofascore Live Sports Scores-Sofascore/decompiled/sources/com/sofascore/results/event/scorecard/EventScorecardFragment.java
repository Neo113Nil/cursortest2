package com.sofascore.results.event.scorecard;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.mvvm.base.AbstractFragment;
import defpackage.a70;
import defpackage.ao2;
import defpackage.ay5;
import defpackage.ce4;
import defpackage.duf;
import defpackage.e1d;
import defpackage.fi5;
import defpackage.fuf;
import defpackage.fv2;
import defpackage.joa;
import defpackage.km5;
import defpackage.krk;
import defpackage.mqi;
import defpackage.mr5;
import defpackage.otk;
import defpackage.p66;
import defpackage.q66;
import defpackage.r66;
import defpackage.rq3;
import defpackage.s16;
import defpackage.s66;
import defpackage.t06;
import defpackage.t66;
import defpackage.tc3;
import defpackage.u6b;
import defpackage.un0;
import defpackage.w66;
import defpackage.wrf;
import defpackage.xhh;
import defpackage.xw3;
import defpackage.y7;
import defpackage.ypa;
import defpackage.yq8;
import defpackage.ysa;
import defpackage.z8e;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/sofascore/results/event/scorecard/EventScorecardFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lyq8;", "<init>", "()V", "s66", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EventScorecardFragment extends Hilt_EventScorecardFragment<yq8> {
    public final s66 A;
    public final otk r;
    public final otk s;
    public final mqi t;
    public final mqi u;
    public final mqi v;
    public boolean w;
    public final e1d x;
    public final e1d y;
    public final LinkedHashMap z;

    public EventScorecardFragment() {
        fuf fufVar = duf.a;
        this.r = new otk(fufVar.getOrCreateKotlinClass(mr5.class), new t66(this, 0), new t66(this, 2), new t66(this, 1));
        joa a = ypa.a(ysa.c, new t06(new t66(this, 3), 9));
        this.s = new otk(fufVar.getOrCreateKotlinClass(w66.class), new ay5(a, 19), new fi5(this, a, 13), new ay5(a, 20));
        this.t = ypa.b(new r66(this, 1));
        this.u = ypa.b(new r66(this, 2));
        this.v = ypa.b(new r66(this, 3));
        this.w = true;
        this.x = e.f(km5.a);
        this.y = e.f(null);
        this.z = new LinkedHashMap();
        this.A = new s66(this);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return yq8.a(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "ScorecardTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((yq8) krkVar).d;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((yq8) krkVar2).c;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        mqi mqiVar = this.t;
        recyclerView.setAdapter((p66) mqiVar.getValue());
        recyclerView.addOnScrollListener(this.A);
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), ao2.s(4, requireContext2), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
        wrf.a(recyclerView, new q66(this, 0));
        p66 p66Var = (p66) mqiVar.getValue();
        s16 s16Var = new s16(this, 4);
        p66Var.getClass();
        p66Var.a.d = s16Var;
        krk krkVar3 = this.l;
        krkVar3.getClass();
        LinearLayout linearLayout = ((yq8) krkVar3).b;
        mqi mqiVar2 = this.u;
        linearLayout.addView(((xhh) mqiVar2.getValue()).a);
        ((xhh) mqiVar2.getValue()).c.setContent(new tc3(1387447133, new fv2(this, 23), true));
        otk otkVar = this.s;
        w66 w66Var = (w66) otkVar.getValue();
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        w66Var.g(viewLifecycleOwner, new r66(this, 0));
        ((w66) otkVar.getValue()).g.e(getViewLifecycleOwner(), new y7(21, new q66(this, 1)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        w66 w66Var = (w66) this.s.getValue();
        Object d = ((mr5) this.r.getValue()).v.d();
        if (d == null) {
            a70.r("Required value was null.");
        } else {
            xw3.L(un0.z(w66Var), null, null, new ce4(w66Var, (Event) d, (rq3) null, 18), 3);
        }
    }
}
