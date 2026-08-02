package ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FakeSearchViewController$stickyBackgroundView$2 extends AbstractC7737t implements Function0<View> {
    final /* synthetic */ FakeSearchViewController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FakeSearchViewController$stickyBackgroundView$2(FakeSearchViewController fakeSearchViewController) {
        super(0);
        this.this$0 = fakeSearchViewController;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        Context context;
        context = this.this$0.getContext();
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return view;
    }
}
