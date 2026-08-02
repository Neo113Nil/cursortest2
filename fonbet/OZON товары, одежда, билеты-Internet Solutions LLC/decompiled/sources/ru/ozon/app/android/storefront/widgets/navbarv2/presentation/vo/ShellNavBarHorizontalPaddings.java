package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Paddings;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarHorizontalPaddings;", "", "Lru/ozon/uni/atoms/data/common/Paddings;", "leftPadding", "rightPadding", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/common/Paddings;", "getLeftPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getRightPadding", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ShellNavBarHorizontalPaddings {
    private final Paddings leftPadding;
    private final Paddings rightPadding;

    public ShellNavBarHorizontalPaddings(Paddings paddings, Paddings paddings2) {
        this.leftPadding = paddings;
        this.rightPadding = paddings2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShellNavBarHorizontalPaddings)) {
            return false;
        }
        ShellNavBarHorizontalPaddings shellNavBarHorizontalPaddings = (ShellNavBarHorizontalPaddings) other;
        return this.leftPadding == shellNavBarHorizontalPaddings.leftPadding && this.rightPadding == shellNavBarHorizontalPaddings.rightPadding;
    }

    public final Paddings getLeftPadding() {
        return this.leftPadding;
    }

    public final Paddings getRightPadding() {
        return this.rightPadding;
    }

    public int hashCode() {
        Paddings paddings = this.leftPadding;
        int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
        Paddings paddings2 = this.rightPadding;
        return hashCode + (paddings2 != null ? paddings2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ShellNavBarHorizontalPaddings(leftPadding=" + this.leftPadding + ", rightPadding=" + this.rightPadding + ")";
    }
}
