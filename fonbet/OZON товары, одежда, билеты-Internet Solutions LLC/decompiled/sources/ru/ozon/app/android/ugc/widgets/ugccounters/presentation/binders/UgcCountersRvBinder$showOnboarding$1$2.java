package ru.ozon.app.android.ugc.widgets.ugccounters.presentation.binders;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class UgcCountersRvBinder$showOnboarding$1$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ UgcCountersVO.Block $block;
    final /* synthetic */ UgcCountersRvBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UgcCountersRvBinder$showOnboarding$1$2(UgcCountersVO.Block block, UgcCountersRvBinder ugcCountersRvBinder) {
        super(0);
        this.$block = block;
        this.this$0 = ugcCountersRvBinder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OnBoardingDelegate onBoardingDelegate;
        Function1 function1;
        Function1 function12;
        UgcCountersVO.Block block = this.$block;
        if (block instanceof UgcCountersVO.Block.Single) {
            AtomAction action = ((UgcCountersVO.Block.Single) block).getAction();
            if (action != null) {
                function12 = this.this$0.actionHandler;
                function12.invoke(action);
                return;
            }
            return;
        }
        if (!(block instanceof UgcCountersVO.Block.Images)) {
            onBoardingDelegate = this.this$0.onboardingDelegate;
            if (onBoardingDelegate != null) {
                onBoardingDelegate.unbind();
                return;
            }
            return;
        }
        AtomAction action2 = ((UgcCountersVO.Block.Images) block).getAction();
        if (action2 != null) {
            function1 = this.this$0.actionHandler;
            function1.invoke(action2);
        }
    }
}
