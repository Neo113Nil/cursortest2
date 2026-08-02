package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation.adapter;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation.TravelScrollPriceCalendarVO;
import ru.ozon.app.android.travel.molecules.view.threeDotLoader.ThreeDotLoaderView;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/presentation/TravelScrollPriceCalendarVO$DateTabVO;", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Landroid/widget/LinearLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelScrollPriceCalendarAdapterDelegateKt$travelScrollPriceCalendarAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<TravelScrollPriceCalendarVO.DateTabVO, TypedViewBinding<LinearLayout>>, Unit> {
    public static final TravelScrollPriceCalendarAdapterDelegateKt$travelScrollPriceCalendarAdapterDelegate$2 INSTANCE = new TravelScrollPriceCalendarAdapterDelegateKt$travelScrollPriceCalendarAdapterDelegate$2();

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation.adapter.TravelScrollPriceCalendarAdapterDelegateKt$travelScrollPriceCalendarAdapterDelegate$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ TextAtomView $priceCalendarDateTav;
        final /* synthetic */ TextAtomView $priceCalendarPriceTav;
        final /* synthetic */ ThreeDotLoaderView $priceCalendarProgressTdv;
        final /* synthetic */ int $strokeWidth;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<TravelScrollPriceCalendarVO.DateTabVO, TypedViewBinding<LinearLayout>> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AdapterDelegateViewBindingViewHolder<TravelScrollPriceCalendarVO.DateTabVO, TypedViewBinding<LinearLayout>> adapterDelegateViewBindingViewHolder, TextAtomView textAtomView, ThreeDotLoaderView threeDotLoaderView, TextAtomView textAtomView2, int i11) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$priceCalendarDateTav = textAtomView;
            this.$priceCalendarProgressTdv = threeDotLoaderView;
            this.$priceCalendarPriceTav = textAtomView2;
            this.$strokeWidth = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            TravelScrollPriceCalendarVO.DateTabVO item = this.$this_adapterDelegateViewBinding.getItem();
            TextAtomView textAtomView = this.$priceCalendarDateTav;
            ThreeDotLoaderView threeDotLoaderView = this.$priceCalendarProgressTdv;
            TextAtomView textAtomView2 = this.$priceCalendarPriceTav;
            AdapterDelegateViewBindingViewHolder<TravelScrollPriceCalendarVO.DateTabVO, TypedViewBinding<LinearLayout>> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            int i11 = this.$strokeWidth;
            TravelScrollPriceCalendarVO.DateTabVO dateTabVO = item;
            TextAtomHolderKt.bindOrGone$default(textAtomView, dateTabVO.getDate(), null, 2, null);
            threeDotLoaderView.setVisibility(dateTabVO.getIsProgressVisible() ? 0 : 8);
            TextAtomHolderKt.bindOrGone$default(textAtomView2, dateTabVO.getPrice(), null, 2, null);
            Drawable background = adapterDelegateViewBindingViewHolder.getBinding().getConstraintLayout().getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                StyleParser styleParser = StyleParser.INSTANCE;
                Integer parseColor = styleParser.parseColor(adapterDelegateViewBindingViewHolder.getContext(), dateTabVO.getBorderColor());
                if (parseColor != null) {
                    gradientDrawable.setStroke(i11, parseColor.intValue());
                } else {
                    gradientDrawable.setStroke(0, 0);
                }
                Integer parseColor2 = styleParser.parseColor(adapterDelegateViewBindingViewHolder.getContext(), dateTabVO.getBackgroundColor());
                if (parseColor2 != null) {
                    gradientDrawable.setColor(parseColor2.intValue());
                } else {
                    gradientDrawable.setColor(0);
                }
            }
        }
    }

    TravelScrollPriceCalendarAdapterDelegateKt$travelScrollPriceCalendarAdapterDelegate$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<TravelScrollPriceCalendarVO.DateTabVO, TypedViewBinding<LinearLayout>> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<TravelScrollPriceCalendarVO.DateTabVO, TypedViewBinding<LinearLayout>> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        int px = ResourceExtKt.toPx(2, adapterDelegateViewBinding.getContext());
        int px2 = ResourceExtKt.toPx(24, adapterDelegateViewBinding.getContext());
        q qVar = q.f64554a;
        TextAtomView textAtomView = (TextAtomView) qVar.g(N.b(TextAtomView.class), adapterDelegateViewBinding.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        textAtomView.setLayoutParams(layoutParams);
        ThreeDotLoaderView threeDotLoaderView = new ThreeDotLoaderView(adapterDelegateViewBinding.getContext(), null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(px2, px2);
        layoutParams2.gravity = 1;
        threeDotLoaderView.setLayoutParams(layoutParams2);
        TextAtomView textAtomView2 = (TextAtomView) qVar.g(N.b(TextAtomView.class), adapterDelegateViewBinding.getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textAtomView2.setLayoutParams(layoutParams3);
        LinearLayout constraintLayout = adapterDelegateViewBinding.getBinding().getConstraintLayout();
        constraintLayout.addView(textAtomView);
        constraintLayout.addView(threeDotLoaderView);
        constraintLayout.addView(textAtomView2);
        adapterDelegateViewBinding.bind(new AnonymousClass2(adapterDelegateViewBinding, textAtomView, threeDotLoaderView, textAtomView2, px));
    }
}
