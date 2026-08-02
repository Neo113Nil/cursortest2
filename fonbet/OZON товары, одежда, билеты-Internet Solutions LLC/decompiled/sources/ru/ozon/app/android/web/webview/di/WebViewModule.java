package ru.ozon.app.android.web.webview.di;

import Dc.d;
import Mc.a;
import Ve.C4598rp;
import io.reactivex.x;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.web.webview.cache.service.CacheManifestApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/web/webview/di/WebViewModule;", "", "Companion", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class WebViewModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/web/webview/di/WebViewModule$Companion;", "", "<init>", "()V", "Lretrofit2/Retrofit;", "retrofit", "Lru/ozon/app/android/web/webview/cache/service/CacheManifestApi;", "provideResourceApi", "(Lretrofit2/Retrofit;)Lru/ozon/app/android/web/webview/cache/service/CacheManifestApi;", "Lio/reactivex/x;", "provideLoadWebViewScheduler", "()Lio/reactivex/x;", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final x provideLoadWebViewScheduler() {
            ExecutorService newWorkStealingPool = Executors.newWorkStealingPool();
            int i11 = a.f17820e;
            d dVar = new d(newWorkStealingPool);
            Intrinsics.checkNotNullExpressionValue(dVar, "from(...)");
            return dVar;
        }

        @NotNull
        public final CacheManifestApi provideResourceApi(@NotNull Retrofit retrofit) {
            return (CacheManifestApi) C4598rp.b(retrofit, "retrofit", CacheManifestApi.class, "create(...)");
        }

        private Companion() {
        }
    }
}
