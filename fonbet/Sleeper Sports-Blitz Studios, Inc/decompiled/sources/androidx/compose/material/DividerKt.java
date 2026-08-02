package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: Divider.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\u001a7\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Divider", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "thickness", "Landroidx/compose/ui/unit/Dp;", "startIndent", "Divider-oMI9zvI", "(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V", "DividerAlpha", "", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DividerKt {
    private static final float DividerAlpha = 0.12f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Divider_oMI9zvI$lambda$0(Modifier modifier, long j, float f, float f2, int i, int i2, Composer composer, int i3) {
        m2307DivideroMI9zvI(modifier, j, f, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006a  */
    /* renamed from: Divider-oMI9zvI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2307DivideroMI9zvI(Modifier modifier, long j, float f, float f2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j2;
        float f3;
        int i4;
        float f4;
        Modifier.Companion companion;
        final float f5;
        ScopeUpdateScope endRestartGroup;
        float m8798constructorimpl;
        Modifier.Companion m1161paddingqDBjuR0$default;
        float f6;
        Composer startRestartGroup = composer.startRestartGroup(-1249392198);
        ComposerKt.sourceInformation(startRestartGroup, "C(Divider)N(modifier,color:c#ui.graphics.Color,thickness:c#ui.unit.Dp,startIndent:c#ui.unit.Dp)63@2271L94:Divider.kt#jmzs0o");
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changed(j2)) ? 32 : 16;
        } else {
            j2 = j;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            f3 = f;
            i3 |= startRestartGroup.changed(f3) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f4 = f2;
                i3 |= startRestartGroup.changed(f4) ? 2048 : 1024;
                if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(startRestartGroup, "47@1841L6");
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        companion = modifier2;
                    } else {
                        companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 2) != 0) {
                            j2 = Color.m6038copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m2272getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                            i3 &= -113;
                        }
                        if (i6 != 0) {
                            f3 = Dp.m8798constructorimpl(1);
                        }
                        if (i4 != 0) {
                            m8798constructorimpl = Dp.m8798constructorimpl(0);
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1249392198, i3, -1, "androidx.compose.material.Divider (Divider.kt:50)");
                            }
                            if (m8798constructorimpl == 0.0f) {
                                m1161paddingqDBjuR0$default = PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, m8798constructorimpl, 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                m1161paddingqDBjuR0$default = Modifier.INSTANCE;
                            }
                            if (!Dp.m8803equalsimpl0(f3, Dp.INSTANCE.m8816getHairlineD9Ej5fM())) {
                                startRestartGroup.startReplaceGroup(-455967894);
                                ComposerKt.sourceInformation(startRestartGroup, "59@2198L7");
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                f6 = Dp.m8798constructorimpl(1.0f / ((Density) consume).getDensity());
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(-455901337);
                                startRestartGroup.endReplaceGroup();
                                f6 = f3;
                            }
                            BoxKt.Box(BackgroundKt.m582backgroundbw27NRU$default(SizeKt.m1195height3ABfNKs(SizeKt.fillMaxWidth$default(companion.then(m1161paddingqDBjuR0$default), 0.0f, 1, null), f6), j2, null, 2, null), startRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            f5 = m8798constructorimpl;
                        }
                    }
                    m8798constructorimpl = f4;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (m8798constructorimpl == 0.0f) {
                    }
                    if (!Dp.m8803equalsimpl0(f3, Dp.INSTANCE.m8816getHairlineD9Ej5fM())) {
                    }
                    BoxKt.Box(BackgroundKt.m582backgroundbw27NRU$default(SizeKt.m1195height3ABfNKs(SizeKt.fillMaxWidth$default(companion.then(m1161paddingqDBjuR0$default), 0.0f, 1, null), f6), j2, null, 2, null), startRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f5 = m8798constructorimpl;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    f5 = f4;
                }
                final float f7 = f3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier3 = companion;
                    final long j3 = j2;
                    endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material.DividerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit Divider_oMI9zvI$lambda$0;
                            Divider_oMI9zvI$lambda$0 = DividerKt.Divider_oMI9zvI$lambda$0(Modifier.this, j3, f7, f5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return Divider_oMI9zvI$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
            f4 = f2;
            if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            final float f72 = f3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f3 = f;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f4 = f2;
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        final float f722 = f3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
