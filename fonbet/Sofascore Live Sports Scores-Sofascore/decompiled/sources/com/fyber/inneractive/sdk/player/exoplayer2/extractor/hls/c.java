package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c extends com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a {
    public byte[] i;
    public int j;
    public volatile boolean k;
    public final String l;
    public byte[] m;

    public c(com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i, Object obj, byte[] bArr, String str) {
        super(3, i, C.TIME_UNSET, C.TIME_UNSET, oVar, hVar, kVar, obj);
        this.i = bArr;
        this.l = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.k;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.k = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a
    public final long c() {
        return this.j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void load() {
        try {
            this.h.a(this.a);
            int i = 0;
            this.j = 0;
            while (i != -1 && !this.k) {
                byte[] bArr = this.i;
                if (bArr == null) {
                    bArr = new byte[16384];
                    this.i = bArr;
                } else if (bArr.length < this.j + 16384) {
                    bArr = Arrays.copyOf(bArr, bArr.length + 16384);
                    this.i = bArr;
                }
                i = this.h.read(bArr, this.j, 16384);
                if (i != -1) {
                    this.j += i;
                }
            }
            if (!this.k) {
                this.m = Arrays.copyOf(this.i, this.j);
            }
            z.a(this.h);
        } catch (Throwable th) {
            z.a(this.h);
            throw th;
        }
    }
}
