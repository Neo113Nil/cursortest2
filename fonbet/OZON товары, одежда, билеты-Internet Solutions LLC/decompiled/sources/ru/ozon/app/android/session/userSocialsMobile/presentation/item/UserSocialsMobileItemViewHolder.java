package ru.ozon.app.android.session.userSocialsMobile.presentation.item;

import MJ.b;
import Tl.a;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.f;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.fragment.app.r;
import androidx.lifecycle.P;
import androidx.lifecycle.T;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.session.R$id;
import ru.ozon.app.android.session.R$string;
import ru.ozon.app.android.session.databinding.WidgetUserSocialsMobileItemBinding;
import ru.ozon.app.android.session.userSocialsMobile.presentation.item.UserSocialsMobileItemVO;
import ru.ozon.app.android.session.userSocialsMobile.presentation.item.UserSocialsMobileItemViewHolder;
import ru.ozon.app.android.session.userSocialsMobile.presentation.item.UserSocialsMobileItemViewModel;
import ru.ozon.app.android.ui.screenstate.ScreenStateExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.avatar.AvatarView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.avatar.AvatarHolderKt;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010 \u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0014¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\r038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, d2 = {"Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel;", "viewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel;)V", "item", "", "bindButton", "(Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO;)V", "bindDescription", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$SingleAction$ShowConfirmationDialog;", "action", "showConfirmationDialog", "(Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$SingleAction$ShowConfirmationDialog;)V", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$SingleAction$ShowSuccessMessage;", "showSuccessMessage", "(Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$SingleAction$ShowSuccessMessage;)V", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$SingleAction$ShowErrorMessage;", "showErrorMessage", "(Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel$SingleAction$ShowErrorMessage;)V", "onAttach", "()V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO;Ll20/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewModel;", "Lru/ozon/app/android/session/databinding/WidgetUserSocialsMobileItemBinding;", "binding", "Lru/ozon/app/android/session/databinding/WidgetUserSocialsMobileItemBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "voId", "J", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO$UnbindButtonVO$ConfirmationDataVO;", "confirmationData", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemVO$UnbindButtonVO$ConfirmationDataVO;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserSocialsMobileItemViewHolder extends k<UserSocialsMobileItemVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetUserSocialsMobileItemBinding binding;

    @NotNull
    private final ComposerReferences composerReferences;
    private UserSocialsMobileItemVO.UnbindButtonVO.ConfirmationDataVO confirmationData;

    @NotNull
    private final View containerView;

    @NotNull
    private final UserSocialsMobileItemViewModel viewModel;
    private long voId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSocialsMobileItemViewHolder(@NotNull View containerView, @NotNull ComposerReferences composerReferences, @NotNull UserSocialsMobileItemViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.containerView = containerView;
        this.composerReferences = composerReferences;
        this.viewModel = viewModel;
        WidgetUserSocialsMobileItemBinding bind = WidgetUserSocialsMobileItemBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).onClick(new UserSocialsMobileItemViewHolder$actionHandler$1(this)).buildHandler();
    }

    private final void bindButton(UserSocialsMobileItemVO item) {
        UserSocialsMobileItemVO.UnbindButtonVO.ConfirmationDataVO confirmationData;
        LargeBorderlessButtonView unbindButtonView = this.binding.unbindButtonView;
        Intrinsics.checkNotNullExpressionValue(unbindButtonView, "unbindButtonView");
        UserSocialsMobileItemVO.UnbindButtonVO unbindButton = item.getUnbindButton();
        LargeBorderlessButtonHolderKt.bindOrGone(unbindButtonView, unbindButton != null ? unbindButton.getButton() : null, this.actionHandler);
        UserSocialsMobileItemVO.UnbindButtonVO unbindButton2 = item.getUnbindButton();
        if (unbindButton2 == null || (confirmationData = unbindButton2.getConfirmationData()) == null) {
            return;
        }
        this.confirmationData = confirmationData;
    }

    private final void bindDescription(UserSocialsMobileItemVO item) {
        TextAtom description = item.getDescription();
        WidgetUserSocialsMobileItemBinding widgetUserSocialsMobileItemBinding = this.binding;
        if (description == null) {
            TextAtomView descriptionTav = widgetUserSocialsMobileItemBinding.descriptionTav;
            Intrinsics.checkNotNullExpressionValue(descriptionTav, "descriptionTav");
            ViewExtKt.gone(descriptionTav);
            ConstraintLayout constraintLayout = widgetUserSocialsMobileItemBinding.rootCl;
            d d11 = a.d(constraintLayout, "rootCl", constraintLayout);
            d11.s(R$id.titleTav, 4, 0, 4);
            d11.s(R$id.titleTav, 3, 0, 3);
            d11.f(constraintLayout);
            return;
        }
        TextAtomView descriptionTav2 = widgetUserSocialsMobileItemBinding.descriptionTav;
        Intrinsics.checkNotNullExpressionValue(descriptionTav2, "descriptionTav");
        TextAtomHolderKt.bind$default(descriptionTav2, description, null, 2, null);
        TextAtomView descriptionTav3 = widgetUserSocialsMobileItemBinding.descriptionTav;
        Intrinsics.checkNotNullExpressionValue(descriptionTav3, "descriptionTav");
        ViewExtKt.show(descriptionTav3);
        ConstraintLayout constraintLayout2 = widgetUserSocialsMobileItemBinding.rootCl;
        d d12 = a.d(constraintLayout2, "rootCl", constraintLayout2);
        d12.s(R$id.titleTav, 4, R$id.horizontalGuideline, 3);
        d12.o(R$id.titleTav, 3);
        d12.f(constraintLayout2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showConfirmationDialog(final UserSocialsMobileItemViewModel.SingleAction.ShowConfirmationDialog action) {
        f.a aVar = new f.a(getContext());
        UserSocialsMobileItemVO.UnbindButtonVO.ConfirmationDataVO confirmationDataVO = this.confirmationData;
        if (confirmationDataVO == null) {
            Intrinsics.n("confirmationData");
            throw null;
        }
        f.a title = aVar.setTitle(confirmationDataVO.getTitle());
        UserSocialsMobileItemVO.UnbindButtonVO.ConfirmationDataVO confirmationDataVO2 = this.confirmationData;
        if (confirmationDataVO2 != null) {
            title.f(confirmationDataVO2.getSubtitle()).setPositiveButton(R$string.user_socials_mobile_unbind_android, new DialogInterface.OnClickListener() { // from class: MJ.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    UserSocialsMobileItemViewHolder.showConfirmationDialog$lambda$6(UserSocialsMobileItemViewHolder.this, action, dialogInterface, i11);
                }
            }).setNegativeButton(ru.ozon.app.android.uikit.R$string.common_button_cancel, new b()).q();
        } else {
            Intrinsics.n("confirmationData");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showConfirmationDialog$lambda$6(UserSocialsMobileItemViewHolder userSocialsMobileItemViewHolder, UserSocialsMobileItemViewModel.SingleAction.ShowConfirmationDialog showConfirmationDialog, DialogInterface dialogInterface, int i11) {
        userSocialsMobileItemViewHolder.viewModel.onUnbindDialogButtonClicked(showConfirmationDialog.getVoId(), showConfirmationDialog.getUnbindRequestBody(), showConfirmationDialog.getLink());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorMessage(UserSocialsMobileItemViewModel.SingleAction.ShowErrorMessage action) {
        r i11 = this.composerReferences.getContainer().i();
        ViewGroup rootView = ContextExtKt.getRootView(i11);
        if (rootView != null) {
            FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, ScreenStateExtKt.toMessage(action.getThrowable(), i11), null, null, null, i11, 58, null).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSuccessMessage(UserSocialsMobileItemViewModel.SingleAction.ShowSuccessMessage action) {
        r i11 = this.composerReferences.getContainer().i();
        ViewGroup rootView = ContextExtKt.getRootView(i11);
        if (rootView != null) {
            FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(action.getMessage()), null, null, null, null, null, null, null, null, null, null, 3000L, null, null, i11, 57338, null).show();
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSocialsMobileItemViewHolder)) {
            return false;
        }
        UserSocialsMobileItemViewHolder userSocialsMobileItemViewHolder = (UserSocialsMobileItemViewHolder) other;
        return Intrinsics.d(this.containerView, userSocialsMobileItemViewHolder.containerView) && Intrinsics.d(this.composerReferences, userSocialsMobileItemViewHolder.composerReferences) && Intrinsics.d(this.viewModel, userSocialsMobileItemViewHolder.viewModel);
    }

    public int hashCode() {
        return this.viewModel.hashCode() + ((this.composerReferences.hashCode() + (this.containerView.hashCode() * 31)) * 31);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        P<UserSocialsMobileItemViewModel.Action> action = this.viewModel.getAction();
        T t2 = new T();
        t2.a(action, new UserSocialsMobileItemViewHolder$inlined$sam$i$androidx_lifecycle_Observer$0(new UserSocialsMobileItemViewHolder$onAttach$$inlined$filter$1(t2, this)));
        t2.observe(this, new UserSocialsMobileItemViewHolder$sam$androidx_lifecycle_Observer$0(new UserSocialsMobileItemViewHolder$onAttach$2(this)));
        P<UserSocialsMobileItemViewModel.SingleAction> singleAction = this.viewModel.getSingleAction();
        T t11 = new T();
        t11.a(singleAction, new UserSocialsMobileItemViewHolder$inlined$sam$i$androidx_lifecycle_Observer$0(new UserSocialsMobileItemViewHolder$onAttach$$inlined$filter$2(t11, this)));
        t11.observe(this, new UserSocialsMobileItemViewHolder$sam$androidx_lifecycle_Observer$0(new UserSocialsMobileItemViewHolder$onAttach$4(this)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.C
    @NotNull
    public String toString() {
        return "UserSocialsMobileItemViewHolder(containerView=" + this.containerView + ", composerReferences=" + this.composerReferences + ", viewModel=" + this.viewModel + ")";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull UserSocialsMobileItemVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.voId = item.getId();
        TextAtomView titleTav = this.binding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        TextAtomHolderKt.bind$default(titleTav, item.getTitle(), null, 2, null);
        AvatarView avatarView = this.binding.avatarView;
        Intrinsics.checkNotNullExpressionValue(avatarView, "avatarView");
        AvatarHolderKt.bind$default(avatarView, item.getLogo(), null, 2, null);
        bindButton(item);
        bindDescription(item);
    }
}
