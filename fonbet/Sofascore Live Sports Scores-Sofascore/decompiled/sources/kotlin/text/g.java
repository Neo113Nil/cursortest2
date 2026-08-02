package kotlin.text;

import defpackage.d8k;
import defpackage.e8k;
import defpackage.haa;
import defpackage.p7k;
import defpackage.q8k;
import defpackage.x7k;
import defpackage.y7k;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class g {
    public static final String a(int i) {
        return haa.J(CharsKt__CharJVMKt.checkRadix(16), i & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final byte b(String str) {
        p7k p7kVar;
        str.getClass();
        y7k d = d(str);
        if (d != null) {
            int i = d.a;
            if (Integer.compareUnsigned(i, 255) <= 0) {
                p7kVar = new p7k((byte) i);
                if (p7kVar == null) {
                    return p7kVar.a;
                }
                StringsKt__StringNumberConversionsKt.h(str);
                throw null;
            }
        }
        p7kVar = null;
        if (p7kVar == null) {
        }
    }

    public static final int c(String str) {
        str.getClass();
        y7k d = d(str);
        if (d != null) {
            return d.a;
        }
        StringsKt__StringNumberConversionsKt.h(str);
        throw null;
    }

    public static final y7k d(String str) {
        int i;
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        if (charAt < '0') {
            i = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        x7k x7kVar = y7k.b;
        int i3 = 119304647;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i2, i3) > 0) {
                if (i3 != 119304647) {
                    return null;
                }
                i3 = Integer.divideUnsigned(-1, 10);
                if (Integer.compareUnsigned(i2, i3) > 0) {
                    return null;
                }
            }
            int i4 = i2 * 10;
            int i5 = digit + i4;
            if (Integer.compareUnsigned(i5, i4) < 0) {
                return null;
            }
            i++;
            i2 = i5;
        }
        return new y7k(i2);
    }

    public static final long e(String str) {
        str.getClass();
        e8k f = f(str);
        if (f != null) {
            return f.a;
        }
        StringsKt__StringNumberConversionsKt.h(str);
        throw null;
    }

    public static final e8k f(String str) {
        str.getClass();
        str.getClass();
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char charAt = str.charAt(0);
        if (charAt < '0') {
            i = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        d8k d8kVar = e8k.b;
        long j = 0;
        long j2 = 512409557603043100L;
        while (i < length) {
            int digit = Character.digit((int) str.charAt(i), 10);
            if (digit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j, j2) > 0) {
                if (j2 != 512409557603043100L) {
                    return null;
                }
                j2 = Long.divideUnsigned(-1L, 10L);
                if (Long.compareUnsigned(j, j2) > 0) {
                    return null;
                }
            }
            long j3 = j * 10;
            x7k x7kVar = y7k.b;
            long j4 = (digit & 4294967295L) + j3;
            if (Long.compareUnsigned(j4, j3) < 0) {
                return null;
            }
            i++;
            j = j4;
        }
        return new e8k(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final short g(String str) {
        q8k q8kVar;
        str.getClass();
        y7k d = d(str);
        if (d != null) {
            int i = d.a;
            if (Integer.compareUnsigned(i, 65535) <= 0) {
                q8kVar = new q8k((short) i);
                if (q8kVar == null) {
                    return q8kVar.a;
                }
                StringsKt__StringNumberConversionsKt.h(str);
                throw null;
            }
        }
        q8kVar = null;
        if (q8kVar == null) {
        }
    }
}
