package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.qj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0437qj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f14521a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14522b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f14523c;

    public C0437qj(String str, String str2, Throwable th2) {
        this.f14521a = str;
        this.f14522b = str2;
        this.f14523c = th2;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra2) {
        ra2.reportError(this.f14521a, this.f14522b, this.f14523c);
    }
}
