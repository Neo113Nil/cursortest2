package ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.data.ComposableImageDTO;
import ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.data.ComposableImagesDTO;
import ru.ozon.app.android.gallery.GalleryRequest;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¨\u0006\u0007"}, d2 = {"toVo", "Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/presentation/ComposableImagesVO;", "Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/data/ComposableImagesDTO;", "toGalleryItems", "", "Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem;", "Lru/ozon/app/android/cscore/orderdetails/molecule/imagesCompose/data/ComposableImageDTO;", "csma_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableImagesVOKt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x000f A[SYNTHETIC] */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<GalleryRequest.GalleryItem> toGalleryItems(List<ComposableImageDTO> list) {
        String str;
        String image;
        GalleryRequest.GalleryItem.Image image2;
        ProductMediaDTO.Image image3;
        if (list == null) {
            list = K.f71697a;
        }
        ArrayList arrayList = new ArrayList();
        for (ComposableImageDTO composableImageDTO : list) {
            ProductMediaDTO productMedia = composableImageDTO.getProductMedia();
            if (productMedia == null || (image3 = productMedia.getImage()) == null || (image = image3.getUrl()) == null) {
                ImageDTO image4 = composableImageDTO.getImage();
                if (image4 != null) {
                    image = image4.getImage();
                } else {
                    str = null;
                    image2 = str != null ? new GalleryRequest.GalleryItem.Image(str, str, false, 4, null) : null;
                    if (image2 == null) {
                        arrayList.add(image2);
                    }
                }
            }
            str = image;
            if (str != null) {
            }
            if (image2 == null) {
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final ComposableImagesVO toVo(@NotNull ComposableImagesDTO composableImagesDTO) {
        ProductMediaDTO.Image image;
        Intrinsics.checkNotNullParameter(composableImagesDTO, "<this>");
        List<GalleryRequest.GalleryItem> galleryItems = toGalleryItems(composableImagesDTO.getImages());
        List<ComposableImageDTO> images = composableImagesDTO.getImages();
        K k11 = null;
        if (images != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : images) {
                ComposableImageDTO composableImageDTO = (ComposableImageDTO) obj;
                ProductMediaDTO productMedia = composableImageDTO.getProductMedia();
                if (((productMedia == null || (image = productMedia.getImage()) == null) ? null : image.getUrl()) == null) {
                    ImageDTO image2 = composableImageDTO.getImage();
                    if ((image2 != null ? image2.getImage() : null) != null) {
                    }
                }
                arrayList.add(obj);
            }
            ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(ComposableImageVOKt.toVo((ComposableImageDTO) it.next(), composableImagesDTO.getAction(), null, galleryItems));
            }
            k11 = arrayList2;
        }
        if (k11 == null) {
            k11 = K.f71697a;
        }
        TextDTO title = composableImagesDTO.getTitle();
        CommonControlSettings common = composableImagesDTO.getCommon();
        if (common == null) {
            common = new CommonControlSettings(composableImagesDTO.getAction(), null, null, 6, null);
        }
        return new ComposableImagesVO(k11, title, common);
    }
}
