package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pq9 implements re4 {
    public final re4 a;
    public final int b;
    public final xcf c;
    public final byte[] d;
    public int e;

    public pq9(re4 re4Var, int i, xcf xcfVar) {
        z1a.s(i > 0);
        this.a = re4Var;
        this.b = i;
        this.c = xcfVar;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // defpackage.re4
    public final long b(xe4 xe4Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.re4
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.re4
    public final void f(tn4 tn4Var) {
        tn4Var.getClass();
        this.a.f(tn4Var);
    }

    @Override // defpackage.re4
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // defpackage.re4
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.ge4
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        re4 re4Var = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            int i4 = 0;
            if (re4Var.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int read = re4Var.read(bArr3, i4, i6);
                        if (read != -1) {
                            i4 += read;
                            i6 -= read;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        j9e j9eVar = new j9e(bArr3, i5);
                        xcf xcfVar = this.c;
                        long max = !xcfVar.l ? xcfVar.i : Math.max(xcfVar.m.j(true), xcfVar.i);
                        int a = j9eVar.a();
                        vsj vsjVar = xcfVar.k;
                        vsjVar.getClass();
                        vsjVar.g(a, j9eVar);
                        vsjVar.a(max, 1, a, 0, null);
                        xcfVar.l = true;
                    }
                }
                i3 = this.b;
                this.e = i3;
            }
            return -1;
        }
        int read2 = re4Var.read(bArr, i, Math.min(i3, i2));
        if (read2 != -1) {
            this.e -= read2;
        }
        return read2;
    }
}
