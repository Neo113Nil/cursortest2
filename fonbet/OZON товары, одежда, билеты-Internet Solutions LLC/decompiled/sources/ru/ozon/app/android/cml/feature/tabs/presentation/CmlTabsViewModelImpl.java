package ru.ozon.app.android.cml.feature.tabs.presentation;

import M4.c;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.lifecycle.z0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.feature.tabs.data.CmlTabConfigMapper;
import ru.ozon.app.android.cml.feature.tabs.navigation.CmlNavigation;
import ru.ozon.app.android.cml.feature.tabs.presentation.CmlTabsViewModelImpl;
import ru.ozon.app.android.tabbar.R$string;
import ru.ozon.app.android.tabbar.data.BottomNavigationBehavior;
import ru.ozon.app.android.tabbar.data.TabConfigDTO;
import ru.ozon.app.android.tabbar.data.TabConfigRepository;
import ru.ozon.app.android.tabbar.data.local.TabConfigCache;
import ru.ozon.app.android.uikit.text.StringProvider;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0002%&B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lru/ozon/app/android/cml/feature/tabs/presentation/CmlTabsViewModelImpl;", "Landroidx/lifecycle/w0;", "", "Lru/ozon/app/android/tabbar/data/TabConfigRepository;", "repository", "Lru/ozon/app/android/tabbar/data/local/TabConfigCache;", "cache", "Lru/ozon/app/android/cml/feature/tabs/data/CmlTabConfigMapper;", "tabConfigMapper", "<init>", "(Lru/ozon/app/android/tabbar/data/TabConfigRepository;Lru/ozon/app/android/tabbar/data/local/TabConfigCache;Lru/ozon/app/android/cml/feature/tabs/data/CmlTabConfigMapper;)V", "LM4/c;", "savedStateRegistry", "", "init", "(LM4/c;)V", "", "miniAppName", "referrerMiniAppName", "loadTabConfig", "(Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/app/android/tabbar/data/TabConfigRepository;", "Lru/ozon/app/android/tabbar/data/local/TabConfigCache;", "Lru/ozon/app/android/cml/feature/tabs/data/CmlTabConfigMapper;", "", "Lru/ozon/app/android/tabbar/data/TabConfigDTO;", "defaultTabs", "Ljava/util/List;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/cml/feature/tabs/presentation/CmlTabsScreenState;", "screenState", "Landroidx/lifecycle/V;", "getScreenState", "()Landroidx/lifecycle/V;", "Lxe/B0;", "loadTabsJob", "Lxe/B0;", "Companion", "Factory", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CmlTabsViewModelImpl extends w0 {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final TabConfigCache cache;

    @NotNull
    private final List<TabConfigDTO> defaultTabs;
    private B0 loadTabsJob;

    @NotNull
    private final TabConfigRepository repository;

    @NotNull
    private final V<CmlTabsScreenState> screenState;

    @NotNull
    private final CmlTabConfigMapper tabConfigMapper;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/cml/feature/tabs/presentation/CmlTabsViewModelImpl$Companion;", "", "<init>", "()V", "EXTRA_STATE", "", "EXTRA_BUNDLE", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cml/feature/tabs/presentation/CmlTabsViewModelImpl$Factory;", "Landroidx/lifecycle/z0$b;", "Lru/ozon/app/android/tabbar/data/TabConfigRepository;", "repository", "Lru/ozon/app/android/tabbar/data/local/TabConfigCache;", "cache", "Lru/ozon/app/android/cml/feature/tabs/data/CmlTabConfigMapper;", "tabConfigMapper", "<init>", "(Lru/ozon/app/android/tabbar/data/TabConfigRepository;Lru/ozon/app/android/tabbar/data/local/TabConfigCache;Lru/ozon/app/android/cml/feature/tabs/data/CmlTabConfigMapper;)V", "Landroidx/lifecycle/w0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/w0;", "Lru/ozon/app/android/tabbar/data/TabConfigRepository;", "Lru/ozon/app/android/tabbar/data/local/TabConfigCache;", "Lru/ozon/app/android/cml/feature/tabs/data/CmlTabConfigMapper;", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements z0.b {

        @NotNull
        private final TabConfigCache cache;

        @NotNull
        private final TabConfigRepository repository;

        @NotNull
        private final CmlTabConfigMapper tabConfigMapper;

        public Factory(@NotNull TabConfigRepository repository, @NotNull TabConfigCache cache, @NotNull CmlTabConfigMapper tabConfigMapper) {
            Intrinsics.checkNotNullParameter(repository, "repository");
            Intrinsics.checkNotNullParameter(cache, "cache");
            Intrinsics.checkNotNullParameter(tabConfigMapper, "tabConfigMapper");
            this.repository = repository;
            this.cache = cache;
            this.tabConfigMapper = tabConfigMapper;
        }

        @Override // androidx.lifecycle.z0.b
        @NotNull
        public <T extends w0> T create(@NotNull Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new CmlTabsViewModelImpl(this.repository, this.cache, this.tabConfigMapper);
        }
    }

    public CmlTabsViewModelImpl(@NotNull TabConfigRepository repository, @NotNull TabConfigCache cache, @NotNull CmlTabConfigMapper tabConfigMapper) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(tabConfigMapper, "tabConfigMapper");
        this.repository = repository;
        this.cache = cache;
        this.tabConfigMapper = tabConfigMapper;
        CmlNavigation cmlNavigation = CmlNavigation.INSTANCE;
        String uri = cmlNavigation.cmlMainTab().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        String string = StringProvider.getString(R$string.tabs_menu_send);
        BottomNavigationBehavior bottomNavigationBehavior = BottomNavigationBehavior.BEHAVIOR_TYPE_SELECT;
        TabConfigDTO tabConfigDTO = new TabConfigDTO(string, "ic_m_tabbar_home", bottomNavigationBehavior, uri, null, null, null, 112, null);
        String uri2 = cmlNavigation.cmlDeliveryListTab().toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        TabConfigDTO tabConfigDTO2 = new TabConfigDTO(StringProvider.getString(R$string.tabs_menu_orders), "ic_m_tabbar_orders", bottomNavigationBehavior, uri2, null, null, null, 112, null);
        String uri3 = cmlNavigation.cmlMapTab().toString();
        Intrinsics.checkNotNullExpressionValue(uri3, "toString(...)");
        TabConfigDTO tabConfigDTO3 = new TabConfigDTO(StringProvider.getString(R$string.tabs_menu_pick_up_points), "ic_m_tabbar_location_pin", bottomNavigationBehavior, uri3, null, null, null, 112, null);
        String uri4 = cmlNavigation.cmlSupportTab().toString();
        Intrinsics.checkNotNullExpressionValue(uri4, "toString(...)");
        this.defaultTabs = C7714v.b0(tabConfigDTO, tabConfigDTO2, tabConfigDTO3, new TabConfigDTO(StringProvider.getString(R$string.tabs_menu_support), "ic_m_tabbar_chat", BottomNavigationBehavior.BEHAVIOR_TYPE_REDIRECT, uri4, null, null, null, 112, null));
        this.screenState = new V<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle init$lambda$1(CmlTabsViewModelImpl cmlTabsViewModelImpl) {
        Bundle bundle = new Bundle(1);
        CmlTabsScreenState value = cmlTabsViewModelImpl.getScreenState().getValue();
        if (value != null) {
            bundle.putParcelable("ru.ozon.app.android.travel.feature.tabs.presentation.EXTRA_STATE", value);
        }
        return bundle;
    }

    @NotNull
    public V<CmlTabsScreenState> getScreenState() {
        return this.screenState;
    }

    public void init(@NotNull c savedStateRegistry) {
        Parcelable parcelable;
        Object parcelable2;
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Bundle b11 = savedStateRegistry.b("ru.ozon.app.android.travel.feature.tabs.presentation.EXTRA_BUNDLE");
        if (b11 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = b11.getParcelable("ru.ozon.app.android.travel.feature.tabs.presentation.EXTRA_STATE", CmlTabsScreenState.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                parcelable = b11.getParcelable("ru.ozon.app.android.travel.feature.tabs.presentation.EXTRA_STATE");
            }
            CmlTabsScreenState cmlTabsScreenState = (CmlTabsScreenState) parcelable;
            if (cmlTabsScreenState != null) {
                getScreenState().setValue(cmlTabsScreenState);
            }
        }
        savedStateRegistry.i("ru.ozon.app.android.travel.feature.tabs.presentation.EXTRA_BUNDLE");
        savedStateRegistry.g("ru.ozon.app.android.travel.feature.tabs.presentation.EXTRA_BUNDLE", new c.b() { // from class: xq.b
            @Override // M4.c.b
            public final Bundle saveState() {
                Bundle init$lambda$1;
                init$lambda$1 = CmlTabsViewModelImpl.init$lambda$1(CmlTabsViewModelImpl.this);
                return init$lambda$1;
            }
        });
    }

    public void loadTabConfig(@NotNull String miniAppName, String referrerMiniAppName) {
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        B0 b02 = this.loadTabsJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.loadTabsJob = C10727i.c(x0.a(this), null, null, new CmlTabsViewModelImpl$loadTabConfig$1(this, miniAppName, referrerMiniAppName, null), 3);
    }
}
