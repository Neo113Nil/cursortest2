package ru.ozon.app.android.marketing.widgets.ladderActions.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import ru.ozon.app.android.marketing.widgets.ladderActions.core.LadderActionsUpdateButtonKey;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "update", "Lru/ozon/app/android/marketing/widgets/ladderActions/core/LadderActionsUpdateButtonKey;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/marketing/widgets/ladderActions/core/LadderActionsUpdateButtonKey;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class LadderActionsViewHolder$onAttachViewModel$1 extends AbstractC7737t implements Function1<LadderActionsUpdateButtonKey, Unit> {
    final /* synthetic */ LadderActionsViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LadderActionsViewHolder$onAttachViewModel$1(LadderActionsViewHolder ladderActionsViewHolder) {
        super(1);
        this.this$0 = ladderActionsViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LadderActionsUpdateButtonKey ladderActionsUpdateButtonKey) {
        invoke2(ladderActionsUpdateButtonKey);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LadderActionsUpdateButtonKey ladderActionsUpdateButtonKey) {
        i iVar;
        iVar = this.this$0.screenContainer;
        InterfaceC7851b M11 = iVar.M();
        Intrinsics.f(ladderActionsUpdateButtonKey);
        M11.update(ladderActionsUpdateButtonKey);
    }
}
