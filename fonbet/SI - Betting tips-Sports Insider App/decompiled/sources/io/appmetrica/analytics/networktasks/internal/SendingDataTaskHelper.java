package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.io.Compressor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseParser;
import java.io.IOException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class SendingDataTaskHelper {

    /* renamed from: a, reason: collision with root package name */
    private final RequestBodyEncrypter f15235a;

    /* renamed from: b, reason: collision with root package name */
    private final Compressor f15236b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeProvider f15237c;

    /* renamed from: d, reason: collision with root package name */
    private final RequestDataHolder f15238d;

    /* renamed from: e, reason: collision with root package name */
    private final ResponseDataHolder f15239e;

    /* renamed from: f, reason: collision with root package name */
    private final NetworkResponseHandler f15240f;

    public SendingDataTaskHelper(@NonNull RequestBodyEncrypter requestBodyEncrypter, @NonNull Compressor compressor, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this(requestBodyEncrypter, compressor, new SystemTimeProvider(), requestDataHolder, responseDataHolder, networkResponseHandler);
    }

    public boolean isResponseValid() {
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) this.f15240f.handle(this.f15239e);
        return response != null && "accepted".equals(response.mStatus);
    }

    public void onPerformRequest() {
        this.f15238d.applySendTime(this.f15237c.currentTimeMillis());
    }

    public boolean prepareAndSetPostData(@NonNull byte[] bArr) {
        byte[] encrypt;
        try {
            byte[] compress = this.f15236b.compress(bArr);
            if (compress != null && (encrypt = this.f15235a.encrypt(compress)) != null) {
                this.f15238d.setPostData(encrypt);
                return true;
            }
        } catch (IOException unused) {
        }
        return false;
    }

    public SendingDataTaskHelper(@NonNull RequestBodyEncrypter requestBodyEncrypter, @NonNull Compressor compressor, @NonNull TimeProvider timeProvider, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this.f15235a = requestBodyEncrypter;
        this.f15236b = compressor;
        this.f15237c = timeProvider;
        this.f15238d = requestDataHolder;
        this.f15239e = responseDataHolder;
        this.f15240f = networkResponseHandler;
    }
}
