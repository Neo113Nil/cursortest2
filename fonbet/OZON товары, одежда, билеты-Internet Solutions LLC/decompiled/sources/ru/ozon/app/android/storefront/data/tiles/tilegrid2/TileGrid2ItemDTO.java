package ru.ozon.app.android.storefront.data.tiles.tilegrid2;

import B0.A0;
import Cm.e;
import D3.g;
import Kk.C3532b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.labelList.LabelListAtom;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteToggleProductButton.model.FavoriteToggleProductButtonMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2;
import ru.ozon.app.android.pdp.common.ugc.data.ugcratingmolecule.UgcRatingMolecule;
import ru.ozon.app.android.storefront.data.tiles.countbutton.CountButtonDTO;
import ru.ozon.app.android.storefront.data.tiles.labellist.LabelListDTO;
import ru.ozon.app.android.storefront.data.tiles.onboarding.OnboardingModel;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.toprightbuttons.TopRightButtonCheckBox;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003abcBí\u0001\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0012\b\u0001\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010#\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b$\u0010%J\u0011\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006HÆ\u0003J\t\u0010I\u001a\u00020\nHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010K\u001a\u00020\u000eHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0013\u0010M\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010O\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0011\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0002\u0010=J\u000b\u0010T\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00103J\u000b\u0010W\u001a\u0004\u0018\u00010!HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00103J\u008e\u0002\u0010Z\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0012\b\u0003\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010[J\u0013\u0010\\\u001a\u00020\u000e2\b\u0010]\u001a\u0004\u0018\u00010\u0004HÖ\u0003J\t\u0010^\u001a\u00020_HÖ\u0001J\t\u0010`\u001a\u00020\u0007HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010.R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001b\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010'R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010'R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\n\n\u0002\u0010>\u001a\u0004\b<\u0010=R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u00104\u001a\u0004\b\u001f\u00103R\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0013\u0010\"\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\bE\u0010;R\u0015\u0010#\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u00104\u001a\u0004\bF\u00103¨\u0006d"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO;", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileItemDTO;", "mainState", "", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "tileImage", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileImageDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "isPagerIndicatorHidden", "", "multiButton", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/MultiButtonDTO;", "topRightButtons", "compactFavoriteIcon", "onboarding", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO$Onboarding;", "brandLogo", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO$BrandLogo;", "aspects", "islandBackgroundColor", "sku", "", "kebab", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO$KebabDTO;", "rating", "Lru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMolecule;", "isTextTagSupported", "countButton", "Lru/ozon/app/android/storefront/data/tiles/countbutton/CountButtonDTO;", "id", "topRightButtonsAnimationEnabled", "<init>", "(Ljava/util/List;Ljava/util/Map;Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileImageDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;ZLru/ozon/app/android/storefront/data/tiles/tilegrid2/MultiButtonDTO;Ljava/util/List;Ljava/lang/Boolean;Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO$Onboarding;Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO$BrandLogo;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO$KebabDTO;Lru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMolecule;Ljava/lang/Boolean;Lru/ozon/app/android/storefront/data/tiles/countbutton/CountButtonDTO;Ljava/lang/String;Ljava/lang/Boolean;)V", "getMainState", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "getTileImage", "()Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileImageDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "()Z", "getMultiButton", "()Lru/ozon/app/android/storefront/data/tiles/tilegrid2/MultiButtonDTO;", "getTopRightButtons", "getCompactFavoriteIcon", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOnboarding", "()Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO$Onboarding;", "getBrandLogo", "()Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO$BrandLogo;", "getAspects", "getIslandBackgroundColor", "()Ljava/lang/String;", "getSku", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getKebab", "()Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO$KebabDTO;", "getRating", "()Lru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMolecule;", "getCountButton", "()Lru/ozon/app/android/storefront/data/tiles/countbutton/CountButtonDTO;", "getId", "getTopRightButtonsAnimationEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/util/List;Ljava/util/Map;Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileImageDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;ZLru/ozon/app/android/storefront/data/tiles/tilegrid2/MultiButtonDTO;Ljava/util/List;Ljava/lang/Boolean;Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO$Onboarding;Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO$BrandLogo;Ljava/util/List;Ljava/lang/String;Ljava/lang/Long;Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO$KebabDTO;Lru/ozon/app/android/pdp/common/ugc/data/ugcratingmolecule/UgcRatingMolecule;Ljava/lang/Boolean;Lru/ozon/app/android/storefront/data/tiles/countbutton/CountButtonDTO;Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO;", "equals", "other", "hashCode", "", "toString", "Onboarding", "BrandLogo", "KebabDTO", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TileGrid2ItemDTO implements TileItemDTO {
    private final AtomActionDTO action;
    private final List<String> aspects;
    private final BrandLogo brandLogo;
    private final Boolean compactFavoriteIcon;
    private final CountButtonDTO countButton;
    private final String id;
    private final boolean isPagerIndicatorHidden;
    private final Boolean isTextTagSupported;
    private final String islandBackgroundColor;
    private final KebabDTO kebab;
    private final List<Object> mainState;
    private final MultiButtonDTO multiButton;
    private final Onboarding onboarding;
    private final UgcRatingMolecule rating;
    private final Long sku;

    @NotNull
    private final TileImageDTO tileImage;
    private final List<Object> topRightButtons;
    private final Boolean topRightButtonsAnimationEnabled;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO$BrandLogo;", "", "logo", "", "<init>", "(Ljava/lang/String;)V", "getLogo", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BrandLogo {

        @NotNull
        private final String logo;

        public BrandLogo(@NotNull String logo) {
            Intrinsics.checkNotNullParameter(logo, "logo");
            this.logo = logo;
        }

        public static /* synthetic */ BrandLogo copy$default(BrandLogo brandLogo, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = brandLogo.logo;
            }
            return brandLogo.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLogo() {
            return this.logo;
        }

        @NotNull
        public final BrandLogo copy(@NotNull String logo) {
            Intrinsics.checkNotNullParameter(logo, "logo");
            return new BrandLogo(logo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BrandLogo) && Intrinsics.d(this.logo, ((BrandLogo) other).logo);
        }

        @NotNull
        public final String getLogo() {
            return this.logo;
        }

        public int hashCode() {
            return this.logo.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("BrandLogo(logo=", this.logo, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO$KebabDTO;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class KebabDTO {

        @NotNull
        private final AtomActionDTO action;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public KebabDTO(@NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ KebabDTO copy$default(KebabDTO kebabDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                atomActionDTO = kebabDTO.action;
            }
            if ((i11 & 2) != 0) {
                map = kebabDTO.trackingInfo;
            }
            return kebabDTO.copy(atomActionDTO, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component2() {
            return this.trackingInfo;
        }

        @NotNull
        public final KebabDTO copy(@NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(action, "action");
            return new KebabDTO(action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof KebabDTO)) {
                return false;
            }
            KebabDTO kebabDTO = (KebabDTO) other;
            return Intrinsics.d(this.action, kebabDTO.action) && Intrinsics.d(this.trackingInfo, kebabDTO.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.action.hashCode() * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            return "KebabDTO(action=" + this.action + ", trackingInfo=" + this.trackingInfo + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileGrid2ItemDTO$Onboarding;", "", "badgeOnboarding", "Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;", "badgeOnboardingKey", "", "<init>", "(Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;Ljava/lang/String;)V", "getBadgeOnboarding", "()Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;", "getBadgeOnboardingKey", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Onboarding {

        @NotNull
        private final OnboardingModel badgeOnboarding;

        @NotNull
        private final String badgeOnboardingKey;

        public Onboarding(@NotNull OnboardingModel badgeOnboarding, @NotNull String badgeOnboardingKey) {
            Intrinsics.checkNotNullParameter(badgeOnboarding, "badgeOnboarding");
            Intrinsics.checkNotNullParameter(badgeOnboardingKey, "badgeOnboardingKey");
            this.badgeOnboarding = badgeOnboarding;
            this.badgeOnboardingKey = badgeOnboardingKey;
        }

        public static /* synthetic */ Onboarding copy$default(Onboarding onboarding, OnboardingModel onboardingModel, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                onboardingModel = onboarding.badgeOnboarding;
            }
            if ((i11 & 2) != 0) {
                str = onboarding.badgeOnboardingKey;
            }
            return onboarding.copy(onboardingModel, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OnboardingModel getBadgeOnboarding() {
            return this.badgeOnboarding;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getBadgeOnboardingKey() {
            return this.badgeOnboardingKey;
        }

        @NotNull
        public final Onboarding copy(@NotNull OnboardingModel badgeOnboarding, @NotNull String badgeOnboardingKey) {
            Intrinsics.checkNotNullParameter(badgeOnboarding, "badgeOnboarding");
            Intrinsics.checkNotNullParameter(badgeOnboardingKey, "badgeOnboardingKey");
            return new Onboarding(badgeOnboarding, badgeOnboardingKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Onboarding)) {
                return false;
            }
            Onboarding onboarding = (Onboarding) other;
            return Intrinsics.d(this.badgeOnboarding, onboarding.badgeOnboarding) && Intrinsics.d(this.badgeOnboardingKey, onboarding.badgeOnboardingKey);
        }

        @NotNull
        public final OnboardingModel getBadgeOnboarding() {
            return this.badgeOnboarding;
        }

        @NotNull
        public final String getBadgeOnboardingKey() {
            return this.badgeOnboardingKey;
        }

        public int hashCode() {
            return this.badgeOnboardingKey.hashCode() + (this.badgeOnboarding.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Onboarding(badgeOnboarding=" + this.badgeOnboarding + ", badgeOnboardingKey=" + this.badgeOnboardingKey + ")";
        }
    }

    public TileGrid2ItemDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "labelList", type = LabelListAtom.class), @ProtoOneOfSignature(name = "priceV2", type = PriceDTO.class), @ProtoOneOfSignature(name = "textDS", type = TextDTO.class), @ProtoOneOfSignature(name = "textAtom", type = TextAtom.class), @ProtoOneOfSignature(name = "labelListV2", type = LabelListDTO.class)}) @ProtoOneOf(label = "type") List<? extends Object> list, Map<String, TokenizedTrackingInfo> map, @NotNull TileImageDTO tileImage, AtomActionDTO atomActionDTO, boolean z11, MultiButtonDTO multiButtonDTO, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "checkbox", type = TopRightButtonCheckBox.class), @ProtoOneOfSignature(name = "favoriteProductMoleculeV2", type = FavoriteProductMoleculeV2.class), @ProtoOneOfSignature(name = "smallIconButton", type = ButtonV3Atom.SmallIconButton.class), @ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class), @ProtoOneOfSignature(name = "favoriteToggleProductMolecule", type = FavoriteToggleProductButtonMolecule.class), @ProtoOneOfSignature(name = "checkboxDS", type = CheckBoxDTO.class)}) @ProtoOneOf(label = "type") List<? extends Object> list2, Boolean bool, Onboarding onboarding, BrandLogo brandLogo, List<String> list3, String str, Long l11, KebabDTO kebabDTO, UgcRatingMolecule ugcRatingMolecule, Boolean bool2, CountButtonDTO countButtonDTO, String str2, Boolean bool3) {
        Intrinsics.checkNotNullParameter(tileImage, "tileImage");
        this.mainState = list;
        this.trackingInfo = map;
        this.tileImage = tileImage;
        this.action = atomActionDTO;
        this.isPagerIndicatorHidden = z11;
        this.multiButton = multiButtonDTO;
        this.topRightButtons = list2;
        this.compactFavoriteIcon = bool;
        this.onboarding = onboarding;
        this.brandLogo = brandLogo;
        this.aspects = list3;
        this.islandBackgroundColor = str;
        this.sku = l11;
        this.kebab = kebabDTO;
        this.rating = ugcRatingMolecule;
        this.isTextTagSupported = bool2;
        this.countButton = countButtonDTO;
        this.id = str2;
        this.topRightButtonsAnimationEnabled = bool3;
    }

    public static /* synthetic */ TileGrid2ItemDTO copy$default(TileGrid2ItemDTO tileGrid2ItemDTO, List list, Map map, TileImageDTO tileImageDTO, AtomActionDTO atomActionDTO, boolean z11, MultiButtonDTO multiButtonDTO, List list2, Boolean bool, Onboarding onboarding, BrandLogo brandLogo, List list3, String str, Long l11, KebabDTO kebabDTO, UgcRatingMolecule ugcRatingMolecule, Boolean bool2, CountButtonDTO countButtonDTO, String str2, Boolean bool3, int i11, Object obj) {
        Boolean bool4;
        String str3;
        List list4 = (i11 & 1) != 0 ? tileGrid2ItemDTO.mainState : list;
        Map map2 = (i11 & 2) != 0 ? tileGrid2ItemDTO.trackingInfo : map;
        TileImageDTO tileImageDTO2 = (i11 & 4) != 0 ? tileGrid2ItemDTO.tileImage : tileImageDTO;
        AtomActionDTO atomActionDTO2 = (i11 & 8) != 0 ? tileGrid2ItemDTO.action : atomActionDTO;
        boolean z12 = (i11 & 16) != 0 ? tileGrid2ItemDTO.isPagerIndicatorHidden : z11;
        MultiButtonDTO multiButtonDTO2 = (i11 & 32) != 0 ? tileGrid2ItemDTO.multiButton : multiButtonDTO;
        List list5 = (i11 & 64) != 0 ? tileGrid2ItemDTO.topRightButtons : list2;
        Boolean bool5 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? tileGrid2ItemDTO.compactFavoriteIcon : bool;
        Onboarding onboarding2 = (i11 & 256) != 0 ? tileGrid2ItemDTO.onboarding : onboarding;
        BrandLogo brandLogo2 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? tileGrid2ItemDTO.brandLogo : brandLogo;
        List list6 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? tileGrid2ItemDTO.aspects : list3;
        String str4 = (i11 & 2048) != 0 ? tileGrid2ItemDTO.islandBackgroundColor : str;
        Long l12 = (i11 & 4096) != 0 ? tileGrid2ItemDTO.sku : l11;
        KebabDTO kebabDTO2 = (i11 & 8192) != 0 ? tileGrid2ItemDTO.kebab : kebabDTO;
        List list7 = list4;
        UgcRatingMolecule ugcRatingMolecule2 = (i11 & 16384) != 0 ? tileGrid2ItemDTO.rating : ugcRatingMolecule;
        Boolean bool6 = (i11 & 32768) != 0 ? tileGrid2ItemDTO.isTextTagSupported : bool2;
        CountButtonDTO countButtonDTO2 = (i11 & 65536) != 0 ? tileGrid2ItemDTO.countButton : countButtonDTO;
        String str5 = (i11 & 131072) != 0 ? tileGrid2ItemDTO.id : str2;
        if ((i11 & 262144) != 0) {
            str3 = str5;
            bool4 = tileGrid2ItemDTO.topRightButtonsAnimationEnabled;
        } else {
            bool4 = bool3;
            str3 = str5;
        }
        return tileGrid2ItemDTO.copy(list7, map2, tileImageDTO2, atomActionDTO2, z12, multiButtonDTO2, list5, bool5, onboarding2, brandLogo2, list6, str4, l12, kebabDTO2, ugcRatingMolecule2, bool6, countButtonDTO2, str3, bool4);
    }

    public final List<Object> component1() {
        return this.mainState;
    }

    /* renamed from: component10, reason: from getter */
    public final BrandLogo getBrandLogo() {
        return this.brandLogo;
    }

    public final List<String> component11() {
        return this.aspects;
    }

    /* renamed from: component12, reason: from getter */
    public final String getIslandBackgroundColor() {
        return this.islandBackgroundColor;
    }

    /* renamed from: component13, reason: from getter */
    public final Long getSku() {
        return this.sku;
    }

    /* renamed from: component14, reason: from getter */
    public final KebabDTO getKebab() {
        return this.kebab;
    }

    /* renamed from: component15, reason: from getter */
    public final UgcRatingMolecule getRating() {
        return this.rating;
    }

    /* renamed from: component16, reason: from getter */
    public final Boolean getIsTextTagSupported() {
        return this.isTextTagSupported;
    }

    /* renamed from: component17, reason: from getter */
    public final CountButtonDTO getCountButton() {
        return this.countButton;
    }

    /* renamed from: component18, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component19, reason: from getter */
    public final Boolean getTopRightButtonsAnimationEnabled() {
        return this.topRightButtonsAnimationEnabled;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TileImageDTO getTileImage() {
        return this.tileImage;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsPagerIndicatorHidden() {
        return this.isPagerIndicatorHidden;
    }

    /* renamed from: component6, reason: from getter */
    public final MultiButtonDTO getMultiButton() {
        return this.multiButton;
    }

    public final List<Object> component7() {
        return this.topRightButtons;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getCompactFavoriteIcon() {
        return this.compactFavoriteIcon;
    }

    /* renamed from: component9, reason: from getter */
    public final Onboarding getOnboarding() {
        return this.onboarding;
    }

    @NotNull
    public final TileGrid2ItemDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "labelList", type = LabelListAtom.class), @ProtoOneOfSignature(name = "priceV2", type = PriceDTO.class), @ProtoOneOfSignature(name = "textDS", type = TextDTO.class), @ProtoOneOfSignature(name = "textAtom", type = TextAtom.class), @ProtoOneOfSignature(name = "labelListV2", type = LabelListDTO.class)}) @ProtoOneOf(label = "type") List<? extends Object> mainState, Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull TileImageDTO tileImage, AtomActionDTO action, boolean isPagerIndicatorHidden, MultiButtonDTO multiButton, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "checkbox", type = TopRightButtonCheckBox.class), @ProtoOneOfSignature(name = "favoriteProductMoleculeV2", type = FavoriteProductMoleculeV2.class), @ProtoOneOfSignature(name = "smallIconButton", type = ButtonV3Atom.SmallIconButton.class), @ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class), @ProtoOneOfSignature(name = "favoriteToggleProductMolecule", type = FavoriteToggleProductButtonMolecule.class), @ProtoOneOfSignature(name = "checkboxDS", type = CheckBoxDTO.class)}) @ProtoOneOf(label = "type") List<? extends Object> topRightButtons, Boolean compactFavoriteIcon, Onboarding onboarding, BrandLogo brandLogo, List<String> aspects, String islandBackgroundColor, Long sku, KebabDTO kebab, UgcRatingMolecule rating, Boolean isTextTagSupported, CountButtonDTO countButton, String id2, Boolean topRightButtonsAnimationEnabled) {
        Intrinsics.checkNotNullParameter(tileImage, "tileImage");
        return new TileGrid2ItemDTO(mainState, trackingInfo, tileImage, action, isPagerIndicatorHidden, multiButton, topRightButtons, compactFavoriteIcon, onboarding, brandLogo, aspects, islandBackgroundColor, sku, kebab, rating, isTextTagSupported, countButton, id2, topRightButtonsAnimationEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileGrid2ItemDTO)) {
            return false;
        }
        TileGrid2ItemDTO tileGrid2ItemDTO = (TileGrid2ItemDTO) other;
        return Intrinsics.d(this.mainState, tileGrid2ItemDTO.mainState) && Intrinsics.d(this.trackingInfo, tileGrid2ItemDTO.trackingInfo) && Intrinsics.d(this.tileImage, tileGrid2ItemDTO.tileImage) && Intrinsics.d(this.action, tileGrid2ItemDTO.action) && this.isPagerIndicatorHidden == tileGrid2ItemDTO.isPagerIndicatorHidden && Intrinsics.d(this.multiButton, tileGrid2ItemDTO.multiButton) && Intrinsics.d(this.topRightButtons, tileGrid2ItemDTO.topRightButtons) && Intrinsics.d(this.compactFavoriteIcon, tileGrid2ItemDTO.compactFavoriteIcon) && Intrinsics.d(this.onboarding, tileGrid2ItemDTO.onboarding) && Intrinsics.d(this.brandLogo, tileGrid2ItemDTO.brandLogo) && Intrinsics.d(this.aspects, tileGrid2ItemDTO.aspects) && Intrinsics.d(this.islandBackgroundColor, tileGrid2ItemDTO.islandBackgroundColor) && Intrinsics.d(this.sku, tileGrid2ItemDTO.sku) && Intrinsics.d(this.kebab, tileGrid2ItemDTO.kebab) && Intrinsics.d(this.rating, tileGrid2ItemDTO.rating) && Intrinsics.d(this.isTextTagSupported, tileGrid2ItemDTO.isTextTagSupported) && Intrinsics.d(this.countButton, tileGrid2ItemDTO.countButton) && Intrinsics.d(this.id, tileGrid2ItemDTO.id) && Intrinsics.d(this.topRightButtonsAnimationEnabled, tileGrid2ItemDTO.topRightButtonsAnimationEnabled);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final List<String> getAspects() {
        return this.aspects;
    }

    public final BrandLogo getBrandLogo() {
        return this.brandLogo;
    }

    public final Boolean getCompactFavoriteIcon() {
        return this.compactFavoriteIcon;
    }

    public final CountButtonDTO getCountButton() {
        return this.countButton;
    }

    public final String getId() {
        return this.id;
    }

    public final String getIslandBackgroundColor() {
        return this.islandBackgroundColor;
    }

    public final KebabDTO getKebab() {
        return this.kebab;
    }

    public final List<Object> getMainState() {
        return this.mainState;
    }

    public final MultiButtonDTO getMultiButton() {
        return this.multiButton;
    }

    public final Onboarding getOnboarding() {
        return this.onboarding;
    }

    public final UgcRatingMolecule getRating() {
        return this.rating;
    }

    public final Long getSku() {
        return this.sku;
    }

    @NotNull
    public final TileImageDTO getTileImage() {
        return this.tileImage;
    }

    public final List<Object> getTopRightButtons() {
        return this.topRightButtons;
    }

    public final Boolean getTopRightButtonsAnimationEnabled() {
        return this.topRightButtonsAnimationEnabled;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        List<Object> list = this.mainState;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (this.tileImage.hashCode() + ((hashCode + (map == null ? 0 : map.hashCode())) * 31)) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int a11 = C3532b.a((hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31, 31, this.isPagerIndicatorHidden);
        MultiButtonDTO multiButtonDTO = this.multiButton;
        int hashCode3 = (a11 + (multiButtonDTO == null ? 0 : multiButtonDTO.hashCode())) * 31;
        List<Object> list2 = this.topRightButtons;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.compactFavoriteIcon;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Onboarding onboarding = this.onboarding;
        int hashCode6 = (hashCode5 + (onboarding == null ? 0 : onboarding.hashCode())) * 31;
        BrandLogo brandLogo = this.brandLogo;
        int hashCode7 = (hashCode6 + (brandLogo == null ? 0 : brandLogo.hashCode())) * 31;
        List<String> list3 = this.aspects;
        int hashCode8 = (hashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.islandBackgroundColor;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.sku;
        int hashCode10 = (hashCode9 + (l11 == null ? 0 : l11.hashCode())) * 31;
        KebabDTO kebabDTO = this.kebab;
        int hashCode11 = (hashCode10 + (kebabDTO == null ? 0 : kebabDTO.hashCode())) * 31;
        UgcRatingMolecule ugcRatingMolecule = this.rating;
        int hashCode12 = (hashCode11 + (ugcRatingMolecule == null ? 0 : ugcRatingMolecule.hashCode())) * 31;
        Boolean bool2 = this.isTextTagSupported;
        int hashCode13 = (hashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        CountButtonDTO countButtonDTO = this.countButton;
        int hashCode14 = (hashCode13 + (countButtonDTO == null ? 0 : countButtonDTO.hashCode())) * 31;
        String str2 = this.id;
        int hashCode15 = (hashCode14 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool3 = this.topRightButtonsAnimationEnabled;
        return hashCode15 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final boolean isPagerIndicatorHidden() {
        return this.isPagerIndicatorHidden;
    }

    public final Boolean isTextTagSupported() {
        return this.isTextTagSupported;
    }

    @NotNull
    public String toString() {
        List<Object> list = this.mainState;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TileImageDTO tileImageDTO = this.tileImage;
        AtomActionDTO atomActionDTO = this.action;
        boolean z11 = this.isPagerIndicatorHidden;
        MultiButtonDTO multiButtonDTO = this.multiButton;
        List<Object> list2 = this.topRightButtons;
        Boolean bool = this.compactFavoriteIcon;
        Onboarding onboarding = this.onboarding;
        BrandLogo brandLogo = this.brandLogo;
        List<String> list3 = this.aspects;
        String str = this.islandBackgroundColor;
        Long l11 = this.sku;
        KebabDTO kebabDTO = this.kebab;
        UgcRatingMolecule ugcRatingMolecule = this.rating;
        Boolean bool2 = this.isTextTagSupported;
        CountButtonDTO countButtonDTO = this.countButton;
        String str2 = this.id;
        Boolean bool3 = this.topRightButtonsAnimationEnabled;
        StringBuilder sb2 = new StringBuilder("TileGrid2ItemDTO(mainState=");
        sb2.append(list);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", tileImage=");
        sb2.append(tileImageDTO);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", isPagerIndicatorHidden=");
        sb2.append(z11);
        sb2.append(", multiButton=");
        sb2.append(multiButtonDTO);
        sb2.append(", topRightButtons=");
        sb2.append(list2);
        sb2.append(", compactFavoriteIcon=");
        sb2.append(bool);
        sb2.append(", onboarding=");
        sb2.append(onboarding);
        sb2.append(", brandLogo=");
        sb2.append(brandLogo);
        sb2.append(", aspects=");
        e.i(", islandBackgroundColor=", str, ", sku=", sb2, list3);
        sb2.append(l11);
        sb2.append(", kebab=");
        sb2.append(kebabDTO);
        sb2.append(", rating=");
        sb2.append(ugcRatingMolecule);
        sb2.append(", isTextTagSupported=");
        sb2.append(bool2);
        sb2.append(", countButton=");
        sb2.append(countButtonDTO);
        sb2.append(", id=");
        sb2.append(str2);
        sb2.append(", topRightButtonsAnimationEnabled=");
        return g.d(sb2, bool3, ")");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TileGrid2ItemDTO(java.util.List r23, java.util.Map r24, ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileImageDTO r25, ru.ozon.uni.atoms.data.AtomActionDTO r26, boolean r27, ru.ozon.app.android.storefront.data.tiles.tilegrid2.MultiButtonDTO r28, java.util.List r29, java.lang.Boolean r30, ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTO.Onboarding r31, ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTO.BrandLogo r32, java.util.List r33, java.lang.String r34, java.lang.Long r35, ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTO.KebabDTO r36, ru.ozon.app.android.pdp.common.ugc.data.ugcratingmolecule.UgcRatingMolecule r37, java.lang.Boolean r38, ru.ozon.app.android.storefront.data.tiles.countbutton.CountButtonDTO r39, java.lang.String r40, java.lang.Boolean r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
            r22 = this;
            r0 = r42
            r1 = r0 & 16
            if (r1 == 0) goto L9
            r1 = 0
            r7 = r1
            goto Lb
        L9:
            r7 = r27
        Lb:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L13
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r10 = r1
            goto L15
        L13:
            r10 = r30
        L15:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            r2 = 0
            if (r1 == 0) goto L1c
            r15 = r2
            goto L1e
        L1c:
            r15 = r35
        L1e:
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L46
            r20 = r2
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r8 = r28
            r9 = r29
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r21 = r41
            r2 = r22
            goto L68
        L46:
            r20 = r40
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r8 = r28
            r9 = r29
            r11 = r31
            r12 = r32
            r13 = r33
            r14 = r34
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r21 = r41
        L68:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTO.<init>(java.util.List, java.util.Map, ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileImageDTO, ru.ozon.uni.atoms.data.AtomActionDTO, boolean, ru.ozon.app.android.storefront.data.tiles.tilegrid2.MultiButtonDTO, java.util.List, java.lang.Boolean, ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTO$Onboarding, ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTO$BrandLogo, java.util.List, java.lang.String, java.lang.Long, ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileGrid2ItemDTO$KebabDTO, ru.ozon.app.android.pdp.common.ugc.data.ugcratingmolecule.UgcRatingMolecule, java.lang.Boolean, ru.ozon.app.android.storefront.data.tiles.countbutton.CountButtonDTO, java.lang.String, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
