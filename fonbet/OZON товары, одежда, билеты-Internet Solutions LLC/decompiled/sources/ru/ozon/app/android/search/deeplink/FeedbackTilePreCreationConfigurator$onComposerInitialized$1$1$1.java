package ru.ozon.app.android.search.deeplink;

import android.view.View;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.search.widgets.feedbackTile.presentation.FeedbackTileView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class FeedbackTilePreCreationConfigurator$onComposerInitialized$1$1$1 extends AbstractC7737t implements Function0<View> {
    final /* synthetic */ FeedbackTilePreCreationConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeedbackTilePreCreationConfigurator$onComposerInitialized$1$1$1(FeedbackTilePreCreationConfigurator feedbackTilePreCreationConfigurator) {
        super(0);
        this.this$0 = feedbackTilePreCreationConfigurator;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        r activity;
        activity = this.this$0.getActivity();
        return new FeedbackTileView(activity, null, 0, 0, 14, null);
    }
}
