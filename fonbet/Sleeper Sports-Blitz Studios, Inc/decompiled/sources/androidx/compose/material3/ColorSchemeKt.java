package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.PaletteTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* compiled from: ColorScheme.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aí\u0003\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u00032\b\b\u0002\u00100\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u00020\u0003¢\u0006\u0004\b3\u00104\u001aí\u0003\u00105\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u00032\b\b\u0002\u00100\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u00020\u0003¢\u0006\u0004\b6\u00104\u001a\u001b\u00107\u001a\u00020\u0003*\u00020\u00012\u0006\u00108\u001a\u00020\u0003H\u0007¢\u0006\u0004\b9\u0010:\u001a\u0017\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u0003H\u0007¢\u0006\u0004\b;\u0010<\u001a\u001b\u0010=\u001a\u00020\u0003*\u00020\u00012\u0006\u0010>\u001a\u00020?H\u0007¢\u0006\u0004\b@\u0010A\u001a\b\u0010B\u001a\u00020\u0001H\u0000\u001a÷\u0002\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u0003H\u0007¢\u0006\u0004\bC\u0010D\u001a±\u0002\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003H\u0007¢\u0006\u0004\bE\u0010F\u001a÷\u0002\u00105\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u0003H\u0007¢\u0006\u0004\bG\u0010D\u001a±\u0002\u00105\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003H\u0007¢\u0006\u0004\bH\u0010F\u001a\u0019\u0010I\u001a\u00020\u0003*\u00020\u00012\u0006\u0010J\u001a\u00020KH\u0001¢\u0006\u0002\u0010L\u001a#\u0010U\u001a\u00020\u0003*\u00020\u00012\u0006\u00108\u001a\u00020\u00032\u0006\u0010>\u001a\u00020?H\u0001¢\u0006\u0004\bV\u0010W\"\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00010NX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010P\"\u000e\u0010Q\u001a\u00020RX\u0080T¢\u0006\u0002\n\u0000\"\u0018\u0010J\u001a\u00020\u0003*\u00020K8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T\"\u0017\u0010X\u001a\b\u0012\u0004\u0012\u00020Y0N¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010P¨\u0006["}, d2 = {"lightColorScheme", "Landroidx/compose/material3/ColorScheme;", "primary", "Landroidx/compose/ui/graphics/Color;", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", AppStateModule.APP_STATE_BACKGROUND, "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "surfaceBright", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "surfaceDim", "primaryFixed", "primaryFixedDim", "onPrimaryFixed", "onPrimaryFixedVariant", "secondaryFixed", "secondaryFixedDim", "onSecondaryFixed", "onSecondaryFixedVariant", "tertiaryFixed", "tertiaryFixedDim", "onTertiaryFixed", "onTertiaryFixedVariant", "lightColorScheme-_VG5OTI", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "darkColorScheme", "darkColorScheme-_VG5OTI", "contentColorFor", "backgroundColor", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material3/ColorScheme;J)J", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "surfaceColorAtElevation", "elevation", "Landroidx/compose/ui/unit/Dp;", "surfaceColorAtElevation-3ABfNKs", "(Landroidx/compose/material3/ColorScheme;F)J", "expressiveLightColorScheme", "lightColorScheme-C-Xl9yA", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "lightColorScheme-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "darkColorScheme-C-Xl9yA", "darkColorScheme-G1PFc-w", "fromToken", "value", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J", "LocalColorScheme", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalColorScheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "DisabledAlpha", "", "getValue", "(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J", "applyTonalElevation", "applyTonalElevation-RFCenO8", "(Landroidx/compose/material3/ColorScheme;JFLandroidx/compose/runtime/Composer;I)J", "LocalTonalElevationEnabled", "", "getLocalTonalElevationEnabled", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColorSchemeKt {
    public static final float DisabledAlpha = 0.38f;
    private static final ProvidableCompositionLocal<ColorScheme> LocalColorScheme = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.material3.ColorSchemeKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ColorScheme LocalColorScheme$lambda$1;
            LocalColorScheme$lambda$1 = ColorSchemeKt.LocalColorScheme$lambda$1();
            return LocalColorScheme$lambda$1;
        }
    });
    private static final ProvidableCompositionLocal<Boolean> LocalTonalElevationEnabled = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.material3.ColorSchemeKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            boolean LocalTonalElevationEnabled$lambda$2;
            LocalTonalElevationEnabled$lambda$2 = ColorSchemeKt.LocalTonalElevationEnabled$lambda$2();
            return Boolean.valueOf(LocalTonalElevationEnabled$lambda$2);
        }
    });

    /* compiled from: ColorScheme.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            try {
                iArr[ColorSchemeKeyTokens.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceBright.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHigh.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHighest.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLow.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLowest.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceDim.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Tertiary.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryFixed.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryFixedDim.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryFixed.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryFixedVariant.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryFixed.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryFixedDim.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryFixed.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryFixedVariant.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryFixed.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryFixedDim.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryFixed.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryFixedVariant.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LocalTonalElevationEnabled$lambda$2() {
        return true;
    }

    /* renamed from: lightColorScheme-_VG5OTI$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m2875lightColorScheme_VG5OTI$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, int i, int i2, Object obj) {
        long m4581getPrimary0d7_KjU = (i & 1) != 0 ? ColorLightTokens.INSTANCE.m4581getPrimary0d7_KjU() : j;
        long m4565getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorLightTokens.INSTANCE.m4565getOnPrimary0d7_KjU() : j2;
        long m4582getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorLightTokens.INSTANCE.m4582getPrimaryContainer0d7_KjU() : j3;
        long m4566getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorLightTokens.INSTANCE.m4566getOnPrimaryContainer0d7_KjU() : j4;
        long m4560getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorLightTokens.INSTANCE.m4560getInversePrimary0d7_KjU() : j5;
        long m4586getSecondary0d7_KjU = (i & 32) != 0 ? ColorLightTokens.INSTANCE.m4586getSecondary0d7_KjU() : j6;
        long m4569getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorLightTokens.INSTANCE.m4569getOnSecondary0d7_KjU() : j7;
        long j49 = m4581getPrimary0d7_KjU;
        long m4587getSecondaryContainer0d7_KjU = (i & 128) != 0 ? ColorLightTokens.INSTANCE.m4587getSecondaryContainer0d7_KjU() : j8;
        long m4570getOnSecondaryContainer0d7_KjU = (i & 256) != 0 ? ColorLightTokens.INSTANCE.m4570getOnSecondaryContainer0d7_KjU() : j9;
        long m4600getTertiary0d7_KjU = (i & 512) != 0 ? ColorLightTokens.INSTANCE.m4600getTertiary0d7_KjU() : j10;
        long m4575getOnTertiary0d7_KjU = (i & 1024) != 0 ? ColorLightTokens.INSTANCE.m4575getOnTertiary0d7_KjU() : j11;
        long m4601getTertiaryContainer0d7_KjU = (i & 2048) != 0 ? ColorLightTokens.INSTANCE.m4601getTertiaryContainer0d7_KjU() : j12;
        long m4576getOnTertiaryContainer0d7_KjU = (i & 4096) != 0 ? ColorLightTokens.INSTANCE.m4576getOnTertiaryContainer0d7_KjU() : j13;
        long m4556getBackground0d7_KjU = (i & 8192) != 0 ? ColorLightTokens.INSTANCE.m4556getBackground0d7_KjU() : j14;
        long m4562getOnBackground0d7_KjU = (i & 16384) != 0 ? ColorLightTokens.INSTANCE.m4562getOnBackground0d7_KjU() : j15;
        long m4590getSurface0d7_KjU = (i & 32768) != 0 ? ColorLightTokens.INSTANCE.m4590getSurface0d7_KjU() : j16;
        long m4573getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorLightTokens.INSTANCE.m4573getOnSurface0d7_KjU() : j17;
        long m4599getSurfaceVariant0d7_KjU = (i & 131072) != 0 ? ColorLightTokens.INSTANCE.m4599getSurfaceVariant0d7_KjU() : j18;
        long m4574getOnSurfaceVariant0d7_KjU = (i & 262144) != 0 ? ColorLightTokens.INSTANCE.m4574getOnSurfaceVariant0d7_KjU() : j19;
        long j50 = (i & 524288) != 0 ? j49 : j20;
        long m4561getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorLightTokens.INSTANCE.m4561getInverseSurface0d7_KjU() : j21;
        long m4559getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorLightTokens.INSTANCE.m4559getInverseOnSurface0d7_KjU() : j22;
        long m4557getError0d7_KjU = (i & 4194304) != 0 ? ColorLightTokens.INSTANCE.m4557getError0d7_KjU() : j23;
        long m4563getOnError0d7_KjU = (i & 8388608) != 0 ? ColorLightTokens.INSTANCE.m4563getOnError0d7_KjU() : j24;
        long m4558getErrorContainer0d7_KjU = (i & 16777216) != 0 ? ColorLightTokens.INSTANCE.m4558getErrorContainer0d7_KjU() : j25;
        long m4564getOnErrorContainer0d7_KjU = (i & 33554432) != 0 ? ColorLightTokens.INSTANCE.m4564getOnErrorContainer0d7_KjU() : j26;
        long m4579getOutline0d7_KjU = (i & 67108864) != 0 ? ColorLightTokens.INSTANCE.m4579getOutline0d7_KjU() : j27;
        long m4580getOutlineVariant0d7_KjU = (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? ColorLightTokens.INSTANCE.m4580getOutlineVariant0d7_KjU() : j28;
        long m4585getScrim0d7_KjU = (i & 268435456) != 0 ? ColorLightTokens.INSTANCE.m4585getScrim0d7_KjU() : j29;
        long m4591getSurfaceBright0d7_KjU = (i & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? ColorLightTokens.INSTANCE.m4591getSurfaceBright0d7_KjU() : j30;
        long m4592getSurfaceContainer0d7_KjU = (i & 1073741824) != 0 ? ColorLightTokens.INSTANCE.m4592getSurfaceContainer0d7_KjU() : j31;
        long m4593getSurfaceContainerHigh0d7_KjU = (i & Integer.MIN_VALUE) != 0 ? ColorLightTokens.INSTANCE.m4593getSurfaceContainerHigh0d7_KjU() : j32;
        long m4594getSurfaceContainerHighest0d7_KjU = (i2 & 1) != 0 ? ColorLightTokens.INSTANCE.m4594getSurfaceContainerHighest0d7_KjU() : j33;
        long m4595getSurfaceContainerLow0d7_KjU = (i2 & 2) != 0 ? ColorLightTokens.INSTANCE.m4595getSurfaceContainerLow0d7_KjU() : j34;
        long m4596getSurfaceContainerLowest0d7_KjU = (i2 & 4) != 0 ? ColorLightTokens.INSTANCE.m4596getSurfaceContainerLowest0d7_KjU() : j35;
        long m4597getSurfaceDim0d7_KjU = (i2 & 8) != 0 ? ColorLightTokens.INSTANCE.m4597getSurfaceDim0d7_KjU() : j36;
        long m4583getPrimaryFixed0d7_KjU = (i2 & 16) != 0 ? ColorLightTokens.INSTANCE.m4583getPrimaryFixed0d7_KjU() : j37;
        long m4584getPrimaryFixedDim0d7_KjU = (i2 & 32) != 0 ? ColorLightTokens.INSTANCE.m4584getPrimaryFixedDim0d7_KjU() : j38;
        long m4567getOnPrimaryFixed0d7_KjU = (i2 & 64) != 0 ? ColorLightTokens.INSTANCE.m4567getOnPrimaryFixed0d7_KjU() : j39;
        long m4568getOnPrimaryFixedVariant0d7_KjU = (i2 & 128) != 0 ? ColorLightTokens.INSTANCE.m4568getOnPrimaryFixedVariant0d7_KjU() : j40;
        long m4588getSecondaryFixed0d7_KjU = (i2 & 256) != 0 ? ColorLightTokens.INSTANCE.m4588getSecondaryFixed0d7_KjU() : j41;
        long m4589getSecondaryFixedDim0d7_KjU = (i2 & 512) != 0 ? ColorLightTokens.INSTANCE.m4589getSecondaryFixedDim0d7_KjU() : j42;
        long m4571getOnSecondaryFixed0d7_KjU = (i2 & 1024) != 0 ? ColorLightTokens.INSTANCE.m4571getOnSecondaryFixed0d7_KjU() : j43;
        long m4572getOnSecondaryFixedVariant0d7_KjU = (i2 & 2048) != 0 ? ColorLightTokens.INSTANCE.m4572getOnSecondaryFixedVariant0d7_KjU() : j44;
        long m4602getTertiaryFixed0d7_KjU = (i2 & 4096) != 0 ? ColorLightTokens.INSTANCE.m4602getTertiaryFixed0d7_KjU() : j45;
        long m4603getTertiaryFixedDim0d7_KjU = (i2 & 8192) != 0 ? ColorLightTokens.INSTANCE.m4603getTertiaryFixedDim0d7_KjU() : j46;
        long m4577getOnTertiaryFixed0d7_KjU = (i2 & 16384) != 0 ? ColorLightTokens.INSTANCE.m4577getOnTertiaryFixed0d7_KjU() : j47;
        if ((i2 & 32768) != 0) {
            j48 = ColorLightTokens.INSTANCE.m4578getOnTertiaryFixedVariant0d7_KjU();
        }
        return m2874lightColorScheme_VG5OTI(j49, m4565getOnPrimary0d7_KjU, m4582getPrimaryContainer0d7_KjU, m4566getOnPrimaryContainer0d7_KjU, m4560getInversePrimary0d7_KjU, m4586getSecondary0d7_KjU, m4569getOnSecondary0d7_KjU, m4587getSecondaryContainer0d7_KjU, m4570getOnSecondaryContainer0d7_KjU, m4600getTertiary0d7_KjU, m4575getOnTertiary0d7_KjU, m4601getTertiaryContainer0d7_KjU, m4576getOnTertiaryContainer0d7_KjU, m4556getBackground0d7_KjU, m4562getOnBackground0d7_KjU, m4590getSurface0d7_KjU, m4573getOnSurface0d7_KjU, m4599getSurfaceVariant0d7_KjU, m4574getOnSurfaceVariant0d7_KjU, j50, m4561getInverseSurface0d7_KjU, m4559getInverseOnSurface0d7_KjU, m4557getError0d7_KjU, m4563getOnError0d7_KjU, m4558getErrorContainer0d7_KjU, m4564getOnErrorContainer0d7_KjU, m4579getOutline0d7_KjU, m4580getOutlineVariant0d7_KjU, m4585getScrim0d7_KjU, m4591getSurfaceBright0d7_KjU, m4592getSurfaceContainer0d7_KjU, m4593getSurfaceContainerHigh0d7_KjU, m4594getSurfaceContainerHighest0d7_KjU, m4595getSurfaceContainerLow0d7_KjU, m4596getSurfaceContainerLowest0d7_KjU, m4597getSurfaceDim0d7_KjU, m4583getPrimaryFixed0d7_KjU, m4584getPrimaryFixedDim0d7_KjU, m4567getOnPrimaryFixed0d7_KjU, m4568getOnPrimaryFixedVariant0d7_KjU, m4588getSecondaryFixed0d7_KjU, m4589getSecondaryFixedDim0d7_KjU, m4571getOnSecondaryFixed0d7_KjU, m4572getOnSecondaryFixedVariant0d7_KjU, m4602getTertiaryFixed0d7_KjU, m4603getTertiaryFixedDim0d7_KjU, m4577getOnTertiaryFixed0d7_KjU, j48);
    }

    /* renamed from: lightColorScheme-_VG5OTI, reason: not valid java name */
    public static final ColorScheme m2874lightColorScheme_VG5OTI(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j36, j31, j32, j33, j34, j35, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, null);
    }

    /* renamed from: darkColorScheme-_VG5OTI$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m2869darkColorScheme_VG5OTI$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, int i, int i2, Object obj) {
        long m4533getPrimary0d7_KjU = (i & 1) != 0 ? ColorDarkTokens.INSTANCE.m4533getPrimary0d7_KjU() : j;
        long m4517getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorDarkTokens.INSTANCE.m4517getOnPrimary0d7_KjU() : j2;
        long m4534getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorDarkTokens.INSTANCE.m4534getPrimaryContainer0d7_KjU() : j3;
        long m4518getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorDarkTokens.INSTANCE.m4518getOnPrimaryContainer0d7_KjU() : j4;
        long m4512getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorDarkTokens.INSTANCE.m4512getInversePrimary0d7_KjU() : j5;
        long m4538getSecondary0d7_KjU = (i & 32) != 0 ? ColorDarkTokens.INSTANCE.m4538getSecondary0d7_KjU() : j6;
        long m4521getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorDarkTokens.INSTANCE.m4521getOnSecondary0d7_KjU() : j7;
        long j49 = m4533getPrimary0d7_KjU;
        long m4539getSecondaryContainer0d7_KjU = (i & 128) != 0 ? ColorDarkTokens.INSTANCE.m4539getSecondaryContainer0d7_KjU() : j8;
        long m4522getOnSecondaryContainer0d7_KjU = (i & 256) != 0 ? ColorDarkTokens.INSTANCE.m4522getOnSecondaryContainer0d7_KjU() : j9;
        long m4552getTertiary0d7_KjU = (i & 512) != 0 ? ColorDarkTokens.INSTANCE.m4552getTertiary0d7_KjU() : j10;
        long m4527getOnTertiary0d7_KjU = (i & 1024) != 0 ? ColorDarkTokens.INSTANCE.m4527getOnTertiary0d7_KjU() : j11;
        long m4553getTertiaryContainer0d7_KjU = (i & 2048) != 0 ? ColorDarkTokens.INSTANCE.m4553getTertiaryContainer0d7_KjU() : j12;
        long m4528getOnTertiaryContainer0d7_KjU = (i & 4096) != 0 ? ColorDarkTokens.INSTANCE.m4528getOnTertiaryContainer0d7_KjU() : j13;
        long m4508getBackground0d7_KjU = (i & 8192) != 0 ? ColorDarkTokens.INSTANCE.m4508getBackground0d7_KjU() : j14;
        long m4514getOnBackground0d7_KjU = (i & 16384) != 0 ? ColorDarkTokens.INSTANCE.m4514getOnBackground0d7_KjU() : j15;
        long m4542getSurface0d7_KjU = (i & 32768) != 0 ? ColorDarkTokens.INSTANCE.m4542getSurface0d7_KjU() : j16;
        long m4525getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorDarkTokens.INSTANCE.m4525getOnSurface0d7_KjU() : j17;
        long m4551getSurfaceVariant0d7_KjU = (i & 131072) != 0 ? ColorDarkTokens.INSTANCE.m4551getSurfaceVariant0d7_KjU() : j18;
        long m4526getOnSurfaceVariant0d7_KjU = (i & 262144) != 0 ? ColorDarkTokens.INSTANCE.m4526getOnSurfaceVariant0d7_KjU() : j19;
        long j50 = (i & 524288) != 0 ? j49 : j20;
        long m4513getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m4513getInverseSurface0d7_KjU() : j21;
        long m4511getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m4511getInverseOnSurface0d7_KjU() : j22;
        long m4509getError0d7_KjU = (i & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m4509getError0d7_KjU() : j23;
        long m4515getOnError0d7_KjU = (i & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m4515getOnError0d7_KjU() : j24;
        long m4510getErrorContainer0d7_KjU = (i & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m4510getErrorContainer0d7_KjU() : j25;
        long m4516getOnErrorContainer0d7_KjU = (i & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m4516getOnErrorContainer0d7_KjU() : j26;
        long m4531getOutline0d7_KjU = (i & 67108864) != 0 ? ColorDarkTokens.INSTANCE.m4531getOutline0d7_KjU() : j27;
        long m4532getOutlineVariant0d7_KjU = (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? ColorDarkTokens.INSTANCE.m4532getOutlineVariant0d7_KjU() : j28;
        long m4537getScrim0d7_KjU = (i & 268435456) != 0 ? ColorDarkTokens.INSTANCE.m4537getScrim0d7_KjU() : j29;
        long m4543getSurfaceBright0d7_KjU = (i & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? ColorDarkTokens.INSTANCE.m4543getSurfaceBright0d7_KjU() : j30;
        long m4544getSurfaceContainer0d7_KjU = (i & 1073741824) != 0 ? ColorDarkTokens.INSTANCE.m4544getSurfaceContainer0d7_KjU() : j31;
        long m4545getSurfaceContainerHigh0d7_KjU = (i & Integer.MIN_VALUE) != 0 ? ColorDarkTokens.INSTANCE.m4545getSurfaceContainerHigh0d7_KjU() : j32;
        long m4546getSurfaceContainerHighest0d7_KjU = (i2 & 1) != 0 ? ColorDarkTokens.INSTANCE.m4546getSurfaceContainerHighest0d7_KjU() : j33;
        long m4547getSurfaceContainerLow0d7_KjU = (i2 & 2) != 0 ? ColorDarkTokens.INSTANCE.m4547getSurfaceContainerLow0d7_KjU() : j34;
        long m4548getSurfaceContainerLowest0d7_KjU = (i2 & 4) != 0 ? ColorDarkTokens.INSTANCE.m4548getSurfaceContainerLowest0d7_KjU() : j35;
        long m4549getSurfaceDim0d7_KjU = (i2 & 8) != 0 ? ColorDarkTokens.INSTANCE.m4549getSurfaceDim0d7_KjU() : j36;
        long m4535getPrimaryFixed0d7_KjU = (i2 & 16) != 0 ? ColorDarkTokens.INSTANCE.m4535getPrimaryFixed0d7_KjU() : j37;
        long m4536getPrimaryFixedDim0d7_KjU = (i2 & 32) != 0 ? ColorDarkTokens.INSTANCE.m4536getPrimaryFixedDim0d7_KjU() : j38;
        long m4519getOnPrimaryFixed0d7_KjU = (i2 & 64) != 0 ? ColorDarkTokens.INSTANCE.m4519getOnPrimaryFixed0d7_KjU() : j39;
        long m4520getOnPrimaryFixedVariant0d7_KjU = (i2 & 128) != 0 ? ColorDarkTokens.INSTANCE.m4520getOnPrimaryFixedVariant0d7_KjU() : j40;
        long m4540getSecondaryFixed0d7_KjU = (i2 & 256) != 0 ? ColorDarkTokens.INSTANCE.m4540getSecondaryFixed0d7_KjU() : j41;
        long m4541getSecondaryFixedDim0d7_KjU = (i2 & 512) != 0 ? ColorDarkTokens.INSTANCE.m4541getSecondaryFixedDim0d7_KjU() : j42;
        long m4523getOnSecondaryFixed0d7_KjU = (i2 & 1024) != 0 ? ColorDarkTokens.INSTANCE.m4523getOnSecondaryFixed0d7_KjU() : j43;
        long m4524getOnSecondaryFixedVariant0d7_KjU = (i2 & 2048) != 0 ? ColorDarkTokens.INSTANCE.m4524getOnSecondaryFixedVariant0d7_KjU() : j44;
        long m4554getTertiaryFixed0d7_KjU = (i2 & 4096) != 0 ? ColorDarkTokens.INSTANCE.m4554getTertiaryFixed0d7_KjU() : j45;
        long m4555getTertiaryFixedDim0d7_KjU = (i2 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m4555getTertiaryFixedDim0d7_KjU() : j46;
        long m4529getOnTertiaryFixed0d7_KjU = (i2 & 16384) != 0 ? ColorDarkTokens.INSTANCE.m4529getOnTertiaryFixed0d7_KjU() : j47;
        if ((i2 & 32768) != 0) {
            j48 = ColorDarkTokens.INSTANCE.m4530getOnTertiaryFixedVariant0d7_KjU();
        }
        return m2868darkColorScheme_VG5OTI(j49, m4517getOnPrimary0d7_KjU, m4534getPrimaryContainer0d7_KjU, m4518getOnPrimaryContainer0d7_KjU, m4512getInversePrimary0d7_KjU, m4538getSecondary0d7_KjU, m4521getOnSecondary0d7_KjU, m4539getSecondaryContainer0d7_KjU, m4522getOnSecondaryContainer0d7_KjU, m4552getTertiary0d7_KjU, m4527getOnTertiary0d7_KjU, m4553getTertiaryContainer0d7_KjU, m4528getOnTertiaryContainer0d7_KjU, m4508getBackground0d7_KjU, m4514getOnBackground0d7_KjU, m4542getSurface0d7_KjU, m4525getOnSurface0d7_KjU, m4551getSurfaceVariant0d7_KjU, m4526getOnSurfaceVariant0d7_KjU, j50, m4513getInverseSurface0d7_KjU, m4511getInverseOnSurface0d7_KjU, m4509getError0d7_KjU, m4515getOnError0d7_KjU, m4510getErrorContainer0d7_KjU, m4516getOnErrorContainer0d7_KjU, m4531getOutline0d7_KjU, m4532getOutlineVariant0d7_KjU, m4537getScrim0d7_KjU, m4543getSurfaceBright0d7_KjU, m4544getSurfaceContainer0d7_KjU, m4545getSurfaceContainerHigh0d7_KjU, m4546getSurfaceContainerHighest0d7_KjU, m4547getSurfaceContainerLow0d7_KjU, m4548getSurfaceContainerLowest0d7_KjU, m4549getSurfaceDim0d7_KjU, m4535getPrimaryFixed0d7_KjU, m4536getPrimaryFixedDim0d7_KjU, m4519getOnPrimaryFixed0d7_KjU, m4520getOnPrimaryFixedVariant0d7_KjU, m4540getSecondaryFixed0d7_KjU, m4541getSecondaryFixedDim0d7_KjU, m4523getOnSecondaryFixed0d7_KjU, m4524getOnSecondaryFixedVariant0d7_KjU, m4554getTertiaryFixed0d7_KjU, m4555getTertiaryFixedDim0d7_KjU, m4529getOnTertiaryFixed0d7_KjU, j48);
    }

    /* renamed from: darkColorScheme-_VG5OTI, reason: not valid java name */
    public static final ColorScheme m2868darkColorScheme_VG5OTI(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j36, j31, j32, j33, j34, j35, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, null);
    }

    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m2862contentColorFor4WTKRHQ(ColorScheme colorScheme, long j) {
        if (Color.m6040equalsimpl0(j, colorScheme.getPrimary())) {
            return colorScheme.getOnPrimary();
        }
        if (Color.m6040equalsimpl0(j, colorScheme.getSecondary())) {
            return colorScheme.getOnSecondary();
        }
        if (Color.m6040equalsimpl0(j, colorScheme.getTertiary())) {
            return colorScheme.getOnTertiary();
        }
        if (Color.m6040equalsimpl0(j, colorScheme.getBackground())) {
            return colorScheme.getOnBackground();
        }
        if (Color.m6040equalsimpl0(j, colorScheme.getError())) {
            return colorScheme.getOnError();
        }
        if (Color.m6040equalsimpl0(j, colorScheme.getPrimaryContainer())) {
            return colorScheme.getOnPrimaryContainer();
        }
        if (Color.m6040equalsimpl0(j, colorScheme.getSecondaryContainer())) {
            return colorScheme.getOnSecondaryContainer();
        }
        if (Color.m6040equalsimpl0(j, colorScheme.getTertiaryContainer())) {
            return colorScheme.getOnTertiaryContainer();
        }
        if (Color.m6040equalsimpl0(j, colorScheme.getErrorContainer())) {
            return colorScheme.getOnErrorContainer();
        }
        if (Color.m6040equalsimpl0(j, colorScheme.getInverseSurface())) {
            return colorScheme.getInverseOnSurface();
        }
        if (Color.m6040equalsimpl0(j, colorScheme.getSurface())) {
            return colorScheme.getOnSurface();
        }
        if (Color.m6040equalsimpl0(j, colorScheme.getSurfaceVariant())) {
            return colorScheme.getOnSurfaceVariant();
        }
        if (!Color.m6040equalsimpl0(j, colorScheme.getSurfaceBright()) && !Color.m6040equalsimpl0(j, colorScheme.getSurfaceContainer()) && !Color.m6040equalsimpl0(j, colorScheme.getSurfaceContainerHigh()) && !Color.m6040equalsimpl0(j, colorScheme.getSurfaceContainerHighest()) && !Color.m6040equalsimpl0(j, colorScheme.getSurfaceContainerLow()) && !Color.m6040equalsimpl0(j, colorScheme.getSurfaceContainerLowest()) && !Color.m6040equalsimpl0(j, colorScheme.getSurfaceDim())) {
            if (!Color.m6040equalsimpl0(j, colorScheme.getPrimaryFixed()) && !Color.m6040equalsimpl0(j, colorScheme.getPrimaryFixedDim())) {
                if (!Color.m6040equalsimpl0(j, colorScheme.getSecondaryFixed()) && !Color.m6040equalsimpl0(j, colorScheme.getSecondaryFixedDim())) {
                    if (!Color.m6040equalsimpl0(j, colorScheme.getTertiaryFixed()) && !Color.m6040equalsimpl0(j, colorScheme.getTertiaryFixedDim())) {
                        return Color.INSTANCE.m6075getUnspecified0d7_KjU();
                    }
                    return colorScheme.getOnTertiaryFixed();
                }
                return colorScheme.getOnSecondaryFixed();
            }
            return colorScheme.getOnPrimaryFixed();
        }
        return colorScheme.getOnSurface();
    }

    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m2863contentColorForek8zF_U(long j, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 509589638, "C(contentColorFor)N(backgroundColor:c#ui.graphics.Color)1112@50936L11:ColorScheme.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(509589638, i, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:1112)");
        }
        composer.startReplaceGroup(89374938);
        ComposerKt.sourceInformation(composer, "*1113@51020L7");
        long m2862contentColorFor4WTKRHQ = m2862contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j);
        if (m2862contentColorFor4WTKRHQ == 16) {
            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localContentColor);
            ComposerKt.sourceInformationMarkerEnd(composer);
            m2862contentColorFor4WTKRHQ = ((Color) consume).m6049unboximpl();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m2862contentColorFor4WTKRHQ;
    }

    public static final ColorScheme expressiveLightColorScheme() {
        return m2875lightColorScheme_VG5OTI$default(0L, 0L, 0L, PaletteTokens.INSTANCE.m4958getPrimary300d7_KjU(), 0L, 0L, 0L, 0L, PaletteTokens.INSTANCE.m4971getSecondary300d7_KjU(), 0L, 0L, 0L, PaletteTokens.INSTANCE.m4984getTertiary300d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, PaletteTokens.INSTANCE.m4908getError300d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -33558793, 65535, null);
    }

    /* renamed from: lightColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m2871lightColorSchemeCXl9yA$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, int i, int i2, Object obj) {
        long m4581getPrimary0d7_KjU = (i & 1) != 0 ? ColorLightTokens.INSTANCE.m4581getPrimary0d7_KjU() : j;
        long m4565getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorLightTokens.INSTANCE.m4565getOnPrimary0d7_KjU() : j2;
        long m4582getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorLightTokens.INSTANCE.m4582getPrimaryContainer0d7_KjU() : j3;
        long m4566getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorLightTokens.INSTANCE.m4566getOnPrimaryContainer0d7_KjU() : j4;
        long m4560getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorLightTokens.INSTANCE.m4560getInversePrimary0d7_KjU() : j5;
        long m4586getSecondary0d7_KjU = (i & 32) != 0 ? ColorLightTokens.INSTANCE.m4586getSecondary0d7_KjU() : j6;
        long m4569getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorLightTokens.INSTANCE.m4569getOnSecondary0d7_KjU() : j7;
        long m4587getSecondaryContainer0d7_KjU = (i & 128) != 0 ? ColorLightTokens.INSTANCE.m4587getSecondaryContainer0d7_KjU() : j8;
        long j37 = m4581getPrimary0d7_KjU;
        long m4570getOnSecondaryContainer0d7_KjU = (i & 256) != 0 ? ColorLightTokens.INSTANCE.m4570getOnSecondaryContainer0d7_KjU() : j9;
        long m4600getTertiary0d7_KjU = (i & 512) != 0 ? ColorLightTokens.INSTANCE.m4600getTertiary0d7_KjU() : j10;
        long m4575getOnTertiary0d7_KjU = (i & 1024) != 0 ? ColorLightTokens.INSTANCE.m4575getOnTertiary0d7_KjU() : j11;
        long m4601getTertiaryContainer0d7_KjU = (i & 2048) != 0 ? ColorLightTokens.INSTANCE.m4601getTertiaryContainer0d7_KjU() : j12;
        long m4576getOnTertiaryContainer0d7_KjU = (i & 4096) != 0 ? ColorLightTokens.INSTANCE.m4576getOnTertiaryContainer0d7_KjU() : j13;
        long m4556getBackground0d7_KjU = (i & 8192) != 0 ? ColorLightTokens.INSTANCE.m4556getBackground0d7_KjU() : j14;
        long m4562getOnBackground0d7_KjU = (i & 16384) != 0 ? ColorLightTokens.INSTANCE.m4562getOnBackground0d7_KjU() : j15;
        long m4590getSurface0d7_KjU = (i & 32768) != 0 ? ColorLightTokens.INSTANCE.m4590getSurface0d7_KjU() : j16;
        long m4573getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorLightTokens.INSTANCE.m4573getOnSurface0d7_KjU() : j17;
        long m4599getSurfaceVariant0d7_KjU = (i & 131072) != 0 ? ColorLightTokens.INSTANCE.m4599getSurfaceVariant0d7_KjU() : j18;
        long m4574getOnSurfaceVariant0d7_KjU = (i & 262144) != 0 ? ColorLightTokens.INSTANCE.m4574getOnSurfaceVariant0d7_KjU() : j19;
        long j38 = (i & 524288) != 0 ? j37 : j20;
        long m4561getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorLightTokens.INSTANCE.m4561getInverseSurface0d7_KjU() : j21;
        long m4559getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorLightTokens.INSTANCE.m4559getInverseOnSurface0d7_KjU() : j22;
        long m4557getError0d7_KjU = (i & 4194304) != 0 ? ColorLightTokens.INSTANCE.m4557getError0d7_KjU() : j23;
        long m4563getOnError0d7_KjU = (i & 8388608) != 0 ? ColorLightTokens.INSTANCE.m4563getOnError0d7_KjU() : j24;
        long m4558getErrorContainer0d7_KjU = (i & 16777216) != 0 ? ColorLightTokens.INSTANCE.m4558getErrorContainer0d7_KjU() : j25;
        long m4564getOnErrorContainer0d7_KjU = (i & 33554432) != 0 ? ColorLightTokens.INSTANCE.m4564getOnErrorContainer0d7_KjU() : j26;
        long m4579getOutline0d7_KjU = (i & 67108864) != 0 ? ColorLightTokens.INSTANCE.m4579getOutline0d7_KjU() : j27;
        long m4580getOutlineVariant0d7_KjU = (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? ColorLightTokens.INSTANCE.m4580getOutlineVariant0d7_KjU() : j28;
        long m4585getScrim0d7_KjU = (i & 268435456) != 0 ? ColorLightTokens.INSTANCE.m4585getScrim0d7_KjU() : j29;
        long m4591getSurfaceBright0d7_KjU = (i & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? ColorLightTokens.INSTANCE.m4591getSurfaceBright0d7_KjU() : j30;
        long m4592getSurfaceContainer0d7_KjU = (i & 1073741824) != 0 ? ColorLightTokens.INSTANCE.m4592getSurfaceContainer0d7_KjU() : j31;
        long m4593getSurfaceContainerHigh0d7_KjU = (i & Integer.MIN_VALUE) != 0 ? ColorLightTokens.INSTANCE.m4593getSurfaceContainerHigh0d7_KjU() : j32;
        long m4594getSurfaceContainerHighest0d7_KjU = (i2 & 1) != 0 ? ColorLightTokens.INSTANCE.m4594getSurfaceContainerHighest0d7_KjU() : j33;
        long m4595getSurfaceContainerLow0d7_KjU = (i2 & 2) != 0 ? ColorLightTokens.INSTANCE.m4595getSurfaceContainerLow0d7_KjU() : j34;
        long m4596getSurfaceContainerLowest0d7_KjU = (i2 & 4) != 0 ? ColorLightTokens.INSTANCE.m4596getSurfaceContainerLowest0d7_KjU() : j35;
        if ((i2 & 8) != 0) {
            j36 = ColorLightTokens.INSTANCE.m4597getSurfaceDim0d7_KjU();
        }
        return m2870lightColorSchemeCXl9yA(j37, m4565getOnPrimary0d7_KjU, m4582getPrimaryContainer0d7_KjU, m4566getOnPrimaryContainer0d7_KjU, m4560getInversePrimary0d7_KjU, m4586getSecondary0d7_KjU, m4569getOnSecondary0d7_KjU, m4587getSecondaryContainer0d7_KjU, m4570getOnSecondaryContainer0d7_KjU, m4600getTertiary0d7_KjU, m4575getOnTertiary0d7_KjU, m4601getTertiaryContainer0d7_KjU, m4576getOnTertiaryContainer0d7_KjU, m4556getBackground0d7_KjU, m4562getOnBackground0d7_KjU, m4590getSurface0d7_KjU, m4573getOnSurface0d7_KjU, m4599getSurfaceVariant0d7_KjU, m4574getOnSurfaceVariant0d7_KjU, j38, m4561getInverseSurface0d7_KjU, m4559getInverseOnSurface0d7_KjU, m4557getError0d7_KjU, m4563getOnError0d7_KjU, m4558getErrorContainer0d7_KjU, m4564getOnErrorContainer0d7_KjU, m4579getOutline0d7_KjU, m4580getOutlineVariant0d7_KjU, m4585getScrim0d7_KjU, m4591getSurfaceBright0d7_KjU, m4592getSurfaceContainer0d7_KjU, m4593getSurfaceContainerHigh0d7_KjU, m4594getSurfaceContainerHighest0d7_KjU, m4595getSurfaceContainerLow0d7_KjU, m4596getSurfaceContainerLowest0d7_KjU, j36);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional Fixed roles instead")
    /* renamed from: lightColorScheme-C-Xl9yA, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m2870lightColorSchemeCXl9yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        return m2875lightColorScheme_VG5OTI$default(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0, 65520, null);
    }

    /* renamed from: lightColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m2873lightColorSchemeG1PFcw$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, int i, Object obj) {
        long m4581getPrimary0d7_KjU = (i & 1) != 0 ? ColorLightTokens.INSTANCE.m4581getPrimary0d7_KjU() : j;
        long m4565getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorLightTokens.INSTANCE.m4565getOnPrimary0d7_KjU() : j2;
        long m4582getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorLightTokens.INSTANCE.m4582getPrimaryContainer0d7_KjU() : j3;
        long m4566getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorLightTokens.INSTANCE.m4566getOnPrimaryContainer0d7_KjU() : j4;
        long m4560getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorLightTokens.INSTANCE.m4560getInversePrimary0d7_KjU() : j5;
        long m4586getSecondary0d7_KjU = (i & 32) != 0 ? ColorLightTokens.INSTANCE.m4586getSecondary0d7_KjU() : j6;
        long m4569getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorLightTokens.INSTANCE.m4569getOnSecondary0d7_KjU() : j7;
        long m4587getSecondaryContainer0d7_KjU = (i & 128) != 0 ? ColorLightTokens.INSTANCE.m4587getSecondaryContainer0d7_KjU() : j8;
        long j30 = m4581getPrimary0d7_KjU;
        long m4570getOnSecondaryContainer0d7_KjU = (i & 256) != 0 ? ColorLightTokens.INSTANCE.m4570getOnSecondaryContainer0d7_KjU() : j9;
        long m4600getTertiary0d7_KjU = (i & 512) != 0 ? ColorLightTokens.INSTANCE.m4600getTertiary0d7_KjU() : j10;
        long m4575getOnTertiary0d7_KjU = (i & 1024) != 0 ? ColorLightTokens.INSTANCE.m4575getOnTertiary0d7_KjU() : j11;
        long m4601getTertiaryContainer0d7_KjU = (i & 2048) != 0 ? ColorLightTokens.INSTANCE.m4601getTertiaryContainer0d7_KjU() : j12;
        long m4576getOnTertiaryContainer0d7_KjU = (i & 4096) != 0 ? ColorLightTokens.INSTANCE.m4576getOnTertiaryContainer0d7_KjU() : j13;
        long m4556getBackground0d7_KjU = (i & 8192) != 0 ? ColorLightTokens.INSTANCE.m4556getBackground0d7_KjU() : j14;
        long m4562getOnBackground0d7_KjU = (i & 16384) != 0 ? ColorLightTokens.INSTANCE.m4562getOnBackground0d7_KjU() : j15;
        long m4590getSurface0d7_KjU = (i & 32768) != 0 ? ColorLightTokens.INSTANCE.m4590getSurface0d7_KjU() : j16;
        long m4573getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorLightTokens.INSTANCE.m4573getOnSurface0d7_KjU() : j17;
        long m4599getSurfaceVariant0d7_KjU = (i & 131072) != 0 ? ColorLightTokens.INSTANCE.m4599getSurfaceVariant0d7_KjU() : j18;
        long m4574getOnSurfaceVariant0d7_KjU = (i & 262144) != 0 ? ColorLightTokens.INSTANCE.m4574getOnSurfaceVariant0d7_KjU() : j19;
        long j31 = (i & 524288) != 0 ? j30 : j20;
        long m4561getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorLightTokens.INSTANCE.m4561getInverseSurface0d7_KjU() : j21;
        long m4559getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorLightTokens.INSTANCE.m4559getInverseOnSurface0d7_KjU() : j22;
        long m4557getError0d7_KjU = (i & 4194304) != 0 ? ColorLightTokens.INSTANCE.m4557getError0d7_KjU() : j23;
        long m4563getOnError0d7_KjU = (i & 8388608) != 0 ? ColorLightTokens.INSTANCE.m4563getOnError0d7_KjU() : j24;
        long m4558getErrorContainer0d7_KjU = (i & 16777216) != 0 ? ColorLightTokens.INSTANCE.m4558getErrorContainer0d7_KjU() : j25;
        long m4564getOnErrorContainer0d7_KjU = (i & 33554432) != 0 ? ColorLightTokens.INSTANCE.m4564getOnErrorContainer0d7_KjU() : j26;
        long m4579getOutline0d7_KjU = (i & 67108864) != 0 ? ColorLightTokens.INSTANCE.m4579getOutline0d7_KjU() : j27;
        long m4580getOutlineVariant0d7_KjU = (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? ColorLightTokens.INSTANCE.m4580getOutlineVariant0d7_KjU() : j28;
        if ((i & 268435456) != 0) {
            j29 = ColorLightTokens.INSTANCE.m4585getScrim0d7_KjU();
        }
        return m2872lightColorSchemeG1PFcw(j30, m4565getOnPrimary0d7_KjU, m4582getPrimaryContainer0d7_KjU, m4566getOnPrimaryContainer0d7_KjU, m4560getInversePrimary0d7_KjU, m4586getSecondary0d7_KjU, m4569getOnSecondary0d7_KjU, m4587getSecondaryContainer0d7_KjU, m4570getOnSecondaryContainer0d7_KjU, m4600getTertiary0d7_KjU, m4575getOnTertiary0d7_KjU, m4601getTertiaryContainer0d7_KjU, m4576getOnTertiaryContainer0d7_KjU, m4556getBackground0d7_KjU, m4562getOnBackground0d7_KjU, m4590getSurface0d7_KjU, m4573getOnSurface0d7_KjU, m4599getSurfaceVariant0d7_KjU, m4574getOnSurfaceVariant0d7_KjU, j31, m4561getInverseSurface0d7_KjU, m4559getInverseOnSurface0d7_KjU, m4557getError0d7_KjU, m4563getOnError0d7_KjU, m4558getErrorContainer0d7_KjU, m4564getOnErrorContainer0d7_KjU, m4579getOutline0d7_KjU, m4580getOutlineVariant0d7_KjU, j29);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    /* renamed from: lightColorScheme-G1PFc-w, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m2872lightColorSchemeG1PFcw(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        return m2875lightColorScheme_VG5OTI$default(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 65535, null);
    }

    /* renamed from: darkColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m2865darkColorSchemeCXl9yA$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, int i, int i2, Object obj) {
        long m4533getPrimary0d7_KjU = (i & 1) != 0 ? ColorDarkTokens.INSTANCE.m4533getPrimary0d7_KjU() : j;
        long m4517getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorDarkTokens.INSTANCE.m4517getOnPrimary0d7_KjU() : j2;
        long m4534getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorDarkTokens.INSTANCE.m4534getPrimaryContainer0d7_KjU() : j3;
        long m4518getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorDarkTokens.INSTANCE.m4518getOnPrimaryContainer0d7_KjU() : j4;
        long m4512getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorDarkTokens.INSTANCE.m4512getInversePrimary0d7_KjU() : j5;
        long m4538getSecondary0d7_KjU = (i & 32) != 0 ? ColorDarkTokens.INSTANCE.m4538getSecondary0d7_KjU() : j6;
        long m4521getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorDarkTokens.INSTANCE.m4521getOnSecondary0d7_KjU() : j7;
        long m4539getSecondaryContainer0d7_KjU = (i & 128) != 0 ? ColorDarkTokens.INSTANCE.m4539getSecondaryContainer0d7_KjU() : j8;
        long j37 = m4533getPrimary0d7_KjU;
        long m4522getOnSecondaryContainer0d7_KjU = (i & 256) != 0 ? ColorDarkTokens.INSTANCE.m4522getOnSecondaryContainer0d7_KjU() : j9;
        long m4552getTertiary0d7_KjU = (i & 512) != 0 ? ColorDarkTokens.INSTANCE.m4552getTertiary0d7_KjU() : j10;
        long m4527getOnTertiary0d7_KjU = (i & 1024) != 0 ? ColorDarkTokens.INSTANCE.m4527getOnTertiary0d7_KjU() : j11;
        long m4553getTertiaryContainer0d7_KjU = (i & 2048) != 0 ? ColorDarkTokens.INSTANCE.m4553getTertiaryContainer0d7_KjU() : j12;
        long m4528getOnTertiaryContainer0d7_KjU = (i & 4096) != 0 ? ColorDarkTokens.INSTANCE.m4528getOnTertiaryContainer0d7_KjU() : j13;
        long m4508getBackground0d7_KjU = (i & 8192) != 0 ? ColorDarkTokens.INSTANCE.m4508getBackground0d7_KjU() : j14;
        long m4514getOnBackground0d7_KjU = (i & 16384) != 0 ? ColorDarkTokens.INSTANCE.m4514getOnBackground0d7_KjU() : j15;
        long m4542getSurface0d7_KjU = (i & 32768) != 0 ? ColorDarkTokens.INSTANCE.m4542getSurface0d7_KjU() : j16;
        long m4525getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorDarkTokens.INSTANCE.m4525getOnSurface0d7_KjU() : j17;
        long m4551getSurfaceVariant0d7_KjU = (i & 131072) != 0 ? ColorDarkTokens.INSTANCE.m4551getSurfaceVariant0d7_KjU() : j18;
        long m4526getOnSurfaceVariant0d7_KjU = (i & 262144) != 0 ? ColorDarkTokens.INSTANCE.m4526getOnSurfaceVariant0d7_KjU() : j19;
        long j38 = (i & 524288) != 0 ? j37 : j20;
        long m4513getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m4513getInverseSurface0d7_KjU() : j21;
        long m4511getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m4511getInverseOnSurface0d7_KjU() : j22;
        long m4509getError0d7_KjU = (i & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m4509getError0d7_KjU() : j23;
        long m4515getOnError0d7_KjU = (i & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m4515getOnError0d7_KjU() : j24;
        long m4510getErrorContainer0d7_KjU = (i & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m4510getErrorContainer0d7_KjU() : j25;
        long m4516getOnErrorContainer0d7_KjU = (i & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m4516getOnErrorContainer0d7_KjU() : j26;
        long m4531getOutline0d7_KjU = (i & 67108864) != 0 ? ColorDarkTokens.INSTANCE.m4531getOutline0d7_KjU() : j27;
        long m4532getOutlineVariant0d7_KjU = (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? ColorDarkTokens.INSTANCE.m4532getOutlineVariant0d7_KjU() : j28;
        long m4537getScrim0d7_KjU = (i & 268435456) != 0 ? ColorDarkTokens.INSTANCE.m4537getScrim0d7_KjU() : j29;
        long m4543getSurfaceBright0d7_KjU = (i & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? ColorDarkTokens.INSTANCE.m4543getSurfaceBright0d7_KjU() : j30;
        long m4544getSurfaceContainer0d7_KjU = (i & 1073741824) != 0 ? ColorDarkTokens.INSTANCE.m4544getSurfaceContainer0d7_KjU() : j31;
        long m4545getSurfaceContainerHigh0d7_KjU = (i & Integer.MIN_VALUE) != 0 ? ColorDarkTokens.INSTANCE.m4545getSurfaceContainerHigh0d7_KjU() : j32;
        long m4546getSurfaceContainerHighest0d7_KjU = (i2 & 1) != 0 ? ColorDarkTokens.INSTANCE.m4546getSurfaceContainerHighest0d7_KjU() : j33;
        long m4547getSurfaceContainerLow0d7_KjU = (i2 & 2) != 0 ? ColorDarkTokens.INSTANCE.m4547getSurfaceContainerLow0d7_KjU() : j34;
        long m4548getSurfaceContainerLowest0d7_KjU = (i2 & 4) != 0 ? ColorDarkTokens.INSTANCE.m4548getSurfaceContainerLowest0d7_KjU() : j35;
        if ((i2 & 8) != 0) {
            j36 = ColorDarkTokens.INSTANCE.m4549getSurfaceDim0d7_KjU();
        }
        return m2864darkColorSchemeCXl9yA(j37, m4517getOnPrimary0d7_KjU, m4534getPrimaryContainer0d7_KjU, m4518getOnPrimaryContainer0d7_KjU, m4512getInversePrimary0d7_KjU, m4538getSecondary0d7_KjU, m4521getOnSecondary0d7_KjU, m4539getSecondaryContainer0d7_KjU, m4522getOnSecondaryContainer0d7_KjU, m4552getTertiary0d7_KjU, m4527getOnTertiary0d7_KjU, m4553getTertiaryContainer0d7_KjU, m4528getOnTertiaryContainer0d7_KjU, m4508getBackground0d7_KjU, m4514getOnBackground0d7_KjU, m4542getSurface0d7_KjU, m4525getOnSurface0d7_KjU, m4551getSurfaceVariant0d7_KjU, m4526getOnSurfaceVariant0d7_KjU, j38, m4513getInverseSurface0d7_KjU, m4511getInverseOnSurface0d7_KjU, m4509getError0d7_KjU, m4515getOnError0d7_KjU, m4510getErrorContainer0d7_KjU, m4516getOnErrorContainer0d7_KjU, m4531getOutline0d7_KjU, m4532getOutlineVariant0d7_KjU, m4537getScrim0d7_KjU, m4543getSurfaceBright0d7_KjU, m4544getSurfaceContainer0d7_KjU, m4545getSurfaceContainerHigh0d7_KjU, m4546getSurfaceContainerHighest0d7_KjU, m4547getSurfaceContainerLow0d7_KjU, m4548getSurfaceContainerLowest0d7_KjU, j36);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    /* renamed from: darkColorScheme-C-Xl9yA, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m2864darkColorSchemeCXl9yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        return m2869darkColorScheme_VG5OTI$default(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0, 65520, null);
    }

    /* renamed from: darkColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m2867darkColorSchemeG1PFcw$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, int i, Object obj) {
        long m4533getPrimary0d7_KjU = (i & 1) != 0 ? ColorDarkTokens.INSTANCE.m4533getPrimary0d7_KjU() : j;
        long m4517getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorDarkTokens.INSTANCE.m4517getOnPrimary0d7_KjU() : j2;
        long m4534getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorDarkTokens.INSTANCE.m4534getPrimaryContainer0d7_KjU() : j3;
        long m4518getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorDarkTokens.INSTANCE.m4518getOnPrimaryContainer0d7_KjU() : j4;
        long m4512getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorDarkTokens.INSTANCE.m4512getInversePrimary0d7_KjU() : j5;
        long m4538getSecondary0d7_KjU = (i & 32) != 0 ? ColorDarkTokens.INSTANCE.m4538getSecondary0d7_KjU() : j6;
        long m4521getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorDarkTokens.INSTANCE.m4521getOnSecondary0d7_KjU() : j7;
        long m4539getSecondaryContainer0d7_KjU = (i & 128) != 0 ? ColorDarkTokens.INSTANCE.m4539getSecondaryContainer0d7_KjU() : j8;
        long j30 = m4533getPrimary0d7_KjU;
        long m4522getOnSecondaryContainer0d7_KjU = (i & 256) != 0 ? ColorDarkTokens.INSTANCE.m4522getOnSecondaryContainer0d7_KjU() : j9;
        long m4552getTertiary0d7_KjU = (i & 512) != 0 ? ColorDarkTokens.INSTANCE.m4552getTertiary0d7_KjU() : j10;
        long m4527getOnTertiary0d7_KjU = (i & 1024) != 0 ? ColorDarkTokens.INSTANCE.m4527getOnTertiary0d7_KjU() : j11;
        long m4553getTertiaryContainer0d7_KjU = (i & 2048) != 0 ? ColorDarkTokens.INSTANCE.m4553getTertiaryContainer0d7_KjU() : j12;
        long m4528getOnTertiaryContainer0d7_KjU = (i & 4096) != 0 ? ColorDarkTokens.INSTANCE.m4528getOnTertiaryContainer0d7_KjU() : j13;
        long m4508getBackground0d7_KjU = (i & 8192) != 0 ? ColorDarkTokens.INSTANCE.m4508getBackground0d7_KjU() : j14;
        long m4514getOnBackground0d7_KjU = (i & 16384) != 0 ? ColorDarkTokens.INSTANCE.m4514getOnBackground0d7_KjU() : j15;
        long m4542getSurface0d7_KjU = (i & 32768) != 0 ? ColorDarkTokens.INSTANCE.m4542getSurface0d7_KjU() : j16;
        long m4525getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorDarkTokens.INSTANCE.m4525getOnSurface0d7_KjU() : j17;
        long m4551getSurfaceVariant0d7_KjU = (i & 131072) != 0 ? ColorDarkTokens.INSTANCE.m4551getSurfaceVariant0d7_KjU() : j18;
        long m4526getOnSurfaceVariant0d7_KjU = (i & 262144) != 0 ? ColorDarkTokens.INSTANCE.m4526getOnSurfaceVariant0d7_KjU() : j19;
        long j31 = (i & 524288) != 0 ? j30 : j20;
        long m4513getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m4513getInverseSurface0d7_KjU() : j21;
        long m4511getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m4511getInverseOnSurface0d7_KjU() : j22;
        long m4509getError0d7_KjU = (i & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m4509getError0d7_KjU() : j23;
        long m4515getOnError0d7_KjU = (i & 8388608) != 0 ? ColorDarkTokens.INSTANCE.m4515getOnError0d7_KjU() : j24;
        long m4510getErrorContainer0d7_KjU = (i & 16777216) != 0 ? ColorDarkTokens.INSTANCE.m4510getErrorContainer0d7_KjU() : j25;
        long m4516getOnErrorContainer0d7_KjU = (i & 33554432) != 0 ? ColorDarkTokens.INSTANCE.m4516getOnErrorContainer0d7_KjU() : j26;
        long m4531getOutline0d7_KjU = (i & 67108864) != 0 ? ColorDarkTokens.INSTANCE.m4531getOutline0d7_KjU() : j27;
        long m4532getOutlineVariant0d7_KjU = (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? ColorDarkTokens.INSTANCE.m4532getOutlineVariant0d7_KjU() : j28;
        if ((i & 268435456) != 0) {
            j29 = ColorDarkTokens.INSTANCE.m4537getScrim0d7_KjU();
        }
        return m2866darkColorSchemeG1PFcw(j30, m4517getOnPrimary0d7_KjU, m4534getPrimaryContainer0d7_KjU, m4518getOnPrimaryContainer0d7_KjU, m4512getInversePrimary0d7_KjU, m4538getSecondary0d7_KjU, m4521getOnSecondary0d7_KjU, m4539getSecondaryContainer0d7_KjU, m4522getOnSecondaryContainer0d7_KjU, m4552getTertiary0d7_KjU, m4527getOnTertiary0d7_KjU, m4553getTertiaryContainer0d7_KjU, m4528getOnTertiaryContainer0d7_KjU, m4508getBackground0d7_KjU, m4514getOnBackground0d7_KjU, m4542getSurface0d7_KjU, m4525getOnSurface0d7_KjU, m4551getSurfaceVariant0d7_KjU, m4526getOnSurfaceVariant0d7_KjU, j31, m4513getInverseSurface0d7_KjU, m4511getInverseOnSurface0d7_KjU, m4509getError0d7_KjU, m4515getOnError0d7_KjU, m4510getErrorContainer0d7_KjU, m4516getOnErrorContainer0d7_KjU, m4531getOutline0d7_KjU, m4532getOutlineVariant0d7_KjU, j29);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    /* renamed from: darkColorScheme-G1PFc-w, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m2866darkColorSchemeG1PFcw(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        return m2869darkColorScheme_VG5OTI$default(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 65535, null);
    }

    public static final long fromToken(ColorScheme colorScheme, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (WhenMappings.$EnumSwitchMapping$0[colorSchemeKeyTokens.ordinal()]) {
            case 1:
                return colorScheme.getBackground();
            case 2:
                return colorScheme.getError();
            case 3:
                return colorScheme.getErrorContainer();
            case 4:
                return colorScheme.getInverseOnSurface();
            case 5:
                return colorScheme.getInversePrimary();
            case 6:
                return colorScheme.getInverseSurface();
            case 7:
                return colorScheme.getOnBackground();
            case 8:
                return colorScheme.getOnError();
            case 9:
                return colorScheme.getOnErrorContainer();
            case 10:
                return colorScheme.getOnPrimary();
            case 11:
                return colorScheme.getOnPrimaryContainer();
            case 12:
                return colorScheme.getOnSecondary();
            case 13:
                return colorScheme.getOnSecondaryContainer();
            case 14:
                return colorScheme.getOnSurface();
            case 15:
                return colorScheme.getOnSurfaceVariant();
            case 16:
                return colorScheme.getSurfaceTint();
            case 17:
                return colorScheme.getOnTertiary();
            case 18:
                return colorScheme.getOnTertiaryContainer();
            case 19:
                return colorScheme.getOutline();
            case 20:
                return colorScheme.getOutlineVariant();
            case 21:
                return colorScheme.getPrimary();
            case 22:
                return colorScheme.getPrimaryContainer();
            case 23:
                return colorScheme.getScrim();
            case 24:
                return colorScheme.getSecondary();
            case 25:
                return colorScheme.getSecondaryContainer();
            case 26:
                return colorScheme.getSurface();
            case 27:
                return colorScheme.getSurfaceVariant();
            case 28:
                return colorScheme.getSurfaceBright();
            case 29:
                return colorScheme.getSurfaceContainer();
            case 30:
                return colorScheme.getSurfaceContainerHigh();
            case 31:
                return colorScheme.getSurfaceContainerHighest();
            case 32:
                return colorScheme.getSurfaceContainerLow();
            case 33:
                return colorScheme.getSurfaceContainerLowest();
            case 34:
                return colorScheme.getSurfaceDim();
            case 35:
                return colorScheme.getTertiary();
            case 36:
                return colorScheme.getTertiaryContainer();
            case 37:
                return colorScheme.getPrimaryFixed();
            case 38:
                return colorScheme.getPrimaryFixedDim();
            case 39:
                return colorScheme.getOnPrimaryFixed();
            case 40:
                return colorScheme.getOnPrimaryFixedVariant();
            case 41:
                return colorScheme.getSecondaryFixed();
            case 42:
                return colorScheme.getSecondaryFixedDim();
            case 43:
                return colorScheme.getOnSecondaryFixed();
            case 44:
                return colorScheme.getOnSecondaryFixedVariant();
            case 45:
                return colorScheme.getTertiaryFixed();
            case 46:
                return colorScheme.getTertiaryFixedDim();
            case 47:
                return colorScheme.getOnTertiaryFixed();
            case 48:
                return colorScheme.getOnTertiaryFixedVariant();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ColorScheme LocalColorScheme$lambda$1() {
        return m2875lightColorScheme_VG5OTI$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535, null);
    }

    public static final ProvidableCompositionLocal<ColorScheme> getLocalColorScheme() {
        return LocalColorScheme;
    }

    public static final long getValue(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -810780884, "C(<get-value>)1524@69711L11:ColorScheme.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-810780884, i, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1524)");
        }
        long fromToken = fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), colorSchemeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return fromToken;
    }

    /* renamed from: applyTonalElevation-RFCenO8, reason: not valid java name */
    public static final long m2861applyTonalElevationRFCenO8(ColorScheme colorScheme, long j, float f, Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -1610977682, "C(applyTonalElevation)N(backgroundColor:c#ui.graphics.Color,elevation:c#ui.unit.Dp)1540@70581L7:ColorScheme.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1610977682, i, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:1539)");
        }
        ProvidableCompositionLocal<Boolean> providableCompositionLocal = LocalTonalElevationEnabled;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        boolean booleanValue = ((Boolean) consume).booleanValue();
        if (Color.m6040equalsimpl0(j, colorScheme.getSurface()) && booleanValue) {
            j = m2876surfaceColorAtElevation3ABfNKs(colorScheme, f);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return j;
    }

    public static final ProvidableCompositionLocal<Boolean> getLocalTonalElevationEnabled() {
        return LocalTonalElevationEnabled;
    }

    /* renamed from: surfaceColorAtElevation-3ABfNKs, reason: not valid java name */
    public static final long m2876surfaceColorAtElevation3ABfNKs(ColorScheme colorScheme, float f) {
        if (Dp.m8803equalsimpl0(f, Dp.m8798constructorimpl(0))) {
            return colorScheme.getSurface();
        }
        return ColorKt.m6084compositeOverOWjLjI(Color.m6038copywmQWz5c$default(colorScheme.getSurfaceTint(), ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface());
    }
}
