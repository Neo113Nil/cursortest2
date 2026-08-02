package ru.ozon.app.android.fresh.feature.b2b.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.deeplink.AddConsigneeDeeplinkHandler;
import ru.ozon.app.android.fresh.feature.b2b.deeplink.AddEdoDeeplinkHandler;
import ru.ozon.app.android.fresh.feature.b2b.deeplink.DocsDeliveryFormDeeplinkHandler;
import ru.ozon.app.android.fresh.feature.b2b.deeplink.FaqDeeplinkHandler;
import ru.ozon.app.android.fresh.feature.b2b.deeplink.LegalDetailsEditorDeeplinkHandler;
import ru.ozon.app.android.fresh.feature.b2b.deeplink.LegalDocsDeeplinkHandler;
import ru.ozon.app.android.fresh.feature.b2b.deeplink.LegalsDeeplinkHandler;
import ru.ozon.app.android.fresh.feature.b2b.deeplink.ReconciliationActsDeclinerDeeplinkHandler;
import ru.ozon.app.android.fresh.feature.b2b.deeplink.RegistrationDeeplinkHandler;
import ru.ozon.app.android.fresh.feature.b2b.deeplink.RoleInvitationCreatorDeeplinkHandler;
import ru.ozon.app.android.fresh.feature.b2b.deeplink.SimpleInfoDeepLinkHandler;
import ru.ozon.app.android.fresh.feature.b2b.deeplink.VerificationEdoCheckingUserDeeplinkHandler;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/di/B2BNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "", "LIZ/a;", "Lru/ozon/app/android/navigation/handlers/DeeplinkHandler;", "provideDeeplinkHandlersSet", "(Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;)Ljava/util/Set;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class B2BNavigationModule {

    @NotNull
    public static final B2BNavigationModule INSTANCE = new B2BNavigationModule();

    private B2BNavigationModule() {
    }

    @NotNull
    public final Set<a> provideDeeplinkHandlersSet(@NotNull AuthDestinationInterceptor authDestinationInterceptor) {
        Intrinsics.checkNotNullParameter(authDestinationInterceptor, "authDestinationInterceptor");
        return e0.b(new AddEdoDeeplinkHandler(), new LegalDocsDeeplinkHandler(), new LegalsDeeplinkHandler(), new DocsDeliveryFormDeeplinkHandler(), new FaqDeeplinkHandler(), new LegalDetailsEditorDeeplinkHandler(), new SimpleInfoDeepLinkHandler(), new ReconciliationActsDeclinerDeeplinkHandler(), new AddConsigneeDeeplinkHandler(), new VerificationEdoCheckingUserDeeplinkHandler(), new RegistrationDeeplinkHandler(authDestinationInterceptor), new RoleInvitationCreatorDeeplinkHandler());
    }
}
