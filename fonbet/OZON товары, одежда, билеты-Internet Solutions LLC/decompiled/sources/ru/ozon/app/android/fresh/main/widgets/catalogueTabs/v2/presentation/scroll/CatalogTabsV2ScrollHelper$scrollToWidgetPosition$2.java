package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.scroll;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CatalogTabsV2ScrollHelper$scrollToWidgetPosition$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ LinearLayoutManager $layoutManager;
    final /* synthetic */ int $targetIndex;
    final /* synthetic */ RecyclerView $this_scrollToWidgetPosition;
    final /* synthetic */ int $topOffsetPx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogTabsV2ScrollHelper$scrollToWidgetPosition$2(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, int i11, int i12) {
        super(0);
        this.$this_scrollToWidgetPosition = recyclerView;
        this.$layoutManager = linearLayoutManager;
        this.$targetIndex = i11;
        this.$topOffsetPx = i12;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        CatalogTabsV2ScrollHelper.INSTANCE.smoothScrollToPositionWithTopOffset(this.$this_scrollToWidgetPosition, this.$layoutManager, this.$targetIndex + 1, this.$topOffsetPx);
    }
}
