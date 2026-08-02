package ru.ozon.uni.android.ds.compose.component.button;

import N3.C3660k;
import Nh.a;
import Pk0.b;
import Pk0.c;
import Sc.C;
import Z1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonStyle;", "", "Ll1/Z;", "backgroundColor", "iconColor", "LZ1/h;", "size", "cornerRadius", "Ll1/Q;", "iconGradientBrush", "backgroundGradient", "<init>", "(JJFFLl1/Q;Ll1/Q;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getBackgroundColor-0d7_KjU", "()J", "getIconColor-0d7_KjU", "F", "getSize-D9Ej5fM", "()F", "getCornerRadius-D9Ej5fM", "Ll1/Q;", "getIconGradientBrush", "()Ll1/Q;", "getBackgroundGradient", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DsIconButtonStyle {
    private final long backgroundColor;
    private final AbstractC7799Q backgroundGradient;
    private final float cornerRadius;
    private final long iconColor;
    private final AbstractC7799Q iconGradientBrush;
    private final float size;

    public /* synthetic */ DsIconButtonStyle(long j11, long j12, float f7, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, f7, f11);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DsIconButtonStyle)) {
            return false;
        }
        DsIconButtonStyle dsIconButtonStyle = (DsIconButtonStyle) other;
        return C7807Z.p(this.backgroundColor, dsIconButtonStyle.backgroundColor) && C7807Z.p(this.iconColor, dsIconButtonStyle.iconColor) && h.b(this.size, dsIconButtonStyle.size) && h.b(this.cornerRadius, dsIconButtonStyle.cornerRadius) && Intrinsics.d(this.iconGradientBrush, dsIconButtonStyle.iconGradientBrush) && Intrinsics.d(this.backgroundGradient, dsIconButtonStyle.backgroundGradient);
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    public final AbstractC7799Q getBackgroundGradient() {
        return this.backgroundGradient;
    }

    /* renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: getIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getIconColor() {
        return this.iconColor;
    }

    public final AbstractC7799Q getIconGradientBrush() {
        return this.iconGradientBrush;
    }

    /* renamed from: getSize-D9Ej5fM, reason: not valid java name and from getter */
    public final float getSize() {
        return this.size;
    }

    public int hashCode() {
        long j11 = this.backgroundColor;
        int i11 = C7807Z.f72260n;
        C.Companion companion = C.INSTANCE;
        int a11 = b.a(this.cornerRadius, b.a(this.size, c.a(Long.hashCode(j11) * 31, 31, this.iconColor), 31), 31);
        AbstractC7799Q abstractC7799Q = this.iconGradientBrush;
        int hashCode = (a11 + (abstractC7799Q == null ? 0 : abstractC7799Q.hashCode())) * 31;
        AbstractC7799Q abstractC7799Q2 = this.backgroundGradient;
        return hashCode + (abstractC7799Q2 != null ? abstractC7799Q2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String v11 = C7807Z.v(this.backgroundColor);
        String v12 = C7807Z.v(this.iconColor);
        String c11 = h.c(this.size);
        String c12 = h.c(this.cornerRadius);
        AbstractC7799Q abstractC7799Q = this.iconGradientBrush;
        AbstractC7799Q abstractC7799Q2 = this.backgroundGradient;
        StringBuilder d11 = C3660k.d("DsIconButtonStyle(backgroundColor=", v11, ", iconColor=", v12, ", size=");
        a.h(d11, c11, ", cornerRadius=", c12, ", iconGradientBrush=");
        d11.append(abstractC7799Q);
        d11.append(", backgroundGradient=");
        d11.append(abstractC7799Q2);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ DsIconButtonStyle(long j11, long j12, float f7, float f11, AbstractC7799Q abstractC7799Q, AbstractC7799Q abstractC7799Q2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, f7, f11, abstractC7799Q, abstractC7799Q2);
    }

    private DsIconButtonStyle(long j11, long j12, float f7, float f11, AbstractC7799Q abstractC7799Q, AbstractC7799Q abstractC7799Q2) {
        this.backgroundColor = j11;
        this.iconColor = j12;
        this.size = f7;
        this.cornerRadius = f11;
        this.iconGradientBrush = abstractC7799Q;
        this.backgroundGradient = abstractC7799Q2;
    }

    public /* synthetic */ DsIconButtonStyle(long j11, long j12, float f7, float f11, AbstractC7799Q abstractC7799Q, AbstractC7799Q abstractC7799Q2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, f7, f11, abstractC7799Q, (i11 & 32) != 0 ? null : abstractC7799Q2, null);
    }

    private DsIconButtonStyle(long j11, long j12, float f7, float f11) {
        this(j11, j12, f7, f11, null, null, null);
    }
}
