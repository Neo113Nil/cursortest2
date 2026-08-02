package ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation;

import Sc.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileType;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.data.Collage;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.data.Image;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.data.ProductMediaDTO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\n\u0010\u0000\u001a\u00020\u0007*\u00020\b\u001a\n\u0010\u0000\u001a\u00020\t*\u00020\n¨\u0006\u000b"}, d2 = {"toVO", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ProductMediaVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/data/ProductMediaDTO;", "type", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileType;", "hasDefaultParanja", "", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/CollageVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/data/Collage;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/presentation/ImageVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/data/Image;", "widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductMediaMapperKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FreshTileType.values().length];
            try {
                iArr[FreshTileType.MINI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FreshTileType.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FreshTileType.MAX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final ProductMediaVO toVO(@NotNull ProductMediaDTO productMediaDTO, @NotNull FreshTileType type, boolean z11) {
        float pxF;
        Intrinsics.checkNotNullParameter(productMediaDTO, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        String imageUrl = productMediaDTO.getImageUrl();
        CornerRadius radius = productMediaDTO.getRadius();
        if (radius != null) {
            pxF = UiExtKt.toPxF(radius.getPx());
        } else {
            int i11 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i11 == 1) {
                pxF = UiExtKt.toPxF(CornerRadius.RADIUS_550.getPx());
            } else {
                if (i11 != 2 && i11 != 3) {
                    throw new o();
                }
                pxF = UiExtKt.toPxF(CornerRadius.RADIUS_650.getPx());
            }
        }
        Float valueOf = Float.valueOf(pxF);
        String backgroundColor = productMediaDTO.getBackgroundColor();
        String backgroundParanja = productMediaDTO.getBackgroundParanja();
        boolean isSemiTransparent = productMediaDTO.isSemiTransparent();
        boolean hasBlurAndNoise = productMediaDTO.getHasBlurAndNoise();
        Collage collage = productMediaDTO.getCollage();
        return new ProductMediaVO(imageUrl, valueOf, backgroundColor, backgroundParanja, isSemiTransparent, hasBlurAndNoise, collage != null ? toVO(collage) : null, z11);
    }

    public static /* synthetic */ ProductMediaVO toVO$default(ProductMediaDTO productMediaDTO, FreshTileType freshTileType, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return toVO(productMediaDTO, freshTileType, z11);
    }

    @NotNull
    public static final CollageVO toVO(@NotNull Collage collage) {
        List list;
        Intrinsics.checkNotNullParameter(collage, "<this>");
        List<Image> images = collage.getImages();
        if (images != null) {
            List<Image> list2 = images;
            list = new ArrayList(C7714v.z(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                list.add(toVO((Image) it.next()));
            }
        } else {
            list = K.f71697a;
        }
        CornerRadius collageItemRadius = collage.getCollageItemRadius();
        if (collageItemRadius == null) {
            collageItemRadius = CornerRadius.RADIUS_300;
        }
        return new CollageVO(list, Float.valueOf(UiExtKt.toPxF(collageItemRadius.getPx())));
    }

    @NotNull
    public static final ImageVO toVO(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "<this>");
        return new ImageVO(image.getUrl());
    }
}
