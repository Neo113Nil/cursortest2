package ru.ozon.app.android.cart.installment.presentation;

import Am.C2438a;
import B0.C2454a;
import Bi.b;
import C.o0;
import D3.h;
import J0.P;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001:\u0002#$B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/ozon/app/android/cart/installment/presentation/InstallmentVO;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "Lru/ozon/app/android/cart/installment/presentation/InstallmentVO$WidgetMarginsVO;", "margins", "Lru/ozon/app/android/cart/installment/presentation/InstallmentVO$ContainerSettingsVO;", "widgetContainerSettings", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/cart/installment/presentation/InstallmentVO$WidgetMarginsVO;Lru/ozon/app/android/cart/installment/presentation/InstallmentVO$ContainerSettingsVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/app/android/cart/installment/presentation/InstallmentVO$WidgetMarginsVO;", "getMargins", "()Lru/ozon/app/android/cart/installment/presentation/InstallmentVO$WidgetMarginsVO;", "Lru/ozon/app/android/cart/installment/presentation/InstallmentVO$ContainerSettingsVO;", "getWidgetContainerSettings", "()Lru/ozon/app/android/cart/installment/presentation/InstallmentVO$ContainerSettingsVO;", "WidgetMarginsVO", "ContainerSettingsVO", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class InstallmentVO implements c {
    public static final int $stable = CellDTO.$stable;

    @NotNull
    private final CellDTO cell;
    private final long id;

    @NotNull
    private final WidgetMarginsVO margins;
    private final ContainerSettingsVO widgetContainerSettings;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cart/installment/presentation/InstallmentVO$ContainerSettingsVO;", "", "", "cornerRadiusDp", "horizontalMarginDp", "", "backgroundColor", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getCornerRadiusDp", "()Ljava/lang/Integer;", "getHorizontalMarginDp", "Ljava/lang/String;", "getBackgroundColor", "", "cornerRadius", "Ljava/lang/Float;", "getCornerRadius", "()Ljava/lang/Float;", "horizontalMargin", "getHorizontalMargin", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContainerSettingsVO {
        private final String backgroundColor;
        private final Float cornerRadius;
        private final Integer cornerRadiusDp;
        private final Integer horizontalMargin;
        private final Integer horizontalMarginDp;

        public ContainerSettingsVO(Integer num, Integer num2, String str) {
            this.cornerRadiusDp = num;
            this.horizontalMarginDp = num2;
            this.backgroundColor = str;
            this.cornerRadius = num != null ? Float.valueOf(UiExtKt.toPxF(num.intValue())) : null;
            this.horizontalMargin = num2 != null ? Integer.valueOf(UiExtKt.toPx(num2.intValue())) : null;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContainerSettingsVO)) {
                return false;
            }
            ContainerSettingsVO containerSettingsVO = (ContainerSettingsVO) other;
            return Intrinsics.d(this.cornerRadiusDp, containerSettingsVO.cornerRadiusDp) && Intrinsics.d(this.horizontalMarginDp, containerSettingsVO.horizontalMarginDp) && Intrinsics.d(this.backgroundColor, containerSettingsVO.backgroundColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Float getCornerRadius() {
            return this.cornerRadius;
        }

        public final Integer getCornerRadiusDp() {
            return this.cornerRadiusDp;
        }

        public final Integer getHorizontalMargin() {
            return this.horizontalMargin;
        }

        public final Integer getHorizontalMarginDp() {
            return this.horizontalMarginDp;
        }

        public int hashCode() {
            Integer num = this.cornerRadiusDp;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.horizontalMarginDp;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.backgroundColor;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Integer num = this.cornerRadiusDp;
            Integer num2 = this.horizontalMarginDp;
            return o0.c(Kk.c.f("ContainerSettingsVO(cornerRadiusDp=", ", horizontalMarginDp=", num, num2, ", backgroundColor="), this.backgroundColor, ")");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\r¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/cart/installment/presentation/InstallmentVO$WidgetMarginsVO;", "", "", "topDp", "bottomDp", "leftDp", "rightDp", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTopDp", "getBottomDp", "getLeftDp", "getRightDp", "top", "getTop", "bottom", "getBottom", "left", "getLeft", "right", "getRight", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WidgetMarginsVO {
        private final int bottom;
        private final int bottomDp;
        private final int left;
        private final int leftDp;
        private final int right;
        private final int rightDp;
        private final int top;
        private final int topDp;

        public WidgetMarginsVO(int i11, int i12, int i13, int i14) {
            this.topDp = i11;
            this.bottomDp = i12;
            this.leftDp = i13;
            this.rightDp = i14;
            this.top = UiExtKt.toPx(i11);
            this.bottom = UiExtKt.toPx(i12);
            this.left = UiExtKt.toPx(i13);
            this.right = UiExtKt.toPx(i14);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WidgetMarginsVO)) {
                return false;
            }
            WidgetMarginsVO widgetMarginsVO = (WidgetMarginsVO) other;
            return this.topDp == widgetMarginsVO.topDp && this.bottomDp == widgetMarginsVO.bottomDp && this.leftDp == widgetMarginsVO.leftDp && this.rightDp == widgetMarginsVO.rightDp;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getBottomDp() {
            return this.bottomDp;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getLeftDp() {
            return this.leftDp;
        }

        public final int getRight() {
            return this.right;
        }

        public final int getRightDp() {
            return this.rightDp;
        }

        public final int getTop() {
            return this.top;
        }

        public final int getTopDp() {
            return this.topDp;
        }

        public int hashCode() {
            return Integer.hashCode(this.rightDp) + C2454a.a(this.leftDp, C2454a.a(this.bottomDp, Integer.hashCode(this.topDp) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.leftDp, this.rightDp, ", rightDp=", ")", C2438a.a("WidgetMarginsVO(topDp=", this.topDp, ", bottomDp=", ", leftDp=", this.bottomDp));
        }
    }

    public InstallmentVO(long j11, @NotNull CellDTO cell, @NotNull WidgetMarginsVO margins, ContainerSettingsVO containerSettingsVO) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(margins, "margins");
        this.id = j11;
        this.cell = cell;
        this.margins = margins;
        this.widgetContainerSettings = containerSettingsVO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallmentVO)) {
            return false;
        }
        InstallmentVO installmentVO = (InstallmentVO) other;
        return this.id == installmentVO.id && Intrinsics.d(this.cell, installmentVO.cell) && Intrinsics.d(this.margins, installmentVO.margins) && Intrinsics.d(this.widgetContainerSettings, installmentVO.widgetContainerSettings);
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final WidgetMarginsVO getMargins() {
        return this.margins;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final ContainerSettingsVO getWidgetContainerSettings() {
        return this.widgetContainerSettings;
    }

    public int hashCode() {
        int hashCode = (this.margins.hashCode() + b.c(this.cell, Long.hashCode(this.id) * 31, 31)) * 31;
        ContainerSettingsVO containerSettingsVO = this.widgetContainerSettings;
        return hashCode + (containerSettingsVO == null ? 0 : containerSettingsVO.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellDTO cellDTO = this.cell;
        WidgetMarginsVO widgetMarginsVO = this.margins;
        ContainerSettingsVO containerSettingsVO = this.widgetContainerSettings;
        StringBuilder e11 = h.e("InstallmentVO(id=", j11, ", cell=", cellDTO);
        e11.append(", margins=");
        e11.append(widgetMarginsVO);
        e11.append(", widgetContainerSettings=");
        e11.append(containerSettingsVO);
        e11.append(")");
        return e11.toString();
    }
}
