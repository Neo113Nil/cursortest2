package com.orkestapay.orkestapay.core.networking;

import Ph.AbstractC1455i;
import Ph.C1452g0;
import Ph.L;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/orkestapay/orkestapay/core/networking/OrkestaHttp;", "", "LPh/L;", "dispatcher", "Lcom/orkestapay/orkestapay/core/networking/HttpResponseParser;", "httpResponseParser", "<init>", "(LPh/L;Lcom/orkestapay/orkestapay/core/networking/HttpResponseParser;)V", "Lcom/orkestapay/orkestapay/core/networking/HttpRequest;", "httpRequest", "Lcom/orkestapay/orkestapay/core/networking/HttpResponse;", "send", "(Lcom/orkestapay/orkestapay/core/networking/HttpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LPh/L;", "Lcom/orkestapay/orkestapay/core/networking/HttpResponseParser;", "Companion", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrkestaHttp {

    @Nullable
    private static final String TAG = Reflection.getOrCreateKotlinClass(OrkestaHttp.class).getQualifiedName();

    @NotNull
    private final L dispatcher;

    @NotNull
    private final HttpResponseParser httpResponseParser;

    /* JADX WARN: Multi-variable type inference failed */
    public OrkestaHttp() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    public final Object send(@NotNull HttpRequest httpRequest, @NotNull Continuation<? super HttpResponse> continuation) {
        return AbstractC1455i.g(this.dispatcher, new OrkestaHttp$send$2(httpRequest, this, null), continuation);
    }

    public OrkestaHttp(@NotNull L dispatcher, @NotNull HttpResponseParser httpResponseParser) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(httpResponseParser, "httpResponseParser");
        this.dispatcher = dispatcher;
        this.httpResponseParser = httpResponseParser;
    }

    public /* synthetic */ OrkestaHttp(L l10, HttpResponseParser httpResponseParser, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C1452g0.b() : l10, (i10 & 2) != 0 ? new HttpResponseParser() : httpResponseParser);
    }
}
