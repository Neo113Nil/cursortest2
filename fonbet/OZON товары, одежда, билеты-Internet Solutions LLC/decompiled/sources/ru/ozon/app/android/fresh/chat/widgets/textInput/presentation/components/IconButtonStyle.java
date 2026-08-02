package ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.components;

import C.o0;
import N3.C3660k;
import Nh.a;
import Pk0.b;
import Pk0.c;
import S0.InterfaceC3967k;
import Sc.C;
import Z1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b!\u0010\u001e¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/IconButtonStyle;", "", "LZ1/h;", "iconSize", "loaderWidth", "iconMargin", "Ll1/Z;", "focusedColor", "unfocusedColor", "backgroundFocusedColor", "backgroundUnfocusedColor", "<init>", "(FFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getIconSize-D9Ej5fM", "()F", "getLoaderWidth-D9Ej5fM", "getIconMargin-D9Ej5fM", "J", "getFocusedColor-0d7_KjU", "()J", "getUnfocusedColor-0d7_KjU", "getBackgroundFocusedColor-0d7_KjU", "getBackgroundUnfocusedColor-0d7_KjU", "Companion", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class IconButtonStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long backgroundFocusedColor;
    private final long backgroundUnfocusedColor;
    private final long focusedColor;
    private final float iconMargin;
    private final float iconSize;
    private final float loaderWidth;
    private final long unfocusedColor;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/IconButtonStyle$Companion;", "", "<init>", "()V", "LZ1/h;", "iconSize", "loaderWidth", "iconMargin", "Ll1/Z;", "focusedColor", "unfocusedColor", "backgroundFocusedColor", "backgroundUnfocusedColor", "Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/IconButtonStyle;", "createDefaultFreshStyle-qCw55Ws", "(FFFJJJJLS0/k;II)Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/IconButtonStyle;", "createDefaultFreshStyle", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: createDefaultFreshStyle-qCw55Ws, reason: not valid java name */
        public final IconButtonStyle m730createDefaultFreshStyleqCw55Ws(float f7, float f11, float f12, long j11, long j12, long j13, long j14, InterfaceC3967k interfaceC3967k, int i11, int i12) {
            interfaceC3967k.o(-488712357);
            IconButtonStyle iconButtonStyle = new IconButtonStyle((i12 & 1) != 0 ? 16 : f7, (i12 & 2) != 0 ? 2 : f11, (i12 & 4) != 0 ? 8 : f12, (i12 & 8) != 0 ? UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getGraphicLightKey() : j11, (i12 & 16) != 0 ? UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getGraphicFresh() : j12, (i12 & 32) != 0 ? UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getGraphicFresh() : j13, (i12 & 64) != 0 ? UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getBgSecondary() : j14, null);
            interfaceC3967k.k();
            return iconButtonStyle;
        }

        private Companion() {
        }
    }

    public /* synthetic */ IconButtonStyle(float f7, float f11, float f12, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f7, f11, f12, j11, j12, j13, j14);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconButtonStyle)) {
            return false;
        }
        IconButtonStyle iconButtonStyle = (IconButtonStyle) other;
        return h.b(this.iconSize, iconButtonStyle.iconSize) && h.b(this.loaderWidth, iconButtonStyle.loaderWidth) && h.b(this.iconMargin, iconButtonStyle.iconMargin) && C7807Z.p(this.focusedColor, iconButtonStyle.focusedColor) && C7807Z.p(this.unfocusedColor, iconButtonStyle.unfocusedColor) && C7807Z.p(this.backgroundFocusedColor, iconButtonStyle.backgroundFocusedColor) && C7807Z.p(this.backgroundUnfocusedColor, iconButtonStyle.backgroundUnfocusedColor);
    }

    /* renamed from: getBackgroundFocusedColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundFocusedColor() {
        return this.backgroundFocusedColor;
    }

    /* renamed from: getBackgroundUnfocusedColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundUnfocusedColor() {
        return this.backgroundUnfocusedColor;
    }

    /* renamed from: getFocusedColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getFocusedColor() {
        return this.focusedColor;
    }

    /* renamed from: getIconMargin-D9Ej5fM, reason: not valid java name and from getter */
    public final float getIconMargin() {
        return this.iconMargin;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name and from getter */
    public final float getIconSize() {
        return this.iconSize;
    }

    /* renamed from: getLoaderWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getLoaderWidth() {
        return this.loaderWidth;
    }

    /* renamed from: getUnfocusedColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnfocusedColor() {
        return this.unfocusedColor;
    }

    public int hashCode() {
        int a11 = b.a(this.iconMargin, b.a(this.loaderWidth, Float.hashCode(this.iconSize) * 31, 31), 31);
        long j11 = this.focusedColor;
        int i11 = C7807Z.f72260n;
        C.Companion companion = C.INSTANCE;
        return Long.hashCode(this.backgroundUnfocusedColor) + c.a(c.a(c.a(a11, 31, j11), 31, this.unfocusedColor), 31, this.backgroundFocusedColor);
    }

    @NotNull
    public String toString() {
        String c11 = h.c(this.iconSize);
        String c12 = h.c(this.loaderWidth);
        String c13 = h.c(this.iconMargin);
        String v11 = C7807Z.v(this.focusedColor);
        String v12 = C7807Z.v(this.unfocusedColor);
        String v13 = C7807Z.v(this.backgroundFocusedColor);
        String v14 = C7807Z.v(this.backgroundUnfocusedColor);
        StringBuilder d11 = C3660k.d("IconButtonStyle(iconSize=", c11, ", loaderWidth=", c12, ", iconMargin=");
        a.h(d11, c13, ", focusedColor=", v11, ", unfocusedColor=");
        a.h(d11, v12, ", backgroundFocusedColor=", v13, ", backgroundUnfocusedColor=");
        return o0.c(d11, v14, ")");
    }

    private IconButtonStyle(float f7, float f11, float f12, long j11, long j12, long j13, long j14) {
        this.iconSize = f7;
        this.loaderWidth = f11;
        this.iconMargin = f12;
        this.focusedColor = j11;
        this.unfocusedColor = j12;
        this.backgroundFocusedColor = j13;
        this.backgroundUnfocusedColor = j14;
    }
}
