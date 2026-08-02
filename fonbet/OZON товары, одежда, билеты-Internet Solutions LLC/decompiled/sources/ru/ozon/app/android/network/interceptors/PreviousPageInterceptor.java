package ru.ozon.app.android.network.interceptors;

import Ib.a;
import We.B;
import We.G;
import We.L;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.common.NetworkHeadersDependencies;

@Metadata(d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u0015\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u000e\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/network/interceptors/PreviousPageInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "LIb/a;", "Lru/ozon/app/android/network/common/NetworkHeadersDependencies;", "networkHeadersDependenciesLazy", "<init>", "(LIb/a;)V", "", "", "pathSegments", "", "isPageJson", "(Ljava/util/List;)Z", "isActionV2", "isAsyncWidget", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "LIb/a;", "ru/ozon/app/android/network/interceptors/PreviousPageInterceptor$delegate$1", "delegate", "Lru/ozon/app/android/network/interceptors/PreviousPageInterceptor$delegate$1;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PreviousPageInterceptor extends BXInterceptor {

    @NotNull
    private final PreviousPageInterceptor$delegate$1 delegate;

    @NotNull
    private final a<NetworkHeadersDependencies> networkHeadersDependenciesLazy;

    /* JADX WARN: Type inference failed for: r2v1, types: [ru.ozon.app.android.network.interceptors.PreviousPageInterceptor$delegate$1] */
    public PreviousPageInterceptor(@NotNull a<NetworkHeadersDependencies> networkHeadersDependenciesLazy) {
        Intrinsics.checkNotNullParameter(networkHeadersDependenciesLazy, "networkHeadersDependenciesLazy");
        this.networkHeadersDependenciesLazy = networkHeadersDependenciesLazy;
        this.delegate = new X00.a() { // from class: ru.ozon.app.android.network.interceptors.PreviousPageInterceptor$delegate$1
            @Override // X00.a
            protected String getPreviousPageName() {
                a aVar;
                aVar = PreviousPageInterceptor.this.networkHeadersDependenciesLazy;
                return ((NetworkHeadersDependencies) aVar.get()).previousPageName();
            }

            @Override // X00.a
            protected boolean needAddHeader(G request) {
                boolean isPageJson;
                boolean isActionV2;
                boolean isAsyncWidget;
                Intrinsics.checkNotNullParameter(request, "request");
                List<String> l11 = request.j().l();
                if (((ArrayList) l11).size() < 3) {
                    return false;
                }
                isPageJson = PreviousPageInterceptor.this.isPageJson(l11);
                if (isPageJson) {
                    return true;
                }
                isActionV2 = PreviousPageInterceptor.this.isActionV2(l11);
                if (isActionV2) {
                    return true;
                }
                isAsyncWidget = PreviousPageInterceptor.this.isAsyncWidget(l11);
                return isAsyncWidget;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isActionV2(List<String> pathSegments) {
        return Intrinsics.d(pathSegments.get(0), "composer-api.bx") && Intrinsics.d(pathSegments.get(1), "_action") && Intrinsics.d(pathSegments.get(2), "v2");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAsyncWidget(List<String> pathSegments) {
        return Intrinsics.d(pathSegments.get(1), "widget") && Intrinsics.d(pathSegments.get(2), "json") && Intrinsics.d(C7714v.Q(3, pathSegments), "v2");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPageJson(List<String> pathSegments) {
        return Intrinsics.d(pathSegments.get(0), "composer-api.bx") && Intrinsics.d(pathSegments.get(1), "page") && Intrinsics.d(pathSegments.get(2), "json");
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return intercept(chain);
    }
}
