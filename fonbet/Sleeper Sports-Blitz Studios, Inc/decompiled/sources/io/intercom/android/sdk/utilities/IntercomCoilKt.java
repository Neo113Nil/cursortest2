package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.graphics.drawable.Drawable;
import coil.ImageLoaders;
import coil.request.ImageRequest;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomCoil.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\b"}, d2 = {"loadIntercomImage", "", "context", "Landroid/content/Context;", "imageRequest", "Lcoil/request/ImageRequest;", "loadIntercomImageBlocking", "Landroid/graphics/drawable/Drawable;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IntercomCoilKt {
    public static final void loadIntercomImage(Context context, ImageRequest imageRequest) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        IntercomImageLoaderKt.getImageLoader(context).enqueue(imageRequest);
    }

    public static final Drawable loadIntercomImageBlocking(Context context, ImageRequest imageRequest) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        return ImageLoaders.executeBlocking(IntercomImageLoaderKt.getImageLoader(context), imageRequest).getDrawable();
    }
}
