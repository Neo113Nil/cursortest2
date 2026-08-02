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

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/network/interceptors/PageViewIdInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "LIb/a;", "Lru/ozon/app/android/network/common/NetworkHeadersDependencies;", "networkHeadersDependencies", "<init>", "(LIb/a;)V", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "LIb/a;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PageViewIdInterceptor extends BXInterceptor {

    @NotNull
    private final a<NetworkHeadersDependencies> networkHeadersDependencies;

    public PageViewIdInterceptor(@NotNull a<NetworkHeadersDependencies> networkHeadersDependencies) {
        Intrinsics.checkNotNullParameter(networkHeadersDependencies, "networkHeadersDependencies");
        this.networkHeadersDependencies = networkHeadersDependencies;
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        String pageViewId;
        Intrinsics.checkNotNullParameter(chain, "chain");
        G request = chain.request();
        List<String> l11 = request.j().l();
        ArrayList arrayList = (ArrayList) l11;
        if (arrayList.size() < 3) {
            return chain.proceed(chain.request());
        }
        if (!((Intrinsics.d(arrayList.get(0), "composer-api.bx") && Intrinsics.d(arrayList.get(1), "_action") && Intrinsics.d(arrayList.get(2), "v2")) || (Intrinsics.d(arrayList.get(1), "widget") && Intrinsics.d(arrayList.get(2), "json") && Intrinsics.d(C7714v.Q(3, l11), "v2"))) || (pageViewId = this.networkHeadersDependencies.get().pageViewId()) == null) {
            return chain.proceed(request);
        }
        G.a aVar = new G.a(request);
        aVar.d("x-page-view-id", pageViewId);
        return chain.proceed(aVar.b());
    }
}
