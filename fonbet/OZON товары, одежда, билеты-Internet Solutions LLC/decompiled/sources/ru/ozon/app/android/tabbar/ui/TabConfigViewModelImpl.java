package ru.ozon.app.android.tabbar.ui;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Ge.n;
import NZ.h;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.C8883d;
import pZ.e;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;
import ru.ozon.app.android.tabbar.TabConfigViewModel;
import ru.ozon.app.android.tabbar.data.TabConfig;
import ru.ozon.app.android.tabbar.data.TabConfigManager;
import ru.ozon.app.android.tabbar.domain.TabConfigUpdateDelegate;
import ru.ozon.app.android.tabbar.domain.event.TabUpdateCompleteEvent;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/tabbar/ui/TabConfigViewModelImpl;", "Lru/ozon/app/android/tabbar/TabConfigViewModel;", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "teensModeService", "Lru/ozon/app/android/tabbar/data/TabConfigManager;", "manager", "Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;", "tabConfigUpdateDelegate", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "coroutineDispatcherProvider", "<init>", "(Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;Lru/ozon/app/android/tabbar/data/TabConfigManager;Lru/ozon/app/android/composer/ComposerNavigator;Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "", "redirectLink", "", "clearBackStackAndRedirect", "(Ljava/lang/String;)V", "loadCachedConfig", "()V", "observeTabConfig", "observeTeensMode", "", "id", "onSelectedTabIdChanged", "(I)V", "miniAppName", "Lru/ozon/app/android/tabbar/data/TabConfig;", "getTabConfig", "(Ljava/lang/String;)Lru/ozon/app/android/tabbar/data/TabConfig;", "getTabConfigOrDefault", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "Lru/ozon/app/android/tabbar/data/TabConfigManager;", "Lru/ozon/app/android/composer/ComposerNavigator;", "Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "LAe/x0;", "_tabConfigState", "LAe/x0;", "LAe/M0;", "tabConfigState", "LAe/M0;", "getTabConfigState", "()LAe/M0;", "selectedTabId", "I", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TabConfigViewModelImpl extends TabConfigViewModel {

    @NotNull
    private final x0<TabConfig> _tabConfigState;

    @NotNull
    private final ComposerNavigator composerNavigator;

    @NotNull
    private final CoroutineDispatcherProvider coroutineDispatcherProvider;

    @NotNull
    private final TabConfigManager manager;
    private int selectedTabId;

    @NotNull
    private final M0<TabConfig> tabConfigState;

    @NotNull
    private final TabConfigUpdateDelegate tabConfigUpdateDelegate;

    @NotNull
    private final TeensModeService teensModeService;

    public TabConfigViewModelImpl(@NotNull TeensModeService teensModeService, @NotNull TabConfigManager manager, @NotNull ComposerNavigator composerNavigator, @NotNull TabConfigUpdateDelegate tabConfigUpdateDelegate, @NotNull CoroutineDispatcherProvider coroutineDispatcherProvider) {
        Intrinsics.checkNotNullParameter(teensModeService, "teensModeService");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(composerNavigator, "composerNavigator");
        Intrinsics.checkNotNullParameter(tabConfigUpdateDelegate, "tabConfigUpdateDelegate");
        Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "coroutineDispatcherProvider");
        this.teensModeService = teensModeService;
        this.manager = manager;
        this.composerNavigator = composerNavigator;
        this.tabConfigUpdateDelegate = tabConfigUpdateDelegate;
        this.coroutineDispatcherProvider = coroutineDispatcherProvider;
        x0<TabConfig> a11 = O0.a(null);
        this._tabConfigState = a11;
        this.tabConfigState = C2399j.b(a11);
        this.selectedTabId = ru.ozon.app.android.tabbar.R$id.menu_main;
        loadCachedConfig();
        observeTabConfig();
        observeTeensMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearBackStackAndRedirect(String redirectLink) {
        h tabNavigatorConfig;
        Map<Integer, String> b11;
        TabConfig value = getTabConfigState().getValue();
        Collection<String> values = (value == null || (tabNavigatorConfig = value.getTabNavigatorConfig()) == null || (b11 = tabNavigatorConfig.b()) == null) ? null : b11.values();
        if (values == null) {
            values = K.f71697a;
        }
        this.composerNavigator.navigate(new C8883d(values.contains(redirectLink) ? new e(redirectLink) : new OZ.e(this.selectedTabId, new e(redirectLink))), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadCachedConfig() {
        this._tabConfigState.setValue(this.manager.getInMemoryCachedConfig("main"));
    }

    private final void observeTabConfig() {
        final InterfaceC2395h B11 = C2399j.B(n.a(this.manager.observeTabConfigChanged()), this.coroutineDispatcherProvider.getIO());
        C2399j.C(new C2408n0(new InterfaceC2395h<TabUpdateCompleteEvent>() { // from class: ru.ozon.app.android.tabbar.ui.TabConfigViewModelImpl$observeTabConfig$$inlined$filter$1

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: ru.ozon.app.android.tabbar.ui.TabConfigViewModelImpl$observeTabConfig$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.app.android.tabbar.ui.TabConfigViewModelImpl$observeTabConfig$$inlined$filter$1$2", f = "TabConfigViewModelImpl.kt", l = {50}, m = "emit")
                /* renamed from: ru.ozon.app.android.tabbar.ui.TabConfigViewModelImpl$observeTabConfig$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            a aVar = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                if (Intrinsics.d(((TabUpdateCompleteEvent) obj).getMiniAppName(), "main")) {
                                    anonymousClass1.label = 1;
                                    if (interfaceC2397i.emit(obj, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    a aVar2 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(InterfaceC2397i<? super TabUpdateCompleteEvent> interfaceC2397i, d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        }, new TabConfigViewModelImpl$observeTabConfig$2(this, null)), androidx.lifecycle.x0.a(this));
    }

    private final void observeTeensMode() {
        C2399j.C(new C2408n0(this.teensModeService.getTeensModeFlow(), new TabConfigViewModelImpl$observeTeensMode$1(this, null)), androidx.lifecycle.x0.a(this));
    }

    @Override // ru.ozon.app.android.tabbar.TabConfigViewModel
    public TabConfig getTabConfig(@NotNull String miniAppName) {
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        return this.manager.getInMemoryCachedConfig(miniAppName);
    }

    @Override // ru.ozon.app.android.tabbar.TabConfigViewModel
    @NotNull
    public TabConfig getTabConfigOrDefault(@NotNull String miniAppName) {
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        TabConfig tabConfig = getTabConfig(miniAppName);
        return tabConfig == null ? this.manager.getDefaultConfig() : tabConfig;
    }

    @Override // ru.ozon.app.android.tabbar.TabConfigViewModel
    @NotNull
    public M0<TabConfig> getTabConfigState() {
        return this.tabConfigState;
    }

    @Override // ru.ozon.app.android.tabbar.TabConfigViewModel
    public void onSelectedTabIdChanged(int id2) {
        this.selectedTabId = id2;
    }
}
