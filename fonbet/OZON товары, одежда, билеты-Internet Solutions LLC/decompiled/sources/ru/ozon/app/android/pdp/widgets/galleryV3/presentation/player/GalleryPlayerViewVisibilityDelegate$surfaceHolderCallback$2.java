package ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player;

import android.view.SurfaceHolder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "ru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryPlayerViewVisibilityDelegate$surfaceHolderCallback$2$1", "invoke", "()Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryPlayerViewVisibilityDelegate$surfaceHolderCallback$2$1;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class GalleryPlayerViewVisibilityDelegate$surfaceHolderCallback$2 extends AbstractC7737t implements Function0<AnonymousClass1> {
    final /* synthetic */ GalleryPlayerViewVisibilityDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryPlayerViewVisibilityDelegate$surfaceHolderCallback$2(GalleryPlayerViewVisibilityDelegate galleryPlayerViewVisibilityDelegate) {
        super(0);
        this.this$0 = galleryPlayerViewVisibilityDelegate;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryPlayerViewVisibilityDelegate$surfaceHolderCallback$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        final GalleryPlayerViewVisibilityDelegate galleryPlayerViewVisibilityDelegate = this.this$0;
        return new SurfaceHolder.Callback2() { // from class: ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryPlayerViewVisibilityDelegate$surfaceHolderCallback$2.1
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
                Intrinsics.checkNotNullParameter(holder, "holder");
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder holder) {
                Intrinsics.checkNotNullParameter(holder, "holder");
                GalleryPlayerViewVisibilityDelegate.this.isSurfaceCreated = true;
                holder.removeCallback(this);
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder holder) {
                Intrinsics.checkNotNullParameter(holder, "holder");
            }

            @Override // android.view.SurfaceHolder.Callback2
            public void surfaceRedrawNeeded(SurfaceHolder holder) {
                Intrinsics.checkNotNullParameter(holder, "holder");
            }
        };
    }
}
