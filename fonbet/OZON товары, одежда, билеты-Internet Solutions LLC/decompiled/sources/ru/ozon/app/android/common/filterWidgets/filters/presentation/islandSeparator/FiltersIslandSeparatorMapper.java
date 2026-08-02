package ru.ozon.app.android.common.filterWidgets.filters.presentation.islandSeparator;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/filters/presentation/islandSeparator/FiltersIslandSeparatorMapper;", "Lkotlin/Function2;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "Ll20/d;", "", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/islandSeparator/FiltersIslandSeparatorVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;J)Lru/ozon/app/android/common/filterWidgets/filters/presentation/islandSeparator/FiltersIslandSeparatorVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;Ll20/d;)Ljava/util/List;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FiltersIslandSeparatorMapper implements Function2<IslandSeparatorDTO, d, List<? extends FiltersIslandSeparatorVO>> {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
    
        if (r0 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final FiltersIslandSeparatorVO toVo(IslandSeparatorDTO islandSeparatorDTO, long j11) {
        IslandSeparatorDTO.Configuration configuration = islandSeparatorDTO.getConfiguration();
        if (configuration != null) {
            if (configuration == IslandSeparatorDTO.Configuration.INVALID) {
                configuration = null;
            }
        }
        configuration = IslandSeparatorDTO.Configuration.BETWEEN_SECTIONS;
        Integer physicalPartHeight = islandSeparatorDTO.getPhysicalPartHeight();
        int intValue = physicalPartHeight != null ? physicalPartHeight.intValue() : 4;
        String color = islandSeparatorDTO.getColor();
        if (color == null) {
            color = UniColors.LAYER_FLOOR_0.getToken();
        }
        return new FiltersIslandSeparatorVO(j11, intValue, color, configuration == IslandSeparatorDTO.Configuration.SECTION_END || configuration == IslandSeparatorDTO.Configuration.BETWEEN_SECTIONS, configuration == IslandSeparatorDTO.Configuration.SECTION_BEGIN || configuration == IslandSeparatorDTO.Configuration.BETWEEN_SECTIONS);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<FiltersIslandSeparatorVO> invoke(@NotNull IslandSeparatorDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d().hashCode()));
    }
}
