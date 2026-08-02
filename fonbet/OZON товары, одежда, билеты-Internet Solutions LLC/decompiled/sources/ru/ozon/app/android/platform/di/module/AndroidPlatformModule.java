package ru.ozon.app.android.platform.di.module;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import ei0.InterfaceC6369b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.platform.bundle.state.ManualSaveRestoreStateDelegate;
import ru.ozon.app.android.platform.bundle.state.ManualStateBundleActivityCallback;
import ru.ozon.app.android.platform.bundle.state.ManualStateBundleDelegateProvider;
import ru.ozon.app.android.platform.theme.DarkThemeManager;
import ru.ozon.app.android.platform.theme.DarkThemeManagerMobile;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/platform/di/module/AndroidPlatformModule;", "", "Companion", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class AndroidPlatformModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/platform/di/module/AndroidPlatformModule$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/SharedPreferences;", "preferences", "Lei0/b;", "ozonTracker", "Lru/ozon/app/android/platform/theme/DarkThemeManager;", "bindDarkThemeManager", "(Landroid/content/Context;Landroid/content/SharedPreferences;Lei0/b;)Lru/ozon/app/android/platform/theme/DarkThemeManager;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/platform/bundle/state/ManualSaveRestoreStateDelegate;", "delegate", "Lru/ozon/app/android/platform/bundle/state/ManualStateBundleActivityCallback;", "provideManualStateBundleActivityCallback", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/platform/bundle/state/ManualSaveRestoreStateDelegate;)Lru/ozon/app/android/platform/bundle/state/ManualStateBundleActivityCallback;", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DarkThemeManager bindDarkThemeManager(@NotNull Context context, @NotNull SharedPreferences preferences, @NotNull InterfaceC6369b ozonTracker) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(preferences, "preferences");
            Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            return new DarkThemeManagerMobile(preferences, ozonTracker, resources);
        }

        @NotNull
        public final ManualStateBundleActivityCallback provideManualStateBundleActivityCallback(@NotNull FeatureChecker featureChecker, @NotNull ManualSaveRestoreStateDelegate delegate) {
            Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            return new ManualStateBundleActivityCallback(new ManualStateBundleDelegateProvider(featureChecker, delegate));
        }

        private Companion() {
        }
    }
}
