package ru.ozon.app.android.travel.feature.hotels.shared.shelfCard;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Lkotlin/Unit;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ShelfCardView$clickListener$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ShelfCardView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShelfCardView$clickListener$1(ShelfCardView shelfCardView) {
        super(0);
        this.this$0 = shelfCardView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0009, code lost:
    
        r2 = r3.this$0.onAction;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Unit invoke() {
        AtomAction atomAction;
        Function1 function1;
        atomAction = this.this$0.action;
        if (atomAction == null || function1 == null) {
            return null;
        }
        function1.invoke(atomAction);
        return Unit.f71690a;
    }
}
