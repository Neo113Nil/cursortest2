package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.extractor.ts.PsExtractor;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: SoundWaveVisualization.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002\u001a1\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001aI\u0010\u0011\u001a\u00020\b*\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u001e\u001a\r\u0010 \u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u001e¨\u0006!²\u0006\n\u0010\"\u001a\u00020\u0003X\u008a\u0084\u0002²\u0006\n\u0010\u0002\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020$X\u008a\u008e\u0002²\u0006\n\u0010%\u001a\u00020$X\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\u0003X\u008a\u008e\u0002"}, d2 = {"calculateOptimalBufferSize", "", "canvasWidth", "", "elementSpacingPx", "scaleAmplitudeForVisualization", "rawAmplitude", "SoundWaveVisualization", "", "amplitudeLevel", "Lkotlinx/coroutines/flow/StateFlow;", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "SoundWaveVisualization-FNF3uiM", "(Lkotlinx/coroutines/flow/StateFlow;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "drawWaveformElements", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "elements", "", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/WaveformElement;", "constants", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/DrawingConstants;", "canvasHeight", ViewProps.LAYOUT_DIRECTION, "Landroidx/compose/ui/unit/LayoutDirection;", "drawWaveformElements-cf5BqRc", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Ljava/util/List;JLio/intercom/android/sdk/m5/conversation/ui/components/composer/DrawingConstants;FFLandroidx/compose/ui/unit/LayoutDirection;)V", "SoundWaveVisualizationPreview", "(Landroidx/compose/runtime/Composer;I)V", "SoundWaveVisualizationLowAmplitudePreview", "SoundWaveVisualizationRtlPreview", "intercom-sdk-base_release", "amplitude", "lastElementGenerationTime", "", "animationFrameCounter", "smoothedAmplitude", "lastRawAmplitude"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SoundWaveVisualizationKt {

    /* compiled from: SoundWaveVisualization.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SoundWaveVisualizationLowAmplitudePreview$lambda$26(int i, Composer composer, int i2) {
        SoundWaveVisualizationLowAmplitudePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SoundWaveVisualizationPreview$lambda$25(int i, Composer composer, int i2) {
        SoundWaveVisualizationPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SoundWaveVisualizationRtlPreview$lambda$27(int i, Composer composer, int i2) {
        SoundWaveVisualizationRtlPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SoundWaveVisualization_FNF3uiM$lambda$23(StateFlow amplitudeLevel, Modifier modifier, long j, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(amplitudeLevel, "$amplitudeLevel");
        m12316SoundWaveVisualizationFNF3uiM(amplitudeLevel, modifier, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final int calculateOptimalBufferSize(float f, float f2) {
        if (f <= 0.0f || f2 <= 0.0f) {
            return 70;
        }
        return RangesKt.coerceIn((int) (((int) (f / f2)) * 1.5f), 50, 200);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scaleAmplitudeForVisualization(float f) {
        float f2 = f * f;
        return Math.min(1.0f, (f2 / (0.2f + f2)) * 1.6f);
    }

    /* renamed from: SoundWaveVisualization-FNF3uiM, reason: not valid java name */
    public static final void m12316SoundWaveVisualizationFNF3uiM(final StateFlow<Float> amplitudeLevel, Modifier modifier, long j, Composer composer, final int i, final int i2) {
        Float f;
        DrawingConstants drawingConstants;
        float f2;
        MutableFloatState mutableFloatState;
        long j2;
        WaveformBuffer waveformBuffer;
        MutableFloatState mutableFloatState2;
        SoundWaveVisualizationKt$SoundWaveVisualization$2$1 soundWaveVisualizationKt$SoundWaveVisualization$2$1;
        DrawingConstants drawingConstants2;
        ArrayList emptyList;
        Intrinsics.checkNotNullParameter(amplitudeLevel, "amplitudeLevel");
        Composer startRestartGroup = composer.startRestartGroup(2042015142);
        final Modifier.Companion companion = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        long m13101getDescriptionText0d7_KjU = (i2 & 4) != 0 ? IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13101getDescriptionText0d7_KjU() : j;
        State collectAsState = SnapshotStateKt.collectAsState(amplitudeLevel, null, startRestartGroup, 8, 1);
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localLayoutDirection);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final LayoutDirection layoutDirection = (LayoutDirection) consume;
        float m8798constructorimpl = Dp.m8798constructorimpl(4);
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float mo744toPx0680j_4 = ((Density) consume2).mo744toPx0680j_4(m8798constructorimpl);
        float f3 = mo744toPx0680j_4 / 150;
        startRestartGroup.startReplaceGroup(-1478395137);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            DrawingConstants drawingConstants3 = new DrawingConstants(Dp.m8798constructorimpl(2), Dp.m8798constructorimpl(1), Dp.m8798constructorimpl(3), 0.05f, 0.02f, 0.3f, null);
            startRestartGroup.updateRememberedValue(drawingConstants3);
            rememberedValue = drawingConstants3;
        }
        DrawingConstants drawingConstants4 = (DrawingConstants) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1478380880);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new WaveformBuffer(0, 1, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        WaveformBuffer waveformBuffer2 = (WaveformBuffer) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1478377801);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        MutableFloatState mutableFloatState3 = (MutableFloatState) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1478375434);
        Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = SnapshotLongStateKt.mutableLongStateOf(0L);
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        MutableLongState mutableLongState = (MutableLongState) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1478373226);
        Object rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = SnapshotLongStateKt.mutableLongStateOf(0L);
            startRestartGroup.updateRememberedValue(rememberedValue5);
        }
        MutableLongState mutableLongState2 = (MutableLongState) rememberedValue5;
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(Float.valueOf(SoundWaveVisualization_FNF3uiM$lambda$5(mutableFloatState3)), new SoundWaveVisualizationKt$SoundWaveVisualization$1(mo744toPx0680j_4, waveformBuffer2, mutableFloatState3, null), startRestartGroup, 64);
        startRestartGroup.startReplaceGroup(-1478357257);
        Object rememberedValue6 = startRestartGroup.rememberedValue();
        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            startRestartGroup.updateRememberedValue(rememberedValue6);
        }
        MutableFloatState mutableFloatState4 = (MutableFloatState) rememberedValue6;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1478355177);
        Object rememberedValue7 = startRestartGroup.rememberedValue();
        if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            rememberedValue7 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            startRestartGroup.updateRememberedValue(rememberedValue7);
        }
        MutableFloatState mutableFloatState5 = (MutableFloatState) rememberedValue7;
        startRestartGroup.endReplaceGroup();
        Float valueOf = Float.valueOf(SoundWaveVisualization_FNF3uiM$lambda$0(collectAsState));
        startRestartGroup.startReplaceGroup(-1478350126);
        boolean changed = startRestartGroup.changed(collectAsState);
        Object rememberedValue8 = startRestartGroup.rememberedValue();
        if (changed || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
            f = valueOf;
            drawingConstants = drawingConstants4;
            f2 = 0.0f;
            mutableFloatState = mutableFloatState3;
            j2 = 150;
            waveformBuffer = waveformBuffer2;
            mutableFloatState2 = mutableFloatState4;
            soundWaveVisualizationKt$SoundWaveVisualization$2$1 = new SoundWaveVisualizationKt$SoundWaveVisualization$2$1(drawingConstants, collectAsState, mutableFloatState5, mutableFloatState2, null);
            startRestartGroup.updateRememberedValue(soundWaveVisualizationKt$SoundWaveVisualization$2$1);
        } else {
            mutableFloatState = mutableFloatState3;
            drawingConstants = drawingConstants4;
            waveformBuffer = waveformBuffer2;
            f = valueOf;
            mutableFloatState2 = mutableFloatState4;
            j2 = 150;
            soundWaveVisualizationKt$SoundWaveVisualization$2$1 = rememberedValue8;
            f2 = 0.0f;
        }
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(f, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) soundWaveVisualizationKt$SoundWaveVisualization$2$1, startRestartGroup, 64);
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new SoundWaveVisualizationKt$SoundWaveVisualization$3(j2, waveformBuffer, mutableFloatState, mutableLongState, mutableFloatState2, null), startRestartGroup, 70);
        WaveformBuffer waveformBuffer3 = waveformBuffer;
        final MutableFloatState mutableFloatState6 = mutableFloatState;
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new SoundWaveVisualizationKt$SoundWaveVisualization$4(mo744toPx0680j_4, f3, waveformBuffer3, 16L, mutableFloatState6, mutableLongState2, null), startRestartGroup, 70);
        float SoundWaveVisualization_FNF3uiM$lambda$5 = SoundWaveVisualization_FNF3uiM$lambda$5(mutableFloatState6);
        long SoundWaveVisualization_FNF3uiM$lambda$11 = SoundWaveVisualization_FNF3uiM$lambda$11(mutableLongState2);
        startRestartGroup.startReplaceGroup(-1478260980);
        boolean changed2 = startRestartGroup.changed(SoundWaveVisualization_FNF3uiM$lambda$5) | startRestartGroup.changed(SoundWaveVisualization_FNF3uiM$lambda$11);
        Object rememberedValue9 = startRestartGroup.rememberedValue();
        if (changed2 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
            if (SoundWaveVisualization_FNF3uiM$lambda$5(mutableFloatState6) > f2) {
                long currentTimeMillis = System.currentTimeMillis();
                emptyList = new ArrayList();
                for (WaveformElement waveformElement : waveformBuffer3.getAllElements()) {
                    DrawingConstants drawingConstants5 = drawingConstants;
                    float timestamp = (currentTimeMillis - waveformElement.getTimestamp()) * f3;
                    if (timestamp <= SoundWaveVisualization_FNF3uiM$lambda$5(mutableFloatState6) + mo744toPx0680j_4) {
                        emptyList.add(WaveformElement.copy$default(waveformElement, timestamp, 0.0f, 0L, 6, null));
                    }
                    drawingConstants = drawingConstants5;
                }
                drawingConstants2 = drawingConstants;
            } else {
                drawingConstants2 = drawingConstants;
                emptyList = CollectionsKt.emptyList();
            }
            rememberedValue9 = emptyList;
            startRestartGroup.updateRememberedValue(rememberedValue9);
        } else {
            drawingConstants2 = drawingConstants;
        }
        final List list = (List) rememberedValue9;
        startRestartGroup.endReplaceGroup();
        Modifier m1195height3ABfNKs = SizeKt.m1195height3ABfNKs(SizeKt.fillMaxWidth$default(companion, f2, 1, null), Dp.m8798constructorimpl(24));
        final DrawingConstants drawingConstants6 = drawingConstants2;
        final long j3 = m13101getDescriptionText0d7_KjU;
        CanvasKt.Canvas(m1195height3ABfNKs, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.SoundWaveVisualizationKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit SoundWaveVisualization_FNF3uiM$lambda$22;
                SoundWaveVisualization_FNF3uiM$lambda$22 = SoundWaveVisualizationKt.SoundWaveVisualization_FNF3uiM$lambda$22(list, j3, drawingConstants6, layoutDirection, mutableFloatState6, (DrawScope) obj);
                return SoundWaveVisualization_FNF3uiM$lambda$22;
            }
        }, startRestartGroup, 0);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.SoundWaveVisualizationKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SoundWaveVisualization_FNF3uiM$lambda$23;
                    SoundWaveVisualization_FNF3uiM$lambda$23 = SoundWaveVisualizationKt.SoundWaveVisualization_FNF3uiM$lambda$23(StateFlow.this, companion, j3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return SoundWaveVisualization_FNF3uiM$lambda$23;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SoundWaveVisualization_FNF3uiM$lambda$5(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long SoundWaveVisualization_FNF3uiM$lambda$8(MutableLongState mutableLongState) {
        return mutableLongState.getLongValue();
    }

    private static final long SoundWaveVisualization_FNF3uiM$lambda$11(MutableLongState mutableLongState) {
        return mutableLongState.getLongValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SoundWaveVisualization_FNF3uiM$lambda$14(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SoundWaveVisualization_FNF3uiM$lambda$17(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SoundWaveVisualization_FNF3uiM$lambda$22(List currentElements, long j, DrawingConstants drawingConstants, LayoutDirection layoutDirection, MutableFloatState canvasWidth$delegate, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(currentElements, "$currentElements");
        Intrinsics.checkNotNullParameter(drawingConstants, "$drawingConstants");
        Intrinsics.checkNotNullParameter(layoutDirection, "$layoutDirection");
        Intrinsics.checkNotNullParameter(canvasWidth$delegate, "$canvasWidth$delegate");
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        canvasWidth$delegate.setFloatValue(Float.intBitsToFloat((int) (Canvas.mo6618getSizeNHjbRc() >> 32)));
        m12317drawWaveformElementscf5BqRc(Canvas, currentElements, j, drawingConstants, Float.intBitsToFloat((int) (Canvas.mo6618getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (Canvas.mo6618getSizeNHjbRc() & 4294967295L)), layoutDirection);
        return Unit.INSTANCE;
    }

    /* renamed from: drawWaveformElements-cf5BqRc, reason: not valid java name */
    private static final void m12317drawWaveformElementscf5BqRc(DrawScope drawScope, List<WaveformElement> list, long j, DrawingConstants drawingConstants, float f, float f2, LayoutDirection layoutDirection) {
        float x;
        if (list.isEmpty()) {
            return;
        }
        DrawingConstantsPx px = drawingConstants.toPx(drawScope.getDensity());
        float f3 = f2 * 0.5f;
        float barWidth = px.getBarWidth() * 0.5f;
        float barWidth2 = px.getBarWidth() * 0.5f;
        long m5725constructorimpl = CornerRadius.m5725constructorimpl((Float.floatToRawIntBits(barWidth2) & 4294967295L) | (Float.floatToRawIntBits(barWidth) << 32));
        for (WaveformElement waveformElement : list) {
            int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i == 1) {
                x = f - waveformElement.getX();
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                x = waveformElement.getX();
            }
            if (x >= (-px.getBarWidth()) && x <= f + px.getBarWidth()) {
                if (waveformElement.getAmplitude() < px.getAmplitudeThreshold()) {
                    DrawScope.m6599drawCircleVaOC9Bg$default(drawScope, j, px.getDotRadius(), Offset.m5763constructorimpl((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L)), 0.0f, null, null, 0, 120, null);
                } else {
                    float max = Math.max(px.getMinBarHeight(), Math.min(f2, waveformElement.getAmplitude() * f2));
                    DrawScope.m6614drawRoundRectuAw5IA$default(drawScope, j, Offset.m5763constructorimpl((Float.floatToRawIntBits(f3 - (max * 0.5f)) & 4294967295L) | (Float.floatToRawIntBits(x - (px.getBarWidth() * 0.5f)) << 32)), Size.m5831constructorimpl((Float.floatToRawIntBits(px.getBarWidth()) << 32) | (Float.floatToRawIntBits(max) & 4294967295L)), m5725constructorimpl, null, 0.0f, null, 0, PsExtractor.VIDEO_STREAM_MASK, null);
                }
            }
        }
    }

    @IntercomPreviews
    private static final void SoundWaveVisualizationPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(888011189);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SoundWaveVisualizationKt.INSTANCE.m12283getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.SoundWaveVisualizationKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SoundWaveVisualizationPreview$lambda$25;
                    SoundWaveVisualizationPreview$lambda$25 = SoundWaveVisualizationKt.SoundWaveVisualizationPreview$lambda$25(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SoundWaveVisualizationPreview$lambda$25;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void SoundWaveVisualizationLowAmplitudePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1762579162);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SoundWaveVisualizationKt.INSTANCE.m12284getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.SoundWaveVisualizationKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SoundWaveVisualizationLowAmplitudePreview$lambda$26;
                    SoundWaveVisualizationLowAmplitudePreview$lambda$26 = SoundWaveVisualizationKt.SoundWaveVisualizationLowAmplitudePreview$lambda$26(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SoundWaveVisualizationLowAmplitudePreview$lambda$26;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void SoundWaveVisualizationRtlPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-436763649);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$SoundWaveVisualizationKt.INSTANCE.m12285getLambda3$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.SoundWaveVisualizationKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SoundWaveVisualizationRtlPreview$lambda$27;
                    SoundWaveVisualizationRtlPreview$lambda$27 = SoundWaveVisualizationKt.SoundWaveVisualizationRtlPreview$lambda$27(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SoundWaveVisualizationRtlPreview$lambda$27;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SoundWaveVisualization_FNF3uiM$lambda$0(State<Float> state) {
        return state.getValue().floatValue();
    }
}
