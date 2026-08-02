package ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton;

import Bl.b;
import Kk.C3532b;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeDTO;", "", "sku", "", "isFavorite", "", "favoriteButton", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeDTO$ButtonInfoDTO;", "unfavoriteButton", "<init>", "(JZLru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeDTO$ButtonInfoDTO;Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeDTO$ButtonInfoDTO;)V", "getSku", "()J", "()Z", "getFavoriteButton", "()Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeDTO$ButtonInfoDTO;", "getUnfavoriteButton", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "ButtonInfoDTO", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FreshFavoriteMoleculeDTO {

    @NotNull
    private final ButtonInfoDTO favoriteButton;
    private final boolean isFavorite;
    private final long sku;

    @NotNull
    private final ButtonInfoDTO unfavoriteButton;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteMoleculeDTO$ButtonInfoDTO;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonInfoDTO {

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ButtonInfoDTO(@NotNull AtomActionDTO action, @NotNull Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
            this.action = action;
            this.trackingInfo = trackingInfo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ButtonInfoDTO copy$default(ButtonInfoDTO buttonInfoDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                atomActionDTO = buttonInfoDTO.action;
            }
            if ((i11 & 2) != 0) {
                map = buttonInfoDTO.trackingInfo;
            }
            return buttonInfoDTO.copy(atomActionDTO, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> component2() {
            return this.trackingInfo;
        }

        @NotNull
        public final ButtonInfoDTO copy(@NotNull AtomActionDTO action, @NotNull Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
            return new ButtonInfoDTO(action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonInfoDTO)) {
                return false;
            }
            ButtonInfoDTO buttonInfoDTO = (ButtonInfoDTO) other;
            return Intrinsics.d(this.action, buttonInfoDTO.action) && Intrinsics.d(this.trackingInfo, buttonInfoDTO.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            return this.trackingInfo.hashCode() + (this.action.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ButtonInfoDTO(action=" + this.action + ", trackingInfo=" + this.trackingInfo + ")";
        }
    }

    public FreshFavoriteMoleculeDTO(long j11, boolean z11, @NotNull ButtonInfoDTO favoriteButton, @NotNull ButtonInfoDTO unfavoriteButton) {
        Intrinsics.checkNotNullParameter(favoriteButton, "favoriteButton");
        Intrinsics.checkNotNullParameter(unfavoriteButton, "unfavoriteButton");
        this.sku = j11;
        this.isFavorite = z11;
        this.favoriteButton = favoriteButton;
        this.unfavoriteButton = unfavoriteButton;
    }

    public static /* synthetic */ FreshFavoriteMoleculeDTO copy$default(FreshFavoriteMoleculeDTO freshFavoriteMoleculeDTO, long j11, boolean z11, ButtonInfoDTO buttonInfoDTO, ButtonInfoDTO buttonInfoDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = freshFavoriteMoleculeDTO.sku;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            z11 = freshFavoriteMoleculeDTO.isFavorite;
        }
        boolean z12 = z11;
        if ((i11 & 4) != 0) {
            buttonInfoDTO = freshFavoriteMoleculeDTO.favoriteButton;
        }
        ButtonInfoDTO buttonInfoDTO3 = buttonInfoDTO;
        if ((i11 & 8) != 0) {
            buttonInfoDTO2 = freshFavoriteMoleculeDTO.unfavoriteButton;
        }
        return freshFavoriteMoleculeDTO.copy(j12, z12, buttonInfoDTO3, buttonInfoDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getSku() {
        return this.sku;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ButtonInfoDTO getFavoriteButton() {
        return this.favoriteButton;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonInfoDTO getUnfavoriteButton() {
        return this.unfavoriteButton;
    }

    @NotNull
    public final FreshFavoriteMoleculeDTO copy(long sku, boolean isFavorite, @NotNull ButtonInfoDTO favoriteButton, @NotNull ButtonInfoDTO unfavoriteButton) {
        Intrinsics.checkNotNullParameter(favoriteButton, "favoriteButton");
        Intrinsics.checkNotNullParameter(unfavoriteButton, "unfavoriteButton");
        return new FreshFavoriteMoleculeDTO(sku, isFavorite, favoriteButton, unfavoriteButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FreshFavoriteMoleculeDTO)) {
            return false;
        }
        FreshFavoriteMoleculeDTO freshFavoriteMoleculeDTO = (FreshFavoriteMoleculeDTO) other;
        return this.sku == freshFavoriteMoleculeDTO.sku && this.isFavorite == freshFavoriteMoleculeDTO.isFavorite && Intrinsics.d(this.favoriteButton, freshFavoriteMoleculeDTO.favoriteButton) && Intrinsics.d(this.unfavoriteButton, freshFavoriteMoleculeDTO.unfavoriteButton);
    }

    @NotNull
    public final ButtonInfoDTO getFavoriteButton() {
        return this.favoriteButton;
    }

    public final long getSku() {
        return this.sku;
    }

    @NotNull
    public final ButtonInfoDTO getUnfavoriteButton() {
        return this.unfavoriteButton;
    }

    public int hashCode() {
        return this.unfavoriteButton.hashCode() + ((this.favoriteButton.hashCode() + C3532b.a(Long.hashCode(this.sku) * 31, 31, this.isFavorite)) * 31);
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    @NotNull
    public String toString() {
        long j11 = this.sku;
        boolean z11 = this.isFavorite;
        ButtonInfoDTO buttonInfoDTO = this.favoriteButton;
        ButtonInfoDTO buttonInfoDTO2 = this.unfavoriteButton;
        StringBuilder c11 = b.c(j11, "FreshFavoriteMoleculeDTO(sku=", ", isFavorite=", z11);
        c11.append(", favoriteButton=");
        c11.append(buttonInfoDTO);
        c11.append(", unfavoriteButton=");
        c11.append(buttonInfoDTO2);
        c11.append(")");
        return c11.toString();
    }

    public /* synthetic */ FreshFavoriteMoleculeDTO(long j11, boolean z11, ButtonInfoDTO buttonInfoDTO, ButtonInfoDTO buttonInfoDTO2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, (i11 & 2) != 0 ? false : z11, buttonInfoDTO, buttonInfoDTO2);
    }
}
