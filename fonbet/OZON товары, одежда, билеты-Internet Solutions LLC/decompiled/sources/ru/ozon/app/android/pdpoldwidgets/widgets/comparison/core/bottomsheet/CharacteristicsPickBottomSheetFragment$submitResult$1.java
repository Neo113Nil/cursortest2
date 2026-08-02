package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.bottomsheet;

import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CharacteristicsPickBottomSheetFragment$submitResult$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ CharacteristicsPickBottomSheetFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CharacteristicsPickBottomSheetFragment$submitResult$1(CharacteristicsPickBottomSheetFragment characteristicsPickBottomSheetFragment) {
        super(0);
        this.this$0 = characteristicsPickBottomSheetFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ComponentCallbacksC5392m targetFragment = this.this$0.getTargetFragment();
        if (targetFragment != null) {
            targetFragment.onActivityResult(this.this$0.getTargetRequestCode(), -1, null);
        }
        this.this$0.dismiss();
    }
}
