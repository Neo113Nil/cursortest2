package ru.ozon.app.android.web.webview.cache.service;

import AF.d;
import Bc.o;
import Bc.y;
import Fn.C3055d;
import Lm0.a;
import Mc.a;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import androidx.recyclerview.widget.m;
import io.reactivex.C;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeResponse;
import ru.ozon.app.android.web.webview.cache.service.ResourcesCacheInterceptorImpl;
import tc.InterfaceC9800b;
import wc.P;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/web/webview/cache/service/ResourcesCacheInterceptorImpl;", "Lru/ozon/app/android/web/webview/cache/service/ResourcesCacheInterceptor;", "localCacheHelper", "Lru/ozon/app/android/web/webview/cache/service/LocalCacheHelper;", "<init>", "(Lru/ozon/app/android/web/webview/cache/service/LocalCacheHelper;)V", "cacheIndex", "", "", "intercept", "Landroid/webkit/WebResourceResponse;", "request", "Landroid/webkit/WebResourceRequest;", "reloadCacheIndex", "", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ResourcesCacheInterceptorImpl implements ResourcesCacheInterceptor {
    private List<String> cacheIndex;

    @NotNull
    private final LocalCacheHelper localCacheHelper;

    public ResourcesCacheInterceptorImpl(@NotNull LocalCacheHelper localCacheHelper) {
        Intrinsics.checkNotNullParameter(localCacheHelper, "localCacheHelper");
        this.localCacheHelper = localCacheHelper;
        reloadCacheIndex();
    }

    private final void reloadCacheIndex() {
        C oVar = new o(new Callable() { // from class: LY.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List reloadCacheIndex$lambda$3;
                reloadCacheIndex$lambda$3 = ResourcesCacheInterceptorImpl.reloadCacheIndex$lambda$3(ResourcesCacheInterceptorImpl.this);
                return reloadCacheIndex$lambda$3;
            }
        });
        new P((oVar instanceof InterfaceC9800b ? ((InterfaceC9800b) oVar).a() : new y(oVar)).h()).j(a.b()).g(C8125a.a()).h(new C3055d(new ResourcesCacheInterceptorImpl$reloadCacheIndex$2(this), 5), new d(new ResourcesCacheInterceptorImpl$reloadCacheIndex$3(Lm0.a.f17149a), 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List reloadCacheIndex$lambda$3(ResourcesCacheInterceptorImpl resourcesCacheInterceptorImpl) {
        return resourcesCacheInterceptorImpl.localCacheHelper.getLocalCachedResourcesList();
    }

    @Override // ru.ozon.app.android.web.webview.cache.service.ResourcesCacheInterceptor
    public WebResourceResponse intercept(@NotNull WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        String uri = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        String relativePathFromResourceUrl = this.localCacheHelper.getRelativePathFromResourceUrl(uri);
        List<String> list = this.cacheIndex;
        if (list == null || list.contains(relativePathFromResourceUrl)) {
            File absoluteFileFromRelativeCachePath = this.localCacheHelper.getAbsoluteFileFromRelativeCachePath(relativePathFromResourceUrl);
            if (!absoluteFileFromRelativeCachePath.exists() || absoluteFileFromRelativeCachePath.isDirectory()) {
                absoluteFileFromRelativeCachePath = null;
            }
            if (absoluteFileFromRelativeCachePath != null) {
                String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri));
                try {
                    a.b bVar = Lm0.a.f17149a;
                    bVar.b("WebViewCache");
                    bVar.d("Take resource from cache: " + absoluteFileFromRelativeCachePath.getAbsolutePath(), new Object[0]);
                    return new WebResourceResponse(mimeTypeFromExtension, StandardCharsets.UTF_8.name(), m.e.DEFAULT_DRAG_ANIMATION_DURATION, DiscountCodeResponse.RESULT_OK, U.l(new Pair("access-control-allow-origin", "*")), new FileInputStream(absoluteFileFromRelativeCachePath));
                } catch (IOException e11) {
                    a.b bVar2 = Lm0.a.f17149a;
                    bVar2.b("WebViewCache");
                    bVar2.e(e11);
                }
            }
        }
        return null;
    }
}
