package ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.main;

import Sc.o;
import android.view.View;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky.DeleteAccountDescriptionStickyViewModel;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.app.android.utils.WhenExtKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyViewModel$Action;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DeleteAccountDescriptionMainVH$onAttach$1 extends AbstractC7737t implements Function1<DeleteAccountDescriptionStickyViewModel.Action, Unit> {
    final /* synthetic */ DeleteAccountDescriptionMainVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeleteAccountDescriptionMainVH$onAttach$1(DeleteAccountDescriptionMainVH deleteAccountDescriptionMainVH) {
        super(1);
        this.this$0 = deleteAccountDescriptionMainVH;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DeleteAccountDescriptionStickyViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DeleteAccountDescriptionStickyViewModel.Action action) {
        View view;
        View view2;
        Intrinsics.checkNotNullParameter(action, "action");
        this.this$0.getRef().getController().hideLoader();
        if (Intrinsics.d(action, DeleteAccountDescriptionStickyViewModel.Action.Loading.INSTANCE)) {
            this.this$0.getRef().getController().e(new l.a.C1079a(0L, null, 3));
        } else if (action instanceof DeleteAccountDescriptionStickyViewModel.Action.Navigate) {
            view2 = this.this$0.containerView;
            KeyboardUtilsKt.hideKeyboard(view2);
            ComposerNavigator.DefaultImpls.openDeeplink$default(this.this$0.getRef().getNavigator(), ((DeleteAccountDescriptionStickyViewModel.Action.Navigate) action).getDeeplink(), null, 2, null);
        } else if (action instanceof DeleteAccountDescriptionStickyViewModel.Action.Restriction) {
            this.this$0.showRestriction(((DeleteAccountDescriptionStickyViewModel.Action.Restriction) action).getMessage());
        } else if (action instanceof DeleteAccountDescriptionStickyViewModel.Action.FieldError) {
            this.this$0.showFieldError(((DeleteAccountDescriptionStickyViewModel.Action.FieldError) action).getMessage());
        } else {
            if (!(action instanceof DeleteAccountDescriptionStickyViewModel.Action.Reload)) {
                throw new o();
            }
            view = this.this$0.containerView;
            KeyboardUtilsKt.hideKeyboard(view);
            InterfaceC7851b.a.a(this.this$0.getRef().getController(), ((DeleteAccountDescriptionStickyViewModel.Action.Reload) action).getDeeplink(), null, null, null, 14);
        }
        WhenExtKt.getExhaustive(Unit.f71690a);
    }
}
