package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.PathService;

/* loaded from: classes10.dex */
class PathServiceJni implements PathService.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    PathServiceJni() {
    }

    public static PathService.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (PathService.Natives) jniTestInstanceHolder.value;
        }
        return new PathServiceJni();
    }

    public static void setInstanceForTesting(PathService.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.base.PathService.Natives
    public void override(int what, String path) {
        GEN_JNI.org_chromium_base_PathService_override(what, path);
    }
}
