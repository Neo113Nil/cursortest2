package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.core;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0002\u001a \u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u0007"}, d2 = {"mapImage", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "createBlurImage", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "image", "", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UniversalGrid3MapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageDTO createBlurImage(ImageDTO imageDTO, boolean z11, String str) {
        ImageDTO copy;
        if (!z11 || str == null) {
            return null;
        }
        copy = imageDTO.copy((r34 & 1) != 0 ? imageDTO.image : str, (r34 & 2) != 0 ? imageDTO.backgroundColor : null, (r34 & 4) != 0 ? imageDTO.aspectRatio : ImageAspectRatio.RATIO_1_1, (r34 & 8) != 0 ? imageDTO.hasParanja : false, (r34 & 16) != 0 ? imageDTO.layoutPaddingLeft : null, (r34 & 32) != 0 ? imageDTO.layoutPaddingRight : null, (r34 & 64) != 0 ? imageDTO.layoutPaddingTop : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? imageDTO.layoutPaddingBottom : null, (r34 & 256) != 0 ? imageDTO.cornerRadius : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? imageDTO.context : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? imageDTO.testInfo : null, (r34 & 2048) != 0 ? imageDTO.trackingInfo : null, (r34 & 4096) != 0 ? imageDTO.imageWidth : null, (r34 & 8192) != 0 ? imageDTO.imageType : null, (r34 & 16384) != 0 ? imageDTO.fitType : null, (r34 & 32768) != 0 ? imageDTO.customRatio : null);
        return copy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageDTO mapImage(ImageDTO imageDTO) {
        ImageDTO copy;
        if (imageDTO.getImage() == null && imageDTO.getBackgroundColor() == null) {
            return null;
        }
        copy = imageDTO.copy((r34 & 1) != 0 ? imageDTO.image : null, (r34 & 2) != 0 ? imageDTO.backgroundColor : null, (r34 & 4) != 0 ? imageDTO.aspectRatio : ImageAspectRatio.RATIO_1_1, (r34 & 8) != 0 ? imageDTO.hasParanja : false, (r34 & 16) != 0 ? imageDTO.layoutPaddingLeft : null, (r34 & 32) != 0 ? imageDTO.layoutPaddingRight : null, (r34 & 64) != 0 ? imageDTO.layoutPaddingTop : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? imageDTO.layoutPaddingBottom : null, (r34 & 256) != 0 ? imageDTO.cornerRadius : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? imageDTO.context : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? imageDTO.testInfo : null, (r34 & 2048) != 0 ? imageDTO.trackingInfo : null, (r34 & 4096) != 0 ? imageDTO.imageWidth : null, (r34 & 8192) != 0 ? imageDTO.imageType : null, (r34 & 16384) != 0 ? imageDTO.fitType : null, (r34 & 32768) != 0 ? imageDTO.customRatio : null);
        return copy;
    }
}
