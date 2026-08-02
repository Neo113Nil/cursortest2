package ru.ozon.app.android.fresh.common.widgets.molecules.freshTile;

import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FreshTileDelegate$bind$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ FreshTileModel $item;
    final /* synthetic */ FreshTileDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshTileDelegate$bind$1(FreshTileModel freshTileModel, FreshTileDelegate freshTileDelegate) {
        super(0);
        this.$item = freshTileModel;
        this.this$0 = freshTileDelegate;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        r1 = r2.this$0.actionHandler;
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2() {
        Function1 function1;
        Function1 function12;
        t tokenizedEvent = this.$item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            function12 = this.this$0.sendClickAnalytics;
            function12.invoke(tokenizedEvent);
        }
        AtomAction clickAction = this.$item.getClickAction();
        if (clickAction == null || function1 == null) {
            return;
        }
        function1.invoke(clickAction);
    }
}
