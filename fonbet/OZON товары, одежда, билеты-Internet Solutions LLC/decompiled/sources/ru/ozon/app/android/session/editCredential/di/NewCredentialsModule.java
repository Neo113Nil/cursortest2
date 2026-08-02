package ru.ozon.app.android.session.editCredential.di;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.session.editCredential.newCredentials.core.NewCredentialsConfig;
import ru.ozon.app.android.session.editCredential.newCredentials.presentation.NewCredentialsViewMapper;
import ru.ozon.app.android.session.editCredential.otp.core.OTPWidgetConfig;
import ru.ozon.app.android.session.editCredential.otp.presentation.OTPWidgetViewMapper;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/session/editCredential/di/NewCredentialsModule;", "", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class NewCredentialsModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/session/editCredential/di/NewCredentialsModule$Companion;", "", "<init>", "()V", "provideEditCredentialsWidget", "Lru/ozon/app/android/composer/di/Widget;", "config", "Lru/ozon/app/android/session/editCredential/newCredentials/core/NewCredentialsConfig;", "viewMapper", "Lru/ozon/app/android/session/editCredential/newCredentials/presentation/NewCredentialsViewMapper;", "provideOtpWidget", "otpWidgetConfig", "Lru/ozon/app/android/session/editCredential/otp/core/OTPWidgetConfig;", "otpWidgetViewMapper", "Lru/ozon/app/android/session/editCredential/otp/presentation/OTPWidgetViewMapper;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Widget provideEditCredentialsWidget(@NotNull NewCredentialsConfig config, @NotNull NewCredentialsViewMapper viewMapper) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
            return new Widget("csma", "editCredentials", config, new NewCredentialsViewMapper[]{viewMapper});
        }

        @NotNull
        public final Widget provideOtpWidget(@NotNull OTPWidgetConfig otpWidgetConfig, @NotNull OTPWidgetViewMapper otpWidgetViewMapper) {
            Intrinsics.checkNotNullParameter(otpWidgetConfig, "otpWidgetConfig");
            Intrinsics.checkNotNullParameter(otpWidgetViewMapper, "otpWidgetViewMapper");
            return new Widget("csma", "otp", otpWidgetConfig, new OTPWidgetViewMapper[]{otpWidgetViewMapper});
        }

        private Companion() {
        }
    }
}
