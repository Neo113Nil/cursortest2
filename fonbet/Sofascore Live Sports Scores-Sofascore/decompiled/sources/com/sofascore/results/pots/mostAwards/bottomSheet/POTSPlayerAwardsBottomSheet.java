package com.sofascore.results.pots.mostAwards.bottomSheet;

import defpackage.duf;
import defpackage.jmc;
import defpackage.joa;
import defpackage.llc;
import defpackage.o2e;
import defpackage.otk;
import defpackage.p2e;
import defpackage.r2e;
import defpackage.tc3;
import defpackage.wya;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/pots/mostAwards/bottomSheet/POTSPlayerAwardsBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "Lgv9;", "Ln2e;", "awards", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class POTSPlayerAwardsBottomSheet extends Hilt_POTSPlayerAwardsBottomSheet {
    public final otk C;
    public final joa D;

    public POTSPlayerAwardsBottomSheet() {
        jmc jmcVar = new jmc(this, 25);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new jmc(jmcVar, 26));
        this.C = new otk(duf.a.getOrCreateKotlinClass(r2e.class), new llc(a, 27), new wya(23, this, a), new llc(a, 28));
        this.D = ypa.a(ysaVar, new p2e(this, 0));
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H */
    public final tc3 getD() {
        return new tc3(-1138985936, new o2e(this, 0), true);
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    public final Function2 I() {
        return new tc3(-900846634, new o2e(this, 1), true);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "PlayerMoreModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
