package com.playtika.sharedsdk.shaded.okhttp3.brotli;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.playtika.sharedsdk.shaded.okhttp3.CompressionInterceptor;
import com.playtika.sharedsdk.shaded.okio.BufferedSource;
import com.playtika.sharedsdk.shaded.okio.Okio;
import com.playtika.sharedsdk.shaded.okio.Source;
import com.playtika.sharedsdk.shaded.org.brotli.dec.BrotliInputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Brotli.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/playtika/sharedsdk/shaded/okhttp3/brotli/Brotli;", "Lcom/playtika/sharedsdk/shaded/okhttp3/CompressionInterceptor$DecompressionAlgorithm;", "<init>", "()V", "encoding", "", "getEncoding", "()Ljava/lang/String;", "decompress", "Lcom/playtika/sharedsdk/shaded/okio/Source;", "compressedSource", "Lcom/playtika/sharedsdk/shaded/okio/BufferedSource;", "okhttp-brotli"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Brotli implements CompressionInterceptor.DecompressionAlgorithm {
    public static final Brotli INSTANCE = new Brotli();

    private Brotli() {
    }

    @Override // com.playtika.sharedsdk.shaded.okhttp3.CompressionInterceptor.DecompressionAlgorithm
    public String getEncoding() {
        return TtmlNode.TAG_BR;
    }

    @Override // com.playtika.sharedsdk.shaded.okhttp3.CompressionInterceptor.DecompressionAlgorithm
    public Source decompress(BufferedSource compressedSource) {
        Intrinsics.checkNotNullParameter(compressedSource, "compressedSource");
        return Okio.source(new BrotliInputStream(compressedSource.inputStream()));
    }
}
