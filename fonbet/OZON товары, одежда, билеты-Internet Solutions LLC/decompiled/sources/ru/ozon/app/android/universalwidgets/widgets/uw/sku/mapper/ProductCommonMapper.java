package ru.ozon.app.android.universalwidgets.widgets.uw.sku.mapper;

import Sc.o;
import WZ.t;
import android.os.Parcelable;
import android.widget.ImageView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.texts.TextAtomWithIcon;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2;
import ru.ozon.app.android.product.common.core.GalleryItem;
import ru.ozon.app.android.product.common.core.OffsetModel;
import ru.ozon.app.android.product.common.overlaytitle.OverlayTitleView;
import ru.ozon.app.android.product.common.product.ImageTheme;
import ru.ozon.app.android.product.common.product.OverlayTitleModel;
import ru.ozon.app.android.product.common.product.ProductContainerDTO;
import ru.ozon.app.android.product.common.product.ProductDTO;
import ru.ozon.app.android.product.common.product.ProductVO;
import ru.ozon.app.android.product.common.product.SkuImageModel;
import ru.ozon.app.android.product.common.wave.WaveModel;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;
import ru.ozon.app.android.product.imagesswipeview.Paranja;
import ru.ozon.app.android.product.tiles.common.FavoriteProductMoleculeV2Mapper;
import ru.ozon.app.android.product.utils.RatioCalculatorKt;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.utils.ButtonAtomUtilsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.mappers.BadgeMapperKt;

