package ru.ozon.uni.android.ds.compose.component.input.inputCore;

import B1.InterfaceC2552v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LB1/v;", "intrinsicMeasurable", "", "w", "invoke", "(LB1/v;I)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class TextFieldMeasurePolicy$maxIntrinsicHeight$1 extends AbstractC7737t implements Function2<InterfaceC2552v, Integer, Integer> {
    public static final TextFieldMeasurePolicy$maxIntrinsicHeight$1 INSTANCE = new TextFieldMeasurePolicy$maxIntrinsicHeight$1();

    TextFieldMeasurePolicy$maxIntrinsicHeight$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Integer invoke(InterfaceC2552v interfaceC2552v, Integer num) {
        return invoke(interfaceC2552v, num.intValue());
    }

    public final Integer invoke(InterfaceC2552v intrinsicMeasurable, int i11) {
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
        return Integer.valueOf(intrinsicMeasurable.D(i11));
    }
}
