package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.data.ToursSearchResultDTO;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.di.ToursSearchResultComponent;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.view.ToursSearchResultView;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R<\u0010\u0017\u001a$\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0015j\b\u0012\u0004\u0012\u00020\u0004`\u00160\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR0\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u001bj\u0002`\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001d0\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001a¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/di/ToursSearchResultComponent;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultDTO;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/view/ToursSearchResultView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/view/ToursSearchResultView;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "getMapper", "mapper", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ToursSearchResultViewMapper extends WidgetViewMapper2<ToursSearchResultComponent, ToursSearchResultDTO, ToursSearchResultVO> {

    @NotNull
    private final Function2<View, ComposerReferences, k<ToursSearchResultVO>> holderProducer = new ToursSearchResultViewMapper$holderProducer$1(this);

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<ToursSearchResultVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<ToursSearchResultDTO, d, List<ToursSearchResultVO>> getMapper() {
        return component().getToursSearchResultMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ToursSearchResultComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ToursSearchResultComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public ToursSearchResultView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ToursSearchResultView toursSearchResultView = new ToursSearchResultView(context);
        toursSearchResultView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return toursSearchResultView;
    }
}
