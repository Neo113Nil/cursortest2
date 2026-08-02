package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetailsFull.presentation.adapter;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
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
import ru.ozon.app.android.travel.feature.hotels.databinding.ItemHotelsPageDetailsFullServiceDetailBinding;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetailsFull.presentation.HotelsPageDetailsFullVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/presentation/HotelsPageDetailsFullVO$ServicesVO;", "Lru/ozon/app/android/travel/feature/hotels/databinding/ItemHotelsPageDetailsFullServiceDetailBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsPageDetailsFullServiceAdapterDelegateKt$hotelsPageDetailsFullServiceAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<HotelsPageDetailsFullVO.ServicesVO, ItemHotelsPageDetailsFullServiceDetailBinding>, Unit> {
    public static final HotelsPageDetailsFullServiceAdapterDelegateKt$hotelsPageDetailsFullServiceAdapterDelegate$2 INSTANCE = new HotelsPageDetailsFullServiceAdapterDelegateKt$hotelsPageDetailsFullServiceAdapterDelegate$2();

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetailsFull.presentation.adapter.HotelsPageDetailsFullServiceAdapterDelegateKt$hotelsPageDetailsFullServiceAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<HotelsPageDetailsFullVO.ServicesVO, ItemHotelsPageDetailsFullServiceDetailBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<HotelsPageDetailsFullVO.ServicesVO, ItemHotelsPageDetailsFullServiceDetailBinding> adapterDelegateViewBindingViewHolder) {
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
            HotelsPageDetailsFullVO.ServicesVO item = this.$this_adapterDelegateViewBinding.getItem();
            final AdapterDelegateViewBindingViewHolder<HotelsPageDetailsFullVO.ServicesVO, ItemHotelsPageDetailsFullServiceDetailBinding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            final HotelsPageDetailsFullVO.ServicesVO servicesVO = item;
            AppCompatImageView appCompatImageView = adapterDelegateViewBindingViewHolder.getBinding().iconHotelServiceIV;
            Intrinsics.f(appCompatImageView);
            ImageViewExtKt.load$default(appCompatImageView, servicesVO.getIcon().getImage(), null, null, null, null, false, null, 126, null);
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = appCompatImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ThemeExtKt.tint(appCompatImageView, styleParser.parseColor(context, servicesVO.getIcon().getTintColor()));
            TextAtomView titleHotelServiceTAV = adapterDelegateViewBindingViewHolder.getBinding().titleHotelServiceTAV;
            Intrinsics.checkNotNullExpressionValue(titleHotelServiceTAV, "titleHotelServiceTAV");
            TextAtomHolderKt.bind$default(titleHotelServiceTAV, servicesVO.getTitle(), null, 2, null);
            if (servicesVO.getShortServicesSet() == null || servicesVO.getShowMoreButtonTitle() == null) {
                adapterDelegateViewBindingViewHolder.getBinding().setHotelServiceTAV.setText(servicesVO.getFullServicesSet());
                return;
            }
            ClickableSpan clickableSpan = new ClickableSpan() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetailsFull.presentation.adapter.HotelsPageDetailsFullServiceAdapterDelegateKt$hotelsPageDetailsFullServiceAdapterDelegate$2$1$1$showMoreSpan$1
                @Override // android.text.style.ClickableSpan
                public void onClick(View widget) {
                    Intrinsics.checkNotNullParameter(widget, "widget");
                    adapterDelegateViewBindingViewHolder.getBinding().setHotelServiceTAV.setText(servicesVO.getFullServicesSet());
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint ds) {
                    Intrinsics.checkNotNullParameter(ds, "ds");
                    super.updateDrawState(ds);
                    ds.setUnderlineText(false);
                    ds.setColor(ThemeExtKt.themeColor(adapterDelegateViewBindingViewHolder.getContext(), R$attr.textAction));
                }
            };
            SpannableStringBuilder append = new SpannableStringBuilder(servicesVO.getShortServicesSet()).append((CharSequence) " ").append((CharSequence) servicesVO.getShowMoreButtonTitle());
            int length = servicesVO.getShortServicesSet().length() + 1;
            append.setSpan(clickableSpan, length, servicesVO.getShowMoreButtonTitle().length() + length, 33);
            adapterDelegateViewBindingViewHolder.getBinding().setHotelServiceTAV.setText(append);
            adapterDelegateViewBindingViewHolder.getBinding().setHotelServiceTAV.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    HotelsPageDetailsFullServiceAdapterDelegateKt$hotelsPageDetailsFullServiceAdapterDelegate$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<HotelsPageDetailsFullVO.ServicesVO, ItemHotelsPageDetailsFullServiceDetailBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<HotelsPageDetailsFullVO.ServicesVO, ItemHotelsPageDetailsFullServiceDetailBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding));
    }
}
