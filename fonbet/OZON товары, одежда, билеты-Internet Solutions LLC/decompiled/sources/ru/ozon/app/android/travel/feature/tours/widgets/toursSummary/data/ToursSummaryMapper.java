package ru.ozon.app.android.travel.feature.tours.widgets.toursSummary.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSummary.data.ToursSummaryDTO;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSummary.presentation.ToursSummaryVO;
import ru.ozon.app.android.travel.molecules.view.travelCellList.v1.TravelCellListVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00162*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0016B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u0003j\u0002`\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSummary/data/ToursSummaryMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSummary/data/ToursSummaryDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSummary/presentation/ToursSummaryVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursSummary/data/ToursSummaryDTO;Ll20/d;)Ljava/util/List;", "", "dp4", "I", "dp8", "dp12", "dp16", "Companion", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursSummaryMapper implements Function2<ToursSummaryDTO, d, List<? extends ToursSummaryVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final int dp12;
    private final int dp16;
    private final int dp4;
    private final int dp8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSummary/data/ToursSummaryMapper$Companion;", "", "<init>", "()V", "CELLS_RADIUS", "", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ToursSummaryMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp12 = ResourceExtKt.toPx(12, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ToursSummaryVO> invoke(@NotNull ToursSummaryDTO state, @NotNull d widgetInfo) {
        Object items;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<ToursSummaryDTO.InfoBlock> infoBlocks = state.getInfoBlocks();
        ArrayList arrayList = new ArrayList(C7714v.z(infoBlocks, 10));
        int i11 = 0;
        for (Object obj : infoBlocks) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ToursSummaryDTO.InfoBlock infoBlock = (ToursSummaryDTO.InfoBlock) obj;
            int i13 = i11 == 0 ? state.getTitle() == null ? this.dp16 : this.dp8 : this.dp12;
            int i14 = infoBlock.getTitle() == null ? this.dp16 : this.dp4;
            long hashCode = (i11 + "_" + widgetInfo.d()).hashCode();
            TextAtom title = infoBlock.getTitle();
            if (title == null || (items = title.getText()) == null) {
                items = infoBlock.getItems();
            }
            arrayList.add(new ToursSummaryVO(hashCode, new TravelCellListVO(items.hashCode(), infoBlock.getTitle(), UniColors.BG_SECONDARY.getToken(), 16, 16, i14, infoBlock.getItems()), i13));
            i11 = i12;
        }
        return arrayList;
    }
}
