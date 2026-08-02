package com.sofascore.results.fantasy.teammanagement.player;

import com.sofascore.results.fantasy.competition.team.player.FantasyFootballPlayerBottomSheet;
import com.sofascore.results.fantasy.teammanagement.player.FantasyFootballPlayerSubstitutionsBottomSheet;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import defpackage.duf;
import defpackage.ll7;
import defpackage.ml7;
import defpackage.otk;
import defpackage.rse;
import defpackage.rz6;
import defpackage.s67;
import defpackage.tz6;
import defpackage.zic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/teammanagement/player/FantasyFootballPlayerSubstitutionsBottomSheet;", "Lcom/sofascore/results/fantasy/competition/team/player/FantasyFootballPlayerBottomSheet;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyFootballPlayerSubstitutionsBottomSheet extends FantasyFootballPlayerBottomSheet {
    public final otk D = new otk(duf.a.getOrCreateKotlinClass(ml7.class), new tz6(this, 0), new tz6(this, 2), new tz6(this, 1));

    @Override // com.sofascore.results.fantasy.competition.team.player.FantasyFootballPlayerBottomSheet
    public final rse L() {
        int i;
        boolean z;
        boolean z2;
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = M().j;
        List S0 = CollectionsKt.S0(((ll7) ((ml7) this.D.getValue()).n.a.getValue()).c);
        final int i2 = 0;
        Function0 function0 = new Function0(this) { // from class: sz6
            public final /* synthetic */ FantasyFootballPlayerSubstitutionsBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                FantasyFootballPlayerSubstitutionsBottomSheet fantasyFootballPlayerSubstitutionsBottomSheet = this.b;
                switch (i3) {
                    case 0:
                        ((ml7) fantasyFootballPlayerSubstitutionsBottomSheet.D.getValue()).m(fantasyFootballPlayerSubstitutionsBottomSheet.M().j);
                        break;
                    case 1:
                        ((ml7) fantasyFootballPlayerSubstitutionsBottomSheet.D.getValue()).n(fantasyFootballPlayerSubstitutionsBottomSheet.M().j);
                        break;
                    default:
                        ((ml7) fantasyFootballPlayerSubstitutionsBottomSheet.D.getValue()).o(fantasyFootballPlayerSubstitutionsBottomSheet.M().j);
                        break;
                }
                return Unit.a;
            }
        };
        final int i3 = 1;
        Function0 function02 = new Function0(this) { // from class: sz6
            public final /* synthetic */ FantasyFootballPlayerSubstitutionsBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                FantasyFootballPlayerSubstitutionsBottomSheet fantasyFootballPlayerSubstitutionsBottomSheet = this.b;
                switch (i32) {
                    case 0:
                        ((ml7) fantasyFootballPlayerSubstitutionsBottomSheet.D.getValue()).m(fantasyFootballPlayerSubstitutionsBottomSheet.M().j);
                        break;
                    case 1:
                        ((ml7) fantasyFootballPlayerSubstitutionsBottomSheet.D.getValue()).n(fantasyFootballPlayerSubstitutionsBottomSheet.M().j);
                        break;
                    default:
                        ((ml7) fantasyFootballPlayerSubstitutionsBottomSheet.D.getValue()).o(fantasyFootballPlayerSubstitutionsBottomSheet.M().j);
                        break;
                }
                return Unit.a;
            }
        };
        final int i4 = 2;
        Function0 function03 = new Function0(this) { // from class: sz6
            public final /* synthetic */ FantasyFootballPlayerSubstitutionsBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i4;
                FantasyFootballPlayerSubstitutionsBottomSheet fantasyFootballPlayerSubstitutionsBottomSheet = this.b;
                switch (i32) {
                    case 0:
                        ((ml7) fantasyFootballPlayerSubstitutionsBottomSheet.D.getValue()).m(fantasyFootballPlayerSubstitutionsBottomSheet.M().j);
                        break;
                    case 1:
                        ((ml7) fantasyFootballPlayerSubstitutionsBottomSheet.D.getValue()).n(fantasyFootballPlayerSubstitutionsBottomSheet.M().j);
                        break;
                    default:
                        ((ml7) fantasyFootballPlayerSubstitutionsBottomSheet.D.getValue()).o(fantasyFootballPlayerSubstitutionsBottomSheet.M().j);
                        break;
                }
                return Unit.a;
            }
        };
        fantasyRoundPlayerUiModel.getClass();
        S0.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : S0) {
            if (!((FantasyRoundPlayerUiModel) obj).k) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : S0) {
            if (((FantasyRoundPlayerUiModel) obj2).k) {
                arrayList2.add(obj2);
            }
        }
        rz6 rz6Var = fantasyRoundPlayerUiModel.b;
        boolean z3 = fantasyRoundPlayerUiModel.v;
        if (rz6Var != rz6.h) {
            if (!arrayList2.isEmpty()) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 = (FantasyRoundPlayerUiModel) it.next();
                    if (!fantasyRoundPlayerUiModel2.v) {
                        if (fantasyRoundPlayerUiModel2.b != rz6Var) {
                            if (arrayList.isEmpty()) {
                                i = 0;
                            } else {
                                Iterator it2 = arrayList.iterator();
                                i = 0;
                                while (it2.hasNext()) {
                                    if (((FantasyRoundPlayerUiModel) it2.next()).b == rz6Var && (i = i + 1) < 0) {
                                        b.p();
                                        throw null;
                                    }
                                }
                            }
                            if (i > rz6Var.d) {
                            }
                        }
                        i2 = 1;
                        break;
                    }
                }
            }
            z = fantasyRoundPlayerUiModel.k;
            if (!z) {
            }
            if (z) {
            }
            z2 = fantasyRoundPlayerUiModel.m;
            if (z2) {
            }
            if (z2) {
            }
            return null;
        }
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel3 = (FantasyRoundPlayerUiModel) it3.next();
                if (fantasyRoundPlayerUiModel3.b == rz6.h && !fantasyRoundPlayerUiModel3.v) {
                    i2 = 1;
                    break;
                }
            }
        }
        z = fantasyRoundPlayerUiModel.k;
        if (!z && !z3) {
            return zic.p(s67.h, function02, null, null, 60);
        }
        if (z && z3) {
            s67 s67Var = s67.g;
            if (i2 == 0) {
                s67Var = null;
            }
            return zic.p(s67Var, function03, null, null, 60);
        }
        z2 = fantasyRoundPlayerUiModel.m;
        if (z2 || z3) {
            if (!z2 || z3) {
                return null;
            }
            return zic.p(s67.f, function0, i2 != 0 ? s67.g : null, function03, 48);
        }
        s67 s67Var2 = s67.g;
        if (i2 == 0) {
            s67Var2 = null;
        }
        return zic.p(s67Var2, function03, null, null, 60);
    }
}
