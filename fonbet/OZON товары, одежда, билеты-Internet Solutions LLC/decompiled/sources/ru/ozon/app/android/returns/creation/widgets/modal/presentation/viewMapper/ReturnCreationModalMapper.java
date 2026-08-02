package ru.ozon.app.android.returns.creation.widgets.modal.presentation.viewMapper;

import Tc.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.modal.data.ReturnCreationModalDTO;
import ru.ozon.app.android.returns.creation.widgets.modal.presentation.viewObject.ReturnCreationModalVO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/modal/presentation/viewMapper/ReturnCreationModalMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/returns/creation/widgets/modal/data/ReturnCreationModalDTO;", "Ll20/d;", "", "Lru/ozon/app/android/returns/creation/widgets/modal/presentation/viewObject/ReturnCreationModalVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVo", "(Lru/ozon/app/android/returns/creation/widgets/modal/data/ReturnCreationModalDTO;Ljava/lang/String;)Lru/ozon/app/android/returns/creation/widgets/modal/presentation/viewObject/ReturnCreationModalVO;", "", "areButtonsHorizontal", "(Lru/ozon/app/android/returns/creation/widgets/modal/data/ReturnCreationModalDTO;)Z", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/returns/creation/widgets/modal/data/ReturnCreationModalDTO;Ll20/d;)Ljava/util/List;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationModalMapper implements Function2<ReturnCreationModalDTO, d, List<? extends ReturnCreationModalVO>> {
    private final boolean areButtonsHorizontal(ReturnCreationModalDTO returnCreationModalDTO) {
        ReturnCreationModalDTO.ButtonsSettings buttonsSettings = returnCreationModalDTO.getButtonsSettings();
        return buttonsSettings != null && buttonsSettings.isHorizontal() && returnCreationModalDTO.getButtons().size() == 2;
    }

    private final ReturnCreationModalVO toVo(ReturnCreationModalDTO returnCreationModalDTO, String str) {
        long hashCode = str.hashCode();
        ImageDTO image = returnCreationModalDTO.getImage();
        TextDTO text = returnCreationModalDTO.getText();
        b builder = C7714v.B();
        List<AtomDTO> components = returnCreationModalDTO.getComponents();
        if (components != null) {
            List<AtomDTO> list = components;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            for (AtomDTO atomDTO : list) {
                if (atomDTO instanceof TextDTO) {
                    ((TextDTO) atomDTO).setTagSupported(true);
                } else if (atomDTO instanceof CellDTO) {
                    CellDTO cellDTO = (CellDTO) atomDTO;
                    cellDTO.getCenterBlock().getTitle().setTagSupported(true);
                    CellDTO.CellText subtitle = cellDTO.getCenterBlock().getSubtitle();
                    if (subtitle != null) {
                        subtitle.setTagSupported(true);
                    }
                }
                arrayList.add(atomDTO);
            }
            builder.addAll(arrayList);
        }
        if (!areButtonsHorizontal(returnCreationModalDTO)) {
            builder.addAll(returnCreationModalDTO.getButtons());
        }
        Unit unit = Unit.f71690a;
        Intrinsics.checkNotNullParameter(builder, "builder");
        b B11 = builder.B();
        b builder2 = C7714v.B();
        if (areButtonsHorizontal(returnCreationModalDTO)) {
            builder2.addAll(returnCreationModalDTO.getButtons());
        }
        Intrinsics.checkNotNullParameter(builder2, "builder");
        return new ReturnCreationModalVO(hashCode, image, text, B11, builder2.B());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ReturnCreationModalVO> invoke(@NotNull ReturnCreationModalDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d()));
    }
}
