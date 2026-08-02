package ru.ozon.app.android.pikazon.request.target;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bumptech.glide.m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m6.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.internal.ContextExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.glide.request.GlideRequestExtKt;
import ru.ozon.app.android.pikazon.glide.request.ImageLoaderKt;
import ru.ozon.app.android.pikazon.glide.targets.OzonMetricTarget;
import ru.ozon.app.android.pikazon.glide.targets.OzonMetricTargetExtKt;
import ru.ozon.app.android.pikazon.glide.targets.TargetCreatorKt;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.request.PikazonRequest;
import ru.ozon.app.android.pikazon.request.PikazonRequestListener;
import ru.ozon.app.android.pikazon.util.TestUtilKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pikazon/request/target/ContextTarget;", "Resource", "Lru/ozon/app/android/pikazon/request/target/PikazonTarget;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/pikazon/request/PikazonRequest;", "Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;", "callback", "", "load", "(Lru/ozon/app/android/pikazon/request/PikazonRequest;Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;)V", "clear", "(Lru/ozon/app/android/pikazon/request/PikazonRequest;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lm6/h;", "glideTarget", "Lm6/h;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ContextTarget<Resource> implements PikazonTarget<Resource> {

    @NotNull
    private final Context context;
    private h<?> glideTarget;

    public ContextTarget(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
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
        ImageSize size = pikazonRequest.getSize();
        LoadPriority priority = pikazonRequest.getBuilder$lib_release().getPriority();
        OzonMetricTarget ozonMetricTarget = OzonMetricTargetExtKt.toOzonMetricTarget(TargetCreatorKt.createCustomTarget(size), priority, pikazonRequest.getSource());
        this.glideTarget = ozonMetricTarget;
        Pikazon.Companion companion = Pikazon.INSTANCE;
        if (companion.getInstance().getIsInTestMode()) {
            Integer placeholderRes = pikazonRequest.getBuilder$lib_release().getPlaceholderRes();
            TestUtilKt.loadTestResource(placeholderRes != null ? placeholderRes.intValue() : companion.getInstance().getConfig().getDefaultImage(), pikazonRequest.getBuilder$lib_release().getTransformations$lib_release(), this.context, pikazonRequest.getResourceType$lib_release(), pikazonLoaderCallback);
            return;
        }
        ContextExtKt.prepareContextRequest$default(ImageLoaderKt.createRequest(this.context, pikazonRequest.getResourceType$lib_release()), this.context, pikazonRequest.getSource(), pikazonRequest.getResourceType$lib_release(), size, priority, pikazonRequest.getBuilder$lib_release().getTransformations$lib_release(), pikazonRequest.getBuilder$lib_release().getPlaceholderRes(), pikazonRequest.getBuilder$lib_release().getUseCrossfade(), pikazonLoaderCallback, false, UserVerificationMethods.USER_VERIFY_NONE, null).into((m) ozonMetricTarget);
        Iterator<T> it = companion.getInstance().getRequestListeners$lib_release().iterator();
        while (it.hasNext()) {
            cast = GlideRequestExtKt.cast((PikazonRequestListener) it.next());
            cast.onLoadStarted(pikazonRequest.getSource(), this.context);
        }
    }
}
