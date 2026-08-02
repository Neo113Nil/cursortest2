package com.sofascore.results.fantasy.competition.team.bottomsheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import com.sofascore.results.fantasy.competition.team.bottomsheet.FantasyShareSquadBottomSheet;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import defpackage.ik7;
import defpackage.joa;
import defpackage.tc3;
import defpackage.ypa;
import defpackage.yrh;
import defpackage.ysa;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/competition/team/bottomsheet/FantasyShareSquadBottomSheet;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyShareSquadBottomSheet extends BaseModalBottomSheetDialog {
    public final joa w;
    public final joa x;
    public final joa y;
    public final boolean z;

    public FantasyShareSquadBottomSheet() {
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: hk7
            public final /* synthetic */ FantasyShareSquadBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FantasyShareSquadBottomSheet fantasyShareSquadBottomSheet = this.b;
                switch (i2) {
                    case 0:
                        Bundle requireArguments = fantasyShareSquadBottomSheet.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "competition", do7.class);
                        if (M != null) {
                            return (do7) M;
                        }
                        a70.p("Serializable competition not found");
                        return null;
                    case 1:
                        Bundle requireArguments2 = fantasyShareSquadBottomSheet.requireArguments();
                        requireArguments2.getClass();
                        Serializable M2 = gz8.M(requireArguments2, "gameweek", ho7.class);
                        if (M2 != null) {
                            return (ho7) M2;
                        }
                        a70.p("Serializable gameweek not found");
                        return null;
                    default:
                        ArrayList L = gz8.L(fantasyShareSquadBottomSheet.requireArguments(), "squad", FantasyRoundPlayerUiModel.class);
                        return L != null ? L : km5.a;
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.w = ypa.a(ysaVar, function0);
        final int i2 = 1;
        this.x = ypa.a(ysaVar, new Function0(this) { // from class: hk7
            public final /* synthetic */ FantasyShareSquadBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FantasyShareSquadBottomSheet fantasyShareSquadBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = fantasyShareSquadBottomSheet.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "competition", do7.class);
                        if (M != null) {
                            return (do7) M;
                        }
                        a70.p("Serializable competition not found");
                        return null;
                    case 1:
                        Bundle requireArguments2 = fantasyShareSquadBottomSheet.requireArguments();
                        requireArguments2.getClass();
                        Serializable M2 = gz8.M(requireArguments2, "gameweek", ho7.class);
                        if (M2 != null) {
                            return (ho7) M2;
                        }
                        a70.p("Serializable gameweek not found");
                        return null;
                    default:
                        ArrayList L = gz8.L(fantasyShareSquadBottomSheet.requireArguments(), "squad", FantasyRoundPlayerUiModel.class);
                        return L != null ? L : km5.a;
                }
            }
        });
        final int i3 = 2;
        this.y = ypa.a(ysaVar, new Function0(this) { // from class: hk7
            public final /* synthetic */ FantasyShareSquadBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FantasyShareSquadBottomSheet fantasyShareSquadBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        Bundle requireArguments = fantasyShareSquadBottomSheet.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "competition", do7.class);
                        if (M != null) {
                            return (do7) M;
                        }
                        a70.p("Serializable competition not found");
                        return null;
                    case 1:
                        Bundle requireArguments2 = fantasyShareSquadBottomSheet.requireArguments();
                        requireArguments2.getClass();
                        Serializable M2 = gz8.M(requireArguments2, "gameweek", ho7.class);
                        if (M2 != null) {
                            return (ho7) M2;
                        }
                        a70.p("Serializable gameweek not found");
                        return null;
                    default:
                        ArrayList L = gz8.L(fantasyShareSquadBottomSheet.requireArguments(), "squad", FantasyRoundPlayerUiModel.class);
                        return L != null ? L : km5.a;
                }
            }
        });
        this.z = true;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        yrh a = yrh.a(layoutInflater, (FrameLayout) v().l);
        a.b.setContent(new tc3(1387710490, new ik7(this, 0), true));
        CoordinatorLayout coordinatorLayout = a.a;
        coordinatorLayout.getClass();
        return coordinatorLayout;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "ShareSquadModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getZ() {
        return this.z;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
