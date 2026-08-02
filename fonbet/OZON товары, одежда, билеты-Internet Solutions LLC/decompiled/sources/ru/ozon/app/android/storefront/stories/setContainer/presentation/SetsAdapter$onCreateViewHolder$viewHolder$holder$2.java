package ru.ozon.app.android.storefront.stories.setContainer.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.stories.setContainer.presentation.SetContainerVH;
import ru.ozon.app.android.storefront.stories.setOfPreviews.data.PreviewItemVO;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "story", "Lru/ozon/app/android/storefront/stories/setOfPreviews/data/PreviewItemVO;", "position", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SetsAdapter$onCreateViewHolder$viewHolder$holder$2 extends AbstractC7737t implements Function2<PreviewItemVO, Integer, Unit> {
    final /* synthetic */ SetsAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetsAdapter$onCreateViewHolder$viewHolder$holder$2(SetsAdapter setsAdapter) {
        super(2);
        this.this$0 = setsAdapter;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(PreviewItemVO previewItemVO, Integer num) {
        invoke(previewItemVO, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(PreviewItemVO story, int i11) {
        SetContainerVH.SetPreviewsCallback setPreviewsCallback;
        Intrinsics.checkNotNullParameter(story, "story");
        setPreviewsCallback = this.this$0.setPreviewsCallback;
        setPreviewsCallback.preloadImage(story, i11);
    }
}
