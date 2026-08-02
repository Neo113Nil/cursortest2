package ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/Runnable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class GalleryPlayerViewVisibilityDelegate$checkSurfaceCreatedRunnable$2 extends AbstractC7737t implements Function0<Runnable> {
    final /* synthetic */ GalleryPlayerViewVisibilityDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryPlayerViewVisibilityDelegate$checkSurfaceCreatedRunnable$2(GalleryPlayerViewVisibilityDelegate galleryPlayerViewVisibilityDelegate) {
        super(0);
        this.this$0 = galleryPlayerViewVisibilityDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(GalleryPlayerViewVisibilityDelegate galleryPlayerViewVisibilityDelegate) {
        boolean z11;
        z11 = galleryPlayerViewVisibilityDelegate.isSurfaceCreated;
        if (z11) {
            return;
        }
        galleryPlayerViewVisibilityDelegate.onRenderedFirstFrame();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Runnable invoke() {
        final GalleryPlayerViewVisibilityDelegate galleryPlayerViewVisibilityDelegate = this.this$0;
        return new Runnable() { // from class: ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.a
            @Override // java.lang.Runnable
            public final void run() {
                GalleryPlayerViewVisibilityDelegate$checkSurfaceCreatedRunnable$2.invoke$lambda$0(GalleryPlayerViewVisibilityDelegate.this);
            }
        };
    }
}
