package defpackage;

import com.google.android.gms.internal.auth.zzef;
import com.google.android.gms.internal.auth.zzfa;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class v2o extends zzef {
    public final byte[] c;

    public v2o(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public byte c(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public byte d(int i) {
        return this.c[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzef) && m() == ((zzef) obj).m()) {
            if (m() == 0) {
                return true;
            }
            if (!(obj instanceof v2o)) {
                return obj.equals(this);
            }
            v2o v2oVar = (v2o) obj;
            int i = this.a;
            int i2 = v2oVar.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int m = m();
                if (m > v2oVar.m()) {
                    zzl.c(m, m());
                    return false;
                }
                if (m > v2oVar.m()) {
                    a70.p(dmi.k(m, v2oVar.m(), "Ran off end of other: 0, ", ", "));
                    return false;
                }
                byte[] bArr = v2oVar.c;
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

    @Override // com.google.android.gms.internal.auth.zzef
    public int m() {
        return this.c.length;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final int n(int i, int i2) {
        Charset charset = zzfa.a;
        for (int i3 = 0; i3 < i2; i3++) {
            i = (i * 31) + this.c[i3];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final v2o o() {
        int r = zzef.r(0, 47, m());
        return r == 0 ? zzef.b : new u1o(this.c, r);
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final String p(Charset charset) {
        return new String(this.c, 0, m(), charset);
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final boolean q() {
        int m = m();
        cno.a.getClass();
        return u8f.q(0, m, this.c);
    }
}
