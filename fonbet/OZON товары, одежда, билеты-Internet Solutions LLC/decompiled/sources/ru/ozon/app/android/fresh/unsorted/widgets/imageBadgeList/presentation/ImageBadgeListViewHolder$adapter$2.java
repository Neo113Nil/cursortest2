package ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.presentation;

import WZ.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.unsorted.widgets.imageBadgeList.presentation.adapter.ImageBadgeListAdapter;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/unsorted/widgets/imageBadgeList/presentation/adapter/ImageBadgeListAdapter;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ImageBadgeListViewHolder$adapter$2 extends AbstractC7737t implements Function0<ImageBadgeListAdapter> {
    final /* synthetic */ ImageBadgeListViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageBadgeListViewHolder$adapter$2(ImageBadgeListViewHolder imageBadgeListViewHolder) {
        super(0);
        this.this$0 = imageBadgeListViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ImageBadgeListAdapter invoke() {
        Function1 function1;
        l lVar;
        function1 = this.this$0.actionHandler;
        lVar = this.this$0.tokenizedAnalytics;
        return new ImageBadgeListAdapter(function1, lVar);
    }
}
