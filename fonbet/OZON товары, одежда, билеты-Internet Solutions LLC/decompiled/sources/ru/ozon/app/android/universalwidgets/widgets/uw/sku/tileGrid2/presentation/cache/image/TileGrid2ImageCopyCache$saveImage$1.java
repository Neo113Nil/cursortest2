package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.image;

import Sc.s;
import Wc.a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.collection.C5155y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.image.TileGrid2ImageCopyCache$saveImage$1", f = "TileGrid2ImageCopyCache.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TileGrid2ImageCopyCache$saveImage$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ BitmapDrawable $image;
    final /* synthetic */ String $key;
    int label;
    final /* synthetic */ TileGrid2ImageCopyCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2ImageCopyCache$saveImage$1(BitmapDrawable bitmapDrawable, TileGrid2ImageCopyCache tileGrid2ImageCopyCache, String str, d<? super TileGrid2ImageCopyCache$saveImage$1> dVar) {
        super(2, dVar);
        this.$image = bitmapDrawable;
        this.this$0 = tileGrid2ImageCopyCache;
        this.$key = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TileGrid2ImageCopyCache$saveImage$1(this.$image, this.this$0, this.$key, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        C5155y c5155y;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Bitmap bitmap = this.$image.getBitmap();
        Bitmap.Config config = this.$image.getBitmap().getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap copy = bitmap.copy(config, false);
        Intrinsics.f(copy);
        context = this.this$0.context;
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, copy);
        c5155y = this.this$0.cache;
        c5155y.put(this.$key, bitmapDrawable);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TileGrid2ImageCopyCache$saveImage$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
