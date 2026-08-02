package ru.ozon.app.android.sellerproducts.sellerProducts.data.model;

import B0.A0;
import G.g;
import Lh.b;
import N3.C3660k;
import Nh.a;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import g.C6594f;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.texts.TextAtomWithIcon;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2;
import ru.ozon.app.android.product.common.product.ImageBadge;
import ru.ozon.app.android.product.common.product.ImageTheme;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.core.UniColors;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001]Bã\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010\"\u001a\u00020\u000f¢\u0006\u0004\b#\u0010$J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\u0011\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010F\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010H\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010I\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0017\u0010N\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u0010<J\u0010\u0010R\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010S\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010!HÆ\u0003J\t\u0010U\u001a\u00020\u000fHÆ\u0003J\u008c\u0002\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020\u000fHÆ\u0001¢\u0006\u0002\u0010WJ\u0013\u0010X\u001a\u00020\f2\b\u0010Y\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Z\u001a\u00020[HÖ\u0001J\t\u0010\\\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010-\u001a\u0004\b\u000b\u0010,R\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010-\u001a\u0004\b\r\u0010,R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b5\u00102R\u001f\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b:\u0010/R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\n\n\u0002\u0010=\u001a\u0004\b;\u0010<R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010-\u001a\u0004\b>\u0010,R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b?\u0010/R\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\"\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\bB\u0010/¨\u0006^"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTO;", "", "skuId", "", "items", "", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTO$ImageItemDTO;", "favoriteButton", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV2;", "imageBadges", "Lru/ozon/app/android/product/common/product/ImageBadge;", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "isFavorite", "link", "", "state", "Lru/ozon/uni/atoms/data/AtomDTO;", "button", "buttonV3", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "secondaryButton", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "buttonSubtitle", "Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "imageOverlayPicture", "imageAlpha", "", "imageIsFaded", "imageOverlayTitle", "imageTheme", "Lru/ozon/app/android/product/common/product/ImageTheme;", "backgroundColor", "<init>", "(JLjava/util/List;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV2;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/util/Map;Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/app/android/product/common/product/ImageTheme;Ljava/lang/String;)V", "getSkuId", "()J", "getItems", "()Ljava/util/List;", "getFavoriteButton", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV2;", "getImageBadges", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLink", "()Ljava/lang/String;", "getState", "getButton", "()Lru/ozon/uni/atoms/data/AtomDTO;", "getButtonV3", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSecondaryButton", "getTrackingInfo", "()Ljava/util/Map;", "getButtonSubtitle", "()Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "getImageOverlayPicture", "getImageAlpha", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getImageIsFaded", "getImageOverlayTitle", "getImageTheme", "()Lru/ozon/app/android/product/common/product/ImageTheme;", "getBackgroundColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(JLjava/util/List;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV2;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/util/Map;Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/app/android/product/common/product/ImageTheme;Ljava/lang/String;)Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTO;", "equals", "other", "hashCode", "", "toString", "ImageItemDTO", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ProductDTO {

    @NotNull
    private final String backgroundColor;
    private final AtomDTO button;
    private final TextAtomWithIcon buttonSubtitle;
    private final ButtonV3DTO buttonV3;
    private final FavoriteProductMoleculeV2 favoriteButton;
    private final Float imageAlpha;
    private final List<ImageBadge> imageBadges;
    private final Boolean imageIsFaded;
    private final String imageOverlayPicture;
    private final String imageOverlayTitle;
    private final ImageTheme imageTheme;
    private final Boolean isAdult;
    private final Boolean isFavorite;
    private final List<ImageItemDTO> items;
    private final String link;
    private final AtomDTO secondaryButton;
    private final long skuId;
    private final List<AtomDTO> state;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTO$ImageItemDTO;", "", "<init>", "()V", "ImageDTO", "VideoDTO", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTO$ImageItemDTO$ImageDTO;", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTO$ImageItemDTO$VideoDTO;", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ImageItemDTO {

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTO$ImageItemDTO$ImageDTO;", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTO$ImageItemDTO;", "link", "", "<init>", "(Ljava/lang/String;)V", "getLink", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ImageDTO extends ImageItemDTO {

            @NotNull
            private final String link;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ImageDTO(@NotNull String link) {
                super(null);
                Intrinsics.checkNotNullParameter(link, "link");
                this.link = link;
            }

            public static /* synthetic */ ImageDTO copy$default(ImageDTO imageDTO, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = imageDTO.link;
                }
                return imageDTO.copy(str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getLink() {
                return this.link;
            }

            @NotNull
            public final ImageDTO copy(@NotNull String link) {
                Intrinsics.checkNotNullParameter(link, "link");
                return new ImageDTO(link);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ImageDTO) && Intrinsics.d(this.link, ((ImageDTO) other).link);
            }

            @NotNull
            public final String getLink() {
                return this.link;
            }

            public int hashCode() {
                return this.link.hashCode();
            }

            @NotNull
            public String toString() {
                return A0.b("ImageDTO(link=", this.link, ")");
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTO$ImageItemDTO$VideoDTO;", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTO$ImageItemDTO;", "preview", "", "link", "tracking", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTO$ImageItemDTO$VideoDTO$VideoTracking;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTO$ImageItemDTO$VideoDTO$VideoTracking;)V", "getPreview", "()Ljava/lang/String;", "getLink", "getTracking", "()Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTO$ImageItemDTO$VideoDTO$VideoTracking;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "VideoTracking", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class VideoDTO extends ImageItemDTO {

            @NotNull
            private final String link;

            @NotNull
            private final String preview;
            private final VideoTracking tracking;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0011\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTO$ImageItemDTO$VideoDTO$VideoTracking;", "", "startedTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "finishedTrackingInfo", "interruptedTrackingInfo", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getStartedTrackingInfo", "()Ljava/util/Map;", "getFinishedTrackingInfo", "getInterruptedTrackingInfo", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class VideoTracking {
                private final Map<String, TokenizedTrackingInfo> finishedTrackingInfo;
                private final Map<String, TokenizedTrackingInfo> interruptedTrackingInfo;
                private final Map<String, TokenizedTrackingInfo> startedTrackingInfo;

                public VideoTracking(Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3) {
                    this.startedTrackingInfo = map;
                    this.finishedTrackingInfo = map2;
                    this.interruptedTrackingInfo = map3;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ VideoTracking copy$default(VideoTracking videoTracking, Map map, Map map2, Map map3, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        map = videoTracking.startedTrackingInfo;
                    }
                    if ((i11 & 2) != 0) {
                        map2 = videoTracking.finishedTrackingInfo;
                    }
                    if ((i11 & 4) != 0) {
                        map3 = videoTracking.interruptedTrackingInfo;
                    }
                    return videoTracking.copy(map, map2, map3);
                }

                public final Map<String, TokenizedTrackingInfo> component1() {
                    return this.startedTrackingInfo;
                }

                public final Map<String, TokenizedTrackingInfo> component2() {
                    return this.finishedTrackingInfo;
                }

                public final Map<String, TokenizedTrackingInfo> component3() {
                    return this.interruptedTrackingInfo;
                }

                @NotNull
                public final VideoTracking copy(Map<String, TokenizedTrackingInfo> startedTrackingInfo, Map<String, TokenizedTrackingInfo> finishedTrackingInfo, Map<String, TokenizedTrackingInfo> interruptedTrackingInfo) {
                    return new VideoTracking(startedTrackingInfo, finishedTrackingInfo, interruptedTrackingInfo);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof VideoTracking)) {
                        return false;
                    }
                    VideoTracking videoTracking = (VideoTracking) other;
                    return Intrinsics.d(this.startedTrackingInfo, videoTracking.startedTrackingInfo) && Intrinsics.d(this.finishedTrackingInfo, videoTracking.finishedTrackingInfo) && Intrinsics.d(this.interruptedTrackingInfo, videoTracking.interruptedTrackingInfo);
                }

                public final Map<String, TokenizedTrackingInfo> getFinishedTrackingInfo() {
                    return this.finishedTrackingInfo;
                }

                public final Map<String, TokenizedTrackingInfo> getInterruptedTrackingInfo() {
                    return this.interruptedTrackingInfo;
                }

                public final Map<String, TokenizedTrackingInfo> getStartedTrackingInfo() {
                    return this.startedTrackingInfo;
                }

                public int hashCode() {
                    Map<String, TokenizedTrackingInfo> map = this.startedTrackingInfo;
                    int hashCode = (map == null ? 0 : map.hashCode()) * 31;
                    Map<String, TokenizedTrackingInfo> map2 = this.finishedTrackingInfo;
                    int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
                    Map<String, TokenizedTrackingInfo> map3 = this.interruptedTrackingInfo;
                    return hashCode2 + (map3 != null ? map3.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    Map<String, TokenizedTrackingInfo> map = this.startedTrackingInfo;
                    Map<String, TokenizedTrackingInfo> map2 = this.finishedTrackingInfo;
                    Map<String, TokenizedTrackingInfo> map3 = this.interruptedTrackingInfo;
                    StringBuilder sb2 = new StringBuilder("VideoTracking(startedTrackingInfo=");
                    sb2.append(map);
                    sb2.append(", finishedTrackingInfo=");
                    sb2.append(map2);
                    sb2.append(", interruptedTrackingInfo=");
                    return P.f(sb2, map3, ")");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VideoDTO(@NotNull String preview, @NotNull String link, VideoTracking videoTracking) {
                super(null);
                Intrinsics.checkNotNullParameter(preview, "preview");
                Intrinsics.checkNotNullParameter(link, "link");
                this.preview = preview;
                this.link = link;
                this.tracking = videoTracking;
            }

            public static /* synthetic */ VideoDTO copy$default(VideoDTO videoDTO, String str, String str2, VideoTracking videoTracking, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = videoDTO.preview;
                }
                if ((i11 & 2) != 0) {
                    str2 = videoDTO.link;
                }
                if ((i11 & 4) != 0) {
                    videoTracking = videoDTO.tracking;
                }
                return videoDTO.copy(str, str2, videoTracking);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getPreview() {
                return this.preview;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getLink() {
                return this.link;
            }

            /* renamed from: component3, reason: from getter */
            public final VideoTracking getTracking() {
                return this.tracking;
            }

            @NotNull
            public final VideoDTO copy(@NotNull String preview, @NotNull String link, VideoTracking tracking) {
                Intrinsics.checkNotNullParameter(preview, "preview");
                Intrinsics.checkNotNullParameter(link, "link");
                return new VideoDTO(preview, link, tracking);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VideoDTO)) {
                    return false;
                }
                VideoDTO videoDTO = (VideoDTO) other;
                return Intrinsics.d(this.preview, videoDTO.preview) && Intrinsics.d(this.link, videoDTO.link) && Intrinsics.d(this.tracking, videoDTO.tracking);
            }

            @NotNull
            public final String getLink() {
                return this.link;
            }

            @NotNull
            public final String getPreview() {
                return this.preview;
            }

            public final VideoTracking getTracking() {
                return this.tracking;
            }

            public int hashCode() {
                int a11 = g.a(this.preview.hashCode() * 31, 31, this.link);
                VideoTracking videoTracking = this.tracking;
                return a11 + (videoTracking == null ? 0 : videoTracking.hashCode());
            }

            @NotNull
            public String toString() {
                String str = this.preview;
                String str2 = this.link;
                VideoTracking videoTracking = this.tracking;
                StringBuilder d11 = C3660k.d("VideoDTO(preview=", str, ", link=", str2, ", tracking=");
                d11.append(videoTracking);
                d11.append(")");
                return d11.toString();
            }
        }

        public /* synthetic */ ImageItemDTO(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ImageItemDTO() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductDTO(long j11, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "image", type = ImageItemDTO.ImageDTO.class), @ProtoOneOfSignature(name = "video", type = ImageItemDTO.VideoDTO.class)}) @ProtoOneOf(label = "type") List<? extends ImageItemDTO> list, FavoriteProductMoleculeV2 favoriteProductMoleculeV2, List<ImageBadge> list2, Boolean bool, Boolean bool2, String str, List<? extends AtomDTO> list3, AtomDTO atomDTO, ButtonV3DTO buttonV3DTO, AtomDTO atomDTO2, Map<String, TokenizedTrackingInfo> map, TextAtomWithIcon textAtomWithIcon, String str2, Float f7, Boolean bool3, String str3, ImageTheme imageTheme, @NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.skuId = j11;
        this.items = list;
        this.favoriteButton = favoriteProductMoleculeV2;
        this.imageBadges = list2;
        this.isAdult = bool;
        this.isFavorite = bool2;
        this.link = str;
        this.state = list3;
        this.button = atomDTO;
        this.buttonV3 = buttonV3DTO;
        this.secondaryButton = atomDTO2;
        this.trackingInfo = map;
        this.buttonSubtitle = textAtomWithIcon;
        this.imageOverlayPicture = str2;
        this.imageAlpha = f7;
        this.imageIsFaded = bool3;
        this.imageOverlayTitle = str3;
        this.imageTheme = imageTheme;
        this.backgroundColor = backgroundColor;
    }

    public static /* synthetic */ ProductDTO copy$default(ProductDTO productDTO, long j11, List list, FavoriteProductMoleculeV2 favoriteProductMoleculeV2, List list2, Boolean bool, Boolean bool2, String str, List list3, AtomDTO atomDTO, ButtonV3DTO buttonV3DTO, AtomDTO atomDTO2, Map map, TextAtomWithIcon textAtomWithIcon, String str2, Float f7, Boolean bool3, String str3, ImageTheme imageTheme, String str4, int i11, Object obj) {
        String str5;
        ImageTheme imageTheme2;
        long j12 = (i11 & 1) != 0 ? productDTO.skuId : j11;
        List list4 = (i11 & 2) != 0 ? productDTO.items : list;
        FavoriteProductMoleculeV2 favoriteProductMoleculeV22 = (i11 & 4) != 0 ? productDTO.favoriteButton : favoriteProductMoleculeV2;
        List list5 = (i11 & 8) != 0 ? productDTO.imageBadges : list2;
        Boolean bool4 = (i11 & 16) != 0 ? productDTO.isAdult : bool;
        Boolean bool5 = (i11 & 32) != 0 ? productDTO.isFavorite : bool2;
        String str6 = (i11 & 64) != 0 ? productDTO.link : str;
        List list6 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productDTO.state : list3;
        AtomDTO atomDTO3 = (i11 & 256) != 0 ? productDTO.button : atomDTO;
        ButtonV3DTO buttonV3DTO2 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productDTO.buttonV3 : buttonV3DTO;
        AtomDTO atomDTO4 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productDTO.secondaryButton : atomDTO2;
        Map map2 = (i11 & 2048) != 0 ? productDTO.trackingInfo : map;
        TextAtomWithIcon textAtomWithIcon2 = (i11 & 4096) != 0 ? productDTO.buttonSubtitle : textAtomWithIcon;
        long j13 = j12;
        String str7 = (i11 & 8192) != 0 ? productDTO.imageOverlayPicture : str2;
        Float f11 = (i11 & 16384) != 0 ? productDTO.imageAlpha : f7;
        Boolean bool6 = (i11 & 32768) != 0 ? productDTO.imageIsFaded : bool3;
        String str8 = (i11 & 65536) != 0 ? productDTO.imageOverlayTitle : str3;
        ImageTheme imageTheme3 = (i11 & 131072) != 0 ? productDTO.imageTheme : imageTheme;
        if ((i11 & 262144) != 0) {
            imageTheme2 = imageTheme3;
            str5 = productDTO.backgroundColor;
        } else {
            str5 = str4;
            imageTheme2 = imageTheme3;
        }
        return productDTO.copy(j13, list4, favoriteProductMoleculeV22, list5, bool4, bool5, str6, list6, atomDTO3, buttonV3DTO2, atomDTO4, map2, textAtomWithIcon2, str7, f11, bool6, str8, imageTheme2, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final long getSkuId() {
        return this.skuId;
    }

    /* renamed from: component10, reason: from getter */
    public final ButtonV3DTO getButtonV3() {
        return this.buttonV3;
    }

    /* renamed from: component11, reason: from getter */
    public final AtomDTO getSecondaryButton() {
        return this.secondaryButton;
    }

    public final Map<String, TokenizedTrackingInfo> component12() {
        return this.trackingInfo;
    }

    /* renamed from: component13, reason: from getter */
    public final TextAtomWithIcon getButtonSubtitle() {
        return this.buttonSubtitle;
    }

    /* renamed from: component14, reason: from getter */
    public final String getImageOverlayPicture() {
        return this.imageOverlayPicture;
    }

    /* renamed from: component15, reason: from getter */
    public final Float getImageAlpha() {
        return this.imageAlpha;
    }

    /* renamed from: component16, reason: from getter */
    public final Boolean getImageIsFaded() {
        return this.imageIsFaded;
    }

    /* renamed from: component17, reason: from getter */
    public final String getImageOverlayTitle() {
        return this.imageOverlayTitle;
    }

    /* renamed from: component18, reason: from getter */
    public final ImageTheme getImageTheme() {
        return this.imageTheme;
    }

    @NotNull
    /* renamed from: component19, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<ImageItemDTO> component2() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final FavoriteProductMoleculeV2 getFavoriteButton() {
        return this.favoriteButton;
    }

    public final List<ImageBadge> component4() {
        return this.imageBadges;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getIsAdult() {
        return this.isAdult;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsFavorite() {
        return this.isFavorite;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    public final List<AtomDTO> component8() {
        return this.state;
    }

    /* renamed from: component9, reason: from getter */
    public final AtomDTO getButton() {
        return this.button;
    }

    @NotNull
    public final ProductDTO copy(long skuId, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "image", type = ImageItemDTO.ImageDTO.class), @ProtoOneOfSignature(name = "video", type = ImageItemDTO.VideoDTO.class)}) @ProtoOneOf(label = "type") List<? extends ImageItemDTO> items, FavoriteProductMoleculeV2 favoriteButton, List<ImageBadge> imageBadges, Boolean isAdult, Boolean isFavorite, String link, List<? extends AtomDTO> state, AtomDTO button, ButtonV3DTO buttonV3, AtomDTO secondaryButton, Map<String, TokenizedTrackingInfo> trackingInfo, TextAtomWithIcon buttonSubtitle, String imageOverlayPicture, Float imageAlpha, Boolean imageIsFaded, String imageOverlayTitle, ImageTheme imageTheme, @NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new ProductDTO(skuId, items, favoriteButton, imageBadges, isAdult, isFavorite, link, state, button, buttonV3, secondaryButton, trackingInfo, buttonSubtitle, imageOverlayPicture, imageAlpha, imageIsFaded, imageOverlayTitle, imageTheme, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductDTO)) {
            return false;
        }
        ProductDTO productDTO = (ProductDTO) other;
        return this.skuId == productDTO.skuId && Intrinsics.d(this.items, productDTO.items) && Intrinsics.d(this.favoriteButton, productDTO.favoriteButton) && Intrinsics.d(this.imageBadges, productDTO.imageBadges) && Intrinsics.d(this.isAdult, productDTO.isAdult) && Intrinsics.d(this.isFavorite, productDTO.isFavorite) && Intrinsics.d(this.link, productDTO.link) && Intrinsics.d(this.state, productDTO.state) && Intrinsics.d(this.button, productDTO.button) && Intrinsics.d(this.buttonV3, productDTO.buttonV3) && Intrinsics.d(this.secondaryButton, productDTO.secondaryButton) && Intrinsics.d(this.trackingInfo, productDTO.trackingInfo) && Intrinsics.d(this.buttonSubtitle, productDTO.buttonSubtitle) && Intrinsics.d(this.imageOverlayPicture, productDTO.imageOverlayPicture) && Intrinsics.d(this.imageAlpha, productDTO.imageAlpha) && Intrinsics.d(this.imageIsFaded, productDTO.imageIsFaded) && Intrinsics.d(this.imageOverlayTitle, productDTO.imageOverlayTitle) && this.imageTheme == productDTO.imageTheme && Intrinsics.d(this.backgroundColor, productDTO.backgroundColor);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final AtomDTO getButton() {
        return this.button;
    }

    public final TextAtomWithIcon getButtonSubtitle() {
        return this.buttonSubtitle;
    }

    public final ButtonV3DTO getButtonV3() {
        return this.buttonV3;
    }

    public final FavoriteProductMoleculeV2 getFavoriteButton() {
        return this.favoriteButton;
    }

    public final Float getImageAlpha() {
        return this.imageAlpha;
    }

    public final List<ImageBadge> getImageBadges() {
        return this.imageBadges;
    }

    public final Boolean getImageIsFaded() {
        return this.imageIsFaded;
    }

    public final String getImageOverlayPicture() {
        return this.imageOverlayPicture;
    }

    public final String getImageOverlayTitle() {
        return this.imageOverlayTitle;
    }

    public final ImageTheme getImageTheme() {
        return this.imageTheme;
    }

    public final List<ImageItemDTO> getItems() {
        return this.items;
    }

    public final String getLink() {
        return this.link;
    }

    public final AtomDTO getSecondaryButton() {
        return this.secondaryButton;
    }

    public final long getSkuId() {
        return this.skuId;
    }

    public final List<AtomDTO> getState() {
        return this.state;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.skuId) * 31;
        List<ImageItemDTO> list = this.items;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        FavoriteProductMoleculeV2 favoriteProductMoleculeV2 = this.favoriteButton;
        int hashCode3 = (hashCode2 + (favoriteProductMoleculeV2 == null ? 0 : favoriteProductMoleculeV2.hashCode())) * 31;
        List<ImageBadge> list2 = this.imageBadges;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.isAdult;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isFavorite;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.link;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        List<AtomDTO> list3 = this.state;
        int hashCode8 = (hashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        AtomDTO atomDTO = this.button;
        int hashCode9 = (hashCode8 + (atomDTO == null ? 0 : atomDTO.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.buttonV3;
        int hashCode10 = (hashCode9 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        AtomDTO atomDTO2 = this.secondaryButton;
        int hashCode11 = (hashCode10 + (atomDTO2 == null ? 0 : atomDTO2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode12 = (hashCode11 + (map == null ? 0 : map.hashCode())) * 31;
        TextAtomWithIcon textAtomWithIcon = this.buttonSubtitle;
        int hashCode13 = (hashCode12 + (textAtomWithIcon == null ? 0 : textAtomWithIcon.hashCode())) * 31;
        String str2 = this.imageOverlayPicture;
        int hashCode14 = (hashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f7 = this.imageAlpha;
        int hashCode15 = (hashCode14 + (f7 == null ? 0 : f7.hashCode())) * 31;
        Boolean bool3 = this.imageIsFaded;
        int hashCode16 = (hashCode15 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str3 = this.imageOverlayTitle;
        int hashCode17 = (hashCode16 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ImageTheme imageTheme = this.imageTheme;
        return this.backgroundColor.hashCode() + ((hashCode17 + (imageTheme != null ? imageTheme.hashCode() : 0)) * 31);
    }

    public final Boolean isAdult() {
        return this.isAdult;
    }

    public final Boolean isFavorite() {
        return this.isFavorite;
    }

    @NotNull
    public String toString() {
        long j11 = this.skuId;
        List<ImageItemDTO> list = this.items;
        FavoriteProductMoleculeV2 favoriteProductMoleculeV2 = this.favoriteButton;
        List<ImageBadge> list2 = this.imageBadges;
        Boolean bool = this.isAdult;
        Boolean bool2 = this.isFavorite;
        String str = this.link;
        List<AtomDTO> list3 = this.state;
        AtomDTO atomDTO = this.button;
        ButtonV3DTO buttonV3DTO = this.buttonV3;
        AtomDTO atomDTO2 = this.secondaryButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TextAtomWithIcon textAtomWithIcon = this.buttonSubtitle;
        String str2 = this.imageOverlayPicture;
        Float f7 = this.imageAlpha;
        Boolean bool3 = this.imageIsFaded;
        String str3 = this.imageOverlayTitle;
        ImageTheme imageTheme = this.imageTheme;
        String str4 = this.backgroundColor;
        StringBuilder b11 = b.b(j11, "ProductDTO(skuId=", ", items=", list);
        b11.append(", favoriteButton=");
        b11.append(favoriteProductMoleculeV2);
        b11.append(", imageBadges=");
        b11.append(list2);
        b11.append(", isAdult=");
        b11.append(bool);
        b11.append(", isFavorite=");
        b11.append(bool2);
        a.g(", link=", str, ", state=", b11, list3);
        b11.append(", button=");
        b11.append(atomDTO);
        b11.append(", buttonV3=");
        b11.append(buttonV3DTO);
        b11.append(", secondaryButton=");
        b11.append(atomDTO2);
        b11.append(", trackingInfo=");
        b11.append(map);
        b11.append(", buttonSubtitle=");
        b11.append(textAtomWithIcon);
        b11.append(", imageOverlayPicture=");
        b11.append(str2);
        b11.append(", imageAlpha=");
        b11.append(f7);
        b11.append(", imageIsFaded=");
        b11.append(bool3);
        b11.append(", imageOverlayTitle=");
        b11.append(str3);
        b11.append(", imageTheme=");
        b11.append(imageTheme);
        return C6594f.a(", backgroundColor=", str4, ")", b11);
    }

    public /* synthetic */ ProductDTO(long j11, List list, FavoriteProductMoleculeV2 favoriteProductMoleculeV2, List list2, Boolean bool, Boolean bool2, String str, List list3, AtomDTO atomDTO, ButtonV3DTO buttonV3DTO, AtomDTO atomDTO2, Map map, TextAtomWithIcon textAtomWithIcon, String str2, Float f7, Boolean bool3, String str3, ImageTheme imageTheme, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, favoriteProductMoleculeV2, list2, bool, bool2, str, list3, atomDTO, buttonV3DTO, atomDTO2, map, textAtomWithIcon, str2, f7, bool3, str3, imageTheme, (i11 & 262144) != 0 ? UniColors.LAYER_FLOOR_1.getToken() : str4);
    }
}
