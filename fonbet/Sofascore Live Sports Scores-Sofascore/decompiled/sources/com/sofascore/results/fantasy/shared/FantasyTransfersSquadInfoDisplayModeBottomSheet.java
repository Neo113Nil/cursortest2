package com.sofascore.results.fantasy.shared;

import defpackage.ao7;
import defpackage.duf;
import defpackage.mk7;
import defpackage.mqi;
import defpackage.otk;
import defpackage.ps4;
import defpackage.vz6;
import defpackage.ypa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/shared/FantasyTransfersSquadInfoDisplayModeBottomSheet;", "Lcom/sofascore/results/fantasy/shared/FantasySquadInfoDisplayModeBottomSheet;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyTransfersSquadInfoDisplayModeBottomSheet extends FantasySquadInfoDisplayModeBottomSheet {
    public final otk x;

    public FantasyTransfersSquadInfoDisplayModeBottomSheet() {
        mqi b = ypa.b(new ps4(this, 4));
        vz6 vz6Var = new vz6(b, 11);
        this.x = new otk(duf.a.getOrCreateKotlinClass(ao7.class), vz6Var, new vz6(b, 13), new vz6(b, 12));
    }

    @Override // com.sofascore.results.fantasy.shared.FantasySquadInfoDisplayModeBottomSheet
    public final mk7 F() {
        return (mk7) this.x.getValue();
    }
}
