package ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.group.viewMapper;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.data.DeliveryGroupTitleDTO;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.group.viewObject.DeliveryGroupVO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/group/viewMapper/ReturnCreationGroupMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/data/DeliveryGroupTitleDTO;", "Ll20/d;", "", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/group/viewObject/DeliveryGroupVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVo", "(Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/data/DeliveryGroupTitleDTO;Ljava/lang/String;)Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/group/viewObject/DeliveryGroupVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/data/DeliveryGroupTitleDTO;Ll20/d;)Ljava/util/List;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationGroupMapper implements Function2<DeliveryGroupTitleDTO, d, List<? extends DeliveryGroupVO>> {
    private final DeliveryGroupVO toVo(DeliveryGroupTitleDTO deliveryGroupTitleDTO, String str) {
        return new DeliveryGroupVO(str.hashCode(), deliveryGroupTitleDTO.getCheckbox(), deliveryGroupTitleDTO.getTitle(), deliveryGroupTitleDTO.getCommon());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DeliveryGroupVO> invoke(@NotNull DeliveryGroupTitleDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d()));
    }
}
