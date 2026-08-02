package ru.ozon.app.android.session.userSocialsMobile.presentation.item;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.session.userSocialsMobile.presentation.item.UserSocialsMobileItemViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$SingleAction;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$SingleAction;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class UserSocialsMobileItemViewHolder$onAttach$4 extends AbstractC7737t implements Function1<UserSocialsMobileItemViewModel.SingleAction, Unit> {
    final /* synthetic */ UserSocialsMobileItemViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserSocialsMobileItemViewHolder$onAttach$4(UserSocialsMobileItemViewHolder userSocialsMobileItemViewHolder) {
        super(1);
        this.this$0 = userSocialsMobileItemViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UserSocialsMobileItemViewModel.SingleAction singleAction) {
        invoke2(singleAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UserSocialsMobileItemViewModel.SingleAction singleAction) {
        ComposerReferences composerReferences;
        if (singleAction instanceof UserSocialsMobileItemViewModel.SingleAction.ShowConfirmationDialog) {
            this.this$0.showConfirmationDialog((UserSocialsMobileItemViewModel.SingleAction.ShowConfirmationDialog) singleAction);
            return;
        }
        if (singleAction instanceof UserSocialsMobileItemViewModel.SingleAction.ShowErrorMessage) {
            this.this$0.showErrorMessage((UserSocialsMobileItemViewModel.SingleAction.ShowErrorMessage) singleAction);
        } else {
            if (!(singleAction instanceof UserSocialsMobileItemViewModel.SingleAction.ShowSuccessMessage)) {
                throw new o();
            }
            composerReferences = this.this$0.composerReferences;
            InterfaceC7851b.a.a(composerReferences.getController(), null, null, null, null, 15);
            this.this$0.showSuccessMessage((UserSocialsMobileItemViewModel.SingleAction.ShowSuccessMessage) singleAction);
        }
    }
}
