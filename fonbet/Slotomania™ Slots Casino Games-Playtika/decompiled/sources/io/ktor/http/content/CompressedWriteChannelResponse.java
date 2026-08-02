package io.ktor.http.content;

import com.appsflyer.AppsFlyerProperties;
import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.util.ContentEncoder;
import io.ktor.util.StringValuesKt;
import io.ktor.utils.io.ByteWriteChannel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;

/* compiled from: CompressedContent.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0011\u001a\u00020\u0010\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010)\u001a\u0004\u0018\u00010&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0016\u0010-\u001a\u0004\u0018\u00010*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u00101\u001a\u0004\u0018\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lio/ktor/http/content/CompressedWriteChannelResponse;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "original", "Lio/ktor/util/ContentEncoder;", "encoder", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lio/ktor/http/content/OutgoingContent$WriteChannelContent;Lio/ktor/util/ContentEncoder;Lkotlin/coroutines/CoroutineContext;)V", "", "T", "Lio/ktor/util/AttributeKey;", "key", "getProperty", "(Lio/ktor/util/AttributeKey;)Ljava/lang/Object;", "value", "", "setProperty", "(Lio/ktor/util/AttributeKey;Ljava/lang/Object;)V", "Lio/ktor/utils/io/ByteWriteChannel;", AppsFlyerProperties.CHANNEL, "writeTo", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "getOriginal", "()Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "Lio/ktor/util/ContentEncoder;", "getEncoder", "()Lio/ktor/util/ContentEncoder;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Lio/ktor/http/Headers;", "headers$delegate", "Lkotlin/Lazy;", "getHeaders", "()Lio/ktor/http/Headers;", "headers", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "contentType", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "status", "", "getContentLength", "()Ljava/lang/Long;", "contentLength", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class CompressedWriteChannelResponse extends OutgoingContent.WriteChannelContent {
    private final CoroutineContext coroutineContext;
    private final ContentEncoder encoder;

    /* renamed from: headers$delegate, reason: from kotlin metadata */
    private final Lazy headers;
    private final OutgoingContent.WriteChannelContent original;

    public final OutgoingContent.WriteChannelContent getOriginal() {
        return this.original;
    }

    public final ContentEncoder getEncoder() {
        return this.encoder;
    }

    public final CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public CompressedWriteChannelResponse(OutgoingContent.WriteChannelContent original, ContentEncoder encoder, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.original = original;
        this.encoder = encoder;
        this.coroutineContext = coroutineContext;
        this.headers = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: io.ktor.http.content.CompressedWriteChannelResponse$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Headers headers_delegate$lambda$2;
                headers_delegate$lambda$2 = CompressedWriteChannelResponse.headers_delegate$lambda$2(CompressedWriteChannelResponse.this);
                return headers_delegate$lambda$2;
            }
        });
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Headers getHeaders() {
        return (Headers) this.headers.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Headers headers_delegate$lambda$2(CompressedWriteChannelResponse compressedWriteChannelResponse) {
        String acceptEncoding;
        Headers.Companion companion = Headers.INSTANCE;
        HeadersBuilder headersBuilder = new HeadersBuilder(0, 1, null);
        StringValuesKt.appendFiltered$default(headersBuilder, compressedWriteChannelResponse.original.getHeaders(), false, new Function2() { // from class: io.ktor.http.content.CompressedWriteChannelResponse$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                boolean headers_delegate$lambda$2$lambda$1$lambda$0;
                headers_delegate$lambda$2$lambda$1$lambda$0 = CompressedWriteChannelResponse.headers_delegate$lambda$2$lambda$1$lambda$0((String) obj, (String) obj2);
                return Boolean.valueOf(headers_delegate$lambda$2$lambda$1$lambda$0);
            }
        }, 2, null);
        headersBuilder.append(HttpHeaders.INSTANCE.getContentEncoding(), compressedWriteChannelResponse.encoder.getName());
        String vary = HttpHeaders.INSTANCE.getVary();
        String str = compressedWriteChannelResponse.original.getHeaders().get(HttpHeaders.INSTANCE.getVary());
        if (str == null || (acceptEncoding = str + ", " + HttpHeaders.INSTANCE.getAcceptEncoding()) == null) {
            acceptEncoding = HttpHeaders.INSTANCE.getAcceptEncoding();
        }
        headersBuilder.append(vary, acceptEncoding);
        return headersBuilder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean headers_delegate$lambda$2$lambda$1$lambda$0(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return !StringsKt.equals(name, HttpHeaders.INSTANCE.getContentLength(), true);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public ContentType getContentType() {
        return this.original.getContentType();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public HttpStatusCode getStatus() {
        return this.original.getStatus();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Long getContentLength() {
        Long contentLength = this.original.getContentLength();
        if (contentLength != null) {
            Long predictCompressedLength = this.encoder.predictCompressedLength(contentLength.longValue());
            if (predictCompressedLength != null && predictCompressedLength.longValue() >= 0) {
                return predictCompressedLength;
            }
        }
        return null;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public <T> T getProperty(AttributeKey<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) this.original.getProperty(key);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public <T> void setProperty(AttributeKey<T> key, T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.original.setProperty(key, value);
    }

    @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
    public Object writeTo(ByteWriteChannel byteWriteChannel, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.coroutineContext, new CompressedWriteChannelResponse$writeTo$2(this, byteWriteChannel, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
