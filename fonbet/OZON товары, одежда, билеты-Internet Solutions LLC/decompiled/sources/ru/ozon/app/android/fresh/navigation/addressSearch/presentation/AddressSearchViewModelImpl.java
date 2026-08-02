package ru.ozon.app.android.fresh.navigation.addressSearch.presentation;

import AA.d;
import BT.b;
import Bc.f;
import Bc.h;
import Bc.i;
import Cw.c;
import GZ.g;
import He0.a;
import Lz.C3602a;
import Nc.C3669c;
import Sc.r;
import android.content.Context;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import com.google.android.gms.actions.SearchIntents;
import io.reactivex.p;
import io.reactivex.y;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.fresh.navigation.addressSearch.data.ValidateAddressResponseDTO;
import ru.ozon.app.android.fresh.navigation.addressSearch.domain.AddressValidationRepository;
import ru.ozon.app.android.fresh.navigation.addressSearch.domain.MapSdkSuggestionVO;
import ru.ozon.app.android.fresh.navigation.addressSearch.domain.SuggestionVO;
import ru.ozon.app.android.fresh.navigation.addressSearch.presentation.AddressSearchViewModel;
import ru.ozon.app.android.fresh.navigation.addressSearch.presentation.AddressSearchViewModelImpl;
import ru.ozon.app.android.mapcommon.mapcommon.SdkSuggestionsControllerWrapper;
import ru.ozon.app.android.mapcommon.mapcommon.di.provider.SdkSuggestionsControllerWrapperProvider;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import sc.C9656b;
import vc.n;
import yc.C10880a;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001EB)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0011J'\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000fH\u0014¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R \u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u0010,\u001a\b\u0012\u0004\u0012\u00020+0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R \u00100\u001a\b\u0012\u0004\u0012\u00020/0.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\r048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R0\u0010C\u001a\u001c\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0A0@\u0012\u0004\u0012\u00020\u000f\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel;", "LGZ/g;", "ozonRouter", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "Lru/ozon/app/android/fresh/navigation/addressSearch/domain/AddressValidationRepository;", "addressValidationRepostiory", "Lru/ozon/app/android/mapcommon/mapcommon/di/provider/SdkSuggestionsControllerWrapperProvider;", "ozonSuggestionsProvider", "<init>", "(LGZ/g;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/fresh/navigation/addressSearch/domain/AddressValidationRepository;Lru/ozon/app/android/mapcommon/mapcommon/di/provider/SdkSuggestionsControllerWrapperProvider;)V", "", SearchIntents.EXTRA_QUERY, "", "updateSearchViewValue", "(Ljava/lang/String;)V", "error", "showError", "(Ljava/lang/String;Ljava/lang/String;)V", "bindInitial", "searchText", "onQueryChanged", "Landroid/content/Context;", "context", "Lru/ozon/app/android/fresh/navigation/addressSearch/domain/MapSdkSuggestionVO;", "suggest", "", "index", "suggestClicked", "(Landroid/content/Context;Lru/ozon/app/android/fresh/navigation/addressSearch/domain/MapSdkSuggestionVO;I)V", "onCleared", "()V", "LGZ/g;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "Lru/ozon/app/android/fresh/navigation/addressSearch/domain/AddressValidationRepository;", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel$ScreenUI;", "screenUI", "Landroidx/lifecycle/V;", "getScreenUI", "()Landroidx/lifecycle/V;", "", "loader", "getLoader", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel$Action;", "action", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getAction", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "LNc/c;", "querySubject", "LNc/c;", "Lnc/a;", "disposables", "Lnc/a;", "Lru/ozon/app/android/mapcommon/mapcommon/SdkSuggestionsControllerWrapper;", "suggestionController", "Lru/ozon/app/android/mapcommon/mapcommon/SdkSuggestionsControllerWrapper;", "currentQuery", "Ljava/lang/String;", "Lkotlin/Function1;", "LSc/r;", "", "LHe0/a;", "searchListener", "Lkotlin/jvm/functions/Function1;", "Companion", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressSearchViewModelImpl extends w0 implements AddressSearchViewModel {

    @NotNull
    private final SingleLiveEvent<AddressSearchViewModel.Action> action;

    @NotNull
    private final AddressValidationRepository addressValidationRepostiory;

    @NotNull
    private String currentQuery;

    @NotNull
    private final C8486a disposables;

    @NotNull
    private final HandlersInhibitor inhibitor;

    @NotNull
    private final V<Boolean> loader;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final C3669c<String> querySubject;

    @NotNull
    private final V<AddressSearchViewModel.ScreenUI> screenUI;
    private Function1<? super r<? extends List<a>>, Unit> searchListener;

    @NotNull
    private final SdkSuggestionsControllerWrapper suggestionController;

    public AddressSearchViewModelImpl(@NotNull g ozonRouter, @NotNull HandlersInhibitor inhibitor, @NotNull AddressValidationRepository addressValidationRepostiory, @NotNull SdkSuggestionsControllerWrapperProvider ozonSuggestionsProvider) {
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        Intrinsics.checkNotNullParameter(addressValidationRepostiory, "addressValidationRepostiory");
        Intrinsics.checkNotNullParameter(ozonSuggestionsProvider, "ozonSuggestionsProvider");
        this.ozonRouter = ozonRouter;
        this.inhibitor = inhibitor;
        this.addressValidationRepostiory = addressValidationRepostiory;
        this.screenUI = new V<>();
        this.loader = new V<>();
        this.action = new SingleLiveEvent<>();
        C3669c<String> d11 = C3669c.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.querySubject = d11;
        this.disposables = new C8486a();
        this.suggestionController = ozonSuggestionsProvider.provideSuggestionsController();
        this.currentQuery = "";
        this.searchListener = new AddressSearchViewModelImpl$searchListener$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindInitial$lambda$0(AddressSearchViewModelImpl addressSearchViewModelImpl) {
        addressSearchViewModelImpl.suggestionController.setSearchListener(addressSearchViewModelImpl.searchListener);
        addressSearchViewModelImpl.suggestionController.onStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindInitial$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(String error, String query) {
        getAction().setValue(new AddressSearchViewModel.Action.ShowError(error));
        getAction().setValue(new AddressSearchViewModel.Action.ChangeQuery(query));
        this.querySubject.onNext(query);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SuggestionVO suggestClicked$lambda$6(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (SuggestionVO) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void suggestClicked$lambda$9(AddressSearchViewModelImpl addressSearchViewModelImpl) {
        addressSearchViewModelImpl.getLoader().postValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSearchViewValue(String query) {
        getAction().setValue(new AddressSearchViewModel.Action.ChangeQuery(query));
        this.querySubject.onNext(query);
    }

    @Override // ru.ozon.app.android.fresh.navigation.addressSearch.presentation.AddressSearchViewModel
    public void bindInitial(String query) {
        this.disposables.d();
        C8486a c8486a = this.disposables;
        n d11 = SdkSuggestionsControllerWrapper.DefaultImpls.createService$default(this.suggestionController, new AddressSearchViewModelImpl$bindInitial$1(getLoader()), null, null, false, 14, null).d(new InterfaceC9019a() { // from class: Nw.c
            @Override // qc.InterfaceC9019a
            public final void run() {
                AddressSearchViewModelImpl.bindInitial$lambda$0(AddressSearchViewModelImpl.this);
            }
        });
        int i11 = 3;
        p<String> doOnNext = this.querySubject.debounce(300L, TimeUnit.MILLISECONDS).filter(new d(AddressSearchViewModelImpl$bindInitial$3.INSTANCE, i11)).doOnNext(new c(new AddressSearchViewModelImpl$bindInitial$4(this), i11));
        C9656b.c(doOnNext, "next is null");
        InterfaceC8487b subscribe = new C10880a(d11, doOnNext).subscribeOn(Mc.a.b()).subscribe(new b(AddressSearchViewModelImpl$bindInitial$5.INSTANCE, 1), new GJ.b(AddressSearchViewModelImpl$bindInitial$6.INSTANCE, 2));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, subscribe);
        if (query != null) {
            this.currentQuery = query;
            this.querySubject.onNext(query);
        }
    }

    @Override // androidx.lifecycle.w0
    protected void onCleared() {
        this.disposables.d();
        this.suggestionController.clear();
        super.onCleared();
    }

    @Override // ru.ozon.app.android.fresh.navigation.addressSearch.presentation.AddressSearchViewModel
    public void onQueryChanged(@NotNull String searchText) {
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        this.currentQuery = searchText;
        this.querySubject.onNext(searchText);
    }

    @Override // ru.ozon.app.android.fresh.navigation.addressSearch.presentation.AddressSearchViewModel
    public void suggestClicked(@NotNull Context context, @NotNull MapSdkSuggestionVO suggest, int index) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(suggest, "suggest");
        String searchText = suggest.getSearchText();
        C8486a c8486a = this.disposables;
        y<ValidateAddressResponseDTO> validateSuggestion = this.addressValidationRepostiory.validateSuggestion(this.currentQuery, suggest.getSearchText(), index + 1);
        GJ.a aVar = new GJ.a(AddressSearchViewModelImpl$suggestClicked$1.INSTANCE, 1);
        validateSuggestion.getClass();
        InterfaceC8487b h11 = new f(new h(new i(new Bc.r(validateSuggestion, aVar), new NX.a(new AddressSearchViewModelImpl$suggestClicked$2(this), 1)).j(Mc.a.b()).g(C8125a.a()), new IJ.a(new AddressSearchViewModelImpl$suggestClicked$3(this, searchText), 1)), new InterfaceC9019a() { // from class: Nw.b
            @Override // qc.InterfaceC9019a
            public final void run() {
                AddressSearchViewModelImpl.suggestClicked$lambda$9(AddressSearchViewModelImpl.this);
            }
        }).h(new AA.a(new AddressSearchViewModelImpl$suggestClicked$5(this, suggest), 3), new C3602a(AddressSearchViewModelImpl$suggestClicked$6.INSTANCE, 1));
        Intrinsics.checkNotNullExpressionValue(h11, "subscribe(...)");
        RxExtKt.plusAssign(c8486a, h11);
    }

    @Override // ru.ozon.app.android.fresh.navigation.addressSearch.presentation.AddressSearchViewModel
    @NotNull
    public SingleLiveEvent<AddressSearchViewModel.Action> getAction() {
        return this.action;
    }

    @Override // ru.ozon.app.android.fresh.navigation.addressSearch.presentation.AddressSearchViewModel
    @NotNull
    public V<Boolean> getLoader() {
        return this.loader;
    }

    @Override // ru.ozon.app.android.fresh.navigation.addressSearch.presentation.AddressSearchViewModel
    @NotNull
    public V<AddressSearchViewModel.ScreenUI> getScreenUI() {
        return this.screenUI;
    }
}
