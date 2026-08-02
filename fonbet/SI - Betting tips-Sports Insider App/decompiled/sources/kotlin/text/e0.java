package kotlin.text;

import gf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class e0 {
    public static final boolean a(String str) {
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            if (Intrinsics.compare((int) charAt, 128) >= 0 || Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }

    public static final String b(int i5) {
        return io.sentry.config.a.D(CharsKt__CharJVMKt.checkRadix(16), i5 & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final byte c(String str) {
        gf.w wVar;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        gf.a0 e7 = e(str);
        if (e7 != null) {
            int i5 = e7.f10011a;
            if (Integer.compare(Integer.MIN_VALUE ^ i5, -2147483393) <= 0) {
                wVar = new gf.w((byte) i5);
                if (wVar == null) {
                    return wVar.f10043a;
                }
                StringsKt__StringNumberConversionsKt.f(str);
                throw null;
            }
        }
        wVar = null;
        if (wVar == null) {
        }
    }

    public static final int d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        gf.a0 e7 = e(str);
        if (e7 != null) {
            return e7.f10011a;
        }
        StringsKt__StringNumberConversionsKt.f(str);
        throw null;
    }

    public static final gf.a0 e(String str) {
        int i5;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char charAt = str.charAt(0);
        if (Intrinsics.compare((int) charAt, 48) < 0) {
            i5 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i5 = 0;
        }
        gf.z zVar = gf.a0.f10010b;
        int i11 = 119304647;
        while (i5 < length) {
            int digit = Character.digit((int) str.charAt(i5), 10);
            if (digit < 0) {
                return null;
            }
            int i12 = i10 ^ Integer.MIN_VALUE;
            if (Integer.compare(i12, i11 ^ Integer.MIN_VALUE) > 0) {
                if (i11 != 119304647) {
                    return null;
                }
                i11 = (int) (((-1) & 4294967295L) / (4294967295L & 10));
                if (Integer.compare(i12, i11 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i13 = i10 * 10;
            int i14 = digit + i13;
            if (Integer.compare(i14 ^ Integer.MIN_VALUE, i13 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i5++;
            i10 = i14;
        }
        return new gf.a0(i10);
    }

    public static final long f(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        gf.d0 g10 = g(str);
        if (g10 != null) {
            return g10.f10018a;
        }
        StringsKt__StringNumberConversionsKt.f(str);
        throw null;
    }

    public static final gf.d0 g(String str) {
        int i5;
        long j;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i10 = 10;
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char charAt = str.charAt(0);
        int i11 = 1;
        if (Intrinsics.compare((int) charAt, 48) >= 0) {
            i5 = 0;
        } else {
            if (length == 1 || charAt != '+') {
                return null;
            }
            i5 = 1;
        }
        long j6 = 10;
        gf.c0 c0Var = gf.d0.f10017b;
        long j10 = 0;
        long j11 = 512409557603043100L;
        while (i5 < length) {
            int digit = Character.digit((int) str.charAt(i5), i10);
            if (digit < 0) {
                return null;
            }
            int i12 = length;
            long j12 = j10 ^ Long.MIN_VALUE;
            int i13 = i5;
            if (Long.compare(j12, j11 ^ Long.MIN_VALUE) <= 0) {
                j = j6;
            } else {
                if (j11 != 512409557603043100L) {
                    return null;
                }
                if (j6 >= 0) {
                    long j13 = (LongCompanionObject.MAX_VALUE / j6) << i11;
                    j = j6;
                    j11 = j13 + ((((-1) - (j13 * j6)) ^ Long.MIN_VALUE) >= (j6 ^ Long.MIN_VALUE) ? i11 : 0);
                } else if (LongCompanionObject.MAX_VALUE < (j6 ^ Long.MIN_VALUE)) {
                    j = j6;
                    j11 = 0;
                } else {
                    j11 = 1;
                    j = j6;
                }
                if (Long.compare(j12, j11 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j14 = j10 * j;
            gf.z zVar = gf.a0.f10010b;
            long j15 = (digit & 4294967295L) + j14;
            if (Long.compare(j15 ^ Long.MIN_VALUE, j14 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i5 = i13 + 1;
            j10 = j15;
            length = i12;
            j6 = j;
            i10 = 10;
            i11 = 1;
        }
        return new gf.d0(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final short h(String str) {
        h0 h0Var;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        gf.a0 e7 = e(str);
        if (e7 != null) {
            int i5 = e7.f10011a;
            if (Integer.compare(Integer.MIN_VALUE ^ i5, -2147418113) <= 0) {
                h0Var = new h0((short) i5);
                if (h0Var == null) {
                    return h0Var.f10023a;
                }
                StringsKt__StringNumberConversionsKt.f(str);
                throw null;
            }
        }
        h0Var = null;
        if (h0Var == null) {
        }
    }
}
