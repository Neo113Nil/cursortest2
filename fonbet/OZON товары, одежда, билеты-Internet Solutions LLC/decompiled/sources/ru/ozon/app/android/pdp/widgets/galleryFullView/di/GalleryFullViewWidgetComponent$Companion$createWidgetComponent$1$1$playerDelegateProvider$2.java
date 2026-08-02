package ru.ozon.app.android.pdp.widgets.galleryFullView.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.player.VideoMoleculePlayerDelegateProvider;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdpvideomolecule/presentation/viewholder/player/VideoMoleculePlayerDelegateProvider;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class GalleryFullViewWidgetComponent$Companion$createWidgetComponent$1$1$playerDelegateProvider$2 extends AbstractC7737t implements Function0<VideoMoleculePlayerDelegateProvider> {
    final /* synthetic */ GalleryFullViewWidgetComponent$Companion$createWidgetComponent$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryFullViewWidgetComponent$Companion$createWidgetComponent$1$1$playerDelegateProvider$2(GalleryFullViewWidgetComponent$Companion$createWidgetComponent$1$1 galleryFullViewWidgetComponent$Companion$createWidgetComponent$1$1) {
        super(0);
        this.this$0 = galleryFullViewWidgetComponent$Companion$createWidgetComponent$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final VideoMoleculePlayerDelegateProvider invoke() {
        return new VideoMoleculePlayerDelegateProvider(this.this$0.getVideoComponentApi().getVideoController());
    }
}
