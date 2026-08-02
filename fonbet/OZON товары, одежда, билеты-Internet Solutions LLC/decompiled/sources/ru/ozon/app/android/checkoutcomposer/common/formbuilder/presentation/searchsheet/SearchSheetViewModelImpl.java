package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet;

import AF.g;
import Nc.C3669c;
import Ue0.C4066a;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import com.google.android.gms.actions.SearchIntents;
import io.reactivex.C;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetFragment;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetViewModel;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.data.SearchSheetRepository;
import ru.ozon.app.android.search.widgets.suggestion.data.SuggestionDTO;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 42\u00020\u00012\u00020\u0002:\u00014B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R \u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\r0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetViewModel;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/data/SearchSheetRepository;", "repository", "<init>", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/data/SearchSheetRepository;)V", "", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SuggestVO;", SuggestionDTO.TYPE_SUGGEST, "", "updateList", "(Ljava/util/List;)V", "", SearchIntents.EXTRA_QUERY, "linkPattern", "makeLink", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetFragment$Data;", "data", "bindInitial", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetFragment$Data;)V", "suggest", "suggestClicked", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SuggestVO;)V", "onTypedQuery", "(Ljava/lang/String;)V", "onCleared", "()V", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/data/SearchSheetRepository;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetViewModel$ScreenUI;", "screenUI", "Landroidx/lifecycle/V;", "getScreenUI", "()Landroidx/lifecycle/V;", "", "loader", "getLoader", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetViewModel$Action;", "action", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getAction", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetFragment$Data;", "LNc/c;", "querySubject", "LNc/c;", "Lnc/a;", "disposables", "Lnc/a;", "Companion", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SearchSheetViewModelImpl extends w0 implements SearchSheetViewModel {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final SingleLiveEvent<SearchSheetViewModel.Action> action;
    private SearchSheetFragment.Data data;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final V<Boolean> loader;

    @NotNull
    private final C3669c<String> querySubject;

    @NotNull
    private final SearchSheetRepository repository;

    @NotNull
    private final V<SearchSheetViewModel.ScreenUI> screenUI;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetViewModelImpl$Companion;", "", "<init>", "()V", "DEFAULT_TIMEOUT", "", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SearchSheetViewModelImpl(@NotNull SearchSheetRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        this.screenUI = new V<>();
        this.loader = new V<>();
        this.action = new SingleLiveEvent<>();
        C3669c<String> d11 = C3669c.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.querySubject = d11;
        this.disposables = new C8486a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindInitial$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C bindInitial$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (C) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String makeLink(String query, String linkPattern) {
        return h.X(linkPattern, "{q}", query, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateList(List<SuggestVO> suggests) {
        SearchSheetViewModel.ScreenUI value = getScreenUI().getValue();
        if (value != null) {
            getScreenUI().postValue(SearchSheetViewModel.ScreenUI.copy$default(value, null, null, suggests, 3, null));
        }
    }

    @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetViewModel
    public void bindInitial(@NotNull SearchSheetFragment.Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.disposables.d();
        C8486a c8486a = this.disposables;
        InterfaceC8487b subscribe = this.querySubject.debounce(300L, TimeUnit.MILLISECONDS).filter(new g(new SearchSheetViewModelImpl$bindInitial$1(data), 7)).switchMapSingle(new C4066a(new SearchSheetViewModelImpl$bindInitial$2(this, data), 2)).observeOn(C8125a.a()).subscribe(new DF.a(new SearchSheetViewModelImpl$bindInitial$3(this), 8), new BY.g(new SearchSheetViewModelImpl$bindInitial$4(this), 6));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe);
        getScreenUI().postValue(new SearchSheetViewModel.ScreenUI(data.getSheetTitle(), data.getHint(), K.f71697a));
        String startQuery = data.getStartQuery();
        if (startQuery != null) {
            this.querySubject.onNext(startQuery);
        }
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.disposables.d();
        super.onCleared();
    }

    @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetViewModel
    public void onTypedQuery(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.querySubject.onNext(query);
    }

    @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetViewModel
    public void suggestClicked(@NotNull SuggestVO suggest) {
        Intrinsics.checkNotNullParameter(suggest, "suggest");
        SearchSheetFragment.Data data = this.data;
        if (data != null) {
            if (suggest.getNotExact()) {
                getAction().setValue(new SearchSheetViewModel.Action.ChangeQuery(suggest.getTitle()));
                this.querySubject.onNext(suggest.getTitle());
            } else {
                getAction().setValue(new SearchSheetViewModel.Action.SuggestSelected(SearchSheetFragment.Data.copy$default(data, null, null, null, null, null, suggest, 31, null)));
                getAction().postValue(SearchSheetViewModel.Action.Dismiss.INSTANCE);
            }
        }
    }

    @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetViewModel
    @NotNull
    public SingleLiveEvent<SearchSheetViewModel.Action> getAction() {
        return this.action;
    }

    @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetViewModel
    @NotNull
    public V<Boolean> getLoader() {
        return this.loader;
    }

    @Override // ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetViewModel
    @NotNull
    public V<SearchSheetViewModel.ScreenUI> getScreenUI() {
        return this.screenUI;
    }
}
