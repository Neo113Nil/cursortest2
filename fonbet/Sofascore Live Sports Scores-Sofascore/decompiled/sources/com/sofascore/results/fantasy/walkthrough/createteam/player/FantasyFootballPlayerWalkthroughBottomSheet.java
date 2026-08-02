package com.sofascore.results.fantasy.walkthrough.createteam.player;

import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.fantasy.competition.team.player.FantasyFootballPlayerBottomSheet;
import com.sofascore.results.fantasy.ui.model.FantasyFootballPlayerPlaceholder;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.fantasy.walkthrough.createteam.player.FantasyFootballPlayerWalkthroughBottomSheet;
import com.sofascore.results.fantasy.walkthrough.createteam.selectreplacement.FantasyWalkthroughSelectReplacementDialogFragment;
import defpackage.duf;
import defpackage.otk;
import defpackage.rse;
import defpackage.s67;
import defpackage.vp7;
import defpackage.yz6;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/walkthrough/createteam/player/FantasyFootballPlayerWalkthroughBottomSheet;", "Lcom/sofascore/results/fantasy/competition/team/player/FantasyFootballPlayerBottomSheet;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyFootballPlayerWalkthroughBottomSheet extends FantasyFootballPlayerBottomSheet {
    public final otk D = new otk(duf.a.getOrCreateKotlinClass(vp7.class), new yz6(this, 0), new yz6(this, 2), new yz6(this, 1));

    @Override // com.sofascore.results.fantasy.competition.team.player.FantasyFootballPlayerBottomSheet
    public final rse L() {
        final int i = 0;
        final int i2 = 1;
        return new rse(s67.i, s67.l, new Function0(this) { // from class: xz6
            public final /* synthetic */ FantasyFootballPlayerWalkthroughBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                FantasyFootballPlayerWalkthroughBottomSheet fantasyFootballPlayerWalkthroughBottomSheet = this.b;
                switch (i3) {
                    case 0:
                        vp7 vp7Var = (vp7) fantasyFootballPlayerWalkthroughBottomSheet.D.getValue();
                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = fantasyFootballPlayerWalkthroughBottomSheet.M().j;
                        fantasyRoundPlayerUiModel.getClass();
                        gv9<oz6> gv9Var = vp7Var.k().d;
                        ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                        for (oz6 oz6Var : gv9Var) {
                            if (oz6Var.getE() == fantasyRoundPlayerUiModel.a) {
                                oz6Var = new FantasyFootballPlayerPlaceholder(fantasyRoundPlayerUiModel.b, fantasyRoundPlayerUiModel.d);
                            }
                            arrayList.add(oz6Var);
                        }
                        qp7 k = vp7Var.k();
                        gv9 W = l6g.W(arrayList);
                        int i4 = 0;
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if ((((oz6) it.next()) instanceof FantasyRoundPlayerUiModel) && (i4 = i4 + 1) < 0) {
                                    b.p();
                                    throw null;
                                }
                            }
                        }
                        vp7Var.m(qp7.a(k, W, i4, false, false, null, null, 487));
                        vp7Var.n();
                        return Unit.a;
                    default:
                        ((vp7) fantasyFootballPlayerWalkthroughBottomSheet.D.getValue()).o = fantasyFootballPlayerWalkthroughBottomSheet.M().j;
                        int i5 = fantasyFootballPlayerWalkthroughBottomSheet.M().k;
                        int i6 = fantasyFootballPlayerWalkthroughBottomSheet.M().m;
                        String str = fantasyFootballPlayerWalkthroughBottomSheet.M().j.b.b;
                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 = fantasyFootballPlayerWalkthroughBottomSheet.M().j;
                        FantasyWalkthroughSelectReplacementDialogFragment fantasyWalkthroughSelectReplacementDialogFragment = new FantasyWalkthroughSelectReplacementDialogFragment();
                        fantasyWalkthroughSelectReplacementDialogFragment.setArguments(fz8.C(fz8.D(i5, "competitionId"), fz8.D(i6, "roundId"), fz8.H("position", str), fz8.F(SearchResponseKt.PLAYER_ENTITY, fantasyRoundPlayerUiModel2)));
                        fantasyWalkthroughSelectReplacementDialogFragment.p(fantasyFootballPlayerWalkthroughBottomSheet.requireActivity().k(), "");
                        return Unit.a;
                }
            }
        }, new Function0(this) { // from class: xz6
            public final /* synthetic */ FantasyFootballPlayerWalkthroughBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                FantasyFootballPlayerWalkthroughBottomSheet fantasyFootballPlayerWalkthroughBottomSheet = this.b;
                switch (i3) {
                    case 0:
                        vp7 vp7Var = (vp7) fantasyFootballPlayerWalkthroughBottomSheet.D.getValue();
                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = fantasyFootballPlayerWalkthroughBottomSheet.M().j;
                        fantasyRoundPlayerUiModel.getClass();
                        gv9<oz6> gv9Var = vp7Var.k().d;
                        ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                        for (oz6 oz6Var : gv9Var) {
                            if (oz6Var.getE() == fantasyRoundPlayerUiModel.a) {
                                oz6Var = new FantasyFootballPlayerPlaceholder(fantasyRoundPlayerUiModel.b, fantasyRoundPlayerUiModel.d);
                            }
                            arrayList.add(oz6Var);
                        }
                        qp7 k = vp7Var.k();
                        gv9 W = l6g.W(arrayList);
                        int i4 = 0;
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if ((((oz6) it.next()) instanceof FantasyRoundPlayerUiModel) && (i4 = i4 + 1) < 0) {
                                    b.p();
                                    throw null;
                                }
                            }
                        }
                        vp7Var.m(qp7.a(k, W, i4, false, false, null, null, 487));
                        vp7Var.n();
                        return Unit.a;
                    default:
                        ((vp7) fantasyFootballPlayerWalkthroughBottomSheet.D.getValue()).o = fantasyFootballPlayerWalkthroughBottomSheet.M().j;
                        int i5 = fantasyFootballPlayerWalkthroughBottomSheet.M().k;
                        int i6 = fantasyFootballPlayerWalkthroughBottomSheet.M().m;
                        String str = fantasyFootballPlayerWalkthroughBottomSheet.M().j.b.b;
                        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel2 = fantasyFootballPlayerWalkthroughBottomSheet.M().j;
                        FantasyWalkthroughSelectReplacementDialogFragment fantasyWalkthroughSelectReplacementDialogFragment = new FantasyWalkthroughSelectReplacementDialogFragment();
                        fantasyWalkthroughSelectReplacementDialogFragment.setArguments(fz8.C(fz8.D(i5, "competitionId"), fz8.D(i6, "roundId"), fz8.H("position", str), fz8.F(SearchResponseKt.PLAYER_ENTITY, fantasyRoundPlayerUiModel2)));
                        fantasyWalkthroughSelectReplacementDialogFragment.p(fantasyFootballPlayerWalkthroughBottomSheet.requireActivity().k(), "");
                        return Unit.a;
                }
            }
        });
    }
}
