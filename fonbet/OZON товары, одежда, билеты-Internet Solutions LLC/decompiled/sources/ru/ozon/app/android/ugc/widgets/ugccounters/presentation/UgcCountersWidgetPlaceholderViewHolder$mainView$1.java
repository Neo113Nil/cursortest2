package ru.ozon.app.android.ugc.widgets.ugccounters.presentation;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersLlViewHolder;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersRvViewHolder;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/ViewGroup;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class UgcCountersWidgetPlaceholderViewHolder$mainView$1 extends AbstractC7737t implements Function0<ViewGroup> {
    final /* synthetic */ UgcCountersWidgetPlaceholderViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UgcCountersWidgetPlaceholderViewHolder$mainView$1(UgcCountersWidgetPlaceholderViewHolder ugcCountersWidgetPlaceholderViewHolder) {
        super(0);
        this.this$0 = ugcCountersWidgetPlaceholderViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ViewGroup invoke() {
        boolean z11;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        z11 = this.this$0.hasExpandingBlock;
        if (z11) {
            UgcCountersLlViewHolder.Companion companion = UgcCountersLlViewHolder.INSTANCE;
            frameLayout2 = this.this$0.view;
            Context context = frameLayout2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return companion.createView(context);
        }
        UgcCountersRvViewHolder.Companion companion2 = UgcCountersRvViewHolder.INSTANCE;
        frameLayout = this.this$0.view;
        Context context2 = frameLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return companion2.createView(context2);
    }
}
