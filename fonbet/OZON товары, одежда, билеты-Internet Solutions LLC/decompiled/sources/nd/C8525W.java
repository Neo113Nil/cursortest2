package nd;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nd.X;
import td.InterfaceC9839e;

/* renamed from: nd.W, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8525W implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final X.a f76925a;

    public C8525W(X.a aVar) {
        this.f76925a = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Collection<InterfaceC9839e> m11 = this.f76925a.j().m();
        Intrinsics.checkNotNullExpressionValue(m11, "getSealedSubclasses(...)");
        ArrayList arrayList = new ArrayList();
        for (InterfaceC9839e interfaceC9839e : m11) {
            Intrinsics.g(interfaceC9839e, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class<?> l11 = g1.l(interfaceC9839e);
            X x11 = l11 != null ? new X(l11) : null;
            if (x11 != null) {
                arrayList.add(x11);
            }
        }
        return arrayList;
    }
}
