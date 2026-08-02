package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.data;

import B90.C2618u;
import B90.C2619v;
import Fj.c;
import Fm.C3051a;
import G.g;
import H00.a;
import I0.C3173b;
import J0.C3349u1;
import K1.G;
import N3.C3660k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO;", "", "products", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO$ComparisonProductsDTO;", "differencesCell", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "characteristicsPick", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsPickDTO;", "keyCharacteristicsGroup", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsGroupDTO;", "characteristicsGroups", "", "<init>", "(Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO$ComparisonProductsDTO;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsPickDTO;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsGroupDTO;Ljava/util/List;)V", "getProducts", "()Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO$ComparisonProductsDTO;", "getDifferencesCell", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "getCharacteristicsPick", "()Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsPickDTO;", "getKeyCharacteristicsGroup", "()Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/CharacteristicsGroupDTO;", "getCharacteristicsGroups", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ComparisonProductsDTO", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ComparisonDTO {
    private final List<CharacteristicsGroupDTO> characteristicsGroups;

    @NotNull
    private final CharacteristicsPickDTO characteristicsPick;

    @NotNull
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle differencesCell;
    private final CharacteristicsGroupDTO keyCharacteristicsGroup;

    @NotNull
    private final ComparisonProductsDTO products;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0005\u001b\u001c\u001d\u001e\u001fB-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO$ComparisonProductsDTO;", "", "carousels", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO$ComparisonProductsDTO$CarouselDTO;", "products", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO$ComparisonProductsDTO$ComparedProductDTO;", "productActionOnSwipe", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getCarousels", "()Ljava/util/List;", "getProducts", "getProductActionOnSwipe", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "CarouselDTO", "ComparedProductDTO", "EmptyProductDTO", "SmallButtonsDTO", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class ComparisonProductsDTO {

        @Deprecated
        @NotNull
        public static final String ADD_TO_CART_BUTTON = "addToCartButton";

        @NotNull
        private static final Companion Companion = new Companion(null);

        @Deprecated
        @NotNull
        public static final String SMALL_BUTTONS = "smallButtons";

        @NotNull
        private final List<CarouselDTO> carousels;

        @NotNull
        private final AtomActionDTO productActionOnSwipe;
        private final List<ComparedProductDTO> products;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO$ComparisonProductsDTO$CarouselDTO;", "", "selectedIndex", "", "emptyProduct", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO$ComparisonProductsDTO$EmptyProductDTO;", "<init>", "(ILru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO$ComparisonProductsDTO$EmptyProductDTO;)V", "getSelectedIndex", "()I", "getEmptyProduct", "()Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO$ComparisonProductsDTO$EmptyProductDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CarouselDTO {
            private final EmptyProductDTO emptyProduct;
            private final int selectedIndex;

            public CarouselDTO(int i11, EmptyProductDTO emptyProductDTO) {
                this.selectedIndex = i11;
                this.emptyProduct = emptyProductDTO;
            }

            public static /* synthetic */ CarouselDTO copy$default(CarouselDTO carouselDTO, int i11, EmptyProductDTO emptyProductDTO, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = carouselDTO.selectedIndex;
                }
                if ((i12 & 2) != 0) {
                    emptyProductDTO = carouselDTO.emptyProduct;
                }
                return carouselDTO.copy(i11, emptyProductDTO);
            }

            /* renamed from: component1, reason: from getter */
            public final int getSelectedIndex() {
                return this.selectedIndex;
            }

            /* renamed from: component2, reason: from getter */
            public final EmptyProductDTO getEmptyProduct() {
                return this.emptyProduct;
            }

            @NotNull
            public final CarouselDTO copy(int selectedIndex, EmptyProductDTO emptyProduct) {
                return new CarouselDTO(selectedIndex, emptyProduct);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CarouselDTO)) {
                    return false;
                }
                CarouselDTO carouselDTO = (CarouselDTO) other;
                return this.selectedIndex == carouselDTO.selectedIndex && Intrinsics.d(this.emptyProduct, carouselDTO.emptyProduct);
            }

            public final EmptyProductDTO getEmptyProduct() {
                return this.emptyProduct;
            }

            public final int getSelectedIndex() {
                return this.selectedIndex;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.selectedIndex) * 31;
                EmptyProductDTO emptyProductDTO = this.emptyProduct;
                return hashCode + (emptyProductDTO == null ? 0 : emptyProductDTO.hashCode());
            }

            @NotNull
            public String toString() {
                return "CarouselDTO(selectedIndex=" + this.selectedIndex + ", emptyProduct=" + this.emptyProduct + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO$ComparisonProductsDTO$Companion;", "", "<init>", "()V", "ADD_TO_CART_BUTTON", "", "SMALL_BUTTONS", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        private static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u0001HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003Jo\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u00066"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO$ComparisonProductsDTO$ComparedProductDTO;", "", "skuString", "", "image", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/texts/TextAtom;", "price", "Lru/ozon/uni/atoms/data/price/Price;", "badge", "Lru/ozon/uni/atoms/data/badge/Badge;", "favoriteButton", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "removeButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "button", "pageInfo", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "getSkuString", "()Ljava/lang/String;", "getImage", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "getFavoriteButton", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "getRemoveButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getButton", "()Ljava/lang/Object;", "getPageInfo", "getDeeplink", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ComparedProductDTO {
            private final Badge badge;

            @NotNull
            private final Object button;

            @NotNull
            private final String deeplink;

            @NotNull
            private final FavoriteProductMolecule favoriteButton;

            @NotNull
            private final String image;

            @NotNull
            private final String pageInfo;

            @NotNull
            private final Price price;

            @NotNull
            private final ButtonV3Atom.SmallIconButton removeButton;

            @NotNull
            private final String skuString;

            @NotNull
            private final TextAtom title;

            public ComparedProductDTO(@NotNull String skuString, @NotNull String image, @NotNull TextAtom title, @NotNull Price price, Badge badge, @NotNull FavoriteProductMolecule favoriteButton, @NotNull ButtonV3Atom.SmallIconButton removeButton, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "addToCartButton", type = ButtonV3Atom.AddToCartAtom.AddToCartButton.class), @ProtoOneOfSignature(name = "smallButtons", type = SmallButtonsDTO.class)}) @NotNull @ProtoOneOf(label = "type") Object button, @NotNull String pageInfo, @NotNull String deeplink) {
                Intrinsics.checkNotNullParameter(skuString, "skuString");
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(price, "price");
                Intrinsics.checkNotNullParameter(favoriteButton, "favoriteButton");
                Intrinsics.checkNotNullParameter(removeButton, "removeButton");
                Intrinsics.checkNotNullParameter(button, "button");
                Intrinsics.checkNotNullParameter(pageInfo, "pageInfo");
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.skuString = skuString;
                this.image = image;
                this.title = title;
                this.price = price;
                this.badge = badge;
                this.favoriteButton = favoriteButton;
                this.removeButton = removeButton;
                this.button = button;
                this.pageInfo = pageInfo;
                this.deeplink = deeplink;
            }

            public static /* synthetic */ ComparedProductDTO copy$default(ComparedProductDTO comparedProductDTO, String str, String str2, TextAtom textAtom, Price price, Badge badge, FavoriteProductMolecule favoriteProductMolecule, ButtonV3Atom.SmallIconButton smallIconButton, Object obj, String str3, String str4, int i11, Object obj2) {
                if ((i11 & 1) != 0) {
                    str = comparedProductDTO.skuString;
                }
                if ((i11 & 2) != 0) {
                    str2 = comparedProductDTO.image;
                }
                if ((i11 & 4) != 0) {
                    textAtom = comparedProductDTO.title;
                }
                if ((i11 & 8) != 0) {
                    price = comparedProductDTO.price;
                }
                if ((i11 & 16) != 0) {
                    badge = comparedProductDTO.badge;
                }
                if ((i11 & 32) != 0) {
                    favoriteProductMolecule = comparedProductDTO.favoriteButton;
                }
                if ((i11 & 64) != 0) {
                    smallIconButton = comparedProductDTO.removeButton;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    obj = comparedProductDTO.button;
                }
                if ((i11 & 256) != 0) {
                    str3 = comparedProductDTO.pageInfo;
                }
                if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    str4 = comparedProductDTO.deeplink;
                }
                String str5 = str3;
                String str6 = str4;
                ButtonV3Atom.SmallIconButton smallIconButton2 = smallIconButton;
                Object obj3 = obj;
                Badge badge2 = badge;
                FavoriteProductMolecule favoriteProductMolecule2 = favoriteProductMolecule;
                return comparedProductDTO.copy(str, str2, textAtom, price, badge2, favoriteProductMolecule2, smallIconButton2, obj3, str5, str6);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getSkuString() {
                return this.skuString;
            }

            @NotNull
            /* renamed from: component10, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final TextAtom getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final Price getPrice() {
                return this.price;
            }

            /* renamed from: component5, reason: from getter */
            public final Badge getBadge() {
                return this.badge;
            }

            @NotNull
            /* renamed from: component6, reason: from getter */
            public final FavoriteProductMolecule getFavoriteButton() {
                return this.favoriteButton;
            }

            @NotNull
            /* renamed from: component7, reason: from getter */
            public final ButtonV3Atom.SmallIconButton getRemoveButton() {
                return this.removeButton;
            }

            @NotNull
            /* renamed from: component8, reason: from getter */
            public final Object getButton() {
                return this.button;
            }

            @NotNull
            /* renamed from: component9, reason: from getter */
            public final String getPageInfo() {
                return this.pageInfo;
            }

            @NotNull
            public final ComparedProductDTO copy(@NotNull String skuString, @NotNull String image, @NotNull TextAtom title, @NotNull Price price, Badge badge, @NotNull FavoriteProductMolecule favoriteButton, @NotNull ButtonV3Atom.SmallIconButton removeButton, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "addToCartButton", type = ButtonV3Atom.AddToCartAtom.AddToCartButton.class), @ProtoOneOfSignature(name = "smallButtons", type = SmallButtonsDTO.class)}) @NotNull @ProtoOneOf(label = "type") Object button, @NotNull String pageInfo, @NotNull String deeplink) {
                Intrinsics.checkNotNullParameter(skuString, "skuString");
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(price, "price");
                Intrinsics.checkNotNullParameter(favoriteButton, "favoriteButton");
                Intrinsics.checkNotNullParameter(removeButton, "removeButton");
                Intrinsics.checkNotNullParameter(button, "button");
                Intrinsics.checkNotNullParameter(pageInfo, "pageInfo");
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                return new ComparedProductDTO(skuString, image, title, price, badge, favoriteButton, removeButton, button, pageInfo, deeplink);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ComparedProductDTO)) {
                    return false;
                }
                ComparedProductDTO comparedProductDTO = (ComparedProductDTO) other;
                return Intrinsics.d(this.skuString, comparedProductDTO.skuString) && Intrinsics.d(this.image, comparedProductDTO.image) && Intrinsics.d(this.title, comparedProductDTO.title) && Intrinsics.d(this.price, comparedProductDTO.price) && Intrinsics.d(this.badge, comparedProductDTO.badge) && Intrinsics.d(this.favoriteButton, comparedProductDTO.favoriteButton) && Intrinsics.d(this.removeButton, comparedProductDTO.removeButton) && Intrinsics.d(this.button, comparedProductDTO.button) && Intrinsics.d(this.pageInfo, comparedProductDTO.pageInfo) && Intrinsics.d(this.deeplink, comparedProductDTO.deeplink);
            }

            public final Badge getBadge() {
                return this.badge;
            }

            @NotNull
            public final Object getButton() {
                return this.button;
            }

            @NotNull
            public final String getDeeplink() {
                return this.deeplink;
            }

            @NotNull
            public final FavoriteProductMolecule getFavoriteButton() {
                return this.favoriteButton;
            }

            @NotNull
            public final String getImage() {
                return this.image;
            }

            @NotNull
            public final String getPageInfo() {
                return this.pageInfo;
            }

            @NotNull
            public final Price getPrice() {
                return this.price;
            }

            @NotNull
            public final ButtonV3Atom.SmallIconButton getRemoveButton() {
                return this.removeButton;
            }

            @NotNull
            public final String getSkuString() {
                return this.skuString;
            }

            @NotNull
            public final TextAtom getTitle() {
                return this.title;
            }

            public int hashCode() {
                int a11 = C3051a.a(this.price, C2619v.b(g.a(this.skuString.hashCode() * 31, 31, this.image), 31, this.title), 31);
                Badge badge = this.badge;
                return this.deeplink.hashCode() + g.a(a.c(C3349u1.d(this.removeButton, (this.favoriteButton.hashCode() + ((a11 + (badge == null ? 0 : badge.hashCode())) * 31)) * 31, 31), 31, this.button), 31, this.pageInfo);
            }

            @NotNull
            public String toString() {
                String str = this.skuString;
                String str2 = this.image;
                TextAtom textAtom = this.title;
                Price price = this.price;
                Badge badge = this.badge;
                FavoriteProductMolecule favoriteProductMolecule = this.favoriteButton;
                ButtonV3Atom.SmallIconButton smallIconButton = this.removeButton;
                Object obj = this.button;
                String str3 = this.pageInfo;
                String str4 = this.deeplink;
                StringBuilder d11 = C3660k.d("ComparedProductDTO(skuString=", str, ", image=", str2, ", title=");
                d11.append(textAtom);
                d11.append(", price=");
                d11.append(price);
                d11.append(", badge=");
                d11.append(badge);
                d11.append(", favoriteButton=");
                d11.append(favoriteProductMolecule);
                d11.append(", removeButton=");
                d11.append(smallIconButton);
                d11.append(", button=");
                d11.append(obj);
                d11.append(", pageInfo=");
                return C3173b.c(d11, str3, ", deeplink=", str4, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO$ComparisonProductsDTO$EmptyProductDTO;", "", "image", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;)V", "getImage", "()Ljava/lang/String;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class EmptyProductDTO {

            @NotNull
            private final ButtonV3Atom.LargeBorderlessButton button;

            @NotNull
            private final String image;

            public EmptyProductDTO(@NotNull String image, @NotNull ButtonV3Atom.LargeBorderlessButton button) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(button, "button");
                this.image = image;
                this.button = button;
            }

            public static /* synthetic */ EmptyProductDTO copy$default(EmptyProductDTO emptyProductDTO, String str, ButtonV3Atom.LargeBorderlessButton largeBorderlessButton, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = emptyProductDTO.image;
                }
                if ((i11 & 2) != 0) {
                    largeBorderlessButton = emptyProductDTO.button;
                }
                return emptyProductDTO.copy(str, largeBorderlessButton);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getImage() {
                return this.image;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final ButtonV3Atom.LargeBorderlessButton getButton() {
                return this.button;
            }

            @NotNull
            public final EmptyProductDTO copy(@NotNull String image, @NotNull ButtonV3Atom.LargeBorderlessButton button) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(button, "button");
                return new EmptyProductDTO(image, button);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EmptyProductDTO)) {
                    return false;
                }
                EmptyProductDTO emptyProductDTO = (EmptyProductDTO) other;
                return Intrinsics.d(this.image, emptyProductDTO.image) && Intrinsics.d(this.button, emptyProductDTO.button);
            }

            @NotNull
            public final ButtonV3Atom.LargeBorderlessButton getButton() {
                return this.button;
            }

            @NotNull
            public final String getImage() {
                return this.image;
            }

            public int hashCode() {
                return this.button.hashCode() + (this.image.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "EmptyProductDTO(image=" + this.image + ", button=" + this.button + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO$ComparisonProductsDTO$SmallButtonsDTO;", "", "smallButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "notifyButton", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO$ComparisonProductsDTO$SmallButtonsDTO$NotifyButton;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO$ComparisonProductsDTO$SmallButtonsDTO$NotifyButton;)V", "getSmallButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getNotifyButton", "()Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO$ComparisonProductsDTO$SmallButtonsDTO$NotifyButton;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "NotifyButton", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class SmallButtonsDTO {
            private final NotifyButton notifyButton;

            @NotNull
            private final ButtonV3Atom.SmallButton smallButton;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO$ComparisonProductsDTO$SmallButtonsDTO$NotifyButton;", "", "isSubscribed", "", "subscribeButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "unsubscribeButton", "<init>", "(ZLru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;)V", "()Z", "getSubscribeButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getUnsubscribeButton", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class NotifyButton {
                private final boolean isSubscribed;

                @NotNull
                private final ButtonV3Atom.SmallIconButton subscribeButton;

                @NotNull
                private final ButtonV3Atom.SmallIconButton unsubscribeButton;

                public NotifyButton(boolean z11, @NotNull ButtonV3Atom.SmallIconButton subscribeButton, @NotNull ButtonV3Atom.SmallIconButton unsubscribeButton) {
                    Intrinsics.checkNotNullParameter(subscribeButton, "subscribeButton");
                    Intrinsics.checkNotNullParameter(unsubscribeButton, "unsubscribeButton");
                    this.isSubscribed = z11;
                    this.subscribeButton = subscribeButton;
                    this.unsubscribeButton = unsubscribeButton;
                }

                public static /* synthetic */ NotifyButton copy$default(NotifyButton notifyButton, boolean z11, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallIconButton smallIconButton2, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        z11 = notifyButton.isSubscribed;
                    }
                    if ((i11 & 2) != 0) {
                        smallIconButton = notifyButton.subscribeButton;
                    }
                    if ((i11 & 4) != 0) {
                        smallIconButton2 = notifyButton.unsubscribeButton;
                    }
                    return notifyButton.copy(z11, smallIconButton, smallIconButton2);
                }

                /* renamed from: component1, reason: from getter */
                public final boolean getIsSubscribed() {
                    return this.isSubscribed;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final ButtonV3Atom.SmallIconButton getSubscribeButton() {
                    return this.subscribeButton;
                }

                @NotNull
                /* renamed from: component3, reason: from getter */
                public final ButtonV3Atom.SmallIconButton getUnsubscribeButton() {
                    return this.unsubscribeButton;
                }

                @NotNull
                public final NotifyButton copy(boolean isSubscribed, @NotNull ButtonV3Atom.SmallIconButton subscribeButton, @NotNull ButtonV3Atom.SmallIconButton unsubscribeButton) {
                    Intrinsics.checkNotNullParameter(subscribeButton, "subscribeButton");
                    Intrinsics.checkNotNullParameter(unsubscribeButton, "unsubscribeButton");
                    return new NotifyButton(isSubscribed, subscribeButton, unsubscribeButton);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof NotifyButton)) {
                        return false;
                    }
                    NotifyButton notifyButton = (NotifyButton) other;
                    return this.isSubscribed == notifyButton.isSubscribed && Intrinsics.d(this.subscribeButton, notifyButton.subscribeButton) && Intrinsics.d(this.unsubscribeButton, notifyButton.unsubscribeButton);
                }

                @NotNull
                public final ButtonV3Atom.SmallIconButton getSubscribeButton() {
                    return this.subscribeButton;
                }

                @NotNull
                public final ButtonV3Atom.SmallIconButton getUnsubscribeButton() {
                    return this.unsubscribeButton;
                }

                public int hashCode() {
                    return this.unsubscribeButton.hashCode() + C3349u1.d(this.subscribeButton, Boolean.hashCode(this.isSubscribed) * 31, 31);
                }

                public final boolean isSubscribed() {
                    return this.isSubscribed;
                }

                @NotNull
                public String toString() {
                    return "NotifyButton(isSubscribed=" + this.isSubscribed + ", subscribeButton=" + this.subscribeButton + ", unsubscribeButton=" + this.unsubscribeButton + ")";
                }
            }

            public SmallButtonsDTO(@NotNull ButtonV3Atom.SmallButton smallButton, NotifyButton notifyButton) {
                Intrinsics.checkNotNullParameter(smallButton, "smallButton");
                this.smallButton = smallButton;
                this.notifyButton = notifyButton;
            }

            public static /* synthetic */ SmallButtonsDTO copy$default(SmallButtonsDTO smallButtonsDTO, ButtonV3Atom.SmallButton smallButton, NotifyButton notifyButton, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    smallButton = smallButtonsDTO.smallButton;
                }
                if ((i11 & 2) != 0) {
                    notifyButton = smallButtonsDTO.notifyButton;
                }
                return smallButtonsDTO.copy(smallButton, notifyButton);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final ButtonV3Atom.SmallButton getSmallButton() {
                return this.smallButton;
            }

            /* renamed from: component2, reason: from getter */
            public final NotifyButton getNotifyButton() {
                return this.notifyButton;
            }

            @NotNull
            public final SmallButtonsDTO copy(@NotNull ButtonV3Atom.SmallButton smallButton, NotifyButton notifyButton) {
                Intrinsics.checkNotNullParameter(smallButton, "smallButton");
                return new SmallButtonsDTO(smallButton, notifyButton);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SmallButtonsDTO)) {
                    return false;
                }
                SmallButtonsDTO smallButtonsDTO = (SmallButtonsDTO) other;
                return Intrinsics.d(this.smallButton, smallButtonsDTO.smallButton) && Intrinsics.d(this.notifyButton, smallButtonsDTO.notifyButton);
            }

            public final NotifyButton getNotifyButton() {
                return this.notifyButton;
            }

            @NotNull
            public final ButtonV3Atom.SmallButton getSmallButton() {
                return this.smallButton;
            }

            public int hashCode() {
                int hashCode = this.smallButton.hashCode() * 31;
                NotifyButton notifyButton = this.notifyButton;
                return hashCode + (notifyButton == null ? 0 : notifyButton.hashCode());
            }

            @NotNull
            public String toString() {
                return "SmallButtonsDTO(smallButton=" + this.smallButton + ", notifyButton=" + this.notifyButton + ")";
            }
        }

        public ComparisonProductsDTO(@NotNull List<CarouselDTO> carousels, List<ComparedProductDTO> list, @NotNull AtomActionDTO productActionOnSwipe) {
            Intrinsics.checkNotNullParameter(carousels, "carousels");
            Intrinsics.checkNotNullParameter(productActionOnSwipe, "productActionOnSwipe");
            this.carousels = carousels;
            this.products = list;
            this.productActionOnSwipe = productActionOnSwipe;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ComparisonProductsDTO copy$default(ComparisonProductsDTO comparisonProductsDTO, List list, List list2, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = comparisonProductsDTO.carousels;
            }
            if ((i11 & 2) != 0) {
                list2 = comparisonProductsDTO.products;
            }
            if ((i11 & 4) != 0) {
                atomActionDTO = comparisonProductsDTO.productActionOnSwipe;
            }
            return comparisonProductsDTO.copy(list, list2, atomActionDTO);
        }

        @NotNull
        public final List<CarouselDTO> component1() {
            return this.carousels;
        }

        public final List<ComparedProductDTO> component2() {
            return this.products;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final AtomActionDTO getProductActionOnSwipe() {
            return this.productActionOnSwipe;
        }

        @NotNull
        public final ComparisonProductsDTO copy(@NotNull List<CarouselDTO> carousels, List<ComparedProductDTO> products, @NotNull AtomActionDTO productActionOnSwipe) {
            Intrinsics.checkNotNullParameter(carousels, "carousels");
            Intrinsics.checkNotNullParameter(productActionOnSwipe, "productActionOnSwipe");
            return new ComparisonProductsDTO(carousels, products, productActionOnSwipe);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ComparisonProductsDTO)) {
                return false;
            }
            ComparisonProductsDTO comparisonProductsDTO = (ComparisonProductsDTO) other;
            return Intrinsics.d(this.carousels, comparisonProductsDTO.carousels) && Intrinsics.d(this.products, comparisonProductsDTO.products) && Intrinsics.d(this.productActionOnSwipe, comparisonProductsDTO.productActionOnSwipe);
        }

        @NotNull
        public final List<CarouselDTO> getCarousels() {
            return this.carousels;
        }

        @NotNull
        public final AtomActionDTO getProductActionOnSwipe() {
            return this.productActionOnSwipe;
        }

        public final List<ComparedProductDTO> getProducts() {
            return this.products;
        }

        public int hashCode() {
            int hashCode = this.carousels.hashCode() * 31;
            List<ComparedProductDTO> list = this.products;
            return this.productActionOnSwipe.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            List<CarouselDTO> list = this.carousels;
            List<ComparedProductDTO> list2 = this.products;
            return G.c(c.d("ComparisonProductsDTO(carousels=", list, ", products=", ", productActionOnSwipe=", list2), this.productActionOnSwipe, ")");
        }
    }

    public ComparisonDTO(@NotNull ComparisonProductsDTO products, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle differencesCell, @NotNull CharacteristicsPickDTO characteristicsPick, CharacteristicsGroupDTO characteristicsGroupDTO, List<CharacteristicsGroupDTO> list) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(differencesCell, "differencesCell");
        Intrinsics.checkNotNullParameter(characteristicsPick, "characteristicsPick");
        this.products = products;
        this.differencesCell = differencesCell;
        this.characteristicsPick = characteristicsPick;
        this.keyCharacteristicsGroup = characteristicsGroupDTO;
        this.characteristicsGroups = list;
    }

    public static /* synthetic */ ComparisonDTO copy$default(ComparisonDTO comparisonDTO, ComparisonProductsDTO comparisonProductsDTO, CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle cellWithSubtitleToggle, CharacteristicsPickDTO characteristicsPickDTO, CharacteristicsGroupDTO characteristicsGroupDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            comparisonProductsDTO = comparisonDTO.products;
        }
        if ((i11 & 2) != 0) {
            cellWithSubtitleToggle = comparisonDTO.differencesCell;
        }
        if ((i11 & 4) != 0) {
            characteristicsPickDTO = comparisonDTO.characteristicsPick;
        }
        if ((i11 & 8) != 0) {
            characteristicsGroupDTO = comparisonDTO.keyCharacteristicsGroup;
        }
        if ((i11 & 16) != 0) {
            list = comparisonDTO.characteristicsGroups;
        }
        List list2 = list;
        CharacteristicsPickDTO characteristicsPickDTO2 = characteristicsPickDTO;
        return comparisonDTO.copy(comparisonProductsDTO, cellWithSubtitleToggle, characteristicsPickDTO2, characteristicsGroupDTO, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ComparisonProductsDTO getProducts() {
        return this.products;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle getDifferencesCell() {
        return this.differencesCell;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CharacteristicsPickDTO getCharacteristicsPick() {
        return this.characteristicsPick;
    }

    /* renamed from: component4, reason: from getter */
    public final CharacteristicsGroupDTO getKeyCharacteristicsGroup() {
        return this.keyCharacteristicsGroup;
    }

    public final List<CharacteristicsGroupDTO> component5() {
        return this.characteristicsGroups;
    }

    @NotNull
    public final ComparisonDTO copy(@NotNull ComparisonProductsDTO products, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle differencesCell, @NotNull CharacteristicsPickDTO characteristicsPick, CharacteristicsGroupDTO keyCharacteristicsGroup, List<CharacteristicsGroupDTO> characteristicsGroups) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(differencesCell, "differencesCell");
        Intrinsics.checkNotNullParameter(characteristicsPick, "characteristicsPick");
        return new ComparisonDTO(products, differencesCell, characteristicsPick, keyCharacteristicsGroup, characteristicsGroups);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComparisonDTO)) {
            return false;
        }
        ComparisonDTO comparisonDTO = (ComparisonDTO) other;
        return Intrinsics.d(this.products, comparisonDTO.products) && Intrinsics.d(this.differencesCell, comparisonDTO.differencesCell) && Intrinsics.d(this.characteristicsPick, comparisonDTO.characteristicsPick) && Intrinsics.d(this.keyCharacteristicsGroup, comparisonDTO.keyCharacteristicsGroup) && Intrinsics.d(this.characteristicsGroups, comparisonDTO.characteristicsGroups);
    }

    public final List<CharacteristicsGroupDTO> getCharacteristicsGroups() {
        return this.characteristicsGroups;
    }

    @NotNull
    public final CharacteristicsPickDTO getCharacteristicsPick() {
        return this.characteristicsPick;
    }

    @NotNull
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle getDifferencesCell() {
        return this.differencesCell;
    }

    public final CharacteristicsGroupDTO getKeyCharacteristicsGroup() {
        return this.keyCharacteristicsGroup;
    }

    @NotNull
    public final ComparisonProductsDTO getProducts() {
        return this.products;
    }

    public int hashCode() {
        int hashCode = (this.characteristicsPick.hashCode() + ((this.differencesCell.hashCode() + (this.products.hashCode() * 31)) * 31)) * 31;
        CharacteristicsGroupDTO characteristicsGroupDTO = this.keyCharacteristicsGroup;
        int hashCode2 = (hashCode + (characteristicsGroupDTO == null ? 0 : characteristicsGroupDTO.hashCode())) * 31;
        List<CharacteristicsGroupDTO> list = this.characteristicsGroups;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ComparisonProductsDTO comparisonProductsDTO = this.products;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle cellWithSubtitleToggle = this.differencesCell;
        CharacteristicsPickDTO characteristicsPickDTO = this.characteristicsPick;
        CharacteristicsGroupDTO characteristicsGroupDTO = this.keyCharacteristicsGroup;
        List<CharacteristicsGroupDTO> list = this.characteristicsGroups;
        StringBuilder sb2 = new StringBuilder("ComparisonDTO(products=");
        sb2.append(comparisonProductsDTO);
        sb2.append(", differencesCell=");
        sb2.append(cellWithSubtitleToggle);
        sb2.append(", characteristicsPick=");
        sb2.append(characteristicsPickDTO);
        sb2.append(", keyCharacteristicsGroup=");
        sb2.append(characteristicsGroupDTO);
        sb2.append(", characteristicsGroups=");
        return C2618u.h(sb2, list, ")");
    }
}
