package ru.ozon.app.android.travel.feature.general.services.widgets.additionalServiceCell.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServiceCell.data.AdditionalServiceCellDTO;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServiceCell.presentation.AdditionalServiceCellVO;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0003j\u0002`\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/data/AdditionalServiceCellMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/data/AdditionalServiceCellDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO$Content;", "<init>", "()V", "state", "mapContent", "(Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/data/AdditionalServiceCellDTO;)Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO$Content;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "", "control", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO$CellControlVO;", "mapCellControl", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/Object;)Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellVO$CellControlVO;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/data/AdditionalServiceCellDTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdditionalServiceCellMapper implements Function2<AdditionalServiceCellDTO, d, List<? extends AdditionalServiceCellVO>>, AsyncWidgetStateMapper<AdditionalServiceCellDTO, AdditionalServiceCellVO.Content> {
    private final AdditionalServiceCellVO.CellControlVO mapCellControl(ButtonV3DTO button, Object control) {
        if (control instanceof ButtonV3DTO) {
            return AdditionalServiceCellVO.CellButtonVO.m1312boximpl(AdditionalServiceCellVO.CellButtonVO.m1313constructorimpl((ButtonV3DTO) control));
        }
        if (!(control instanceof AdditionalServiceCellDTO.CellToggleDTO)) {
            if (button != null) {
                return AdditionalServiceCellVO.CellButtonVO.m1312boximpl(AdditionalServiceCellVO.CellButtonVO.m1313constructorimpl(button));
            }
            return null;
        }
        AdditionalServiceCellDTO.CellToggleDTO cellToggleDTO = (AdditionalServiceCellDTO.CellToggleDTO) control;
        ToggleDTO toggle = cellToggleDTO.getToggle();
        AtomActionDTO action = cellToggleDTO.getSwitchControl().getAction();
        return new AdditionalServiceCellVO.CellToggleVO(toggle, action != null ? AtomActionMapperKt.toAtomAction(action, cellToggleDTO.getSwitchControl().getTrackingInfo()) : null);
    }

    private final AdditionalServiceCellVO.Content mapContent(AdditionalServiceCellDTO state) {
        AtomActionDTO action;
        IconDTO icon = state.getIcon();
        TextDTO title = state.getTitle();
        TextDTO subtitle = state.getSubtitle();
        BadgeDTO discountBadge = state.getDiscountBadge();
        PriceDTO subtitleOriginPrice = state.getSubtitleOriginPrice();
        CommonControlSettings cardClickControl = state.getCardClickControl();
        AtomAction atomAction = null;
        atomAction = null;
        if (cardClickControl != null && (action = cardClickControl.getAction()) != null) {
            CommonControlSettings cardClickControl2 = state.getCardClickControl();
            atomAction = AtomActionMapperKt.toAtomAction(action, cardClickControl2 != null ? cardClickControl2.getTrackingInfo() : null);
        }
        AtomAction atomAction2 = atomAction;
        Boolean isSeparatorVisible = state.isSeparatorVisible();
        return new AdditionalServiceCellVO.Content(icon, title, subtitle, discountBadge, subtitleOriginPrice, atomAction2, isSeparatorVisible != null ? isSeparatorVisible.booleanValue() : false, state.getFetchState(), state.getShowSkeleton(), state.getAsyncParams(), state.getViewTrackingInfo(), mapCellControl(state.getButton(), state.getControl()));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AdditionalServiceCellVO> invoke(@NotNull AdditionalServiceCellDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new AdditionalServiceCellVO(widgetInfo.d().hashCode(), widgetInfo.c().a(), mapContent(state)));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public AdditionalServiceCellVO.Content mapAsyncState(@NotNull AdditionalServiceCellDTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return mapContent(state);
    }
}
