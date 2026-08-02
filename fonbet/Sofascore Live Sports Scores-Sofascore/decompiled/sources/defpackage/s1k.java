package defpackage;

import com.inmobi.media.core.config.models.AdConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class s1k {
    public final byte[] a;
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public s1k(int i) {
        switch (i) {
            case 1:
                this.a = new byte[10];
                break;
            default:
                this.a = new byte[10];
                break;
        }
    }

    public void a(usj usjVar, ssj ssjVar) {
        if (this.c > 0) {
            usjVar.c(this.d, this.e, this.f, this.g, ssjVar);
            this.c = 0;
        }
    }

    public void b(vsj vsjVar, tsj tsjVar) {
        if (this.c > 0) {
            vsjVar.a(this.d, this.e, this.f, this.g, tsjVar);
            this.c = 0;
        }
    }

    public void c(usj usjVar, long j, int i, int i2, int i3, ssj ssjVar) {
        if (!(this.g <= i2 + i3)) {
            a70.r("TrueHD chunk samples must be contiguous in the sample queue.");
            return;
        }
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(usjVar, ssjVar);
            }
        }
    }

    public void d(vsj vsjVar, long j, int i, int i2, int i3, tsj tsjVar) {
        z1a.D("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i2 + i3);
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                b(vsjVar, tsjVar);
            }
        }
    }

    public void e(ml6 ml6Var) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        ml6Var.peekFully(bArr, 0, 10);
        ml6Var.resetPeekPosition();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                r2 = 40 << ((bArr[((b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (r2 == 0) {
            return;
        }
        this.b = true;
    }

    public void f(nl6 nl6Var) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        nl6Var.peekFully(bArr, 0, 10);
        nl6Var.resetPeekPosition();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                r2 = 40 << ((bArr[((b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (r2 == 0) {
            return;
        }
        this.b = true;
    }
}
