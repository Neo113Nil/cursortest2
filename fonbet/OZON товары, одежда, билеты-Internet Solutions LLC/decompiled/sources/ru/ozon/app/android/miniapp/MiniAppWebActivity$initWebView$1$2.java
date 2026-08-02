package ru.ozon.app.android.miniapp;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.miniapp.databinding.ActivityMiniAppWebBinding;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class MiniAppWebActivity$initWebView$1$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ActivityMiniAppWebBinding $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MiniAppWebActivity$initWebView$1$2(ActivityMiniAppWebBinding activityMiniAppWebBinding) {
        super(0);
        this.$this_with = activityMiniAppWebBinding;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$this_with.swipeRefreshLayout.setRefreshing(false);
    }
}
