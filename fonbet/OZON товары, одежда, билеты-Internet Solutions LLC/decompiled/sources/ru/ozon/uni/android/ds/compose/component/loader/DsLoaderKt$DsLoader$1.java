package ru.ozon.uni.android.ds.compose.component.loader;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class DsLoaderKt$DsLoader$1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $color;
    final /* synthetic */ e $modifier;
    final /* synthetic */ DsLoaderSize $size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsLoaderKt$DsLoader$1(e eVar, long j11, DsLoaderSize dsLoaderSize, int i11, int i12) {
        super(2);
        this.$modifier = eVar;
        this.$color = j11;
        this.$size = dsLoaderSize;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        DsLoaderKt.m1753DsLoader3IgeMak(this.$modifier, this.$color, this.$size, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
