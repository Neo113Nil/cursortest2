package com.facebook.yoga;

/* loaded from: classes6.dex */
public class YogaConfigJNIFinalizer extends YogaConfigJNIBase {
    protected void finalize() throws Throwable {
        try {
            freeNatives();
        } finally {
            super.finalize();
        }
    }

    public void freeNatives() {
        if (this.nativePointer != 0) {
            long j = this.nativePointer;
            this.nativePointer = 0L;
            YogaNative.jni_YGConfigFreeJNI(j);
        }
    }
}
