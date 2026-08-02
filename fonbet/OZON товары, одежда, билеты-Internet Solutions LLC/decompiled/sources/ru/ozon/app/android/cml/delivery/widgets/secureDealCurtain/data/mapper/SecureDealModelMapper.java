package ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.data.mapper;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cml.delivery.common.ext.WidgetExtKt;
import ru.ozon.app.android.cml.delivery.molecules.cellList.data.CmlCellListDTO;
import ru.ozon.app.android.cml.delivery.molecules.cellList.data.CmlCellListMapper;
import ru.ozon.app.android.cml.delivery.molecules.cellList.presenation.CellItem;
import ru.ozon.app.android.cml.delivery.molecules.input.data.InputMoleculeDTO;
import ru.ozon.app.android.cml.delivery.molecules.input.data.InputMoleculeMapper;
import ru.ozon.app.android.cml.delivery.molecules.input.presentation.InputMoleculeVO;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.data.model.SecureDealDataModel;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.secureDeal.SecureDealDataVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/data/mapper/SecureDealModelMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/data/model/SecureDealDataModel;", "Ll20/d;", "", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/SecureDealDataVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMapper;", "cmlCellListMapper", "Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeMapper;", "inputMapper", "<init>", "(Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMapper;Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeMapper;)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/data/model/SecureDealDataModel;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/cml/delivery/molecules/cellList/data/CmlCellListMapper;", "Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeMapper;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SecureDealModelMapper implements Function2<SecureDealDataModel, d, List<? extends SecureDealDataVO>> {

    @NotNull
    private final CmlCellListMapper cmlCellListMapper;

    @NotNull
    private final InputMoleculeMapper inputMapper;

    public SecureDealModelMapper(@NotNull CmlCellListMapper cmlCellListMapper, @NotNull InputMoleculeMapper inputMapper) {
        Intrinsics.checkNotNullParameter(cmlCellListMapper, "cmlCellListMapper");
        Intrinsics.checkNotNullParameter(inputMapper, "inputMapper");
        this.cmlCellListMapper = cmlCellListMapper;
        this.inputMapper = inputMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SecureDealDataVO> invoke(@NotNull SecureDealDataModel state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long widgetId = WidgetExtKt.getWidgetId(widgetInfo);
        TextDTO title = state.getTitle();
        List<TextDTO> subtitle = state.getSubtitle();
        Object topBlockItem = state.getTopBlockItem();
        InputMoleculeDTO inputMoleculeDTO = topBlockItem instanceof InputMoleculeDTO ? (InputMoleculeDTO) topBlockItem : null;
        InputMoleculeVO map$default = inputMoleculeDTO != null ? InputMoleculeMapper.map$default(this.inputMapper, inputMoleculeDTO, false, 2, null) : null;
        Object topBlockItem2 = state.getTopBlockItem();
        DisclaimerDTO disclaimerDTO = topBlockItem2 instanceof DisclaimerDTO ? (DisclaimerDTO) topBlockItem2 : null;
        TextDTO cardsTitle = state.getCardsTitle();
        List<TextDTO> cardsSubtitle = state.getCardsSubtitle();
        CmlCellListDTO cards = state.getCards();
        List<CellItem> map = cards != null ? this.cmlCellListMapper.map(cards) : null;
        Long inputDelay = state.getInputDelay();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new SecureDealDataVO(widgetId, title, subtitle, map$default, disclaimerDTO, cardsTitle, cardsSubtitle, map, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent(trackingInfo, Long.valueOf(WidgetExtKt.getWidgetId(widgetInfo)), null) : null, inputDelay));
    }
}
