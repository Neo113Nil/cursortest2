package com.google.android.gms.internal.ads;

import defpackage.mio;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbn {
    public static final zzbn b;
    public final zzgxm a;

    static {
        mio mioVar = zzgxm.b;
        b = new zzbn(s.e);
        String str = zzfm.a;
        Integer.toString(0, 36);
    }

    public zzbn(s sVar) {
        this.a = zzgxm.x(sVar);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            zzgxm zzgxmVar = this.a;
            if (i2 >= zzgxmVar.size()) {
                return false;
            }
            zzbm zzbmVar = (zzbm) zzgxmVar.get(i2);
            boolean[] zArr = zzbmVar.e;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (!zArr[i3]) {
                    i3++;
                } else if (zzbmVar.b.c == i) {
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbn.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((zzbn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
