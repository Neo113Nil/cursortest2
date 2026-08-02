package ru.ozon.app.android.pikazon.interceptors;

import Ek.a;
import We.B;
import We.G;
import We.L;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pikazon/interceptors/WebPHeaderInterceptor;", "LWe/B;", "<init>", "()V", "LWe/B$a;", "chain", "LWe/L;", "intercept", "(LWe/B$a;)LWe/L;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WebPHeaderInterceptor implements B {
    @Override // We.B
    @NotNull
    public L intercept(@NotNull B.a chain) {
        G.a aVar = new G.a(a.a(chain, "chain"));
        aVar.d("Accept", "image/webp");
        return chain.proceed(aVar.b());
    }
}
