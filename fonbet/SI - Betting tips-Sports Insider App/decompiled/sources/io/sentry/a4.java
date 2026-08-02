package io.sentry;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15442a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.android.core.p f15443b;

    public /* synthetic */ a4(io.sentry.android.core.p pVar, int i5) {
        this.f15442a = i5;
        this.f15443b = pVar;
    }

    public final androidx.credentials.playservices.c a(b1 b1Var, b6 b6Var) {
        switch (this.f15442a) {
            case 0:
                y4.a.C(b1Var, "Scopes are required");
                y4.a.C(b6Var, "SentryOptions is required");
                String cacheDirPath = this.f15443b.f15788a.getCacheDirPath();
                if (cacheDirPath != null && d9.e.a(cacheDirPath, b6Var.getLogger())) {
                    break;
                } else {
                    b6Var.getLogger().h(b5.ERROR, "No cache dir path is defined in options.", new Object[0]);
                    break;
                }
                break;
            default:
                y4.a.C(b1Var, "Scopes are required");
                y4.a.C(b6Var, "SentryOptions is required");
                String outboxPath = this.f15443b.f15788a.getOutboxPath();
                if (outboxPath != null && d9.e.a(outboxPath, b6Var.getLogger())) {
                    break;
                } else {
                    b6Var.getLogger().h(b5.ERROR, "No outbox dir path is defined in options.", new Object[0]);
                    break;
                }
                break;
        }
        return null;
    }
}
