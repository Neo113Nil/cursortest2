package ru.ozon.app.android.network.cronet;

import We.A;
import We.B;
import We.G;
import We.L;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.interceptors.BXInterceptor;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001b\u0010\f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0002*\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lru/ozon/app/android/network/cronet/CronetAdaptUrlForCacheInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "", "beforeSaveToCache", "<init>", "(Z)V", "LWe/G;", "toHttp", "(LWe/G;)LWe/G;", "restoreHttps", "", "scheme", "withScheme", "(LWe/G;Ljava/lang/String;)LWe/G;", "notAdapted", "(LWe/G;)Z", "LWe/G$a;", "markAsAdapted", "(LWe/G$a;)LWe/G$a;", "removeAdaptedMark", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "Z", "Ljava/lang/Class;", "Lru/ozon/app/android/network/cronet/CronetAdaptUrlForCacheInterceptor$SchemeIsAdapted;", "schemeIsAdaptedTagName", "Ljava/lang/Class;", "Companion", "SchemeIsAdapted", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CronetAdaptUrlForCacheInterceptor extends BXInterceptor {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final boolean beforeSaveToCache;

    @NotNull
    private final Class<SchemeIsAdapted> schemeIsAdaptedTagName = SchemeIsAdapted.class;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/network/cronet/CronetAdaptUrlForCacheInterceptor$Companion;", "", "<init>", "()V", "HTTP", "", "HTTPS", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/network/cronet/CronetAdaptUrlForCacheInterceptor$SchemeIsAdapted;", "", "<init>", "()V", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class SchemeIsAdapted {

        @NotNull
        public static final SchemeIsAdapted INSTANCE = new SchemeIsAdapted();

        private SchemeIsAdapted() {
        }
    }

    public CronetAdaptUrlForCacheInterceptor(boolean z11) {
        this.beforeSaveToCache = z11;
    }

    private final G.a markAsAdapted(G.a aVar) {
        aVar.i(this.schemeIsAdaptedTagName, SchemeIsAdapted.INSTANCE);
        return aVar;
    }

    private final boolean notAdapted(G g10) {
        return g10.i(this.schemeIsAdaptedTagName) == null;
    }

    private final G.a removeAdaptedMark(G.a aVar) {
        aVar.i(this.schemeIsAdaptedTagName, null);
        return aVar;
    }

    private final G restoreHttps(G g10) {
        return notAdapted(g10) ? g10 : withScheme(g10, "https");
    }

    private final G toHttp(G g10) {
        return !g10.j().i() ? g10 : withScheme(g10, "http");
    }

    private final G withScheme(G g10, String str) {
        A.a j11 = g10.j().j();
        j11.s(str);
        A e11 = j11.e();
        G.a aVar = new G.a(g10);
        aVar.j(e11);
        if (str.equals("http")) {
            markAsAdapted(aVar);
        } else {
            removeAdaptedMark(aVar);
        }
        return aVar.b();
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        L proceed;
        G http;
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (this.beforeSaveToCache) {
            proceed = chain.proceed(toHttp(chain.request()));
            http = restoreHttps(proceed.L());
        } else {
            proceed = chain.proceed(restoreHttps(chain.request()));
            http = toHttp(proceed.L());
        }
        L.a aVar = new L.a(proceed);
        aVar.r(http);
        return aVar.c();
    }
}
