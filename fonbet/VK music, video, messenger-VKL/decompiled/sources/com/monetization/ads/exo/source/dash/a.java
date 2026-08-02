package com.monetization.ads.exo.source.dash;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import yads.b33;
import yads.y23;

/* loaded from: classes14.dex */
public final class a implements y23 {
    public final /* synthetic */ i a;

    public a(i iVar) {
        this.a = iVar;
    }

    public final void a() {
        long j;
        i iVar = this.a;
        synchronized (b33.b) {
            try {
                j = b33.c ? b33.d : C.TIME_UNSET;
            } catch (Throwable th) {
                throw th;
            }
        }
        iVar.L = j;
        iVar.a(true);
    }
}
