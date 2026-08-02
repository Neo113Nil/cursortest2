package ru.ozon.app.android.widgets.commonTextWidget.separator.presentation;

import B0.A0;
import B0.C2454a;
import D3.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b \u0010\u0013R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b!\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\"\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b#\u0010\u0013R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b$\u0010\u0013R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b%\u0010\u0013¨\u0006&"}, d2 = {"Lru/ozon/app/android/widgets/commonTextWidget/separator/presentation/SeparatorVO;", "Ll20/c;", "", "id", "", "height", "", "color", "topCornerRadius", "bottomCornerRadius", "leftMargin", "rightMargin", "leftPadding", "rightPadding", "<init>", "(JILjava/lang/String;IIIIII)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "I", "getHeight", "Ljava/lang/String;", "getColor", "getTopCornerRadius", "getBottomCornerRadius", "getLeftMargin", "getRightMargin", "getLeftPadding", "getRightPadding", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SeparatorVO implements c {
    private final int bottomCornerRadius;
    private final String color;
    private final int height;
    private final long id;
    private final int leftMargin;
    private final int leftPadding;
    private final int rightMargin;
    private final int rightPadding;
    private final int topCornerRadius;

    public SeparatorVO(long j11, int i11, String str, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.id = j11;
        this.height = i11;
        this.color = str;
        this.topCornerRadius = i12;
        this.bottomCornerRadius = i13;
        this.leftMargin = i14;
        this.rightMargin = i15;
        this.leftPadding = i16;
        this.rightPadding = i17;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeparatorVO)) {
            return false;
        }
        SeparatorVO separatorVO = (SeparatorVO) other;
        return this.id == separatorVO.id && this.height == separatorVO.height && Intrinsics.d(this.color, separatorVO.color) && this.topCornerRadius == separatorVO.topCornerRadius && this.bottomCornerRadius == separatorVO.bottomCornerRadius && this.leftMargin == separatorVO.leftMargin && this.rightMargin == separatorVO.rightMargin && this.leftPadding == separatorVO.leftPadding && this.rightPadding == separatorVO.rightPadding;
    }

    public final int getBottomCornerRadius() {
        return this.bottomCornerRadius;
    }

    public final String getColor() {
        return this.color;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getLeftMargin() {
        return this.leftMargin;
    }

    public final int getLeftPadding() {
        return this.leftPadding;
    }

    public final int getRightMargin() {
        return this.rightMargin;
    }

    public final int getRightPadding() {
        return this.rightPadding;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final int getTopCornerRadius() {
        return this.topCornerRadius;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C2454a.a(this.height, Long.hashCode(this.id) * 31, 31);
        String str = this.color;
        return Integer.hashCode(this.rightPadding) + C2454a.a(this.leftPadding, C2454a.a(this.rightMargin, C2454a.a(this.leftMargin, C2454a.a(this.bottomCornerRadius, C2454a.a(this.topCornerRadius, (a11 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        int i11 = this.height;
        String str = this.color;
        int i12 = this.topCornerRadius;
        int i13 = this.bottomCornerRadius;
        int i14 = this.leftMargin;
        int i15 = this.rightMargin;
        int i16 = this.leftPadding;
        int i17 = this.rightPadding;
        StringBuilder b11 = Ql.c.b(j11, "SeparatorVO(id=", i11, ", height=");
        b11.append(", color=");
        b11.append(str);
        b11.append(", topCornerRadius=");
        b11.append(i12);
        A0.c(i13, i14, ", bottomCornerRadius=", ", leftMargin=", b11);
        A0.c(i15, i16, ", rightMargin=", ", leftPadding=", b11);
        return h.b(b11, ", rightPadding=", i17, ")");
    }
}
