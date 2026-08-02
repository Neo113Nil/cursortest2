package ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.data;

import B3.p;
import B90.C2616s;
import G.g;
import GR.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.labelList.LabelListAtom;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.FreshFavoriteMoleculeDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTextPair.data.FreshTextPairDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileType;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.data.ProductActionBarDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.data.ProductMediaDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001?B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\t\u00102\u001a\u00020\fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0017\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0091\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006@"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/data/FreshTileDTO;", "", "productMedia", "Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/data/ProductMediaDTO;", "actionBar", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO;", "innerAtoms", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "badges", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "paddings", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/data/FreshTileDTO$PaddingsDTO;", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "type", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileType;", "favoriteIcon", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeDTO;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/data/ProductMediaDTO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO;Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/data/FreshTileDTO$PaddingsDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileType;Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeDTO;Lru/ozon/uni/atoms/data/TestInfo;)V", "getProductMedia", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productMedia/data/ProductMediaDTO;", "getActionBar", "()Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO;", "getInnerAtoms", "()Ljava/util/List;", "getBadges", "getPaddings", "()Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/data/FreshTileDTO$PaddingsDTO;", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getType", "()Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileType;", "getFavoriteIcon", "()Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeDTO;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "PaddingsDTO", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FreshTileDTO {
    private final ProductActionBarDTO actionBar;

    @NotNull
    private final List<BadgeDTO> badges;
    private final AtomActionDTO clickAction;
    private final FreshFavoriteMoleculeDTO favoriteIcon;

    @NotNull
    private final List<AtomDTO> innerAtoms;

    @NotNull
    private final PaddingsDTO paddings;

    @NotNull
    private final ProductMediaDTO productMedia;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final FreshTileType type;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/data/FreshTileDTO$PaddingsDTO;", "", "top", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottom", "left", "right", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTop", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottom", "getLeft", "getRight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingsDTO {

        @NotNull
        private final Paddings bottom;

        @NotNull
        private final Paddings left;

        @NotNull
        private final Paddings right;

        @NotNull
        private final Paddings top;

        public PaddingsDTO() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ PaddingsDTO copy$default(PaddingsDTO paddingsDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = paddingsDTO.top;
            }
            if ((i11 & 2) != 0) {
                paddings2 = paddingsDTO.bottom;
            }
            if ((i11 & 4) != 0) {
                paddings3 = paddingsDTO.left;
            }
            if ((i11 & 8) != 0) {
                paddings4 = paddingsDTO.right;
            }
            return paddingsDTO.copy(paddings, paddings2, paddings3, paddings4);
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
        public final Paddings getLeft() {
            return this.left;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getRight() {
            return this.right;
        }

        @NotNull
        public final PaddingsDTO copy(@NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings left, @NotNull Paddings right) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            return new PaddingsDTO(top, bottom, left, right);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingsDTO)) {
                return false;
            }
            PaddingsDTO paddingsDTO = (PaddingsDTO) other;
            return this.top == paddingsDTO.top && this.bottom == paddingsDTO.bottom && this.left == paddingsDTO.left && this.right == paddingsDTO.right;
        }

        @NotNull
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final Paddings getLeft() {
            return this.left;
        }

        @NotNull
        public final Paddings getRight() {
            return this.right;
        }

        @NotNull
        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            return this.right.hashCode() + b.b(this.left, b.b(this.bottom, this.top.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.top;
            Paddings paddings2 = this.bottom;
            return b.e(p.b("PaddingsDTO(top=", paddings, ", bottom=", paddings2, ", left="), this.left, ", right=", this.right, ")");
        }

        public PaddingsDTO(@NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings left, @NotNull Paddings right) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            this.top = top;
            this.bottom = bottom;
            this.left = left;
            this.right = right;
        }

        public /* synthetic */ PaddingsDTO(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Paddings.PADDING_100 : paddings, (i11 & 2) != 0 ? Paddings.PADDING_100 : paddings2, (i11 & 4) != 0 ? Paddings.PADDING_100 : paddings3, (i11 & 8) != 0 ? Paddings.PADDING_100 : paddings4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FreshTileDTO(@NotNull ProductMediaDTO productMedia, ProductActionBarDTO productActionBarDTO, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "textAtom", type = TextDTO.class), @ProtoOneOfSignature(name = "labelList", type = LabelListAtom.class), @ProtoOneOfSignature(name = "price", type = PriceDTO.class), @ProtoOneOfSignature(name = "textPair", type = FreshTextPairDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends AtomDTO> innerAtoms, @NotNull List<BadgeDTO> badges, @NotNull PaddingsDTO paddings, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, FreshTileType freshTileType, FreshFavoriteMoleculeDTO freshFavoriteMoleculeDTO, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(productMedia, "productMedia");
        Intrinsics.checkNotNullParameter(innerAtoms, "innerAtoms");
        Intrinsics.checkNotNullParameter(badges, "badges");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.productMedia = productMedia;
        this.actionBar = productActionBarDTO;
        this.innerAtoms = innerAtoms;
        this.badges = badges;
        this.paddings = paddings;
        this.clickAction = atomActionDTO;
        this.trackingInfo = map;
        this.type = freshTileType;
        this.favoriteIcon = freshFavoriteMoleculeDTO;
        this.testInfo = testInfo;
    }

    public static /* synthetic */ FreshTileDTO copy$default(FreshTileDTO freshTileDTO, ProductMediaDTO productMediaDTO, ProductActionBarDTO productActionBarDTO, List list, List list2, PaddingsDTO paddingsDTO, AtomActionDTO atomActionDTO, Map map, FreshTileType freshTileType, FreshFavoriteMoleculeDTO freshFavoriteMoleculeDTO, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            productMediaDTO = freshTileDTO.productMedia;
        }
        if ((i11 & 2) != 0) {
            productActionBarDTO = freshTileDTO.actionBar;
        }
        if ((i11 & 4) != 0) {
            list = freshTileDTO.innerAtoms;
        }
        if ((i11 & 8) != 0) {
            list2 = freshTileDTO.badges;
        }
        if ((i11 & 16) != 0) {
            paddingsDTO = freshTileDTO.paddings;
        }
        if ((i11 & 32) != 0) {
            atomActionDTO = freshTileDTO.clickAction;
        }
        if ((i11 & 64) != 0) {
            map = freshTileDTO.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            freshTileType = freshTileDTO.type;
        }
        if ((i11 & 256) != 0) {
            freshFavoriteMoleculeDTO = freshTileDTO.favoriteIcon;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            testInfo = freshTileDTO.testInfo;
        }
        FreshFavoriteMoleculeDTO freshFavoriteMoleculeDTO2 = freshFavoriteMoleculeDTO;
        TestInfo testInfo2 = testInfo;
        Map map2 = map;
        FreshTileType freshTileType2 = freshTileType;
        PaddingsDTO paddingsDTO2 = paddingsDTO;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        return freshTileDTO.copy(productMediaDTO, productActionBarDTO, list, list2, paddingsDTO2, atomActionDTO2, map2, freshTileType2, freshFavoriteMoleculeDTO2, testInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ProductMediaDTO getProductMedia() {
        return this.productMedia;
    }

    /* renamed from: component10, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final ProductActionBarDTO getActionBar() {
        return this.actionBar;
    }

    @NotNull
    public final List<AtomDTO> component3() {
        return this.innerAtoms;
    }

    @NotNull
    public final List<BadgeDTO> component4() {
        return this.badges;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final PaddingsDTO getPaddings() {
        return this.paddings;
    }

    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getClickAction() {
        return this.clickAction;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    /* renamed from: component8, reason: from getter */
    public final FreshTileType getType() {
        return this.type;
    }

    /* renamed from: component9, reason: from getter */
    public final FreshFavoriteMoleculeDTO getFavoriteIcon() {
        return this.favoriteIcon;
    }

    @NotNull
    public final FreshTileDTO copy(@NotNull ProductMediaDTO productMedia, ProductActionBarDTO actionBar, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "textAtom", type = TextDTO.class), @ProtoOneOfSignature(name = "labelList", type = LabelListAtom.class), @ProtoOneOfSignature(name = "price", type = PriceDTO.class), @ProtoOneOfSignature(name = "textPair", type = FreshTextPairDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends AtomDTO> innerAtoms, @NotNull List<BadgeDTO> badges, @NotNull PaddingsDTO paddings, AtomActionDTO clickAction, Map<String, TokenizedTrackingInfo> trackingInfo, FreshTileType type, FreshFavoriteMoleculeDTO favoriteIcon, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(productMedia, "productMedia");
        Intrinsics.checkNotNullParameter(innerAtoms, "innerAtoms");
        Intrinsics.checkNotNullParameter(badges, "badges");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new FreshTileDTO(productMedia, actionBar, innerAtoms, badges, paddings, clickAction, trackingInfo, type, favoriteIcon, testInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FreshTileDTO)) {
            return false;
        }
        FreshTileDTO freshTileDTO = (FreshTileDTO) other;
        return Intrinsics.d(this.productMedia, freshTileDTO.productMedia) && Intrinsics.d(this.actionBar, freshTileDTO.actionBar) && Intrinsics.d(this.innerAtoms, freshTileDTO.innerAtoms) && Intrinsics.d(this.badges, freshTileDTO.badges) && Intrinsics.d(this.paddings, freshTileDTO.paddings) && Intrinsics.d(this.clickAction, freshTileDTO.clickAction) && Intrinsics.d(this.trackingInfo, freshTileDTO.trackingInfo) && this.type == freshTileDTO.type && Intrinsics.d(this.favoriteIcon, freshTileDTO.favoriteIcon) && Intrinsics.d(this.testInfo, freshTileDTO.testInfo);
    }

    public final ProductActionBarDTO getActionBar() {
        return this.actionBar;
    }

    @NotNull
    public final List<BadgeDTO> getBadges() {
        return this.badges;
    }

    public final AtomActionDTO getClickAction() {
        return this.clickAction;
    }

    public final FreshFavoriteMoleculeDTO getFavoriteIcon() {
        return this.favoriteIcon;
    }

    @NotNull
    public final List<AtomDTO> getInnerAtoms() {
        return this.innerAtoms;
    }

    @NotNull
    public final PaddingsDTO getPaddings() {
        return this.paddings;
    }

    @NotNull
    public final ProductMediaDTO getProductMedia() {
        return this.productMedia;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final FreshTileType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.productMedia.hashCode() * 31;
        ProductActionBarDTO productActionBarDTO = this.actionBar;
        int hashCode2 = (this.paddings.hashCode() + g.b(g.b((hashCode + (productActionBarDTO == null ? 0 : productActionBarDTO.hashCode())) * 31, 31, this.innerAtoms), 31, this.badges)) * 31;
        AtomActionDTO atomActionDTO = this.clickAction;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        FreshTileType freshTileType = this.type;
        int hashCode5 = (hashCode4 + (freshTileType == null ? 0 : freshTileType.hashCode())) * 31;
        FreshFavoriteMoleculeDTO freshFavoriteMoleculeDTO = this.favoriteIcon;
        int hashCode6 = (hashCode5 + (freshFavoriteMoleculeDTO == null ? 0 : freshFavoriteMoleculeDTO.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode6 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ProductMediaDTO productMediaDTO = this.productMedia;
        ProductActionBarDTO productActionBarDTO = this.actionBar;
        List<AtomDTO> list = this.innerAtoms;
        List<BadgeDTO> list2 = this.badges;
        PaddingsDTO paddingsDTO = this.paddings;
        AtomActionDTO atomActionDTO = this.clickAction;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        FreshTileType freshTileType = this.type;
        FreshFavoriteMoleculeDTO freshFavoriteMoleculeDTO = this.favoriteIcon;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("FreshTileDTO(productMedia=");
        sb2.append(productMediaDTO);
        sb2.append(", actionBar=");
        sb2.append(productActionBarDTO);
        sb2.append(", innerAtoms=");
        C2616s.g(", badges=", ", paddings=", sb2, list, list2);
        sb2.append(paddingsDTO);
        sb2.append(", clickAction=");
        sb2.append(atomActionDTO);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", type=");
        sb2.append(freshTileType);
        sb2.append(", favoriteIcon=");
        sb2.append(freshFavoriteMoleculeDTO);
        sb2.append(", testInfo=");
        sb2.append(testInfo);
        sb2.append(")");
        return sb2.toString();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public FreshTileDTO(ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.data.ProductMediaDTO r15, ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.data.ProductActionBarDTO r16, java.util.List r17, java.util.List r18, ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.data.FreshTileDTO.PaddingsDTO r19, ru.ozon.uni.atoms.data.AtomActionDTO r20, java.util.Map r21, ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileType r22, ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.FreshFavoriteMoleculeDTO r23, ru.ozon.uni.atoms.data.TestInfo r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 4
            if (r1 == 0) goto La
            kotlin.collections.K r1 = kotlin.collections.K.f71697a
            r5 = r1
            goto Lc
        La:
            r5 = r17
        Lc:
            r1 = r0 & 8
            if (r1 == 0) goto L14
            kotlin.collections.K r1 = kotlin.collections.K.f71697a
            r6 = r1
            goto L16
        L14:
            r6 = r18
        L16:
            r1 = r0 & 16
            if (r1 == 0) goto L27
            ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.data.FreshTileDTO$PaddingsDTO r7 = new ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.data.FreshTileDTO$PaddingsDTO
            r12 = 15
            r13 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            goto L29
        L27:
            r7 = r19
        L29:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L30
            r8 = r2
            goto L32
        L30:
            r8 = r20
        L32:
            r1 = r0 & 64
            if (r1 == 0) goto L38
            r9 = r2
            goto L3a
        L38:
            r9 = r21
        L3a:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L40
            r10 = r2
            goto L42
        L40:
            r10 = r22
        L42:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L4e
            r11 = r2
            r3 = r15
            r4 = r16
            r12 = r24
            r2 = r14
            goto L56
        L4e:
            r11 = r23
            r2 = r14
            r3 = r15
            r4 = r16
            r12 = r24
        L56:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.data.FreshTileDTO.<init>(ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.data.ProductMediaDTO, ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.data.ProductActionBarDTO, java.util.List, java.util.List, ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.data.FreshTileDTO$PaddingsDTO, ru.ozon.uni.atoms.data.AtomActionDTO, java.util.Map, ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileType, ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.FreshFavoriteMoleculeDTO, ru.ozon.uni.atoms.data.TestInfo, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
