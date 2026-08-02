package ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesOffer.presentation.adapter;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.general.services.databinding.ItemAdditionalServicesOfferBinding;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesOffer.presentation.AdditionalServicesOfferVO;
import ru.ozon.app.android.travel.molecules.extensions.ThemeImageExtKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/presentation/AdditionalServicesOfferVO$OfferVO;", "Lru/ozon/app/android/travel/feature/general/services/databinding/ItemAdditionalServicesOfferBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class AdditionalServicesOfferAdapterDelegateKt$additionalServicesOfferAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<AdditionalServicesOfferVO.OfferVO, ItemAdditionalServicesOfferBinding>, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesOffer.presentation.adapter.AdditionalServicesOfferAdapterDelegateKt$additionalServicesOfferAdapterDelegate$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<AdditionalServicesOfferVO.OfferVO, ItemAdditionalServicesOfferBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AdapterDelegateViewBindingViewHolder<AdditionalServicesOfferVO.OfferVO, ItemAdditionalServicesOfferBinding> adapterDelegateViewBindingViewHolder) {
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
            ShapeableImageView additionalServicesOfferImageIV = this.$this_adapterDelegateViewBinding.getBinding().additionalServicesOfferImageIV;
            Intrinsics.checkNotNullExpressionValue(additionalServicesOfferImageIV, "additionalServicesOfferImageIV");
            ImageViewExtKt.load$default(additionalServicesOfferImageIV, ThemeImageExtKt.getUrlForTheme(this.$this_adapterDelegateViewBinding.getItem().getOfferIconLink(), this.$this_adapterDelegateViewBinding.getContext()), null, null, null, null, false, null, 126, null);
            TextAtomView additionalServicesOfferTitleTAV = this.$this_adapterDelegateViewBinding.getBinding().additionalServicesOfferTitleTAV;
            Intrinsics.checkNotNullExpressionValue(additionalServicesOfferTitleTAV, "additionalServicesOfferTitleTAV");
            TextAtomHolderKt.bind$default(additionalServicesOfferTitleTAV, this.$this_adapterDelegateViewBinding.getItem().getOfferTitle(), null, 2, null);
            TextAtomView additionalServicesOfferSubtitleTAV = this.$this_adapterDelegateViewBinding.getBinding().additionalServicesOfferSubtitleTAV;
            Intrinsics.checkNotNullExpressionValue(additionalServicesOfferSubtitleTAV, "additionalServicesOfferSubtitleTAV");
            TextAtomHolderKt.bindOrGone$default(additionalServicesOfferSubtitleTAV, this.$this_adapterDelegateViewBinding.getItem().getOfferSubtitle(), null, 2, null);
            BadgeView additionalServicesOfferBadgeBV = this.$this_adapterDelegateViewBinding.getBinding().additionalServicesOfferBadgeBV;
            Intrinsics.checkNotNullExpressionValue(additionalServicesOfferBadgeBV, "additionalServicesOfferBadgeBV");
            BadgeHolderKt.bindOrGone$default(additionalServicesOfferBadgeBV, this.$this_adapterDelegateViewBinding.getItem().getBadge(), (Function1) null, 2, (Object) null);
            AppCompatImageView appCompatImageView = this.$this_adapterDelegateViewBinding.getBinding().additionalServicesOfferDirectIconIV;
            AdapterDelegateViewBindingViewHolder<AdditionalServicesOfferVO.OfferVO, ItemAdditionalServicesOfferBinding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            Intrinsics.f(appCompatImageView);
            Icon directIcon = adapterDelegateViewBindingViewHolder.getItem().getDirectIcon();
            ImageViewExtKt.loadImageOrGone(appCompatImageView, directIcon != null ? directIcon.getImage() : null);
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = appCompatImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Icon directIcon2 = adapterDelegateViewBindingViewHolder.getItem().getDirectIcon();
            ThemeExtKt.tint(appCompatImageView, Integer.valueOf(styleParser.parseColor(context, directIcon2 != null ? directIcon2.getTintColor() : null, UniColors.GRAPHIC_NEUTRAL.getResId())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AdditionalServicesOfferAdapterDelegateKt$additionalServicesOfferAdapterDelegate$2(Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$onAction = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(Function1 function1, AdapterDelegateViewBindingViewHolder adapterDelegateViewBindingViewHolder, View view) {
        function1.invoke(((AdditionalServicesOfferVO.OfferVO) adapterDelegateViewBindingViewHolder.getItem()).getAction());
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<AdditionalServicesOfferVO.OfferVO, ItemAdditionalServicesOfferBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final AdapterDelegateViewBindingViewHolder<AdditionalServicesOfferVO.OfferVO, ItemAdditionalServicesOfferBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ConstraintLayout constraintLayout = adapterDelegateViewBinding.getBinding().getConstraintLayout();
        final Function1<AtomAction, Unit> function1 = this.$onAction;
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesOffer.presentation.adapter.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdditionalServicesOfferAdapterDelegateKt$additionalServicesOfferAdapterDelegate$2.invoke$lambda$0(Function1.this, adapterDelegateViewBinding, view);
            }
        });
        adapterDelegateViewBinding.bind(new AnonymousClass2(adapterDelegateViewBinding));
    }
}
