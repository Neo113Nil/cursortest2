package ru.ozon.app.android.pikazon.extensions.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m6.C8089b;
import m6.C8092e;
import m6.h;
import org.jetbrains.annotations.NotNull;
import p6.l;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.glide.targets.OzonMetricTargetExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.retry.RequestWithRetryCount;
import ru.ozon.app.android.pikazon.util.TestUtilKt;

@Metadata(d1 = {"\u0000T\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0087\u0001\u0010\u0015\u001a\u00020\u0014\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a+\u0010\u0018\u001a\u00020\u0014*\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a-\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001aM\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 \"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00032\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"", "Source", "Resource", "Landroid/widget/ImageView;", "source", "Ljava/lang/Class;", "resourceType", "Lru/ozon/app/android/pikazon/image/ImageSize;", "imageSize", "", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;", "transformations", "Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;", "callback", "", "placeholderRes", "", "withCrossFade", "Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;", "priority", "", "loadResource", "(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Class;Lru/ozon/app/android/pikazon/image/ImageSize;Ljava/util/List;Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;Ljava/lang/Integer;ZLru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;)V", "testImage", "loadTestResource", "(Landroid/widget/ImageView;Ljava/util/List;I)V", "T", "Lcom/bumptech/glide/m;", "view", "getRequestOptionByImageView", "(Lcom/bumptech/glide/m;Landroid/widget/ImageView;)Lcom/bumptech/glide/m;", "transcodeClass", "Lm6/h;", "inImageViewWithCustomTarget", "(Lcom/bumptech/glide/m;Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;Landroid/widget/ImageView;Ljava/lang/Class;Ljava/lang/Object;)Lm6/h;", "lib_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImageViewExtKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> m<T> getRequestOptionByImageView(m<T> mVar, ImageView imageView) {
        if (mVar.isTransformationSet() || !mVar.isTransformationAllowed() || imageView.getScaleType() == null) {
            return mVar;
        }
        ImageView.ScaleType scaleType = imageView.getScaleType();
        switch (scaleType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[scaleType.ordinal()]) {
            case 1:
                Cloneable optionalCenterCrop = mVar.mo17clone().optionalCenterCrop();
                Intrinsics.checkNotNullExpressionValue(optionalCenterCrop, "optionalCenterCrop(...)");
                return (m) optionalCenterCrop;
            case 2:
                Cloneable optionalCenterInside = mVar.mo17clone().optionalCenterInside();
                Intrinsics.checkNotNullExpressionValue(optionalCenterInside, "optionalCenterInside(...)");
                return (m) optionalCenterInside;
            case 3:
            case 4:
            case 5:
                Cloneable optionalFitCenter = mVar.mo17clone().optionalFitCenter();
                Intrinsics.checkNotNullExpressionValue(optionalFitCenter, "optionalFitCenter(...)");
                return (m) optionalFitCenter;
            case 6:
                Cloneable optionalCenterInside2 = mVar.mo17clone().optionalCenterInside();
                Intrinsics.checkNotNullExpressionValue(optionalCenterInside2, "optionalCenterInside(...)");
                return (m) optionalCenterInside2;
            default:
                return mVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> h<T> inImageViewWithCustomTarget(m<T> mVar, LoadPriority loadPriority, ImageView imageView, Class<T> cls, Object obj) {
        h c8092e;
        l.a();
        if (Bitmap.class.equals(cls)) {
            c8092e = new C8089b(imageView);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            c8092e = new C8092e(imageView);
        }
        h<T> into = mVar.into((m<T>) OzonMetricTargetExtKt.toOzonMetricTarget(c8092e, loadPriority, obj));
        Intrinsics.checkNotNullExpressionValue(into, "into(...)");
        return into;
    }

    @SuppressLint({"VisibleForTests"})
    public static final <Source, Resource> void loadResource(@NotNull ImageView imageView, Source source, @NotNull Class<Resource> resourceType, ImageSize imageSize, @NotNull List<? extends ImageTransformation> transformations, PikazonLoaderCallback<Resource> pikazonLoaderCallback, Integer num, boolean z11, @NotNull LoadPriority priority) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(resourceType, "resourceType");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Pikazon.Companion companion = Pikazon.INSTANCE;
        if (companion.getInstance().getIsInTestMode()) {
            loadTestResource(imageView, transformations, num != null ? num.intValue() : companion.getInstance().getConfig().getDefaultImage());
        } else if (source == null) {
            imageView.setImageDrawable(null);
        } else {
            new RequestWithRetryCount(new ImageViewExtKt$loadResource$1(imageView, source, resourceType, imageSize, priority, transformations, num, z11, pikazonLoaderCallback));
        }
    }

    private static final void loadTestResource(ImageView imageView, List<? extends ImageTransformation> list, int i11) {
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        imageView.setImageBitmap((Bitmap) TestUtilKt.loadTestResource(i11, list, context, Bitmap.class, null));
    }
}
