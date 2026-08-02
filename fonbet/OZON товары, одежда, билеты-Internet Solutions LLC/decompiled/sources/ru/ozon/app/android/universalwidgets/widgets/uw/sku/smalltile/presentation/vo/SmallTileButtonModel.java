package ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.vo;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/vo/SmallTileButtonModel;", "", "", "id", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "button", "<init>", "(JLru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "getButton", "()Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SmallTileButtonModel {

    @NotNull
    private final AddToCartButtonDTO button;
    private final long id;

    public SmallTileButtonModel(long j11, @NotNull AddToCartButtonDTO button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.button = button;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmallTileButtonModel)) {
            return false;
        }
        SmallTileButtonModel smallTileButtonModel = (SmallTileButtonModel) other;
        return this.id == smallTileButtonModel.id && Intrinsics.d(this.button, smallTileButtonModel.button);
    }

    @NotNull
    public final AddToCartButtonDTO getButton() {
        return this.button;
    }

    public final long getId() {
        return this.id;
    }

    public int hashCode() {
        return this.button.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        return "SmallTileButtonModel(id=" + this.id + ", button=" + this.button + ")";
    }
}
