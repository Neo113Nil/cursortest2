package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.presentation;

import A00.a;
import Bl.b;
import Pc.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import gk0.q;
import h20.InterfaceC6786a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.data.SearchFormV5DTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.di.SearchFormV5Component;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.presentation.SearchFormV5VO;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.view.SearchFormV5Payload;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.view.SearchFormV5View;
import ru.ozon.app.android.travel.molecules.view.iconField.IconFieldVO;
import ru.ozon.app.android.travel.utils.returnScreenRefresh.ReturnScreenRefreshCallbacks;
import ru.ozon.composer.ui.widget.g;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J!\u0010+\u001a\u0004\u0018\u00010\u00032\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0003H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0003H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R&\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000202010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u0010<\u001a\u000e\u0012\n\b\u0001\u0012\u000608j\u0002`9078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5ViewMapper;", "Lru/ozon/composer/ui/widget/g;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/data/SearchFormV5DTO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/di/SearchFormV5Component;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/di/SearchFormV5Component;)V", "Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;", "old", "new", "", "isUiPartChanged", "(Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;)Z", "isActionChanged", "", "state", "canMap", "(Ljava/lang/Object;)Z", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/data/SearchFormV5DTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Landroid/view/View;", "view", "Lru/ozon/composer/ui/widget/k;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Lru/ozon/composer/ui/widget/l;", "viewItem", "", "constructLayout", "(Ll10/i;Lru/ozon/composer/ui/widget/l;)V", "Landroid/view/ViewGroup;", "parent", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO;)Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO;", "newItem", "getPayload", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO;Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO;)Ljava/lang/Object;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/di/SearchFormV5Component;", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5Update;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "LPc/a;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "getViewModelWidgetProvider", "()LPc/a;", "viewModelWidgetProvider", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SearchFormV5ViewMapper extends g<SearchFormV5DTO, SearchFormV5VO> {

    @NotNull
    private final SearchFormV5Component component;

    @NotNull
    private final List<Class<SearchFormV5Update>> supportedUpdates;

    public SearchFormV5ViewMapper(@NotNull SearchFormV5Component component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.supportedUpdates = C7714v.a0(SearchFormV5Update.class);
    }

    private final boolean isActionChanged(IconFieldVO old, IconFieldVO r42) {
        if (old == null && r42 == null) {
            return false;
        }
        return old == null || r42 == null || !Intrinsics.d(old.getCommonControlSettings(), r42.getCommonControlSettings());
    }

    private final boolean isUiPartChanged(IconFieldVO old, IconFieldVO r62) {
        if (old == null && r62 == null) {
            return false;
        }
        return (old != null && r62 != null && Intrinsics.d(old.getIcon(), r62.getIcon()) && Intrinsics.d(old.getText(), r62.getText()) && old.getIsCompact() == r62.getIsCompact() && Intrinsics.d(old.getBackgroundColor(), r62.getBackgroundColor()) && old.getCornerRadius() == r62.getCornerRadius()) ? false : true;
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof SearchFormV5DTO;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public void constructLayout(@NotNull i container, @NotNull l viewItem) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        new SearchFormV5Delegate(container, (ReturnScreenRefreshCallbacks) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.presentation.SearchFormV5ViewMapper$constructLayout$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                SearchFormV5Component searchFormV5Component;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                searchFormV5Component = SearchFormV5ViewMapper.this.component;
                SearchFormV5ViewModel searchFormViewModel = searchFormV5Component.getSearchFormViewModel();
                Intrinsics.g(searchFormViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return searchFormViewModel;
            }
        }).a(SearchFormV5ViewModel.class)).observeLifecycle();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<SearchFormV5VO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return new SearchFormV5WidgetViewHolder(this.component.getActionHandlersStoreFactory(), (SearchFormV5View) view, (SearchFormV5ViewModel) new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.presentation.SearchFormV5ViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                SearchFormV5Component searchFormV5Component;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                searchFormV5Component = SearchFormV5ViewMapper.this.component;
                SearchFormV5ViewModel searchFormViewModel = searchFormV5Component.getSearchFormViewModel();
                Intrinsics.g(searchFormViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return searchFormViewModel;
            }
        }).a(SearchFormV5ViewModel.class), container, this.component.getTokenizedAnalytics());
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SearchFormV5View searchFormV5View = (SearchFormV5View) b.a(SearchFormV5View.class, "type", q.f64554a, null);
        if (searchFormV5View == null) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            searchFormV5View = new SearchFormV5View(context);
        }
        searchFormV5View.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px = ResourceExtKt.toPx(16, context2);
        Context context3 = searchFormV5View.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        searchFormV5View.setPadding(0, px, 0, ResourceExtKt.toPx(6, context3));
        searchFormV5View.setTag(R$id.skip_composer_default_widget_background, Unit.f71690a);
        return searchFormV5View;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<SearchFormV5Update>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public a<? extends InterfaceC6786a> getViewModelWidgetProvider() {
        return this.component.getSearchFormWidgetViewModel();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull SearchFormV5VO oldItem, @NotNull SearchFormV5VO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        SearchFormV5Payload searchFormV5Payload = new SearchFormV5Payload();
        SearchFormV5VO.Content content = oldItem.getContent();
        SearchFormV5VO.Content content2 = newItem.getContent();
        if (content.getAreLocationsSwapped()) {
            searchFormV5Payload.setLocationsSwapped();
        } else {
            SearchFormV5VO.Content.Locations locations = content.getLocations();
            SearchFormV5VO.Content.Locations locations2 = content2.getLocations();
            if (!Intrinsics.d(locations, locations2)) {
                searchFormV5Payload.setLocationsChanged();
            }
            if (!Intrinsics.d(locations != null ? locations.getDeparture() : null, locations2 != null ? locations2.getDeparture() : null)) {
                searchFormV5Payload.setAnimateDeparture();
            }
            if (!Intrinsics.d(locations != null ? locations.getDestination() : null, locations2 != null ? locations2.getDestination() : null)) {
                searchFormV5Payload.setAnimateDestination();
            }
        }
        if (isUiPartChanged(content.getDateField(), content2.getDateField())) {
            searchFormV5Payload.setDateChanged();
        }
        if (isActionChanged(content.getDateField(), content2.getDateField())) {
            searchFormV5Payload.setDateActionChanged();
        }
        if (isUiPartChanged(content.getRightField(), content2.getRightField())) {
            searchFormV5Payload.setRightFieldChanged();
        }
        if (isActionChanged(content.getRightField(), content2.getRightField())) {
            searchFormV5Payload.setRightFieldActionChanged();
        }
        if (isUiPartChanged(content.getTouristField(), content2.getTouristField())) {
            searchFormV5Payload.setTouristFieldChanged();
        }
        if (isActionChanged(content.getTouristField(), content2.getTouristField())) {
            searchFormV5Payload.setTouristFieldActionChanged();
        }
        if (!Intrinsics.d(content.getSearchButton(), content2.getSearchButton())) {
            searchFormV5Payload.setSearchButtonChanged();
        }
        if (!Intrinsics.d(content.getBackgroundColor(), content2.getBackgroundColor())) {
            searchFormV5Payload.setBackgroundChanged();
        }
        if (content.getCornerRadius() != content2.getCornerRadius()) {
            searchFormV5Payload.setCornerRadiusChanged();
        }
        if (!Intrinsics.d(content.getLeftPatchColor(), content2.getLeftPatchColor())) {
            searchFormV5Payload.setLeftPatchChanged();
        }
        if (!Intrinsics.d(content.getRightPatchColor(), content2.getRightPatchColor())) {
            searchFormV5Payload.setRightPatchChanged();
        }
        if (!Intrinsics.d(content.getToggleCell(), content2.getToggleCell())) {
            searchFormV5Payload.setToggleCellChanged();
        }
        return searchFormV5Payload;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    public SearchFormV5VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull SearchFormV5VO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof SearchFormV5Update) {
            return SearchFormV5VO.copy$default(oldItem, 0L, ((SearchFormV5Update) update).getContent(), null, 5, null);
        }
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<SearchFormV5VO> map(@NotNull SearchFormV5DTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
