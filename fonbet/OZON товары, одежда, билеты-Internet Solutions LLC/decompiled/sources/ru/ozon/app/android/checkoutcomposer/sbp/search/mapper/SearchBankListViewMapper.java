package ru.ozon.app.android.checkoutcomposer.sbp.search.mapper;

import android.view.LayoutInflater;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkout.databinding.WidgetSearchBankListBinding;
import ru.ozon.app.android.checkoutcomposer.sbp.search.data.SearchBankListDTO;
import ru.ozon.app.android.checkoutcomposer.sbp.search.di.SearchBankListComponent;
import ru.ozon.app.android.checkoutcomposer.sbp.search.presentation.SearchBankListVO;
import ru.ozon.app.android.checkoutcomposer.sbp.search.presentation.SearchBankListViewHolder;
import ru.ozon.app.android.checkoutcomposer.sbp.search.presentation.SearchBankListViewModel;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/sbp/search/mapper/SearchBankListViewMapper;", "Lc20/r;", "Lru/ozon/app/android/checkoutcomposer/sbp/search/data/SearchBankListDTO;", "Lru/ozon/app/android/checkoutcomposer/sbp/search/presentation/SearchBankListVO;", "Lru/ozon/app/android/checkoutcomposer/sbp/search/di/SearchBankListComponent;", "component", "<init>", "(Lru/ozon/app/android/checkoutcomposer/sbp/search/di/SearchBankListComponent;)V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/checkoutcomposer/sbp/search/data/SearchBankListDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lru/ozon/app/android/checkoutcomposer/sbp/search/di/SearchBankListComponent;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SearchBankListViewMapper extends r<SearchBankListDTO, SearchBankListVO> {

    @NotNull
    private final SearchBankListComponent component;

    @NotNull
    private final r.a viewType;

    public SearchBankListViewMapper(@NotNull SearchBankListComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<SearchBankListVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        WidgetSearchBankListBinding inflate = WidgetSearchBankListBinding.inflate(LayoutInflater.from(container.L()), container.Z(), false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new SearchBankListViewHolder(inflate, (SearchBankListViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.checkoutcomposer.sbp.search.mapper.SearchBankListViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                SearchBankListComponent searchBankListComponent;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                searchBankListComponent = SearchBankListViewMapper.this.component;
                SearchBankListViewModel viewModelProvider = searchBankListComponent.getViewModelProvider();
                Intrinsics.g(viewModelProvider, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModelProvider;
            }
        }).a(SearchBankListViewModel.class), container, this.component.getCustomActionHandlersStoreFactory());
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<SearchBankListVO> map(@NotNull SearchBankListDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
