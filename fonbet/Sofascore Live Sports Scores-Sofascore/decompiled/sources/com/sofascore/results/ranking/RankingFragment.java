package com.sofascore.results.ranking;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.R;
import com.sofascore.results.ranking.RankingFragment;
import defpackage.aaf;
import defpackage.amf;
import defpackage.bte;
import defpackage.cmf;
import defpackage.duf;
import defpackage.fuf;
import defpackage.ioe;
import defpackage.joa;
import defpackage.krk;
import defpackage.mlf;
import defpackage.mme;
import defpackage.mqi;
import defpackage.np8;
import defpackage.nq8;
import defpackage.otk;
import defpackage.plf;
import defpackage.pte;
import defpackage.qlf;
import defpackage.qu1;
import defpackage.rq3;
import defpackage.sj4;
import defpackage.un0;
import defpackage.vce;
import defpackage.vlf;
import defpackage.x2e;
import defpackage.xw3;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import defpackage.zzl;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/ranking/RankingFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lnp8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RankingFragment extends Hilt_RankingFragment<np8> {
    public final otk r;
    public final otk s;
    public final mqi t;
    public final mqi u;
    public final mqi v;
    public boolean w;

    public RankingFragment() {
        fuf fufVar = duf.a;
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.r = new otk(fufVar.getOrCreateKotlinClass(mlf.class), new plf(this, 0), new plf(this, 2), new plf(this, 1));
        joa a = ypa.a(ysa.c, new vce(new plf(this, 3), 20));
        this.s = new otk(fufVar.getOrCreateKotlinClass(qlf.class), new x2e(a, 25), new bte(this, a, 5), new x2e(a, 26));
        this.t = ypa.b(new Function0(this) { // from class: nlf
            public final /* synthetic */ RankingFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i;
                RankingFragment rankingFragment = this.b;
                switch (i4) {
                    case 0:
                        Context requireContext = rankingFragment.requireContext();
                        requireContext.getClass();
                        return new cmf(requireContext, (amf) rankingFragment.u.getValue());
                    case 1:
                        Bundle requireArguments = rankingFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_TYPE", amf.class);
                        if (M != null) {
                            return (amf) M;
                        }
                        a70.p("Serializable ARG_TYPE not found");
                        return null;
                    default:
                        return Integer.valueOf(rankingFragment.requireArguments().getInt("ARG_INITIAL_POSITION"));
                }
            }
        });
        this.u = ypa.b(new Function0(this) { // from class: nlf
            public final /* synthetic */ RankingFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i2;
                RankingFragment rankingFragment = this.b;
                switch (i4) {
                    case 0:
                        Context requireContext = rankingFragment.requireContext();
                        requireContext.getClass();
                        return new cmf(requireContext, (amf) rankingFragment.u.getValue());
                    case 1:
                        Bundle requireArguments = rankingFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_TYPE", amf.class);
                        if (M != null) {
                            return (amf) M;
                        }
                        a70.p("Serializable ARG_TYPE not found");
                        return null;
                    default:
                        return Integer.valueOf(rankingFragment.requireArguments().getInt("ARG_INITIAL_POSITION"));
                }
            }
        });
        this.v = ypa.b(new Function0(this) { // from class: nlf
            public final /* synthetic */ RankingFragment b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                RankingFragment rankingFragment = this.b;
                switch (i4) {
                    case 0:
                        Context requireContext = rankingFragment.requireContext();
                        requireContext.getClass();
                        return new cmf(requireContext, (amf) rankingFragment.u.getValue());
                    case 1:
                        Bundle requireArguments = rankingFragment.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ARG_TYPE", amf.class);
                        if (M != null) {
                            return (amf) M;
                        }
                        a70.p("Serializable ARG_TYPE not found");
                        return null;
                    default:
                        return Integer.valueOf(rankingFragment.requireArguments().getInt("ARG_INITIAL_POSITION"));
                }
            }
        });
        this.w = true;
    }

    public final cmf C() {
        return (cmf) this.t.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_rankings, (ViewGroup) null, false);
        int i = R.id.no_ranking;
        if (((ViewStub) nq8.B(R.id.no_ranking, inflate)) != null) {
            i = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
            if (recyclerView != null) {
                return new np8((RelativeLayout) inflate, recyclerView);
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final String p() {
        switch (((amf) this.u.getValue()).ordinal()) {
            case 0:
                return "UefaCountriesRankingTab";
            case 1:
                return "FifaRankingTab";
            case 2:
                return "RugbyRankingTab";
            case 3:
                return "AtpOfficialRankingTab";
            case 4:
                return "WtaOfficialRankingTab";
            case 5:
                return "AtpLiveRankingTab";
            case 6:
                return "WtaLiveRankingTab";
            case 7:
                return "UefaClubsRankingTab";
            case 8:
                return "UtrMenRankingTab";
            case 9:
                return "UtrWomenRankingTab";
            default:
                zzl.b();
                return null;
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        krk krkVar = this.l;
        krkVar.getClass();
        RecyclerView recyclerView = ((np8) krkVar).b;
        Context requireContext = requireContext();
        requireContext.getClass();
        z8e.b0(recyclerView, requireContext, false, false, null, 30);
        cmf C = C();
        vlf vlfVar = vlf.a;
        krk krkVar2 = this.l;
        krkVar2.getClass();
        RecyclerView recyclerView2 = ((np8) krkVar2).b;
        C.getClass();
        sj4 sj4Var = new sj4(C, 8, recyclerView2, 2);
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ((np8) krkVar3).b.addItemDecoration(sj4Var);
        krk krkVar4 = this.l;
        krkVar4.getClass();
        ((np8) krkVar4).b.setAdapter(C());
        cmf C2 = C();
        pte pteVar = new pte(this, 11);
        C2.getClass();
        C2.a.d = pteVar;
        otk otkVar = this.s;
        qlf qlfVar = (qlf) otkVar.getValue();
        xw3.L(un0.z(qlfVar), null, null, new qu1(qlfVar, ((amf) this.u.getValue()).a, (rq3) null, 25), 3);
        ((qlf) otkVar.getValue()).g.e(getViewLifecycleOwner(), new ioe(5, new aaf(4, this, sj4Var)));
        ((mlf) this.r.getValue()).g.e(getViewLifecycleOwner(), new ioe(5, new mme(this, 15)));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final void u() {
    }
}
