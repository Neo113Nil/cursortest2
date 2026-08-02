package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProgressIndicator.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a3\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&\u001a;\u0010\u001e\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)\u001a3\u0010*\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010+\u001a\u00020#H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001a;\u0010*\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010+\u001a\u00020#H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/\u001a9\u00100\u001a\u00020\u001f*\u0002012\u0006\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u00104\u001a\u000205H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107\u001a9\u00108\u001a\u00020\u001f*\u0002012\u0006\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u00104\u001a\u000205H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u00107\u001aA\u0010:\u001a\u00020\u001f*\u0002012\u0006\u00102\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u00104\u001a\u000205H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<\u001a9\u0010=\u001a\u00020\u001f*\u0002012\u0006\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010A\u001a)\u0010B\u001a\u00020\u001f*\u0002012\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bC\u0010D\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0012\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u0013\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006E"}, d2 = {"BaseRotationAngle", "", "CircularEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "CircularIndicatorDiameter", "Landroidx/compose/ui/unit/Dp;", "F", "FirstLineHeadDelay", "", "FirstLineHeadDuration", "FirstLineHeadEasing", "FirstLineTailDelay", "FirstLineTailDuration", "FirstLineTailEasing", "HeadAndTailAnimationDuration", "HeadAndTailDelayDuration", "JumpRotationAngle", "LinearAnimationDuration", "LinearIndicatorHeight", "LinearIndicatorWidth", "RotationAngleOffset", "RotationDuration", "RotationsPerCycle", "SecondLineHeadDelay", "SecondLineHeadDuration", "SecondLineHeadEasing", "SecondLineTailDelay", "SecondLineTailDuration", "SecondLineTailEasing", "StartAngleOffset", "CircularProgressIndicator", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "progress", "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "drawCircularIndicator", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "startAngle", "sweep", "stroke", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "drawCircularIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawDeterminateCircularIndicator", "drawDeterminateCircularIndicator-42QJj7c", "drawIndeterminateCircularIndicator", "drawIndeterminateCircularIndicator-hrjfTZI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawLinearIndicator", "startFraction", "endFraction", "drawLinearIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJF)V", "drawLinearIndicatorBackground", "drawLinearIndicatorBackground-bw27NRU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JF)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressIndicatorKt {
    private static final float BaseRotationAngle = 286.0f;
    private static final int FirstLineHeadDelay = 0;
    private static final int FirstLineHeadDuration = 750;
    private static final int FirstLineTailDelay = 333;
    private static final int FirstLineTailDuration = 850;
    private static final int HeadAndTailAnimationDuration = 666;
    private static final int HeadAndTailDelayDuration = 666;
    private static final float JumpRotationAngle = 290.0f;
    private static final int LinearAnimationDuration = 1800;
    private static final float RotationAngleOffset = 216.0f;
    private static final int RotationDuration = 1332;
    private static final int RotationsPerCycle = 5;
    private static final int SecondLineHeadDelay = 1000;
    private static final int SecondLineHeadDuration = 567;
    private static final int SecondLineTailDelay = 1267;
    private static final int SecondLineTailDuration = 533;
    private static final float StartAngleOffset = -90.0f;
    private static final float LinearIndicatorHeight = ProgressIndicatorDefaults.INSTANCE.m1460getStrokeWidthD9Ej5fM();
    private static final float LinearIndicatorWidth = Dp.m4440constructorimpl(PsExtractor.VIDEO_STREAM_MASK);
    private static final float CircularIndicatorDiameter = Dp.m4440constructorimpl(40);
    private static final CubicBezierEasing FirstLineHeadEasing = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
    private static final CubicBezierEasing FirstLineTailEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
    private static final CubicBezierEasing SecondLineHeadEasing = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
    private static final CubicBezierEasing SecondLineTailEasing = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
    private static final CubicBezierEasing CircularEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0063  */
    /* renamed from: LinearProgressIndicator-eaDK9VM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1468LinearProgressIndicatoreaDK9VM(final float f, Modifier modifier, long j, long j2, Composer composer, final int i, final int i2) {
        float f2;
        int i3;
        Modifier modifier2;
        long j3;
        long j4;
        final Modifier.Companion companion;
        boolean changed;
        Object rememberedValue;
        ScopeUpdateScope endRestartGroup;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-850309746);
        ComposerKt.sourceInformation(startRestartGroup, "C(LinearProgressIndicator)P(3,2,1:c#ui.graphics.Color,0:c#ui.graphics.Color)74@3420L6,81@3655L175,77@3520L310:ProgressIndicator.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            f2 = f;
        } else if ((i & 14) == 0) {
            f2 = f;
            i3 = (startRestartGroup.changed(f2) ? 4 : 2) | i;
        } else {
            f2 = f;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    j3 = j;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                j3 = j;
            }
            if ((i & 7168) != 0) {
                if ((i2 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i4 = 2048;
                        i3 |= i4;
                    }
                } else {
                    j4 = j2;
                }
                i4 = 1024;
                i3 |= i4;
            } else {
                j4 = j2;
            }
            if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    long m1324getPrimary0d7_KjU = (i2 & 4) == 0 ? MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1324getPrimary0d7_KjU() : j3;
                    if ((i2 & 8) == 0) {
                        long j5 = m1324getPrimary0d7_KjU;
                        j3 = j5;
                        j4 = Color.m2111copywmQWz5c$default(j5, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        j3 = m1324getPrimary0d7_KjU;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                }
                startRestartGroup.endDefaults();
                Modifier m636sizeVpY3zN4 = SizeKt.m636sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(companion, f2, null, 0, 6, null), LinearIndicatorWidth, LinearIndicatorHeight);
                Color m2102boximpl = Color.m2102boximpl(j4);
                Float valueOf = Float.valueOf(f);
                Color m2102boximpl2 = Color.m2102boximpl(j3);
                startRestartGroup.startReplaceableGroup(1618982084);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2,3):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(m2102boximpl) | startRestartGroup.changed(valueOf) | startRestartGroup.changed(m2102boximpl2);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final long j6 = j3;
                    final long j7 = j4;
                    rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope Canvas) {
                            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                            float m1937getHeightimpl = Size.m1937getHeightimpl(Canvas.mo2662getSizeNHjbRc());
                            ProgressIndicatorKt.m1489drawLinearIndicatorBackgroundbw27NRU(Canvas, j7, m1937getHeightimpl);
                            ProgressIndicatorKt.m1488drawLinearIndicator42QJj7c(Canvas, 0.0f, f, j6, m1937getHeightimpl);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(m636sizeVpY3zN4, (Function1) rememberedValue, startRestartGroup, 0);
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
            }
            final long j8 = j3;
            final long j9 = j4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    ProgressIndicatorKt.m1468LinearProgressIndicatoreaDK9VM(f, companion, j8, j9, composer2, i | 1, i2);
                }
            });
            return;
        }
        modifier2 = modifier;
        if ((i & 896) != 0) {
        }
        if ((i & 7168) != 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 == 0) {
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        startRestartGroup.endDefaults();
        Modifier m636sizeVpY3zN42 = SizeKt.m636sizeVpY3zN4(ProgressSemanticsKt.progressSemantics$default(companion, f2, null, 0, 6, null), LinearIndicatorWidth, LinearIndicatorHeight);
        Color m2102boximpl3 = Color.m2102boximpl(j4);
        Float valueOf2 = Float.valueOf(f);
        Color m2102boximpl22 = Color.m2102boximpl(j3);
        startRestartGroup.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2,3):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(m2102boximpl3) | startRestartGroup.changed(valueOf2) | startRestartGroup.changed(m2102boximpl22);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        final long j62 = j3;
        final long j72 = j4;
        rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope Canvas) {
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                float m1937getHeightimpl = Size.m1937getHeightimpl(Canvas.mo2662getSizeNHjbRc());
                ProgressIndicatorKt.m1489drawLinearIndicatorBackgroundbw27NRU(Canvas, j72, m1937getHeightimpl);
                ProgressIndicatorKt.m1488drawLinearIndicator42QJj7c(Canvas, 0.0f, f, j62, m1937getHeightimpl);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        CanvasKt.Canvas(m636sizeVpY3zN42, (Function1) rememberedValue, startRestartGroup, 0);
        final long j82 = j3;
        final long j92 = j4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01dd A[LOOP:0: B:38:0x01db->B:39:0x01dd, LOOP_END] */
    /* renamed from: LinearProgressIndicator-RIQooxk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1467LinearProgressIndicatorRIQooxk(Modifier modifier, long j, long j2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j3;
        long j4;
        final Modifier.Companion companion;
        final long j5;
        final long m2111copywmQWz5c$default;
        int i4;
        boolean z;
        Object rememberedValue;
        final long j6;
        final long j7;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-819397058);
        ComposerKt.sourceInformation(startRestartGroup, "C(LinearProgressIndicator)P(2,1:c#ui.graphics.Color,0:c#ui.graphics.Color)102@4593L6,105@4718L28,109@5000L319,120@5364L319,131@5729L323,142@6098L323,157@6553L557,153@6426L684:ProgressIndicator.kt#jmzs0o");
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                j3 = j;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            j3 = j;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i5 = 256;
                    i3 |= i5;
                }
            } else {
                j4 = j2;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            j4 = j2;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                long m1324getPrimary0d7_KjU = (i2 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1324getPrimary0d7_KjU() : j3;
                if ((i2 & 4) != 0) {
                    j5 = m1324getPrimary0d7_KjU;
                    m2111copywmQWz5c$default = Color.m2111copywmQWz5c$default(m1324getPrimary0d7_KjU, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    startRestartGroup.endDefaults();
                    InfiniteTransition rememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(startRestartGroup, 0);
                    final State animateFloat = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m150infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                            CubicBezierEasing cubicBezierEasing;
                            Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                            keyframes.setDurationMillis(1800);
                            KeyframesSpec.KeyframeEntity<Float> at = keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 0);
                            cubicBezierEasing = ProgressIndicatorKt.FirstLineHeadEasing;
                            keyframes.with(at, cubicBezierEasing);
                            keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
                        }
                    }), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
                    final State animateFloat2 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m150infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                            CubicBezierEasing cubicBezierEasing;
                            Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                            keyframes.setDurationMillis(1800);
                            KeyframesSpec.KeyframeEntity<Float> at = keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 333);
                            cubicBezierEasing = ProgressIndicatorKt.FirstLineTailEasing;
                            keyframes.with(at, cubicBezierEasing);
                            keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), 1183);
                        }
                    }), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
                    final State animateFloat3 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m150infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                            CubicBezierEasing cubicBezierEasing;
                            Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                            keyframes.setDurationMillis(1800);
                            KeyframesSpec.KeyframeEntity<Float> at = keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 1000);
                            cubicBezierEasing = ProgressIndicatorKt.SecondLineHeadEasing;
                            keyframes.with(at, cubicBezierEasing);
                            keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), 1567);
                        }
                    }), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
                    final State animateFloat4 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m150infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                            CubicBezierEasing cubicBezierEasing;
                            Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                            keyframes.setDurationMillis(1800);
                            KeyframesSpec.KeyframeEntity<Float> at = keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 1267);
                            cubicBezierEasing = ProgressIndicatorKt.SecondLineTailEasing;
                            keyframes.with(at, cubicBezierEasing);
                            keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), 1800);
                        }
                    }), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
                    Modifier m636sizeVpY3zN4 = SizeKt.m636sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(companion), LinearIndicatorWidth, LinearIndicatorHeight);
                    Object[] objArr = {Color.m2102boximpl(m2111copywmQWz5c$default), animateFloat, animateFloat2, Color.m2102boximpl(j5), animateFloat3, animateFloat4};
                    startRestartGroup.startReplaceableGroup(-568225417);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                    z = false;
                    for (i4 = 0; i4 < 6; i4++) {
                        z |= startRestartGroup.changed(objArr[i4]);
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope Canvas) {
                                float m1469LinearProgressIndicator_RIQooxk$lambda1;
                                float m1470LinearProgressIndicator_RIQooxk$lambda2;
                                DrawScope drawScope;
                                float m1471LinearProgressIndicator_RIQooxk$lambda3;
                                float m1472LinearProgressIndicator_RIQooxk$lambda4;
                                float m1471LinearProgressIndicator_RIQooxk$lambda32;
                                float m1472LinearProgressIndicator_RIQooxk$lambda42;
                                float m1469LinearProgressIndicator_RIQooxk$lambda12;
                                float m1470LinearProgressIndicator_RIQooxk$lambda22;
                                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                float m1937getHeightimpl = Size.m1937getHeightimpl(Canvas.mo2662getSizeNHjbRc());
                                ProgressIndicatorKt.m1489drawLinearIndicatorBackgroundbw27NRU(Canvas, m2111copywmQWz5c$default, m1937getHeightimpl);
                                m1469LinearProgressIndicator_RIQooxk$lambda1 = ProgressIndicatorKt.m1469LinearProgressIndicator_RIQooxk$lambda1(animateFloat);
                                m1470LinearProgressIndicator_RIQooxk$lambda2 = ProgressIndicatorKt.m1470LinearProgressIndicator_RIQooxk$lambda2(animateFloat2);
                                if (m1469LinearProgressIndicator_RIQooxk$lambda1 - m1470LinearProgressIndicator_RIQooxk$lambda2 > 0.0f) {
                                    m1469LinearProgressIndicator_RIQooxk$lambda12 = ProgressIndicatorKt.m1469LinearProgressIndicator_RIQooxk$lambda1(animateFloat);
                                    m1470LinearProgressIndicator_RIQooxk$lambda22 = ProgressIndicatorKt.m1470LinearProgressIndicator_RIQooxk$lambda2(animateFloat2);
                                    drawScope = Canvas;
                                    ProgressIndicatorKt.m1488drawLinearIndicator42QJj7c(drawScope, m1469LinearProgressIndicator_RIQooxk$lambda12, m1470LinearProgressIndicator_RIQooxk$lambda22, j5, m1937getHeightimpl);
                                } else {
                                    drawScope = Canvas;
                                }
                                m1471LinearProgressIndicator_RIQooxk$lambda3 = ProgressIndicatorKt.m1471LinearProgressIndicator_RIQooxk$lambda3(animateFloat3);
                                m1472LinearProgressIndicator_RIQooxk$lambda4 = ProgressIndicatorKt.m1472LinearProgressIndicator_RIQooxk$lambda4(animateFloat4);
                                if (m1471LinearProgressIndicator_RIQooxk$lambda3 - m1472LinearProgressIndicator_RIQooxk$lambda4 > 0.0f) {
                                    m1471LinearProgressIndicator_RIQooxk$lambda32 = ProgressIndicatorKt.m1471LinearProgressIndicator_RIQooxk$lambda3(animateFloat3);
                                    m1472LinearProgressIndicator_RIQooxk$lambda42 = ProgressIndicatorKt.m1472LinearProgressIndicator_RIQooxk$lambda4(animateFloat4);
                                    ProgressIndicatorKt.m1488drawLinearIndicator42QJj7c(drawScope, m1471LinearProgressIndicator_RIQooxk$lambda32, m1472LinearProgressIndicator_RIQooxk$lambda42, j5, m1937getHeightimpl);
                                }
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(m636sizeVpY3zN4, (Function1) rememberedValue, startRestartGroup, 0);
                    j6 = m2111copywmQWz5c$default;
                    j7 = j5;
                } else {
                    j5 = m1324getPrimary0d7_KjU;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
                j5 = j3;
            }
            m2111copywmQWz5c$default = j4;
            startRestartGroup.endDefaults();
            InfiniteTransition rememberInfiniteTransition2 = InfiniteTransitionKt.rememberInfiniteTransition(startRestartGroup, 0);
            final State<Float> animateFloat5 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m150infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    CubicBezierEasing cubicBezierEasing;
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1800);
                    KeyframesSpec.KeyframeEntity<Float> at = keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 0);
                    cubicBezierEasing = ProgressIndicatorKt.FirstLineHeadEasing;
                    keyframes.with(at, cubicBezierEasing);
                    keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS);
                }
            }), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
            final State<Float> animateFloat22 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m150infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    CubicBezierEasing cubicBezierEasing;
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1800);
                    KeyframesSpec.KeyframeEntity<Float> at = keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 333);
                    cubicBezierEasing = ProgressIndicatorKt.FirstLineTailEasing;
                    keyframes.with(at, cubicBezierEasing);
                    keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), 1183);
                }
            }), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
            final State<Float> animateFloat32 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m150infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    CubicBezierEasing cubicBezierEasing;
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1800);
                    KeyframesSpec.KeyframeEntity<Float> at = keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 1000);
                    cubicBezierEasing = ProgressIndicatorKt.SecondLineHeadEasing;
                    keyframes.with(at, cubicBezierEasing);
                    keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), 1567);
                }
            }), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
            final State<Float> animateFloat42 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m150infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                    CubicBezierEasing cubicBezierEasing;
                    Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                    keyframes.setDurationMillis(1800);
                    KeyframesSpec.KeyframeEntity<Float> at = keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 1267);
                    cubicBezierEasing = ProgressIndicatorKt.SecondLineTailEasing;
                    keyframes.with(at, cubicBezierEasing);
                    keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(1.0f), 1800);
                }
            }), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
            Modifier m636sizeVpY3zN42 = SizeKt.m636sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(companion), LinearIndicatorWidth, LinearIndicatorHeight);
            Object[] objArr2 = {Color.m2102boximpl(m2111copywmQWz5c$default), animateFloat5, animateFloat22, Color.m2102boximpl(j5), animateFloat32, animateFloat42};
            startRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            z = false;
            while (i4 < 6) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DrawScope Canvas) {
                    float m1469LinearProgressIndicator_RIQooxk$lambda1;
                    float m1470LinearProgressIndicator_RIQooxk$lambda2;
                    DrawScope drawScope;
                    float m1471LinearProgressIndicator_RIQooxk$lambda3;
                    float m1472LinearProgressIndicator_RIQooxk$lambda4;
                    float m1471LinearProgressIndicator_RIQooxk$lambda32;
                    float m1472LinearProgressIndicator_RIQooxk$lambda42;
                    float m1469LinearProgressIndicator_RIQooxk$lambda12;
                    float m1470LinearProgressIndicator_RIQooxk$lambda22;
                    Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                    float m1937getHeightimpl = Size.m1937getHeightimpl(Canvas.mo2662getSizeNHjbRc());
                    ProgressIndicatorKt.m1489drawLinearIndicatorBackgroundbw27NRU(Canvas, m2111copywmQWz5c$default, m1937getHeightimpl);
                    m1469LinearProgressIndicator_RIQooxk$lambda1 = ProgressIndicatorKt.m1469LinearProgressIndicator_RIQooxk$lambda1(animateFloat5);
                    m1470LinearProgressIndicator_RIQooxk$lambda2 = ProgressIndicatorKt.m1470LinearProgressIndicator_RIQooxk$lambda2(animateFloat22);
                    if (m1469LinearProgressIndicator_RIQooxk$lambda1 - m1470LinearProgressIndicator_RIQooxk$lambda2 > 0.0f) {
                        m1469LinearProgressIndicator_RIQooxk$lambda12 = ProgressIndicatorKt.m1469LinearProgressIndicator_RIQooxk$lambda1(animateFloat5);
                        m1470LinearProgressIndicator_RIQooxk$lambda22 = ProgressIndicatorKt.m1470LinearProgressIndicator_RIQooxk$lambda2(animateFloat22);
                        drawScope = Canvas;
                        ProgressIndicatorKt.m1488drawLinearIndicator42QJj7c(drawScope, m1469LinearProgressIndicator_RIQooxk$lambda12, m1470LinearProgressIndicator_RIQooxk$lambda22, j5, m1937getHeightimpl);
                    } else {
                        drawScope = Canvas;
                    }
                    m1471LinearProgressIndicator_RIQooxk$lambda3 = ProgressIndicatorKt.m1471LinearProgressIndicator_RIQooxk$lambda3(animateFloat32);
                    m1472LinearProgressIndicator_RIQooxk$lambda4 = ProgressIndicatorKt.m1472LinearProgressIndicator_RIQooxk$lambda4(animateFloat42);
                    if (m1471LinearProgressIndicator_RIQooxk$lambda3 - m1472LinearProgressIndicator_RIQooxk$lambda4 > 0.0f) {
                        m1471LinearProgressIndicator_RIQooxk$lambda32 = ProgressIndicatorKt.m1471LinearProgressIndicator_RIQooxk$lambda3(animateFloat32);
                        m1472LinearProgressIndicator_RIQooxk$lambda42 = ProgressIndicatorKt.m1472LinearProgressIndicator_RIQooxk$lambda4(animateFloat42);
                        ProgressIndicatorKt.m1488drawLinearIndicator42QJj7c(drawScope, m1471LinearProgressIndicator_RIQooxk$lambda32, m1472LinearProgressIndicator_RIQooxk$lambda42, j5, m1937getHeightimpl);
                    }
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(m636sizeVpY3zN42, (Function1) rememberedValue, startRestartGroup, 0);
            j6 = m2111copywmQWz5c$default;
            j7 = j5;
        } else {
            startRestartGroup.skipToGroupEnd();
            companion = modifier2;
            j7 = j3;
            j6 = j4;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$LinearProgressIndicator$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i8) {
                ProgressIndicatorKt.m1467LinearProgressIndicatorRIQooxk(Modifier.this, j7, j6, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicator-42QJj7c, reason: not valid java name */
    public static final void m1488drawLinearIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, float f3) {
        float m1940getWidthimpl = Size.m1940getWidthimpl(drawScope.mo2662getSizeNHjbRc());
        float m1937getHeightimpl = Size.m1937getHeightimpl(drawScope.mo2662getSizeNHjbRc()) / 2;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        DrawScope.m2649drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset((z ? f : 1.0f - f2) * m1940getWidthimpl, m1937getHeightimpl), OffsetKt.Offset((z ? f2 : 1.0f - f) * m1940getWidthimpl, m1937getHeightimpl), f3, 0, null, 0.0f, null, 0, 496, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicatorBackground-bw27NRU, reason: not valid java name */
    public static final void m1489drawLinearIndicatorBackgroundbw27NRU(DrawScope drawScope, long j, float f) {
        m1488drawLinearIndicator42QJj7c(drawScope, 0.0f, 1.0f, j, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005e  */
    /* renamed from: CircularProgressIndicator-MBs18nI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1461CircularProgressIndicatorMBs18nI(final float f, Modifier modifier, long j, float f2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j2;
        int i4;
        float f3;
        Modifier.Companion companion;
        float f4;
        final long j3;
        final Modifier modifier3;
        final long j4;
        final float f5;
        ScopeUpdateScope endRestartGroup;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-409649739);
        ComposerKt.sourceInformation(startRestartGroup, "C(CircularProgressIndicator)P(2,1,0:c#ui.graphics.Color,3:c#ui.unit.Dp)226@9099L6,*229@9214L7,232@9300L296:ProgressIndicator.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    j2 = j;
                    if (startRestartGroup.changed(j2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    j2 = j;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                j2 = j;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                f3 = f2;
                i3 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                        long m1324getPrimary0d7_KjU = (i2 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1324getPrimary0d7_KjU() : j2;
                        if (i4 != 0) {
                            j3 = m1324getPrimary0d7_KjU;
                            f4 = ProgressIndicatorDefaults.INSTANCE.m1460getStrokeWidthD9Ej5fM();
                        } else {
                            f4 = f3;
                            j3 = m1324getPrimary0d7_KjU;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                        f4 = f3;
                        j3 = j2;
                    }
                    startRestartGroup.endDefaults();
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Stroke stroke = new Stroke(((Density) consume).mo336toPx0680j_4(f4), 0.0f, StrokeCap.INSTANCE.m2465getButtKaPHkGw(), 0, null, 26, null);
                    CanvasKt.Canvas(SizeKt.m634size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(companion, f, null, 0, 6, null), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope Canvas) {
                            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                            ProgressIndicatorKt.m1486drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f * 360.0f, j3, stroke);
                        }
                    }, startRestartGroup, 0);
                    modifier3 = companion;
                    j4 = j3;
                    f5 = f4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    j4 = j2;
                    f5 = f3;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        ProgressIndicatorKt.m1461CircularProgressIndicatorMBs18nI(f, modifier3, j4, f5, composer2, i | 1, i2);
                    }
                });
                return;
            }
            f3 = f2;
            if ((i3 & 5851) == 1170) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            startRestartGroup.endDefaults();
            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localDensity2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Stroke stroke2 = new Stroke(((Density) consume2).mo336toPx0680j_4(f4), 0.0f, StrokeCap.INSTANCE.m2465getButtKaPHkGw(), 0, null, 26, null);
            CanvasKt.Canvas(SizeKt.m634size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(companion, f, null, 0, 6, null), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DrawScope Canvas) {
                    Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                    ProgressIndicatorKt.m1486drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f * 360.0f, j3, stroke2);
                }
            }, startRestartGroup, 0);
            modifier3 = companion;
            j4 = j3;
            f5 = f4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 896) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f3 = f2;
        if ((i3 & 5851) == 1170) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        startRestartGroup.endDefaults();
        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localDensity22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Stroke stroke22 = new Stroke(((Density) consume22).mo336toPx0680j_4(f4), 0.0f, StrokeCap.INSTANCE.m2465getButtKaPHkGw(), 0, null, 26, null);
        CanvasKt.Canvas(SizeKt.m634size3ABfNKs(ProgressSemanticsKt.progressSemantics$default(companion, f, null, 0, 6, null), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope Canvas) {
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                ProgressIndicatorKt.m1486drawDeterminateCircularIndicator42QJj7c(Canvas, 270.0f, f * 360.0f, j3, stroke22);
            }
        }, startRestartGroup, 0);
        modifier3 = companion;
        j4 = j3;
        f5 = f4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    /* renamed from: CircularProgressIndicator-aM-cp0Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1462CircularProgressIndicatoraMcp0Q(Modifier modifier, long j, float f, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long j2;
        float f2;
        Modifier.Companion companion;
        final long j3;
        final float m1460getStrokeWidthD9Ej5fM;
        final Modifier modifier3;
        final long j4;
        Composer startRestartGroup = composer.startRestartGroup(-392089979);
        ComposerKt.sourceInformation(startRestartGroup, "C(CircularProgressIndicator)P(1,0:c#ui.graphics.Color,2:c#ui.unit.Dp)257@10275L6,*260@10390L7,264@10496L28,266@10654L278,278@11047L230,289@11395L345,301@11775L354,312@12134L582:ProgressIndicator.kt#jmzs0o");
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
        if ((i & 112) == 0) {
            j2 = j;
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changed(j2)) ? 32 : 16;
        } else {
            j2 = j;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= RendererCapabilities.MODE_SUPPORT_MASK;
        } else if ((i & 896) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 256 : 128;
            if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    long m1324getPrimary0d7_KjU = (i2 & 2) == 0 ? MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1324getPrimary0d7_KjU() : j2;
                    if (i5 == 0) {
                        m1460getStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m1460getStrokeWidthD9Ej5fM();
                        j3 = m1324getPrimary0d7_KjU;
                        startRestartGroup.endDefaults();
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final Stroke stroke = new Stroke(((Density) consume).mo336toPx0680j_4(m1460getStrokeWidthD9Ej5fM), 0.0f, StrokeCap.INSTANCE.m2467getSquareKaPHkGw(), 0, null, 26, null);
                        InfiniteTransition rememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(startRestartGroup, 0);
                        final State animateValue = InfiniteTransitionKt.animateValue(rememberInfiniteTransition, 0, 5, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), AnimationSpecKt.m150infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 4528 | (InfiniteRepeatableSpec.$stable << 12));
                        startRestartGroup = startRestartGroup;
                        final State animateFloat = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, BaseRotationAngle, AnimationSpecKt.m150infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
                        final State animateFloat2 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, JumpRotationAngle, AnimationSpecKt.m150infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                invoke2(keyframesSpecConfig);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                                CubicBezierEasing cubicBezierEasing;
                                Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                                keyframes.setDurationMillis(1332);
                                KeyframesSpec.KeyframeEntity<Float> at = keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 0);
                                cubicBezierEasing = ProgressIndicatorKt.CircularEasing;
                                keyframes.with(at, cubicBezierEasing);
                                keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(290.0f), 666);
                            }
                        }), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
                        final State animateFloat3 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, JumpRotationAngle, AnimationSpecKt.m150infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                invoke2(keyframesSpecConfig);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                                CubicBezierEasing cubicBezierEasing;
                                Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                                keyframes.setDurationMillis(1332);
                                KeyframesSpec.KeyframeEntity<Float> at = keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 666);
                                cubicBezierEasing = ProgressIndicatorKt.CircularEasing;
                                keyframes.with(at, cubicBezierEasing);
                                keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(290.0f), keyframes.getDurationMillis());
                            }
                        }), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
                        final float f3 = m1460getStrokeWidthD9Ej5fM;
                        CanvasKt.Canvas(SizeKt.m634size3ABfNKs(ProgressSemanticsKt.progressSemantics(companion), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope Canvas) {
                                int m1465CircularProgressIndicator_aM_cp0Q$lambda8;
                                float m1463CircularProgressIndicator_aM_cp0Q$lambda10;
                                float m1464CircularProgressIndicator_aM_cp0Q$lambda11;
                                float m1466CircularProgressIndicator_aM_cp0Q$lambda9;
                                float m1464CircularProgressIndicator_aM_cp0Q$lambda112;
                                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                m1465CircularProgressIndicator_aM_cp0Q$lambda8 = ProgressIndicatorKt.m1465CircularProgressIndicator_aM_cp0Q$lambda8(animateValue);
                                m1463CircularProgressIndicator_aM_cp0Q$lambda10 = ProgressIndicatorKt.m1463CircularProgressIndicator_aM_cp0Q$lambda10(animateFloat2);
                                m1464CircularProgressIndicator_aM_cp0Q$lambda11 = ProgressIndicatorKt.m1464CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat3);
                                float abs = Math.abs(m1463CircularProgressIndicator_aM_cp0Q$lambda10 - m1464CircularProgressIndicator_aM_cp0Q$lambda11);
                                m1466CircularProgressIndicator_aM_cp0Q$lambda9 = ProgressIndicatorKt.m1466CircularProgressIndicator_aM_cp0Q$lambda9(animateFloat);
                                float f4 = (((m1465CircularProgressIndicator_aM_cp0Q$lambda8 * 216.0f) % 360.0f) - 90.0f) + m1466CircularProgressIndicator_aM_cp0Q$lambda9;
                                m1464CircularProgressIndicator_aM_cp0Q$lambda112 = ProgressIndicatorKt.m1464CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat3);
                                ProgressIndicatorKt.m1487drawIndeterminateCircularIndicatorhrjfTZI(Canvas, m1464CircularProgressIndicator_aM_cp0Q$lambda112 + f4, f3, abs, j3, stroke);
                            }
                        }, startRestartGroup, 0);
                        modifier3 = companion;
                        j4 = j3;
                    } else {
                        j3 = m1324getPrimary0d7_KjU;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    j3 = j2;
                }
                m1460getStrokeWidthD9Ej5fM = f2;
                startRestartGroup.endDefaults();
                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localDensity2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Stroke stroke2 = new Stroke(((Density) consume2).mo336toPx0680j_4(m1460getStrokeWidthD9Ej5fM), 0.0f, StrokeCap.INSTANCE.m2467getSquareKaPHkGw(), 0, null, 26, null);
                InfiniteTransition rememberInfiniteTransition2 = InfiniteTransitionKt.rememberInfiniteTransition(startRestartGroup, 0);
                final State<Integer> animateValue2 = InfiniteTransitionKt.animateValue(rememberInfiniteTransition2, 0, 5, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), AnimationSpecKt.m150infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 4528 | (InfiniteRepeatableSpec.$stable << 12));
                startRestartGroup = startRestartGroup;
                final State<Float> animateFloat4 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, BaseRotationAngle, AnimationSpecKt.m150infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
                final State<Float> animateFloat22 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, JumpRotationAngle, AnimationSpecKt.m150infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$endAngle$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                        CubicBezierEasing cubicBezierEasing;
                        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                        keyframes.setDurationMillis(1332);
                        KeyframesSpec.KeyframeEntity<Float> at = keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 0);
                        cubicBezierEasing = ProgressIndicatorKt.CircularEasing;
                        keyframes.with(at, cubicBezierEasing);
                        keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(290.0f), 666);
                    }
                }), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
                final State<Float> animateFloat32 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition2, 0.0f, JumpRotationAngle, AnimationSpecKt.m150infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$startAngle$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframes) {
                        CubicBezierEasing cubicBezierEasing;
                        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
                        keyframes.setDurationMillis(1332);
                        KeyframesSpec.KeyframeEntity<Float> at = keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(0.0f), 666);
                        cubicBezierEasing = ProgressIndicatorKt.CircularEasing;
                        keyframes.with(at, cubicBezierEasing);
                        keyframes.at((KeyframesSpec.KeyframesSpecConfig<Float>) Float.valueOf(290.0f), keyframes.getDurationMillis());
                    }
                }), null, 0L, 6, null), startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9));
                final float f32 = m1460getStrokeWidthD9Ej5fM;
                CanvasKt.Canvas(SizeKt.m634size3ABfNKs(ProgressSemanticsKt.progressSemantics(companion), CircularIndicatorDiameter), new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope Canvas) {
                        int m1465CircularProgressIndicator_aM_cp0Q$lambda8;
                        float m1463CircularProgressIndicator_aM_cp0Q$lambda10;
                        float m1464CircularProgressIndicator_aM_cp0Q$lambda11;
                        float m1466CircularProgressIndicator_aM_cp0Q$lambda9;
                        float m1464CircularProgressIndicator_aM_cp0Q$lambda112;
                        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                        m1465CircularProgressIndicator_aM_cp0Q$lambda8 = ProgressIndicatorKt.m1465CircularProgressIndicator_aM_cp0Q$lambda8(animateValue2);
                        m1463CircularProgressIndicator_aM_cp0Q$lambda10 = ProgressIndicatorKt.m1463CircularProgressIndicator_aM_cp0Q$lambda10(animateFloat22);
                        m1464CircularProgressIndicator_aM_cp0Q$lambda11 = ProgressIndicatorKt.m1464CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat32);
                        float abs = Math.abs(m1463CircularProgressIndicator_aM_cp0Q$lambda10 - m1464CircularProgressIndicator_aM_cp0Q$lambda11);
                        m1466CircularProgressIndicator_aM_cp0Q$lambda9 = ProgressIndicatorKt.m1466CircularProgressIndicator_aM_cp0Q$lambda9(animateFloat4);
                        float f4 = (((m1465CircularProgressIndicator_aM_cp0Q$lambda8 * 216.0f) % 360.0f) - 90.0f) + m1466CircularProgressIndicator_aM_cp0Q$lambda9;
                        m1464CircularProgressIndicator_aM_cp0Q$lambda112 = ProgressIndicatorKt.m1464CircularProgressIndicator_aM_cp0Q$lambda11(animateFloat32);
                        ProgressIndicatorKt.m1487drawIndeterminateCircularIndicatorhrjfTZI(Canvas, m1464CircularProgressIndicator_aM_cp0Q$lambda112 + f4, f32, abs, j3, stroke2);
                    }
                }, startRestartGroup, 0);
                modifier3 = companion;
                j4 = j3;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j4 = j2;
                m1460getStrokeWidthD9Ej5fM = f2;
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                return;
            }
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ProgressIndicatorKt$CircularProgressIndicator$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    ProgressIndicatorKt.m1462CircularProgressIndicatoraMcp0Q(Modifier.this, j4, m1460getStrokeWidthD9Ej5fM, composer2, i | 1, i2);
                }
            });
            return;
        }
        f2 = f;
        if ((i3 & 731) == 146) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 2) == 0) {
        }
        if (i5 == 0) {
        }
    }

    /* renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m1485drawCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        float f3 = 2;
        float width = stroke.getWidth() / f3;
        float m1940getWidthimpl = Size.m1940getWidthimpl(drawScope.mo2662getSizeNHjbRc()) - (f3 * width);
        DrawScope.m2642drawArcyD3GUKo$default(drawScope, j, f, f2, false, OffsetKt.Offset(width, width), androidx.compose.ui.geometry.SizeKt.Size(m1940getWidthimpl, m1940getWidthimpl), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawDeterminateCircularIndicator-42QJj7c, reason: not valid java name */
    public static final void m1486drawDeterminateCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        m1485drawCircularIndicator42QJj7c(drawScope, f, f2, j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    public static final void m1487drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f, float f2, float f3, long j, Stroke stroke) {
        m1485drawCircularIndicator42QJj7c(drawScope, f + (((f2 / Dp.m4440constructorimpl(CircularIndicatorDiameter / 2)) * 57.29578f) / 2.0f), Math.max(f3, 0.1f), j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LinearProgressIndicator_RIQooxk$lambda-1, reason: not valid java name */
    public static final float m1469LinearProgressIndicator_RIQooxk$lambda1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LinearProgressIndicator_RIQooxk$lambda-2, reason: not valid java name */
    public static final float m1470LinearProgressIndicator_RIQooxk$lambda2(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LinearProgressIndicator_RIQooxk$lambda-3, reason: not valid java name */
    public static final float m1471LinearProgressIndicator_RIQooxk$lambda3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LinearProgressIndicator_RIQooxk$lambda-4, reason: not valid java name */
    public static final float m1472LinearProgressIndicator_RIQooxk$lambda4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularProgressIndicator_aM_cp0Q$lambda-8, reason: not valid java name */
    public static final int m1465CircularProgressIndicator_aM_cp0Q$lambda8(State<Integer> state) {
        return state.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularProgressIndicator_aM_cp0Q$lambda-9, reason: not valid java name */
    public static final float m1466CircularProgressIndicator_aM_cp0Q$lambda9(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularProgressIndicator_aM_cp0Q$lambda-10, reason: not valid java name */
    public static final float m1463CircularProgressIndicator_aM_cp0Q$lambda10(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularProgressIndicator_aM_cp0Q$lambda-11, reason: not valid java name */
    public static final float m1464CircularProgressIndicator_aM_cp0Q$lambda11(State<Float> state) {
        return state.getValue().floatValue();
    }
}
