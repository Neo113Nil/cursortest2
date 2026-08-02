package com.sofascore.results.fantasy.competition.home.bottomsheet.topplayers;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.competition.home.bottomsheet.topplayers.FantasyTopPlayersBottomSheet;
import defpackage.cm7;
import defpackage.duf;
import defpackage.hkg;
import defpackage.hl7;
import defpackage.im7;
import defpackage.joa;
import defpackage.l07;
import defpackage.l27;
import defpackage.otk;
import defpackage.tc3;
import defpackage.ypa;
import defpackage.yrh;
import defpackage.ysa;
import defpackage.z07;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/fantasy/competition/home/bottomsheet/topplayers/FantasyTopPlayersBottomSheet;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "", "isListScrolled", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyTopPlayersBottomSheet extends Hilt_FantasyTopPlayersBottomSheet {
    public final otk B;
    public yrh C;
    public final joa D;
    public final joa E;

    public FantasyTopPlayersBottomSheet() {
        l07 l07Var = new l07(this, 21);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new l07(l07Var, 22));
        this.B = new otk(duf.a.getOrCreateKotlinClass(im7.class), new l27(a, 15), new z07(11, this, a), new l27(a, 16));
        final int i = 0;
        this.D = ypa.a(ysaVar, new Function0(this) { // from class: em7
            public final /* synthetic */ FantasyTopPlayersBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FantasyTopPlayersBottomSheet fantasyTopPlayersBottomSheet = this.b;
                switch (i2) {
                    case 0:
                        Bundle requireArguments = fantasyTopPlayersBottomSheet.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "FANTASY_TOP_PLAYERS_CATEGORY_EXTRA", cm7.class);
                        if (M != null) {
                            return (cm7) M;
                        }
                        a70.p("Serializable FANTASY_TOP_PLAYERS_CATEGORY_EXTRA not found");
                        return null;
                    default:
                        return Boolean.valueOf(fantasyTopPlayersBottomSheet.requireArguments().getBoolean("assetsRestricted"));
                }
            }
        });
        final int i2 = 1;
        this.E = ypa.a(ysaVar, new Function0(this) { // from class: em7
            public final /* synthetic */ FantasyTopPlayersBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FantasyTopPlayersBottomSheet fantasyTopPlayersBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = fantasyTopPlayersBottomSheet.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "FANTASY_TOP_PLAYERS_CATEGORY_EXTRA", cm7.class);
                        if (M != null) {
                            return (cm7) M;
                        }
                        a70.p("Serializable FANTASY_TOP_PLAYERS_CATEGORY_EXTRA not found");
                        return null;
                    default:
                        return Boolean.valueOf(fantasyTopPlayersBottomSheet.requireArguments().getBoolean("assetsRestricted"));
                }
            }
        });
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        yrh a = yrh.a(layoutInflater, (FrameLayout) v().l);
        this.C = a;
        a.b.setContent(new tc3(-1152181979, new hl7(this, 2), true));
        yrh yrhVar = this.C;
        if (yrhVar == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        CoordinatorLayout coordinatorLayout = yrhVar.a;
        coordinatorLayout.getClass();
        return coordinatorLayout;
    }

    public final im7 G() {
        return (im7) this.B.getValue();
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Object parent = view.getParent();
        parent.getClass();
        BottomSheetBehavior.C((View) parent).M(3);
        this.t.b = ((cm7) this.D.getValue()).b;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "TopPlayersModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        Context requireContext = requireContext();
        requireContext.getClass();
        return hkg.Q(requireContext, R.string.top_players, null, new Object[0]);
    }
}
