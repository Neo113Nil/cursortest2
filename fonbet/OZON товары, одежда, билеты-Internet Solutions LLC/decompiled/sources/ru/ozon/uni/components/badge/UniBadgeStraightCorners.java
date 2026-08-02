package ru.ozon.uni.components.badge;

import Kk.C3532b;
import Lh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lru/ozon/uni/components/badge/UniBadgeStraightCorners;", "", "", "topLeft", "topRight", "bottomLeft", "bottomRight", "<init>", "(ZZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getTopLeft", "()Z", "getTopRight", "getBottomLeft", "getBottomRight", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UniBadgeStraightCorners {
    private final boolean bottomLeft;
    private final boolean bottomRight;
    private final boolean topLeft;
    private final boolean topRight;

    public UniBadgeStraightCorners() {
        this(false, false, false, false, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniBadgeStraightCorners)) {
            return false;
        }
        UniBadgeStraightCorners uniBadgeStraightCorners = (UniBadgeStraightCorners) other;
        return this.topLeft == uniBadgeStraightCorners.topLeft && this.topRight == uniBadgeStraightCorners.topRight && this.bottomLeft == uniBadgeStraightCorners.bottomLeft && this.bottomRight == uniBadgeStraightCorners.bottomRight;
    }

    public final boolean getBottomLeft() {
        return this.bottomLeft;
    }

    public final boolean getBottomRight() {
        return this.bottomRight;
    }

    public final boolean getTopLeft() {
        return this.topLeft;
    }

    public final boolean getTopRight() {
        return this.topRight;
    }

    public int hashCode() {
        return Boolean.hashCode(this.bottomRight) + C3532b.a(C3532b.a(Boolean.hashCode(this.topLeft) * 31, 31, this.topRight), 31, this.bottomLeft);
    }

    @NotNull
    public String toString() {
        boolean z11 = this.topLeft;
        boolean z12 = this.topRight;
        boolean z13 = this.bottomLeft;
        boolean z14 = this.bottomRight;
        StringBuilder d11 = a.d("UniBadgeStraightCorners(topLeft=", ", topRight=", ", bottomLeft=", z11, z12);
        d11.append(z13);
        d11.append(", bottomRight=");
        d11.append(z14);
        d11.append(")");
        return d11.toString();
    }

    public UniBadgeStraightCorners(boolean z11, boolean z12, boolean z13, boolean z14) {
        this.topLeft = z11;
        this.topRight = z12;
        this.bottomLeft = z13;
        this.bottomRight = z14;
    }

    public /* synthetic */ UniBadgeStraightCorners(boolean z11, boolean z12, boolean z13, boolean z14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13, (i11 & 8) != 0 ? false : z14);
    }
}
