package ru.ozon.app.android.universalwidgets.failedExternalLinkRetry.deeplinkInterceptor;

import GZ.j;
import KZ.c;
import Sc.InterfaceC4008j;
import Sc.k;
import android.app.Application;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.FailedExternalLinkRetryInteractor;
import ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.di.FailedExternalLinkRetryComponentApi;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00060\u0006j\u0002`\u00072\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/universalwidgets/failedExternalLinkRetry/deeplinkInterceptor/FailedExternalLinkRetryInterceptor;", "LKZ/c;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canIntercept", "(LGZ/j;)Z", "intercept", "(LGZ/j;)LGZ/j;", "Landroid/app/Application;", "Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/FailedExternalLinkRetryInteractor;", "externalLinkRetryInteractor$delegate", "LSc/j;", "getExternalLinkRetryInteractor", "()Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/FailedExternalLinkRetryInteractor;", "externalLinkRetryInteractor", "Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/di/FailedExternalLinkRetryComponentApi;", "getFailedExternalLinkRetryComponentApi", "()Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/di/FailedExternalLinkRetryComponentApi;", "failedExternalLinkRetryComponentApi", "getExternalLinkRetryEnabled", "()Z", "externalLinkRetryEnabled", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FailedExternalLinkRetryInterceptor implements c {

    @NotNull
    private final Application application;

    /* renamed from: externalLinkRetryInteractor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j externalLinkRetryInteractor;

    public FailedExternalLinkRetryInterceptor(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
        this.externalLinkRetryInteractor = k.b(new FailedExternalLinkRetryInterceptor$externalLinkRetryInteractor$2(this));
    }

    private final boolean getExternalLinkRetryEnabled() {
        return getFailedExternalLinkRetryComponentApi().getFailedExternalLinkRetryFeatureChecker().isEnabled();
    }

    private final FailedExternalLinkRetryInteractor getExternalLinkRetryInteractor() {
        return (FailedExternalLinkRetryInteractor) this.externalLinkRetryInteractor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FailedExternalLinkRetryComponentApi getFailedExternalLinkRetryComponentApi() {
        Application application = this.application;
        if (FailedExternalLinkRetryComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component FailedExternalLinkRetryComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(application, FailedExternalLinkRetryComponentApi.class).getDependencyStorage();
        if (FailedExternalLinkRetryComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component FailedExternalLinkRetryComponentApi is not DiComponent");
        }
        return (FailedExternalLinkRetryComponentApi) dependencyStorage.b(FailedExternalLinkRetryComponentApi.class);
    }

    @Override // KZ.c
    public boolean canIntercept(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return getExternalLinkRetryEnabled();
    }

    @Override // KZ.a
    @NotNull
    public j intercept(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        if (route.c() == GZ.c.EXTERNAL) {
            getExternalLinkRetryInteractor().setExternalLink(route.b(), route.d());
        }
        return route;
    }
}
