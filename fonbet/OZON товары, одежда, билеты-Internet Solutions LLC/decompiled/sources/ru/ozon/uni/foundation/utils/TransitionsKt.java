package ru.ozon.uni.foundation.utils;

import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import S0.n1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import m0.D0;
import m0.H0;
import m0.Y;
import org.jetbrains.annotations.NotNull;
import t0.o;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\u000e\u0010\t\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lt0/o;", "Lkotlin/time/b;", "delayToReset", "debounce", "Lm0/D0;", "", "rememberIndicationTransition-FbhrOv8", "(Lt0/o;JJLS0/k;II)Lm0/D0;", "rememberIndicationTransition", "needReset", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TransitionsKt {
    @NotNull
    /* renamed from: rememberIndicationTransition-FbhrOv8, reason: not valid java name */
    public static final D0<Boolean> m3045rememberIndicationTransitionFbhrOv8(@NotNull o rememberIndicationTransition, long j11, long j12, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        long j13;
        long j14;
        Intrinsics.checkNotNullParameter(rememberIndicationTransition, "$this$rememberIndicationTransition");
        interfaceC3967k.o(2031527787);
        if ((i12 & 1) != 0) {
            b.INSTANCE.getClass();
            j13 = 0;
        } else {
            j13 = j11;
        }
        if ((i12 & 2) != 0) {
            b.INSTANCE.getClass();
            j14 = 0;
        } else {
            j14 = j12;
        }
        interfaceC3967k.o(1264894369);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = n1.f(Boolean.FALSE, D1.f25195a);
            interfaceC3967k.x(C11);
        }
        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(1264896169);
        Object C12 = interfaceC3967k.C();
        if (C12 == InterfaceC3967k.a.a()) {
            C12 = new Y(Boolean.FALSE);
            interfaceC3967k.x(C12);
        }
        Y y11 = (Y) C12;
        interfaceC3967k.k();
        interfaceC3967k.o(1264900415);
        boolean z11 = true;
        boolean F11 = interfaceC3967k.F(y11) | ((((i11 & 112) ^ 48) > 32 && interfaceC3967k.s(j13)) || (i11 & 48) == 32);
        Object C13 = interfaceC3967k.C();
        if (F11 || C13 == InterfaceC3967k.a.a()) {
            Object transitionsKt$rememberIndicationTransition$1$1 = new TransitionsKt$rememberIndicationTransition$1$1(y11, interfaceC3978p0, j13, null);
            interfaceC3967k.x(transitionsKt$rememberIndicationTransition$1$1);
            C13 = transitionsKt$rememberIndicationTransition$1$1;
        }
        interfaceC3967k.k();
        Q.e(interfaceC3967k, rememberIndicationTransition, (Function2) C13);
        interfaceC3967k.o(1264915832);
        boolean z12 = (((i11 & 14) ^ 6) > 4 && interfaceC3967k.n(rememberIndicationTransition)) || (i11 & 6) == 4;
        if ((((i11 & 896) ^ 384) <= 256 || !interfaceC3967k.s(j14)) && (i11 & 384) != 256) {
            z11 = false;
        }
        boolean F12 = z12 | z11 | interfaceC3967k.F(y11);
        Object C14 = interfaceC3967k.C();
        if (F12 || C14 == InterfaceC3967k.a.a()) {
            Object transitionsKt$rememberIndicationTransition$2$1 = new TransitionsKt$rememberIndicationTransition$2$1(rememberIndicationTransition, j14, y11, interfaceC3978p0, null);
            interfaceC3967k.x(transitionsKt$rememberIndicationTransition$2$1);
            C14 = transitionsKt$rememberIndicationTransition$2$1;
        }
        interfaceC3967k.k();
        Q.e(interfaceC3967k, rememberIndicationTransition, (Function2) C14);
        D0<Boolean> h11 = H0.h(y11, interfaceC3967k);
        interfaceC3967k.k();
        return h11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberIndicationTransition_FbhrOv8$lambda$1(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rememberIndicationTransition_FbhrOv8$lambda$2(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }
}
