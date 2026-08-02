package io.intercom.android.sdk.m5.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MediaCompression.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.utils.MediaCompressionKt", f = "MediaCompression.kt", i = {0, 0, 0}, l = {133}, m = "getCompressedMediaData", n = {"uncompressedMediaData", "context", "videoNameWithoutExtension"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes9.dex */
final class MediaCompressionKt$getCompressedMediaData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    MediaCompressionKt$getCompressedMediaData$1(Continuation<? super MediaCompressionKt$getCompressedMediaData$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MediaCompressionKt.getCompressedMediaData(null, null, this);
    }
}
