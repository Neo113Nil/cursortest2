package ru.ozon.app.android.travel.molecules.view.serviceBlock.v4.adapters;

import android.view.View;
import android.widget.ImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.molecules.dto.serviceBlock.v4.ServiceBlockV4DTO;
import ru.ozon.app.android.travel.molecules.view.serviceBlock.v4.ServiceBlockV4VO;
import ru.ozon.app.android.travel.molecules.view.serviceBlock.v4.adapters.ServiceBlockV4CopyAdapterDelegateKt$serviceBlockV4CopyAdapterDelegate$2;
import ru.ozon.app.android.travel.ui.molecules.databinding.ItemServiceBlockCopyBinding;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/molecules/view/serviceBlock/v4/ServiceBlockV4VO$CopyBlockVO;", "Lru/ozon/app/android/travel/ui/molecules/databinding/ItemServiceBlockCopyBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ServiceBlockV4CopyAdapterDelegateKt$serviceBlockV4CopyAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<ServiceBlockV4VO.CopyBlockVO, ItemServiceBlockCopyBinding>, Unit> {
    final /* synthetic */ Function1<ServiceBlockV4DTO.CopyAction, Unit> $copyHandler;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.molecules.view.serviceBlock.v4.adapters.ServiceBlockV4CopyAdapterDelegateKt$serviceBlockV4CopyAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ Function1<ServiceBlockV4DTO.CopyAction, Unit> $copyHandler;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<ServiceBlockV4VO.CopyBlockVO, ItemServiceBlockCopyBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<ServiceBlockV4VO.CopyBlockVO, ItemServiceBlockCopyBinding> adapterDelegateViewBindingViewHolder, Function1<? super ServiceBlockV4DTO.CopyAction, Unit> function1) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$copyHandler = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2$lambda$1(ServiceBlockV4VO.CopyBlockVO copyBlockVO, Function1 function1, View view) {
            ServiceBlockV4DTO.CopyAction action = copyBlockVO.getClipboard().getAction();
            if (function1 != null) {
                function1.invoke(action);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ServiceBlockV4VO.CopyBlockVO item = this.$this_adapterDelegateViewBinding.getItem();
            AdapterDelegateViewBindingViewHolder<ServiceBlockV4VO.CopyBlockVO, ItemServiceBlockCopyBinding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            final Function1<ServiceBlockV4DTO.CopyAction, Unit> function1 = this.$copyHandler;
            final ServiceBlockV4VO.CopyBlockVO copyBlockVO = item;
            TextAtomView copyTextTAV = adapterDelegateViewBindingViewHolder.getBinding().copyTextTAV;
            Intrinsics.checkNotNullExpressionValue(copyTextTAV, "copyTextTAV");
            TextAtomHolderKt.bind$default(copyTextTAV, copyBlockVO.getText(), null, 2, null);
            ImageView copyIconIV = adapterDelegateViewBindingViewHolder.getBinding().copyIconIV;
            Intrinsics.checkNotNullExpressionValue(copyIconIV, "copyIconIV");
            ImageViewExtKt.load$default(copyIconIV, copyBlockVO.getClipboard().getIcon(), null, null, null, null, false, null, 126, null);
            adapterDelegateViewBindingViewHolder.getBinding().copyIconIV.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.travel.molecules.view.serviceBlock.v4.adapters.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ServiceBlockV4CopyAdapterDelegateKt$serviceBlockV4CopyAdapterDelegate$2.AnonymousClass1.invoke$lambda$2$lambda$1(ServiceBlockV4VO.CopyBlockVO.this, function1, view);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ServiceBlockV4CopyAdapterDelegateKt$serviceBlockV4CopyAdapterDelegate$2(Function1<? super ServiceBlockV4DTO.CopyAction, Unit> function1) {
        super(1);
        this.$copyHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<ServiceBlockV4VO.CopyBlockVO, ItemServiceBlockCopyBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<ServiceBlockV4VO.CopyBlockVO, ItemServiceBlockCopyBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding, this.$copyHandler));
    }
}
