package ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.data;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.data.ToursMealDTO;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.presentation.ToursMealVO;
import ru.ozon.app.android.travel.molecules.view.travelCellList.v1.TravelCellListVO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000e2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u000eB\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/data/ToursMealMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/data/ToursMealDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/ToursMealVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/data/ToursMealDTO;Ll20/d;)Ljava/util/List;", "Companion", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToursMealMapper implements Function2<ToursMealDTO, d, List<? extends ToursMealVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/data/ToursMealMapper$Companion;", "", "<init>", "()V", "CELLS_RADIUS", "", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ToursMealVO> invoke(@NotNull ToursMealDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<ToursMealDTO.CellsBlockDTO> blocks = state.getBlocks();
        ArrayList arrayList = new ArrayList(C7714v.z(blocks, 10));
        int i11 = 0;
        for (Object obj : blocks) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ToursMealDTO.CellsBlockDTO cellsBlockDTO = (ToursMealDTO.CellsBlockDTO) obj;
            String d11 = widgetInfo.d();
            arrayList.add(new ToursMealVO((i11 + "-" + d11).hashCode(), new TravelCellListVO(cellsBlockDTO.getTitle().getText().hashCode(), cellsBlockDTO.getTitle(), UniColors.BG_SECONDARY.getToken(), 16, 16, 0, cellsBlockDTO.getCells()), null, false, null, false, 60, null));
            i11 = i12;
        }
        return arrayList;
    }
}
