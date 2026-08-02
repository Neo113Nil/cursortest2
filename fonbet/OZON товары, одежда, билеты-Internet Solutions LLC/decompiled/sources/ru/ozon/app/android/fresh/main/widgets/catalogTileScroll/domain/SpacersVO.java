package ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.domain;

import Am.C2438a;
import B0.C2454a;
import Ek.a;
import K00.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0018\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/SpacersVO;", "", "", "left", "right", "top", "bottom", "between", "<init>", "(IIIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getLeft", "getRight", "getTop", "getBottom", "getBetween", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SpacersVO {
    private final int between;
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public SpacersVO(int i11, int i12, int i13, int i14, int i15) {
        this.left = i11;
        this.right = i12;
        this.top = i13;
        this.bottom = i14;
        this.between = i15;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpacersVO)) {
            return false;
        }
        SpacersVO spacersVO = (SpacersVO) other;
        return this.left == spacersVO.left && this.right == spacersVO.right && this.top == spacersVO.top && this.bottom == spacersVO.bottom && this.between == spacersVO.between;
    }

    public final int getBetween() {
        return this.between;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    public int hashCode() {
        return Integer.hashCode(this.between) + C2454a.a(this.bottom, C2454a.a(this.top, C2454a.a(this.right, Integer.hashCode(this.left) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.left;
        int i12 = this.right;
        int i13 = this.top;
        int i14 = this.bottom;
        int i15 = this.between;
        StringBuilder a11 = C2438a.a("SpacersVO(left=", i11, ", right=", ", top=", i12);
        a.f(i13, i14, ", bottom=", ", between=", a11);
        return b.e(i15, ")", a11);
    }
}
