package ru.ozon.app.android.ugc.core.widgets.singlereview;

import WZ.l;
import WZ.m;
import WZ.t;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.core.widgets.singlereview.updateKeys.ExpandBodyUpdate;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Function1;", "Landroid/view/View;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SingleReviewViewHolder$bodyAtomsClickListener$2 extends AbstractC7737t implements Function0<Function1<? super View, ? extends Unit>> {
    final /* synthetic */ SingleReviewViewHolder this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.core.widgets.singlereview.SingleReviewViewHolder$bodyAtomsClickListener$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<View, Unit> {
        final /* synthetic */ SingleReviewViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SingleReviewViewHolder singleReviewViewHolder) {
            super(1);
            this.this$0 = singleReviewViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            ComposerReferences composerReferences;
            l lVar;
            Intrinsics.checkNotNullParameter(it, "it");
            SingleReviewVO boundData = this.this$0.getBoundData();
            if (boundData != null) {
                if (boundData.getBodyCollapsedAtoms() == null) {
                    boundData = null;
                }
                if (boundData != null) {
                    SingleReviewViewHolder singleReviewViewHolder = this.this$0;
                    composerReferences = singleReviewViewHolder.refs;
                    composerReferences.getController().update(new ExpandBodyUpdate(boundData.getId()));
                    t reviewExpandTokenizedEvent = boundData.getReviewExpandTokenizedEvent();
                    if (reviewExpandTokenizedEvent != null) {
                        lVar = singleReviewViewHolder.tokenizedAnalytics;
                        m.a(lVar, reviewExpandTokenizedEvent, null);
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleReviewViewHolder$bodyAtomsClickListener$2(SingleReviewViewHolder singleReviewViewHolder) {
        super(0);
        this.this$0 = singleReviewViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Function1<? super View, ? extends Unit> invoke() {
        return new AnonymousClass1(this.this$0);
    }
}
