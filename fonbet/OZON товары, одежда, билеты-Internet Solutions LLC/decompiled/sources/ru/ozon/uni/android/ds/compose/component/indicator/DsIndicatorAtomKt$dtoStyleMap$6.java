package ru.ozon.uni.android.ds.compose.component.indicator;

import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorStyle;", "invoke", "(LS0/k;I)Lru/ozon/uni/android/ds/compose/component/indicator/DsIndicatorStyle;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class DsIndicatorAtomKt$dtoStyleMap$6 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, DsIndicatorStyle> {
    public static final DsIndicatorAtomKt$dtoStyleMap$6 INSTANCE = new DsIndicatorAtomKt$dtoStyleMap$6();

    DsIndicatorAtomKt$dtoStyleMap$6() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ DsIndicatorStyle invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        return invoke(interfaceC3967k, num.intValue());
    }

    public final DsIndicatorStyle invoke(InterfaceC3967k interfaceC3967k, int i11) {
        interfaceC3967k.o(-998887667);
        DsIndicatorStyle lightNeutral = DsIndicatorStyle.INSTANCE.lightNeutral(interfaceC3967k, 6);
        interfaceC3967k.k();
        return lightNeutral;
    }
}
