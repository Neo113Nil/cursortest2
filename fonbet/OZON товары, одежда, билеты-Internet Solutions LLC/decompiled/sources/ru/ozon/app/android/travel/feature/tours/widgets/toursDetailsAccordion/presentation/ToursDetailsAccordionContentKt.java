package ru.ozon.app.android.travel.feature.tours.widgets.toursDetailsAccordion.presentation;

import A0.h;
import D1.InterfaceC2801g;
import E0.C2942q;
import Fr.g;
import K00.b;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import WZ.l;
import a1.C4912a;
import android.content.Context;
import androidx.compose.animation.a;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.B;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b00.f;
import e1.InterfaceC6250b;
import i1.C6988h;
import i1.C6994n;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7811b0;
import l1.y0;
import l10.InterfaceC7851b;
import m0.C7990g;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.widgets.toursDetailsAccordion.presentation.ToursDetailsAccordionVI;
import ru.ozon.app.android.travel.utils.extensions.ComposeColorKt;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;
import u0.E;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/presentation/ToursDetailsAccordionVI;", "state", "", "ToursDetailsAccordionContent", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursDetailsAccordion/presentation/ToursDetailsAccordionVI;LS0/k;I)V", "", "isExpanded", "", "iconRotation", "tours_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToursDetailsAccordionContentKt {
    public static final void ToursDetailsAccordionContent(@NotNull ToursDetailsAccordionVI state, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        float f7;
        boolean z11;
        l lVar;
        Object toursDetailsAccordionContentKt$ToursDetailsAccordionContent$1$1;
        int i13;
        InterfaceC3978p0 interfaceC3978p0;
        ToursDetailsAccordionVI toursDetailsAccordionVI;
        e b11;
        Context context;
        C3969l c3969l;
        C3969l c3969l2;
        Context context2;
        int i14;
        int i15;
        float f11;
        e eVar;
        e b12;
        Intrinsics.checkNotNullParameter(state, "state");
        C3969l u11 = interfaceC3967k.u(863191346);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && u11.b()) {
            u11.j();
            toursDetailsAccordionVI = state;
        } else {
            Context context3 = (Context) u11.m(AndroidCompositionLocals_androidKt.d());
            l lVar2 = (l) u11.m(f.e());
            InterfaceC7851b interfaceC7851b = (InterfaceC7851b) u11.m(f.c());
            u11.o(-1202592984);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = n1.f(Boolean.FALSE, D1.f25195a);
                u11.x(C11);
            }
            InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C11;
            u11.k();
            if (ToursDetailsAccordionContent$lambda$1(interfaceC3978p02)) {
                f7 = 180.0f;
                z11 = false;
            } else {
                f7 = 0.0f;
                z11 = false;
            }
            A1 b13 = C7990g.b(f7, null, null, u11, 0, 30);
            Boolean valueOf = Boolean.valueOf(ToursDetailsAccordionContent$lambda$1(interfaceC3978p02));
            u11.o(-1202587289);
            boolean F11 = u11.F(interfaceC7851b) | u11.F(context3) | u11.F(state) | u11.F(lVar2);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                lVar = lVar2;
                i13 = 3;
                interfaceC3978p0 = interfaceC3978p02;
                toursDetailsAccordionContentKt$ToursDetailsAccordionContent$1$1 = new ToursDetailsAccordionContentKt$ToursDetailsAccordionContent$1$1(interfaceC7851b, context3, state, lVar, interfaceC3978p0, null);
                toursDetailsAccordionVI = state;
                u11.x(toursDetailsAccordionContentKt$ToursDetailsAccordionContent$1$1);
            } else {
                toursDetailsAccordionVI = state;
                interfaceC3978p0 = interfaceC3978p02;
                lVar = lVar2;
                toursDetailsAccordionContentKt$ToursDetailsAccordionContent$1$1 = C12;
                i13 = 3;
            }
            u11.k();
            Q.e(u11, valueOf, (Function2) toursDetailsAccordionContentKt$ToursDetailsAccordionContent$1$1);
            e.a aVar = e.f40358c0;
            e e11 = a0.e(aVar, 1.0f);
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            b11 = androidx.compose.foundation.e.b(C6988h.a(e11, h.b(dsSpacings.m1850getDp24D9Ej5fM())), ComposeColorKt.composeColor(UniColors.LAYER_FLOOR_1, u11, 6), y0.a());
            e a11 = a.a(b11, null, i13);
            C5194q a12 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = c.f(u11, a11);
            Function0 a13 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            e e12 = a0.e(aVar, 1.0f);
            u11.o(1087415163);
            boolean F12 = u11.F(toursDetailsAccordionVI) | u11.F(lVar);
            Object C13 = u11.C();
            if (F12 || C13 == InterfaceC3967k.a.a()) {
                C13 = new ToursDetailsAccordionContentKt$ToursDetailsAccordionContent$2$1$1(toursDetailsAccordionVI, lVar, interfaceC3978p0);
                u11.x(C13);
            }
            u11.k();
            e f13 = T.f(i.c(e12, false, null, null, (Function0) C13, 7), dsSpacings.m1845getDp16D9Ej5fM());
            Y b14 = X.b(C5179b.d(), InterfaceC6250b.a.i(), u11, 54);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f14 = c.f(u11, f13);
            Function0 a14 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b14, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, h11);
            }
            F1.b(u11, f14, InterfaceC2801g.a.f());
            TextDTO title = toursDetailsAccordionVI.getTitle();
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
            }
            DsTextAtomKt.DsTextAtom(title, new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), u11, 0, 0);
            DsIconAtomKt.DsIconAtom(toursDetailsAccordionVI.getIcon(), C6994n.a(aVar, ToursDetailsAccordionContent$lambda$3(b13)), u11, IconDTO.$stable, 0);
            u11.f();
            u11.o(1087435787);
            if (ToursDetailsAccordionContent$lambda$1(interfaceC3978p0)) {
                e j11 = T.j(T.h(a0.e(aVar, 1.0f), dsSpacings.m1845getDp16D9Ej5fM(), 0.0f, 2), 0.0f, 0.0f, 0.0f, dsSpacings.m1845getDp16D9Ej5fM(), 7);
                C5194q a15 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                int I13 = u11.I();
                A0 d13 = u11.d();
                e f15 = c.f(u11, j11);
                Function0 a16 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a16);
                } else {
                    u11.e();
                }
                Function2 g11 = b.g(u11, a15, u11, d13);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                    Ep.a.d(I13, u11, I13, g11);
                }
                F1.b(u11, f15, InterfaceC2801g.a.f());
                ToursDetailsAccordionVI.ContentVO content = toursDetailsAccordionVI.getContent();
                CellDTO cell = content.getCell();
                u11.o(-1693522821);
                if (cell == null) {
                    context = context3;
                    c3969l = u11;
                } else {
                    context = context3;
                    c3969l = u11;
                    DsCellAtomKt.DsCellAtom(cell, a0.e(aVar, 1.0f), null, c3969l, CellDTO.$stable | 48, 4);
                    E.a(c3969l, a0.f(aVar, dsSpacings.m1861getDp8D9Ej5fM()));
                    Unit unit = Unit.f71690a;
                }
                c3969l.k();
                c3969l.o(-1693514013);
                if (content.getInBadgesVisible()) {
                    List<BadgeDTO> badges = content.getBadges();
                    context2 = context;
                    f11 = 1.0f;
                    e e13 = a0.e(aVar, 1.0f);
                    C5179b.i n11 = C5179b.n(dsSpacings.m1854getDp4D9Ej5fM());
                    C5179b.i n12 = C5179b.n(dsSpacings.m1854getDp4D9Ej5fM());
                    C4912a c11 = a1.c.c(61730983, new ToursDetailsAccordionContentKt$ToursDetailsAccordionContent$2$3$2$1(badges), c3969l);
                    i14 = 0;
                    i15 = 2;
                    C3969l c3969l3 = c3969l;
                    eVar = null;
                    B.a(e13, n11, n12, 0, 0, null, c11, c3969l3, 1572870, 56);
                    c3969l2 = c3969l3;
                    Unit unit2 = Unit.f71690a;
                } else {
                    c3969l2 = c3969l;
                    context2 = context;
                    i14 = 0;
                    i15 = 2;
                    f11 = 1.0f;
                    eVar = null;
                }
                c3969l2.k();
                ToursDetailsAccordionVI.CellBlockVO cellBlock = content.getCellBlock();
                c3969l2.o(-1693494209);
                if (cellBlock == null) {
                    toursDetailsAccordionVI = state;
                    u11 = c3969l2;
                } else {
                    TextDTO title2 = cellBlock.getTitle();
                    c3969l2.o(-1693493314);
                    if (title2 != null) {
                        DsTextAtomKt.DsTextAtom(title2, eVar, c3969l2, i14, i15);
                        E.a(c3969l2, a0.f(aVar, dsSpacings.m1861getDp8D9Ej5fM()));
                        Unit unit3 = Unit.f71690a;
                    }
                    c3969l2.k();
                    b12 = androidx.compose.foundation.e.b(C6988h.a(a0.e(aVar, f11), h.b(cellBlock.getCornerRadius().m1866getDpD9Ej5fM())), C7811b0.b(StyleParser.INSTANCE.parseColor(context2, cellBlock.getBackgroundColor(), UniColors.LAYER_FLOOR_0.getResId())), y0.a());
                    C5194q a17 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), c3969l2, i14);
                    int I14 = c3969l2.I();
                    A0 d14 = c3969l2.d();
                    e f16 = c.f(c3969l2, b12);
                    Function0 a18 = InterfaceC2801g.a.a();
                    c3969l2.i();
                    if (c3969l2.t()) {
                        c3969l2.H(a18);
                    } else {
                        c3969l2.e();
                    }
                    Function2 g12 = b.g(c3969l2, a17, c3969l2, d14);
                    if (c3969l2.t() || !Intrinsics.d(c3969l2.C(), Integer.valueOf(I14))) {
                        Ep.a.d(I14, c3969l2, I14, g12);
                    }
                    F1.b(c3969l2, f16, InterfaceC2801g.a.f());
                    c3969l2.o(914404582);
                    Iterator<T> it = cellBlock.getCells().iterator();
                    while (it.hasNext()) {
                        DsCellAtomKt.DsCellAtom((CellDTO) it.next(), null, null, c3969l2, CellDTO.$stable, 6);
                    }
                    toursDetailsAccordionVI = state;
                    u11 = c3969l2;
                    u11.k();
                    u11.f();
                    Unit unit4 = Unit.f71690a;
                }
                u11.k();
                u11.f();
            } else {
                u11 = u11;
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new ToursDetailsAccordionContentKt$ToursDetailsAccordionContent$3(toursDetailsAccordionVI, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ToursDetailsAccordionContent$lambda$1(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ToursDetailsAccordionContent$lambda$2(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }

    private static final float ToursDetailsAccordionContent$lambda$3(A1<Float> a12) {
        return a12.getValue().floatValue();
    }
}
