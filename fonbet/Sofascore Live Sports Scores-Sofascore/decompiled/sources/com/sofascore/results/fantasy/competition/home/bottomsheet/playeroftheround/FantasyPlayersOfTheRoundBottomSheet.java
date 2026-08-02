package com.sofascore.results.fantasy.competition.home.bottomsheet.playeroftheround;

import com.sofascore.results.R;
import defpackage.duf;
import defpackage.jo6;
import defpackage.joa;
import defpackage.l07;
import defpackage.l27;
import defpackage.otk;
import defpackage.qo6;
import defpackage.tc3;
import defpackage.te7;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z07;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/competition/home/bottomsheet/playeroftheround/FantasyPlayersOfTheRoundBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyPlayersOfTheRoundBottomSheet extends Hilt_FantasyPlayersOfTheRoundBottomSheet {
    public final otk C;
    public final joa D;
    public final tc3 E;

    public FantasyPlayersOfTheRoundBottomSheet() {
        l07 l07Var = new l07(this, 17);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new l07(l07Var, 18));
        this.C = new otk(duf.a.getOrCreateKotlinClass(te7.class), new l27(a, 11), new z07(9, this, a), new l27(a, 12));
        this.D = ypa.a(ysaVar, new qo6(this, 16));
        this.E = new tc3(396240676, new jo6(this, 28), true);
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H, reason: from getter */
    public final tc3 getE() {
        return this.E;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "TopGameweekPlayerModal";
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog, com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x */
    public final boolean getB() {
        return false;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(R.string.fantasy_top_players_by_round);
        string.getClass();
        return string;
    }
}
