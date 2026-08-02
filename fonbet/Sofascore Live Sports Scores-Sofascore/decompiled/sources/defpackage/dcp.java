package defpackage;

import com.google.android.gms.internal.cast.zzxk;
import com.google.android.gms.internal.cast.zzym;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class dcp extends zzxk {
    public final byte[] c;

    public dcp(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    @Override // com.google.android.gms.internal.cast.zzxk
    public byte c(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.cast.zzxk
    public byte d(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.cast.zzxk
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzxk) && m() == ((zzxk) obj).m()) {
            if (m() == 0) {
                return true;
            }
            if (!(obj instanceof dcp)) {
                return obj.equals(this);
            }
            dcp dcpVar = (dcp) obj;
            int i = this.a;
            int i2 = dcpVar.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int m = m();
                if (m > dcpVar.m()) {
                    int m2 = m();
                    hbo.f(String.valueOf(m).length() + 18 + String.valueOf(m2).length(), m, m2);
                    return false;
                }
                if (m > dcpVar.m()) {
                    int m3 = dcpVar.m();
                    a70.p(x5n.n(new StringBuilder(String.valueOf(m).length() + 27 + String.valueOf(m3).length()), m, "Ran off end of other: 0, ", m3, ", "));
                    return false;
                }
                byte[] bArr = dcpVar.c;
                int i3 = 0;
                int i4 = 0;
                while (i3 < m) {
                    if (this.c[i3] == bArr[i4]) {
                        i3++;
                        i4++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast.zzxk
    public int m() {
        return this.c.length;
    }

    @Override // com.google.android.gms.internal.cast.zzxk
    public final dcp n() {
        zzxk.h(m());
        return new acp(this.c);
    }

    @Override // com.google.android.gms.internal.cast.zzxk
    public final void o(hcp hcpVar) {
        hcpVar.v(m(), this.c);
    }

    @Override // com.google.android.gms.internal.cast.zzxk
    public final int p(int i, int i2) {
        Charset charset = zzym.a;
        for (int i3 = 0; i3 < i2; i3++) {
            i = (i * 31) + this.c[i3];
        }
        return i;
    }
}
