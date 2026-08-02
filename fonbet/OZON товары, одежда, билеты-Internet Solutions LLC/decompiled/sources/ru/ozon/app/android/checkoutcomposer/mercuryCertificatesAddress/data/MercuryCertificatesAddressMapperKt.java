package ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.data;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.data.SearchMercuryAddressResponse;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation.vo.AddressesVO;
import ru.ozon.app.android.checkoutcomposer.mercuryCertificatesAddress.presentation.vo.MercuryCertificatesAddressVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0005\u001a\u00020\b*\u00020\u0007H\u0000¢\u0006\u0004\b\u0005\u0010\t\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0005\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/data/MercuryCertificatesAddressDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/vo/MercuryCertificatesAddressVO;", "toVO", "(Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/data/MercuryCertificatesAddressDTO;Ll20/d;)Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/vo/MercuryCertificatesAddressVO;", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/data/SearchMercuryAddressResponse;", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/vo/AddressesVO;", "(Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/data/SearchMercuryAddressResponse;)Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/vo/AddressesVO;", "", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/data/SearchMercuryAddressResponse$AddressDTO;", "Lru/ozon/app/android/checkoutcomposer/mercuryCertificatesAddress/presentation/vo/AddressesVO$AddressVO;", "(Ljava/util/List;)Ljava/util/List;", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MercuryCertificatesAddressMapperKt {
    @NotNull
    public static final MercuryCertificatesAddressVO toVO(@NotNull MercuryCertificatesAddressDTO mercuryCertificatesAddressDTO, @NotNull d info) {
        Intrinsics.checkNotNullParameter(mercuryCertificatesAddressDTO, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        String searchHint = mercuryCertificatesAddressDTO.getSearchHint();
        AtomActionDTO searchAction = mercuryCertificatesAddressDTO.getSearchAction();
        return new MercuryCertificatesAddressVO(hashCode, searchHint, searchAction != null ? AtomActionMapperKt.toAtomAction(searchAction, null) : null);
    }

    @NotNull
    public static final AddressesVO toVO(@NotNull SearchMercuryAddressResponse searchMercuryAddressResponse) {
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(searchMercuryAddressResponse, "<this>");
        List<SearchMercuryAddressResponse.AddressDTO> addresses = searchMercuryAddressResponse.getAddresses();
        AddressesVO.ErrorVO errorVO = null;
        List<AddressesVO.AddressVO> vo = addresses != null ? toVO(addresses) : null;
        SearchMercuryAddressResponse.ErrorDTO error = searchMercuryAddressResponse.getError();
        if (error != null && (action = error.getAction()) != null) {
            errorVO = new AddressesVO.ErrorVO(AtomActionMapperKt.toAtomAction(action, null));
        }
        return new AddressesVO(vo, errorVO);
    }

    private static final List<AddressesVO.AddressVO> toVO(List<SearchMercuryAddressResponse.AddressDTO> list) {
        List<SearchMercuryAddressResponse.AddressDTO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (SearchMercuryAddressResponse.AddressDTO addressDTO : list2) {
            TextDTO title = addressDTO.getTitle();
            CommonAtomIconDTO icon = addressDTO.getIcon();
            AtomActionDTO action = addressDTO.getAction();
            AtomAction atomAction = null;
            if (action != null) {
                atomAction = AtomActionMapperKt.toAtomAction(action, null);
            }
            arrayList.add(new AddressesVO.AddressVO(title, icon, atomAction));
        }
        return arrayList;
    }
}
