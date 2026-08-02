package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.vhUtils;

import android.view.ViewGroup;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011JQ\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00012\n\u0010\u0013\u001a\u00060\u000ej\u0002`\u000f2\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014j\u0004\u0018\u0001`\u00172\u0012\u0010\u001b\u001a\u000e\u0012\u0002\b\u00030\u0019j\u0006\u0012\u0002\b\u0003`\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/vhUtils/TopRightButtonsViewHolderUtils;", "", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/vhUtils/TopRightButtonViewHolderFactory;", "vhFactoryTopRightButton", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/vhUtils/TopRightButtonsViewHolderBinder;", "topRightButtonsViewHolderBinder", "<init>", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/vhUtils/TopRightButtonViewHolderFactory;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/vhUtils/TopRightButtonsViewHolderBinder;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "createViewHolder", "(Landroid/view/ViewGroup;ILru/ozon/app/android/composer/ComposerReferences;)Ljk0/j;", "model", "vh", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/BuildedActionHandler;", "actionHandler", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "bindViewHolder", "(Ljava/lang/Object;Ljk0/j;Lkotlin/jvm/functions/Function1;Lru/ozon/composer/ui/widget/k;)V", "getItemViewType", "(Ljava/lang/Object;)I", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/vhUtils/TopRightButtonViewHolderFactory;", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/topRightButtons/rv/vhUtils/TopRightButtonsViewHolderBinder;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TopRightButtonsViewHolderUtils {

    @NotNull
    private final TopRightButtonsViewHolderBinder topRightButtonsViewHolderBinder;

    @NotNull
    private final TopRightButtonViewHolderFactory vhFactoryTopRightButton;

    public TopRightButtonsViewHolderUtils(@NotNull TopRightButtonViewHolderFactory vhFactoryTopRightButton, @NotNull TopRightButtonsViewHolderBinder topRightButtonsViewHolderBinder) {
        Intrinsics.checkNotNullParameter(vhFactoryTopRightButton, "vhFactoryTopRightButton");
        Intrinsics.checkNotNullParameter(topRightButtonsViewHolderBinder, "topRightButtonsViewHolderBinder");
        this.vhFactoryTopRightButton = vhFactoryTopRightButton;
        this.topRightButtonsViewHolderBinder = topRightButtonsViewHolderBinder;
    }

    public final void bindViewHolder(@NotNull Object model, @NotNull j vh2, Function1<? super AtomAction, Unit> actionHandler, @NotNull k<?> widgetViewHolder) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(vh2, "vh");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        this.topRightButtonsViewHolderBinder.bindViewHolder(vh2, model, actionHandler, widgetViewHolder);
    }

    @NotNull
    public final j createViewHolder(@NotNull ViewGroup parent, int viewType, @NotNull ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        return this.vhFactoryTopRightButton.createViewHolder(parent, viewType, composerReferences);
    }

    public final int getItemViewType(@NotNull Object model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return this.vhFactoryTopRightButton.getViewType(model);
    }
}
