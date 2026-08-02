package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l extends k {
    public final AudioTimestamp j = new AudioTimestamp();
    public long k;
    public long l;
    public long m;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final void a(AudioTrack audioTrack, boolean z) {
        super.a(audioTrack, z);
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final long b() {
        return this.m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final long c() {
        return this.j.nanoTime;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final boolean e() {
        boolean timestamp = this.a.getTimestamp(this.j);
        if (timestamp) {
            long j = this.j.framePosition;
            if (this.l > j) {
                this.k++;
            }
            this.l = j;
            this.m = j + (this.k << 32);
        }
        return timestamp;
    }
}
