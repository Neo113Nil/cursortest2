package ru.ozon.app.android.network.cookie.handler;

import We.A;
import We.C4873o;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.cookiePreference.ExtraCookieStorage;
import zb0.g;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/network/cookie/handler/ExtraCookiesHandler;", "Lzb0/g;", "Lru/ozon/app/android/network/cookie/handler/GNCEnabledChecker;", "Lru/ozon/app/android/storage/cookiePreference/ExtraCookieStorage;", "extraCookieStorage", "<init>", "(Lru/ozon/app/android/storage/cookiePreference/ExtraCookieStorage;)V", "LWe/A;", ImagesContract.URL, "", "LWe/o;", "cookies", "handleCookiesForRequest", "(LWe/A;Ljava/util/List;)Ljava/util/List;", "", "handleCookiesFromResponse", "(LWe/A;Ljava/util/List;)V", "Lru/ozon/app/android/storage/cookiePreference/ExtraCookieStorage;", "Lkotlin/Function0;", "", "isEnabled", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "setEnabled", "(Lkotlin/jvm/functions/Function0;)V", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExtraCookiesHandler extends g implements GNCEnabledChecker {

    @NotNull
    private final ExtraCookieStorage extraCookieStorage;

    @NotNull
    private Function0<Boolean> isEnabled;

    public ExtraCookiesHandler(@NotNull ExtraCookieStorage extraCookieStorage) {
        Intrinsics.checkNotNullParameter(extraCookieStorage, "extraCookieStorage");
        this.extraCookieStorage = extraCookieStorage;
        this.isEnabled = ExtraCookiesHandler$isEnabled$1.INSTANCE;
    }

    @Override // zb0.g
    @NotNull
    public List<C4873o> handleCookiesForRequest(@NotNull A url, @NotNull List<C4873o> cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        if (isEnabled().invoke().booleanValue()) {
            Map<String, String> extraCookies = this.extraCookieStorage.getExtraCookies();
            if (!extraCookies.isEmpty()) {
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
        }
        return cookies;
    }

    @Override // zb0.g
    public void handleCookiesFromResponse(@NotNull A url, @NotNull List<C4873o> cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
    }

    @NotNull
    public Function0<Boolean> isEnabled() {
        return this.isEnabled;
    }

    @Override // ru.ozon.app.android.network.cookie.handler.GNCEnabledChecker
    public void setEnabled(@NotNull Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.isEnabled = function0;
    }
}
