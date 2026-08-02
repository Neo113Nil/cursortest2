package ru.ozon.app.android.search.catalog.components.meta;

import Ak.C2436a;
import G.g;
import Nh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.favorite.FavoriteEntity;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003Ja\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lru/ozon/app/android/search/catalog/components/meta/MetaDO;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "image", "description", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "type", "designType", "favoriteEntityButton", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;", "shareData", "Lru/ozon/app/android/search/catalog/components/meta/ShareData;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;Lru/ozon/app/android/search/catalog/components/meta/ShareData;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getImage", "getDescription", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getType", "getDesignType", "getFavoriteEntityButton", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/favorite/FavoriteEntity;", "getShareData", "()Lru/ozon/app/android/search/catalog/components/meta/ShareData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MetaDO {
    public static final int $stable = 8;
    private final OzonSpannableString description;

    @NotNull
    private final String designType;
    private final FavoriteEntity favoriteEntityButton;
    private final long id;
    private final String image;

    @NotNull
    private final String name;
    private final ShareData shareData;

    @NotNull
    private final String type;

    public MetaDO(long j11, @NotNull String name, String str, OzonSpannableString ozonSpannableString, @NotNull String type, @NotNull String designType, FavoriteEntity favoriteEntity, ShareData shareData) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(designType, "designType");
        this.id = j11;
        this.name = name;
        this.image = str;
        this.description = ozonSpannableString;
        this.type = type;
        this.designType = designType;
        this.favoriteEntityButton = favoriteEntity;
        this.shareData = shareData;
    }

    public static /* synthetic */ MetaDO copy$default(MetaDO metaDO, long j11, String str, String str2, OzonSpannableString ozonSpannableString, String str3, String str4, FavoriteEntity favoriteEntity, ShareData shareData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = metaDO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = metaDO.name;
        }
        String str5 = str;
        if ((i11 & 4) != 0) {
            str2 = metaDO.image;
        }
        String str6 = str2;
        if ((i11 & 8) != 0) {
            ozonSpannableString = metaDO.description;
        }
        return metaDO.copy(j12, str5, str6, ozonSpannableString, (i11 & 16) != 0 ? metaDO.type : str3, (i11 & 32) != 0 ? metaDO.designType : str4, (i11 & 64) != 0 ? metaDO.favoriteEntityButton : favoriteEntity, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? metaDO.shareData : shareData);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component4, reason: from getter */
    public final OzonSpannableString getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getDesignType() {
        return this.designType;
    }

    /* renamed from: component7, reason: from getter */
    public final FavoriteEntity getFavoriteEntityButton() {
        return this.favoriteEntityButton;
    }

    /* renamed from: component8, reason: from getter */
    public final ShareData getShareData() {
        return this.shareData;
    }

    @NotNull
    public final MetaDO copy(long id2, @NotNull String name, String image, OzonSpannableString description, @NotNull String type, @NotNull String designType, FavoriteEntity favoriteEntityButton, ShareData shareData) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(designType, "designType");
        return new MetaDO(id2, name, image, description, type, designType, favoriteEntityButton, shareData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetaDO)) {
            return false;
        }
        MetaDO metaDO = (MetaDO) other;
        return this.id == metaDO.id && Intrinsics.d(this.name, metaDO.name) && Intrinsics.d(this.image, metaDO.image) && Intrinsics.d(this.description, metaDO.description) && Intrinsics.d(this.type, metaDO.type) && Intrinsics.d(this.designType, metaDO.designType) && Intrinsics.d(this.favoriteEntityButton, metaDO.favoriteEntityButton) && Intrinsics.d(this.shareData, metaDO.shareData);
    }

    public final OzonSpannableString getDescription() {
        return this.description;
    }

    @NotNull
    public final String getDesignType() {
        return this.designType;
    }

    public final FavoriteEntity getFavoriteEntityButton() {
        return this.favoriteEntityButton;
    }

    public final long getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final ShareData getShareData() {
        return this.shareData;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int a11 = g.a(Long.hashCode(this.id) * 31, 31, this.name);
        String str = this.image;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        OzonSpannableString ozonSpannableString = this.description;
        int a12 = g.a(g.a((hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31, 31, this.type), 31, this.designType);
        FavoriteEntity favoriteEntity = this.favoriteEntityButton;
        int hashCode2 = (a12 + (favoriteEntity == null ? 0 : favoriteEntity.hashCode())) * 31;
        ShareData shareData = this.shareData;
        return hashCode2 + (shareData != null ? shareData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.name;
        String str2 = this.image;
        OzonSpannableString ozonSpannableString = this.description;
        String str3 = this.type;
        String str4 = this.designType;
        FavoriteEntity favoriteEntity = this.favoriteEntityButton;
        ShareData shareData = this.shareData;
        StringBuilder c11 = C2436a.c(j11, "MetaDO(id=", ", name=", str);
        c11.append(", image=");
        c11.append(str2);
        c11.append(", description=");
        c11.append((Object) ozonSpannableString);
        a.h(c11, ", type=", str3, ", designType=", str4);
        c11.append(", favoriteEntityButton=");
        c11.append(favoriteEntity);
        c11.append(", shareData=");
        c11.append(shareData);
        c11.append(")");
        return c11.toString();
    }
}
