package org.chromium.net;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.net.GURLUtils;

/* loaded from: classes10.dex */
public class GURLUtilsJni implements GURLUtils.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    public static GURLUtils.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (GURLUtils.Natives) jniTestInstanceHolder.value;
        }
        return new GURLUtilsJni();
    }

    public static void setInstanceForTesting(GURLUtils.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.net.GURLUtils.Natives
    public String getOrigin(String url) {
        return (String) GEN_JNI.org_chromium_net_GURLUtils_getOrigin(url);
    }
}
