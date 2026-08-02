package com.playtika.sharedsdk.shaded.okhttp3.brotli;

import com.playtika.sharedsdk.shaded.okhttp3.CompressionInterceptor;
import com.playtika.sharedsdk.shaded.okhttp3.Gzip;
import kotlin.Metadata;

/* compiled from: BrotliInterceptor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/playtika/sharedsdk/shaded/okhttp3/brotli/BrotliInterceptor;", "Lcom/playtika/sharedsdk/shaded/okhttp3/CompressionInterceptor;", "<init>", "()V", "okhttp-brotli"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BrotliInterceptor extends CompressionInterceptor {
    public static final BrotliInterceptor INSTANCE = new BrotliInterceptor();

    private BrotliInterceptor() {
        super(Brotli.INSTANCE, Gzip.INSTANCE);
    }
}
