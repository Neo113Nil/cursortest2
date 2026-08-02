package ru.ozon.app.android.travel.feature.avia.widgets.addToFavoritesCell.data;

import G.g;
import Kk.C3532b;
import Nh.a;
import T7.P;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u008f\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010*\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001d¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/addToFavoritesCell/data/AddToFavoritesCellDTO;", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "sku", "", "addLink", "deleteLink", "isFavorite", "", "modalAction", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "addTrackingInfo", "deleteTrackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/ozon/uni/atoms/data/controls/CommonControlSettings;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getSku", "()Ljava/lang/String;", "getAddLink", "getDeleteLink", "()Z", "getModalAction", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getTrackingInfo", "()Ljava/util/Map;", "getAddTrackingInfo", "getDeleteTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AddToFavoritesCellDTO {
    public static final int $stable = 8;

    @NotNull
    private final String addLink;
    private final Map<String, TokenizedTrackingInfo> addTrackingInfo;

    @NotNull
    private final CellDTO cell;

    @NotNull
    private final String deleteLink;
    private final Map<String, TokenizedTrackingInfo> deleteTrackingInfo;
    private final boolean isFavorite;
    private final CommonControlSettings modalAction;

    @NotNull
    private final String sku;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public AddToFavoritesCellDTO(@NotNull CellDTO cell, @NotNull String sku, @NotNull String addLink, @NotNull String deleteLink, boolean z11, CommonControlSettings commonControlSettings, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(addLink, "addLink");
        Intrinsics.checkNotNullParameter(deleteLink, "deleteLink");
        this.cell = cell;
        this.sku = sku;
        this.addLink = addLink;
        this.deleteLink = deleteLink;
        this.isFavorite = z11;
        this.modalAction = commonControlSettings;
        this.trackingInfo = map;
        this.addTrackingInfo = map2;
        this.deleteTrackingInfo = map3;
    }

    public static /* synthetic */ AddToFavoritesCellDTO copy$default(AddToFavoritesCellDTO addToFavoritesCellDTO, CellDTO cellDTO, String str, String str2, String str3, boolean z11, CommonControlSettings commonControlSettings, Map map, Map map2, Map map3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cellDTO = addToFavoritesCellDTO.cell;
        }
        if ((i11 & 2) != 0) {
            str = addToFavoritesCellDTO.sku;
        }
        if ((i11 & 4) != 0) {
            str2 = addToFavoritesCellDTO.addLink;
        }
        if ((i11 & 8) != 0) {
            str3 = addToFavoritesCellDTO.deleteLink;
        }
        if ((i11 & 16) != 0) {
            z11 = addToFavoritesCellDTO.isFavorite;
        }
        if ((i11 & 32) != 0) {
            commonControlSettings = addToFavoritesCellDTO.modalAction;
        }
        if ((i11 & 64) != 0) {
            map = addToFavoritesCellDTO.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map2 = addToFavoritesCellDTO.addTrackingInfo;
        }
        if ((i11 & 256) != 0) {
            map3 = addToFavoritesCellDTO.deleteTrackingInfo;
        }
        Map map4 = map2;
        Map map5 = map3;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        Map map6 = map;
        boolean z12 = z11;
        String str4 = str2;
        return addToFavoritesCellDTO.copy(cellDTO, str, str4, str3, z12, commonControlSettings2, map6, map4, map5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CellDTO getCell() {
        return this.cell;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getAddLink() {
        return this.addLink;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDeleteLink() {
        return this.deleteLink;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    /* renamed from: component6, reason: from getter */
    public final CommonControlSettings getModalAction() {
        return this.modalAction;
    }

    public final Map<String, TokenizedTrackingInfo> component7() {
        return this.trackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.addTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.deleteTrackingInfo;
    }

    @NotNull
    public final AddToFavoritesCellDTO copy(@NotNull CellDTO cell, @NotNull String sku, @NotNull String addLink, @NotNull String deleteLink, boolean isFavorite, CommonControlSettings modalAction, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, TokenizedTrackingInfo> addTrackingInfo, Map<String, TokenizedTrackingInfo> deleteTrackingInfo) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(addLink, "addLink");
        Intrinsics.checkNotNullParameter(deleteLink, "deleteLink");
        return new AddToFavoritesCellDTO(cell, sku, addLink, deleteLink, isFavorite, modalAction, trackingInfo, addTrackingInfo, deleteTrackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddToFavoritesCellDTO)) {
            return false;
        }
        AddToFavoritesCellDTO addToFavoritesCellDTO = (AddToFavoritesCellDTO) other;
        return Intrinsics.d(this.cell, addToFavoritesCellDTO.cell) && Intrinsics.d(this.sku, addToFavoritesCellDTO.sku) && Intrinsics.d(this.addLink, addToFavoritesCellDTO.addLink) && Intrinsics.d(this.deleteLink, addToFavoritesCellDTO.deleteLink) && this.isFavorite == addToFavoritesCellDTO.isFavorite && Intrinsics.d(this.modalAction, addToFavoritesCellDTO.modalAction) && Intrinsics.d(this.trackingInfo, addToFavoritesCellDTO.trackingInfo) && Intrinsics.d(this.addTrackingInfo, addToFavoritesCellDTO.addTrackingInfo) && Intrinsics.d(this.deleteTrackingInfo, addToFavoritesCellDTO.deleteTrackingInfo);
    }

    @NotNull
    public final String getAddLink() {
        return this.addLink;
    }

    public final Map<String, TokenizedTrackingInfo> getAddTrackingInfo() {
        return this.addTrackingInfo;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    @NotNull
    public final String getDeleteLink() {
        return this.deleteLink;
    }

    public final Map<String, TokenizedTrackingInfo> getDeleteTrackingInfo() {
        return this.deleteTrackingInfo;
    }

    public final CommonControlSettings getModalAction() {
        return this.modalAction;
    }

    @NotNull
    public final String getSku() {
        return this.sku;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = C3532b.a(g.a(g.a(g.a(this.cell.hashCode() * 31, 31, this.sku), 31, this.addLink), 31, this.deleteLink), 31, this.isFavorite);
        CommonControlSettings commonControlSettings = this.modalAction;
        int hashCode = (a11 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.addTrackingInfo;
        int hashCode3 = (hashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map3 = this.deleteTrackingInfo;
        return hashCode3 + (map3 != null ? map3.hashCode() : 0);
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    @NotNull
    public String toString() {
        CellDTO cellDTO = this.cell;
        String str = this.sku;
        String str2 = this.addLink;
        String str3 = this.deleteLink;
        boolean z11 = this.isFavorite;
        CommonControlSettings commonControlSettings = this.modalAction;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        Map<String, TokenizedTrackingInfo> map2 = this.addTrackingInfo;
        Map<String, TokenizedTrackingInfo> map3 = this.deleteTrackingInfo;
        StringBuilder sb2 = new StringBuilder("AddToFavoritesCellDTO(cell=");
        sb2.append(cellDTO);
        sb2.append(", sku=");
        sb2.append(str);
        sb2.append(", addLink=");
        a.h(sb2, str2, ", deleteLink=", str3, ", isFavorite=");
        sb2.append(z11);
        sb2.append(", modalAction=");
        sb2.append(commonControlSettings);
        sb2.append(", trackingInfo=");
        b.g(sb2, map, ", addTrackingInfo=", map2, ", deleteTrackingInfo=");
        return P.f(sb2, map3, ")");
    }
}
