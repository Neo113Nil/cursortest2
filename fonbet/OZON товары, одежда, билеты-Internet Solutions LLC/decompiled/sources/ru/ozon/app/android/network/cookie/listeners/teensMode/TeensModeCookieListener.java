package ru.ozon.app.android.network.cookie.listeners.teensMode;

import He.b;
import We.A;
import We.C4873o;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.cookie.CookieListener;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/network/cookie/listeners/teensMode/TeensModeCookieListener;", "Lru/ozon/app/android/network/cookie/CookieListener;", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "teensModeStorage", "<init>", "(Lru/ozon/app/android/storage/teensMode/TeensModeStorage;)V", "LWe/A;", ImagesContract.URL, "", "LWe/o;", "cookies", "", "saveFromResponse", "(LWe/A;Ljava/util/List;)V", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "Lxe/M;", "scope", "Lxe/M;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TeensModeCookieListener implements CookieListener {

    @NotNull
    private final M scope;

    @NotNull
    private final TeensModeStorage teensModeStorage;

    public TeensModeCookieListener(@NotNull TeensModeStorage teensModeStorage) {
        Intrinsics.checkNotNullParameter(teensModeStorage, "teensModeStorage");
        this.teensModeStorage = teensModeStorage;
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.scope = N.a(CoroutineContext.Element.a.d(b.f10879b, (H0) b11).plus(new TeensModeCookieListener$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
    }

    @Override // ru.ozon.app.android.network.cookie.CookieListener
    @NotNull
    public List<C4873o> fromRequest(@NotNull List<C4873o> list, @NotNull A a11) {
        return CookieListener.DefaultImpls.fromRequest(this, list, a11);
    }

    @Override // ru.ozon.app.android.network.cookie.CookieListener
    public void saveFromResponse(@NotNull A url, @NotNull List<C4873o> cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        C10727i.c(this.scope, null, null, new TeensModeCookieListener$saveFromResponse$1(cookies, this, null), 3);
    }
}
