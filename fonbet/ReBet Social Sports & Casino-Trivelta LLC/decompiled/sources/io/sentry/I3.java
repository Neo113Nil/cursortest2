package io.sentry;

/* loaded from: classes3.dex */
public final class I3 implements D {

    /* renamed from: a, reason: collision with root package name */
    public final String f50390a;

    /* renamed from: b, reason: collision with root package name */
    public final String f50391b;

    public I3(String str, String str2) {
        this.f50390a = str;
        this.f50391b = str2;
    }

    public final AbstractC4810q2 a(AbstractC4810q2 abstractC4810q2) {
        if (abstractC4810q2.C().i() == null) {
            abstractC4810q2.C().y(new io.sentry.protocol.w());
        }
        io.sentry.protocol.w i10 = abstractC4810q2.C().i();
        if (i10 != null && i10.d() == null && i10.e() == null) {
            i10.f(this.f50391b);
            i10.h(this.f50390a);
        }
        return abstractC4810q2;
    }

    @Override // io.sentry.D
    public C4733c3 k(C4733c3 c4733c3, J j10) {
        return (C4733c3) a(c4733c3);
    }

    @Override // io.sentry.D
    public io.sentry.protocol.B r(io.sentry.protocol.B b10, J j10) {
        return (io.sentry.protocol.B) a(b10);
    }

    public I3() {
        this(System.getProperty("java.version"), System.getProperty("java.vendor"));
    }
}
