package ru.ozon.uni.android.ds.compose.component.button;

import U7.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/ds/compose/component/button/DsButtonLocator;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DsButtonLocator$title$1 extends AbstractC7737t implements Function0<DsButtonLocator> {
    final /* synthetic */ DsButtonLocator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsButtonLocator$title$1(DsButtonLocator dsButtonLocator) {
        super(0);
        this.this$0 = dsButtonLocator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DsButtonLocator invoke() {
        return new DsButtonLocator(null, d.e(this.this$0.getLocatorTag(), ".title"), 1, null);
    }
}
