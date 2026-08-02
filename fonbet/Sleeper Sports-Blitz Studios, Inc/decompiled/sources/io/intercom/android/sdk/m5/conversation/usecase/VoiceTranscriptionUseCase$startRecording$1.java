package io.intercom.android.sdk.m5.conversation.usecase;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: VoiceTranscriptionUseCase.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase", f = "VoiceTranscriptionUseCase.kt", i = {0, 0, 0, 1, 1, 1}, l = {33, 38, 43}, m = "startRecording", n = {"this", "clientState", "uiEffect", "this", "clientState", "uiEffect"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes9.dex */
final class VoiceTranscriptionUseCase$startRecording$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VoiceTranscriptionUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VoiceTranscriptionUseCase$startRecording$1(VoiceTranscriptionUseCase voiceTranscriptionUseCase, Continuation<? super VoiceTranscriptionUseCase$startRecording$1> continuation) {
        super(continuation);
        this.this$0 = voiceTranscriptionUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.startRecording(null, null, this);
    }
}
