package ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct;

import Bk.C2638a;
import Nh.a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003Jl\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0004\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV2;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteMoleculeModel;", "id", "", "isFav", "", "favLink", "unfavLink", "favListsLink", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteTestInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteTestInfo;)V", "getId", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFavLink", "getUnfavLink", "getFavListsLink", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteTestInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteTestInfo;)Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMoleculeV2;", "equals", "other", "", "hashCode", "", "toString", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class FavoriteProductMoleculeV2 implements FavoriteMoleculeModel {
    private final String favLink;
    private final String favListsLink;

    @NotNull
    private final String id;
    private final Boolean isFav;
    private final FavoriteTestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final String unfavLink;

    public FavoriteProductMoleculeV2(@NotNull String id2, Boolean bool, String str, String str2, String str3, Map<String, TokenizedTrackingInfo> map, FavoriteTestInfo favoriteTestInfo) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.isFav = bool;
        this.favLink = str;
        this.unfavLink = str2;
        this.favListsLink = str3;
        this.trackingInfo = map;
        this.testInfo = favoriteTestInfo;
    }

    public static /* synthetic */ FavoriteProductMoleculeV2 copy$default(FavoriteProductMoleculeV2 favoriteProductMoleculeV2, String str, Boolean bool, String str2, String str3, String str4, Map map, FavoriteTestInfo favoriteTestInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = favoriteProductMoleculeV2.id;
        }
        if ((i11 & 2) != 0) {
            bool = favoriteProductMoleculeV2.isFav;
        }
        if ((i11 & 4) != 0) {
            str2 = favoriteProductMoleculeV2.favLink;
        }
        if ((i11 & 8) != 0) {
            str3 = favoriteProductMoleculeV2.unfavLink;
        }
        if ((i11 & 16) != 0) {
            str4 = favoriteProductMoleculeV2.favListsLink;
        }
        if ((i11 & 32) != 0) {
            map = favoriteProductMoleculeV2.trackingInfo;
        }
        if ((i11 & 64) != 0) {
            favoriteTestInfo = favoriteProductMoleculeV2.testInfo;
        }
        Map map2 = map;
        FavoriteTestInfo favoriteTestInfo2 = favoriteTestInfo;
        String str5 = str4;
        String str6 = str2;
        return favoriteProductMoleculeV2.copy(str, bool, str6, str3, str5, map2, favoriteTestInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsFav() {
        return this.isFav;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFavLink() {
        return this.favLink;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUnfavLink() {
        return this.unfavLink;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFavListsLink() {
        return this.favListsLink;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final FavoriteTestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final FavoriteProductMoleculeV2 copy(@NotNull String id2, Boolean isFav, String favLink, String unfavLink, String favListsLink, Map<String, TokenizedTrackingInfo> trackingInfo, FavoriteTestInfo testInfo) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new FavoriteProductMoleculeV2(id2, isFav, favLink, unfavLink, favListsLink, trackingInfo, testInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteProductMoleculeV2)) {
            return false;
        }
        FavoriteProductMoleculeV2 favoriteProductMoleculeV2 = (FavoriteProductMoleculeV2) other;
        return Intrinsics.d(this.id, favoriteProductMoleculeV2.id) && Intrinsics.d(this.isFav, favoriteProductMoleculeV2.isFav) && Intrinsics.d(this.favLink, favoriteProductMoleculeV2.favLink) && Intrinsics.d(this.unfavLink, favoriteProductMoleculeV2.unfavLink) && Intrinsics.d(this.favListsLink, favoriteProductMoleculeV2.favListsLink) && Intrinsics.d(this.trackingInfo, favoriteProductMoleculeV2.trackingInfo) && Intrinsics.d(this.testInfo, favoriteProductMoleculeV2.testInfo);
    }

    public final String getFavLink() {
        return this.favLink;
    }

    public final String getFavListsLink() {
        return this.favListsLink;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final FavoriteTestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final String getUnfavLink() {
        return this.unfavLink;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        Boolean bool = this.isFav;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.favLink;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.unfavLink;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.favListsLink;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        FavoriteTestInfo favoriteTestInfo = this.testInfo;
        return hashCode6 + (favoriteTestInfo != null ? favoriteTestInfo.hashCode() : 0);
    }

    public final Boolean isFav() {
        return this.isFav;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        Boolean bool = this.isFav;
        String str2 = this.favLink;
        String str3 = this.unfavLink;
        String str4 = this.favListsLink;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        FavoriteTestInfo favoriteTestInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("FavoriteProductMoleculeV2(id=");
        sb2.append(str);
        sb2.append(", isFav=");
        sb2.append(bool);
        sb2.append(", favLink=");
        a.h(sb2, str2, ", unfavLink=", str3, ", favListsLink=");
        C2638a.e(sb2, str4, ", trackingInfo=", map, ", testInfo=");
        sb2.append(favoriteTestInfo);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ FavoriteProductMoleculeV2(String str, Boolean bool, String str2, String str3, String str4, Map map, FavoriteTestInfo favoriteTestInfo, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? Boolean.FALSE : bool, str2, str3, str4, map, favoriteTestInfo);
    }
}
