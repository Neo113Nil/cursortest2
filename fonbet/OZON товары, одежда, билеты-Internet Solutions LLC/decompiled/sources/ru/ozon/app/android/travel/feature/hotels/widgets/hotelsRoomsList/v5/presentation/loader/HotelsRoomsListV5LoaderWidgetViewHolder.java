package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.loader;

import Vg.d;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.HotelsRoomsListV5ItemDecoration;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.loader.adapter.HotelsRoomsListV5LoaderAdapter;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\r0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/HotelsRoomsListV5LoaderWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/HotelsRoomsListV5LoaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;)V", "", "setUpRecyclerView", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/HotelsRoomsListV5LoaderVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/adapter/HotelsRoomsListV5LoaderAdapter;", "loaderAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/loader/adapter/HotelsRoomsListV5LoaderAdapter;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsListV5LoaderWidgetViewHolder extends k<HotelsRoomsListV5LoaderVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final HotelsRoomsListV5LoaderAdapter loaderAdapter;
    private final RecyclerView recyclerView;

    @NotNull
    private final ComposerReferences references;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsRoomsListV5LoaderWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.references = references;
        this.recyclerView = containerView instanceof RecyclerView ? (RecyclerView) containerView : null;
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new HotelsRoomsListV5LoaderWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.loaderAdapter = new HotelsRoomsListV5LoaderAdapter();
        setUpRecyclerView();
    }

    private final void setUpRecyclerView() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.loaderAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            recyclerView.addItemDecoration(new HotelsRoomsListV5ItemDecoration(context));
            recyclerView.setRecycledViewPool(this.references.getComposerViewPoolProvider().getViewPool());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsRoomsListV5LoaderVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.loaderAdapter.submitList(item.getPlaceholders());
        AtomAction action = item.getAction();
        if (action != null) {
            this.actionHandler.invoke(action);
        }
    }
}
