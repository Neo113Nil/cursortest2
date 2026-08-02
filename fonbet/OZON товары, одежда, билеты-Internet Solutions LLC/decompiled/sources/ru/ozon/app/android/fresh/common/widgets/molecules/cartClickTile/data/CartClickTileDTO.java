package ru.ozon.app.android.fresh.common.widgets.molecules.cartClickTile.data;

import Bi.b;
import G.g;
import Ih.a;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.common.widgets.molecules.imageSkuClick.data.ImageSkuClickDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001/BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003Ja\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00060"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/data/CartClickTileDTO;", "", "skuImage", "Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/data/ImageSkuClickDTO;", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "backgroundColor", "", "spacers", "Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/data/CartClickTileDTO$Spacers;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/data/ImageSkuClickDTO;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/data/CartClickTileDTO$Spacers;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getSkuImage", "()Lru/ozon/app/android/fresh/common/widgets/molecules/imageSkuClick/data/ImageSkuClickDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getSpacers", "()Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/data/CartClickTileDTO$Spacers;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Spacers", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CartClickTileDTO {

    @NotNull
    private final AtomActionDTO action;

    @NotNull
    private final String backgroundColor;
    private final ButtonV3DTO button;

    @NotNull
    private final CellDTO cell;

    @NotNull
    private final ImageSkuClickDTO skuImage;
    private final Spacers spacers;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/data/CartClickTileDTO$Spacers;", "", "horizontal", "Lru/ozon/uni/atoms/data/common/Paddings;", "between", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getHorizontal", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBetween", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Spacers {
        private final Paddings between;
        private final Paddings horizontal;

        public Spacers(Paddings paddings, Paddings paddings2) {
            this.horizontal = paddings;
            this.between = paddings2;
        }

        public static /* synthetic */ Spacers copy$default(Spacers spacers, Paddings paddings, Paddings paddings2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = spacers.horizontal;
            }
            if ((i11 & 2) != 0) {
                paddings2 = spacers.between;
            }
            return spacers.copy(paddings, paddings2);
        }

        /* renamed from: component1, reason: from getter */
        public final Paddings getHorizontal() {
            return this.horizontal;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getBetween() {
            return this.between;
        }

        @NotNull
        public final Spacers copy(Paddings horizontal, Paddings between) {
            return new Spacers(horizontal, between);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spacers)) {
                return false;
            }
            Spacers spacers = (Spacers) other;
            return this.horizontal == spacers.horizontal && this.between == spacers.between;
        }

        public final Paddings getBetween() {
            return this.between;
        }

        public final Paddings getHorizontal() {
            return this.horizontal;
        }

        public int hashCode() {
            Paddings paddings = this.horizontal;
            int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
            Paddings paddings2 = this.between;
            return hashCode + (paddings2 != null ? paddings2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Spacers(horizontal=" + this.horizontal + ", between=" + this.between + ")";
        }
    }

    public CartClickTileDTO(@NotNull ImageSkuClickDTO skuImage, @NotNull CellDTO cell, @NotNull String backgroundColor, Spacers spacers, ButtonV3DTO buttonV3DTO, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(skuImage, "skuImage");
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(action, "action");
        this.skuImage = skuImage;
        this.cell = cell;
        this.backgroundColor = backgroundColor;
        this.spacers = spacers;
        this.button = buttonV3DTO;
        this.action = action;
        this.trackingInfo = map;
    }

    public static /* synthetic */ CartClickTileDTO copy$default(CartClickTileDTO cartClickTileDTO, ImageSkuClickDTO imageSkuClickDTO, CellDTO cellDTO, String str, Spacers spacers, ButtonV3DTO buttonV3DTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageSkuClickDTO = cartClickTileDTO.skuImage;
        }
        if ((i11 & 2) != 0) {
            cellDTO = cartClickTileDTO.cell;
        }
        if ((i11 & 4) != 0) {
            str = cartClickTileDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            spacers = cartClickTileDTO.spacers;
        }
        if ((i11 & 16) != 0) {
            buttonV3DTO = cartClickTileDTO.button;
        }
        if ((i11 & 32) != 0) {
            atomActionDTO = cartClickTileDTO.action;
        }
        if ((i11 & 64) != 0) {
            map = cartClickTileDTO.trackingInfo;
        }
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        Map map2 = map;
        ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
        String str2 = str;
        return cartClickTileDTO.copy(imageSkuClickDTO, cellDTO, str2, spacers, buttonV3DTO2, atomActionDTO2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ImageSkuClickDTO getSkuImage() {
        return this.skuImage;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CellDTO getCell() {
        return this.cell;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final Spacers getSpacers() {
        return this.spacers;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    @NotNull
    public final CartClickTileDTO copy(@NotNull ImageSkuClickDTO skuImage, @NotNull CellDTO cell, @NotNull String backgroundColor, Spacers spacers, ButtonV3DTO button, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(skuImage, "skuImage");
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(action, "action");
        return new CartClickTileDTO(skuImage, cell, backgroundColor, spacers, button, action, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartClickTileDTO)) {
            return false;
        }
        CartClickTileDTO cartClickTileDTO = (CartClickTileDTO) other;
        return Intrinsics.d(this.skuImage, cartClickTileDTO.skuImage) && Intrinsics.d(this.cell, cartClickTileDTO.cell) && Intrinsics.d(this.backgroundColor, cartClickTileDTO.backgroundColor) && Intrinsics.d(this.spacers, cartClickTileDTO.spacers) && Intrinsics.d(this.button, cartClickTileDTO.button) && Intrinsics.d(this.action, cartClickTileDTO.action) && Intrinsics.d(this.trackingInfo, cartClickTileDTO.trackingInfo);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    @NotNull
    public final ImageSkuClickDTO getSkuImage() {
        return this.skuImage;
    }

    public final Spacers getSpacers() {
        return this.spacers;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a(b.c(this.cell, this.skuImage.hashCode() * 31, 31), 31, this.backgroundColor);
        Spacers spacers = this.spacers;
        int hashCode = (a11 + (spacers == null ? 0 : spacers.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.button;
        int b11 = a.b(this.action, (hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ImageSkuClickDTO imageSkuClickDTO = this.skuImage;
        CellDTO cellDTO = this.cell;
        String str = this.backgroundColor;
        Spacers spacers = this.spacers;
        ButtonV3DTO buttonV3DTO = this.button;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("CartClickTileDTO(skuImage=");
        sb2.append(imageSkuClickDTO);
        sb2.append(", cell=");
        sb2.append(cellDTO);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", spacers=");
        sb2.append(spacers);
        sb2.append(", button=");
        sb2.append(buttonV3DTO);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }
}
