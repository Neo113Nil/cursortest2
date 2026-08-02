package org.spongycastle.asn1;

/* loaded from: classes5.dex */
public class r extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f62268a;

    public r(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f62268a;
    }

    public r(String str, Throwable th2) {
        super(str);
        this.f62268a = th2;
    }
}
