package ru.ozon.app.android.pikazon.glide.request;

import S5.k;
import T5.a;
import T5.g;
import V5.q;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import c6.n;
import com.bumptech.glide.m;
import e6.C6307e;
import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l6.AbstractC7878a;
import l6.i;
import m6.h;
import n6.C8446a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriorityExtKt;
import ru.ozon.app.android.pikazon.glide.thumbnail.Thumb;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.glide.transformations.factory.ImageTransformationsFactory;
import ru.ozon.app.android.pikazon.glide.transformations.internal.MaxSizeTransformation;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.logging.PikazonLogger;
import ru.ozon.app.android.pikazon.request.PikazonRequestListener;

@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aY\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a-\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0017\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a;\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a3\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a-\u0010\u001f\u001a\u00020\u001e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0099\u0001\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010!22\b\u0002\u0010'\u001a,\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010%\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0004\u0012\u00020\t0#2,\b\u0002\u0010*\u001a&\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010%\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020\t0(H\u0000¢\u0006\u0004\b+\u0010,\u001a%\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020$0-H\u0002¢\u0006\u0004\b.\u0010/\u001a/\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0003¢\u0006\u0004\b0\u00101¨\u00062"}, d2 = {"Resource", "Lcom/bumptech/glide/m;", "Ljava/lang/Class;", "resourceClazz", "", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;", "transformations", "", "placeholderRes", "", "withCrossFade", "configure", "(Lcom/bumptech/glide/m;Ljava/lang/Class;Ljava/util/List;Ljava/lang/Integer;Z)Lcom/bumptech/glide/m;", "Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;", "priority", "(Lcom/bumptech/glide/m;Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;)Lcom/bumptech/glide/m;", "Lru/ozon/app/android/pikazon/image/ImageSize;", "size", "Lkotlin/Function0;", "Lc6/n;", "defaultValue", "sizeWithDownsample", "(Lcom/bumptech/glide/m;Lru/ozon/app/android/pikazon/image/ImageSize;Lkotlin/jvm/functions/Function0;)Lcom/bumptech/glide/m;", "downsampleStrategy", "downsampleOrIgnore", "(Lcom/bumptech/glide/m;Lc6/n;)Lcom/bumptech/glide/m;", "addCrossfade", "(Lcom/bumptech/glide/m;Ljava/lang/Class;Z)Lcom/bumptech/glide/m;", "addTransformations", "(Lcom/bumptech/glide/m;Ljava/util/List;)Lcom/bumptech/glide/m;", "", "wrapWebPTransformations", "(Lcom/bumptech/glide/m;Ljava/util/List;)V", "Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;", "callback", "Lkotlin/Function4;", "", "Lm6/h;", "LT5/a;", "onSucceed", "Lkotlin/Function3;", "LV5/q;", "onFailed", "addCallback", "(Lcom/bumptech/glide/m;Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;Lfd/o;Lfd/n;)Lcom/bumptech/glide/m;", "Lru/ozon/app/android/pikazon/request/PikazonRequestListener;", "cast", "(Lru/ozon/app/android/pikazon/request/PikazonRequestListener;)Lru/ozon/app/android/pikazon/request/PikazonRequestListener;", "addPlaceholder", "(Lcom/bumptech/glide/m;Ljava/lang/Integer;)Lcom/bumptech/glide/m;", "lib_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GlideRequestExtKt {
    @NotNull
    public static final <Resource> m<Resource> addCallback(@NotNull m<Resource> mVar, final PikazonLoaderCallback<Resource> pikazonLoaderCallback, @NotNull final InterfaceC6512o<Object, ? super Resource, ? super h<Resource>, ? super a, Boolean> onSucceed, @NotNull final InterfaceC6511n<Object, ? super h<Resource>, ? super q, Boolean> onFailed) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(onSucceed, "onSucceed");
        Intrinsics.checkNotNullParameter(onFailed, "onFailed");
        m<Resource> addListener = mVar.addListener(new l6.h<Resource>() { // from class: ru.ozon.app.android.pikazon.glide.request.GlideRequestExtKt$addCallback$3
            @Override // l6.h
            public boolean onLoadFailed(q e11, Object model, h<Resource> target, boolean isFirstResource) {
                PikazonLoaderCallback<Resource> pikazonLoaderCallback2;
                PikazonRequestListener cast;
                Intrinsics.checkNotNullParameter(target, "target");
                boolean booleanValue = onFailed.invoke(model, target, e11).booleanValue();
                Iterator<T> it = Pikazon.INSTANCE.getInstance().getRequestListeners$lib_release().iterator();
                while (it.hasNext()) {
                    cast = GlideRequestExtKt.cast((PikazonRequestListener) it.next());
                    if (model instanceof Thumb) {
                        cast.onPreviewFailed(((Thumb) model).getOrigin(), target, e11);
                    }
                    PikazonLogger.INSTANCE.logError("Image download failed!", e11);
                    cast.onLoadFailed(model, target, e11);
                }
                if (!(model instanceof Thumb) && (pikazonLoaderCallback2 = pikazonLoaderCallback) != null) {
                    pikazonLoaderCallback2.onLoadFailed(e11);
                }
                return booleanValue;
            }

            @Override // l6.h
            public boolean onResourceReady(Resource resource, Object model, h<Resource> target, a dataSource, boolean isFirstResource) {
                PikazonLoaderCallback<Resource> pikazonLoaderCallback2;
                PikazonRequestListener cast;
                Intrinsics.checkNotNullParameter(resource, "resource");
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                boolean booleanValue = onSucceed.invoke(model, resource, target, dataSource).booleanValue();
                Iterator<T> it = Pikazon.INSTANCE.getInstance().getRequestListeners$lib_release().iterator();
                while (it.hasNext()) {
                    cast = GlideRequestExtKt.cast((PikazonRequestListener) it.next());
                    if (model instanceof Thumb) {
                        cast.onPreviewSucceed(((Thumb) model).getOrigin(), resource, target, dataSource);
                    }
                    cast.onLoadSucceed(model, resource, target, dataSource);
                }
                if (!(model instanceof Thumb) && (pikazonLoaderCallback2 = pikazonLoaderCallback) != null) {
                    pikazonLoaderCallback2.onLoadSuccessful(resource);
                }
                return booleanValue;
            }
        });
        Intrinsics.checkNotNullExpressionValue(addListener, "addListener(...)");
        return addListener;
    }

    public static /* synthetic */ m addCallback$default(m mVar, PikazonLoaderCallback pikazonLoaderCallback, InterfaceC6512o interfaceC6512o, InterfaceC6511n interfaceC6511n, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pikazonLoaderCallback = null;
        }
        if ((i11 & 2) != 0) {
            interfaceC6512o = GlideRequestExtKt$addCallback$1.INSTANCE;
        }
        if ((i11 & 4) != 0) {
            interfaceC6511n = GlideRequestExtKt$addCallback$2.INSTANCE;
        }
        return addCallback(mVar, pikazonLoaderCallback, interfaceC6512o, interfaceC6511n);
    }

    @SuppressLint({"CheckResult"})
    private static final <Resource> m<Resource> addCrossfade(m<Resource> mVar, Class<Resource> cls, boolean z11) {
        if (z11 && Intrinsics.d(cls, Drawable.class)) {
            Intrinsics.g(mVar, "null cannot be cast to non-null type com.bumptech.glide.RequestBuilder<android.graphics.drawable.Drawable>");
            C6307e c6307e = new C6307e();
            c6307e.c(new C8446a());
            mVar.transition(c6307e);
        }
        return mVar;
    }

    @SuppressLint({"CheckResult"})
    private static final <Resource> m<Resource> addPlaceholder(m<Resource> mVar, Integer num) {
        if (num != null) {
            mVar.placeholder(num.intValue());
        }
        return mVar;
    }

    private static final <Resource> m<Resource> addTransformations(m<Resource> mVar, List<? extends ImageTransformation> list) {
        ImageTransformationsFactory<T5.m<Bitmap>> imageTransformationsFactory$lib_release = Pikazon.INSTANCE.getInstance().getImageTransformationsFactory$lib_release();
        List<? extends ImageTransformation> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(imageTransformationsFactory$lib_release.create((ImageTransformation) it.next()));
        }
        Cloneable transform = mVar.transform(new g(C7714v.q0(new MaxSizeTransformation(), arrayList)));
        Intrinsics.checkNotNullExpressionValue(transform, "transform(...)");
        return (m) transform;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <Resource> PikazonRequestListener<Resource> cast(PikazonRequestListener<Object> pikazonRequestListener) {
        Intrinsics.g(pikazonRequestListener, "null cannot be cast to non-null type ru.ozon.app.android.pikazon.request.PikazonRequestListener<Resource of ru.ozon.app.android.pikazon.glide.request.GlideRequestExtKt.cast>");
        return pikazonRequestListener;
    }

    @NotNull
    public static final <Resource> m<Resource> configure(@NotNull m<Resource> mVar, @NotNull Class<Resource> resourceClazz, @NotNull List<? extends ImageTransformation> transformations, Integer num, boolean z11) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(resourceClazz, "resourceClazz");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        addPlaceholder(mVar, num);
        addTransformations(mVar, transformations);
        wrapWebPTransformations(mVar, transformations);
        addCrossfade(mVar, resourceClazz, z11);
        return mVar;
    }

    @NotNull
    public static final <Resource> m<Resource> downsampleOrIgnore(@NotNull m<Resource> mVar, @NotNull n downsampleStrategy) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(downsampleStrategy, "downsampleStrategy");
        if (downsampleStrategy != n.f56567g) {
            mVar.apply((AbstractC7878a<?>) i.downsampleOf(downsampleStrategy));
        }
        return mVar;
    }

    @NotNull
    public static final <Resource> m<Resource> priority(@NotNull m<Resource> mVar, @NotNull LoadPriority priority) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(priority, "priority");
        if (priority != LoadPriority.NORMAL) {
            mVar.priority(LoadPriorityExtKt.toGlideValue(priority));
        }
        return mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r0 == null) goto L11;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <Resource> m<Resource> sizeWithDownsample(@NotNull m<Resource> mVar, ImageSize imageSize, @NotNull Function0<? extends n> defaultValue) {
        n invoke;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        if (imageSize != null && (invoke = imageSize.getDownsampleStrategy()) != null) {
            if (invoke == n.f56567g) {
                invoke = null;
            }
        }
        invoke = defaultValue.invoke();
        if (imageSize != null) {
            mVar.override(imageSize.getWidth(), imageSize.getHeight());
        }
        downsampleOrIgnore(mVar, invoke);
        return mVar;
    }

    public static /* synthetic */ m sizeWithDownsample$default(m mVar, ImageSize imageSize, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = GlideRequestExtKt$sizeWithDownsample$1.INSTANCE;
        }
        return sizeWithDownsample(mVar, imageSize, function0);
    }

    private static final <Resource> void wrapWebPTransformations(m<Resource> mVar, List<? extends ImageTransformation> list) {
        if (list.isEmpty()) {
            return;
        }
        ImageTransformationsFactory<T5.m<Bitmap>> imageTransformationsFactory$lib_release = Pikazon.INSTANCE.getInstance().getImageTransformationsFactory$lib_release();
        List<? extends ImageTransformation> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(mVar.optionalTransform(k.class, new S5.m(imageTransformationsFactory$lib_release.create((ImageTransformation) it.next()))));
        }
    }
}
