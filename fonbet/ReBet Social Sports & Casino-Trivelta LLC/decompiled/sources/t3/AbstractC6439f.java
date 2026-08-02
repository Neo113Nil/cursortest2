package t3;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t3.AbstractC6440g;

/* renamed from: t3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6439f {
    public static final Function1 b(final InterfaceC6437d interfaceC6437d) {
        Intrinsics.checkNotNullParameter(interfaceC6437d, "<this>");
        return new Function1() { // from class: t3.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit c10;
                c10 = AbstractC6439f.c(InterfaceC6437d.this, (AbstractC6440g) obj);
                return c10;
            }
        };
    }

    public static final Unit c(InterfaceC6437d interfaceC6437d, AbstractC6440g result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof AbstractC6440g.c) {
            AbstractC6440g.c cVar = (AbstractC6440g.c) result;
            interfaceC6437d.a(cVar.a(), cVar.b(), cVar.c(), cVar.d());
        } else if (result instanceof AbstractC6440g.b) {
            interfaceC6437d.c(((AbstractC6440g.b) result).a());
        } else {
            if (!(result instanceof AbstractC6440g.a)) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC6437d.b();
        }
        return Unit.INSTANCE;
    }
}
