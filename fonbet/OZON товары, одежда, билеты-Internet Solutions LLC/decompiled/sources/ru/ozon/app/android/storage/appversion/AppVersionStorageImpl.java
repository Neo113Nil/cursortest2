package ru.ozon.app.android.storage.appversion;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.di.StorageComponentConfig;
import ru.ozon.app.android.utils.ApplicationUtilsKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\n \t*\u0004\u0018\u00010\f0\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\u000f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001f\u001a\u00020\u000f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u001b\u0010\"\u001a\u00020\u000f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001b¨\u0006$"}, d2 = {"Lru/ozon/app/android/storage/appversion/AppVersionStorageImpl;", "Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/storage/di/StorageComponentConfig;", "config", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/storage/di/StorageComponentConfig;)V", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getSharedPrefs", "()Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences$Editor;", "clearSharedPrefs", "()Landroid/content/SharedPreferences$Editor;", "", "version", "", "saveFakeVersion", "(Ljava/lang/String;)V", "clearFakeVersion", "()V", "Landroid/content/Context;", "Lru/ozon/app/android/storage/di/StorageComponentConfig;", "versionName$delegate", "LSc/j;", "getVersionName", "()Ljava/lang/String;", "versionName", "versionNameWithoutSuffix$delegate", "getVersionNameWithoutSuffix", "versionNameWithoutSuffix", "versionCode$delegate", "getVersionCode", "versionCode", "Companion", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppVersionStorageImpl implements AppVersionStorage {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final StorageComponentConfig config;

    @NotNull
    private final Context context;

    /* renamed from: versionCode$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j versionCode;

    /* renamed from: versionName$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j versionName;

    /* renamed from: versionNameWithoutSuffix$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j versionNameWithoutSuffix;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storage/appversion/AppVersionStorageImpl$Companion;", "", "<init>", "()V", "APP_VERSION_PREFERENCES", "", "VERSION_CODE", "VERSION_NAME", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AppVersionStorageImpl(@NotNull Context context, @NotNull StorageComponentConfig config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        this.context = context;
        this.config = config;
        this.versionName = k.b(new AppVersionStorageImpl$versionName$2(this));
        this.versionNameWithoutSuffix = k.b(new AppVersionStorageImpl$versionNameWithoutSuffix$2(this));
        this.versionCode = k.b(new AppVersionStorageImpl$versionCode$2(this));
    }

    private final SharedPreferences.Editor clearSharedPrefs() {
        return getSharedPrefs().edit().clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences getSharedPrefs() {
        return this.context.getSharedPreferences("app_version_preferences", 0);
    }

    @Override // ru.ozon.app.android.storage.appversion.AppVersionStorage
    public void clearFakeVersion() {
        clearSharedPrefs().apply();
        ApplicationUtilsKt.restartApp(this.context);
    }

    @Override // ru.ozon.app.android.storage.appversion.AppVersionStorage
    @NotNull
    public String getVersionCode() {
        return (String) this.versionCode.getValue();
    }

    @Override // ru.ozon.app.android.storage.appversion.AppVersionStorage
    @NotNull
    public String getVersionName() {
        return (String) this.versionName.getValue();
    }

    @Override // ru.ozon.app.android.storage.appversion.AppVersionStorage
    @NotNull
    public String getVersionNameWithoutSuffix() {
        return (String) this.versionNameWithoutSuffix.getValue();
    }

    @Override // ru.ozon.app.android.storage.appversion.AppVersionStorage
    public void saveFakeVersion(@NotNull String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        SharedPreferences.Editor clearSharedPrefs = clearSharedPrefs();
        List m11 = h.m(version, new String[]{"-"}, 0, 6);
        if (m11.size() < 2) {
            return;
        }
        clearSharedPrefs.putString("version_name", (String) m11.get(0));
        clearSharedPrefs.putString("version_code", (String) m11.get(1));
        clearSharedPrefs.apply();
        ApplicationUtilsKt.restartApp(this.context);
    }
}
