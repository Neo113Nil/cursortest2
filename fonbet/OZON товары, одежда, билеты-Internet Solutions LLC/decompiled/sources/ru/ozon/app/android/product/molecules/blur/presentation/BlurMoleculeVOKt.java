package ru.ozon.app.android.product.molecules.blur.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.data.tiles.blur.BlurMoleculeContentDTO;
import ru.ozon.app.android.storefront.data.tiles.blur.BlurMoleculeDTO;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"toVO", "Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;", "Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeDTO;", "blurItemInfo", "", "", "Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeContentDTO;", "cornerRadius", "", "(Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeDTO;Ljava/util/Map;Ljava/lang/Float;)Lru/ozon/app/android/product/molecules/blur/presentation/BlurMoleculeVO;", "product_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BlurMoleculeVOKt {
    @NotNull
    public static final BlurMoleculeVO toVO(@NotNull BlurMoleculeDTO blurMoleculeDTO, Map<String, BlurMoleculeContentDTO> map, Float f7) {
        Intrinsics.checkNotNullParameter(blurMoleculeDTO, "<this>");
        BlurMoleculeContentDTO blurMoleculeContentDTO = map != null ? map.get(blurMoleculeDTO.getSharedContentKey()) : null;
        return new BlurMoleculeVO(blurMoleculeContentDTO != null ? blurMoleculeContentDTO.getIcon() : null, blurMoleculeContentDTO != null ? blurMoleculeContentDTO.getText() : null, blurMoleculeDTO.getBlurPlaceholderImage(), blurMoleculeDTO.getBlurType() != BlurMoleculeDTO.BlurType.ALWAYS, f7);
    }

    public static /* synthetic */ BlurMoleculeVO toVO$default(BlurMoleculeDTO blurMoleculeDTO, Map map, Float f7, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f7 = null;
        }
        return toVO(blurMoleculeDTO, map, f7);
    }
}
