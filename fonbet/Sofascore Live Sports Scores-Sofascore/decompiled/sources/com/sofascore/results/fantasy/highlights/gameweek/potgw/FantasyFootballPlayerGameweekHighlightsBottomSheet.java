package com.sofascore.results.fantasy.highlights.gameweek.potgw;

import android.content.DialogInterface;
import com.sofascore.results.fantasy.competition.team.player.FantasyFootballPlayerBottomSheet;
import defpackage.duf;
import defpackage.hs6;
import defpackage.j07;
import defpackage.n17;
import defpackage.nz6;
import defpackage.o17;
import defpackage.otk;
import defpackage.rq3;
import defpackage.un0;
import defpackage.xw3;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/highlights/gameweek/potgw/FantasyFootballPlayerGameweekHighlightsBottomSheet;", "Lcom/sofascore/results/fantasy/competition/team/player/FantasyFootballPlayerBottomSheet;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyFootballPlayerGameweekHighlightsBottomSheet extends FantasyFootballPlayerBottomSheet {
    public final otk D = new otk(duf.a.getOrCreateKotlinClass(j07.class), new nz6(this, 0), new nz6(this, 2), new nz6(this, 1));

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        j07 j07Var = (j07) this.D.getValue();
        xw3.L(un0.z(j07Var), null, null, new hs6(j07Var, o17.a, (rq3) null, 7), 3);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        j07 j07Var = (j07) this.D.getValue();
        xw3.L(un0.z(j07Var), null, null, new hs6(j07Var, n17.a, (rq3) null, 7), 3);
    }
}
