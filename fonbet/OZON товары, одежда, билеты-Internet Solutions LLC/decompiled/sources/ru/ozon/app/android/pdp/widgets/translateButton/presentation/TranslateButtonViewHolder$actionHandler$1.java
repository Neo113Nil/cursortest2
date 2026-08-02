package ru.ozon.app.android.pdp.widgets.translateButton.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class TranslateButtonViewHolder$actionHandler$1 extends C7735q implements Function1<AtomAction.Click, Unit> {
    TranslateButtonViewHolder$actionHandler$1(Object obj) {
        super(1, obj, TranslateButtonViewHolder.class, "clickAction", "clickAction(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((TranslateButtonViewHolder) this.receiver).clickAction(p02);
    }
}
