package ru.ozon.app.android.common.tabs.core;

import We.InterfaceC4875q;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.storage.cookiePreference.RefreshByGenderCookieEvents;
import xe.C10727i;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\r2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/common/tabs/core/TabsV2ViewModel;", "Landroidx/lifecycle/w0;", "LWe/q;", "cookieJar", "Lru/ozon/app/android/storage/cookiePreference/RefreshByGenderCookieEvents;", "refreshByGenderCookieEvents", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "networkConfig", "<init>", "(LWe/q;Lru/ozon/app/android/storage/cookiePreference/RefreshByGenderCookieEvents;Lru/ozon/app/android/network/di/NetworkComponentConfig;)V", "", "", "actionParams", "", "onTabChanged", "(Ljava/util/Map;)V", "checkTabCookie", "()V", "LWe/q;", "Lru/ozon/app/android/storage/cookiePreference/RefreshByGenderCookieEvents;", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "apparelSelectedTabCookie", "Ljava/lang/String;", "Companion", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TabsV2ViewModel extends w0 {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private String apparelSelectedTabCookie;

    @NotNull
    private final InterfaceC4875q cookieJar;

    @NotNull
    private final NetworkComponentConfig networkConfig;

    @NotNull
    private final RefreshByGenderCookieEvents refreshByGenderCookieEvents;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/common/tabs/core/TabsV2ViewModel$Companion;", "", "<init>", "()V", "APPAREL_SELECTED_TAB_COOKIE", "", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TabsV2ViewModel(@NotNull InterfaceC4875q cookieJar, @NotNull RefreshByGenderCookieEvents refreshByGenderCookieEvents, @NotNull NetworkComponentConfig networkConfig) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        Intrinsics.checkNotNullParameter(refreshByGenderCookieEvents, "refreshByGenderCookieEvents");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        this.cookieJar = cookieJar;
        this.refreshByGenderCookieEvents = refreshByGenderCookieEvents;
        this.networkConfig = networkConfig;
        this.apparelSelectedTabCookie = "";
    }

    public final void checkTabCookie() {
        C10727i.c(x0.a(this), null, null, new TabsV2ViewModel$checkTabCookie$1(this, null), 3);
    }

    public final void onTabChanged(Map<String, String> actionParams) {
        String str;
        if (actionParams == null || (str = actionParams.get("apparelSelectedTab")) == null) {
            return;
        }
        this.apparelSelectedTabCookie = str;
    }
}
