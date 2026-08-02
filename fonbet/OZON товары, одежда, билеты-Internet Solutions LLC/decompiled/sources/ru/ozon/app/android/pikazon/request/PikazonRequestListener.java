package ru.ozon.app.android.pikazon.request;

import T5.a;
import V5.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m6.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.glide.loaders.PikazonUrl;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\f\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00028\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ9\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u000e2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0015\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0017\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pikazon/request/PikazonRequestListener;", "Resource", "", "model", "target", "", "onLoadStarted", "(Ljava/lang/Object;Ljava/lang/Object;)V", "resource", "Lm6/h;", "LT5/a;", "dataSource", "onLoadSucceed", "(Ljava/lang/Object;Ljava/lang/Object;Lm6/h;LT5/a;)V", "Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrl;", "onPreviewSucceed", "(Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrl;Ljava/lang/Object;Lm6/h;LT5/a;)V", "LV5/q;", "exception", "onPreviewFailed", "(Lru/ozon/app/android/pikazon/glide/loaders/PikazonUrl;Lm6/h;LV5/q;)V", "onLoadFailed", "(Ljava/lang/Object;Lm6/h;LV5/q;)V", "onLoadCancelled", "(Ljava/lang/Object;Lm6/h;)V", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PikazonRequestListener<Resource> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <Resource> void onLoadCancelled(@NotNull PikazonRequestListener<Resource> pikazonRequestListener, Object obj, h<Resource> hVar) {
        }

        public static <Resource> void onLoadStarted(@NotNull PikazonRequestListener<Resource> pikazonRequestListener, @NotNull Object model, Object obj) {
            Intrinsics.checkNotNullParameter(model, "model");
        }

        public static <Resource> void onLoadSucceed(@NotNull PikazonRequestListener<Resource> pikazonRequestListener, Object obj, Resource resource, h<Resource> hVar, a aVar) {
        }

        public static <Resource> void onPreviewFailed(@NotNull PikazonRequestListener<Resource> pikazonRequestListener, @NotNull PikazonUrl model, h<Resource> hVar, q qVar) {
            Intrinsics.checkNotNullParameter(model, "model");
        }

        public static <Resource> void onPreviewSucceed(@NotNull PikazonRequestListener<Resource> pikazonRequestListener, @NotNull PikazonUrl model, Resource resource, h<Resource> hVar, a aVar) {
            Intrinsics.checkNotNullParameter(model, "model");
        }
    }

    void onLoadCancelled(Object model, h<Resource> target);

    void onLoadFailed(Object model, h<Resource> target, q exception);

    void onLoadStarted(@NotNull Object model, Object target);

    void onLoadSucceed(Object model, Resource resource, h<Resource> target, a dataSource);

    void onPreviewFailed(@NotNull PikazonUrl model, h<Resource> target, q exception);

    void onPreviewSucceed(@NotNull PikazonUrl model, Resource resource, h<Resource> target, a dataSource);
}
