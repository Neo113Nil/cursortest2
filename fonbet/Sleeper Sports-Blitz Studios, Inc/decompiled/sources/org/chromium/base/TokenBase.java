package org.chromium.base;

import internal.org.jni_zero.JNINamespace;

@JNINamespace("base::android")
/* loaded from: classes10.dex */
public abstract class TokenBase {
    protected final long mHigh;
    protected final long mLow;

    protected TokenBase(long high, long low) {
        this.mHigh = high;
        this.mLow = low;
    }

    private long getHighForSerialization() {
        return this.mHigh;
    }

    private long getLowForSerialization() {
        return this.mLow;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenBase)) {
            return false;
        }
        TokenBase tokenBase = (TokenBase) obj;
        return tokenBase.mHigh == this.mHigh && tokenBase.mLow == this.mLow;
    }

    public int hashCode() {
        long j = this.mLow;
        long j2 = this.mHigh;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2));
    }
}
