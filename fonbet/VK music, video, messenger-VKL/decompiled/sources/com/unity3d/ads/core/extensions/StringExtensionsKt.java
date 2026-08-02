package com.unity3d.ads.core.extensions;

import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;
import kotlin.text.Regex;
import okio.ByteString;
import xsna.arm0;
import xsna.drm0;
import xsna.emb;
import xsna.epx;
import xsna.j5g;

/* compiled from: StringExtensions.kt */
/* loaded from: classes14.dex */
public final class StringExtensionsKt {
    private static final Regex VERSION_REGEX = new Regex("[0-9.]+");

    public static final int compareVersion(String str, String str2) {
        Integer m;
        Integer m2;
        if (str.length() == 0 || str2.length() == 0) {
            return -1;
        }
        String U = drm0.U(drm0.U(str, "v"), "V");
        String U2 = drm0.U(drm0.U(str2, "v"), "V");
        Regex regex = VERSION_REGEX;
        if (!regex.f(U) || !regex.f(U2) || drm0.D(U, "..", false) || drm0.D(U2, "..", false)) {
            return -1;
        }
        List c0 = drm0.c0(U, new String[]{"."}, 0, 6);
        List c02 = drm0.c0(U2, new String[]{"."}, 0, 6);
        int max = Math.max(c0.size(), c02.size());
        for (int i = 0; i < max; i++) {
            String str3 = (String) j5g.b0(i, c0);
            int intValue = (str3 == null || (m2 = arm0.m(10, str3)) == null) ? 0 : m2.intValue();
            String str4 = (String) j5g.b0(i, c02);
            int intValue2 = (str4 == null || (m = arm0.m(10, str4)) == null) ? 0 : m.intValue();
            if (intValue != intValue2) {
                return epx.g(intValue, intValue2);
            }
        }
        return 0;
    }

    public static final String getSHA256Hash(String str) {
        byte[] bytes = str.getBytes(emb.b);
        byte[] copyOf = Arrays.copyOf(bytes, bytes.length);
        return new ByteString(Arrays.copyOf(copyOf, copyOf.length)).l("SHA-256").o();
    }

    public static final String guessMimeType(String str) {
        return URLConnection.guessContentTypeFromName(str);
    }
}
