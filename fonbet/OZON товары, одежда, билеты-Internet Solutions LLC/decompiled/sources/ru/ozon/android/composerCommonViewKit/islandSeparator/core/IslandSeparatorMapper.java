package ru.ozon.android.composerCommonViewKit.islandSeparator.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorVO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/android/composerCommonViewKit/islandSeparator/core/IslandSeparatorMapper;", "Lkotlin/Function2;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "Ll20/d;", "", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorVO;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/core/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;J)Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;Ll20/d;)Ljava/util/List;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IslandSeparatorMapper implements Function2<IslandSeparatorDTO, d, List<? extends IslandSeparatorVO>> {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
    
        if (r0 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final IslandSeparatorVO toVo(IslandSeparatorDTO islandSeparatorDTO, long j11) {
        boolean z11;
        IslandSeparatorDTO.Configuration configuration = islandSeparatorDTO.getConfiguration();
        if (configuration != null) {
            if (configuration == IslandSeparatorDTO.Configuration.INVALID) {
                configuration = null;
            }
        }
        configuration = IslandSeparatorDTO.Configuration.BETWEEN_SECTIONS;
        Integer physicalPartHeight = islandSeparatorDTO.getPhysicalPartHeight();
        int px = physicalPartHeight != null ? UiExtKt.toPx(physicalPartHeight.intValue()) : IslandSeparatorMapperKt.DEFAULT_SEPARATOR_HEIGHT;
        String color = islandSeparatorDTO.getColor();
        if (color == null) {
            color = StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_PRIMARY.getValue();
        }
        String str = color;
        boolean z12 = false;
        if (configuration == IslandSeparatorDTO.Configuration.SECTION_END || configuration == IslandSeparatorDTO.Configuration.BETWEEN_SECTIONS) {
            z11 = false;
            z12 = true;
        } else {
            z11 = false;
        }
        boolean z13 = (configuration == IslandSeparatorDTO.Configuration.SECTION_BEGIN || configuration == IslandSeparatorDTO.Configuration.BETWEEN_SECTIONS) ? true : z11;
        Boolean isSticky = islandSeparatorDTO.isSticky();
        boolean booleanValue = isSticky != null ? isSticky.booleanValue() : z11;
        String stickyGroupTag = islandSeparatorDTO.getStickyGroupTag();
        Boolean isOverlay = islandSeparatorDTO.isOverlay();
        return new IslandSeparatorVO(j11, px, str, z12, z13, booleanValue, stickyGroupTag, isOverlay != null ? isOverlay.booleanValue() : z11);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<IslandSeparatorVO> invoke(@NotNull IslandSeparatorDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d().hashCode()));
    }
}
