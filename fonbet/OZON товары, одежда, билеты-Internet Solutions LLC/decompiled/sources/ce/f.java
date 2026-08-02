package ce;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9836b;
import td.InterfaceC9845k;

/* loaded from: classes10.dex */
public final class f extends Vd.m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ArrayList<InterfaceC9845k> f57034a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f57035b;

    f(ArrayList<InterfaceC9845k> arrayList, g gVar) {
        this.f57034a = arrayList;
        this.f57035b = gVar;
    }

    @Override // Vd.m
    public final void a(InterfaceC9836b fakeOverride) {
        Intrinsics.checkNotNullParameter(fakeOverride, "fakeOverride");
        Vd.n.t(fakeOverride, null);
        this.f57034a.add(fakeOverride);
    }

    @Override // Vd.m
    protected final void b(InterfaceC9836b fromSuper, InterfaceC9836b fromCurrent) {
        Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
        Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
        throw new IllegalStateException(("Conflict in scope of " + this.f57035b.j() + ": " + fromSuper + " vs " + fromCurrent).toString());
    }
}