@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 S2\u00020\u0001:\u0001SB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005Je\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0013¢\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u0004\u0018\u00010\u001d*\u00020\tH\u0002J\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001f*\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0016\u0010 \u001a\u0004\u0018\u00010!*\u00020\t2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010\"\u001a\u00020#H\u0002J_\u0010&\u001a\u00020'2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010)2\u0010\u0010*\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010+\u0018\u00010)2\b\u0010,\u001a\u0004\u0018\u00010\u00112\b\u0010-\u001a\u0004\u0018\u00010\u000b2\b\u0010.\u001a\u0004\u0018\u00010\u00112\u0006\u0010/\u001a\u00020\u00162\b\u00100\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0002\u00101J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0011H\u0002J\u0018\u00105\u001a\u0004\u0018\u000106*\u0002062\b\u00107\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u00108\u001a\u0004\u0018\u000109*\u0004\u0018\u00010:H\u0002J\u0018\u0010;\u001a\b\u0012\u0004\u0012\u00020<0)*\b\u0012\u0004\u0012\u00020<0)H\u0002J\u0013\u0010=\u001a\u00020\u0011*\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0002\u0010>J\"\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00010)*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010)2\u0006\u0010@\u001a\u00020\u0011H\u0002JG\u0010A\u001a\u00020'*\b\u0012\u0004\u0012\u00020\r0)2\b\u0010,\u001a\u0004\u0018\u00010\u00112\b\u0010-\u001a\u0004\u0018\u00010\u000b2\b\u0010.\u001a\u0004\u0018\u00010\u00112\u0006\u0010B\u001a\u00020C2\b\u00100\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0002\u0010DJM\u0010E\u001a\u00020F*\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\u00112\b\u0010-\u001a\u0004\u0018\u00010\u000b2\b\u0010.\u001a\u0004\u0018\u00010\u00112\u0006\u0010G\u001a\u00020C2\b\u00100\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010IH\u0002¢\u0006\u0002\u0010JJ\u000e\u0010K\u001a\u00020L*\u0004\u0018\u00010IH\u0002JK\u0010M\u001a\u00020N*\u00020O2\b\u0010,\u001a\u0004\u0018\u00010\u00112\b\u0010-\u001a\u0004\u0018\u00010\u000b2\b\u0010.\u001a\u0004\u0018\u00010\u00112\u0006\u0010/\u001a\u00020\u00162\b\u00100\u001a\u0004\u0018\u00010\r2\b\u0010P\u001a\u0004\u0018\u00010IH\u0002¢\u0006\u0002\u0010QJQ\u0010A\u001a\u00020'*\n\u0012\u0006\u0012\u0004\u0018\u00010+0)2\b\u0010,\u001a\u0004\u0018\u00010\u00112\b\u0010-\u001a\u0004\u0018\u00010\u000b2\b\u0010.\u001a\u0004\u0018\u00010\u00112\u0006\u0010/\u001a\u00020\u00162\u0006\u0010B\u001a\u00020C2\b\u00100\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0002\u0010RR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006T"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/mapper/ProductCommonMapper;", "", "productMoleculeV2Mapper", "Lru/ozon/app/android/product/tiles/common/FavoriteProductMoleculeV2Mapper;", "<init>", "(Lru/ozon/app/android/product/tiles/common/FavoriteProductMoleculeV2Mapper;)V", "productDtoToVo", "Lru/ozon/app/android/product/common/product/ProductVO;", "dto", "Lru/ozon/app/android/product/common/product/ProductDTO;", "containerOptions", "Lru/ozon/app/android/product/common/product/ProductContainerDTO$Options;", "widgetName", "", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "isLast", "", "buttonSubtitleHeight", "", "stateHeight", "parentVoId", "", "buttonSubtitleMaxLines", "(Lru/ozon/app/android/product/common/product/ProductDTO;Lru/ozon/app/android/product/common/product/ProductContainerDTO$Options;Ljava/lang/String;Lru/ozon/uni/atoms/data/TestInfo;ZIILjava/lang/Long;I)Lru/ozon/app/android/product/common/product/ProductVO;", "fixButtonSubtitleMaxLines", "productContainer", "Lru/ozon/app/android/product/common/product/ProductContainerDTO;", "getAction", "Lru/ozon/uni/atoms/af/AtomAction;", "buildOffsetModel", "Lru/ozon/app/android/product/common/core/OffsetModel;", "getOverlayTitleModel", "Lru/ozon/app/android/product/common/product/OverlayTitleModel;", "type", "Lru/ozon/app/android/product/common/product/ProductVO$Type;", "buildOverlayTitleSize", "Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView$SizeMode;", "getImageModel", "Lru/ozon/app/android/product/common/product/SkuImageModel;", "imageUrls", "", "items", "Lru/ozon/app/android/product/common/product/ProductDTO$ImageItemDTO;", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "options", "isFade", "voId", "blurPlaceholderImage", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lru/ozon/app/android/product/common/product/ProductContainerDTO$Options;Ljava/lang/Boolean;JLjava/lang/String;)Lru/ozon/app/android/product/common/product/SkuImageModel;", "setParanjaType", "Lru/ozon/app/android/product/imagesswipeview/Paranja;", "itemsAreFaded", "nullIfOverlayTitleExist", "Lru/ozon/uni/atoms/data/badge/Badge;", "overlayTitle", "toWaveModel", "Lru/ozon/app/android/product/common/wave/WaveModel;", "Lru/ozon/app/android/product/common/product/ImageTheme;", "mutateStateAction", "Lru/ozon/uni/atoms/data/AtomDTO;", "computeIsAdultFlag", "(Ljava/lang/Boolean;)Z", "modifyTopRightButtons", "compactFavoriteIcon", "mapImages", "ratio", "", "(Ljava/util/List;Ljava/lang/Boolean;Lru/ozon/app/android/product/common/product/ProductContainerDTO$Options;Ljava/lang/Boolean;FLjava/lang/String;)Lru/ozon/app/android/product/common/product/SkuImageModel;", "mapImageItem", "Lru/ozon/app/android/product/common/core/GalleryItem$ImageItem;", "computedRatio", "contentMode", "Lru/ozon/app/android/product/common/product/ProductDTO$ContentMode;", "(Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/product/common/product/ProductContainerDTO$Options;Ljava/lang/Boolean;FLjava/lang/String;Lru/ozon/app/android/product/common/product/ProductDTO$ContentMode;)Lru/ozon/app/android/product/common/core/GalleryItem$ImageItem;", "mapScaleType", "Landroid/widget/ImageView$ScaleType;", "mapVideo", "Lru/ozon/app/android/product/common/core/GalleryItem$VideoItem;", "Lru/ozon/app/android/product/common/product/ProductDTO$ImageItemDTO$VideoDTO;", "previewContentMode", "(Lru/ozon/app/android/product/common/product/ProductDTO$ImageItemDTO$VideoDTO;Ljava/lang/Boolean;Lru/ozon/app/android/product/common/product/ProductContainerDTO$Options;Ljava/lang/Boolean;JLjava/lang/String;Lru/ozon/app/android/product/common/product/ProductDTO$ContentMode;)Lru/ozon/app/android/product/common/core/GalleryItem$VideoItem;", "(Ljava/util/List;Ljava/lang/Boolean;Lru/ozon/app/android/product/common/product/ProductContainerDTO$Options;Ljava/lang/Boolean;JFLjava/lang/String;)Lru/ozon/app/android/product/common/product/SkuImageModel;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductCommonMapper {
    private static final float waveWidth = ResourceExtKt.toPxF(18);

    @NotNull
    private final FavoriteProductMoleculeV2Mapper productMoleculeV2Mapper;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ProductVO.Type.values().length];
            try {
                iArr[ProductVO.Type.GRID1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductVO.Type.GRID2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ProductDTO.ContentMode.values().length];
            try {
                iArr2[ProductDTO.ContentMode.SCALE_ASPECT_FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ProductDTO.ContentMode.SCALE_ASPECT_FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ProductDTO.ContentMode.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ProductCommonMapper(@NotNull FavoriteProductMoleculeV2Mapper productMoleculeV2Mapper) {
        Intrinsics.checkNotNullParameter(productMoleculeV2Mapper, "productMoleculeV2Mapper");
        this.productMoleculeV2Mapper = productMoleculeV2Mapper;
    }

    private final OffsetModel buildOffsetModel(ProductDTO productDTO, String str) {
        if (Intrinsics.d(str, ProductVO.Type.GRID2.getValue())) {
            return ButtonAtomUtilsKt.isSellerButton(productDTO.getButton()) ? new OffsetModel(false, 0, 1, null) : new OffsetModel(false, OffsetModel.INSTANCE.getBottomWithoutSellerIcon(), 1, null);
        }
        return null;
    }

    private final OverlayTitleView.SizeMode buildOverlayTitleSize(ProductVO.Type type) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        return (i11 == 1 || i11 == 2) ? OverlayTitleView.SizeMode.MEDIUM : OverlayTitleView.SizeMode.SMALL;
    }

    private final boolean computeIsAdultFlag(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final AtomAction getAction(ProductDTO productDTO) {
        AtomActionDTO action = productDTO.getAction();
        if (action == null) {
            String link = productDTO.getLink();
            action = link != null ? new AtomActionDTO(AtomActionDTO.Behavior.REDIRECT, link, null, null, 12, null) : null;
        }
        if (action != null) {
            return AtomActionMapperKt.toAtomAction(action, productDTO.getTrackingInfo());
        }
        return null;
    }

    private final SkuImageModel getImageModel(List<String> imageUrls, List<? extends ProductDTO.ImageItemDTO> items, Boolean isAdult, ProductContainerDTO.Options options, Boolean isFade, long voId, String blurPlaceholderImage) {
        String str;
        if (options == null || (str = options.getRatio()) == null) {
            str = "1:1";
        }
        float computeRatio$default = RatioCalculatorKt.computeRatio$default(str, null, 2, null);
        if (items != null) {
            List<? extends ProductDTO.ImageItemDTO> list = !items.isEmpty() ? items : null;
            if (list != null) {
                SkuImageModel mapImages = mapImages(list, isAdult, options, isFade, voId, computeRatio$default, blurPlaceholderImage);
                computeRatio$default = computeRatio$default;
                if (mapImages != null) {
                    return mapImages;
                }
            }
        }
        return imageUrls != null ? mapImages(imageUrls, isAdult, options, isFade, computeRatio$default, blurPlaceholderImage) : new SkuImageModel(null, null, false, 0.0f, 15, null);
    }

    private final OverlayTitleModel getOverlayTitleModel(ProductDTO productDTO, ProductVO.Type type) {
        String imageOverlayTitle = productDTO.getImageOverlayTitle();
        if (imageOverlayTitle == null) {
            return null;
        }
        return new OverlayTitleModel(imageOverlayTitle, buildOverlayTitleSize(type));
    }

    private final GalleryItem.ImageItem mapImageItem(String str, Boolean bool, ProductContainerDTO.Options options, Boolean bool2, float f7, String str2, ProductDTO.ContentMode contentMode) {
        return new GalleryItem.ImageItem(new AdultImageView.Image(str, new AdultImageView.Image.HeightMode.Relative(f7), 1.0f, options != null && options.getImageGrey(), computeIsAdultFlag(bool), false, str2, setParanjaType(Intrinsics.d(bool2 == null ? options != null ? Boolean.valueOf(options.getItemsAreFaded()) : null : bool2, Boolean.TRUE)), mapScaleType(contentMode), false, null, false, 3616, null), null, 2, null);
    }

    static /* synthetic */ GalleryItem.ImageItem mapImageItem$default(ProductCommonMapper productCommonMapper, String str, Boolean bool, ProductContainerDTO.Options options, Boolean bool2, float f7, String str2, ProductDTO.ContentMode contentMode, int i11, Object obj) {
        return productCommonMapper.mapImageItem(str, bool, options, bool2, f7, str2, (i11 & 32) != 0 ? ProductDTO.ContentMode.UNKNOWN : contentMode);
    }

    private final SkuImageModel mapImages(List<String> list, Boolean bool, ProductContainerDTO.Options options, Boolean bool2, float f7, String str) {
        String str2 = (String) C7714v.M(list);
        return new SkuImageModel(null, str2 != null ? mapImageItem$default(this, str2, bool, options, bool2, f7, str, null, 32, null) : null, false, f7, 5, null);
    }

    private final ImageView.ScaleType mapScaleType(ProductDTO.ContentMode contentMode) {
        int i11 = contentMode == null ? -1 : WhenMappings.$EnumSwitchMapping$1[contentMode.ordinal()];
        if (i11 == 1) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        if (i11 != 2 && i11 == 3) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        return ImageView.ScaleType.FIT_CENTER;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r20.getImageGrey() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final GalleryItem.VideoItem mapVideo(ProductDTO.ImageItemDTO.VideoDTO videoDTO, Boolean bool, ProductContainerDTO.Options options, Boolean bool2, long j11, String str, ProductDTO.ContentMode contentMode) {
        boolean z11;
        Map<String, TokenizedTrackingInfo> interruptedTrackingInfo;
        Map<String, TokenizedTrackingInfo> finishedTrackingInfo;
        Map<String, TokenizedTrackingInfo> startedTrackingInfo;
        String preview = videoDTO.getPreview();
        AdultImageView.Image.HeightMode.Unspecified unspecified = AdultImageView.Image.HeightMode.Unspecified.INSTANCE;
        boolean computeIsAdultFlag = computeIsAdultFlag(bool);
        ImageView.ScaleType mapScaleType = mapScaleType(contentMode);
        if (options != null) {
            z11 = true;
        }
        z11 = false;
        t tVar = null;
        AdultImageView.Image image = new AdultImageView.Image(preview, unspecified, 1.0f, z11, computeIsAdultFlag, false, str, setParanjaType(Intrinsics.d(bool2 == null ? options != null ? Boolean.valueOf(options.getItemsAreFaded()) : null : bool2, Boolean.TRUE)), mapScaleType, false, null, false, 3616, null);
        String link = videoDTO.getLink();
        ProductDTO.ImageItemDTO.VideoDTO.VideoTracking tracking = videoDTO.getTracking();
        t tokenizedEvent$default = (tracking == null || (startedTrackingInfo = tracking.getStartedTrackingInfo()) == null) ? null : TrackingInfoMapperKt.toTokenizedEvent$default(startedTrackingInfo, Long.valueOf(j11), null, 2, null);
        ProductDTO.ImageItemDTO.VideoDTO.VideoTracking tracking2 = videoDTO.getTracking();
        t tokenizedEvent$default2 = (tracking2 == null || (finishedTrackingInfo = tracking2.getFinishedTrackingInfo()) == null) ? null : TrackingInfoMapperKt.toTokenizedEvent$default(finishedTrackingInfo, Long.valueOf(j11), null, 2, null);
        ProductDTO.ImageItemDTO.VideoDTO.VideoTracking tracking3 = videoDTO.getTracking();
        if (tracking3 != null && (interruptedTrackingInfo = tracking3.getInterruptedTrackingInfo()) != null) {
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(interruptedTrackingInfo, Long.valueOf(j11), null, 2, null);
        }
        return new GalleryItem.VideoItem(image, link, tokenizedEvent$default, tokenizedEvent$default2, tVar);
    }

    private final List<Object> modifyTopRightButtons(List<? extends Object> list, boolean z11) {
        boolean z12;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof FavoriteProductMoleculeV2) {
                z12 = z11;
                obj = FavoriteProductMoleculeV2Mapper.map$default(this.productMoleculeV2Mapper, (FavoriteProductMoleculeV2) obj, z12, false, 4, null);
            } else {
                z12 = z11;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
            z11 = z12;
        }
        return arrayList;
    }

    private final List<AtomDTO> mutateStateAction(List<? extends AtomDTO> list) {
        List<? extends AtomDTO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (Parcelable parcelable : list2) {
            if (parcelable instanceof Badge) {
                Badge badge = (Badge) parcelable;
                if (badge.getAction() == null) {
                    parcelable = Badge.copy$default(badge, null, null, null, null, null, new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, "badgeActionId", null, 10, null), null, null, null, null, null, null, null, 8159, null);
                }
            }
            arrayList.add(parcelable);
        }
        return arrayList;
    }

    private final Badge nullIfOverlayTitleExist(Badge badge, String str) {
        if (str == null || h.K(str)) {
            return badge;
        }
        return null;
    }

    public static /* synthetic */ ProductVO productDtoToVo$default(ProductCommonMapper productCommonMapper, ProductDTO productDTO, ProductContainerDTO.Options options, String str, TestInfo testInfo, boolean z11, int i11, int i12, Long l11, int i13, int i14, Object obj) {
        if ((i14 & 16) != 0) {
            z11 = true;
        }
        if ((i14 & 32) != 0) {
            i11 = 0;
        }
        if ((i14 & 64) != 0) {
            i12 = 0;
        }
        if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            l11 = null;
        }
        if ((i14 & 256) != 0) {
            i13 = 1;
        }
        return productCommonMapper.productDtoToVo(productDTO, options, str, testInfo, z11, i11, i12, l11, i13);
    }

    private final Paranja setParanjaType(boolean itemsAreFaded) {
        return itemsAreFaded ? Paranja.PARANJA_BOTH_THEMES : Paranja.PARANJA_DISABLED_WHITE_BACKGROUND;
    }

    private final WaveModel toWaveModel(ImageTheme imageTheme) {
        if (imageTheme == ImageTheme.THEME_TYPE_WAVE) {
            return new WaveModel(waveWidth, 0, 2, null);
        }
        return null;
    }

    public final int fixButtonSubtitleMaxLines(@NotNull ProductContainerDTO productContainer) {
        TextAtomWithIcon buttonSubtitle;
        Integer maxLines;
        Intrinsics.checkNotNullParameter(productContainer, "productContainer");
        ProductDTO productDTO = (ProductDTO) C7714v.M(productContainer.getProducts());
        int intValue = (productDTO == null || (buttonSubtitle = productDTO.getButtonSubtitle()) == null || (maxLines = buttonSubtitle.getMaxLines()) == null) ? 1 : maxLines.intValue();
        if (intValue == 1 || intValue == 2) {
            return intValue;
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ProductVO productDtoToVo(@NotNull ProductDTO dto, ProductContainerDTO.Options containerOptions, @NotNull String widgetName, TestInfo testInfo, boolean isLast, int buttonSubtitleHeight, int stateHeight, Long parentVoId, int buttonSubtitleMaxLines) {
        int hashCode;
        int i11;
        TextAtomWithIcon textAtomWithIcon;
        TextAtomWithIcon copy$default;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        List<Object> topRightButtons;
        Boolean compactFavoriteIcon;
        Badge nullIfOverlayTitleExist;
        Badge nullIfOverlayTitleExist2;
        Integer maxLines;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetName, "widgetName");
        t tVar = null;
        if (dto.isAdult() == null) {
            return null;
        }
        if (dto.getState() == null && Intrinsics.d(widgetName, ProductVO.Type.LIST.getValue())) {
            return null;
        }
        List<AtomDTO> state = dto.getState();
        if (state != null) {
            hashCode = (Long.hashCode(dto.getSkuId()) + " " + state.hashCode() + " " + (parentVoId != null ? Integer.valueOf(parentVoId.hashCode()) : "")).hashCode();
        } else {
            hashCode = dto.hashCode();
        }
        long j11 = hashCode;
        TextAtomWithIcon buttonSubtitle = dto.getButtonSubtitle();
        if (buttonSubtitle == null || (maxLines = buttonSubtitle.getMaxLines()) == null) {
            i11 = buttonSubtitleMaxLines;
        } else {
            i11 = buttonSubtitleMaxLines;
            if (maxLines.intValue() == i11) {
                copy$default = dto.getButtonSubtitle();
                textAtomWithIcon = copy$default;
                ProductVO.Type fromString = ProductVO.Type.INSTANCE.fromString(widgetName);
                Badge leftBottomBadge = dto.getLeftBottomBadge();
                BadgeDTO mapToDsBadge = (leftBottomBadge != null || (nullIfOverlayTitleExist2 = nullIfOverlayTitleExist(leftBottomBadge, dto.getImageOverlayTitle())) == null) ? null : BadgeMapperKt.mapToDsBadge(nullIfOverlayTitleExist2);
                Badge secondLeftBottomBadge = dto.getSecondLeftBottomBadge();
                BadgeDTO mapToDsBadge2 = (secondLeftBottomBadge != null || (nullIfOverlayTitleExist = nullIfOverlayTitleExist(secondLeftBottomBadge, dto.getImageOverlayTitle())) == null) ? null : BadgeMapperKt.mapToDsBadge(nullIfOverlayTitleExist);
                ProductVO.BadgePadding fromType = (mapToDsBadge == null || mapToDsBadge2 != null) ? ProductVO.BadgePadding.INSTANCE.fromType(fromString) : null;
                boolean booleanValue = (containerOptions != null || (compactFavoriteIcon = containerOptions.getCompactFavoriteIcon()) == null) ? false : compactFavoriteIcon.booleanValue();
                long skuId = dto.getSkuId();
                SkuImageModel imageModel = getImageModel(dto.getImages(), dto.getItems(), Boolean.valueOf(computeIsAdultFlag(dto.isAdult())), containerOptions, dto.getImageIsFaded(), j11, dto.getBlurPlaceholderImage());
                boolean computeIsAdultFlag = computeIsAdultFlag(dto.isAdult());
                Boolean isFavorite = dto.isFavorite();
                AtomAction action = getAction(dto);
                List<AtomDTO> state2 = dto.getState();
                List<AtomDTO> mutateStateAction = state2 != null ? mutateStateAction(state2) : null;
                AtomDTO button = dto.getButton();
                Map<String, TokenizedTrackingInfo> trackingInfo2 = dto.getTrackingInfo();
                trackingInfo = dto.getTrackingInfo();
                if (trackingInfo != null) {
                    tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(parentVoId != null ? parentVoId.longValue() : j11), null, 2, null);
                }
                t tVar2 = tVar;
                topRightButtons = dto.getTopRightButtons();
                if (topRightButtons != null || (r1 = modifyTopRightButtons(topRightButtons, booleanValue)) == null) {
                    List<Object> list = K.f71697a;
                }
                List<Object> list2 = list;
                OverlayTitleModel overlayTitleModel = getOverlayTitleModel(dto, fromString);
                WaveModel waveModel = toWaveModel(dto.getImageTheme());
                Float imageAlpha = dto.getImageAlpha();
                float floatValue = imageAlpha != null ? imageAlpha.floatValue() : 1.0f;
                String imageOverlayPicture = dto.getImageOverlayPicture();
                long longValue = parentVoId != null ? parentVoId.longValue() : 0L;
                String backgroundColor = dto.getBackgroundColor();
                return new ProductVO(j11, fromString, skuId, imageModel, computeIsAdultFlag, false, dto.getBlurPlaceholderImage(), isFavorite, action, mutateStateAction, button, testInfo, trackingInfo2, tVar2, containerOptions, isLast, textAtomWithIcon, list2, imageOverlayPicture, floatValue, buttonSubtitleHeight, stateHeight, overlayTitleModel, waveModel, longValue, mapToDsBadge, mapToDsBadge2, fromType, backgroundColor, buildOffsetModel(dto, widgetName), ButtonAtomUtilsKt.getWidthModel(dto.getButton()), (dto.getSkuId() + " " + parentVoId).hashCode(), 32, null);
            }
        }
        TextAtomWithIcon buttonSubtitle2 = dto.getButtonSubtitle();
        if (buttonSubtitle2 == null) {
            textAtomWithIcon = null;
            ProductVO.Type fromString2 = ProductVO.Type.INSTANCE.fromString(widgetName);
            Badge leftBottomBadge2 = dto.getLeftBottomBadge();
            if (leftBottomBadge2 != null) {
            }
            Badge secondLeftBottomBadge2 = dto.getSecondLeftBottomBadge();
            if (secondLeftBottomBadge2 != null) {
            }
            if (mapToDsBadge == null) {
            }
            boolean booleanValue2 = (containerOptions != null || (compactFavoriteIcon = containerOptions.getCompactFavoriteIcon()) == null) ? false : compactFavoriteIcon.booleanValue();
            long skuId2 = dto.getSkuId();
            SkuImageModel imageModel2 = getImageModel(dto.getImages(), dto.getItems(), Boolean.valueOf(computeIsAdultFlag(dto.isAdult())), containerOptions, dto.getImageIsFaded(), j11, dto.getBlurPlaceholderImage());
            boolean computeIsAdultFlag2 = computeIsAdultFlag(dto.isAdult());
            Boolean isFavorite2 = dto.isFavorite();
            AtomAction action2 = getAction(dto);
            List<AtomDTO> state22 = dto.getState();
            if (state22 != null) {
            }
            AtomDTO button2 = dto.getButton();
            Map<String, TokenizedTrackingInfo> trackingInfo22 = dto.getTrackingInfo();
            trackingInfo = dto.getTrackingInfo();
            if (trackingInfo != null) {
            }
            t tVar22 = tVar;
            topRightButtons = dto.getTopRightButtons();
            if (topRightButtons != null) {
            }
            List<Object> list3 = K.f71697a;
            List<Object> list22 = list3;
            OverlayTitleModel overlayTitleModel2 = getOverlayTitleModel(dto, fromString2);
            WaveModel waveModel2 = toWaveModel(dto.getImageTheme());
            Float imageAlpha2 = dto.getImageAlpha();
            float floatValue2 = imageAlpha2 != null ? imageAlpha2.floatValue() : 1.0f;
            String imageOverlayPicture2 = dto.getImageOverlayPicture();
            long longValue2 = parentVoId != null ? parentVoId.longValue() : 0L;
            String backgroundColor2 = dto.getBackgroundColor();
            return new ProductVO(j11, fromString2, skuId2, imageModel2, computeIsAdultFlag2, false, dto.getBlurPlaceholderImage(), isFavorite2, action2, mutateStateAction, button2, testInfo, trackingInfo22, tVar22, containerOptions, isLast, textAtomWithIcon, list22, imageOverlayPicture2, floatValue2, buttonSubtitleHeight, stateHeight, overlayTitleModel2, waveModel2, longValue2, mapToDsBadge, mapToDsBadge2, fromType, backgroundColor2, buildOffsetModel(dto, widgetName), ButtonAtomUtilsKt.getWidthModel(dto.getButton()), (dto.getSkuId() + " " + parentVoId).hashCode(), 32, null);
        }
        copy$default = TextAtomWithIcon.copy$default(buttonSubtitle2, null, null, null, Integer.valueOf(i11), null, null, null, null, null, null, 1015, null);
        textAtomWithIcon = copy$default;
        ProductVO.Type fromString22 = ProductVO.Type.INSTANCE.fromString(widgetName);
        Badge leftBottomBadge22 = dto.getLeftBottomBadge();
        if (leftBottomBadge22 != null) {
        }
        Badge secondLeftBottomBadge22 = dto.getSecondLeftBottomBadge();
        if (secondLeftBottomBadge22 != null) {
        }
        if (mapToDsBadge == null) {
        }
        boolean booleanValue22 = (containerOptions != null || (compactFavoriteIcon = containerOptions.getCompactFavoriteIcon()) == null) ? false : compactFavoriteIcon.booleanValue();
        long skuId22 = dto.getSkuId();
        SkuImageModel imageModel22 = getImageModel(dto.getImages(), dto.getItems(), Boolean.valueOf(computeIsAdultFlag(dto.isAdult())), containerOptions, dto.getImageIsFaded(), j11, dto.getBlurPlaceholderImage());
        boolean computeIsAdultFlag22 = computeIsAdultFlag(dto.isAdult());
        Boolean isFavorite22 = dto.isFavorite();
        AtomAction action22 = getAction(dto);
        List<AtomDTO> state222 = dto.getState();
        if (state222 != null) {
        }
        AtomDTO button22 = dto.getButton();
        Map<String, TokenizedTrackingInfo> trackingInfo222 = dto.getTrackingInfo();
        trackingInfo = dto.getTrackingInfo();
        if (trackingInfo != null) {
        }
        t tVar222 = tVar;
        topRightButtons = dto.getTopRightButtons();
        if (topRightButtons != null) {
        }
        List<Object> list32 = K.f71697a;
        List<Object> list222 = list32;
        OverlayTitleModel overlayTitleModel22 = getOverlayTitleModel(dto, fromString22);
        WaveModel waveModel22 = toWaveModel(dto.getImageTheme());
        Float imageAlpha22 = dto.getImageAlpha();
        float floatValue22 = imageAlpha22 != null ? imageAlpha22.floatValue() : 1.0f;
        String imageOverlayPicture22 = dto.getImageOverlayPicture();
        long longValue22 = parentVoId != null ? parentVoId.longValue() : 0L;
        String backgroundColor22 = dto.getBackgroundColor();
        return new ProductVO(j11, fromString22, skuId22, imageModel22, computeIsAdultFlag22, false, dto.getBlurPlaceholderImage(), isFavorite22, action22, mutateStateAction, button22, testInfo, trackingInfo222, tVar222, containerOptions, isLast, textAtomWithIcon, list222, imageOverlayPicture22, floatValue22, buttonSubtitleHeight, stateHeight, overlayTitleModel22, waveModel22, longValue22, mapToDsBadge, mapToDsBadge2, fromType, backgroundColor22, buildOffsetModel(dto, widgetName), ButtonAtomUtilsKt.getWidthModel(dto.getButton()), (dto.getSkuId() + " " + parentVoId).hashCode(), 32, null);
    }

    private final SkuImageModel mapImages(List<? extends ProductDTO.ImageItemDTO> list, Boolean bool, ProductContainerDTO.Options options, Boolean bool2, long j11, float f7, String str) {
        GalleryItem.VideoItem videoItem = null;
        GalleryItem.ImageItem imageItem = null;
        for (ProductDTO.ImageItemDTO imageItemDTO : list) {
            if (imageItemDTO instanceof ProductDTO.ImageItemDTO.ImageDTO) {
                ProductDTO.ImageItemDTO.ImageDTO imageDTO = (ProductDTO.ImageItemDTO.ImageDTO) imageItemDTO;
                imageItem = mapImageItem(imageDTO.getLink(), bool, options, bool2, f7, str, imageDTO.getContentMode());
            } else if (imageItemDTO instanceof ProductDTO.ImageItemDTO.VideoDTO) {
                ProductDTO.ImageItemDTO.VideoDTO videoDTO = (ProductDTO.ImageItemDTO.VideoDTO) imageItemDTO;
                videoItem = mapVideo(videoDTO, bool, options, bool2, j11, str, videoDTO.getPreviewContentMode());
            } else if (imageItemDTO != null) {
                throw new o();
            }
        }
        return new SkuImageModel(videoItem, imageItem, videoItem != null, f7);
    }
}
