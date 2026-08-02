package ru.ozon.app.android.search.widgets.history.search.presentation;

import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.InterfaceC2395h;
import android.content.SharedPreferences;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.search.flags.SearchHistoryFiltersOnboardingEnabled;
import ru.ozon.app.android.search.widgets.history.common.data.SearchHistoryRepository;
import ru.ozon.app.android.search.widgets.history.search.data.HistoryDTO;
import ru.ozon.app.android.search.widgets.history.search.data.HistoryMapper;
import ru.ozon.app.android.search.widgets.history.search.presentation.HistoryItem;
import ru.ozon.app.android.search.widgets.history.search.presentation.HistoryViewModel;
import ru.ozon.app.android.search.widgets.history.search.presentation.updateKey.TagRemoved;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import xe.C10727i;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 L2\u00020\u0001:\u0001LBI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\"¢\u0006\u0004\b#\u0010$J5\u0010'\u001a\u00020\u001c2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020%0\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010&\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b'\u0010(JA\u0010*\u001a\u00020\u001c2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010)\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b,\u0010-J\u0015\u00100\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u001c¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00108R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00109R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010:R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010;R \u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R#\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0=0A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020F0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010@R\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020F0A8\u0006¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bI\u0010ER\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010K¨\u0006M"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/search/widgets/history/search/data/HistoryMapper;", "mapper", "Lru/ozon/app/android/search/widgets/history/common/data/SearchHistoryRepository;", "searchHistoryRepository", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "asyncWidgetRepository", "Ll10/b;", "composerController", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "Lru/ozon/app/android/account/user/UserManager;", "userManager", "<init>", "(Lru/ozon/app/android/search/widgets/history/search/data/HistoryMapper;Lru/ozon/app/android/search/widgets/history/common/data/SearchHistoryRepository;Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Ll10/b;Lru/ozon/app/android/network/abtool/FeatureChecker;Landroid/content/SharedPreferences;Lru/ozon/app/android/storage/auth/AuthStateStorage;Lru/ozon/app/android/account/user/UserManager;)V", "", "", "params", "", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem;", "historyItems", "", "id", "", "removeHistoryItem", "(Ljava/util/Map;Ljava/util/List;Ljava/lang/Long;)V", "", "needShowHistoryFiltersOnboarding", "()Z", "Landroidx/lifecycle/P;", "refreshActionLiveData", "()Landroidx/lifecycle/P;", "", "asyncData", "processAsyncEvent", "(Ljava/util/Map;Ljava/lang/Long;Ljava/lang/String;)V", "removeQueryActionName", "onRemoveTagHistory", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)V", "getSearchHistoryFiltersOnboarding", "(Ljava/lang/Long;)V", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO;", "item", "checkNeedShowHistoryFiltersOnboarding", "(Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryVO;)V", "onShowHistoryFiltersOnboarding", "()V", "Lru/ozon/app/android/search/widgets/history/search/data/HistoryMapper;", "Lru/ozon/app/android/search/widgets/history/common/data/SearchHistoryRepository;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "Ll10/b;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Landroid/content/SharedPreferences;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lru/ozon/app/android/account/user/UserManager;", "LAe/w0;", "Lru/ozon/app/android/composer/widgets/async/data/api/ComposerAsyncWidgetResponse;", "Lru/ozon/app/android/search/widgets/history/search/data/HistoryDTO;", "_events", "LAe/w0;", "LAe/h;", "events", "LAe/h;", "getEvents", "()LAe/h;", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryUiEffect;", "_effects", "effects", "getEffects", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HistoryViewModel extends w0 {

    @NotNull
    private final Ae.w0<HistoryUiEffect> _effects;

    @NotNull
    private final Ae.w0<ComposerAsyncWidgetResponse<HistoryDTO>> _events;

    @NotNull
    private final ComposerAsyncWidgetRepository asyncWidgetRepository;

    @NotNull
    private final AuthStateStorage authStateStorage;

    @NotNull
    private final InterfaceC7851b composerController;

    @NotNull
    private final InterfaceC2395h<HistoryUiEffect> effects;

    @NotNull
    private final InterfaceC2395h<ComposerAsyncWidgetResponse<HistoryDTO>> events;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final HistoryMapper mapper;

    @NotNull
    private final SingleLiveEvent<Unit> refreshActionLiveData;

    @NotNull
    private final SearchHistoryRepository searchHistoryRepository;

    @NotNull
    private final SharedPreferences sharedPreferences;

    @NotNull
    private final UserManager userManager;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryViewModel$Companion;", "", "<init>", "()V", "MIN_SIZE_HISTORY_WITH_EXTRA_BUTTON", "", "HISTORY_FILTERS_ONBOARDING_ID", "", "HISTORY_FILTERS_ONBOARDING_PREFS_KEY", "FILTERS_ONBOARDING_SHOW_DELAY", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public HistoryViewModel(@NotNull HistoryMapper mapper, @NotNull SearchHistoryRepository searchHistoryRepository, @NotNull ComposerAsyncWidgetRepository asyncWidgetRepository, @NotNull InterfaceC7851b composerController, @NotNull FeatureChecker featureChecker, @NotNull SharedPreferences sharedPreferences, @NotNull AuthStateStorage authStateStorage, @NotNull UserManager userManager) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(searchHistoryRepository, "searchHistoryRepository");
        Intrinsics.checkNotNullParameter(asyncWidgetRepository, "asyncWidgetRepository");
        Intrinsics.checkNotNullParameter(composerController, "composerController");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(authStateStorage, "authStateStorage");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        this.mapper = mapper;
        this.searchHistoryRepository = searchHistoryRepository;
        this.asyncWidgetRepository = asyncWidgetRepository;
        this.composerController = composerController;
        this.featureChecker = featureChecker;
        this.sharedPreferences = sharedPreferences;
        this.authStateStorage = authStateStorage;
        this.userManager = userManager;
        C0 b11 = E0.b(0, 0, null, 7);
        this._events = b11;
        this.events = b11;
        C0 b12 = E0.b(0, 0, null, 7);
        this._effects = b12;
        this.effects = C2399j.a(b12);
        this.refreshActionLiveData = new SingleLiveEvent<>();
    }

    private final boolean needShowHistoryFiltersOnboarding() {
        long userId = this.userManager.getUserId();
        String string = this.sharedPreferences.getString("HISTORY_FILTERS_ONBOARDING_PREFS_KEY", null);
        if (!this.featureChecker.isEnabled(SearchHistoryFiltersOnboardingEnabled.INSTANCE) || !this.authStateStorage.isAuthenticated()) {
            return false;
        }
        if (string == null) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder("search_history_filters_");
        sb2.append(userId);
        return !string.equals(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeHistoryItem(Map<String, String> params, List<? extends HistoryItem> historyItems, Long id2) {
        if (id2 != null) {
            ArrayList W02 = C7714v.W0(historyItems);
            final HistoryViewModel$removeHistoryItem$updatedItems$1$1 historyViewModel$removeHistoryItem$updatedItems$1$1 = new HistoryViewModel$removeHistoryItem$updatedItems$1$1(params);
            W02.removeIf(new Predicate() { // from class: CI.a
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean removeHistoryItem$lambda$2$lambda$1;
                    removeHistoryItem$lambda$2$lambda$1 = HistoryViewModel.removeHistoryItem$lambda$2$lambda$1(Function1.this, obj);
                    return removeHistoryItem$lambda$2$lambda$1;
                }
            });
            if (!W02.isEmpty()) {
                Iterator it = W02.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((HistoryItem) it.next()) instanceof HistoryItem.ButtonVO) {
                        if (W02.size() == 1) {
                            W02.clear();
                        }
                    }
                }
            }
            this.composerController.update(new TagRemoved(id2.longValue(), W02));
            if (W02.isEmpty()) {
                this.refreshActionLiveData.setValue(Unit.f71690a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeHistoryItem$lambda$2$lambda$1(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public final void checkNeedShowHistoryFiltersOnboarding(@NotNull HistoryVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getOnboarding() == null || !needShowHistoryFiltersOnboarding()) {
            return;
        }
        C10727i.c(x0.a(this), null, null, new HistoryViewModel$checkNeedShowHistoryFiltersOnboarding$1(item, this, null), 3);
    }

    @NotNull
    public final InterfaceC2395h<HistoryUiEffect> getEffects() {
        return this.effects;
    }

    @NotNull
    public final InterfaceC2395h<ComposerAsyncWidgetResponse<HistoryDTO>> getEvents() {
        return this.events;
    }

    public final void getSearchHistoryFiltersOnboarding(Long id2) {
        if (id2 == null || !needShowHistoryFiltersOnboarding()) {
            return;
        }
        C10727i.c(x0.a(this), null, null, new HistoryViewModel$getSearchHistoryFiltersOnboarding$1(this, id2, null), 3);
    }

    public final void onRemoveTagHistory(@NotNull Map<String, String> params, @NotNull String removeQueryActionName, @NotNull List<? extends HistoryItem> historyItems, Long id2) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(removeQueryActionName, "removeQueryActionName");
        Intrinsics.checkNotNullParameter(historyItems, "historyItems");
        if (id2 != null) {
            C10727i.c(x0.a(this), null, null, new HistoryViewModel$onRemoveTagHistory$1(this, params, removeQueryActionName, historyItems, id2, null), 3);
        }
    }

    public final void onShowHistoryFiltersOnboarding() {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putString("HISTORY_FILTERS_ONBOARDING_PREFS_KEY", "search_history_filters_" + this.userManager.getUserId());
        edit.apply();
    }

    public final void processAsyncEvent(@NotNull Map<String, ? extends Object> params, Long id2, String asyncData) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (id2 == null || asyncData == null) {
            return;
        }
        C10727i.c(x0.a(this), null, null, new HistoryViewModel$processAsyncEvent$1(this, asyncData, params, id2, null), 3);
    }

    @NotNull
    public final P<Unit> refreshActionLiveData() {
        return this.refreshActionLiveData;
    }
}
