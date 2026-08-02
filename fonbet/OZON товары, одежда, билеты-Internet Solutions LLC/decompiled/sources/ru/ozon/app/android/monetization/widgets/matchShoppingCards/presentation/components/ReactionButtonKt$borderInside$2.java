package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.components;

import S0.InterfaceC3967k;
import Z1.d;
import androidx.compose.ui.draw.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import fd.InterfaceC6511n;
import k1.C7455a;
import k1.C7456b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import n1.C8416i;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/e;", "invoke", "(Landroidx/compose/ui/e;LS0/k;I)Landroidx/compose/ui/e;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class ReactionButtonKt$borderInside$2 extends AbstractC7737t implements InterfaceC6511n<e, InterfaceC3967k, Integer, e> {
    final /* synthetic */ Function0<Float> $alpha;
    final /* synthetic */ AbstractC7799Q $brush;
    final /* synthetic */ float $cornerRadius;
    final /* synthetic */ float $width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReactionButtonKt$borderInside$2(float f7, float f11, Function0<Float> function0, AbstractC7799Q abstractC7799Q) {
        super(3);
        this.$width = f7;
        this.$cornerRadius = f11;
        this.$alpha = function0;
        this.$brush = abstractC7799Q;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ e invoke(e eVar, InterfaceC3967k interfaceC3967k, Integer num) {
        return invoke(eVar, interfaceC3967k, num.intValue());
    }

    public final e invoke(e composed, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        interfaceC3967k.o(342646656);
        d dVar = (d) interfaceC3967k.m(K0.e());
        interfaceC3967k.o(-1463615505);
        boolean n11 = interfaceC3967k.n(dVar) | interfaceC3967k.q(this.$width);
        float f7 = this.$width;
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            Object c8416i = new C8416i(dVar.v1(f7), 0.0f, 0, 0, null, 30);
            interfaceC3967k.x(c8416i);
            C11 = c8416i;
        }
        C8416i c8416i2 = (C8416i) C11;
        interfaceC3967k.k();
        interfaceC3967k.o(-1463611222);
        boolean n12 = interfaceC3967k.n(dVar) | interfaceC3967k.q(this.$cornerRadius);
        float f11 = this.$cornerRadius;
        Object C12 = interfaceC3967k.C();
        if (n12 || C12 == InterfaceC3967k.a.a()) {
            float v12 = dVar.v1(f11);
            C12 = C7455a.b(C7456b.a(v12, v12));
            interfaceC3967k.x(C12);
        }
        long g10 = ((C7455a) C12).g();
        interfaceC3967k.k();
        interfaceC3967k.o(-1463606207);
        boolean n13 = interfaceC3967k.n(this.$alpha) | interfaceC3967k.n(this.$brush) | interfaceC3967k.s(g10) | interfaceC3967k.F(c8416i2);
        Function0<Float> function0 = this.$alpha;
        AbstractC7799Q abstractC7799Q = this.$brush;
        Object C13 = interfaceC3967k.C();
        if (n13 || C13 == InterfaceC3967k.a.a()) {
            Object reactionButtonKt$borderInside$2$1$1 = new ReactionButtonKt$borderInside$2$1$1(function0, abstractC7799Q, g10, c8416i2);
            interfaceC3967k.x(reactionButtonKt$borderInside$2$1$1);
            C13 = reactionButtonKt$borderInside$2$1$1;
        }
        interfaceC3967k.k();
        e d11 = c.d(composed, (Function1) C13);
        interfaceC3967k.k();
        return d11;
    }
}
