package ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject;

import N3.C3660k;
import Pk0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0006\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/ProductVO;", "", "", "image", "deeplink", "", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "getDeeplink", "Z", "()Z", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProductVO {
    private final String deeplink;
    private final String image;
    private final boolean isAdult;

    public ProductVO(String str, String str2, boolean z11) {
        this.image = str;
        this.deeplink = str2;
        this.isAdult = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductVO)) {
            return false;
        }
        ProductVO productVO = (ProductVO) other;
        return Intrinsics.d(this.image, productVO.image) && Intrinsics.d(this.deeplink, productVO.deeplink) && this.isAdult == productVO.isAdult;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getImage() {
        return this.image;
    }

    public int hashCode() {
        String str = this.image;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.deeplink;
        return Boolean.hashCode(this.isAdult) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    /* renamed from: isAdult, reason: from getter */
    public final boolean getIsAdult() {
        return this.isAdult;
    }

    @NotNull
    public String toString() {
        String str = this.image;
        String str2 = this.deeplink;
        return a.a(")", C3660k.d("ProductVO(image=", str, ", deeplink=", str2, ", isAdult="), this.isAdult);
    }
}
