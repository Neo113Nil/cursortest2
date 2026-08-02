package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class g implements h {
    public final List a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.r[] b;
    public boolean c;
    public int d;
    public int e;
    public long f;

    public g(List list) {
        this.a = list;
        this.b = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.r[list.size()];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar, e0 e0Var) {
        for (int i = 0; i < this.b.length; i++) {
            c0 c0Var = (c0) this.a.get(i);
            e0Var.a();
            e0Var.b();
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g a = jVar.a(e0Var.d, 3);
            e0Var.b();
            a.a(new com.fyber.inneractive.sdk.player.exoplayer2.o(e0Var.e, null, MimeTypes.APPLICATION_DVBSUBS, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, c0Var.a, -1, Long.MAX_VALUE, Collections.singletonList(c0Var.b), null, null));
            this.b[i] = a;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void b() {
        if (this.c) {
            for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar : this.b) {
                rVar.a(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a() {
        this.c = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(boolean z, long j) {
        if (z) {
            this.c = true;
            this.f = j;
            this.e = 0;
            this.d = 2;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar) {
        boolean z;
        boolean z2;
        if (this.c) {
            int i = this.d;
            if (i == 2) {
                if (nVar.c - nVar.b == 0) {
                    z2 = false;
                } else {
                    if (nVar.j() != 32) {
                        this.c = false;
                    }
                    i = this.d - 1;
                    this.d = i;
                    z2 = this.c;
                }
                if (!z2) {
                    return;
                }
            }
            if (i == 1) {
                if (nVar.c - nVar.b == 0) {
                    z = false;
                } else {
                    if (nVar.j() != 0) {
                        this.c = false;
                    }
                    this.d--;
                    z = this.c;
                }
                if (!z) {
                    return;
                }
            }
            int i2 = nVar.b;
            int i3 = nVar.c - i2;
            for (com.fyber.inneractive.sdk.player.exoplayer2.extractor.r rVar : this.b) {
                nVar.e(i2);
                rVar.a(i3, nVar);
            }
            this.e += i3;
        }
    }
}
