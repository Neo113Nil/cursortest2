package org.spongycastle.crypto;

/* loaded from: classes5.dex */
public abstract class k extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f62627a;

    public k(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f62627a;
    }

    public k(String str, Throwable th2) {
        super(str);
        this.f62627a = th2;
    }
}
