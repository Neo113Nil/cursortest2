package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelRailwaySchemeBitmapLoader$preloadItem$1 extends AbstractC7737t implements Function1<Bitmap, Bitmap> {
    final /* synthetic */ TravelRailwaySchemeBitmapLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelRailwaySchemeBitmapLoader$preloadItem$1(TravelRailwaySchemeBitmapLoader travelRailwaySchemeBitmapLoader) {
        super(1);
        this.this$0 = travelRailwaySchemeBitmapLoader;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Bitmap invoke(Bitmap preloadThemedBitmap) {
        Bitmap mutateItemBitmap;
        Intrinsics.checkNotNullParameter(preloadThemedBitmap, "$this$preloadThemedBitmap");
        mutateItemBitmap = this.this$0.mutateItemBitmap(preloadThemedBitmap);
        return mutateItemBitmap;
    }
}
