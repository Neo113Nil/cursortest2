package ru.ozon.app.android.web.webview.cache;

import Bc.y;
import CJ.b;
import DM.c;
import Lm0.a;
import android.content.SharedPreferences;
import io.reactivex.C;
import io.reactivex.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.L;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.web.webview.cache.models.BothCacheStates;
import ru.ozon.app.android.web.webview.cache.models.CacheState;
import ru.ozon.app.android.web.webview.cache.service.CacheManifestRepository;
import ru.ozon.app.android.web.webview.cache.service.LocalCacheHelper;
import ru.ozon.app.android.web.webview.cache.service.LocalStateActualizer;
import ru.ozon.app.android.web.webview.cache.service.ResourcesDiffer;
import sc.C9653a;
import tc.InterfaceC9800b;
import wc.P;
import xc.C10699b;
import xc.C10701d;
import xc.f;
import xc.g;
import xc.j;
import xc.m;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001/B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010#H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/ozon/app/android/web/webview/cache/WebViewResourcesManagerImpl;", "Lru/ozon/app/android/web/webview/cache/WebViewResourcesManager;", "Lru/ozon/app/android/web/webview/cache/service/CacheManifestRepository;", "repository", "Landroid/content/SharedPreferences;", "prefs", "Lru/ozon/app/android/web/webview/cache/service/ResourcesDiffer;", "resourcesDiffer", "Lru/ozon/app/android/web/webview/cache/service/LocalCacheHelper;", "localCacheHelper", "Lru/ozon/app/android/web/webview/cache/service/LocalStateActualizer;", "localStateActualizer", "<init>", "(Lru/ozon/app/android/web/webview/cache/service/CacheManifestRepository;Landroid/content/SharedPreferences;Lru/ozon/app/android/web/webview/cache/service/ResourcesDiffer;Lru/ozon/app/android/web/webview/cache/service/LocalCacheHelper;Lru/ozon/app/android/web/webview/cache/service/LocalStateActualizer;)V", "Lru/ozon/app/android/web/webview/cache/models/CacheState;", "remoteCacheState", "Lru/ozon/app/android/web/webview/cache/models/BothCacheStates;", "mergeLocalAndRemoteStates", "(Lru/ozon/app/android/web/webview/cache/models/CacheState;)Lru/ozon/app/android/web/webview/cache/models/BothCacheStates;", "", "getLocalCacheVersion", "()Ljava/lang/String;", "version", "", "saveLocalCacheVersion", "(Ljava/lang/String;)V", "", "e", "handleError", "(Ljava/lang/Throwable;)V", "handleActualizeFinish", "()V", "", "batchSize", "parallelism", "Lkotlin/Function0;", "onFinished", "Lnc/b;", "actualizeCache", "(IILkotlin/jvm/functions/Function0;)Lnc/b;", "Lru/ozon/app/android/web/webview/cache/service/CacheManifestRepository;", "Landroid/content/SharedPreferences;", "Lru/ozon/app/android/web/webview/cache/service/ResourcesDiffer;", "Lru/ozon/app/android/web/webview/cache/service/LocalCacheHelper;", "Lru/ozon/app/android/web/webview/cache/service/LocalStateActualizer;", "inProgress", "Lnc/b;", "Companion", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebViewResourcesManagerImpl implements WebViewResourcesManager {
    private InterfaceC8487b inProgress;

    @NotNull
    private final LocalCacheHelper localCacheHelper;

    @NotNull
    private final LocalStateActualizer localStateActualizer;

    @NotNull
    private final SharedPreferences prefs;

    @NotNull
    private final CacheManifestRepository repository;

    @NotNull
    private final ResourcesDiffer resourcesDiffer;

    public WebViewResourcesManagerImpl(@NotNull CacheManifestRepository repository, @NotNull SharedPreferences prefs, @NotNull ResourcesDiffer resourcesDiffer, @NotNull LocalCacheHelper localCacheHelper, @NotNull LocalStateActualizer localStateActualizer) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(resourcesDiffer, "resourcesDiffer");
        Intrinsics.checkNotNullParameter(localCacheHelper, "localCacheHelper");
        Intrinsics.checkNotNullParameter(localStateActualizer, "localStateActualizer");
        this.repository = repository;
        this.prefs = prefs;
        this.resourcesDiffer = resourcesDiffer;
        this.localCacheHelper = localCacheHelper;
        this.localStateActualizer = localStateActualizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean actualizeCache$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BothCacheStates actualizeCache$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (BothCacheStates) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C actualizeCache$lambda$2(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getLocalCacheVersion() {
        String string = this.prefs.getString("PREF_WEB_VIEW_CACHE_MANIFEST_VERSION", "");
        return string == null ? "" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleActualizeFinish() {
        a.b bVar = Lm0.a.f17149a;
        bVar.b("WebViewCache");
        bVar.i("Actualizing of WebView cache has been finished", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleError(Throwable e11) {
        a.b bVar = Lm0.a.f17149a;
        bVar.b("WebViewCache");
        bVar.e(e11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BothCacheStates mergeLocalAndRemoteStates(CacheState remoteCacheState) {
        return new BothCacheStates(remoteCacheState, new CacheState(getLocalCacheVersion(), this.localCacheHelper.getLocalCachedResourcesList()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveLocalCacheVersion(String version) {
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.putString("PREF_WEB_VIEW_CACHE_MANIFEST_VERSION", version);
        edit.apply();
    }

    @Override // ru.ozon.app.android.web.webview.cache.WebViewResourcesManager
    @NotNull
    public synchronized InterfaceC8487b actualizeCache(int batchSize, int parallelism, Function0<Unit> onFinished) {
        Throwable th2;
        h a11;
        try {
            try {
                InterfaceC8487b interfaceC8487b = this.inProgress;
                if (interfaceC8487b != null) {
                    return interfaceC8487b;
                }
                L l11 = new L();
                C loadRemoteCacheState = this.repository.loadRemoteCacheState();
                loadRemoteCacheState.getClass();
                if (loadRemoteCacheState instanceof InterfaceC9800b) {
                    try {
                        a11 = ((InterfaceC9800b) loadRemoteCacheState).a();
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    a11 = new y(loadRemoteCacheState);
                }
                m mVar = new m(new C10701d(new g(new j(new f(new P(a11.h()), new DM.a(new WebViewResourcesManagerImpl$actualizeCache$1(this), 3)), new CJ.a(new WebViewResourcesManagerImpl$actualizeCache$2(this), 2)), new b(new WebViewResourcesManagerImpl$actualizeCache$3(this, batchSize, parallelism), 2)), new KY.a(this)), new BF.b(new WebViewResourcesManagerImpl$actualizeCache$5(this, l11), 4), C9653a.g(), C9653a.g());
                C10699b c10699b = new C10699b(new DM.b(new WebViewResourcesManagerImpl$actualizeCache$6(l11, batchSize, parallelism, this, onFinished), 2), new c(new WebViewResourcesManagerImpl$actualizeCache$7(this), 2), C9653a.f98523c);
                mVar.a(c10699b);
                Intrinsics.checkNotNullExpressionValue(c10699b, "subscribe(...)");
                return c10699b;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }
}
