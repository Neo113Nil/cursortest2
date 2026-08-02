package com.fyber.inneractive.sdk.flow;

import android.os.Handler;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes12.dex */
public final class d {
    public Handler a;
    public final com.fyber.inneractive.sdk.interfaces.b b;
    public final b c = new b(this);
    public final c d = new c(this);

    public d(com.fyber.inneractive.sdk.interfaces.b bVar) {
        this.b = bVar;
    }

    public final void a() {
        IAlog.a("%s : ContentLoadTimeoutHandler destroying timeout handler", IAlog.a(this));
        if (this.a != null) {
            IAlog.a("%s : ContentLoadTimeoutHandler stopping timeout handler", IAlog.a(this));
            Handler handler = this.a;
            if (handler != null) {
                handler.removeCallbacks(this.d);
            }
            this.a.getLooper().quitSafely();
            this.a = null;
        }
    }
}
