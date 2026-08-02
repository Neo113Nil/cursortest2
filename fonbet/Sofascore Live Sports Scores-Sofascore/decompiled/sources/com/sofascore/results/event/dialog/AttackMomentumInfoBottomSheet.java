package com.sofascore.results.event.dialog;

import android.content.Context;
import android.os.Bundle;
import com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog;
import com.sofascore.results.event.dialog.AttackMomentumInfoBottomSheet;
import defpackage.joa;
import defpackage.nm0;
import defpackage.q9k;
import defpackage.t21;
import defpackage.tc3;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/event/dialog/AttackMomentumInfoBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AttackMomentumInfoBottomSheet extends ComposeModalBottomSheetDialog {
    public final joa A;
    public final joa B;
    public final tc3 C;
    public final joa x;
    public final joa y;
    public final joa z;

    public AttackMomentumInfoBottomSheet() {
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: lm0
            public final /* synthetic */ AttackMomentumInfoBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2;
                int i3 = i;
                AttackMomentumInfoBottomSheet attackMomentumInfoBottomSheet = this.b;
                switch (i3) {
                    case 0:
                        Bundle requireArguments = attackMomentumInfoBottomSheet.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ATTACK_MOMENTUM_SPORT", nm0.class);
                        if (M != null) {
                            return (nm0) M;
                        }
                        a70.p("Serializable ATTACK_MOMENTUM_SPORT not found");
                        return null;
                    case 1:
                        i2 = attackMomentumInfoBottomSheet.requireArguments().getInt("FIRST_TEAM_ID");
                        break;
                    case 2:
                        String string = attackMomentumInfoBottomSheet.requireArguments().getString("FIRST_TEAM_NAME");
                        return string == null ? "" : string;
                    case 3:
                        i2 = attackMomentumInfoBottomSheet.requireArguments().getInt("SECOND_TEAM_ID");
                        break;
                    default:
                        String string2 = attackMomentumInfoBottomSheet.requireArguments().getString("SECOND_TEAM_NAME");
                        return string2 == null ? "" : string2;
                }
                return Integer.valueOf(i2);
            }
        };
        ysa ysaVar = ysa.c;
        this.x = ypa.a(ysaVar, function0);
        final int i2 = 1;
        this.y = ypa.a(ysaVar, new Function0(this) { // from class: lm0
            public final /* synthetic */ AttackMomentumInfoBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22;
                int i3 = i2;
                AttackMomentumInfoBottomSheet attackMomentumInfoBottomSheet = this.b;
                switch (i3) {
                    case 0:
                        Bundle requireArguments = attackMomentumInfoBottomSheet.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ATTACK_MOMENTUM_SPORT", nm0.class);
                        if (M != null) {
                            return (nm0) M;
                        }
                        a70.p("Serializable ATTACK_MOMENTUM_SPORT not found");
                        return null;
                    case 1:
                        i22 = attackMomentumInfoBottomSheet.requireArguments().getInt("FIRST_TEAM_ID");
                        break;
                    case 2:
                        String string = attackMomentumInfoBottomSheet.requireArguments().getString("FIRST_TEAM_NAME");
                        return string == null ? "" : string;
                    case 3:
                        i22 = attackMomentumInfoBottomSheet.requireArguments().getInt("SECOND_TEAM_ID");
                        break;
                    default:
                        String string2 = attackMomentumInfoBottomSheet.requireArguments().getString("SECOND_TEAM_NAME");
                        return string2 == null ? "" : string2;
                }
                return Integer.valueOf(i22);
            }
        });
        final int i3 = 2;
        this.z = ypa.a(ysaVar, new Function0(this) { // from class: lm0
            public final /* synthetic */ AttackMomentumInfoBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22;
                int i32 = i3;
                AttackMomentumInfoBottomSheet attackMomentumInfoBottomSheet = this.b;
                switch (i32) {
                    case 0:
                        Bundle requireArguments = attackMomentumInfoBottomSheet.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ATTACK_MOMENTUM_SPORT", nm0.class);
                        if (M != null) {
                            return (nm0) M;
                        }
                        a70.p("Serializable ATTACK_MOMENTUM_SPORT not found");
                        return null;
                    case 1:
                        i22 = attackMomentumInfoBottomSheet.requireArguments().getInt("FIRST_TEAM_ID");
                        break;
                    case 2:
                        String string = attackMomentumInfoBottomSheet.requireArguments().getString("FIRST_TEAM_NAME");
                        return string == null ? "" : string;
                    case 3:
                        i22 = attackMomentumInfoBottomSheet.requireArguments().getInt("SECOND_TEAM_ID");
                        break;
                    default:
                        String string2 = attackMomentumInfoBottomSheet.requireArguments().getString("SECOND_TEAM_NAME");
                        return string2 == null ? "" : string2;
                }
                return Integer.valueOf(i22);
            }
        });
        final int i4 = 3;
        this.A = ypa.a(ysaVar, new Function0(this) { // from class: lm0
            public final /* synthetic */ AttackMomentumInfoBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22;
                int i32 = i4;
                AttackMomentumInfoBottomSheet attackMomentumInfoBottomSheet = this.b;
                switch (i32) {
                    case 0:
                        Bundle requireArguments = attackMomentumInfoBottomSheet.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ATTACK_MOMENTUM_SPORT", nm0.class);
                        if (M != null) {
                            return (nm0) M;
                        }
                        a70.p("Serializable ATTACK_MOMENTUM_SPORT not found");
                        return null;
                    case 1:
                        i22 = attackMomentumInfoBottomSheet.requireArguments().getInt("FIRST_TEAM_ID");
                        break;
                    case 2:
                        String string = attackMomentumInfoBottomSheet.requireArguments().getString("FIRST_TEAM_NAME");
                        return string == null ? "" : string;
                    case 3:
                        i22 = attackMomentumInfoBottomSheet.requireArguments().getInt("SECOND_TEAM_ID");
                        break;
                    default:
                        String string2 = attackMomentumInfoBottomSheet.requireArguments().getString("SECOND_TEAM_NAME");
                        return string2 == null ? "" : string2;
                }
                return Integer.valueOf(i22);
            }
        });
        final int i5 = 4;
        this.B = ypa.a(ysaVar, new Function0(this) { // from class: lm0
            public final /* synthetic */ AttackMomentumInfoBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22;
                int i32 = i5;
                AttackMomentumInfoBottomSheet attackMomentumInfoBottomSheet = this.b;
                switch (i32) {
                    case 0:
                        Bundle requireArguments = attackMomentumInfoBottomSheet.requireArguments();
                        requireArguments.getClass();
                        Serializable M = gz8.M(requireArguments, "ATTACK_MOMENTUM_SPORT", nm0.class);
                        if (M != null) {
                            return (nm0) M;
                        }
                        a70.p("Serializable ATTACK_MOMENTUM_SPORT not found");
                        return null;
                    case 1:
                        i22 = attackMomentumInfoBottomSheet.requireArguments().getInt("FIRST_TEAM_ID");
                        break;
                    case 2:
                        String string = attackMomentumInfoBottomSheet.requireArguments().getString("FIRST_TEAM_NAME");
                        return string == null ? "" : string;
                    case 3:
                        i22 = attackMomentumInfoBottomSheet.requireArguments().getInt("SECOND_TEAM_ID");
                        break;
                    default:
                        String string2 = attackMomentumInfoBottomSheet.requireArguments().getString("SECOND_TEAM_NAME");
                        return string2 == null ? "" : string2;
                }
                return Integer.valueOf(i22);
            }
        });
        this.C = new tc3(-1606845723, new t21(this, 10), true);
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H, reason: from getter */
    public final tc3 getI() {
        return this.C;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "AttackMomentumModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        q9k q9kVar = ((nm0) this.x.getValue()).a;
        Context requireContext = requireContext();
        requireContext.getClass();
        return q9kVar.b(requireContext);
    }
}
