package com.google.android.gms.internal.fido;

import defpackage.a70;
import defpackage.eeo;
import defpackage.lnb;
import defpackage.mbo;
import defpackage.qbo;
import defpackage.xgo;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhi extends zzhp {
    public final xgo a;

    public zzhi(xgo xgoVar) {
        this.a = xgoVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zzhp zzhpVar = (zzhp) obj;
        int zza = zzhpVar.zza();
        int c = zzhp.c((byte) 64);
        if (c != zza) {
            return c - zzhpVar.zza();
        }
        xgo xgoVar = ((zzhi) zzhpVar).a;
        xgo xgoVar2 = this.a;
        byte[] bArr = xgoVar2.c;
        int length = bArr.length;
        byte[] bArr2 = xgoVar.c;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return eeo.a.compare(xgoVar2.s(), xgoVar.s());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhi.class == obj.getClass()) {
            return this.a.equals(((zzhi) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.c((byte) 64)), this.a});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        mbo mboVar;
        int i;
        boolean z;
        qbo qboVar = zzgf.a;
        zzgf zzgfVar = qboVar.d;
        if (zzgfVar == null) {
            mbo mboVar2 = qboVar.b;
            char[] cArr = mboVar2.b;
            int i2 = 0;
            while (true) {
                if (i2 >= cArr.length) {
                    mboVar = mboVar2;
                    break;
                }
                char c = cArr[i2];
                if (c < 'a' || c > 'z') {
                    i2++;
                } else {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= cArr.length) {
                            z = false;
                            break;
                        }
                        char c2 = cArr[i3];
                        if (c2 >= 'A' && c2 <= 'Z') {
                            z = true;
                            break;
                        }
                        i3++;
                    }
                    if (z) {
                        a70.r("Cannot call upperCase() on a mixed-case alphabet");
                        return null;
                    }
                    char[] cArr2 = new char[cArr.length];
                    for (int i4 = 0; i4 < cArr.length; i4++) {
                        char c3 = cArr[i4];
                        if (c3 >= 97 && c3 <= 122) {
                            c3 ^= 32;
                        }
                        cArr2[i4] = (char) c3;
                    }
                    mboVar = new mbo(mboVar2.a.concat(".upperCase()"), cArr2);
                    byte[] bArr = mboVar.g;
                    if (mboVar2.h && !mboVar.h) {
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i = 65; i <= 90; i++) {
                            int i5 = i | 32;
                            byte b = bArr[i];
                            byte b2 = bArr[i5];
                            if (b == -1) {
                                copyOf[i] = b2;
                            } else {
                                char c4 = (char) i;
                                char c5 = (char) i5;
                                if (b2 != -1) {
                                    a70.r(zzbo.a("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                    return null;
                                }
                                copyOf[i5] = b;
                            }
                        }
                        mboVar = new mbo(mboVar.a.concat(".ignoreCase()"), mboVar.b, copyOf, true);
                    }
                }
            }
            zzgfVar = mboVar == mboVar2 ? qboVar : qboVar.d(mboVar, qboVar.c);
            qboVar.d = zzgfVar;
        }
        byte[] s = this.a.s();
        return lnb.o("h'", zzgfVar.c(s.length, s), "'");
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zza() {
        return zzhp.c((byte) 64);
    }
}
