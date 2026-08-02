package ru.ozon.uni.foundation.components.textarea;

import Bl0.C2652m;
import K1.T;
import Q1.K;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class FoundationTextAreaKt$Counter$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $counterColor;
    final /* synthetic */ long $counterErrorColor;
    final /* synthetic */ T $counterTextStyle;
    final /* synthetic */ int $maxLength;
    final /* synthetic */ e $modifier;
    final /* synthetic */ K $textFieldValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FoundationTextAreaKt$Counter$1(e eVar, int i11, long j11, long j12, T t2, K k11, int i12, int i13) {
        super(2);
        this.$modifier = eVar;
        this.$maxLength = i11;
        this.$counterColor = j11;
        this.$counterErrorColor = j12;
        this.$counterTextStyle = t2;
        this.$textFieldValue = k11;
        this.$$changed = i12;
        this.$$default = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        FoundationTextAreaKt.m3028CounterY0xEhic(this.$modifier, this.$maxLength, this.$counterColor, this.$counterErrorColor, this.$counterTextStyle, this.$textFieldValue, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
