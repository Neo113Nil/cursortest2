package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class o implements g {
    public final Context a;
    public final m b;
    public final g c;

    public o(Context context, m mVar, q qVar) {
        this.a = context.getApplicationContext();
        this.b = mVar;
        this.c = qVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public final h a() {
        return new n(this.a, this.b, this.c.a());
    }
}
