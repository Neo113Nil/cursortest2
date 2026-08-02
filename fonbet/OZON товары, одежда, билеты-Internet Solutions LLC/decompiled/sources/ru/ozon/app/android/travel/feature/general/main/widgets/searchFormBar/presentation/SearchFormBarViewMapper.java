package ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.presentation;

import Bl.b;
import android.content.Context;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c20.r;
import d20.AbstractC6065b;
import gk0.q;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.data.SearchFormBarDTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.di.SearchFormBarComponent;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.view.SearchFormBarBehavior;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.view.SearchFormBarView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\f\u001a\u00020\u00032\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/presentation/SearchFormBarViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/di/SearchFormBarComponent;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/data/SearchFormBarDTO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/presentation/SearchFormBarVO;", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/view/SearchFormBarView;", "createView", "(Landroid/content/Context;)Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/view/SearchFormBarView;", "state", "Ll20/d;", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/data/SearchFormBarDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchFormBarViewMapper extends OverlayWidgetScreenViewItemMapper2<SearchFormBarComponent, SearchFormBarDTO, SearchFormBarVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    private final SearchFormBarView createView(Context context) {
        SearchFormBarView searchFormBarView = (SearchFormBarView) b.a(SearchFormBarView.class, "type", q.f64554a, null);
        if (searchFormBarView == null) {
            searchFormBarView = new SearchFormBarView(context);
        }
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -2);
        fVar.i(new SearchFormBarBehavior(ResourceExtKt.toPxF(8, context)));
        searchFormBarView.setLayoutParams(fVar);
        int px = ResourceExtKt.toPx(16, context);
        int px2 = ResourceExtKt.toPx(10, context);
        searchFormBarView.setPadding(px, px2, px, px2);
        searchFormBarView.setVisibility(4);
        return searchFormBarView;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<SearchFormBarVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        ViewGroup Z11 = container.Z();
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        return new SearchFormBarWidgetViewHolder(container, Z11, createView(L11));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SearchFormBarComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return SearchFormBarComponent.INSTANCE.create(storage);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<SearchFormBarVO> map(@NotNull SearchFormBarDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getMapper().invoke(state, info);
    }
}
