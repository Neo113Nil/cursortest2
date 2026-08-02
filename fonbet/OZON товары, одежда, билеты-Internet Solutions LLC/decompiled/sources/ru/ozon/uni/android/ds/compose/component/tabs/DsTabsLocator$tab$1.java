package ru.ozon.uni.android.ds.compose.component.tabs;

import Ve.C4598rp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/ds/compose/component/tabs/DsTabsLocator;", "index", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
final class DsTabsLocator$tab$1 extends AbstractC7737t implements Function1<Integer, DsTabsLocator> {
    final /* synthetic */ DsTabsLocator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DsTabsLocator$tab$1(DsTabsLocator dsTabsLocator) {
        super(1);
        this.this$0 = dsTabsLocator;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ DsTabsLocator invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final DsTabsLocator invoke(int i11) {
        return new DsTabsLocator(null, C4598rp.c(i11, this.this$0.getLocatorTag(), ".tab"), 1, null);
    }
}
