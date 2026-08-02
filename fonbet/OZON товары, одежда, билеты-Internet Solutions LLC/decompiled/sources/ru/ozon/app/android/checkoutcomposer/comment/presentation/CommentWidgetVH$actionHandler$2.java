package ru.ozon.app.android.checkoutcomposer.comment.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class CommentWidgetVH$actionHandler$2 extends C7735q implements Function1<AtomAction.TextChange, Unit> {
    CommentWidgetVH$actionHandler$2(Object obj) {
        super(1, obj, CommentWidgetVH.class, "handleTextChanging", "handleTextChanging(Lru/ozon/uni/atoms/af/AtomAction$TextChange;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.TextChange textChange) {
        invoke2(textChange);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.TextChange p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((CommentWidgetVH) this.receiver).handleTextChanging(p02);
    }
}
