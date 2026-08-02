package androidx.compose.material;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.IndicationNodeFactory;
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
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Tab.kt */
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0087\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\n2\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u007f\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\n2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001aw\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0002\b\n¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a:\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\nH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a7\u0010!\u001a\u00020\u00012\u0013\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\n2\u0013\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\u0002\b\nH\u0003¢\u0006\u0002\u0010\"\u001a\u001c\u0010#\u001a\u00020\u0001*\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0002\u001aD\u0010)\u001a\u00020\u0001*\u00020$2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020(2\u0006\u0010'\u001a\u00020(2\u0006\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020(H\u0002\"\u0010\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0004\n\u0002\u00103\"\u0010\u00104\u001a\u000202X\u0082\u0004¢\u0006\u0004\n\u0002\u00103\"\u000e\u00105\u001a\u00020(X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00106\u001a\u00020(X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u00107\u001a\u00020(X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u00108\u001a\u000202X\u0082\u0004¢\u0006\u0004\n\u0002\u00103\"\u0010\u00109\u001a\u000202X\u0082\u0004¢\u0006\u0004\n\u0002\u00103\"\u0010\u0010:\u001a\u000202X\u0082\u0004¢\u0006\u0004\n\u0002\u00103\"\u0010\u0010;\u001a\u00020<X\u0082\u0004¢\u0006\u0004\n\u0002\u0010=\"\u0010\u0010>\u001a\u000202X\u0082\u0004¢\u0006\u0004\n\u0002\u00103¨\u0006?²\u0006\n\u0010@\u001a\u00020\u000fX\u008a\u0084\u0002"}, d2 = {"Tab", "", "selected", "", ViewProps.ON_CLICK, "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "text", "Landroidx/compose/runtime/Composable;", "icon", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "selectedContentColor", "Landroidx/compose/ui/graphics/Color;", "unselectedContentColor", "Tab-0nD-MI0", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "LeadingIconTab", "LeadingIconTab-0nD-MI0", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;II)V", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "Tab-EVJuX4I", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "TabTransition", "activeColor", "inactiveColor", "TabTransition-Klgx-Pg", "(JJZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TabBaselineLayout", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "placeTextOrIcon", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "textOrIconPlaceable", "Landroidx/compose/ui/layout/Placeable;", "tabHeight", "", "placeTextAndIcon", "density", "Landroidx/compose/ui/unit/Density;", "textPlaceable", "iconPlaceable", "tabWidth", "firstBaseline", "lastBaseline", "SmallTabHeight", "Landroidx/compose/ui/unit/Dp;", "F", "LargeTabHeight", "TabFadeInAnimationDuration", "TabFadeInAnimationDelay", "TabFadeOutAnimationDuration", "HorizontalTextPadding", "SingleLineTextBaselineWithIcon", "DoubleLineTextBaselineWithIcon", "IconDistanceFromBaseline", "Landroidx/compose/ui/unit/TextUnit;", "J", "TextDistanceFromLeadingIcon", "material", "color"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabKt {
    private static final int TabFadeInAnimationDelay = 100;
    private static final int TabFadeInAnimationDuration = 150;
    private static final int TabFadeOutAnimationDuration = 100;
    private static final float SmallTabHeight = Dp.m8798constructorimpl(48);
    private static final float LargeTabHeight = Dp.m8798constructorimpl(72);
    private static final float HorizontalTextPadding = Dp.m8798constructorimpl(16);
    private static final float SingleLineTextBaselineWithIcon = Dp.m8798constructorimpl(14);
    private static final float DoubleLineTextBaselineWithIcon = Dp.m8798constructorimpl(6);
    private static final long IconDistanceFromBaseline = TextUnitKt.getSp(20);
    private static final float TextDistanceFromLeadingIcon = Dp.m8798constructorimpl(8);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LeadingIconTab_0nD_MI0$lambda$2(boolean z, Function0 function0, Function2 function2, Function2 function22, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, long j, long j2, int i, int i2, Composer composer, int i3) {
        m2511LeadingIconTab0nDMI0(z, function0, function2, function22, modifier, z2, mutableInteractionSource, j, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabBaselineLayout$lambda$11(Function2 function2, Function2 function22, int i, Composer composer, int i2) {
        TabBaselineLayout(function2, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabTransition_Klgx_Pg$lambda$6(long j, long j2, boolean z, Function2 function2, int i, Composer composer, int i2) {
        m2514TabTransitionKlgxPg(j, j2, z, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Tab_0nD_MI0$lambda$1(boolean z, Function0 function0, Modifier modifier, boolean z2, Function2 function2, Function2 function22, MutableInteractionSource mutableInteractionSource, long j, long j2, int i, int i2, Composer composer, int i3) {
        m2512Tab0nDMI0(z, function0, modifier, z2, function2, function22, mutableInteractionSource, j, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Tab_EVJuX4I$lambda$3(boolean z, Function0 function0, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, long j, long j2, Function3 function3, int i, int i2, Composer composer, int i3) {
        m2513TabEVJuX4I(z, function0, modifier, z2, mutableInteractionSource, j, j2, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    /* renamed from: Tab-0nD-MI0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2512Tab0nDMI0(final boolean z, final Function0<Unit> function0, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, MutableInteractionSource mutableInteractionSource, long j, long j2, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        Function0<Unit> function02;
        Modifier modifier2;
        int i4;
        boolean z4;
        int i5;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        int i6;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier3;
        final boolean z5;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final long j3;
        final long j4;
        ScopeUpdateScope endRestartGroup;
        long j5;
        long j6;
        long j7;
        MutableInteractionSource mutableInteractionSource3;
        int i11;
        int i12;
        boolean z6;
        final ComposableLambda composableLambda;
        long j8;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(-610760526);
        ComposerKt.sourceInformation(startRestartGroup, "C(Tab)N(selected,onClick,modifier,enabled,text,icon,interactionSource,selectedContentColor:c#ui.graphics.Color,unselectedContentColor:c#ui.graphics.Color)113@4852L65,105@4682L235:Tab.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(z3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
            }
        }
        int i15 = i2 & 4;
        if (i15 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z4 = z2;
                i3 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function23 = function2;
                    i3 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        function24 = function22;
                        i3 |= startRestartGroup.changedInstance(function24) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
                        }
                        if ((i & 12582912) == 0) {
                            if ((i2 & 128) == 0) {
                                i13 = i3;
                                i9 = i15;
                                if (startRestartGroup.changed(j)) {
                                    i14 = 8388608;
                                    i8 = i13 | i14;
                                }
                            } else {
                                i13 = i3;
                                i9 = i15;
                            }
                            i14 = 4194304;
                            i8 = i13 | i14;
                        } else {
                            i8 = i3;
                            i9 = i15;
                        }
                        if ((i & 100663296) == 0) {
                            i8 |= ((i2 & 256) == 0 && startRestartGroup.changed(j2)) ? 67108864 : 33554432;
                        }
                        i10 = i8;
                        if (startRestartGroup.shouldExecute((i10 & 38347923) != 38347922, i10 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "95@4304L7,96@4396L6");
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i9 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i4 != 0) {
                                    z4 = true;
                                }
                                if (i5 != 0) {
                                    function23 = null;
                                }
                                if (i6 != 0) {
                                    function24 = null;
                                }
                                MutableInteractionSource mutableInteractionSource4 = i7 != 0 ? null : mutableInteractionSource;
                                if ((i2 & 128) != 0) {
                                    ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localContentColor);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    j5 = ((Color) consume).m6049unboximpl();
                                    i10 &= -29360129;
                                } else {
                                    j5 = j;
                                }
                                if ((i2 & 256) != 0) {
                                    long j9 = j5;
                                    j6 = j9;
                                    mutableInteractionSource3 = mutableInteractionSource4;
                                    i12 = i10 & (-234881025);
                                    i11 = 12582912;
                                    j7 = Color.m6038copywmQWz5c$default(j9, ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                } else {
                                    j6 = j5;
                                    j7 = j2;
                                    mutableInteractionSource3 = mutableInteractionSource4;
                                    i11 = 12582912;
                                    i12 = i10;
                                }
                                z6 = z4;
                                composableLambda = null;
                                j8 = j6;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                i12 = (i2 & 128) != 0 ? i10 & (-29360129) : i10;
                                if ((i2 & 256) != 0) {
                                    i12 &= -234881025;
                                }
                                mutableInteractionSource3 = mutableInteractionSource;
                                j7 = j2;
                                i11 = 12582912;
                                z6 = z4;
                                composableLambda = null;
                                j8 = j;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-610760526, i12, -1, "androidx.compose.material.Tab (Tab.kt:97)");
                            }
                            if (function23 == null) {
                                startRestartGroup.startReplaceGroup(-1684864799);
                            } else {
                                startRestartGroup.startReplaceGroup(-1684864798);
                                ComposerKt.sourceInformation(startRestartGroup, "*100@4501L166");
                                composableLambda = ComposableLambdaKt.rememberComposableLambda(1101313667, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$styledText$1$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i16) {
                                        ComposerKt.sourceInformation(composer3, "C101@4545L10,102@4614L39:Tab.kt#jmzs0o");
                                        if (!composer3.shouldExecute((i16 & 3) != 2, i16 & 1)) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1101313667, i16, -1, "androidx.compose.material.Tab.<anonymous>.<anonymous> (Tab.kt:101)");
                                        }
                                        TextKt.ProvideTextStyle(TextStyle.m8245copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer3, 6).getButton(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m8654getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), function23, composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, startRestartGroup, 54);
                            }
                            startRestartGroup.endReplaceGroup();
                            int i16 = (i12 & 14) | i11 | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                            int i17 = i12 >> 6;
                            composer2 = startRestartGroup;
                            Modifier modifier4 = modifier2;
                            m2513TabEVJuX4I(z3, function02, modifier4, z6, mutableInteractionSource3, j8, j7, ComposableLambdaKt.rememberComposableLambda(-1088373601, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                                    invoke(columnScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(ColumnScope columnScope, Composer composer3, int i18) {
                                    ComposerKt.sourceInformation(composer3, "C114@4862L49:Tab.kt#jmzs0o");
                                    if (composer3.shouldExecute((i18 & 17) != 16, i18 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1088373601, i18, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:114)");
                                        }
                                        TabKt.TabBaselineLayout(composableLambda, function24, composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }, startRestartGroup, 54), composer2, (57344 & i17) | i16 | (458752 & i17) | (i17 & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function25 = function23;
                            function26 = function24;
                            modifier3 = modifier4;
                            z5 = z6;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            j3 = j8;
                            j4 = j7;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            mutableInteractionSource2 = mutableInteractionSource;
                            modifier3 = modifier2;
                            z5 = z4;
                            function25 = function23;
                            function26 = function24;
                            j3 = j;
                            j4 = j2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TabKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit Tab_0nD_MI0$lambda$1;
                                    Tab_0nD_MI0$lambda$1 = TabKt.Tab_0nD_MI0$lambda$1(z, function0, modifier3, z5, function25, function26, mutableInteractionSource2, j3, j4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return Tab_0nD_MI0$lambda$1;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function24 = function22;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    if ((i & 100663296) == 0) {
                    }
                    i10 = i8;
                    if (startRestartGroup.shouldExecute((i10 & 38347923) != 38347922, i10 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
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
                if ((i & 12582912) == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i10 = i8;
                if (startRestartGroup.shouldExecute((i10 & 38347923) != 38347922, i10 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z4 = z2;
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
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i10 = i8;
            if (startRestartGroup.shouldExecute((i10 & 38347923) != 38347922, i10 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z4 = z2;
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
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i10 = i8;
        if (startRestartGroup.shouldExecute((i10 & 38347923) != 38347922, i10 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00c0  */
    /* renamed from: LeadingIconTab-0nD-MI0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2511LeadingIconTab0nDMI0(final boolean z, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, long j, long j2, Composer composer, final int i, final int i2) {
        final boolean z3;
        int i3;
        final Function0<Unit> function02;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z4;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        Composer composer2;
        final long j3;
        final Modifier modifier3;
        final boolean z5;
        final MutableInteractionSource mutableInteractionSource3;
        final long j4;
        ScopeUpdateScope endRestartGroup;
        long j5;
        long m6038copywmQWz5c$default;
        Composer startRestartGroup = composer.startRestartGroup(-524682663);
        ComposerKt.sourceInformation(startRestartGroup, "C(LeadingIconTab)N(selected,onClick,text,icon,modifier,enabled,interactionSource,selectedContentColor:c#ui.graphics.Color,unselectedContentColor:c#ui.graphics.Color)165@7275L921,165@7205L991:Tab.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(z3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function23 = function22;
                i3 |= startRestartGroup.changedInstance(function23) ? 2048 : 1024;
                i4 = i2 & 16;
                if (i4 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
                    i5 = i2 & 32;
                    if (i5 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        z4 = z2;
                        i3 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                        i6 = i2 & 64;
                        if (i6 != 0) {
                            i3 |= 1572864;
                        } else if ((1572864 & i) == 0) {
                            mutableInteractionSource2 = mutableInteractionSource;
                            i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                            if ((12582912 & i) != 0) {
                                i7 = i3 | (((i2 & 128) == 0 && startRestartGroup.changed(j)) ? 8388608 : 4194304);
                            } else {
                                i7 = i3;
                            }
                            if ((i & 100663296) == 0) {
                                i7 |= ((i2 & 256) == 0 && startRestartGroup.changed(j2)) ? 67108864 : 33554432;
                            }
                            if (!startRestartGroup.shouldExecute((38347923 & i7) == 38347922, i7 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "157@6806L7,158@6898L6");
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i4 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i5 != 0) {
                                        z4 = true;
                                    }
                                    if (i6 != 0) {
                                        mutableInteractionSource2 = null;
                                    }
                                    if ((i2 & 128) != 0) {
                                        ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(localContentColor);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        i7 &= -29360129;
                                        j5 = ((Color) consume).m6049unboximpl();
                                    } else {
                                        j5 = j;
                                    }
                                    if ((i2 & 256) != 0) {
                                        m6038copywmQWz5c$default = Color.m6038copywmQWz5c$default(j5, ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                        i7 &= -234881025;
                                        final boolean z6 = z4;
                                        final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-524682663, i7, -1, "androidx.compose.material.LeadingIconTab (Tab.kt:159)");
                                        }
                                        final IndicationNodeFactory m2441rippleH2RKhps$default = RippleKt.m2441rippleH2RKhps$default(true, 0.0f, j5, 2, null);
                                        final Modifier modifier4 = modifier2;
                                        final Function2<? super Composer, ? super Integer, Unit> function24 = function23;
                                        int i8 = i7 >> 21;
                                        long j6 = j5;
                                        m2514TabTransitionKlgxPg(j6, m6038copywmQWz5c$default, z, ComposableLambdaKt.rememberComposableLambda(-1415722219, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i9) {
                                                float f;
                                                float f2;
                                                float f3;
                                                ComposerKt.sourceInformation(composer3, "C166@7285L905:Tab.kt#jmzs0o");
                                                if (!composer3.shouldExecute((i9 & 3) != 2, i9 & 1)) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1415722219, i9, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:166)");
                                                }
                                                Modifier modifier5 = Modifier.this;
                                                f = TabKt.SmallTabHeight;
                                                Modifier m1484selectableO2vRcR0 = SelectableKt.m1484selectableO2vRcR0(SizeKt.m1195height3ABfNKs(modifier5, f), z3, mutableInteractionSource4, m2441rippleH2RKhps$default, z6, Role.m7972boximpl(Role.INSTANCE.m7986getTabo7Vup1c()), function02);
                                                f2 = TabKt.HorizontalTextPadding;
                                                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m1159paddingVpY3zN4$default(m1484selectableO2vRcR0, f2, 0.0f, 2, null), 0.0f, 1, null);
                                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                Function2<Composer, Integer, Unit> function25 = function24;
                                                Function2<Composer, Integer, Unit> function26 = function2;
                                                ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer3, 54);
                                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default);
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                if (!(composer3.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer3.startReusableNode();
                                                if (composer3.getInserting()) {
                                                    composer3.createNode(constructor);
                                                } else {
                                                    composer3.useNode();
                                                }
                                                Composer m5333constructorimpl = Updater.m5333constructorimpl(composer3);
                                                Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    m5333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    m5333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(composer3, 322948405, "C183@7959L6,184@7978L59,185@8076L10,186@8141L39:Tab.kt#jmzs0o");
                                                function25.invoke(composer3, 0);
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                f3 = TabKt.TextDistanceFromLeadingIcon;
                                                SpacerKt.Spacer(SizeKt.m1206requiredWidth3ABfNKs(companion, f3), composer3, 6);
                                                TextKt.ProvideTextStyle(TextStyle.m8245copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer3, 6).getButton(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m8654getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), function26, composer3, 0);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                composer3.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, startRestartGroup, 54), startRestartGroup, ((i7 << 6) & 896) | (i8 & 112) | (i8 & 14) | 3072);
                                        composer2 = startRestartGroup;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier3 = modifier4;
                                        mutableInteractionSource3 = mutableInteractionSource4;
                                        z5 = z6;
                                        j4 = m6038copywmQWz5c$default;
                                        j3 = j5;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 128) != 0) {
                                        i7 &= -29360129;
                                    }
                                    if ((i2 & 256) != 0) {
                                        i7 &= -234881025;
                                    }
                                    j5 = j;
                                }
                                m6038copywmQWz5c$default = j2;
                                final boolean z62 = z4;
                                final MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                final IndicationNodeFactory m2441rippleH2RKhps$default2 = RippleKt.m2441rippleH2RKhps$default(true, 0.0f, j5, 2, null);
                                final Modifier modifier42 = modifier2;
                                final Function2<? super Composer, ? super Integer, Unit> function242 = function23;
                                int i82 = i7 >> 21;
                                long j62 = j5;
                                m2514TabTransitionKlgxPg(j62, m6038copywmQWz5c$default, z, ComposableLambdaKt.rememberComposableLambda(-1415722219, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$LeadingIconTab$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i9) {
                                        float f;
                                        float f2;
                                        float f3;
                                        ComposerKt.sourceInformation(composer3, "C166@7285L905:Tab.kt#jmzs0o");
                                        if (!composer3.shouldExecute((i9 & 3) != 2, i9 & 1)) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1415722219, i9, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:166)");
                                        }
                                        Modifier modifier5 = Modifier.this;
                                        f = TabKt.SmallTabHeight;
                                        Modifier m1484selectableO2vRcR0 = SelectableKt.m1484selectableO2vRcR0(SizeKt.m1195height3ABfNKs(modifier5, f), z3, mutableInteractionSource42, m2441rippleH2RKhps$default2, z62, Role.m7972boximpl(Role.INSTANCE.m7986getTabo7Vup1c()), function02);
                                        f2 = TabKt.HorizontalTextPadding;
                                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m1159paddingVpY3zN4$default(m1484selectableO2vRcR0, f2, 0.0f, 2, null), 0.0f, 1, null);
                                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        Function2<Composer, Integer, Unit> function25 = function242;
                                        Function2<Composer, Integer, Unit> function26 = function2;
                                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer3, 54);
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default);
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer m5333constructorimpl = Updater.m5333constructorimpl(composer3);
                                        Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            m5333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            m5333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer3, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer3, 322948405, "C183@7959L6,184@7978L59,185@8076L10,186@8141L39:Tab.kt#jmzs0o");
                                        function25.invoke(composer3, 0);
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        f3 = TabKt.TextDistanceFromLeadingIcon;
                                        SpacerKt.Spacer(SizeKt.m1206requiredWidth3ABfNKs(companion, f3), composer3, 6);
                                        TextKt.ProvideTextStyle(TextStyle.m8245copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer3, 6).getButton(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m8654getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), function26, composer3, 0);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, startRestartGroup, 54), startRestartGroup, ((i7 << 6) & 896) | (i82 & 112) | (i82 & 14) | 3072);
                                composer2 = startRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier42;
                                mutableInteractionSource3 = mutableInteractionSource42;
                                z5 = z62;
                                j4 = m6038copywmQWz5c$default;
                                j3 = j5;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                j3 = j;
                                modifier3 = modifier2;
                                z5 = z4;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                j4 = j2;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TabKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit LeadingIconTab_0nD_MI0$lambda$2;
                                        LeadingIconTab_0nD_MI0$lambda$2 = TabKt.LeadingIconTab_0nD_MI0$lambda$2(z, function0, function2, function22, modifier3, z5, mutableInteractionSource3, j3, j4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return LeadingIconTab_0nD_MI0$lambda$2;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        mutableInteractionSource2 = mutableInteractionSource;
                        if ((12582912 & i) != 0) {
                        }
                        if ((i & 100663296) == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((38347923 & i7) == 38347922, i7 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    z4 = z2;
                    i6 = i2 & 64;
                    if (i6 != 0) {
                    }
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((12582912 & i) != 0) {
                    }
                    if ((i & 100663296) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((38347923 & i7) == 38347922, i7 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                modifier2 = modifier;
                i5 = i2 & 32;
                if (i5 == 0) {
                }
                z4 = z2;
                i6 = i2 & 64;
                if (i6 != 0) {
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((12582912 & i) != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if (!startRestartGroup.shouldExecute((38347923 & i7) == 38347922, i7 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function23 = function22;
            i4 = i2 & 16;
            if (i4 != 0) {
            }
            modifier2 = modifier;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            z4 = z2;
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((12582912 & i) != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if (!startRestartGroup.shouldExecute((38347923 & i7) == 38347922, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        function23 = function22;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        z4 = z2;
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((12582912 & i) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if (!startRestartGroup.shouldExecute((38347923 & i7) == 38347922, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0088  */
    /* renamed from: Tab-EVJuX4I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2513TabEVJuX4I(final boolean z, final Function0<Unit> function0, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, long j, long j2, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z4;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        long j3;
        int i7;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32;
        final Modifier modifier3;
        Composer composer2;
        final boolean z5;
        final MutableInteractionSource mutableInteractionSource3;
        final long j4;
        final long j5;
        ScopeUpdateScope endRestartGroup;
        long j6;
        final Modifier modifier4;
        final boolean z6;
        int i8;
        long j7;
        final MutableInteractionSource mutableInteractionSource4;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1847932236);
        ComposerKt.sourceInformation(startRestartGroup, "C(Tab)N(selected,onClick,modifier,enabled,interactionSource,selectedContentColor:c#ui.graphics.Color,unselectedContentColor:c#ui.graphics.Color,content)235@10460L602,235@10390L672:Tab.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(z3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z4 = z2;
                    i3 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                        if ((196608 & i) == 0) {
                            if ((i2 & 32) == 0) {
                                j3 = j;
                                if (startRestartGroup.changed(j3)) {
                                    i9 = 131072;
                                    i3 |= i9;
                                }
                            } else {
                                j3 = j;
                            }
                            i9 = 65536;
                            i3 |= i9;
                        } else {
                            j3 = j;
                        }
                        if ((1572864 & i) == 0) {
                            i7 = i3 | (((i2 & 64) == 0 && startRestartGroup.changed(j2)) ? 1048576 : 524288);
                        } else {
                            i7 = i3;
                        }
                        if ((i2 & 128) != 0) {
                            i7 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            function32 = function3;
                            i7 |= startRestartGroup.changedInstance(function32) ? 8388608 : 4194304;
                            if (!startRestartGroup.shouldExecute((i7 & 4793491) == 4793490, i7 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "226@9945L7,227@10037L6");
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i4 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i5 != 0) {
                                        z4 = true;
                                    }
                                    if (i6 != 0) {
                                        mutableInteractionSource2 = null;
                                    }
                                    if ((i2 & 32) != 0) {
                                        ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(localContentColor);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        j3 = ((Color) consume).m6049unboximpl();
                                        i7 &= -458753;
                                    }
                                    j6 = j3;
                                    if ((i2 & 64) != 0) {
                                        modifier4 = modifier2;
                                        j7 = Color.m6038copywmQWz5c$default(j6, ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                        z6 = z4;
                                        i8 = i7 & (-3670017);
                                    } else {
                                        modifier4 = modifier2;
                                        z6 = z4;
                                        i8 = i7;
                                        j7 = j2;
                                    }
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 32) != 0) {
                                        i7 &= -458753;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i7 &= -3670017;
                                    }
                                    z6 = z4;
                                    j6 = j3;
                                    i8 = i7;
                                    modifier4 = modifier2;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    j7 = j2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1847932236, i8, -1, "androidx.compose.material.Tab (Tab.kt:229)");
                                }
                                long j8 = j6;
                                final IndicationNodeFactory m2441rippleH2RKhps$default = RippleKt.m2441rippleH2RKhps$default(true, 0.0f, j8, 2, null);
                                final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function33 = function32;
                                final boolean z7 = z3;
                                int i10 = i8 >> 15;
                                m2514TabTransitionKlgxPg(j8, j7, z, ComposableLambdaKt.rememberComposableLambda(-652402312, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabKt$Tab$3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i11) {
                                        ComposerKt.sourceInformation(composer3, "C236@10470L586:Tab.kt#jmzs0o");
                                        if (!composer3.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-652402312, i11, -1, "androidx.compose.material.Tab.<anonymous> (Tab.kt:236)");
                                        }
                                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m1484selectableO2vRcR0(Modifier.this, z7, mutableInteractionSource4, m2441rippleH2RKhps$default, z6, Role.m7972boximpl(Role.INSTANCE.m7986getTabo7Vup1c()), function0), 0.0f, 1, null);
                                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                        Function3<ColumnScope, Composer, Integer, Unit> function34 = function33;
                                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer3, 54);
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default);
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                        if (!(composer3.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer m5333constructorimpl = Updater.m5333constructorimpl(composer3);
                                        Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            m5333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            m5333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                                        function34.invoke(ColumnScopeInstance.INSTANCE, composer3, 6);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, startRestartGroup, 54), startRestartGroup, ((i8 << 6) & 896) | (i10 & 112) | (i10 & 14) | 3072);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2 = startRestartGroup;
                                j4 = j8;
                                mutableInteractionSource3 = mutableInteractionSource4;
                                j5 = j7;
                                modifier3 = modifier4;
                                z5 = z6;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                composer2 = startRestartGroup;
                                z5 = z4;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                j4 = j3;
                                j5 = j2;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TabKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit Tab_EVJuX4I$lambda$3;
                                        Tab_EVJuX4I$lambda$3 = TabKt.Tab_EVJuX4I$lambda$3(z, function0, modifier3, z5, mutableInteractionSource3, j4, j5, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return Tab_EVJuX4I$lambda$3;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        function32 = function3;
                        if (!startRestartGroup.shouldExecute((i7 & 4793491) == 4793490, i7 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((196608 & i) == 0) {
                    }
                    if ((1572864 & i) == 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    function32 = function3;
                    if (!startRestartGroup.shouldExecute((i7 & 4793491) == 4793490, i7 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z4 = z2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((196608 & i) == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                if ((i2 & 128) != 0) {
                }
                function32 = function3;
                if (!startRestartGroup.shouldExecute((i7 & 4793491) == 4793490, i7 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z4 = z2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if ((i2 & 128) != 0) {
            }
            function32 = function3;
            if (!startRestartGroup.shouldExecute((i7 & 4793491) == 4793490, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z4 = z2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((i2 & 128) != 0) {
        }
        function32 = function3;
        if (!startRestartGroup.shouldExecute((i7 & 4793491) == 4793490, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: TabTransition-Klgx-Pg, reason: not valid java name */
    private static final void m2514TabTransitionKlgxPg(final long j, final long j2, boolean z, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        final boolean z2;
        Composer startRestartGroup = composer.startRestartGroup(-1841653376);
        ComposerKt.sourceInformation(startRestartGroup, "C(TabTransition)N(activeColor:c#ui.graphics.Color,inactiveColor:c#ui.graphics.Color,selected,content)267@11494L26,269@11557L549,284@12111L165:Tab.kt#jmzs0o");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= startRestartGroup.changed(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1841653376, i2, -1, "androidx.compose.material.TabTransition (Tab.kt:266)");
            }
            int i3 = i2 >> 6;
            Transition updateTransition = TransitionKt.updateTransition(Boolean.valueOf(z2), (String) null, startRestartGroup, i3 & 14, 2);
            TabKt$TabTransition$color$2 tabKt$TabTransition$color$2 = new Function3<Transition.Segment<Boolean>, Composer, Integer, FiniteAnimationSpec<Color>>() { // from class: androidx.compose.material.TabKt$TabTransition$color$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer2, Integer num) {
                    return invoke(segment, composer2, num.intValue());
                }

                public final FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer2, int i4) {
                    TweenSpec tween$default;
                    composer2.startReplaceGroup(297582231);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(297582231, i4, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:271)");
                    }
                    if (segment.isTransitioningTo(false, true)) {
                        tween$default = AnimationSpecKt.tween(150, 100, EasingKt.getLinearEasing());
                    } else {
                        tween$default = AnimationSpecKt.tween$default(100, 0, EasingKt.getLinearEasing(), 2, null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return tween$default;
                }
            };
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1939694975, "CC(animateColor)P(2)67@3229L31,68@3296L58,70@3367L70:Transition.kt#xbi5r1");
            boolean booleanValue = ((Boolean) updateTransition.getTargetState()).booleanValue();
            startRestartGroup.startReplaceGroup(90393475);
            ComposerKt.sourceInformation(startRestartGroup, "CN(it):Tab.kt#jmzs0o");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(90393475, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:282)");
            }
            long j3 = booleanValue ? j : j2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            ColorSpace m6043getColorSpaceimpl = Color.m6043getColorSpaceimpl(j3);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1918408359, "CC(remember):Transition.kt#9igjgp");
            boolean changed = startRestartGroup.changed(m6043getColorSpaceimpl);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(m6043getColorSpaceimpl);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -142660079, "CC(animateValue)P(3,2)1833@77788L32,1834@77843L31,1835@77899L23,1837@77935L89:Transition.kt#pdpnli");
            boolean booleanValue2 = ((Boolean) updateTransition.getCurrentState()).booleanValue();
            startRestartGroup.startReplaceGroup(90393475);
            ComposerKt.sourceInformation(startRestartGroup, "CN(it):Tab.kt#jmzs0o");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(90393475, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:282)");
            }
            long j4 = booleanValue2 ? j : j2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Color m6029boximpl = Color.m6029boximpl(j4);
            boolean booleanValue3 = ((Boolean) updateTransition.getTargetState()).booleanValue();
            startRestartGroup.startReplaceGroup(90393475);
            ComposerKt.sourceInformation(startRestartGroup, "CN(it):Tab.kt#jmzs0o");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(90393475, 0, -1, "androidx.compose.material.TabTransition.<anonymous> (Tab.kt:282)");
            }
            long j5 = booleanValue3 ? j : j2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, m6029boximpl, Color.m6029boximpl(j5), tabKt$TabTransition$color$2.invoke((TabKt$TabTransition$color$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), twoWayConverter, "ColorAnimation", startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m6029boximpl(Color.m6038copywmQWz5c$default(TabTransition_Klgx_Pg$lambda$5(createTransitionAnimation), 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m6041getAlphaimpl(TabTransition_Klgx_Pg$lambda$5(createTransitionAnimation))))}, function2, startRestartGroup, ProvidedValue.$stable | (i3 & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TabKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TabTransition_Klgx_Pg$lambda$6;
                    TabTransition_Klgx_Pg$lambda$6 = TabKt.TabTransition_Klgx_Pg$lambda$6(j, j2, z2, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return TabTransition_Klgx_Pg$lambda$6;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TabBaselineLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1466813041);
        ComposerKt.sourceInformation(startRestartGroup, "C(TabBaselineLayout)N(text,icon)305@12918L1803,298@12674L2047:Tab.kt#jmzs0o");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1466813041, i2, -1, "androidx.compose.material.TabBaselineLayout (Tab.kt:297)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 858072572, "CC(remember):Tab.kt#9igjgp");
            int i3 = i2 & 14;
            boolean z = (i3 == 4) | ((i2 & 112) == 32);
            TabKt$TabBaselineLayout$2$1 rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new TabKt$TabBaselineLayout$2$1(function2, function22);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.INSTANCE;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m5333constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1044963090, "C:Tab.kt#jmzs0o");
            if (function2 != null) {
                startRestartGroup.startReplaceGroup(-1044948645);
                ComposerKt.sourceInformation(startRestartGroup, "300@12723L85");
                Modifier m1159paddingVpY3zN4$default = PaddingKt.m1159paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, "text"), HorizontalTextPadding, 0.0f, 2, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1159paddingVpY3zN4$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m5333constructorimpl2 = Updater.m5333constructorimpl(startRestartGroup);
                Updater.m5340setimpl(m5333constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m5333constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m5333constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1022846780, "C300@12800L6:Tab.kt#jmzs0o");
                function2.invoke(startRestartGroup, Integer.valueOf(i3));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1044843896);
                startRestartGroup.endReplaceGroup();
            }
            if (function22 != null) {
                startRestartGroup.startReplaceGroup(-1044815097);
                ComposerKt.sourceInformation(startRestartGroup, "303@12859L41");
                Modifier layoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, "icon");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m5333constructorimpl3 = Updater.m5333constructorimpl(startRestartGroup);
                Updater.m5340setimpl(m5333constructorimpl3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m5333constructorimpl3.getInserting() || !Intrinsics.areEqual(m5333constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m5333constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m5333constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m5340setimpl(m5333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1180634875, "C303@12892L6:Tab.kt#jmzs0o");
                function22.invoke(startRestartGroup, Integer.valueOf((i2 >> 3) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1044752632);
                startRestartGroup.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.TabKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TabBaselineLayout$lambda$11;
                    TabBaselineLayout$lambda$11 = TabKt.TabBaselineLayout$lambda$11(Function2.this, function22, i, (Composer) obj, ((Integer) obj2).intValue());
                    return TabBaselineLayout$lambda$11;
                }
            });
        }
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
        int mo738roundToPx0680j_4 = density.mo738roundToPx0680j_4(f) + density.mo738roundToPx0680j_4(TabRowDefaults.INSTANCE.m2521getIndicatorHeightD9Ej5fM());
        int height = (placeable2.getHeight() + density.mo737roundToPxR2X_6o(IconDistanceFromBaseline)) - i3;
        int i5 = (i2 - i4) - mo738roundToPx0680j_4;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, (i - placeable.getWidth()) / 2, i5, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, (i - placeable2.getWidth()) / 2, i5 - height, 0.0f, 4, null);
    }

    private static final long TabTransition_Klgx_Pg$lambda$5(State<Color> state) {
        return state.getValue().m6049unboximpl();
    }
}
