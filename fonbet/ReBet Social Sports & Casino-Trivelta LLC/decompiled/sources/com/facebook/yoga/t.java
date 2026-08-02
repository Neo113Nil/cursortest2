package com.facebook.yoga;

/* loaded from: classes2.dex */
public class t extends YogaNodeJNIBase {
    public t(c cVar) {
        super(cVar);
    }

    public void finalize() {
        try {
            p0();
        } finally {
            super.finalize();
        }
    }

    public void p0() {
        long j10 = this.f31645f;
        if (j10 != 0) {
            this.f31645f = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j10);
        }
    }
}
