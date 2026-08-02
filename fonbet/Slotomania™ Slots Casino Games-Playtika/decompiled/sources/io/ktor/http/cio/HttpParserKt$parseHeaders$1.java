package io.ktor.http.cio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpParser.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.http.cio.HttpParserKt", f = "HttpParser.kt", i = {0}, l = {106}, m = "parseHeaders", n = {"builder"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class HttpParserKt$parseHeaders$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    HttpParserKt$parseHeaders$1(Continuation<? super HttpParserKt$parseHeaders$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HttpParserKt.parseHeaders(null, this);
    }
}
