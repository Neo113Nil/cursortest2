package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.sticky;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/v2/presentation/sticky/CatalogTabsV2StickyAnimator;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CatalogTabsV2OverlayViewHolder$stickyAnimator$2 extends AbstractC7737t implements Function0<CatalogTabsV2StickyAnimator> {
    final /* synthetic */ CatalogTabsV2OverlayViewHolder this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.sticky.CatalogTabsV2OverlayViewHolder$stickyAnimator$2$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function0<Integer> {
        AnonymousClass1(Object obj) {
            super(0, obj, CatalogTabsV2OverlayViewHolder.class, "getContentHeight", "getContentHeight()I", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            int contentHeight;
            contentHeight = ((CatalogTabsV2OverlayViewHolder) this.receiver).getContentHeight();
            return Integer.valueOf(contentHeight);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.sticky.CatalogTabsV2OverlayViewHolder$stickyAnimator$2$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7735q implements Function0<Unit> {
        AnonymousClass2(Object obj) {
            super(0, obj, CatalogTabsV2OverlayViewHolder.class, "positionStickyView", "positionStickyView()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((CatalogTabsV2OverlayViewHolder) this.receiver).positionStickyView();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogTabsV2OverlayViewHolder$stickyAnimator$2(CatalogTabsV2OverlayViewHolder catalogTabsV2OverlayViewHolder) {
        super(0);
        this.this$0 = catalogTabsV2OverlayViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CatalogTabsV2StickyAnimator invoke() {
        RecyclerView recyclerView;
        recyclerView = this.this$0.containerView;
        return new CatalogTabsV2StickyAnimator(recyclerView, new AnonymousClass1(this.this$0), new AnonymousClass2(this.this$0));
    }
}
