package ru.ozon.android.messenger.blocks.chatlistheader.search;

import D1.InterfaceC2801g;
import I0.C3173b;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l0.H;
import m3.C8060b;
import ru.ozon.android.messenger.blocks.chatlistheader.f;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;

/* loaded from: classes10.dex */
final class D extends AbstractC7737t implements InterfaceC6511n<H, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List<f.b> f84770b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<f.b, Unit> f84771c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    D(List<? extends f.b> list, Function1<? super f.b, Unit> function1) {
        super(3);
        this.f84770b = list;
        this.f84771c = function1;
    }

    @Override // fd.InterfaceC6511n
    public final Unit invoke(H h11, InterfaceC3967k interfaceC3967k, Integer num) {
        H AnimatedVisibility = h11;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        num.intValue();
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        e.a aVar = androidx.compose.ui.e.f40358c0;
        Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.l(), interfaceC3967k2, 0);
        int I11 = interfaceC3967k2.I();
        A0 d11 = interfaceC3967k2.d();
        androidx.compose.ui.e f7 = androidx.compose.ui.c.f(interfaceC3967k2, aVar);
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
        ru.ozon.android.messenger.framework.presentation.common.utils.a.b(10, interfaceC3967k2);
        Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.l(), interfaceC3967k2, 0);
        int I12 = interfaceC3967k2.I();
        A0 d12 = interfaceC3967k2.d();
        androidx.compose.ui.e f12 = androidx.compose.ui.c.f(interfaceC3967k2, aVar);
        Function0 a12 = InterfaceC2801g.a.a();
        if (interfaceC3967k2.v() == null) {
            C8060b.c();
            throw null;
        }
        interfaceC3967k2.i();
        if (interfaceC3967k2.t()) {
            interfaceC3967k2.H(a12);
        } else {
            interfaceC3967k2.e();
        }
        Function2 f13 = C3173b.f(interfaceC3967k2, b12, interfaceC3967k2, d12);
        if (interfaceC3967k2.t() || !Intrinsics.d(interfaceC3967k2.C(), Integer.valueOf(I12))) {
            Nk.a.d(f13, I12, interfaceC3967k2, I12);
        }
        Ek.a.g(f12, interfaceC3967k2, -868710479);
        for (f.b bVar : this.f84770b) {
            androidx.compose.ui.e n11 = a0.n(androidx.compose.ui.e.f40358c0, 24);
            interfaceC3967k2.o(-2041765324);
            Function1<f.b, Unit> function1 = this.f84771c;
            boolean n12 = interfaceC3967k2.n(function1) | interfaceC3967k2.F(bVar);
            Object C11 = interfaceC3967k2.C();
            if (n12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new C(function1, bVar);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            DsIconAtomKt.DsIconAtom(bVar.a(), androidx.compose.foundation.i.c(n11, false, null, null, (Function0) C11, 7), interfaceC3967k2, IconDTO.$stable, 0);
        }
        interfaceC3967k2.k();
        interfaceC3967k2.f();
        interfaceC3967k2.f();
        return Unit.f71690a;
    }
}
