package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v1.presentation.adapters;

import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.hotels.databinding.ItemHotelsRoomsDetailsFullInfoCardBinding;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v1.presentation.InfoCardVO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsDetailsFull/v1/presentation/InfoCardVO;", "Lru/ozon/app/android/travel/feature/hotels/databinding/ItemHotelsRoomsDetailsFullInfoCardBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsRoomsDetailsFullInfoCardAdapterDelegateKt$hotelsRoomsDetailsFullInfoCardAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<InfoCardVO, ItemHotelsRoomsDetailsFullInfoCardBinding>, Unit> {
    public static final HotelsRoomsDetailsFullInfoCardAdapterDelegateKt$hotelsRoomsDetailsFullInfoCardAdapterDelegate$2 INSTANCE = new HotelsRoomsDetailsFullInfoCardAdapterDelegateKt$hotelsRoomsDetailsFullInfoCardAdapterDelegate$2();

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsDetailsFull.v1.presentation.adapters.HotelsRoomsDetailsFullInfoCardAdapterDelegateKt$hotelsRoomsDetailsFullInfoCardAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<InfoCardVO, ItemHotelsRoomsDetailsFullInfoCardBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<InfoCardVO, ItemHotelsRoomsDetailsFullInfoCardBinding> adapterDelegateViewBindingViewHolder) {
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
            AppCompatImageView appCompatImageView = this.$this_adapterDelegateViewBinding.getBinding().hotelsRoomsDetailsInfoCardIv;
            AdapterDelegateViewBindingViewHolder<InfoCardVO, ItemHotelsRoomsDetailsFullInfoCardBinding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            Intrinsics.f(appCompatImageView);
            ImageViewExtKt.load$default(appCompatImageView, adapterDelegateViewBindingViewHolder.getItem().getIcon().getImage(), null, null, null, null, false, null, 126, null);
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = appCompatImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ThemeExtKt.tint(appCompatImageView, styleParser.parseColor(context, adapterDelegateViewBindingViewHolder.getItem().getIcon().getTintColor()));
            TextAtomView hotelsRoomsDetailsInfoCardKeyTAV = this.$this_adapterDelegateViewBinding.getBinding().hotelsRoomsDetailsInfoCardKeyTAV;
            Intrinsics.checkNotNullExpressionValue(hotelsRoomsDetailsInfoCardKeyTAV, "hotelsRoomsDetailsInfoCardKeyTAV");
            TextAtomHolderKt.bind$default(hotelsRoomsDetailsInfoCardKeyTAV, this.$this_adapterDelegateViewBinding.getItem().getInfoKey(), null, 2, null);
            TextAtomView hotelsRoomsDetailsInfoCardValueTAV = this.$this_adapterDelegateViewBinding.getBinding().hotelsRoomsDetailsInfoCardValueTAV;
            Intrinsics.checkNotNullExpressionValue(hotelsRoomsDetailsInfoCardValueTAV, "hotelsRoomsDetailsInfoCardValueTAV");
            TextAtomHolderKt.bind$default(hotelsRoomsDetailsInfoCardValueTAV, this.$this_adapterDelegateViewBinding.getItem().getInfoValue(), null, 2, null);
        }
    }

    HotelsRoomsDetailsFullInfoCardAdapterDelegateKt$hotelsRoomsDetailsFullInfoCardAdapterDelegate$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<InfoCardVO, ItemHotelsRoomsDetailsFullInfoCardBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<InfoCardVO, ItemHotelsRoomsDetailsFullInfoCardBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding));
    }
}
