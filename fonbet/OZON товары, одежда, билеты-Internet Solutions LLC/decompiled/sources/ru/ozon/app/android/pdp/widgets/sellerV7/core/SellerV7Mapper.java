package ru.ozon.app.android.pdp.widgets.sellerV7.core;

import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.seller.SellerV7VO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.SellerV7DTO;
import ru.ozon.app.android.pdp.utils.AtomActionExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000f\u001a\u00020\u000e*\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u000f\u001a\u00020\u0012*\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J\u0019\u0010\u000f\u001a\u00020\u0017*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u000f\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerV7/core/SellerV7Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/SellerV7DTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/SellerV7DTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/SellerV7DTO$Header;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerHeader;", "toVo", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/SellerV7DTO$Header;)Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerHeader;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/SellerV7DTO$Badge;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerBadge;", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/SellerV7DTO$Badge;)Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerBadge;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/SellerV7DTO$Island;", "", "widgetId", "Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerIsland;", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/SellerV7DTO$Island;J)Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO$SellerIsland;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SellerV7Mapper implements Function2<SellerV7DTO, d, List<? extends SellerV7VO>> {
    @NotNull
    public final SellerV7VO.SellerHeader toVo(@NotNull SellerV7DTO.Header header) {
        Intrinsics.checkNotNullParameter(header, "<this>");
        TextDTO title = header.getTitle();
        SellerV7DTO.Badge badge = header.getBadge();
        return new SellerV7VO.SellerHeader(title, badge != null ? toVo(badge) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SellerV7VO> invoke(@NotNull SellerV7DTO state, @NotNull d widgetInfo) {
        CellDTO.LeftBlock leftBlock;
        CellDTO copy$default;
        IconDTO iconDTO;
        IconDTO icon;
        IconDTO icon2;
        IconDTO icon3;
        CellDTO.LeftBlock leftBlock2;
        IconDTO iconDTO2;
        IconDTO icon4;
        IconDTO icon5;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        SellerV7DTO.Header header = state.getHeader();
        String str = null;
        SellerV7VO.SellerHeader vo = header != null ? toVo(header) : null;
        if (state.getHasSimpleCell()) {
            CellDTO sellerCell = state.getSellerCell();
            CellDTO.Settings settings = state.getSellerCell().getSettings();
            CellDTO.Settings copy$default2 = settings != null ? CellDTO.Settings.copy$default(settings, null, null, null, null, null, null, state.getInnerBackground(), null, null, null, null, 1983, null) : null;
            CellDTO.LeftBlock leftBlock3 = state.getSellerCell().getLeftBlock();
            if (leftBlock3 != null) {
                CellDTO.LeftBlock leftBlock4 = state.getSellerCell().getLeftBlock();
                if (leftBlock4 == null || (icon4 = leftBlock4.getIcon()) == null) {
                    iconDTO2 = null;
                } else {
                    CellDTO.LeftBlock leftBlock5 = state.getSellerCell().getLeftBlock();
                    iconDTO2 = IconDTO.copy$default(icon4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (leftBlock5 == null || (icon5 = leftBlock5.getIcon()) == null) ? null : icon5.getBackgroundImageFitType(), 65503, null);
                }
                leftBlock2 = CellDTO.LeftBlock.copy$default(leftBlock3, null, null, null, null, null, iconDTO2, null, null, 223, null);
            } else {
                leftBlock2 = null;
            }
            copy$default = CellDTO.copy$default(sellerCell, null, copy$default2, leftBlock2, null, null, 25, null);
        } else {
            CellDTO sellerCell2 = state.getSellerCell();
            CellDTO.LeftBlock leftBlock6 = state.getSellerCell().getLeftBlock();
            if (leftBlock6 != null) {
                CellDTO.LeftBlock leftBlock7 = state.getSellerCell().getLeftBlock();
                if (leftBlock7 == null || (icon = leftBlock7.getIcon()) == null) {
                    iconDTO = null;
                } else {
                    CellDTO.LeftBlock leftBlock8 = state.getSellerCell().getLeftBlock();
                    iconDTO = IconDTO.copy$default(icon, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (leftBlock8 == null || (icon2 = leftBlock8.getIcon()) == null) ? null : icon2.getBackgroundImageFitType(), 65503, null);
                }
                leftBlock = CellDTO.LeftBlock.copy$default(leftBlock6, null, null, null, null, null, iconDTO, null, null, 223, null);
            } else {
                leftBlock = null;
            }
            copy$default = CellDTO.copy$default(sellerCell2, null, null, leftBlock, null, null, 27, null);
        }
        SellerV7DTO.Island rating = state.getRating();
        SellerV7VO.SellerIsland vo2 = rating != null ? toVo(rating, hashCode) : null;
        SellerV7DTO.Island chat = state.getChat();
        SellerV7VO.SellerIsland vo3 = chat != null ? toVo(chat, hashCode) : null;
        String backgroundColor = state.getBackgroundColor();
        String innerBackground = state.getInnerBackground();
        String backgroundImage = state.getBackgroundImage();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        CellDTO.LeftBlock leftBlock9 = state.getSellerCell().getLeftBlock();
        if (leftBlock9 != null && (icon3 = leftBlock9.getIcon()) != null) {
            str = icon3.getBackgroundImage();
        }
        String str2 = str;
        String json = state.getJson();
        if (json == null) {
            json = "";
        }
        return C7714v.a0(new SellerV7VO(hashCode, vo, copy$default, vo2, vo3, backgroundColor, str2, innerBackground, tokenizedEvent$default, json, backgroundImage));
    }

    @NotNull
    public final SellerV7VO.SellerBadge toVo(@NotNull SellerV7DTO.Badge badge) {
        Intrinsics.checkNotNullParameter(badge, "<this>");
        return new SellerV7VO.SellerBadge(badge.isSubscribed(), badge.getSubscribed(), badge.getUnsubscribed());
    }

    @NotNull
    public final SellerV7VO.SellerIsland toVo(@NotNull SellerV7DTO.Island island, long j11) {
        AtomActionDTO withBase64Parameter$default;
        Intrinsics.checkNotNullParameter(island, "<this>");
        IconDTO icon = island.getIcon();
        TextDTO title = island.getTitle();
        String backgroundColor = island.getBackgroundColor();
        OnBoardingDTO onboarding = island.getOnboarding();
        AtomActionDTO action = island.getAction();
        AtomAction atomAction = (action == null || (withBase64Parameter$default = AtomActionExtKt.withBase64Parameter$default(action, island.getTemplateLink(), island.getPlaceholderValue(), null, 4, null)) == null) ? null : AtomActionMapperKt.toAtomAction(withBase64Parameter$default, island.getTrackingInfo());
        Map<String, TokenizedTrackingInfo> trackingInfo = island.getTrackingInfo();
        return new SellerV7VO.SellerIsland(icon, title, backgroundColor, onboarding, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}
