package ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.scroller;

import c20.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.data.AddHotelGuestsV5DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.di.AddHotelGuestsV5Component;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v1.CommonInputDTO;
import ru.ozon.app.android.travel.utils.scroller.ScrollerVO;
import ru.ozon.app.android.travel.utils.scroller.ScrollerWidgetViewHolder;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/scroller/AddHotelGuestsScrollerViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/di/AddHotelGuestsV5Component;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5DTO;", "Lru/ozon/app/android/travel/utils/scroller/ScrollerVO;", "<init>", "()V", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5DTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Lru/ozon/app/android/travel/utils/scroller/ScrollerWidgetViewHolder;", "createHolder", "(Ll10/i;)Lru/ozon/app/android/travel/utils/scroller/ScrollerWidgetViewHolder;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AddHotelGuestsScrollerViewMapper extends OverlayWidgetScreenViewItemMapper2<AddHotelGuestsV5Component, AddHotelGuestsV5DTO, ScrollerVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        if (!(state instanceof AddHotelGuestsV5DTO)) {
            return false;
        }
        List<AddHotelGuestsV5DTO.RoomDTO> rooms = ((AddHotelGuestsV5DTO) state).getRooms();
        if ((rooms instanceof Collection) && rooms.isEmpty()) {
            return false;
        }
        Iterator<T> it = rooms.iterator();
        while (it.hasNext()) {
            List<AddHotelGuestsV5DTO.GuestFormDTO> forms = ((AddHotelGuestsV5DTO.RoomDTO) it.next()).getForms();
            if (!(forms instanceof Collection) || !forms.isEmpty()) {
                Iterator<T> it2 = forms.iterator();
                while (it2.hasNext()) {
                    List<CommonInputDTO> inputs = ((AddHotelGuestsV5DTO.GuestFormDTO) it2.next()).getInputs();
                    if (!(inputs instanceof Collection) || !inputs.isEmpty()) {
                        Iterator<T> it3 = inputs.iterator();
                        while (it3.hasNext()) {
                            if (((CommonInputDTO) it3.next()).getScrollOnMount()) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<AddHotelGuestsV5Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return AddHotelGuestsV5Component.INSTANCE.create(storage);
    }

    @Override // c20.r
    @NotNull
    public ScrollerWidgetViewHolder createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new ScrollerWidgetViewHolder(container);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ScrollerVO> map(@NotNull AddHotelGuestsV5DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getScrollerMapper().invoke(state, info);
    }
}
