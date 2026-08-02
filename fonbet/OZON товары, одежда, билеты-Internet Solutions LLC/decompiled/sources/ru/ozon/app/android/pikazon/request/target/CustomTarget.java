package ru.ozon.app.android.pikazon.request.target;

import Xc.a;
import Xc.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.m;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import m6.AbstractC8090c;
import m6.h;
import n6.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.internal.ThumbnailExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.glide.request.GlideRequestExtKt;
import ru.ozon.app.android.pikazon.glide.request.ImageLoaderKt;
import ru.ozon.app.android.pikazon.glide.targets.OzonMetricTarget;
import ru.ozon.app.android.pikazon.glide.targets.OzonMetricTargetExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.request.PikazonRequest;
import ru.ozon.app.android.pikazon.request.PikazonRequestBuilder;
import ru.ozon.app.android.pikazon.request.PikazonRequestListener;
import ru.ozon.app.android.pikazon.request.target.CustomTarget;
import ru.ozon.app.android.pikazon.util.TestUtilKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u001cB\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00112\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u001c\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pikazon/request/target/CustomTarget;", "Resource", "Lru/ozon/app/android/pikazon/request/target/PikazonTarget;", "Lkotlin/Function1;", "Lru/ozon/app/android/pikazon/request/target/CustomTarget$Result;", "", "resultCallback", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/bumptech/glide/m;", "Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder$OptionalTransform;", "optionalTransform", "", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;", "transformations", "applyOptionalTransformation", "(Lcom/bumptech/glide/m;Lru/ozon/app/android/pikazon/request/PikazonRequestBuilder$OptionalTransform;Ljava/util/List;)Lcom/bumptech/glide/m;", "Lru/ozon/app/android/pikazon/request/PikazonRequest;", "Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;", "callback", "load", "(Lru/ozon/app/android/pikazon/request/PikazonRequest;Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;)V", "clear", "(Lru/ozon/app/android/pikazon/request/PikazonRequest;)V", "Lkotlin/jvm/functions/Function1;", "Lm6/h;", "glideTarget", "Lm6/h;", "Result", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CustomTarget<Resource> implements PikazonTarget<Resource> {
    private h<?> glideTarget;

    @NotNull
    private final Function1<Result, Unit> resultCallback;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pikazon/request/target/CustomTarget$Result;", "", "Placeholder", "Success", "Fail", "Lru/ozon/app/android/pikazon/request/target/CustomTarget$Result$Fail;", "Lru/ozon/app/android/pikazon/request/target/CustomTarget$Result$Placeholder;", "Lru/ozon/app/android/pikazon/request/target/CustomTarget$Result$Success;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Result {

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pikazon/request/target/CustomTarget$Result$Fail;", "Lru/ozon/app/android/pikazon/request/target/CustomTarget$Result;", "", "model", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Object;Ljava/lang/Exception;)V", "Ljava/lang/Object;", "getModel", "()Ljava/lang/Object;", "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes13.dex */
        public static final class Fail implements Result {
            private final Exception exception;
            private final Object model;

            public Fail(Object obj, Exception exc) {
                this.model = obj;
                this.exception = exc;
            }

            public final Object getModel() {
                return this.model;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pikazon/request/target/CustomTarget$Result$Placeholder;", "Lru/ozon/app/android/pikazon/request/target/CustomTarget$Result;", "type", "Lru/ozon/app/android/pikazon/request/target/CustomTarget$Result$Placeholder$Type;", "resource", "Landroid/graphics/drawable/Drawable;", "<init>", "(Lru/ozon/app/android/pikazon/request/target/CustomTarget$Result$Placeholder$Type;Landroid/graphics/drawable/Drawable;)V", "getType", "()Lru/ozon/app/android/pikazon/request/target/CustomTarget$Result$Placeholder$Type;", "getResource", "()Landroid/graphics/drawable/Drawable;", "Type", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Placeholder implements Result {
            private final Drawable resource;

            @NotNull
            private final Type type;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/pikazon/request/target/CustomTarget$Result$Placeholder$Type;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "ERROR", "CLEARED", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Type {
                private static final /* synthetic */ a $ENTRIES;
                private static final /* synthetic */ Type[] $VALUES;
                public static final Type LOADING = new Type("LOADING", 0);
                public static final Type ERROR = new Type("ERROR", 1);
                public static final Type CLEARED = new Type("CLEARED", 2);

                private static final /* synthetic */ Type[] $values() {
                    return new Type[]{LOADING, ERROR, CLEARED};
                }

                static {
                    Type[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = b.a($values);
                }

                private Type(String str, int i11) {
                }

                public static Type valueOf(String str) {
                    return (Type) Enum.valueOf(Type.class, str);
                }

                public static Type[] values() {
                    return (Type[]) $VALUES.clone();
                }
            }

            public Placeholder(@NotNull Type type, Drawable drawable) {
                Intrinsics.checkNotNullParameter(type, "type");
                this.type = type;
                this.resource = drawable;
            }

            public final Drawable getResource() {
                return this.resource;
            }

            @NotNull
            public final Type getType() {
                return this.type;
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B+\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pikazon/request/target/CustomTarget$Result$Success;", "Resource", "Lru/ozon/app/android/pikazon/request/target/CustomTarget$Result;", "", "model", "resource", "LT5/a;", "dataSource", "", "withCrossFade", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;LT5/a;Z)V", "Ljava/lang/Object;", "getModel", "()Ljava/lang/Object;", "getResource", "LT5/a;", "getDataSource", "()LT5/a;", "Z", "getWithCrossFade", "()Z", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Success<Resource> implements Result {
            private final T5.a dataSource;
            private final Object model;
            private final Resource resource;
            private final boolean withCrossFade;

            public Success(Object obj, Resource resource, T5.a aVar, boolean z11) {
                this.model = obj;
                this.resource = resource;
                this.dataSource = aVar;
                this.withCrossFade = z11;
            }

            public final T5.a getDataSource() {
                return this.dataSource;
            }

            public final Object getModel() {
                return this.model;
            }

            public final Resource getResource() {
                return this.resource;
            }

            public final boolean getWithCrossFade() {
                return this.withCrossFade;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomTarget(@NotNull Function1<? super Result, Unit> resultCallback) {
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        this.resultCallback = resultCallback;
    }

    private final <Resource> m<Resource> applyOptionalTransformation(m<Resource> mVar, PikazonRequestBuilder.OptionalTransform optionalTransform, List<? extends ImageTransformation> list) {
        if (list.isEmpty() && optionalTransform != null) {
            optionalTransform.apply(mVar);
        }
        return mVar;
    }

    @Override // ru.ozon.app.android.pikazon.request.target.PikazonTarget
    public void clear(@NotNull PikazonRequest<Resource> pikazonRequest) {
        Intrinsics.checkNotNullParameter(pikazonRequest, "<this>");
        pikazonRequest.getRequestManager().clear(this.glideTarget);
    }

    @Override // ru.ozon.app.android.pikazon.request.target.PikazonTarget
    @SuppressLint({"VisibleForTests"})
    public void load(@NotNull PikazonRequest<Resource> pikazonRequest, PikazonLoaderCallback<Resource> pikazonLoaderCallback) {
        PikazonRequestListener cast;
        Intrinsics.checkNotNullParameter(pikazonRequest, "<this>");
        Context context = pikazonRequest.getBuilder$lib_release().getContext();
        List<ImageTransformation> transformations$lib_release = pikazonRequest.getBuilder$lib_release().getTransformations$lib_release();
        PikazonRequestBuilder.OptionalTransform optionalTransform = pikazonRequest.getBuilder$lib_release().getOptionalTransform();
        LoadPriority priority = pikazonRequest.getBuilder$lib_release().getPriority();
        I i11 = new I();
        boolean useCrossfade = pikazonRequest.getBuilder$lib_release().getUseCrossfade();
        Pikazon.Companion companion = Pikazon.INSTANCE;
        if (companion.getInstance().getIsInTestMode()) {
            Integer placeholderRes = pikazonRequest.getBuilder$lib_release().getPlaceholderRes();
            this.resultCallback.invoke(new Result.Success(pikazonRequest.getSource(), TestUtilKt.loadTestResource(placeholderRes != null ? placeholderRes.intValue() : companion.getInstance().getConfig().getDefaultImage(), transformations$lib_release, context, pikazonRequest.getResourceType$lib_release(), pikazonLoaderCallback), null, false));
            return;
        }
        m load = ImageLoaderKt.createRequest(context, pikazonRequest.getResourceType$lib_release()).load(pikazonRequest.getSource());
        Intrinsics.checkNotNullExpressionValue(load, "load(...)");
        m withThumbnail = ThumbnailExtKt.withThumbnail(GlideRequestExtKt.addCallback(applyOptionalTransformation(GlideRequestExtKt.configure(GlideRequestExtKt.sizeWithDownsample(GlideRequestExtKt.priority(load, priority), pikazonRequest.getSize(), new CustomTarget$load$1(pikazonRequest)), pikazonRequest.getResourceType$lib_release(), transformations$lib_release, pikazonRequest.getBuilder$lib_release().getPlaceholderRes(), useCrossfade), optionalTransform, transformations$lib_release), pikazonLoaderCallback, new CustomTarget$load$2(i11, this, useCrossfade), new CustomTarget$load$3(this)), pikazonRequest.getSource());
        ImageSize size = pikazonRequest.getSize();
        final int i12 = LinearLayoutManager.INVALID_OFFSET;
        final int width = size != null ? size.getWidth() : Integer.MIN_VALUE;
        ImageSize size2 = pikazonRequest.getSize();
        if (size2 != null) {
            i12 = size2.getHeight();
        }
        OzonMetricTarget ozonMetricTarget = OzonMetricTargetExtKt.toOzonMetricTarget(new AbstractC8090c<Resource>(this, width, i12) { // from class: ru.ozon.app.android.pikazon.request.target.CustomTarget$load$4
            final /* synthetic */ CustomTarget<Resource> this$0;

            {
                this.this$0 = this;
            }

            @Override // m6.h
            public void onLoadCleared(Drawable placeholder) {
                Function1 function1;
                function1 = ((CustomTarget) this.this$0).resultCallback;
                function1.invoke(new CustomTarget.Result.Placeholder(CustomTarget.Result.Placeholder.Type.CLEARED, placeholder));
            }

            @Override // m6.AbstractC8090c, m6.h
            public void onLoadFailed(Drawable errorDrawable) {
                Function1 function1;
                function1 = ((CustomTarget) this.this$0).resultCallback;
                function1.invoke(new CustomTarget.Result.Placeholder(CustomTarget.Result.Placeholder.Type.ERROR, errorDrawable));
            }

            @Override // m6.AbstractC8090c, m6.h
            public void onLoadStarted(Drawable placeholder) {
                Function1 function1;
                function1 = ((CustomTarget) this.this$0).resultCallback;
                function1.invoke(new CustomTarget.Result.Placeholder(CustomTarget.Result.Placeholder.Type.LOADING, placeholder));
            }

            @Override // m6.h
            public void onResourceReady(Resource resource, c<? super Resource> transition) {
                Intrinsics.checkNotNullParameter(resource, "resource");
            }
        }, priority, pikazonRequest.getSource());
        this.glideTarget = ozonMetricTarget;
        withThumbnail.into((m) ozonMetricTarget);
        Iterator<T> it = companion.getInstance().getRequestListeners$lib_release().iterator();
        while (it.hasNext()) {
            cast = GlideRequestExtKt.cast((PikazonRequestListener) it.next());
            cast.onLoadStarted(pikazonRequest.getSource(), this.glideTarget);
        }
    }
}
