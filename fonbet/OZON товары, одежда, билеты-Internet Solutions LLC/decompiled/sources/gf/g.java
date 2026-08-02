package gf;

import bf.AbstractC5657a;
import gf.f;
import kotlin.jvm.internal.M;

/* loaded from: classes6.dex */
public final class g extends AbstractC5657a {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f.d f64387e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ M f64388f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, f.d dVar, M m11) {
        super(str, true);
        this.f64387e = dVar;
        this.f64388f = m11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bf.AbstractC5657a
    public final long f() {
        f.d dVar = this.f64387e;
        dVar.f64370b.W().b(dVar.f64370b, (s) this.f64388f.f71787a);
        return -1L;
    }
}
