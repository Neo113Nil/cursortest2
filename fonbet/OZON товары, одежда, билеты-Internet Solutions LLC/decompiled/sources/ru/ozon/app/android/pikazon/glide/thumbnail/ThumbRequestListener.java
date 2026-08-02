package ru.ozon.app.android.pikazon.glide.thumbnail;

import T5.a;
import V5.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m6.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.glide.loaders.PikazonUrl;
import ru.ozon.app.android.pikazon.request.PikazonRequestListener;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0010\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00122\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u0019\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001b\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbRequestListener;", "Lru/ozon/app/android/pikazon/request/PikazonRequestListener;", "", "Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbCache;", "thumbCache", "<init>", "(Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbCache;)V", "model", "target", "", "onLoadStarted", "(Ljava/lang/Object;Ljava/lang/Object;)V", "resource", "Lm6/h;", "LT5/a;", "dataSource", "onLoadSucceed", "(Ljava/lang/Object;Ljava/lang/Object;Lm6/h;LT5/a;)V", "Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrl;", "onPreviewSucceed", "(Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrl;Ljava/lang/Object;Lm6/h;LT5/a;)V", "LV5/q;", "exception", "onPreviewFailed", "(Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrl;Lm6/h;LV5/q;)V", "onLoadFailed", "(Ljava/lang/Object;Lm6/h;LV5/q;)V", "onLoadCancelled", "(Ljava/lang/Object;Lm6/h;)V", "Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbCache;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThumbRequestListener implements PikazonRequestListener<Object> {

    @NotNull
    private final ThumbCache thumbCache;

    public ThumbRequestListener(@NotNull ThumbCache thumbCache) {
        Intrinsics.checkNotNullParameter(thumbCache, "thumbCache");
        this.thumbCache = thumbCache;
    }

    @Override // ru.ozon.app.android.pikazon.request.PikazonRequestListener
    public void onLoadCancelled(Object model, h<Object> target) {
    }

    @Override // ru.ozon.app.android.pikazon.request.PikazonRequestListener
    public void onLoadFailed(Object model, h<Object> target, q exception) {
    }

    @Override // ru.ozon.app.android.pikazon.request.PikazonRequestListener
    public void onLoadStarted(@NotNull Object model, Object target) {
        Intrinsics.checkNotNullParameter(model, "model");
    }

    @Override // ru.ozon.app.android.pikazon.request.PikazonRequestListener
    public void onLoadSucceed(Object model, @NotNull Object resource, h<Object> target, a dataSource) {
        Thumb pendingOrNull;
        Intrinsics.checkNotNullParameter(resource, "resource");
        if (!(model instanceof PikazonUrl) || (pendingOrNull = this.thumbCache.getPendingOrNull(((PikazonUrl) model).getUuid())) == null) {
            return;
        }
        this.thumbCache.put(Thumb.copy$lib_release$default(pendingOrNull, null, null, 0, 0, false, null, 47, null));
    }

    @Override // ru.ozon.app.android.pikazon.request.PikazonRequestListener
    public void onPreviewFailed(@NotNull PikazonUrl model, h<Object> target, q exception) {
        Intrinsics.checkNotNullParameter(model, "model");
    }

    @Override // ru.ozon.app.android.pikazon.request.PikazonRequestListener
    public void onPreviewSucceed(@NotNull PikazonUrl model, @NotNull Object resource, h<Object> target, a dataSource) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(resource, "resource");
    }
}
