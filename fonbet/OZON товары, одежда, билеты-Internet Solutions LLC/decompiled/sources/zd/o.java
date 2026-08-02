package zd;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;

/* loaded from: classes10.dex */
final class o implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final u f108841a;

    public o(u uVar) {
        this.f108841a = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(u.I(this.f108841a, (Method) obj));
    }
}
