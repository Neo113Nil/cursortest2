package he;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import td.C9854t;
import td.InterfaceC9836b;
import wd.AbstractC10539z;

/* loaded from: classes.dex */
public final class m extends Vd.m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ArrayList f65431a;

    m(ArrayList arrayList) {
        this.f65431a = arrayList;
    }

    @Override // Vd.m
    public final void a(InterfaceC9836b fakeOverride) {
        Intrinsics.checkNotNullParameter(fakeOverride, "fakeOverride");
        Vd.n.t(fakeOverride, null);
        this.f65431a.add(fakeOverride);
    }

    @Override // Vd.m
    protected final void b(InterfaceC9836b fromSuper, InterfaceC9836b fromCurrent) {
        Intrinsics.checkNotNullParameter(fromSuper, "fromSuper");
        Intrinsics.checkNotNullParameter(fromCurrent, "fromCurrent");
        if (fromCurrent instanceof AbstractC10539z) {
            ((AbstractC10539z) fromCurrent).N0(C9854t.f99429a, fromSuper);
        }
    }
}
