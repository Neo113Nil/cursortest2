package ru.ozon.app.android.composer.network;

import We.B;
import We.G;
import We.L;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.interceptors.BXInterceptor;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/composer/network/ComposerFirstLoadInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "<init>", "()V", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "", "isFirstLoad", "Z", "Companion", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerFirstLoadInterceptor extends BXInterceptor {
    private volatile boolean isFirstLoad = true;
    public static final int $stable = 8;

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (this.isFirstLoad) {
            synchronized (this) {
                if (this.isFirstLoad) {
                    G request = chain.request();
                    request.getClass();
                    G.a aVar = new G.a(request);
                    aVar.a("firstLoad", "true");
                    L proceed = chain.proceed(aVar.b());
                    if (proceed.v()) {
                        this.isFirstLoad = false;
                    }
                    return proceed;
                }
                Unit unit = Unit.f71690a;
            }
        }
        return chain.proceed(chain.request());
    }
}
