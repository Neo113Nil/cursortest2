package defpackage;

import com.inmobi.media.core.config.models.AdConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class br8 {
    public final usj a;
    public wsj d;
    public fs4 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean l;
    public final msj b = new msj(0);
    public final nkk c = new nkk(4, false);
    public final nkk j = new nkk(1);
    public final nkk k = new nkk(4, false);

    public br8(usj usjVar, wsj wsjVar, fs4 fs4Var) {
        this.a = usjVar;
        this.d = wsjVar;
        this.e = fs4Var;
        this.d = wsjVar;
        this.e = fs4Var;
        usjVar.a(wsjVar.a.f);
        d();
    }

    public final ksj a() {
        if (!this.l) {
            return null;
        }
        msj msjVar = this.b;
        fs4 fs4Var = (fs4) msjVar.o;
        int i = lik.a;
        int i2 = fs4Var.a;
        ksj ksjVar = (ksj) msjVar.p;
        if (ksjVar == null) {
            ksjVar = this.d.a.k[i2];
        }
        if (ksjVar == null || !ksjVar.a) {
            return null;
        }
        return ksjVar;
    }

    public final boolean b() {
        this.f++;
        if (!this.l) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.f;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int c(int i, int i2) {
        nkk nkkVar;
        ksj a = a();
        if (a == null) {
            return 0;
        }
        int i3 = a.d;
        msj msjVar = this.b;
        if (i3 != 0) {
            nkkVar = (nkk) msjVar.q;
        } else {
            byte[] bArr = a.e;
            int i4 = lik.a;
            int length = bArr.length;
            nkk nkkVar2 = this.k;
            nkkVar2.C(bArr, length);
            i3 = bArr.length;
            nkkVar = nkkVar2;
        }
        boolean z = msjVar.j && msjVar.k[this.f];
        boolean z2 = z || i2 != 0;
        nkk nkkVar3 = this.j;
        nkkVar3.a[0] = (byte) ((z2 ? 128 : 0) | i3);
        nkkVar3.E(0);
        usj usjVar = this.a;
        usjVar.d(1, nkkVar3);
        usjVar.d(i3, nkkVar);
        if (!z2) {
            return i3 + 1;
        }
        nkk nkkVar4 = this.c;
        if (!z) {
            nkkVar4.B(8);
            byte[] bArr2 = nkkVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            usjVar.d(8, nkkVar4);
            return i3 + 9;
        }
        nkk nkkVar5 = (nkk) msjVar.q;
        int x = nkkVar5.x();
        nkkVar5.F(-2);
        int i5 = (x * 6) + 2;
        if (i2 != 0) {
            nkkVar4.B(i5);
            byte[] bArr3 = nkkVar4.a;
            nkkVar5.e(bArr3, 0, i5);
            int i6 = (((bArr3[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr3[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + i2;
            bArr3[2] = (byte) ((i6 >> 8) & 255);
            bArr3[3] = (byte) (i6 & 255);
        } else {
            nkkVar4 = nkkVar5;
        }
        usjVar.d(i5, nkkVar4);
        return i3 + 1 + i5;
    }

    public final void d() {
        msj msjVar = this.b;
        msjVar.c = 0;
        msjVar.m = 0L;
        msjVar.n = false;
        msjVar.j = false;
        msjVar.l = false;
        msjVar.p = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.l = false;
    }
}
