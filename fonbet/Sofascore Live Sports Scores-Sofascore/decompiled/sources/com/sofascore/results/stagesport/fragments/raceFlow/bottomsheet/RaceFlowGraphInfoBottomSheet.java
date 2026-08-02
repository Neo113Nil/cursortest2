package com.sofascore.results.stagesport.fragments.raceFlow.bottomsheet;

import android.view.LayoutInflater;
import android.view.View;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceEntrant;
import com.sofascore.results.stagesport.fragments.raceFlow.RaceFlowModels$RaceTeam;
import com.sofascore.results.stagesport.fragments.raceFlow.bottomsheet.RaceFlowGraphInfoBottomSheet;
import defpackage.joa;
import defpackage.t1d;
import defpackage.tc3;
import defpackage.xkf;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yso;
import defpackage.zzl;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/stagesport/fragments/raceFlow/bottomsheet/RaceFlowGraphInfoBottomSheet;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RaceFlowGraphInfoBottomSheet extends BaseModalBottomSheetDialog {
    public final joa w;
    public final joa x;
    public final joa y;
    public final boolean z;

    public RaceFlowGraphInfoBottomSheet() {
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: gkf
            public final /* synthetic */ RaceFlowGraphInfoBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RaceFlowGraphInfoBottomSheet raceFlowGraphInfoBottomSheet = this.b;
                switch (i2) {
                    case 0:
                        Serializable M = gz8.M(raceFlowGraphInfoBottomSheet.requireArguments(), "RACE_FLOW_STAGE_TYPE", xkf.class);
                        if (M == null) {
                            a70.r("Required value was null.");
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        ArrayList L = gz8.L(raceFlowGraphInfoBottomSheet.requireArguments(), "RACE_ENTRANT_TEAMS_ARG", RaceFlowModels$RaceTeam.class);
                        if (L == null) {
                            a70.r("Required value was null.");
                            break;
                        } else {
                            break;
                        }
                    default:
                        ArrayList L2 = gz8.L(raceFlowGraphInfoBottomSheet.requireArguments(), "RACE_ENTRANT_DRIVERS_ARG", RaceFlowModels$RaceEntrant.class);
                        if (L2 == null) {
                            a70.r("Required value was null.");
                            break;
                        } else {
                            break;
                        }
                }
                return null;
            }
        };
        ysa ysaVar = ysa.c;
        this.w = ypa.a(ysaVar, function0);
        final int i2 = 1;
        this.x = ypa.a(ysaVar, new Function0(this) { // from class: gkf
            public final /* synthetic */ RaceFlowGraphInfoBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RaceFlowGraphInfoBottomSheet raceFlowGraphInfoBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        Serializable M = gz8.M(raceFlowGraphInfoBottomSheet.requireArguments(), "RACE_FLOW_STAGE_TYPE", xkf.class);
                        if (M == null) {
                            a70.r("Required value was null.");
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        ArrayList L = gz8.L(raceFlowGraphInfoBottomSheet.requireArguments(), "RACE_ENTRANT_TEAMS_ARG", RaceFlowModels$RaceTeam.class);
                        if (L == null) {
                            a70.r("Required value was null.");
                            break;
                        } else {
                            break;
                        }
                    default:
                        ArrayList L2 = gz8.L(raceFlowGraphInfoBottomSheet.requireArguments(), "RACE_ENTRANT_DRIVERS_ARG", RaceFlowModels$RaceEntrant.class);
                        if (L2 == null) {
                            a70.r("Required value was null.");
                            break;
                        } else {
                            break;
                        }
                }
                return null;
            }
        });
        final int i3 = 2;
        this.y = ypa.a(ysaVar, new Function0(this) { // from class: gkf
            public final /* synthetic */ RaceFlowGraphInfoBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RaceFlowGraphInfoBottomSheet raceFlowGraphInfoBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        Serializable M = gz8.M(raceFlowGraphInfoBottomSheet.requireArguments(), "RACE_FLOW_STAGE_TYPE", xkf.class);
                        if (M == null) {
                            a70.r("Required value was null.");
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        ArrayList L = gz8.L(raceFlowGraphInfoBottomSheet.requireArguments(), "RACE_ENTRANT_TEAMS_ARG", RaceFlowModels$RaceTeam.class);
                        if (L == null) {
                            a70.r("Required value was null.");
                            break;
                        } else {
                            break;
                        }
                    default:
                        ArrayList L2 = gz8.L(raceFlowGraphInfoBottomSheet.requireArguments(), "RACE_ENTRANT_DRIVERS_ARG", RaceFlowModels$RaceEntrant.class);
                        if (L2 == null) {
                            a70.r("Required value was null.");
                            break;
                        } else {
                            break;
                        }
                }
                return null;
            }
        });
        this.z = true;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        return yso.s(this, new tc3(-1826323732, new t1d(this, 22), true));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "RaceFlowInfoModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getW() {
        return this.z;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string;
        int ordinal = ((xkf) this.w.getValue()).ordinal();
        if (ordinal == 0 || ordinal == 1) {
            string = requireContext().getString(R.string.motorsport_race_flow_tab);
        } else {
            if (ordinal != 2) {
                zzl.b();
                return null;
            }
            string = requireContext().getString(R.string.motorsport_wrc_rally_tracker_tab);
        }
        string.getClass();
        return string;
    }
}
