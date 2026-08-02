package ru.ozon.app.android.commonwidgets.widgets.navbariconbutton.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class NavBarIconButtonWidgetViewHolder$bind$2 extends C7735q implements Function1<AtomAction.Click, Unit> {
    NavBarIconButtonWidgetViewHolder$bind$2(Object obj) {
        super(1, obj, NavBarIconButtonWidgetViewHolder.class, "processCustomAction", "processCustomAction(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((NavBarIconButtonWidgetViewHolder) this.receiver).processCustomAction(p02);
    }
}
