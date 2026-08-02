package ru.ozon.app.android.product.common.product;

import G.g;
import N3.C3660k;
import Sc.InterfaceC3999a;
import T7.P;
import Xc.a;
import Xc.b;
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
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.core.UniColors;
import spay.sdk.domain.model.FraudMonInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002deB\u0083\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0012\b\u0001\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\u0012\b\u0001\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010#\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\u0011\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0013\u0010J\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010L\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010+J\u000b\u0010N\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0017\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010=J\u0010\u0010V\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010+J\u0013\u0010W\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010!HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010!HÆ\u0003J\t\u0010\\\u001a\u00020\u0006HÆ\u0003J®\u0002\u0010]\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0012\b\u0003\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n2\u0012\b\u0003\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010#\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010^J\u0013\u0010_\u001a\u00020\n2\b\u0010`\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010a\u001a\u00020bHÖ\u0001J\t\u0010c\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001b\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010,\u001a\u0004\b\t\u0010+R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0015\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010,\u001a\u0004\b\f\u0010+R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u00100\u001a\u0004\b1\u0010.R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001f\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b;\u0010.R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\n\n\u0002\u0010>\u001a\u0004\b<\u0010=R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010,\u001a\u0004\b?\u0010+R\u001b\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u0010)R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bA\u0010.R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bF\u0010ER\u0011\u0010#\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bG\u0010.¨\u0006f"}, d2 = {"Lru/ozon/app/android/product/common/product/ProductDTO;", "", "skuId", "", "images", "", "", "items", "Lru/ozon/app/android/product/common/product/ProductDTO$ImageItemDTO;", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "blurPlaceholderImage", "isFavorite", "link", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "state", "Lru/ozon/uni/atoms/data/AtomDTO;", "button", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "buttonSubtitle", "Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "imageOverlayPicture", "imageAlpha", "", "imageIsFaded", "topRightButtons", "imageOverlayTitle", "imageTheme", "Lru/ozon/app/android/product/common/product/ImageTheme;", "leftBottomBadge", "Lru/ozon/uni/atoms/data/badge/Badge;", "secondLeftBottomBadge", "backgroundColor", "<init>", "(JLjava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/util/Map;Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/product/common/product/ImageTheme;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/lang/String;)V", "getSkuId", "()J", "getImages", "()Ljava/util/List;", "getItems", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBlurPlaceholderImage", "()Ljava/lang/String;", "getLink$annotations", "()V", "getLink", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getState", "getButton", "()Lru/ozon/uni/atoms/data/AtomDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getButtonSubtitle", "()Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "getImageOverlayPicture", "getImageAlpha", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getImageIsFaded", "getTopRightButtons", "getImageOverlayTitle", "getImageTheme", "()Lru/ozon/app/android/product/common/product/ImageTheme;", "getLeftBottomBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getSecondLeftBottomBadge", "getBackgroundColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(JLjava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/util/Map;Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/product/common/product/ImageTheme;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/uni/atoms/data/badge/Badge;Ljava/lang/String;)Lru/ozon/app/android/product/common/product/ProductDTO;", "equals", "other", "hashCode", "", "toString", "ImageItemDTO", "ContentMode", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProductDTO {
    private final AtomActionDTO action;

    @NotNull
    private final String backgroundColor;
    private final String blurPlaceholderImage;
    private final AtomDTO button;
    private final TextAtomWithIcon buttonSubtitle;
    private final Float imageAlpha;
    private final Boolean imageIsFaded;
    private final String imageOverlayPicture;
    private final String imageOverlayTitle;
    private final ImageTheme imageTheme;
    private final List<String> images;
    private final Boolean isAdult;
    private final Boolean isFavorite;
    private final List<ImageItemDTO> items;
    private final Badge leftBottomBadge;
    private final String link;
    private final Badge secondLeftBottomBadge;
    private final long skuId;
    private final List<AtomDTO> state;
    private final List<Object> topRightButtons;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/product/common/product/ProductDTO$ContentMode;", "", "<init>", "(Ljava/lang/String;I)V", FraudMonInfo.UNKNOWN, "SCALE_ASPECT_FIT", "SCALE_ASPECT_FILL", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ContentMode {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ContentMode[] $VALUES;
        public static final ContentMode UNKNOWN = new ContentMode(FraudMonInfo.UNKNOWN, 0);
        public static final ContentMode SCALE_ASPECT_FIT = new ContentMode("SCALE_ASPECT_FIT", 1);
        public static final ContentMode SCALE_ASPECT_FILL = new ContentMode("SCALE_ASPECT_FILL", 2);

        private static final /* synthetic */ ContentMode[] $values() {
            return new ContentMode[]{UNKNOWN, SCALE_ASPECT_FIT, SCALE_ASPECT_FILL};
        }

        static {
            ContentMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ContentMode(String str, int i11) {
        }

        public static ContentMode valueOf(String str) {
            return (ContentMode) Enum.valueOf(ContentMode.class, str);
        }

        public static ContentMode[] values() {
            return (ContentMode[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/product/common/product/ProductDTO$ImageItemDTO;", "", "<init>", "()V", "ImageDTO", "VideoDTO", "Lru/ozon/app/android/product/common/product/ProductDTO$ImageItemDTO$ImageDTO;", "Lru/ozon/app/android/product/common/product/ProductDTO$ImageItemDTO$VideoDTO;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ImageItemDTO {

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/product/common/product/ProductDTO$ImageItemDTO$ImageDTO;", "Lru/ozon/app/android/product/common/product/ProductDTO$ImageItemDTO;", "link", "", "contentMode", "Lru/ozon/app/android/product/common/product/ProductDTO$ContentMode;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/product/common/product/ProductDTO$ContentMode;)V", "getLink", "()Ljava/lang/String;", "getContentMode", "()Lru/ozon/app/android/product/common/product/ProductDTO$ContentMode;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ImageDTO extends ImageItemDTO {
            private final ContentMode contentMode;

            @NotNull
            private final String link;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ImageDTO(@NotNull String link, ContentMode contentMode) {
                super(null);
                Intrinsics.checkNotNullParameter(link, "link");
                this.link = link;
                this.contentMode = contentMode;
            }

            public static /* synthetic */ ImageDTO copy$default(ImageDTO imageDTO, String str, ContentMode contentMode, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = imageDTO.link;
                }
                if ((i11 & 2) != 0) {
                    contentMode = imageDTO.contentMode;
                }
                return imageDTO.copy(str, contentMode);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getLink() {
                return this.link;
            }

            /* renamed from: component2, reason: from getter */
            public final ContentMode getContentMode() {
                return this.contentMode;
            }

            @NotNull
            public final ImageDTO copy(@NotNull String link, ContentMode contentMode) {
                Intrinsics.checkNotNullParameter(link, "link");
                return new ImageDTO(link, contentMode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ImageDTO)) {
                    return false;
                }
                ImageDTO imageDTO = (ImageDTO) other;
                return Intrinsics.d(this.link, imageDTO.link) && this.contentMode == imageDTO.contentMode;
            }

            public final ContentMode getContentMode() {
                return this.contentMode;
            }

            @NotNull
            public final String getLink() {
                return this.link;
            }

            public int hashCode() {
                int hashCode = this.link.hashCode() * 31;
                ContentMode contentMode = this.contentMode;
                return hashCode + (contentMode == null ? 0 : contentMode.hashCode());
            }

            @NotNull
            public String toString() {
                return "ImageDTO(link=" + this.link + ", contentMode=" + this.contentMode + ")";
            }
        }

        public /* synthetic */ ImageItemDTO(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/product/common/product/ProductDTO$ImageItemDTO$VideoDTO;", "Lru/ozon/app/android/product/common/product/ProductDTO$ImageItemDTO;", "preview", "", "link", "tracking", "Lru/ozon/app/android/product/common/product/ProductDTO$ImageItemDTO$VideoDTO$VideoTracking;", "previewContentMode", "Lru/ozon/app/android/product/common/product/ProductDTO$ContentMode;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/product/common/product/ProductDTO$ImageItemDTO$VideoDTO$VideoTracking;Lru/ozon/app/android/product/common/product/ProductDTO$ContentMode;)V", "getPreview", "()Ljava/lang/String;", "getLink", "getTracking", "()Lru/ozon/app/android/product/common/product/ProductDTO$ImageItemDTO$VideoDTO$VideoTracking;", "getPreviewContentMode", "()Lru/ozon/app/android/product/common/product/ProductDTO$ContentMode;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "VideoTracking", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class VideoDTO extends ImageItemDTO {

            @NotNull
            private final String link;

            @NotNull
            private final String preview;
            private final ContentMode previewContentMode;
            private final VideoTracking tracking;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0011\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/product/common/product/ProductDTO$ImageItemDTO$VideoDTO$VideoTracking;", "", "startedTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "finishedTrackingInfo", "interruptedTrackingInfo", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getStartedTrackingInfo", "()Ljava/util/Map;", "getFinishedTrackingInfo", "getInterruptedTrackingInfo", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

            public /* synthetic */ VideoDTO(String str, String str2, VideoTracking videoTracking, ContentMode contentMode, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, videoTracking, (i11 & 8) != 0 ? ContentMode.SCALE_ASPECT_FILL : contentMode);
            }

            public static /* synthetic */ VideoDTO copy$default(VideoDTO videoDTO, String str, String str2, VideoTracking videoTracking, ContentMode contentMode, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = videoDTO.preview;
                }
                if ((i11 & 2) != 0) {
                    str2 = videoDTO.link;
                }
                if ((i11 & 4) != 0) {
                    videoTracking = videoDTO.tracking;
                }
                if ((i11 & 8) != 0) {
                    contentMode = videoDTO.previewContentMode;
                }
                return videoDTO.copy(str, str2, videoTracking, contentMode);
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

            /* renamed from: component4, reason: from getter */
            public final ContentMode getPreviewContentMode() {
                return this.previewContentMode;
            }

            @NotNull
            public final VideoDTO copy(@NotNull String preview, @NotNull String link, VideoTracking tracking, ContentMode previewContentMode) {
                Intrinsics.checkNotNullParameter(preview, "preview");
                Intrinsics.checkNotNullParameter(link, "link");
                return new VideoDTO(preview, link, tracking, previewContentMode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VideoDTO)) {
                    return false;
                }
                VideoDTO videoDTO = (VideoDTO) other;
                return Intrinsics.d(this.preview, videoDTO.preview) && Intrinsics.d(this.link, videoDTO.link) && Intrinsics.d(this.tracking, videoDTO.tracking) && this.previewContentMode == videoDTO.previewContentMode;
            }

            @NotNull
            public final String getLink() {
                return this.link;
            }

            @NotNull
            public final String getPreview() {
                return this.preview;
            }

            public final ContentMode getPreviewContentMode() {
                return this.previewContentMode;
            }

            public final VideoTracking getTracking() {
                return this.tracking;
            }

            public int hashCode() {
                int a11 = g.a(this.preview.hashCode() * 31, 31, this.link);
                VideoTracking videoTracking = this.tracking;
                int hashCode = (a11 + (videoTracking == null ? 0 : videoTracking.hashCode())) * 31;
                ContentMode contentMode = this.previewContentMode;
                return hashCode + (contentMode != null ? contentMode.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.preview;
                String str2 = this.link;
                VideoTracking videoTracking = this.tracking;
                ContentMode contentMode = this.previewContentMode;
                StringBuilder d11 = C3660k.d("VideoDTO(preview=", str, ", link=", str2, ", tracking=");
                d11.append(videoTracking);
                d11.append(", previewContentMode=");
                d11.append(contentMode);
                d11.append(")");
                return d11.toString();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VideoDTO(@NotNull String preview, @NotNull String link, VideoTracking videoTracking, ContentMode contentMode) {
                super(null);
                Intrinsics.checkNotNullParameter(preview, "preview");
                Intrinsics.checkNotNullParameter(link, "link");
                this.preview = preview;
                this.link = link;
                this.tracking = videoTracking;
                this.previewContentMode = contentMode;
            }
        }

        private ImageItemDTO() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductDTO(long j11, List<String> list, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "image", type = ImageItemDTO.ImageDTO.class), @ProtoOneOfSignature(name = "video", type = ImageItemDTO.VideoDTO.class)}) @ProtoOneOf(label = "type") List<? extends ImageItemDTO> list2, Boolean bool, String str, Boolean bool2, String str2, AtomActionDTO atomActionDTO, List<? extends AtomDTO> list3, AtomDTO atomDTO, Map<String, TokenizedTrackingInfo> map, TextAtomWithIcon textAtomWithIcon, String str3, Float f7, Boolean bool3, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "favoriteProductMolecule", type = FavoriteProductMolecule.class), @ProtoOneOfSignature(name = "favoriteProductMoleculeV2", type = FavoriteProductMoleculeV2.class), @ProtoOneOfSignature(name = "smallIconButton", type = ButtonV3Atom.SmallIconButton.class)}) @ProtoOneOf(label = "type") List<? extends Object> list4, String str4, ImageTheme imageTheme, Badge badge, Badge badge2, @NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.skuId = j11;
        this.images = list;
        this.items = list2;
        this.isAdult = bool;
        this.blurPlaceholderImage = str;
        this.isFavorite = bool2;
        this.link = str2;
        this.action = atomActionDTO;
        this.state = list3;
        this.button = atomDTO;
        this.trackingInfo = map;
        this.buttonSubtitle = textAtomWithIcon;
        this.imageOverlayPicture = str3;
        this.imageAlpha = f7;
        this.imageIsFaded = bool3;
        this.topRightButtons = list4;
        this.imageOverlayTitle = str4;
        this.imageTheme = imageTheme;
        this.leftBottomBadge = badge;
        this.secondLeftBottomBadge = badge2;
        this.backgroundColor = backgroundColor;
    }

    public static /* synthetic */ ProductDTO copy$default(ProductDTO productDTO, long j11, List list, List list2, Boolean bool, String str, Boolean bool2, String str2, AtomActionDTO atomActionDTO, List list3, AtomDTO atomDTO, Map map, TextAtomWithIcon textAtomWithIcon, String str3, Float f7, Boolean bool3, List list4, String str4, ImageTheme imageTheme, Badge badge, Badge badge2, String str5, int i11, Object obj) {
        String str6;
        Badge badge3;
        long j12 = (i11 & 1) != 0 ? productDTO.skuId : j11;
        List list5 = (i11 & 2) != 0 ? productDTO.images : list;
        List list6 = (i11 & 4) != 0 ? productDTO.items : list2;
        Boolean bool4 = (i11 & 8) != 0 ? productDTO.isAdult : bool;
        String str7 = (i11 & 16) != 0 ? productDTO.blurPlaceholderImage : str;
        Boolean bool5 = (i11 & 32) != 0 ? productDTO.isFavorite : bool2;
        String str8 = (i11 & 64) != 0 ? productDTO.link : str2;
        AtomActionDTO atomActionDTO2 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productDTO.action : atomActionDTO;
        List list7 = (i11 & 256) != 0 ? productDTO.state : list3;
        AtomDTO atomDTO2 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productDTO.button : atomDTO;
        Map map2 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productDTO.trackingInfo : map;
        TextAtomWithIcon textAtomWithIcon2 = (i11 & 2048) != 0 ? productDTO.buttonSubtitle : textAtomWithIcon;
        String str9 = (i11 & 4096) != 0 ? productDTO.imageOverlayPicture : str3;
        long j13 = j12;
        Float f11 = (i11 & 8192) != 0 ? productDTO.imageAlpha : f7;
        Boolean bool6 = (i11 & 16384) != 0 ? productDTO.imageIsFaded : bool3;
        List list8 = (i11 & 32768) != 0 ? productDTO.topRightButtons : list4;
        String str10 = (i11 & 65536) != 0 ? productDTO.imageOverlayTitle : str4;
        ImageTheme imageTheme2 = (i11 & 131072) != 0 ? productDTO.imageTheme : imageTheme;
        Badge badge4 = (i11 & 262144) != 0 ? productDTO.leftBottomBadge : badge;
        Badge badge5 = (i11 & 524288) != 0 ? productDTO.secondLeftBottomBadge : badge2;
        if ((i11 & 1048576) != 0) {
            badge3 = badge5;
            str6 = productDTO.backgroundColor;
        } else {
            str6 = str5;
            badge3 = badge5;
        }
        return productDTO.copy(j13, list5, list6, bool4, str7, bool5, str8, atomActionDTO2, list7, atomDTO2, map2, textAtomWithIcon2, str9, f11, bool6, list8, str10, imageTheme2, badge4, badge3, str6);
    }

    @InterfaceC3999a
    public static /* synthetic */ void getLink$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final long getSkuId() {
        return this.skuId;
    }

    /* renamed from: component10, reason: from getter */
    public final AtomDTO getButton() {
        return this.button;
    }

    public final Map<String, TokenizedTrackingInfo> component11() {
        return this.trackingInfo;
    }

    /* renamed from: component12, reason: from getter */
    public final TextAtomWithIcon getButtonSubtitle() {
        return this.buttonSubtitle;
    }

    /* renamed from: component13, reason: from getter */
    public final String getImageOverlayPicture() {
        return this.imageOverlayPicture;
    }

    /* renamed from: component14, reason: from getter */
    public final Float getImageAlpha() {
        return this.imageAlpha;
    }

    /* renamed from: component15, reason: from getter */
    public final Boolean getImageIsFaded() {
        return this.imageIsFaded;
    }

    public final List<Object> component16() {
        return this.topRightButtons;
    }

    /* renamed from: component17, reason: from getter */
    public final String getImageOverlayTitle() {
        return this.imageOverlayTitle;
    }

    /* renamed from: component18, reason: from getter */
    public final ImageTheme getImageTheme() {
        return this.imageTheme;
    }

    /* renamed from: component19, reason: from getter */
    public final Badge getLeftBottomBadge() {
        return this.leftBottomBadge;
    }

    public final List<String> component2() {
        return this.images;
    }

    /* renamed from: component20, reason: from getter */
    public final Badge getSecondLeftBottomBadge() {
        return this.secondLeftBottomBadge;
    }

    @NotNull
    /* renamed from: component21, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<ImageItemDTO> component3() {
        return this.items;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsAdult() {
        return this.isAdult;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBlurPlaceholderImage() {
        return this.blurPlaceholderImage;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsFavorite() {
        return this.isFavorite;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    /* renamed from: component8, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final List<AtomDTO> component9() {
        return this.state;
    }

    @NotNull
    public final ProductDTO copy(long skuId, List<String> images, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "image", type = ImageItemDTO.ImageDTO.class), @ProtoOneOfSignature(name = "video", type = ImageItemDTO.VideoDTO.class)}) @ProtoOneOf(label = "type") List<? extends ImageItemDTO> items, Boolean isAdult, String blurPlaceholderImage, Boolean isFavorite, String link, AtomActionDTO action, List<? extends AtomDTO> state, AtomDTO button, Map<String, TokenizedTrackingInfo> trackingInfo, TextAtomWithIcon buttonSubtitle, String imageOverlayPicture, Float imageAlpha, Boolean imageIsFaded, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "favoriteProductMolecule", type = FavoriteProductMolecule.class), @ProtoOneOfSignature(name = "favoriteProductMoleculeV2", type = FavoriteProductMoleculeV2.class), @ProtoOneOfSignature(name = "smallIconButton", type = ButtonV3Atom.SmallIconButton.class)}) @ProtoOneOf(label = "type") List<? extends Object> topRightButtons, String imageOverlayTitle, ImageTheme imageTheme, Badge leftBottomBadge, Badge secondLeftBottomBadge, @NotNull String backgroundColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        return new ProductDTO(skuId, images, items, isAdult, blurPlaceholderImage, isFavorite, link, action, state, button, trackingInfo, buttonSubtitle, imageOverlayPicture, imageAlpha, imageIsFaded, topRightButtons, imageOverlayTitle, imageTheme, leftBottomBadge, secondLeftBottomBadge, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductDTO)) {
            return false;
        }
        ProductDTO productDTO = (ProductDTO) other;
        return this.skuId == productDTO.skuId && Intrinsics.d(this.images, productDTO.images) && Intrinsics.d(this.items, productDTO.items) && Intrinsics.d(this.isAdult, productDTO.isAdult) && Intrinsics.d(this.blurPlaceholderImage, productDTO.blurPlaceholderImage) && Intrinsics.d(this.isFavorite, productDTO.isFavorite) && Intrinsics.d(this.link, productDTO.link) && Intrinsics.d(this.action, productDTO.action) && Intrinsics.d(this.state, productDTO.state) && Intrinsics.d(this.button, productDTO.button) && Intrinsics.d(this.trackingInfo, productDTO.trackingInfo) && Intrinsics.d(this.buttonSubtitle, productDTO.buttonSubtitle) && Intrinsics.d(this.imageOverlayPicture, productDTO.imageOverlayPicture) && Intrinsics.d(this.imageAlpha, productDTO.imageAlpha) && Intrinsics.d(this.imageIsFaded, productDTO.imageIsFaded) && Intrinsics.d(this.topRightButtons, productDTO.topRightButtons) && Intrinsics.d(this.imageOverlayTitle, productDTO.imageOverlayTitle) && this.imageTheme == productDTO.imageTheme && Intrinsics.d(this.leftBottomBadge, productDTO.leftBottomBadge) && Intrinsics.d(this.secondLeftBottomBadge, productDTO.secondLeftBottomBadge) && Intrinsics.d(this.backgroundColor, productDTO.backgroundColor);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBlurPlaceholderImage() {
        return this.blurPlaceholderImage;
    }

    public final AtomDTO getButton() {
        return this.button;
    }

    public final TextAtomWithIcon getButtonSubtitle() {
        return this.buttonSubtitle;
    }

    public final Float getImageAlpha() {
        return this.imageAlpha;
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

    public final List<String> getImages() {
        return this.images;
    }

    public final List<ImageItemDTO> getItems() {
        return this.items;
    }

    public final Badge getLeftBottomBadge() {
        return this.leftBottomBadge;
    }

    public final String getLink() {
        return this.link;
    }

    public final Badge getSecondLeftBottomBadge() {
        return this.secondLeftBottomBadge;
    }

    public final long getSkuId() {
        return this.skuId;
    }

    public final List<AtomDTO> getState() {
        return this.state;
    }

    public final List<Object> getTopRightButtons() {
        return this.topRightButtons;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.skuId) * 31;
        List<String> list = this.images;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<ImageItemDTO> list2 = this.items;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.isAdult;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.blurPlaceholderImage;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.isFavorite;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.link;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode8 = (hashCode7 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        List<AtomDTO> list3 = this.state;
        int hashCode9 = (hashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        AtomDTO atomDTO = this.button;
        int hashCode10 = (hashCode9 + (atomDTO == null ? 0 : atomDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode11 = (hashCode10 + (map == null ? 0 : map.hashCode())) * 31;
        TextAtomWithIcon textAtomWithIcon = this.buttonSubtitle;
        int hashCode12 = (hashCode11 + (textAtomWithIcon == null ? 0 : textAtomWithIcon.hashCode())) * 31;
        String str3 = this.imageOverlayPicture;
        int hashCode13 = (hashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f7 = this.imageAlpha;
        int hashCode14 = (hashCode13 + (f7 == null ? 0 : f7.hashCode())) * 31;
        Boolean bool3 = this.imageIsFaded;
        int hashCode15 = (hashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<Object> list4 = this.topRightButtons;
        int hashCode16 = (hashCode15 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str4 = this.imageOverlayTitle;
        int hashCode17 = (hashCode16 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ImageTheme imageTheme = this.imageTheme;
        int hashCode18 = (hashCode17 + (imageTheme == null ? 0 : imageTheme.hashCode())) * 31;
        Badge badge = this.leftBottomBadge;
        int hashCode19 = (hashCode18 + (badge == null ? 0 : badge.hashCode())) * 31;
        Badge badge2 = this.secondLeftBottomBadge;
        return this.backgroundColor.hashCode() + ((hashCode19 + (badge2 != null ? badge2.hashCode() : 0)) * 31);
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
        List<String> list = this.images;
        List<ImageItemDTO> list2 = this.items;
        Boolean bool = this.isAdult;
        String str = this.blurPlaceholderImage;
        Boolean bool2 = this.isFavorite;
        String str2 = this.link;
        AtomActionDTO atomActionDTO = this.action;
        List<AtomDTO> list3 = this.state;
        AtomDTO atomDTO = this.button;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TextAtomWithIcon textAtomWithIcon = this.buttonSubtitle;
        String str3 = this.imageOverlayPicture;
        Float f7 = this.imageAlpha;
        Boolean bool3 = this.imageIsFaded;
        List<Object> list4 = this.topRightButtons;
        String str4 = this.imageOverlayTitle;
        ImageTheme imageTheme = this.imageTheme;
        Badge badge = this.leftBottomBadge;
        Badge badge2 = this.secondLeftBottomBadge;
        String str5 = this.backgroundColor;
        StringBuilder b11 = Lh.b.b(j11, "ProductDTO(skuId=", ", images=", list);
        b11.append(", items=");
        b11.append(list2);
        b11.append(", isAdult=");
        b11.append(bool);
        b11.append(", blurPlaceholderImage=");
        b11.append(str);
        b11.append(", isFavorite=");
        b11.append(bool2);
        b11.append(", link=");
        b11.append(str2);
        b11.append(", action=");
        b11.append(atomActionDTO);
        b11.append(", state=");
        b11.append(list3);
        b11.append(", button=");
        b11.append(atomDTO);
        b11.append(", trackingInfo=");
        b11.append(map);
        b11.append(", buttonSubtitle=");
        b11.append(textAtomWithIcon);
        b11.append(", imageOverlayPicture=");
        b11.append(str3);
        b11.append(", imageAlpha=");
        b11.append(f7);
        b11.append(", imageIsFaded=");
        b11.append(bool3);
        b11.append(", topRightButtons=");
        b11.append(list4);
        b11.append(", imageOverlayTitle=");
        b11.append(str4);
        b11.append(", imageTheme=");
        b11.append(imageTheme);
        b11.append(", leftBottomBadge=");
        b11.append(badge);
        b11.append(", secondLeftBottomBadge=");
        b11.append(badge2);
        return C6594f.a(", backgroundColor=", str5, ")", b11);
    }

    public /* synthetic */ ProductDTO(long j11, List list, List list2, Boolean bool, String str, Boolean bool2, String str2, AtomActionDTO atomActionDTO, List list3, AtomDTO atomDTO, Map map, TextAtomWithIcon textAtomWithIcon, String str3, Float f7, Boolean bool3, List list4, String str4, ImageTheme imageTheme, Badge badge, Badge badge2, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, list2, bool, str, bool2, str2, atomActionDTO, list3, atomDTO, map, textAtomWithIcon, str3, f7, bool3, list4, str4, imageTheme, badge, badge2, (i11 & 1048576) != 0 ? UniColors.LAYER_FLOOR_1.getToken() : str5);
    }
}
