package ru.ozon.android.messenger.blocks.chatlistheader.search;

import D1.InterfaceC2801g;
import E0.C2942q;
import I0.C3173b;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import android.content.Context;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import m3.C8060b;
import ru.ozon.android.messenger.blocks.chatlistheader.f;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.repository.UniTheme;

/* loaded from: classes10.dex */
final class E extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f84772b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Context f84773c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f84774d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f84775e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ f.c.a f84776f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function1<String, Unit> f84777g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f84778h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f84779i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ List<f.b> f84780j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f84781k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ Function1<f.b, Unit> f84782l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    E(androidx.compose.ui.e eVar, Context context, boolean z11, boolean z12, f.c.a aVar, Function1<? super String, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, List<? extends f.b> list, Function0<Unit> function03, Function1<? super f.b, Unit> function12) {
        super(2);
        this.f84772b = eVar;
        this.f84773c = context;
        this.f84774d = z11;
        this.f84775e = z12;
        this.f84776f = aVar;
        this.f84777g = function1;
        this.f84778h = function0;
        this.f84779i = function02;
        this.f84780j = list;
        this.f84781k = function03;
        this.f84782l = function12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        androidx.compose.ui.e b11;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            interfaceC3967k2.o(-315215069);
            androidx.compose.ui.e e11 = a0.e(this.f84772b, 1.0f);
            Context context = this.f84773c;
            if (ru.ozon.android.messenger.utils.h.b(context)) {
                b11 = androidx.compose.foundation.e.b(androidx.compose.ui.e.f40358c0, UniTheme.INSTANCE.getColors(interfaceC3967k2, UniTheme.$stable).getLayerFloor0(), y0.a());
                e11 = e11.l0(b11);
            }
            interfaceC3967k2.k();
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.i(), interfaceC3967k2, 48);
            int I11 = interfaceC3967k2.I();
            A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(interfaceC3967k2, e11);
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
            Function2 f11 = C3173b.f(interfaceC3967k2, b12, interfaceC3967k2, d11);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(f11, I11, interfaceC3967k2, I11);
            }
            F1.b(interfaceC3967k2, f7, InterfaceC2801g.a.f());
            Function0<Unit> function0 = this.f84778h;
            l0.G.d(this.f84774d, null, null, null, null, a1.c.c(-58335917, new z(context, function0), interfaceC3967k2), interfaceC3967k2, 1572870, 30);
            interfaceC3967k2.o(2113721389);
            e.a aVar = androidx.compose.ui.e.f40358c0;
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            androidx.compose.ui.e layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            boolean z11 = this.f84775e;
            if (!z11) {
                interfaceC3967k2.o(2079715825);
                Function0<Unit> function02 = this.f84781k;
                boolean n11 = interfaceC3967k2.n(function02);
                Object C11 = interfaceC3967k2.C();
                if (n11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new A(function02);
                    interfaceC3967k2.x(C11);
                }
                interfaceC3967k2.k();
                layoutWeightElement = layoutWeightElement.l0(androidx.compose.foundation.i.c(aVar, false, null, null, (Function0) C11, 7));
            }
            interfaceC3967k2.k();
            f.c.a aVar2 = this.f84776f;
            IconDTO g10 = aVar2.g();
            TextDTO f12 = aVar2.f();
            ButtonV3DTO b13 = aVar2.b();
            String obj = aVar2.j().getText().toString();
            Integer h11 = aVar2.h();
            Integer d12 = aVar2.d();
            interfaceC3967k2.o(2113740316);
            Function1<String, Unit> function1 = this.f84777g;
            boolean n12 = interfaceC3967k2.n(function1);
            Object C12 = interfaceC3967k2.C();
            if (n12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new B(function1);
                interfaceC3967k2.x(C12);
            }
            interfaceC3967k2.k();
            x.a(layoutWeightElement, z11, g10, f12, obj, h11, d12, (Function1) C12, function0, this.f84779i, b13, interfaceC3967k2, IconDTO.$stable << 6);
            l0.G.d(!r1.isEmpty(), null, null, null, null, a1.c.c(808569546, new D(this.f84780j, this.f84782l), interfaceC3967k2), interfaceC3967k2, 1572870, 30);
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
