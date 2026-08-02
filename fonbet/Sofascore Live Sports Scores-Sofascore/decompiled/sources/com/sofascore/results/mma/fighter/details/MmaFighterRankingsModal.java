package com.sofascore.results.mma.fighter.details;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.results.R;
import com.sofascore.results.mma.fighter.details.MmaFighterRankingsModal;
import defpackage.bba;
import defpackage.duf;
import defpackage.eqb;
import defpackage.gz8;
import defpackage.hoc;
import defpackage.ioc;
import defpackage.jmc;
import defpackage.joa;
import defpackage.llc;
import defpackage.mnc;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.otk;
import defpackage.rq3;
import defpackage.un0;
import defpackage.wya;
import defpackage.xw3;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z23;
import defpackage.z3f;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/mma/fighter/details/MmaFighterRankingsModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MmaFighterRankingsModal extends Hilt_MmaFighterRankingsModal {
    public z3f B;
    public final otk C;
    public final mqi D;
    public final mqi E;

    public MmaFighterRankingsModal() {
        joa a = ypa.a(ysa.c, new jmc(new jmc(this, 7), 8));
        this.C = new otk(duf.a.getOrCreateKotlinClass(ioc.class), new llc(a, 9), new wya(13, this, a), new llc(a, 10));
        final int i = 0;
        this.D = ypa.b(new Function0(this) { // from class: foc
            public final /* synthetic */ MmaFighterRankingsModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MmaFighterRankingsModal mmaFighterRankingsModal = this.b;
                switch (i2) {
                    case 0:
                        Context requireContext = mmaFighterRankingsModal.requireContext();
                        requireContext.getClass();
                        return new hoc(requireContext);
                    default:
                        Bundle arguments = mmaFighterRankingsModal.getArguments();
                        if (arguments != null) {
                            return arguments.getString(NativeAdContent.ViewTag.AD_TITLE);
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.E = ypa.b(new Function0(this) { // from class: foc
            public final /* synthetic */ MmaFighterRankingsModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MmaFighterRankingsModal mmaFighterRankingsModal = this.b;
                switch (i22) {
                    case 0:
                        Context requireContext = mmaFighterRankingsModal.requireContext();
                        requireContext.getClass();
                        return new hoc(requireContext);
                    default:
                        Bundle arguments = mmaFighterRankingsModal.getArguments();
                        if (arguments != null) {
                            return arguments.getString(NativeAdContent.ViewTag.AD_TITLE);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.recycler_with_progressbar, (ViewGroup) v().l, false);
        int i = R.id.progress_bar;
        ProgressBar progressBar = (ProgressBar) nq8.B(R.id.progress_bar, inflate);
        if (progressBar != null) {
            i = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.recycler_view, inflate);
            if (recyclerView != null) {
                this.B = new z3f(2, recyclerView, (FrameLayout) inflate, progressBar);
                mqi mqiVar = this.D;
                hoc hocVar = (hoc) mqiVar.getValue();
                bba bbaVar = new bba(this, 15);
                hocVar.getClass();
                hocVar.a.d = bbaVar;
                RecyclerView recyclerView2 = (RecyclerView) G().d;
                Context requireContext = requireContext();
                requireContext.getClass();
                z8e.b0(recyclerView2, requireContext, false, false, null, 22);
                s(recyclerView2);
                recyclerView2.setAdapter((hoc) mqiVar.getValue());
                FrameLayout frameLayout = (FrameLayout) G().b;
                frameLayout.getClass();
                return frameLayout;
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public final z3f G() {
        z3f z3fVar = this.B;
        if (z3fVar != null) {
            return z3fVar;
        }
        Intrinsics.i("dialogBinding");
        throw null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        int i = requireArguments().getInt("UNIQUE_TOURNAMENT_ID", 0);
        String string = requireArguments().getString("WEIGHT_CLASS", "");
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        Gender gender = (Gender) gz8.M(requireArguments, "GENDER", Gender.class);
        otk otkVar = this.C;
        if (gender != null) {
            ioc iocVar = (ioc) otkVar.getValue();
            string.getClass();
            xw3.L(un0.z(iocVar), null, null, new z23(iocVar, i, string, gender, (rq3) null, 13), 3);
        }
        ((RecyclerView) G().d).setVisibility(8);
        ((ProgressBar) G().c).setVisibility(0);
        ((ioc) otkVar.getValue()).g.e(getViewLifecycleOwner(), new eqb(9, new mnc(this, 2)));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "RankingModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return (String) this.E.getValue();
    }
}
