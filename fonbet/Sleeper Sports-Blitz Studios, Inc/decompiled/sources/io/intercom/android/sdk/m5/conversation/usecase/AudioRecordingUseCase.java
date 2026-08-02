package io.intercom.android.sdk.m5.conversation.usecase;

import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioRecordingManager;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AudioRecordingUseCase.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u000f\u0010\fJ\u0006\u0010\u0010\u001a\u00020\nJ\u0006\u0010\u0011\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/AudioRecordingUseCase;", "", "audioRecordingManager", "Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager;", "twig", "Lcom/intercom/twig/Twig;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager;Lcom/intercom/twig/Twig;)V", "startRecording", "Lkotlin/Result;", "", "startRecording-d1pmJ48", "()Ljava/lang/Object;", "stopRecording", "Lio/intercom/android/sdk/m5/conversation/usecase/RecordedAudioFile;", "stopRecording-d1pmJ48", "cancelRecording", "cleanupCompletedRecording", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AudioRecordingUseCase {
    public static final int $stable = 8;
    private final AudioRecordingManager audioRecordingManager;
    private final Twig twig;

    public AudioRecordingUseCase(AudioRecordingManager audioRecordingManager, Twig twig) {
        Intrinsics.checkNotNullParameter(audioRecordingManager, "audioRecordingManager");
        Intrinsics.checkNotNullParameter(twig, "twig");
        this.audioRecordingManager = audioRecordingManager;
        this.twig = twig;
    }

    public /* synthetic */ AudioRecordingUseCase(AudioRecordingManager audioRecordingManager, Twig twig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(audioRecordingManager, (i & 2) != 0 ? LumberMill.getLogger() : twig);
    }

    /* renamed from: startRecording-d1pmJ48, reason: not valid java name */
    public final Object m12408startRecordingd1pmJ48() {
        try {
            if (!Intrinsics.areEqual(this.audioRecordingManager.getRecordingState().getValue(), AudioRecordingManager.RecordingState.Idle.INSTANCE)) {
                this.audioRecordingManager.cancelRecording();
            }
            AudioRecordingManager.RecordingResult startRecording = this.audioRecordingManager.startRecording();
            if (startRecording instanceof AudioRecordingManager.RecordingResult.Success) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m13470constructorimpl(Unit.INSTANCE);
            }
            if (!(startRecording instanceof AudioRecordingManager.RecordingResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            this.twig.e("Failed to start recording: " + ((AudioRecordingManager.RecordingResult.Error) startRecording).getMessage(), new Object[0]);
            this.audioRecordingManager.cancelRecording();
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m13470constructorimpl(ResultKt.createFailure(new RecordingException(((AudioRecordingManager.RecordingResult.Error) startRecording).getMessage(), null, 2, null)));
        } catch (Exception e) {
            Exception exc = e;
            this.twig.e(exc, "Failed to start recording", new Object[0]);
            this.audioRecordingManager.cancelRecording();
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m13470constructorimpl(ResultKt.createFailure(exc));
        }
    }

    /* renamed from: stopRecording-d1pmJ48, reason: not valid java name */
    public final Object m12409stopRecordingd1pmJ48() {
        try {
            AudioRecordingManager.RecordingStopResult stopRecording = this.audioRecordingManager.stopRecording();
            if (stopRecording instanceof AudioRecordingManager.RecordingStopResult.Success) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m13470constructorimpl(new RecordedAudioFile(((AudioRecordingManager.RecordingStopResult.Success) stopRecording).getFile(), ((AudioRecordingManager.RecordingStopResult.Success) stopRecording).getUri()));
            }
            if (!(stopRecording instanceof AudioRecordingManager.RecordingStopResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            this.twig.e("Failed to stop recording: " + ((AudioRecordingManager.RecordingStopResult.Error) stopRecording).getMessage(), new Object[0]);
            this.audioRecordingManager.cancelRecording();
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m13470constructorimpl(ResultKt.createFailure(new RecordingException(((AudioRecordingManager.RecordingStopResult.Error) stopRecording).getMessage(), null, 2, null)));
        } catch (Exception e) {
            Exception exc = e;
            this.twig.e(exc, "Failed to stop recording", new Object[0]);
            this.audioRecordingManager.cancelRecording();
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m13470constructorimpl(ResultKt.createFailure(exc));
        }
    }

    public final void cancelRecording() {
        this.audioRecordingManager.cancelRecording();
    }

    public final void cleanupCompletedRecording() {
        this.audioRecordingManager.cleanupCompletedRecording();
    }
}
