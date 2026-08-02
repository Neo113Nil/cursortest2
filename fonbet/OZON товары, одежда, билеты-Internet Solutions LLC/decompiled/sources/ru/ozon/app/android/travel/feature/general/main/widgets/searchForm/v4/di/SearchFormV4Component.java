package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.di;

import Vg.d;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.data.SearchFormV4Mapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation.SearchFormV4ViewModel;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation.SearchFormV4WidgetViewModel;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001a2\u00060\u0001j\u0002`\u0002:\u0001\u001aR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u000b\u001a\u00060\u0007j\u0002`\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0010\u001a\u00060\fj\u0002`\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/di/SearchFormV4Component;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4Mapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4Mapper;", "mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getActionHandlersStoreFactory", "()LVg/d;", "actionHandlersStoreFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4ViewModel;", "getSearchFormV4ViewModel", "()Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4ViewModel;", "searchFormV4ViewModel", "LPc/a;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4WidgetViewModel;", "getSearchFormV4WidgetViewModel", "()LPc/a;", "searchFormV4WidgetViewModel", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SearchFormV4Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/di/SearchFormV4Component$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/di/SearchFormV4Component;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SearchFormV4Component create$lambda$0(C7475g c7475g) {
            return new SearchFormV4Component$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<SearchFormV4Component> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(SearchFormV4Component.class), new CS.a(storage, 14));
        }
    }

    @NotNull
    d getActionHandlersStoreFactory();

    @NotNull
    SearchFormV4Mapper getMapper();

    @NotNull
    SearchFormV4ViewModel getSearchFormV4ViewModel();

    @NotNull
    Pc.a<SearchFormV4WidgetViewModel> getSearchFormV4WidgetViewModel();

    @NotNull
    l getTokenizedAnalytics();
}
