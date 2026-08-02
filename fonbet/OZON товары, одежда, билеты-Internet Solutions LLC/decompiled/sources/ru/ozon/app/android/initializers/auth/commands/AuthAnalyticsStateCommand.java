package ru.ozon.app.android.initializers.auth.commands;

import fi0.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.csma.flags.OzonSentryHelperEnabledFlag;
import ru.ozon.app.android.initializers.auth.commands.AuthPriority;
import ru.ozon.app.android.location.ComposerLocationRepository;
import ru.ozon.app.android.logger.BxLogger;
import ru.ozon.app.android.logger.OzonLogger;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0016\u001a\u00020\u0010*\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/initializers/auth/commands/AuthAnalyticsStateCommand;", "Lru/ozon/app/android/initializers/auth/commands/AuthStateCommand;", "Lru/ozon/app/android/account/user/UserManager;", "userManager", "Lfi0/e;", "customPropertyTracker", "Lru/ozon/app/android/location/ComposerLocationRepository;", "areaRepository", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/account/user/UserManager;Lfi0/e;Lru/ozon/app/android/location/ComposerLocationRepository;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "userId", "", "isAuthenticated", "", "sendAnalytics", "(Ljava/lang/String;Z)V", "Lru/ozon/app/android/logger/OzonLogger;", "", "areaId", "setUser", "(Lru/ozon/app/android/logger/OzonLogger;Ljava/lang/String;ZJ)V", "isAuth", "onChange", "(Z)V", "Lru/ozon/app/android/account/user/UserManager;", "Lfi0/e;", "Lru/ozon/app/android/location/ComposerLocationRepository;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lru/ozon/app/android/initializers/auth/commands/AuthPriority;", "priority", "Lru/ozon/app/android/initializers/auth/commands/AuthPriority;", "getPriority", "()Lru/ozon/app/android/initializers/auth/commands/AuthPriority;", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AuthAnalyticsStateCommand extends AuthStateCommand {

    @NotNull
    private final ComposerLocationRepository areaRepository;

    @NotNull
    private final e customPropertyTracker;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final AuthPriority priority;

    @NotNull
    private final UserManager userManager;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/initializers/auth/commands/AuthAnalyticsStateCommand$Companion;", "", "<init>", "()V", "AREA_ID", "", "USER_LOGGED_IN", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AuthAnalyticsStateCommand(@NotNull UserManager userManager, @NotNull e customPropertyTracker, @NotNull ComposerLocationRepository areaRepository, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(customPropertyTracker, "customPropertyTracker");
        Intrinsics.checkNotNullParameter(areaRepository, "areaRepository");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.userManager = userManager;
        this.customPropertyTracker = customPropertyTracker;
        this.areaRepository = areaRepository;
        this.featureChecker = featureChecker;
        this.priority = AuthPriority.Low.INSTANCE;
    }

    private final void sendAnalytics(String userId, boolean isAuthenticated) {
        setUser(BxLogger.INSTANCE, userId, isAuthenticated, this.areaRepository.getCurrentAreaId());
        this.customPropertyTracker.setUserId(userId);
    }

    private final void setUser(OzonLogger ozonLogger, String str, boolean z11, long j11) {
        ozonLogger.putKey("AREA_ID", Long.valueOf(j11));
        ozonLogger.putKey("USER_LOGGED_IN", Boolean.valueOf(z11));
        if (this.featureChecker.isEnabled(OzonSentryHelperEnabledFlag.INSTANCE)) {
            return;
        }
        if (z11) {
            ozonLogger.setUserId(str);
        } else {
            ozonLogger.setUserId(null);
        }
    }

    @Override // ru.ozon.app.android.initializers.auth.commands.AuthStateCommand
    @NotNull
    public AuthPriority getPriority() {
        return this.priority;
    }

    @Override // ru.ozon.app.android.initializers.auth.commands.AuthStateCommand
    public void onChange(boolean isAuth) {
        sendAnalytics(String.valueOf(this.userManager.getUserId()), isAuth);
    }
}
