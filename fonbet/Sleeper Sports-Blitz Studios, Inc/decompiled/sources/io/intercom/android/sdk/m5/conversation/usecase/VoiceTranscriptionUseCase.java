package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.errors.VoiceTranscriptionError;
import io.intercom.android.sdk.m5.conversation.states.ComposerUiEffect;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect;
import io.intercom.android.sdk.m5.conversation.states.VoiceTranscriptionState;
import io.intercom.android.sdk.models.TranscribedText;
import io.intercom.android.sdk.utilities.IoUtils;
import io.sentry.SentryReplayEvent;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: VoiceTranscriptionUseCase.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086@¢\u0006\u0002\u0010\u0010J8\u0010\u0011\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eH\u0086@¢\u0006\u0002\u0010\u0014J*\u0010\u0015\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086@¢\u0006\u0002\u0010\u0010J@\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eH\u0082@¢\u0006\u0002\u0010\u0019J2\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082@¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/VoiceTranscriptionUseCase;", "", "audioRecordingUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/AudioRecordingUseCase;", "conversationRepository", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/usecase/AudioRecordingUseCase;Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;)V", "startRecording", "", "clientState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "uiEffect", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiEffect;", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableSharedFlow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopRecordingAndTranscribe", "composerUiEffect", "Lio/intercom/android/sdk/m5/conversation/states/ComposerUiEffect;", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableSharedFlow;Lkotlinx/coroutines/flow/MutableSharedFlow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelRecording", "transcribeAudioFile", "audioFile", "Ljava/io/File;", "(Ljava/io/File;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableSharedFlow;Lkotlinx/coroutines/flow/MutableSharedFlow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateErrorState", "error", "Lio/intercom/android/sdk/m5/conversation/errors/VoiceTranscriptionError;", "(Lio/intercom/android/sdk/m5/conversation/errors/VoiceTranscriptionError;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableSharedFlow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFileSizeValid", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VoiceTranscriptionUseCase {
    public static final int $stable = 8;
    private final AudioRecordingUseCase audioRecordingUseCase;
    private final ConversationRepository conversationRepository;

    public VoiceTranscriptionUseCase(AudioRecordingUseCase audioRecordingUseCase, ConversationRepository conversationRepository) {
        Intrinsics.checkNotNullParameter(audioRecordingUseCase, "audioRecordingUseCase");
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        this.audioRecordingUseCase = audioRecordingUseCase;
        this.conversationRepository = conversationRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0101, code lost:
    
        if (r7.updateErrorState(r8, r5, r2, r3) != r4) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb A[Catch: Exception -> 0x0063, TRY_LEAVE, TryCatch #3 {Exception -> 0x0063, blocks: (B:29:0x005f, B:31:0x007f, B:34:0x00bf, B:36:0x00cb), top: B:28:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startRecording(MutableStateFlow<ConversationClientState> mutableStateFlow, MutableSharedFlow<ConversationUiEffect> mutableSharedFlow, Continuation<? super Unit> continuation) {
        VoiceTranscriptionUseCase$startRecording$1 voiceTranscriptionUseCase$startRecording$1;
        int i;
        MutableStateFlow<ConversationClientState> mutableStateFlow2;
        VoiceTranscriptionUseCase voiceTranscriptionUseCase;
        ConversationUiEffect.LockScreenOrientation lockScreenOrientation;
        VoiceTranscriptionUseCase voiceTranscriptionUseCase2;
        ConversationClientState value;
        Throwable m13473exceptionOrNullimpl;
        MutableSharedFlow<ConversationUiEffect> mutableSharedFlow2 = mutableSharedFlow;
        if (continuation instanceof VoiceTranscriptionUseCase$startRecording$1) {
            voiceTranscriptionUseCase$startRecording$1 = (VoiceTranscriptionUseCase$startRecording$1) continuation;
            if ((voiceTranscriptionUseCase$startRecording$1.label & Integer.MIN_VALUE) != 0) {
                voiceTranscriptionUseCase$startRecording$1.label -= Integer.MIN_VALUE;
                Object obj = voiceTranscriptionUseCase$startRecording$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = voiceTranscriptionUseCase$startRecording$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        lockScreenOrientation = ConversationUiEffect.LockScreenOrientation.INSTANCE;
                        voiceTranscriptionUseCase$startRecording$1.L$0 = this;
                        mutableStateFlow2 = mutableStateFlow;
                    } catch (Exception e) {
                        e = e;
                        mutableStateFlow2 = mutableStateFlow;
                    }
                    try {
                        voiceTranscriptionUseCase$startRecording$1.L$1 = mutableStateFlow2;
                        voiceTranscriptionUseCase$startRecording$1.L$2 = mutableSharedFlow2;
                        voiceTranscriptionUseCase$startRecording$1.label = 1;
                        if (mutableSharedFlow2.emit(lockScreenOrientation, voiceTranscriptionUseCase$startRecording$1) != coroutine_suspended) {
                            voiceTranscriptionUseCase2 = this;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        voiceTranscriptionUseCase = this;
                        VoiceTranscriptionError.RecordingFailed recordingFailed = new VoiceTranscriptionError.RecordingFailed(e);
                        voiceTranscriptionUseCase$startRecording$1.L$0 = null;
                        voiceTranscriptionUseCase$startRecording$1.L$1 = null;
                        voiceTranscriptionUseCase$startRecording$1.L$2 = null;
                        voiceTranscriptionUseCase$startRecording$1.label = 3;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    mutableSharedFlow2 = (MutableSharedFlow) voiceTranscriptionUseCase$startRecording$1.L$2;
                    mutableStateFlow2 = (MutableStateFlow) voiceTranscriptionUseCase$startRecording$1.L$1;
                    voiceTranscriptionUseCase2 = (VoiceTranscriptionUseCase) voiceTranscriptionUseCase$startRecording$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e3) {
                        e = e3;
                        voiceTranscriptionUseCase = voiceTranscriptionUseCase2;
                        VoiceTranscriptionError.RecordingFailed recordingFailed2 = new VoiceTranscriptionError.RecordingFailed(e);
                        voiceTranscriptionUseCase$startRecording$1.L$0 = null;
                        voiceTranscriptionUseCase$startRecording$1.L$1 = null;
                        voiceTranscriptionUseCase$startRecording$1.L$2 = null;
                        voiceTranscriptionUseCase$startRecording$1.label = 3;
                    }
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    mutableSharedFlow2 = (MutableSharedFlow) voiceTranscriptionUseCase$startRecording$1.L$2;
                    mutableStateFlow2 = (MutableStateFlow) voiceTranscriptionUseCase$startRecording$1.L$1;
                    voiceTranscriptionUseCase = (VoiceTranscriptionUseCase) voiceTranscriptionUseCase$startRecording$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    } catch (Exception e4) {
                        e = e4;
                        VoiceTranscriptionError.RecordingFailed recordingFailed22 = new VoiceTranscriptionError.RecordingFailed(e);
                        voiceTranscriptionUseCase$startRecording$1.L$0 = null;
                        voiceTranscriptionUseCase$startRecording$1.L$1 = null;
                        voiceTranscriptionUseCase$startRecording$1.L$2 = null;
                        voiceTranscriptionUseCase$startRecording$1.label = 3;
                    }
                }
                do {
                    value = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, VoiceTranscriptionState.Recording.INSTANCE, 2097151, null)));
                m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(voiceTranscriptionUseCase2.audioRecordingUseCase.m12408startRecordingd1pmJ48());
                if (m13473exceptionOrNullimpl != null) {
                    VoiceTranscriptionError.RecordingFailed recordingFailed3 = new VoiceTranscriptionError.RecordingFailed(m13473exceptionOrNullimpl);
                    voiceTranscriptionUseCase$startRecording$1.L$0 = voiceTranscriptionUseCase2;
                    voiceTranscriptionUseCase$startRecording$1.L$1 = mutableStateFlow2;
                    voiceTranscriptionUseCase$startRecording$1.L$2 = mutableSharedFlow2;
                    voiceTranscriptionUseCase$startRecording$1.label = 2;
                    if (voiceTranscriptionUseCase2.updateErrorState(recordingFailed3, mutableStateFlow2, mutableSharedFlow2, voiceTranscriptionUseCase$startRecording$1) != coroutine_suspended) {
                        voiceTranscriptionUseCase = voiceTranscriptionUseCase2;
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        voiceTranscriptionUseCase$startRecording$1 = new VoiceTranscriptionUseCase$startRecording$1(this, continuation);
        Object obj2 = voiceTranscriptionUseCase$startRecording$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = voiceTranscriptionUseCase$startRecording$1.label;
        if (i != 0) {
        }
        do {
            value = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, VoiceTranscriptionState.Recording.INSTANCE, 2097151, null)));
        m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(voiceTranscriptionUseCase2.audioRecordingUseCase.m12408startRecordingd1pmJ48());
        if (m13473exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|(1:(1:(1:(3:(1:(1:14)(2:18|19))(2:20|21)|15|16)(6:22|23|24|25|26|27))(4:38|39|40|41))(4:42|43|44|45))(7:46|47|48|49|(2:51|(3:53|44|45))(2:56|(2:58|(3:60|40|41))(4:(2:61|(1:64)(1:63))|65|(3:67|26|27)|29))|54|29)))|74|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0185, code lost:
    
        if (r3.emit(r0, r6) != r7) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01ba, code lost:
    
        if (r1.updateErrorState(r2, r3, r4, r6) != r7) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0098, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0099, code lost:
    
        r1 = r4;
        r4 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlinx.coroutines.flow.MutableSharedFlow] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object stopRecordingAndTranscribe(MutableStateFlow<ConversationClientState> mutableStateFlow, MutableSharedFlow<ConversationUiEffect> mutableSharedFlow, MutableSharedFlow<ComposerUiEffect> mutableSharedFlow2, Continuation<? super Unit> continuation) {
        VoiceTranscriptionUseCase$stopRecordingAndTranscribe$1 voiceTranscriptionUseCase$stopRecordingAndTranscribe$1;
        ?? r2;
        Object m12409stopRecordingd1pmJ48;
        Throwable m13473exceptionOrNullimpl;
        MutableStateFlow<ConversationClientState> mutableStateFlow2;
        ?? r3;
        RecordedAudioFile recordedAudioFile;
        ?? r1 = this;
        MutableStateFlow<ConversationClientState> mutableStateFlow3 = mutableStateFlow;
        MutableSharedFlow<ConversationUiEffect> mutableSharedFlow3 = mutableSharedFlow;
        if (continuation instanceof VoiceTranscriptionUseCase$stopRecordingAndTranscribe$1) {
            voiceTranscriptionUseCase$stopRecordingAndTranscribe$1 = (VoiceTranscriptionUseCase$stopRecordingAndTranscribe$1) continuation;
            if ((voiceTranscriptionUseCase$stopRecordingAndTranscribe$1.label & Integer.MIN_VALUE) != 0) {
                voiceTranscriptionUseCase$stopRecordingAndTranscribe$1.label -= Integer.MIN_VALUE;
                VoiceTranscriptionUseCase$stopRecordingAndTranscribe$1 voiceTranscriptionUseCase$stopRecordingAndTranscribe$12 = voiceTranscriptionUseCase$stopRecordingAndTranscribe$1;
                Object obj = voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r2 = voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.label;
                if (r2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        m12409stopRecordingd1pmJ48 = r1.audioRecordingUseCase.m12409stopRecordingd1pmJ48();
                        m13473exceptionOrNullimpl = Result.m13473exceptionOrNullimpl(m12409stopRecordingd1pmJ48);
                        try {
                        } catch (Exception e) {
                            e = e;
                            r1.audioRecordingUseCase.cleanupCompletedRecording();
                            VoiceTranscriptionError.TranscriptionFailed transcriptionFailed = new VoiceTranscriptionError.TranscriptionFailed(e);
                            voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$0 = null;
                            voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$1 = null;
                            voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$2 = null;
                            voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$3 = null;
                            voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.label = 5;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        r1 = this;
                        mutableStateFlow3 = mutableStateFlow;
                        mutableSharedFlow3 = mutableSharedFlow;
                    }
                    if (m13473exceptionOrNullimpl != null) {
                        r1.audioRecordingUseCase.cleanupCompletedRecording();
                        VoiceTranscriptionError.RecordingFailed recordingFailed = new VoiceTranscriptionError.RecordingFailed(m13473exceptionOrNullimpl);
                        voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$0 = r1;
                        voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$1 = mutableStateFlow3;
                        voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$2 = mutableSharedFlow3;
                        voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.label = 1;
                        if (r1.updateErrorState(recordingFailed, mutableStateFlow3, mutableSharedFlow3, voiceTranscriptionUseCase$stopRecordingAndTranscribe$12) != coroutine_suspended) {
                            return Unit.INSTANCE;
                        }
                    } else {
                        ResultKt.throwOnFailure(m12409stopRecordingd1pmJ48);
                        RecordedAudioFile recordedAudioFile2 = (RecordedAudioFile) m12409stopRecordingd1pmJ48;
                        boolean isFileSizeValid = r1.isFileSizeValid(recordedAudioFile2.getFile());
                        VoiceTranscriptionUseCase voiceTranscriptionUseCase = r1;
                        if (!isFileSizeValid) {
                            IoUtils.safelyDelete(recordedAudioFile2.getFile());
                            r1.audioRecordingUseCase.cleanupCompletedRecording();
                            VoiceTranscriptionError.FileTooLarge fileTooLarge = new VoiceTranscriptionError.FileTooLarge(null, 1, null);
                            voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$0 = r1;
                            voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$1 = mutableStateFlow3;
                            voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$2 = mutableSharedFlow3;
                            voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.label = 2;
                            if (r1.updateErrorState(fileTooLarge, mutableStateFlow3, mutableSharedFlow3, voiceTranscriptionUseCase$stopRecordingAndTranscribe$12) != coroutine_suspended) {
                                return Unit.INSTANCE;
                            }
                        } else {
                            while (true) {
                                ConversationClientState value = mutableStateFlow3.getValue();
                                if (mutableStateFlow3.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, VoiceTranscriptionState.Processing.INSTANCE, 2097151, null))) {
                                    break;
                                }
                                voiceTranscriptionUseCase = this;
                                mutableStateFlow3 = mutableStateFlow;
                                mutableSharedFlow3 = mutableSharedFlow;
                            }
                            File file = recordedAudioFile2.getFile();
                            voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$0 = voiceTranscriptionUseCase;
                            voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$1 = mutableStateFlow3;
                            voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$2 = mutableSharedFlow3;
                            voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$3 = recordedAudioFile2;
                            voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.label = 3;
                            if (voiceTranscriptionUseCase.transcribeAudioFile(file, mutableStateFlow3, mutableSharedFlow3, mutableSharedFlow2, voiceTranscriptionUseCase$stopRecordingAndTranscribe$12) != coroutine_suspended) {
                                r1 = this;
                                mutableStateFlow2 = mutableStateFlow;
                                r3 = mutableSharedFlow;
                                recordedAudioFile = recordedAudioFile2;
                                IoUtils.safelyDelete(recordedAudioFile.getFile());
                                r1.audioRecordingUseCase.cleanupCompletedRecording();
                                ConversationUiEffect.UnlockScreenOrientation unlockScreenOrientation = ConversationUiEffect.UnlockScreenOrientation.INSTANCE;
                                voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$0 = r1;
                                voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$1 = mutableStateFlow2;
                                voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$2 = r3;
                                voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$3 = null;
                                voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.label = 4;
                            }
                            return coroutine_suspended;
                        }
                    }
                    return coroutine_suspended;
                }
                if (r2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (r2 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (r2 == 3) {
                    recordedAudioFile = (RecordedAudioFile) voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$3;
                    MutableSharedFlow<ConversationUiEffect> mutableSharedFlow4 = (MutableSharedFlow) voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$2;
                    mutableStateFlow2 = (MutableStateFlow) voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$1;
                    VoiceTranscriptionUseCase voiceTranscriptionUseCase2 = (VoiceTranscriptionUseCase) voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        r1 = voiceTranscriptionUseCase2;
                        r3 = mutableSharedFlow4;
                    } catch (Exception e3) {
                        e = e3;
                        mutableSharedFlow3 = mutableSharedFlow4;
                        mutableStateFlow3 = mutableStateFlow2;
                        r1 = voiceTranscriptionUseCase2;
                        r1.audioRecordingUseCase.cleanupCompletedRecording();
                        VoiceTranscriptionError.TranscriptionFailed transcriptionFailed2 = new VoiceTranscriptionError.TranscriptionFailed(e);
                        voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$0 = null;
                        voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$1 = null;
                        voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$2 = null;
                        voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$3 = null;
                        voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.label = 5;
                    }
                    try {
                        IoUtils.safelyDelete(recordedAudioFile.getFile());
                        r1.audioRecordingUseCase.cleanupCompletedRecording();
                        ConversationUiEffect.UnlockScreenOrientation unlockScreenOrientation2 = ConversationUiEffect.UnlockScreenOrientation.INSTANCE;
                        voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$0 = r1;
                        voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$1 = mutableStateFlow2;
                        voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$2 = r3;
                        voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$3 = null;
                        voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.label = 4;
                    } catch (Exception e4) {
                        e = e4;
                        MutableStateFlow<ConversationClientState> mutableStateFlow4 = mutableStateFlow2;
                        mutableSharedFlow3 = r3;
                        mutableStateFlow3 = mutableStateFlow4;
                        r1.audioRecordingUseCase.cleanupCompletedRecording();
                        VoiceTranscriptionError.TranscriptionFailed transcriptionFailed22 = new VoiceTranscriptionError.TranscriptionFailed(e);
                        voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$0 = null;
                        voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$1 = null;
                        voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$2 = null;
                        voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.L$3 = null;
                        voiceTranscriptionUseCase$stopRecordingAndTranscribe$12.label = 5;
                    }
                } else {
                    if (r2 == 4) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (r2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
        }
        voiceTranscriptionUseCase$stopRecordingAndTranscribe$1 = new VoiceTranscriptionUseCase$stopRecordingAndTranscribe$1(r1, continuation);
        VoiceTranscriptionUseCase$stopRecordingAndTranscribe$1 voiceTranscriptionUseCase$stopRecordingAndTranscribe$122 = voiceTranscriptionUseCase$stopRecordingAndTranscribe$1;
        Object obj2 = voiceTranscriptionUseCase$stopRecordingAndTranscribe$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = voiceTranscriptionUseCase$stopRecordingAndTranscribe$122.label;
        if (r2 != 0) {
        }
    }

    public final Object cancelRecording(MutableStateFlow<ConversationClientState> mutableStateFlow, MutableSharedFlow<ConversationUiEffect> mutableSharedFlow, Continuation<? super Unit> continuation) {
        ConversationClientState value;
        this.audioRecordingUseCase.cancelRecording();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, VoiceTranscriptionState.Idle.INSTANCE, 2097151, null)));
        Object emit = mutableSharedFlow.emit(ConversationUiEffect.UnlockScreenOrientation.INSTANCE, continuation);
        return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|(2:(2:53|(3:(1:(1:57)(2:58|59))(2:60|61)|28|29)(7:62|63|64|23|(2:24|25)|28|29))(4:9|10|11|12)|35)(11:67|68|69|70|71|72|73|74|75|(1:77)|37)|13|14|(4:16|(1:17)|20|(5:22|23|(2:24|25)|28|29))(3:39|(1:41)(2:44|(1:46)(1:47))|42)|37))|87|6|(0)(0)|13|14|(0)(0)|37|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01b4, code lost:
    
        if (r7.updateErrorState(r4, r10, r8, r2) != r3) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x018b, code lost:
    
        if (r4.updateErrorState(r7, r10, r8, r2) == r3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x018e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x018f, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ae A[Catch: Exception -> 0x018e, TryCatch #0 {Exception -> 0x018e, blocks: (B:14:0x00a8, B:16:0x00ae, B:17:0x00ba, B:20:0x00fd, B:39:0x015d, B:41:0x0161, B:42:0x0176, B:44:0x016a, B:46:0x016e), top: B:13:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015d A[Catch: Exception -> 0x018e, TRY_ENTER, TryCatch #0 {Exception -> 0x018e, blocks: (B:14:0x00a8, B:16:0x00ae, B:17:0x00ba, B:20:0x00fd, B:39:0x015d, B:41:0x0161, B:42:0x0176, B:44:0x016a, B:46:0x016e), top: B:13:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object transcribeAudioFile(File file, MutableStateFlow<ConversationClientState> mutableStateFlow, MutableSharedFlow<ConversationUiEffect> mutableSharedFlow, MutableSharedFlow<ComposerUiEffect> mutableSharedFlow2, Continuation<? super Unit> continuation) {
        VoiceTranscriptionUseCase$transcribeAudioFile$1 voiceTranscriptionUseCase$transcribeAudioFile$1;
        ?? r4;
        MutableStateFlow<ConversationClientState> mutableStateFlow2;
        MutableSharedFlow<ConversationUiEffect> mutableSharedFlow3;
        MutableSharedFlow<ConversationUiEffect> mutableSharedFlow4;
        MutableStateFlow<ConversationClientState> mutableStateFlow3;
        ConversationRepository conversationRepository;
        MutableSharedFlow mutableSharedFlow5;
        VoiceTranscriptionUseCase voiceTranscriptionUseCase;
        VoiceTranscriptionUseCase voiceTranscriptionUseCase2;
        MutableSharedFlow<ConversationUiEffect> mutableSharedFlow6;
        ConversationClientState value;
        NetworkResponse networkResponse;
        IOException error;
        ConversationClientState value2;
        if (continuation instanceof VoiceTranscriptionUseCase$transcribeAudioFile$1) {
            voiceTranscriptionUseCase$transcribeAudioFile$1 = (VoiceTranscriptionUseCase$transcribeAudioFile$1) continuation;
            if ((voiceTranscriptionUseCase$transcribeAudioFile$1.label & Integer.MIN_VALUE) != 0) {
                voiceTranscriptionUseCase$transcribeAudioFile$1.label -= Integer.MIN_VALUE;
                Object obj = voiceTranscriptionUseCase$transcribeAudioFile$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r4 = voiceTranscriptionUseCase$transcribeAudioFile$1.label;
                VoiceTranscriptionUseCase voiceTranscriptionUseCase3 = 2;
                if (r4 != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        conversationRepository = this.conversationRepository;
                        voiceTranscriptionUseCase$transcribeAudioFile$1.L$0 = this;
                        mutableStateFlow2 = mutableStateFlow;
                    } catch (Exception e) {
                        e = e;
                        mutableStateFlow2 = mutableStateFlow;
                    }
                    try {
                        voiceTranscriptionUseCase$transcribeAudioFile$1.L$1 = mutableStateFlow2;
                        mutableSharedFlow3 = mutableSharedFlow;
                    } catch (Exception e2) {
                        e = e2;
                        mutableSharedFlow3 = mutableSharedFlow;
                        voiceTranscriptionUseCase3 = this;
                        mutableSharedFlow4 = mutableSharedFlow3;
                        mutableStateFlow3 = mutableStateFlow2;
                        VoiceTranscriptionError.TranscriptionFailed transcriptionFailed = new VoiceTranscriptionError.TranscriptionFailed(e);
                        voiceTranscriptionUseCase$transcribeAudioFile$1.L$0 = null;
                        voiceTranscriptionUseCase$transcribeAudioFile$1.L$1 = null;
                        voiceTranscriptionUseCase$transcribeAudioFile$1.L$2 = null;
                        voiceTranscriptionUseCase$transcribeAudioFile$1.L$3 = null;
                        voiceTranscriptionUseCase$transcribeAudioFile$1.label = 4;
                    }
                    try {
                        voiceTranscriptionUseCase$transcribeAudioFile$1.L$2 = mutableSharedFlow3;
                        mutableSharedFlow5 = mutableSharedFlow2;
                        voiceTranscriptionUseCase$transcribeAudioFile$1.L$3 = mutableSharedFlow5;
                        voiceTranscriptionUseCase$transcribeAudioFile$1.label = 1;
                        obj = conversationRepository.transcribe(file, voiceTranscriptionUseCase$transcribeAudioFile$1);
                        if (obj != coroutine_suspended) {
                            mutableSharedFlow4 = mutableSharedFlow3;
                            mutableStateFlow3 = mutableStateFlow2;
                            voiceTranscriptionUseCase = this;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        voiceTranscriptionUseCase3 = this;
                        mutableSharedFlow4 = mutableSharedFlow3;
                        mutableStateFlow3 = mutableStateFlow2;
                        VoiceTranscriptionError.TranscriptionFailed transcriptionFailed2 = new VoiceTranscriptionError.TranscriptionFailed(e);
                        voiceTranscriptionUseCase$transcribeAudioFile$1.L$0 = null;
                        voiceTranscriptionUseCase$transcribeAudioFile$1.L$1 = null;
                        voiceTranscriptionUseCase$transcribeAudioFile$1.L$2 = null;
                        voiceTranscriptionUseCase$transcribeAudioFile$1.L$3 = null;
                        voiceTranscriptionUseCase$transcribeAudioFile$1.label = 4;
                    }
                    return coroutine_suspended;
                }
                if (r4 != 1) {
                    try {
                    } catch (Exception e4) {
                        e = e4;
                        mutableSharedFlow4 = r4;
                        mutableStateFlow3 = 3;
                    }
                    if (r4 != 2) {
                        if (r4 == 3) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            if (r4 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                    mutableSharedFlow6 = (MutableSharedFlow) voiceTranscriptionUseCase$transcribeAudioFile$1.L$2;
                    MutableStateFlow<ConversationClientState> mutableStateFlow4 = (MutableStateFlow) voiceTranscriptionUseCase$transcribeAudioFile$1.L$1;
                    VoiceTranscriptionUseCase voiceTranscriptionUseCase4 = (VoiceTranscriptionUseCase) voiceTranscriptionUseCase$transcribeAudioFile$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    mutableStateFlow3 = mutableStateFlow4;
                    voiceTranscriptionUseCase2 = voiceTranscriptionUseCase4;
                    do {
                        try {
                            value = mutableStateFlow3.getValue();
                        } catch (Exception e5) {
                            e = e5;
                            mutableSharedFlow4 = mutableSharedFlow6;
                            voiceTranscriptionUseCase3 = voiceTranscriptionUseCase2;
                        }
                    } while (!mutableStateFlow3.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, VoiceTranscriptionState.Idle.INSTANCE, 2097151, null)));
                    return Unit.INSTANCE;
                }
                MutableSharedFlow mutableSharedFlow7 = (MutableSharedFlow) voiceTranscriptionUseCase$transcribeAudioFile$1.L$3;
                mutableSharedFlow4 = (MutableSharedFlow) voiceTranscriptionUseCase$transcribeAudioFile$1.L$2;
                mutableStateFlow3 = (MutableStateFlow) voiceTranscriptionUseCase$transcribeAudioFile$1.L$1;
                VoiceTranscriptionUseCase voiceTranscriptionUseCase5 = (VoiceTranscriptionUseCase) voiceTranscriptionUseCase$transcribeAudioFile$1.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    mutableSharedFlow5 = mutableSharedFlow7;
                    voiceTranscriptionUseCase = voiceTranscriptionUseCase5;
                } catch (Exception e6) {
                    e = e6;
                    voiceTranscriptionUseCase3 = voiceTranscriptionUseCase5;
                }
                VoiceTranscriptionError.TranscriptionFailed transcriptionFailed22 = new VoiceTranscriptionError.TranscriptionFailed(e);
                voiceTranscriptionUseCase$transcribeAudioFile$1.L$0 = null;
                voiceTranscriptionUseCase$transcribeAudioFile$1.L$1 = null;
                voiceTranscriptionUseCase$transcribeAudioFile$1.L$2 = null;
                voiceTranscriptionUseCase$transcribeAudioFile$1.L$3 = null;
                voiceTranscriptionUseCase$transcribeAudioFile$1.label = 4;
                networkResponse = (NetworkResponse) obj;
                if (!(networkResponse instanceof NetworkResponse.Success)) {
                    String text = ((TranscribedText) ((NetworkResponse.Success) networkResponse).getBody()).getText();
                    do {
                        value2 = mutableStateFlow3.getValue();
                    } while (!mutableStateFlow3.compareAndSet(value2, ConversationClientState.copy$default(value2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, VoiceTranscriptionState.Completed.INSTANCE, 2097151, null)));
                    ComposerUiEffect.UpdateTranscribedText updateTranscribedText = new ComposerUiEffect.UpdateTranscribedText(text);
                    voiceTranscriptionUseCase$transcribeAudioFile$1.L$0 = voiceTranscriptionUseCase;
                    voiceTranscriptionUseCase$transcribeAudioFile$1.L$1 = mutableStateFlow3;
                    voiceTranscriptionUseCase$transcribeAudioFile$1.L$2 = mutableSharedFlow4;
                    voiceTranscriptionUseCase$transcribeAudioFile$1.L$3 = null;
                    voiceTranscriptionUseCase$transcribeAudioFile$1.label = 2;
                    if (mutableSharedFlow5.emit(updateTranscribedText, voiceTranscriptionUseCase$transcribeAudioFile$1) != coroutine_suspended) {
                        voiceTranscriptionUseCase2 = voiceTranscriptionUseCase;
                        mutableSharedFlow6 = mutableSharedFlow4;
                        do {
                            value = mutableStateFlow3.getValue();
                        } while (!mutableStateFlow3.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, VoiceTranscriptionState.Idle.INSTANCE, 2097151, null)));
                        return Unit.INSTANCE;
                    }
                } else {
                    if (networkResponse instanceof NetworkResponse.NetworkError) {
                        error = ((NetworkResponse.NetworkError) networkResponse).getError();
                    } else {
                        error = networkResponse instanceof NetworkResponse.ClientError ? ((NetworkResponse.ClientError) networkResponse).getError() : null;
                    }
                    VoiceTranscriptionError.TranscriptionFailed transcriptionFailed3 = new VoiceTranscriptionError.TranscriptionFailed(error);
                    voiceTranscriptionUseCase$transcribeAudioFile$1.L$0 = voiceTranscriptionUseCase;
                    voiceTranscriptionUseCase$transcribeAudioFile$1.L$1 = mutableStateFlow3;
                    voiceTranscriptionUseCase$transcribeAudioFile$1.L$2 = mutableSharedFlow4;
                    voiceTranscriptionUseCase$transcribeAudioFile$1.L$3 = null;
                    voiceTranscriptionUseCase$transcribeAudioFile$1.label = 3;
                }
                return coroutine_suspended;
            }
        }
        voiceTranscriptionUseCase$transcribeAudioFile$1 = new VoiceTranscriptionUseCase$transcribeAudioFile$1(this, continuation);
        Object obj2 = voiceTranscriptionUseCase$transcribeAudioFile$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r4 = voiceTranscriptionUseCase$transcribeAudioFile$1.label;
        VoiceTranscriptionUseCase voiceTranscriptionUseCase32 = 2;
        if (r4 != 0) {
        }
        networkResponse = (NetworkResponse) obj2;
        if (!(networkResponse instanceof NetworkResponse.Success)) {
        }
        return coroutine_suspended2;
    }

    private final boolean isFileSizeValid(File audioFile) {
        return audioFile.length() <= SentryReplayEvent.REPLAY_VIDEO_MAX_SIZE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateErrorState(VoiceTranscriptionError voiceTranscriptionError, MutableStateFlow<ConversationClientState> mutableStateFlow, MutableSharedFlow<ConversationUiEffect> mutableSharedFlow, Continuation<? super Unit> continuation) {
        ConversationClientState value;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, new VoiceTranscriptionState.Error(voiceTranscriptionError), 2097151, null)));
        Object emit = mutableSharedFlow.emit(ConversationUiEffect.UnlockScreenOrientation.INSTANCE, continuation);
        return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
    }
}
