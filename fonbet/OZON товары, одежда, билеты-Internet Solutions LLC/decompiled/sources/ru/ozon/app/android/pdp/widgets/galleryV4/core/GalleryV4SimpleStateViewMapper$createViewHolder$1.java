package ru.ozon.app.android.pdp.widgets.galleryV4.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryVideoPlayer;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryVideoPlayer;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class GalleryV4SimpleStateViewMapper$createViewHolder$1 extends AbstractC7737t implements Function0<GalleryVideoPlayer> {
    final /* synthetic */ GalleryV4SimpleStateViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryV4SimpleStateViewMapper$createViewHolder$1(GalleryV4SimpleStateViewMapper galleryV4SimpleStateViewMapper) {
        super(0);
        this.this$0 = galleryV4SimpleStateViewMapper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final GalleryVideoPlayer invoke() {
        return this.this$0.component().getVideoPlayer();
    }
}
