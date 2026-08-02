package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.data;

import T00.a;
import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.data.AviaCheckTariffsDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.AviaCheckTariffsVO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u000fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/core/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$Content;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "state", "mapContent", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$Content;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$TariffDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem$TariffVO;", "mapTariff", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO$TariffDTO;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$TariffItem$TariffVO;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/data/AviaCheckTariffsDTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "Landroid/content/Context;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaCheckTariffsMapper implements Function2<AviaCheckTariffsDTO, d, List<? extends AviaCheckTariffsVO>>, AsyncWidgetStateMapper<AviaCheckTariffsDTO, AviaCheckTariffsVO.Content> {

    @NotNull
    private final Context context;

    public AviaCheckTariffsMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final AviaCheckTariffsVO.Content mapContent(AviaCheckTariffsDTO state) {
        Iterator<T> it = state.getTariffs().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int size = ((AviaCheckTariffsDTO.TariffDTO) it.next()).getBenefits().size();
        while (it.hasNext()) {
            int size2 = ((AviaCheckTariffsDTO.TariffDTO) it.next()).getBenefits().size();
            if (size < size2) {
                size = size2;
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = state.getTariffs().iterator();
        while (it2.hasNext()) {
            arrayList.add(mapTariff((AviaCheckTariffsDTO.TariffDTO) it2.next()));
        }
        if (state.getAsyncBehaviorType() != AviaCheckTariffsDTO.AsyncBehaviorType.NO_ACTION) {
            if (((AviaCheckTariffsDTO.TariffDTO) C7714v.K(state.getTariffs())).getRoute() != null) {
                size++;
            }
            arrayList.add(new AviaCheckTariffsVO.TariffItem.TariffSkeleton(0, size, 1, null));
        }
        int i11 = 0;
        TextDTO title = state.getTitle();
        Iterator<AviaCheckTariffsDTO.TariffDTO> it3 = state.getTariffs().iterator();
        int i12 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i12 = -1;
                break;
            }
            if (it3.next().isSelected()) {
                break;
            }
            i12++;
        }
        Integer valueOf = i12 >= 0 ? Integer.valueOf(i12) : null;
        if (valueOf != null) {
            i11 = valueOf.intValue();
        }
        return new AviaCheckTariffsVO.Content(title, arrayList, i11, null, state.getAsyncBehaviorType(), state.getAsyncParams(), 8, null);
    }

    private final AviaCheckTariffsVO.TariffItem.TariffVO mapTariff(AviaCheckTariffsDTO.TariffDTO state) {
        AviaCheckTariffsVO.TariffItem.PriceBlockVO priceBlockVO;
        int i11;
        AtomAction atomAction;
        CommonControlSettings common;
        AtomAction atomAction2;
        int hashCode = state.getTitle().getText().hashCode();
        TextDTO title = state.getTitle();
        PriceDTO price = state.getPrice();
        TextDTO route = state.getRoute();
        BadgeDTO milesBadge = state.getMilesBadge();
        List<CellDTO> benefits = state.getBenefits();
        ArrayList arrayList = new ArrayList(C7714v.z(benefits, 10));
        Iterator<T> it = benefits.iterator();
        while (true) {
            priceBlockVO = null;
            if (!it.hasNext()) {
                break;
            }
            CellDTO cellDTO = (CellDTO) it.next();
            CellDTO.CellText title2 = cellDTO.getCenterBlock().getTitle();
            int hashCode2 = cellDTO.getCenterBlock().getTitle().getText().hashCode();
            CellDTO.LeftBlock leftBlock = cellDTO.getLeftBlock();
            IconDTO icon = leftBlock != null ? leftBlock.getIcon() : null;
            TextDTO textDTO = new TextDTO(title2.getText(), null, null, null, null, null, TextPreset.PRESET_CUSTOM, title2.getTypographyToken(), title2.getTextColor(), null, null, null, null, true, null, null, null, null, cellDTO.getCenterBlock().getTitle().getMaxLines(), 253502, null);
            CellDTO.RightBlock rightBlock = cellDTO.getRightBlock();
            IconDTO icon2 = rightBlock != null ? rightBlock.getIcon() : null;
            CellDTO.RightBlock rightBlock2 = cellDTO.getRightBlock();
            if (rightBlock2 == null || (common = rightBlock2.getCommon()) == null || (atomAction2 = common.toAtomAction()) == null) {
                CommonControlSettings common2 = cellDTO.getCommon();
                atomAction = common2 != null ? common2.toAtomAction() : null;
            } else {
                atomAction = atomAction2;
            }
            arrayList.add(new AviaCheckTariffsVO.TariffItem.SimpleCellVO(hashCode2, icon, textDTO, icon2, atomAction));
        }
        AviaCheckTariffsDTO.BenefitsListExpansion benefitsListExpansion = state.getBenefitsListExpansion();
        int initiallyVisibleBenefitsCount = benefitsListExpansion != null ? benefitsListExpansion.getInitiallyVisibleBenefitsCount() : state.getBenefits().size();
        AviaCheckTariffsDTO.BenefitsListExpansion benefitsListExpansion2 = state.getBenefitsListExpansion();
        AviaCheckTariffsDTO.ShowMoreButtonDTO showMoreButton = benefitsListExpansion2 != null ? benefitsListExpansion2.getShowMoreButton() : null;
        String borderColor = state.getBorderColor();
        AviaCheckTariffsDTO.BackgroundWrapper backgroundColor = state.getBackgroundColor();
        ImageDTO marketingImage = state.getMarketingImage();
        AtomActionDTO clickAction = state.getClickAction();
        AtomAction atomAction3 = clickAction != null ? AtomActionMapperKt.toAtomAction(clickAction, state.getClickTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> viewTrackingInfo = state.getViewTrackingInfo();
        boolean isSelected = state.isSelected();
        AviaCheckTariffsDTO.PriceBlockDTO priceBlock = state.getPriceBlock();
        if (priceBlock != null) {
            i11 = hashCode;
            priceBlockVO = new AviaCheckTariffsVO.TariffItem.PriceBlockVO(MapperExtKt.toVO(priceBlock.getDiscountPriceCard(), this.context), MapperExtKt.toVO(priceBlock.getOriginalPriceCard(), this.context));
        } else {
            i11 = hashCode;
        }
        return new AviaCheckTariffsVO.TariffItem.TariffVO(i11, title, price, route, milesBadge, arrayList, null, initiallyVisibleBenefitsCount, showMoreButton, borderColor, backgroundColor, marketingImage, atomAction3, viewTrackingInfo, isSelected, priceBlockVO, 64, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AviaCheckTariffsVO> invoke(@NotNull AviaCheckTariffsDTO state, @NotNull d widgetInfo) {
        String c11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        a b11 = widgetInfo.b();
        Uri parse = (b11 == null || (c11 = b11.c()) == null) ? null : Uri.parse(c11);
        return C7714v.a0(new AviaCheckTariffsVO(widgetInfo.d().hashCode(), widgetInfo.c().a(), parse != null ? parse.getQueryParameter("offerId") : null, mapContent(state)));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public AviaCheckTariffsVO.Content mapAsyncState(@NotNull AviaCheckTariffsDTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return mapContent(state);
    }
}
