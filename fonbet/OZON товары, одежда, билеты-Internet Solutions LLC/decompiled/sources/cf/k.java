package cf;

import bf.AbstractC5657a;

/* loaded from: classes6.dex */
public final class k extends AbstractC5657a {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ l f57143e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(l lVar, String str) {
        super(str, true);
        this.f57143e = lVar;
    }

    @Override // bf.AbstractC5657a
    public final long f() {
        return this.f57143e.b(System.nanoTime());
    }
}
