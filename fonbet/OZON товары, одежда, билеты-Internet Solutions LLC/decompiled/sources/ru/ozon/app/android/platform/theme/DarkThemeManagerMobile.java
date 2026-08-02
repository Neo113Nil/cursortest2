package ru.ozon.app.android.platform.theme;

import Sc.o;
import android.content.SharedPreferences;
import android.content.res.Resources;
import androidx.appcompat.app.j;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.ProcessLifecycleOwner;
import ei0.InterfaceC6369b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.theme.DarkThemeManager;

@Metadata(d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\b\u0005*\u0001\u001c\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/platform/theme/DarkThemeManagerMobile;", "Lru/ozon/app/android/platform/theme/DarkThemeManager;", "Landroid/content/SharedPreferences;", "preferences", "Lei0/b;", "ozonTracker", "Landroid/content/res/Resources;", "resources", "<init>", "(Landroid/content/SharedPreferences;Lei0/b;Landroid/content/res/Resources;)V", "Lru/ozon/app/android/platform/theme/DarkThemeManager$Status;", "", "toTheme", "(Lru/ozon/app/android/platform/theme/DarkThemeManager$Status;)Ljava/lang/String;", "", "isDarkMode", "(Landroid/content/res/Resources;)Z", "getStatus", "()Lru/ozon/app/android/platform/theme/DarkThemeManager$Status;", "status", "", "setStatus", "(Lru/ozon/app/android/platform/theme/DarkThemeManager$Status;)V", "update", "()V", "Landroid/content/SharedPreferences;", "Lei0/b;", "Landroid/content/res/Resources;", "ru/ozon/app/android/platform/theme/DarkThemeManagerMobile$lifecycleObserver$1", "lifecycleObserver", "Lru/ozon/app/android/platform/theme/DarkThemeManagerMobile$lifecycleObserver$1;", "Companion", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DarkThemeManagerMobile implements DarkThemeManager {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final DarkThemeManagerMobile$lifecycleObserver$1 lifecycleObserver;

    @NotNull
    private final InterfaceC6369b ozonTracker;

    @NotNull
    private final SharedPreferences preferences;

    @NotNull
    private final Resources resources;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/platform/theme/DarkThemeManagerMobile$Companion;", "", "<init>", "()V", "PREF_DARK_THEME_SETTINGS", "", "SYSTEM_DARK_THEME", "SYSTEM_LIGHT_THEME", "USER_DARK_THEME", "USER_LIGHT_THEME", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DarkThemeManager.Status.values().length];
            try {
                iArr[DarkThemeManager.Status.NIGHT_THEME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DarkThemeManager.Status.DAY_THEME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DarkThemeManager.Status.BY_SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.I, ru.ozon.app.android.platform.theme.DarkThemeManagerMobile$lifecycleObserver$1] */
    public DarkThemeManagerMobile(@NotNull SharedPreferences preferences, @NotNull InterfaceC6369b ozonTracker, @NotNull Resources resources) {
        ProcessLifecycleOwner processLifecycleOwner;
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.preferences = preferences;
        this.ozonTracker = ozonTracker;
        this.resources = resources;
        ?? r22 = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.platform.theme.DarkThemeManagerMobile$lifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                ProcessLifecycleOwner processLifecycleOwner2;
                Intrinsics.checkNotNullParameter(owner, "owner");
                int i11 = ProcessLifecycleOwner.f43231j;
                processLifecycleOwner2 = ProcessLifecycleOwner.f43230i;
                processLifecycleOwner2.getLifecycle().e(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                DarkThemeManagerMobile.this.update();
            }
        };
        this.lifecycleObserver = r22;
        int i11 = ProcessLifecycleOwner.f43231j;
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        processLifecycleOwner.getLifecycle().a(r22);
    }

    private final boolean isDarkMode(Resources resources) {
        return (resources.getConfiguration().uiMode & 48) == 32;
    }

    private final String toTheme(DarkThemeManager.Status status) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i11 == 1) {
            return "user_dark";
        }
        if (i11 == 2) {
            return "user_light";
        }
        if (i11 == 3) {
            return isDarkMode(this.resources) ? "system_dark" : "system_light";
        }
        throw new o();
    }

    @Override // ru.ozon.app.android.platform.theme.DarkThemeManager
    @NotNull
    public DarkThemeManager.Status getStatus() {
        SharedPreferences sharedPreferences = this.preferences;
        DarkThemeManager.Status status = DarkThemeManager.Status.BY_SYSTEM;
        int i11 = sharedPreferences.getInt("PREF_DARK_THEME_SETTINGS", status.getValue());
        DarkThemeManager.Status status2 = DarkThemeManager.Status.NIGHT_THEME;
        if (i11 == status2.getValue()) {
            return status2;
        }
        DarkThemeManager.Status status3 = DarkThemeManager.Status.DAY_THEME;
        return i11 == status3.getValue() ? status3 : status;
    }

    @Override // ru.ozon.app.android.platform.theme.DarkThemeManager
    public void setStatus(@NotNull DarkThemeManager.Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.ozonTracker.d(toTheme(status));
        j.L(status.getValue());
        this.preferences.edit().putInt("PREF_DARK_THEME_SETTINGS", status.getValue()).apply();
    }

    @Override // ru.ozon.app.android.platform.theme.DarkThemeManager
    public void update() {
        int m11 = j.m();
        DarkThemeManager.Status status = getStatus();
        this.ozonTracker.d(toTheme(status));
        if (m11 != status.getValue()) {
            setStatus(status);
        }
    }
}
