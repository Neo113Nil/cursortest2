package ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.product.viewMapper;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVOKt;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImagesVOKt;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.data.ItemDTO;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.product.viewObject.ItemVO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/product/viewMapper/ReturnCreationItemMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/data/ItemDTO;", "Ll20/d;", "", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/product/viewObject/ItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVo", "(Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/data/ItemDTO;Ljava/lang/String;)Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/product/viewObject/ItemVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/data/ItemDTO;Ll20/d;)Ljava/util/List;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationItemMapper implements Function2<ItemDTO, d, List<? extends ItemVO>> {
    private final ItemVO toVo(ItemDTO itemDTO, String str) {
        TextDTO name = itemDTO.getName();
        return new ItemVO((str + "_" + name).hashCode(), itemDTO.getCheckbox(), itemDTO.getPrice(), itemDTO.getName(), itemDTO.getDescription(), itemDTO.getDueDate(), itemDTO.getQuantitySelector(), itemDTO.getBadge(), itemDTO.getCrossButton(), itemDTO.getCommon(), itemDTO.getButton(), itemDTO.isDisabled(), ImageVOKt.toVo(itemDTO.getItemImage(), null, null, ImagesVOKt.toGalleryItems(C7714v.a0(itemDTO.getItemImage()))), itemDTO.getSealBadge());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ItemVO> invoke(@NotNull ItemDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d()));
    }
}
