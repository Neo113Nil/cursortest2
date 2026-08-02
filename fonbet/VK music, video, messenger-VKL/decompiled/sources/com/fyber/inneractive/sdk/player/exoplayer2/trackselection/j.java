package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import com.fyber.inneractive.sdk.player.exoplayer2.source.z;
import com.fyber.inneractive.sdk.player.exoplayer2.t;

/* loaded from: classes12.dex */
public final class j {
    public final z a;
    public final h b;
    public final Object c;
    public final t[] d;

    public j(z zVar, h hVar, f fVar, t[] tVarArr) {
        this.a = zVar;
        this.b = hVar;
        this.c = fVar;
        this.d = tVarArr;
    }

    public final boolean a(j jVar, int i) {
        return jVar != null && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.b.b[i], jVar.b.b[i]) && com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.d[i], jVar.d[i]);
    }
}
