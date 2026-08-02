package io.intercom.android.sdk.utilities;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ColorExtensions.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0003\u001a\u00020\u0004*\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\n*\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\n*\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\f\u001a\u0013\u0010\u000f\u001a\u00020\n*\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\f\u001a\u0013\u0010\u0011\u001a\u00020\n*\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\f\u001a\u0013\u0010\u0013\u001a\u00020\u0004*\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0006\u001a\u0013\u0010\u0015\u001a\u00020\u0004*\u00020\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0006\u001a\u0013\u0010\u0017\u001a\u00020\u0004*\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0006\u001a\u0013\u0010\u0019\u001a\u00020\n*\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\f\u001a\u001b\u0010\u001b\u001a\u00020\u0004*\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\u001e\u001a\u001e\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\u001cH\u0000\u001a\u0013\u0010\"\u001a\u00020\u0004*\u00020\u0004H\u0000¢\u0006\u0004\b#\u0010\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"BRIGHTNESS_CUTOFF", "", "WHITENESS_CUTOFF", "darken", "Landroidx/compose/ui/graphics/Color;", "darken-8_81llA", "(J)J", "lighten", "lighten-8_81llA", "isDarkColor", "", "isDarkColor-8_81llA", "(J)Z", "isLightColor", "isLightColor-8_81llA", "isWhite", "isWhite-8_81llA", "isBlack", "isBlack-8_81llA", "generateTextColor", "generateTextColor-8_81llA", "getAccessibleBorderColor", "getAccessibleBorderColor-8_81llA", "getAccessibleColorOnWhiteBackground", "getAccessibleColorOnWhiteBackground-8_81llA", "isColorTooWhite", "isColorTooWhite-8_81llA", "toComposeColor", "", ViewProps.OPACITY, "(Ljava/lang/String;F)J", "getGreetingTextColor", "Lkotlin/Pair;", "textColorType", "getAccessibleColorOnDarkBackground", "getAccessibleColorOnDarkBackground-8_81llA", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ColorExtensionsKt {
    private static final float BRIGHTNESS_CUTOFF = 0.6f;
    private static final float WHITENESS_CUTOFF = 0.9411765f;

    /* renamed from: darken-8_81llA, reason: not valid java name */
    public static final long m13179darken8_81llA(long j) {
        return ColorKt.Color(ColorUtils.darkenColor(ColorKt.m6093toArgb8_81llA(j)));
    }

    /* renamed from: lighten-8_81llA, reason: not valid java name */
    public static final long m13189lighten8_81llA(long j) {
        return ColorKt.Color(ColorUtils.lightenColor(ColorKt.m6093toArgb8_81llA(j)));
    }

    /* renamed from: isDarkColor-8_81llA, reason: not valid java name */
    public static final boolean m13186isDarkColor8_81llA(long j) {
        return ColorKt.m6091luminance8_81llA(j) < 0.6f;
    }

    /* renamed from: isLightColor-8_81llA, reason: not valid java name */
    public static final boolean m13187isLightColor8_81llA(long j) {
        return !m13186isDarkColor8_81llA(j);
    }

    /* renamed from: isWhite-8_81llA, reason: not valid java name */
    public static final boolean m13188isWhite8_81llA(long j) {
        return Color.m6040equalsimpl0(j, Color.INSTANCE.m6076getWhite0d7_KjU());
    }

    /* renamed from: isBlack-8_81llA, reason: not valid java name */
    public static final boolean m13184isBlack8_81llA(long j) {
        return Color.m6040equalsimpl0(j, Color.INSTANCE.m6065getBlack0d7_KjU());
    }

    /* renamed from: generateTextColor-8_81llA, reason: not valid java name */
    public static final long m13180generateTextColor8_81llA(long j) {
        return m13186isDarkColor8_81llA(j) ? Color.INSTANCE.m6076getWhite0d7_KjU() : Color.INSTANCE.m6065getBlack0d7_KjU();
    }

    /* renamed from: getAccessibleBorderColor-8_81llA, reason: not valid java name */
    public static final long m13181getAccessibleBorderColor8_81llA(long j) {
        return m13186isDarkColor8_81llA(j) ? m13189lighten8_81llA(j) : m13179darken8_81llA(j);
    }

    /* renamed from: getAccessibleColorOnWhiteBackground-8_81llA, reason: not valid java name */
    public static final long m13183getAccessibleColorOnWhiteBackground8_81llA(long j) {
        return m13185isColorTooWhite8_81llA(j) ? Color.INSTANCE.m6065getBlack0d7_KjU() : j;
    }

    /* renamed from: isColorTooWhite-8_81llA, reason: not valid java name */
    private static final boolean m13185isColorTooWhite8_81llA(long j) {
        return Color.m6045getRedimpl(j) >= WHITENESS_CUTOFF && Color.m6044getGreenimpl(j) >= WHITENESS_CUTOFF && Color.m6042getBlueimpl(j) >= WHITENESS_CUTOFF;
    }

    public static /* synthetic */ long toComposeColor$default(String str, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return toComposeColor(str, f);
    }

    public static final long toComposeColor(String str, float f) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Color.m6038copywmQWz5c$default(ColorKt.Color(ColorUtils.parseColor(str)), f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final Pair<String, Float> getGreetingTextColor(String str) {
        return Intrinsics.areEqual(str, "dark") ? new Pair<>("#000000", Float.valueOf(0.6f)) : Intrinsics.areEqual(str, "light") ? new Pair<>("#FFFFFF", Float.valueOf(0.7f)) : new Pair<>("#000000", Float.valueOf(1.0f));
    }

    /* renamed from: getAccessibleColorOnDarkBackground-8_81llA, reason: not valid java name */
    public static final long m13182getAccessibleColorOnDarkBackground8_81llA(long j) {
        return m13186isDarkColor8_81llA(j) ? m13189lighten8_81llA(j) : j;
    }
}
