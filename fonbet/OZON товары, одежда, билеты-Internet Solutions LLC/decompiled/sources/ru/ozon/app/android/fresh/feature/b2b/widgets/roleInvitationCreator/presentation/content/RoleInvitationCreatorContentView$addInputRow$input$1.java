package ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.content;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.content.RoleInvitationCreatorContentView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/ConstraintLayout$b;", "", "invoke", "(Landroidx/constraintlayout/widget/ConstraintLayout$b;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class RoleInvitationCreatorContentView$addInputRow$input$1 extends AbstractC7737t implements Function1<ConstraintLayout.b, Unit> {
    final /* synthetic */ IconButtonV3View $deleteButton;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoleInvitationCreatorContentView$addInputRow$input$1(IconButtonV3View iconButtonV3View) {
        super(1);
        this.$deleteButton = iconButtonV3View;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstraintLayout.b bVar) {
        invoke2(bVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstraintLayout.b createInput) {
        RoleInvitationCreatorContentView.Companion companion;
        Intrinsics.checkNotNullParameter(createInput, "$this$createInput");
        createInput.f41656t = 0;
        createInput.f41657u = this.$deleteButton.getId();
        createInput.f41636i = 0;
        companion = RoleInvitationCreatorContentView.Companion;
        ((ViewGroup.MarginLayoutParams) createInput).rightMargin = companion.getPADDING_8();
    }
}
