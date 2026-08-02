package com.facebook.yoga;

/* loaded from: classes2.dex */
public class f extends e {
    public void c() {
        long j10 = this.f31667c;
        if (j10 != 0) {
            this.f31667c = 0L;
            YogaNative.jni_YGConfigFreeJNI(j10);
        }
    }

    public void finalize() {
        try {
            c();
        } finally {
            super.finalize();
        }
    }
}
