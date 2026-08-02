package ru.ozon.app.android.cabinet.cache.configurator;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.ViewGroup;
import androidx.core.content.a;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.c;
import ru.ozon.app.android.cabinet.R$string;
import ru.ozon.app.android.composer.domain.cache.CachePreferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.model.Action;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/cabinet/cache/configurator/OrderCacheConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authManager", "Lru/ozon/app/android/composer/domain/cache/CachePreferences;", "cachePreferences", "<init>", "(Lru/ozon/app/android/storage/auth/AuthStateStorage;Lru/ozon/app/android/composer/domain/cache/CachePreferences;)V", "", "expiryDate", "", "isCacheValid", "(J)Z", "isNetworkAvailable", "()Z", "", "message", "", "icon", "Lru/ozon/uni/android/flashbar/model/Action;", "action", "", "showMessage", "(Ljava/lang/String;ILru/ozon/uni/android/flashbar/model/Action;)V", "Landroidx/lifecycle/J;", "owner", "onCreate", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lru/ozon/app/android/composer/domain/cache/CachePreferences;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderCacheConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final AuthStateStorage authManager;

    @NotNull
    private final CachePreferences cachePreferences;

    public OrderCacheConfigurator(@NotNull AuthStateStorage authManager, @NotNull CachePreferences cachePreferences) {
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(cachePreferences, "cachePreferences");
        this.authManager = authManager;
        this.cachePreferences = cachePreferences;
    }

    private final boolean isCacheValid(long expiryDate) {
        if (expiryDate == 0) {
            return false;
        }
        DateTime dateTime = new DateTime(expiryDate);
        int i11 = c.f79052b;
        return dateTime.getMillis() > System.currentTimeMillis();
    }

    private final boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a.getSystemService(getContainer().i(), ConnectivityManager.class);
        Intrinsics.f(connectivityManager);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    private final void showMessage(String message, int icon, Action action) {
        ViewGroup rootView = ContextExtKt.getRootView(getContainer().i());
        if (rootView != null) {
            FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(message), null, null, Integer.valueOf(icon), null, null, null, action, null, null, null, 6000L, null, null, getContainer().g(), 56794, null).show();
        }
    }

    static /* synthetic */ void showMessage$default(OrderCacheConfigurator orderCacheConfigurator, String str, int i11, Action action, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            action = null;
        }
        orderCacheConfigurator.showMessage(str, i11, action);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        long expiryTime = this.cachePreferences.getExpiryTime();
        if (!isNetworkAvailable() && this.authManager.isAuthenticated() && isCacheValid(expiryTime)) {
            showMessage$default(this, StringProvider.getString(R$string.cache_restriction), R$drawable.ic_warning, null, 4, null);
        }
    }
}
