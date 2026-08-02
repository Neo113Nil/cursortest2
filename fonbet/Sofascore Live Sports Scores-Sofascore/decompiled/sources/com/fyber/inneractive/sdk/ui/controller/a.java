package com.fyber.inneractive.sdk.ui.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a implements b {
    public c a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    @Override // com.fyber.inneractive.sdk.ui.controller.b
    public final void a(float f) {
        if (f < 0.01f || !this.b.compareAndSet(false, true)) {
            return;
        }
        IAlog.a("%sVisibility requirement met. visibleViewArea: %.1f%%", IAlog.a(this), Float.valueOf(f * 100.0f));
        this.a.t();
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.b
    public final void destroy() {
        throw null;
    }
}
