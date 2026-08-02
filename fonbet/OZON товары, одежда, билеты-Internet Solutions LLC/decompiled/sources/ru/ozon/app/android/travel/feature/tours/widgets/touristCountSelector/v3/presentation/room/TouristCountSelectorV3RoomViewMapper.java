package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.data.TouristCountSelectorV3DTO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.di.TouristCountSelectorV3Component;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.view.TouristCountSelectorV3RoomView;
import ru.ozon.app.android.utils.CollectionExtKt;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00132\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\u0004\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R,\u0010)\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R(\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070-0\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R0\u00105\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u000602j\u0002`3\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00130&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010,¨\u00066"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/di/TouristCountSelectorV3Component;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomsDecoration;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "newItem", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomPayload;", "getPayload", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TouristCountSelectorV3RoomViewMapper extends WidgetViewMapper2<TouristCountSelectorV3Component, TouristCountSelectorV3DTO, TouristCountSelectorV3RoomVO> {
    private final Integer layout;

    @NotNull
    private final Function2<View, ComposerReferences, TouristCountSelectorV3RoomWidgetViewHolder> holderProducer = new TouristCountSelectorV3RoomViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(TouristCountSelectorV3RoomUpdate.class, TouristCountSelectorV3RoomsUpdate.class);

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TouristCountSelectorV3RoomView touristCountSelectorV3RoomView = new TouristCountSelectorV3RoomView(context, null, 0, 0, 14, null);
        touristCountSelectorV3RoomView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return touristCountSelectorV3RoomView;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<TouristCountSelectorV3RoomsDecoration> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new TouristCountSelectorV3RoomsDecoration(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, TouristCountSelectorV3RoomWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TouristCountSelectorV3DTO, d, List<TouristCountSelectorV3RoomVO>> getMapper() {
        return component().getRoomsMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TouristCountSelectorV3Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return TouristCountSelectorV3Component.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<TouristCountSelectorV3RoomPayload> getPayload(@NotNull TouristCountSelectorV3RoomVO oldItem, @NotNull TouristCountSelectorV3RoomVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        if (!Intrinsics.d(oldItem.getRoomTitle(), newItem.getRoomTitle()) || oldItem.getIsRoomTitleVisible() != newItem.getIsRoomTitleVisible()) {
            arrayList.add(TouristCountSelectorV3RoomPayload.TITLE);
        }
        if (oldItem.getIsDeleteRoomButtonVisible() != newItem.getIsDeleteRoomButtonVisible()) {
            arrayList.add(TouristCountSelectorV3RoomPayload.DELETE_BUTTON);
        }
        if (!CollectionExtKt.deepEquals(oldItem.getGuests(), newItem.getGuests())) {
            arrayList.add(TouristCountSelectorV3RoomPayload.GUESTS);
        }
        if (!CollectionExtKt.deepEquals(oldItem.getChildForms(), newItem.getChildForms())) {
            arrayList.add(TouristCountSelectorV3RoomPayload.FORMS);
        }
        if (oldItem.getIsRoomVisible() != newItem.getIsRoomVisible()) {
            arrayList.add(TouristCountSelectorV3RoomPayload.VISIBILITY);
        }
        return arrayList;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public TouristCountSelectorV3RoomVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull TouristCountSelectorV3RoomVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Object obj = null;
        if (update instanceof TouristCountSelectorV3RoomUpdate) {
            TouristCountSelectorV3RoomVO room = ((TouristCountSelectorV3RoomUpdate) update).getRoom();
            if (room.getId() == oldItem.getId()) {
                return room;
            }
            return null;
        }
        if (!(update instanceof TouristCountSelectorV3RoomsUpdate)) {
            return null;
        }
        Iterator<T> it = ((TouristCountSelectorV3RoomsUpdate) update).getRooms().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((TouristCountSelectorV3RoomVO) next).getId() == oldItem.getId()) {
                obj = next;
                break;
            }
        }
        return (TouristCountSelectorV3RoomVO) obj;
    }
}
