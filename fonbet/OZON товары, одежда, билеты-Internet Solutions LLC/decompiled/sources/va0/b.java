package va0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sa0.d;
import ta0.InterfaceC9791a;

/* loaded from: classes3.dex */
public final class b {
    public static final void a(@NotNull InterfaceC9791a interfaceC9791a, @NotNull String bankId, @NotNull final Function0<Unit> successBlock, @NotNull final Function1<? super d, Unit> errorBlock) {
        Intrinsics.checkNotNullParameter(interfaceC9791a, "<this>");
        Intrinsics.checkNotNullParameter(bankId, "bankId");
        Intrinsics.checkNotNullParameter(successBlock, "successBlock");
        Intrinsics.checkNotNullParameter(errorBlock, "errorBlock");
        interfaceC9791a.d(bankId, new Function1() { // from class: va0.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                d status = (d) obj;
                Intrinsics.checkNotNullParameter(status, "status");
                if (status == d.SUCCESS) {
                    Function0.this.invoke();
                } else {
                    errorBlock.invoke(status);
                }
                return Unit.f71690a;
            }
        });
    }
}
