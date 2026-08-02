package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "observer", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/WiseSkuScrollLifecycle;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class WiseSkuScrollViewHolder$dependencyHolder$2$1$setWiseSkuScrollObserver$1 extends AbstractC7737t implements Function1<WiseSkuScrollLifecycle, Unit> {
    final /* synthetic */ WiseSkuScrollViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WiseSkuScrollViewHolder$dependencyHolder$2$1$setWiseSkuScrollObserver$1(WiseSkuScrollViewHolder wiseSkuScrollViewHolder) {
        super(1);
        this.this$0 = wiseSkuScrollViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WiseSkuScrollLifecycle wiseSkuScrollLifecycle) {
        invoke2(wiseSkuScrollLifecycle);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WiseSkuScrollLifecycle observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.this$0.playerObserver = observer;
    }
}
