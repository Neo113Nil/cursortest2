package com.sofascore.results.stagesport.fragments.details;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.common.SwipeRefreshLayoutFixed;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.sofascore.results.stagesport.fragments.details.StageDetailsRankingFragment;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import defpackage.a8i;
import defpackage.bte;
import defpackage.duf;
import defpackage.eqb;
import defpackage.f3i;
import defpackage.j5i;
import defpackage.joa;
import defpackage.krk;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.o1i;
import defpackage.otk;
import defpackage.pte;
import defpackage.q3i;
import defpackage.tp8;
import defpackage.wsf;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/stagesport/fragments/details/StageDetailsRankingFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Ltp8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public class StageDetailsRankingFragment extends Hilt_StageDetailsRankingFragment<tp8> {
    public final otk r;
    public final mqi s;
    public TypeHeaderView t;
    public final joa u;
    public j5i v;
    public TypeHeaderView w;
    public final joa x;

    public StageDetailsRankingFragment() {
        o1i o1iVar = new o1i(this, 5);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new o1i(o1iVar, 6));
        this.r = new otk(duf.a.getOrCreateKotlinClass(q3i.class), new wsf(a, 15), new bte(this, a, 15), new wsf(a, 16));
        final int i = 0;
        this.s = ypa.b(new Function0(this) { // from class: g3i
            public final /* synthetic */ StageDetailsRankingFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StageDetailsRankingFragment stageDetailsRankingFragment = this.b;
                switch (i2) {
                    case 0:
                        Context requireContext = stageDetailsRankingFragment.requireContext();
                        requireContext.getClass();
                        UniqueStage uniqueStage = stageDetailsRankingFragment.D().h;
                        UniqueStage uniqueStage2 = stageDetailsRankingFragment.D().h;
                        return new a8i(requireContext, uniqueStage, uniqueStage2 != null ? uniqueStage2.getSportSlug() : null, new f3i(stageDetailsRankingFragment, 1));
                    case 1:
                        krk krkVar = stageDetailsRankingFragment.l;
                        krkVar.getClass();
                        return ((tp8) krkVar).b.inflate();
                    default:
                        c75 a2 = c75.a(stageDetailsRankingFragment.getLayoutInflater().inflate(R.layout.double_label_view, (ViewGroup) null, false));
                        a2.d.setText(R.string.switcher_text);
                        a2.b.setOnCheckedChangeListener(new hn(stageDetailsRankingFragment, 4));
                        FrameLayout frameLayout = new FrameLayout(stageDetailsRankingFragment.requireContext());
                        frameLayout.addView(a2.a);
                        frameLayout.setLayoutParams(new hrf(-1, -2));
                        stageDetailsRankingFragment.C().p(0, frameLayout);
                        return a2;
                }
            }
        });
        final int i2 = 1;
        this.u = ypa.a(ysaVar, new Function0(this) { // from class: g3i
            public final /* synthetic */ StageDetailsRankingFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StageDetailsRankingFragment stageDetailsRankingFragment = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = stageDetailsRankingFragment.requireContext();
                        requireContext.getClass();
                        UniqueStage uniqueStage = stageDetailsRankingFragment.D().h;
                        UniqueStage uniqueStage2 = stageDetailsRankingFragment.D().h;
                        return new a8i(requireContext, uniqueStage, uniqueStage2 != null ? uniqueStage2.getSportSlug() : null, new f3i(stageDetailsRankingFragment, 1));
                    case 1:
                        krk krkVar = stageDetailsRankingFragment.l;
                        krkVar.getClass();
                        return ((tp8) krkVar).b.inflate();
                    default:
                        c75 a2 = c75.a(stageDetailsRankingFragment.getLayoutInflater().inflate(R.layout.double_label_view, (ViewGroup) null, false));
                        a2.d.setText(R.string.switcher_text);
                        a2.b.setOnCheckedChangeListener(new hn(stageDetailsRankingFragment, 4));
                        FrameLayout frameLayout = new FrameLayout(stageDetailsRankingFragment.requireContext());
                        frameLayout.addView(a2.a);
                        frameLayout.setLayoutParams(new hrf(-1, -2));
                        stageDetailsRankingFragment.C().p(0, frameLayout);
                        return a2;
                }
            }
        });
        final int i3 = 2;
        this.x = ypa.a(ysaVar, new Function0(this) { // from class: g3i
            public final /* synthetic */ StageDetailsRankingFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StageDetailsRankingFragment stageDetailsRankingFragment = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = stageDetailsRankingFragment.requireContext();
                        requireContext.getClass();
                        UniqueStage uniqueStage = stageDetailsRankingFragment.D().h;
                        UniqueStage uniqueStage2 = stageDetailsRankingFragment.D().h;
                        return new a8i(requireContext, uniqueStage, uniqueStage2 != null ? uniqueStage2.getSportSlug() : null, new f3i(stageDetailsRankingFragment, 1));
                    case 1:
                        krk krkVar = stageDetailsRankingFragment.l;
                        krkVar.getClass();
                        return ((tp8) krkVar).b.inflate();
                    default:
                        c75 a2 = c75.a(stageDetailsRankingFragment.getLayoutInflater().inflate(R.layout.double_label_view, (ViewGroup) null, false));
                        a2.d.setText(R.string.switcher_text);
                        a2.b.setOnCheckedChangeListener(new hn(stageDetailsRankingFragment, 4));
                        FrameLayout frameLayout = new FrameLayout(stageDetailsRankingFragment.requireContext());
                        frameLayout.addView(a2.a);
                        frameLayout.setLayoutParams(new hrf(-1, -2));
                        stageDetailsRankingFragment.C().p(0, frameLayout);
                        return a2;
                }
            }
        });
    }

    public final a8i C() {
        return (a8i) this.s.getValue();
    }

    public final q3i D() {
        return (q3i) this.r.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_stage_sport_details_rankings, (ViewGroup) null, false);
        int i = R.id.no_ranking;
        ViewStub viewStub = (ViewStub) nq8.B(R.id.no_ranking, inflate);
        if (viewStub != null) {
            i = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
            if (recyclerView != null) {
                SwipeRefreshLayoutFixed swipeRefreshLayoutFixed = (SwipeRefreshLayoutFixed) inflate;
                return new tp8(swipeRefreshLayoutFixed, viewStub, recyclerView, swipeRefreshLayoutFixed);
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        return "RankingTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        SwipeRefreshLayoutFixed swipeRefreshLayoutFixed = ((tp8) krkVar).d;
        swipeRefreshLayoutFixed.getClass();
        AbstractFragment.v(this, swipeRefreshLayoutFixed, null, null, 6);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView = ((tp8) krkVar2).c;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ((tp8) krkVar3).c.setAdapter(C());
        a8i C = C();
        pte pteVar = new pte(this, 24);
        C.getClass();
        C.a.d = pteVar;
        D().r.e(getViewLifecycleOwner(), new eqb(26, new f3i(this, 0)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
        D().k();
    }
}
