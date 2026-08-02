package ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.item.viewHolder;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.common.presentation.decorations.CalculateTopAndBottomInCardDecoration;
import ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.item.viewObject.ReturnableItemVO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/item/viewHolder/BaseReturnableItemsDecoration;", "Lru/ozon/app/android/returns/common/presentation/decorations/CalculateTopAndBottomInCardDecoration;", "<init>", "()V", "topItemVO", "Ljava/lang/reflect/Type;", "getTopItemVO", "()Ljava/lang/reflect/Type;", "middleItemVOs", "", "getMiddleItemVOs", "()Ljava/util/List;", "bottomItemVO", "getBottomItemVO", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BaseReturnableItemsDecoration extends CalculateTopAndBottomInCardDecoration {

    @NotNull
    private final Type topItemVO = ReturnableItemVO.class;

    @NotNull
    private final List<Type> middleItemVOs = C7714v.a0(ReturnableItemVO.class);

    @NotNull
    private final Type bottomItemVO = ReturnableItemVO.class;

    @Override // ru.ozon.app.android.returns.common.presentation.decorations.CalculateTopAndBottomInCardDecoration
    @NotNull
    public Type getBottomItemVO() {
        return this.bottomItemVO;
    }

    @Override // ru.ozon.app.android.returns.common.presentation.decorations.CalculateTopAndBottomInCardDecoration
    @NotNull
    public List<Type> getMiddleItemVOs() {
        return this.middleItemVOs;
    }

    @Override // ru.ozon.app.android.returns.common.presentation.decorations.CalculateTopAndBottomInCardDecoration
    @NotNull
    public Type getTopItemVO() {
        return this.topItemVO;
    }
}
