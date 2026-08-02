package io.ktor.http.cio.internals;

import com.ironsource.B5;
import com.vungle.ads.internal.protos.Sdk;
import io.sentry.protocol.SentryThread;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Chars.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.http.cio.internals.CharsKt", f = "Chars.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {110, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE}, m = "writeIntHex", n = {"$this$writeIntHex", B5.R, SentryThread.JsonKeys.CURRENT, "digits", "$this$writeIntHex", B5.R, SentryThread.JsonKeys.CURRENT, "digits"}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"})
/* loaded from: classes.dex */
final class CharsKt$writeIntHex$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    CharsKt$writeIntHex$1(Continuation<? super CharsKt$writeIntHex$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CharsKt.writeIntHex(null, 0, this);
    }
}
