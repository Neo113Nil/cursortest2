package ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation.compactVersion.adapter;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.hotels.databinding.ItemTravelRoomsGuestsCardCompactBinding;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation.TravelRoomAndGuestsVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation.adapter.TravelGuestListItemDecoration;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/TravelRoomAndGuestsVO;", "Lru/ozon/app/android/travel/feature/hotels/databinding/ItemTravelRoomsGuestsCardCompactBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelRoomAndGuestsCompactAdapterDelegateKt$travelRoomAndGuestsCompactAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<TravelRoomAndGuestsVO, ItemTravelRoomsGuestsCardCompactBinding>, Unit> {
    public static final TravelRoomAndGuestsCompactAdapterDelegateKt$travelRoomAndGuestsCompactAdapterDelegate$2 INSTANCE = new TravelRoomAndGuestsCompactAdapterDelegateKt$travelRoomAndGuestsCompactAdapterDelegate$2();

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation.compactVersion.adapter.TravelRoomAndGuestsCompactAdapterDelegateKt$travelRoomAndGuestsCompactAdapterDelegate$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AtomsAdapter $guestListAdapter;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<TravelRoomAndGuestsVO, ItemTravelRoomsGuestsCardCompactBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AdapterDelegateViewBindingViewHolder<TravelRoomAndGuestsVO, ItemTravelRoomsGuestsCardCompactBinding> adapterDelegateViewBindingViewHolder, AtomsAdapter atomsAdapter) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
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
            AdapterDelegateViewBindingViewHolder<TravelRoomAndGuestsVO, ItemTravelRoomsGuestsCardCompactBinding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            AtomsAdapter atomsAdapter = this.$guestListAdapter;
            TravelRoomAndGuestsVO travelRoomAndGuestsVO = item;
            TextAtomView travelRoomCompactTitleTV = adapterDelegateViewBindingViewHolder.getBinding().travelRoomCompactTitleTV;
            Intrinsics.checkNotNullExpressionValue(travelRoomCompactTitleTV, "travelRoomCompactTitleTV");
            TextAtomHolderKt.bind$default(travelRoomCompactTitleTV, travelRoomAndGuestsVO.getTitle(), null, 2, null);
            TextAtomView travelRoomPriceCompactTV = adapterDelegateViewBindingViewHolder.getBinding().travelRoomPriceCompactTV;
            Intrinsics.checkNotNullExpressionValue(travelRoomPriceCompactTV, "travelRoomPriceCompactTV");
            TextAtomHolderKt.bind$default(travelRoomPriceCompactTV, travelRoomAndGuestsVO.getPrice(), null, 2, null);
            atomsAdapter.bind(adapterDelegateViewBindingViewHolder.getContext(), adapterDelegateViewBindingViewHolder.getItem().getGuests());
        }
    }

    TravelRoomAndGuestsCompactAdapterDelegateKt$travelRoomAndGuestsCompactAdapterDelegate$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<TravelRoomAndGuestsVO, ItemTravelRoomsGuestsCardCompactBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<TravelRoomAndGuestsVO, ItemTravelRoomsGuestsCardCompactBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        VerticalAtomsLayout verticalAtomsLayout = adapterDelegateViewBinding.getBinding().travelRoomGuestListCompactVAL;
        verticalAtomsLayout.setAdapter(atomsAdapter);
        Context context = verticalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        verticalAtomsLayout.setDecorator(new TravelGuestListItemDecoration(context));
        adapterDelegateViewBinding.bind(new AnonymousClass2(adapterDelegateViewBinding, atomsAdapter));
    }
}
