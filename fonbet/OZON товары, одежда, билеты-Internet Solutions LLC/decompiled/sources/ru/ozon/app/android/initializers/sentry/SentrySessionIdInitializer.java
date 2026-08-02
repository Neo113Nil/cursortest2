package ru.ozon.app.android.initializers.sentry;

import Ae.C2399j;
import Ae.C2408n0;
import Ib.a;
import Sc.InterfaceC4008j;
import io.sentry.K1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.csma.flags.OzonSentryHelperEnabledFlag;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.startup.initializers.ActionInitializer;
import ru.ozon.app.android.storage.auth.OzonIdCookieEvents;
import ru.ozon.app.android.utils.LazyUtilsKt;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/initializers/sentry/SentrySessionIdInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "LIb/a;", "Lru/ozon/app/android/storage/auth/OzonIdCookieEvents;", "cookieEventsLazy", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/initializers/sentry/SentrySampleRateHolder;", "sentrySampleRateSetter", "LOb0/a;", "ozonIdAppApi", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(LIb/a;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/initializers/sentry/SentrySampleRateHolder;LOb0/a;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "init", "()V", "LIb/a;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/initializers/sentry/SentrySampleRateHolder;", "LOb0/a;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lxe/M;", "scope$delegate", "LSc/j;", "getScope", "()Lxe/M;", "scope", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SentrySessionIdInitializer implements ActionInitializer {

    @NotNull
    private final a<OzonIdCookieEvents> cookieEventsLazy;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final Ob0.a ozonIdAppApi;

    /* renamed from: scope$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j scope;

    @NotNull
    private final SentrySampleRateHolder sentrySampleRateSetter;

    public SentrySessionIdInitializer(@NotNull a<OzonIdCookieEvents> cookieEventsLazy, @NotNull FeatureService featureService, @NotNull SentrySampleRateHolder sentrySampleRateSetter, @NotNull Ob0.a ozonIdAppApi, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(cookieEventsLazy, "cookieEventsLazy");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(sentrySampleRateSetter, "sentrySampleRateSetter");
        Intrinsics.checkNotNullParameter(ozonIdAppApi, "ozonIdAppApi");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.cookieEventsLazy = cookieEventsLazy;
        this.featureService = featureService;
        this.sentrySampleRateSetter = sentrySampleRateSetter;
        this.ozonIdAppApi = ozonIdAppApi;
        this.featureChecker = featureChecker;
        this.scope = LazyUtilsKt.unsafeLazy(SentrySessionIdInitializer$scope$2.INSTANCE);
    }

    @NotNull
    public final M getScope() {
        return (M) this.scope.getValue();
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        C10727i.c(getScope(), null, null, new SentrySessionIdInitializer$init$1(this, null), 3);
        if (this.featureChecker.isEnabled(OzonSentryHelperEnabledFlag.INSTANCE)) {
            return;
        }
        String sessionId = this.ozonIdAppApi.getSessionId();
        if (sessionId == null) {
            sessionId = "";
        }
        K1.j("sessionId", sessionId);
        C2399j.C(new C2408n0(this.cookieEventsLazy.get().getFlow(), new SentrySessionIdInitializer$init$2(this, null)), getScope());
    }
}
