package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Wh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13108a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f13109b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0183gi f13110c;

    public Wh(C0183gi c0183gi, String str, byte[] bArr) {
        this.f13110c = c0183gi;
        this.f13108a = str;
        this.f13109b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0183gi c0183gi = this.f13110c;
        C0183gi.a(c0183gi.f13834a, c0183gi.f13837d, c0183gi.f13838e).setSessionExtra(this.f13108a, this.f13109b);
    }
}
