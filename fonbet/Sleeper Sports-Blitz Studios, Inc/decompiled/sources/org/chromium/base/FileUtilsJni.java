package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.FileUtils;

/* loaded from: classes10.dex */
public class FileUtilsJni implements FileUtils.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    public static FileUtils.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (FileUtils.Natives) jniTestInstanceHolder.value;
        }
        return new FileUtilsJni();
    }

    public static void setInstanceForTesting(FileUtils.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.base.FileUtils.Natives
    public String getAbsoluteFilePath(String filePath) {
        return (String) GEN_JNI.org_chromium_base_FileUtils_getAbsoluteFilePath(filePath);
    }
}
