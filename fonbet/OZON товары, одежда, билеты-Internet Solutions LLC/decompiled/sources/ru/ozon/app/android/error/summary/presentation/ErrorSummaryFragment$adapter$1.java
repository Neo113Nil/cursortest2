package ru.ozon.app.android.error.summary.presentation;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.abtool.presentation.AbToggleActivity;
import ru.ozon.app.android.abtool.presentation.AbToggleScreenType;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ErrorSummaryFragment$adapter$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ErrorSummaryFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ErrorSummaryFragment$adapter$1(ErrorSummaryFragment errorSummaryFragment) {
        super(0);
        this.this$0 = errorSummaryFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AbToggleActivity.Companion companion = AbToggleActivity.INSTANCE;
        Context requireContext = this.this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        AbToggleActivity.Companion.startActivity$default(companion, requireContext, AbToggleScreenType.EXPERIMENTS, null, null, null, 28, null);
    }
}
