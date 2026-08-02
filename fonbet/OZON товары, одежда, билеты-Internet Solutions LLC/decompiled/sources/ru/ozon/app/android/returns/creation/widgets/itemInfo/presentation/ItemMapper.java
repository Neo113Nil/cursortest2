package ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVOKt;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImagesVOKt;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.data.ItemDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/itemInfo/presentation/ItemMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/returns/creation/widgets/itemInfo/data/ItemDTO;", "Ll20/d;", "", "Lru/ozon/app/android/returns/creation/widgets/itemInfo/presentation/ItemVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/returns/creation/widgets/itemInfo/data/ItemDTO;Ll20/d;)Ljava/util/List;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ItemMapper implements Function2<ItemDTO, d, List<? extends ItemVI>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ItemVI> invoke(@NotNull ItemDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        IconDTO image = state.getImage();
        ImageDTO csmaImage = state.getCsmaImage();
        return C7714v.a0(new ItemVI(hashCode, image, csmaImage != null ? ImageVOKt.toVo(csmaImage, null, null, ImagesVOKt.toGalleryItems(C7714v.a0(state.getCsmaImage()))) : null, state.getPrice(), state.getName(), state.getDescription(), state.getQuantitySelector(), state.getCommon(), state.getValidationText(), state.getDeleteButton(), state.getAnnotation(), state.getBackgroundColor()));
    }
}
