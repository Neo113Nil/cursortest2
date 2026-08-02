package ru.ozon.app.android.returns.creation.widgets.selectedItems.presentation.viewMapper;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.selectedItems.data.ReasonInfoDTO;
import ru.ozon.app.android.returns.creation.widgets.selectedItems.data.SelectedItemDTO;
import ru.ozon.app.android.returns.creation.widgets.selectedItems.presentation.viewObject.Reason;
import ru.ozon.app.android.returns.creation.widgets.selectedItems.presentation.viewObject.SelectedItemVO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0013\u0010\u000b\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewMapper/ReturnCreationSelectedItemMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/returns/creation/widgets/selectedItems/data/SelectedItemDTO;", "Ll20/d;", "", "Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewObject/SelectedItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVo", "(Lru/ozon/app/android/returns/creation/widgets/selectedItems/data/SelectedItemDTO;Ljava/lang/String;)Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewObject/SelectedItemVO;", "", "Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewObject/Reason;", "(Ljava/lang/Object;)Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewObject/Reason;", "Lru/ozon/app/android/returns/creation/widgets/selectedItems/data/ReasonInfoDTO;", "Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewObject/Reason$ReasonInfo;", "(Lru/ozon/app/android/returns/creation/widgets/selectedItems/data/ReasonInfoDTO;)Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewObject/Reason$ReasonInfo;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/returns/creation/widgets/selectedItems/data/SelectedItemDTO;Ll20/d;)Ljava/util/List;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationSelectedItemMapper implements Function2<SelectedItemDTO, d, List<? extends SelectedItemVO>> {
    private final SelectedItemVO toVo(SelectedItemDTO selectedItemDTO, String str) {
        return new SelectedItemVO(str.hashCode(), selectedItemDTO.getImage(), selectedItemDTO.getPrice(), selectedItemDTO.getName(), selectedItemDTO.getDescription(), selectedItemDTO.getCommon(), selectedItemDTO.getValidationText(), selectedItemDTO.getDeleteButton(), toVo(selectedItemDTO.getReason()), selectedItemDTO.getBackgroundColor(), selectedItemDTO.getSealBadge());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SelectedItemVO> invoke(@NotNull SelectedItemDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d()));
    }

    private final Reason toVo(Object obj) {
        return obj instanceof CellDTO ? new Reason.CellHolder((CellDTO) obj) : obj instanceof ReasonInfoDTO ? toVo((ReasonInfoDTO) obj) : Reason.None.INSTANCE;
    }

    private final Reason.ReasonInfo toVo(ReasonInfoDTO reasonInfoDTO) {
        return new Reason.ReasonInfo(reasonInfoDTO.getTitle(), reasonInfoDTO.getSubtitle(), reasonInfoDTO.getImages(), reasonInfoDTO.getButton());
    }
}
