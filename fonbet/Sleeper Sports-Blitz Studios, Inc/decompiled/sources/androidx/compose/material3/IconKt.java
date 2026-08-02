package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.SmallIconButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: Icon.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000e\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u0011\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u00122\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0013\u001a\u0014\u0010\u0014\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\u0013\u0010\u0015\u001a\u00020\u0016*\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\"\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Icon", "", "imageVector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "contentDescription", "", "modifier", "Landroidx/compose/ui/Modifier;", "tint", "Landroidx/compose/ui/graphics/Color;", "Icon-ww6aTOc", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "bitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "(Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/ColorProducer;", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/ColorProducer;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "defaultSizeFor", "isInfinite", "", "Landroidx/compose/ui/geometry/Size;", "isInfinite-uvyYCjk", "(J)Z", "DefaultIconSizeModifier", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IconKt {
    private static final Modifier DefaultIconSizeModifier = SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, SmallIconButtonTokens.INSTANCE.m5035getIconSizeD9Ej5fM());

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Icon$lambda$13(Painter painter, ColorProducer colorProducer, String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Icon(painter, colorProducer, str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Icon_ww6aTOc$lambda$0(ImageVector imageVector, String str, Modifier modifier, long j, int i, int i2, Composer composer, int i3) {
        m3195Iconww6aTOc(imageVector, str, modifier, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Icon_ww6aTOc$lambda$2(ImageBitmap imageBitmap, String str, Modifier modifier, long j, int i, int i2, Composer composer, int i3) {
        m3193Iconww6aTOc(imageBitmap, str, modifier, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Icon_ww6aTOc$lambda$6(Painter painter, String str, Modifier modifier, long j, int i, int i2, Composer composer, int i3) {
        m3194Iconww6aTOc(painter, str, modifier, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0077  */
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3195Iconww6aTOc(final ImageVector imageVector, final String str, Modifier modifier, long j, Composer composer, final int i, final int i2) {
        int i3;
        String str2;
        final Modifier modifier2;
        final long j2;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        long m6049unboximpl;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-126890956);
        ComposerKt.sourceInformation(startRestartGroup, "C(Icon)N(imageVector,contentDescription,modifier,tint:c#ui.graphics.Color)71@3410L34,70@3386L164:Icon.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(imageVector) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(str2) ? 32 : 16;
            }
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j2 = j;
                    if (startRestartGroup.changed(j2)) {
                        i4 = 2048;
                        i3 |= i4;
                    }
                } else {
                    j2 = j;
                }
                i4 = 1024;
                i3 |= i4;
            } else {
                j2 = j;
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "68@3369L7");
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                } else {
                    Modifier.Companion companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localContentColor);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        i3 &= -7169;
                        modifier3 = companion;
                        m6049unboximpl = ((Color) consume).m6049unboximpl();
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-126890956, i3, -1, "androidx.compose.material3.Icon (Icon.kt:69)");
                        }
                        m3194Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, startRestartGroup, i3 & 14), str2, modifier3, m6049unboximpl, startRestartGroup, VectorPainter.$stable | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        j2 = m6049unboximpl;
                    } else {
                        modifier3 = companion;
                    }
                }
                m6049unboximpl = j2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                m3194Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, startRestartGroup, i3 & 14), str2, modifier3, m6049unboximpl, startRestartGroup, VectorPainter.$stable | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
                j2 = m6049unboximpl;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit Icon_ww6aTOc$lambda$0;
                        Icon_ww6aTOc$lambda$0 = IconKt.Icon_ww6aTOc$lambda$0(ImageVector.this, str, modifier2, j2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return Icon_ww6aTOc$lambda$0;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0079  */
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3193Iconww6aTOc(final ImageBitmap imageBitmap, final String str, Modifier modifier, long j, Composer composer, final int i, final int i2) {
        int i3;
        String str2;
        Modifier modifier2;
        long j2;
        final Modifier modifier3;
        final long j3;
        ScopeUpdateScope endRestartGroup;
        int i4;
        Modifier modifier4;
        long m6049unboximpl;
        boolean changed;
        Object rememberedValue;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-1092052280);
        ComposerKt.sourceInformation(startRestartGroup, "C(Icon)N(bitmap,contentDescription,modifier,tint:c#ui.graphics.Color)106@5114L42,107@5161L137:Icon.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(imageBitmap) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(str2) ? 32 : 16;
            }
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j2 = j;
                    if (startRestartGroup.changed(j2)) {
                        i5 = 2048;
                        i3 |= i5;
                    }
                } else {
                    j2 = j;
                }
                i5 = 1024;
                i3 |= i5;
            } else {
                j2 = j;
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "104@5083L7");
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i4 = i3;
                    modifier4 = modifier2;
                } else {
                    Modifier.Companion companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localContentColor);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        i4 = i3 & (-7169);
                        modifier4 = companion;
                        m6049unboximpl = ((Color) consume).m6049unboximpl();
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1092052280, i4, -1, "androidx.compose.material3.Icon (Icon.kt:105)");
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1490214990, "CC(remember):Icon.kt#9igjgp");
                        changed = startRestartGroup.changed(imageBitmap);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            BitmapPainter bitmapPainter = new BitmapPainter(imageBitmap, 0L, 0L, 6, null);
                            startRestartGroup.updateRememberedValue(bitmapPainter);
                            rememberedValue = bitmapPainter;
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        m3194Iconww6aTOc((BitmapPainter) rememberedValue, str2, modifier4, m6049unboximpl, startRestartGroup, i4 & 8176, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        j3 = m6049unboximpl;
                    } else {
                        i4 = i3;
                        modifier4 = companion;
                    }
                }
                m6049unboximpl = j2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1490214990, "CC(remember):Icon.kt#9igjgp");
                changed = startRestartGroup.changed(imageBitmap);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                BitmapPainter bitmapPainter2 = new BitmapPainter(imageBitmap, 0L, 0L, 6, null);
                startRestartGroup.updateRememberedValue(bitmapPainter2);
                rememberedValue = bitmapPainter2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                m3194Iconww6aTOc((BitmapPainter) rememberedValue, str2, modifier4, m6049unboximpl, startRestartGroup, i4 & 8176, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                j3 = m6049unboximpl;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j3 = j2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit Icon_ww6aTOc$lambda$2;
                        Icon_ww6aTOc$lambda$2 = IconKt.Icon_ww6aTOc$lambda$2(ImageBitmap.this, str, modifier3, j3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return Icon_ww6aTOc$lambda$2;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0077  */
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3194Iconww6aTOc(final Painter painter, final String str, Modifier modifier, long j, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j2;
        final Modifier modifier3;
        final long j3;
        ScopeUpdateScope endRestartGroup;
        long j4;
        Modifier modifier4;
        long j5;
        Object m6080tintxETnrds$default;
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(-2142239481);
        ComposerKt.sourceInformation(startRestartGroup, "C(Icon)N(painter,contentDescription,modifier,tint:c#ui.graphics.Color)144@6871L82,154@7215L217:Icon.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                j2 = j;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j2)) ? 2048 : 1024;
            } else {
                j2 = j;
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.startDefaults();
                ComposerKt.sourceInformation(startRestartGroup, "141@6828L7");
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    long j6 = j2;
                    modifier4 = modifier2;
                    j4 = j6;
                } else {
                    Modifier.Companion companion2 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localContentColor);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        j4 = ((Color) consume).m6049unboximpl();
                        i3 &= -7169;
                    } else {
                        j4 = j2;
                    }
                    modifier4 = companion2;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2142239481, i3, -1, "androidx.compose.material3.Icon (Icon.kt:142)");
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1402800263, "CC(remember):Icon.kt#9igjgp");
                boolean z = (((i3 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(j4)) || (i3 & 3072) == 2048;
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    if (Color.m6040equalsimpl0(j4, Color.INSTANCE.m6075getUnspecified0d7_KjU())) {
                        j5 = j4;
                        m6080tintxETnrds$default = null;
                    } else {
                        j5 = j4;
                        m6080tintxETnrds$default = ColorFilter.Companion.m6080tintxETnrds$default(ColorFilter.INSTANCE, j5, 0, 2, null);
                    }
                    startRestartGroup.updateRememberedValue(m6080tintxETnrds$default);
                } else {
                    j5 = j4;
                    m6080tintxETnrds$default = rememberedValue;
                }
                ColorFilter colorFilter = (ColorFilter) m6080tintxETnrds$default;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (str != null) {
                    startRestartGroup.startReplaceGroup(-536990979);
                    ComposerKt.sourceInformation(startRestartGroup, "147@7047L115");
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1402794598, "CC(remember):Icon.kt#9igjgp");
                    boolean z2 = (i3 & 112) == 32;
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function1() { // from class: androidx.compose.material3.IconKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit Icon_ww6aTOc$lambda$5$lambda$4;
                                Icon_ww6aTOc$lambda$5$lambda$4 = IconKt.Icon_ww6aTOc$lambda$5$lambda$4(str, (SemanticsPropertyReceiver) obj);
                                return Icon_ww6aTOc$lambda$5$lambda$4;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    companion = SemanticsModifierKt.semantics$default(companion3, false, (Function1) rememberedValue2, 1, null);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-536832197);
                    startRestartGroup.endReplaceGroup();
                    companion = Modifier.INSTANCE;
                }
                BoxKt.Box(PainterModifierKt.paint$default(defaultSizeFor(GraphicsLayerModifierKt.toolingGraphicsLayer(modifier4), painter), painter, false, null, ContentScale.INSTANCE.getFit(), 0.0f, colorFilter, 22, null).then(companion), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                j3 = j5;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j3 = j2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit Icon_ww6aTOc$lambda$6;
                        Icon_ww6aTOc$lambda$6 = IconKt.Icon_ww6aTOc$lambda$6(Painter.this, str, modifier3, j3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return Icon_ww6aTOc$lambda$6;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Icon_ww6aTOc$lambda$5$lambda$4(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.m7998setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m7983getImageo7Vup1c());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Icon(final Painter painter, final ColorProducer colorProducer, final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        String str2;
        final Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1755070997);
        ComposerKt.sourceInformation(startRestartGroup, "C(Icon)N(painter,tint,contentDescription,modifier)195@9038L311,190@8868L488:Icon.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(colorProducer) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(str2) ? 256 : 128;
            }
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                Modifier.Companion companion = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1755070997, i3, -1, "androidx.compose.material3.Icon (Icon.kt:189)");
                }
                long m6075getUnspecified0d7_KjU = Color.INSTANCE.m6075getUnspecified0d7_KjU();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1298908788, "CC(remember):Icon.kt#9igjgp");
                boolean changedInstance = startRestartGroup.changedInstance(colorProducer);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: androidx.compose.material3.IconKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            DrawResult Icon$lambda$12$lambda$11;
                            Icon$lambda$12$lambda$11 = IconKt.Icon$lambda$12$lambda$11(ColorProducer.this, (CacheDrawScope) obj);
                            return Icon$lambda$12$lambda$11;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                m3194Iconww6aTOc(painter, str2, DrawModifierKt.drawWithCache(companion, (Function1) rememberedValue), m6075getUnspecified0d7_KjU, startRestartGroup, (i3 & 14) | 3072 | ((i3 >> 3) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.IconKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit Icon$lambda$13;
                        Icon$lambda$13 = IconKt.Icon$lambda$13(Painter.this, colorProducer, str, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return Icon$lambda$13;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult Icon$lambda$12$lambda$11(ColorProducer colorProducer, CacheDrawScope cacheDrawScope) {
        final GraphicsLayer obtainGraphicsLayer = cacheDrawScope.obtainGraphicsLayer();
        CacheDrawScope.m5554recordTdoYBX4$default(cacheDrawScope, obtainGraphicsLayer, null, null, 0L, new Function1() { // from class: androidx.compose.material3.IconKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit Icon$lambda$12$lambda$11$lambda$9$lambda$7;
                Icon$lambda$12$lambda$11$lambda$9$lambda$7 = IconKt.Icon$lambda$12$lambda$11$lambda$9$lambda$7((ContentDrawScope) obj);
                return Icon$lambda$12$lambda$11$lambda$9$lambda$7;
            }
        }, 7, null);
        if (colorProducer != null) {
            obtainGraphicsLayer.setColorFilter(ColorFilter.Companion.m6080tintxETnrds$default(ColorFilter.INSTANCE, colorProducer.mo2305invoke0d7_KjU(), 0, 2, null));
        }
        return cacheDrawScope.onDrawWithContent(new Function1() { // from class: androidx.compose.material3.IconKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit Icon$lambda$12$lambda$11$lambda$10;
                Icon$lambda$12$lambda$11$lambda$10 = IconKt.Icon$lambda$12$lambda$11$lambda$10(GraphicsLayer.this, (ContentDrawScope) obj);
                return Icon$lambda$12$lambda$11$lambda$10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Icon$lambda$12$lambda$11$lambda$9$lambda$7(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Icon$lambda$12$lambda$11$lambda$10(GraphicsLayer graphicsLayer, ContentDrawScope contentDrawScope) {
        GraphicsLayerKt.drawLayer(contentDrawScope, graphicsLayer);
        return Unit.INSTANCE;
    }

    private static final Modifier defaultSizeFor(Modifier modifier, Painter painter) {
        Modifier.Companion companion;
        if (Size.m5836equalsimpl0(painter.getIntrinsicSize(), Size.INSTANCE.m5848getUnspecifiedNHjbRc()) || m3196isInfiniteuvyYCjk(painter.getIntrinsicSize())) {
            companion = DefaultIconSizeModifier;
        } else {
            companion = Modifier.INSTANCE;
        }
        return modifier.then(companion);
    }

    /* renamed from: isInfinite-uvyYCjk, reason: not valid java name */
    private static final boolean m3196isInfiniteuvyYCjk(long j) {
        return Float.isInfinite(Float.intBitsToFloat((int) (j >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
