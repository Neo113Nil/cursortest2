package ru.ozon.app.android.cml.delivery.widgets.inputCurtain.data;

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
import ru.ozon.app.android.cml.delivery.common.ext.WidgetExtKt;
import ru.ozon.app.android.cml.delivery.molecules.input.data.InputMoleculeMapper;
import ru.ozon.app.android.cml.delivery.molecules.input.presentation.InputMoleculeVO;
import ru.ozon.app.android.cml.delivery.widgets.inputCurtain.presentation.InputCurtainVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/data/InputCurtainMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/data/InputCurtainDTO;", "Ll20/d;", "", "Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/presentation/InputCurtainVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeMapper;", "inputMoleculeMapper", "<init>", "(Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeMapper;)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/data/InputCurtainDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeMapper;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InputCurtainMapper implements Function2<InputCurtainDTO, d, List<? extends InputCurtainVO>> {

    @NotNull
    private final InputMoleculeMapper inputMoleculeMapper;

    public InputCurtainMapper(@NotNull InputMoleculeMapper inputMoleculeMapper) {
        Intrinsics.checkNotNullParameter(inputMoleculeMapper, "inputMoleculeMapper");
        this.inputMoleculeMapper = inputMoleculeMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<InputCurtainVO> invoke(@NotNull InputCurtainDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long widgetId = WidgetExtKt.getWidgetId(widgetInfo);
        TextDTO title = state.getTitle();
        List<TextDTO> subtitle = state.getSubtitle();
        InputMoleculeVO map$default = InputMoleculeMapper.map$default(this.inputMoleculeMapper, state.getInput(), false, 2, null);
        ButtonV3DTO saveButton = state.getSaveButton();
        String backgroundColor = state.getBackgroundColor();
        String tab = state.getTab();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        t mapToTokenizedEvent = trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent(trackingInfo, Long.valueOf(WidgetExtKt.getWidgetId(widgetInfo)), null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo2 = state.getInput().getCommon().getTrackingInfo();
        return C7714v.a0(new InputCurtainVO(widgetId, title, subtitle, map$default, saveButton, backgroundColor, tab, mapToTokenizedEvent, trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent(trackingInfo2, Long.valueOf(WidgetExtKt.getWidgetId(widgetInfo)), null) : null));
    }
}
