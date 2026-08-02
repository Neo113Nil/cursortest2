package ru.ozon.app.android.composer.network;

import We.A;
import We.B;
import We.G;
import We.L;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.interceptors.BXInterceptor;
import ru.ozon.app.android.network.utils.UriExtKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/composer/network/TestCookieInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "<init>", "()V", "LWe/G;", "removeQueryIfNeed", "(LWe/G;)LWe/G;", "LWe/A$a;", "LWe/A;", ImagesContract.URL, "removeQueryFromComposerUrlIfNeed", "(LWe/A$a;LWe/A;)LWe/A$a;", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TestCookieInterceptor extends BXInterceptor {
    private final A.a removeQueryFromComposerUrlIfNeed(A.a aVar, A a11) {
        String p11 = a11.p(ImagesContract.URL);
        if (p11 == null || !h.t(p11, "__rr", false)) {
            return aVar;
        }
        aVar.y(ImagesContract.URL, UriExtKt.removeQueryParameter(Uri.parse(p11), "__rr").toString());
        return aVar;
    }

    private final G removeQueryIfNeed(G g10) {
        if (!h.t(g10.j().toString(), "__rr", false)) {
            return g10;
        }
        A.a j11 = g10.j().j();
        j11.q("__rr");
        A e11 = removeQueryFromComposerUrlIfNeed(j11, g10.j()).e();
        G.a aVar = new G.a(g10);
        aVar.j(e11);
        return aVar.b();
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return chain.proceed(removeQueryIfNeed(chain.request()));
    }
}
