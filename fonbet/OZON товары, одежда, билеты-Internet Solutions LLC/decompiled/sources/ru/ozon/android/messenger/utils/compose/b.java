package ru.ozon.android.messenger.utils.compose;

import B1.B;
import B1.C;
import S0.InterfaceC3978p0;
import k1.C7460f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function1<B, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f91862b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f91863c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(Function0<Unit> function0, InterfaceC3978p0<Boolean> interfaceC3978p0) {
        super(1);
        this.f91862b = function0;
        this.f91863c = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(B b11) {
        B layoutCoordinates = b11;
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        B w11 = layoutCoordinates.w();
        if (w11 != null) {
            float h11 = C.a(w11).h();
            C7460f a11 = C.a(layoutCoordinates);
            boolean z11 = a11.q() >= 0.0f && a11.h() <= h11;
            InterfaceC3978p0<Boolean> interfaceC3978p0 = this.f91863c;
            if (z11 && !interfaceC3978p0.getValue().booleanValue()) {
                this.f91862b.invoke();
            }
            interfaceC3978p0.setValue(Boolean.valueOf(z11));
        }
        return Unit.f71690a;
    }
}
