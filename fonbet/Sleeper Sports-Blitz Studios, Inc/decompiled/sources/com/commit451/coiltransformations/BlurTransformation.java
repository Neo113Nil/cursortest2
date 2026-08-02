package com.commit451.coiltransformations;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import coil.size.Size;
import coil.transform.Transformation;
import com.braze.models.BrazeGeofence;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.sentry.rrweb.RRWebVideoEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlurTransformation.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J!\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0013R\u001a\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/commit451/coiltransformations/BlurTransformation;", "Lcoil/transform/Transformation;", "context", "Landroid/content/Context;", BrazeGeofence.RADIUS_METERS, "", "sampling", "(Landroid/content/Context;FF)V", "cacheKey", "", "getCacheKey$annotations", "()V", "getCacheKey", "()Ljava/lang/String;", ViewProps.TRANSFORM, "Landroid/graphics/Bitmap;", MetricTracker.Object.INPUT, RRWebVideoEvent.JsonKeys.SIZE, "Lcoil/size/Size;", "(Landroid/graphics/Bitmap;Lcoil/size/Size;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "transformations_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BlurTransformation implements Transformation {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final float DEFAULT_RADIUS = 10.0f;

    @Deprecated
    private static final float DEFAULT_SAMPLING = 1.0f;
    private final String cacheKey;
    private final Context context;
    private final float radius;
    private final float sampling;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlurTransformation(Context context) {
        this(context, 0.0f, 0.0f, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlurTransformation(Context context, float f) {
        this(context, f, 0.0f, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getCacheKey$annotations() {
    }

    public BlurTransformation(Context context, float f, float f2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.radius = f;
        this.sampling = f2;
        double d = f;
        if (0.0d > d || d > 25.0d) {
            throw new IllegalArgumentException("radius must be in [0, 25].".toString());
        }
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("sampling must be > 0.".toString());
        }
        this.cacheKey = BlurTransformation.class.getName() + '-' + f + '-' + f2;
    }

    public /* synthetic */ BlurTransformation(Context context, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? 10.0f : f, (i & 4) != 0 ? 1.0f : f2);
    }

    @Override // coil.transform.Transformation
    public String getCacheKey() {
        return this.cacheKey;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    @Override // coil.transform.Transformation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object transform(Bitmap bitmap, Size size, Continuation<? super Bitmap> continuation) {
        ScriptIntrinsicBlur scriptIntrinsicBlur;
        Allocation allocation;
        Allocation allocation2;
        RenderScript create;
        Paint paint = new Paint(3);
        Bitmap createBitmap = Bitmap.createBitmap((int) (bitmap.getWidth() / this.sampling), (int) (bitmap.getHeight() / this.sampling), Util.INSTANCE.getSafeConfig$transformations_release(bitmap));
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(width, height, config)");
        Canvas canvas = new Canvas(createBitmap);
        float f = 1;
        float f2 = this.sampling;
        canvas.scale(f / f2, f / f2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        RenderScript renderScript = null;
        ScriptIntrinsicBlur scriptIntrinsicBlur2 = null;
        try {
            create = RenderScript.create(this.context);
            try {
                allocation = Allocation.createFromBitmap(create, createBitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
            } catch (Throwable th) {
                th = th;
                allocation = null;
                allocation2 = null;
            }
        } catch (Throwable th2) {
            th = th2;
            scriptIntrinsicBlur = null;
            allocation = null;
            allocation2 = null;
        }
        try {
            allocation2 = Allocation.createTyped(create, allocation.getType());
            try {
                scriptIntrinsicBlur2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                scriptIntrinsicBlur2.setRadius(this.radius);
                scriptIntrinsicBlur2.setInput(allocation);
                scriptIntrinsicBlur2.forEach(allocation2);
                allocation2.copyTo(createBitmap);
                if (create != null) {
                    create.destroy();
                }
                if (allocation != null) {
                    allocation.destroy();
                }
                if (allocation2 != null) {
                    allocation2.destroy();
                }
                if (scriptIntrinsicBlur2 != null) {
                    scriptIntrinsicBlur2.destroy();
                }
                return createBitmap;
            } catch (Throwable th3) {
                th = th3;
                scriptIntrinsicBlur = scriptIntrinsicBlur2;
                renderScript = create;
                if (renderScript != null) {
                    renderScript.destroy();
                }
                if (allocation != null) {
                    allocation.destroy();
                }
                if (allocation2 != null) {
                    allocation2.destroy();
                }
                if (scriptIntrinsicBlur != null) {
                    scriptIntrinsicBlur.destroy();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            allocation2 = null;
            renderScript = create;
            scriptIntrinsicBlur = allocation2;
            if (renderScript != null) {
            }
            if (allocation != null) {
            }
            if (allocation2 != null) {
            }
            if (scriptIntrinsicBlur != null) {
            }
            throw th;
        }
    }

    /* compiled from: BlurTransformation.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/commit451/coiltransformations/BlurTransformation$Companion;", "", "()V", "DEFAULT_RADIUS", "", "DEFAULT_SAMPLING", "transformations_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
