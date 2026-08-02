package ru.ozon.app.android.network.cookie.listeners;

import We.A;
import We.C4873o;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.cookie.CookieListener;
import ru.ozon.app.android.storage.cookiePreference.ExtraCookieStorage;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/network/cookie/listeners/ExtraCookiesListener;", "Lru/ozon/app/android/network/cookie/CookieListener;", "Lru/ozon/app/android/storage/cookiePreference/ExtraCookieStorage;", "extraCookieStorage", "<init>", "(Lru/ozon/app/android/storage/cookiePreference/ExtraCookieStorage;)V", "", "LWe/o;", "cookies", "LWe/A;", ImagesContract.URL, "fromRequest", "(Ljava/util/List;LWe/A;)Ljava/util/List;", "Lru/ozon/app/android/storage/cookiePreference/ExtraCookieStorage;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExtraCookiesListener implements CookieListener {

    @NotNull
    private final ExtraCookieStorage extraCookieStorage;

    public ExtraCookiesListener(@NotNull ExtraCookieStorage extraCookieStorage) {
        Intrinsics.checkNotNullParameter(extraCookieStorage, "extraCookieStorage");
        this.extraCookieStorage = extraCookieStorage;
    }

    @Override // ru.ozon.app.android.network.cookie.CookieListener
    @NotNull
    public List<C4873o> fromRequest(@NotNull List<C4873o> cookies, @NotNull A url) {
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        Intrinsics.checkNotNullParameter(url, "url");
        Map<String, String> extraCookies = this.extraCookieStorage.getExtraCookies();
        if (extraCookies.isEmpty()) {
            return cookies;
        }
        ArrayList W02 = C7714v.W0(cookies);
        for (Map.Entry<String, String> entry : extraCookies.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            C4873o.a aVar = new C4873o.a();
            aVar.b(url.h());
            aVar.d(key);
            aVar.e(value);
            W02.add(aVar.a());
        }
        return W02;
    }

    @Override // ru.ozon.app.android.network.cookie.CookieListener
    public void saveFromResponse(@NotNull A a11, @NotNull List<C4873o> list) {
        CookieListener.DefaultImpls.saveFromResponse(this, a11, list);
    }
}
