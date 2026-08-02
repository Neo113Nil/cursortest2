package org.chromium.base;

import internal.org.jni_zero.CalledByNative;

/* loaded from: classes10.dex */
public abstract class TokenBase {

    /* renamed from: a, reason: collision with root package name */
    protected final long f78521a;

    /* renamed from: b, reason: collision with root package name */
    protected final long f78522b;

    protected TokenBase(long j11, long j12) {
        this.f78521a = j11;
        this.f78522b = j12;
    }

    @CalledByNative
    private long getHighForSerialization() {
        return this.f78521a;
    }

    @CalledByNative
    private long getLowForSerialization() {
        return this.f78522b;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            TokenBase tokenBase = (TokenBase) obj;
            if (tokenBase.f78521a == this.f78521a && tokenBase.f78522b == this.f78522b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j11 = this.f78522b;
        long j12 = this.f78521a;
        return (((int) (j11 ^ (j11 >>> 32))) * 31) + ((int) ((j12 >>> 32) ^ j12));
    }
}
