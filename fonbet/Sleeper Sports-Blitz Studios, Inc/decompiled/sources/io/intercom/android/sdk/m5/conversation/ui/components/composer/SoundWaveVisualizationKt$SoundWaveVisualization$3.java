package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableLongState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: SoundWaveVisualization.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ui.components.composer.SoundWaveVisualizationKt$SoundWaveVisualization$3", f = "SoundWaveVisualization.kt", i = {}, l = {367}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class SoundWaveVisualizationKt$SoundWaveVisualization$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableFloatState $canvasWidth$delegate;
    final /* synthetic */ long $elementGenerationIntervalMs;
    final /* synthetic */ MutableLongState $lastElementGenerationTime$delegate;
    final /* synthetic */ MutableFloatState $smoothedAmplitude$delegate;
    final /* synthetic */ WaveformBuffer $waveformBuffer;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SoundWaveVisualizationKt$SoundWaveVisualization$3(long j, WaveformBuffer waveformBuffer, MutableFloatState mutableFloatState, MutableLongState mutableLongState, MutableFloatState mutableFloatState2, Continuation<? super SoundWaveVisualizationKt$SoundWaveVisualization$3> continuation) {
        super(2, continuation);
        this.$elementGenerationIntervalMs = j;
        this.$waveformBuffer = waveformBuffer;
        this.$canvasWidth$delegate = mutableFloatState;
        this.$lastElementGenerationTime$delegate = mutableLongState;
        this.$smoothedAmplitude$delegate = mutableFloatState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SoundWaveVisualizationKt$SoundWaveVisualization$3(this.$elementGenerationIntervalMs, this.$waveformBuffer, this.$canvasWidth$delegate, this.$lastElementGenerationTime$delegate, this.$smoothedAmplitude$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SoundWaveVisualizationKt$SoundWaveVisualization$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if ((r3 - r5) >= r9.$elementGenerationIntervalMs) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float SoundWaveVisualization_FNF3uiM$lambda$5;
        long SoundWaveVisualization_FNF3uiM$lambda$8;
        float SoundWaveVisualization_FNF3uiM$lambda$14;
        float scaleAmplitudeForVisualization;
        long SoundWaveVisualization_FNF3uiM$lambda$82;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        do {
            long currentTimeMillis = System.currentTimeMillis();
            SoundWaveVisualization_FNF3uiM$lambda$5 = SoundWaveVisualizationKt.SoundWaveVisualization_FNF3uiM$lambda$5(this.$canvasWidth$delegate);
            if (SoundWaveVisualization_FNF3uiM$lambda$5 > 0.0f) {
                SoundWaveVisualization_FNF3uiM$lambda$8 = SoundWaveVisualizationKt.SoundWaveVisualization_FNF3uiM$lambda$8(this.$lastElementGenerationTime$delegate);
                if (SoundWaveVisualization_FNF3uiM$lambda$8 != 0) {
                    SoundWaveVisualization_FNF3uiM$lambda$82 = SoundWaveVisualizationKt.SoundWaveVisualization_FNF3uiM$lambda$8(this.$lastElementGenerationTime$delegate);
                }
                SoundWaveVisualization_FNF3uiM$lambda$14 = SoundWaveVisualizationKt.SoundWaveVisualization_FNF3uiM$lambda$14(this.$smoothedAmplitude$delegate);
                scaleAmplitudeForVisualization = SoundWaveVisualizationKt.scaleAmplitudeForVisualization(SoundWaveVisualization_FNF3uiM$lambda$14);
                this.$waveformBuffer.addElement(new WaveformElement(0.0f, scaleAmplitudeForVisualization, currentTimeMillis));
                this.$lastElementGenerationTime$delegate.setLongValue(currentTimeMillis);
            }
            this.label = 1;
        } while (DelayKt.delay(this.$elementGenerationIntervalMs, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
