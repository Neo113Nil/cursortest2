package ru.ozon.uni.android.ds.compose.component.price;

import U7.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/ds/compose/component/price/DsPriceLocator;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DsPriceLocator$leftBlock$1 extends AbstractC7737t implements Function0<DsPriceLocator> {
    final /* synthetic */ DsPriceLocator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsPriceLocator$leftBlock$1(DsPriceLocator dsPriceLocator) {
        super(0);
        this.this$0 = dsPriceLocator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DsPriceLocator invoke() {
        return new DsPriceLocator(null, d.e(this.this$0.getLocatorTag(), ".price"), 1, null);
    }
}
