package ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.data.CellHorizontalListDTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.presentation.CellHorizontalListVI;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f*\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/data/CellHorizontalListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/data/CellHorizontalListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/data/CellHorizontalListDTO$CellSettingsDTO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI$CellSettingsVO;", "toVO", "(Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/data/CellHorizontalListDTO$CellSettingsDTO;Landroid/content/Context;)Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI$CellSettingsVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/data/CellHorizontalListDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CellHorizontalListMapper implements Function2<CellHorizontalListDTO, d, List<? extends CellHorizontalListVI>> {

    @NotNull
    private final Context context;

    public CellHorizontalListMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final CellHorizontalListVI.CellSettingsVO toVO(CellHorizontalListDTO.CellSettingsDTO cellSettingsDTO, Context context) {
        Integer minWidth = cellSettingsDTO.getMinWidth();
        int px = minWidth != null ? ResourceExtKt.toPx(minWidth.intValue(), context) : 0;
        Integer minHeight = cellSettingsDTO.getMinHeight();
        return new CellHorizontalListVI.CellSettingsVO(px, minHeight != null ? ResourceExtKt.toPx(minHeight.intValue(), context) : 0);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CellHorizontalListVI> invoke(@NotNull CellHorizontalListDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = state.getTitle();
        List<CellDTO> cells = state.getCells();
        ArrayList arrayList = new ArrayList(C7714v.z(cells, 10));
        for (CellDTO cellDTO : cells) {
            arrayList.add(new CellHorizontalListVI.CellVO(cellDTO.getCenterBlock().getTitle().getText().hashCode(), cellDTO));
        }
        int px = ResourceExtKt.toPx(state.getCellGap().getPx(), this.context);
        TravelWidgetSettingsDTO settings = state.getSettings();
        TravelWidgetSettingsVO vo = settings != null ? MapperExtKt.toVO(settings, this.context) : null;
        CellHorizontalListDTO.CellSettingsDTO cellSettings = state.getCellSettings();
        return C7714v.a0(new CellHorizontalListVI(hashCode, title, arrayList, px, vo, cellSettings != null ? toVO(cellSettings, this.context) : null));
    }
}
