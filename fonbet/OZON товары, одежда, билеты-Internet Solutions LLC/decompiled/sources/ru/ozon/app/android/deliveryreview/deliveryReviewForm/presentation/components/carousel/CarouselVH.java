package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.carousel;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.deliveryreview.databinding.ItemDeliveryReviewComponentCarouselBinding;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ComponentVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.ElementVO;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.item.UpdateCarousel;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/carousel/CarouselVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentCarouselBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentCarouselBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "groupId", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;", "component", "", "bind", "(ILru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;)V", "Lru/ozon/app/android/deliveryreview/databinding/ItemDeliveryReviewComponentCarouselBinding;", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/carousel/CarouselAdapter;", "carouselAdapter", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/carousel/CarouselAdapter;", "I", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ComponentVO;", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CarouselVH extends RecyclerView.C {

    @NotNull
    private final ItemDeliveryReviewComponentCarouselBinding binding;

    @NotNull
    private final CarouselAdapter carouselAdapter;
    private ComponentVO component;
    private int groupId;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "item", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/components/ElementVO$Carousel$Item;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.carousel.CarouselVH$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<ElementVO.Carousel.Item, Unit> {
        final /* synthetic */ ComposerReferences $refs;
        final /* synthetic */ CarouselVH this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ComposerReferences composerReferences, CarouselVH carouselVH) {
            super(1);
            this.$refs = composerReferences;
            this.this$0 = carouselVH;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ElementVO.Carousel.Item item) {
            invoke2(item);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ElementVO.Carousel.Item item) {
            Intrinsics.checkNotNullParameter(item, "item");
            InterfaceC7851b controller = this.$refs.getController();
            int i11 = this.this$0.groupId;
            ComponentVO componentVO = this.this$0.component;
            if (componentVO != null) {
                controller.update(new UpdateCarousel(i11, componentVO.getId(), item.getId(), !item.getIsSelected()));
            } else {
                Intrinsics.n("component");
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselVH(@NotNull ItemDeliveryReviewComponentCarouselBinding binding, @NotNull ComposerReferences refs) {
        super(binding.getConstraintLayout());
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.binding = binding;
        this.groupId = -1;
        CarouselAdapter carouselAdapter = new CarouselAdapter(new AnonymousClass1(refs, this));
        this.carouselAdapter = carouselAdapter;
        RecyclerView recyclerView = binding.carouselRv;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(carouselAdapter);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new CarouselDecorator(context));
    }

    public final void bind(int groupId, @NotNull ComponentVO component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.groupId = groupId;
        this.component = component;
        ItemDeliveryReviewComponentCarouselBinding itemDeliveryReviewComponentCarouselBinding = this.binding;
        TextView titleTv = itemDeliveryReviewComponentCarouselBinding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        ViewExtKt.showOrGone(titleTv, Boolean.valueOf(!component.getHidden()));
        RecyclerView carouselRv = itemDeliveryReviewComponentCarouselBinding.carouselRv;
        Intrinsics.checkNotNullExpressionValue(carouselRv, "carouselRv");
        ViewExtKt.showOrGone(carouselRv, Boolean.valueOf(!component.getHidden()));
        if (component.getHidden()) {
            return;
        }
        ElementVO element = component.getElement();
        ElementVO.Carousel carousel = element instanceof ElementVO.Carousel ? (ElementVO.Carousel) element : null;
        if (carousel != null) {
            TextView titleTv2 = itemDeliveryReviewComponentCarouselBinding.titleTv;
            Intrinsics.checkNotNullExpressionValue(titleTv2, "titleTv");
            TextViewExtKt.setTextOrGone(titleTv2, carousel.getTitle());
            this.carouselAdapter.setDisabled(component.getDisabled());
            this.carouselAdapter.submitList(carousel.getList());
        }
    }
}
