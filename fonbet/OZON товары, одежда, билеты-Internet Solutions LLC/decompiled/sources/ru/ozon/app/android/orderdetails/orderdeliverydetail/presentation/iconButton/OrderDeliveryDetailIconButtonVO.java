package ru.ozon.app.android.orderdetails.orderdeliverydetail.presentation.iconButton;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/orderdetails/orderdeliverydetail/presentation/iconButton/OrderDeliveryDetailIconButtonVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButtonWithIcon;", "button", "<init>", "(JLru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButtonWithIcon;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButtonWithIcon;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButtonWithIcon;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrderDeliveryDetailIconButtonVO implements c {
    public static final int $stable = ButtonV3Atom.SmallButtonWithIcon.$stable;
    private final ButtonV3Atom.SmallButtonWithIcon button;
    private final long id;

    public OrderDeliveryDetailIconButtonVO(long j11, ButtonV3Atom.SmallButtonWithIcon smallButtonWithIcon) {
        this.id = j11;
        this.button = smallButtonWithIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDeliveryDetailIconButtonVO)) {
            return false;
        }
        OrderDeliveryDetailIconButtonVO orderDeliveryDetailIconButtonVO = (OrderDeliveryDetailIconButtonVO) other;
        return this.id == orderDeliveryDetailIconButtonVO.id && Intrinsics.d(this.button, orderDeliveryDetailIconButtonVO.button);
    }

    public final ButtonV3Atom.SmallButtonWithIcon getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        ButtonV3Atom.SmallButtonWithIcon smallButtonWithIcon = this.button;
        return hashCode + (smallButtonWithIcon == null ? 0 : smallButtonWithIcon.hashCode());
    }

    @NotNull
    public String toString() {
        return "OrderDeliveryDetailIconButtonVO(id=" + this.id + ", button=" + this.button + ")";
    }
}
