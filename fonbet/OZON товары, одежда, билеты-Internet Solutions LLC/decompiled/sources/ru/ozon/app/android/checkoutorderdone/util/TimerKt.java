package ru.ozon.app.android.checkoutorderdone.util;

import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import S0.n1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a3\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "deadline", "Lkotlin/Function0;", "", "onComplete", "", "staticTimerEnabled", "LS0/p0;", "", DynamicElementDTO.TIMER, "(JLkotlin/jvm/functions/Function0;ZLS0/k;I)LS0/p0;", "orderdone_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TimerKt {
    @NotNull
    public static final InterfaceC3978p0<String> timer(long j11, @NotNull Function0<Unit> onComplete, boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        interfaceC3967k.o(1845025776);
        interfaceC3967k.o(1937568673);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = n1.f("", D1.f25195a);
            interfaceC3967k.x(C11);
        }
        InterfaceC3978p0<String> interfaceC3978p0 = (InterfaceC3978p0) C11;
        interfaceC3967k.k();
        Long valueOf = Long.valueOf(j11);
        interfaceC3967k.o(1937570944);
        boolean z12 = ((((i11 & 14) ^ 6) > 4 && interfaceC3967k.s(j11)) || (i11 & 6) == 4) | ((((i11 & 896) ^ 384) > 256 && interfaceC3967k.p(z11)) || (i11 & 384) == 256) | ((((i11 & 112) ^ 48) > 32 && interfaceC3967k.n(onComplete)) || (i11 & 48) == 32);
        Object C12 = interfaceC3967k.C();
        if (z12 || C12 == InterfaceC3967k.a.a()) {
            C12 = new TimerKt$timer$1$1(j11, interfaceC3978p0, z11, onComplete, null);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.k();
        Q.e(interfaceC3967k, valueOf, (Function2) C12);
        interfaceC3967k.k();
        return interfaceC3978p0;
    }
}
