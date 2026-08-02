package androidx.compose.material;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.TextStyle;
import com.rnlineargradient.LinearGradientManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MaterialTheme.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"MaterialTheme", "", LinearGradientManager.PROP_COLORS, "Landroidx/compose/material/Colors;", "typography", "Landroidx/compose/material/Typography;", "shapes", "Landroidx/compose/material/Shapes;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MaterialThemeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MaterialTheme$lambda$2(Colors colors, Typography typography, Shapes shapes, Function2 function2, int i, int i2, Composer composer, int i3) {
        MaterialTheme(colors, typography, shapes, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b3, code lost:
    
        if ((r48 & 4) != 0) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MaterialTheme(Colors colors, Typography typography, Shapes shapes, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        Colors colors2;
        int i3;
        final Typography typography2;
        Shapes shapes2;
        Colors colors3;
        int i4;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(53836214);
        ComposerKt.sourceInformation(startRestartGroup, "C(MaterialTheme)N(colors,typography,shapes,content)64@2936L216,71@3263L45,74@3434L4,79@3638L93,72@3313L418:MaterialTheme.kt#jmzs0o");
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                colors2 = colors;
                if (startRestartGroup.changed(colors2)) {
                    i6 = 4;
                    i3 = i6 | i;
                }
            } else {
                colors2 = colors;
            }
            i6 = 2;
            i3 = i6 | i;
        } else {
            colors2 = colors;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                typography2 = typography;
                if (startRestartGroup.changed(typography2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                typography2 = typography;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            typography2 = typography;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                shapes2 = shapes;
                if (startRestartGroup.changed(shapes2)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                shapes2 = shapes;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            shapes2 = shapes;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.startDefaults();
            ComposerKt.sourceInformation(startRestartGroup, "58@2754L6,59@2805L10,60@2852L6");
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    colors2 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6);
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    typography2 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    shapes2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6);
                    i3 &= -897;
                }
                colors3 = colors2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(53836214, i3, -1, "androidx.compose.material.MaterialTheme (MaterialTheme.kt:62)");
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 197002254, "CC(remember):MaterialTheme.kt#9igjgp");
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = colors3.m2265copypvPzIIM((r45 & 1) != 0 ? colors3.m2273getPrimary0d7_KjU() : 0L, (r45 & 2) != 0 ? colors3.m2274getPrimaryVariant0d7_KjU() : 0L, (r45 & 4) != 0 ? colors3.m2275getSecondary0d7_KjU() : 0L, (r45 & 8) != 0 ? colors3.m2276getSecondaryVariant0d7_KjU() : 0L, (r45 & 16) != 0 ? colors3.m2266getBackground0d7_KjU() : 0L, (r45 & 32) != 0 ? colors3.m2277getSurface0d7_KjU() : 0L, (r45 & 64) != 0 ? colors3.m2267getError0d7_KjU() : 0L, (r45 & 128) != 0 ? colors3.m2270getOnPrimary0d7_KjU() : 0L, (r45 & 256) != 0 ? colors3.m2271getOnSecondary0d7_KjU() : 0L, (r45 & 512) != 0 ? colors3.m2268getOnBackground0d7_KjU() : 0L, (r45 & 1024) != 0 ? colors3.m2272getOnSurface0d7_KjU() : 0L, (r45 & 2048) != 0 ? colors3.m2269getOnError0d7_KjU() : 0L, (r45 & 4096) != 0 ? colors3.isLight() : false);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                Colors colors4 = (Colors) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ColorsKt.updateColorsFrom(colors4, colors3);
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ColorsKt.getLocalColors().provides(colors4), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6))), IndicationKt.getLocalIndication().provides(RippleKt.m2441rippleH2RKhps$default(false, 0.0f, 0L, 7, null)), ShapesKt.getLocalShapes().provides(shapes2), TextSelectionColorsKt.getLocalTextSelectionColors().provides(MaterialTextSelectionColorsKt.rememberTextSelectionColors(colors4, startRestartGroup, 0)), TypographyKt.getLocalTypography().provides(typography2)}, ComposableLambdaKt.rememberComposableLambda(496803446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MaterialThemeKt$MaterialTheme$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        ComposerKt.sourceInformation(composer2, "C80@3691L34,80@3648L77:MaterialTheme.kt#jmzs0o");
                        if (!composer2.shouldExecute((i7 & 3) != 2, i7 & 1)) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(496803446, i7, -1, "androidx.compose.material.MaterialTheme.<anonymous> (MaterialTheme.kt:80)");
                        }
                        TextStyle body1 = Typography.this.getBody1();
                        final Function2<Composer, Integer, Unit> function22 = function2;
                        TextKt.ProvideTextStyle(body1, ComposableLambdaKt.rememberComposableLambda(905505767, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MaterialThemeKt$MaterialTheme$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                ComposerKt.sourceInformation(composer3, "C80@3693L30:MaterialTheme.kt#jmzs0o");
                                if (!composer3.shouldExecute((i8 & 3) != 2, i8 & 1)) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(905505767, i8, -1, "androidx.compose.material.MaterialTheme.<anonymous>.<anonymous> (MaterialTheme.kt:80)");
                                }
                                MaterialTheme_androidKt.PlatformMaterialTheme(function22, composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            colors3 = colors2;
        }
        final Typography typography3 = typography2;
        final Shapes shapes3 = shapes2;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Colors colors5 = colors3;
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.MaterialThemeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MaterialTheme$lambda$2;
                    MaterialTheme$lambda$2 = MaterialThemeKt.MaterialTheme$lambda$2(Colors.this, typography3, shapes3, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return MaterialTheme$lambda$2;
                }
            });
        }
    }
}
