package ru.ozon.app.android.storefront.stories.setContainer.presentation.preloader;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.processors.InscribedUrlProcessor;
import ru.ozon.app.android.storefront.stories.setContainer.presentation.preloader.StoryImagePreloader;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/storefront/stories/setContainer/presentation/preloader/StoryImagePreloader;", "", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "", "imageUrl", "Lru/ozon/app/android/pikazon/image/ImageSize;", "imageSize", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$FitWidthCropHeight$CropType;", "cropType", "", "runPreload", "(Ljava/lang/String;Lru/ozon/app/android/pikazon/image/ImageSize;Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation$FitWidthCropHeight$CropType;)V", "", "needPreloadImage", "(Ljava/lang/String;)Z", "putPreloadUrl", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "", "Lru/ozon/app/android/storefront/stories/setContainer/presentation/preloader/ImageState;", "imagesState", "Ljava/util/Map;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StoryImagePreloader {

    @NotNull
    private final Context appContext;

    @NotNull
    private final Handler handler;

    @NotNull
    private final Map<String, ImageState> imagesState;
    public static final int $stable = 8;

    public StoryImagePreloader(@NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
        this.imagesState = new LinkedHashMap();
        this.handler = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runPreload(String imageUrl, ImageSize imageSize, ImageTransformation.FitWidthCropHeight.CropType cropType) {
        ContextExtKt.loadAsBitmapInscribedSize(this.appContext, imageUrl, C7714v.a0(new ImageTransformation.FitWidthCropHeight(cropType)), imageSize, LoadPriority.LOW, InscribedUrlProcessor.InscribedWidth.INSTANCE, new StoryImagePreloader$runPreload$1(this, imageUrl), new StoryImagePreloader$runPreload$2(this, imageUrl));
    }

    public final boolean needPreloadImage(@NotNull String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return this.imagesState.get(imageUrl) != null;
    }

    public final void putPreloadUrl(@NotNull final String imageUrl, final ImageSize imageSize, @NotNull final ImageTransformation.FitWidthCropHeight.CropType cropType) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(cropType, "cropType");
        if (this.handler.postDelayed(new Runnable() { // from class: lK.a
            @Override // java.lang.Runnable
            public final void run() {
                StoryImagePreloader.this.runPreload(imageUrl, imageSize, cropType);
            }
        }, 500L)) {
            this.imagesState.put(imageUrl, ImageState.LOADING);
        }
    }
}
