package defpackage;

import com.inmobi.media.core.config.models.AdConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class pzg implements d2k {
    public final nzg a;
    public final nkk b = new nkk(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public pzg(nzg nzgVar) {
        this.a = nzgVar;
    }

    @Override // defpackage.d2k
    public final void a(int i, nkk nkkVar) {
        boolean z = (i & 1) != 0;
        int s = z ? nkkVar.b + nkkVar.s() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            nkkVar.E(s);
            this.d = 0;
        }
        while (nkkVar.c() > 0) {
            int i2 = this.d;
            nkk nkkVar2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int s2 = nkkVar.s();
                    nkkVar.E(nkkVar.b - 1);
                    if (s2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(nkkVar.c(), 3 - this.d);
                nkkVar.e(nkkVar2.a, this.d, min);
                int i3 = this.d + min;
                this.d = i3;
                if (i3 == 3) {
                    nkkVar2.E(0);
                    nkkVar2.D(3);
                    nkkVar2.F(1);
                    int s3 = nkkVar2.s();
                    int s4 = nkkVar2.s();
                    this.e = (s3 & 128) != 0;
                    int i4 = (((s3 & 15) << 8) | s4) + 3;
                    this.c = i4;
                    byte[] bArr = nkkVar2.a;
                    if (bArr.length < i4) {
                        nkkVar2.d(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(nkkVar.c(), this.c - this.d);
                nkkVar.e(nkkVar2.a, this.d, min2);
                int i5 = this.d + min2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.e) {
                        byte[] bArr2 = nkkVar2.a;
                        int i7 = -1;
                        for (int i8 = 0; i8 < i6; i8++) {
                            i7 = lik.j[((i7 >>> 24) ^ (bArr2[i8] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) & 255] ^ (i7 << 8);
                        }
                        int i9 = lik.a;
                        if (i7 != 0) {
                            this.f = true;
                            return;
                        }
                        nkkVar2.D(this.c - 4);
                    } else {
                        nkkVar2.D(i6);
                    }
                    nkkVar2.E(0);
                    this.a.f(nkkVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.d2k
    public final void j(cjj cjjVar, ol6 ol6Var, c2k c2kVar) {
        this.a.j(cjjVar, ol6Var, c2kVar);
        this.f = true;
    }

    @Override // defpackage.d2k
    public final void seek() {
        this.f = true;
    }
}
