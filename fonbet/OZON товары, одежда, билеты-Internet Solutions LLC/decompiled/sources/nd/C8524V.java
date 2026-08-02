package nd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nd.X;
import td.EnumC9840f;
import te.C9865a;

/* renamed from: nd.V, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8524V implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final X.a f76923a;

    /* renamed from: b, reason: collision with root package name */
    private final X f76924b;

    public C8524V(X.a aVar, X x11) {
        this.f76923a = aVar;
        this.f76924b = x11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        X.a aVar = this.f76923a;
        Collection<je.N> o11 = aVar.j().k().o();
        Intrinsics.checkNotNullExpressionValue(o11, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList(o11.size());
        for (je.N n11 : o11) {
            Intrinsics.f(n11);
            arrayList.add(new R0(n11, new C8515L(n11, aVar, this.f76924b)));
        }
        if (!qd.m.h0(aVar.j())) {
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    EnumC9840f kind = Vd.i.d(((R0) it.next()).i()).getKind();
                    Intrinsics.checkNotNullExpressionValue(kind, "getKind(...)");
                    if (kind != EnumC9840f.INTERFACE && kind != EnumC9840f.ANNOTATION_CLASS) {
                        break;
                    }
                }
            }
            je.Y i11 = Zd.e.e(aVar.j()).i();
            Intrinsics.checkNotNullExpressionValue(i11, "getAnyType(...)");
            arrayList.add(new R0(i11, C8516M.f76893a));
        }
        return C9865a.b(arrayList);
    }
}
