package com.orkestapay.orkestapay.core.networking;

import Ph.P;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "Lcom/orkestapay/orkestapay/core/networking/HttpResponse;", "<anonymous>", "(LPh/P;)Lcom/orkestapay/orkestapay/core/networking/HttpResponse;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.orkestapay.orkestapay.core.networking.OrkestaHttp$send$2", f = "OrkestaHttp.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class OrkestaHttp$send$2 extends SuspendLambda implements Function2<P, Continuation<? super HttpResponse>, Object> {
    final /* synthetic */ HttpRequest $httpRequest;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OrkestaHttp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrkestaHttp$send$2(HttpRequest httpRequest, OrkestaHttp orkestaHttp, Continuation<? super OrkestaHttp$send$2> continuation) {
        super(2, continuation);
        this.$httpRequest = httpRequest;
        this.this$0 = orkestaHttp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        OrkestaHttp$send$2 orkestaHttp$send$2 = new OrkestaHttp$send$2(this.$httpRequest, this.this$0, continuation);
        orkestaHttp$send$2.L$0 = obj;
        return orkestaHttp$send$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super HttpResponse> continuation) {
        return ((OrkestaHttp$send$2) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m147constructorimpl;
        HttpResponseParser httpResponseParser;
        byte[] bArr;
        String unused;
        String unused2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        HttpRequest httpRequest = this.$httpRequest;
        OrkestaHttp orkestaHttp = this.this$0;
        try {
            Result.Companion companion = Result.INSTANCE;
            URLConnection openConnection = httpRequest.getUrl().openConnection();
            Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestMethod(httpRequest.getMethod().name());
            for (Map.Entry<String, String> entry : httpRequest.getHeaders().entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            if (httpRequest.getMethod() == HttpMethod.POST) {
                try {
                    httpURLConnection.setDoOutput(true);
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    String body = httpRequest.getBody();
                    if (body != null) {
                        bArr = body.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bArr, "this as java.lang.String).getBytes(charset)");
                    } else {
                        bArr = null;
                    }
                    outputStream.write(bArr);
                    httpURLConnection.getOutputStream().flush();
                    httpURLConnection.getOutputStream().close();
                } catch (IOException e10) {
                    unused = OrkestaHttp.TAG;
                    unused2 = OrkestaHttp.TAG;
                    e10.getStackTrace().toString();
                }
            }
            httpURLConnection.connect();
            httpResponseParser = orkestaHttp.httpResponseParser;
            m147constructorimpl = Result.m147constructorimpl(httpResponseParser.parse(httpURLConnection));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            m147constructorimpl = Result.m147constructorimpl(new HttpResponse(m150exceptionOrNullimpl instanceof UnknownHostException ? -2 : m150exceptionOrNullimpl instanceof IllegalStateException ? -3 : -1, null, null, m150exceptionOrNullimpl, 6, null));
        }
        Object obj2 = Result.m153isFailureimpl(m147constructorimpl) ? null : m147constructorimpl;
        Intrinsics.checkNotNull(obj2);
        return obj2;
    }
}
