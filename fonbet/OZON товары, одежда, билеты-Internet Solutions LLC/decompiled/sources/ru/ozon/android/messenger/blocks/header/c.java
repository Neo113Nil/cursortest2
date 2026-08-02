package ru.ozon.android.messenger.blocks.header;

import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.icon.IconDTO;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e.a f85246b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f85247c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ float f85248d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ float f85249e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f85250f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f85251g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ float f85252h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ IconDTO f85253i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ float f85254j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ float f85255k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ float f85256l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Icon f85257m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f85258n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(e.a aVar, float f7, float f11, float f12, float f13, long j11, float f14, IconDTO iconDTO, float f15, float f16, float f17, Icon icon, String str) {
        super(2);
        this.f85246b = aVar;
        this.f85247c = f7;
        this.f85248d = f11;
        this.f85249e = f12;
        this.f85250f = f13;
        this.f85251g = j11;
        this.f85252h = f14;
        this.f85253i = iconDTO;
        this.f85254j = f15;
        this.f85255k = f16;
        this.f85256l = f17;
        this.f85257m = icon;
        this.f85258n = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            e.a aVar = this.f85246b;
            float f7 = this.f85247c;
            androidx.compose.ui.e n11 = a0.n(aVar, f7);
            V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = interfaceC3967k2.I();
            A0 d11 = interfaceC3967k2.d();
            androidx.compose.ui.e f12 = androidx.compose.ui.c.f(interfaceC3967k2, n11);
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
            Function2 d12 = C2454a.d(interfaceC3967k2, f11, interfaceC3967k2, d11);
            if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I11))) {
                Nk.a.d(d12, I11, interfaceC3967k2, I11);
            }
            F1.b(interfaceC3967k2, f12, InterfaceC2801g.a.f());
            androidx.compose.ui.e n12 = a0.n(androidx.compose.ui.e.f40358c0, f7);
            interfaceC3967k2.o(-1799526704);
            Object C11 = interfaceC3967k2.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = a.f85241b;
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            androidx.compose.ui.e a12 = androidx.compose.ui.graphics.a.a(n12, (Function1) C11);
            interfaceC3967k2.o(-1799520787);
            float f13 = this.f85248d;
            boolean q11 = interfaceC3967k2.q(f13);
            float f14 = this.f85249e;
            boolean q12 = q11 | interfaceC3967k2.q(f14);
            float f15 = this.f85250f;
            boolean q13 = q12 | interfaceC3967k2.q(f15);
            long j11 = this.f85251g;
            boolean s11 = q13 | interfaceC3967k2.s(j11);
            Object C12 = interfaceC3967k2.C();
            if (s11 || C12 == InterfaceC3967k.a.a()) {
                b bVar = new b(f14, j11, f13, f15);
                interfaceC3967k2.x(bVar);
                C12 = bVar;
            }
            interfaceC3967k2.k();
            DsIconAtomKt.DsIconAtom(this.f85253i, C6988h.a(androidx.compose.ui.draw.c.d(a12, (Function1) C12), A0.h.b(this.f85252h)), interfaceC3967k2, IconDTO.$stable, 0);
            int i11 = 6 | (Icon.$stable << 12);
            f.b(this.f85254j, this.f85255k, this.f85256l, this.f85257m, this.f85258n, interfaceC3967k2, i11);
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
