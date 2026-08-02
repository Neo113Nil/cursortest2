package ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v3.presentation.adapter;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.general.common.databinding.ItemTravelPaymentV3DefaultBinding;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v3.presentation.TravelPaymentV3VO;
import ru.ozon.app.android.travel.utils.view.constraintLayoutWithBorder.ConstraintLayoutWithBorder;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelPayment/v3/presentation/TravelPaymentV3VO$PaymentMethodItemVO$TravelPaymentDefaultVO;", "Lru/ozon/app/android/travel/feature/general/common/databinding/ItemTravelPaymentV3DefaultBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelPaymentV3PaymentsDefaultAdapterDelegateKt$travelPaymentV3PaymentsDefaultAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<TravelPaymentV3VO.PaymentMethodItemVO.TravelPaymentDefaultVO, ItemTravelPaymentV3DefaultBinding>, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v3.presentation.adapter.TravelPaymentV3PaymentsDefaultAdapterDelegateKt$travelPaymentV3PaymentsDefaultAdapterDelegate$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<TravelPaymentV3VO.PaymentMethodItemVO.TravelPaymentDefaultVO, ItemTravelPaymentV3DefaultBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AdapterDelegateViewBindingViewHolder<TravelPaymentV3VO.PaymentMethodItemVO.TravelPaymentDefaultVO, ItemTravelPaymentV3DefaultBinding> adapterDelegateViewBindingViewHolder) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            TravelPaymentV3VO.PaymentMethodItemVO.TravelPaymentDefaultVO item = this.$this_adapterDelegateViewBinding.getItem();
            AdapterDelegateViewBindingViewHolder<TravelPaymentV3VO.PaymentMethodItemVO.TravelPaymentDefaultVO, ItemTravelPaymentV3DefaultBinding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            TravelPaymentV3VO.PaymentMethodItemVO.TravelPaymentDefaultVO travelPaymentDefaultVO = item;
            adapterDelegateViewBindingViewHolder.getBinding().getConstraintLayout().setBorderColor(Integer.valueOf(ThemeExtKt.themeColor(adapterDelegateViewBindingViewHolder.getContext(), travelPaymentDefaultVO.getBackgroundStrokeColor())));
            StyleParser styleParser = StyleParser.INSTANCE;
            Integer parseColor = styleParser.parseColor(adapterDelegateViewBindingViewHolder.getContext(), travelPaymentDefaultVO.getBackgroundColor());
            if (parseColor != null) {
                adapterDelegateViewBindingViewHolder.getBinding().travelPaymentV3DefaultBgIV.setBackgroundColor(parseColor.intValue());
            }
            AppCompatImageView appCompatImageView = adapterDelegateViewBindingViewHolder.getBinding().travelPaymentV3DefaultIconIV;
            Intrinsics.f(appCompatImageView);
            Icon icon = travelPaymentDefaultVO.getIcon();
            ImageViewExtKt.load$default(appCompatImageView, icon != null ? icon.getImage() : null, null, null, null, null, false, null, 126, null);
            Context context = appCompatImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Icon icon2 = travelPaymentDefaultVO.getIcon();
            ThemeExtKt.tint(appCompatImageView, styleParser.parseColor(context, icon2 != null ? icon2.getTintColor() : null));
            TextAtomView travelPaymentV3DefaultTitleTAV = adapterDelegateViewBindingViewHolder.getBinding().travelPaymentV3DefaultTitleTAV;
            Intrinsics.checkNotNullExpressionValue(travelPaymentV3DefaultTitleTAV, "travelPaymentV3DefaultTitleTAV");
            TextAtomHolderKt.bindOrGone$default(travelPaymentV3DefaultTitleTAV, travelPaymentDefaultVO.getTitle(), null, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TravelPaymentV3PaymentsDefaultAdapterDelegateKt$travelPaymentV3PaymentsDefaultAdapterDelegate$2(Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$onAction = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(Function1 function1, AdapterDelegateViewBindingViewHolder adapterDelegateViewBindingViewHolder, View view) {
        function1.invoke(((TravelPaymentV3VO.PaymentMethodItemVO.TravelPaymentDefaultVO) adapterDelegateViewBindingViewHolder.getItem()).getAction());
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<TravelPaymentV3VO.PaymentMethodItemVO.TravelPaymentDefaultVO, ItemTravelPaymentV3DefaultBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final AdapterDelegateViewBindingViewHolder<TravelPaymentV3VO.PaymentMethodItemVO.TravelPaymentDefaultVO, ItemTravelPaymentV3DefaultBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ConstraintLayoutWithBorder constraintLayout = adapterDelegateViewBinding.getBinding().getConstraintLayout();
        final Function1<AtomAction, Unit> function1 = this.$onAction;
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v3.presentation.adapter.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TravelPaymentV3PaymentsDefaultAdapterDelegateKt$travelPaymentV3PaymentsDefaultAdapterDelegate$2.invoke$lambda$0(Function1.this, adapterDelegateViewBinding, view);
            }
        });
        adapterDelegateViewBinding.bind(new AnonymousClass2(adapterDelegateViewBinding));
    }
}
