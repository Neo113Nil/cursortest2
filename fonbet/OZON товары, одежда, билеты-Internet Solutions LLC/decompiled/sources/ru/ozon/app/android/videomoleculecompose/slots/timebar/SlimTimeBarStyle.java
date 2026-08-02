package ru.ozon.app.android.videomoleculecompose.slots.timebar;

import Nh.a;
import Pk0.b;
import Z1.h;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ`\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b%\u0010!R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b&\u0010!R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarStyle;", "", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarColors;", "colors", "LZ1/h;", "barHeight", "scrubbedBarHeight", "touchTargetHeight", "scrubberEnabledSize", "scrubberDraggedSize", "trackCornerRadius", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarGravity;", "gravity", "<init>", "(Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarColors;FFFFFFLru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarGravity;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-B6KfgwU", "(Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarColors;FFFFFFLru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarGravity;)Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarStyle;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarColors;", "getColors", "()Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarColors;", "F", "getBarHeight-D9Ej5fM", "()F", "getScrubbedBarHeight-D9Ej5fM", "getTouchTargetHeight-D9Ej5fM", "getScrubberEnabledSize-D9Ej5fM", "getScrubberDraggedSize-D9Ej5fM", "getTrackCornerRadius-D9Ej5fM", "Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarGravity;", "getGravity", "()Lru/ozon/app/android/videomoleculecompose/slots/timebar/SlimTimeBarGravity;", "videomoleculecompose_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SlimTimeBarStyle {
    private final float barHeight;

    @NotNull
    private final SlimTimeBarColors colors;

    @NotNull
    private final SlimTimeBarGravity gravity;
    private final float scrubbedBarHeight;
    private final float scrubberDraggedSize;
    private final float scrubberEnabledSize;
    private final float touchTargetHeight;
    private final float trackCornerRadius;

    public /* synthetic */ SlimTimeBarStyle(SlimTimeBarColors slimTimeBarColors, float f7, float f11, float f12, float f13, float f14, float f15, SlimTimeBarGravity slimTimeBarGravity, DefaultConstructorMarker defaultConstructorMarker) {
        this(slimTimeBarColors, f7, f11, f12, f13, f14, f15, slimTimeBarGravity);
    }

    /* renamed from: copy-B6KfgwU$default, reason: not valid java name */
    public static /* synthetic */ SlimTimeBarStyle m1568copyB6KfgwU$default(SlimTimeBarStyle slimTimeBarStyle, SlimTimeBarColors slimTimeBarColors, float f7, float f11, float f12, float f13, float f14, float f15, SlimTimeBarGravity slimTimeBarGravity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            slimTimeBarColors = slimTimeBarStyle.colors;
        }
        if ((i11 & 2) != 0) {
            f7 = slimTimeBarStyle.barHeight;
        }
        if ((i11 & 4) != 0) {
            f11 = slimTimeBarStyle.scrubbedBarHeight;
        }
        if ((i11 & 8) != 0) {
            f12 = slimTimeBarStyle.touchTargetHeight;
        }
        if ((i11 & 16) != 0) {
            f13 = slimTimeBarStyle.scrubberEnabledSize;
        }
        if ((i11 & 32) != 0) {
            f14 = slimTimeBarStyle.scrubberDraggedSize;
        }
        if ((i11 & 64) != 0) {
            f15 = slimTimeBarStyle.trackCornerRadius;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            slimTimeBarGravity = slimTimeBarStyle.gravity;
        }
        float f16 = f15;
        SlimTimeBarGravity slimTimeBarGravity2 = slimTimeBarGravity;
        float f17 = f13;
        float f18 = f14;
        return slimTimeBarStyle.m1569copyB6KfgwU(slimTimeBarColors, f7, f11, f12, f17, f18, f16, slimTimeBarGravity2);
    }

    @NotNull
    /* renamed from: copy-B6KfgwU, reason: not valid java name */
    public final SlimTimeBarStyle m1569copyB6KfgwU(@NotNull SlimTimeBarColors colors, float barHeight, float scrubbedBarHeight, float touchTargetHeight, float scrubberEnabledSize, float scrubberDraggedSize, float trackCornerRadius, @NotNull SlimTimeBarGravity gravity) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        return new SlimTimeBarStyle(colors, barHeight, scrubbedBarHeight, touchTargetHeight, scrubberEnabledSize, scrubberDraggedSize, trackCornerRadius, gravity, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlimTimeBarStyle)) {
            return false;
        }
        SlimTimeBarStyle slimTimeBarStyle = (SlimTimeBarStyle) other;
        return Intrinsics.d(this.colors, slimTimeBarStyle.colors) && h.b(this.barHeight, slimTimeBarStyle.barHeight) && h.b(this.scrubbedBarHeight, slimTimeBarStyle.scrubbedBarHeight) && h.b(this.touchTargetHeight, slimTimeBarStyle.touchTargetHeight) && h.b(this.scrubberEnabledSize, slimTimeBarStyle.scrubberEnabledSize) && h.b(this.scrubberDraggedSize, slimTimeBarStyle.scrubberDraggedSize) && h.b(this.trackCornerRadius, slimTimeBarStyle.trackCornerRadius) && this.gravity == slimTimeBarStyle.gravity;
    }

    /* renamed from: getBarHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBarHeight() {
        return this.barHeight;
    }

    @NotNull
    public final SlimTimeBarColors getColors() {
        return this.colors;
    }

    @NotNull
    public final SlimTimeBarGravity getGravity() {
        return this.gravity;
    }

    /* renamed from: getScrubbedBarHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getScrubbedBarHeight() {
        return this.scrubbedBarHeight;
    }

    /* renamed from: getScrubberDraggedSize-D9Ej5fM, reason: not valid java name and from getter */
    public final float getScrubberDraggedSize() {
        return this.scrubberDraggedSize;
    }

    /* renamed from: getScrubberEnabledSize-D9Ej5fM, reason: not valid java name and from getter */
    public final float getScrubberEnabledSize() {
        return this.scrubberEnabledSize;
    }

    /* renamed from: getTouchTargetHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTouchTargetHeight() {
        return this.touchTargetHeight;
    }

    /* renamed from: getTrackCornerRadius-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTrackCornerRadius() {
        return this.trackCornerRadius;
    }

    public int hashCode() {
        return this.gravity.hashCode() + b.a(this.trackCornerRadius, b.a(this.scrubberDraggedSize, b.a(this.scrubberEnabledSize, b.a(this.touchTargetHeight, b.a(this.scrubbedBarHeight, b.a(this.barHeight, this.colors.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        SlimTimeBarColors slimTimeBarColors = this.colors;
        String c11 = h.c(this.barHeight);
        String c12 = h.c(this.scrubbedBarHeight);
        String c13 = h.c(this.touchTargetHeight);
        String c14 = h.c(this.scrubberEnabledSize);
        String c15 = h.c(this.scrubberDraggedSize);
        String c16 = h.c(this.trackCornerRadius);
        SlimTimeBarGravity slimTimeBarGravity = this.gravity;
        StringBuilder sb2 = new StringBuilder("SlimTimeBarStyle(colors=");
        sb2.append(slimTimeBarColors);
        sb2.append(", barHeight=");
        sb2.append(c11);
        sb2.append(", scrubbedBarHeight=");
        a.h(sb2, c12, ", touchTargetHeight=", c13, ", scrubberEnabledSize=");
        a.h(sb2, c14, ", scrubberDraggedSize=", c15, ", trackCornerRadius=");
        sb2.append(c16);
        sb2.append(", gravity=");
        sb2.append(slimTimeBarGravity);
        sb2.append(")");
        return sb2.toString();
    }

    private SlimTimeBarStyle(SlimTimeBarColors colors, float f7, float f11, float f12, float f13, float f14, float f15, SlimTimeBarGravity gravity) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        this.colors = colors;
        this.barHeight = f7;
        this.scrubbedBarHeight = f11;
        this.touchTargetHeight = f12;
        this.scrubberEnabledSize = f13;
        this.scrubberDraggedSize = f14;
        this.trackCornerRadius = f15;
        this.gravity = gravity;
    }
}
