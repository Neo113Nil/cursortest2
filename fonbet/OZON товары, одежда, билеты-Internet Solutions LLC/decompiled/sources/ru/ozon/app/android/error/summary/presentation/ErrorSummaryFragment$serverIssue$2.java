package ru.ozon.app.android.error.summary.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.uikit.screenstate.ScreenState;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ErrorSummaryFragment$serverIssue$2 extends AbstractC7737t implements Function0<ScreenState.ServerIssue> {
    final /* synthetic */ ErrorSummaryFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ErrorSummaryFragment$serverIssue$2(ErrorSummaryFragment errorSummaryFragment) {
        super(0);
        this.this$0 = errorSummaryFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ScreenState.ServerIssue invoke() {
        return (ScreenState.ServerIssue) this.this$0.requireArguments().getParcelable("ARGS");
    }
}
