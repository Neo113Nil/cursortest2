package ru.ozon.app.android.cscore.orderdetails.molecule.images.presentation;

import Ak.b;
import G.g;
import Kk.C3532b;
import Pk0.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.gallery.GalleryRequest;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0092\u0001\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b\t\u0010.R\"\u0010\n\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010-\u001a\u0004\b/\u0010.\"\u0004\b0\u00101R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b\u000b\u0010.R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b9\u0010\u001cR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010=\u001a\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "productMedia", "Lru/ozon/uni/atoms/data/text/TextDTO;", "counter", "", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "shouldBlur", "isTranslucent", "", "Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem;", "galleryItems", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "blurImageUrl", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO$Border;", "border", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "common", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZZZLjava/util/List;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO$Border;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "copy", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZZZLjava/util/List;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO$Border;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)Lru/ozon/app/android/cscore/orderdetails/molecule/images/presentation/ImageVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "getProductMedia", "()Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getCounter", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Z", "()Z", "getShouldBlur", "setShouldBlur", "(Z)V", "Ljava/util/List;", "getGalleryItems", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Ljava/lang/String;", "getBlurImageUrl", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO$Border;", "getBorder", "()Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO$Border;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ImageVO implements AdultVO {
    public static final int $stable = 8;
    private final BadgeDTO badge;
    private final String blurImageUrl;
    private final ImageDTO.Border border;
    private final CommonControlSettings common;
    private final TextDTO counter;

    @NotNull
    private final List<GalleryRequest.GalleryItem> galleryItems;
    private final ru.ozon.uni.atoms.data.image.ImageDTO image;
    private final boolean isAdult;
    private final boolean isTranslucent;
    private final ProductMediaDTO productMedia;
    private boolean shouldBlur;

    /* JADX WARN: Multi-variable type inference failed */
    public ImageVO(ru.ozon.uni.atoms.data.image.ImageDTO imageDTO, ProductMediaDTO productMediaDTO, TextDTO textDTO, boolean z11, boolean z12, boolean z13, @NotNull List<? extends GalleryRequest.GalleryItem> galleryItems, BadgeDTO badgeDTO, String str, ImageDTO.Border border, CommonControlSettings commonControlSettings) {
        Intrinsics.checkNotNullParameter(galleryItems, "galleryItems");
        this.image = imageDTO;
        this.productMedia = productMediaDTO;
        this.counter = textDTO;
        this.isAdult = z11;
        this.shouldBlur = z12;
        this.isTranslucent = z13;
        this.galleryItems = galleryItems;
        this.badge = badgeDTO;
        this.blurImageUrl = str;
        this.border = border;
        this.common = commonControlSettings;
    }

    public static /* synthetic */ ImageVO copy$default(ImageVO imageVO, ru.ozon.uni.atoms.data.image.ImageDTO imageDTO, ProductMediaDTO productMediaDTO, TextDTO textDTO, boolean z11, boolean z12, boolean z13, List list, BadgeDTO badgeDTO, String str, ImageDTO.Border border, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = imageVO.image;
        }
        if ((i11 & 2) != 0) {
            productMediaDTO = imageVO.productMedia;
        }
        if ((i11 & 4) != 0) {
            textDTO = imageVO.counter;
        }
        if ((i11 & 8) != 0) {
            z11 = imageVO.isAdult;
        }
        if ((i11 & 16) != 0) {
            z12 = imageVO.shouldBlur;
        }
        if ((i11 & 32) != 0) {
            z13 = imageVO.isTranslucent;
        }
        if ((i11 & 64) != 0) {
            list = imageVO.galleryItems;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            badgeDTO = imageVO.badge;
        }
        if ((i11 & 256) != 0) {
            str = imageVO.blurImageUrl;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            border = imageVO.border;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            commonControlSettings = imageVO.common;
        }
        ImageDTO.Border border2 = border;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        BadgeDTO badgeDTO2 = badgeDTO;
        String str2 = str;
        boolean z14 = z13;
        List list2 = list;
        boolean z15 = z12;
        TextDTO textDTO2 = textDTO;
        return imageVO.copy(imageDTO, productMediaDTO, textDTO2, z11, z15, z14, list2, badgeDTO2, str2, border2, commonControlSettings2);
    }

    @NotNull
    public final ImageVO copy(ru.ozon.uni.atoms.data.image.ImageDTO image, ProductMediaDTO productMedia, TextDTO counter, boolean isAdult, boolean shouldBlur, boolean isTranslucent, @NotNull List<? extends GalleryRequest.GalleryItem> galleryItems, BadgeDTO badge, String blurImageUrl, ImageDTO.Border border, CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(galleryItems, "galleryItems");
        return new ImageVO(image, productMedia, counter, isAdult, shouldBlur, isTranslucent, galleryItems, badge, blurImageUrl, border, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageVO)) {
            return false;
        }
        ImageVO imageVO = (ImageVO) other;
        return Intrinsics.d(this.image, imageVO.image) && Intrinsics.d(this.productMedia, imageVO.productMedia) && Intrinsics.d(this.counter, imageVO.counter) && this.isAdult == imageVO.isAdult && this.shouldBlur == imageVO.shouldBlur && this.isTranslucent == imageVO.isTranslucent && Intrinsics.d(this.galleryItems, imageVO.galleryItems) && Intrinsics.d(this.badge, imageVO.badge) && Intrinsics.d(this.blurImageUrl, imageVO.blurImageUrl) && Intrinsics.d(this.border, imageVO.border) && Intrinsics.d(this.common, imageVO.common);
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final String getBlurImageUrl() {
        return this.blurImageUrl;
    }

    public final ImageDTO.Border getBorder() {
        return this.border;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final TextDTO getCounter() {
        return this.counter;
    }

    @NotNull
    public final List<GalleryRequest.GalleryItem> getGalleryItems() {
        return this.galleryItems;
    }

    public final ru.ozon.uni.atoms.data.image.ImageDTO getImage() {
        return this.image;
    }

    public final ProductMediaDTO getProductMedia() {
        return this.productMedia;
    }

    public boolean getShouldBlur() {
        return this.shouldBlur;
    }

    public int hashCode() {
        ru.ozon.uni.atoms.data.image.ImageDTO imageDTO = this.image;
        int hashCode = (imageDTO == null ? 0 : imageDTO.hashCode()) * 31;
        ProductMediaDTO productMediaDTO = this.productMedia;
        int hashCode2 = (hashCode + (productMediaDTO == null ? 0 : productMediaDTO.hashCode())) * 31;
        TextDTO textDTO = this.counter;
        int b11 = g.b(C3532b.a(C3532b.a(C3532b.a((hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.isAdult), 31, this.shouldBlur), 31, this.isTranslucent), 31, this.galleryItems);
        BadgeDTO badgeDTO = this.badge;
        int hashCode3 = (b11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        String str = this.blurImageUrl;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        ImageDTO.Border border = this.border;
        int hashCode5 = (hashCode4 + (border == null ? 0 : border.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        return hashCode5 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
    }

    @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
    /* renamed from: isAdult, reason: from getter */
    public boolean getIsAdult() {
        return this.isAdult;
    }

    /* renamed from: isTranslucent, reason: from getter */
    public final boolean getIsTranslucent() {
        return this.isTranslucent;
    }

    @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
    public void setShouldBlur(boolean z11) {
        this.shouldBlur = z11;
    }

    @NotNull
    public String toString() {
        ru.ozon.uni.atoms.data.image.ImageDTO imageDTO = this.image;
        ProductMediaDTO productMediaDTO = this.productMedia;
        TextDTO textDTO = this.counter;
        boolean z11 = this.isAdult;
        boolean z12 = this.shouldBlur;
        boolean z13 = this.isTranslucent;
        List<GalleryRequest.GalleryItem> list = this.galleryItems;
        BadgeDTO badgeDTO = this.badge;
        String str = this.blurImageUrl;
        ImageDTO.Border border = this.border;
        CommonControlSettings commonControlSettings = this.common;
        StringBuilder sb2 = new StringBuilder("ImageVO(image=");
        sb2.append(imageDTO);
        sb2.append(", productMedia=");
        sb2.append(productMediaDTO);
        sb2.append(", counter=");
        sb2.append(textDTO);
        sb2.append(", isAdult=");
        sb2.append(z11);
        sb2.append(", shouldBlur=");
        f.c(", isTranslucent=", ", galleryItems=", sb2, z12, z13);
        sb2.append(list);
        sb2.append(", badge=");
        sb2.append(badgeDTO);
        sb2.append(", blurImageUrl=");
        sb2.append(str);
        sb2.append(", border=");
        sb2.append(border);
        sb2.append(", common=");
        return b.g(sb2, commonControlSettings, ")");
    }

    public /* synthetic */ ImageVO(ru.ozon.uni.atoms.data.image.ImageDTO imageDTO, ProductMediaDTO productMediaDTO, TextDTO textDTO, boolean z11, boolean z12, boolean z13, List list, BadgeDTO badgeDTO, String str, ImageDTO.Border border, CommonControlSettings commonControlSettings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageDTO, productMediaDTO, textDTO, z11, (i11 & 16) != 0 ? z11 : z12, z13, list, badgeDTO, str, border, commonControlSettings);
    }
}
