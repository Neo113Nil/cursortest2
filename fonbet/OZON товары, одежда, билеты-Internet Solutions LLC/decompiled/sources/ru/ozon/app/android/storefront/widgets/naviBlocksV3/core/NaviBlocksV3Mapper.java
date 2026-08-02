package ru.ozon.app.android.storefront.widgets.naviBlocksV3.core;

import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.data.BlockIconV3DTO;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.data.BlockV3DTO;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.data.NaviBlocksV3DTO;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.data.PaddingsDTO;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation.BlockV3VO;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation.NaviBlocksV3VO;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation.PaddingsVO;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.core.models.UniColorToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00152*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0015B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f*\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u0003j\u0002`\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV3/core/NaviBlocksV3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/data/NaviBlocksV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/NaviBlocksV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/utils/AppType;)V", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/data/PaddingsDTO;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/PaddingsVO;", "toVO", "(Lru/ozon/app/android/storefront/widgets/naviBlocksV3/data/PaddingsDTO;)Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/PaddingsVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/naviBlocksV3/data/NaviBlocksV3DTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/utils/AppType;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NaviBlocksV3Mapper implements Function2<NaviBlocksV3DTO, d, List<? extends NaviBlocksV3VO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final UniColorToken bxBackgroundColor;

    @NotNull
    private static final UniColorToken bxSubtitleColor;

    @NotNull
    private static final UniColorToken bxTitleColor;

    @NotNull
    private static final UniColorToken selectBackgroundColor;

    @NotNull
    private static final UniColorToken selectSubtitleColor;

    @NotNull
    private static final UniColorToken selectTitleColor;

    @NotNull
    private final AppType appType;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV3/core/NaviBlocksV3Mapper$Companion;", "", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        UniTheme uniTheme = UniTheme.INSTANCE;
        selectBackgroundColor = uniTheme.getColorTokens().getBgDarkKey();
        selectTitleColor = uniTheme.getColorTokens().getTextLightKey();
        selectSubtitleColor = uniTheme.getColorTokens().getTextSecondaryOnDark();
        bxTitleColor = uniTheme.getColorTokens().getTextPrimary();
        bxSubtitleColor = uniTheme.getColorTokens().getTextSecondary();
        bxBackgroundColor = uniTheme.getColorTokens().getLayerFloor1();
    }

    public NaviBlocksV3Mapper(@NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.appType = appType;
    }

    private final PaddingsVO toVO(PaddingsDTO paddingsDTO) {
        Paddings paddings;
        Paddings paddings2;
        Paddings paddings3;
        Paddings paddings4;
        if (paddingsDTO == null || (paddings = paddingsDTO.getTopPadding()) == null) {
            paddings = this.appType == AppType.SELECT ? Paddings.PADDING_300 : Paddings.NONE;
        }
        if (paddingsDTO == null || (paddings2 = paddingsDTO.getLeftPadding()) == null) {
            paddings2 = this.appType == AppType.SELECT ? Paddings.PADDING_200 : Paddings.PADDING_500;
        }
        if (paddingsDTO == null || (paddings3 = paddingsDTO.getRightPadding()) == null) {
            paddings3 = this.appType == AppType.SELECT ? Paddings.PADDING_200 : Paddings.PADDING_500;
        }
        if (paddingsDTO == null || (paddings4 = paddingsDTO.getBottomPadding()) == null) {
            paddings4 = this.appType == AppType.SELECT ? Paddings.PADDING_100 : Paddings.PADDING_500;
        }
        return new PaddingsVO(paddings, paddings3, paddings2, paddings4);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<NaviBlocksV3VO> invoke(@NotNull NaviBlocksV3DTO state, @NotNull d widgetInfo) {
        BlockV3DTO blockV3DTO;
        t tVar;
        NaviBlocksV3Mapper naviBlocksV3Mapper = this;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = state.hashCode();
        PaddingsVO vo = naviBlocksV3Mapper.toVO(state.getPaddings());
        Paddings centralBlockMargin = state.getCentralBlockMargin();
        if (centralBlockMargin == null) {
            centralBlockMargin = naviBlocksV3Mapper.appType == AppType.SELECT ? Paddings.PADDING_100 : Paddings.PADDING_300;
        }
        Paddings paddings = centralBlockMargin;
        String id2 = (naviBlocksV3Mapper.appType == AppType.SELECT ? selectBackgroundColor : bxBackgroundColor).getId();
        List<BlockV3DTO> blocks = state.getBlocks();
        ArrayList arrayList = new ArrayList(C7714v.z(blocks, 10));
        Iterator it = blocks.iterator();
        while (it.hasNext()) {
            BlockV3DTO blockV3DTO2 = (BlockV3DTO) it.next();
            BlockIconV3DTO icon = blockV3DTO2.getIcon();
            String title = blockV3DTO2.getTitle();
            String subtitle = blockV3DTO2.getSubtitle();
            AppType appType = naviBlocksV3Mapper.appType;
            AppType appType2 = AppType.SELECT;
            String id3 = (appType == appType2 ? selectTitleColor : bxTitleColor).getId();
            String id4 = (naviBlocksV3Mapper.appType == appType2 ? selectSubtitleColor : bxSubtitleColor).getId();
            String backgroundColor = blockV3DTO2.getBackgroundColor();
            Map<String, TokenizedTrackingInfo> trackingInfo = blockV3DTO2.getTrackingInfo();
            Iterator it2 = it;
            if (trackingInfo != null) {
                blockV3DTO = blockV3DTO2;
                tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
            } else {
                blockV3DTO = blockV3DTO2;
                tVar = null;
            }
            AtomActionDTO action = blockV3DTO.getAction();
            AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, blockV3DTO.getTrackingInfo()) : null;
            OnBoardingDTO onboarding = blockV3DTO.getOnboarding();
            CornerRadius cornerRadius = blockV3DTO.getCornerRadius();
            if (cornerRadius == null) {
                cornerRadius = CornerRadius.RADIUS_500;
            }
            arrayList.add(new BlockV3VO(icon, title, subtitle, id3, id4, backgroundColor, atomAction, tVar, onboarding, cornerRadius));
            naviBlocksV3Mapper = this;
            it = it2;
        }
        return C7714v.a0(new NaviBlocksV3VO(hashCode, arrayList, vo, paddings, id2));
    }
}
