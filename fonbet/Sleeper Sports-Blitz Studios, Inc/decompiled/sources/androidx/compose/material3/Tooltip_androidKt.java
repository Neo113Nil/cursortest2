package androidx.compose.material3;

import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import com.rnlineargradient.LinearGradientManager;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.objectweb.asm.Opcodes;

/* compiled from: Tooltip.android.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001al\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001av\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0015\u001a\u0090\u0001\u0010\u0016\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010¢\u0006\u0002\b\u00112\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010¢\u0006\u0002\b\u00112\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u009a\u0001\u0010\u0016\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010¢\u0006\u0002\b\u00112\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010¢\u0006\u0002\b\u00112\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"PlainTooltipAndroid", "", "Landroidx/compose/material3/TooltipScope;", "modifier", "Landroidx/compose/ui/Modifier;", "caretSize", "Landroidx/compose/ui/unit/DpSize;", "shape", "Landroidx/compose/ui/graphics/Shape;", "contentColor", "Landroidx/compose/ui/graphics/Color;", "containerColor", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "shadowElevation", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "PlainTooltip", "(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", ViewProps.MAX_WIDTH, "(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;JFLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "RichTooltipAndroid", "title", "action", LinearGradientManager.PROP_COLORS, "Landroidx/compose/material3/RichTooltipColors;", "text", "RichTooltip", "(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/RichTooltipColors;FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/material3/TooltipScope;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JFLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/RichTooltipColors;FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Tooltip_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlainTooltipAndroid_7QI4Sbk$lambda$0(TooltipScope tooltipScope, Modifier modifier, long j, Shape shape, long j2, long j3, float f, float f2, Function2 function2, int i, int i2, Composer composer, int i3) {
        PlainTooltip(tooltipScope, modifier, j, shape, j2, j3, f, f2, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlainTooltipAndroid_m9Er_Xc$lambda$1(TooltipScope tooltipScope, Modifier modifier, long j, float f, Shape shape, long j2, long j3, float f2, float f3, Function2 function2, int i, int i2, Composer composer, int i3) {
        PlainTooltip(tooltipScope, modifier, j, f, shape, j2, j3, f2, f3, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RichTooltipAndroid_ZuUcA3Q$lambda$3(TooltipScope tooltipScope, Modifier modifier, Function2 function2, Function2 function22, long j, float f, Shape shape, RichTooltipColors richTooltipColors, float f2, float f3, Function2 function23, int i, int i2, int i3, Composer composer, int i4) {
        RichTooltip(tooltipScope, modifier, function2, function22, j, f, shape, richTooltipColors, f2, f3, function23, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RichTooltipAndroid_yDvdmqw$lambda$2(TooltipScope tooltipScope, Modifier modifier, Function2 function2, Function2 function22, long j, Shape shape, RichTooltipColors richTooltipColors, float f, float f2, Function2 function23, int i, int i2, Composer composer, int i3) {
        RichTooltip(tooltipScope, modifier, function2, function22, j, shape, richTooltipColors, f, f2, function23, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with maxWidth parameter.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void PlainTooltip(final TooltipScope tooltipScope, Modifier modifier, long j, Shape shape, long j2, long j3, float f, float f2, final Function2 function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j4;
        Shape shape2;
        long j5;
        long j6;
        int i4;
        int i5;
        final float f3;
        final Modifier modifier3;
        final long j7;
        final Shape shape3;
        final long j8;
        final long j9;
        final float f4;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        Shape shape4;
        long j10;
        float f5;
        float f6;
        int i6;
        long j11;
        long j12;
        long j13;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(2114904198);
        ComposerKt.sourceInformation(startRestartGroup, "C(PlainTooltipAndroid)N(modifier,caretSize:c#ui.unit.DpSize,shape,contentColor:c#ui.graphics.Color,containerColor:c#ui.graphics.Color,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,content)61@2558L377:Tooltip.android.kt#uh7d8r");
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(tooltipScope) : startRestartGroup.changedInstance(tooltipScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 2) == 0) {
                    j4 = j;
                    if (startRestartGroup.changed(j4)) {
                        i9 = 256;
                        i3 |= i9;
                    }
                } else {
                    j4 = j;
                }
                i9 = 128;
                i3 |= i9;
            } else {
                j4 = j;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i8 = 2048;
                        i3 |= i8;
                    }
                } else {
                    shape2 = shape;
                }
                i8 = 1024;
                i3 |= i8;
            } else {
                shape2 = shape;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 8) == 0) {
                    j5 = j2;
                    if (startRestartGroup.changed(j5)) {
                        i7 = 16384;
                        i3 |= i7;
                    }
                } else {
                    j5 = j2;
                }
                i7 = 8192;
                i3 |= i7;
            } else {
                j5 = j2;
            }
            if ((196608 & i) != 0) {
                j6 = j3;
                i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j6)) ? 131072 : 65536;
            } else {
                j6 = j3;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= startRestartGroup.changed(f) ? 1048576 : 524288;
            }
            i5 = i2 & 64;
            if (i5 == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= startRestartGroup.changed(f2) ? 8388608 : 4194304;
            }
            if ((i2 & 128) == 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i3 |= startRestartGroup.changedInstance(function2) ? 67108864 : 33554432;
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "54@2282L26,55@2352L24,56@2422L26");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -458753;
                        }
                        i6 = i3;
                        modifier4 = modifier2;
                        j11 = j4;
                        shape4 = shape2;
                        j12 = j5;
                        j13 = j6;
                        f6 = f;
                        f5 = f2;
                    } else {
                        if (i10 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 2) != 0) {
                            j4 = DpSize.INSTANCE.m8905getUnspecifiedMYxV2XQ();
                            i3 &= -897;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -7169;
                            shape2 = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(startRestartGroup, 6);
                        }
                        if ((i2 & 8) != 0) {
                            j5 = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(startRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 16) != 0) {
                            j6 = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(startRestartGroup, 6);
                            i3 &= -458753;
                        }
                        float m8798constructorimpl = i4 != 0 ? Dp.m8798constructorimpl(0) : f;
                        if (i5 != 0) {
                            shape4 = shape2;
                            j10 = j5;
                            f6 = m8798constructorimpl;
                            f5 = Dp.m8798constructorimpl(0);
                            i6 = i3;
                            modifier4 = modifier2;
                        } else {
                            modifier4 = modifier2;
                            shape4 = shape2;
                            j10 = j5;
                            f5 = f2;
                            f6 = m8798constructorimpl;
                            i6 = i3;
                        }
                        j11 = j4;
                        j12 = j10;
                        j13 = j6;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2114904198, i6, -1, "androidx.compose.material3.PlainTooltipAndroid (Tooltip.android.kt:61)");
                    }
                    int i11 = (i6 & 14) | 3072 | (i6 & 112);
                    int i12 = i6 << 3;
                    long j14 = j11;
                    TooltipKt.m4106PlainTooltipgv3ox5I(tooltipScope, modifier4, TooltipDefaults.INSTANCE.m4092caretShapeEaSLcWc(j11), TooltipDefaults.INSTANCE.m4094getPlainTooltipMaxWidthD9Ej5fM(), shape4, j12, j13, f6, f5, function2, startRestartGroup, (i12 & 1879048192) | i11 | (i12 & 57344) | (i12 & Opcodes.ASM7) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    f3 = f5;
                    f4 = f6;
                    j9 = j13;
                    j8 = j12;
                    shape3 = shape4;
                    j7 = j14;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    f3 = f2;
                    modifier3 = modifier2;
                    j7 = j4;
                    shape3 = shape2;
                    j8 = j5;
                    j9 = j6;
                    f4 = f;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.Tooltip_androidKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit PlainTooltipAndroid_7QI4Sbk$lambda$0;
                            PlainTooltipAndroid_7QI4Sbk$lambda$0 = Tooltip_androidKt.PlainTooltipAndroid_7QI4Sbk$lambda$0(TooltipScope.this, modifier3, j7, shape3, j8, j9, f4, f3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return PlainTooltipAndroid_7QI4Sbk$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0215  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void PlainTooltip(final TooltipScope tooltipScope, Modifier modifier, long j, float f, Shape shape, long j2, long j3, float f2, float f3, final Function2 function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j4;
        int i4;
        float f4;
        Shape shape2;
        long j5;
        int i5;
        int i6;
        final float f5;
        int i7;
        int i8;
        int i9;
        final Modifier modifier3;
        final long j6;
        final float f6;
        final Shape shape3;
        Composer composer2;
        final long j7;
        final long j8;
        final float f7;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        long j9;
        float m4094getPlainTooltipMaxWidthD9Ej5fM;
        Shape shape4;
        long j10;
        long j11;
        long j12;
        Shape shape5;
        long j13;
        int i10;
        float m8798constructorimpl;
        float f8;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1456881596);
        ComposerKt.sourceInformation(startRestartGroup, "C(PlainTooltipAndroid)N(modifier,caretSize:c#ui.unit.DpSize,maxWidth:c#ui.unit.Dp,shape,contentColor:c#ui.graphics.Color,containerColor:c#ui.graphics.Color,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,content)105@4515L349:Tooltip.android.kt#uh7d8r");
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(tooltipScope) : startRestartGroup.changedInstance(tooltipScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 2) == 0) {
                    j4 = j;
                    if (startRestartGroup.changed(j4)) {
                        i12 = 256;
                        i3 |= i12;
                    }
                } else {
                    j4 = j;
                }
                i12 = 128;
                i3 |= i12;
            } else {
                j4 = j;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f4 = f;
                i3 |= startRestartGroup.changed(f4) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i11 = 16384;
                            i3 |= i11;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i11 = 8192;
                    i3 |= i11;
                } else {
                    shape2 = shape;
                }
                if ((196608 & i) == 0) {
                    j5 = j2;
                    i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j5)) ? 131072 : 65536;
                } else {
                    j5 = j2;
                }
                if ((1572864 & i) == 0) {
                    i5 = i3 | (((i2 & 32) == 0 && startRestartGroup.changed(j3)) ? 1048576 : 524288);
                } else {
                    i5 = i3;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i5 |= 12582912;
                    f5 = f2;
                } else {
                    f5 = f2;
                    if ((i & 12582912) == 0) {
                        i5 |= startRestartGroup.changed(f5) ? 8388608 : 4194304;
                    }
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i5 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i8 = i7;
                    i5 |= startRestartGroup.changed(f3) ? 67108864 : 33554432;
                    int i14 = 805306368;
                    if ((i2 & 256) == 0) {
                        if ((i & 805306368) != 0) {
                            i9 = i5;
                            if (startRestartGroup.shouldExecute((i9 & 306783379) != 306783378, i9 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "98@4239L26,99@4309L24,100@4379L26");
                                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 2) != 0) {
                                        i9 &= -897;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i9 &= -57345;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i9 &= -458753;
                                    }
                                    if ((i2 & 32) != 0) {
                                        i9 &= -3670017;
                                    }
                                    companion = modifier2;
                                    j12 = j4;
                                    m4094getPlainTooltipMaxWidthD9Ej5fM = f4;
                                    shape5 = shape2;
                                    j10 = j5;
                                    j13 = j3;
                                } else {
                                    companion = i13 != 0 ? Modifier.INSTANCE : modifier2;
                                    if ((i2 & 2) != 0) {
                                        j9 = DpSize.INSTANCE.m8905getUnspecifiedMYxV2XQ();
                                        i9 &= -897;
                                    } else {
                                        j9 = j4;
                                    }
                                    m4094getPlainTooltipMaxWidthD9Ej5fM = i4 != 0 ? TooltipDefaults.INSTANCE.m4094getPlainTooltipMaxWidthD9Ej5fM() : f4;
                                    if ((i2 & 8) != 0) {
                                        shape4 = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(startRestartGroup, 6);
                                        i9 &= -57345;
                                    } else {
                                        shape4 = shape2;
                                    }
                                    if ((i2 & 16) != 0) {
                                        j10 = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(startRestartGroup, 6);
                                        i9 &= -458753;
                                    } else {
                                        j10 = j5;
                                    }
                                    if ((i2 & 32) != 0) {
                                        j11 = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(startRestartGroup, 6);
                                        i9 &= -3670017;
                                    } else {
                                        j11 = j3;
                                    }
                                    float m8798constructorimpl2 = i6 != 0 ? Dp.m8798constructorimpl(0) : f5;
                                    if (i8 != 0) {
                                        f5 = m8798constructorimpl2;
                                        i10 = i9;
                                        m8798constructorimpl = Dp.m8798constructorimpl(0);
                                        j12 = j9;
                                        shape5 = shape4;
                                        j13 = j11;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            f8 = m8798constructorimpl;
                                        } else {
                                            f8 = m8798constructorimpl;
                                            ComposerKt.traceEventStart(1456881596, i10, -1, "androidx.compose.material3.PlainTooltipAndroid (Tooltip.android.kt:104)");
                                        }
                                        int i15 = 2147482750 & i10;
                                        long j14 = j12;
                                        float f9 = m4094getPlainTooltipMaxWidthD9Ej5fM;
                                        long j15 = j10;
                                        float f10 = f5;
                                        float f11 = f8;
                                        TooltipKt.m4106PlainTooltipgv3ox5I(tooltipScope, companion, TooltipDefaults.INSTANCE.m4092caretShapeEaSLcWc(j12), f9, shape5, j15, j13, f10, f11, function2, startRestartGroup, i15, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier3 = companion;
                                        f5 = f10;
                                        composer2 = startRestartGroup;
                                        f7 = f11;
                                        j8 = j13;
                                        j7 = j15;
                                        f6 = f9;
                                        shape3 = shape5;
                                        j6 = j14;
                                    } else {
                                        f5 = m8798constructorimpl2;
                                        j12 = j9;
                                        shape5 = shape4;
                                        j13 = j11;
                                    }
                                }
                                i10 = i9;
                                m8798constructorimpl = f3;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i152 = 2147482750 & i10;
                                long j142 = j12;
                                float f92 = m4094getPlainTooltipMaxWidthD9Ej5fM;
                                long j152 = j10;
                                float f102 = f5;
                                float f112 = f8;
                                TooltipKt.m4106PlainTooltipgv3ox5I(tooltipScope, companion, TooltipDefaults.INSTANCE.m4092caretShapeEaSLcWc(j12), f92, shape5, j152, j13, f102, f112, function2, startRestartGroup, i152, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = companion;
                                f5 = f102;
                                composer2 = startRestartGroup;
                                f7 = f112;
                                j8 = j13;
                                j7 = j152;
                                f6 = f92;
                                shape3 = shape5;
                                j6 = j142;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                j6 = j4;
                                f6 = f4;
                                shape3 = shape2;
                                composer2 = startRestartGroup;
                                j7 = j5;
                                j8 = j3;
                                f7 = f3;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.Tooltip_androidKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit PlainTooltipAndroid_m9Er_Xc$lambda$1;
                                        PlainTooltipAndroid_m9Er_Xc$lambda$1 = Tooltip_androidKt.PlainTooltipAndroid_m9Er_Xc$lambda$1(TooltipScope.this, modifier3, j6, f6, shape3, j7, j8, f5, f7, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return PlainTooltipAndroid_m9Er_Xc$lambda$1;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i14 = startRestartGroup.changedInstance(function2) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                    }
                    i5 |= i14;
                    i9 = i5;
                    if (startRestartGroup.shouldExecute((i9 & 306783379) != 306783378, i9 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 = i7;
                int i142 = 805306368;
                if ((i2 & 256) == 0) {
                }
                i5 |= i142;
                i9 = i5;
                if (startRestartGroup.shouldExecute((i9 & 306783379) != 306783378, i9 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f4 = f;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i7;
            int i1422 = 805306368;
            if ((i2 & 256) == 0) {
            }
            i5 |= i1422;
            i9 = i5;
            if (startRestartGroup.shouldExecute((i9 & 306783379) != 306783378, i9 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f4 = f;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i7;
        int i14222 = 805306368;
        if ((i2 & 256) == 0) {
        }
        i5 |= i14222;
        i9 = i5;
        if (startRestartGroup.shouldExecute((i9 & 306783379) != 306783378, i9 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with maxWidth parameter.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void RichTooltip(final TooltipScope tooltipScope, Modifier modifier, Function2 function2, Function2 function22, long j, Shape shape, RichTooltipColors richTooltipColors, float f, float f2, final Function2 function23, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2 function24;
        int i5;
        Function2 function25;
        long j2;
        Shape shape2;
        int i6;
        RichTooltipColors richTooltipColors2;
        int i7;
        float f3;
        int i8;
        int i9;
        final Function2 function26;
        final Function2 function27;
        final RichTooltipColors richTooltipColors3;
        final Shape shape3;
        final float f4;
        final float f5;
        final Modifier modifier3;
        final long j3;
        ScopeUpdateScope endRestartGroup;
        float m5001getContainerElevationD9Ej5fM;
        int i10;
        Function2 function28;
        float f6;
        Modifier modifier4;
        Function2 function29;
        RichTooltipColors richTooltipColors4;
        long j4;
        Shape shape4;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-244908363);
        ComposerKt.sourceInformation(startRestartGroup, "C(RichTooltipAndroid)N(modifier,title,action,caretSize:c#ui.unit.DpSize,shape,colors,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,text)154@6569L364:Tooltip.android.kt#uh7d8r");
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(tooltipScope) : startRestartGroup.changedInstance(tooltipScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function24 = function2;
                i3 |= startRestartGroup.changedInstance(function24) ? 256 : 128;
                i5 = i2 & 4;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function25 = function22;
                    i3 |= startRestartGroup.changedInstance(function25) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        j2 = j;
                        i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j2)) ? 16384 : 8192;
                    } else {
                        j2 = j;
                    }
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        if ((i2 & 16) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i11 = 131072;
                                i3 |= i11;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i11 = 65536;
                        i3 |= i11;
                    } else {
                        shape2 = shape;
                    }
                    if ((i & 1572864) != 0) {
                        i6 = 196608;
                        richTooltipColors2 = richTooltipColors;
                        i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(richTooltipColors2)) ? 1048576 : 524288;
                    } else {
                        i6 = 196608;
                        richTooltipColors2 = richTooltipColors;
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 12582912;
                        f3 = f;
                    } else {
                        f3 = f;
                        if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(f3) ? 8388608 : 4194304;
                        }
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i9 = i8;
                        i3 |= startRestartGroup.changed(f2) ? 67108864 : 33554432;
                        if ((i2 & 256) != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(function23) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "148@6318L25,149@6393L19");
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i12 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        function24 = null;
                                    }
                                    if (i5 != 0) {
                                        function25 = null;
                                    }
                                    if ((i2 & 8) != 0) {
                                        j2 = DpSize.INSTANCE.m8905getUnspecifiedMYxV2XQ();
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -458753;
                                        shape2 = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(startRestartGroup, 6);
                                    }
                                    if ((i2 & 32) != 0) {
                                        richTooltipColors2 = TooltipDefaults.INSTANCE.richTooltipColors(startRestartGroup, 6);
                                        i3 = (-3670017) & i3;
                                    }
                                    if (i7 != 0) {
                                        f3 = ElevationTokens.INSTANCE.m4658getLevel0D9Ej5fM();
                                    }
                                    if (i9 != 0) {
                                        Function2 function210 = function25;
                                        m5001getContainerElevationD9Ej5fM = RichTooltipTokens.INSTANCE.m5001getContainerElevationD9Ej5fM();
                                        i10 = i3;
                                        function28 = function210;
                                        f6 = f3;
                                        modifier4 = modifier2;
                                        function29 = function24;
                                        richTooltipColors4 = richTooltipColors2;
                                        j4 = j2;
                                        shape4 = shape2;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-244908363, i10, -1, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:154)");
                                        }
                                        int i13 = i10 << 3;
                                        long j5 = j4;
                                        TooltipKt.m4108RichTooltipEkvW5A0(tooltipScope, modifier4, function29, function28, TooltipDefaults.INSTANCE.m4092caretShapeEaSLcWc(j4), TooltipDefaults.INSTANCE.m4095getRichTooltipMaxWidthD9Ej5fM(), shape4, richTooltipColors4, f6, m5001getContainerElevationD9Ej5fM, function23, startRestartGroup, (i10 & 14) | i6 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (i13 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | (i13 & 1879048192), (i10 >> 27) & 14, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        function27 = function28;
                                        f4 = m5001getContainerElevationD9Ej5fM;
                                        function26 = function29;
                                        f5 = f6;
                                        modifier3 = modifier4;
                                        richTooltipColors3 = richTooltipColors4;
                                        shape3 = shape4;
                                        j3 = j5;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 8) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -458753;
                                    }
                                    if ((i2 & 32) != 0) {
                                        i3 &= -3670017;
                                    }
                                }
                                f6 = f3;
                                i10 = i3;
                                modifier4 = modifier2;
                                function29 = function24;
                                function28 = function25;
                                richTooltipColors4 = richTooltipColors2;
                                j4 = j2;
                                shape4 = shape2;
                                m5001getContainerElevationD9Ej5fM = f2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i132 = i10 << 3;
                                long j52 = j4;
                                TooltipKt.m4108RichTooltipEkvW5A0(tooltipScope, modifier4, function29, function28, TooltipDefaults.INSTANCE.m4092caretShapeEaSLcWc(j4), TooltipDefaults.INSTANCE.m4095getRichTooltipMaxWidthD9Ej5fM(), shape4, richTooltipColors4, f6, m5001getContainerElevationD9Ej5fM, function23, startRestartGroup, (i10 & 14) | i6 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (i132 & 3670016) | (i132 & 29360128) | (i132 & 234881024) | (i132 & 1879048192), (i10 >> 27) & 14, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function27 = function28;
                                f4 = m5001getContainerElevationD9Ej5fM;
                                function26 = function29;
                                f5 = f6;
                                modifier3 = modifier4;
                                richTooltipColors3 = richTooltipColors4;
                                shape3 = shape4;
                                j3 = j52;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                function26 = function24;
                                function27 = function25;
                                richTooltipColors3 = richTooltipColors2;
                                shape3 = shape2;
                                f4 = f2;
                                f5 = f3;
                                modifier3 = modifier2;
                                j3 = j2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.Tooltip_androidKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit RichTooltipAndroid_yDvdmqw$lambda$2;
                                        RichTooltipAndroid_yDvdmqw$lambda$2 = Tooltip_androidKt.RichTooltipAndroid_yDvdmqw$lambda$2(TooltipScope.this, modifier3, function26, function27, j3, shape3, richTooltipColors3, f5, f4, function23, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return RichTooltipAndroid_yDvdmqw$lambda$2;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i8;
                    if ((i2 & 256) != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function25 = function22;
                if ((i & 24576) != 0) {
                }
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                }
                if ((i & 1572864) != 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i9 = i8;
                if ((i2 & 256) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function24 = function2;
            i5 = i2 & 4;
            if (i5 != 0) {
            }
            function25 = function22;
            if ((i & 24576) != 0) {
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
            }
            if ((i & 1572864) != 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i8;
            if ((i2 & 256) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        function24 = function2;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        function25 = function22;
        if ((i & 24576) != 0) {
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
        }
        if ((i & 1572864) != 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i8;
        if ((i2 & 256) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void RichTooltip(final TooltipScope tooltipScope, Modifier modifier, Function2 function2, Function2 function22, long j, float f, Shape shape, RichTooltipColors richTooltipColors, float f2, float f3, final Function2 function23, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Function2 function24;
        int i6;
        Function2 function25;
        long j2;
        int i7;
        float f4;
        RichTooltipColors richTooltipColors2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        final Shape shape2;
        final float f5;
        final Modifier modifier3;
        final Function2 function26;
        Composer composer2;
        final float f6;
        final float f7;
        final RichTooltipColors richTooltipColors3;
        final Function2 function27;
        final long j3;
        ScopeUpdateScope endRestartGroup;
        Modifier.Companion companion;
        long j4;
        Shape shape3;
        int i13;
        Function2 function28;
        float f8;
        float f9;
        float f10;
        RichTooltipColors richTooltipColors4;
        long j5;
        Function2 function29;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(-905938553);
        ComposerKt.sourceInformation(startRestartGroup, "C(RichTooltipAndroid)N(modifier,title,action,caretSize:c#ui.unit.DpSize,maxWidth:c#ui.unit.Dp,shape,colors,tonalElevation:c#ui.unit.Dp,shadowElevation:c#ui.unit.Dp,text)202@8696L337:Tooltip.android.kt#uh7d8r");
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? startRestartGroup.changed(tooltipScope) : startRestartGroup.changedInstance(tooltipScope) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i15 = i3 & 1;
        if (i15 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 2;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                function24 = function2;
                i4 |= startRestartGroup.changedInstance(function24) ? 256 : 128;
                i6 = i3 & 4;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    function25 = function22;
                    i4 |= startRestartGroup.changedInstance(function25) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        if ((i3 & 8) == 0) {
                            j2 = j;
                            if (startRestartGroup.changed(j2)) {
                                i14 = 16384;
                                i4 |= i14;
                            }
                        } else {
                            j2 = j;
                        }
                        i14 = 8192;
                        i4 |= i14;
                    } else {
                        j2 = j;
                    }
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        f4 = f;
                    } else {
                        f4 = f;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changed(f4) ? 131072 : 65536;
                        }
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(shape)) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) != 0) {
                        richTooltipColors2 = richTooltipColors;
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(richTooltipColors2)) ? 8388608 : 4194304;
                    } else {
                        richTooltipColors2 = richTooltipColors;
                    }
                    i8 = i3 & 128;
                    if (i8 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i9 = i8;
                        i4 |= startRestartGroup.changed(f2) ? 67108864 : 33554432;
                        i10 = i3 & 256;
                        if (i10 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i11 = i10;
                            i4 |= startRestartGroup.changed(f3) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
                            if ((i3 & 512) == 0) {
                                i12 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i12 = i2 | (startRestartGroup.changedInstance(function23) ? 4 : 2);
                            } else {
                                i12 = i2;
                            }
                            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
                                startRestartGroup.startDefaults();
                                ComposerKt.sourceInformation(startRestartGroup, "196@8445L25,197@8520L19");
                                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 8) != 0) {
                                        i4 &= -57345;
                                    }
                                    if ((i3 & 32) != 0) {
                                        i4 &= -3670017;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i4 &= -29360129;
                                    }
                                    Function2 function210 = function25;
                                    i13 = i4;
                                    function28 = function210;
                                    shape3 = shape;
                                    f10 = f2;
                                    f8 = f4;
                                    companion = modifier2;
                                    function29 = function24;
                                    f9 = f3;
                                    richTooltipColors4 = richTooltipColors2;
                                    j5 = j2;
                                } else {
                                    companion = i15 != 0 ? Modifier.INSTANCE : modifier2;
                                    if (i5 != 0) {
                                        function24 = null;
                                    }
                                    Function2 function211 = i6 == 0 ? function25 : null;
                                    if ((i3 & 8) != 0) {
                                        j4 = DpSize.INSTANCE.m8905getUnspecifiedMYxV2XQ();
                                        i4 &= -57345;
                                    } else {
                                        j4 = j2;
                                    }
                                    if (i7 != 0) {
                                        f4 = TooltipDefaults.INSTANCE.m4095getRichTooltipMaxWidthD9Ej5fM();
                                    }
                                    if ((i3 & 32) != 0) {
                                        shape3 = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(startRestartGroup, 6);
                                        i4 &= -3670017;
                                    } else {
                                        shape3 = shape;
                                    }
                                    if ((i3 & 64) != 0) {
                                        richTooltipColors2 = TooltipDefaults.INSTANCE.richTooltipColors(startRestartGroup, 6);
                                        i4 = (-29360129) & i4;
                                    }
                                    float m4658getLevel0D9Ej5fM = i9 != 0 ? ElevationTokens.INSTANCE.m4658getLevel0D9Ej5fM() : f2;
                                    if (i11 != 0) {
                                        long j6 = j4;
                                        f10 = m4658getLevel0D9Ej5fM;
                                        richTooltipColors4 = richTooltipColors2;
                                        function29 = function24;
                                        f9 = RichTooltipTokens.INSTANCE.m5001getContainerElevationD9Ej5fM();
                                        i13 = i4;
                                        function28 = function211;
                                        f8 = f4;
                                        j5 = j6;
                                    } else {
                                        i13 = i4;
                                        function28 = function211;
                                        f8 = f4;
                                        Function2 function212 = function24;
                                        f9 = f3;
                                        long j7 = j4;
                                        f10 = m4658getLevel0D9Ej5fM;
                                        richTooltipColors4 = richTooltipColors2;
                                        j5 = j7;
                                        function29 = function212;
                                    }
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-905938553, i13, i12, "androidx.compose.material3.RichTooltipAndroid (Tooltip.android.kt:201)");
                                }
                                long j8 = j5;
                                float f11 = f8;
                                Shape shape4 = shape3;
                                TooltipKt.m4108RichTooltipEkvW5A0(tooltipScope, companion, function29, function28, TooltipDefaults.INSTANCE.m4092caretShapeEaSLcWc(j5), f11, shape4, richTooltipColors4, f10, f9, function23, startRestartGroup, i13 & 2147426302, i12 & 14, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function27 = function28;
                                f5 = f10;
                                composer2 = startRestartGroup;
                                function26 = function29;
                                shape2 = shape4;
                                f6 = f9;
                                modifier3 = companion;
                                richTooltipColors3 = richTooltipColors4;
                                f7 = f11;
                                j3 = j8;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                shape2 = shape;
                                f5 = f2;
                                modifier3 = modifier2;
                                function26 = function24;
                                composer2 = startRestartGroup;
                                f6 = f3;
                                f7 = f4;
                                richTooltipColors3 = richTooltipColors2;
                                function27 = function25;
                                j3 = j2;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.Tooltip_androidKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit RichTooltipAndroid_ZuUcA3Q$lambda$3;
                                        RichTooltipAndroid_ZuUcA3Q$lambda$3 = Tooltip_androidKt.RichTooltipAndroid_ZuUcA3Q$lambda$3(TooltipScope.this, modifier3, function26, function27, j3, f7, shape2, richTooltipColors3, f5, f6, function23, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        return RichTooltipAndroid_ZuUcA3Q$lambda$3;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i11 = i10;
                        if ((i3 & 512) == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i8;
                    i10 = i3 & 256;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    if ((i3 & 512) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function25 = function22;
                if ((i & 24576) != 0) {
                }
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) != 0) {
                }
                i8 = i3 & 128;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i3 & 256;
                if (i10 != 0) {
                }
                i11 = i10;
                if ((i3 & 512) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function24 = function2;
            i6 = i3 & 4;
            if (i6 != 0) {
            }
            function25 = function22;
            if ((i & 24576) != 0) {
            }
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) != 0) {
            }
            i8 = i3 & 128;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i3 & 256;
            if (i10 != 0) {
            }
            i11 = i10;
            if ((i3 & 512) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 2;
        if (i5 == 0) {
        }
        function24 = function2;
        i6 = i3 & 4;
        if (i6 != 0) {
        }
        function25 = function22;
        if ((i & 24576) != 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3 & 256;
        if (i10 != 0) {
        }
        i11 = i10;
        if ((i3 & 512) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
