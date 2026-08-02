package ru.ozon.app.android.ugc.widgets.usersGradesV2.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RoundStartProgressBarKt$RoundStartProgressBar$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $color;
    final /* synthetic */ e $modifier;
    final /* synthetic */ float $progress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoundStartProgressBarKt$RoundStartProgressBar$2(float f7, e eVar, long j11, long j12, int i11, int i12) {
        super(2);
        this.$progress = f7;
        this.$modifier = eVar;
        this.$color = j11;
        this.$backgroundColor = j12;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        RoundStartProgressBarKt.m1535RoundStartProgressBareaDK9VM(this.$progress, this.$modifier, this.$color, this.$backgroundColor, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
