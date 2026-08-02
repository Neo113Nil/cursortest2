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
import ru.ozon.app.android.cml.delivery.molecules.input.data.InputMoleculeMapper;
import ru.ozon.app.android.cml.delivery.molecules.input.presentation.InputMoleculeVO;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.data.model.PersonalInfoVerificationDataModel;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.personalInfo.PersonalInfoVerificationVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/mapper/PersonalInfoVerificationMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/model/PersonalInfoVerificationDataModel;", "Ll20/d;", "", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/personalInfo/PersonalInfoVerificationVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeMapper;", "inputMapper", "<init>", "(Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeMapper;)V", "dto", "widgetInfo", "invoke", "(Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/data/model/PersonalInfoVerificationDataModel;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeMapper;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PersonalInfoVerificationMapper implements Function2<PersonalInfoVerificationDataModel, d, List<? extends PersonalInfoVerificationVO>> {

    @NotNull
    private final InputMoleculeMapper inputMapper;

    public PersonalInfoVerificationMapper(@NotNull InputMoleculeMapper inputMapper) {
        Intrinsics.checkNotNullParameter(inputMapper, "inputMapper");
        this.inputMapper = inputMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PersonalInfoVerificationVO> invoke(@NotNull PersonalInfoVerificationDataModel dto, @NotNull d widgetInfo) {
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
        return C7714v.a0(new PersonalInfoVerificationVO(widgetId, title, subtitle, formBackgroundColor, map$default, map$default2, map$default3, patronymicSettingsCell, map$default4, map$default5, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent(trackingInfo, Long.valueOf(WidgetExtKt.getWidgetId(widgetInfo)), null) : null));
    }
}
