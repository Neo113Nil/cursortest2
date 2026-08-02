package ru.ozon.android.messenger.blocks.chat.search;

import D1.InterfaceC2801g;
import I0.C3173b;
import J0.P;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import u0.EnumC9909s;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f84585b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ IconDTO f84586c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ float f84587d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ List<BadgeDTO> f84588e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ TextDTO f84589f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ TextDTO f84590g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ List<Icon> f84591h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ TextDTO f84592i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ TextDTO f84593j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(androidx.compose.ui.e eVar, IconDTO iconDTO, float f7, List<BadgeDTO> list, TextDTO textDTO, TextDTO textDTO2, List<Icon> list2, TextDTO textDTO3, TextDTO textDTO4) {
        super(2);
        this.f84585b = eVar;
        this.f84586c = iconDTO;
        this.f84587d = f7;
        this.f84588e = list;
        this.f84589f = textDTO;
        this.f84590g = textDTO2;
        this.f84591h = list2;
        this.f84592i = textDTO3;
        this.f84593j = textDTO4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            androidx.compose.ui.e h11 = T.h(M.a(this.f84585b, EnumC9909s.Min), 16, 0.0f, 2);
            Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.l(), interfaceC3967k2, 0);
            int I11 = interfaceC3967k2.I();
            A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(interfaceC3967k2, h11);
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
            Ek.a.g(f7, interfaceC3967k2, 783055481);
            IconDTO iconDTO = this.f84586c;
            if (iconDTO != null) {
                float f12 = 11;
                DsIconAtomKt.DsIconAtom(iconDTO, T.j(androidx.compose.ui.e.f40358c0, 0.0f, f12, 12, f12, 1), interfaceC3967k2, IconDTO.$stable, 0);
                Unit unit = Unit.f71690a;
            }
            interfaceC3967k2.k();
            e.a aVar = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e h12 = T.h(aVar, 0.0f, this.f84587d, 1);
            C5194q a12 = C5193p.a(C5179b.n(2), InterfaceC6250b.a.k(), interfaceC3967k2, 6);
            int I12 = interfaceC3967k2.I();
            A0 d12 = interfaceC3967k2.d();
            androidx.compose.ui.e f13 = androidx.compose.ui.c.f(interfaceC3967k2, h12);
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
            Function2 c11 = P.c(interfaceC3967k2, a12, interfaceC3967k2, d12);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I12))) {
                Nk.a.d(c11, I12, interfaceC3967k2, I12);
            }
            Ek.a.g(f13, interfaceC3967k2, -1359789391);
            List<BadgeDTO> list = this.f84588e;
            TextDTO textDTO = this.f84589f;
            if (list != null || textDTO != null) {
                g.b(null, list, textDTO, interfaceC3967k2, 0);
            }
            interfaceC3967k2.k();
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.i(), interfaceC3967k2, 48);
            int I13 = interfaceC3967k2.I();
            A0 d13 = interfaceC3967k2.d();
            androidx.compose.ui.e f14 = androidx.compose.ui.c.f(interfaceC3967k2, aVar);
            Function0 a14 = InterfaceC2801g.a.a();
            if (interfaceC3967k2.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k2.i();
            if (interfaceC3967k2.t()) {
                interfaceC3967k2.H(a14);
            } else {
                interfaceC3967k2.e();
            }
            Function2 f15 = C3173b.f(interfaceC3967k2, b12, interfaceC3967k2, d13);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I13))) {
                Nk.a.d(f15, I13, interfaceC3967k2, I13);
            }
            F1.b(interfaceC3967k2, f14, InterfaceC2801g.a.f());
            TextDTO textDTO2 = this.f84593j;
            List<Icon> list2 = this.f84591h;
            TextDTO textDTO3 = this.f84592i;
            if (list2 != null) {
                interfaceC3967k2.o(-1907720376);
                g.d(null, textDTO3, textDTO2, list2, interfaceC3967k2, Icon.$stable << 9);
                interfaceC3967k2.k();
            } else {
                interfaceC3967k2.o(-1907488062);
                g.c(null, textDTO3, textDTO2, interfaceC3967k2, 0);
                interfaceC3967k2.k();
            }
            interfaceC3967k2.f();
            DsTextAtomKt.DsTextAtom(this.f84590g, null, interfaceC3967k2, 0, 2);
            interfaceC3967k2.f();
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
