package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.TileGrid2BannerViewModelImpl", f = "TileGrid2BannerViewModel.kt", l = {169}, m = "safeTrackPixel")
/* loaded from: classes2.dex */
final class TileGrid2BannerViewModelImpl$safeTrackPixel$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TileGrid2BannerViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2BannerViewModelImpl$safeTrackPixel$1(TileGrid2BannerViewModelImpl tileGrid2BannerViewModelImpl, d<? super TileGrid2BannerViewModelImpl$safeTrackPixel$1> dVar) {
        super(dVar);
        this.this$0 = tileGrid2BannerViewModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object safeTrackPixel;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        safeTrackPixel = this.this$0.safeTrackPixel(null, this);
        return safeTrackPixel;
    }
}
