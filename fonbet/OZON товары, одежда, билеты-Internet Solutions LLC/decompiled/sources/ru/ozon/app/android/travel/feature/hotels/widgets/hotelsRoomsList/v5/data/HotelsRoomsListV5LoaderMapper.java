package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.data;

import Kk.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.loader.HotelsRoomsListV5LoaderVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \r2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\rB\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5LoaderMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/HotelsRoomsListV5LoaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5DTO;Ll20/d;)Ljava/util/List;", "Companion", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsListV5LoaderMapper implements Function2<HotelsRoomsListV5DTO, d, List<? extends HotelsRoomsListV5LoaderVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/data/HotelsRoomsListV5LoaderMapper$Companion;", "", "<init>", "()V", "SINGLE_ROOM_PLACEHOLDERS_COUNT", "", "DEFAULT_ROOM_BADGE_PLACEHOLDERS_COUNT", "DEFAULT_TARIFF_PLACEHOLDERS_COUNT", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsRoomsListV5LoaderVO> invoke(@NotNull HotelsRoomsListV5DTO state, @NotNull d widgetInfo) {
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        CommonControlSettings controlSettings = state.getControlSettings();
        if (controlSettings != null && (action = controlSettings.getAction()) != null) {
            long a11 = c.a(widgetInfo.d(), "loader");
            AtomAction atomAction = AtomActionMapperKt.toAtomAction(action, state.getControlSettings().getTrackingInfo());
            ArrayList arrayList = new ArrayList(1);
            ArrayList arrayList2 = new ArrayList(4);
            for (int i11 = 0; i11 < 4; i11++) {
                arrayList2.add(HotelsRoomsListV5LoaderVO.PlaceholderVO.RoomBadge.INSTANCE);
            }
            ArrayList arrayList3 = new ArrayList(2);
            for (int i12 = 0; i12 < 2; i12++) {
                arrayList3.add(HotelsRoomsListV5LoaderVO.PlaceholderVO.Tariff.INSTANCE);
            }
            arrayList.add(new HotelsRoomsListV5LoaderVO.PlaceholderVO.Room(arrayList2, arrayList3));
            List<HotelsRoomsListV5LoaderVO> a02 = C7714v.a0(new HotelsRoomsListV5LoaderVO(a11, atomAction, arrayList));
            if (a02 != null) {
                return a02;
            }
        }
        return K.f71697a;
    }
}
