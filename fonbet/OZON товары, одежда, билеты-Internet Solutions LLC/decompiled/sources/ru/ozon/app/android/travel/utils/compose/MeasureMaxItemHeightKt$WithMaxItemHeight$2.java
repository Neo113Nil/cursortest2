package ru.ozon.app.android.travel.utils.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import Z1.h;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MeasureMaxItemHeightKt$WithMaxItemHeight$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC6511n<h, InterfaceC3967k, Integer, Unit> $content;
    final /* synthetic */ InterfaceC6511n<T, InterfaceC3967k, Integer, Unit> $itemContent;
    final /* synthetic */ Function0<h> $itemWidthProvider;
    final /* synthetic */ List<T> $items;
    final /* synthetic */ e $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MeasureMaxItemHeightKt$WithMaxItemHeight$2(List<? extends T> list, Function0<h> function0, e eVar, InterfaceC6511n<? super T, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n, InterfaceC6511n<? super h, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6511n2, int i11, int i12) {
        super(2);
        this.$items = list;
        this.$itemWidthProvider = function0;
        this.$modifier = eVar;
        this.$itemContent = interfaceC6511n;
        this.$content = interfaceC6511n2;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        MeasureMaxItemHeightKt.WithMaxItemHeight(this.$items, this.$itemWidthProvider, this.$modifier, this.$itemContent, this.$content, interfaceC3967k, C2652m.e(this.$$changed | 1), this.$$default);
    }
}
