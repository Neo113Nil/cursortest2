package ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.item.viewMapper;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.returnableItemsList.data.dto.ReturnableItemDTO;
import ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.item.viewObject.Caption;
import ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.item.viewObject.ReturnableItemVO;
import ru.ozon.app.android.returns.ui.molecules.checkbox.RmsCheckbox;
import ru.ozon.app.android.returns.ui.molecules.quantitySelector.QuantitySelector;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewMapper/ReturnableItemsListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Item;", "Ll20/d;", "", "Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewObject/ReturnableItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVo", "(Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Item;Ljava/lang/String;)Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewObject/ReturnableItemVO;", "Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Caption;", "Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewObject/Caption;", "(Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Caption;)Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewObject/Caption;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/returns/returnableItemsList/data/dto/ReturnableItemDTO$Item;Ll20/d;)Ljava/util/List;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnableItemsListMapper implements Function2<ReturnableItemDTO.Item, d, List<? extends ReturnableItemVO>> {
    private final ReturnableItemVO toVo(ReturnableItemDTO.Item item, String str) {
        long hashCode = (str + "-" + ((Object) item.getTitle().getText())).hashCode();
        RmsCheckbox checkbox = item.getCheckbox();
        String image = item.getImage();
        TextAtom title = item.getTitle();
        List<TextAtom> attributes = item.getAttributes();
        if (attributes == null) {
            attributes = K.f71697a;
        }
        Price price = item.getPrice();
        TextAtom quantity = item.getQuantity();
        ReturnableItemDTO.Caption caption = item.getCaption();
        Caption vo = caption != null ? toVo(caption) : null;
        ButtonV3Atom.SmallBorderlessButton itemAction = item.getItemAction();
        QuantitySelector quantitySelector = item.getQuantitySelector();
        Boolean isDisabled = item.isDisabled();
        AtomActionDTO action = item.getAction();
        return new ReturnableItemVO(hashCode, checkbox, image, title, attributes, price, quantity, vo, itemAction, quantitySelector, isDisabled, action != null ? AtomActionMapperKt.toAtomAction(action, null) : null, item.getTestInfo());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ReturnableItemVO> invoke(@NotNull ReturnableItemDTO.Item state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d()));
    }

    private final Caption toVo(ReturnableItemDTO.Caption caption) {
        return new Caption(caption.getText(), caption.getIcon());
    }
}
