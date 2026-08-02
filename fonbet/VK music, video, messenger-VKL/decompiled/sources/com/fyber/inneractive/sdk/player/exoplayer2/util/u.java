package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes12.dex */
public final class u implements h {
    public boolean a;
    public long b;
    public long c;
    public com.fyber.inneractive.sdk.player.exoplayer2.s d = com.fyber.inneractive.sdk.player.exoplayer2.s.d;

    public final void a(long j) {
        this.b = j;
        if (this.a) {
            this.c = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final long b() {
        long j = this.b;
        if (!this.a) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.c;
        if (this.d.a != 1.0f) {
            return (elapsedRealtime * r4.c) + j;
        }
        int i = com.fyber.inneractive.sdk.player.exoplayer2.b.a;
        long j2 = C.TIME_UNSET;
        if (elapsedRealtime != C.TIME_UNSET) {
            j2 = 1000 * elapsedRealtime;
        }
        return j2 + j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a(com.fyber.inneractive.sdk.player.exoplayer2.s sVar) {
        if (this.a) {
            a(b());
        }
        this.d = sVar;
        return sVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a() {
        return this.d;
    }
}
