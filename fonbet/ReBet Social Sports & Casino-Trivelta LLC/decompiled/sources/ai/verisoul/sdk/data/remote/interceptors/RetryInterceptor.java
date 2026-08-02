package ai.verisoul.sdk.data.remote.interceptors;

import Ph.AbstractC1457j;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lai/verisoul/sdk/data/remote/interceptors/RetryInterceptor;", "Lokhttp3/Interceptor;", "maxRetries", "", "retryDelay", "", "(IJ)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RetryInterceptor implements Interceptor {
    private final int maxRetries;
    private final long retryDelay;

    public RetryInterceptor() {
        this(0, 0L, 3, null);
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        Response response = null;
        for (int i10 = 0; i10 < this.maxRetries; i10++) {
            try {
                response = chain.proceed(request);
            } catch (IOException e10) {
                System.out.println((Object) ("Network error: " + e10.getMessage() + ". Retrying in " + this.retryDelay + " ms... (Attempt " + (i10 + 1) + ")"));
                AbstractC1457j.b(null, new RetryInterceptor$intercept$1(this, null), 1, null);
            }
            if (response.isSuccessful()) {
                return response;
            }
        }
        if (response != null) {
            return response;
        }
        throw new IOException("Failed after " + this.maxRetries + " retries");
    }

    public RetryInterceptor(int i10, long j10) {
        this.maxRetries = i10;
        this.retryDelay = j10;
    }

    public /* synthetic */ RetryInterceptor(int i10, long j10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 3 : i10, (i11 & 2) != 0 ? 3000L : j10);
    }
}
