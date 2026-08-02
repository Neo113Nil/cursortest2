package com.vk.push.common.utils;

import xsna.drm0;
import xsna.epx;
import xsna.erm0;

/* compiled from: StringExtensions.kt */
/* loaded from: classes5.dex */
public final class StringExtensionsKt {
    public static final String nullIfBlank(String str) {
        if (drm0.N(str)) {
            return null;
        }
        return str;
    }

    public static final String takeSafe(String str, int i) {
        if (str.length() < i) {
            return null;
        }
        return erm0.D0(i, str);
    }

    public static final <T extends Enum<T>> T toEnum(String str, T t) {
        if (str == null) {
            return t;
        }
        try {
            epx.k();
            throw null;
        } catch (IllegalArgumentException unused) {
            return t;
        }
    }
}
