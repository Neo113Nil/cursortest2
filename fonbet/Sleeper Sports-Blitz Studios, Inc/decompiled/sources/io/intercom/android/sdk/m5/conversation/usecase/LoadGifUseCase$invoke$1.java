package io.intercom.android.sdk.m5.conversation.usecase;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LoadGifUseCase.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.usecase.LoadGifUseCase", f = "LoadGifUseCase.kt", i = {0}, l = {17}, m = "invoke", n = {"clientStateFlow"}, s = {"L$0"})
/* loaded from: classes9.dex */
final class LoadGifUseCase$invoke$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoadGifUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoadGifUseCase$invoke$1(LoadGifUseCase loadGifUseCase, Continuation<? super LoadGifUseCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = loadGifUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, this);
    }
}
