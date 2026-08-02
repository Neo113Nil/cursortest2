package ru.ozon.app.android.pikazon.extensions.internal;

import android.content.Context;
import com.bumptech.glide.m;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l6.InterfaceC7882e;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.glide.request.GlideRequestExtKt;
import ru.ozon.app.android.pikazon.glide.request.ImageLoaderKt;
import ru.ozon.app.android.pikazon.glide.targets.OzonMetricTarget;
import ru.ozon.app.android.pikazon.glide.targets.OzonMetricTargetExtKt;
import ru.ozon.app.android.pikazon.glide.targets.TargetCreatorKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.request.PikazonRequestListener;
import ru.ozon.app.android.pikazon.retry.RequestWithRetryCount;

/* JADX INFO: Add missing generic type declarations: [Resource] */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Resource", "Lru/ozon/app/android/pikazon/retry/RequestWithRetryCount;", "Ll6/e;", "invoke", "(Lru/ozon/app/android/pikazon/retry/RequestWithRetryCount;)Ll6/e;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ContextExtKt$loadResource$1<Resource> extends AbstractC7737t implements Function1<RequestWithRetryCount<Resource>, InterfaceC7882e> {
    final /* synthetic */ PikazonLoaderCallback<Resource> $callback;
    final /* synthetic */ ImageSize $imageSize;
    final /* synthetic */ Integer $placeholderRes;
    final /* synthetic */ LoadPriority $priority;
    final /* synthetic */ Class<Resource> $resourceType;
    final /* synthetic */ boolean $skipCache;
    final /* synthetic */ Source $source;
    final /* synthetic */ Context $this_loadResource;
    final /* synthetic */ List<ImageTransformation> $transformations;
    final /* synthetic */ boolean $withCrossFade;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ContextExtKt$loadResource$1(Context context, Class<Resource> cls, Source source, ImageSize imageSize, LoadPriority loadPriority, List<? extends ImageTransformation> list, Integer num, boolean z11, PikazonLoaderCallback<Resource> pikazonLoaderCallback, boolean z12) {
        super(1);
        this.$this_loadResource = context;
        this.$resourceType = cls;
        this.$source = source;
        this.$imageSize = imageSize;
        this.$priority = loadPriority;
        this.$transformations = list;
        this.$placeholderRes = num;
        this.$withCrossFade = z11;
        this.$callback = pikazonLoaderCallback;
        this.$skipCache = z12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC7882e invoke(RequestWithRetryCount<Resource> RequestWithRetryCount) {
        PikazonRequestListener cast;
        Intrinsics.checkNotNullParameter(RequestWithRetryCount, "$this$RequestWithRetryCount");
        Context context = this.$this_loadResource;
        InterfaceC7882e request = ((OzonMetricTarget) RequestWithRetryCount.addLostConnectionListener(ContextExtKt.prepareContextRequest(ImageLoaderKt.createRequest(context, this.$resourceType), context, this.$source, this.$resourceType, this.$imageSize, this.$priority, this.$transformations, this.$placeholderRes, this.$withCrossFade, this.$callback, this.$skipCache), context).into((m<Resource>) OzonMetricTargetExtKt.toOzonMetricTarget(TargetCreatorKt.createCustomTarget(this.$imageSize), this.$priority, this.$source))).getRequest();
        Object obj = this.$source;
        Iterator<T> it = Pikazon.INSTANCE.getInstance().getRequestListeners$lib_release().iterator();
        while (it.hasNext()) {
            cast = GlideRequestExtKt.cast((PikazonRequestListener) it.next());
            cast.onLoadStarted(obj, RequestWithRetryCount);
        }
        return request;
    }
}
