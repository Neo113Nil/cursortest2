package ru.ozon.app.android.cart.cartSplitV2.v2.data;

import Bi.b;
import Pk0.c;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ^\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0012J\u001a\u0010$\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u001aR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b\f\u0010\u001cR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u0010\u001e¨\u00063"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2CellItemDTOV2;", "", "", "index", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "hidingTimeMls", "", "strokeColor", "", "isLast", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/Paddings;", "externalPaddings", "<init>", "(IJLru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/cart/cartSplitV2/v2/data/Paddings;)V", "component1", "()I", "component2", "()J", "component3", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "component4", "()Ljava/lang/Integer;", "component5", "()Ljava/lang/String;", "component6", "()Ljava/lang/Boolean;", "component7", "()Lru/ozon/app/android/cart/cartSplitV2/v2/data/Paddings;", "copy", "(IJLru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lru/ozon/app/android/cart/cartSplitV2/v2/data/Paddings;)Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2CellItemDTOV2;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getIndex", "J", "getId", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "Ljava/lang/Integer;", "getHidingTimeMls", "Ljava/lang/String;", "getStrokeColor", "Ljava/lang/Boolean;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/Paddings;", "getExternalPaddings", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CartSplitV2CellItemDTOV2 {
    public static final int $stable = CellDTO.$stable;

    @NotNull
    private final CellDTO cell;
    private final Paddings externalPaddings;
    private final Integer hidingTimeMls;
    private final long id;
    private final int index;
    private final Boolean isLast;
    private final String strokeColor;

    public CartSplitV2CellItemDTOV2(int i11, long j11, @NotNull CellDTO cell, Integer num, String str, Boolean bool, Paddings paddings) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.index = i11;
        this.id = j11;
        this.cell = cell;
        this.hidingTimeMls = num;
        this.strokeColor = str;
        this.isLast = bool;
        this.externalPaddings = paddings;
    }

    public static /* synthetic */ CartSplitV2CellItemDTOV2 copy$default(CartSplitV2CellItemDTOV2 cartSplitV2CellItemDTOV2, int i11, long j11, CellDTO cellDTO, Integer num, String str, Boolean bool, Paddings paddings, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = cartSplitV2CellItemDTOV2.index;
        }
        if ((i12 & 2) != 0) {
            j11 = cartSplitV2CellItemDTOV2.id;
        }
        if ((i12 & 4) != 0) {
            cellDTO = cartSplitV2CellItemDTOV2.cell;
        }
        if ((i12 & 8) != 0) {
            num = cartSplitV2CellItemDTOV2.hidingTimeMls;
        }
        if ((i12 & 16) != 0) {
            str = cartSplitV2CellItemDTOV2.strokeColor;
        }
        if ((i12 & 32) != 0) {
            bool = cartSplitV2CellItemDTOV2.isLast;
        }
        if ((i12 & 64) != 0) {
            paddings = cartSplitV2CellItemDTOV2.externalPaddings;
        }
        Paddings paddings2 = paddings;
        String str2 = str;
        CellDTO cellDTO2 = cellDTO;
        return cartSplitV2CellItemDTOV2.copy(i11, j11, cellDTO2, num, str2, bool, paddings2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* renamed from: component2, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CellDTO getCell() {
        return this.cell;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getHidingTimeMls() {
        return this.hidingTimeMls;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStrokeColor() {
        return this.strokeColor;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getIsLast() {
        return this.isLast;
    }

    /* renamed from: component7, reason: from getter */
    public final Paddings getExternalPaddings() {
        return this.externalPaddings;
    }

    @NotNull
    public final CartSplitV2CellItemDTOV2 copy(int index, long id2, @NotNull CellDTO cell, Integer hidingTimeMls, String strokeColor, Boolean isLast, Paddings externalPaddings) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        return new CartSplitV2CellItemDTOV2(index, id2, cell, hidingTimeMls, strokeColor, isLast, externalPaddings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartSplitV2CellItemDTOV2)) {
            return false;
        }
        CartSplitV2CellItemDTOV2 cartSplitV2CellItemDTOV2 = (CartSplitV2CellItemDTOV2) other;
        return this.index == cartSplitV2CellItemDTOV2.index && this.id == cartSplitV2CellItemDTOV2.id && Intrinsics.d(this.cell, cartSplitV2CellItemDTOV2.cell) && Intrinsics.d(this.hidingTimeMls, cartSplitV2CellItemDTOV2.hidingTimeMls) && Intrinsics.d(this.strokeColor, cartSplitV2CellItemDTOV2.strokeColor) && Intrinsics.d(this.isLast, cartSplitV2CellItemDTOV2.isLast) && Intrinsics.d(this.externalPaddings, cartSplitV2CellItemDTOV2.externalPaddings);
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    public final Paddings getExternalPaddings() {
        return this.externalPaddings;
    }

    public final Integer getHidingTimeMls() {
        return this.hidingTimeMls;
    }

    public final long getId() {
        return this.id;
    }

    public int getIndex() {
        return this.index;
    }

    public final String getStrokeColor() {
        return this.strokeColor;
    }

    public int hashCode() {
        int c11 = b.c(this.cell, c.a(Integer.hashCode(this.index) * 31, 31, this.id), 31);
        Integer num = this.hidingTimeMls;
        int hashCode = (c11 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.strokeColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isLast;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Paddings paddings = this.externalPaddings;
        return hashCode3 + (paddings != null ? paddings.hashCode() : 0);
    }

    public final Boolean isLast() {
        return this.isLast;
    }

    @NotNull
    public String toString() {
        return "CartSplitV2CellItemDTOV2(index=" + this.index + ", id=" + this.id + ", cell=" + this.cell + ", hidingTimeMls=" + this.hidingTimeMls + ", strokeColor=" + this.strokeColor + ", isLast=" + this.isLast + ", externalPaddings=" + this.externalPaddings + ")";
    }
}
