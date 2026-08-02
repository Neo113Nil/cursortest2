package org.chromium.net.impl;

import android.os.SystemProperties;
import java.util.Map;

/* loaded from: classes10.dex */
public final class AndroidOsSystemProperties {
    private static Map<String, String> sOverridesForTesting;

    public static String get(String key, String def) {
        Map<String, String> map = sOverridesForTesting;
        if (map == null) {
            return SystemProperties.get(key, def);
        }
        String str = map.get(key);
        return str != null ? str : def;
    }

    public static final class WithOverridesForTesting implements AutoCloseable {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        public WithOverridesForTesting(Map<String, String> overrides) {
            AndroidOsSystemProperties.sOverridesForTesting = overrides;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            AndroidOsSystemProperties.sOverridesForTesting = null;
        }
    }
}
