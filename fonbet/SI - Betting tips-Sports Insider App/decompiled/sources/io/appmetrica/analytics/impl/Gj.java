package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Gj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f12275b;

    public Gj(String str, byte[] bArr) {
        this.f12274a = str;
        this.f12275b = bArr;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra2) {
        ra2.setSessionExtra(this.f12274a, this.f12275b);
    }
}
