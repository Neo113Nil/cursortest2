package com.sofascore.results.notifications.ui;

import com.sofascore.results.R;
import defpackage.duf;
import defpackage.joa;
import defpackage.khd;
import defpackage.otk;
import defpackage.t1d;
import defpackage.tc3;
import defpackage.u1d;
import defpackage.v1d;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/notifications/ui/MuteNotificationsBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MuteNotificationsBottomSheet extends Hilt_MuteNotificationsBottomSheet {
    public final otk C;
    public final boolean D = true;
    public final joa E;

    public MuteNotificationsBottomSheet() {
        int i = 0;
        this.C = new otk(duf.a.getOrCreateKotlinClass(khd.class), new v1d(this, i), new v1d(this, 2), new v1d(this, 1));
        this.E = ypa.a(ysa.c, new u1d(this, i));
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H */
    public final tc3 getF() {
        return new tc3(1497392291, new t1d(this, 0), true);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "NotificationMuteModal";
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog, com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getW() {
        return this.D;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(R.string.mute_notifications);
        string.getClass();
        return string;
    }
}
