package ru.ozon.app.android.storefront.widgets.navigationSlider.data;

import Ds.C2880a;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JU\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSlider/data/NavigationItemDTO;", "", "image", "", "deeplink", SelectionItemFormDTO.TITLE_FIELD_NAME, FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "backgroundImage", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;)V", "getImage", "()Ljava/lang/String;", "getDeeplink", "getTitle", "setTitle", "(Ljava/lang/String;)V", "()Z", "getBackgroundImage", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class NavigationItemDTO {
    public static final int $stable = 8;
    private final String backgroundImage;

    @NotNull
    private final String deeplink;

    @NotNull
    private final String image;
    private final boolean isAdult;

    @NotNull
    private String title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public NavigationItemDTO(@NotNull String image, @NotNull String deeplink, @NotNull String title, boolean z11, String str, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(title, "title");
        this.image = image;
        this.deeplink = deeplink;
        this.title = title;
        this.isAdult = z11;
        this.backgroundImage = str;
        this.trackingInfo = map;
    }

    public static /* synthetic */ NavigationItemDTO copy$default(NavigationItemDTO navigationItemDTO, String str, String str2, String str3, boolean z11, String str4, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = navigationItemDTO.image;
        }
        if ((i11 & 2) != 0) {
            str2 = navigationItemDTO.deeplink;
        }
        if ((i11 & 4) != 0) {
            str3 = navigationItemDTO.title;
        }
        if ((i11 & 8) != 0) {
            z11 = navigationItemDTO.isAdult;
        }
        if ((i11 & 16) != 0) {
            str4 = navigationItemDTO.backgroundImage;
        }
        if ((i11 & 32) != 0) {
            map = navigationItemDTO.trackingInfo;
        }
        String str5 = str4;
        Map map2 = map;
        return navigationItemDTO.copy(str, str2, str3, z11, str5, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsAdult() {
        return this.isAdult;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    @NotNull
    public final NavigationItemDTO copy(@NotNull String image, @NotNull String deeplink, @NotNull String title, boolean isAdult, String backgroundImage, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(title, "title");
        return new NavigationItemDTO(image, deeplink, title, isAdult, backgroundImage, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationItemDTO)) {
            return false;
        }
        NavigationItemDTO navigationItemDTO = (NavigationItemDTO) other;
        return Intrinsics.d(this.image, navigationItemDTO.image) && Intrinsics.d(this.deeplink, navigationItemDTO.deeplink) && Intrinsics.d(this.title, navigationItemDTO.title) && this.isAdult == navigationItemDTO.isAdult && Intrinsics.d(this.backgroundImage, navigationItemDTO.backgroundImage) && Intrinsics.d(this.trackingInfo, navigationItemDTO.trackingInfo);
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = C3532b.a(g.a(g.a(this.image.hashCode() * 31, 31, this.deeplink), 31, this.title), 31, this.isAdult);
        String str = this.backgroundImage;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final boolean isAdult() {
        return this.isAdult;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    @NotNull
    public String toString() {
        String str = this.image;
        String str2 = this.deeplink;
        String str3 = this.title;
        boolean z11 = this.isAdult;
        String str4 = this.backgroundImage;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder d11 = C3660k.d("NavigationItemDTO(image=", str, ", deeplink=", str2, ", title=");
        C2880a.c(str3, ", isAdult=", ", backgroundImage=", d11, z11);
        return C4070a.a(d11, str4, ", trackingInfo=", map, ")");
    }
}
