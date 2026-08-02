package ru.ozon.app.android.pdp.widgets.navBar.presentation;

import B0.C2454a;
import G.g;
import Kk.C3532b;
import Nh.a;
import Pk0.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000267Bi\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000e\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0012\u000e\u0010\u0015\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b\u000b\u0010*R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b1\u0010\u0019R\u001f\u0010\u0014\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00102\u001a\u0004\b3\u00104R\u001f\u0010\u0015\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u00102\u001a\u0004\b5\u00104¨\u00068"}, d2 = {"Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$Button$NavBarButton;", "backButton", "", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$Button;", "rightButtons", "", "isAlwaysSolid", "", "opacityChangeLevel", "", "cornerRadius", "", "background", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "externalNavBarTokenizedEvent", "<init>", "(JLru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$Button$NavBarButton;Ljava/util/List;ZFILjava/lang/String;LWZ/t;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$Button$NavBarButton;", "getBackButton", "()Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$Button$NavBarButton;", "Ljava/util/List;", "getRightButtons", "()Ljava/util/List;", "Z", "()Z", "F", "getOpacityChangeLevel", "()F", "I", "getCornerRadius", "Ljava/lang/String;", "getBackground", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getExternalNavBarTokenizedEvent", "Button", "CommonBgForIcon", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class NavBarVO implements c {

    @NotNull
    private final Button.NavBarButton backButton;

    @NotNull
    private final String background;
    private final int cornerRadius;
    private final t externalNavBarTokenizedEvent;
    private final long id;
    private final boolean isAlwaysSolid;
    private final float opacityChangeLevel;
    private final List<Button> rightButtons;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$Button;", "", "<init>", "()V", "NavBarButton", "FavoriteMoleculeButtonWrapper", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$Button$FavoriteMoleculeButtonWrapper;", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$Button$NavBarButton;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Button {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJN\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\"\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b&\u0010\u0011¨\u0006'"}, d2 = {"Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$Button$FavoriteMoleculeButtonWrapper;", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$Button;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "favoriteMoleculeButton", "", "cornerRadius", "", "invisibleStateButtonBackground", "invisibleStateIconTintColor", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$CommonBgForIcon;", "commonBgForIcons", "visibleStateIconTintColor", "<init>", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;FLjava/lang/String;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$CommonBgForIcon;Ljava/lang/String;)V", "copy", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;FLjava/lang/String;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$CommonBgForIcon;Ljava/lang/String;)Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$Button$FavoriteMoleculeButtonWrapper;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "getFavoriteMoleculeButton", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "F", "getCornerRadius", "()F", "Ljava/lang/String;", "getInvisibleStateButtonBackground", "getInvisibleStateIconTintColor", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$CommonBgForIcon;", "getCommonBgForIcons", "()Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$CommonBgForIcon;", "getVisibleStateIconTintColor", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FavoriteMoleculeButtonWrapper extends Button {
            private final CommonBgForIcon commonBgForIcons;
            private final float cornerRadius;

            @NotNull
            private final FavoriteProductMolecule favoriteMoleculeButton;

            @NotNull
            private final String invisibleStateButtonBackground;

            @NotNull
            private final String invisibleStateIconTintColor;

            @NotNull
            private final String visibleStateIconTintColor;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FavoriteMoleculeButtonWrapper(@NotNull FavoriteProductMolecule favoriteMoleculeButton, float f7, @NotNull String invisibleStateButtonBackground, @NotNull String invisibleStateIconTintColor, CommonBgForIcon commonBgForIcon, @NotNull String visibleStateIconTintColor) {
                super(null);
                Intrinsics.checkNotNullParameter(favoriteMoleculeButton, "favoriteMoleculeButton");
                Intrinsics.checkNotNullParameter(invisibleStateButtonBackground, "invisibleStateButtonBackground");
                Intrinsics.checkNotNullParameter(invisibleStateIconTintColor, "invisibleStateIconTintColor");
                Intrinsics.checkNotNullParameter(visibleStateIconTintColor, "visibleStateIconTintColor");
                this.favoriteMoleculeButton = favoriteMoleculeButton;
                this.cornerRadius = f7;
                this.invisibleStateButtonBackground = invisibleStateButtonBackground;
                this.invisibleStateIconTintColor = invisibleStateIconTintColor;
                this.commonBgForIcons = commonBgForIcon;
                this.visibleStateIconTintColor = visibleStateIconTintColor;
            }

            public static /* synthetic */ FavoriteMoleculeButtonWrapper copy$default(FavoriteMoleculeButtonWrapper favoriteMoleculeButtonWrapper, FavoriteProductMolecule favoriteProductMolecule, float f7, String str, String str2, CommonBgForIcon commonBgForIcon, String str3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    favoriteProductMolecule = favoriteMoleculeButtonWrapper.favoriteMoleculeButton;
                }
                if ((i11 & 2) != 0) {
                    f7 = favoriteMoleculeButtonWrapper.cornerRadius;
                }
                if ((i11 & 4) != 0) {
                    str = favoriteMoleculeButtonWrapper.invisibleStateButtonBackground;
                }
                if ((i11 & 8) != 0) {
                    str2 = favoriteMoleculeButtonWrapper.invisibleStateIconTintColor;
                }
                if ((i11 & 16) != 0) {
                    commonBgForIcon = favoriteMoleculeButtonWrapper.commonBgForIcons;
                }
                if ((i11 & 32) != 0) {
                    str3 = favoriteMoleculeButtonWrapper.visibleStateIconTintColor;
                }
                CommonBgForIcon commonBgForIcon2 = commonBgForIcon;
                String str4 = str3;
                return favoriteMoleculeButtonWrapper.copy(favoriteProductMolecule, f7, str, str2, commonBgForIcon2, str4);
            }

            @NotNull
            public final FavoriteMoleculeButtonWrapper copy(@NotNull FavoriteProductMolecule favoriteMoleculeButton, float cornerRadius, @NotNull String invisibleStateButtonBackground, @NotNull String invisibleStateIconTintColor, CommonBgForIcon commonBgForIcons, @NotNull String visibleStateIconTintColor) {
                Intrinsics.checkNotNullParameter(favoriteMoleculeButton, "favoriteMoleculeButton");
                Intrinsics.checkNotNullParameter(invisibleStateButtonBackground, "invisibleStateButtonBackground");
                Intrinsics.checkNotNullParameter(invisibleStateIconTintColor, "invisibleStateIconTintColor");
                Intrinsics.checkNotNullParameter(visibleStateIconTintColor, "visibleStateIconTintColor");
                return new FavoriteMoleculeButtonWrapper(favoriteMoleculeButton, cornerRadius, invisibleStateButtonBackground, invisibleStateIconTintColor, commonBgForIcons, visibleStateIconTintColor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FavoriteMoleculeButtonWrapper)) {
                    return false;
                }
                FavoriteMoleculeButtonWrapper favoriteMoleculeButtonWrapper = (FavoriteMoleculeButtonWrapper) other;
                return Intrinsics.d(this.favoriteMoleculeButton, favoriteMoleculeButtonWrapper.favoriteMoleculeButton) && Float.compare(this.cornerRadius, favoriteMoleculeButtonWrapper.cornerRadius) == 0 && Intrinsics.d(this.invisibleStateButtonBackground, favoriteMoleculeButtonWrapper.invisibleStateButtonBackground) && Intrinsics.d(this.invisibleStateIconTintColor, favoriteMoleculeButtonWrapper.invisibleStateIconTintColor) && Intrinsics.d(this.commonBgForIcons, favoriteMoleculeButtonWrapper.commonBgForIcons) && Intrinsics.d(this.visibleStateIconTintColor, favoriteMoleculeButtonWrapper.visibleStateIconTintColor);
            }

            public CommonBgForIcon getCommonBgForIcons() {
                return this.commonBgForIcons;
            }

            public float getCornerRadius() {
                return this.cornerRadius;
            }

            @NotNull
            public final FavoriteProductMolecule getFavoriteMoleculeButton() {
                return this.favoriteMoleculeButton;
            }

            @NotNull
            public String getInvisibleStateButtonBackground() {
                return this.invisibleStateButtonBackground;
            }

            @NotNull
            public String getInvisibleStateIconTintColor() {
                return this.invisibleStateIconTintColor;
            }

            @NotNull
            public String getVisibleStateIconTintColor() {
                return this.visibleStateIconTintColor;
            }

            public int hashCode() {
                int a11 = g.a(g.a(b.a(this.cornerRadius, this.favoriteMoleculeButton.hashCode() * 31, 31), 31, this.invisibleStateButtonBackground), 31, this.invisibleStateIconTintColor);
                CommonBgForIcon commonBgForIcon = this.commonBgForIcons;
                return this.visibleStateIconTintColor.hashCode() + ((a11 + (commonBgForIcon == null ? 0 : commonBgForIcon.hashCode())) * 31);
            }

            @NotNull
            public String toString() {
                FavoriteProductMolecule favoriteProductMolecule = this.favoriteMoleculeButton;
                float f7 = this.cornerRadius;
                String str = this.invisibleStateButtonBackground;
                String str2 = this.invisibleStateIconTintColor;
                CommonBgForIcon commonBgForIcon = this.commonBgForIcons;
                String str3 = this.visibleStateIconTintColor;
                StringBuilder sb2 = new StringBuilder("FavoriteMoleculeButtonWrapper(favoriteMoleculeButton=");
                sb2.append(favoriteProductMolecule);
                sb2.append(", cornerRadius=");
                sb2.append(f7);
                sb2.append(", invisibleStateButtonBackground=");
                a.h(sb2, str, ", invisibleStateIconTintColor=", str2, ", commonBgForIcons=");
                sb2.append(commonBgForIcon);
                sb2.append(", visibleStateIconTintColor=");
                sb2.append(str3);
                sb2.append(")");
                return sb2.toString();
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001e\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b \u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$Button$NavBarButton;", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$Button;", "", "icon", "", "cornerRadius", "invisibleStateButtonBackground", "invisibleStateIconTintColor", "visibleStateIconTintColor", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$CommonBgForIcon;", "commonBgForIcons", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$CommonBgForIcon;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "F", "getCornerRadius", "()F", "getInvisibleStateButtonBackground", "getInvisibleStateIconTintColor", "getVisibleStateIconTintColor", "Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$CommonBgForIcon;", "getCommonBgForIcons", "()Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$CommonBgForIcon;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NavBarButton extends Button {
            public static final int $stable = AtomAction.$stable;
            private final AtomAction action;
            private final CommonBgForIcon commonBgForIcons;
            private final float cornerRadius;

            @NotNull
            private final String icon;

            @NotNull
            private final String invisibleStateButtonBackground;

            @NotNull
            private final String invisibleStateIconTintColor;

            @NotNull
            private final String visibleStateIconTintColor;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NavBarButton(@NotNull String icon, float f7, @NotNull String invisibleStateButtonBackground, @NotNull String invisibleStateIconTintColor, @NotNull String visibleStateIconTintColor, CommonBgForIcon commonBgForIcon, AtomAction atomAction) {
                super(null);
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(invisibleStateButtonBackground, "invisibleStateButtonBackground");
                Intrinsics.checkNotNullParameter(invisibleStateIconTintColor, "invisibleStateIconTintColor");
                Intrinsics.checkNotNullParameter(visibleStateIconTintColor, "visibleStateIconTintColor");
                this.icon = icon;
                this.cornerRadius = f7;
                this.invisibleStateButtonBackground = invisibleStateButtonBackground;
                this.invisibleStateIconTintColor = invisibleStateIconTintColor;
                this.visibleStateIconTintColor = visibleStateIconTintColor;
                this.commonBgForIcons = commonBgForIcon;
                this.action = atomAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NavBarButton)) {
                    return false;
                }
                NavBarButton navBarButton = (NavBarButton) other;
                return Intrinsics.d(this.icon, navBarButton.icon) && Float.compare(this.cornerRadius, navBarButton.cornerRadius) == 0 && Intrinsics.d(this.invisibleStateButtonBackground, navBarButton.invisibleStateButtonBackground) && Intrinsics.d(this.invisibleStateIconTintColor, navBarButton.invisibleStateIconTintColor) && Intrinsics.d(this.visibleStateIconTintColor, navBarButton.visibleStateIconTintColor) && Intrinsics.d(this.commonBgForIcons, navBarButton.commonBgForIcons) && Intrinsics.d(this.action, navBarButton.action);
            }

            public final AtomAction getAction() {
                return this.action;
            }

            public CommonBgForIcon getCommonBgForIcons() {
                return this.commonBgForIcons;
            }

            public float getCornerRadius() {
                return this.cornerRadius;
            }

            @NotNull
            public final String getIcon() {
                return this.icon;
            }

            @NotNull
            public String getInvisibleStateButtonBackground() {
                return this.invisibleStateButtonBackground;
            }

            @NotNull
            public String getInvisibleStateIconTintColor() {
                return this.invisibleStateIconTintColor;
            }

            @NotNull
            public String getVisibleStateIconTintColor() {
                return this.visibleStateIconTintColor;
            }

            public int hashCode() {
                int a11 = g.a(g.a(g.a(b.a(this.cornerRadius, this.icon.hashCode() * 31, 31), 31, this.invisibleStateButtonBackground), 31, this.invisibleStateIconTintColor), 31, this.visibleStateIconTintColor);
                CommonBgForIcon commonBgForIcon = this.commonBgForIcons;
                int hashCode = (a11 + (commonBgForIcon == null ? 0 : commonBgForIcon.hashCode())) * 31;
                AtomAction atomAction = this.action;
                return hashCode + (atomAction != null ? atomAction.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.icon;
                float f7 = this.cornerRadius;
                String str2 = this.invisibleStateButtonBackground;
                String str3 = this.invisibleStateIconTintColor;
                String str4 = this.visibleStateIconTintColor;
                CommonBgForIcon commonBgForIcon = this.commonBgForIcons;
                AtomAction atomAction = this.action;
                StringBuilder sb2 = new StringBuilder("NavBarButton(icon=");
                sb2.append(str);
                sb2.append(", cornerRadius=");
                sb2.append(f7);
                sb2.append(", invisibleStateButtonBackground=");
                a.h(sb2, str2, ", invisibleStateIconTintColor=", str3, ", visibleStateIconTintColor=");
                sb2.append(str4);
                sb2.append(", commonBgForIcons=");
                sb2.append(commonBgForIcon);
                sb2.append(", action=");
                return B6.b.b(sb2, atomAction, ")");
            }
        }

        public /* synthetic */ Button(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Button() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0004\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/navBar/presentation/NavBarVO$CommonBgForIcon;", "", "", "isFirstButton", "isLastButton", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CommonBgForIcon {
        private final boolean isFirstButton;
        private final boolean isLastButton;

        public CommonBgForIcon(boolean z11, boolean z12) {
            this.isFirstButton = z11;
            this.isLastButton = z12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommonBgForIcon)) {
                return false;
            }
            CommonBgForIcon commonBgForIcon = (CommonBgForIcon) other;
            return this.isFirstButton == commonBgForIcon.isFirstButton && this.isLastButton == commonBgForIcon.isLastButton;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLastButton) + (Boolean.hashCode(this.isFirstButton) * 31);
        }

        /* renamed from: isFirstButton, reason: from getter */
        public final boolean getIsFirstButton() {
            return this.isFirstButton;
        }

        /* renamed from: isLastButton, reason: from getter */
        public final boolean getIsLastButton() {
            return this.isLastButton;
        }

        @NotNull
        public String toString() {
            return Ef0.c.c("CommonBgForIcon(isFirstButton=", ", isLastButton=", ")", this.isFirstButton, this.isLastButton);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NavBarVO(long j11, @NotNull Button.NavBarButton backButton, List<? extends Button> list, boolean z11, float f7, int i11, @NotNull String background, t tVar, t tVar2) {
        Intrinsics.checkNotNullParameter(backButton, "backButton");
        Intrinsics.checkNotNullParameter(background, "background");
        this.id = j11;
        this.backButton = backButton;
        this.rightButtons = list;
        this.isAlwaysSolid = z11;
        this.opacityChangeLevel = f7;
        this.cornerRadius = i11;
        this.background = background;
        this.tokenizedEvent = tVar;
        this.externalNavBarTokenizedEvent = tVar2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavBarVO)) {
            return false;
        }
        NavBarVO navBarVO = (NavBarVO) other;
        return this.id == navBarVO.id && Intrinsics.d(this.backButton, navBarVO.backButton) && Intrinsics.d(this.rightButtons, navBarVO.rightButtons) && this.isAlwaysSolid == navBarVO.isAlwaysSolid && Float.compare(this.opacityChangeLevel, navBarVO.opacityChangeLevel) == 0 && this.cornerRadius == navBarVO.cornerRadius && Intrinsics.d(this.background, navBarVO.background) && Intrinsics.d(this.tokenizedEvent, navBarVO.tokenizedEvent) && Intrinsics.d(this.externalNavBarTokenizedEvent, navBarVO.externalNavBarTokenizedEvent);
    }

    @NotNull
    public final Button.NavBarButton getBackButton() {
        return this.backButton;
    }

    @NotNull
    public final String getBackground() {
        return this.background;
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public final t getExternalNavBarTokenizedEvent() {
        return this.externalNavBarTokenizedEvent;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final float getOpacityChangeLevel() {
        return this.opacityChangeLevel;
    }

    public final List<Button> getRightButtons() {
        return this.rightButtons;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.backButton.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        List<Button> list = this.rightButtons;
        int a11 = g.a(C2454a.a(this.cornerRadius, b.a(this.opacityChangeLevel, C3532b.a((hashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.isAlwaysSolid), 31), 31), 31, this.background);
        t tVar = this.tokenizedEvent;
        int hashCode2 = (a11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.externalNavBarTokenizedEvent;
        return hashCode2 + (tVar2 != null ? tVar2.hashCode() : 0);
    }

    /* renamed from: isAlwaysSolid, reason: from getter */
    public final boolean getIsAlwaysSolid() {
        return this.isAlwaysSolid;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Button.NavBarButton navBarButton = this.backButton;
        List<Button> list = this.rightButtons;
        boolean z11 = this.isAlwaysSolid;
        float f7 = this.opacityChangeLevel;
        int i11 = this.cornerRadius;
        String str = this.background;
        t tVar = this.tokenizedEvent;
        t tVar2 = this.externalNavBarTokenizedEvent;
        StringBuilder sb2 = new StringBuilder("NavBarVO(id=");
        sb2.append(j11);
        sb2.append(", backButton=");
        sb2.append(navBarButton);
        AZ.c.c(sb2, ", rightButtons=", list, ", isAlwaysSolid=", z11);
        sb2.append(", opacityChangeLevel=");
        sb2.append(f7);
        sb2.append(", cornerRadius=");
        sb2.append(i11);
        Bi.a.f(sb2, ", background=", str, ", tokenizedEvent=", tVar);
        return Lh.a.b(sb2, ", externalNavBarTokenizedEvent=", tVar2, ")");
    }
}
