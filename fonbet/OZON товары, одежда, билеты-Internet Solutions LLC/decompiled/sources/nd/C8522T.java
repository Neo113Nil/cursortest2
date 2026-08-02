package nd;

import java.lang.reflect.Field;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nd.X;
import td.EnumC9840f;
import td.InterfaceC9839e;

/* renamed from: nd.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C8522T implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final X.a f76914a;

    /* renamed from: b, reason: collision with root package name */
    private final X f76915b;

    public C8522T(X.a aVar, X x11) {
        this.f76914a = aVar;
        this.f76915b = x11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Field declaredField;
        InterfaceC9839e j11 = this.f76914a.j();
        if (j11.getKind() != EnumC9840f.OBJECT) {
            return null;
        }
        boolean j02 = j11.j0();
        X x11 = this.f76915b;
        if (j02) {
            qd.d dVar = qd.d.f81829a;
            if (!qd.e.a(j11)) {
                declaredField = x11.c().getEnclosingClass().getDeclaredField(j11.getName().b());
                Object obj = declaredField.get(null);
                Intrinsics.g(obj, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl.Data.objectInstance_delegate$lambda$11");
                return obj;
            }
        }
        declaredField = x11.c().getDeclaredField("INSTANCE");
        Object obj2 = declaredField.get(null);
        Intrinsics.g(obj2, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl.Data.objectInstance_delegate$lambda$11");
        return obj2;
    }
}
