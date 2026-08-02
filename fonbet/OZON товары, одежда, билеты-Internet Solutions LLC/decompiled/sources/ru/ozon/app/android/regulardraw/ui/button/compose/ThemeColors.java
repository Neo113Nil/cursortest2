package ru.ozon.app.android.regulardraw.ui.button.compose;

import C.o0;
import N3.C3660k;
import Nh.a;
import Pk0.c;
import Sc.C;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/regulardraw/ui/button/compose/ThemeColors;", "", "Ll1/Z;", "buttonColor", "lightShadowColor", "darkShadowColor1", "darkShadowColor2", "textColor", "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getButtonColor-0d7_KjU", "()J", "getLightShadowColor-0d7_KjU", "getDarkShadowColor1-0d7_KjU", "getDarkShadowColor2-0d7_KjU", "getTextColor-0d7_KjU", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* data */ class ThemeColors {
    private final long buttonColor;
    private final long darkShadowColor1;
    private final long darkShadowColor2;
    private final long lightShadowColor;
    private final long textColor;

    public /* synthetic */ ThemeColors(long j11, long j12, long j13, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, j15);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThemeColors)) {
            return false;
        }
        ThemeColors themeColors = (ThemeColors) other;
        return C7807Z.p(this.buttonColor, themeColors.buttonColor) && C7807Z.p(this.lightShadowColor, themeColors.lightShadowColor) && C7807Z.p(this.darkShadowColor1, themeColors.darkShadowColor1) && C7807Z.p(this.darkShadowColor2, themeColors.darkShadowColor2) && C7807Z.p(this.textColor, themeColors.textColor);
    }

    /* renamed from: getButtonColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getButtonColor() {
        return this.buttonColor;
    }

    /* renamed from: getDarkShadowColor1-0d7_KjU, reason: not valid java name and from getter */
    public final long getDarkShadowColor1() {
        return this.darkShadowColor1;
    }

    /* renamed from: getDarkShadowColor2-0d7_KjU, reason: not valid java name and from getter */
    public final long getDarkShadowColor2() {
        return this.darkShadowColor2;
    }

    /* renamed from: getLightShadowColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getLightShadowColor() {
        return this.lightShadowColor;
    }

    /* renamed from: getTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        long j11 = this.buttonColor;
        int i11 = C7807Z.f72260n;
        C.Companion companion = C.INSTANCE;
        return Long.hashCode(this.textColor) + c.a(c.a(c.a(Long.hashCode(j11) * 31, 31, this.lightShadowColor), 31, this.darkShadowColor1), 31, this.darkShadowColor2);
    }

    @NotNull
    public String toString() {
        String v11 = C7807Z.v(this.buttonColor);
        String v12 = C7807Z.v(this.lightShadowColor);
        String v13 = C7807Z.v(this.darkShadowColor1);
        String v14 = C7807Z.v(this.darkShadowColor2);
        String v15 = C7807Z.v(this.textColor);
        StringBuilder d11 = C3660k.d("ThemeColors(buttonColor=", v11, ", lightShadowColor=", v12, ", darkShadowColor1=");
        a.h(d11, v13, ", darkShadowColor2=", v14, ", textColor=");
        return o0.c(d11, v15, ")");
    }

    private ThemeColors(long j11, long j12, long j13, long j14, long j15) {
        this.buttonColor = j11;
        this.lightShadowColor = j12;
        this.darkShadowColor1 = j13;
        this.darkShadowColor2 = j14;
        this.textColor = j15;
    }
}
