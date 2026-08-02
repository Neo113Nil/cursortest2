package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzabp extends zzabn {
    public static final String a;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        if (r0.matches("\\n|\\r(?:\\n)?") == false) goto L4;
     */
    static {
        String str;
        try {
            str = System.getProperty("line.separator");
        } catch (SecurityException unused) {
        }
        str = "\n";
        a = str;
    }

    public static int d(int i, String str) {
        while (i < str.length()) {
            int i2 = i + 1;
            if (str.charAt(i) != '%') {
                i = i2;
            } else {
                if (i2 >= str.length()) {
                    throw new zzabo(zzabo.c(i, -1, "trailing unquoted '%' character", str));
                }
                char charAt = str.charAt(i2);
                if (charAt != '%' && charAt != 'n') {
                    return i;
                }
                i += 2;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
    
        r1 = r14;
        r5 = d(r1.c(r15, r3, r4, r5, r6, r7), r4);
        r14 = r1;
        r2 = r3;
        r1 = r9;
     */
    @Override // com.google.android.gms.internal.measurement.zzabn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(zzyy zzyyVar) {
        int i;
        int i2;
        int i3;
        int i4;
        String str = zzyyVar.a.b;
        int d = d(0, str);
        int i5 = -1;
        int i6 = 0;
        while (d >= 0) {
            int i7 = d + 1;
            int i8 = 0;
            int i9 = i7;
            while (i9 < str.length()) {
                int i10 = i9 + 1;
                char charAt = str.charAt(i9);
                char c = (char) (charAt - '0');
                if (c >= '\n') {
                    if (charAt == '$') {
                        if (i9 - i7 == 0) {
                            throw zzabo.a(d, i10, "missing index", str);
                        }
                        if (str.charAt(i7) == '0') {
                            throw zzabo.a(d, i10, "index has leading zero", str);
                        }
                        int i11 = i8 - 1;
                        if (i10 == str.length()) {
                            throw new zzabo(zzabo.c(d, -1, "unterminated parameter", str));
                        }
                        str.charAt(i10);
                        i4 = i6;
                        i3 = i9 + 2;
                        i = i10;
                        i2 = i11;
                    } else if (charAt != '<') {
                        int i12 = i6 + 1;
                        i = i7;
                        i2 = i6;
                        i3 = i10;
                        i4 = i12;
                    } else {
                        if (i5 == -1) {
                            throw zzabo.a(d, i10, "invalid relative parameter", str);
                        }
                        if (i10 == str.length()) {
                            throw new zzabo(zzabo.c(d, -1, "unterminated parameter", str));
                        }
                        str.charAt(i10);
                        i4 = i6;
                        i3 = i9 + 2;
                        i = i10;
                        i2 = i5;
                    }
                    int i13 = i3 - 1;
                    while (i13 < str.length()) {
                        if (((char) ((str.charAt(i13) & 65503) - 65)) < 26) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    throw new zzabo(zzabo.c(d, -1, "unterminated parameter", str));
                }
                i8 = (i8 * 10) + c;
                if (i8 >= 1000000) {
                    throw zzabo.a(d, i10, "index too large", str);
                }
                i9 = i10;
            }
            throw new zzabo(zzabo.c(d, -1, "unterminated parameter", str));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzabn
    public final void b(int i, int i2, String str, StringBuilder sb) {
        int i3 = i;
        while (i < i2) {
            int i4 = i + 1;
            if (str.charAt(i) == '%') {
                if (i4 == i2) {
                    break;
                }
                char charAt = str.charAt(i4);
                if (charAt == '%') {
                    sb.append((CharSequence) str, i3, i4);
                } else if (charAt == 'n') {
                    sb.append((CharSequence) str, i3, i);
                    sb.append(a);
                }
                i3 = i + 2;
                i = i3;
            }
            i = i4;
        }
        if (i3 < i2) {
            sb.append((CharSequence) str, i3, i2);
        }
    }

    public abstract int c(zzyy zzyyVar, int i, String str, int i2, int i3, int i4);
}
