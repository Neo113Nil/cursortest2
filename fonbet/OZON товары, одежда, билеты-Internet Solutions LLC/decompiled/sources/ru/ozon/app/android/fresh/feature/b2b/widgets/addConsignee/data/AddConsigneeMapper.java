package ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.data;

import WZ.t;
import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.data.AddConsigneeDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation.AddConsigneeVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO$InputField;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$InputField;", "toVO", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO$InputField;)Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/presentation/AddConsigneeVO$InputField;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/addConsignee/data/AddConsigneeDTO;Ll20/d;)Ljava/util/List;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddConsigneeMapper implements Function2<AddConsigneeDTO, d, List<? extends AddConsigneeVO>> {
    private final AddConsigneeVO.InputField toVO(AddConsigneeDTO.InputField inputField) {
        String name = inputField.getName();
        String value = inputField.getValue();
        String placeholder = inputField.getPlaceholder();
        AddConsigneeVO.InputFieldErrors inputFieldErrors = new AddConsigneeVO.InputFieldErrors(inputField.getInputFieldErrors().getEmptyFieldError(), inputField.getInputFieldErrors().getIncorrectFieldError(), inputField.getInputFieldErrors().getAnotherFieldError());
        boolean isDisabled = inputField.isDisabled();
        AtomActionDTO action = inputField.getAction();
        return new AddConsigneeVO.InputField(name, value, placeholder, inputFieldErrors, isDisabled, action != null ? AtomActionMapperKt.toAtomAction(action, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AddConsigneeVO> invoke(@NotNull AddConsigneeDTO state, @NotNull d widgetInfo) {
        ButtonV3DTO buttonV3DTO;
        CommonControlSettings common;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO description = state.getDescription();
        AddConsigneeVO.InputField vo = toVO(state.getKppField());
        List<CellDTO> requisitesCells = state.getRequisitesCells();
        t tVar = null;
        AddConsigneeVO.AdditionalFields additionalFields = state.getAdditionalFields() != null ? new AddConsigneeVO.AdditionalFields(toVO(state.getAdditionalFields().getBranchNameField()), toVO(state.getAdditionalFields().getAddressField())) : null;
        ButtonV3DTO button = state.getButton();
        if (button != null) {
            CommonControlSettings common2 = state.getButton().getCommon();
            buttonV3DTO = ButtonV3DTO.copy$default(button, null, null, null, null, null, null, null, null, null, null, null, null, null, common2 != null ? CommonControlSettings.copy$default(common2, null, null, null, 5, null) : null, null, null, null, 122879, null);
        } else {
            buttonV3DTO = null;
        }
        ButtonV3DTO button2 = state.getButton();
        if (button2 != null && (common = button2.getCommon()) != null && (trackingInfo = common.getTrackingInfo()) != null) {
            Long valueOf = Long.valueOf(hashCode);
            Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
            tVar = x.b(trackingInfo, valueOf, null);
        }
        return C7714v.a0(new AddConsigneeVO(hashCode, description, vo, requisitesCells, additionalFields, buttonV3DTO, tVar));
    }
}
