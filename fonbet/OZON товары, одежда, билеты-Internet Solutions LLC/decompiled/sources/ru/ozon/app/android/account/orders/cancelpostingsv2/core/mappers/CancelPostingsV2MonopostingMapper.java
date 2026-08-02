package ru.ozon.app.android.account.orders.cancelpostingsv2.core.mappers;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.orders.cancelpostingsv2.data.CancelPostingsV2DTO;
import ru.ozon.app.android.account.orders.cancelpostingsv2.data.MonopostingModel;
import ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.monoposting.MonopostingVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.CornerRadius;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u00020\u000e*\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/account/orders/cancelpostingsv2/core/mappers/CancelPostingsV2MonopostingMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/account/orders/cancelpostingsv2/data/MonopostingModel;", "Ll20/d;", "", "Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/monoposting/MonopostingVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/app/android/account/orders/cancelpostingsv2/data/MonopostingModel;J)Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/monoposting/MonopostingVO;", "Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO$MonopostingDTO$PriceIncreaseInfoDTO;", "Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/monoposting/MonopostingVO$PriceIncreaseInfoVO;", "(Lru/ozon/app/android/account/orders/cancelpostingsv2/data/CancelPostingsV2DTO$MonopostingDTO$PriceIncreaseInfoDTO;J)Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/monoposting/MonopostingVO$PriceIncreaseInfoVO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "createTitleAtom", "(Ljava/lang/String;)Lru/ozon/uni/atoms/data/text/TextDTO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/account/orders/cancelpostingsv2/data/MonopostingModel;Ll20/d;)Ljava/util/List;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CancelPostingsV2MonopostingMapper implements Function2<MonopostingModel, d, List<? extends MonopostingVO>> {
    private final TextDTO createTitleAtom(String title) {
        return new TextDTO(OzonSpannableStringKt.toOzonSpannableString(title), null, null, null, null, null, TextPreset.PRESET_CUSTOM, UniTextStyles.BODY_500_MEDIUM.getToken(), UniColors.TEXT_PRIMARY.getToken(), null, null, null, null, false, null, null, null, null, 1, 261694, null);
    }

    private final MonopostingVO toVo(MonopostingModel monopostingModel, long j11) {
        Boolean isSelected = monopostingModel.getIsSelected();
        boolean booleanValue = isSelected != null ? isSelected.booleanValue() : false;
        ImageDTO imageDTO = new ImageDTO(monopostingModel.getImage(), UniColors.BG_LIGHT_KEY.getToken(), null, true, null, null, null, null, CornerRadius.RADIUS_300, null, null, null, null, null, ImageDTO.FitType.FIT_CENTER, null, 48884, null);
        String title = monopostingModel.getTitle();
        String subtitle = monopostingModel.getSubtitle();
        String info = monopostingModel.getInfo();
        AtomActionDTO action = monopostingModel.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, null) : null;
        String selectedIds = monopostingModel.getSelectedIds();
        CancelPostingsV2DTO.MonopostingDTO.PriceIncreaseInfoDTO priceIncreaseInfo = monopostingModel.getPriceIncreaseInfo();
        return new MonopostingVO(j11, booleanValue, imageDTO, title, subtitle, info, atomAction, selectedIds, priceIncreaseInfo != null ? toVo(priceIncreaseInfo, j11) : null, monopostingModel.getTitleBadge(), createTitleAtom(monopostingModel.getTitle()), monopostingModel.getImageBadge());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<MonopostingVO> invoke(@NotNull MonopostingModel state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String d11 = widgetInfo.d();
        AtomActionDTO action = state.getAction();
        return C7714v.a0(toVo(state, (d11 + "_" + action).hashCode()));
    }

    private final MonopostingVO.PriceIncreaseInfoVO toVo(CancelPostingsV2DTO.MonopostingDTO.PriceIncreaseInfoDTO priceIncreaseInfoDTO, long j11) {
        TextDTO title = priceIncreaseInfoDTO.getTitle();
        IconDTO icon = priceIncreaseInfoDTO.getIcon();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(priceIncreaseInfoDTO.getAction(), priceIncreaseInfoDTO.getTrackingInfo());
        Map<String, TokenizedTrackingInfo> trackingInfo = priceIncreaseInfoDTO.getTrackingInfo();
        return new MonopostingVO.PriceIncreaseInfoVO(title, icon, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}
