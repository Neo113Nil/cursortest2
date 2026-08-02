package ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.adapter;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.model.TileScrollBlockVO;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.tile.MessengerTileDataBinder;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.tile.MessengerTileView;
import ru.ozon.app.android.universalwidgets.messenger.util.VisibleVH;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/adapter/MessengerTileViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/universalwidgets/messenger/util/VisibleVH;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/tile/MessengerTileView;", "view", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/tile/MessengerTileDataBinder;", "tileDataBinder", "<init>", "(Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/tile/MessengerTileView;Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/tile/MessengerTileDataBinder;)V", "", "onViewInVisibleBounds", "()V", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO;", "item", "bind", "(Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/model/TileScrollBlockVO$TileVO;)V", "onRecycle", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/tile/MessengerTileView;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/tile/MessengerTileDataBinder;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MessengerTileViewHolder extends RecyclerView.C implements VisibleVH {

    @NotNull
    private final MessengerTileDataBinder tileDataBinder;

    @NotNull
    private final MessengerTileView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerTileViewHolder(@NotNull MessengerTileView view, @NotNull MessengerTileDataBinder tileDataBinder) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tileDataBinder, "tileDataBinder");
        this.view = view;
        this.tileDataBinder = tileDataBinder;
    }

    public final void bind(@NotNull TileScrollBlockVO.TileVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.tileDataBinder.updateFixedWidth(this.view, item.getImageComponent().getImageModel().getImage().getWidthImage());
        this.tileDataBinder.bind(item);
    }

    public final void onRecycle() {
        this.tileDataBinder.onRecycle();
        this.tileDataBinder.onClear();
    }

    @Override // ru.ozon.app.android.universalwidgets.messenger.util.VisibleVH
    public void onViewInVisibleBounds() {
        this.tileDataBinder.onViewInVisibleBounds();
    }
}
