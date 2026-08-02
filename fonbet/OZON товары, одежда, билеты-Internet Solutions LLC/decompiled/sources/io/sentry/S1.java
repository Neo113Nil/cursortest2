package io.sentry;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class S1 {

    /* renamed from: c, reason: collision with root package name */
    private static final S1 f66736c = new S1();

    /* renamed from: a, reason: collision with root package name */
    private boolean f66737a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f66738b = new io.sentry.util.a();

    private S1() {
    }

    public static S1 a() {
        return f66736c;
    }

    public final void b() {
        InterfaceC7097a0 a11 = this.f66738b.a();
        try {
            this.f66737a = false;
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void c() {
        InterfaceC7097a0 a11 = this.f66738b.a();
        try {
            if (!this.f66737a) {
                this.f66737a = true;
            }
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
