package ru.ozon.app.android.storefront.stories.setContainer.presentation.preloader;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.storefront.stories.setContainer.data.CommonItemVO;
import ru.ozon.app.android.storefront.stories.setOfPreviews.data.PreviewItemVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016J \u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/storefront/stories/setContainer/presentation/preloader/PreviewImagePreloader;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "loadState", "", "", "", "previewSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "handler", "Landroid/os/Handler;", "preloadFrom", "", "items", "", "Lru/ozon/app/android/storefront/stories/setContainer/data/CommonItemVO;", "position", "", "delay", "", "preload", ImagesContract.URL, "size", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PreviewImagePreloader {

    @NotNull
    private final Context context;

    @NotNull
    private final Handler handler;

    @NotNull
    private final Map<String, Boolean> loadState;

    @NotNull
    private final ImageSize previewSize;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/stories/setContainer/presentation/preloader/PreviewImagePreloader$Companion;", "", "<init>", "()V", "PRELOAD_COUNT", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PreviewImagePreloader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.loadState = new LinkedHashMap();
        this.previewSize = new ImageSize(ResourceExtKt.toPx(96), ResourceExtKt.toPx(126));
        this.handler = new Handler(Looper.getMainLooper());
    }

    private final void preload(final String url, final ImageSize size, long delay) {
        this.handler.postDelayed(new Runnable() { // from class: ru.ozon.app.android.storefront.stories.setContainer.presentation.preloader.PreviewImagePreloader$preload$$inlined$postDelayed$default$1
            @Override // java.lang.Runnable
            public final void run() {
                Map map;
                Map map2;
                Context context;
                map = PreviewImagePreloader.this.loadState;
                if (map.containsKey(url)) {
                    return;
                }
                map2 = PreviewImagePreloader.this.loadState;
                map2.put(url, Boolean.FALSE);
                context = PreviewImagePreloader.this.context;
                LoadPriority loadPriority = LoadPriority.LOW;
                final PreviewImagePreloader previewImagePreloader = PreviewImagePreloader.this;
                final String str = url;
                ContextExtKt.load(context, url, (r15 & 2) != 0 ? K.f71697a : null, (r15 & 4) != 0 ? null : new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.storefront.stories.setContainer.presentation.preloader.PreviewImagePreloader$preload$1$1
                    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                    public void onLoadFailed(Exception e11) {
                        Map map3;
                        map3 = PreviewImagePreloader.this.loadState;
                        map3.remove(str);
                    }

                    @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                    public void onLoadSuccessful(Drawable resource) {
                        Map map3;
                        map3 = PreviewImagePreloader.this.loadState;
                        map3.put(str, Boolean.TRUE);
                    }
                }, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? LoadPriority.NORMAL : loadPriority, (r15 & 32) != 0 ? false : false, (r15 & 64) != 0 ? null : size);
            }
        }, delay);
    }

    public static /* synthetic */ void preloadFrom$default(PreviewImagePreloader previewImagePreloader, List list, int i11, long j11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            j11 = 0;
        }
        previewImagePreloader.preloadFrom(list, i11, j11);
    }

    public final void preloadFrom(@NotNull List<? extends CommonItemVO> items, int position, long delay) {
        Intrinsics.checkNotNullParameter(items, "items");
        int i11 = position + 4;
        while (position < i11) {
            CommonItemVO commonItemVO = (CommonItemVO) C7714v.Q(position, items);
            Pair pair = commonItemVO instanceof PreviewItemVO ? new Pair(((PreviewItemVO) commonItemVO).getImage(), this.previewSize) : new Pair(null, null);
            String str = (String) pair.a();
            ImageSize imageSize = (ImageSize) pair.b();
            if (str == null || imageSize == null) {
                return;
            }
            preload(str, imageSize, delay);
            position++;
        }
    }
}
