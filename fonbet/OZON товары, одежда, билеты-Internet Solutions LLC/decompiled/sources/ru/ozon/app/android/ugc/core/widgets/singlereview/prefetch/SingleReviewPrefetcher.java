package ru.ozon.app.android.ugc.core.widgets.singlereview.prefetch;

import android.content.Context;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt$loadAsBitmapInscribedSize$1;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt$loadAsBitmapInscribedSize$2;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.processors.InscribedUrlProcessor;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ)\u0010\r\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/prefetch/SingleReviewPrefetcher;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "prefetchSquareImage", "", ImagesContract.URL, "", "width", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "prefetchRectImage", "height", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "prefetch", "size", "Lru/ozon/app/android/pikazon/image/ImageSize;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewPrefetcher {

    @NotNull
    private final Context context;

    public SingleReviewPrefetcher(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final void prefetch(String url, ImageSize size) {
        ContextExtKt.loadAsBitmapInscribedSize(this.context, url, (r14 & 2) != 0 ? K.f71697a : null, (r14 & 4) != 0 ? null : size, (r14 & 8) != 0 ? LoadPriority.NORMAL : null, (r14 & 16) != 0 ? InscribedUrlProcessor.InscribedNormal.INSTANCE : null, (r14 & 32) != 0 ? ContextExtKt$loadAsBitmapInscribedSize$1.INSTANCE : null, (r14 & 64) != 0 ? ContextExtKt$loadAsBitmapInscribedSize$2.INSTANCE : null);
    }

    public final void prefetchRectImage(String url, Integer width, Integer height) {
        if (url == null || width == null || height == null) {
            return;
        }
        prefetch(url, new ImageSize(width.intValue(), height.intValue()));
    }

    public final void prefetchSquareImage(String url, Integer width) {
        if (url == null || width == null) {
            return;
        }
        prefetch(url, new ImageSize(width.intValue(), width.intValue()));
    }
}
