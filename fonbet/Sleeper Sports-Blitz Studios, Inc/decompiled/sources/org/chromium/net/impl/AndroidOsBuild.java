package org.chromium.net.impl;

import android.os.Build;

/* loaded from: classes10.dex */
public final class AndroidOsBuild {
    private static AndroidOsBuild sOverrideForTesting;
    private final String mType;

    public AndroidOsBuild(String type) {
        this.mType = type;
    }

    public static AndroidOsBuild get() {
        AndroidOsBuild androidOsBuild = sOverrideForTesting;
        return androidOsBuild != null ? androidOsBuild : new AndroidOsBuild(Build.TYPE);
    }

    public String getType() {
        return this.mType;
    }

    public static final class WithOverrideForTesting implements AutoCloseable {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        public WithOverrideForTesting(AndroidOsBuild override) {
            AndroidOsBuild.sOverrideForTesting = override;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            AndroidOsBuild.sOverrideForTesting = null;
        }
    }
}
