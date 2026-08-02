package ru.ozon.app.android.composer.domain.api;

import L00.b;
import L00.c;
import L00.g;
import L00.h;
import L00.j;
import Qj0.r0;
import We.C;
import We.E;
import We.G;
import We.InterfaceC4865g;
import We.J;
import We.K;
import We.L;
import We.M;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import ru.ozon.app.android.composer.domain.api.ComposerApiImpl;
import ru.ozon.app.android.composer.domain.cache.CacheTime;
import ru.ozon.app.android.composer.domain.cache.ComposerCache;
import ru.ozon.app.android.composer.domain.decode.OkHttpHeaders;
import ru.ozon.app.android.composer.network.join.CallFinishedEventBus;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0013\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/composer/domain/api/ComposerApiImpl;", "LL00/b;", "LWe/E;", "client", "Lru/ozon/app/android/composer/domain/cache/ComposerCache;", "cache", "<init>", "(LWe/E;Lru/ozon/app/android/composer/domain/cache/ComposerCache;)V", "LWe/L;", "LL00/g;", "request", "LL00/j;", "toComposerResponse", "(LWe/L;LL00/g;)LL00/j;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "cacheTime", "getCacheResponseOnError", "(Ljava/lang/Exception;LL00/g;I)LL00/j;", "LL00/c;", "call", "execute", "(LL00/c;)LL00/j;", "LWe/E;", "Lru/ozon/app/android/composer/domain/cache/ComposerCache;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerApiImpl implements b {

    @NotNull
    private final ComposerCache cache;

    @NotNull
    private final E client;

    public ComposerApiImpl(@NotNull E client, @NotNull ComposerCache cache) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.client = client;
        this.cache = cache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$3(InterfaceC4865g interfaceC4865g) {
        interfaceC4865g.cancel();
        CallFinishedEventBus.INSTANCE.emit(interfaceC4865g);
    }

    private final j getCacheResponseOnError(Exception exception, g request, int cacheTime) {
        if (!(exception instanceof HttpException) && !(exception instanceof SocketTimeoutException) && !(exception instanceof UnknownHostException) && !(exception instanceof ConnectException)) {
            throw exception;
        }
        j fileCache = this.cache.getFileCache(cacheTime, request.j());
        if (fileCache != null) {
            return fileCache;
        }
        throw exception;
    }

    private final j toComposerResponse(L l11, g gVar) {
        if (l11.v()) {
            int m11 = l11.m();
            String w11 = l11.w();
            M c11 = l11.c();
            return j.b.b(gVar, m11, w11, c11 != null ? c11.string() : null, new OkHttpHeaders(l11.r()), l11, l11.j(), l11.x());
        }
        String str = null;
        int m12 = l11.m();
        String w12 = l11.w();
        M c12 = l11.c();
        if (c12 != null) {
            str = c12.string();
        }
        return j.b.a(gVar, m12, w12, str, new OkHttpHeaders(l11.r()), l11);
    }

    @Override // L00.b
    @NotNull
    public j execute(@NotNull c call) {
        byte[] b11;
        Intrinsics.checkNotNullParameter(call, "call");
        g c11 = call.c();
        h c12 = c11.c();
        CacheTime cacheTime = (CacheTime) c11.l();
        int time = cacheTime != null ? cacheTime.getTime() : 0;
        E e11 = this.client;
        G.a aVar = new G.a();
        aVar.k(c11.j());
        String e12 = c11.e();
        J j11 = null;
        C c13 = null;
        j11 = null;
        if (c12 != null && (b11 = c12.b()) != null) {
            K.Companion companion = K.INSTANCE;
            String c14 = c12.c();
            if (c14 != null) {
                C.f33536g.getClass();
                c13 = C.a.b(c14);
            }
            int a11 = c12.a();
            companion.getClass();
            j11 = K.Companion.c(b11, c13, 0, a11);
        }
        aVar.f(j11, e12);
        aVar.i(r0.class, new r0(c11.k()));
        for (Map.Entry<String, String> entry : c11.d().entrySet()) {
            aVar.d(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<Class<?>, Object> entry2 : c11.i().entrySet()) {
            Class<?> key = entry2.getKey();
            Object value = entry2.getValue();
            Intrinsics.g(key, "null cannot be cast to non-null type java.lang.Class<in kotlin.Any>");
            aVar.i(key, value);
        }
        final InterfaceC4865g a12 = e11.a(aVar.b());
        call.d(new c.a() { // from class: Hr.a
            @Override // L00.c.a
            public final void cancel() {
                ComposerApiImpl.execute$lambda$3(InterfaceC4865g.this);
            }
        });
        try {
            try {
                L execute = a12.execute();
                try {
                    j composerResponse = toComposerResponse(execute, c11);
                    execute.close();
                    ComposerCache composerCache = this.cache;
                    String a13 = composerResponse.a();
                    if (a13 == null) {
                        a13 = "";
                    }
                    composerCache.put(time, a13, c11.j());
                    CallFinishedEventBus.INSTANCE.emit(a12);
                    return composerResponse;
                } finally {
                }
            } catch (Exception e13) {
                j cacheResponseOnError = getCacheResponseOnError(e13, c11, time);
                CallFinishedEventBus.INSTANCE.emit(a12);
                return cacheResponseOnError;
            }
        } catch (Throwable th2) {
            CallFinishedEventBus.INSTANCE.emit(a12);
            throw th2;
        }
    }
}
