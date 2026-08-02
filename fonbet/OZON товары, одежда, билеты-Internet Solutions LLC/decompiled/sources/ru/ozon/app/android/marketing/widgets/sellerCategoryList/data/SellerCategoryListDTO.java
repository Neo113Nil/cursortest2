package ru.ozon.app.android.marketing.widgets.sellerCategoryList.data;

import Bl.b;
import G.g;
import Ih.a;
import Kk.C3532b;
import Kk.c;
import T7.P;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCategoryList/data/SellerCategoryListDTO;", "", "categoryList", "", "Lru/ozon/app/android/marketing/widgets/sellerCategoryList/data/SellerCategoryListDTO$CategoryItemDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getCategoryList", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "CategoryItemDTO", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SellerCategoryListDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<CategoryItemDTO> categoryList;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JG\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCategoryList/data/SellerCategoryListDTO$CategoryItemDTO;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "backgroundImage", "", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;ZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getBackgroundImage", "()Ljava/lang/String;", "()Z", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CategoryItemDTO {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final String backgroundImage;
        private final boolean isAdult;

        @NotNull
        private final TextAtom name;

        @NotNull
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public CategoryItemDTO(@NotNull TextAtom name, @NotNull String backgroundImage, boolean z11, @NotNull AtomActionDTO action, @NotNull Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
            this.name = name;
            this.backgroundImage = backgroundImage;
            this.isAdult = z11;
            this.action = action;
            this.trackingInfo = trackingInfo;
        }

        public static /* synthetic */ CategoryItemDTO copy$default(CategoryItemDTO categoryItemDTO, TextAtom textAtom, String str, boolean z11, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textAtom = categoryItemDTO.name;
            }
            if ((i11 & 2) != 0) {
                str = categoryItemDTO.backgroundImage;
            }
            if ((i11 & 4) != 0) {
                z11 = categoryItemDTO.isAdult;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = categoryItemDTO.action;
            }
            if ((i11 & 16) != 0) {
                map = categoryItemDTO.trackingInfo;
            }
            Map map2 = map;
            boolean z12 = z11;
            return categoryItemDTO.copy(textAtom, str, z12, atomActionDTO, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextAtom getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getBackgroundImage() {
            return this.backgroundImage;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsAdult() {
            return this.isAdult;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final CategoryItemDTO copy(@NotNull TextAtom name, @NotNull String backgroundImage, boolean isAdult, @NotNull AtomActionDTO action, @NotNull Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
            return new CategoryItemDTO(name, backgroundImage, isAdult, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CategoryItemDTO)) {
                return false;
            }
            CategoryItemDTO categoryItemDTO = (CategoryItemDTO) other;
            return Intrinsics.d(this.name, categoryItemDTO.name) && Intrinsics.d(this.backgroundImage, categoryItemDTO.backgroundImage) && this.isAdult == categoryItemDTO.isAdult && Intrinsics.d(this.action, categoryItemDTO.action) && Intrinsics.d(this.trackingInfo, categoryItemDTO.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getBackgroundImage() {
            return this.backgroundImage;
        }

        @NotNull
        public final TextAtom getName() {
            return this.name;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            return this.trackingInfo.hashCode() + a.b(this.action, C3532b.a(g.a(this.name.hashCode() * 31, 31, this.backgroundImage), 31, this.isAdult), 31);
        }

        public final boolean isAdult() {
            return this.isAdult;
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.name;
            String str = this.backgroundImage;
            boolean z11 = this.isAdult;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = b.d("CategoryItemDTO(name=", ", backgroundImage=", str, ", isAdult=", textAtom);
            d11.append(z11);
            d11.append(", action=");
            d11.append(atomActionDTO);
            d11.append(", trackingInfo=");
            return P.f(d11, map, ")");
        }
    }

    public SellerCategoryListDTO(@NotNull List<CategoryItemDTO> categoryList, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(categoryList, "categoryList");
        this.categoryList = categoryList;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SellerCategoryListDTO copy$default(SellerCategoryListDTO sellerCategoryListDTO, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = sellerCategoryListDTO.categoryList;
        }
        if ((i11 & 2) != 0) {
            map = sellerCategoryListDTO.trackingInfo;
        }
        return sellerCategoryListDTO.copy(list, map);
    }

    @NotNull
    public final List<CategoryItemDTO> component1() {
        return this.categoryList;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    public final SellerCategoryListDTO copy(@NotNull List<CategoryItemDTO> categoryList, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(categoryList, "categoryList");
        return new SellerCategoryListDTO(categoryList, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerCategoryListDTO)) {
            return false;
        }
        SellerCategoryListDTO sellerCategoryListDTO = (SellerCategoryListDTO) other;
        return Intrinsics.d(this.categoryList, sellerCategoryListDTO.categoryList) && Intrinsics.d(this.trackingInfo, sellerCategoryListDTO.trackingInfo);
    }

    @NotNull
    public final List<CategoryItemDTO> getCategoryList() {
        return this.categoryList;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.categoryList.hashCode() * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        return c.d("SellerCategoryListDTO(categoryList=", ", trackingInfo=", ")", this.categoryList, this.trackingInfo);
    }
}
