package com.orkestapay.orkestapay.core.networking;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.core.Constants;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B#\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/orkestapay/orkestapay/core/networking/NetworkingClient;", "", "configuration", "Lcom/orkestapay/orkestapay/core/networking/CoreConfig;", "(Lcom/orkestapay/orkestapay/core/networking/CoreConfig;)V", "config", "http", "Lcom/orkestapay/orkestapay/core/networking/OrkestaHttp;", "language", "", "(Lcom/orkestapay/orkestapay/core/networking/CoreConfig;Lcom/orkestapay/orkestapay/core/networking/OrkestaHttp;Ljava/lang/String;)V", "createHttpRequestFromAPIRequest", "Lcom/orkestapay/orkestapay/core/networking/HttpRequest;", "apiRequest", "Lcom/orkestapay/orkestapay/core/networking/RestRequest;", "send", "Lcom/orkestapay/orkestapay/core/networking/HttpResponse;", "(Lcom/orkestapay/orkestapay/core/networking/RestRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkingClient {

    @NotNull
    private final CoreConfig config;

    @NotNull
    private final OrkestaHttp http;

    @NotNull
    private final String language;

    public NetworkingClient(@NotNull CoreConfig config, @NotNull OrkestaHttp http, @NotNull String language) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(http, "http");
        Intrinsics.checkNotNullParameter(language, "language");
        this.config = config;
        this.http = http;
        this.language = language;
    }

    private final HttpRequest createHttpRequestFromAPIRequest(RestRequest apiRequest, CoreConfig configuration) {
        String path = apiRequest.getPath();
        URL url = new URL(configuration.getEnvironment().getUrl() + path);
        HttpMethod method = apiRequest.getMethod();
        String body = apiRequest.getBody();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Constants.AUTHORIZATION_HEADER, "Basic " + Base64Kt.base64encoded(configuration.getMerchantId() + ':' + configuration.getPublicKey()));
        if (method == HttpMethod.POST) {
            linkedHashMap.put("Content-Type", "application/json");
        }
        return new HttpRequest(url, method, body, linkedHashMap);
    }

    @Nullable
    public final Object send(@NotNull RestRequest restRequest, @NotNull Continuation<? super HttpResponse> continuation) {
        return this.http.send(createHttpRequestFromAPIRequest(restRequest, this.config), continuation);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ NetworkingClient(CoreConfig coreConfig, OrkestaHttp orkestaHttp, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(coreConfig, orkestaHttp, str);
        if ((i10 & 2) != 0) {
            orkestaHttp = new OrkestaHttp(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        if ((i10 & 4) != 0) {
            str = Locale.getDefault().getLanguage();
            Intrinsics.checkNotNullExpressionValue(str, "getLanguage(...)");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NetworkingClient(@NotNull CoreConfig configuration) {
        this(configuration, new OrkestaHttp(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), r4, 4, null);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        String str = null;
    }
}
