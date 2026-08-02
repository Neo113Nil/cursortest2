package io.ktor.http.cio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Multipart.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.http.cio.MultipartKt", f = "Multipart.kt", i = {0}, l = {113}, m = "parsePartHeadersImpl", n = {"builder"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class MultipartKt$parsePartHeadersImpl$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    MultipartKt$parsePartHeadersImpl$1(Continuation<? super MultipartKt$parsePartHeadersImpl$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object parsePartHeadersImpl;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        parsePartHeadersImpl = MultipartKt.parsePartHeadersImpl(null, this);
        return parsePartHeadersImpl;
    }
}
