package ru.ozon.app.android.returns.details.presentation.viewObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVOKt;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImagesVOKt;
import ru.ozon.app.android.returns.details.data.dto.ReturnItemsDto;
import ru.ozon.app.android.returns.details.presentation.viewObject.ReturnItemsVO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"toVo", "Lru/ozon/app/android/returns/details/presentation/viewObject/ReturnItemsVO;", "Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto;", "Lru/ozon/app/android/returns/details/presentation/viewObject/ReturnItemsVO$ItemVO;", "Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$Item;", "Lru/ozon/app/android/returns/details/presentation/viewObject/ReturnItemsVO$ProductInfoVO;", "Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto$ProductInfo;", "details_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnItemsVOKt {
    @NotNull
    public static final ReturnItemsVO toVo(@NotNull ReturnItemsDto returnItemsDto) {
        Intrinsics.checkNotNullParameter(returnItemsDto, "<this>");
        TextAtom title = returnItemsDto.getTitle();
        ReturnItemsDto.Subtitle subtitle = returnItemsDto.getSubtitle();
        DisclaimerAtom packingInstruction = returnItemsDto.getPackingInstruction();
        List<ReturnItemsDto.Item> items = returnItemsDto.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVo((ReturnItemsDto.Item) it.next()));
        }
        return new ReturnItemsVO(title, subtitle, packingInstruction, arrayList);
    }

    @NotNull
    public static final ReturnItemsVO.ItemVO toVo(@NotNull ReturnItemsDto.Item item) {
        Intrinsics.checkNotNullParameter(item, "<this>");
        return new ReturnItemsVO.ItemVO(toVo(item.getProductInfo()), item.getReturnReason());
    }

    @NotNull
    public static final ReturnItemsVO.ProductInfoVO toVo(@NotNull ReturnItemsDto.ProductInfo productInfo) {
        Intrinsics.checkNotNullParameter(productInfo, "<this>");
        return new ReturnItemsVO.ProductInfoVO(productInfo.getProductLink(), productInfo.getPrice(), productInfo.getQuantity(), productInfo.getAttributes(), productInfo.getExemplarStates(), ImageVOKt.toVo(productInfo.getItemImage(), null, null, ImagesVOKt.toGalleryItems(C7714v.a0(productInfo.getItemImage()))));
    }
}
