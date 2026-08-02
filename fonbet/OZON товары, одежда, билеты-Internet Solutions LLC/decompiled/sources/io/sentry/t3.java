package io.sentry;

import com.google.android.gms.common.Scopes;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class t3 extends j3 {

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private static final io.sentry.protocol.D f68505s = io.sentry.protocol.D.CUSTOM;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private String f68506p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private io.sentry.protocol.D f68507q;

    /* renamed from: r, reason: collision with root package name */
    private s3 f68508r;

    public t3(@NotNull String str, @NotNull io.sentry.protocol.D d11, @NotNull String str2) {
        this(str, d11, str2, null);
    }

    public static t3 t(@NotNull C7175n1 c7175n1) {
        c7175n1.getClass();
        C7133d a11 = c7175n1.a();
        a11.getClass();
        t3 t3Var = new t3(c7175n1.d(), c7175n1.c(), "default", (l3) null);
        t3Var.f68506p = "<unlabeled transaction>";
        t3Var.f68508r = null;
        t3Var.f68507q = f68505s;
        t3Var.f68028m = io.sentry.util.y.a(a11, null, null, null);
        return t3Var;
    }

    @NotNull
    public final String u() {
        return this.f68506p;
    }

    public final s3 v() {
        return this.f68508r;
    }

    @NotNull
    public final io.sentry.protocol.D w() {
        return this.f68507q;
    }

    public t3() {
        this("app.launch", io.sentry.protocol.D.CUSTOM, Scopes.PROFILE, null);
    }

    public t3(@NotNull String str, @NotNull io.sentry.protocol.D d11, @NotNull String str2, s3 s3Var) {
        super(new io.sentry.protocol.t(), new l3(), str2, null);
        io.sentry.util.p.b(str, "name is required");
        this.f68506p = str;
        this.f68507q = d11;
        r(s3Var);
        this.f68028m = io.sentry.util.y.a(null, s3Var == null ? null : s3Var.e(), s3Var == null ? null : s3Var.d(), s3Var == null ? null : s3Var.c());
    }
}
