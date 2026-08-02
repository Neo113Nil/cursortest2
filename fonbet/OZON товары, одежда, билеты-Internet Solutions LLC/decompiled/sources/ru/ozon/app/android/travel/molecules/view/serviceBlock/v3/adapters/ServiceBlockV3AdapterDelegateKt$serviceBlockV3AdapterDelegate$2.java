package ru.ozon.app.android.travel.molecules.view.serviceBlock.v3.adapters;

import android.content.Context;
import android.widget.ImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.atoms.data.list.ListElementAtom;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.molecules.dto.serviceBlock.v3.ServiceBlockV3DTO;
import ru.ozon.app.android.travel.ui.molecules.databinding.ItemServiceBlockAdditionalInfoBinding;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/molecules/dto/serviceBlock/v3/ServiceBlockV3DTO$AdditionalInfo;", "Lru/ozon/app/android/travel/ui/molecules/databinding/ItemServiceBlockAdditionalInfoBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ServiceBlockV3AdapterDelegateKt$serviceBlockV3AdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<ServiceBlockV3DTO.AdditionalInfo, ItemServiceBlockAdditionalInfoBinding>, Unit> {
    public static final ServiceBlockV3AdapterDelegateKt$serviceBlockV3AdapterDelegate$2 INSTANCE = new ServiceBlockV3AdapterDelegateKt$serviceBlockV3AdapterDelegate$2();

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.molecules.view.serviceBlock.v3.adapters.ServiceBlockV3AdapterDelegateKt$serviceBlockV3AdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<ServiceBlockV3DTO.AdditionalInfo, ItemServiceBlockAdditionalInfoBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<ServiceBlockV3DTO.AdditionalInfo, ItemServiceBlockAdditionalInfoBinding> adapterDelegateViewBindingViewHolder) {
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
            ServiceBlockV3DTO.AdditionalInfo item = this.$this_adapterDelegateViewBinding.getItem();
            AdapterDelegateViewBindingViewHolder<ServiceBlockV3DTO.AdditionalInfo, ItemServiceBlockAdditionalInfoBinding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            ServiceBlockV3DTO.AdditionalInfo additionalInfo = item;
            TextAtomView descriptionTAV = adapterDelegateViewBindingViewHolder.getBinding().descriptionTAV;
            Intrinsics.checkNotNullExpressionValue(descriptionTAV, "descriptionTAV");
            TextAtomHolderKt.bind$default(descriptionTAV, additionalInfo.getInfo(), null, 2, null);
            ImageView iconIV = adapterDelegateViewBindingViewHolder.getBinding().iconIV;
            Intrinsics.checkNotNullExpressionValue(iconIV, "iconIV");
            iconIV.setVisibility(additionalInfo.getIcon() != null ? 0 : 8);
            ImageView imageView = adapterDelegateViewBindingViewHolder.getBinding().iconIV;
            Intrinsics.f(imageView);
            ListElementAtom.Marker.Icon icon = additionalInfo.getIcon();
            ImageViewExtKt.load$default(imageView, icon != null ? icon.getImage() : null, null, null, null, null, false, null, 126, null);
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ListElementAtom.Marker.Icon icon2 = additionalInfo.getIcon();
            ThemeExtKt.tint(imageView, styleParser.parseColor(context, icon2 != null ? icon2.getTintColor() : null));
        }
    }

    ServiceBlockV3AdapterDelegateKt$serviceBlockV3AdapterDelegate$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<ServiceBlockV3DTO.AdditionalInfo, ItemServiceBlockAdditionalInfoBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<ServiceBlockV3DTO.AdditionalInfo, ItemServiceBlockAdditionalInfoBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding));
    }
}
