package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.bottomsheet;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.ui.configurators.databinding.FragmentPdpComparisonCharateristicsPickBinding;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isVisible", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CharacteristicsPickBottomSheetFragment$onStart$3 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ CharacteristicsPickBottomSheetFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CharacteristicsPickBottomSheetFragment$onStart$3(CharacteristicsPickBottomSheetFragment characteristicsPickBottomSheetFragment) {
        super(1);
        this.this$0 = characteristicsPickBottomSheetFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        FragmentPdpComparisonCharateristicsPickBinding binding;
        CharacteristicsPickBottomSheetFragment characteristicsPickBottomSheetFragment = this.this$0;
        binding = characteristicsPickBottomSheetFragment.getBinding();
        TextView clearTV = binding.clearTV;
        Intrinsics.checkNotNullExpressionValue(clearTV, "clearTV");
        characteristicsPickBottomSheetFragment.setButtonVisibility(clearTV, z11);
    }
}
