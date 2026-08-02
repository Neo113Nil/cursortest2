package com.fyber.inneractive.sdk.player.controller;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e implements Runnable {
    public final /* synthetic */ f a;

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar = this.a.s;
        if (gVar != null) {
            gVar.a(gVar.a(), C.TIME_UNSET);
            this.a.s.d.f.sendEmptyMessage(5);
            com.fyber.inneractive.sdk.player.exoplayer2.g gVar2 = this.a.s;
            gVar2.d.d();
            gVar2.c.removeCallbacksAndMessages(null);
            this.a.s = null;
        }
    }
}
