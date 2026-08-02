package ru.ozon.app.android.fresh.main.widgets.product.common.product;

import E0.C2942q;
import Kk.C3532b;
import Pk0.f;
import WZ.t;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.fresh.main.widgets.product.common.product.ProductContainerDTO;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b0\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0001YBÇ\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018\u0012\u000e\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010!\u001a\u00020\u000e\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000b¢\u0006\u0004\b$\u0010%Jð\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00182\u0010\b\u0002\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010!\u001a\u00020\u000e2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u00105R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b6\u00102R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u00109R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010<R\"\u0010\u000f\u001a\u00020\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010\u0010\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\b\u0010\u0010?R$\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010B\u001a\u0004\b\u0011\u0010C\"\u0004\bD\u0010ER\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010F\u001a\u0004\bG\u0010HR\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010:\u001a\u0004\bI\u0010<R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u0010J\u001a\u0004\bM\u0010LR%\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001b\u0010N\u001a\u0004\bO\u0010PR\u001f\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010Q\u001a\u0004\bR\u0010SR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010T\u001a\u0004\bU\u0010VR\"\u0010!\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010=\u001a\u0004\b!\u0010?\"\u0004\bW\u0010AR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010:\u001a\u0004\bX\u0010<¨\u0006Z"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "", "id", "Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductVO$Type;", "type", "skuId", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "image", "", "Lru/ozon/app/android/fresh/main/widgets/product/common/product/ImageBadge;", "imageBadges", "", "shouldBlur", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "isFavorite", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "link", "Lru/ozon/uni/atoms/data/AtomDTO;", "state", "button", "secondaryButton", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductContainerDTO$Options;", "containerOptions", "isLast", "", "topRightButtons", "<init>", "(JLru/ozon/app/android/fresh/main/widgets/product/common/product/ProductVO$Type;JLru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;Ljava/util/List;ZZLjava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/util/Map;LWZ/t;Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductContainerDTO$Options;ZLjava/util/List;)V", "copy", "(JLru/ozon/app/android/fresh/main/widgets/product/common/product/ProductVO$Type;JLru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;Ljava/util/List;ZZLjava/lang/Boolean;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/AtomDTO;Ljava/util/Map;LWZ/t;Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductContainerDTO$Options;ZLjava/util/List;)Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductVO$Type;", "getType", "()Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductVO$Type;", "getSkuId", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "getImage", "()Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "Ljava/util/List;", "getImageBadges", "()Ljava/util/List;", "Z", "getShouldBlur", "()Z", "setShouldBlur", "(Z)V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setFavorite", "(Ljava/lang/Boolean;)V", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getLink", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getState", "Lru/ozon/uni/atoms/data/AtomDTO;", "getButton", "()Lru/ozon/uni/atoms/data/AtomDTO;", "getSecondaryButton", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductContainerDTO$Options;", "getContainerOptions", "()Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductContainerDTO$Options;", "setLast", "getTopRightButtons", "Type", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ProductVO implements c, AdultVO {
    private final AtomDTO button;
    private final ProductContainerDTO.Options containerOptions;
    private final long id;

    @NotNull
    private final AdultImageView.Image image;
    private final List<ImageBadge> imageBadges;
    private final boolean isAdult;
    private Boolean isFavorite;
    private boolean isLast;
    private final AtomActionDTO link;
    private final AtomDTO secondaryButton;
    private boolean shouldBlur;
    private final long skuId;
    private final List<AtomDTO> state;
    private final t tokenizedEvent;

    @NotNull
    private final List<Object> topRightButtons;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductVO$Type;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "SCROLL", "ACCS_BY_CATEGORY_MULTI", "ACCS_BY_CATEGORY", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        @NotNull
        private static final Map<String, Type> values;

        @NotNull
        private final String value;
        public static final Type SCROLL = new Type("SCROLL", 0, "skuScroll");
        public static final Type ACCS_BY_CATEGORY_MULTI = new Type("ACCS_BY_CATEGORY_MULTI", 1, "accsByCategoryMulti");
        public static final Type ACCS_BY_CATEGORY = new Type("ACCS_BY_CATEGORY", 2, "accsByCategory");

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductVO$Type$Companion;", "", "<init>", "()V", "values", "", "", "Lru/ozon/app/android/fresh/main/widgets/product/common/product/ProductVO$Type;", "fromString", AppMeasurementSdk.ConditionalUserProperty.VALUE, "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Type fromString(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Object obj = Type.values.get(value);
                if (obj != null) {
                    return (Type) obj;
                }
                throw new IllegalArgumentException("Required value was null.");
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{SCROLL, ACCS_BY_CATEGORY_MULTI, ACCS_BY_CATEGORY};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
            INSTANCE = new Companion(null);
            Type[] values2 = values();
            int h11 = U.h(values2.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(h11 < 16 ? 16 : h11);
            for (Type type : values2) {
                linkedHashMap.put(type.value, type);
            }
            values = linkedHashMap;
        }

        private Type(String str, int i11, String str2) {
            this.value = str2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductVO(long j11, @NotNull Type type, long j12, @NotNull AdultImageView.Image image, List<ImageBadge> list, boolean z11, boolean z12, Boolean bool, AtomActionDTO atomActionDTO, List<? extends AtomDTO> list2, AtomDTO atomDTO, AtomDTO atomDTO2, Map<String, TokenizedTrackingInfo> map, t tVar, ProductContainerDTO.Options options, boolean z13, @NotNull List<? extends Object> topRightButtons) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(topRightButtons, "topRightButtons");
        this.id = j11;
        this.type = type;
        this.skuId = j12;
        this.image = image;
        this.imageBadges = list;
        this.shouldBlur = z11;
        this.isAdult = z12;
        this.isFavorite = bool;
        this.link = atomActionDTO;
        this.state = list2;
        this.button = atomDTO;
        this.secondaryButton = atomDTO2;
        this.trackingInfo = map;
        this.tokenizedEvent = tVar;
        this.containerOptions = options;
        this.isLast = z13;
        this.topRightButtons = topRightButtons;
    }

    public static /* synthetic */ ProductVO copy$default(ProductVO productVO, long j11, Type type, long j12, AdultImageView.Image image, List list, boolean z11, boolean z12, Boolean bool, AtomActionDTO atomActionDTO, List list2, AtomDTO atomDTO, AtomDTO atomDTO2, Map map, t tVar, ProductContainerDTO.Options options, boolean z13, List list3, int i11, Object obj) {
        List list4;
        boolean z14;
        long j13 = (i11 & 1) != 0 ? productVO.id : j11;
        Type type2 = (i11 & 2) != 0 ? productVO.type : type;
        long j14 = (i11 & 4) != 0 ? productVO.skuId : j12;
        AdultImageView.Image image2 = (i11 & 8) != 0 ? productVO.image : image;
        List list5 = (i11 & 16) != 0 ? productVO.imageBadges : list;
        boolean z15 = (i11 & 32) != 0 ? productVO.shouldBlur : z11;
        boolean z16 = (i11 & 64) != 0 ? productVO.isAdult : z12;
        Boolean bool2 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? productVO.isFavorite : bool;
        AtomActionDTO atomActionDTO2 = (i11 & 256) != 0 ? productVO.link : atomActionDTO;
        List list6 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? productVO.state : list2;
        AtomDTO atomDTO3 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? productVO.button : atomDTO;
        AtomDTO atomDTO4 = (i11 & 2048) != 0 ? productVO.secondaryButton : atomDTO2;
        long j15 = j13;
        Map map2 = (i11 & 4096) != 0 ? productVO.trackingInfo : map;
        t tVar2 = (i11 & 8192) != 0 ? productVO.tokenizedEvent : tVar;
        Map map3 = map2;
        ProductContainerDTO.Options options2 = (i11 & 16384) != 0 ? productVO.containerOptions : options;
        boolean z17 = (i11 & 32768) != 0 ? productVO.isLast : z13;
        if ((i11 & 65536) != 0) {
            z14 = z17;
            list4 = productVO.topRightButtons;
        } else {
            list4 = list3;
            z14 = z17;
        }
        return productVO.copy(j15, type2, j14, image2, list5, z15, z16, bool2, atomActionDTO2, list6, atomDTO3, atomDTO4, map3, tVar2, options2, z14, list4);
    }

    @NotNull
    public final ProductVO copy(long id2, @NotNull Type type, long skuId, @NotNull AdultImageView.Image image, List<ImageBadge> imageBadges, boolean shouldBlur, boolean isAdult, Boolean isFavorite, AtomActionDTO link, List<? extends AtomDTO> state, AtomDTO button, AtomDTO secondaryButton, Map<String, TokenizedTrackingInfo> trackingInfo, t tokenizedEvent, ProductContainerDTO.Options containerOptions, boolean isLast, @NotNull List<? extends Object> topRightButtons) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(topRightButtons, "topRightButtons");
        return new ProductVO(id2, type, skuId, image, imageBadges, shouldBlur, isAdult, isFavorite, link, state, button, secondaryButton, trackingInfo, tokenizedEvent, containerOptions, isLast, topRightButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductVO)) {
            return false;
        }
        ProductVO productVO = (ProductVO) other;
        return this.id == productVO.id && this.type == productVO.type && this.skuId == productVO.skuId && Intrinsics.d(this.image, productVO.image) && Intrinsics.d(this.imageBadges, productVO.imageBadges) && this.shouldBlur == productVO.shouldBlur && this.isAdult == productVO.isAdult && Intrinsics.d(this.isFavorite, productVO.isFavorite) && Intrinsics.d(this.link, productVO.link) && Intrinsics.d(this.state, productVO.state) && Intrinsics.d(this.button, productVO.button) && Intrinsics.d(this.secondaryButton, productVO.secondaryButton) && Intrinsics.d(this.trackingInfo, productVO.trackingInfo) && Intrinsics.d(this.tokenizedEvent, productVO.tokenizedEvent) && Intrinsics.d(this.containerOptions, productVO.containerOptions) && this.isLast == productVO.isLast && Intrinsics.d(this.topRightButtons, productVO.topRightButtons);
    }

    public final AtomDTO getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final AdultImageView.Image getImage() {
        return this.image;
    }

    public final List<ImageBadge> getImageBadges() {
        return this.imageBadges;
    }

    public final AtomActionDTO getLink() {
        return this.link;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public boolean getShouldBlur() {
        return this.shouldBlur;
    }

    public final long getSkuId() {
        return this.skuId;
    }

    public final List<AtomDTO> getState() {
        return this.state;
    }

    @NotNull
    public final List<Object> getTopRightButtons() {
        return this.topRightButtons;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.image.hashCode() + Pk0.c.a((this.type.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.skuId)) * 31;
        List<ImageBadge> list = this.imageBadges;
        int a11 = C3532b.a(C3532b.a((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.shouldBlur), 31, this.isAdult);
        Boolean bool = this.isFavorite;
        int hashCode2 = (a11 + (bool == null ? 0 : bool.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.link;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        List<AtomDTO> list2 = this.state;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        AtomDTO atomDTO = this.button;
        int hashCode5 = (hashCode4 + (atomDTO == null ? 0 : atomDTO.hashCode())) * 31;
        AtomDTO atomDTO2 = this.secondaryButton;
        int hashCode6 = (hashCode5 + (atomDTO2 == null ? 0 : atomDTO2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode8 = (hashCode7 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        ProductContainerDTO.Options options = this.containerOptions;
        return this.topRightButtons.hashCode() + C3532b.a((hashCode8 + (options != null ? options.hashCode() : 0)) * 31, 31, this.isLast);
    }

    @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
    /* renamed from: isAdult, reason: from getter */
    public boolean getIsAdult() {
        return this.isAdult;
    }

    /* renamed from: isFavorite, reason: from getter */
    public final Boolean getIsFavorite() {
        return this.isFavorite;
    }

    @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
    public void setShouldBlur(boolean z11) {
        this.shouldBlur = z11;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Type type = this.type;
        long j12 = this.skuId;
        AdultImageView.Image image = this.image;
        List<ImageBadge> list = this.imageBadges;
        boolean z11 = this.shouldBlur;
        boolean z12 = this.isAdult;
        Boolean bool = this.isFavorite;
        AtomActionDTO atomActionDTO = this.link;
        List<AtomDTO> list2 = this.state;
        AtomDTO atomDTO = this.button;
        AtomDTO atomDTO2 = this.secondaryButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        t tVar = this.tokenizedEvent;
        ProductContainerDTO.Options options = this.containerOptions;
        boolean z13 = this.isLast;
        List<Object> list3 = this.topRightButtons;
        StringBuilder sb2 = new StringBuilder("ProductVO(id=");
        sb2.append(j11);
        sb2.append(", type=");
        sb2.append(type);
        C2942q.f(sb2, ", skuId=", j12, ", image=");
        sb2.append(image);
        sb2.append(", imageBadges=");
        sb2.append(list);
        sb2.append(", shouldBlur=");
        f.c(", isAdult=", ", isFavorite=", sb2, z11, z12);
        sb2.append(bool);
        sb2.append(", link=");
        sb2.append(atomActionDTO);
        sb2.append(", state=");
        sb2.append(list2);
        sb2.append(", button=");
        sb2.append(atomDTO);
        sb2.append(", secondaryButton=");
        sb2.append(atomDTO2);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", tokenizedEvent=");
        sb2.append(tVar);
        sb2.append(", containerOptions=");
        sb2.append(options);
        sb2.append(", isLast=");
        sb2.append(z13);
        sb2.append(", topRightButtons=");
        sb2.append(list3);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ ProductVO(long j11, Type type, long j12, AdultImageView.Image image, List list, boolean z11, boolean z12, Boolean bool, AtomActionDTO atomActionDTO, List list2, AtomDTO atomDTO, AtomDTO atomDTO2, Map map, t tVar, ProductContainerDTO.Options options, boolean z13, List list3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, type, j12, image, list, z11, (i11 & 64) != 0 ? z11 : z12, bool, atomActionDTO, list2, atomDTO, atomDTO2, map, tVar, options, z13, list3);
    }
}
