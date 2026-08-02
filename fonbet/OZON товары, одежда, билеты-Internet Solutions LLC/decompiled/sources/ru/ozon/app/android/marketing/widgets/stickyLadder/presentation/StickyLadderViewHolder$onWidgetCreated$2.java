package ru.ozon.app.android.marketing.widgets.stickyLadder.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;
import ru.ozon.app.android.marketing.widgets.stickyLadder.core.StickyLadderUpdate;
import ru.ozon.app.android.marketing.widgets.stickyLadder.presentation.StickyLadderAsyncViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderAsyncViewModel$NewState;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/marketing/widgets/stickyLadder/presentation/StickyLadderAsyncViewModel$NewState;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class StickyLadderViewHolder$onWidgetCreated$2 extends AbstractC7737t implements Function1<StickyLadderAsyncViewModel.NewState, Unit> {
    final /* synthetic */ StickyLadderViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickyLadderViewHolder$onWidgetCreated$2(StickyLadderViewHolder stickyLadderViewHolder) {
        super(1);
        this.this$0 = stickyLadderViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(StickyLadderAsyncViewModel.NewState newState) {
        invoke2(newState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(StickyLadderAsyncViewModel.NewState newState) {
        i iVar;
        if (newState != null) {
            iVar = this.this$0.container;
            iVar.M().update(new StickyLadderUpdate(newState.getStickyLadderVO()));
        }
    }
}
