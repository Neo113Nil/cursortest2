package com.commit451.coiltransformations;

import android.graphics.Bitmap;
import coil.size.Dimension;
import coil.size.Size;
import coil.transform.Transformation;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SquareCropTransformation.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/commit451/coiltransformations/SquareCropTransformation;", "Lcoil/transform/Transformation;", "()V", "cacheKey", "", "getCacheKey", "()Ljava/lang/String;", ViewProps.TRANSFORM, "Landroid/graphics/Bitmap;", MetricTracker.Object.INPUT, RRWebVideoEvent.JsonKeys.SIZE, "Lcoil/size/Size;", "(Landroid/graphics/Bitmap;Lcoil/size/Size;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transformations_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SquareCropTransformation implements Transformation {
    private final String cacheKey;

    public SquareCropTransformation() {
        String name = SquareCropTransformation.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "SquareCropTransformation::class.java.name");
        this.cacheKey = name;
    }

    @Override // coil.transform.Transformation
    public String getCacheKey() {
        return this.cacheKey;
    }

    @Override // coil.transform.Transformation
    public Object transform(Bitmap bitmap, Size size, Continuation<? super Bitmap> continuation) {
        Dimension width = size.getWidth();
        int width2 = width instanceof Dimension.Pixels ? ((Dimension.Pixels) width).px : bitmap.getWidth();
        Dimension height = size.getHeight();
        int max = Math.max(width2, height instanceof Dimension.Pixels ? ((Dimension.Pixels) height).px : bitmap.getHeight());
        return Util.INSTANCE.centerCrop(bitmap, max, max);
    }
}
