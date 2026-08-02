package ru.ozon.app.android.web.webview.cache;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/web/webview/cache/WebViewResourcesManager;", "", "", "batchSize", "parallelism", "Lkotlin/Function0;", "", "onFinished", "Lnc/b;", "actualizeCache", "(IILkotlin/jvm/functions/Function0;)Lnc/b;", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface WebViewResourcesManager {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InterfaceC8487b actualizeCache$default(WebViewResourcesManager webViewResourcesManager, int i11, int i12, Function0 function0, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: actualizeCache");
            }
            if ((i13 & 1) != 0) {
                i11 = 5;
            }
            if ((i13 & 2) != 0) {
                i12 = 50;
            }
            if ((i13 & 4) != 0) {
                function0 = null;
            }
            return webViewResourcesManager.actualizeCache(i11, i12, function0);
        }
    }

    @NotNull
    InterfaceC8487b actualizeCache(int batchSize, int parallelism, Function0<Unit> onFinished);
}
