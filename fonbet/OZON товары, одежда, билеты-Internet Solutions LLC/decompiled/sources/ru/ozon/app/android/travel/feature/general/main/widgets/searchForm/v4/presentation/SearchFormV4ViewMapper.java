package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation;

import A00.a;
import Bl.b;
import Pc.a;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import gk0.q;
import h20.InterfaceC6786a;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.data.SearchFormV4DTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.data.SearchFormV4Mapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.di.SearchFormV4Component;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation.SearchFormV4VO;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.view.SearchFormV4Payload;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.view.SearchFormV4View;
import ru.ozon.app.android.travel.molecules.view.iconField.IconFieldVO;
import ru.ozon.app.android.travel.utils.returnScreenRefresh.ReturnFromAnotherPageOrBackgroundObserver;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001bj\b\u0012\u0004\u0012\u00020\u0002`\u001c2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u00100\u001a\u0004\u0018\u00010+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R,\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000203018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R&\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:09088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR \u0010H\u001a\u000e\u0012\n\b\u0001\u0012\u00060Dj\u0002`E0C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/di/SearchFormV4Component;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4DTO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO;", "<init>", "()V", "Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;", "old", "new", "", "isUiPartChanged", "(Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;)Z", "isActionChanged", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO;Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO;)Ljava/lang/Object;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "LA00/a$J$a;", "update", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO;)Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO;", "", "layout", "Ljava/lang/Void;", "getLayout", "()Ljava/lang/Void;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4ViewModel;", "viewModel", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4ViewModel;", "Lru/ozon/app/android/travel/utils/returnScreenRefresh/ReturnFromAnotherPageOrBackgroundObserver;", "lifecycleObserver$delegate", "LSc/j;", "getLifecycleObserver", "()Lru/ozon/app/android/travel/utils/returnScreenRefresh/ReturnFromAnotherPageOrBackgroundObserver;", "lifecycleObserver", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4Update;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4Mapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/data/SearchFormV4Mapper;", "mapper", "LPc/a;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "getViewModelWidgetProvider", "()LPc/a;", "viewModelWidgetProvider", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchFormV4ViewMapper extends WidgetViewMapper2<SearchFormV4Component, SearchFormV4DTO, SearchFormV4VO> {
    private final Void layout;
    private SearchFormV4ViewModel viewModel;

    /* renamed from: lifecycleObserver$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j lifecycleObserver = LazyUtilsKt.unsafeLazy(new SearchFormV4ViewMapper$lifecycleObserver$2(this));

    @NotNull
    private final Function2<View, ComposerReferences, SearchFormV4WidgetViewHolder> holderProducer = new SearchFormV4ViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<SearchFormV4Update>> supportedUpdates = C7714v.a0(SearchFormV4Update.class);

    /* JADX INFO: Access modifiers changed from: private */
    public final ReturnFromAnotherPageOrBackgroundObserver getLifecycleObserver() {
        return (ReturnFromAnotherPageOrBackgroundObserver) this.lifecycleObserver.getValue();
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

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SearchFormV4View searchFormV4View = (SearchFormV4View) b.a(SearchFormV4View.class, "type", q.f64554a, null);
        if (searchFormV4View == null) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            searchFormV4View = new SearchFormV4View(context);
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int px = ResourceExtKt.toPx(16, context2);
        Context context3 = searchFormV4View.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        searchFormV4View.setPadding(0, px, 0, ResourceExtKt.toPx(6, context3));
        searchFormV4View.setLayoutParams(layoutParams);
        searchFormV4View.setTag(R$id.skip_composer_default_widget_background, Unit.f71690a);
        return searchFormV4View;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, SearchFormV4WidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Integer getLayout() {
        return (Integer) getLayout();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<SearchFormV4Update>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public a<? extends InterfaceC6786a> getViewModelWidgetProvider() {
        return component().getSearchFormV4WidgetViewModel();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SearchFormV4Component> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return SearchFormV4Component.INSTANCE.create(storage);
    }

    public Void getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public SearchFormV4Mapper getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull SearchFormV4VO oldItem, @NotNull SearchFormV4VO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        SearchFormV4Payload searchFormV4Payload = new SearchFormV4Payload();
        SearchFormV4VO.Content content = oldItem.getContent();
        SearchFormV4VO.Content content2 = newItem.getContent();
        if (content.getAreLocationsSwapped()) {
            searchFormV4Payload.setLocationsSwapped();
        } else {
            SearchFormV4VO.Content.Locations locations = content.getLocations();
            SearchFormV4VO.Content.Locations locations2 = content2.getLocations();
            if (!Intrinsics.d(locations, locations2)) {
                searchFormV4Payload.setLocationsChanged();
            }
            if (!Intrinsics.d(locations.getDeparture(), locations2.getDeparture())) {
                searchFormV4Payload.setAnimateDeparture();
            }
            if (!Intrinsics.d(locations.getDestination(), locations2.getDestination())) {
                searchFormV4Payload.setAnimateDestination();
            }
        }
        if (isUiPartChanged(content.getDateField(), content2.getDateField())) {
            searchFormV4Payload.setDateChanged();
        }
        if (isActionChanged(content.getDateField(), content2.getDateField())) {
            searchFormV4Payload.setDateActionChanged();
        }
        if (isUiPartChanged(content.getRightField(), content2.getRightField())) {
            searchFormV4Payload.setRightFieldChanged();
        }
        if (isActionChanged(content.getRightField(), content2.getRightField())) {
            searchFormV4Payload.setRightFieldActionChanged();
        }
        if (isUiPartChanged(content.getTouristField(), content2.getTouristField())) {
            searchFormV4Payload.setTouristFieldChanged();
        }
        if (isActionChanged(content.getTouristField(), content2.getTouristField())) {
            searchFormV4Payload.setTouristFieldActionChanged();
        }
        if (!Intrinsics.d(content.getSearchButton(), content2.getSearchButton())) {
            searchFormV4Payload.setSearchButtonChanged();
        }
        if (!Intrinsics.d(content.getBackgroundColor(), content2.getBackgroundColor())) {
            searchFormV4Payload.setBackgroundChanged();
        }
        if (content.getCornerRadius() != content2.getCornerRadius()) {
            searchFormV4Payload.setCornerRadiusChanged();
        }
        if (!Intrinsics.d(content.getLeftPatchColor(), content2.getLeftPatchColor())) {
            searchFormV4Payload.setLeftPatchChanged();
        }
        if (!Intrinsics.d(content.getRightPatchColor(), content2.getRightPatchColor())) {
            searchFormV4Payload.setRightPatchChanged();
        }
        if (!Intrinsics.d(content.getToggleCell(), content2.getToggleCell())) {
            searchFormV4Payload.setToggleCellChanged();
        }
        return searchFormV4Payload;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public SearchFormV4VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull SearchFormV4VO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof SearchFormV4Update) {
            return SearchFormV4VO.copy$default(oldItem, 0L, ((SearchFormV4Update) update).getContent(), null, 5, null);
        }
        return null;
    }
}
