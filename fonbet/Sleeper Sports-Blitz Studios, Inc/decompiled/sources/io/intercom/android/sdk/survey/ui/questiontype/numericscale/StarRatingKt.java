package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StarRating.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001a7\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\f\u001a\b\u0010\u000e\u001a\u00020\u000fH\u0000¨\u0006\u0010"}, d2 = {"StarRating", "", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "Landroidx/compose/ui/unit/Dp;", "strokeColor", "StarRating-tAjK0ZQ", "(Landroidx/compose/ui/Modifier;JFJLandroidx/compose/runtime/Composer;II)V", "SelectedStar", "(Landroidx/compose/runtime/Composer;I)V", "UnSelectedStar", "getStarPath", "Landroidx/compose/ui/graphics/Path;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StarRatingKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectedStar$lambda$4(int i, Composer composer, int i2) {
        SelectedStar(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StarRating_tAjK0ZQ$lambda$3(Modifier modifier, long j, float f, long j2, int i, int i2, Composer composer, int i3) {
        m12786StarRatingtAjK0ZQ(modifier, j, f, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnSelectedStar$lambda$5(int i, Composer composer, int i2) {
        UnSelectedStar(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0079  */
    /* renamed from: StarRating-tAjK0ZQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12786StarRatingtAjK0ZQ(Modifier modifier, long j, float f, long j2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        float f2;
        long j4;
        final Modifier.Companion companion;
        boolean z;
        Object rememberedValue;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1509251218);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
            j3 = j;
        } else {
            j3 = j;
            if ((i & 112) == 0) {
                i3 |= startRestartGroup.changed(j3) ? 32 : 16;
            }
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 256 : 128;
            if ((i & 7168) != 0) {
                j4 = j2;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j4)) ? 2048 : 1024;
            } else {
                j4 = j2;
            }
            if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i5 != 0) {
                        j3 = Color.INSTANCE.m6076getWhite0d7_KjU();
                    }
                    if (i6 != 0) {
                        f2 = Dp.m8798constructorimpl(1);
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        j4 = ColorExtensionsKt.m13181getAccessibleBorderColor8_81llA(j3);
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    companion = modifier2;
                }
                startRestartGroup.endDefaults();
                startRestartGroup.startReplaceGroup(-1036119505);
                z = ((((i3 & 7168) ^ 3072) <= 2048 && startRestartGroup.changed(j4)) || (i3 & 3072) == 2048) | ((i3 & 896) != 256) | ((i3 & 112) == 32);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final long j5 = j3;
                    final float f3 = f2;
                    final long j6 = j4;
                    rememberedValue = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.StarRatingKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit StarRating_tAjK0ZQ$lambda$2$lambda$1;
                            StarRating_tAjK0ZQ$lambda$2$lambda$1 = StarRatingKt.StarRating_tAjK0ZQ$lambda$2$lambda$1(j6, f3, j5, (DrawScope) obj);
                            return StarRating_tAjK0ZQ$lambda$2$lambda$1;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                CanvasKt.Canvas(companion, (Function1) rememberedValue, startRestartGroup, i3 & 14);
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
            }
            final long j7 = j3;
            final float f4 = f2;
            final long j8 = j4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.StarRatingKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit StarRating_tAjK0ZQ$lambda$3;
                        StarRating_tAjK0ZQ$lambda$3 = StarRatingKt.StarRating_tAjK0ZQ$lambda$3(Modifier.this, j7, f4, j8, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return StarRating_tAjK0ZQ$lambda$3;
                    }
                });
                return;
            }
            return;
        }
        f2 = f;
        if ((i & 7168) != 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceGroup(-1036119505);
        z = ((((i3 & 7168) ^ 3072) <= 2048 && startRestartGroup.changed(j4)) || (i3 & 3072) == 2048) | ((i3 & 896) != 256) | ((i3 & 112) == 32);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        final long j52 = j3;
        final float f32 = f2;
        final long j62 = j4;
        rememberedValue = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.StarRatingKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit StarRating_tAjK0ZQ$lambda$2$lambda$1;
                StarRating_tAjK0ZQ$lambda$2$lambda$1 = StarRatingKt.StarRating_tAjK0ZQ$lambda$2$lambda$1(j62, f32, j52, (DrawScope) obj);
                return StarRating_tAjK0ZQ$lambda$2$lambda$1;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        CanvasKt.Canvas(companion, (Function1) rememberedValue, startRestartGroup, i3 & 14);
        final long j72 = j3;
        final float f42 = f2;
        final long j82 = j4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StarRating_tAjK0ZQ$lambda$2$lambda$1(long j, float f, long j2, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float intBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo6618getSizeNHjbRc() >> 32)) / 33.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo6618getSizeNHjbRc() & 4294967295L)) / 32.0f;
        Path starPath = getStarPath();
        long m5763constructorimpl = Offset.m5763constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
        DrawContext drawContext = Canvas.getDrawContext();
        long mo6539getSizeNHjbRc = drawContext.mo6539getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo6546scale0AR0LA0(intBitsToFloat, intBitsToFloat2, m5763constructorimpl);
            DrawScope.m6608drawPathLG529CI$default(Canvas, starPath, j, 0.0f, new Stroke(Canvas.mo744toPx0680j_4(f), 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
            DrawScope.m6608drawPathLG529CI$default(Canvas, starPath, j2, 0.0f, Fill.INSTANCE, ColorFilter.INSTANCE.m6083tintxETnrds(j2, BlendMode.INSTANCE.m5978getSrcIn0nO6VwU()), 0, 36, null);
            drawContext.getCanvas().restore();
            drawContext.mo6540setSizeuvyYCjk(mo6539getSizeNHjbRc);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo6540setSizeuvyYCjk(mo6539getSizeNHjbRc);
            throw th;
        }
    }

    public static final void SelectedStar(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-596392123);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            float f = 44;
            m12786StarRatingtAjK0ZQ(SizeKt.m1195height3ABfNKs(SizeKt.m1214width3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f)), Dp.m8798constructorimpl(f)), Color.INSTANCE.m6077getYellow0d7_KjU(), 0.0f, 0L, startRestartGroup, 54, 12);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.StarRatingKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SelectedStar$lambda$4;
                    SelectedStar$lambda$4 = StarRatingKt.SelectedStar$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SelectedStar$lambda$4;
                }
            });
        }
    }

    public static final void UnSelectedStar(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(843558828);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            float f = 44;
            m12786StarRatingtAjK0ZQ(SizeKt.m1195height3ABfNKs(SizeKt.m1214width3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f)), Dp.m8798constructorimpl(f)), 0L, 0.0f, 0L, startRestartGroup, 6, 14);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.StarRatingKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit UnSelectedStar$lambda$5;
                    UnSelectedStar$lambda$5 = StarRatingKt.UnSelectedStar$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                    return UnSelectedStar$lambda$5;
                }
            });
        }
    }

    public static final Path getStarPath() {
        Path Path = AndroidPath_androidKt.Path();
        Path.moveTo(31.9f, 11.25f);
        Path.cubicTo(32.95f, 11.39f, 33.38f, 12.71f, 32.6f, 13.46f);
        Path.lineTo(25.33f, 20.47f);
        Path.lineTo(27.16f, 30.48f);
        Path.cubicTo(27.35f, 31.54f, 26.25f, 32.36f, 25.31f, 31.84f);
        Path.lineTo(16.5f, 26.98f);
        Path.lineTo(7.69f, 31.84f);
        Path.cubicTo(6.75f, 32.36f, 5.65f, 31.54f, 5.84f, 30.48f);
        Path.lineTo(7.67f, 20.47f);
        Path.lineTo(0.4f, 13.46f);
        Path.cubicTo(-0.38f, 12.71f, 0.05f, 11.39f, 1.1f, 11.25f);
        Path.lineTo(11.04f, 9.92f);
        Path.lineTo(15.36f, 0.73f);
        Path.cubicTo(15.82f, -0.24f, 17.18f, -0.24f, 17.64f, 0.73f);
        Path.lineTo(21.96f, 9.92f);
        Path.lineTo(31.9f, 11.25f);
        return Path;
    }
}
