package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.RecyclerViewItemsAppearanceTracker;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.adapter.viewHolders.NotificationCarouselV2BaseItemViewHolder;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/RecyclerViewItemsAppearanceTracker;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/viewHolders/NotificationCarouselV2BaseItemViewHolder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class NotificationCarouselV2ViewHolderFF$itemsAppearanceTracker$2 extends AbstractC7737t implements Function0<RecyclerViewItemsAppearanceTracker<NotificationCarouselV2BaseItemViewHolder<?>>> {
    final /* synthetic */ NotificationCarouselV2ViewHolderFF this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "notificationViewHolder", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/adapter/viewHolders/NotificationCarouselV2BaseItemViewHolder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.NotificationCarouselV2ViewHolderFF$itemsAppearanceTracker$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<NotificationCarouselV2BaseItemViewHolder<?>, Unit> {
        final /* synthetic */ NotificationCarouselV2ViewHolderFF this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NotificationCarouselV2ViewHolderFF notificationCarouselV2ViewHolderFF) {
            super(1);
            this.this$0 = notificationCarouselV2ViewHolderFF;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NotificationCarouselV2BaseItemViewHolder<?> notificationCarouselV2BaseItemViewHolder) {
            invoke2(notificationCarouselV2BaseItemViewHolder);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(NotificationCarouselV2BaseItemViewHolder<?> notificationViewHolder) {
            Intrinsics.checkNotNullParameter(notificationViewHolder, "notificationViewHolder");
            notificationViewHolder.onViewed();
            this.this$0.saveRecyclerViewState();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationCarouselV2ViewHolderFF$itemsAppearanceTracker$2(NotificationCarouselV2ViewHolderFF notificationCarouselV2ViewHolderFF) {
        super(0);
        this.this$0 = notificationCarouselV2ViewHolderFF;
    }

    @Override // kotlin.jvm.functions.Function0
    public final RecyclerViewItemsAppearanceTracker<NotificationCarouselV2BaseItemViewHolder<?>> invoke() {
        RecyclerView recyclerView;
        recyclerView = this.this$0.recyclerView;
        return new RecyclerViewItemsAppearanceTracker<>(recyclerView, new AnonymousClass1(this.this$0));
    }
}
