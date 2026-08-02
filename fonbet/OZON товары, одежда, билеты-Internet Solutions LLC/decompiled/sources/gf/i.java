package gf;

import bf.AbstractC5657a;
import gf.f;

/* loaded from: classes10.dex */
public final class i extends AbstractC5657a {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f.d f64392e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f64393f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f64394g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, f.d dVar, int i11, int i12) {
        super(str, true);
        this.f64392e = dVar;
        this.f64393f = i11;
        this.f64394g = i12;
    }

    @Override // bf.AbstractC5657a
    public final long f() {
        this.f64392e.f64370b.m1(this.f64393f, this.f64394g, true);
        return -1L;
    }
}
