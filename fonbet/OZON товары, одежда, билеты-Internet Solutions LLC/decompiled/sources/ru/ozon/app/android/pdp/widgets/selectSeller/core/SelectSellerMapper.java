package ru.ozon.app.android.pdp.widgets.selectSeller.core;

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
import ru.ozon.app.android.pdp.utils.AtomActionExtKt;
import ru.ozon.app.android.pdp.utils.MapperExtKt;
import ru.ozon.app.android.pdp.widgets.selectSeller.data.SelectSellerDTO;
import ru.ozon.app.android.pdp.widgets.selectSeller.presentation.SelectSellerVO;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.data.SisBrandFavoriteButton;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/selectSeller/core/SelectSellerMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/selectSeller/data/SelectSellerDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/selectSeller/presentation/SelectSellerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/selectSeller/data/SelectSellerDTO;Ll20/d;)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SelectSellerMapper implements Function2<SelectSellerDTO, d, List<? extends SelectSellerVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SelectSellerVO> invoke(@NotNull SelectSellerDTO state, @NotNull d widgetInfo) {
        IconButtonV3DTO iconButtonV3DTO;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        AtomActionDTO action;
        CommonControlSettings commonControlSettings;
        AtomActionDTO action2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long widgetId = MapperExtKt.widgetId(widgetInfo);
        IconDTO icon = state.getIcon();
        TextDTO title = state.getTitle();
        SelectSellerDTO.Rating rating = state.getRating();
        t tVar = null;
        SelectSellerVO.Rating rating2 = rating != null ? new SelectSellerVO.Rating(rating.getIcon(), rating.getTitle()) : null;
        TextDTO subtitle = state.getSubtitle();
        SisBrandFavoriteButton favoriteButton = state.getFavoriteButton();
        IconButtonV3DTO chatButton = state.getChatButton();
        if (chatButton != null) {
            CommonControlSettings common = state.getChatButton().getCommon();
            if (common != null) {
                CommonControlSettings common2 = state.getChatButton().getCommon();
                commonControlSettings = CommonControlSettings.copy$default(common, (common2 == null || (action2 = common2.getAction()) == null) ? null : AtomActionExtKt.withBase64Parameter$default(action2, state.getTemplateLink(), state.getPlaceholderValue(), null, 4, null), null, null, 6, null);
            } else {
                commonControlSettings = null;
            }
            iconButtonV3DTO = IconButtonV3DTO.copy$default(chatButton, null, null, null, null, null, null, null, commonControlSettings, null, null, null, null, null, null, 16255, null);
        } else {
            iconButtonV3DTO = null;
        }
        String backgroundColor = state.getBackgroundColor();
        CommonControlSettings common3 = state.getCommon();
        AtomAction atomAction = (common3 == null || (action = common3.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, state.getCommon().getTrackingInfo());
        CommonControlSettings common4 = state.getCommon();
        if (common4 != null && (trackingInfo = common4.getTrackingInfo()) != null) {
            tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(widgetId), null, 2, null);
        }
        return C7714v.a0(new SelectSellerVO(widgetId, icon, title, rating2, subtitle, favoriteButton, iconButtonV3DTO, backgroundColor, atomAction, tVar));
    }
}
