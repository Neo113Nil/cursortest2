package ru.ozon.app.android.returns.common.mapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.list.ListElementAtom;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImageVOKt;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation.ImagesVOKt;
import ru.ozon.app.android.returns.common.data.dto.ReturnTotalDto;
import ru.ozon.app.android.returns.common.presentation.viewObject.ReturnTotalVO;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"toVo", "Lru/ozon/app/android/returns/common/presentation/viewObject/ReturnTotalVO;", "Lru/ozon/app/android/returns/common/data/dto/ReturnTotalDto;", "Lru/ozon/app/android/returns/common/presentation/viewObject/ReturnTotalVO$ItemPhoto;", "Lru/ozon/app/android/returns/common/data/dto/ReturnTotalDto$ItemPhoto;", "details_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnTotalsKt {
    @NotNull
    public static final ReturnTotalVO toVo(@NotNull ReturnTotalDto returnTotalDto) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(returnTotalDto, "<this>");
        List<ListElementAtom.TableRowListElement> amountDetailing = returnTotalDto.getAmountDetailing();
        if (amountDetailing == null) {
            amountDetailing = K.f71697a;
        }
        List<ReturnTotalDto.ItemPhoto> itemPhotos = returnTotalDto.getItemPhotos();
        if (itemPhotos != null) {
            List<ReturnTotalDto.ItemPhoto> list = itemPhotos;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(toVo((ReturnTotalDto.ItemPhoto) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new ReturnTotalVO(arrayList, amountDetailing, returnTotalDto.getDisclaimer());
    }

    private static final ReturnTotalVO.ItemPhoto toVo(ReturnTotalDto.ItemPhoto itemPhoto) {
        return new ReturnTotalVO.ItemPhoto(itemPhoto.getHint(), ImageVOKt.toVo(itemPhoto.getItemImage(), null, null, ImagesVOKt.toGalleryItems(C7714v.a0(itemPhoto.getItemImage()))));
    }
}
