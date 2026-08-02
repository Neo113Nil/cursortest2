package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f {
    public final g a = new g();
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(0, new byte[OggPageHeader.MAX_PAGE_PAYLOAD]);
    public int c = -1;
    public int d;
    public boolean e;

    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        int i;
        g gVar;
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
            int i4 = this.c;
            if (i4 < 0) {
                if (!this.a.a(bVar, true)) {
                    return false;
                }
                g gVar2 = this.a;
                int i5 = gVar2.d;
                if ((gVar2.a & 1) == 1 && this.b.c == 0) {
                    this.d = 0;
                    int i6 = 0;
                    while (true) {
                        i3 = this.d;
                        g gVar3 = this.a;
                        if (i3 >= gVar3.c) {
                            break;
                        }
                        int[] iArr = gVar3.f;
                        int i7 = i3 + 1;
                        this.d = i7;
                        int i8 = iArr[i3];
                        i6 += i8;
                        if (i8 != 255) {
                            i3 = i7;
                            break;
                        }
                    }
                    i5 += i6;
                    i4 = i3;
                } else {
                    i4 = 0;
                }
                bVar.a(i5);
                this.c = i4;
            }
            this.d = 0;
            int i9 = 0;
            do {
                i = this.d;
                int i10 = i4 + i;
                gVar = this.a;
                if (i10 >= gVar.c) {
                    break;
                }
                int[] iArr2 = gVar.f;
                i++;
                this.d = i;
                i2 = iArr2[i10];
                i9 += i2;
            } while (i2 == 255);
            int i11 = this.c + i;
            if (i9 > 0) {
                int a = this.b.a();
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.b;
                int i12 = nVar2.c + i9;
                if (a < i12) {
                    nVar2.a = Arrays.copyOf(nVar2.a, i12);
                }
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar3 = this.b;
                bVar.b(nVar3.a, nVar3.c, i9, false);
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar4 = this.b;
                nVar4.d(nVar4.c + i9);
                gVar = this.a;
                this.e = gVar.f[i11 + (-1)] != 255;
            }
            if (i11 == gVar.c) {
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
