package ru.ozon.app.android.account.orders.recipientWidget.presentation;

import Sc.o;
import a00.C4911f;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.r;
import androidx.lifecycle.W;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.recipientWidget.presentation.RecipientViewHolder;
import ru.ozon.app.android.account.orders.recipientWidget.presentation.RecipientViewModel;
import ru.ozon.app.android.account.orders.recipientWidget.presentation.update.ChangeRecipientPayload$SaveButton;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.cs_orders.databinding.WidgetRecipientBinding;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.app.android.uikit.text.OzonPhoneNumberFormattingTextWatcher;
import ru.ozon.app.android.uikit.view.input.MobilizationTextInputLayout;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.main.Flashbar;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00019B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ)\u0010!\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b(\u0010)J'\u0010(\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b(\u0010,R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010-R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010/R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u0010%\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00104R \u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u000f058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, d2 = {"Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientVO;", "Lru/ozon/app/android/cs_orders/databinding/WidgetRecipientBinding;", "binding", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientViewModel;", "viewModel", "Landroidx/fragment/app/r;", "activity", "Lru/ozon/app/android/composer/ComposerReferences;", "composerRefs", "<init>", "(Lru/ozon/app/android/cs_orders/databinding/WidgetRecipientBinding;Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientViewModel;Landroidx/fragment/app/r;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "saveButton", "", "bindButton", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "text", "", "icon", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "showSuccessMessage", "(Ljava/lang/String;ILa00/f;)V", "showErrorMessage", "Lru/ozon/app/android/uikit/view/input/MobilizationTextInputLayout;", "inputLayout", "Landroid/widget/TextView;", "textView", "errorMessage", "showErrorForTil", "(Lru/ozon/app/android/uikit/view/input/MobilizationTextInputLayout;Landroid/widget/TextView;Ljava/lang/String;)V", "onAttach", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientVO;Ll20/d;Ljava/lang/Object;)V", "Lru/ozon/app/android/cs_orders/databinding/WidgetRecipientBinding;", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientViewModel;", "Landroidx/fragment/app/r;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/uni/android/flashbar/main/Flashbar;", DeleteAccountApiResponse.Error.TYPE_RESTRICTION, "Lru/ozon/uni/android/flashbar/main/Flashbar;", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientVO;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RecipientViewHolder extends k<RecipientVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private final r activity;

    @NotNull
    private final WidgetRecipientBinding binding;

    @NotNull
    private final ComposerReferences composerRefs;
    private RecipientVO item;
    private Flashbar restriction;

    @NotNull
    private final RecipientViewModel viewModel;
    public static final int $stable = 8;
    private static final int RESTRICTION_ERROR_ICON = R$drawable.ic_m_exclamation_filled;
    private static final int RESTRICTION_SUCCESS_ICON = ru.ozon.app.android.uikit.R$drawable.ic_check_green;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RecipientViewHolder(@NotNull WidgetRecipientBinding binding, @NotNull RecipientViewModel viewModel, r rVar, @NotNull ComposerReferences composerRefs) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(composerRefs, "composerRefs");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.viewModel = viewModel;
        this.activity = rVar;
        this.composerRefs = composerRefs;
        this.actionHandler = new ActionHandler.Builder(composerRefs, this).onClick(new RecipientViewHolder$actionHandler$1(this)).buildHandler();
        AppCompatEditText nameEt = binding.nameEt;
        Intrinsics.checkNotNullExpressionValue(nameEt, "nameEt");
        nameEt.addTextChangedListener(new TextWatcher() { // from class: ru.ozon.app.android.account.orders.recipientWidget.presentation.RecipientViewHolder$_init_$lambda$2$$inlined$doOnTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
                RecipientViewModel recipientViewModel;
                recipientViewModel = RecipientViewHolder.this.viewModel;
                recipientViewModel.nameIsChanged(String.valueOf(text));
            }
        });
        AppCompatEditText phoneEt = binding.phoneEt;
        Intrinsics.checkNotNullExpressionValue(phoneEt, "phoneEt");
        phoneEt.addTextChangedListener(new TextWatcher() { // from class: ru.ozon.app.android.account.orders.recipientWidget.presentation.RecipientViewHolder$_init_$lambda$2$$inlined$doOnTextChanged$2
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
                RecipientViewModel recipientViewModel;
                recipientViewModel = RecipientViewHolder.this.viewModel;
                recipientViewModel.phoneIsChanged(String.valueOf(text));
            }
        });
    }

    private final void bindButton(ButtonV3DTO saveButton) {
        ButtonV3View buttonV3View = this.binding.saveBa;
        Intrinsics.f(buttonV3View);
        ButtonV3HolderKt.bind(buttonV3View, saveButton, this.actionHandler);
        buttonV3View.setEnabled(!(saveButton.isDisabled() != null ? r3.booleanValue() : false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttach$lambda$5(RecipientViewHolder recipientViewHolder, RecipientViewModel.ChangeRecipientResult changeRecipientResult) {
        if (changeRecipientResult instanceof RecipientViewModel.ChangeRecipientResult.Success) {
            String message = ((RecipientViewModel.ChangeRecipientResult.Success) changeRecipientResult).getMessage();
            if (message != null) {
                recipientViewHolder.showSuccessMessage(message, RESTRICTION_SUCCESS_ICON, recipientViewHolder.composerRefs.getContainer());
                return;
            }
            return;
        }
        if (!(changeRecipientResult instanceof RecipientViewModel.ChangeRecipientResult.Error)) {
            throw new o();
        }
        String toastMessage = ((RecipientViewModel.ChangeRecipientResult.Error) changeRecipientResult).getToastMessage();
        if (toastMessage != null) {
            recipientViewHolder.showErrorMessage(toastMessage, RESTRICTION_ERROR_ICON, recipientViewHolder.composerRefs.getContainer());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorForTil(MobilizationTextInputLayout inputLayout, TextView textView, String errorMessage) {
        boolean z11 = true ^ (errorMessage == null || errorMessage.length() == 0);
        inputLayout.setShowError(z11);
        ViewExtKt.showOrGone(textView, Boolean.valueOf(z11));
        textView.setText(errorMessage);
    }

    private final void showErrorMessage(String text, int icon, C4911f container) {
        Flashbar flashbar = this.restriction;
        if (flashbar != null) {
            flashbar.dismiss();
        }
        ViewGroup rootView = ContextExtKt.getRootView(container.c());
        if (rootView != null) {
            Flashbar create$default = FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(text), null, null, Integer.valueOf(icon), null, UniColors.GRAPHIC_WARNING_PRIMARY.getToken(), null, null, null, null, null, 3000L, null, null, container.g(), 57178, null);
            this.restriction = create$default;
            create$default.show();
        }
    }

    private final void showSuccessMessage(String text, int icon, C4911f container) {
        Flashbar flashbar = this.restriction;
        if (flashbar != null) {
            flashbar.dismiss();
        }
        ViewGroup rootView = ContextExtKt.getRootView(this.activity);
        if (rootView != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            ViewGroup rootView2 = ContextExtKt.getRootView(container.a());
            if (rootView2 == null) {
                rootView2 = rootView;
            }
            Flashbar create$default = FlashbarFactory.create$default(flashbarFactory, rootView2, null, OzonSpannableStringKt.toOzonSpannableString(text), null, null, Integer.valueOf(icon), null, UniColors.GRAPHIC_POSITIVE_PRIMARY.getToken(), null, null, null, null, null, 3000L, null, null, container.g(), 57178, null);
            this.restriction = create$default;
            create$default.show();
        }
        this.composerRefs.getNavigator().popBackStack();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.viewModel.getChangeRecipientResult().observe(this, new W() { // from class: el.a
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                RecipientViewHolder.onAttach$lambda$5(RecipientViewHolder.this, (RecipientViewModel.ChangeRecipientResult) obj);
            }
        });
        this.viewModel.getLoader().observe(this, new RecipientViewHolder$sam$androidx_lifecycle_Observer$0(new RecipientViewHolder$onAttach$2(this)));
        this.viewModel.isSaveButtonEnabled().observe(this, new RecipientViewHolder$sam$androidx_lifecycle_Observer$0(new RecipientViewHolder$onAttach$3(this)));
        this.viewModel.getErrorForName().observe(this, new RecipientViewHolder$sam$androidx_lifecycle_Observer$0(new RecipientViewHolder$onAttach$4(this)));
        this.viewModel.getErrorForPhone().observe(this, new RecipientViewHolder$sam$androidx_lifecycle_Observer$0(new RecipientViewHolder$onAttach$5(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull RecipientVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        WidgetRecipientBinding widgetRecipientBinding = this.binding;
        String hint = item.getNameInput().getHint();
        if (hint != null) {
            MobilizationTextInputLayout nameTil = widgetRecipientBinding.nameTil;
            Intrinsics.checkNotNullExpressionValue(nameTil, "nameTil");
            ViewExtKt.show(nameTil);
            widgetRecipientBinding.nameEt.setHint(hint);
            widgetRecipientBinding.nameEt.setText(item.getNameInput().getText());
        } else {
            MobilizationTextInputLayout nameTil2 = widgetRecipientBinding.nameTil;
            Intrinsics.checkNotNullExpressionValue(nameTil2, "nameTil");
            ViewExtKt.gone(nameTil2);
        }
        String hint2 = item.getPhoneInput().getHint();
        char c11 = 1;
        boolean z11 = false;
        if (hint2 != null) {
            MobilizationTextInputLayout phoneTil = widgetRecipientBinding.phoneTil;
            Intrinsics.checkNotNullExpressionValue(phoneTil, "phoneTil");
            ViewExtKt.show(phoneTil);
            widgetRecipientBinding.phoneEt.setHint(hint2);
            widgetRecipientBinding.phoneEt.setText(item.getPhoneInput().getText());
            widgetRecipientBinding.phoneEt.addTextChangedListener(new OzonPhoneNumberFormattingTextWatcher(z11, c11 == true ? 1 : 0, null));
        } else {
            MobilizationTextInputLayout phoneTil2 = widgetRecipientBinding.phoneTil;
            Intrinsics.checkNotNullExpressionValue(phoneTil2, "phoneTil");
            ViewExtKt.gone(phoneTil2);
        }
        this.viewModel.setNameInputValidationEnabled(item.getNameInput().getHint() != null);
        bindButton(item.getSaveButton());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull RecipientVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload instanceof ChangeRecipientPayload$SaveButton) {
            bindButton(((ChangeRecipientPayload$SaveButton) payload).getSaveButton());
        } else {
            bind(item, info);
        }
    }
}
