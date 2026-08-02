package org.spongycastle.util.encoders;

/* loaded from: classes5.dex */
public class e extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f62876a;

    public e(String str, Throwable th2) {
        super(str);
        this.f62876a = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f62876a;
    }
}
