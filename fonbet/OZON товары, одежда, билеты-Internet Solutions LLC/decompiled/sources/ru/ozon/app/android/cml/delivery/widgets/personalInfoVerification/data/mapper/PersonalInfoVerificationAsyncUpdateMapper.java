package ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.data.mapper;

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
import ru.ozon.app.android.cml.delivery.molecules.button.data.CmlButtonMapper;
import ru.ozon.app.android.cml.delivery.molecules.input.data.InputMoleculeMapper;
import ru.ozon.app.android.cml.delivery.molecules.input.presentation.InputMoleculeVO;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.data.PersonalInfoVerificationDTO;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.PersonalInfoVerificationUpdate;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.buttons.PersonalInfoVerificationStickyButtonVO;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.personalInfo.PersonalInfoVerificationVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/mapper/PersonalInfoVerificationAsyncUpdateMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/PersonalInfoVerificationDTO;", "Ll20/d;", "", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoVerificationUpdate;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeMapper;", "inputMapper", "Lru/ozon/app/android/cml/delivery/molecules/button/data/CmlButtonMapper;", "cmlButtonMapper", "<init>", "(Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeMapper;Lru/ozon/app/android/cml/delivery/molecules/button/data/CmlButtonMapper;)V", "dto", "widgetInfo", "invoke", "(Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/PersonalInfoVerificationDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeMapper;", "Lru/ozon/app/android/cml/delivery/molecules/button/data/CmlButtonMapper;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PersonalInfoVerificationAsyncUpdateMapper implements Function2<PersonalInfoVerificationDTO, d, List<? extends PersonalInfoVerificationUpdate>> {

    @NotNull
    private final CmlButtonMapper cmlButtonMapper;

    @NotNull
    private final InputMoleculeMapper inputMapper;

    public PersonalInfoVerificationAsyncUpdateMapper(@NotNull InputMoleculeMapper inputMapper, @NotNull CmlButtonMapper cmlButtonMapper) {
        Intrinsics.checkNotNullParameter(inputMapper, "inputMapper");
        Intrinsics.checkNotNullParameter(cmlButtonMapper, "cmlButtonMapper");
        this.inputMapper = inputMapper;
        this.cmlButtonMapper = cmlButtonMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PersonalInfoVerificationUpdate> invoke(@NotNull PersonalInfoVerificationDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long widgetId = WidgetExtKt.getWidgetId(widgetInfo);
        TextDTO title = dto.getTitle();
        List<TextDTO> subtitle = dto.getSubtitle();
        String formBackgroundColor = dto.getFormBackgroundColor();
        InputMoleculeVO map$default = InputMoleculeMapper.map$default(this.inputMapper, dto.getSurnameInput(), false, 2, null);
        InputMoleculeVO map$default2 = InputMoleculeMapper.map$default(this.inputMapper, dto.getNameInput(), false, 2, null);
        InputMoleculeVO map$default3 = InputMoleculeMapper.map$default(this.inputMapper, dto.getPatronymicInput(), false, 2, null);
        CellDTO patronymicSettingsCell = dto.getPatronymicSettingsCell();
        InputMoleculeVO map$default4 = InputMoleculeMapper.map$default(this.inputMapper, dto.getBirthDateInput(), false, 2, null);
        InputMoleculeVO map$default5 = InputMoleculeMapper.map$default(this.inputMapper, dto.getPassportInput(), false, 2, null);
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return C7714v.a0(new PersonalInfoVerificationUpdate(new PersonalInfoVerificationVO(widgetId, title, subtitle, formBackgroundColor, map$default, map$default2, map$default3, patronymicSettingsCell, map$default4, map$default5, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent(trackingInfo, Long.valueOf(WidgetExtKt.getWidgetId(widgetInfo)), null) : null), new PersonalInfoVerificationStickyButtonVO(WidgetExtKt.getWidgetId(widgetInfo), this.cmlButtonMapper.map(dto.getConfirmButton()))));
    }
}
