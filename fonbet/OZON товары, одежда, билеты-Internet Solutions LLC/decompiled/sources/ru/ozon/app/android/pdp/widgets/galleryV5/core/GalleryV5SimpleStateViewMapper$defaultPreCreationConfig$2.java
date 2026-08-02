package ru.ozon.app.android.pdp.widgets.galleryV5.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5PreCreationConfig;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/GalleryV5PreCreationConfig;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class GalleryV5SimpleStateViewMapper$defaultPreCreationConfig$2 extends AbstractC7737t implements Function0<GalleryV5PreCreationConfig> {
    final /* synthetic */ GalleryV5SimpleStateViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryV5SimpleStateViewMapper$defaultPreCreationConfig$2(GalleryV5SimpleStateViewMapper galleryV5SimpleStateViewMapper) {
        super(0);
        this.this$0 = galleryV5SimpleStateViewMapper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final GalleryV5PreCreationConfig invoke() {
        GalleryV5SimpleStateViewMapper galleryV5SimpleStateViewMapper = this.this$0;
        return galleryV5SimpleStateViewMapper.createDefaultPreCreationConfig(galleryV5SimpleStateViewMapper.component().getContext());
    }
}
