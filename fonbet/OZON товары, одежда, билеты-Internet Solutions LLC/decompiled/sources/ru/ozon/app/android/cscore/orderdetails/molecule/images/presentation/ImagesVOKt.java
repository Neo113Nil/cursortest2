package ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImagesDTO;
import ru.ozon.app.android.gallery.GalleryRequest;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¨\u0006\u0007"}, d2 = {"toVo", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImagesVO;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImagesDTO;", "toGalleryItems", "", "Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;", "csma_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ImagesVOKt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x000f A[SYNTHETIC] */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<GalleryRequest.GalleryItem> toGalleryItems(List<ImageDTO> list) {
        String str;
        String image;
        GalleryRequest.GalleryItem.Image image2;
        ProductMediaDTO.Image image3;
        if (list == null) {
            list = K.f71697a;
        }
        ArrayList arrayList = new ArrayList();
        for (ImageDTO imageDTO : list) {
            ProductMediaDTO productMedia = imageDTO.getProductMedia();
            if (productMedia == null || (image3 = productMedia.getImage()) == null || (image = image3.getUrl()) == null) {
                ru.ozon.uni.atoms.data.image.ImageDTO image4 = imageDTO.getImage();
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

    @NotNull
    public static final ImagesVO toVo(@NotNull ImagesDTO imagesDTO) {
        ProductMediaDTO.Image image;
        Intrinsics.checkNotNullParameter(imagesDTO, "<this>");
        List<GalleryRequest.GalleryItem> galleryItems = toGalleryItems(imagesDTO.getImages());
        List<ImageDTO> images = imagesDTO.getImages();
        List list = null;
        if (images != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : images) {
                ImageDTO imageDTO = (ImageDTO) obj;
                ProductMediaDTO productMedia = imageDTO.getProductMedia();
                if (((productMedia == null || (image = productMedia.getImage()) == null) ? null : image.getUrl()) == null) {
                    ru.ozon.uni.atoms.data.image.ImageDTO image2 = imageDTO.getImage();
                    if ((image2 != null ? image2.getImage() : null) != null) {
                    }
                }
                arrayList.add(obj);
            }
            List arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(ImageVOKt.toVo((ImageDTO) it.next(), imagesDTO.getAction(), null, galleryItems));
            }
            list = arrayList2;
        }
        if (list == null) {
            list = K.f71697a;
        }
        TextDTO title = imagesDTO.getTitle();
        CommonControlSettings common = imagesDTO.getCommon();
        if (common == null) {
            common = new CommonControlSettings(imagesDTO.getAction(), null, null, 6, null);
        }
        return new ImagesVO(list, title, common);
    }
}
