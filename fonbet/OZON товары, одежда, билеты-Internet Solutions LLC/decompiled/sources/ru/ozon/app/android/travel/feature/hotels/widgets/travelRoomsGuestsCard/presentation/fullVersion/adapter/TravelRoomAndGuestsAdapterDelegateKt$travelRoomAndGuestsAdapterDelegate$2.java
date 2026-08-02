package ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation.fullVersion.adapter;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.travel.feature.hotels.databinding.ItemTravelRoomsGuestsCardBinding;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation.TravelRoomAndGuestsVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation.adapter.TravelGuestListItemDecoration;
import ru.ozon.app.android.travel.molecules.extensions.TextAtomExtensionsKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/TravelRoomAndGuestsVO;", "Lru/ozon/app/android/travel/feature/hotels/databinding/ItemTravelRoomsGuestsCardBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelRoomAndGuestsAdapterDelegateKt$travelRoomAndGuestsAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<TravelRoomAndGuestsVO, ItemTravelRoomsGuestsCardBinding>, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $onCancellationInfoClickHandler;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation.fullVersion.adapter.TravelRoomAndGuestsAdapterDelegateKt$travelRoomAndGuestsAdapterDelegate$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ SmallIconButtonView $cancellationInfoButton;
        final /* synthetic */ TextAtomView $cancellationInfoTextView;
        final /* synthetic */ AtomsAdapter $guestListAdapter;
        final /* synthetic */ TextAtomView $mealInfoTextView;
        final /* synthetic */ Function1<AtomAction, Unit> $onCancellationInfoClickHandler;
        final /* synthetic */ TextAtomView $priceView;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<TravelRoomAndGuestsVO, ItemTravelRoomsGuestsCardBinding> $this_adapterDelegateViewBinding;
        final /* synthetic */ TextAtomView $titleTextView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(AdapterDelegateViewBindingViewHolder<TravelRoomAndGuestsVO, ItemTravelRoomsGuestsCardBinding> adapterDelegateViewBindingViewHolder, TextAtomView textAtomView, TextAtomView textAtomView2, TextAtomView textAtomView3, TextAtomView textAtomView4, SmallIconButtonView smallIconButtonView, Function1<? super AtomAction, Unit> function1, AtomsAdapter atomsAdapter) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$titleTextView = textAtomView;
            this.$priceView = textAtomView2;
            this.$mealInfoTextView = textAtomView3;
            this.$cancellationInfoTextView = textAtomView4;
            this.$cancellationInfoButton = smallIconButtonView;
            this.$onCancellationInfoClickHandler = function1;
            this.$guestListAdapter = atomsAdapter;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            TravelRoomAndGuestsVO item = this.$this_adapterDelegateViewBinding.getItem();
            TextAtomView textAtomView = this.$titleTextView;
            TextAtomView textAtomView2 = this.$priceView;
            AdapterDelegateViewBindingViewHolder<TravelRoomAndGuestsVO, ItemTravelRoomsGuestsCardBinding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            TextAtomView textAtomView3 = this.$mealInfoTextView;
            TextAtomView textAtomView4 = this.$cancellationInfoTextView;
            SmallIconButtonView smallIconButtonView = this.$cancellationInfoButton;
            Function1<AtomAction, Unit> function1 = this.$onCancellationInfoClickHandler;
            AtomsAdapter atomsAdapter = this.$guestListAdapter;
            TravelRoomAndGuestsVO travelRoomAndGuestsVO = item;
            TextAtomHolderKt.bind$default(textAtomView, travelRoomAndGuestsVO.getTitle(), null, 2, null);
            TextAtomHolderKt.bind$default(textAtomView2, TextAtomExtensionsKt.compoundByTextAppearance$default(travelRoomAndGuestsVO.getPrice(), adapterDelegateViewBindingViewHolder.getContext(), travelRoomAndGuestsVO.getPriceDescription(), null, 4, null), null, 2, null);
            TextAtomHolderKt.bind$default(textAtomView3, travelRoomAndGuestsVO.getFeedInfo(), null, 2, null);
            TextAtomHolderKt.bind$default(textAtomView4, travelRoomAndGuestsVO.getCancellationInfo().getTitle(), null, 2, null);
            WrappedIconButtonHolderKt.bind(smallIconButtonView, travelRoomAndGuestsVO.getCancellationInfo().getShowCancellationButton(), function1);
            atomsAdapter.bind(adapterDelegateViewBindingViewHolder.getContext(), adapterDelegateViewBindingViewHolder.getItem().getGuests());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TravelRoomAndGuestsAdapterDelegateKt$travelRoomAndGuestsAdapterDelegate$2(Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$onCancellationInfoClickHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<TravelRoomAndGuestsVO, ItemTravelRoomsGuestsCardBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<TravelRoomAndGuestsVO, ItemTravelRoomsGuestsCardBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        TextAtomView travelRoomTitleTextView = adapterDelegateViewBinding.getBinding().travelRoomTitleTextView;
        Intrinsics.checkNotNullExpressionValue(travelRoomTitleTextView, "travelRoomTitleTextView");
        TextAtomView travelRoomPriceTextView = adapterDelegateViewBinding.getBinding().travelRoomPriceTextView;
        Intrinsics.checkNotNullExpressionValue(travelRoomPriceTextView, "travelRoomPriceTextView");
        TextAtomView travelRoomMealInfoTextView = adapterDelegateViewBinding.getBinding().travelRoomMealInfoTextView;
        Intrinsics.checkNotNullExpressionValue(travelRoomMealInfoTextView, "travelRoomMealInfoTextView");
        TextAtomView travelRoomCancellationInfoTextView = adapterDelegateViewBinding.getBinding().travelRoomCancellationInfoTextView;
        Intrinsics.checkNotNullExpressionValue(travelRoomCancellationInfoTextView, "travelRoomCancellationInfoTextView");
        SmallIconButtonView travelRoomCancellationInfoButton = adapterDelegateViewBinding.getBinding().travelRoomCancellationInfoButton;
        Intrinsics.checkNotNullExpressionValue(travelRoomCancellationInfoButton, "travelRoomCancellationInfoButton");
        VerticalAtomsLayout travelRoomGuestList = adapterDelegateViewBinding.getBinding().travelRoomGuestList;
        Intrinsics.checkNotNullExpressionValue(travelRoomGuestList, "travelRoomGuestList");
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        travelRoomGuestList.setAdapter(atomsAdapter);
        Context context = travelRoomGuestList.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        travelRoomGuestList.setDecorator(new TravelGuestListItemDecoration(context));
        adapterDelegateViewBinding.bind(new AnonymousClass2(adapterDelegateViewBinding, travelRoomTitleTextView, travelRoomPriceTextView, travelRoomMealInfoTextView, travelRoomCancellationInfoTextView, travelRoomCancellationInfoButton, this.$onCancellationInfoClickHandler, atomsAdapter));
    }
}
