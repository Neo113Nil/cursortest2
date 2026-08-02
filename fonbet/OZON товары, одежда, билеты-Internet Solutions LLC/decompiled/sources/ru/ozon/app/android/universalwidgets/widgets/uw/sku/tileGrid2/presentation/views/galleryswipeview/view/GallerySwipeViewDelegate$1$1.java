package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.TileGrid2GalleryModel;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view.GallerySwipeViewDelegate;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newPosition", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class GallerySwipeViewDelegate$1$1 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ GallerySwipeViewDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GallerySwipeViewDelegate$1$1(GallerySwipeViewDelegate gallerySwipeViewDelegate) {
        super(1);
        this.this$0 = gallerySwipeViewDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        List<GallerySwipeViewDelegate.OnPositionChangedListener> list;
        int i12;
        this.this$0.currentPosition = i11;
        TileGrid2GalleryModel localModel = this.this$0.getLocalModel();
        if (localModel != null) {
            localModel.setGalleryPosition(i11);
        }
        list = this.this$0.positionChangedListeners;
        GallerySwipeViewDelegate gallerySwipeViewDelegate = this.this$0;
        for (GallerySwipeViewDelegate.OnPositionChangedListener onPositionChangedListener : list) {
            i12 = gallerySwipeViewDelegate.currentPosition;
            onPositionChangedListener.onPositionChanged(i12, i11);
        }
    }
}
