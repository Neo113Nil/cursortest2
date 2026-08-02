package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b0 {
    public final ExecutorService a;
    public y b;
    public IOException c;

    public b0(String str) {
        int i = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a;
        this.a = Executors.newSingleThreadExecutor(new com.fyber.inneractive.sdk.player.exoplayer2.util.y(str));
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.k kVar) {
        y yVar = this.b;
        if (yVar != null) {
            yVar.a(true);
        }
        if (kVar != null) {
            this.a.execute(kVar);
        }
        this.a.shutdown();
    }

    public final void b() {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        y yVar = this.b;
        if (yVar != null) {
            int i = yVar.c;
            IOException iOException2 = yVar.e;
            if (iOException2 != null && yVar.f > i) {
                throw iOException2;
            }
        }
    }

    public final boolean a() {
        return this.b != null;
    }
}
