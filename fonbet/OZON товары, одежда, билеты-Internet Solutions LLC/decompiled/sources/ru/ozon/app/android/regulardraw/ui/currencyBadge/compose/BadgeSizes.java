package ru.ozon.app.android.regulardraw.ui.currencyBadge.compose;

import K1.T;
import N3.C3660k;
import Nh.a;
import Pk0.b;
import Z1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0082\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/regulardraw/ui/currencyBadge/compose/BadgeSizes;", "", "LZ1/h;", "rightImageWidth", "rightImageHeight", "badgeHeight", "leftPadding", "horizontalPadding", "bgRadius", "LK1/T;", "textStyle", "<init>", "(FFFFFFLK1/T;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getRightImageWidth-D9Ej5fM", "()F", "getRightImageHeight-D9Ej5fM", "getBadgeHeight-D9Ej5fM", "getLeftPadding-D9Ej5fM", "getHorizontalPadding-D9Ej5fM", "getBgRadius-D9Ej5fM", "LK1/T;", "getTextStyle", "()LK1/T;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* data */ class BadgeSizes {
    private final float badgeHeight;
    private final float bgRadius;
    private final float horizontalPadding;
    private final float leftPadding;
    private final float rightImageHeight;
    private final float rightImageWidth;

    @NotNull
    private final T textStyle;

    public /* synthetic */ BadgeSizes(float f7, float f11, float f12, float f13, float f14, float f15, T t2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f7, f11, f12, f13, f14, f15, t2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgeSizes)) {
            return false;
        }
        BadgeSizes badgeSizes = (BadgeSizes) other;
        return h.b(this.rightImageWidth, badgeSizes.rightImageWidth) && h.b(this.rightImageHeight, badgeSizes.rightImageHeight) && h.b(this.badgeHeight, badgeSizes.badgeHeight) && h.b(this.leftPadding, badgeSizes.leftPadding) && h.b(this.horizontalPadding, badgeSizes.horizontalPadding) && h.b(this.bgRadius, badgeSizes.bgRadius) && Intrinsics.d(this.textStyle, badgeSizes.textStyle);
    }

    /* renamed from: getBadgeHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBadgeHeight() {
        return this.badgeHeight;
    }

    /* renamed from: getBgRadius-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBgRadius() {
        return this.bgRadius;
    }

    /* renamed from: getHorizontalPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getHorizontalPadding() {
        return this.horizontalPadding;
    }

    /* renamed from: getLeftPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getLeftPadding() {
        return this.leftPadding;
    }

    /* renamed from: getRightImageHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getRightImageHeight() {
        return this.rightImageHeight;
    }

    /* renamed from: getRightImageWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getRightImageWidth() {
        return this.rightImageWidth;
    }

    @NotNull
    public final T getTextStyle() {
        return this.textStyle;
    }

    public int hashCode() {
        return this.textStyle.hashCode() + b.a(this.bgRadius, b.a(this.horizontalPadding, b.a(this.leftPadding, b.a(this.badgeHeight, b.a(this.rightImageHeight, Float.hashCode(this.rightImageWidth) * 31, 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String c11 = h.c(this.rightImageWidth);
        String c12 = h.c(this.rightImageHeight);
        String c13 = h.c(this.badgeHeight);
        String c14 = h.c(this.leftPadding);
        String c15 = h.c(this.horizontalPadding);
        String c16 = h.c(this.bgRadius);
        T t2 = this.textStyle;
        StringBuilder d11 = C3660k.d("BadgeSizes(rightImageWidth=", c11, ", rightImageHeight=", c12, ", badgeHeight=");
        a.h(d11, c13, ", leftPadding=", c14, ", horizontalPadding=");
        a.h(d11, c15, ", bgRadius=", c16, ", textStyle=");
        d11.append(t2);
        d11.append(")");
        return d11.toString();
    }

    private BadgeSizes(float f7, float f11, float f12, float f13, float f14, float f15, T textStyle) {
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        this.rightImageWidth = f7;
        this.rightImageHeight = f11;
        this.badgeHeight = f12;
        this.leftPadding = f13;
        this.horizontalPadding = f14;
        this.bgRadius = f15;
        this.textStyle = textStyle;
    }
}
