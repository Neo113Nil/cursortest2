package ru.ozon.app.android.storefront.widgets.naviBlocksV5.core;

import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.widgets.naviBlocksV5.data.BlockV5DTO;
import ru.ozon.app.android.storefront.widgets.naviBlocksV5.data.NaviBlocksV5DTO;
import ru.ozon.app.android.storefront.widgets.naviBlocksV5.presentation.BlockV5VO;
import ru.ozon.app.android.storefront.widgets.naviBlocksV5.presentation.NaviBlocksV5VO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.core.models.UniColorToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV5/core/NaviBlocksV5Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/data/NaviBlocksV5DTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/presentation/NaviBlocksV5VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/core/NaviBlocks5StyleProvider;", "styleProvider", "<init>", "(Lru/ozon/app/android/storefront/widgets/naviBlocksV5/core/NaviBlocks5StyleProvider;)V", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/data/BlockV5DTO;", "block", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/presentation/BlockV5VO;", "mapBlock", "(Lru/ozon/app/android/storefront/widgets/naviBlocksV5/data/BlockV5DTO;)Lru/ozon/app/android/storefront/widgets/naviBlocksV5/presentation/BlockV5VO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/naviBlocksV5/data/NaviBlocksV5DTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV5/core/NaviBlocks5StyleProvider;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NaviBlocksV5Mapper implements Function2<NaviBlocksV5DTO, d, List<? extends NaviBlocksV5VO>> {
    public static final int $stable = UniColorToken.$stable;

    @NotNull
    private final NaviBlocks5StyleProvider styleProvider;

    public NaviBlocksV5Mapper(@NotNull NaviBlocks5StyleProvider styleProvider) {
        Intrinsics.checkNotNullParameter(styleProvider, "styleProvider");
        this.styleProvider = styleProvider;
    }

    private final BlockV5VO mapBlock(BlockV5DTO block) {
        AtomActionDTO action;
        CommonControlSettings settings = block.getSettings();
        UniColorToken byId = UniTheme.INSTANCE.getColorTokens().getById(block.getBackgroundColor());
        if (byId == null) {
            byId = this.styleProvider.getBlockBackgroundColor();
        }
        return new BlockV5VO(byId, block.getTitle(), block.getSubtitle(), block.getIcon(), (settings == null || (action = settings.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, settings.getTrackingInfo()));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<NaviBlocksV5VO> invoke(@NotNull NaviBlocksV5DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        float horizontalMargin = this.styleProvider.getHorizontalMargin();
        float blockMargin = this.styleProvider.getBlockMargin();
        UniColorToken byId = UniTheme.INSTANCE.getColorTokens().getById(state.getBackgroundColor());
        if (byId == null) {
            byId = this.styleProvider.getWidgetBackgroundColor();
        }
        UniColorToken uniColorToken = byId;
        BlockV5VO mapBlock = mapBlock(state.getLeftBlock());
        BlockV5VO mapBlock2 = mapBlock(state.getRightBlock());
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new NaviBlocksV5VO(hashCode, horizontalMargin, blockMargin, uniColorToken, mapBlock, mapBlock2, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null, null));
    }
}
