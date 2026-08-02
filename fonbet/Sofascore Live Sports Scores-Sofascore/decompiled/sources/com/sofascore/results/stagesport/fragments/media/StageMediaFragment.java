package com.sofascore.results.stagesport.fragments.media;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.results.mvvm.base.AbstractFragment;
import defpackage.a70;
import defpackage.ao2;
import defpackage.bte;
import defpackage.duf;
import defpackage.eqb;
import defpackage.g2i;
import defpackage.gz8;
import defpackage.h4i;
import defpackage.joa;
import defpackage.krk;
import defpackage.mqi;
import defpackage.o1i;
import defpackage.oo8;
import defpackage.otk;
import defpackage.p5i;
import defpackage.pte;
import defpackage.rq3;
import defpackage.un0;
import defpackage.w1i;
import defpackage.wsf;
import defpackage.xw3;
import defpackage.y4c;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/stagesport/fragments/media/StageMediaFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StageMediaFragment extends Hilt_StageMediaFragment<oo8> {
    public final otk r;
    public final mqi s;
    public Stage t;

    public StageMediaFragment() {
        joa a = ypa.a(ysa.c, new o1i(new o1i(this, 9), 10));
        this.r = new otk(duf.a.getOrCreateKotlinClass(p5i.class), new wsf(a, 21), new bte(this, a, 18), new wsf(a, 22));
        this.s = ypa.b(new w1i(this, 1));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return oo8.b(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "MediaTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((oo8) krkVar).e;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        Serializable M = gz8.M(requireArguments, "EVENT", Stage.class);
        if (M == null) {
            a70.p("Serializable EVENT not found");
            return;
        }
        this.t = (Stage) M;
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((oo8) krkVar2).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        RecyclerView recyclerView2 = ((oo8) krkVar3).d;
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        int s = ao2.s(4, requireContext2);
        Context requireContext3 = requireContext();
        requireContext3.getClass();
        int s2 = ao2.s(8, requireContext3);
        Context requireContext4 = requireContext();
        requireContext4.getClass();
        recyclerView2.setPaddingRelative(s2, s, ao2.s(8, requireContext4), recyclerView2.getPaddingBottom());
        krk krkVar4 = this.l;
        krkVar4.getClass();
        RecyclerView recyclerView3 = ((oo8) krkVar4).d;
        mqi mqiVar = this.s;
        recyclerView3.setAdapter((y4c) mqiVar.getValue());
        y4c y4cVar = (y4c) mqiVar.getValue();
        pte pteVar = new pte(this, 28);
        y4cVar.getClass();
        y4cVar.a.d = pteVar;
        ((p5i) this.r.getValue()).g.e(getViewLifecycleOwner(), new eqb(28, new g2i(this, 5)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        p5i p5iVar = (p5i) this.r.getValue();
        Stage stage = this.t;
        rq3 rq3Var = null;
        if (stage != null) {
            xw3.L(un0.z(p5iVar), null, null, new h4i(p5iVar, stage, rq3Var, 2), 3);
        } else {
            Intrinsics.i("event");
            throw null;
        }
    }
}
