package ru.ozon.uni.android.ds.compose.component.button;

import B90.C2616s;
import K1.T;
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
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b,\u0010)R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b-\u0010)R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b.\u0010)R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b2\u00101R\u0017\u0010\u0010\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b3\u00101R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\b7\u00106R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/button/DsButtonStyle;", "", "LK1/T;", "titleTextStyle", "subtitleTextStyle", "dataTextStyle", "Ll1/Z;", "backgroundColor", "titleTextColor", "subtitleTextColor", "iconColor", "dataBackgroundColor", "dataTextColor", "LZ1/h;", "height", "cornerRadius", "dataCornerRadius", "Lu0/x;", "contentPadding", "dataContentPadding", "Ll1/Q;", "backgroundGradient", "<init>", "(LK1/T;LK1/T;LK1/T;JJJJJJFFFLu0/x;Lu0/x;Ll1/Q;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LK1/T;", "getTitleTextStyle", "()LK1/T;", "getSubtitleTextStyle", "getDataTextStyle", "J", "getBackgroundColor-0d7_KjU", "()J", "getTitleTextColor-0d7_KjU", "getSubtitleTextColor-0d7_KjU", "getIconColor-0d7_KjU", "getDataBackgroundColor-0d7_KjU", "getDataTextColor-0d7_KjU", "F", "getHeight-D9Ej5fM", "()F", "getCornerRadius-D9Ej5fM", "getDataCornerRadius-D9Ej5fM", "Lu0/x;", "getContentPadding", "()Lu0/x;", "getDataContentPadding", "Ll1/Q;", "getBackgroundGradient", "()Ll1/Q;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DsButtonStyle {
    private final long backgroundColor;
    private final AbstractC7799Q backgroundGradient;

    @NotNull
    private final InterfaceC9914x contentPadding;
    private final float cornerRadius;
    private final long dataBackgroundColor;

    @NotNull
    private final InterfaceC9914x dataContentPadding;
    private final float dataCornerRadius;
    private final long dataTextColor;

    @NotNull
    private final T dataTextStyle;
    private final float height;
    private final long iconColor;
    private final long subtitleTextColor;

    @NotNull
    private final T subtitleTextStyle;
    private final long titleTextColor;

    @NotNull
    private final T titleTextStyle;

    public /* synthetic */ DsButtonStyle(T t2, T t11, T t12, long j11, long j12, long j13, long j14, long j15, long j16, float f7, float f11, float f12, InterfaceC9914x interfaceC9914x, InterfaceC9914x interfaceC9914x2, AbstractC7799Q abstractC7799Q, DefaultConstructorMarker defaultConstructorMarker) {
        this(t2, t11, t12, j11, j12, j13, j14, j15, j16, f7, f11, f12, interfaceC9914x, interfaceC9914x2, abstractC7799Q);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DsButtonStyle)) {
            return false;
        }
        DsButtonStyle dsButtonStyle = (DsButtonStyle) other;
        return Intrinsics.d(this.titleTextStyle, dsButtonStyle.titleTextStyle) && Intrinsics.d(this.subtitleTextStyle, dsButtonStyle.subtitleTextStyle) && Intrinsics.d(this.dataTextStyle, dsButtonStyle.dataTextStyle) && C7807Z.p(this.backgroundColor, dsButtonStyle.backgroundColor) && C7807Z.p(this.titleTextColor, dsButtonStyle.titleTextColor) && C7807Z.p(this.subtitleTextColor, dsButtonStyle.subtitleTextColor) && C7807Z.p(this.iconColor, dsButtonStyle.iconColor) && C7807Z.p(this.dataBackgroundColor, dsButtonStyle.dataBackgroundColor) && C7807Z.p(this.dataTextColor, dsButtonStyle.dataTextColor) && h.b(this.height, dsButtonStyle.height) && h.b(this.cornerRadius, dsButtonStyle.cornerRadius) && h.b(this.dataCornerRadius, dsButtonStyle.dataCornerRadius) && Intrinsics.d(this.contentPadding, dsButtonStyle.contentPadding) && Intrinsics.d(this.dataContentPadding, dsButtonStyle.dataContentPadding) && Intrinsics.d(this.backgroundGradient, dsButtonStyle.backgroundGradient);
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    public final AbstractC7799Q getBackgroundGradient() {
        return this.backgroundGradient;
    }

    @NotNull
    public final InterfaceC9914x getContentPadding() {
        return this.contentPadding;
    }

    /* renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: getDataBackgroundColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDataBackgroundColor() {
        return this.dataBackgroundColor;
    }

    @NotNull
    public final InterfaceC9914x getDataContentPadding() {
        return this.dataContentPadding;
    }

    /* renamed from: getDataCornerRadius-D9Ej5fM, reason: not valid java name and from getter */
    public final float getDataCornerRadius() {
        return this.dataCornerRadius;
    }

    /* renamed from: getDataTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDataTextColor() {
        return this.dataTextColor;
    }

    @NotNull
    public final T getDataTextStyle() {
        return this.dataTextStyle;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getHeight() {
        return this.height;
    }

    /* renamed from: getIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getIconColor() {
        return this.iconColor;
    }

    /* renamed from: getSubtitleTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSubtitleTextColor() {
        return this.subtitleTextColor;
    }

    @NotNull
    public final T getSubtitleTextStyle() {
        return this.subtitleTextStyle;
    }

    /* renamed from: getTitleTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTitleTextColor() {
        return this.titleTextColor;
    }

    @NotNull
    public final T getTitleTextStyle() {
        return this.titleTextStyle;
    }

    public int hashCode() {
        int a11 = C2616s.a(C2616s.a(this.titleTextStyle.hashCode() * 31, 31, this.subtitleTextStyle), 31, this.dataTextStyle);
        long j11 = this.backgroundColor;
        int i11 = C7807Z.f72260n;
        C.Companion companion = C.INSTANCE;
        int hashCode = (this.dataContentPadding.hashCode() + ((this.contentPadding.hashCode() + b.a(this.dataCornerRadius, b.a(this.cornerRadius, b.a(this.height, c.a(c.a(c.a(c.a(c.a(c.a(a11, 31, j11), 31, this.titleTextColor), 31, this.subtitleTextColor), 31, this.iconColor), 31, this.dataBackgroundColor), 31, this.dataTextColor), 31), 31), 31)) * 31)) * 31;
        AbstractC7799Q abstractC7799Q = this.backgroundGradient;
        return hashCode + (abstractC7799Q == null ? 0 : abstractC7799Q.hashCode());
    }

    @NotNull
    public String toString() {
        T t2 = this.titleTextStyle;
        T t11 = this.subtitleTextStyle;
        T t12 = this.dataTextStyle;
        String v11 = C7807Z.v(this.backgroundColor);
        String v12 = C7807Z.v(this.titleTextColor);
        String v13 = C7807Z.v(this.subtitleTextColor);
        String v14 = C7807Z.v(this.iconColor);
        String v15 = C7807Z.v(this.dataBackgroundColor);
        String v16 = C7807Z.v(this.dataTextColor);
        String c11 = h.c(this.height);
        String c12 = h.c(this.cornerRadius);
        String c13 = h.c(this.dataCornerRadius);
        InterfaceC9914x interfaceC9914x = this.contentPadding;
        InterfaceC9914x interfaceC9914x2 = this.dataContentPadding;
        AbstractC7799Q abstractC7799Q = this.backgroundGradient;
        StringBuilder sb2 = new StringBuilder("DsButtonStyle(titleTextStyle=");
        sb2.append(t2);
        sb2.append(", subtitleTextStyle=");
        sb2.append(t11);
        sb2.append(", dataTextStyle=");
        sb2.append(t12);
        sb2.append(", backgroundColor=");
        sb2.append(v11);
        sb2.append(", titleTextColor=");
        a.h(sb2, v12, ", subtitleTextColor=", v13, ", iconColor=");
        a.h(sb2, v14, ", dataBackgroundColor=", v15, ", dataTextColor=");
        a.h(sb2, v16, ", height=", c11, ", cornerRadius=");
        a.h(sb2, c12, ", dataCornerRadius=", c13, ", contentPadding=");
        sb2.append(interfaceC9914x);
        sb2.append(", dataContentPadding=");
        sb2.append(interfaceC9914x2);
        sb2.append(", backgroundGradient=");
        sb2.append(abstractC7799Q);
        sb2.append(")");
        return sb2.toString();
    }

    private DsButtonStyle(T titleTextStyle, T subtitleTextStyle, T dataTextStyle, long j11, long j12, long j13, long j14, long j15, long j16, float f7, float f11, float f12, InterfaceC9914x contentPadding, InterfaceC9914x dataContentPadding, AbstractC7799Q abstractC7799Q) {
        Intrinsics.checkNotNullParameter(titleTextStyle, "titleTextStyle");
        Intrinsics.checkNotNullParameter(subtitleTextStyle, "subtitleTextStyle");
        Intrinsics.checkNotNullParameter(dataTextStyle, "dataTextStyle");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(dataContentPadding, "dataContentPadding");
        this.titleTextStyle = titleTextStyle;
        this.subtitleTextStyle = subtitleTextStyle;
        this.dataTextStyle = dataTextStyle;
        this.backgroundColor = j11;
        this.titleTextColor = j12;
        this.subtitleTextColor = j13;
        this.iconColor = j14;
        this.dataBackgroundColor = j15;
        this.dataTextColor = j16;
        this.height = f7;
        this.cornerRadius = f11;
        this.dataCornerRadius = f12;
        this.contentPadding = contentPadding;
        this.dataContentPadding = dataContentPadding;
        this.backgroundGradient = abstractC7799Q;
    }
}
