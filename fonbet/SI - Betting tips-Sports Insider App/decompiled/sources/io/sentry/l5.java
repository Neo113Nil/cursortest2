package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class l5 implements io.sentry.util.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b6 f16609b;

    public /* synthetic */ l5(b6 b6Var, int i5) {
        this.f16608a = i5;
        this.f16609b = b6Var;
    }

    @Override // io.sentry.util.e
    public final Object b() {
        switch (this.f16608a) {
            case 0:
                return b6.a(this.f16609b);
            case 1:
                return new d2(this.f16609b);
            case 2:
                return b6.b(this.f16609b);
            default:
                return Boolean.valueOf(io.sentry.hints.j.y(this.f16609b, "androidx.core.view.ScrollingView"));
        }
    }

    public /* synthetic */ l5(io.sentry.hints.j jVar, SentryAndroidOptions sentryAndroidOptions) {
        this.f16608a = 3;
        this.f16609b = sentryAndroidOptions;
    }
}
