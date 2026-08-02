package ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.presentation;

import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/presentation/FakeSearchViewController;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FakeSearchViewHolder$viewController$2 extends AbstractC7737t implements Function0<FakeSearchViewController> {
    final /* synthetic */ FakeSearchViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FakeSearchViewHolder$viewController$2(FakeSearchViewHolder fakeSearchViewHolder) {
        super(0);
        this.this$0 = fakeSearchViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FakeSearchViewController invoke() {
        FrameLayout frameLayout;
        frameLayout = this.this$0.containerView;
        return new FakeSearchViewController(frameLayout);
    }
}
