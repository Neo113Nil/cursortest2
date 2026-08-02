package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import java.io.IOException;

/* loaded from: classes12.dex */
public final class l implements Runnable {
    public final /* synthetic */ IOException a;
    public final /* synthetic */ p b;

    public l(p pVar, IOException iOException) {
        this.b = pVar;
        this.a = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.b.e;
        IOException iOException = this.a;
        if (((com.fyber.inneractive.sdk.player.controller.f) b0Var.a.get()) != null) {
            iOException.getCause();
        }
    }
}
