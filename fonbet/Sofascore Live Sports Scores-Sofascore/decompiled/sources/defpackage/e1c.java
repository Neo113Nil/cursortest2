package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class e1c implements lic {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public e1c(String str, byte[] bArr, int i, int i2) {
        boolean z;
        byte b;
        str.getClass();
        switch (str) {
            case "com.android.capture.fps":
                if (i2 == 23 && bArr.length == 4) {
                    z = true;
                }
                z1a.s(z);
                break;
            case "auxiliary.tracks.interleaved":
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    z = true;
                }
                z1a.s(z);
                break;
            case "auxiliary.tracks.length":
            case "auxiliary.tracks.offset":
                if (i2 == 78 && bArr.length == 8) {
                    z = true;
                }
                z1a.s(z);
                break;
            case "auxiliary.tracks.map":
                z1a.s(i2 == 0);
                break;
        }
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    public final ArrayList a() {
        z1a.D("Metadata is not an auxiliary tracks map", this.a.equals("auxiliary.tracks.map"));
        byte[] bArr = this.b;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i = lnb.f(bArr[i + 2], arrayList, i, 1)) {
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e1c.class != obj.getClass()) {
            return false;
        }
        e1c e1cVar = (e1c) obj;
        return this.a.equals(e1cVar.a) && Arrays.equals(this.b, e1cVar.b) && this.c == e1cVar.c && this.d == e1cVar.d;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + dmi.c(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.a)) * 31) + this.c) * 31) + this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String sb;
        q21 q21Var;
        boolean z;
        int i = this.d;
        if (i == 0) {
            if (this.a.equals("auxiliary.tracks.map")) {
                ArrayList a = a();
                StringBuilder q = fc6.q("track types = ");
                new ih2(String.valueOf(',')).a(q, a.iterator());
                sb = q.toString();
            }
            byte[] bArr = this.b;
            String str = nik.a;
            n21 n21Var = q21.g;
            q21Var = n21Var.d;
            if (q21Var == null) {
            }
            sb = q21Var.c(bArr);
        } else if (i == 1) {
            sb = nik.r(this.b);
        } else if (i == 23) {
            byte[] bArr2 = this.b;
            z1a.n(bArr2.length, 4, "array too small: %s < %s", bArr2.length >= 4);
            sb = String.valueOf(Float.intBitsToFloat(jaa.B(bArr2[0], bArr2[1], bArr2[2], bArr2[3])));
        } else if (i == 67) {
            byte[] bArr3 = this.b;
            z1a.n(bArr3.length, 4, "array too small: %s < %s", bArr3.length >= 4);
            sb = String.valueOf(jaa.B(bArr3[0], bArr3[1], bArr3[2], bArr3[3]));
        } else if (i != 75) {
            if (i == 78) {
                sb = String.valueOf(new j9e(this.b).G());
            }
            byte[] bArr4 = this.b;
            String str2 = nik.a;
            n21 n21Var2 = q21.g;
            q21Var = n21Var2.d;
            if (q21Var == null) {
                m21 m21Var = n21Var2.a;
                char[] cArr = m21Var.b;
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (rz8.J(cArr[i2])) {
                        char[] cArr2 = m21Var.b;
                        int length2 = cArr2.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length2) {
                                z = false;
                                break;
                            }
                            if (rz8.H(cArr2[i3])) {
                                z = true;
                                break;
                            }
                            i3++;
                        }
                        z1a.D("Cannot call lowerCase() on a mixed-case alphabet", true ^ z);
                        char[] cArr3 = new char[cArr.length];
                        for (int i4 = 0; i4 < cArr.length; i4++) {
                            char c = cArr[i4];
                            if (rz8.J(c)) {
                                c = (char) (c ^ ' ');
                            }
                            cArr3[i4] = c;
                        }
                        m21 m21Var2 = new m21(mz1.o(new StringBuilder(), m21Var.a, ".lowerCase()"), cArr3);
                        m21Var = m21Var.i ? m21Var2.b() : m21Var2;
                    } else {
                        i2++;
                    }
                }
                q21Var = m21Var == n21Var2.a ? n21Var2 : new n21(m21Var);
                n21Var2.d = q21Var;
            }
            sb = q21Var.c(bArr4);
        } else {
            sb = String.valueOf(Byte.toUnsignedInt(this.b[0]));
        }
        return wt3.m(this.a, ", value=", new StringBuilder("mdta: key="), sb);
    }
}
