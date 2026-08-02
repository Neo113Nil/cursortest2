package ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.submitButton;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.RoleInvitationCreatorViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class RoleInvitationCreatorSubmitOverlayViewHolder$actionHandler$2 extends AbstractC7737t implements Function0<Function1<? super AtomAction, ? extends Unit>> {
    final /* synthetic */ RoleInvitationCreatorSubmitOverlayViewHolder this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.presentation.submitButton.RoleInvitationCreatorSubmitOverlayViewHolder$actionHandler$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
        final /* synthetic */ RoleInvitationCreatorSubmitOverlayViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RoleInvitationCreatorSubmitOverlayViewHolder roleInvitationCreatorSubmitOverlayViewHolder) {
            super(1);
            this.this$0 = roleInvitationCreatorSubmitOverlayViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
            invoke2(composerAction);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtomAction.ComposerAction action) {
            RoleInvitationCreatorViewModel roleInvitationCreatorViewModel;
            String str;
            RoleInvitationCreatorViewModel roleInvitationCreatorViewModel2;
            Map<String, String> map;
            Intrinsics.checkNotNullParameter(action, "action");
            RoleInvitationCreatorSubmitOverlayViewHolder roleInvitationCreatorSubmitOverlayViewHolder = this.this$0;
            Map<String, String> params = action.getParams();
            roleInvitationCreatorSubmitOverlayViewHolder.currentRoleName = params != null ? params.get("role_name") : null;
            roleInvitationCreatorViewModel = this.this$0.viewModel;
            str = this.this$0.currentRoleName;
            roleInvitationCreatorViewModel.setRoleName(str);
            roleInvitationCreatorViewModel2 = this.this$0.viewModel;
            map = this.this$0.currentLexemes;
            roleInvitationCreatorViewModel2.validateAll(map);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoleInvitationCreatorSubmitOverlayViewHolder$actionHandler$2(RoleInvitationCreatorSubmitOverlayViewHolder roleInvitationCreatorSubmitOverlayViewHolder) {
        super(0);
        this.this$0 = roleInvitationCreatorSubmitOverlayViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Function1<? super AtomAction, ? extends Unit> invoke() {
        i iVar;
        iVar = this.this$0.composerContainer;
        return new ActionHandler.Builder(iVar, this.this$0).onComposerAction(new AnonymousClass1(this.this$0)).buildHandler();
    }
}
