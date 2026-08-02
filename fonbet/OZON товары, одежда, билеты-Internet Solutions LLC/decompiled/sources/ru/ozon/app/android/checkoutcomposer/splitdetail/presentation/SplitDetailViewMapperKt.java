package ru.ozon.app.android.checkoutcomposer.splitdetail.presentation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.deprecated.Header;
import ru.ozon.app.android.atoms.data.deprecated.HorizontalContainer;
import ru.ozon.app.android.atoms.data.deprecated.VerticalContainer;
import ru.ozon.app.android.checkoutcomposer.splitdetail.data.SplitDetailDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.deprecated.Image;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/splitdetail/data/SplitDetailDTO;", "", "stateId", "Lru/ozon/app/android/checkoutcomposer/splitdetail/presentation/SplitDetailVO;", "toVO", "(Lru/ozon/app/android/checkoutcomposer/splitdetail/data/SplitDetailDTO;Ljava/lang/String;)Lru/ozon/app/android/checkoutcomposer/splitdetail/presentation/SplitDetailVO;", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SplitDetailViewMapperKt {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r1 != null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SplitDetailVO toVO(@NotNull SplitDetailDTO splitDetailDTO, @NotNull String stateId) {
        Collection collection;
        Intrinsics.checkNotNullParameter(splitDetailDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = stateId.hashCode();
        List<AtomDTO> headerElements = splitDetailDTO.getHeaderElements();
        if (headerElements != null) {
            List<AtomDTO> list = !headerElements.isEmpty() ? headerElements : null;
            if (list != null) {
                collection = C7714v.a0(new VerticalContainer(list, "ATOM_CONTEXT_HEADER_ELEMENTS_CONTAINER", null, null, 12, null));
            }
        }
        collection = K.f71697a;
        Collection collection2 = collection;
        List<SplitDetailDTO.Split> splits = splitDetailDTO.getSplits();
        ArrayList arrayList = new ArrayList();
        for (SplitDetailDTO.Split split : splits) {
            ArrayList arrayList2 = new ArrayList();
            String title = split.getTitle();
            if (title == null) {
                title = "";
            }
            String titleColor = split.getTitleColor();
            if (titleColor == null) {
                titleColor = UniColors.TEXT_PRIMARY.getToken();
            }
            List<AtomDTO> headerElements2 = splitDetailDTO.getHeaderElements();
            arrayList2.add(new Header(title, titleColor, null, null, null, (headerElements2 == null || !(headerElements2.isEmpty() ^ true)) ? "noTopPadding" : "topPadding", null, 92, null));
            for (SplitDetailDTO.Split.Product product : split.getProducts()) {
                SplitDetailDTO.Split.Product.Image image = product.getImage();
                String image2 = image != null ? image.getImage() : null;
                SplitDetailDTO.Split.Product.Image image3 = product.getImage();
                arrayList2.add(new HorizontalContainer(C7714v.b0(new Image(image2, image3 != null ? image3.getBorderColor() : null, null, null, null, null, 60, null), new VerticalContainer(product.getElements(), "ATOM_CONTEXT_PRODUCTS_CONTAINER", 0 == true ? 1 : 0, 0 == true ? 1 : 0, 12, null)), "ATOM_CONTEXT_PRODUCTS_CONTAINER", null, null, 12, 0 == true ? 1 : 0));
            }
            C7714v.p(arrayList2, arrayList);
        }
        return new SplitDetailVO(hashCode, C7714v.p0(arrayList, collection2));
    }
}
