package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.prefetch;

import Sc.s;
import Wc.a;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.prefetch.TileGrid2GalleryImagePrefetchHelper$onScrollStateChanged$1", f = "TileGrid2GalleryImagePrefetchHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TileGrid2GalleryImagePrefetchHelper$onScrollStateChanged$1 extends j implements Function1<d<? super Unit>, Object> {
    final /* synthetic */ RecyclerView $recyclerView;
    int label;
    final /* synthetic */ TileGrid2GalleryImagePrefetchHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2GalleryImagePrefetchHelper$onScrollStateChanged$1(TileGrid2GalleryImagePrefetchHelper tileGrid2GalleryImagePrefetchHelper, RecyclerView recyclerView, d<? super TileGrid2GalleryImagePrefetchHelper$onScrollStateChanged$1> dVar) {
        super(1, dVar);
        this.this$0 = tileGrid2GalleryImagePrefetchHelper;
        this.$recyclerView = recyclerView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(d<?> dVar) {
        return new TileGrid2GalleryImagePrefetchHelper$onScrollStateChanged$1(this.this$0, this.$recyclerView, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ImagePrefetcher imagePrefetcher;
        HashMap hashMap;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        imagePrefetcher = this.this$0.imagePrefetcher;
        Context context = this.$recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        hashMap = this.this$0.itemsToPrefetch;
        Collection values = hashMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        imagePrefetcher.prefetch(context, values);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d<? super Unit> dVar) {
        return ((TileGrid2GalleryImagePrefetchHelper$onScrollStateChanged$1) create(dVar)).invokeSuspend(Unit.f71690a);
    }
}
