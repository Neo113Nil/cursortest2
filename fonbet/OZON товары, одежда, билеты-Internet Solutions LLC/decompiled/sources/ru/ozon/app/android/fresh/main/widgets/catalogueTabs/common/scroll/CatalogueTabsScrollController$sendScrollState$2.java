package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.scroll;

import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogTabsScrollState;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CatalogueTabsScrollController$sendScrollState$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ CatalogTabsScrollState $scrollState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogueTabsScrollController$sendScrollState$2(CatalogTabsScrollState catalogTabsScrollState) {
        super(0);
        this.$scrollState = catalogTabsScrollState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Map map;
        CatalogTabsScrollEventListener catalogTabsScrollEventListener;
        map = CatalogueTabsScrollController.listeners;
        WeakReference weakReference = (WeakReference) map.get("non_sticky_listener");
        if (weakReference == null || (catalogTabsScrollEventListener = (CatalogTabsScrollEventListener) weakReference.get()) == null) {
            return;
        }
        catalogTabsScrollEventListener.immediateScrollToPositionWithOffset(this.$scrollState.getFinalTab(), ((CatalogTabsScrollState.OrdinaryScrolling) this.$scrollState).getOffset());
    }
}
