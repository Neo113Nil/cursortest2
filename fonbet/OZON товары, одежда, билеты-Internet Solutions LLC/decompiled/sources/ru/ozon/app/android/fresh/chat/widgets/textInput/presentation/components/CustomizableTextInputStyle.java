package ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.components;

import B0.C2454a;
import B90.C2616s;
import C.o0;
import K1.T;
import N3.C3660k;
import Nh.a;
import Pk0.b;
import Pk0.c;
import S0.InterfaceC3967k;
import Sc.C;
import Z1.h;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u0000 22\u00020\u0001:\u00012Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b*\u0010)R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b+\u0010 R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b,\u0010 R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b-\u0010)R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b.\u0010)R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b/\u0010)R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b0\u0010 R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b1\u0010 ¨\u00063"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/CustomizableTextInputStyle;", "", "Ll1/Z;", "backgroundColor", "", "maxLines", "LK1/T;", "textStyle", "placeholderStyle", "LZ1/h;", "textBoxRadius", "borderWidth", "borderFocusedColor", "borderUnfocusedColor", "textHorizontalPadding", "textVerticalPadding", "textBlurHeight", "textBlurColor", "textCursorColor", "<init>", "(JILK1/T;LK1/T;FFJJFFFJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getBackgroundColor-0d7_KjU", "()J", "I", "getMaxLines", "LK1/T;", "getTextStyle", "()LK1/T;", "getPlaceholderStyle", "F", "getTextBoxRadius-D9Ej5fM", "()F", "getBorderWidth-D9Ej5fM", "getBorderFocusedColor-0d7_KjU", "getBorderUnfocusedColor-0d7_KjU", "getTextHorizontalPadding-D9Ej5fM", "getTextVerticalPadding-D9Ej5fM", "getTextBlurHeight-D9Ej5fM", "getTextBlurColor-0d7_KjU", "getTextCursorColor-0d7_KjU", "Companion", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CustomizableTextInputStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long backgroundColor;
    private final long borderFocusedColor;
    private final long borderUnfocusedColor;
    private final float borderWidth;
    private final int maxLines;

    @NotNull
    private final T placeholderStyle;
    private final long textBlurColor;
    private final float textBlurHeight;
    private final float textBoxRadius;
    private final long textCursorColor;
    private final float textHorizontalPadding;

    @NotNull
    private final T textStyle;
    private final float textVerticalPadding;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0091\u0001\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/CustomizableTextInputStyle$Companion;", "", "<init>", "()V", "Ll1/Z;", "backgroundColor", "", "maxLines", "LK1/T;", "textStyle", "placeholderStyle", "LZ1/h;", "textBoxRadius", "borderWidth", "borderFocusedColor", "borderUnfocusedColor", "textHorizontalPadding", "textVerticalPadding", "textBlurHeight", "textBlurColor", "textCursorColor", "Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/CustomizableTextInputStyle;", "createDefaultFreshStyle-mVkhe_I", "(JILK1/T;LK1/T;FFJJFFFJJLS0/k;III)Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/CustomizableTextInputStyle;", "createDefaultFreshStyle", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: createDefaultFreshStyle-mVkhe_I, reason: not valid java name */
        public final CustomizableTextInputStyle m722createDefaultFreshStylemVkhe_I(long j11, int i11, T t2, T t11, float f7, float f11, long j12, long j13, float f12, float f13, float f14, long j14, long j15, InterfaceC3967k interfaceC3967k, int i12, int i13, int i14) {
            T t12;
            T t13;
            interfaceC3967k.o(-1262307314);
            long layerFloor2 = (i14 & 1) != 0 ? UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getLayerFloor2() : j11;
            int i15 = (i14 & 2) != 0 ? 4 : i11;
            if ((i14 & 4) != 0) {
                UniTheme uniTheme = UniTheme.INSTANCE;
                t12 = T.c(uniTheme.getTypography().getBodyControl500Medium(), uniTheme.getColors(interfaceC3967k, UniTheme.$stable).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214);
            } else {
                t12 = t2;
            }
            if ((i14 & 8) != 0) {
                UniTheme uniTheme2 = UniTheme.INSTANCE;
                t13 = T.c(uniTheme2.getTypography().getBodyControl500Medium(), uniTheme2.getColors(interfaceC3967k, UniTheme.$stable).getTextTertiary(), 0L, null, null, null, 0L, null, null, 0L, null, null, 16777214);
            } else {
                t13 = t11;
            }
            CustomizableTextInputStyle customizableTextInputStyle = new CustomizableTextInputStyle(layerFloor2, i15, t12, t13, (i14 & 16) != 0 ? 24 : f7, (i14 & 32) != 0 ? 2 : f11, (i14 & 64) != 0 ? UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getGraphicFresh() : j12, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getClearDarkKey300() : j13, (i14 & 256) != 0 ? 12 : f12, (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 10 : f13, (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? 52 : f14, (i14 & 2048) != 0 ? UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getLayerFloor2() : j14, (i14 & 4096) != 0 ? UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getGraphicFresh() : j15, null);
            interfaceC3967k.k();
            return customizableTextInputStyle;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CustomizableTextInputStyle(long j11, int i11, T t2, T t11, float f7, float f11, long j12, long j13, float f12, float f13, float f14, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, i11, t2, t11, f7, f11, j12, j13, f12, f13, f14, j14, j15);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomizableTextInputStyle)) {
            return false;
        }
        CustomizableTextInputStyle customizableTextInputStyle = (CustomizableTextInputStyle) other;
        return C7807Z.p(this.backgroundColor, customizableTextInputStyle.backgroundColor) && this.maxLines == customizableTextInputStyle.maxLines && Intrinsics.d(this.textStyle, customizableTextInputStyle.textStyle) && Intrinsics.d(this.placeholderStyle, customizableTextInputStyle.placeholderStyle) && h.b(this.textBoxRadius, customizableTextInputStyle.textBoxRadius) && h.b(this.borderWidth, customizableTextInputStyle.borderWidth) && C7807Z.p(this.borderFocusedColor, customizableTextInputStyle.borderFocusedColor) && C7807Z.p(this.borderUnfocusedColor, customizableTextInputStyle.borderUnfocusedColor) && h.b(this.textHorizontalPadding, customizableTextInputStyle.textHorizontalPadding) && h.b(this.textVerticalPadding, customizableTextInputStyle.textVerticalPadding) && h.b(this.textBlurHeight, customizableTextInputStyle.textBlurHeight) && C7807Z.p(this.textBlurColor, customizableTextInputStyle.textBlurColor) && C7807Z.p(this.textCursorColor, customizableTextInputStyle.textCursorColor);
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: getBorderFocusedColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getBorderFocusedColor() {
        return this.borderFocusedColor;
    }

    /* renamed from: getBorderUnfocusedColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getBorderUnfocusedColor() {
        return this.borderUnfocusedColor;
    }

    /* renamed from: getBorderWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBorderWidth() {
        return this.borderWidth;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    @NotNull
    public final T getPlaceholderStyle() {
        return this.placeholderStyle;
    }

    /* renamed from: getTextBlurColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextBlurColor() {
        return this.textBlurColor;
    }

    /* renamed from: getTextBlurHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTextBlurHeight() {
        return this.textBlurHeight;
    }

    /* renamed from: getTextBoxRadius-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTextBoxRadius() {
        return this.textBoxRadius;
    }

    /* renamed from: getTextCursorColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextCursorColor() {
        return this.textCursorColor;
    }

    /* renamed from: getTextHorizontalPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTextHorizontalPadding() {
        return this.textHorizontalPadding;
    }

    @NotNull
    public final T getTextStyle() {
        return this.textStyle;
    }

    /* renamed from: getTextVerticalPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTextVerticalPadding() {
        return this.textVerticalPadding;
    }

    public int hashCode() {
        long j11 = this.backgroundColor;
        int i11 = C7807Z.f72260n;
        C.Companion companion = C.INSTANCE;
        return Long.hashCode(this.textCursorColor) + c.a(b.a(this.textBlurHeight, b.a(this.textVerticalPadding, b.a(this.textHorizontalPadding, c.a(c.a(b.a(this.borderWidth, b.a(this.textBoxRadius, C2616s.a(C2616s.a(C2454a.a(this.maxLines, Long.hashCode(j11) * 31, 31), 31, this.textStyle), 31, this.placeholderStyle), 31), 31), 31, this.borderFocusedColor), 31, this.borderUnfocusedColor), 31), 31), 31), 31, this.textBlurColor);
    }

    @NotNull
    public String toString() {
        String v11 = C7807Z.v(this.backgroundColor);
        int i11 = this.maxLines;
        T t2 = this.textStyle;
        T t11 = this.placeholderStyle;
        String c11 = h.c(this.textBoxRadius);
        String c12 = h.c(this.borderWidth);
        String v12 = C7807Z.v(this.borderFocusedColor);
        String v13 = C7807Z.v(this.borderUnfocusedColor);
        String c13 = h.c(this.textHorizontalPadding);
        String c14 = h.c(this.textVerticalPadding);
        String c15 = h.c(this.textBlurHeight);
        String v14 = C7807Z.v(this.textBlurColor);
        String v15 = C7807Z.v(this.textCursorColor);
        StringBuilder c16 = C3660k.c(i11, "CustomizableTextInputStyle(backgroundColor=", v11, ", maxLines=", ", textStyle=");
        c16.append(t2);
        c16.append(", placeholderStyle=");
        c16.append(t11);
        c16.append(", textBoxRadius=");
        a.h(c16, c11, ", borderWidth=", c12, ", borderFocusedColor=");
        a.h(c16, v12, ", borderUnfocusedColor=", v13, ", textHorizontalPadding=");
        a.h(c16, c13, ", textVerticalPadding=", c14, ", textBlurHeight=");
        a.h(c16, c15, ", textBlurColor=", v14, ", textCursorColor=");
        return o0.c(c16, v15, ")");
    }

    private CustomizableTextInputStyle(long j11, int i11, T textStyle, T placeholderStyle, float f7, float f11, long j12, long j13, float f12, float f13, float f14, long j14, long j15) {
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(placeholderStyle, "placeholderStyle");
        this.backgroundColor = j11;
        this.maxLines = i11;
        this.textStyle = textStyle;
        this.placeholderStyle = placeholderStyle;
        this.textBoxRadius = f7;
        this.borderWidth = f11;
        this.borderFocusedColor = j12;
        this.borderUnfocusedColor = j13;
        this.textHorizontalPadding = f12;
        this.textVerticalPadding = f13;
        this.textBlurHeight = f14;
        this.textBlurColor = j14;
        this.textCursorColor = j15;
    }
}
