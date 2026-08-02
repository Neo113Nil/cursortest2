package ru.ozon.app.android.sellerproducts.sellerProducts.mapper;

import Sc.o;
import WZ.t;
import android.os.Parcelable;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.texts.TextAtomWithIcon;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2;
import ru.ozon.app.android.product.common.overlaytitle.OverlayTitleView;
import ru.ozon.app.android.product.common.product.ImageBadge;
import ru.ozon.app.android.product.common.product.ImageTheme;
import ru.ozon.app.android.product.common.product.OverlayTitleModel;
import ru.ozon.app.android.product.common.wave.WaveModel;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;
import ru.ozon.app.android.product.imagesswipeview.Paranja;
import ru.ozon.app.android.product.tiles.common.FavoriteProductMoleculeV2Mapper;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductDTO;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductVO;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.SkuImageModel;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 P2\u00020\u0001:\u0001PB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011*\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0011*\b\u0012\u0004\u0012\u00020\u001b0\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u001e*\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b#\u0010$JE\u0010.\u001a\u00020-2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u00112\b\u0010'\u001a\u0004\u0018\u00010\u001e2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010*\u001a\u0004\u0018\u00010\u001e2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b.\u0010/J9\u00103\u001a\u000202*\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010\u001e2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010*\u001a\u0004\u0018\u00010\u001e2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b3\u00104J9\u00107\u001a\u000206*\u0002052\b\u0010'\u001a\u0004\u0018\u00010\u001e2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010*\u001a\u0004\u0018\u00010\u001e2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b7\u00108JG\u0010:\u001a\u00020-*\b\u0012\u0004\u0012\u00020%0\u00112\b\u0010'\u001a\u0004\u0018\u00010\u001e2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010*\u001a\u0004\u0018\u00010\u001e2\u0006\u0010,\u001a\u00020+2\u0006\u00109\u001a\u000200H\u0002¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u0002002\b\u00109\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020?2\u0006\u0010>\u001a\u00020\u001eH\u0002¢\u0006\u0004\b@\u0010AJS\u0010L\u001a\u0004\u0018\u00010K2\u0006\u0010B\u001a\u00020\b2\b\u0010C\u001a\u0004\u0018\u00010(2\u0006\u0010E\u001a\u00020D2\b\b\u0002\u0010F\u001a\u00020\u001e2\b\b\u0002\u0010H\u001a\u00020G2\b\b\u0002\u0010I\u001a\u00020G2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010+¢\u0006\u0004\bL\u0010MR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010NR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010O¨\u0006Q"}, d2 = {"Lru/ozon/app/android/sellerproducts/sellerProducts/mapper/ProductCommonMapper;", "", "Lru/ozon/app/android/product/tiles/common/FavoriteProductMoleculeV2Mapper;", "favoriteProductMoleculeV2Mapper", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "teensModeStorage", "<init>", "(Lru/ozon/app/android/product/tiles/common/FavoriteProductMoleculeV2Mapper;Lru/ozon/app/android/storage/teensMode/TeensModeStorage;)V", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTO;", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$Type;", "type", "Lru/ozon/app/android/product/common/product/OverlayTitleModel;", "getOverlayTitleModel", "(Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTO;Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$Type;)Lru/ozon/app/android/product/common/product/OverlayTitleModel;", "Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView$SizeMode;", "buildOverlayTitleSize", "(Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$Type;)Lru/ozon/app/android/product/common/overlaytitle/OverlayTitleView$SizeMode;", "", "Lru/ozon/app/android/product/common/product/ImageBadge;", "", "overlayTitle", "filterByValidPositions", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/app/android/product/common/product/ImageTheme;", "Lru/ozon/app/android/product/common/wave/WaveModel;", "toWaveModel", "(Lru/ozon/app/android/product/common/product/ImageTheme;)Lru/ozon/app/android/product/common/wave/WaveModel;", "Lru/ozon/uni/atoms/data/AtomDTO;", "mutateStateAction", "(Ljava/util/List;)Ljava/util/List;", "", "computeIsAdultFlag", "(Ljava/lang/Boolean;)Z", "Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "buttonSubtitle", "fixButtonSubtitleMaxLines", "(Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$Type;)Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTO$ImageItemDTO;", "items", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO$Options;", "options", "isFade", "", "voId", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/SkuImageModel;", "getImageModel", "(Ljava/util/List;Ljava/lang/Boolean;Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO$Options;Ljava/lang/Boolean;J)Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/SkuImageModel;", "", "computedRatio", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$GalleryItem$ImageItem;", "mapImageItem", "(Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO$Options;Ljava/lang/Boolean;F)Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$GalleryItem$ImageItem;", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTO$ImageItemDTO$VideoDTO;", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$GalleryItem$VideoItem;", "mapVideo", "(Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTO$ImageItemDTO$VideoDTO;Ljava/lang/Boolean;Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO$Options;Ljava/lang/Boolean;J)Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO$GalleryItem$VideoItem;", "ratio", "mapImages", "(Ljava/util/List;Ljava/lang/Boolean;Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO$Options;Ljava/lang/Boolean;JF)Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/SkuImageModel;", "computeRatio", "(Ljava/lang/String;)F", "itemsAreFaded", "Lru/ozon/app/android/product/imagesswipeview/Paranja;", "setParanjaType", "(Z)Lru/ozon/app/android/product/imagesswipeview/Paranja;", "dto", "containerOptions", "Ll20/d;", "widgetInfo", "isLast", "", "buttonSubtitleHeight", "stateHeight", "parentVoId", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", "productDtoToVo", "(Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductDTO;Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductContainerDTO$Options;Ll20/d;ZIILjava/lang/Long;)Lru/ozon/app/android/sellerproducts/sellerProducts/data/model/ProductVO;", "Lru/ozon/app/android/product/tiles/common/FavoriteProductMoleculeV2Mapper;", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "Companion", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductCommonMapper {

    @NotNull
    private static final Set<String> VALID_POSITIONS;
    private static final float waveWidth;

    @NotNull
    private final FavoriteProductMoleculeV2Mapper favoriteProductMoleculeV2Mapper;

    @NotNull
    private final TeensModeStorage teensModeStorage;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
            try {
                iArr[ProductVO.Type.GRID3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProductVO.Type.SCROLL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        String[] elements = {"top", "bottom", "left", "right"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        VALID_POSITIONS = C7705l.j0(elements);
        waveWidth = ResourceExtKt.toPxF(18);
    }

    public ProductCommonMapper(@NotNull FavoriteProductMoleculeV2Mapper favoriteProductMoleculeV2Mapper, @NotNull TeensModeStorage teensModeStorage) {
        Intrinsics.checkNotNullParameter(favoriteProductMoleculeV2Mapper, "favoriteProductMoleculeV2Mapper");
        Intrinsics.checkNotNullParameter(teensModeStorage, "teensModeStorage");
        this.favoriteProductMoleculeV2Mapper = favoriteProductMoleculeV2Mapper;
        this.teensModeStorage = teensModeStorage;
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

    private final float computeRatio(String ratio) {
        if (Intrinsics.d(ratio, "1:1") || ratio == null) {
            return 1.0f;
        }
        List m11 = h.m(ratio, new String[]{ProductContainerDTO.RATIO_DELIMITER}, 0, 6);
        if (m11.size() != 2) {
            m11 = null;
        }
        if (m11 == null) {
            return 1.0f;
        }
        String str = (String) C7714v.M(m11);
        Float v02 = str != null ? h.v0(str) : null;
        String str2 = (String) C7714v.Q(1, m11);
        Float v03 = str2 != null ? h.v0(str2) : null;
        if (v03 == null || v02 == null) {
            return 1.0f;
        }
        return v03.floatValue() / v02.floatValue();
    }

    private final List<ImageBadge> filterByValidPositions(List<ImageBadge> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ImageBadge imageBadge = (ImageBadge) obj;
            if (str == null || !Intrinsics.d(imageBadge.getPosition().getY(), "bottom")) {
                Set<String> set = VALID_POSITIONS;
                if (set.contains(imageBadge.getPosition().getX()) && set.contains(imageBadge.getPosition().getY())) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    private final TextAtomWithIcon fixButtonSubtitleMaxLines(TextAtomWithIcon buttonSubtitle, ProductVO.Type type) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 != 2 && i11 != 3 && i11 != 4) {
            return buttonSubtitle;
        }
        if (buttonSubtitle != null) {
            return TextAtomWithIcon.copy$default(buttonSubtitle, null, null, null, 2, null, null, null, null, null, null, 1015, null);
        }
        return null;
    }

    private final SkuImageModel getImageModel(List<? extends ProductDTO.ImageItemDTO> items, Boolean isAdult, ProductContainerDTO.Options options, Boolean isFade, long voId) {
        String str;
        SkuImageModel mapImages;
        if (options == null || (str = options.getRatio()) == null) {
            str = "1:1";
        }
        float computeRatio = computeRatio(str);
        if (items != null) {
            if (items.isEmpty()) {
                items = null;
            }
            List<? extends ProductDTO.ImageItemDTO> list = items;
            if (list != null && (mapImages = mapImages(list, isAdult, options, isFade, voId, computeRatio)) != null) {
                return mapImages;
            }
        }
        return new SkuImageModel(null, null, false, 0.0f, 15, null);
    }

    private final OverlayTitleModel getOverlayTitleModel(ProductDTO productDTO, ProductVO.Type type) {
        String imageOverlayTitle = productDTO.getImageOverlayTitle();
        if (imageOverlayTitle == null) {
            return null;
        }
        return new OverlayTitleModel(imageOverlayTitle, buildOverlayTitleSize(type));
    }

    private final ProductVO.GalleryItem.ImageItem mapImageItem(String str, Boolean bool, ProductContainerDTO.Options options, Boolean bool2, float f7) {
        return new ProductVO.GalleryItem.ImageItem(new AdultImageView.Image(str, new AdultImageView.Image.HeightMode.Relative(f7), 1.0f, options != null && options.getImageGrey(), computeIsAdultFlag(bool), false, null, setParanjaType(Intrinsics.d(bool2 == null ? options != null ? Boolean.valueOf(options.getItemsAreFaded()) : null : bool2, Boolean.TRUE)), ImageView.ScaleType.FIT_CENTER, false, null, false, 3616, null));
    }

    private final SkuImageModel mapImages(List<? extends ProductDTO.ImageItemDTO> list, Boolean bool, ProductContainerDTO.Options options, Boolean bool2, long j11, float f7) {
        ProductVO.GalleryItem.VideoItem videoItem = null;
        ProductVO.GalleryItem.ImageItem imageItem = null;
        for (ProductDTO.ImageItemDTO imageItemDTO : list) {
            if (imageItemDTO instanceof ProductDTO.ImageItemDTO.ImageDTO) {
                imageItem = mapImageItem(((ProductDTO.ImageItemDTO.ImageDTO) imageItemDTO).getLink(), bool, options, bool2, f7);
            } else {
                if (!(imageItemDTO instanceof ProductDTO.ImageItemDTO.VideoDTO)) {
                    throw new o();
                }
                videoItem = mapVideo((ProductDTO.ImageItemDTO.VideoDTO) imageItemDTO, bool, options, bool2, j11);
            }
        }
        return new SkuImageModel(videoItem, imageItem, videoItem != null, f7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r21.getImageGrey() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ProductVO.GalleryItem.VideoItem mapVideo(ProductDTO.ImageItemDTO.VideoDTO videoDTO, Boolean bool, ProductContainerDTO.Options options, Boolean bool2, long j11) {
        boolean z11;
        Map<String, TokenizedTrackingInfo> interruptedTrackingInfo;
        Map<String, TokenizedTrackingInfo> finishedTrackingInfo;
        Map<String, TokenizedTrackingInfo> startedTrackingInfo;
        String preview = videoDTO.getPreview();
        AdultImageView.Image.HeightMode.Unspecified unspecified = AdultImageView.Image.HeightMode.Unspecified.INSTANCE;
        boolean computeIsAdultFlag = computeIsAdultFlag(bool);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        if (options != null) {
            z11 = true;
        }
        z11 = false;
        t tVar = null;
        AdultImageView.Image image = new AdultImageView.Image(preview, unspecified, 1.0f, z11, computeIsAdultFlag, false, null, setParanjaType(Intrinsics.d(bool2 == null ? options != null ? Boolean.valueOf(options.getItemsAreFaded()) : null : bool2, Boolean.TRUE)), scaleType, false, null, false, 3616, null);
        String link = videoDTO.getLink();
        ProductDTO.ImageItemDTO.VideoDTO.VideoTracking tracking = videoDTO.getTracking();
        t tokenizedEvent$default = (tracking == null || (startedTrackingInfo = tracking.getStartedTrackingInfo()) == null) ? null : TrackingInfoMapperKt.toTokenizedEvent$default(startedTrackingInfo, Long.valueOf(j11), null, 2, null);
        ProductDTO.ImageItemDTO.VideoDTO.VideoTracking tracking2 = videoDTO.getTracking();
        t tokenizedEvent$default2 = (tracking2 == null || (finishedTrackingInfo = tracking2.getFinishedTrackingInfo()) == null) ? null : TrackingInfoMapperKt.toTokenizedEvent$default(finishedTrackingInfo, Long.valueOf(j11), null, 2, null);
        ProductDTO.ImageItemDTO.VideoDTO.VideoTracking tracking3 = videoDTO.getTracking();
        if (tracking3 != null && (interruptedTrackingInfo = tracking3.getInterruptedTrackingInfo()) != null) {
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(interruptedTrackingInfo, Long.valueOf(j11), null, 2, null);
        }
        return new ProductVO.GalleryItem.VideoItem(image, link, tokenizedEvent$default, tokenizedEvent$default2, tVar);
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

    public static /* synthetic */ ProductVO productDtoToVo$default(ProductCommonMapper productCommonMapper, ProductDTO productDTO, ProductContainerDTO.Options options, d dVar, boolean z11, int i11, int i12, Long l11, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z11 = true;
        }
        return productCommonMapper.productDtoToVo(productDTO, options, dVar, z11, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? 0 : i12, (i13 & 64) != 0 ? null : l11);
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

    public final ProductVO productDtoToVo(@NotNull ProductDTO dto, ProductContainerDTO.Options containerOptions, @NotNull d widgetInfo, boolean isLast, int buttonSubtitleHeight, int stateHeight, Long parentVoId) {
        int hashCode;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        t tVar = null;
        if (dto.isAdult() == null) {
            return null;
        }
        String b11 = widgetInfo.c().b();
        if (dto.getState() == null && Intrinsics.d(b11, ProductVO.Type.LIST.getValue())) {
            return null;
        }
        List<AtomDTO> state = dto.getState();
        if (state != null) {
            hashCode = (Long.hashCode(dto.getSkuId()) + " " + state.hashCode()).hashCode();
        } else {
            hashCode = dto.hashCode();
        }
        long j11 = hashCode;
        ProductVO.Type fromString = ProductVO.Type.INSTANCE.fromString(widgetInfo.c().b());
        long skuId = dto.getSkuId();
        List<ImageBadge> imageBadges = dto.getImageBadges();
        List<ImageBadge> filterByValidPositions = imageBadges != null ? filterByValidPositions(imageBadges, dto.getImageOverlayTitle()) : null;
        boolean computeIsAdultFlag = computeIsAdultFlag(dto.isAdult());
        Boolean isFavorite = dto.isFavorite();
        AtomActionDTO atomActionDTO = new AtomActionDTO(AtomActionDTO.Behavior.REDIRECT, dto.getLink(), null, null, 12, null);
        SkuImageModel imageModel = getImageModel(dto.getItems(), Boolean.valueOf(computeIsAdultFlag(dto.isAdult())), containerOptions, dto.getImageIsFaded(), j11);
        List<AtomDTO> state2 = dto.getState();
        List<AtomDTO> mutateStateAction = state2 != null ? mutateStateAction(state2) : null;
        AtomDTO button = dto.getButton();
        ButtonV3DTO buttonV3 = dto.getButtonV3();
        AtomDTO secondaryButton = dto.getSecondaryButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        FavoriteProductMoleculeV2 favoriteButton = dto.getFavoriteButton();
        FavoriteProductMolecule map = favoriteButton != null ? this.favoriteProductMoleculeV2Mapper.map(favoriteButton, false, this.teensModeStorage.isTeensModeEnabled()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo2 = dto.getTrackingInfo();
        if (trackingInfo2 != null) {
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(parentVoId != null ? parentVoId.longValue() : j11), null, 2, null);
        }
        t tVar2 = tVar;
        TextAtomWithIcon fixButtonSubtitleMaxLines = fixButtonSubtitleMaxLines(dto.getButtonSubtitle(), fromString);
        OverlayTitleModel overlayTitleModel = getOverlayTitleModel(dto, fromString);
        WaveModel waveModel = toWaveModel(dto.getImageTheme());
        Float imageAlpha = dto.getImageAlpha();
        return new ProductVO(j11, fromString, skuId, imageModel, filterByValidPositions, computeIsAdultFlag, false, isFavorite, atomActionDTO, mutateStateAction, button, buttonV3, secondaryButton, trackingInfo, tVar2, containerOptions, isLast, fixButtonSubtitleMaxLines, map, dto.getImageOverlayPicture(), imageAlpha != null ? imageAlpha.floatValue() : 1.0f, buttonSubtitleHeight, stateHeight, overlayTitleModel, waveModel, parentVoId != null ? parentVoId.longValue() : 0L, dto.getBackgroundColor(), 64, null);
    }
}
