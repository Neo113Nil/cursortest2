package com.sofascore.results.settings.developer;

import defpackage.duf;
import defpackage.fv2;
import defpackage.j63;
import defpackage.joa;
import defpackage.otk;
import defpackage.p24;
import defpackage.q05;
import defpackage.tc3;
import defpackage.y1;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/settings/developer/DeveloperOptionsFullScreenDialog;", "Lcom/sofascore/results/base/compose/architecture/ComposeFullScreenDialogFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeveloperOptionsFullScreenDialog extends Hilt_DeveloperOptionsFullScreenDialog {
    public final otk A;

    public DeveloperOptionsFullScreenDialog() {
        joa a = ypa.a(ysa.c, new j63(new j63(this, 9), 10));
        this.A = new otk(duf.a.getOrCreateKotlinClass(q05.class), new p24(a, 7), new y1(25, this, a), new p24(a, 8));
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog
    public final String q() {
        return "DeveloperOptionsModal";
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeFullScreenDialogFragment
    /* renamed from: u */
    public final tc3 getW() {
        return new tc3(897851742, new fv2(this, 9), true);
    }
}
