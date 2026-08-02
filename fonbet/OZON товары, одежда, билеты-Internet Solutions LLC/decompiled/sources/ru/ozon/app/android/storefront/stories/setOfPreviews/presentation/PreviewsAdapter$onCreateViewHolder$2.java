package ru.ozon.app.android.storefront.stories.setOfPreviews.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.stories.setOfPreviews.data.PreviewItemVO;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "story", "Lru/ozon/app/android/storefront/stories/setOfPreviews/data/PreviewItemVO;", "position", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PreviewsAdapter$onCreateViewHolder$2 extends AbstractC7737t implements Function2<PreviewItemVO, Integer, Unit> {
    final /* synthetic */ PreviewsAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreviewsAdapter$onCreateViewHolder$2(PreviewsAdapter previewsAdapter) {
        super(2);
        this.this$0 = previewsAdapter;
    }

    public final void invoke(PreviewItemVO story, int i11) {
        StoriesPreviewCallback storiesPreviewCallback;
        Intrinsics.checkNotNullParameter(story, "story");
        storiesPreviewCallback = this.this$0.storiesPreviewCallback;
        storiesPreviewCallback.preloadImage(story, i11);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(PreviewItemVO previewItemVO, Integer num) {
        invoke(previewItemVO, num.intValue());
        return Unit.f71690a;
    }
}
