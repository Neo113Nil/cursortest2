package com.google.android.gms.internal.measurement;

import defpackage.mz1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzabo extends RuntimeException {
    public static zzabo a(int i, int i2, String str, String str2) {
        return new zzabo(c(i, i2, str, str2));
    }

    public static zzabo b(int i, String str, String str2) {
        return new zzabo(c(i, i + 1, str, str2));
    }

    public static String c(int i, int i2, String str, String str2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        StringBuilder r = mz1.r(str, ": ");
        if (i > 8) {
            r.append("...");
            r.append((CharSequence) str2, i - 5, i);
        } else {
            r.append((CharSequence) str2, 0, i);
        }
        r.append('[');
        r.append(str2.substring(i, i2));
        r.append(']');
        if (str2.length() - i2 > 8) {
            r.append((CharSequence) str2, i2, i2 + 5);
            r.append("...");
        } else {
            r.append((CharSequence) str2, i2, str2.length());
        }
        return r.toString();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
