package io.ktor.client.plugins.cookies;

import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.http.Cookie;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.Url;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.slf4j.Logger;

/* compiled from: HttpCookies.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u0002\u0010\t\u001a\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\u00020\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0002\u0010\u000b\u001a$\u0010\r\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\f\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00060\u000fj\u0002`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "Lio/ktor/http/Cookie;", "cookies", "", "renderClientCookies", "(Ljava/util/List;)Ljava/lang/String;", "Lio/ktor/client/HttpClient;", "Lio/ktor/http/Url;", "url", "(Lio/ktor/client/HttpClient;Lio/ktor/http/Url;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "urlString", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "name", "get", "(Ljava/util/List;Ljava/lang/String;)Lio/ktor/http/Cookie;", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HttpCookiesKt {
    private static final Logger LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpCookies");

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderClientCookies(List<Cookie> list) {
        return CollectionsKt.joinToString$default(list, "; ", null, null, 0, null, HttpCookiesKt$renderClientCookies$1.INSTANCE, 30, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object cookies(HttpClient httpClient, Url url, Continuation<? super List<Cookie>> continuation) {
        HttpCookiesKt$cookies$1 httpCookiesKt$cookies$1;
        int i;
        List list;
        if (continuation instanceof HttpCookiesKt$cookies$1) {
            httpCookiesKt$cookies$1 = (HttpCookiesKt$cookies$1) continuation;
            if ((httpCookiesKt$cookies$1.label & Integer.MIN_VALUE) != 0) {
                httpCookiesKt$cookies$1.label -= Integer.MIN_VALUE;
                Object obj = httpCookiesKt$cookies$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCookiesKt$cookies$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    HttpCookies httpCookies = (HttpCookies) HttpClientPluginKt.pluginOrNull(httpClient, HttpCookies.INSTANCE);
                    if (httpCookies != null) {
                        httpCookiesKt$cookies$1.label = 1;
                        obj = httpCookies.get(url, httpCookiesKt$cookies$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return CollectionsKt.emptyList();
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                list = (List) obj;
                if (list != null) {
                    return list;
                }
                return CollectionsKt.emptyList();
            }
        }
        httpCookiesKt$cookies$1 = new HttpCookiesKt$cookies$1(continuation);
        Object obj2 = httpCookiesKt$cookies$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCookiesKt$cookies$1.label;
        if (i != 0) {
        }
        list = (List) obj2;
        if (list != null) {
        }
        return CollectionsKt.emptyList();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object cookies(HttpClient httpClient, String str, Continuation<? super List<Cookie>> continuation) {
        HttpCookiesKt$cookies$2 httpCookiesKt$cookies$2;
        int i;
        List list;
        if (continuation instanceof HttpCookiesKt$cookies$2) {
            httpCookiesKt$cookies$2 = (HttpCookiesKt$cookies$2) continuation;
            if ((httpCookiesKt$cookies$2.label & Integer.MIN_VALUE) != 0) {
                httpCookiesKt$cookies$2.label -= Integer.MIN_VALUE;
                Object obj = httpCookiesKt$cookies$2.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCookiesKt$cookies$2.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    HttpCookies httpCookies = (HttpCookies) HttpClientPluginKt.pluginOrNull(httpClient, HttpCookies.INSTANCE);
                    if (httpCookies != null) {
                        Url Url = URLUtilsKt.Url(str);
                        httpCookiesKt$cookies$2.label = 1;
                        obj = httpCookies.get(Url, httpCookiesKt$cookies$2);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return CollectionsKt.emptyList();
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                list = (List) obj;
                if (list != null) {
                    return list;
                }
                return CollectionsKt.emptyList();
            }
        }
        httpCookiesKt$cookies$2 = new HttpCookiesKt$cookies$2(continuation);
        Object obj2 = httpCookiesKt$cookies$2.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCookiesKt$cookies$2.label;
        if (i != 0) {
        }
        list = (List) obj2;
        if (list != null) {
        }
        return CollectionsKt.emptyList();
    }

    public static final Cookie get(List<Cookie> list, String name) {
        Object obj;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((Cookie) obj).getName(), name)) {
                break;
            }
        }
        return (Cookie) obj;
    }
}
