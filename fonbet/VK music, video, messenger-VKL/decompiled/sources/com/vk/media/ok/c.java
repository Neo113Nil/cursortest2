package com.vk.media.ok;

import com.vk.log.L;
import com.vk.media.ok.b;
import ru.ok.tensorflow.util.ExceptionHandler;
import xsna.hod;

/* compiled from: OkEffects.kt */
/* loaded from: classes3.dex */
public final class c implements ExceptionHandler {
    public boolean a;
    public final int b;
    public final /* synthetic */ b.c c;
    public final /* synthetic */ b d;

    public c(b.c cVar, b bVar) {
        this.c = cVar;
        this.d = bVar;
        this.b = cVar.a.get();
    }

    @Override // ru.ok.tensorflow.util.ExceptionHandler
    public final void accept(Exception exc) {
        b.c cVar = this.c;
        b bVar = this.d;
        synchronized (this) {
            if (!this.a && cVar.a.get() == this.b) {
                this.a = true;
                com.vk.metrics.eventtracking.b.a.a(exc);
                L.j(exc, "tensorflow init failed");
                bVar.g.post(new hod(bVar, 6));
            }
        }
    }
}
