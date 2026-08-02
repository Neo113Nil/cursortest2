package ru.ozon.uni.foundation.components.textarea;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import q1.AbstractC8972b;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FoundationTextAreaKt$SystemContent$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $active;
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $clearButton;
    final /* synthetic */ float $iconSize;
    final /* synthetic */ boolean $isLeftLockIconEnabled;
    final /* synthetic */ boolean $isNotEmpty;
    final /* synthetic */ AbstractC8972b $lockIcon;
    final /* synthetic */ e $modifier;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ AbstractC8972b $systemContent;
    final /* synthetic */ long $systemContentColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FoundationTextAreaKt$SystemContent$3(e eVar, AbstractC8972b abstractC8972b, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, boolean z11, boolean z12, boolean z13, long j11, AbstractC8972b abstractC8972b2, float f7, boolean z14, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$systemContent = abstractC8972b;
        this.$clearButton = function2;
        this.$isNotEmpty = z11;
        this.$active = z12;
        this.$readOnly = z13;
        this.$systemContentColor = j11;
        this.$lockIcon = abstractC8972b2;
        this.$iconSize = f7;
        this.$isLeftLockIconEnabled = z14;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        FoundationTextAreaKt.m3031SystemContentWasTKPc(this.$modifier, this.$systemContent, this.$clearButton, this.$isNotEmpty, this.$active, this.$readOnly, this.$systemContentColor, this.$lockIcon, this.$iconSize, this.$isLeftLockIconEnabled, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
