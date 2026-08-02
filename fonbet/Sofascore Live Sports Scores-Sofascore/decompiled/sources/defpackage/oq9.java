package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class oq9 implements qe4 {
    public final qe4 a;
    public final int b;
    public final wcf c;
    public final byte[] d;
    public int e;

    public oq9(qe4 qe4Var, int i, wcf wcfVar) {
        qx9.r(i > 0);
        this.a = qe4Var;
        this.b = i;
        this.c = wcfVar;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // defpackage.qe4
    public final void c(sn4 sn4Var) {
        sn4Var.getClass();
        this.a.c(sn4Var);
    }

    @Override // defpackage.qe4
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.qe4
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // defpackage.qe4
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.qe4
    public final long k(we4 we4Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.fe4, defpackage.ge4
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        qe4 qe4Var = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            int i4 = 0;
            if (qe4Var.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int read = qe4Var.read(bArr3, i4, i6);
                        if (read != -1) {
                            i4 += read;
                            i6 -= read;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        nkk nkkVar = new nkk(bArr3, i5);
                        wcf wcfVar = this.c;
                        long max = !wcfVar.l ? wcfVar.i : Math.max(wcfVar.m.k(true), wcfVar.i);
                        int c = nkkVar.c();
                        gpg gpgVar = wcfVar.k;
                        gpgVar.getClass();
                        gpgVar.d(c, nkkVar);
                        gpgVar.c(max, 1, c, 0, null);
                        wcfVar.l = true;
                    }
                }
                i3 = this.b;
                this.e = i3;
            }
            return -1;
        }
        int read2 = qe4Var.read(bArr, i, Math.min(i3, i2));
        if (read2 != -1) {
            this.e -= read2;
        }
        return read2;
    }
}
