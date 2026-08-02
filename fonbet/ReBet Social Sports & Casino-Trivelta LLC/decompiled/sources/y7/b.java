package y7;

import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.imagepipeline.producers.AbstractC3020d;
import com.facebook.imagepipeline.producers.AbstractC3022f;
import com.facebook.imagepipeline.producers.C;
import com.facebook.imagepipeline.producers.InterfaceC3030n;
import com.facebook.imagepipeline.producers.X;
import com.facebook.imagepipeline.producers.e0;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y7.b;

/* loaded from: classes2.dex */
public class b extends AbstractC3020d {

    @NotNull
    private static final a Companion = new a(null);

    @NotNull
    private static final String FETCH_TIME = "fetch_time";

    @NotNull
    private static final String IMAGE_SIZE = "image_size";

    @NotNull
    private static final String QUEUE_TIME = "queue_time";

    @NotNull
    private static final String TOTAL_TIME = "total_time";

    @Nullable
    private final CacheControl cacheControl;

    @NotNull
    private final Call.Factory callFactory;

    @NotNull
    private final Executor cancellationExecutor;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: y7.b$b, reason: collision with other inner class name */
    public static final class C0972b extends C {

        /* renamed from: f, reason: collision with root package name */
        public long f68288f;

        /* renamed from: g, reason: collision with root package name */
        public long f68289g;

        /* renamed from: h, reason: collision with root package name */
        public long f68290h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0972b(InterfaceC3030n consumer, e0 producerContext) {
            super(consumer, producerContext);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        }
    }

    public static final class c extends AbstractC3022f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Call f68291a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f68292b;

        public c(Call call, b bVar) {
            this.f68291a = call;
            this.f68292b = bVar;
        }

        public static final void f(Call call) {
            call.cancel();
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void b() {
            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                this.f68291a.cancel();
                return;
            }
            Executor executor = this.f68292b.cancellationExecutor;
            final Call call = this.f68291a;
            executor.execute(new Runnable() { // from class: y7.c
                @Override // java.lang.Runnable
                public final void run() {
                    b.c.f(Call.this);
                }
            });
        }
    }

    public static final class d implements Callback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C0972b f68293a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f68294b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ X.a f68295c;

        public d(C0972b c0972b, b bVar, X.a aVar) {
            this.f68293a = c0972b;
            this.f68294b = bVar;
            this.f68295c = aVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException e10) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e10, "e");
            this.f68294b.a(call, e10, this.f68295c);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            this.f68293a.f68289g = SystemClock.elapsedRealtime();
            ResponseBody body = response.body();
            if (body == null) {
                b bVar = this.f68294b;
                bVar.a(call, bVar.b("Response body null: " + response, response), this.f68295c);
                return;
            }
            b bVar2 = this.f68294b;
            X.a aVar = this.f68295c;
            C0972b c0972b = this.f68293a;
            try {
                try {
                    if (response.isSuccessful()) {
                        B7.b c10 = B7.b.f814c.c(response.header("Content-Range"));
                        if (c10 != null && (c10.f816a != 0 || c10.f817b != Integer.MAX_VALUE)) {
                            c0972b.j(c10);
                            c0972b.i(8);
                        }
                        aVar.b(body.byteStream(), body.getContentLength() < 0 ? 0 : (int) body.getContentLength());
                    } else {
                        bVar2.a(call, bVar2.b("Unexpected HTTP code " + response, response), aVar);
                    }
                } catch (Exception e10) {
                    bVar2.a(call, e10, aVar);
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(body, null);
            } finally {
            }
        }
    }

    public /* synthetic */ b(Call.Factory factory, Executor executor, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(factory, executor, (i10 & 4) != 0 ? true : z10);
    }

    public final void a(Call call, Exception exc, X.a aVar) {
        if (call.getCanceled()) {
            aVar.a();
        } else {
            aVar.onFailure(exc);
        }
    }

    public final IOException b(String str, Response response) {
        return new IOException(str, y7.d.f68297c.a(response));
    }

    public void fetchWithRequest(@NotNull C0972b fetchState, @NotNull X.a callback, @NotNull Request request) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(request, "request");
        Call newCall = this.callFactory.newCall(request);
        fetchState.b().k(new c(newCall, this));
        newCall.enqueue(new d(fetchState, this, callback));
    }

    public b(Call.Factory callFactory, Executor cancellationExecutor, boolean z10) {
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        Intrinsics.checkNotNullParameter(cancellationExecutor, "cancellationExecutor");
        this.callFactory = callFactory;
        this.cancellationExecutor = cancellationExecutor;
        this.cacheControl = z10 ? new CacheControl.Builder().noStore().build() : null;
    }

    @Override // com.facebook.imagepipeline.producers.X
    @NotNull
    public C0972b createFetchState(@NotNull InterfaceC3030n consumer, @NotNull e0 context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        return new C0972b(consumer, context);
    }

    @Override // com.facebook.imagepipeline.producers.X
    public void fetch(C0972b fetchState, X.a callback) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        Intrinsics.checkNotNullParameter(callback, "callback");
        fetchState.f68288f = SystemClock.elapsedRealtime();
        Uri g10 = fetchState.g();
        Intrinsics.checkNotNullExpressionValue(g10, "getUri(...)");
        try {
            Request.Builder builder = new Request.Builder().url(g10.toString()).get();
            CacheControl cacheControl = this.cacheControl;
            if (cacheControl != null) {
                builder.cacheControl(cacheControl);
            }
            B7.b bytesRange = fetchState.b().D0().getBytesRange();
            if (bytesRange != null) {
                builder.addHeader("Range", bytesRange.f());
            }
            Request build = builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            fetchWithRequest(fetchState, callback, build);
        } catch (Exception e10) {
            callback.onFailure(e10);
        }
    }

    @Override // com.facebook.imagepipeline.producers.X
    @Nullable
    public Map<String, String> getExtraMap(@NotNull C0972b fetchState, int i10) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        return MapsKt.mapOf(TuplesKt.to(QUEUE_TIME, String.valueOf(fetchState.f68289g - fetchState.f68288f)), TuplesKt.to(FETCH_TIME, String.valueOf(fetchState.f68290h - fetchState.f68289g)), TuplesKt.to(TOTAL_TIME, String.valueOf(fetchState.f68290h - fetchState.f68288f)), TuplesKt.to(IMAGE_SIZE, String.valueOf(i10)));
    }

    @Override // com.facebook.imagepipeline.producers.X
    public void onFetchCompletion(@NotNull C0972b fetchState, int i10) {
        Intrinsics.checkNotNullParameter(fetchState, "fetchState");
        fetchState.f68290h = SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(OkHttpClient okHttpClient) {
        this(okHttpClient, r0, false, 4, null);
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        ExecutorService executorService = okHttpClient.dispatcher().executorService();
        Intrinsics.checkNotNullExpressionValue(executorService, "executorService(...)");
    }
}
