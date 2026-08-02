package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* loaded from: classes12.dex */
public final class u implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {
    public boolean d;
    public boolean e;
    public boolean f;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j g;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.v a = new com.fyber.inneractive.sdk.player.exoplayer2.util.v(0);
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(4096);
    public final SparseArray b = new SparseArray();

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        byte[] bArr = new byte[14];
        bVar.a(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        bVar.a(bArr[13] & 7, false);
        bVar.a(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.g = jVar;
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(C.TIME_UNSET));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j, long j2) {
        this.a.c = C.TIME_UNSET;
        for (int i = 0; i < this.b.size(); i++) {
            t tVar = (t) this.b.valueAt(i);
            tVar.f = false;
            tVar.a.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) {
        h qVar;
        if (!bVar.a(this.c.a, 0, 4, true)) {
            return -1;
        }
        this.c.e(0);
        int b = this.c.b();
        if (b == 441) {
            return -1;
        }
        if (b == 442) {
            bVar.a(this.c.a, 0, 10, false);
            this.c.e(9);
            bVar.a((this.c.j() & 7) + 14);
            return 0;
        }
        if (b == 443) {
            bVar.a(this.c.a, 0, 2, false);
            this.c.e(0);
            bVar.a(this.c.o() + 6);
            return 0;
        }
        if (((b & (-256)) >> 8) != 1) {
            bVar.a(1);
            return 0;
        }
        int i = b & 255;
        t tVar = (t) this.b.get(i);
        if (!this.d) {
            if (tVar == null) {
                boolean z = this.e;
                h hVar = null;
                if (!z && i == 189) {
                    qVar = new b(null);
                    this.e = true;
                } else if (!z && (b & 224) == 192) {
                    qVar = new q(null);
                    this.e = true;
                } else {
                    if (!this.f && (b & PsExtractor.VIDEO_STREAM_MASK) == 224) {
                        hVar = new j();
                        this.f = true;
                    }
                    if (hVar != null) {
                        hVar.a(this.g, new e0(Integer.MIN_VALUE, i, 256));
                        tVar = new t(hVar, this.a);
                        this.b.put(i, tVar);
                    }
                }
                hVar = qVar;
                if (hVar != null) {
                }
            }
            if ((this.e && this.f) || bVar.c > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                this.d = true;
                this.g.b();
            }
        }
        bVar.a(this.c.a, 0, 2, false);
        this.c.e(0);
        int o = this.c.o() + 6;
        if (tVar == null) {
            bVar.a(o);
        } else {
            this.c.c(o);
            bVar.b(this.c.a, 0, o, false);
            this.c.e(6);
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.c;
            nVar.a(tVar.c.a, 0, 3);
            tVar.c.b(0);
            tVar.c.c(8);
            tVar.d = tVar.c.b();
            tVar.e = tVar.c.b();
            tVar.c.c(6);
            nVar.a(tVar.c.a, 0, tVar.c.a(8));
            tVar.c.b(0);
            tVar.g = 0L;
            if (tVar.d) {
                tVar.c.c(4);
                tVar.c.c(1);
                tVar.c.c(1);
                long a = (tVar.c.a(3) << 30) | (tVar.c.a(15) << 15) | tVar.c.a(15);
                tVar.c.c(1);
                if (!tVar.f && tVar.e) {
                    tVar.c.c(4);
                    tVar.c.c(1);
                    tVar.c.c(1);
                    tVar.c.c(1);
                    tVar.b.b((tVar.c.a(3) << 30) | (tVar.c.a(15) << 15) | tVar.c.a(15));
                    tVar.f = true;
                }
                tVar.g = tVar.b.b(a);
            }
            tVar.a.a(true, tVar.g);
            tVar.a.a(nVar);
            tVar.a.b();
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.c;
            nVar2.d(nVar2.a());
        }
        return 0;
    }
}
