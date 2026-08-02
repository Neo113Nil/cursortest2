package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation;

import B0.C2454a;
import B1.V;
import D1.InterfaceC2801g;
import E0.C2942q;
import I0.C3173b;
import Nk.a;
import S0.A0;
import S0.F1;
import S0.InterfaceC3967k;
import Tg.b;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e1.InterfaceC6250b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m3.C8060b;
import ru.ozon.app.android.regulardraw.ui.CompatibleGraphicsLayerKt;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.MorkovskTabbarVI;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.tab.MorkovskTabbarTabController;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.tab.MorkovskTabbarTabKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class MorkovskTabbarComposableKt$MorkovskTabbarComposable$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1<b, Unit> $onAtomAction;
    final /* synthetic */ MorkovskTabbarVI $state;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.MorkovskTabbarComposableKt$MorkovskTabbarComposable$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
        final /* synthetic */ Function1<b, Unit> $onAtomAction;
        final /* synthetic */ MorkovskTabbarVI $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(MorkovskTabbarVI morkovskTabbarVI, Function1<? super b, Unit> function1) {
            super(2);
            this.$state = morkovskTabbarVI;
            this.$onAtomAction = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            invoke(interfaceC3967k, num.intValue());
            return Unit.f71690a;
        }

        public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
            MorkovskTabbarTabController tabController;
            if ((i11 & 3) == 2 && interfaceC3967k.b()) {
                interfaceC3967k.j();
                return;
            }
            e.a aVar = e.f40358c0;
            e h11 = T.h(a0.e(aVar, 1.0f), 0.0f, 8, 1);
            MorkovskTabbarVI morkovskTabbarVI = this.$state;
            Function1<b, Unit> function1 = this.$onAtomAction;
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = interfaceC3967k.I();
            A0 d11 = interfaceC3967k.d();
            e f11 = c.f(interfaceC3967k, h11);
            InterfaceC2801g.f5440U.getClass();
            Function0 a11 = InterfaceC2801g.a.a();
            if (interfaceC3967k.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k.i();
            if (interfaceC3967k.t()) {
                interfaceC3967k.H(a11);
            } else {
                interfaceC3967k.e();
            }
            Function2 d12 = C2454a.d(interfaceC3967k, f7, interfaceC3967k, d11);
            if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I11))) {
                a.d(d12, I11, interfaceC3967k, I11);
            }
            F1.b(interfaceC3967k, f11, InterfaceC2801g.a.f());
            C5187j c5187j = C5187j.f39515a;
            C5179b.i n11 = C5179b.n(4);
            interfaceC3967k.o(-516694972);
            e t2 = ((Configuration) interfaceC3967k.m(AndroidCompositionLocals_androidKt.c())).screenWidthDp > 390 ? a0.t(T.h(aVar, 28, 0.0f, 2), 0.0f, 434, 1) : a0.m(aVar, 334);
            interfaceC3967k.k();
            e a12 = c5187j.a(t2, InterfaceC6250b.a.e());
            Y b11 = X.b(n11, InterfaceC6250b.a.l(), interfaceC3967k, 6);
            int I12 = interfaceC3967k.I();
            A0 d13 = interfaceC3967k.d();
            e f12 = c.f(interfaceC3967k, a12);
            Function0 a13 = InterfaceC2801g.a.a();
            if (interfaceC3967k.v() == null) {
                C8060b.c();
                throw null;
            }
            interfaceC3967k.i();
            if (interfaceC3967k.t()) {
                interfaceC3967k.H(a13);
            } else {
                interfaceC3967k.e();
            }
            Function2 f13 = C3173b.f(interfaceC3967k, b11, interfaceC3967k, d13);
            if (interfaceC3967k.t() || !Intrinsics.d(interfaceC3967k.C(), Integer.valueOf(I12))) {
                a.d(f13, I12, interfaceC3967k, I12);
            }
            F1.b(interfaceC3967k, f12, InterfaceC2801g.a.f());
            interfaceC3967k.o(-1862600957);
            List<MorkovskTabbarVI.Tab> tabs = morkovskTabbarVI.getTabs();
            int size = tabs.size();
            for (int i12 = 0; i12 < size; i12++) {
                MorkovskTabbarVI.Tab tab = tabs.get(i12);
                tabController = MorkovskTabbarComposableKt.tabController(morkovskTabbarVI.getId(), i12, interfaceC3967k, 0);
                e.a aVar2 = e.f40358c0;
                float weight = tab.getWeight();
                if (weight <= 0.0d) {
                    throw new IllegalArgumentException(C2942q.b(weight, "invalid weight ", "; must be greater than zero").toString());
                }
                if (weight > Float.MAX_VALUE) {
                    weight = Float.MAX_VALUE;
                }
                MorkovskTabbarTabKt.MorkovskTabbarTab(tab, tabController, function1, a0.f(new LayoutWeightElement(weight, true), 68), interfaceC3967k, 0, 0);
            }
            interfaceC3967k.k();
            interfaceC3967k.f();
            interfaceC3967k.f();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MorkovskTabbarComposableKt$MorkovskTabbarComposable$1(MorkovskTabbarVI morkovskTabbarVI, Function1<? super b, Unit> function1) {
        super(2);
        this.$state = morkovskTabbarVI;
        this.$onAtomAction = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        if ((i11 & 3) == 2 && interfaceC3967k.b()) {
            interfaceC3967k.j();
        } else {
            CompatibleGraphicsLayerKt.CompatibleGraphicsLayer(null, a1.c.c(-1921814830, new AnonymousClass1(this.$state, this.$onAtomAction), interfaceC3967k), interfaceC3967k, 48, 1);
        }
    }
}
