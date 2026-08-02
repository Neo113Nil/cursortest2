package nd;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nd.X;

/* renamed from: nd.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8523U implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final X.a f76921a;

    /* renamed from: b, reason: collision with root package name */
    private final X f76922b;

    public C8523U(X.a aVar, X x11) {
        this.f76921a = aVar;
        this.f76922b = x11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List<td.i0> r11 = this.f76921a.j().r();
        Intrinsics.checkNotNullExpressionValue(r11, "getDeclaredTypeParameters(...)");
        List<td.i0> list = r11;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (td.i0 i0Var : list) {
            Intrinsics.f(i0Var);
            arrayList.add(new T0(this.f76922b, i0Var));
        }
        return arrayList;
    }
}
