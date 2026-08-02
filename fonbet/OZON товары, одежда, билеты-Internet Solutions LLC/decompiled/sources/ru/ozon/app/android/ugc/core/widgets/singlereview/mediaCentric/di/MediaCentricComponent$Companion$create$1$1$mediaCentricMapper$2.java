package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.MediaCentricMapper;
import ru.ozon.app.android.ugc.core.widgets.singlereview.prefetch.SingleReviewPrefetcher;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/MediaCentricMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MediaCentricComponent$Companion$create$1$1$mediaCentricMapper$2 extends AbstractC7737t implements Function0<MediaCentricMapper> {
    final /* synthetic */ ContextComponentDependencies $contextComponentDependencies;
    final /* synthetic */ SingleReviewPrefetcher $imagePrefetcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaCentricComponent$Companion$create$1$1$mediaCentricMapper$2(SingleReviewPrefetcher singleReviewPrefetcher, ContextComponentDependencies contextComponentDependencies) {
        super(0);
        this.$imagePrefetcher = singleReviewPrefetcher;
        this.$contextComponentDependencies = contextComponentDependencies;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MediaCentricMapper invoke() {
        return new MediaCentricMapper(this.$imagePrefetcher, this.$contextComponentDependencies.getContext());
    }
}
