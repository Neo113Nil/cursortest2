package androidx.compose.material;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material.ripple.RippleThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MaterialTheme.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"MaterialTheme", "", "colors", "Landroidx/compose/material/Colors;", "typography", "Landroidx/compose/material/Typography;", "shapes", "Landroidx/compose/material/Shapes;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/material/Colors;Landroidx/compose/material/Typography;Landroidx/compose/material/Shapes;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MaterialThemeKt {
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
    
        if ((r48 & 4) != 0) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MaterialTheme(Colors colors, Typography typography, Shapes shapes, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Colors colors2;
        int i3;
        Typography typography2;
        Shapes shapes2;
        final Shapes shapes3;
        final Typography typography3;
        final Colors colors3;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-891417079);
        ComposerKt.sourceInformation(startRestartGroup, "C(MaterialTheme)P(!1,3,2)59@2947L6,60@2998L10,61@3045L6,*64@3120L184,69@3367L16,70@3410L45,73@3581L4,71@3460L492:MaterialTheme.kt#jmzs0o");
        if ((i & 14) == 0) {
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
        if ((i & 112) == 0) {
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
        if ((i & 896) == 0) {
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
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(content) ? 2048 : 1024;
        }
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            } else {
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
                Colors colors4 = colors2;
                final Typography typography4 = typography2;
                final int i7 = i3;
                shapes3 = shapes2;
                startRestartGroup.endDefaults();
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = colors4.m1316copypvPzIIM((r45 & 1) != 0 ? colors4.m1324getPrimary0d7_KjU() : 0L, (r45 & 2) != 0 ? colors4.m1325getPrimaryVariant0d7_KjU() : 0L, (r45 & 4) != 0 ? colors4.m1326getSecondary0d7_KjU() : 0L, (r45 & 8) != 0 ? colors4.m1327getSecondaryVariant0d7_KjU() : 0L, (r45 & 16) != 0 ? colors4.m1317getBackground0d7_KjU() : 0L, (r45 & 32) != 0 ? colors4.m1328getSurface0d7_KjU() : 0L, (r45 & 64) != 0 ? colors4.m1318getError0d7_KjU() : 0L, (r45 & 128) != 0 ? colors4.m1321getOnPrimary0d7_KjU() : 0L, (r45 & 256) != 0 ? colors4.m1322getOnSecondary0d7_KjU() : 0L, (r45 & 512) != 0 ? colors4.m1319getOnBackground0d7_KjU() : 0L, (r45 & 1024) != 0 ? colors4.m1323getOnSurface0d7_KjU() : 0L, (r45 & 2048) != 0 ? colors4.m1320getOnError0d7_KjU() : 0L, (r45 & 4096) != 0 ? colors4.isLight() : false);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Colors colors5 = (Colors) rememberedValue;
                ColorsKt.updateColorsFrom(colors5, colors4);
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ColorsKt.getLocalColors().provides(colors5), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6))), IndicationKt.getLocalIndication().provides(RippleKt.m1610rememberRipple9IZ8Weo(false, 0.0f, 0L, startRestartGroup, 0, 7)), RippleThemeKt.getLocalRippleTheme().provides(MaterialRippleTheme.INSTANCE), ShapesKt.getLocalShapes().provides(shapes3), TextSelectionColorsKt.getLocalTextSelectionColors().provides(MaterialTextSelectionColorsKt.rememberTextSelectionColors(colors5, startRestartGroup, 0)), TypographyKt.getLocalTypography().provides(typography4)}, ComposableLambdaKt.composableLambda(startRestartGroup, -1740102967, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MaterialThemeKt$MaterialTheme$1
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

                    public final void invoke(Composer composer2, int i8) {
                        ComposerKt.sourceInformation(composer2, "C80@3849L97:MaterialTheme.kt#jmzs0o");
                        if ((i8 & 11) != 2 || !composer2.getSkipping()) {
                            TextStyle body1 = Typography.this.getBody1();
                            final Function2<Composer, Integer, Unit> function2 = content;
                            final int i9 = i7;
                            TextKt.ProvideTextStyle(body1, ComposableLambdaKt.composableLambda(composer2, 181426554, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MaterialThemeKt$MaterialTheme$1.1
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

                                public final void invoke(Composer composer3, int i10) {
                                    ComposerKt.sourceInformation(composer3, "C81@3906L30:MaterialTheme.kt#jmzs0o");
                                    if ((i10 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        MaterialTheme_androidKt.PlatformMaterialTheme(function2, composer3, (i9 >> 9) & 14);
                                    }
                                }
                            }), composer2, 48);
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, 56);
                typography3 = typography4;
                colors3 = colors4;
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            colors3 = colors2;
            typography3 = typography2;
            shapes3 = shapes2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MaterialThemeKt$MaterialTheme$2
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

            public final void invoke(Composer composer2, int i8) {
                MaterialThemeKt.MaterialTheme(Colors.this, typography3, shapes3, content, composer2, i | 1, i2);
            }
        });
    }
}
