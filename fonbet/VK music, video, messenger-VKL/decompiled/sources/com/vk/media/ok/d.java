package com.vk.media.ok;

import com.vk.log.L;
import ru.ok.tensorflow.util.ExceptionHandler;
import xsna.ic3;

/* compiled from: OkEffects.kt */
/* loaded from: classes3.dex */
public final class d implements ExceptionHandler {
    public boolean a;
    public final /* synthetic */ b b;

    public d(b bVar) {
        this.b = bVar;
    }

    @Override // ru.ok.tensorflow.util.ExceptionHandler
    public final void accept(Exception exc) {
        b bVar = this.b;
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            com.vk.metrics.eventtracking.b.a.a(exc);
            L.j(exc, "tensorflow runtime failed");
            bVar.g.post(new ic3(bVar, 7));
        }
    }
}
