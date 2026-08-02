package com.sofascore.results.fantasy.competition.home.bottomsheet.chat;

import defpackage.ay5;
import defpackage.ce4;
import defpackage.duf;
import defpackage.eoh;
import defpackage.fi5;
import defpackage.go6;
import defpackage.joa;
import defpackage.ko6;
import defpackage.lo6;
import defpackage.otk;
import defpackage.rq3;
import defpackage.t06;
import defpackage.tc3;
import defpackage.un0;
import defpackage.xw3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/competition/home/bottomsheet/chat/FantasyChatsBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyChatsBottomSheet extends Hilt_FantasyChatsBottomSheet {
    public final otk C;

    public FantasyChatsBottomSheet() {
        joa a = ypa.a(ysa.c, new t06(new t06(this, 12), 13));
        this.C = new otk(duf.a.getOrCreateKotlinClass(lo6.class), new ay5(a, 25), new fi5(this, a, 16), new ay5(a, 26));
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H */
    public final tc3 getE() {
        return new tc3(726782603, new go6(this, 0), true);
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    public final Function2 I() {
        return new tc3(-228018767, new go6(this, 1), true);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        otk otkVar = this.C;
        if (((ko6) ((eoh) ((lo6) otkVar.getValue()).i).getValue()).c) {
            return;
        }
        lo6 lo6Var = (lo6) otkVar.getValue();
        xw3.L(un0.z(lo6Var), null, null, new ce4(lo6Var, (rq3) null, 21), 3);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "ChatListModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
