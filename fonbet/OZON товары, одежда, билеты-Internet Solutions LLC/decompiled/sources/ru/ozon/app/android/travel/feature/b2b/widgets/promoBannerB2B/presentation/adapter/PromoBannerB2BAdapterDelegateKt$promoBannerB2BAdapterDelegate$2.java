package ru.ozon.app.android.travel.feature.b2b.widgets.promoBannerB2B.presentation.adapter;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.b2b.databinding.ItemPromoBannerB2bBinding;
import ru.ozon.app.android.travel.feature.b2b.widgets.promoBannerB2B.presentation.PromoBannerB2BVO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/b2b/widgets/promoBannerB2B/presentation/PromoBannerB2BVO$BannerVO;", "Lru/ozon/app/android/travel/feature/b2b/databinding/ItemPromoBannerB2bBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PromoBannerB2BAdapterDelegateKt$promoBannerB2BAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<PromoBannerB2BVO.BannerVO, ItemPromoBannerB2bBinding>, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.promoBannerB2B.presentation.adapter.PromoBannerB2BAdapterDelegateKt$promoBannerB2BAdapterDelegate$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<PromoBannerB2BVO.BannerVO, ItemPromoBannerB2bBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AdapterDelegateViewBindingViewHolder<PromoBannerB2BVO.BannerVO, ItemPromoBannerB2bBinding> adapterDelegateViewBindingViewHolder) {
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
            PromoBannerB2BVO.BannerVO item = this.$this_adapterDelegateViewBinding.getItem();
            AdapterDelegateViewBindingViewHolder<PromoBannerB2BVO.BannerVO, ItemPromoBannerB2bBinding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            PromoBannerB2BVO.BannerVO bannerVO = item;
            int parseColor = StyleParser.INSTANCE.parseColor(adapterDelegateViewBindingViewHolder.getContext(), (!ThemeExtKt.isDarkThemeActive(adapterDelegateViewBindingViewHolder.getContext()) || bannerVO.getDarkBackgroundColor() == null) ? bannerVO.getBackgroundColor() : bannerVO.getDarkBackgroundColor(), R$color.layer_floor_0);
            ConstraintLayout constraintLayout = adapterDelegateViewBindingViewHolder.getBinding().getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            ViewExtKt.setBackgroundTint(constraintLayout, parseColor);
            TextAtomView bannerTitleTAV = adapterDelegateViewBindingViewHolder.getBinding().bannerTitleTAV;
            Intrinsics.checkNotNullExpressionValue(bannerTitleTAV, "bannerTitleTAV");
            TextAtomHolderKt.bind$default(bannerTitleTAV, bannerVO.getTitle(), null, 2, null);
            TextAtomView bannerDescriptionTAV = adapterDelegateViewBindingViewHolder.getBinding().bannerDescriptionTAV;
            Intrinsics.checkNotNullExpressionValue(bannerDescriptionTAV, "bannerDescriptionTAV");
            TextAtomHolderKt.bind$default(bannerDescriptionTAV, bannerVO.getDescription(), null, 2, null);
            AppCompatImageView bannerImageAPTV = adapterDelegateViewBindingViewHolder.getBinding().bannerImageAPTV;
            Intrinsics.checkNotNullExpressionValue(bannerImageAPTV, "bannerImageAPTV");
            PromoBannerB2BVO.BannerVO.BgImageVO bgImage = bannerVO.getBgImage();
            ImageViewExtKt.load$default(bannerImageAPTV, bgImage != null ? bgImage.getUrl() : null, null, null, null, null, false, null, 126, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PromoBannerB2BAdapterDelegateKt$promoBannerB2BAdapterDelegate$2(Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$onAction = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(AdapterDelegateViewBindingViewHolder adapterDelegateViewBindingViewHolder, Function1 function1, View view) {
        AtomAction action = ((PromoBannerB2BVO.BannerVO) adapterDelegateViewBindingViewHolder.getItem()).getAction();
        if (action != null) {
            function1.invoke(action);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<PromoBannerB2BVO.BannerVO, ItemPromoBannerB2bBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final AdapterDelegateViewBindingViewHolder<PromoBannerB2BVO.BannerVO, ItemPromoBannerB2bBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.getBinding().getConstraintLayout().setClipToOutline(true);
        ConstraintLayout constraintLayout = adapterDelegateViewBinding.getBinding().getConstraintLayout();
        final Function1<AtomAction, Unit> function1 = this.$onAction;
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.travel.feature.b2b.widgets.promoBannerB2B.presentation.adapter.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PromoBannerB2BAdapterDelegateKt$promoBannerB2BAdapterDelegate$2.invoke$lambda$0(AdapterDelegateViewBindingViewHolder.this, function1, view);
            }
        });
        adapterDelegateViewBinding.bind(new AnonymousClass2(adapterDelegateViewBinding));
    }
}
