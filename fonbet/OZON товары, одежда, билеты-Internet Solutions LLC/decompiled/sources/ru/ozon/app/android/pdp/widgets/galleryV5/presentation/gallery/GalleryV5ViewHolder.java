package ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery;

import android.view.View;
import jk0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO.Item;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u000fB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\n\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/GalleryV5ViewHolder;", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Item;", "T", "Ljk0/j;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "item", "", "bind", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Item;)V", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/GalleryV5ViewHolder$ResetVideoPositionPayload;", "payload", "(Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5VO$Item;Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/GalleryV5ViewHolder$ResetVideoPositionPayload;)V", "ResetVideoPositionPayload", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class GalleryV5ViewHolder<T extends GalleryV5VO.Item> extends j {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/gallery/GalleryV5ViewHolder$ResetVideoPositionPayload;", "", "<init>", "()V", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResetVideoPositionPayload {

        @NotNull
        public static final ResetVideoPositionPayload INSTANCE = new ResetVideoPositionPayload();

        private ResetVideoPositionPayload() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryV5ViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public abstract void bind(@NotNull T item);

    public void bind(@NotNull T item, @NotNull ResetVideoPositionPayload payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payload, "payload");
    }
}
