package ru.ozon.app.android.composer.network;

import We.B;
import We.L;
import We.M;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.ozon.app.android.network.interceptors.BXInterceptor;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/composer/network/ComposerHttpInterceptor;", "Lru/ozon/app/android/network/interceptors/BXInterceptor;", "<init>", "()V", "", "", "isHandledClientErrorCode", "(I)Z", "isServerErrorCode", "LWe/B$a;", "chain", "LWe/L;", "onIntercept", "(LWe/B$a;)LWe/L;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerHttpInterceptor extends BXInterceptor {
    private final boolean isHandledClientErrorCode(int i11) {
        return i11 != 401 && i11 != 403 && 400 <= i11 && i11 < 500;
    }

    private final boolean isServerErrorCode(int i11) {
        return 500 <= i11 && i11 < 600;
    }

    @Override // ru.ozon.app.android.network.interceptors.BXInterceptor
    @NotNull
    protected L onIntercept(@NotNull B.a chain) {
        M c11;
        Intrinsics.checkNotNullParameter(chain, "chain");
        L proceed = chain.proceed(chain.request());
        int m11 = proceed.m();
        if ((isHandledClientErrorCode(m11) || isServerErrorCode(m11)) && (c11 = proceed.c()) != null) {
            throw new HttpException(Response.error(c11, proceed));
        }
        return proceed;
    }
}
