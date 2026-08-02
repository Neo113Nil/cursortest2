package coil.fetch;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import io.sentry.protocol.Response;
import io.sentry.protocol.SentryStackTrace;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HttpUriFetcher.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", i = {0, 0, 0, 1, 1, 1}, l = {77, 106}, m = RemoteConfigComponent.FETCH_FILE_NAME, n = {"this", SentryStackTrace.JsonKeys.SNAPSHOT, "cacheStrategy", "this", SentryStackTrace.JsonKeys.SNAPSHOT, Response.TYPE}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes4.dex */
final class HttpUriFetcher$fetch$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpUriFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpUriFetcher$fetch$1(HttpUriFetcher httpUriFetcher, Continuation<? super HttpUriFetcher$fetch$1> continuation) {
        super(continuation);
        this.this$0 = httpUriFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetch(this);
    }
}
