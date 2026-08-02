package ru.ozon.app.android.app.launch.handlers.fetch;

import Ec.e;
import Kr.b;
import Mc.a;
import android.annotation.SuppressLint;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.reactivex.h;
import io.reactivex.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.thirdpartylibs.config.ThirdPartyLibrariesConfigService;
import ru.ozon.app.android.thirdpartylibs.config.ThirdPartyLibrary;
import sc.C9656b;
import wc.C10490k;
import wc.Q;
import wc.v;
import wc.y;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/app/launch/handlers/fetch/FirebaseAnalyticsFetchAction;", "", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "firebaseAnalytics", "Lru/ozon/app/android/thirdpartylibs/config/ThirdPartyLibrariesConfigService;", "configService", "<init>", "(Lcom/google/firebase/analytics/FirebaseAnalytics;Lru/ozon/app/android/thirdpartylibs/config/ThirdPartyLibrariesConfigService;)V", "", "isAvailable", "", "onResult", "(Z)V", "fetch", "()V", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "Lru/ozon/app/android/thirdpartylibs/config/ThirdPartyLibrariesConfigService;", "app-launch-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FirebaseAnalyticsFetchAction {

    @NotNull
    private final ThirdPartyLibrariesConfigService configService;

    @NotNull
    private final FirebaseAnalytics firebaseAnalytics;

    public FirebaseAnalyticsFetchAction(@NotNull FirebaseAnalytics firebaseAnalytics, @NotNull ThirdPartyLibrariesConfigService configService) {
        Intrinsics.checkNotNullParameter(firebaseAnalytics, "firebaseAnalytics");
        Intrinsics.checkNotNullParameter(configService, "configService");
        this.firebaseAnalytics = firebaseAnalytics;
        this.configService = configService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onResult(boolean isAvailable) {
        this.firebaseAnalytics.b(isAvailable);
    }

    @SuppressLint({"CheckResult"})
    public void fetch() {
        h<Boolean> isLibraryAvailable = this.configService.isLibraryAvailable(ThirdPartyLibrary.GOOGLE);
        x b11 = a.b();
        isLibraryAvailable.getClass();
        C9656b.c(b11, "scheduler is null");
        y f7 = new Q(isLibraryAvailable, b11, !(isLibraryAvailable instanceof C10490k)).f(C8125a.a());
        b bVar = new b(new FirebaseAnalyticsFetchAction$fetch$1(this), 1);
        Nl.a aVar = new Nl.a(new FirebaseAnalyticsFetchAction$fetch$2(Lm0.a.f17149a), 0);
        v vVar = v.INSTANCE;
        C9656b.c(vVar, "onSubscribe is null");
        f7.i(new e(bVar, aVar, vVar));
    }
}
