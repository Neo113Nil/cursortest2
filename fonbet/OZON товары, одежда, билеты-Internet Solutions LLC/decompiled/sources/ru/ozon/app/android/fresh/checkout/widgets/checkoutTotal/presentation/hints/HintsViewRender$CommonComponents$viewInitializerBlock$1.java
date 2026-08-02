package ru.ozon.app.android.fresh.checkout.widgets.checkoutTotal.presentation.hints;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.rv.atom.AtomItemViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/atoms/rv/atom/AtomItemViewHolder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class HintsViewRender$CommonComponents$viewInitializerBlock$1 extends AbstractC7737t implements Function1<AtomItemViewHolder, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HintsViewRender$CommonComponents$viewInitializerBlock$1(Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomItemViewHolder atomItemViewHolder) {
        invoke2(atomItemViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomItemViewHolder atomItemViewHolder) {
        Intrinsics.checkNotNullParameter(atomItemViewHolder, "<this>");
        atomItemViewHolder.getAtom().setOnAtomAction(this.$actionHandler);
        if (atomItemViewHolder.itemView.getLayoutParams() == null) {
            atomItemViewHolder.itemView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        }
    }
}
