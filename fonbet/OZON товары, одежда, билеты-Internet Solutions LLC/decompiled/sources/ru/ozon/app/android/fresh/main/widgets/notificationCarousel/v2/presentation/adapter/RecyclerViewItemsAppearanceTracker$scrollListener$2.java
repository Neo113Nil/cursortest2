package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\r\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004*\u0001\u0002\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView$C;", "T", "ru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/RecyclerViewItemsAppearanceTracker$scrollListener$2$1", "invoke", "()Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/RecyclerViewItemsAppearanceTracker$scrollListener$2$1;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class RecyclerViewItemsAppearanceTracker$scrollListener$2 extends AbstractC7737t implements Function0<AnonymousClass1> {
    final /* synthetic */ RecyclerViewItemsAppearanceTracker<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecyclerViewItemsAppearanceTracker$scrollListener$2(RecyclerViewItemsAppearanceTracker<T> recyclerViewItemsAppearanceTracker) {
        super(0);
        this.this$0 = recyclerViewItemsAppearanceTracker;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.RecyclerViewItemsAppearanceTracker$scrollListener$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        final RecyclerViewItemsAppearanceTracker<T> recyclerViewItemsAppearanceTracker = this.this$0;
        return new RecyclerView.t() { // from class: ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.RecyclerViewItemsAppearanceTracker$scrollListener$2.1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 0) {
                    recyclerViewItemsAppearanceTracker.updateMostVisibleHolder();
                }
            }
        };
    }
}
