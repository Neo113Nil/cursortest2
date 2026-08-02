package ru.ozon.app.android.returns.ui.molecules.bottomEars.presentation.viewMapper;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorVO;
import ru.ozon.app.android.delivery.common.AppTokensProvider;
import ru.ozon.app.android.returns.ui.molecules.bottomEars.data.StickyBottomEarsDTO;
import ru.ozon.app.android.returns.ui.molecules.bottomEars.presentation.viewItem.StickyBottomEarsVI;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/bottomEars/presentation/viewMapper/StickyBottomEarsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/returns/ui/molecules/bottomEars/data/StickyBottomEarsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/returns/ui/molecules/bottomEars/presentation/viewItem/StickyBottomEarsVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;", "", "id", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorVO;", "toVo", "(Lru/ozon/android/composerCommonViewKit/islandSeparator/data/IslandSeparatorDTO;J)Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/returns/ui/molecules/bottomEars/data/StickyBottomEarsDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StickyBottomEarsMapper implements Function2<StickyBottomEarsDTO, d, List<? extends StickyBottomEarsVI>> {

    @NotNull
    private final Context appContext;

    public StickyBottomEarsMapper(@NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
    }

    private final IslandSeparatorVO toVo(IslandSeparatorDTO islandSeparatorDTO, long j11) {
        String color = islandSeparatorDTO.getColor();
        if (color == null) {
            color = AppTokensProvider.Colors.INSTANCE.layerFloor0(this.appContext).getToken();
        }
        String str = color;
        Boolean isSticky = islandSeparatorDTO.isSticky();
        boolean booleanValue = isSticky != null ? isSticky.booleanValue() : false;
        String stickyGroupTag = islandSeparatorDTO.getStickyGroupTag();
        Boolean isOverlay = islandSeparatorDTO.isOverlay();
        return new IslandSeparatorVO(j11, 0, str, false, true, booleanValue, stickyGroupTag, isOverlay != null ? isOverlay.booleanValue() : false);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<StickyBottomEarsVI> invoke(@NotNull StickyBottomEarsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        return C7714v.a0(new StickyBottomEarsVI(hashCode, toVo(state.getIslandSeparator(), hashCode)));
    }
}
