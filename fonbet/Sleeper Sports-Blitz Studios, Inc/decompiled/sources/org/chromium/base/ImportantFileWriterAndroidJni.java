package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.ImportantFileWriterAndroid;

/* loaded from: classes10.dex */
public class ImportantFileWriterAndroidJni implements ImportantFileWriterAndroid.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    public static ImportantFileWriterAndroid.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (ImportantFileWriterAndroid.Natives) jniTestInstanceHolder.value;
        }
        return new ImportantFileWriterAndroidJni();
    }

    public static void setInstanceForTesting(ImportantFileWriterAndroid.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.base.ImportantFileWriterAndroid.Natives
    public boolean writeFileAtomically(String fileName, byte[] data) {
        return GEN_JNI.org_chromium_base_ImportantFileWriterAndroid_writeFileAtomically(fileName, data);
    }
}
