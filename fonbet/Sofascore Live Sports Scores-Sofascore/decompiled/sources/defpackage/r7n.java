package defpackage;

import com.google.android.gms.internal.pal.zzaby;
import com.google.android.gms.internal.pal.zzach;
import com.google.android.gms.internal.pal.zzadg;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class r7n extends zzaby {
    public final byte[] c;

    public r7n(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public byte c(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public byte d(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzaby) && m() == ((zzaby) obj).m()) {
            if (m() == 0) {
                return true;
            }
            if (!(obj instanceof r7n)) {
                return obj.equals(this);
            }
            r7n r7nVar = (r7n) obj;
            int i = this.a;
            int i2 = r7nVar.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int m = m();
                if (m > r7nVar.m()) {
                    zzl.c(m, m());
                    return false;
                }
                if (m > r7nVar.m()) {
                    a70.p(dmi.k(m, r7nVar.m(), "Ran off end of other: 0, ", ", "));
                    return false;
                }
                byte[] bArr = r7nVar.c;
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

    @Override // com.google.android.gms.internal.pal.zzaby
    public int m() {
        return this.c.length;
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public void n(int i, byte[] bArr) {
        System.arraycopy(this.c, 0, bArr, 0, i);
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public final int o(int i, int i2) {
        Charset charset = zzadg.a;
        for (int i3 = 0; i3 < i2; i3++) {
            i = (i * 31) + this.c[i3];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public final r7n p() {
        int t = zzaby.t(0, 47, m());
        return t == 0 ? zzaby.b : new n7n(this.c, t);
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public final String q(Charset charset) {
        return new String(this.c, 0, m(), charset);
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public final void r(zzach zzachVar) {
        ((h8n) zzachVar).h(m(), this.c);
    }

    @Override // com.google.android.gms.internal.pal.zzaby
    public final boolean s() {
        int m = m();
        xdn.a.getClass();
        return wje.o(0, m, this.c);
    }
}
