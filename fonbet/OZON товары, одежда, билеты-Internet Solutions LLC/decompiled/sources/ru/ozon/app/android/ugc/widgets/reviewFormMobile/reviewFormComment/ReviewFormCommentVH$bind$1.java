package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment;

import WZ.m;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isUserInitiated", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewFormCommentVH$bind$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ ReviewFormCommentVO $item;
    final /* synthetic */ ReviewFormCommentVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewFormCommentVH$bind$1(ReviewFormCommentVO reviewFormCommentVO, ReviewFormCommentVH reviewFormCommentVH) {
        super(1);
        this.$item = reviewFormCommentVO;
        this.this$0 = reviewFormCommentVH;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        t clickTokenizedEvent;
        if ((!this.$item.getIsModal() || this.$item.getIsExpanded() || z11) && (clickTokenizedEvent = this.$item.getClickTokenizedEvent()) != null) {
            m.a(this.this$0.tokenizedAnalytics, clickTokenizedEvent, null);
        }
    }
}
