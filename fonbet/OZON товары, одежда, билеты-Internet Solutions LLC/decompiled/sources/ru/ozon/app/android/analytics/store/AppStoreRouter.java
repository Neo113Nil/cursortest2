package ru.ozon.app.android.analytics.store;

import Sc.o;
import Sc.r;
import Sc.s;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.store.OzonInstallStore;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/analytics/store/AppStoreRouter;", "", "context", "Landroid/content/Context;", "appStoreInfoProvider", "Lru/ozon/app/android/analytics/store/AppStoreInfoProvider;", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/analytics/store/AppStoreInfoProvider;)V", "installStore", "Lru/ozon/app/android/analytics/store/OzonInstallStore;", "openAppStore", "", "packageName", "", "tryOpenAnyKnownStore", "tryStartActivity", "", "appLink", "Landroid/net/Uri;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppStoreRouter {

    @NotNull
    private final AppStoreInfoProvider appStoreInfoProvider;

    @NotNull
    private final Context context;

    @NotNull
    private final OzonInstallStore installStore;

    public AppStoreRouter(@NotNull Context context, @NotNull AppStoreInfoProvider appStoreInfoProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appStoreInfoProvider, "appStoreInfoProvider");
        this.context = context;
        this.appStoreInfoProvider = appStoreInfoProvider;
        this.installStore = appStoreInfoProvider.getInstallStore();
    }

    private final void tryOpenAnyKnownStore(String packageName) {
        List<OzonInstallStore.Known> appStores = this.appStoreInfoProvider.getAppStores();
        if ((appStores instanceof Collection) && appStores.isEmpty()) {
            return;
        }
        Iterator<T> it = appStores.iterator();
        while (it.hasNext() && !tryStartActivity(((OzonInstallStore.Known) it.next()).appLink(packageName))) {
        }
    }

    private final boolean tryStartActivity(Uri appLink) {
        Intent intent = new Intent("android.intent.action.VIEW", appLink);
        intent.setFlags(268435456);
        try {
            r.Companion companion = r.INSTANCE;
            if (intent.resolveActivity(this.context.getPackageManager()) == null) {
                return false;
            }
            this.context.startActivity(intent);
            return true;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            s.a(th2);
            return false;
        }
    }

    public final void openAppStore(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        OzonInstallStore ozonInstallStore = this.installStore;
        if (ozonInstallStore instanceof OzonInstallStore.Unknown) {
            tryOpenAnyKnownStore(packageName);
        } else {
            if (!(ozonInstallStore instanceof OzonInstallStore.Known)) {
                throw new o();
            }
            if (tryStartActivity(((OzonInstallStore.Known) ozonInstallStore).appLink(packageName))) {
                return;
            }
            tryOpenAnyKnownStore(packageName);
        }
    }
}
