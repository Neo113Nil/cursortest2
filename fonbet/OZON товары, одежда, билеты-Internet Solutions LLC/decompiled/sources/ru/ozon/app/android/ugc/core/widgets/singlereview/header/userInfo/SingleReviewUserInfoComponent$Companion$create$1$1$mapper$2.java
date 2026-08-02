package ru.ozon.app.android.ugc.core.widgets.singlereview.header.userInfo;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ugc.core.widgets.singlereview.prefetch.SingleReviewPrefetcher;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/userInfo/SingleReviewUserInfoMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SingleReviewUserInfoComponent$Companion$create$1$1$mapper$2 extends AbstractC7737t implements Function0<SingleReviewUserInfoMapper> {
    final /* synthetic */ SingleReviewPrefetcher $imagePrefetcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleReviewUserInfoComponent$Companion$create$1$1$mapper$2(SingleReviewPrefetcher singleReviewPrefetcher) {
        super(0);
        this.$imagePrefetcher = singleReviewPrefetcher;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SingleReviewUserInfoMapper invoke() {
        return new SingleReviewUserInfoMapper(this.$imagePrefetcher);
    }
}
