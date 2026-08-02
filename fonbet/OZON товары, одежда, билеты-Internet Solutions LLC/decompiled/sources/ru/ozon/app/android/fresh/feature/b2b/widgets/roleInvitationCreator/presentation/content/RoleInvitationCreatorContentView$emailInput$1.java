package ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.content;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.content.RoleInvitationCreatorContentView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/ConstraintLayout$b;", "", "invoke", "(Landroidx/constraintlayout/widget/ConstraintLayout$b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class RoleInvitationCreatorContentView$emailInput$1 extends AbstractC7737t implements Function1<ConstraintLayout.b, Unit> {
    final /* synthetic */ RoleInvitationCreatorContentView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoleInvitationCreatorContentView$emailInput$1(RoleInvitationCreatorContentView roleInvitationCreatorContentView) {
        super(1);
        this.this$0 = roleInvitationCreatorContentView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstraintLayout.b bVar) {
        invoke2(bVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstraintLayout.b createInput) {
        TextAtomV2View textAtomV2View;
        RoleInvitationCreatorContentView.Companion companion;
        RoleInvitationCreatorContentView.Companion companion2;
        Intrinsics.checkNotNullParameter(createInput, "$this$createInput");
        textAtomV2View = this.this$0.subtitleView;
        createInput.f41638j = textAtomV2View.getId();
        createInput.f41656t = 0;
        createInput.f41658v = 0;
        companion = RoleInvitationCreatorContentView.Companion;
        ((ViewGroup.MarginLayoutParams) createInput).topMargin = companion.getPADDING_8();
        companion2 = RoleInvitationCreatorContentView.Companion;
        ((ViewGroup.MarginLayoutParams) createInput).bottomMargin = companion2.getPADDING_8();
    }
}
