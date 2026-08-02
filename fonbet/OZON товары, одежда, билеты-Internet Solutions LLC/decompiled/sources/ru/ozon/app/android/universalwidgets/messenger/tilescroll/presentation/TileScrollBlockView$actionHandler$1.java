package ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.android.messenger.framework.navigation.action.a;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TileScrollBlockView$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ TileScrollBlockView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileScrollBlockView$actionHandler$1(TileScrollBlockView tileScrollBlockView) {
        super(1);
        this.this$0 = tileScrollBlockView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction it) {
        d dVar;
        Intrinsics.checkNotNullParameter(it, "it");
        dVar = this.this$0.references;
        dVar.c().q(new a(null, it, null, 5));
    }
}
