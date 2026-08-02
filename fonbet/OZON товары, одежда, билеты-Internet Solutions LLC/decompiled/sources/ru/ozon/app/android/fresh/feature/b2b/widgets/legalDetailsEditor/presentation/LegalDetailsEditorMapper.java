package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.data.LegalDetailsEditorDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorVO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0013\u0010\u000b\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$AttachFieldDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$AttachFieldVO;", "toVO", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$AttachFieldDTO;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$AttachFieldVO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$TextFieldDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$TextFieldVO;", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$TextFieldDTO;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$TextFieldVO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$FileFieldDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$FileFieldVO;", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO$FileFieldDTO;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$FileFieldVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/data/LegalDetailsEditorDTO;Ll20/d;)Ljava/util/List;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LegalDetailsEditorMapper implements Function2<LegalDetailsEditorDTO, d, List<? extends LegalDetailsEditorVO>> {
    private final LegalDetailsEditorVO.AttachFieldVO toVO(LegalDetailsEditorDTO.AttachFieldDTO attachFieldDTO) {
        TextDTO title = attachFieldDTO.getTitle();
        List<LegalDetailsEditorDTO.FileFieldDTO> fileFields = attachFieldDTO.getFileFields();
        ArrayList arrayList = new ArrayList(C7714v.z(fileFields, 10));
        Iterator<T> it = fileFields.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((LegalDetailsEditorDTO.FileFieldDTO) it.next()));
        }
        return new LegalDetailsEditorVO.AttachFieldVO(title, arrayList);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<LegalDetailsEditorVO> invoke(@NotNull LegalDetailsEditorDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        LegalDetailsEditorVO.TextFieldVO vo = toVO(state.getTextField());
        LegalDetailsEditorVO.AttachFieldVO vo2 = toVO(state.getAttachField());
        ButtonDTO submitButton = state.getSubmitButton();
        TextDTO policyField = state.getPolicyField();
        return C7714v.a0(new LegalDetailsEditorVO(hashCode, vo, vo2, submitButton, policyField != null ? TextDTO.copy$default(policyField, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null) : null));
    }

    private final LegalDetailsEditorVO.TextFieldVO toVO(LegalDetailsEditorDTO.TextFieldDTO textFieldDTO) {
        return new LegalDetailsEditorVO.TextFieldVO(textFieldDTO.getTitle(), textFieldDTO.getPlaceholder(), textFieldDTO.getErrorRequiredText(), null, false, 24, null);
    }

    private final LegalDetailsEditorVO.FileFieldVO toVO(LegalDetailsEditorDTO.FileFieldDTO fileFieldDTO) {
        return new LegalDetailsEditorVO.FileFieldVO(fileFieldDTO.getName(), fileFieldDTO.getLabel(), fileFieldDTO.getFormats(), fileFieldDTO.getMaxSize(), fileFieldDTO.getLexemes(), fileFieldDTO.getButtonsStates(), null, 64, null);
    }
}
