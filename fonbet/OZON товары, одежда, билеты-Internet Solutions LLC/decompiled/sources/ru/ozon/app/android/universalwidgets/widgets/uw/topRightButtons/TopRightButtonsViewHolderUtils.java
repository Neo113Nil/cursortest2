package ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons;

import W10.c;
import android.view.ViewGroup;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\n\u0010\u001d\u001a\u00060\u0018j\u0002`\u00192\u001a\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001ej\u0004\u0018\u0001` ¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0001¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/TopRightButtonsViewHolderUtils;", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/TopRightButtonsViewHolderFactory;", "vhFactoryTopRightButton", "Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/TopRightButtonsViewHolderBinder;", "topRightButtonsViewHolderBinder", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/TopRightButtonsViewHolderFactory;Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/TopRightButtonsViewHolderBinder;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "", "setTrackingData", "(LW10/c;)V", "Lru/ozon/composer/ui/widget/l;", "widgetViewItem", "setWidgetViewItem", "(Lru/ozon/composer/ui/widget/l;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "createViewHolder", "(Landroid/view/ViewGroup;ILru/ozon/app/android/composer/ComposerReferences;)Ljk0/j;", "model", "vh", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/BuildedActionHandler;", "actionHandler", "bindViewHolder", "(Ljava/lang/Object;Ljk0/j;Lkotlin/jvm/functions/Function1;)V", "getItemViewType", "(Ljava/lang/Object;)I", "Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/TopRightButtonsViewHolderFactory;", "Lru/ozon/app/android/universalwidgets/widgets/uw/topRightButtons/TopRightButtonsViewHolderBinder;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TopRightButtonsViewHolderUtils {

    @NotNull
    private final TopRightButtonsViewHolderBinder topRightButtonsViewHolderBinder;

    @NotNull
    private final TopRightButtonsViewHolderFactory vhFactoryTopRightButton;

    public TopRightButtonsViewHolderUtils(@NotNull TopRightButtonsViewHolderFactory vhFactoryTopRightButton, @NotNull TopRightButtonsViewHolderBinder topRightButtonsViewHolderBinder) {
        Intrinsics.checkNotNullParameter(vhFactoryTopRightButton, "vhFactoryTopRightButton");
        Intrinsics.checkNotNullParameter(topRightButtonsViewHolderBinder, "topRightButtonsViewHolderBinder");
        this.vhFactoryTopRightButton = vhFactoryTopRightButton;
        this.topRightButtonsViewHolderBinder = topRightButtonsViewHolderBinder;
    }

    public final void bindViewHolder(@NotNull Object model, @NotNull j vh2, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(vh2, "vh");
        this.topRightButtonsViewHolderBinder.bindViewHolder(vh2, model, actionHandler);
    }

    @NotNull
    public final j createViewHolder(@NotNull ViewGroup parent, int viewType, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(references, "references");
        return this.vhFactoryTopRightButton.createViewHolder(parent, viewType, references);
    }

    public final int getItemViewType(@NotNull Object model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return this.vhFactoryTopRightButton.getViewType(model);
    }

    public final void setTrackingData(c trackingData) {
        this.vhFactoryTopRightButton.setTrackingData(trackingData);
    }

    public final void setWidgetViewItem(l widgetViewItem) {
        this.vhFactoryTopRightButton.setWidgetViewItem(widgetViewItem);
    }
}
