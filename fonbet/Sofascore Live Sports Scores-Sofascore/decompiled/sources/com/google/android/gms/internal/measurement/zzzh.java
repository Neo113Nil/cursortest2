package com.google.android.gms.internal.measurement;

import defpackage.wt3;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzzh {
    public static final Locale a = Locale.ROOT;

    public static String a(Object obj) {
        String simpleName;
        if (obj == null) {
            return "null";
        }
        try {
            if (obj.getClass().isArray()) {
                return obj instanceof int[] ? Arrays.toString((int[]) obj) : obj instanceof long[] ? Arrays.toString((long[]) obj) : obj instanceof byte[] ? Arrays.toString((byte[]) obj) : obj instanceof char[] ? Arrays.toString((char[]) obj) : obj instanceof short[] ? Arrays.toString((short[]) obj) : obj instanceof float[] ? Arrays.toString((float[]) obj) : obj instanceof double[] ? Arrays.toString((double[]) obj) : obj instanceof boolean[] ? Arrays.toString((boolean[]) obj) : Arrays.toString((Object[]) obj);
            }
            String obj2 = obj.toString();
            return obj2 != null ? obj2 : c(obj, "toString() returned null");
        } catch (RuntimeException e) {
            try {
                simpleName = e.toString();
            } catch (RuntimeException e2) {
                simpleName = e2.getClass().getSimpleName();
            }
            return c(obj, simpleName);
        }
    }

    public static void b(StringBuilder sb, long j, boolean z) {
        if (j == 0) {
            sb.append("0");
            return;
        }
        String str = true != z ? "0123456789abcdef" : "0123456789ABCDEF";
        for (int numberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j)) & (-4); numberOfLeadingZeros >= 0; numberOfLeadingZeros -= 4) {
            sb.append(str.charAt((int) ((j >>> numberOfLeadingZeros) & 15)));
        }
    }

    public static String c(Object obj, String str) {
        String name = obj.getClass().getName();
        int identityHashCode = System.identityHashCode(obj);
        StringBuilder sb = new StringBuilder(wt3.h(name.length(), 2, String.valueOf(identityHashCode).length(), 2, String.valueOf(str).length()) + 1);
        wt3.t(identityHashCode, "{", name, "@", sb);
        return wt3.m(": ", str, sb, "}");
    }
}
