package ru.ozon.app.android.uikit.dialog.sort;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SortsBottomSheetDialog$setupItems$1$1 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ Function1<Integer, Unit> $onSelected;
    final /* synthetic */ RecyclerView $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SortsBottomSheetDialog$setupItems$1$1(Function1<? super Integer, Unit> function1, RecyclerView recyclerView) {
        super(1);
        this.$onSelected = function1;
        this.$this_apply = recyclerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.$onSelected.invoke(Integer.valueOf(this.$this_apply.getChildLayoutPosition(view)));
    }
}
