package ru.ozon.app.android.session.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.session.deeplinks.CheckoutAuthComposerDeeplinkHandler;
import ru.ozon.app.android.session.deeplinks.DeleteAccountDeeplinkHandler;
import ru.ozon.app.android.session.deeplinks.DeleteAccountOtpDeeplinkHandler;
import ru.ozon.app.android.session.deeplinks.NewCredentialsDeeplinkHandler;
import ru.ozon.app.android.session.deeplinks.OTPDeeplinkHandler;
import ru.ozon.app.android.session.deeplinks.RequestPhoneAccessDeeplinkHandler;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/session/di/OzonIdSessionNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "", "LIZ/a;", "provideDeeplinkHandlersSet", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;Lru/ozon/app/android/network/abtool/FeatureChecker;)Ljava/util/Set;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OzonIdSessionNavigationModule {

    @NotNull
    public static final OzonIdSessionNavigationModule INSTANCE = new OzonIdSessionNavigationModule();

    private OzonIdSessionNavigationModule() {
    }

    @NotNull
    public final Set<a> provideDeeplinkHandlersSet(@NotNull AuthDestinationInterceptor authDestinationInterceptor, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        return e0.b(new RequestPhoneAccessDeeplinkHandler(), new DeleteAccountOtpDeeplinkHandler(authDestinationInterceptor), new DeleteAccountDeeplinkHandler(authDestinationInterceptor), new NewCredentialsDeeplinkHandler(), new CheckoutAuthComposerDeeplinkHandler(featureChecker), new OTPDeeplinkHandler());
    }
}
