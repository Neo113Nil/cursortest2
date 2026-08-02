package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import defpackage.lj2;
import defpackage.oed;
import defpackage.p2g;
import defpackage.ug6;
import defpackage.vke;
import defpackage.w2g;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b implements vke {
    public final /* synthetic */ int a;
    public final /* synthetic */ ug6 b;
    public final /* synthetic */ lj2 c;

    public /* synthetic */ b(ug6 ug6Var, lj2 lj2Var, int i) {
        this.a = i;
        this.b = ug6Var;
        this.c = lj2Var;
    }

    @Override // defpackage.vke
    public final void onPlaybackStateChanged(int i) {
        int i2 = this.a;
        ug6 ug6Var = this.b;
        lj2 lj2Var = this.c;
        switch (i2) {
            case 0:
                if (i == 3) {
                    ug6Var.A(this);
                    if (lj2Var.r() instanceof oed) {
                        p2g p2gVar = w2g.b;
                        lj2Var.resumeWith(Unit.a);
                        break;
                    }
                }
                break;
            default:
                if (i == 3) {
                    ug6Var.A(this);
                    if (lj2Var.r() instanceof oed) {
                        p2g p2gVar2 = w2g.b;
                        lj2Var.resumeWith(Unit.a);
                        break;
                    }
                }
                break;
        }
    }
}
