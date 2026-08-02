package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data;

import B0.C2454a;
import G.g;
import HY.b;
import Sh.a;
import T7.Z;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b'\b\u0081\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010%\u001a\u00020\tH\u0016J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0080\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u00101J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\r\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b!\u0010\u001aR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\"\u0010\u001a¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/PinDTO;", "", "id", "", "rank", "", "coords", "", "price", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "hasDiscount", "", "isFavorite", "sku", "rightIconId", "leftIconId", "<init>", "(Ljava/lang/String;F[DLjava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/String;", "getRank", "()F", "getCoords", "()[D", "getPrice", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitle", "getHasDiscount", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSku", "getRightIconId", "getLeftIconId", "equals", "other", "hashCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;F[DLjava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapInfo/v4/data/PinDTO;", "toString", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PinDTO {

    @NotNull
    private final double[] coords;
    private final Boolean hasDiscount;

    @NotNull
    private final String id;
    private final Boolean isFavorite;
    private final Integer leftIconId;
    private final Integer price;
    private final float rank;
    private final Integer rightIconId;
    private final String sku;
    private final String title;

    public PinDTO(@NotNull String id2, float f7, @NotNull double[] coords, Integer num, String str, Boolean bool, Boolean bool2, String str2, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(coords, "coords");
        this.id = id2;
        this.rank = f7;
        this.coords = coords;
        this.price = num;
        this.title = str;
        this.hasDiscount = bool;
        this.isFavorite = bool2;
        this.sku = str2;
        this.rightIconId = num2;
        this.leftIconId = num3;
    }

    public static /* synthetic */ PinDTO copy$default(PinDTO pinDTO, String str, float f7, double[] dArr, Integer num, String str2, Boolean bool, Boolean bool2, String str3, Integer num2, Integer num3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pinDTO.id;
        }
        if ((i11 & 2) != 0) {
            f7 = pinDTO.rank;
        }
        if ((i11 & 4) != 0) {
            dArr = pinDTO.coords;
        }
        if ((i11 & 8) != 0) {
            num = pinDTO.price;
        }
        if ((i11 & 16) != 0) {
            str2 = pinDTO.title;
        }
        if ((i11 & 32) != 0) {
            bool = pinDTO.hasDiscount;
        }
        if ((i11 & 64) != 0) {
            bool2 = pinDTO.isFavorite;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str3 = pinDTO.sku;
        }
        if ((i11 & 256) != 0) {
            num2 = pinDTO.rightIconId;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            num3 = pinDTO.leftIconId;
        }
        Integer num4 = num2;
        Integer num5 = num3;
        Boolean bool3 = bool2;
        String str4 = str3;
        String str5 = str2;
        Boolean bool4 = bool;
        return pinDTO.copy(str, f7, dArr, num, str5, bool4, bool3, str4, num4, num5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getLeftIconId() {
        return this.leftIconId;
    }

    /* renamed from: component2, reason: from getter */
    public final float getRank() {
        return this.rank;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final double[] getCoords() {
        return this.coords;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getPrice() {
        return this.price;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getHasDiscount() {
        return this.hasDiscount;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getIsFavorite() {
        return this.isFavorite;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getRightIconId() {
        return this.rightIconId;
    }

    @NotNull
    public final PinDTO copy(@NotNull String id2, float rank, @NotNull double[] coords, Integer price, String title, Boolean hasDiscount, Boolean isFavorite, String sku, Integer rightIconId, Integer leftIconId) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(coords, "coords");
        return new PinDTO(id2, rank, coords, price, title, hasDiscount, isFavorite, sku, rightIconId, leftIconId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!PinDTO.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.data.PinDTO");
        PinDTO pinDTO = (PinDTO) other;
        return this.rank == pinDTO.rank && Intrinsics.d(this.hasDiscount, pinDTO.hasDiscount) && Intrinsics.d(this.isFavorite, pinDTO.isFavorite) && Intrinsics.d(this.id, pinDTO.id) && Arrays.equals(this.coords, pinDTO.coords) && Intrinsics.d(this.price, pinDTO.price) && Intrinsics.d(this.title, pinDTO.title) && Intrinsics.d(this.sku, pinDTO.sku) && Intrinsics.d(this.rightIconId, pinDTO.rightIconId) && Intrinsics.d(this.leftIconId, pinDTO.leftIconId);
    }

    @NotNull
    public final double[] getCoords() {
        return this.coords;
    }

    public final Boolean getHasDiscount() {
        return this.hasDiscount;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final Integer getLeftIconId() {
        return this.leftIconId;
    }

    public final Integer getPrice() {
        return this.price;
    }

    public final float getRank() {
        return this.rank;
    }

    public final Integer getRightIconId() {
        return this.rightIconId;
    }

    public final String getSku() {
        return this.sku;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = (Arrays.hashCode(this.coords) + g.a(Float.hashCode(this.rank) * 31, 31, this.id)) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.price;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.hasDiscount;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.isFavorite;
        int hashCode5 = (hashCode4 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        String str2 = this.sku;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num2 = this.rightIconId;
        int hashCode7 = (hashCode6 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.leftIconId;
        return hashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    public final Boolean isFavorite() {
        return this.isFavorite;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        float f7 = this.rank;
        String arrays = Arrays.toString(this.coords);
        Integer num = this.price;
        String str2 = this.title;
        Boolean bool = this.hasDiscount;
        Boolean bool2 = this.isFavorite;
        String str3 = this.sku;
        Integer num2 = this.rightIconId;
        Integer num3 = this.leftIconId;
        StringBuilder sb2 = new StringBuilder("PinDTO(id=");
        sb2.append(str);
        sb2.append(", rank=");
        sb2.append(f7);
        sb2.append(", coords=");
        C2454a.f(num, arrays, ", price=", ", title=", sb2);
        a.d(bool, str2, ", hasDiscount=", ", isFavorite=", sb2);
        b.c(bool2, ", sku=", str3, ", rightIconId=", sb2);
        return Z.c(sb2, num2, ", leftIconId=", num3, ")");
    }
}
