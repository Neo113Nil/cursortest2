package ru.ozon.android.messenger.blocks.header;

import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.P;
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
import ru.ozon.android.messenger.blocks.header.ChatHeaderDTO;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;

/* loaded from: classes10.dex */
final class i extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e.a f85283b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f85284c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ChatHeaderDTO.a f85285d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f85286e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f85287f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ float f85288g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ float f85289h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ float f85290i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ float f85291j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ float f85292k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ IconDTO f85293l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ float f85294m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ float f85295n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ float f85296o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ long f85297p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(e.a aVar, float f7, ChatHeaderDTO.a aVar2, long j11, float f11, float f12, float f13, float f14, float f15, float f16, IconDTO iconDTO, float f17, float f18, float f19, long j12) {
        super(2);
        this.f85283b = aVar;
        this.f85284c = f7;
        this.f85285d = aVar2;
        this.f85286e = j11;
        this.f85287f = f11;
        this.f85288g = f12;
        this.f85289h = f13;
        this.f85290i = f14;
        this.f85291j = f15;
        this.f85292k = f16;
        this.f85293l = iconDTO;
        this.f85294m = f17;
        this.f85295n = f18;
        this.f85296o = f19;
        this.f85297p = j12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            e.a aVar = this.f85283b;
            float f7 = this.f85284c;
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
            C5187j c5187j = C5187j.f39515a;
            boolean z11 = this.f85285d == ChatHeaderDTO.a.ONLINE;
            e.a aVar2 = androidx.compose.ui.e.f40358c0;
            androidx.compose.ui.e n12 = a0.n(aVar2, f7);
            interfaceC3967k2.o(2124726597);
            Object C11 = interfaceC3967k2.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = g.f85275b;
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            androidx.compose.ui.e a12 = androidx.compose.ui.graphics.a.a(n12, (Function1) C11);
            interfaceC3967k2.o(2124730387);
            long j11 = this.f85286e;
            boolean s11 = interfaceC3967k2.s(j11);
            float f13 = this.f85287f;
            boolean q11 = s11 | interfaceC3967k2.q(f13) | interfaceC3967k2.p(z11);
            float f14 = this.f85288g;
            boolean q12 = q11 | interfaceC3967k2.q(f14);
            float f15 = this.f85289h;
            boolean q13 = q12 | interfaceC3967k2.q(f15);
            float f16 = this.f85290i;
            boolean q14 = q13 | interfaceC3967k2.q(f16);
            float f17 = this.f85291j;
            boolean q15 = q14 | interfaceC3967k2.q(f17);
            Object C12 = interfaceC3967k2.C();
            if (q15 || C12 == InterfaceC3967k.a.a()) {
                h hVar = new h(j11, f13, z11, f14, f15, f16, f17);
                interfaceC3967k2.x(hVar);
                C12 = hVar;
            }
            interfaceC3967k2.k();
            DsIconAtomKt.DsIconAtom(this.f85293l, C6988h.a(androidx.compose.ui.draw.c.d(a12, (Function1) C12), A0.h.b(this.f85292k)), interfaceC3967k2, IconDTO.$stable, 0);
            interfaceC3967k2.o(2124761487);
            if (z11) {
                C5185h.a(androidx.compose.foundation.e.b(P.c(c5187j.a(a0.n(aVar2, this.f85294m), InterfaceC6250b.a.c()), 0.0f, (-this.f85295n) - this.f85296o, 1), this.f85297p, A0.h.e()), interfaceC3967k2, 0);
            }
            interfaceC3967k2.k();
            interfaceC3967k2.f();
        }
        return Unit.f71690a;
    }
}
