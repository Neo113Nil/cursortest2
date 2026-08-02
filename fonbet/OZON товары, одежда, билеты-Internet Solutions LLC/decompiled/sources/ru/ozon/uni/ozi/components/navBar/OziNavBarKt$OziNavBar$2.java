package ru.ozon.uni.ozi.components.navBar;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OziNavBarKt$OziNavBar$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $bottomLevel;
    final /* synthetic */ boolean $hasRounding;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $topLevel;
    final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OziNavBarKt$OziNavBar$2(Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, e eVar, boolean z11, float f7, int i11, int i12) {
        super(2);
        this.$topLevel = function2;
        this.$bottomLevel = function22;
        this.$modifier = eVar;
        this.$hasRounding = z11;
        this.$topPadding = f7;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        OziNavBarKt.m3111OziNavBarFJfuzF0(this.$topLevel, this.$bottomLevel, this.$modifier, this.$hasRounding, this.$topPadding, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
