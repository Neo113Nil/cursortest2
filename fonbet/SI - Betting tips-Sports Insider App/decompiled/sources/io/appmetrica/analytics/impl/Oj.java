package io.appmetrica.analytics.impl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Oj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12700a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12701b;

    public Oj(String str, String str2) {
        this.f12700a = str;
        this.f12701b = str2;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra2) {
        ra2.reportEvent(this.f12700a, this.f12701b);
    }
}
