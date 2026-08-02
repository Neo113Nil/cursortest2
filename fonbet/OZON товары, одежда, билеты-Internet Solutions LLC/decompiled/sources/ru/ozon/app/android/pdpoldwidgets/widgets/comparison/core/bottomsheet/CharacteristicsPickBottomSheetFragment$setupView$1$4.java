package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.bottomsheet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CharacteristicsPickBottomSheetFragment$setupView$1$4 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ CharacteristicsPickBottomSheetFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CharacteristicsPickBottomSheetFragment$setupView$1$4(CharacteristicsPickBottomSheetFragment characteristicsPickBottomSheetFragment) {
        super(1);
        this.this$0 = characteristicsPickBottomSheetFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if ((it instanceof AtomAction.ComposerAction) && Intrinsics.d(((AtomAction.ComposerAction) it).getActionName(), "compareApiAddKeyCharacteristicsV1")) {
            this.this$0.submitResult();
        }
    }
}
