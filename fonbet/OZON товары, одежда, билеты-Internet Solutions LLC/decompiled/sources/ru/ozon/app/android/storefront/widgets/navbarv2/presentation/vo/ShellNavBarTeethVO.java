package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo;

import Cm.e;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarTeethVO;", "", "", "teethHeight", "teethTopSpacerHeight", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTeethHeight", "getTeethTopSpacerHeight", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ShellNavBarTeethVO {
    private final int teethHeight;
    private final int teethTopSpacerHeight;

    public ShellNavBarTeethVO(int i11, int i12) {
        this.teethHeight = i11;
        this.teethTopSpacerHeight = i12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShellNavBarTeethVO)) {
            return false;
        }
        ShellNavBarTeethVO shellNavBarTeethVO = (ShellNavBarTeethVO) other;
        return this.teethHeight == shellNavBarTeethVO.teethHeight && this.teethTopSpacerHeight == shellNavBarTeethVO.teethTopSpacerHeight;
    }

    public final int getTeethHeight() {
        return this.teethHeight;
    }

    public final int getTeethTopSpacerHeight() {
        return this.teethTopSpacerHeight;
    }

    public int hashCode() {
        return Integer.hashCode(this.teethTopSpacerHeight) + (Integer.hashCode(this.teethHeight) * 31);
    }

    @NotNull
    public String toString() {
        return e.c("ShellNavBarTeethVO(teethHeight=", this.teethHeight, ", teethTopSpacerHeight=", ")", this.teethTopSpacerHeight);
    }
}
