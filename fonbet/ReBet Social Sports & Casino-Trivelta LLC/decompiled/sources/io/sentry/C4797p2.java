package io.sentry;

/* renamed from: io.sentry.p2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4797p2 implements InterfaceC4861w2 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4861w2 f52248a;

    public C4797p2() {
        if (a()) {
            this.f52248a = new C4773k3();
        } else {
            this.f52248a = new C4872y3();
        }
    }

    public static boolean a() {
        return io.sentry.util.y.c() && io.sentry.util.y.b();
    }

    @Override // io.sentry.InterfaceC4861w2
    public AbstractC4856v2 now() {
        return this.f52248a.now();
    }
}
