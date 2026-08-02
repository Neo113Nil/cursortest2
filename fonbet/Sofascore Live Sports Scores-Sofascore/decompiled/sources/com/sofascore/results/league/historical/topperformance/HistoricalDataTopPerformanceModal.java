package com.sofascore.results.league.historical.topperformance;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.results.R;
import com.sofascore.results.league.historical.topperformance.HistoricalDataTopPerformanceModal;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import defpackage.ac9;
import defpackage.duf;
import defpackage.e1d;
import defpackage.fuf;
import defpackage.g5k;
import defpackage.gya;
import defpackage.hl7;
import defpackage.hv7;
import defpackage.i1g;
import defpackage.ix7;
import defpackage.joa;
import defpackage.k13;
import defpackage.km5;
import defpackage.kp5;
import defpackage.nq8;
import defpackage.nre;
import defpackage.otk;
import defpackage.tc3;
import defpackage.tlj;
import defpackage.ulj;
import defpackage.ur1;
import defpackage.w3a;
import defpackage.w74;
import defpackage.xb9;
import defpackage.y7;
import defpackage.yb9;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z07;
import defpackage.z8e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/league/historical/topperformance/HistoricalDataTopPerformanceModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HistoricalDataTopPerformanceModal extends Hilt_HistoricalDataTopPerformanceModal {
    public final otk B;
    public final otk C;
    public final joa D;
    public final joa E;
    public final joa F;
    public final e1d G;
    public final e1d H;
    public final joa I;
    public boolean J;
    public final joa K;

    public HistoricalDataTopPerformanceModal() {
        fuf fufVar = duf.a;
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.B = new otk(fufVar.getOrCreateKotlinClass(gya.class), new yb9(this, 0), new yb9(this, 2), new yb9(this, 1));
        final int i4 = 3;
        yb9 yb9Var = new yb9(this, 3);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new hv7(yb9Var, 8));
        this.C = new otk(fufVar.getOrCreateKotlinClass(ac9.class), new ix7(a, 5), new z07(23, this, a), new ix7(a, 6));
        this.D = ypa.a(ysaVar, new Function0(this) { // from class: wb9
            public final /* synthetic */ HistoricalDataTopPerformanceModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                HistoricalDataTopPerformanceModal historicalDataTopPerformanceModal = this.b;
                switch (i5) {
                    case 0:
                        Bundle arguments = historicalDataTopPerformanceModal.getArguments();
                        if (arguments != null) {
                            return (ulj) gz8.M(arguments, "type", ulj.class);
                        }
                        return null;
                    case 1:
                        Bundle arguments2 = historicalDataTopPerformanceModal.getArguments();
                        if (arguments2 != null) {
                            return arguments2.getString("categoryName");
                        }
                        return null;
                    case 2:
                        Bundle arguments3 = historicalDataTopPerformanceModal.getArguments();
                        if (arguments3 != null) {
                            return (Gender) gz8.M(arguments3, InneractiveMediationDefs.KEY_GENDER, Gender.class);
                        }
                        return null;
                    case 3:
                        Context requireContext = historicalDataTopPerformanceModal.requireContext();
                        requireContext.getClass();
                        tlj tljVar = new tlj(requireContext);
                        tljVar.a.d = new qm4(25, historicalDataTopPerformanceModal, tljVar);
                        return tljVar;
                    default:
                        int i6 = i1g.b;
                        Context requireContext2 = historicalDataTopPerformanceModal.requireContext();
                        requireContext2.getClass();
                        Context applicationContext = requireContext2.getApplicationContext();
                        applicationContext.getClass();
                        Resources resources = requireContext2.getResources();
                        i1g i1gVar = new i1g(applicationContext);
                        i1gVar.a = resources;
                        return i1gVar;
                }
            }
        });
        this.E = ypa.a(ysaVar, new Function0(this) { // from class: wb9
            public final /* synthetic */ HistoricalDataTopPerformanceModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                HistoricalDataTopPerformanceModal historicalDataTopPerformanceModal = this.b;
                switch (i5) {
                    case 0:
                        Bundle arguments = historicalDataTopPerformanceModal.getArguments();
                        if (arguments != null) {
                            return (ulj) gz8.M(arguments, "type", ulj.class);
                        }
                        return null;
                    case 1:
                        Bundle arguments2 = historicalDataTopPerformanceModal.getArguments();
                        if (arguments2 != null) {
                            return arguments2.getString("categoryName");
                        }
                        return null;
                    case 2:
                        Bundle arguments3 = historicalDataTopPerformanceModal.getArguments();
                        if (arguments3 != null) {
                            return (Gender) gz8.M(arguments3, InneractiveMediationDefs.KEY_GENDER, Gender.class);
                        }
                        return null;
                    case 3:
                        Context requireContext = historicalDataTopPerformanceModal.requireContext();
                        requireContext.getClass();
                        tlj tljVar = new tlj(requireContext);
                        tljVar.a.d = new qm4(25, historicalDataTopPerformanceModal, tljVar);
                        return tljVar;
                    default:
                        int i6 = i1g.b;
                        Context requireContext2 = historicalDataTopPerformanceModal.requireContext();
                        requireContext2.getClass();
                        Context applicationContext = requireContext2.getApplicationContext();
                        applicationContext.getClass();
                        Resources resources = requireContext2.getResources();
                        i1g i1gVar = new i1g(applicationContext);
                        i1gVar.a = resources;
                        return i1gVar;
                }
            }
        });
        this.F = ypa.a(ysaVar, new Function0(this) { // from class: wb9
            public final /* synthetic */ HistoricalDataTopPerformanceModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                HistoricalDataTopPerformanceModal historicalDataTopPerformanceModal = this.b;
                switch (i5) {
                    case 0:
                        Bundle arguments = historicalDataTopPerformanceModal.getArguments();
                        if (arguments != null) {
                            return (ulj) gz8.M(arguments, "type", ulj.class);
                        }
                        return null;
                    case 1:
                        Bundle arguments2 = historicalDataTopPerformanceModal.getArguments();
                        if (arguments2 != null) {
                            return arguments2.getString("categoryName");
                        }
                        return null;
                    case 2:
                        Bundle arguments3 = historicalDataTopPerformanceModal.getArguments();
                        if (arguments3 != null) {
                            return (Gender) gz8.M(arguments3, InneractiveMediationDefs.KEY_GENDER, Gender.class);
                        }
                        return null;
                    case 3:
                        Context requireContext = historicalDataTopPerformanceModal.requireContext();
                        requireContext.getClass();
                        tlj tljVar = new tlj(requireContext);
                        tljVar.a.d = new qm4(25, historicalDataTopPerformanceModal, tljVar);
                        return tljVar;
                    default:
                        int i6 = i1g.b;
                        Context requireContext2 = historicalDataTopPerformanceModal.requireContext();
                        requireContext2.getClass();
                        Context applicationContext = requireContext2.getApplicationContext();
                        applicationContext.getClass();
                        Resources resources = requireContext2.getResources();
                        i1g i1gVar = new i1g(applicationContext);
                        i1gVar.a = resources;
                        return i1gVar;
                }
            }
        });
        this.G = e.f(km5.a);
        this.H = e.f(null);
        this.I = ypa.a(ysaVar, new Function0(this) { // from class: wb9
            public final /* synthetic */ HistoricalDataTopPerformanceModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i4;
                HistoricalDataTopPerformanceModal historicalDataTopPerformanceModal = this.b;
                switch (i5) {
                    case 0:
                        Bundle arguments = historicalDataTopPerformanceModal.getArguments();
                        if (arguments != null) {
                            return (ulj) gz8.M(arguments, "type", ulj.class);
                        }
                        return null;
                    case 1:
                        Bundle arguments2 = historicalDataTopPerformanceModal.getArguments();
                        if (arguments2 != null) {
                            return arguments2.getString("categoryName");
                        }
                        return null;
                    case 2:
                        Bundle arguments3 = historicalDataTopPerformanceModal.getArguments();
                        if (arguments3 != null) {
                            return (Gender) gz8.M(arguments3, InneractiveMediationDefs.KEY_GENDER, Gender.class);
                        }
                        return null;
                    case 3:
                        Context requireContext = historicalDataTopPerformanceModal.requireContext();
                        requireContext.getClass();
                        tlj tljVar = new tlj(requireContext);
                        tljVar.a.d = new qm4(25, historicalDataTopPerformanceModal, tljVar);
                        return tljVar;
                    default:
                        int i6 = i1g.b;
                        Context requireContext2 = historicalDataTopPerformanceModal.requireContext();
                        requireContext2.getClass();
                        Context applicationContext = requireContext2.getApplicationContext();
                        applicationContext.getClass();
                        Resources resources = requireContext2.getResources();
                        i1g i1gVar = new i1g(applicationContext);
                        i1gVar.a = resources;
                        return i1gVar;
                }
            }
        });
        this.J = true;
        final int i5 = 4;
        this.K = ypa.a(ysaVar, new Function0(this) { // from class: wb9
            public final /* synthetic */ HistoricalDataTopPerformanceModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i52 = i5;
                HistoricalDataTopPerformanceModal historicalDataTopPerformanceModal = this.b;
                switch (i52) {
                    case 0:
                        Bundle arguments = historicalDataTopPerformanceModal.getArguments();
                        if (arguments != null) {
                            return (ulj) gz8.M(arguments, "type", ulj.class);
                        }
                        return null;
                    case 1:
                        Bundle arguments2 = historicalDataTopPerformanceModal.getArguments();
                        if (arguments2 != null) {
                            return arguments2.getString("categoryName");
                        }
                        return null;
                    case 2:
                        Bundle arguments3 = historicalDataTopPerformanceModal.getArguments();
                        if (arguments3 != null) {
                            return (Gender) gz8.M(arguments3, InneractiveMediationDefs.KEY_GENDER, Gender.class);
                        }
                        return null;
                    case 3:
                        Context requireContext = historicalDataTopPerformanceModal.requireContext();
                        requireContext.getClass();
                        tlj tljVar = new tlj(requireContext);
                        tljVar.a.d = new qm4(25, historicalDataTopPerformanceModal, tljVar);
                        return tljVar;
                    default:
                        int i6 = i1g.b;
                        Context requireContext2 = historicalDataTopPerformanceModal.requireContext();
                        requireContext2.getClass();
                        Context applicationContext = requireContext2.getApplicationContext();
                        applicationContext.getClass();
                        Resources resources = requireContext2.getResources();
                        i1g i1gVar = new i1g(applicationContext);
                        i1gVar.a = resources;
                        return i1gVar;
                }
            }
        });
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View C(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.historical_data_top_performance_modal_header, (ViewGroup) null, false);
        int i = R.id.category_spinner;
        ComposeView composeView = (ComposeView) nq8.B(R.id.category_spinner, inflate);
        if (composeView != null) {
            i = R.id.player_position_header;
            TypeHeaderView typeHeaderView = (TypeHeaderView) nq8.B(R.id.player_position_header, inflate);
            if (typeHeaderView != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                if (G() != ulj.TOP_TEAMS) {
                    g5k g5kVar = new g5k(typeHeaderView);
                    kp5<nre> kp5Var = nre.d;
                    ArrayList arrayList = new ArrayList(k13.r(kp5Var, 10));
                    for (nre nreVar : kp5Var) {
                        Context requireContext = requireContext();
                        requireContext.getClass();
                        arrayList.add(nreVar.a(requireContext, (Gender) this.F.getValue()));
                    }
                    g5kVar.a = arrayList;
                    g5kVar.m = new ur1(this, 10);
                    g5kVar.b();
                } else {
                    typeHeaderView.setVisibility(8);
                }
                composeView.setContent(new tc3(-1287139604, new hl7(this, 25), true));
                linearLayout.getClass();
                return linearLayout;
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        RecyclerView recyclerView = w74.b(layoutInflater, null).c;
        Context context = recyclerView.getContext();
        context.getClass();
        z8e.b0(recyclerView, context, false, true, null, 22);
        recyclerView.setAdapter((tlj) this.I.getValue());
        s(recyclerView);
        return recyclerView;
    }

    public final ulj G() {
        return (ulj) this.D.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((i1g) this.K.getValue()).a = null;
        super.onDestroy();
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ac9 ac9Var = (ac9) this.C.getValue();
        ac9Var.g.e(getViewLifecycleOwner(), new y7(28, new xb9(this, 0)));
        otk otkVar = this.B;
        ac9Var.h = ((gya) otkVar.getValue()).j;
        Season season = ((gya) otkVar.getValue()).k;
        ac9Var.i = season != null ? Integer.valueOf(season.getId()) : null;
        ac9Var.j = G();
        ac9Var.k((i1g) this.K.getValue());
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        ulj G = G();
        return G != null ? G.a : "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0098, code lost:
    
        if (r0 == null) goto L36;
     */
    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String z() {
        Integer valueOf;
        String str;
        Season season = ((gya) this.B.getValue()).k;
        boolean c = Intrinsics.c(season != null ? Boolean.valueOf(season.isAllTimeSeason()) : null, Boolean.TRUE);
        ulj G = G();
        ulj uljVar = ulj.TOP_PLAYERS;
        if (G == uljVar && c) {
            valueOf = Integer.valueOf(R.string.all_time_top_players);
        } else if (G() == uljVar) {
            valueOf = Integer.valueOf(R.string.top_players_year);
        } else {
            ulj G2 = G();
            ulj uljVar2 = ulj.TOP_TEAMS;
            if (G2 == uljVar2 && c) {
                valueOf = Integer.valueOf(R.string.all_time_top_teams);
            } else if (G() == uljVar2) {
                valueOf = Integer.valueOf(R.string.top_teams_year);
            } else {
                ulj G3 = G();
                ulj uljVar3 = ulj.TOP_STATS;
                valueOf = (G3 == uljVar3 && c) ? Integer.valueOf(R.string.all_time_top_stats) : G() == uljVar3 ? Integer.valueOf(R.string.top_stats_year) : null;
            }
        }
        if (valueOf == null) {
            return null;
        }
        int intValue = valueOf.intValue();
        if (c) {
            return getString(intValue);
        }
        if (season != null) {
            Context requireContext = requireContext();
            requireContext.getClass();
            str = w3a.C(season, requireContext);
        }
        str = "";
        return getString(intValue, str);
    }
}
