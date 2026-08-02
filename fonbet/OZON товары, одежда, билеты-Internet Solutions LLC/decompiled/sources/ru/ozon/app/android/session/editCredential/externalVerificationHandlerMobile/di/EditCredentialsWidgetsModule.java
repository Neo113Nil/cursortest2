package ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.core.ExternalVerificationHandlerMobileConfig;
import ru.ozon.app.android.session.editCredential.externalVerificationHandlerMobile.presentation.ExternalVerificationHandlerMobileViewMapperNoUi;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/di/EditCredentialsWidgetsModule;", "", "<init>", "()V", "provideExternalVerificationHandlerMobileWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/core/ExternalVerificationHandlerMobileConfig;", "viewMapper", "Lru/ozon/app/android/session/editCredential/externalVerificationHandlerMobile/presentation/ExternalVerificationHandlerMobileViewMapperNoUi;", "provideExternalVerificationHandlerMobileWidget$session_prodGoogleAllVendorsRelease", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EditCredentialsWidgetsModule {
    @NotNull
    public final Widget2 provideExternalVerificationHandlerMobileWidget$session_prodGoogleAllVendorsRelease(@NotNull ExternalVerificationHandlerMobileConfig config, @NotNull ExternalVerificationHandlerMobileViewMapperNoUi viewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        return new Widget2("csma", "externalVerificationHandlerMobile", config, new ViewMapper2[]{viewMapper});
    }
}
