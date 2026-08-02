package ru.ozon.app.android.network.cookie;

import Ob0.a;
import Sc.InterfaceC4008j;
import Sc.k;
import We.A;
import We.C4873o;
import We.InterfaceC4875q;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R\u001b\u0010\u0019\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/network/cookie/OzCookieJar;", "LWe/q;", "", "Lru/ozon/app/android/network/cookie/CookieListener;", "cookieListeners", "LOb0/a;", "ozonIdAppApi", "<init>", "(Ljava/util/Set;LOb0/a;)V", "LWe/A;", ImagesContract.URL, "", "LWe/o;", "cookies", "", "saveFromResponse", "(LWe/A;Ljava/util/List;)V", "loadForRequest", "(LWe/A;)Ljava/util/List;", "Ljava/util/Set;", "LOb0/a;", "cookieJar$delegate", "LSc/j;", "getCookieJar", "()LWe/q;", "cookieJar", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OzCookieJar implements InterfaceC4875q {

    /* renamed from: cookieJar$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j cookieJar;

    @NotNull
    private final Set<CookieListener> cookieListeners;

    @NotNull
    private final a ozonIdAppApi;

    public OzCookieJar(@NotNull Set<CookieListener> cookieListeners, @NotNull a ozonIdAppApi) {
        Intrinsics.checkNotNullParameter(cookieListeners, "cookieListeners");
        Intrinsics.checkNotNullParameter(ozonIdAppApi, "ozonIdAppApi");
        this.cookieListeners = cookieListeners;
        this.ozonIdAppApi = ozonIdAppApi;
        this.cookieJar = k.b(new OzCookieJar$cookieJar$2(this));
    }

    private final InterfaceC4875q getCookieJar() {
        return (InterfaceC4875q) this.cookieJar.getValue();
    }

    @Override // We.InterfaceC4875q
    @NotNull
    public List<C4873o> loadForRequest(@NotNull A url) {
        Intrinsics.checkNotNullParameter(url, "url");
        List<C4873o> loadForRequest = getCookieJar().loadForRequest(url);
        Iterator<T> it = this.cookieListeners.iterator();
        while (it.hasNext()) {
            loadForRequest = ((CookieListener) it.next()).fromRequest(loadForRequest, url);
        }
        return loadForRequest;
    }

    @Override // We.InterfaceC4875q
    public void saveFromResponse(@NotNull A url, @NotNull List<C4873o> cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        getCookieJar().saveFromResponse(url, cookies);
        Iterator<T> it = this.cookieListeners.iterator();
        while (it.hasNext()) {
            ((CookieListener) it.next()).saveFromResponse(url, cookies);
        }
    }
}
