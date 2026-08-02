package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem;

import Bi.b;
import C.C2702w;
import Ds.C2880a;
import E0.C2942q;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.Paddings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b \u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b\u000b\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/CartSplitV2CellItemVO;", "Ll20/c;", "", "id", "itemId", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "hidingTimeMls", "", "strokeColor", "", "isLast", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/Paddings;", "externalPaddings", "<init>", "(JJLru/ozon/uni/atoms/data/dsCell/CellDTO;JLjava/lang/String;ZLru/ozon/app/android/cart/cartSplitV2/v2/data/Paddings;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "getItemId", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getHidingTimeMls", "Ljava/lang/String;", "getStrokeColor", "Z", "()Z", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/Paddings;", "getExternalPaddings", "()Lru/ozon/app/android/cart/cartSplitV2/v2/data/Paddings;", "scrollWidgetKey", "I", "getScrollWidgetKey", "()Ljava/lang/Integer;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CartSplitV2CellItemVO implements c {
    public static final int $stable = CellDTO.$stable;

    @NotNull
    private final CellDTO cell;
    private final Paddings externalPaddings;
    private final long hidingTimeMls;
    private final long id;
    private final boolean isLast;
    private final long itemId;
    private final int scrollWidgetKey;
    private final String strokeColor;

    public CartSplitV2CellItemVO(long j11, long j12, @NotNull CellDTO cell, long j13, String str, boolean z11, Paddings paddings) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        this.id = j11;
        this.itemId = j12;
        this.cell = cell;
        this.hidingTimeMls = j13;
        this.strokeColor = str;
        this.isLast = z11;
        this.externalPaddings = paddings;
        this.scrollWidgetKey = (int) j12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartSplitV2CellItemVO)) {
            return false;
        }
        CartSplitV2CellItemVO cartSplitV2CellItemVO = (CartSplitV2CellItemVO) other;
        return this.id == cartSplitV2CellItemVO.id && this.itemId == cartSplitV2CellItemVO.itemId && Intrinsics.d(this.cell, cartSplitV2CellItemVO.cell) && this.hidingTimeMls == cartSplitV2CellItemVO.hidingTimeMls && Intrinsics.d(this.strokeColor, cartSplitV2CellItemVO.strokeColor) && this.isLast == cartSplitV2CellItemVO.isLast && Intrinsics.d(this.externalPaddings, cartSplitV2CellItemVO.externalPaddings);
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    public final Paddings getExternalPaddings() {
        return this.externalPaddings;
    }

    public final long getHidingTimeMls() {
        return this.hidingTimeMls;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    @NotNull
    public Integer getScrollWidgetKey() {
        return Integer.valueOf(this.scrollWidgetKey);
    }

    public final String getStrokeColor() {
        return this.strokeColor;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = Pk0.c.a(b.c(this.cell, Pk0.c.a(Long.hashCode(this.id) * 31, 31, this.itemId), 31), 31, this.hidingTimeMls);
        String str = this.strokeColor;
        int a12 = C3532b.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isLast);
        Paddings paddings = this.externalPaddings;
        return a12 + (paddings != null ? paddings.hashCode() : 0);
    }

    /* renamed from: isLast, reason: from getter */
    public final boolean getIsLast() {
        return this.isLast;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        long j12 = this.itemId;
        CellDTO cellDTO = this.cell;
        long j13 = this.hidingTimeMls;
        String str = this.strokeColor;
        boolean z11 = this.isLast;
        Paddings paddings = this.externalPaddings;
        StringBuilder d11 = C2702w.d(j11, "CartSplitV2CellItemVO(id=", ", itemId=");
        d11.append(j12);
        d11.append(", cell=");
        d11.append(cellDTO);
        C2942q.f(d11, ", hidingTimeMls=", j13, ", strokeColor=");
        C2880a.c(str, ", isLast=", ", externalPaddings=", d11, z11);
        d11.append(paddings);
        d11.append(")");
        return d11.toString();
    }
}
