package defpackage;

import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzhc;
import java.io.ByteArrayInputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class xgo extends zzgx {
    public final byte[] c;

    public xgo(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public byte c(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public byte d(int i) {
        return this.c[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgx) && m() == ((zzgx) obj).m()) {
            if (m() == 0) {
                return true;
            }
            if (!(obj instanceof xgo)) {
                return obj.equals(this);
            }
            xgo xgoVar = (xgo) obj;
            int i = this.a;
            int i2 = xgoVar.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int m = m();
                if (m > xgoVar.m()) {
                    zzl.c(m, m());
                    return false;
                }
                if (m > xgoVar.m()) {
                    a70.p(dmi.k(m, xgoVar.m(), "Ran off end of other: 0, ", ", "));
                    return false;
                }
                byte[] bArr = xgoVar.c;
                int t = t() + m;
                int t2 = t();
                int t3 = xgoVar.t();
                while (t2 < t) {
                    if (this.c[t2] == bArr[t3]) {
                        t2++;
                        t3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public int m() {
        return this.c.length;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public void n(int i, byte[] bArr) {
        System.arraycopy(this.c, 0, bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final int o(int i, int i2) {
        int t = t();
        byte[] bArr = zzhc.a;
        for (int i3 = t; i3 < t + i2; i3++) {
            i = (i * 31) + this.c[i3];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.fido.zzgx
    public final xgo p(int i, int i2) {
        int q = zzgx.q(i, i2, m());
        if (q == 0) {
            return zzgx.b;
        }
        return new vfo(this.c, t() + i, q);
    }

    public int t() {
        return 0;
    }

    public final ByteArrayInputStream u() {
        return new ByteArrayInputStream(this.c, t(), m());
    }
}
