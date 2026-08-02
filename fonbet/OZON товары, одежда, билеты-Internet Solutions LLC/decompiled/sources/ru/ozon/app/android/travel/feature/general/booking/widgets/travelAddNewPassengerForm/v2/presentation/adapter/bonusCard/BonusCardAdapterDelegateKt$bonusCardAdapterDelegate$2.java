package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation.adapter.bonusCard;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.general.booking.databinding.ItemTravelAddNewPassengerFormV2BonusCardBinding;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation.TravelAddNewPassengerFormV2VO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2VO$BonusCards$BonusCard;", "Lru/ozon/app/android/travel/feature/general/booking/databinding/ItemTravelAddNewPassengerFormV2BonusCardBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class BonusCardAdapterDelegateKt$bonusCardAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<TravelAddNewPassengerFormV2VO.BonusCards.BonusCard, ItemTravelAddNewPassengerFormV2BonusCardBinding>, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation.adapter.bonusCard.BonusCardAdapterDelegateKt$bonusCardAdapterDelegate$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<TravelAddNewPassengerFormV2VO.BonusCards.BonusCard, ItemTravelAddNewPassengerFormV2BonusCardBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AdapterDelegateViewBindingViewHolder<TravelAddNewPassengerFormV2VO.BonusCards.BonusCard, ItemTravelAddNewPassengerFormV2BonusCardBinding> adapterDelegateViewBindingViewHolder) {
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
            TravelAddNewPassengerFormV2VO.BonusCards.BonusCard item = this.$this_adapterDelegateViewBinding.getItem();
            AdapterDelegateViewBindingViewHolder<TravelAddNewPassengerFormV2VO.BonusCards.BonusCard, ItemTravelAddNewPassengerFormV2BonusCardBinding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            TravelAddNewPassengerFormV2VO.BonusCards.BonusCard bonusCard = item;
            TextAtomView bonusCardCarrierTv = adapterDelegateViewBindingViewHolder.getBinding().bonusCardCarrierTv;
            Intrinsics.checkNotNullExpressionValue(bonusCardCarrierTv, "bonusCardCarrierTv");
            TextAtomHolderKt.bind$default(bonusCardCarrierTv, bonusCard.getCarrierName(), null, 2, null);
            ImageView imageView = adapterDelegateViewBindingViewHolder.getBinding().bonusCardIconIv;
            Intrinsics.f(imageView);
            ImageViewExtKt.load$default(imageView, bonusCard.getIcon().getImage(), null, null, null, null, false, null, 126, null);
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ThemeExtKt.tint(imageView, styleParser.parseColor(context, bonusCard.getIcon().getTintColor()));
            Integer parseColor = styleParser.parseColor(adapterDelegateViewBindingViewHolder.getContext(), bonusCard.getBackgroundColor());
            if (parseColor != null) {
                ConstraintLayout constraintLayout = adapterDelegateViewBindingViewHolder.getBinding().getConstraintLayout();
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                ViewExtKt.setBackgroundTint(constraintLayout, parseColor.intValue());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BonusCardAdapterDelegateKt$bonusCardAdapterDelegate$2(Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$onAction = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(Function1 function1, AdapterDelegateViewBindingViewHolder adapterDelegateViewBindingViewHolder, View view) {
        function1.invoke(((TravelAddNewPassengerFormV2VO.BonusCards.BonusCard) adapterDelegateViewBindingViewHolder.getItem()).getAction());
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<TravelAddNewPassengerFormV2VO.BonusCards.BonusCard, ItemTravelAddNewPassengerFormV2BonusCardBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final AdapterDelegateViewBindingViewHolder<TravelAddNewPassengerFormV2VO.BonusCards.BonusCard, ItemTravelAddNewPassengerFormV2BonusCardBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ConstraintLayout constraintLayout = adapterDelegateViewBinding.getBinding().getConstraintLayout();
        final Function1<AtomAction, Unit> function1 = this.$onAction;
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation.adapter.bonusCard.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BonusCardAdapterDelegateKt$bonusCardAdapterDelegate$2.invoke$lambda$0(Function1.this, adapterDelegateViewBinding, view);
            }
        });
        adapterDelegateViewBinding.bind(new AnonymousClass2(adapterDelegateViewBinding));
    }
}
