package ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation.compactVersion.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.hotels.databinding.ItemTravelRoomsGuestsCardCompactBinding;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/hotels/databinding/ItemTravelRoomsGuestsCardCompactBinding;", "layoutInflater", "Landroid/view/LayoutInflater;", "root", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelRoomAndGuestsCompactAdapterDelegateKt$travelRoomAndGuestsCompactAdapterDelegate$1 extends AbstractC7737t implements Function2<LayoutInflater, ViewGroup, ItemTravelRoomsGuestsCardCompactBinding> {
    public static final TravelRoomAndGuestsCompactAdapterDelegateKt$travelRoomAndGuestsCompactAdapterDelegate$1 INSTANCE = new TravelRoomAndGuestsCompactAdapterDelegateKt$travelRoomAndGuestsCompactAdapterDelegate$1();

    TravelRoomAndGuestsCompactAdapterDelegateKt$travelRoomAndGuestsCompactAdapterDelegate$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final ItemTravelRoomsGuestsCardCompactBinding invoke(LayoutInflater layoutInflater, ViewGroup root) {
        Intrinsics.checkNotNullParameter(layoutInflater, "layoutInflater");
        Intrinsics.checkNotNullParameter(root, "root");
        ItemTravelRoomsGuestsCardCompactBinding inflate = ItemTravelRoomsGuestsCardCompactBinding.inflate(layoutInflater, root, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }
}
