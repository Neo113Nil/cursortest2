package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view;

import Hj.C3143a;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.AdultImagesModel;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.TileGrid2GalleryModel;
import ru.ozon.app.android.storefrontcommonwidgets.utils.Dimens;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010!\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\bR\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(¨\u0006,"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/view/GalleryBaseViewDelegate;", "", "<init>", "()V", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel;", "model", "", "bindRatio", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel;)V", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/AdultImagesModel;", "", "adultConfirmed", "Lru/ozon/app/android/product/common/TileThemeConfigVO;", "theme", "bind", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/AdultImagesModel;ZLru/ozon/app/android/product/common/TileThemeConfigVO;)V", "swipeToFirstVideo", "Landroidx/recyclerview/widget/RecyclerView$u;", "recycledViewPool", "setRecycledViewPool", "(Landroidx/recyclerview/widget/RecyclerView$u;)V", "", "galleryRadius", "F", "getGalleryRadius", "()F", "setGalleryRadius", "(F)V", "Landroid/view/ViewOutlineProvider;", "galleryOutlineProvider", "Landroid/view/ViewOutlineProvider;", "getGalleryOutlineProvider", "()Landroid/view/ViewOutlineProvider;", "localModel", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel;", "getLocalModel", "()Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel;", "setLocalModel", "", "getContainerId", "()I", "containerId", "getBottomViewId", "bottomViewId", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class GalleryBaseViewDelegate {
    private TileGrid2GalleryModel localModel;
    private float galleryRadius = Dimens.INSTANCE.getDPF_12();

    @NotNull
    private final ViewOutlineProvider galleryOutlineProvider = new ViewOutlineProvider() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GalleryBaseViewDelegate$galleryOutlineProvider$1
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, C3143a.f(view, "view", outline, "outline"), (int) (GalleryBaseViewDelegate.this.getGalleryRadius() + view.getHeight()), GalleryBaseViewDelegate.this.getGalleryRadius());
        }
    };

    public abstract void bind(@NotNull AdultImagesModel model, boolean adultConfirmed, @NotNull TileThemeConfigVO theme);

    public abstract void bindRatio(@NotNull TileGrid2GalleryModel model);

    public abstract int getBottomViewId();

    public abstract int getContainerId();

    @NotNull
    public final ViewOutlineProvider getGalleryOutlineProvider() {
        return this.galleryOutlineProvider;
    }

    public final float getGalleryRadius() {
        return this.galleryRadius;
    }

    public final TileGrid2GalleryModel getLocalModel() {
        return this.localModel;
    }

    public final void setGalleryRadius(float f7) {
        this.galleryRadius = f7;
    }

    public final void setLocalModel(TileGrid2GalleryModel tileGrid2GalleryModel) {
        this.localModel = tileGrid2GalleryModel;
    }

    public void setRecycledViewPool(RecyclerView.u recycledViewPool) {
    }

    public void swipeToFirstVideo() {
    }
}
