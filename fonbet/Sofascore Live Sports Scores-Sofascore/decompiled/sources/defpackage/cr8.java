package defpackage;

import androidx.media3.common.b;
import com.inmobi.media.core.config.models.AdConfig;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cr8 {
    public final vsj a;
    public xsj d;
    public gs4 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final b j;
    public boolean m;
    public final msj b = new msj(1);
    public final j9e c = new j9e();
    public final j9e k = new j9e(1);
    public final j9e l = new j9e();

    public cr8(vsj vsjVar, xsj xsjVar, gs4 gs4Var, b bVar) {
        this.a = vsjVar;
        this.d = xsjVar;
        this.e = gs4Var;
        this.j = bVar;
        this.d = xsjVar;
        this.e = gs4Var;
        vsjVar.d(bVar);
        e();
    }

    public final int a() {
        int i = !this.m ? this.d.g[this.f] : this.b.i[this.f] ? 1 : 0;
        return b() != null ? 1073741824 | i : i;
    }

    public final lsj b() {
        if (!this.m) {
            return null;
        }
        msj msjVar = this.b;
        gs4 gs4Var = (gs4) msjVar.o;
        String str = nik.a;
        int i = gs4Var.a;
        lsj lsjVar = (lsj) msjVar.p;
        if (lsjVar == null) {
            lsjVar = this.d.a.l[i];
        }
        if (lsjVar == null || !lsjVar.a) {
            return null;
        }
        return lsjVar;
    }

    public final boolean c() {
        this.f++;
        if (!this.m) {
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

    public final int d(int i, int i2) {
        j9e j9eVar;
        lsj b = b();
        if (b == null) {
            return 0;
        }
        int i3 = b.d;
        msj msjVar = this.b;
        if (i3 != 0) {
            j9eVar = (j9e) msjVar.q;
        } else {
            byte[] bArr = b.e;
            String str = nik.a;
            int length = bArr.length;
            j9e j9eVar2 = this.l;
            j9eVar2.L(bArr, length);
            i3 = bArr.length;
            j9eVar = j9eVar2;
        }
        boolean z = msjVar.j && msjVar.k[this.f];
        boolean z2 = z || i2 != 0;
        j9e j9eVar3 = this.k;
        j9eVar3.a[0] = (byte) ((z2 ? 128 : 0) | i3);
        j9eVar3.N(0);
        vsj vsjVar = this.a;
        vsjVar.b(j9eVar3, 1, 1);
        vsjVar.b(j9eVar, i3, 1);
        if (!z2) {
            return i3 + 1;
        }
        j9e j9eVar4 = this.c;
        if (!z) {
            j9eVar4.K(8);
            byte[] bArr2 = j9eVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            vsjVar.b(j9eVar4, 8, 1);
            return i3 + 9;
        }
        j9e j9eVar5 = (j9e) msjVar.q;
        int H = j9eVar5.H();
        j9eVar5.O(-2);
        int i4 = (H * 6) + 2;
        if (i2 != 0) {
            j9eVar4.K(i4);
            byte[] bArr3 = j9eVar4.a;
            j9eVar5.k(bArr3, 0, i4);
            int i5 = (((bArr3[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr3[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + i2;
            bArr3[2] = (byte) ((i5 >> 8) & 255);
            bArr3[3] = (byte) (i5 & 255);
        } else {
            j9eVar4 = j9eVar5;
        }
        vsjVar.b(j9eVar4, i4, 1);
        return i3 + 1 + i4;
    }

    public final void e() {
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
        this.m = false;
    }
}
