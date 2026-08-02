package defpackage;

import com.google.android.gms.internal.ads.zzhms;
import com.google.android.gms.internal.ads.zzicn;
import com.google.android.gms.internal.ads.zzico;
import com.google.android.gms.internal.ads.zzicp;
import com.google.android.gms.internal.ads.zzicq;
import com.google.android.gms.internal.ads.zzics;
import com.google.android.gms.internal.ads.zzicu;
import com.google.android.gms.internal.ads.zzidl;
import com.google.android.gms.internal.ads.zzidm;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class ymo extends zzicu {
    public static final zzico a(zzidl zzidlVar) {
        String str;
        int n = zzidlVar.n();
        zzico c = c(zzidlVar, n);
        if (c == null) {
            return b(zzidlVar, n);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            int i = zzidlVar.g;
            if (i == 0) {
                i = zzidlVar.h();
            }
            if (i == 2 || i == 4 || i == 17) {
                boolean z = c instanceof zzicn;
                int i2 = zzidlVar.g;
                if (z) {
                    if (i2 == 0) {
                        i2 = zzidlVar.h();
                    }
                    if (i2 != 4) {
                        throw zzidlVar.e0("END_ARRAY");
                    }
                    int i3 = zzidlVar.k;
                    zzidlVar.k = i3 - 1;
                    int[] iArr = zzidlVar.m;
                    int i4 = i3 - 2;
                    iArr[i4] = iArr[i4] + 1;
                    zzidlVar.g = 0;
                } else {
                    if (i2 == 0) {
                        i2 = zzidlVar.h();
                    }
                    if (i2 != 2) {
                        throw zzidlVar.e0("END_OBJECT");
                    }
                    int i5 = zzidlVar.k;
                    int i6 = i5 - 1;
                    zzidlVar.k = i6;
                    zzidlVar.l[i6] = null;
                    int[] iArr2 = zzidlVar.m;
                    int i7 = i5 - 2;
                    iArr2[i7] = iArr2[i7] + 1;
                    zzidlVar.g = 0;
                }
                if (arrayDeque.isEmpty()) {
                    return c;
                }
                c = (zzico) arrayDeque.removeLast();
            } else {
                if (c instanceof zzicq) {
                    int i8 = zzidlVar.g;
                    if (i8 == 0) {
                        i8 = zzidlVar.h();
                    }
                    if (i8 == 14) {
                        str = zzidlVar.C();
                    } else if (i8 == 12) {
                        str = zzidlVar.t('\'');
                    } else {
                        if (i8 != 13) {
                            throw zzidlVar.e0("a name");
                        }
                        str = zzidlVar.t('\"');
                    }
                    zzidlVar.g = 0;
                    zzidlVar.l[zzidlVar.k - 1] = str;
                    if (!zzhms.a(str)) {
                        is8.e("illegal characters in string");
                        return null;
                    }
                } else {
                    str = null;
                }
                int n2 = zzidlVar.n();
                zzico c2 = c(zzidlVar, n2);
                zzico b = c2 == null ? b(zzidlVar, n2) : c2;
                if (c instanceof zzicn) {
                    ((zzicn) c).a.add(b);
                } else {
                    zzicq zzicqVar = (zzicq) c;
                    if (zzicqVar.a.containsKey(str)) {
                        is8.e("duplicate key: ".concat(String.valueOf(str)));
                        return null;
                    }
                    zzicqVar.a.put(str, b);
                }
                if (c2 != null) {
                    arrayDeque.addLast(c);
                    if (arrayDeque.size() > 100) {
                        is8.e("too many recursions");
                        return null;
                    }
                    c = b;
                } else {
                    continue;
                }
            }
        }
    }

    public static final zzico b(zzidl zzidlVar, int i) {
        int i2 = i - 1;
        if (i2 == 5) {
            String k = zzidlVar.k();
            if (zzhms.a(k)) {
                return new zzics(k);
            }
            is8.e("illegal characters in string");
            return null;
        }
        if (i2 == 6) {
            return new zzics(new zmo(zzidlVar.k()));
        }
        boolean z = true;
        if (i2 != 7) {
            if (i2 != 8) {
                a70.r("Unexpected token: ".concat(zzidm.a(i)));
                return null;
            }
            int i3 = zzidlVar.g;
            if (i3 == 0) {
                i3 = zzidlVar.h();
            }
            if (i3 != 7) {
                throw zzidlVar.e0("null");
            }
            zzidlVar.g = 0;
            int[] iArr = zzidlVar.m;
            int i4 = zzidlVar.k - 1;
            iArr[i4] = iArr[i4] + 1;
            return zzicp.a;
        }
        int i5 = zzidlVar.g;
        if (i5 == 0) {
            i5 = zzidlVar.h();
        }
        if (i5 == 5) {
            zzidlVar.g = 0;
            int[] iArr2 = zzidlVar.m;
            int i6 = zzidlVar.k - 1;
            iArr2[i6] = iArr2[i6] + 1;
        } else {
            if (i5 != 6) {
                throw zzidlVar.e0("a boolean");
            }
            zzidlVar.g = 0;
            int[] iArr3 = zzidlVar.m;
            int i7 = zzidlVar.k - 1;
            iArr3[i7] = iArr3[i7] + 1;
            z = false;
        }
        return new zzics(Boolean.valueOf(z));
    }

    public static final zzico c(zzidl zzidlVar, int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            int i3 = zzidlVar.g;
            if (i3 == 0) {
                i3 = zzidlVar.h();
            }
            if (i3 != 3) {
                throw zzidlVar.e0("BEGIN_ARRAY");
            }
            zzidlVar.H(1);
            zzidlVar.m[zzidlVar.k - 1] = 0;
            zzidlVar.g = 0;
            return new zzicn();
        }
        if (i2 != 2) {
            return null;
        }
        int i4 = zzidlVar.g;
        if (i4 == 0) {
            i4 = zzidlVar.h();
        }
        if (i4 != 1) {
            throw zzidlVar.e0("BEGIN_OBJECT");
        }
        zzidlVar.H(3);
        zzidlVar.g = 0;
        return new zzicq();
    }
}
