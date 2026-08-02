package ru.ozon.app.android.fakeOzon.tab;

import Bc.i;
import Bc.u;
import CJ.b;
import Hs.e;
import Lm0.a;
import M4.c;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8488c;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fakeOzon.tab.FakeMainViewModel;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.tabbar.R$string;
import ru.ozon.app.android.tabbar.data.BottomNavigationBehavior;
import ru.ozon.app.android.tabbar.data.TabConfigAnimations;
import ru.ozon.app.android.tabbar.data.TabConfigDTO;
import ru.ozon.app.android.tabbar.data.TabConfigManager;
import ru.ozon.app.android.tabbar.data.TabConfigRepository;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import sc.C9653a;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/fakeOzon/tab/FakeMainViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fakeOzon/tab/FakeMainTabConfigMapper;", "mapper", "Lru/ozon/app/android/tabbar/data/TabConfigRepository;", "repository", "Lru/ozon/app/android/tabbar/data/TabConfigManager;", "manager", "<init>", "(Lru/ozon/app/android/fakeOzon/tab/FakeMainTabConfigMapper;Lru/ozon/app/android/tabbar/data/TabConfigRepository;Lru/ozon/app/android/tabbar/data/TabConfigManager;)V", "", "observeTabConfigChanged", "()V", "onCleared", "LM4/c;", "savedStateRegistry", "init", "(LM4/c;)V", "", "miniAppName", "getTabConfig", "(Ljava/lang/String;)V", "Lru/ozon/app/android/fakeOzon/tab/FakeMainTabConfigMapper;", "Lru/ozon/app/android/tabbar/data/TabConfigRepository;", "Lru/ozon/app/android/tabbar/data/TabConfigManager;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/fakeOzon/tab/FakeMainState;", "state", "Landroidx/lifecycle/V;", "getState", "()Landroidx/lifecycle/V;", "Lnc/b;", "disposable", "Lnc/b;", "Companion", "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FakeMainViewModel extends w0 {

    @NotNull
    private static final List<TabConfigDTO> defaultTabs;

    @NotNull
    private InterfaceC8487b disposable;

    @NotNull
    private final TabConfigManager manager;

    @NotNull
    private final FakeMainTabConfigMapper mapper;

    @NotNull
    private final TabConfigRepository repository;

    @NotNull
    private final V<FakeMainState> state;

    static {
        LinkGenerator linkGenerator = LinkGenerator.INSTANCE;
        String uri = linkGenerator.home().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        String string = StringProvider.getString(R$string.tabs_menu_main);
        BottomNavigationBehavior bottomNavigationBehavior = BottomNavigationBehavior.BEHAVIOR_TYPE_SELECT;
        TabConfigDTO tabConfigDTO = new TabConfigDTO(string, "ic_m_tabbar_home_increased", bottomNavigationBehavior, uri, null, null, null, 112, null);
        String uri2 = linkGenerator.express().toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
        int i11 = 112;
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        TabConfigAnimations tabConfigAnimations = null;
        IndicatorDTO indicatorDTO = null;
        TabConfigDTO tabConfigDTO2 = new TabConfigDTO(StringProvider.getString(R$string.tabs_menu_fresh_main), "ic_m_tabbar_food_increased", bottomNavigationBehavior, uri2, str, tabConfigAnimations, indicatorDTO, i11, defaultConstructorMarker);
        String uri3 = linkGenerator.apparelMainTab().toString();
        Intrinsics.checkNotNullExpressionValue(uri3, "toString(...)");
        TabConfigDTO tabConfigDTO3 = new TabConfigDTO(StringProvider.getString(R$string.tabs_menu_showcase_android), "ic_m_tabbar_hanger_increased", bottomNavigationBehavior, uri3, str, tabConfigAnimations, indicatorDTO, i11, defaultConstructorMarker);
        String uri4 = linkGenerator.bankTab().toString();
        Intrinsics.checkNotNullExpressionValue(uri4, "toString(...)");
        TabConfigDTO tabConfigDTO4 = new TabConfigDTO(StringProvider.getString(R$string.common_menu_cart), "ic_m_tabbar_finance_increased", bottomNavigationBehavior, uri4, str, tabConfigAnimations, indicatorDTO, i11, defaultConstructorMarker);
        String uri5 = linkGenerator.cart().toString();
        Intrinsics.checkNotNullExpressionValue(uri5, "toString(...)");
        TabConfigDTO tabConfigDTO5 = new TabConfigDTO(StringProvider.getString(R$string.common_menu_cart), "ic_m_tabbar_cart_increased", bottomNavigationBehavior, uri5, str, tabConfigAnimations, indicatorDTO, i11, defaultConstructorMarker);
        String uri6 = linkGenerator.cabinet().toString();
        Intrinsics.checkNotNullExpressionValue(uri6, "toString(...)");
        defaultTabs = C7714v.b0(tabConfigDTO, tabConfigDTO2, tabConfigDTO3, tabConfigDTO4, tabConfigDTO5, new TabConfigDTO(StringProvider.getString(R$string.tabs_menu_profile), "ic_m_tabbar_profile_increased", bottomNavigationBehavior, uri6, str, tabConfigAnimations, indicatorDTO, i11, null));
    }

    public FakeMainViewModel(@NotNull FakeMainTabConfigMapper mapper, @NotNull TabConfigRepository repository, @NotNull TabConfigManager manager) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.mapper = mapper;
        this.repository = repository;
        this.manager = manager;
        this.state = new V<>();
        InterfaceC8487b a11 = C8488c.a(C9653a.f98522b);
        Intrinsics.checkNotNullExpressionValue(a11, "empty(...)");
        this.disposable = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TabConfigResponse getTabConfig$lambda$3(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        a.f17149a.w(it);
        return new TabConfigResponse(null, defaultTabs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle init$lambda$1(FakeMainViewModel fakeMainViewModel) {
        Bundle bundle = new Bundle(1);
        FakeMainState value = fakeMainViewModel.state.getValue();
        if (value != null) {
            bundle.putParcelable("ru.ozon.app.android.fakeOzon.tab.FakeMainViewModel.EXTRA_FAKE_MAIN_STATE", value);
        }
        return bundle;
    }

    private final void observeTabConfigChanged() {
        C5415f.a(this).a(this.manager.observeTabConfigChanged().distinctUntilChanged().observeOn(C8125a.a()).subscribe(new e(new FakeMainViewModel$observeTabConfigChanged$1(this), 1), new DM.a(new FakeMainViewModel$observeTabConfigChanged$2(a.f17149a), 4)));
    }

    @NotNull
    public final V<FakeMainState> getState() {
        return this.state;
    }

    public final void getTabConfig(@NotNull String miniAppName) {
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        this.disposable.dispose();
        this.disposable = new u(new i(this.repository.loadTabConfig(miniAppName, null).g(Mc.a.a()), new b(new FakeMainViewModel$getTabConfig$1(this), 4)), new Ns.b(0)).h(new BF.b(new FakeMainViewModel$getTabConfig$3(this), 5), new DM.b(new FakeMainViewModel$getTabConfig$4(this), 3));
    }

    public final void init(@NotNull c savedStateRegistry) {
        Parcelable parcelable;
        Object parcelable2;
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        observeTabConfigChanged();
        Bundle b11 = savedStateRegistry.b("ru.ozon.app.android.fakeOzon.tab.FakeMainViewModel.EXTRA_BUNDLE");
        if (b11 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = b11.getParcelable("ru.ozon.app.android.fakeOzon.tab.FakeMainViewModel.EXTRA_FAKE_MAIN_STATE", FakeMainState.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                parcelable = b11.getParcelable("ru.ozon.app.android.fakeOzon.tab.FakeMainViewModel.EXTRA_FAKE_MAIN_STATE");
            }
            FakeMainState fakeMainState = (FakeMainState) parcelable;
            if (fakeMainState != null) {
                this.state.setValue(fakeMainState);
            }
        }
        savedStateRegistry.i("ru.ozon.app.android.fakeOzon.tab.FakeMainViewModel.EXTRA_BUNDLE");
        savedStateRegistry.g("ru.ozon.app.android.fakeOzon.tab.FakeMainViewModel.EXTRA_BUNDLE", new c.b() { // from class: Ns.a
            @Override // M4.c.b
            public final Bundle saveState() {
                Bundle init$lambda$1;
                init$lambda$1 = FakeMainViewModel.init$lambda$1(FakeMainViewModel.this);
                return init$lambda$1;
            }
        });
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        super.onCleared();
        this.disposable.dispose();
    }
}
