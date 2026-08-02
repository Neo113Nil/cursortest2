package com.sofascore.results.weeklyChallenge.predictions;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sofascore.model.database.VoteType;
import com.sofascore.results.event.EventActivity;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.weeklyChallenge.predictions.WeeklyPredictionsFragment;
import defpackage.bbf;
import defpackage.bnk;
import defpackage.cbf;
import defpackage.ce;
import defpackage.d3k;
import defpackage.d5l;
import defpackage.de;
import defpackage.duf;
import defpackage.fuf;
import defpackage.i5l;
import defpackage.ioe;
import defpackage.j5l;
import defpackage.joa;
import defpackage.krk;
import defpackage.l5l;
import defpackage.lk0;
import defpackage.luj;
import defpackage.m5l;
import defpackage.mqi;
import defpackage.oo8;
import defpackage.otk;
import defpackage.p15;
import defpackage.s2j;
import defpackage.sj4;
import defpackage.u4g;
import defpackage.u6b;
import defpackage.wca;
import defpackage.wxf;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import defpackage.zzc;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/weeklyChallenge/predictions/WeeklyPredictionsFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Loo8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WeeklyPredictionsFragment extends Hilt_WeeklyPredictionsFragment<oo8> {
    public final mqi A;
    public final mqi r;
    public final otk s;
    public final otk t;
    public boolean u;
    public int v;
    public VoteType w;
    public ConstraintLayout x;
    public final de y;
    public final joa z;

    public WeeklyPredictionsFragment() {
        final int i = 0;
        this.r = ypa.b(new Function0(this) { // from class: f5l
            public final /* synthetic */ WeeklyPredictionsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WeeklyPredictionsFragment weeklyPredictionsFragment = this.b;
                switch (i2) {
                    case 0:
                        Bundle requireArguments = weeklyPredictionsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "PREDICTION_TYPE", m5l.class);
                        if (M != null) {
                            return (m5l) M;
                        }
                        a70.p("Serializable PREDICTION_TYPE not found");
                        return null;
                    case 1:
                        Context requireContext = weeklyPredictionsFragment.requireContext();
                        requireContext.getClass();
                        yk ykVar = new yk(requireContext);
                        ykVar.setOnDismissListener(new j0(weeklyPredictionsFragment, 8));
                        return ykVar;
                    default:
                        Context requireContext2 = weeklyPredictionsFragment.requireContext();
                        requireContext2.getClass();
                        return new cbf(requireContext2, true, true, new lqj(weeklyPredictionsFragment, 17), new d5l(weeklyPredictionsFragment, 4));
                }
            }
        });
        j5l j5lVar = new j5l(this, 0);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new s2j(j5lVar, 24));
        fuf fufVar = duf.a;
        final int i2 = 1;
        this.s = new otk(fufVar.getOrCreateKotlinClass(u4g.class), new d3k(a, 9), new i5l(this, a, i2), new d3k(a, 10));
        joa a2 = ypa.a(ysaVar, new s2j(new j5l(this, 1), 25));
        this.t = new otk(fufVar.getOrCreateKotlinClass(l5l.class), new d3k(a2, 11), new i5l(this, a2, i), new d3k(a2, 12));
        this.w = VoteType.WHO_WILL_WIN;
        de registerForActivityResult = registerForActivityResult(new ce(3), new bnk(this, 4));
        registerForActivityResult.getClass();
        this.y = registerForActivityResult;
        this.z = ypa.a(ysaVar, new Function0(this) { // from class: f5l
            public final /* synthetic */ WeeklyPredictionsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WeeklyPredictionsFragment weeklyPredictionsFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = weeklyPredictionsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "PREDICTION_TYPE", m5l.class);
                        if (M != null) {
                            return (m5l) M;
                        }
                        a70.p("Serializable PREDICTION_TYPE not found");
                        return null;
                    case 1:
                        Context requireContext = weeklyPredictionsFragment.requireContext();
                        requireContext.getClass();
                        yk ykVar = new yk(requireContext);
                        ykVar.setOnDismissListener(new j0(weeklyPredictionsFragment, 8));
                        return ykVar;
                    default:
                        Context requireContext2 = weeklyPredictionsFragment.requireContext();
                        requireContext2.getClass();
                        return new cbf(requireContext2, true, true, new lqj(weeklyPredictionsFragment, 17), new d5l(weeklyPredictionsFragment, 4));
                }
            }
        });
        final int i3 = 2;
        this.A = ypa.b(new Function0(this) { // from class: f5l
            public final /* synthetic */ WeeklyPredictionsFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WeeklyPredictionsFragment weeklyPredictionsFragment = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = weeklyPredictionsFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "PREDICTION_TYPE", m5l.class);
                        if (M != null) {
                            return (m5l) M;
                        }
                        a70.p("Serializable PREDICTION_TYPE not found");
                        return null;
                    case 1:
                        Context requireContext = weeklyPredictionsFragment.requireContext();
                        requireContext.getClass();
                        yk ykVar = new yk(requireContext);
                        ykVar.setOnDismissListener(new j0(weeklyPredictionsFragment, 8));
                        return ykVar;
                    default:
                        Context requireContext2 = weeklyPredictionsFragment.requireContext();
                        requireContext2.getClass();
                        return new cbf(requireContext2, true, true, new lqj(weeklyPredictionsFragment, 17), new d5l(weeklyPredictionsFragment, 4));
                }
            }
        });
    }

    public final cbf C() {
        return (cbf) this.A.getValue();
    }

    public final u4g D() {
        return (u4g) this.s.getValue();
    }

    public final void E(int i, VoteType voteType) {
        Intent intent;
        wxf wxfVar = EventActivity.h0;
        Context requireContext = requireContext();
        requireContext.getClass();
        if (voteType != null) {
            Intent intent2 = new Intent();
            intent2.putExtra("changeVote", true);
            intent2.putExtra("voteType", voteType);
            intent = intent2;
        } else {
            intent = null;
        }
        this.y.a(wxf.o(wxfVar, requireContext, i, null, null, null, null, intent, false, 188), null);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return oo8.b(getLayoutInflater());
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return ((m5l) this.r.getValue()).b;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayout swipeRefreshLayout = ((oo8) krkVar).e;
        swipeRefreshLayout.getClass();
        AbstractFragment.v(this, swipeRefreshLayout, null, null, 6);
        l();
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((oo8) krkVar2).d;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        recyclerView.setAdapter(C());
        cbf C = C();
        bbf[] bbfVarArr = bbf.a;
        krk krkVar3 = this.l;
        krkVar3.getClass();
        recyclerView.addItemDecoration(new sj4(C, ((oo8) krkVar3).d));
        ((l5l) this.t.getValue()).i.e(getViewLifecycleOwner(), new ioe(29, new d5l(this, 0)));
        xw3.L(wca.x(getLifecycle()), null, null, new luj(this, null, 10), 3);
        int i = 1;
        D().l.e(this, new ioe(29, new d5l(this, i)));
        D().h.e(getViewLifecycleOwner(), new ioe(29, new d5l(this, 2)));
        zzc zzcVar = D().j;
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        p15 p15Var = new p15(new d5l(this, 3), i);
        zzcVar.getClass();
        zzcVar.a.e(viewLifecycleOwner, p15Var);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        lk0 lk0Var = C().b.h;
        lk0Var.getClass();
        if (Build.ID != null) {
            Log.isLoggable("Paging", 3);
        }
        lk0Var.c.k();
    }
}
