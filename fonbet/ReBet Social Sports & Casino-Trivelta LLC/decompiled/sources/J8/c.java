package J8;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.imagepipeline.producers.X;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import y7.b;

/* loaded from: classes2.dex */
public final class c extends y7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f5961a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(OkHttpClient mOkHttpClient) {
        super(mOkHttpClient);
        Intrinsics.checkNotNullParameter(mOkHttpClient, "mOkHttpClient");
        ExecutorService executorService = mOkHttpClient.dispatcher().executorService();
        Intrinsics.checkNotNullExpressionValue(executorService, "mOkHttpClient.dispatcher().executorService()");
        this.f5961a = executorService;
    }

    @Override // y7.b, com.facebook.imagepipeline.producers.X
    public void fetch(b.C0972b fetchState, X.a callback) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        Intrinsics.checkNotNullParameter(callback, "callback");
        fetchState.f68288f = SystemClock.elapsedRealtime();
        Uri g10 = fetchState.g();
        Intrinsics.checkNotNullExpressionValue(g10, "fetchState.uri");
        Map emptyMap = MapsKt.emptyMap();
        if (fetchState.b().D0() instanceof b) {
            com.facebook.imagepipeline.request.b D02 = fetchState.b().D0();
            Intrinsics.checkNotNull(D02, "null cannot be cast to non-null type com.giphy.sdk.core.GPHNetworkImageRequest");
            emptyMap = ((b) D02).c();
            if (emptyMap == null) {
                emptyMap = MapsKt.emptyMap();
            }
        }
        Request request = new Request.Builder().cacheControl(new CacheControl.Builder().noStore().build()).url(g10.toString()).headers(Headers.of((Map<String, String>) emptyMap)).get().build();
        Intrinsics.checkNotNullExpressionValue(request, "request");
        fetchWithRequest(fetchState, callback, request);
    }
}
