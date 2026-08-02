package io.sentry.android.core;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y implements io.sentry.hints.a, io.sentry.hints.l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15890a;

    public y(boolean z5) {
        this.f15890a = z5;
    }

    @Override // io.sentry.hints.a
    public final Long b() {
        return null;
    }

    @Override // io.sentry.hints.a
    public final boolean c() {
        return true;
    }

    @Override // io.sentry.hints.a
    public final String e() {
        return this.f15890a ? "anr_background" : "anr_foreground";
    }
}
