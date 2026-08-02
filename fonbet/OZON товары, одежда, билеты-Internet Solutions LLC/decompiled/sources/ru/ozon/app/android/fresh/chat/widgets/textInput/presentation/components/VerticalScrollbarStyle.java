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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/VerticalScrollbarStyle;", "", "LZ1/h;", "scrollbarWidth", "scrollbarVerticalPadding", "scrollbarHorizontalPadding", "Ll1/Z;", "scrollbarLightColor", "scrollbarDarkColor", "<init>", "(FFFJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getScrollbarWidth-D9Ej5fM", "()F", "getScrollbarVerticalPadding-D9Ej5fM", "getScrollbarHorizontalPadding-D9Ej5fM", "J", "getScrollbarLightColor-0d7_KjU", "()J", "getScrollbarDarkColor-0d7_KjU", "Companion", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class VerticalScrollbarStyle {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long scrollbarDarkColor;
    private final float scrollbarHorizontalPadding;
    private final long scrollbarLightColor;
    private final float scrollbarVerticalPadding;
    private final float scrollbarWidth;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/VerticalScrollbarStyle$Companion;", "", "<init>", "()V", "LZ1/h;", "scrollbarWidth", "scrollbarVerticalPadding", "scrollbarHorizontalPadding", "Ll1/Z;", "scrollbarLightColor", "scrollbarDarkColor", "Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/VerticalScrollbarStyle;", "createDefaultFreshStyle-nbzeIBc", "(FFFJJLS0/k;II)Lru/ozon/app/android/fresh/chat/widgets/textInput/presentation/components/VerticalScrollbarStyle;", "createDefaultFreshStyle", "", "MIN_HEIGHT_PRECENT", "F", "MAX_HEIGHT_PERCENT", "chat_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: createDefaultFreshStyle-nbzeIBc, reason: not valid java name */
        public final VerticalScrollbarStyle m736createDefaultFreshStylenbzeIBc(float f7, float f11, float f12, long j11, long j12, InterfaceC3967k interfaceC3967k, int i11, int i12) {
            interfaceC3967k.o(468184295);
            if ((i12 & 1) != 0) {
                f7 = 6;
            }
            float f13 = f7;
            if ((i12 & 2) != 0) {
                f11 = 0;
            }
            float f14 = f11;
            if ((i12 & 4) != 0) {
                f12 = 5;
            }
            VerticalScrollbarStyle verticalScrollbarStyle = new VerticalScrollbarStyle(f13, f14, f12, (i12 & 8) != 0 ? UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getClearDarkKey300() : j11, (i12 & 16) != 0 ? UniTheme.INSTANCE.getColors(interfaceC3967k, UniTheme.$stable).getClearLightKey300() : j12, null);
            interfaceC3967k.k();
            return verticalScrollbarStyle;
        }

        private Companion() {
        }
    }

    public /* synthetic */ VerticalScrollbarStyle(float f7, float f11, float f12, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(f7, f11, f12, j11, j12);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerticalScrollbarStyle)) {
            return false;
        }
        VerticalScrollbarStyle verticalScrollbarStyle = (VerticalScrollbarStyle) other;
        return h.b(this.scrollbarWidth, verticalScrollbarStyle.scrollbarWidth) && h.b(this.scrollbarVerticalPadding, verticalScrollbarStyle.scrollbarVerticalPadding) && h.b(this.scrollbarHorizontalPadding, verticalScrollbarStyle.scrollbarHorizontalPadding) && C7807Z.p(this.scrollbarLightColor, verticalScrollbarStyle.scrollbarLightColor) && C7807Z.p(this.scrollbarDarkColor, verticalScrollbarStyle.scrollbarDarkColor);
    }

    /* renamed from: getScrollbarDarkColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getScrollbarDarkColor() {
        return this.scrollbarDarkColor;
    }

    /* renamed from: getScrollbarHorizontalPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getScrollbarHorizontalPadding() {
        return this.scrollbarHorizontalPadding;
    }

    /* renamed from: getScrollbarLightColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getScrollbarLightColor() {
        return this.scrollbarLightColor;
    }

    /* renamed from: getScrollbarVerticalPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getScrollbarVerticalPadding() {
        return this.scrollbarVerticalPadding;
    }

    /* renamed from: getScrollbarWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getScrollbarWidth() {
        return this.scrollbarWidth;
    }

    public int hashCode() {
        int a11 = b.a(this.scrollbarHorizontalPadding, b.a(this.scrollbarVerticalPadding, Float.hashCode(this.scrollbarWidth) * 31, 31), 31);
        long j11 = this.scrollbarLightColor;
        int i11 = C7807Z.f72260n;
        C.Companion companion = C.INSTANCE;
        return Long.hashCode(this.scrollbarDarkColor) + c.a(a11, 31, j11);
    }

    @NotNull
    public String toString() {
        String c11 = h.c(this.scrollbarWidth);
        String c12 = h.c(this.scrollbarVerticalPadding);
        String c13 = h.c(this.scrollbarHorizontalPadding);
        String v11 = C7807Z.v(this.scrollbarLightColor);
        String v12 = C7807Z.v(this.scrollbarDarkColor);
        StringBuilder d11 = C3660k.d("VerticalScrollbarStyle(scrollbarWidth=", c11, ", scrollbarVerticalPadding=", c12, ", scrollbarHorizontalPadding=");
        a.h(d11, c13, ", scrollbarLightColor=", v11, ", scrollbarDarkColor=");
        return o0.c(d11, v12, ")");
    }

    private VerticalScrollbarStyle(float f7, float f11, float f12, long j11, long j12) {
        this.scrollbarWidth = f7;
        this.scrollbarVerticalPadding = f11;
        this.scrollbarHorizontalPadding = f12;
        this.scrollbarLightColor = j11;
        this.scrollbarDarkColor = j12;
    }
}
