package org.spongycastle.util.encoders;

/* loaded from: classes5.dex */
public class c extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f62875a;

    public c(String str, Throwable th2) {
        super(str);
        this.f62875a = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f62875a;
    }
}
