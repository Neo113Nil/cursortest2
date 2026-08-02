package ru.ozon.app.android.session.deleteAccount.deleteAccountButton.presentation;

import Sc.o;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.session.deleteAccount.deleteAccountButton.presentation.DeleteAccountButtonViewModel;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/session/deleteAccount/deleteAccountButton/presentation/DeleteAccountButtonViewModel$Action;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DeleteAccountButtonWidgetViewHolder$onAttachViewModel$1 extends AbstractC7737t implements Function1<DeleteAccountButtonViewModel.Action, Unit> {
    final /* synthetic */ DeleteAccountButtonWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeleteAccountButtonWidgetViewHolder$onAttachViewModel$1(DeleteAccountButtonWidgetViewHolder deleteAccountButtonWidgetViewHolder) {
        super(1);
        this.this$0 = deleteAccountButtonWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DeleteAccountButtonViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DeleteAccountButtonViewModel.Action action) {
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        ComposerReferences composerReferences3;
        ComposerReferences composerReferences4;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof DeleteAccountButtonViewModel.Action.ShowLoading) {
            composerReferences4 = this.this$0.ref;
            composerReferences4.getController().e(new l.a.C1079a(0L, null, 3));
            return;
        }
        if (action instanceof DeleteAccountButtonViewModel.Action.HideLoading) {
            composerReferences3 = this.this$0.ref;
            composerReferences3.getController().hideLoader();
            return;
        }
        if (action instanceof DeleteAccountButtonViewModel.Action.Restriction) {
            this.this$0.showError(((DeleteAccountButtonViewModel.Action.Restriction) action).getMessage());
            return;
        }
        if (action instanceof DeleteAccountButtonViewModel.Action.Navigate) {
            composerReferences2 = this.this$0.ref;
            ComposerNavigator.DefaultImpls.openDeeplink$default(composerReferences2.getNavigator(), ((DeleteAccountButtonViewModel.Action.Navigate) action).getDeeplink(), null, 2, null);
        } else {
            if (!(action instanceof DeleteAccountButtonViewModel.Action.NavigateBottomSheet)) {
                throw new o();
            }
            DeleteAccountButtonWidgetViewHolder deleteAccountButtonWidgetViewHolder = this.this$0;
            composerReferences = deleteAccountButtonWidgetViewHolder.ref;
            deleteAccountButtonWidgetViewHolder.openBottomSheet(composerReferences, ((DeleteAccountButtonViewModel.Action.NavigateBottomSheet) action).getDeeplink());
        }
    }
}
