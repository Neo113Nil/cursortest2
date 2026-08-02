package ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation;

import android.content.Context;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "updatedButtons", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class EmptyStateV2ButtonsHorizontalViewDelegate$timerSupport$1 extends AbstractC7737t implements Function1<List<? extends AtomDTO>, Unit> {
    final /* synthetic */ EmptyStateV2ButtonsHorizontalViewDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmptyStateV2ButtonsHorizontalViewDelegate$timerSupport$1(EmptyStateV2ButtonsHorizontalViewDelegate emptyStateV2ButtonsHorizontalViewDelegate) {
        super(1);
        this.this$0 = emptyStateV2ButtonsHorizontalViewDelegate;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends AtomDTO> list) {
        invoke2(list);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends AtomDTO> updatedButtons) {
        AtomsAdapter atomsAdapter;
        View view;
        Intrinsics.checkNotNullParameter(updatedButtons, "updatedButtons");
        atomsAdapter = this.this$0.horizontalItemsAdapter;
        view = this.this$0.view;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, updatedButtons);
    }
}
