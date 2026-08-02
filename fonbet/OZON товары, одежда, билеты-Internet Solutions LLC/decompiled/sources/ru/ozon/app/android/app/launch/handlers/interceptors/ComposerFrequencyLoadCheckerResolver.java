package ru.ozon.app.android.app.launch.handlers.interceptors;

import Ld0.a;
import Ld0.c;
import Od0.e;
import Sc.InterfaceC3999a;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/app/launch/handlers/interceptors/ComposerFrequencyLoadCheckerResolver;", "Lru/ozon/app/android/app/launch/handlers/interceptors/AppLaunchArgumentResolver;", "LLd0/c;", "limbDiStore", "<init>", "(LLd0/c;)V", "Landroid/content/Intent;", "intent", "", "canResolve", "(Landroid/content/Intent;)Z", "", "resolveIntent", "(Landroid/content/Intent;)V", "LLd0/c;", "Companion", "app-launch-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerFrequencyLoadCheckerResolver implements AppLaunchArgumentResolver {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final c limbDiStore;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/app/launch/handlers/interceptors/ComposerFrequencyLoadCheckerResolver$Companion;", "", "<init>", "()V", "ALERT_ON_FREQUENT_REFRESH_DISABLED", "", "COMPOSER_ALERT_DISABLED_SDK_KEY", "app-launch-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ComposerFrequencyLoadCheckerResolver(@NotNull c limbDiStore) {
        Intrinsics.checkNotNullParameter(limbDiStore, "limbDiStore");
        this.limbDiStore = limbDiStore;
    }

    @Override // ru.ozon.app.android.app.launch.handlers.interceptors.AppLaunchArgumentResolver
    public boolean canResolve(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return intent.hasExtra("ALERT_ON_FREQUENT_REFRESH_DISABLED");
    }

    @Override // ru.ozon.app.android.app.launch.handlers.interceptors.AppLaunchArgumentResolver
    public void resolveIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        intent.putExtra("COMPOSER_ALERTS_DISABLED", intent.getBooleanExtra("ALERT_ON_FREQUENT_REFRESH_DISABLED", false));
        a b11 = this.limbDiStore.b();
        Intrinsics.checkNotNullParameter(intent, "intent");
        b11.c(new e.b.a(intent));
    }
}
