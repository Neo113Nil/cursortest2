package ru.ozon.app.android.analytics.store;

import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.r;
import Sc.s;
import android.content.Context;
import android.content.pm.InstallSourceInfo;
import android.os.Build;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.store.OzonInstallStore;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0007\u0010\nR\u001b\u0010\u001d\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\n¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/analytics/store/AppStoreInfoProviderImpl;", "Lru/ozon/app/android/analytics/store/AppStoreInfoProvider;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getInstallStorePackage", "(Landroid/content/Context;)Ljava/lang/String;", "retrievePackageName", "()Ljava/lang/String;", "retrieveStoreName", "Landroid/content/Context;", "Lru/ozon/app/android/analytics/store/OzonInstallStore;", "installStore$delegate", "LSc/j;", "getInstallStore", "()Lru/ozon/app/android/analytics/store/OzonInstallStore;", "installStore", "", "Lru/ozon/app/android/analytics/store/OzonInstallStore$Known;", "appStores$delegate", "getAppStores", "()Ljava/util/List;", "appStores", "installStorePackage$delegate", "installStorePackage", "storeName$delegate", "getStoreName", "storeName", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppStoreInfoProviderImpl implements AppStoreInfoProvider {

    /* renamed from: appStores$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j appStores;

    @NotNull
    private final Context context;

    /* renamed from: installStore$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j installStore;

    /* renamed from: installStorePackage$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j installStorePackage;

    /* renamed from: storeName$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j storeName;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/analytics/store/AppStoreInfoProviderImpl$Companion;", "", "<init>", "()V", "UNKNOWN_STORE", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AppStoreInfoProviderImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.installStore = LazyUtilsKt.unsafeLazy(new AppStoreInfoProviderImpl$installStore$2(this));
        this.appStores = LazyUtilsKt.unsafeLazy(AppStoreInfoProviderImpl$appStores$2.INSTANCE);
        this.installStorePackage = LazyUtilsKt.unsafeLazy(new AppStoreInfoProviderImpl$installStorePackage$2(this));
        this.storeName = k.a(n.PUBLICATION, new AppStoreInfoProviderImpl$storeName$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getInstallStorePackage() {
        return (String) this.installStorePackage.getValue();
    }

    private final String getStoreName() {
        return (String) this.storeName.getValue();
    }

    @Override // ru.ozon.app.android.analytics.store.AppStoreInfoProvider
    @NotNull
    public List<OzonInstallStore.Known> getAppStores() {
        return (List) this.appStores.getValue();
    }

    @Override // ru.ozon.app.android.analytics.store.AppStoreInfoProvider
    @NotNull
    public OzonInstallStore getInstallStore() {
        return (OzonInstallStore) this.installStore.getValue();
    }

    @Override // ru.ozon.app.android.analytics.store.AppStoreInfoProvider
    @InterfaceC3999a
    public String retrievePackageName() {
        return this.context.getPackageManager().getInstallerPackageName(this.context.getPackageName());
    }

    @Override // ru.ozon.app.android.analytics.store.AppStoreInfoProvider
    @NotNull
    public String retrieveStoreName() {
        return getStoreName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        r0 = r3.getOriginatingPackageName();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getInstallStorePackage(Context context) {
        Object a11;
        InstallSourceInfo installSourceInfo;
        try {
            r.Companion companion = r.INSTANCE;
            if (Build.VERSION.SDK_INT >= 30) {
                installSourceInfo = context.getPackageManager().getInstallSourceInfo(context.getPackageName());
                Intrinsics.checkNotNullExpressionValue(installSourceInfo, "getInstallSourceInfo(...)");
                a11 = installSourceInfo.getInstallingPackageName();
                if (a11 == null && a11 == null) {
                    a11 = installSourceInfo.getInitiatingPackageName();
                }
            } else {
                a11 = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            }
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (a11 instanceof r.b) {
            a11 = null;
        }
        return (String) a11;
    }
}
