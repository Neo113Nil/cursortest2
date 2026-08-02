package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0089d1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13553b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0493t1 f13554c;

    public RunnableC0089d1(C0493t1 c0493t1, String str, String str2) {
        this.f13554c = c0493t1;
        this.f13552a = str;
        this.f13553b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0493t1.a(this.f13554c).b(this.f13552a, this.f13553b);
    }
}
