package ru.ozon.app.android.travel.feature.general.main.widgets.pointsInput.presentation;

import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.text.h;
import ru.ozon.app.android.travel.feature.general.main.widgets.pointsInput.view.PointsInputView;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", SearchIntents.EXTRA_QUERY, "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class PointsInputWidgetViewHolder$debouncedTextWatcher$1 extends AbstractC7737t implements Function1<CharSequence, Unit> {
    final /* synthetic */ PointsInputWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PointsInputWidgetViewHolder$debouncedTextWatcher$1(PointsInputWidgetViewHolder pointsInputWidgetViewHolder) {
        super(1);
        this.this$0 = pointsInputWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
        invoke2(charSequence);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CharSequence charSequence) {
        PointsInputView containerView;
        containerView = this.this$0.getContainerView();
        if (containerView != null) {
            containerView.isClearQueryIconVisible(true ^ (charSequence == null || h.K(charSequence)));
        }
        this.this$0.onQueryChanged(charSequence != null ? charSequence.toString() : null);
    }
}
