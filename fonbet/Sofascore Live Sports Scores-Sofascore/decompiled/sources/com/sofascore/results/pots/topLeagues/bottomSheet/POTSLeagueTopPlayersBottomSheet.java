package com.sofascore.results.pots.topLeagues.bottomSheet;

import defpackage.duf;
import defpackage.jmc;
import defpackage.joa;
import defpackage.llc;
import defpackage.otk;
import defpackage.tc3;
import defpackage.w1e;
import defpackage.wya;
import defpackage.xxb;
import defpackage.y1e;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/pots/topLeagues/bottomSheet/POTSLeagueTopPlayersBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "Lgv9;", "Lz2e;", "players", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class POTSLeagueTopPlayersBottomSheet extends Hilt_POTSLeagueTopPlayersBottomSheet {
    public final otk C;
    public final joa D;

    public POTSLeagueTopPlayersBottomSheet() {
        int i = 21;
        jmc jmcVar = new jmc(this, 21);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new jmc(jmcVar, 22));
        this.C = new otk(duf.a.getOrCreateKotlinClass(y1e.class), new llc(a, 23), new wya(i, this, a), new llc(a, 24));
        this.D = ypa.a(ysaVar, new xxb(this, i));
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H */
    public final tc3 getE() {
        return new tc3(1915289094, new w1e(this, 0), true);
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    public final Function2 I() {
        return new tc3(-820793428, new w1e(this, 1), true);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "AllPlayersModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
