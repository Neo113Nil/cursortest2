package ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$InvalidAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CurtainGoalsV2ViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.InvalidAction, Unit> {
    final /* synthetic */ CurtainGoalsV2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurtainGoalsV2ViewHolder$actionHandler$1(CurtainGoalsV2ViewHolder curtainGoalsV2ViewHolder) {
        super(1);
        this.this$0 = curtainGoalsV2ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.InvalidAction invalidAction) {
        invoke2(invalidAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.InvalidAction it) {
        ComposerReferences composerReferences;
        Intrinsics.checkNotNullParameter(it, "it");
        composerReferences = this.this$0.refs;
        InterfaceC7851b.a.a(composerReferences.getController(), null, null, null, null, 15);
    }
}
