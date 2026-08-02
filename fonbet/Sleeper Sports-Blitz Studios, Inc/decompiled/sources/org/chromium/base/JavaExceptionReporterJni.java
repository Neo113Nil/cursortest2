package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.JavaExceptionReporter;

/* loaded from: classes10.dex */
class JavaExceptionReporterJni implements JavaExceptionReporter.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    JavaExceptionReporterJni() {
    }

    public static JavaExceptionReporter.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (JavaExceptionReporter.Natives) jniTestInstanceHolder.value;
        }
        return new JavaExceptionReporterJni();
    }

    public static void setInstanceForTesting(JavaExceptionReporter.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.base.JavaExceptionReporter.Natives
    public void reportJavaException(boolean crashAfterReport, Throwable e) {
        GEN_JNI.org_chromium_base_JavaExceptionReporter_reportJavaException(crashAfterReport, e);
    }

    @Override // org.chromium.base.JavaExceptionReporter.Natives
    public void reportJavaStackTrace(String stackTrace) {
        GEN_JNI.org_chromium_base_JavaExceptionReporter_reportJavaStackTrace(stackTrace);
    }
}
