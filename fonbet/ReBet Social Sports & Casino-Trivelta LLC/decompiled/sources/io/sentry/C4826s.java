package io.sentry;

/* renamed from: io.sentry.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4826s implements ILogger {

    /* renamed from: a, reason: collision with root package name */
    public final F3 f52695a;

    /* renamed from: b, reason: collision with root package name */
    public final ILogger f52696b;

    public C4826s(F3 f32, ILogger iLogger) {
        this.f52695a = (F3) io.sentry.util.w.c(f32, "SentryOptions is required.");
        this.f52696b = iLogger;
    }

    @Override // io.sentry.ILogger
    public void a(EnumC4788n3 enumC4788n3, Throwable th2, String str, Object... objArr) {
        if (this.f52696b == null || !d(enumC4788n3)) {
            return;
        }
        this.f52696b.a(enumC4788n3, th2, str, objArr);
    }

    @Override // io.sentry.ILogger
    public void b(EnumC4788n3 enumC4788n3, String str, Throwable th2) {
        if (this.f52696b == null || !d(enumC4788n3)) {
            return;
        }
        this.f52696b.b(enumC4788n3, str, th2);
    }

    @Override // io.sentry.ILogger
    public void c(EnumC4788n3 enumC4788n3, String str, Object... objArr) {
        if (this.f52696b == null || !d(enumC4788n3)) {
            return;
        }
        this.f52696b.c(enumC4788n3, str, objArr);
    }

    @Override // io.sentry.ILogger
    public boolean d(EnumC4788n3 enumC4788n3) {
        return enumC4788n3 != null && this.f52695a.isDebug() && enumC4788n3.ordinal() >= this.f52695a.getDiagnosticLevel().ordinal();
    }
}
