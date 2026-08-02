package ru.ozon.app.android.analytics.store;

import Sc.InterfaceC4008j;
import Xc.a;
import Xc.b;
import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00062\u00020\u0001:\u0003\u0006\u0007\bR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/analytics/store/OzonInstallStore;", "", "storeName", "", "getStoreName", "()Ljava/lang/String;", "Companion", "Unknown", "Known", "Lru/ozon/app/android/analytics/store/OzonInstallStore$Known;", "Lru/ozon/app/android/analytics/store/OzonInstallStore$Unknown;", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OzonInstallStore {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR'\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/analytics/store/OzonInstallStore$Companion;", "", "<init>", "()V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/analytics/store/OzonInstallStore;", "getByPackageName", "(Ljava/lang/String;)Lru/ozon/app/android/analytics/store/OzonInstallStore;", "", "Lru/ozon/app/android/analytics/store/OzonInstallStore$Known;", "packages$delegate", "LSc/j;", "getPackages", "()Ljava/util/Map;", "packages", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* renamed from: packages$delegate, reason: from kotlin metadata */
        @NotNull
        private static final InterfaceC4008j<Map<String, Known>> packages = LazyUtilsKt.unsafeLazy(OzonInstallStore$Companion$packages$2.INSTANCE);

        private Companion() {
        }

        private final Map<String, Known> getPackages() {
            return packages.getValue();
        }

        @NotNull
        public final OzonInstallStore getByPackageName(String value) {
            Known known = getPackages().get(value);
            return known != null ? known : Unknown.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/analytics/store/OzonInstallStore$Known;", "Lru/ozon/app/android/analytics/store/OzonInstallStore;", "", "packageName", "", "appLinkPart", "storeName", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPackageName", "()Ljava/lang/String;", "getStoreName", "VK_RU_STORE", "GOOGLE_PLAY_MARKET", "HUAWEI_APP_GALLERY", "XIAOMI_GET_APPS", "SAMSUNG_GALAXY_STORE", "HONOR_APP_MARKET", "appLink", "Landroid/net/Uri;", "appPackage", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Known implements OzonInstallStore {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Known[] $VALUES;

        @NotNull
        private final String appLinkPart;

        @NotNull
        private final String packageName;

        @NotNull
        private final String storeName;
        public static final Known VK_RU_STORE = new Known("VK_RU_STORE", 0, "ru.vk.store", "rustore://apps.rustore.ru/app/", "RuStore");
        public static final Known GOOGLE_PLAY_MARKET = new Known("GOOGLE_PLAY_MARKET", 1, "com.android.vending", "market://details?id=", "Google Play");
        public static final Known HUAWEI_APP_GALLERY = new Known("HUAWEI_APP_GALLERY", 2, "com.huawei.appmarket", "appmarket://details?id=", "App Gallery");
        public static final Known XIAOMI_GET_APPS = new Known("XIAOMI_GET_APPS", 3, "com.xiaomi.mipicks", "mimarket://details?id=", "GetApps");
        public static final Known SAMSUNG_GALAXY_STORE = new Known("SAMSUNG_GALAXY_STORE", 4, "com.sec.android.app.samsungapps", "samsungapps://ProductDetail/", "Galaxy Store");
        public static final Known HONOR_APP_MARKET = new Known("HONOR_APP_MARKET", 5, "com.hihonor.appmarket", "appmarket://details?id=", "AppMarket");

        private static final /* synthetic */ Known[] $values() {
            return new Known[]{VK_RU_STORE, GOOGLE_PLAY_MARKET, HUAWEI_APP_GALLERY, XIAOMI_GET_APPS, SAMSUNG_GALAXY_STORE, HONOR_APP_MARKET};
        }

        static {
            Known[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Known(String str, int i11, String str2, String str3, String str4) {
            this.packageName = str2;
            this.appLinkPart = str3;
            this.storeName = str4;
        }

        @NotNull
        public static a<Known> getEntries() {
            return $ENTRIES;
        }

        public static Known valueOf(String str) {
            return (Known) Enum.valueOf(Known.class, str);
        }

        public static Known[] values() {
            return (Known[]) $VALUES.clone();
        }

        @NotNull
        public final Uri appLink(@NotNull String appPackage) {
            Intrinsics.checkNotNullParameter(appPackage, "appPackage");
            return Uri.parse(this.appLinkPart + appPackage);
        }

        @NotNull
        public final String getPackageName() {
            return this.packageName;
        }

        @Override // ru.ozon.app.android.analytics.store.OzonInstallStore
        @NotNull
        public String getStoreName() {
            return this.storeName;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/analytics/store/OzonInstallStore$Unknown;", "Lru/ozon/app/android/analytics/store/OzonInstallStore;", "<init>", "()V", "storeName", "", "getStoreName", "()Ljava/lang/Void;", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Unknown implements OzonInstallStore {

        @NotNull
        public static final Unknown INSTANCE = new Unknown();
        private static final Void storeName = null;

        private Unknown() {
        }

        @Override // ru.ozon.app.android.analytics.store.OzonInstallStore
        public /* bridge */ /* synthetic */ String getStoreName() {
            return (String) m487getStoreName();
        }

        /* renamed from: getStoreName, reason: collision with other method in class */
        public Void m487getStoreName() {
            return storeName;
        }
    }

    String getStoreName();
}
