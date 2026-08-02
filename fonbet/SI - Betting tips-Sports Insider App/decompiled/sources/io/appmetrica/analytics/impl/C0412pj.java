package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.pj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0412pj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f14486a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f14487b;

    public C0412pj(String str, Throwable th2) {
        this.f14486a = str;
        this.f14487b = th2;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra2) {
        ra2.reportError(this.f14486a, this.f14487b);
    }
}
