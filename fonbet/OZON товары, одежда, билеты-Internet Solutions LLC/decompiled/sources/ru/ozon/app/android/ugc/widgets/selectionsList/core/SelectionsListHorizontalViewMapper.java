package ru.ozon.app.android.ugc.widgets.selectionsList.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.MarginItemDecoration;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListDTO;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI;
import ru.ozon.app.android.ugc.widgets.selectionsList.di.SelectionsListComponent;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R2\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001b0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/core/SelectionsListHorizontalViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ugc/widgets/selectionsList/di/SelectionsListComponent;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "createView", "(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/ugc/widgets/selectionsList/core/SelectionsListMapper;", "getMapper", "()Lru/ozon/app/android/ugc/widgets/selectionsList/core/SelectionsListMapper;", "mapper", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SelectionsListHorizontalViewMapper extends WidgetViewMapper2<SelectionsListComponent, SelectionsListDTO, SelectionsListVI> {

    @NotNull
    private final Function2<View, ComposerReferences, k<SelectionsListVI>> holderProducer = new SelectionsListHorizontalViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof SelectionsListDTO) && ((SelectionsListDTO) state).getLayout() == SelectionsListDTO.LayoutType.LAYOUT_SCROLL;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<SelectionsListVI>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SelectionsListComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return SelectionsListComponent.INSTANCE.getInstance(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public RecyclerView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RecyclerView recyclerView = new RecyclerView(parent.getContext());
        recyclerView.setLayoutParams(new RecyclerView.p(-1, -2));
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setBackgroundColor(styleParser.parseColor(context, getMapper().getBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()));
        Dimens dimens = Dimens.INSTANCE;
        recyclerView.addItemDecoration(new MarginItemDecoration(dimens.getDP_2(), dimens.getDP_8()));
        recyclerView.setNestedScrollingEnabled(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(true);
        recyclerView.setClipToPadding(true);
        recyclerView.setClipChildren(true);
        return recyclerView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public SelectionsListMapper getMapper() {
        return component().getSelectionsListMapper();
    }
}
