package ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.presentation.list.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.travel.feature.b2b.databinding.ItemTravelDocumentsToEmailEmailBinding;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.presentation.list.TravelDocumentsToEmailListVO;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/TravelDocumentsToEmailListVO$Email;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/adapter/TravelEmail;", "Lru/ozon/app/android/travel/feature/b2b/databinding/ItemTravelDocumentsToEmailEmailBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class TravelEmailAdapterDelegateKt$travelEmailAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<TravelDocumentsToEmailListVO.Email, ItemTravelDocumentsToEmailEmailBinding>, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.presentation.list.adapter.TravelEmailAdapterDelegateKt$travelEmailAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ Function1<AtomAction, Unit> $onAction;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<TravelDocumentsToEmailListVO.Email, ItemTravelDocumentsToEmailEmailBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<TravelDocumentsToEmailListVO.Email, ItemTravelDocumentsToEmailEmailBinding> adapterDelegateViewBindingViewHolder, Function1<? super AtomAction, Unit> function1) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$onAction = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            TextAtomView emailTitle = this.$this_adapterDelegateViewBinding.getBinding().emailTitle;
            Intrinsics.checkNotNullExpressionValue(emailTitle, "emailTitle");
            TextAtomHolderKt.bind$default(emailTitle, this.$this_adapterDelegateViewBinding.getItem().getEmail(), null, 2, null);
            SmallIconButtonView emailIcon = this.$this_adapterDelegateViewBinding.getBinding().emailIcon;
            Intrinsics.checkNotNullExpressionValue(emailIcon, "emailIcon");
            WrappedIconButtonHolderKt.bind(emailIcon, this.$this_adapterDelegateViewBinding.getItem().getRemoveButton(), this.$onAction);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TravelEmailAdapterDelegateKt$travelEmailAdapterDelegate$2(Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$onAction = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<TravelDocumentsToEmailListVO.Email, ItemTravelDocumentsToEmailEmailBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<TravelDocumentsToEmailListVO.Email, ItemTravelDocumentsToEmailEmailBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding, this.$onAction));
    }
}
