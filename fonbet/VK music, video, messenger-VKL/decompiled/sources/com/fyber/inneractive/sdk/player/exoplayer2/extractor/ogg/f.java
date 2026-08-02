package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import java.util.Arrays;

/* loaded from: classes12.dex */
public final class f {
    public final g a = new g();
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(0, new byte[OggPageHeader.MAX_PAGE_PAYLOAD]);
    public int c = -1;
    public int d;
    public boolean e;

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        int i;
        int i2;
        int i3;
        if (this.e) {
            this.e = false;
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.b;
            nVar.b = 0;
            nVar.c = 0;
        }
        while (true) {
            if (this.e) {
                return true;
            }
            if (this.c < 0) {
                if (!this.a.a(bVar, true)) {
                    return false;
                }
                g gVar = this.a;
                int i4 = gVar.d;
                if ((gVar.a & 1) == 1 && this.b.c == 0) {
                    this.d = 0;
                    int i5 = 0;
                    do {
                        int i6 = this.d;
                        g gVar2 = this.a;
                        if (i6 >= gVar2.c) {
                            break;
                        }
                        int[] iArr = gVar2.f;
                        this.d = i6 + 1;
                        i3 = iArr[i6];
                        i5 += i3;
                    } while (i3 == 255);
                    i4 += i5;
                    i2 = this.d;
                } else {
                    i2 = 0;
                }
                bVar.a(i4);
                this.c = i2;
            }
            int i7 = this.c;
            this.d = 0;
            int i8 = 0;
            do {
                int i9 = this.d;
                int i10 = i7 + i9;
                g gVar3 = this.a;
                if (i10 >= gVar3.c) {
                    break;
                }
                int[] iArr2 = gVar3.f;
                this.d = i9 + 1;
                i = iArr2[i10];
                i8 += i;
            } while (i == 255);
            int i11 = this.c + this.d;
            if (i8 > 0) {
                int a = this.b.a();
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.b;
                int i12 = nVar2.c + i8;
                if (a < i12) {
                    nVar2.a = Arrays.copyOf(nVar2.a, i12);
                }
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.b;
                bVar.b(nVar3.a, nVar3.c, i8, false);
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = this.b;
                nVar4.d(nVar4.c + i8);
                this.e = this.a.f[i11 + (-1)] != 255;
            }
            if (i11 == this.a.c) {
                i11 = -1;
            }
            this.c = i11;
        }
    }

    public final void a() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.b;
        byte[] bArr = nVar.a;
        if (bArr.length == 65025) {
            return;
        }
        nVar.a = Arrays.copyOf(bArr, Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, nVar.c));
    }
}
