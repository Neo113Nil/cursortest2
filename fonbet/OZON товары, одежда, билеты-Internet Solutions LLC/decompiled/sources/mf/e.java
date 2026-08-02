package mf;

import bf.AbstractC5657a;

/* loaded from: classes10.dex */
public final class e extends AbstractC5657a {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f74795e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ d f74796f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, long j11, d dVar) {
        super(str, true);
        this.f74795e = j11;
        this.f74796f = dVar;
    }

    @Override // bf.AbstractC5657a
    public final long f() {
        this.f74796f.u();
        return this.f74795e;
    }
}
