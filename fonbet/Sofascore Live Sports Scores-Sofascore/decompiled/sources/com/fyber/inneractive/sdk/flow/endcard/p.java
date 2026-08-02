package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class p extends u {
    public final String j;
    public String k;
    public boolean l;

    public p(o oVar) {
        super(oVar);
        com.fyber.inneractive.sdk.model.vast.o oVar2 = oVar.c.e.f;
        this.j = oVar2 != null ? oVar2.a : null;
    }

    public final void b(com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        if (TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.k)) {
            return;
        }
        if (this.f || !this.h.compareAndSet(false, true)) {
            IAlog.a("%sisWebLoaded: %s, mFmpEndCardPrepareInProgress: %s", this.a, Boolean.valueOf(this.f), Boolean.valueOf(this.h.get()));
        } else {
            a(aVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.u
    public final q d() {
        b bVar = this.b;
        return new q(bVar.c.e, (o) bVar);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.u
    public final boolean f() {
        return false;
    }
}
