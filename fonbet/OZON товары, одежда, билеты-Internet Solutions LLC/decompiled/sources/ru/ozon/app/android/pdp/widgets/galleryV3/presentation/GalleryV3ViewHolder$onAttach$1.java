package ru.ozon.app.android.pdp.widgets.galleryV3.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryAction;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryAction;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class GalleryV3ViewHolder$onAttach$1 extends AbstractC7737t implements Function1<GalleryAction, Unit> {
    final /* synthetic */ GalleryV3ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryV3ViewHolder$onAttach$1(GalleryV3ViewHolder galleryV3ViewHolder) {
        super(1);
        this.this$0 = galleryV3ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GalleryAction galleryAction) {
        invoke2(galleryAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GalleryAction galleryAction) {
        if (galleryAction instanceof GalleryAction.OpenGalleyVideoItem) {
            GalleryAction.OpenGalleyVideoItem openGalleyVideoItem = (GalleryAction.OpenGalleyVideoItem) galleryAction;
            this.this$0.onVideoClicked(openGalleyVideoItem.getItem(), openGalleyVideoItem.getPosition(), openGalleyVideoItem.getFullScreen());
        }
    }
}
