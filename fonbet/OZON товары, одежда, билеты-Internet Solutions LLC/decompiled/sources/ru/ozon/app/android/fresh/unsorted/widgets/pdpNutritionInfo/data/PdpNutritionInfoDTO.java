package ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.data;

import B3.p;
import Bi.b;
import G.g;
import I0.C3173b;
import Lh.a;
import N3.C3660k;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001:\u0006/01234BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Jc\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00065"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO;", "", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "info", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Info;", "backgroundColor", "", "corners", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$RoundedCorners;", "paddings", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$ContainerPaddings;", "sauceInfo", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$SauceInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Info;Ljava/lang/String;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$RoundedCorners;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$ContainerPaddings;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$SauceInfo;Ljava/util/Map;)V", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getInfo", "()Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Info;", "getBackgroundColor", "()Ljava/lang/String;", "getCorners", "()Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$RoundedCorners;", "getPaddings", "()Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$ContainerPaddings;", "getSauceInfo", "()Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$SauceInfo;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Info", "SauceInfo", "ComponentsLight", "Components", "RoundedCorners", "ContainerPaddings", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PdpNutritionInfoDTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final ButtonV3DTO button;

    @NotNull
    private final RoundedCorners corners;
    private final Info info;

    @NotNull
    private final ContainerPaddings paddings;
    private final SauceInfo sauceInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Components;", "", "energy", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "protein", "fat", "carbohydrate", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "getEnergy", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getProtein", "getFat", "getCarbohydrate", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Components {
        public static final int $stable = CellDTO.$stable;

        @NotNull
        private final CellDTO carbohydrate;

        @NotNull
        private final CellDTO energy;

        @NotNull
        private final CellDTO fat;

        @NotNull
        private final CellDTO protein;

        public Components(@NotNull CellDTO energy, @NotNull CellDTO protein, @NotNull CellDTO fat, @NotNull CellDTO carbohydrate) {
            Intrinsics.checkNotNullParameter(energy, "energy");
            Intrinsics.checkNotNullParameter(protein, "protein");
            Intrinsics.checkNotNullParameter(fat, "fat");
            Intrinsics.checkNotNullParameter(carbohydrate, "carbohydrate");
            this.energy = energy;
            this.protein = protein;
            this.fat = fat;
            this.carbohydrate = carbohydrate;
        }

        public static /* synthetic */ Components copy$default(Components components, CellDTO cellDTO, CellDTO cellDTO2, CellDTO cellDTO3, CellDTO cellDTO4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellDTO = components.energy;
            }
            if ((i11 & 2) != 0) {
                cellDTO2 = components.protein;
            }
            if ((i11 & 4) != 0) {
                cellDTO3 = components.fat;
            }
            if ((i11 & 8) != 0) {
                cellDTO4 = components.carbohydrate;
            }
            return components.copy(cellDTO, cellDTO2, cellDTO3, cellDTO4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CellDTO getEnergy() {
            return this.energy;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CellDTO getProtein() {
            return this.protein;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final CellDTO getFat() {
            return this.fat;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final CellDTO getCarbohydrate() {
            return this.carbohydrate;
        }

        @NotNull
        public final Components copy(@NotNull CellDTO energy, @NotNull CellDTO protein, @NotNull CellDTO fat, @NotNull CellDTO carbohydrate) {
            Intrinsics.checkNotNullParameter(energy, "energy");
            Intrinsics.checkNotNullParameter(protein, "protein");
            Intrinsics.checkNotNullParameter(fat, "fat");
            Intrinsics.checkNotNullParameter(carbohydrate, "carbohydrate");
            return new Components(energy, protein, fat, carbohydrate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Components)) {
                return false;
            }
            Components components = (Components) other;
            return Intrinsics.d(this.energy, components.energy) && Intrinsics.d(this.protein, components.protein) && Intrinsics.d(this.fat, components.fat) && Intrinsics.d(this.carbohydrate, components.carbohydrate);
        }

        @NotNull
        public final CellDTO getCarbohydrate() {
            return this.carbohydrate;
        }

        @NotNull
        public final CellDTO getEnergy() {
            return this.energy;
        }

        @NotNull
        public final CellDTO getFat() {
            return this.fat;
        }

        @NotNull
        public final CellDTO getProtein() {
            return this.protein;
        }

        public int hashCode() {
            return this.carbohydrate.hashCode() + b.c(this.fat, b.c(this.protein, this.energy.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return "Components(energy=" + this.energy + ", protein=" + this.protein + ", fat=" + this.fat + ", carbohydrate=" + this.carbohydrate + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$ComponentsLight;", "", "energy", "", "protein", "fat", "carbohydrate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEnergy", "()Ljava/lang/String;", "getProtein", "getFat", "getCarbohydrate", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ComponentsLight {
        public static final int $stable = 0;

        @NotNull
        private final String carbohydrate;

        @NotNull
        private final String energy;

        @NotNull
        private final String fat;

        @NotNull
        private final String protein;

        public ComponentsLight(@NotNull String energy, @NotNull String protein, @NotNull String fat, @NotNull String carbohydrate) {
            Intrinsics.checkNotNullParameter(energy, "energy");
            Intrinsics.checkNotNullParameter(protein, "protein");
            Intrinsics.checkNotNullParameter(fat, "fat");
            Intrinsics.checkNotNullParameter(carbohydrate, "carbohydrate");
            this.energy = energy;
            this.protein = protein;
            this.fat = fat;
            this.carbohydrate = carbohydrate;
        }

        public static /* synthetic */ ComponentsLight copy$default(ComponentsLight componentsLight, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = componentsLight.energy;
            }
            if ((i11 & 2) != 0) {
                str2 = componentsLight.protein;
            }
            if ((i11 & 4) != 0) {
                str3 = componentsLight.fat;
            }
            if ((i11 & 8) != 0) {
                str4 = componentsLight.carbohydrate;
            }
            return componentsLight.copy(str, str2, str3, str4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getEnergy() {
            return this.energy;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getProtein() {
            return this.protein;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getFat() {
            return this.fat;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getCarbohydrate() {
            return this.carbohydrate;
        }

        @NotNull
        public final ComponentsLight copy(@NotNull String energy, @NotNull String protein, @NotNull String fat, @NotNull String carbohydrate) {
            Intrinsics.checkNotNullParameter(energy, "energy");
            Intrinsics.checkNotNullParameter(protein, "protein");
            Intrinsics.checkNotNullParameter(fat, "fat");
            Intrinsics.checkNotNullParameter(carbohydrate, "carbohydrate");
            return new ComponentsLight(energy, protein, fat, carbohydrate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ComponentsLight)) {
                return false;
            }
            ComponentsLight componentsLight = (ComponentsLight) other;
            return Intrinsics.d(this.energy, componentsLight.energy) && Intrinsics.d(this.protein, componentsLight.protein) && Intrinsics.d(this.fat, componentsLight.fat) && Intrinsics.d(this.carbohydrate, componentsLight.carbohydrate);
        }

        @NotNull
        public final String getCarbohydrate() {
            return this.carbohydrate;
        }

        @NotNull
        public final String getEnergy() {
            return this.energy;
        }

        @NotNull
        public final String getFat() {
            return this.fat;
        }

        @NotNull
        public final String getProtein() {
            return this.protein;
        }

        public int hashCode() {
            return this.carbohydrate.hashCode() + g.a(g.a(this.energy.hashCode() * 31, 31, this.protein), 31, this.fat);
        }

        @NotNull
        public String toString() {
            String str = this.energy;
            String str2 = this.protein;
            return C3173b.c(C3660k.d("ComponentsLight(energy=", str, ", protein=", str2, ", fat="), this.fat, ", carbohydrate=", this.carbohydrate, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$ContainerPaddings;", "", "top", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottom", "between", "inner", "outer", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTop", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottom", "getBetween", "getInner", "getOuter", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContainerPaddings {
        public static final int $stable = 0;

        @NotNull
        private final Paddings between;

        @NotNull
        private final Paddings bottom;

        @NotNull
        private final Paddings inner;

        @NotNull
        private final Paddings outer;

        @NotNull
        private final Paddings top;

        public ContainerPaddings() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ ContainerPaddings copy$default(ContainerPaddings containerPaddings, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = containerPaddings.top;
            }
            if ((i11 & 2) != 0) {
                paddings2 = containerPaddings.bottom;
            }
            if ((i11 & 4) != 0) {
                paddings3 = containerPaddings.between;
            }
            if ((i11 & 8) != 0) {
                paddings4 = containerPaddings.inner;
            }
            if ((i11 & 16) != 0) {
                paddings5 = containerPaddings.outer;
            }
            Paddings paddings6 = paddings5;
            Paddings paddings7 = paddings3;
            return containerPaddings.copy(paddings, paddings2, paddings7, paddings4, paddings6);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getBetween() {
            return this.between;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getInner() {
            return this.inner;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final Paddings getOuter() {
            return this.outer;
        }

        @NotNull
        public final ContainerPaddings copy(@NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings between, @NotNull Paddings inner, @NotNull Paddings outer) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(between, "between");
            Intrinsics.checkNotNullParameter(inner, "inner");
            Intrinsics.checkNotNullParameter(outer, "outer");
            return new ContainerPaddings(top, bottom, between, inner, outer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContainerPaddings)) {
                return false;
            }
            ContainerPaddings containerPaddings = (ContainerPaddings) other;
            return this.top == containerPaddings.top && this.bottom == containerPaddings.bottom && this.between == containerPaddings.between && this.inner == containerPaddings.inner && this.outer == containerPaddings.outer;
        }

        @NotNull
        public final Paddings getBetween() {
            return this.between;
        }

        @NotNull
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final Paddings getInner() {
            return this.inner;
        }

        @NotNull
        public final Paddings getOuter() {
            return this.outer;
        }

        @NotNull
        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            return this.outer.hashCode() + GR.b.b(this.inner, GR.b.b(this.between, GR.b.b(this.bottom, this.top.hashCode() * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.top;
            Paddings paddings2 = this.bottom;
            Paddings paddings3 = this.between;
            Paddings paddings4 = this.inner;
            Paddings paddings5 = this.outer;
            StringBuilder b11 = p.b("ContainerPaddings(top=", paddings, ", bottom=", paddings2, ", between=");
            a.e(b11, paddings3, ", inner=", paddings4, ", outer=");
            return D40.b.b(b11, paddings5, ")");
        }

        public ContainerPaddings(@NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings between, @NotNull Paddings inner, @NotNull Paddings outer) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(between, "between");
            Intrinsics.checkNotNullParameter(inner, "inner");
            Intrinsics.checkNotNullParameter(outer, "outer");
            this.top = top;
            this.bottom = bottom;
            this.between = between;
            this.inner = inner;
            this.outer = outer;
        }

        public /* synthetic */ ContainerPaddings(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Paddings.PADDING_400 : paddings, (i11 & 2) != 0 ? Paddings.PADDING_300 : paddings2, (i11 & 4) != 0 ? Paddings.PADDING_400 : paddings3, (i11 & 8) != 0 ? Paddings.PADDING_300 : paddings4, (i11 & 16) != 0 ? Paddings.PADDING_300 : paddings5);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$RoundedCorners;", "", "buttonRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "widgetRadius", "<init>", "(Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getButtonRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getWidgetRadius", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RoundedCorners {
        public static final int $stable = 0;

        @NotNull
        private final CornerRadius buttonRadius;

        @NotNull
        private final CornerRadius widgetRadius;

        /* JADX WARN: Multi-variable type inference failed */
        public RoundedCorners() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ RoundedCorners copy$default(RoundedCorners roundedCorners, CornerRadius cornerRadius, CornerRadius cornerRadius2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cornerRadius = roundedCorners.buttonRadius;
            }
            if ((i11 & 2) != 0) {
                cornerRadius2 = roundedCorners.widgetRadius;
            }
            return roundedCorners.copy(cornerRadius, cornerRadius2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CornerRadius getButtonRadius() {
            return this.buttonRadius;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CornerRadius getWidgetRadius() {
            return this.widgetRadius;
        }

        @NotNull
        public final RoundedCorners copy(@NotNull CornerRadius buttonRadius, @NotNull CornerRadius widgetRadius) {
            Intrinsics.checkNotNullParameter(buttonRadius, "buttonRadius");
            Intrinsics.checkNotNullParameter(widgetRadius, "widgetRadius");
            return new RoundedCorners(buttonRadius, widgetRadius);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RoundedCorners)) {
                return false;
            }
            RoundedCorners roundedCorners = (RoundedCorners) other;
            return this.buttonRadius == roundedCorners.buttonRadius && this.widgetRadius == roundedCorners.widgetRadius;
        }

        @NotNull
        public final CornerRadius getButtonRadius() {
            return this.buttonRadius;
        }

        @NotNull
        public final CornerRadius getWidgetRadius() {
            return this.widgetRadius;
        }

        public int hashCode() {
            return this.widgetRadius.hashCode() + (this.buttonRadius.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "RoundedCorners(buttonRadius=" + this.buttonRadius + ", widgetRadius=" + this.widgetRadius + ")";
        }

        public RoundedCorners(@NotNull CornerRadius buttonRadius, @NotNull CornerRadius widgetRadius) {
            Intrinsics.checkNotNullParameter(buttonRadius, "buttonRadius");
            Intrinsics.checkNotNullParameter(widgetRadius, "widgetRadius");
            this.buttonRadius = buttonRadius;
            this.widgetRadius = widgetRadius;
        }

        public /* synthetic */ RoundedCorners(CornerRadius cornerRadius, CornerRadius cornerRadius2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? CornerRadius.RADIUS_700 : cornerRadius, (i11 & 2) != 0 ? CornerRadius.RADIUS_650 : cornerRadius2);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$SauceInfo;", "", "textCheckbox", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "partialComponents", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$ComponentsLight;", "wholeComponents", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$ComponentsLight;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$ComponentsLight;)V", "getTextCheckbox", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getPartialComponents", "()Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$ComponentsLight;", "getWholeComponents", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SauceInfo {
        public static final int $stable = CellDTO.$stable;
        private final ComponentsLight partialComponents;
        private final CellDTO textCheckbox;
        private final ComponentsLight wholeComponents;

        public SauceInfo(CellDTO cellDTO, ComponentsLight componentsLight, ComponentsLight componentsLight2) {
            this.textCheckbox = cellDTO;
            this.partialComponents = componentsLight;
            this.wholeComponents = componentsLight2;
        }

        public static /* synthetic */ SauceInfo copy$default(SauceInfo sauceInfo, CellDTO cellDTO, ComponentsLight componentsLight, ComponentsLight componentsLight2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellDTO = sauceInfo.textCheckbox;
            }
            if ((i11 & 2) != 0) {
                componentsLight = sauceInfo.partialComponents;
            }
            if ((i11 & 4) != 0) {
                componentsLight2 = sauceInfo.wholeComponents;
            }
            return sauceInfo.copy(cellDTO, componentsLight, componentsLight2);
        }

        /* renamed from: component1, reason: from getter */
        public final CellDTO getTextCheckbox() {
            return this.textCheckbox;
        }

        /* renamed from: component2, reason: from getter */
        public final ComponentsLight getPartialComponents() {
            return this.partialComponents;
        }

        /* renamed from: component3, reason: from getter */
        public final ComponentsLight getWholeComponents() {
            return this.wholeComponents;
        }

        @NotNull
        public final SauceInfo copy(CellDTO textCheckbox, ComponentsLight partialComponents, ComponentsLight wholeComponents) {
            return new SauceInfo(textCheckbox, partialComponents, wholeComponents);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SauceInfo)) {
                return false;
            }
            SauceInfo sauceInfo = (SauceInfo) other;
            return Intrinsics.d(this.textCheckbox, sauceInfo.textCheckbox) && Intrinsics.d(this.partialComponents, sauceInfo.partialComponents) && Intrinsics.d(this.wholeComponents, sauceInfo.wholeComponents);
        }

        public final ComponentsLight getPartialComponents() {
            return this.partialComponents;
        }

        public final CellDTO getTextCheckbox() {
            return this.textCheckbox;
        }

        public final ComponentsLight getWholeComponents() {
            return this.wholeComponents;
        }

        public int hashCode() {
            CellDTO cellDTO = this.textCheckbox;
            int hashCode = (cellDTO == null ? 0 : cellDTO.hashCode()) * 31;
            ComponentsLight componentsLight = this.partialComponents;
            int hashCode2 = (hashCode + (componentsLight == null ? 0 : componentsLight.hashCode())) * 31;
            ComponentsLight componentsLight2 = this.wholeComponents;
            return hashCode2 + (componentsLight2 != null ? componentsLight2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SauceInfo(textCheckbox=" + this.textCheckbox + ", partialComponents=" + this.partialComponents + ", wholeComponents=" + this.wholeComponents + ")";
        }
    }

    public PdpNutritionInfoDTO(@NotNull ButtonV3DTO button, Info info, String str, @NotNull RoundedCorners corners, @NotNull ContainerPaddings paddings, SauceInfo sauceInfo, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(corners, "corners");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.button = button;
        this.info = info;
        this.backgroundColor = str;
        this.corners = corners;
        this.paddings = paddings;
        this.sauceInfo = sauceInfo;
        this.trackingInfo = map;
    }

    public static /* synthetic */ PdpNutritionInfoDTO copy$default(PdpNutritionInfoDTO pdpNutritionInfoDTO, ButtonV3DTO buttonV3DTO, Info info, String str, RoundedCorners roundedCorners, ContainerPaddings containerPaddings, SauceInfo sauceInfo, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            buttonV3DTO = pdpNutritionInfoDTO.button;
        }
        if ((i11 & 2) != 0) {
            info = pdpNutritionInfoDTO.info;
        }
        if ((i11 & 4) != 0) {
            str = pdpNutritionInfoDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            roundedCorners = pdpNutritionInfoDTO.corners;
        }
        if ((i11 & 16) != 0) {
            containerPaddings = pdpNutritionInfoDTO.paddings;
        }
        if ((i11 & 32) != 0) {
            sauceInfo = pdpNutritionInfoDTO.sauceInfo;
        }
        if ((i11 & 64) != 0) {
            map = pdpNutritionInfoDTO.trackingInfo;
        }
        SauceInfo sauceInfo2 = sauceInfo;
        Map map2 = map;
        ContainerPaddings containerPaddings2 = containerPaddings;
        String str2 = str;
        return pdpNutritionInfoDTO.copy(buttonV3DTO, info, str2, roundedCorners, containerPaddings2, sauceInfo2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    /* renamed from: component2, reason: from getter */
    public final Info getInfo() {
        return this.info;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final RoundedCorners getCorners() {
        return this.corners;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ContainerPaddings getPaddings() {
        return this.paddings;
    }

    /* renamed from: component6, reason: from getter */
    public final SauceInfo getSauceInfo() {
        return this.sauceInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final PdpNutritionInfoDTO copy(@NotNull ButtonV3DTO button, Info info, String backgroundColor, @NotNull RoundedCorners corners, @NotNull ContainerPaddings paddings, SauceInfo sauceInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(corners, "corners");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new PdpNutritionInfoDTO(button, info, backgroundColor, corners, paddings, sauceInfo, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdpNutritionInfoDTO)) {
            return false;
        }
        PdpNutritionInfoDTO pdpNutritionInfoDTO = (PdpNutritionInfoDTO) other;
        return Intrinsics.d(this.button, pdpNutritionInfoDTO.button) && Intrinsics.d(this.info, pdpNutritionInfoDTO.info) && Intrinsics.d(this.backgroundColor, pdpNutritionInfoDTO.backgroundColor) && Intrinsics.d(this.corners, pdpNutritionInfoDTO.corners) && Intrinsics.d(this.paddings, pdpNutritionInfoDTO.paddings) && Intrinsics.d(this.sauceInfo, pdpNutritionInfoDTO.sauceInfo) && Intrinsics.d(this.trackingInfo, pdpNutritionInfoDTO.trackingInfo);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final RoundedCorners getCorners() {
        return this.corners;
    }

    public final Info getInfo() {
        return this.info;
    }

    @NotNull
    public final ContainerPaddings getPaddings() {
        return this.paddings;
    }

    public final SauceInfo getSauceInfo() {
        return this.sauceInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.button.hashCode() * 31;
        Info info = this.info;
        int hashCode2 = (hashCode + (info == null ? 0 : info.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (this.paddings.hashCode() + ((this.corners.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        SauceInfo sauceInfo = this.sauceInfo;
        int hashCode4 = (hashCode3 + (sauceInfo == null ? 0 : sauceInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ButtonV3DTO buttonV3DTO = this.button;
        Info info = this.info;
        String str = this.backgroundColor;
        RoundedCorners roundedCorners = this.corners;
        ContainerPaddings containerPaddings = this.paddings;
        SauceInfo sauceInfo = this.sauceInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("PdpNutritionInfoDTO(button=");
        sb2.append(buttonV3DTO);
        sb2.append(", info=");
        sb2.append(info);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", corners=");
        sb2.append(roundedCorners);
        sb2.append(", paddings=");
        sb2.append(containerPaddings);
        sb2.append(", sauceInfo=");
        sb2.append(sauceInfo);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Info;", "", "switch", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Info$Switch;", "partialComponents", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Components;", "wholeComponents", "spacers", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Info$Spacers;", "<init>", "(Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Info$Switch;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Components;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Components;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Info$Spacers;)V", "getSwitch", "()Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Info$Switch;", "getPartialComponents", "()Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Components;", "getWholeComponents", "getSpacers", "()Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Info$Spacers;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Switch", "Spacers", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Info {
        public static final int $stable;

        @NotNull
        private final Components partialComponents;

        @NotNull
        private final Spacers spacers;

        @NotNull
        private final Switch switch;
        private final Components wholeComponents;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Info$Spacers;", "", "horizontal", "Lru/ozon/uni/atoms/data/common/Paddings;", "vertical", "between", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getHorizontal", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getVertical", "getBetween", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Spacers {
            public static final int $stable = 0;

            @NotNull
            private final Paddings between;

            @NotNull
            private final Paddings horizontal;

            @NotNull
            private final Paddings vertical;

            public Spacers() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ Spacers copy$default(Spacers spacers, Paddings paddings, Paddings paddings2, Paddings paddings3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    paddings = spacers.horizontal;
                }
                if ((i11 & 2) != 0) {
                    paddings2 = spacers.vertical;
                }
                if ((i11 & 4) != 0) {
                    paddings3 = spacers.between;
                }
                return spacers.copy(paddings, paddings2, paddings3);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final Paddings getHorizontal() {
                return this.horizontal;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final Paddings getVertical() {
                return this.vertical;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final Paddings getBetween() {
                return this.between;
            }

            @NotNull
            public final Spacers copy(@NotNull Paddings horizontal, @NotNull Paddings vertical, @NotNull Paddings between) {
                Intrinsics.checkNotNullParameter(horizontal, "horizontal");
                Intrinsics.checkNotNullParameter(vertical, "vertical");
                Intrinsics.checkNotNullParameter(between, "between");
                return new Spacers(horizontal, vertical, between);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Spacers)) {
                    return false;
                }
                Spacers spacers = (Spacers) other;
                return this.horizontal == spacers.horizontal && this.vertical == spacers.vertical && this.between == spacers.between;
            }

            @NotNull
            public final Paddings getBetween() {
                return this.between;
            }

            @NotNull
            public final Paddings getHorizontal() {
                return this.horizontal;
            }

            @NotNull
            public final Paddings getVertical() {
                return this.vertical;
            }

            public int hashCode() {
                return this.between.hashCode() + GR.b.b(this.vertical, this.horizontal.hashCode() * 31, 31);
            }

            @NotNull
            public String toString() {
                Paddings paddings = this.horizontal;
                Paddings paddings2 = this.vertical;
                return D40.b.b(p.b("Spacers(horizontal=", paddings, ", vertical=", paddings2, ", between="), this.between, ")");
            }

            public Spacers(@NotNull Paddings horizontal, @NotNull Paddings vertical, @NotNull Paddings between) {
                Intrinsics.checkNotNullParameter(horizontal, "horizontal");
                Intrinsics.checkNotNullParameter(vertical, "vertical");
                Intrinsics.checkNotNullParameter(between, "between");
                this.horizontal = horizontal;
                this.vertical = vertical;
                this.between = between;
            }

            public /* synthetic */ Spacers(Paddings paddings, Paddings paddings2, Paddings paddings3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? Paddings.PADDING_300 : paddings, (i11 & 2) != 0 ? Paddings.PADDING_300 : paddings2, (i11 & 4) != 0 ? Paddings.NONE : paddings3);
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Info$Switch;", "", "partial", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "whole", "<init>", "(Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;)V", "getPartial", "()Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "getWhole", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Switch {
            public static final int $stable = TagButtonDTO.$stable;

            @NotNull
            private final TagButtonDTO partial;
            private final TagButtonDTO whole;

            public Switch(@NotNull TagButtonDTO partial, TagButtonDTO tagButtonDTO) {
                Intrinsics.checkNotNullParameter(partial, "partial");
                this.partial = partial;
                this.whole = tagButtonDTO;
            }

            public static /* synthetic */ Switch copy$default(Switch r02, TagButtonDTO tagButtonDTO, TagButtonDTO tagButtonDTO2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    tagButtonDTO = r02.partial;
                }
                if ((i11 & 2) != 0) {
                    tagButtonDTO2 = r02.whole;
                }
                return r02.copy(tagButtonDTO, tagButtonDTO2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TagButtonDTO getPartial() {
                return this.partial;
            }

            /* renamed from: component2, reason: from getter */
            public final TagButtonDTO getWhole() {
                return this.whole;
            }

            @NotNull
            public final Switch copy(@NotNull TagButtonDTO partial, TagButtonDTO whole) {
                Intrinsics.checkNotNullParameter(partial, "partial");
                return new Switch(partial, whole);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Switch)) {
                    return false;
                }
                Switch r52 = (Switch) other;
                return Intrinsics.d(this.partial, r52.partial) && Intrinsics.d(this.whole, r52.whole);
            }

            @NotNull
            public final TagButtonDTO getPartial() {
                return this.partial;
            }

            public final TagButtonDTO getWhole() {
                return this.whole;
            }

            public int hashCode() {
                int hashCode = this.partial.hashCode() * 31;
                TagButtonDTO tagButtonDTO = this.whole;
                return hashCode + (tagButtonDTO == null ? 0 : tagButtonDTO.hashCode());
            }

            @NotNull
            public String toString() {
                return "Switch(partial=" + this.partial + ", whole=" + this.whole + ")";
            }
        }

        static {
            int i11 = CellDTO.$stable;
            int i12 = TagButtonDTO.$stable;
            $stable = i11 | i12 | i12;
        }

        public Info(@NotNull Switch r22, @NotNull Components partialComponents, Components components, @NotNull Spacers spacers) {
            Intrinsics.checkNotNullParameter(r22, "switch");
            Intrinsics.checkNotNullParameter(partialComponents, "partialComponents");
            Intrinsics.checkNotNullParameter(spacers, "spacers");
            this.switch = r22;
            this.partialComponents = partialComponents;
            this.wholeComponents = components;
            this.spacers = spacers;
        }

        public static /* synthetic */ Info copy$default(Info info, Switch r12, Components components, Components components2, Spacers spacers, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                r12 = info.switch;
            }
            if ((i11 & 2) != 0) {
                components = info.partialComponents;
            }
            if ((i11 & 4) != 0) {
                components2 = info.wholeComponents;
            }
            if ((i11 & 8) != 0) {
                spacers = info.spacers;
            }
            return info.copy(r12, components, components2, spacers);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Switch getSwitch() {
            return this.switch;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Components getPartialComponents() {
            return this.partialComponents;
        }

        /* renamed from: component3, reason: from getter */
        public final Components getWholeComponents() {
            return this.wholeComponents;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Spacers getSpacers() {
            return this.spacers;
        }

        @NotNull
        public final Info copy(@NotNull Switch r22, @NotNull Components partialComponents, Components wholeComponents, @NotNull Spacers spacers) {
            Intrinsics.checkNotNullParameter(r22, "switch");
            Intrinsics.checkNotNullParameter(partialComponents, "partialComponents");
            Intrinsics.checkNotNullParameter(spacers, "spacers");
            return new Info(r22, partialComponents, wholeComponents, spacers);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Info)) {
                return false;
            }
            Info info = (Info) other;
            return Intrinsics.d(this.switch, info.switch) && Intrinsics.d(this.partialComponents, info.partialComponents) && Intrinsics.d(this.wholeComponents, info.wholeComponents) && Intrinsics.d(this.spacers, info.spacers);
        }

        @NotNull
        public final Components getPartialComponents() {
            return this.partialComponents;
        }

        @NotNull
        public final Spacers getSpacers() {
            return this.spacers;
        }

        @NotNull
        public final Switch getSwitch() {
            return this.switch;
        }

        public final Components getWholeComponents() {
            return this.wholeComponents;
        }

        public int hashCode() {
            int hashCode = (this.partialComponents.hashCode() + (this.switch.hashCode() * 31)) * 31;
            Components components = this.wholeComponents;
            return this.spacers.hashCode() + ((hashCode + (components == null ? 0 : components.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "Info(switch=" + this.switch + ", partialComponents=" + this.partialComponents + ", wholeComponents=" + this.wholeComponents + ", spacers=" + this.spacers + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Info(Switch r72, Components components, Components components2, Spacers spacers, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(r72, components, components2, spacers);
            if ((i11 & 8) != 0) {
                spacers = new Spacers(null, null, null, 7, null);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PdpNutritionInfoDTO(ButtonV3DTO buttonV3DTO, Info info, String str, RoundedCorners roundedCorners, ContainerPaddings containerPaddings, SauceInfo sauceInfo, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(buttonV3DTO, info, str, r7, r8, sauceInfo, map);
        RoundedCorners roundedCorners2;
        ContainerPaddings containerPaddings2;
        if ((i11 & 8) != 0) {
            roundedCorners2 = new RoundedCorners(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        } else {
            roundedCorners2 = roundedCorners;
        }
        if ((i11 & 16) != 0) {
            containerPaddings2 = new ContainerPaddings(null, null, null, null, null, 31, null);
        } else {
            containerPaddings2 = containerPaddings;
        }
    }
}
