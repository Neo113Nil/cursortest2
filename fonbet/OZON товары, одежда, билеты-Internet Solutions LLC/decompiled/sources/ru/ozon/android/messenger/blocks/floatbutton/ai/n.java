package ru.ozon.android.messenger.blocks.floatbutton.ai;

import D1.InterfaceC2801g;
import I0.C3173b;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.lifecycle.AbstractC5434v;
import e1.InterfaceC6250b;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

/* loaded from: classes10.dex */
final class n extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f85194b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f85195c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ g f85196d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function2<AtomAction, Map<String, TokenizedTrackingInfo>, Unit> f85197e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    n(Function0<Unit> function0, androidx.compose.ui.e eVar, g gVar, Function2<? super AtomAction, ? super Map<String, TokenizedTrackingInfo>, Unit> function2) {
        super(2);
        this.f85194b = function0;
        this.f85195c = eVar;
        this.f85196d = gVar;
        this.f85197e = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            interfaceC3967k2.o(-1381628331);
            Function0<Unit> function0 = this.f85194b;
            boolean n11 = interfaceC3967k2.n(function0);
            Object C11 = interfaceC3967k2.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new i(function0);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            e3.i.a(aVar, null, (Function0) C11, interfaceC3967k2, 6);
            Y b11 = X.b(C5179b.c(), InterfaceC6250b.a.i(), interfaceC3967k2, 54);
            int I11 = interfaceC3967k2.I();
            A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(interfaceC3967k2, this.f85195c);
            InterfaceC2801g.f5440U.getClass();
            Function0 a11 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a11);
            } else {
                interfaceC3967k2.e();
            }
            Function2 f11 = C3173b.f(interfaceC3967k2, b11, interfaceC3967k2, d11);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(f11, I11, interfaceC3967k2, I11);
            }
            F1.b(interfaceC3967k2, f7, InterfaceC2801g.a.f());
            g gVar = this.f85196d;
            ButtonV3DTO a12 = gVar.a();
            interfaceC3967k2.o(-1923387414);
            Function2<AtomAction, Map<String, TokenizedTrackingInfo>, Unit> function2 = this.f85197e;
            if (a12 != null) {
                q.c(null, Intrinsics.d(gVar.b(), Boolean.TRUE), A0.h.e(), a1.c.c(976034254, new k(function2, a12), interfaceC3967k2), interfaceC3967k2, 3072);
                ru.ozon.android.messenger.framework.presentation.common.utils.a.b(70, interfaceC3967k2);
            }
            interfaceC3967k2.k();
            q.c(null, Intrinsics.d(gVar.b(), Boolean.TRUE), A0.h.e(), a1.c.c(1950052761, new m(function2, gVar), interfaceC3967k2), interfaceC3967k2, 3072);
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
