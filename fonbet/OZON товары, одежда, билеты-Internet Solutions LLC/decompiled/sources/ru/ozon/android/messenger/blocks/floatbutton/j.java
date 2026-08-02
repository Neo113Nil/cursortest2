package ru.ozon.android.messenger.blocks.floatbutton;

import D1.InterfaceC2801g;
import I0.C3173b;
import S0.A0;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import S0.n1;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import e1.InterfaceC6250b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.G;
import l1.C7807Z;
import m3.C8060b;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.models.UniColorToken;
import ru.ozon.uni.core.repository.UniTheme;

/* loaded from: classes10.dex */
final class j extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f85227b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Integer f85228c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ TextDTO f85229d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f85230e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f85231f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ IconDTO f85232g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(String str, Integer num, TextDTO textDTO, androidx.compose.ui.e eVar, Function0<Unit> function0, IconDTO iconDTO) {
        super(2);
        this.f85227b = str;
        this.f85228c = num;
        this.f85229d = textDTO;
        this.f85230e = eVar;
        this.f85231f = function0;
        this.f85232g = iconDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            interfaceC3967k2.o(-66881761);
            Object C11 = interfaceC3967k2.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(Boolean.FALSE, D1.f25195a);
                interfaceC3967k2.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
            interfaceC3967k2.k();
            float f7 = ((Boolean) interfaceC3978p0.getValue()).booleanValue() ? 16 : 10;
            float f11 = ((Boolean) interfaceC3978p0.getValue()).booleanValue() ? 8 : 10;
            interfaceC3967k2.o(-66874462);
            String str = this.f85227b;
            C7807Z m11 = str == null ? null : C7807Z.m(UniCompositionLocalKt.getThemedColor(new UniColorToken(str), interfaceC3967k2, UniColorToken.$stable));
            interfaceC3967k2.k();
            interfaceC3967k2.o(-66875341);
            long layerFloor1Inverted = m11 == null ? UniTheme.INSTANCE.getColors(interfaceC3967k2, UniTheme.$stable).getLayerFloor1Inverted() : m11.w();
            interfaceC3967k2.k();
            Integer num2 = this.f85228c;
            int intValue = num2 != null ? num2.intValue() : 100;
            interfaceC3967k2.o(-66868948);
            TextDTO textDTO = this.f85229d;
            if (textDTO != null) {
                Unit unit = Unit.f71690a;
                interfaceC3967k2.o(-1951642534);
                Object C12 = interfaceC3967k2.C();
                if (C12 == InterfaceC3967k.a.a()) {
                    C12 = new h(interfaceC3978p0, null);
                    interfaceC3967k2.x(C12);
                }
                interfaceC3967k2.k();
                Q.e(interfaceC3967k2, unit, (Function2) C12);
            }
            interfaceC3967k2.k();
            androidx.compose.ui.e c11 = androidx.compose.foundation.i.c(androidx.compose.foundation.e.b(this.f85230e, layerFloor1Inverted, A0.h.b(intValue)), false, null, null, this.f85231f, 7);
            Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.i(), interfaceC3967k2, 48);
            int I11 = interfaceC3967k2.I();
            A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f12 = androidx.compose.ui.c.f(interfaceC3967k2, c11);
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
            Function2 f13 = C3173b.f(interfaceC3967k2, b11, interfaceC3967k2, d11);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(f13, I11, interfaceC3967k2, I11);
            }
            Ek.a.g(f12, interfaceC3967k2, -1951625859);
            IconDTO iconDTO = this.f85232g;
            if (iconDTO != null) {
                float f14 = 10;
                DsIconAtomKt.DsIconAtom(iconDTO, T.i(androidx.compose.ui.e.f40358c0, f7, f14, f11, f14), interfaceC3967k2, IconDTO.$stable, 0);
            }
            interfaceC3967k2.k();
            interfaceC3967k2.o(-1951612838);
            if (textDTO != null) {
                G.d(((Boolean) interfaceC3978p0.getValue()).booleanValue(), null, null, null, null, a1.c.c(-648222128, new i(textDTO), interfaceC3967k2), interfaceC3967k2, 1572870, 30);
            }
            interfaceC3967k2.k();
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
