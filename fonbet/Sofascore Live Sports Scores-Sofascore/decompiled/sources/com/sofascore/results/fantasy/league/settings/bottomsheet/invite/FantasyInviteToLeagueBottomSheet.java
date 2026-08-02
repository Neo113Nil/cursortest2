package com.sofascore.results.fantasy.league.settings.bottomsheet.invite;

import com.sofascore.results.R;
import defpackage.duf;
import defpackage.h27;
import defpackage.jo6;
import defpackage.joa;
import defpackage.l07;
import defpackage.otk;
import defpackage.tc3;
import defpackage.xp6;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z07;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/league/settings/bottomsheet/invite/FantasyInviteToLeagueBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyInviteToLeagueBottomSheet extends Hilt_FantasyInviteToLeagueBottomSheet {
    public final otk C;

    public FantasyInviteToLeagueBottomSheet() {
        joa a = ypa.a(ysa.c, new l07(new l07(this, 7), 8));
        this.C = new otk(duf.a.getOrCreateKotlinClass(h27.class), new xp6(a, 27), new z07(2, this, a), new xp6(a, 28));
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H */
    public final tc3 getF() {
        return new tc3(-727292602, new jo6(this, 19), true);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "ShareLeagueModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(R.string.fantasy_invite_players_title);
        string.getClass();
        return string;
    }
}
