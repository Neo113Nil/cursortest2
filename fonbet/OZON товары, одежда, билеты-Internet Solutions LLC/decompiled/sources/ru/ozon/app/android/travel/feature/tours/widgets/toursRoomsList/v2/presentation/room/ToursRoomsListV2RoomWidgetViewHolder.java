package ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.presentation.room;

import Vg.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.gallery.GalleryActivity;
import ru.ozon.app.android.gallery.GalleryRequest;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.presentation.room.images.ToursRoomsListV2ImagesAdapter;
import ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.view.ToursRoomsListV2RoomView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/room/ToursRoomsListV2RoomWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/room/ToursRoomsListV2RoomVO;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/view/ToursRoomsListV2RoomView;", "containerView", "Ll10/i;", "composerReferences", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/view/ToursRoomsListV2RoomView;Ll10/i;LVg/d;)V", "", "position", "", "onImageClicked", "(I)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/room/ToursRoomsListV2RoomVO;Ll20/d;)V", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/view/ToursRoomsListV2RoomView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/room/images/ToursRoomsListV2ImagesAdapter;", "imagesAdapter", "Lru/ozon/app/android/travel/feature/tours/widgets/toursRoomsList/v2/presentation/room/images/ToursRoomsListV2ImagesAdapter;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursRoomsListV2RoomWidgetViewHolder extends k<ToursRoomsListV2RoomVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ToursRoomsListV2RoomView containerView;

    @NotNull
    private final ToursRoomsListV2ImagesAdapter imagesAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursRoomsListV2RoomWidgetViewHolder(@NotNull ToursRoomsListV2RoomView containerView, @NotNull i composerReferences, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.containerView = containerView;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).customActionHandlers(new ToursRoomsListV2RoomWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        ToursRoomsListV2ImagesAdapter toursRoomsListV2ImagesAdapter = new ToursRoomsListV2ImagesAdapter(this, new ToursRoomsListV2RoomWidgetViewHolder$imagesAdapter$1(this));
        this.imagesAdapter = toursRoomsListV2ImagesAdapter;
        containerView.setupAdapter(toursRoomsListV2ImagesAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onImageClicked(int position) {
        List<String> images;
        ToursRoomsListV2RoomVO boundData = getBoundData();
        if (boundData == null || (images = boundData.getImages()) == null) {
            return;
        }
        List<String> list = images;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new GalleryRequest.GalleryItem.Image((String) it.next(), null, false, 6, null));
        }
        getContext().startActivity(GalleryActivity.INSTANCE.newIntent(getContext(), new GalleryRequest(arrayList, position)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ToursRoomsListV2RoomVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.bind(item, this.actionHandler);
    }
}
