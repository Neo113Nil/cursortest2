package ru.ozon.app.android.storefront.widgets.navbarApparel.data;

import C.o0;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarApparel/data/NavBarApparelDTO;", "", "backButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "rightButtons", "", "prefetchDeeplink", "", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/util/List;Ljava/lang/String;)V", "getBackButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRightButtons", "()Ljava/util/List;", "getPrefetchDeeplink", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NavBarApparelDTO {

    @Deprecated
    @NotNull
    public static final String FAVORITE_MOLECULE = "favoriteMolecule";

    @Deprecated
    @NotNull
    public static final String ICON_BUTTON = "iconButton";
    private final IconButtonV3DTO backButton;
    private final String prefetchDeeplink;
    private final List<Object> rightButtons;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarApparel/data/NavBarApparelDTO$Companion;", "", "<init>", "()V", "ICON_BUTTON", "", ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.FAVORITE_MOLECULE, "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public NavBarApparelDTO(IconButtonV3DTO iconButtonV3DTO, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class), @ProtoOneOfSignature(name = "favoriteMolecule", type = FavoriteProductMolecule.class)}) @ProtoOneOf(label = "type") List<? extends Object> list, String str) {
        this.backButton = iconButtonV3DTO;
        this.rightButtons = list;
        this.prefetchDeeplink = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NavBarApparelDTO copy$default(NavBarApparelDTO navBarApparelDTO, IconButtonV3DTO iconButtonV3DTO, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconButtonV3DTO = navBarApparelDTO.backButton;
        }
        if ((i11 & 2) != 0) {
            list = navBarApparelDTO.rightButtons;
        }
        if ((i11 & 4) != 0) {
            str = navBarApparelDTO.prefetchDeeplink;
        }
        return navBarApparelDTO.copy(iconButtonV3DTO, list, str);
    }

    /* renamed from: component1, reason: from getter */
    public final IconButtonV3DTO getBackButton() {
        return this.backButton;
    }

    public final List<Object> component2() {
        return this.rightButtons;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPrefetchDeeplink() {
        return this.prefetchDeeplink;
    }

    @NotNull
    public final NavBarApparelDTO copy(IconButtonV3DTO backButton, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "iconButton", type = IconButtonV3DTO.class), @ProtoOneOfSignature(name = "favoriteMolecule", type = FavoriteProductMolecule.class)}) @ProtoOneOf(label = "type") List<? extends Object> rightButtons, String prefetchDeeplink) {
        return new NavBarApparelDTO(backButton, rightButtons, prefetchDeeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavBarApparelDTO)) {
            return false;
        }
        NavBarApparelDTO navBarApparelDTO = (NavBarApparelDTO) other;
        return Intrinsics.d(this.backButton, navBarApparelDTO.backButton) && Intrinsics.d(this.rightButtons, navBarApparelDTO.rightButtons) && Intrinsics.d(this.prefetchDeeplink, navBarApparelDTO.prefetchDeeplink);
    }

    public final IconButtonV3DTO getBackButton() {
        return this.backButton;
    }

    public final String getPrefetchDeeplink() {
        return this.prefetchDeeplink;
    }

    public final List<Object> getRightButtons() {
        return this.rightButtons;
    }

    public int hashCode() {
        IconButtonV3DTO iconButtonV3DTO = this.backButton;
        int hashCode = (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode()) * 31;
        List<Object> list = this.rightButtons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.prefetchDeeplink;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        IconButtonV3DTO iconButtonV3DTO = this.backButton;
        List<Object> list = this.rightButtons;
        String str = this.prefetchDeeplink;
        StringBuilder sb2 = new StringBuilder("NavBarApparelDTO(backButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", rightButtons=");
        sb2.append(list);
        sb2.append(", prefetchDeeplink=");
        return o0.c(sb2, str, ")");
    }
}
