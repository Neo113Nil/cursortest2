package ru.ozon.uni.android.ds.compose.component.cell;

import U7.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/ds/compose/component/cell/DsCellLocator;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DsCellLocator$centerBlock$1 extends AbstractC7737t implements Function0<DsCellLocator> {
    final /* synthetic */ DsCellLocator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsCellLocator$centerBlock$1(DsCellLocator dsCellLocator) {
        super(0);
        this.this$0 = dsCellLocator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DsCellLocator invoke() {
        return new DsCellLocator(null, d.e(this.this$0.getLocatorTag(), ".centerBlock"), 1, null);
    }
}
