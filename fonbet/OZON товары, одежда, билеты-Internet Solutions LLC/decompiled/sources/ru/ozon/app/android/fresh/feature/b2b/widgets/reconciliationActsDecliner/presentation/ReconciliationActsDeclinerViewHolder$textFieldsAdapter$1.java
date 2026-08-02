package ru.ozon.app.android.fresh.feature.b2b.widgets.reconciliationActsDecliner.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "input", "", "position", "", "invoke", "(Ljava/lang/String;Ljava/lang/Integer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ReconciliationActsDeclinerViewHolder$textFieldsAdapter$1 extends AbstractC7737t implements Function2<String, Integer, Unit> {
    final /* synthetic */ ReconciliationActsDeclinerViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReconciliationActsDeclinerViewHolder$textFieldsAdapter$1(ReconciliationActsDeclinerViewHolder reconciliationActsDeclinerViewHolder) {
        super(2);
        this.this$0 = reconciliationActsDeclinerViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
        invoke2(str, num);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String input, Integer num) {
        ReconciliationActsDeclinerViewModel reconciliationActsDeclinerViewModel;
        Intrinsics.checkNotNullParameter(input, "input");
        reconciliationActsDeclinerViewModel = this.this$0.viewModel;
        reconciliationActsDeclinerViewModel.updateInput(input, num);
    }
}
