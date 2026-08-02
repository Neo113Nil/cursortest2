package androidx.compose.material;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.RendererCapabilities;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Tab.kt */
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0083\u0001\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u00162\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!\u001a\u008b\u0001\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a{\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u001c\u0010%\u001a\u0018\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00100&¢\u0006\u0002\b\u0016¢\u0006\u0002\b(H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001a7\u0010+\u001a\u00020\u00102\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u00162\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014¢\u0006\u0002\b\u0016H\u0003¢\u0006\u0002\u0010,\u001a@\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u00122\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0002\b\u0016H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u001aD\u00102\u001a\u00020\u0010*\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000bH\u0002\u001a\u001c\u0010=\u001a\u00020\u0010*\u0002032\u0006\u0010>\u001a\u0002072\u0006\u0010:\u001a\u00020\u000bH\u0002\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u0007\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u000e\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006?"}, d2 = {"DoubleLineTextBaselineWithIcon", "Landroidx/compose/ui/unit/Dp;", "F", "HorizontalTextPadding", "IconDistanceFromBaseline", "Landroidx/compose/ui/unit/TextUnit;", "J", "LargeTabHeight", "SingleLineTextBaselineWithIcon", "SmallTabHeight", "TabFadeInAnimationDelay", "", "TabFadeInAnimationDuration", "TabFadeOutAnimationDuration", "TextDistanceFromLeadingIcon", "LeadingIconTab", "", "selected", "", "onClick", "Lkotlin/Function0;", "text", "Landroidx/compose/runtime/Composable;", "icon", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "selectedContentColor", "Landroidx/compose/ui/graphics/Color;", "unselectedContentColor", "LeadingIconTab-0nD-MI0", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "Tab", "Tab-0nD-MI0", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "Tab-EVJuX4I", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TabBaselineLayout", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TabTransition", "activeColor", "inactiveColor", "TabTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "placeTextAndIcon", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "density", "Landroidx/compose/ui/unit/Density;", "textPlaceable", "Landroidx/compose/ui/layout/Placeable;", "iconPlaceable", "tabWidth", "tabHeight", "firstBaseline", "lastBaseline", "placeTextOrIcon", "textOrIconPlaceable", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TabKt {
    private static final int TabFadeInAnimationDelay = 100;
    private static final int TabFadeInAnimationDuration = 150;
    private static final int TabFadeOutAnimationDuration = 100;
    private static final float SmallTabHeight = Dp.m4440constructorimpl(48);
    private static final float LargeTabHeight = Dp.m4440constructorimpl(72);
    private static final float HorizontalTextPadding = Dp.m4440constructorimpl(16);
    private static final float SingleLineTextBaselineWithIcon = Dp.m4440constructorimpl(14);
    private static final float DoubleLineTextBaselineWithIcon = Dp.m4440constructorimpl(6);
    private static final long IconDistanceFromBaseline = TextUnitKt.getSp(20);
    private static final float TextDistanceFromLeadingIcon = Dp.m4440constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:104:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0268 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00d4  */
    /* renamed from: Tab-0nD-MI0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1540Tab0nDMI0(final boolean z, final Function0<Unit> onClick, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, MutableInteractionSource mutableInteractionSource, long j, long j2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i7;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        int i9;
        final int i10;
        long j3;
        long j4;
        long j5;
        boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        long j6;
        Composer composer2;
        final long j7;
        final MutableInteractionSource mutableInteractionSource3;
        final long j8;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final boolean z5;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i11;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1486097588);
        ComposerKt.sourceInformation(startRestartGroup, "C(Tab)P(5,4,3!1,7!2,6:c#ui.graphics.Color,8:c#ui.graphics.Color)96@4350L39,97@4443L7,98@4535L6,106@4792L234:Tab.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(onClick) ? 32 : 16;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    function23 = function2;
                    i3 |= startRestartGroup.changed(function23) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        function24 = function22;
                        i3 |= startRestartGroup.changed(function24) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                            i8 = 57344;
                            mutableInteractionSource2 = mutableInteractionSource;
                        } else {
                            i8 = 57344;
                            mutableInteractionSource2 = mutableInteractionSource;
                            if ((i & 3670016) == 0) {
                                i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                            }
                        }
                        if ((i & 29360128) == 0) {
                            i9 = 458752;
                            if ((i2 & 128) == 0) {
                                i12 = i3;
                                if (startRestartGroup.changed(j)) {
                                    i13 = 8388608;
                                    i10 = i12 | i13;
                                }
                            } else {
                                i12 = i3;
                            }
                            i13 = 4194304;
                            i10 = i12 | i13;
                        } else {
                            i9 = 458752;
                            i10 = i3;
                        }
                        if ((i & 234881024) == 0) {
                            if ((i2 & 256) == 0 && startRestartGroup.changed(j2)) {
                                i11 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                                i10 |= i11;
                            }
                            i11 = 33554432;
                            i10 |= i11;
                        }
                        if ((i10 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i14 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i4 != 0) {
                                    z3 = true;
                                }
                                if (i5 != 0) {
                                    function23 = null;
                                }
                                if (i6 != 0) {
                                    function24 = null;
                                }
                                if (i7 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                }
                                if ((i2 & 128) != 0) {
                                    ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localContentColor);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    j3 = ((Color) consume).m2122unboximpl();
                                    i10 &= -29360129;
                                } else {
                                    j3 = j;
                                }
                                if ((i2 & 256) != 0) {
                                    long j9 = j3;
                                    j5 = Color.m2111copywmQWz5c$default(j9, ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    j4 = j9;
                                    i10 &= -234881025;
                                } else {
                                    j4 = j3;
                                    j5 = j2;
                                }
                                z4 = z3;
                                function25 = function24;
                                j6 = j4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 128) != 0) {
                                    i10 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i10 &= -234881025;
                                }
                                j5 = j2;
                                z4 = z3;
                                function25 = function24;
                                j6 = j;
                            }
                            final Function2<? super Composer, ? super Integer, Unit> function28 = function23;
                            startRestartGroup.endDefaults();
                            final ComposableLambda composableLambda = function28 != null ? ComposableLambdaKt.composableLambda(startRestartGroup, -1729014781, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$styledText$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i15) {
                                    ComposerKt.sourceInformation(composer3, "C102@4667L10,103@4732L39:Tab.kt#jmzs0o");
                                    if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                        TextKt.ProvideTextStyle(TextStyle.m3948copyHL5avdY$default(MaterialTheme.INSTANCE.getTypography(composer3, 6).getButton(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, TextAlign.m4325boximpl(TextAlign.INSTANCE.m4332getCentere0LSkKk()), null, 0L, null, 245759, null), function28, composer3, (i10 >> 9) & 112);
                                    } else {
                                        composer3.skipToGroupEnd();
                                    }
                                }
                            }) : null;
                            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, -178151495, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                                    invoke(columnScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(ColumnScope Tab, Composer composer3, int i15) {
                                    Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                                    ComposerKt.sourceInformation(composer3, "C115@4971L49:Tab.kt#jmzs0o");
                                    if ((i15 & 81) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        TabKt.TabBaselineLayout(composableLambda, function25, composer3, (i10 >> 12) & 112);
                                    }
                                }
                            });
                            int i15 = i10 >> 6;
                            int i16 = 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (i15 & i8) | (i15 & i9) | (i15 & 3670016);
                            Function2<? super Composer, ? super Integer, Unit> function29 = function25;
                            Modifier modifier4 = modifier2;
                            MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                            long j10 = j5;
                            m1541TabEVJuX4I(z, onClick, modifier4, z4, mutableInteractionSource4, j6, j10, composableLambda2, startRestartGroup, i16, 0);
                            composer2 = startRestartGroup;
                            j7 = j10;
                            mutableInteractionSource3 = mutableInteractionSource4;
                            j8 = j6;
                            function26 = function28;
                            function27 = function29;
                            z5 = z4;
                            modifier3 = modifier4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            z5 = z3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            function26 = function23;
                            composer2 = startRestartGroup;
                            function27 = function24;
                            j8 = j;
                            j7 = j2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i17) {
                                TabKt.m1540Tab0nDMI0(z, onClick, modifier3, z5, function26, function27, mutableInteractionSource3, j8, j7, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    function24 = function22;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    if ((i & 29360128) == 0) {
                    }
                    if ((i & 234881024) == 0) {
                    }
                    if ((i10 & 191739611) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if ((i2 & 256) != 0) {
                    }
                    z4 = z3;
                    function25 = function24;
                    j6 = j4;
                    final Function2<? super Composer, ? super Integer, Unit> function282 = function23;
                    startRestartGroup.endDefaults();
                    final Function2<? super Composer, ? super Integer, Unit> composableLambda3 = function282 != null ? ComposableLambdaKt.composableLambda(startRestartGroup, -1729014781, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$styledText$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i152) {
                            ComposerKt.sourceInformation(composer3, "C102@4667L10,103@4732L39:Tab.kt#jmzs0o");
                            if ((i152 & 11) != 2 || !composer3.getSkipping()) {
                                TextKt.ProvideTextStyle(TextStyle.m3948copyHL5avdY$default(MaterialTheme.INSTANCE.getTypography(composer3, 6).getButton(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, TextAlign.m4325boximpl(TextAlign.INSTANCE.m4332getCentere0LSkKk()), null, 0L, null, 245759, null), function282, composer3, (i10 >> 9) & 112);
                            } else {
                                composer3.skipToGroupEnd();
                            }
                        }
                    }) : null;
                    ComposableLambda composableLambda22 = ComposableLambdaKt.composableLambda(startRestartGroup, -178151495, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                            invoke(columnScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(ColumnScope Tab, Composer composer3, int i152) {
                            Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                            ComposerKt.sourceInformation(composer3, "C115@4971L49:Tab.kt#jmzs0o");
                            if ((i152 & 81) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                            } else {
                                TabKt.TabBaselineLayout(composableLambda3, function25, composer3, (i10 >> 12) & 112);
                            }
                        }
                    });
                    int i152 = i10 >> 6;
                    int i162 = 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (i152 & i8) | (i152 & i9) | (i152 & 3670016);
                    Function2<? super Composer, ? super Integer, Unit> function292 = function25;
                    Modifier modifier42 = modifier2;
                    MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                    long j102 = j5;
                    m1541TabEVJuX4I(z, onClick, modifier42, z4, mutableInteractionSource42, j6, j102, composableLambda22, startRestartGroup, i162, 0);
                    composer2 = startRestartGroup;
                    j7 = j102;
                    mutableInteractionSource3 = mutableInteractionSource42;
                    j8 = j6;
                    function26 = function282;
                    function27 = function292;
                    z5 = z4;
                    modifier3 = modifier42;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function23 = function2;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                function24 = function22;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                if ((i & 29360128) == 0) {
                }
                if ((i & 234881024) == 0) {
                }
                if ((i10 & 191739611) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i14 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if ((i2 & 256) != 0) {
                }
                z4 = z3;
                function25 = function24;
                j6 = j4;
                final Function2<? super Composer, ? super Integer, Unit> function2822 = function23;
                startRestartGroup.endDefaults();
                final Function2<? super Composer, ? super Integer, Unit> composableLambda32 = function2822 != null ? ComposableLambdaKt.composableLambda(startRestartGroup, -1729014781, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$styledText$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i1522) {
                        ComposerKt.sourceInformation(composer3, "C102@4667L10,103@4732L39:Tab.kt#jmzs0o");
                        if ((i1522 & 11) != 2 || !composer3.getSkipping()) {
                            TextKt.ProvideTextStyle(TextStyle.m3948copyHL5avdY$default(MaterialTheme.INSTANCE.getTypography(composer3, 6).getButton(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, TextAlign.m4325boximpl(TextAlign.INSTANCE.m4332getCentere0LSkKk()), null, 0L, null, 245759, null), function2822, composer3, (i10 >> 9) & 112);
                        } else {
                            composer3.skipToGroupEnd();
                        }
                    }
                }) : null;
                ComposableLambda composableLambda222 = ComposableLambdaKt.composableLambda(startRestartGroup, -178151495, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                        invoke(columnScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope Tab, Composer composer3, int i1522) {
                        Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                        ComposerKt.sourceInformation(composer3, "C115@4971L49:Tab.kt#jmzs0o");
                        if ((i1522 & 81) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                        } else {
                            TabKt.TabBaselineLayout(composableLambda32, function25, composer3, (i10 >> 12) & 112);
                        }
                    }
                });
                int i1522 = i10 >> 6;
                int i1622 = 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (i1522 & i8) | (i1522 & i9) | (i1522 & 3670016);
                Function2<? super Composer, ? super Integer, Unit> function2922 = function25;
                Modifier modifier422 = modifier2;
                MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
                long j1022 = j5;
                m1541TabEVJuX4I(z, onClick, modifier422, z4, mutableInteractionSource422, j6, j1022, composableLambda222, startRestartGroup, i1622, 0);
                composer2 = startRestartGroup;
                j7 = j1022;
                mutableInteractionSource3 = mutableInteractionSource422;
                j8 = j6;
                function26 = function2822;
                function27 = function2922;
                z5 = z4;
                modifier3 = modifier422;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function23 = function2;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            function24 = function22;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            if ((i & 29360128) == 0) {
            }
            if ((i & 234881024) == 0) {
            }
            if ((i10 & 191739611) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i14 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            z4 = z3;
            function25 = function24;
            j6 = j4;
            final Function2<? super Composer, ? super Integer, Unit> function28222 = function23;
            startRestartGroup.endDefaults();
            final Function2<? super Composer, ? super Integer, Unit> composableLambda322 = function28222 != null ? ComposableLambdaKt.composableLambda(startRestartGroup, -1729014781, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$styledText$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i15222) {
                    ComposerKt.sourceInformation(composer3, "C102@4667L10,103@4732L39:Tab.kt#jmzs0o");
                    if ((i15222 & 11) != 2 || !composer3.getSkipping()) {
                        TextKt.ProvideTextStyle(TextStyle.m3948copyHL5avdY$default(MaterialTheme.INSTANCE.getTypography(composer3, 6).getButton(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, TextAlign.m4325boximpl(TextAlign.INSTANCE.m4332getCentere0LSkKk()), null, 0L, null, 245759, null), function28222, composer3, (i10 >> 9) & 112);
                    } else {
                        composer3.skipToGroupEnd();
                    }
                }
            }) : null;
            ComposableLambda composableLambda2222 = ComposableLambdaKt.composableLambda(startRestartGroup, -178151495, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                    invoke(columnScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope Tab, Composer composer3, int i15222) {
                    Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                    ComposerKt.sourceInformation(composer3, "C115@4971L49:Tab.kt#jmzs0o");
                    if ((i15222 & 81) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                    } else {
                        TabKt.TabBaselineLayout(composableLambda322, function25, composer3, (i10 >> 12) & 112);
                    }
                }
            });
            int i15222 = i10 >> 6;
            int i16222 = 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (i15222 & i8) | (i15222 & i9) | (i15222 & 3670016);
            Function2<? super Composer, ? super Integer, Unit> function29222 = function25;
            Modifier modifier4222 = modifier2;
            MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
            long j10222 = j5;
            m1541TabEVJuX4I(z, onClick, modifier4222, z4, mutableInteractionSource4222, j6, j10222, composableLambda2222, startRestartGroup, i16222, 0);
            composer2 = startRestartGroup;
            j7 = j10222;
            mutableInteractionSource3 = mutableInteractionSource4222;
            j8 = j6;
            function26 = function28222;
            function27 = function29222;
            z5 = z4;
            modifier3 = modifier4222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function23 = function2;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        function24 = function22;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        if ((i & 29360128) == 0) {
        }
        if ((i & 234881024) == 0) {
        }
        if ((i10 & 191739611) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i14 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        z4 = z3;
        function25 = function24;
        j6 = j4;
        final Function2<? super Composer, ? super Integer, Unit> function282222 = function23;
        startRestartGroup.endDefaults();
        final Function2<? super Composer, ? super Integer, Unit> composableLambda3222 = function282222 != null ? ComposableLambdaKt.composableLambda(startRestartGroup, -1729014781, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$styledText$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i152222) {
                ComposerKt.sourceInformation(composer3, "C102@4667L10,103@4732L39:Tab.kt#jmzs0o");
                if ((i152222 & 11) != 2 || !composer3.getSkipping()) {
                    TextKt.ProvideTextStyle(TextStyle.m3948copyHL5avdY$default(MaterialTheme.INSTANCE.getTypography(composer3, 6).getButton(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, TextAlign.m4325boximpl(TextAlign.INSTANCE.m4332getCentere0LSkKk()), null, 0L, null, 245759, null), function282222, composer3, (i10 >> 9) & 112);
                } else {
                    composer3.skipToGroupEnd();
                }
            }
        }) : null;
        ComposableLambda composableLambda22222 = ComposableLambdaKt.composableLambda(startRestartGroup, -178151495, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                invoke(columnScope, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope Tab, Composer composer3, int i152222) {
                Intrinsics.checkNotNullParameter(Tab, "$this$Tab");
                ComposerKt.sourceInformation(composer3, "C115@4971L49:Tab.kt#jmzs0o");
                if ((i152222 & 81) == 16 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                } else {
                    TabKt.TabBaselineLayout(composableLambda3222, function25, composer3, (i10 >> 12) & 112);
                }
            }
        });
        int i152222 = i10 >> 6;
        int i162222 = 12582912 | (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (i152222 & i8) | (i152222 & i9) | (i152222 & 3670016);
        Function2<? super Composer, ? super Integer, Unit> function292222 = function25;
        Modifier modifier42222 = modifier2;
        MutableInteractionSource mutableInteractionSource42222 = mutableInteractionSource2;
        long j102222 = j5;
        m1541TabEVJuX4I(z, onClick, modifier42222, z4, mutableInteractionSource42222, j6, j102222, composableLambda22222, startRestartGroup, i162222, 0);
        composer2 = startRestartGroup;
        j7 = j102222;
        mutableInteractionSource3 = mutableInteractionSource42222;
        j8 = j6;
        function26 = function282222;
        function27 = function292222;
        z5 = z4;
        modifier3 = modifier42222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0252 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00b1  */
    /* renamed from: LeadingIconTab-0nD-MI0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1539LeadingIconTab0nDMI0(final boolean z, final Function0<Unit> onClick, final Function2<? super Composer, ? super Integer, Unit> text, final Function2<? super Composer, ? super Integer, Unit> icon, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, long j, long j2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        long j3;
        long j4;
        long j5;
        final int i6;
        final Modifier modifier3;
        final boolean z4;
        final MutableInteractionSource mutableInteractionSource3;
        final MutableInteractionSource mutableInteractionSource4;
        final boolean z5;
        final long j6;
        final long j7;
        final Modifier modifier4;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer startRestartGroup = composer.startRestartGroup(-1499861761);
        ComposerKt.sourceInformation(startRestartGroup, "C(LeadingIconTab)P(5,4,7,1,3!2,6:c#ui.graphics.Color,8:c#ui.graphics.Color)158@6914L39,159@7007L7,160@7099L6,165@7347L60,167@7413L929:Tab.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(onClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(text) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(icon) ? 2048 : 1024;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((458752 & i) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 131072 : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((3670016 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                    if ((29360128 & i) != 0) {
                        if ((i2 & 128) == 0) {
                            j3 = j;
                            if (startRestartGroup.changed(j3)) {
                                i8 = 8388608;
                                i3 |= i8;
                            }
                        } else {
                            j3 = j;
                        }
                        i8 = 4194304;
                        i3 |= i8;
                    } else {
                        j3 = j;
                    }
                    if ((i & 234881024) == 0) {
                        if ((i2 & 256) == 0 && startRestartGroup.changed(j2)) {
                            i7 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            i3 |= i7;
                        }
                        i7 = 33554432;
                        i3 |= i7;
                    }
                    if ((i3 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i9 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i5 != 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                            }
                            if ((i2 & 128) != 0) {
                                ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localContentColor);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                j3 = ((Color) consume).m2122unboximpl();
                                i3 &= -29360129;
                            }
                            if ((i2 & 256) == 0) {
                                long j8 = j3;
                                j5 = Color.m2111copywmQWz5c$default(j8, ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                j4 = j8;
                                i3 &= -234881025;
                            } else {
                                j4 = j3;
                                j5 = j2;
                            }
                            i6 = i3;
                            modifier3 = modifier2;
                            z4 = z3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                            }
                            i6 = i3;
                            modifier3 = modifier2;
                            z4 = z3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            j4 = j3;
                            j5 = j2;
                        }
                        startRestartGroup.endDefaults();
                        final Indication m1610rememberRipple9IZ8Weo = RippleKt.m1610rememberRipple9IZ8Weo(true, 0.0f, j4, startRestartGroup, ((i6 >> 15) & 896) | 6, 2);
                        int i10 = i6 >> 21;
                        m1542TabTransitionKlgxPg(j4, j5, z, ComposableLambdaKt.composableLambda(startRestartGroup, 866677691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11) {
                                float f;
                                float f2;
                                float f3;
                                ComposerKt.sourceInformation(composer2, "C168@7493L843:Tab.kt#jmzs0o");
                                if ((i11 & 11) != 2 || !composer2.getSkipping()) {
                                    Modifier modifier5 = Modifier.this;
                                    f = TabKt.SmallTabHeight;
                                    Modifier m826selectableO2vRcR0 = SelectableKt.m826selectableO2vRcR0(SizeKt.m620height3ABfNKs(modifier5, f), z, mutableInteractionSource3, m1610rememberRipple9IZ8Weo, z4, Role.m3760boximpl(Role.INSTANCE.m3773getTabo7Vup1c()), onClick);
                                    f2 = TabKt.HorizontalTextPadding;
                                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m587paddingVpY3zN4$default(m826selectableO2vRcR0, f2, 0.0f, 2, null), 0.0f, 1, null);
                                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    Function2<Composer, Integer, Unit> function2 = icon;
                                    int i12 = i6;
                                    Function2<Composer, Integer, Unit> function22 = text;
                                    composer2.startReplaceableGroup(693286680);
                                    ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                                    composer2.startReplaceableGroup(-1323940314);
                                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume2 = composer2.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    Density density = (Density) consume2;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume3 = composer2.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume4 = composer2.consume(localViewConfiguration);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    composer2.disableReusing();
                                    Composer m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                                    Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer2.enableReusing();
                                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    composer2.startReplaceableGroup(-678309503);
                                    ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(1002887383);
                                    ComposerKt.sourceInformation(composer2, "C184@8105L6,185@8124L59,186@8222L10,187@8287L39:Tab.kt#jmzs0o");
                                    function2.invoke(composer2, Integer.valueOf((i12 >> 9) & 14));
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    f3 = TabKt.TextDistanceFromLeadingIcon;
                                    SpacerKt.Spacer(SizeKt.m631requiredWidth3ABfNKs(companion, f3), composer2, 6);
                                    TextKt.ProvideTextStyle(TextStyle.m3948copyHL5avdY$default(MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, TextAlign.m4325boximpl(TextAlign.INSTANCE.m4332getCentere0LSkKk()), null, 0L, null, 245759, null), function22, composer2, (i12 >> 3) & 112);
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), startRestartGroup, (i10 & 112) | (i10 & 14) | 3072 | ((i6 << 6) & 896));
                        startRestartGroup = startRestartGroup;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z5 = z4;
                        j6 = j5;
                        j7 = j4;
                        modifier4 = modifier3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        z5 = z3;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        j7 = j3;
                        j6 = j2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            TabKt.m1539LeadingIconTab0nDMI0(z, onClick, text, icon, modifier4, z5, mutableInteractionSource4, j7, j6, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((29360128 & i) != 0) {
                }
                if ((i & 234881024) == 0) {
                }
                if ((i3 & 191739611) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if ((i2 & 256) == 0) {
                }
                i6 = i3;
                modifier3 = modifier2;
                z4 = z3;
                mutableInteractionSource3 = mutableInteractionSource2;
                startRestartGroup.endDefaults();
                final Indication m1610rememberRipple9IZ8Weo2 = RippleKt.m1610rememberRipple9IZ8Weo(true, 0.0f, j4, startRestartGroup, ((i6 >> 15) & 896) | 6, 2);
                int i102 = i6 >> 21;
                m1542TabTransitionKlgxPg(j4, j5, z, ComposableLambdaKt.composableLambda(startRestartGroup, 866677691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        float f;
                        float f2;
                        float f3;
                        ComposerKt.sourceInformation(composer2, "C168@7493L843:Tab.kt#jmzs0o");
                        if ((i11 & 11) != 2 || !composer2.getSkipping()) {
                            Modifier modifier5 = Modifier.this;
                            f = TabKt.SmallTabHeight;
                            Modifier m826selectableO2vRcR0 = SelectableKt.m826selectableO2vRcR0(SizeKt.m620height3ABfNKs(modifier5, f), z, mutableInteractionSource3, m1610rememberRipple9IZ8Weo2, z4, Role.m3760boximpl(Role.INSTANCE.m3773getTabo7Vup1c()), onClick);
                            f2 = TabKt.HorizontalTextPadding;
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m587paddingVpY3zN4$default(m826selectableO2vRcR0, f2, 0.0f, 2, null), 0.0f, 1, null);
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Function2<Composer, Integer, Unit> function2 = icon;
                            int i12 = i6;
                            Function2<Composer, Integer, Unit> function22 = text;
                            composer2.startReplaceableGroup(693286680);
                            ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                            composer2.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume2 = composer2.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            Density density = (Density) consume2;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume3 = composer2.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            LayoutDirection layoutDirection = (LayoutDirection) consume3;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume4 = composer2.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composer2.disableReusing();
                            Composer m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                            Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer2.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            composer2.startReplaceableGroup(-678309503);
                            ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(1002887383);
                            ComposerKt.sourceInformation(composer2, "C184@8105L6,185@8124L59,186@8222L10,187@8287L39:Tab.kt#jmzs0o");
                            function2.invoke(composer2, Integer.valueOf((i12 >> 9) & 14));
                            Modifier.Companion companion = Modifier.INSTANCE;
                            f3 = TabKt.TextDistanceFromLeadingIcon;
                            SpacerKt.Spacer(SizeKt.m631requiredWidth3ABfNKs(companion, f3), composer2, 6);
                            TextKt.ProvideTextStyle(TextStyle.m3948copyHL5avdY$default(MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, TextAlign.m4325boximpl(TextAlign.INSTANCE.m4332getCentere0LSkKk()), null, 0L, null, 245759, null), function22, composer2, (i12 >> 3) & 112);
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, (i102 & 112) | (i102 & 14) | 3072 | ((i6 << 6) & 896));
                startRestartGroup = startRestartGroup;
                mutableInteractionSource4 = mutableInteractionSource3;
                z5 = z4;
                j6 = j5;
                j7 = j4;
                modifier4 = modifier3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z2;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((29360128 & i) != 0) {
            }
            if ((i & 234881024) == 0) {
            }
            if ((i3 & 191739611) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i6 = i3;
            modifier3 = modifier2;
            z4 = z3;
            mutableInteractionSource3 = mutableInteractionSource2;
            startRestartGroup.endDefaults();
            final Indication m1610rememberRipple9IZ8Weo22 = RippleKt.m1610rememberRipple9IZ8Weo(true, 0.0f, j4, startRestartGroup, ((i6 >> 15) & 896) | 6, 2);
            int i1022 = i6 >> 21;
            m1542TabTransitionKlgxPg(j4, j5, z, ComposableLambdaKt.composableLambda(startRestartGroup, 866677691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i11) {
                    float f;
                    float f2;
                    float f3;
                    ComposerKt.sourceInformation(composer2, "C168@7493L843:Tab.kt#jmzs0o");
                    if ((i11 & 11) != 2 || !composer2.getSkipping()) {
                        Modifier modifier5 = Modifier.this;
                        f = TabKt.SmallTabHeight;
                        Modifier m826selectableO2vRcR0 = SelectableKt.m826selectableO2vRcR0(SizeKt.m620height3ABfNKs(modifier5, f), z, mutableInteractionSource3, m1610rememberRipple9IZ8Weo22, z4, Role.m3760boximpl(Role.INSTANCE.m3773getTabo7Vup1c()), onClick);
                        f2 = TabKt.HorizontalTextPadding;
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m587paddingVpY3zN4$default(m826selectableO2vRcR0, f2, 0.0f, 2, null), 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function2<Composer, Integer, Unit> function2 = icon;
                        int i12 = i6;
                        Function2<Composer, Integer, Unit> function22 = text;
                        composer2.startReplaceableGroup(693286680);
                        ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                        composer2.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume2 = composer2.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Density density = (Density) consume2;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = composer2.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        LayoutDirection layoutDirection = (LayoutDirection) consume3;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume4 = composer2.consume(localViewConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                        Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer2.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        composer2.startReplaceableGroup(-678309503);
                        ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        composer2.startReplaceableGroup(1002887383);
                        ComposerKt.sourceInformation(composer2, "C184@8105L6,185@8124L59,186@8222L10,187@8287L39:Tab.kt#jmzs0o");
                        function2.invoke(composer2, Integer.valueOf((i12 >> 9) & 14));
                        Modifier.Companion companion = Modifier.INSTANCE;
                        f3 = TabKt.TextDistanceFromLeadingIcon;
                        SpacerKt.Spacer(SizeKt.m631requiredWidth3ABfNKs(companion, f3), composer2, 6);
                        TextKt.ProvideTextStyle(TextStyle.m3948copyHL5avdY$default(MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, TextAlign.m4325boximpl(TextAlign.INSTANCE.m4332getCentere0LSkKk()), null, 0L, null, 245759, null), function22, composer2, (i12 >> 3) & 112);
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, (i1022 & 112) | (i1022 & 14) | 3072 | ((i6 << 6) & 896));
            startRestartGroup = startRestartGroup;
            mutableInteractionSource4 = mutableInteractionSource3;
            z5 = z4;
            j6 = j5;
            j7 = j4;
            modifier4 = modifier3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((29360128 & i) != 0) {
        }
        if ((i & 234881024) == 0) {
        }
        if ((i3 & 191739611) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i6 = i3;
        modifier3 = modifier2;
        z4 = z3;
        mutableInteractionSource3 = mutableInteractionSource2;
        startRestartGroup.endDefaults();
        final Indication m1610rememberRipple9IZ8Weo222 = RippleKt.m1610rememberRipple9IZ8Weo(true, 0.0f, j4, startRestartGroup, ((i6 >> 15) & 896) | 6, 2);
        int i10222 = i6 >> 21;
        m1542TabTransitionKlgxPg(j4, j5, z, ComposableLambdaKt.composableLambda(startRestartGroup, 866677691, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i11) {
                float f;
                float f2;
                float f3;
                ComposerKt.sourceInformation(composer2, "C168@7493L843:Tab.kt#jmzs0o");
                if ((i11 & 11) != 2 || !composer2.getSkipping()) {
                    Modifier modifier5 = Modifier.this;
                    f = TabKt.SmallTabHeight;
                    Modifier m826selectableO2vRcR0 = SelectableKt.m826selectableO2vRcR0(SizeKt.m620height3ABfNKs(modifier5, f), z, mutableInteractionSource3, m1610rememberRipple9IZ8Weo222, z4, Role.m3760boximpl(Role.INSTANCE.m3773getTabo7Vup1c()), onClick);
                    f2 = TabKt.HorizontalTextPadding;
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m587paddingVpY3zN4$default(m826selectableO2vRcR0, f2, 0.0f, 2, null), 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Function2<Composer, Integer, Unit> function2 = icon;
                    int i12 = i6;
                    Function2<Composer, Integer, Unit> function22 = text;
                    composer2.startReplaceableGroup(693286680);
                    ComposerKt.sourceInformation(composer2, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume2 = composer2.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Density density = (Density) consume2;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume3 = composer2.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    LayoutDirection layoutDirection = (LayoutDirection) consume3;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume4 = composer2.consume(localViewConfiguration);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer m1642constructorimpl = Updater.m1642constructorimpl(composer2);
                    Updater.m1649setimpl(m1642constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-678309503);
                    ComposerKt.sourceInformation(composer2, "C80@3988L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(1002887383);
                    ComposerKt.sourceInformation(composer2, "C184@8105L6,185@8124L59,186@8222L10,187@8287L39:Tab.kt#jmzs0o");
                    function2.invoke(composer2, Integer.valueOf((i12 >> 9) & 14));
                    Modifier.Companion companion = Modifier.INSTANCE;
                    f3 = TabKt.TextDistanceFromLeadingIcon;
                    SpacerKt.Spacer(SizeKt.m631requiredWidth3ABfNKs(companion, f3), composer2, 6);
                    TextKt.ProvideTextStyle(TextStyle.m3948copyHL5avdY$default(MaterialTheme.INSTANCE.getTypography(composer2, 6).getButton(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, TextAlign.m4325boximpl(TextAlign.INSTANCE.m4332getCentere0LSkKk()), null, 0L, null, 245759, null), function22, composer2, (i12 >> 3) & 112);
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, (i10222 & 112) | (i10222 & 14) | 3072 | ((i6 << 6) & 896));
        startRestartGroup = startRestartGroup;
        mutableInteractionSource4 = mutableInteractionSource3;
        z5 = z4;
        j6 = j5;
        j7 = j4;
        modifier4 = modifier3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x021f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0075  */
    /* renamed from: Tab-EVJuX4I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1541TabEVJuX4I(final boolean z, final Function0<Unit> onClick, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, long j, long j2, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        long j3;
        int i6;
        int i7;
        long j4;
        long j5;
        final Modifier modifier3;
        final boolean z4;
        final MutableInteractionSource mutableInteractionSource3;
        final int i8;
        Composer composer2;
        final long j6;
        final MutableInteractionSource mutableInteractionSource4;
        final boolean z5;
        final long j7;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(713679175);
        ComposerKt.sourceInformation(startRestartGroup, "C(Tab)P(5,4,3,1,2,6:c#ui.graphics.Color,7:c#ui.graphics.Color)227@10083L39,228@10176L7,229@10268L6,235@10562L60,237@10628L618:Tab.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(onClick) ? 32 : 16;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            j3 = j;
                            if (startRestartGroup.changed(j3)) {
                                i12 = 131072;
                                i3 |= i12;
                            }
                        } else {
                            j3 = j;
                        }
                        i12 = 65536;
                        i3 |= i12;
                    } else {
                        j3 = j;
                    }
                    if ((3670016 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            i10 = i3;
                            i7 = i13;
                            if (startRestartGroup.changed(j2)) {
                                i11 = 1048576;
                                i6 = i10 | i11;
                            }
                        } else {
                            i10 = i3;
                            i7 = i13;
                        }
                        i11 = 524288;
                        i6 = i10 | i11;
                    } else {
                        i6 = i3;
                        i7 = i13;
                    }
                    if ((i2 & 128) != 0) {
                        i9 = (29360128 & i) == 0 ? startRestartGroup.changed(content) ? 8388608 : 4194304 : 12582912;
                        if ((23967451 & i6) == 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i7 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i4 != 0) {
                                    z3 = true;
                                }
                                if (i5 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                                }
                                if ((i2 & 32) != 0) {
                                    ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localContentColor);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    j3 = ((Color) consume).m2122unboximpl();
                                    i6 &= -458753;
                                }
                                j4 = j3;
                                if ((i2 & 64) != 0) {
                                    j5 = Color.m2111copywmQWz5c$default(j4, ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                    i6 &= -3670017;
                                } else {
                                    j5 = j2;
                                }
                                modifier3 = modifier2;
                                z4 = z3;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                i8 = i6;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i6 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i6 &= -3670017;
                                }
                                modifier3 = modifier2;
                                z4 = z3;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                j4 = j3;
                                i8 = i6;
                                j5 = j2;
                            }
                            startRestartGroup.endDefaults();
                            final Indication m1610rememberRipple9IZ8Weo = RippleKt.m1610rememberRipple9IZ8Weo(true, 0.0f, j4, startRestartGroup, ((i8 >> 9) & 896) | 6, 2);
                            composer2 = startRestartGroup;
                            MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                            boolean z6 = z4;
                            int i14 = i8 >> 15;
                            long j8 = j5;
                            m1542TabTransitionKlgxPg(j4, j8, z, ComposableLambdaKt.composableLambda(composer2, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i15) {
                                    ComposerKt.sourceInformation(composer3, "C238@10708L532:Tab.kt#jmzs0o");
                                    if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m826selectableO2vRcR0(Modifier.this, z, mutableInteractionSource3, m1610rememberRipple9IZ8Weo, z4, Role.m3760boximpl(Role.INSTANCE.m3773getTabo7Vup1c()), onClick), 0.0f, 1, null);
                                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                        Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                        int i16 = ((i8 >> 12) & 7168) | 432;
                                        composer3.startReplaceableGroup(-483455358);
                                        ComposerKt.sourceInformation(composer3, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer3, 54);
                                        composer3.startReplaceableGroup(-1323940314);
                                        ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume2 = composer3.consume(localDensity);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        Density density = (Density) consume2;
                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume3 = composer3.consume(localLayoutDirection);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                        Object consume4 = composer3.consume(localViewConfiguration);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        composer3.disableReusing();
                                        Composer m1642constructorimpl = Updater.m1642constructorimpl(composer3);
                                        Updater.m1649setimpl(m1642constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                        composer3.enableReusing();
                                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                                        composer3.startReplaceableGroup(2058660585);
                                        composer3.startReplaceableGroup(-1163856341);
                                        ComposerKt.sourceInformation(composer3, "C79@3994L9:Column.kt#2w3rfo");
                                        function3.invoke(ColumnScopeInstance.INSTANCE, composer3, Integer.valueOf(((i16 >> 6) & 112) | 6));
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        composer3.endNode();
                                        composer3.endReplaceableGroup();
                                        composer3.endReplaceableGroup();
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), composer2, (i14 & 112) | (i14 & 14) | 3072 | ((i8 << 6) & 896));
                            j6 = j8;
                            modifier2 = modifier3;
                            mutableInteractionSource4 = mutableInteractionSource5;
                            z5 = z6;
                            j7 = j4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            z5 = z3;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            j7 = j3;
                            j6 = j2;
                            composer2 = startRestartGroup;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i15) {
                                TabKt.m1541TabEVJuX4I(z, onClick, modifier2, z5, mutableInteractionSource4, j7, j6, content, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i6 |= i9;
                    if ((23967451 & i6) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    j4 = j3;
                    if ((i2 & 64) != 0) {
                    }
                    modifier3 = modifier2;
                    z4 = z3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    i8 = i6;
                    startRestartGroup.endDefaults();
                    final Indication m1610rememberRipple9IZ8Weo2 = RippleKt.m1610rememberRipple9IZ8Weo(true, 0.0f, j4, startRestartGroup, ((i8 >> 9) & 896) | 6, 2);
                    composer2 = startRestartGroup;
                    MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                    boolean z62 = z4;
                    int i142 = i8 >> 15;
                    long j82 = j5;
                    m1542TabTransitionKlgxPg(j4, j82, z, ComposableLambdaKt.composableLambda(composer2, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i15) {
                            ComposerKt.sourceInformation(composer3, "C238@10708L532:Tab.kt#jmzs0o");
                            if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m826selectableO2vRcR0(Modifier.this, z, mutableInteractionSource3, m1610rememberRipple9IZ8Weo2, z4, Role.m3760boximpl(Role.INSTANCE.m3773getTabo7Vup1c()), onClick), 0.0f, 1, null);
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                                int i16 = ((i8 >> 12) & 7168) | 432;
                                composer3.startReplaceableGroup(-483455358);
                                ComposerKt.sourceInformation(composer3, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer3, 54);
                                composer3.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume2 = composer3.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                Density density = (Density) consume2;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume3 = composer3.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                LayoutDirection layoutDirection = (LayoutDirection) consume3;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume4 = composer3.consume(localViewConfiguration);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                composer3.disableReusing();
                                Composer m1642constructorimpl = Updater.m1642constructorimpl(composer3);
                                Updater.m1649setimpl(m1642constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                composer3.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                composer3.startReplaceableGroup(-1163856341);
                                ComposerKt.sourceInformation(composer3, "C79@3994L9:Column.kt#2w3rfo");
                                function3.invoke(ColumnScopeInstance.INSTANCE, composer3, Integer.valueOf(((i16 >> 6) & 112) | 6));
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, (i142 & 112) | (i142 & 14) | 3072 | ((i8 << 6) & 896));
                    j6 = j82;
                    modifier2 = modifier3;
                    mutableInteractionSource4 = mutableInteractionSource52;
                    z5 = z62;
                    j7 = j4;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((458752 & i) != 0) {
                }
                if ((3670016 & i) != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                i6 |= i9;
                if ((23967451 & i6) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i7 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                j4 = j3;
                if ((i2 & 64) != 0) {
                }
                modifier3 = modifier2;
                z4 = z3;
                mutableInteractionSource3 = mutableInteractionSource2;
                i8 = i6;
                startRestartGroup.endDefaults();
                final Indication m1610rememberRipple9IZ8Weo22 = RippleKt.m1610rememberRipple9IZ8Weo(true, 0.0f, j4, startRestartGroup, ((i8 >> 9) & 896) | 6, 2);
                composer2 = startRestartGroup;
                MutableInteractionSource mutableInteractionSource522 = mutableInteractionSource3;
                boolean z622 = z4;
                int i1422 = i8 >> 15;
                long j822 = j5;
                m1542TabTransitionKlgxPg(j4, j822, z, ComposableLambdaKt.composableLambda(composer2, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i15) {
                        ComposerKt.sourceInformation(composer3, "C238@10708L532:Tab.kt#jmzs0o");
                        if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m826selectableO2vRcR0(Modifier.this, z, mutableInteractionSource3, m1610rememberRipple9IZ8Weo22, z4, Role.m3760boximpl(Role.INSTANCE.m3773getTabo7Vup1c()), onClick), 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            int i16 = ((i8 >> 12) & 7168) | 432;
                            composer3.startReplaceableGroup(-483455358);
                            ComposerKt.sourceInformation(composer3, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer3, 54);
                            composer3.startReplaceableGroup(-1323940314);
                            ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume2 = composer3.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            Density density = (Density) consume2;
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume3 = composer3.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            LayoutDirection layoutDirection = (LayoutDirection) consume3;
                            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                            ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                            Object consume4 = composer3.consume(localViewConfiguration);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            composer3.disableReusing();
                            Composer m1642constructorimpl = Updater.m1642constructorimpl(composer3);
                            Updater.m1649setimpl(m1642constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                            composer3.enableReusing();
                            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            composer3.startReplaceableGroup(-1163856341);
                            ComposerKt.sourceInformation(composer3, "C79@3994L9:Column.kt#2w3rfo");
                            function3.invoke(ColumnScopeInstance.INSTANCE, composer3, Integer.valueOf(((i16 >> 6) & 112) | 6));
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composer2, (i1422 & 112) | (i1422 & 14) | 3072 | ((i8 << 6) & 896));
                j6 = j822;
                modifier2 = modifier3;
                mutableInteractionSource4 = mutableInteractionSource522;
                z5 = z622;
                j7 = j4;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((458752 & i) != 0) {
            }
            if ((3670016 & i) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            i6 |= i9;
            if ((23967451 & i6) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            j4 = j3;
            if ((i2 & 64) != 0) {
            }
            modifier3 = modifier2;
            z4 = z3;
            mutableInteractionSource3 = mutableInteractionSource2;
            i8 = i6;
            startRestartGroup.endDefaults();
            final Indication m1610rememberRipple9IZ8Weo222 = RippleKt.m1610rememberRipple9IZ8Weo(true, 0.0f, j4, startRestartGroup, ((i8 >> 9) & 896) | 6, 2);
            composer2 = startRestartGroup;
            MutableInteractionSource mutableInteractionSource5222 = mutableInteractionSource3;
            boolean z6222 = z4;
            int i14222 = i8 >> 15;
            long j8222 = j5;
            m1542TabTransitionKlgxPg(j4, j8222, z, ComposableLambdaKt.composableLambda(composer2, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i15) {
                    ComposerKt.sourceInformation(composer3, "C238@10708L532:Tab.kt#jmzs0o");
                    if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m826selectableO2vRcR0(Modifier.this, z, mutableInteractionSource3, m1610rememberRipple9IZ8Weo222, z4, Role.m3760boximpl(Role.INSTANCE.m3773getTabo7Vup1c()), onClick), 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                        int i16 = ((i8 >> 12) & 7168) | 432;
                        composer3.startReplaceableGroup(-483455358);
                        ComposerKt.sourceInformation(composer3, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer3, 54);
                        composer3.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume2 = composer3.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        Density density = (Density) consume2;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume3 = composer3.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        LayoutDirection layoutDirection = (LayoutDirection) consume3;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume4 = composer3.consume(localViewConfiguration);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        composer3.disableReusing();
                        Composer m1642constructorimpl = Updater.m1642constructorimpl(composer3);
                        Updater.m1649setimpl(m1642constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                        Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        composer3.enableReusing();
                        materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        composer3.startReplaceableGroup(-1163856341);
                        ComposerKt.sourceInformation(composer3, "C79@3994L9:Column.kt#2w3rfo");
                        function3.invoke(ColumnScopeInstance.INSTANCE, composer3, Integer.valueOf(((i16 >> 6) & 112) | 6));
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), composer2, (i14222 & 112) | (i14222 & 14) | 3072 | ((i8 << 6) & 896));
            j6 = j8222;
            modifier2 = modifier3;
            mutableInteractionSource4 = mutableInteractionSource5222;
            z5 = z6222;
            j7 = j4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((458752 & i) != 0) {
        }
        if ((3670016 & i) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        i6 |= i9;
        if ((23967451 & i6) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        j4 = j3;
        if ((i2 & 64) != 0) {
        }
        modifier3 = modifier2;
        z4 = z3;
        mutableInteractionSource3 = mutableInteractionSource2;
        i8 = i6;
        startRestartGroup.endDefaults();
        final Indication m1610rememberRipple9IZ8Weo2222 = RippleKt.m1610rememberRipple9IZ8Weo(true, 0.0f, j4, startRestartGroup, ((i8 >> 9) & 896) | 6, 2);
        composer2 = startRestartGroup;
        MutableInteractionSource mutableInteractionSource52222 = mutableInteractionSource3;
        boolean z62222 = z4;
        int i142222 = i8 >> 15;
        long j82222 = j5;
        m1542TabTransitionKlgxPg(j4, j82222, z, ComposableLambdaKt.composableLambda(composer2, -1237246709, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i15) {
                ComposerKt.sourceInformation(composer3, "C238@10708L532:Tab.kt#jmzs0o");
                if ((i15 & 11) != 2 || !composer3.getSkipping()) {
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m826selectableO2vRcR0(Modifier.this, z, mutableInteractionSource3, m1610rememberRipple9IZ8Weo2222, z4, Role.m3760boximpl(Role.INSTANCE.m3773getTabo7Vup1c()), onClick), 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                    int i16 = ((i8 >> 12) & 7168) | 432;
                    composer3.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composer3, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer3, 54);
                    composer3.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume2 = composer3.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Density density = (Density) consume2;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume3 = composer3.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    LayoutDirection layoutDirection = (LayoutDirection) consume3;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume4 = composer3.consume(localViewConfiguration);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    composer3.disableReusing();
                    Composer m1642constructorimpl = Updater.m1642constructorimpl(composer3);
                    Updater.m1649setimpl(m1642constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                    Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    composer3.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(composer3)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    composer3.startReplaceableGroup(-1163856341);
                    ComposerKt.sourceInformation(composer3, "C79@3994L9:Column.kt#2w3rfo");
                    function3.invoke(ColumnScopeInstance.INSTANCE, composer3, Integer.valueOf(((i16 >> 6) & 112) | 6));
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    composer3.endNode();
                    composer3.endReplaceableGroup();
                    composer3.endReplaceableGroup();
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }), composer2, (i142222 & 112) | (i142222 & 14) | 3072 | ((i8 << 6) & 896));
        j6 = j82222;
        modifier2 = modifier3;
        mutableInteractionSource4 = mutableInteractionSource52222;
        z5 = z62222;
        j7 = j4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TabTransition-Klgx-Pg, reason: not valid java name */
    public static final void m1542TabTransitionKlgxPg(final long j, long j2, final boolean z, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        long j3;
        boolean z2;
        Composer startRestartGroup = composer.startRestartGroup(-405571117);
        ComposerKt.sourceInformation(startRestartGroup, "C(TabTransition)P(0:c#ui.graphics.Color,2:c#ui.graphics.Color,3)268@11677L26,269@11732L550,287@12287L164:Tab.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            j3 = j2;
            i2 |= startRestartGroup.changed(j3) ? 32 : 16;
        } else {
            j3 = j2;
        }
        if ((i & 896) == 0) {
            z2 = z;
            i2 |= startRestartGroup.changed(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(function2) ? 2048 : 1024;
        }
        if ((i2 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            int i3 = i2 >> 6;
            Transition updateTransition = TransitionKt.updateTransition(Boolean.valueOf(z2), (String) null, startRestartGroup, i3 & 14, 2);
            TabKt$TabTransition$color$2 tabKt$TabTransition$color$2 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TabKt$TabTransition$color$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> animateColor, Composer composer2, int i4) {
                    TweenSpec tween$default;
                    Intrinsics.checkNotNullParameter(animateColor, "$this$animateColor");
                    composer2.startReplaceableGroup(-2120892502);
                    if (animateColor.isTransitioningTo(false, true)) {
                        tween$default = AnimationSpecKt.tween(TextFieldImplKt.AnimationDuration, 100, EasingKt.getLinearEasing());
                    } else {
                        tween$default = AnimationSpecKt.tween$default(100, 0, EasingKt.getLinearEasing(), 2, null);
                    }
                    composer2.endReplaceableGroup();
                    return tween$default;
                }
            };
            startRestartGroup.startReplaceableGroup(-1462136984);
            ComposerKt.sourceInformation(startRestartGroup, "C(animateColor)P(2)68@3224L31,69@3291L70,73@3374L70:Transition.kt#xbi5r1");
            boolean booleanValue = ((Boolean) updateTransition.getTargetState()).booleanValue();
            startRestartGroup.startReplaceableGroup(1445938070);
            ComposerKt.sourceInformation(startRestartGroup, "C:Tab.kt#jmzs0o");
            long j4 = booleanValue ? j : j3;
            startRestartGroup.endReplaceableGroup();
            ColorSpace m2116getColorSpaceimpl = Color.m2116getColorSpaceimpl(j4);
            startRestartGroup.startReplaceableGroup(-3686930);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(m2116getColorSpaceimpl);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m2116getColorSpaceimpl);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue;
            startRestartGroup.startReplaceableGroup(1847725064);
            ComposerKt.sourceInformation(startRestartGroup, "C(animateValue)P(3,2)843@33302L32,844@33357L31,845@33413L23,847@33449L89:Transition.kt#pdpnli");
            boolean booleanValue2 = ((Boolean) updateTransition.getCurrentState()).booleanValue();
            startRestartGroup.startReplaceableGroup(1445938070);
            ComposerKt.sourceInformation(startRestartGroup, "C:Tab.kt#jmzs0o");
            long j5 = booleanValue2 ? j : j3;
            startRestartGroup.endReplaceableGroup();
            Color m2102boximpl = Color.m2102boximpl(j5);
            boolean booleanValue3 = ((Boolean) updateTransition.getTargetState()).booleanValue();
            startRestartGroup.startReplaceableGroup(1445938070);
            ComposerKt.sourceInformation(startRestartGroup, "C:Tab.kt#jmzs0o");
            long j6 = booleanValue3 ? j : j3;
            startRestartGroup.endReplaceableGroup();
            State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, m2102boximpl, Color.m2102boximpl(j6), tabKt$TabTransition$color$2.invoke((TabKt$TabTransition$color$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter, "ColorAnimation", startRestartGroup, 32768);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2102boximpl(Color.m2111copywmQWz5c$default(m1543TabTransition_Klgx_Pg$lambda5(createTransitionAnimation), 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2114getAlphaimpl(m1543TabTransition_Klgx_Pg$lambda5(createTransitionAnimation))))}, function2, startRestartGroup, (i3 & 112) | 8);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        final long j7 = j3;
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$TabTransition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                TabKt.m1542TabTransitionKlgxPg(j, j7, z, function2, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TabBaselineLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        int i2;
        boolean z;
        Composer startRestartGroup = composer.startRestartGroup(1249848471);
        ComposerKt.sourceInformation(startRestartGroup, "C(TabBaselineLayout)P(1)304@12859L1909:Tab.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(function22) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo61measure3p2s80s(final MeasureScope Layout, List<? extends Measurable> measurables, long j) {
                    Placeable placeable;
                    Placeable placeable2;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    if (function2 != null) {
                        for (Measurable measurable : measurables) {
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "text")) {
                                placeable = measurable.mo3383measureBRTryo0(Constraints.m4387copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    placeable = null;
                    if (function22 != null) {
                        for (Measurable measurable2 : measurables) {
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "icon")) {
                                placeable2 = measurable2.mo3383measureBRTryo0(j);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    placeable2 = null;
                    final int max = Math.max(placeable != null ? placeable.getWidth() : 0, placeable2 != null ? placeable2.getWidth() : 0);
                    final int i3 = Layout.mo330roundToPx0680j_4((placeable == null || placeable2 == null) ? TabKt.SmallTabHeight : TabKt.LargeTabHeight);
                    final Integer valueOf = placeable != null ? Integer.valueOf(placeable.get(AlignmentLineKt.getFirstBaseline())) : null;
                    final Integer valueOf2 = placeable != null ? Integer.valueOf(placeable.get(AlignmentLineKt.getLastBaseline())) : null;
                    final Placeable placeable3 = placeable;
                    final Placeable placeable4 = placeable2;
                    return MeasureScope.layout$default(Layout, max, i3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$2$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Placeable.PlacementScope layout) {
                            Placeable placeable5;
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            Placeable placeable6 = Placeable.this;
                            if (placeable6 == null || (placeable5 = placeable4) == null) {
                                if (placeable6 != null) {
                                    TabKt.placeTextOrIcon(layout, placeable6, i3);
                                    return;
                                }
                                Placeable placeable7 = placeable4;
                                if (placeable7 != null) {
                                    TabKt.placeTextOrIcon(layout, placeable7, i3);
                                    return;
                                }
                                return;
                            }
                            MeasureScope measureScope = Layout;
                            int i4 = max;
                            int i5 = i3;
                            Integer num = valueOf;
                            Intrinsics.checkNotNull(num);
                            int intValue = num.intValue();
                            Integer num2 = valueOf2;
                            Intrinsics.checkNotNull(num2);
                            TabKt.placeTextAndIcon(layout, measureScope, placeable6, placeable5, i4, i5, intValue, num2.intValue());
                        }
                    }, 4, null);
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.INSTANCE;
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(localViewConfiguration);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m1642constructorimpl = Updater.m1642constructorimpl(startRestartGroup);
            Updater.m1649setimpl(m1642constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1649setimpl(m1642constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1649setimpl(m1642constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1649setimpl(m1642constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(1142473408);
            ComposerKt.sourceInformation(startRestartGroup, "C312@13111L41:Tab.kt#jmzs0o");
            startRestartGroup.startReplaceableGroup(-2141028452);
            ComposerKt.sourceInformation(startRestartGroup, "307@12925L123");
            if (function2 != null) {
                Modifier m587paddingVpY3zN4$default = PaddingKt.m587paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, "text"), HorizontalTextPadding, 0.0f, 2, null);
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume4 = startRestartGroup.consume(localDensity2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density2 = (Density) consume4;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume5 = startRestartGroup.consume(localLayoutDirection2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection2 = (LayoutDirection) consume5;
                z = false;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume6 = startRestartGroup.consume(localViewConfiguration2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume6;
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m587paddingVpY3zN4$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m1642constructorimpl2 = Updater.m1642constructorimpl(startRestartGroup);
                Updater.m1649setimpl(m1642constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m1649setimpl(m1642constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m1649setimpl(m1642constructorimpl2, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m1649setimpl(m1642constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(-459869377);
                ComposerKt.sourceInformation(startRestartGroup, "C309@13040L6:Tab.kt#jmzs0o");
                function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            } else {
                z = false;
            }
            startRestartGroup.endReplaceableGroup();
            if (function22 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, "icon");
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                boolean z2 = z;
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), z2, startRestartGroup, z2 ? 1 : 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume7 = startRestartGroup.consume(localDensity3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density3 = (Density) consume7;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume8 = startRestartGroup.consume(localLayoutDirection3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection3 = (LayoutDirection) consume8;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration3 = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume9 = startRestartGroup.consume(localViewConfiguration3);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) consume9;
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(layoutId);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m1642constructorimpl3 = Updater.m1642constructorimpl(startRestartGroup);
                Updater.m1649setimpl(m1642constructorimpl3, rememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m1649setimpl(m1642constructorimpl3, density3, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m1649setimpl(m1642constructorimpl3, layoutDirection3, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m1649setimpl(m1642constructorimpl3, viewConfiguration3, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m1633boximpl(SkippableUpdater.m1634constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-2137368960);
                ComposerKt.sourceInformation(startRestartGroup, "C72@3384L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceableGroup(892169960);
                ComposerKt.sourceInformation(startRestartGroup, "C312@13144L6:Tab.kt#jmzs0o");
                function22.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$TabBaselineLayout$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                TabKt.TabBaselineLayout(function2, function22, composer2, i | 1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextOrIcon(Placeable.PlacementScope placementScope, Placeable placeable, int i) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i - placeable.getHeight()) / 2, 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextAndIcon(Placeable.PlacementScope placementScope, Density density, Placeable placeable, Placeable placeable2, int i, int i2, int i3, int i4) {
        float f;
        if (i3 == i4) {
            f = SingleLineTextBaselineWithIcon;
        } else {
            f = DoubleLineTextBaselineWithIcon;
        }
        int mo330roundToPx0680j_4 = density.mo330roundToPx0680j_4(f) + density.mo330roundToPx0680j_4(TabRowDefaults.INSTANCE.m1551getIndicatorHeightD9Ej5fM());
        int height = (placeable2.getHeight() + density.mo329roundToPxR2X_6o(IconDistanceFromBaseline)) - i3;
        int i5 = (i2 - i4) - mo330roundToPx0680j_4;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, (i - placeable.getWidth()) / 2, i5, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, (i - placeable2.getWidth()) / 2, i5 - height, 0.0f, 4, null);
    }

    /* renamed from: TabTransition_Klgx_Pg$lambda-5, reason: not valid java name */
    private static final long m1543TabTransition_Klgx_Pg$lambda5(State<Color> state) {
        return state.getValue().m2122unboximpl();
    }
}
