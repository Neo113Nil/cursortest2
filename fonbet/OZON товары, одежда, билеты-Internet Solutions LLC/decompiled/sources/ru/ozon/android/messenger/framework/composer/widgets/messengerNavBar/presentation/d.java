package ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.presentation;

import Bl0.C2652m;
import D1.InterfaceC2801g;
import E0.C2942q;
import Fr.g;
import I0.C3173b;
import J0.P;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import WZ.l;
import a1.C4912a;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import b00.f;
import e1.InterfaceC6250b;
import e1.d;
import i1.C6988h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import l1.y0;
import l10.InterfaceC7851b;
import m3.C8060b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data.StatusWidgetDTO;
import ru.ozon.android.messenger.framework.composer.action.b;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.models.UniColorToken;

/* loaded from: classes10.dex */
public final class d {

    static final class a extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f87014b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f87015c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f87016d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ru.ozon.android.messenger.framework.composer.navigation.router.a aVar, e eVar, float f7) {
            super(2);
            this.f87014b = aVar;
            this.f87015c = eVar;
            this.f87016d = f7;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            h<Unit> b11;
            ru.ozon.android.messenger.framework.composer.navigation.router.a aVar;
            int i11;
            float f7;
            e eVar;
            InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
            if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
                interfaceC3967k2.j();
            } else {
                d.b i12 = InterfaceC6250b.a.i();
                e.a aVar2 = androidx.compose.ui.e.f40358c0;
                Y b12 = X.b(C5179b.f(), i12, interfaceC3967k2, 48);
                int I11 = interfaceC3967k2.I();
                A0 d11 = interfaceC3967k2.d();
                androidx.compose.ui.e f11 = androidx.compose.ui.c.f(interfaceC3967k2, aVar2);
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
                Function2 f12 = C3173b.f(interfaceC3967k2, b12, interfaceC3967k2, d11);
                if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                    Nk.a.d(f12, I11, interfaceC3967k2, I11);
                }
                Ek.a.g(f11, interfaceC3967k2, 504370002);
                ru.ozon.android.messenger.framework.composer.navigation.router.a aVar3 = this.f87014b;
                if (aVar3 == null) {
                    b11 = null;
                } else {
                    b.a aVar4 = new b.a((InterfaceC7851b) interfaceC3967k2.m(f.c()), aVar3);
                    aVar4.a((l) interfaceC3967k2.m(f.e()));
                    b11 = aVar4.b();
                }
                interfaceC3967k2.k();
                e eVar2 = this.f87015c;
                IconButtonV3DTO c11 = eVar2.c();
                float f13 = this.f87016d;
                if (c11 != null) {
                    interfaceC3967k2.o(-1543998786);
                    IconButtonV3DTO c12 = eVar2.c();
                    f7 = f13;
                    androidx.compose.ui.e j11 = T.j(aVar2, f7, 0.0f, 0.0f, 0.0f, 14);
                    interfaceC3967k2.o(504389501);
                    boolean n11 = interfaceC3967k2.n(eVar2) | interfaceC3967k2.n(b11);
                    Object C11 = interfaceC3967k2.C();
                    if (n11 || C11 == InterfaceC3967k.a.a()) {
                        C11 = new ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.presentation.b(eVar2, b11);
                        interfaceC3967k2.x(C11);
                    }
                    interfaceC3967k2.k();
                    aVar = aVar3;
                    eVar = eVar2;
                    i11 = 0;
                    DsIconButtonAtomKt.DsIconButtonAtom(c12, j11, false, (Function1) C11, interfaceC3967k2, IconButtonV3DTO.$stable | 48, 4);
                    interfaceC3967k2.k();
                } else {
                    aVar = aVar3;
                    i11 = 0;
                    f7 = f13;
                    eVar = eVar2;
                    if (eVar.d() != null) {
                        interfaceC3967k2.o(-1543480032);
                        ru.ozon.android.messenger.framework.presentation.common.utils.a.b((eVar.d().getSize() != null ? r1.getSize() : 0) + f7, interfaceC3967k2);
                        interfaceC3967k2.k();
                    } else {
                        interfaceC3967k2.o(-1543342609);
                        interfaceC3967k2.k();
                    }
                }
                androidx.compose.ui.e h11 = T.h(aVar2, 8, 0.0f, 2);
                if (1.0f <= 0.0d) {
                    throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
                }
                androidx.compose.ui.e u11 = a0.u(h11.l0(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), 3);
                C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), interfaceC3967k2, i11);
                int I12 = interfaceC3967k2.I();
                A0 d12 = interfaceC3967k2.d();
                androidx.compose.ui.e f14 = androidx.compose.ui.c.f(interfaceC3967k2, u11);
                Function0 a13 = InterfaceC2801g.a.a();
                if (interfaceC3967k2.v() == null) {
                    C8060b.c();
                    throw null;
                }
                interfaceC3967k2.i();
                if (interfaceC3967k2.t()) {
                    interfaceC3967k2.H(a13);
                } else {
                    interfaceC3967k2.e();
                }
                Function2 c13 = P.c(interfaceC3967k2, a12, interfaceC3967k2, d12);
                if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I12))) {
                    Nk.a.d(c13, I12, interfaceC3967k2, I12);
                }
                F1.b(interfaceC3967k2, f14, InterfaceC2801g.a.f());
                DsTextAtomKt.DsTextAtom(TextDTO.copy$default(eVar.f(), OzonSpannableStringKt.toOzonSpannableString(String.valueOf(eVar.f().getText())), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), new HorizontalAlignElement(InterfaceC6250b.a.g()), interfaceC3967k2, i11, i11);
                TextDTO e11 = eVar.e();
                interfaceC3967k2.o(919111699);
                if (e11 != null) {
                    DsTextAtomKt.DsTextAtom(eVar.e(), new HorizontalAlignElement(InterfaceC6250b.a.g()), interfaceC3967k2, i11, i11);
                    Unit unit = Unit.f71690a;
                }
                interfaceC3967k2.k();
                interfaceC3967k2.f();
                if (eVar.d() != null) {
                    interfaceC3967k2.o(-1542485831);
                    IconButtonV3DTO d13 = eVar.d();
                    e eVar3 = eVar;
                    ru.ozon.android.messenger.framework.composer.navigation.router.a aVar5 = aVar;
                    androidx.compose.ui.e j12 = T.j(aVar2, 0.0f, 0.0f, f7, 0.0f, 11);
                    interfaceC3967k2.o(504438275);
                    boolean n12 = interfaceC3967k2.n(eVar3) | interfaceC3967k2.F(aVar5);
                    Object C12 = interfaceC3967k2.C();
                    if (n12 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new c(eVar3, aVar5);
                        interfaceC3967k2.x(C12);
                    }
                    interfaceC3967k2.k();
                    DsIconButtonAtomKt.DsIconButtonAtom(d13, j12, false, (Function1) C12, interfaceC3967k2, IconButtonV3DTO.$stable | 48, 4);
                    interfaceC3967k2.k();
                } else {
                    e eVar4 = eVar;
                    if (eVar4.c() != null) {
                        interfaceC3967k2.o(-1541840287);
                        ru.ozon.android.messenger.framework.presentation.common.utils.a.b((eVar4.c().getSize() != null ? r1.getSize() : i11) + f7, interfaceC3967k2);
                        interfaceC3967k2.k();
                    } else {
                        interfaceC3967k2.o(-1541703825);
                        interfaceC3967k2.k();
                    }
                }
                interfaceC3967k2.f();
            }
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f87017b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.composer.navigation.router.a f87018c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f87019d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e eVar, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar, int i11) {
            super(2);
            this.f87017b = eVar;
            this.f87018c = aVar;
            this.f87019d = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f87019d | 1);
            d.a(this.f87017b, this.f87018c, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    public static final void a(@NotNull e state, ru.ozon.android.messenger.framework.composer.navigation.router.a aVar, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        androidx.compose.ui.e b11;
        Intrinsics.checkNotNullParameter(state, "state");
        C3969l u11 = interfaceC3967k.u(1533541376);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(aVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            C4912a c4912a = ru.ozon.android.messenger.framework.composer.widgets.messengerNavBar.presentation.a.f87008a;
            C4912a c11 = a1.c.c(-901392183, new a(aVar, state, 6), u11);
            String backgroundColor = state.a();
            if (backgroundColor == null) {
                backgroundColor = StatusWidgetDTO.DEFAULT_BACKGROUND_COLOR;
            }
            Z1.h a11 = state.b() != null ? Z1.h.a(r4.getPx()) : null;
            Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
            u11.o(559894811);
            e.a aVar2 = androidx.compose.ui.e.f40358c0;
            float f7 = 8;
            androidx.compose.ui.e e11 = a0.e(Q1.a(aVar2, "tab_bar_column"), 1.0f);
            if (a11 != null) {
                float d11 = a11.d();
                e11 = e11.l0(C6988h.a(aVar2, A0.h.d(0.0f, 0.0f, d11, d11, 3)));
            }
            b11 = androidx.compose.foundation.e.b(e11, UniCompositionLocalKt.getThemedColor(new UniColorToken(backgroundColor), u11, UniColorToken.$stable), y0.a());
            C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d12 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, b11);
            Function0 a13 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a12, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            ru.ozon.android.messenger.framework.presentation.common.utils.a.a(f7, u11);
            u11.o(-2109649789);
            c4912a.invoke(u11, 6);
            u11.k();
            u11.o(-2109648471);
            c11.invoke(u11, 6);
            u11.k();
            ru.ozon.android.messenger.framework.presentation.common.utils.a.a(f7, u11);
            u11.f();
            u11.k();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new b(state, aVar, i11));
        }
    }
}
