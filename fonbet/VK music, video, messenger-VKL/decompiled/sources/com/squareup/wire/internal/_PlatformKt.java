package com.squareup.wire.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: -Platform.kt */
/* loaded from: classes14.dex */
public final class _PlatformKt {
    public static final String camelCase(String str, boolean z) {
        StringBuilder sb = new StringBuilder(str.length());
        int i = 0;
        while (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            i += Character.charCount(codePointAt);
            if (codePointAt == 95) {
                z = true;
            } else {
                if (z && codePointAt <= 122 && 97 <= codePointAt) {
                    codePointAt -= 32;
                }
                sb.appendCodePoint(codePointAt);
                z = false;
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ String camelCase$default(String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return camelCase(str, z);
    }

    public static final <T> List<T> toUnmodifiableList(List<T> list) {
        return Collections.unmodifiableList(list);
    }

    public static final <K, V> Map<K, V> toUnmodifiableMap(Map<K, V> map) {
        return Collections.unmodifiableMap(map);
    }
}
