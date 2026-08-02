package ru.ozon.app.android.session.security.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.session.security.UserAuthBiometrySettingsViewMapper;
import ru.ozon.app.android.session.security.data.UserAuthBiometrySettingsConfig;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/session/security/di/SecurityWidgetV1Module;", "", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class SecurityWidgetV1Module {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/session/security/di/SecurityWidgetV1Module$Companion;", "", "<init>", "()V", "provideWidget", "", "Lru/ozon/app/android/composer/di/Widget;", "userAuthBiometrySettingsConfig", "Lru/ozon/app/android/session/security/data/UserAuthBiometrySettingsConfig;", "userAuthBiometrySettingsViewMapper", "Lru/ozon/app/android/session/security/UserAuthBiometrySettingsViewMapper;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Widget> provideWidget(@NotNull UserAuthBiometrySettingsConfig userAuthBiometrySettingsConfig, @NotNull UserAuthBiometrySettingsViewMapper userAuthBiometrySettingsViewMapper) {
            Intrinsics.checkNotNullParameter(userAuthBiometrySettingsConfig, "userAuthBiometrySettingsConfig");
            Intrinsics.checkNotNullParameter(userAuthBiometrySettingsViewMapper, "userAuthBiometrySettingsViewMapper");
            return e0.h(new Widget("csma", "userAuthBiometrySettings", userAuthBiometrySettingsConfig, new UserAuthBiometrySettingsViewMapper[]{userAuthBiometrySettingsViewMapper}));
        }

        private Companion() {
        }
    }
}
