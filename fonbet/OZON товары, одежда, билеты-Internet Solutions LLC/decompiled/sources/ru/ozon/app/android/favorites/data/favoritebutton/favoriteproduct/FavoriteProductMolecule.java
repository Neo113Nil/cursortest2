package ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct;

import J0.C3349u1;
import Kk.C3532b;
import Pk0.c;
import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002/0BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001eJZ\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u000eHÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001e¨\u00061"}, d2 = {"Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteMoleculeModel;", "theme", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule$ThemeType;", "sku", "", "isFavorite", "", "favoriteButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "unfavoriteButton", "addToListAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "changeSourceId", "", "<init>", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule$ThemeType;JZLru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Integer;)V", "getTheme", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule$ThemeType;", "getSku", "()J", "()Z", "setFavorite", "(Z)V", "getFavoriteButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getUnfavoriteButton", "getAddToListAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getChangeSourceId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule$ThemeType;JZLru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/Integer;)Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "equals", "other", "", "hashCode", "toString", "", "Companion", "ThemeType", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class FavoriteProductMolecule implements FavoriteMoleculeModel {

    @NotNull
    public static final String IS_ADULT_PARAMS_NAME = "isAdult";

    @NotNull
    public static final String SKU_PARAMS_ID = "sku";
    private final AtomActionDTO addToListAction;
    private final Integer changeSourceId;

    @NotNull
    private final ButtonV3Atom.SmallIconButton favoriteButton;
    private boolean isFavorite;
    private final long sku;
    private final ThemeType theme;

    @NotNull
    private final ButtonV3Atom.SmallIconButton unfavoriteButton;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule$ThemeType;", "", "<init>", "(Ljava/lang/String;I)V", "THEME_TYPE_ICON_SMALL", "THEME_TYPE_ICON_SMALL_WITH_TEXT", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ThemeType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ThemeType[] $VALUES;
        public static final ThemeType THEME_TYPE_ICON_SMALL = new ThemeType("THEME_TYPE_ICON_SMALL", 0);
        public static final ThemeType THEME_TYPE_ICON_SMALL_WITH_TEXT = new ThemeType("THEME_TYPE_ICON_SMALL_WITH_TEXT", 1);

        private static final /* synthetic */ ThemeType[] $values() {
            return new ThemeType[]{THEME_TYPE_ICON_SMALL, THEME_TYPE_ICON_SMALL_WITH_TEXT};
        }

        static {
            ThemeType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ThemeType(String str, int i11) {
        }

        public static ThemeType valueOf(String str) {
            return (ThemeType) Enum.valueOf(ThemeType.class, str);
        }

        public static ThemeType[] values() {
            return (ThemeType[]) $VALUES.clone();
        }
    }

    public FavoriteProductMolecule(ThemeType themeType, long j11, boolean z11, @NotNull ButtonV3Atom.SmallIconButton favoriteButton, @NotNull ButtonV3Atom.SmallIconButton unfavoriteButton, AtomActionDTO atomActionDTO, Integer num) {
        Intrinsics.checkNotNullParameter(favoriteButton, "favoriteButton");
        Intrinsics.checkNotNullParameter(unfavoriteButton, "unfavoriteButton");
        this.theme = themeType;
        this.sku = j11;
        this.isFavorite = z11;
        this.favoriteButton = favoriteButton;
        this.unfavoriteButton = unfavoriteButton;
        this.addToListAction = atomActionDTO;
        this.changeSourceId = num;
    }

    public static /* synthetic */ FavoriteProductMolecule copy$default(FavoriteProductMolecule favoriteProductMolecule, ThemeType themeType, long j11, boolean z11, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallIconButton smallIconButton2, AtomActionDTO atomActionDTO, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            themeType = favoriteProductMolecule.theme;
        }
        if ((i11 & 2) != 0) {
            j11 = favoriteProductMolecule.sku;
        }
        if ((i11 & 4) != 0) {
            z11 = favoriteProductMolecule.isFavorite;
        }
        if ((i11 & 8) != 0) {
            smallIconButton = favoriteProductMolecule.favoriteButton;
        }
        if ((i11 & 16) != 0) {
            smallIconButton2 = favoriteProductMolecule.unfavoriteButton;
        }
        if ((i11 & 32) != 0) {
            atomActionDTO = favoriteProductMolecule.addToListAction;
        }
        if ((i11 & 64) != 0) {
            num = favoriteProductMolecule.changeSourceId;
        }
        Integer num2 = num;
        ButtonV3Atom.SmallIconButton smallIconButton3 = smallIconButton2;
        boolean z12 = z11;
        return favoriteProductMolecule.copy(themeType, j11, z12, smallIconButton, smallIconButton3, atomActionDTO, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final ThemeType getTheme() {
        return this.theme;
    }

    /* renamed from: component2, reason: from getter */
    public final long getSku() {
        return this.sku;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getFavoriteButton() {
        return this.favoriteButton;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getUnfavoriteButton() {
        return this.unfavoriteButton;
    }

    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getAddToListAction() {
        return this.addToListAction;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getChangeSourceId() {
        return this.changeSourceId;
    }

    @NotNull
    public final FavoriteProductMolecule copy(ThemeType theme, long sku, boolean isFavorite, @NotNull ButtonV3Atom.SmallIconButton favoriteButton, @NotNull ButtonV3Atom.SmallIconButton unfavoriteButton, AtomActionDTO addToListAction, Integer changeSourceId) {
        Intrinsics.checkNotNullParameter(favoriteButton, "favoriteButton");
        Intrinsics.checkNotNullParameter(unfavoriteButton, "unfavoriteButton");
        return new FavoriteProductMolecule(theme, sku, isFavorite, favoriteButton, unfavoriteButton, addToListAction, changeSourceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteProductMolecule)) {
            return false;
        }
        FavoriteProductMolecule favoriteProductMolecule = (FavoriteProductMolecule) other;
        return this.theme == favoriteProductMolecule.theme && this.sku == favoriteProductMolecule.sku && this.isFavorite == favoriteProductMolecule.isFavorite && Intrinsics.d(this.favoriteButton, favoriteProductMolecule.favoriteButton) && Intrinsics.d(this.unfavoriteButton, favoriteProductMolecule.unfavoriteButton) && Intrinsics.d(this.addToListAction, favoriteProductMolecule.addToListAction) && Intrinsics.d(this.changeSourceId, favoriteProductMolecule.changeSourceId);
    }

    public final AtomActionDTO getAddToListAction() {
        return this.addToListAction;
    }

    public final Integer getChangeSourceId() {
        return this.changeSourceId;
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getFavoriteButton() {
        return this.favoriteButton;
    }

    public final long getSku() {
        return this.sku;
    }

    public final ThemeType getTheme() {
        return this.theme;
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getUnfavoriteButton() {
        return this.unfavoriteButton;
    }

    public int hashCode() {
        ThemeType themeType = this.theme;
        int d11 = C3349u1.d(this.unfavoriteButton, C3349u1.d(this.favoriteButton, C3532b.a(c.a((themeType == null ? 0 : themeType.hashCode()) * 31, 31, this.sku), 31, this.isFavorite), 31), 31);
        AtomActionDTO atomActionDTO = this.addToListAction;
        int hashCode = (d11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Integer num = this.changeSourceId;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public final void setFavorite(boolean z11) {
        this.isFavorite = z11;
    }

    @NotNull
    public String toString() {
        return "FavoriteProductMolecule(theme=" + this.theme + ", sku=" + this.sku + ", isFavorite=" + this.isFavorite + ", favoriteButton=" + this.favoriteButton + ", unfavoriteButton=" + this.unfavoriteButton + ", addToListAction=" + this.addToListAction + ", changeSourceId=" + this.changeSourceId + ")";
    }

    public /* synthetic */ FavoriteProductMolecule(ThemeType themeType, long j11, boolean z11, ButtonV3Atom.SmallIconButton smallIconButton, ButtonV3Atom.SmallIconButton smallIconButton2, AtomActionDTO atomActionDTO, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? ThemeType.THEME_TYPE_ICON_SMALL : themeType, j11, z11, smallIconButton, smallIconButton2, atomActionDTO, (i11 & 64) != 0 ? null : num);
    }
}
