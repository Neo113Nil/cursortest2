package ru.ozon.app.android.session.auth.presentation.viewHolder;

import Bl.b;
import Ez.ViewOnClickListenerC2979c;
import FM.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.BaseActionHandler;
import ru.ozon.app.android.action.analytics.ActionUsageAnalyticsTracking;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitleCheckboxRadioHolderKt;
import ru.ozon.app.android.atoms.v3.holders.disclaimer.DisclaimerHolderKt;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.session.auth.data.AuthDTO;
import ru.ozon.app.android.session.auth.data.AuthVO;
import ru.ozon.app.android.session.auth.data.FieldAction;
import ru.ozon.app.android.session.auth.data.HintClickDTO;
import ru.ozon.app.android.session.auth.presentation.viewHolder.adapter.FieldsAdapter;
import ru.ozon.app.android.session.auth.presentation.views.SberIdButton;
import ru.ozon.app.android.session.databinding.WidgetAuthBinding;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCheckboxRadioView;
import ru.ozon.app.android.uikit.view.input.MobilizationTextInputLayout;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 L2\u00020\u0001:\u0001LB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\u0016J\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010\u0016J\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R0\u0010.\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\f\u0018\u00010,8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u00105\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u0001048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R0\u0010<\u001a\u0010\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\f\u0018\u00010,8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b<\u0010/\u001a\u0004\b=\u00101\"\u0004\b>\u00103R*\u0010?\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u0001048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b?\u00106\u001a\u0004\b@\u00108\"\u0004\bA\u0010:R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010BR\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR \u0010J\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\f0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010/R \u0010K\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020\f0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010/¨\u0006M"}, d2 = {"Lru/ozon/app/android/session/auth/presentation/viewHolder/AuthViewHolder;", "Lru/ozon/app/android/session/auth/presentation/viewHolder/AuthView;", "Landroid/view/View;", "containerView", "Landroidx/lifecycle/J;", "viewOwner", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Landroid/view/View;Landroidx/lifecycle/J;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/session/auth/data/AuthVO;", "item", "", "prepareSubmitButton", "(Lru/ozon/app/android/session/auth/data/AuthVO;)V", "prepareHintButtons", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Landroidx/appcompat/widget/AppCompatTextView;", "createButton", "(Ljava/lang/String;)Landroidx/appcompat/widget/AppCompatTextView;", "submit", "()V", "", "enable", "enableFields", "(Z)V", "silent", "bind", "(Lru/ozon/app/android/session/auth/data/AuthVO;Z)V", "message", "onError", "(Ljava/lang/String;)V", "onProgress", "onHideProgress", "onDestroyView", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Landroidx/lifecycle/J;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/session/databinding/WidgetAuthBinding;", "binding", "Lru/ozon/app/android/session/databinding/WidgetAuthBinding;", "Lkotlin/Function1;", "Lru/ozon/app/android/session/auth/data/FieldAction;", "onFieldAction", "Lkotlin/jvm/functions/Function1;", "getOnFieldAction", "()Lkotlin/jvm/functions/Function1;", "setOnFieldAction", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "onSubmitButtonClicked", "Lkotlin/jvm/functions/Function0;", "getOnSubmitButtonClicked", "()Lkotlin/jvm/functions/Function0;", "setOnSubmitButtonClicked", "(Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/session/auth/data/HintClickDTO;", "onHintClicked", "getOnHintClicked", "setOnHintClicked", "onSberAuthClicked", "getOnSberAuthClicked", "setOnSberAuthClicked", "Lru/ozon/app/android/session/auth/data/AuthVO;", "Lru/ozon/app/android/session/auth/presentation/viewHolder/adapter/FieldsAdapter;", "formAdapter", "Lru/ozon/app/android/session/auth/presentation/viewHolder/adapter/FieldsAdapter;", "", "verticalButtonPadding", "I", "Lru/ozon/uni/atoms/af/AtomAction;", "onAdvertisementAction", "actionHandler", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthViewHolder implements AuthView {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetAuthBinding binding;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final View containerView;

    @NotNull
    private FieldsAdapter formAdapter;
    private AuthVO item;

    @NotNull
    private final Function1<AtomAction, Unit> onAdvertisementAction;
    private Function1<? super FieldAction, Unit> onFieldAction;
    private Function1<? super HintClickDTO, Unit> onHintClicked;
    private Function0<Unit> onSberAuthClicked;
    private Function0<Unit> onSubmitButtonClicked;
    private final int verticalButtonPadding;

    @NotNull
    private final J viewOwner;
    public static final int $stable = 8;

    public AuthViewHolder(@NotNull View containerView, @NotNull J viewOwner, @NotNull ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewOwner, "viewOwner");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.containerView = containerView;
        this.viewOwner = viewOwner;
        this.composerReferences = composerReferences;
        WidgetAuthBinding bind = WidgetAuthBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.formAdapter = new FieldsAdapter(new AuthViewHolder$formAdapter$1(this));
        this.verticalButtonPadding = ResourceExtKt.toPx(6);
        this.onAdvertisementAction = new AuthViewHolder$onAdvertisementAction$1(this);
        this.actionHandler = BaseActionHandler.Builder.INSTANCE.invoke(composerReferences.getNavigator(), new ActionUsageAnalyticsTracking.ByComponentStorage(composerReferences.getComposerWidgetComponentStorage())).buildHandler();
        LoaderView loaderView = bind.progressBar;
        Context context = bind.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        loaderView.setColor(ThemeExtKt.themeColor(context, R$attr.bgActionPrimary));
        bind.formBlocksRv.setAdapter(this.formAdapter);
        bind.formBlocksRv.setItemAnimator(null);
        bind.submitBtn.setOnClickListener(new ViewOnClickListenerC2979c(this, 12));
        bind.sberBtn.setOnClickListener(new a(this, 15));
    }

    private final AppCompatTextView createButton(String title) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(this.containerView.getContext());
        appCompatTextView.setContentDescription(title);
        appCompatTextView.setText(title);
        appCompatTextView.setGravity(17);
        int i11 = this.verticalButtonPadding;
        appCompatTextView.setPadding(0, i11, 0, i11);
        appCompatTextView.setTextAppearance(R$style.TextStyle_Body_L_Blue);
        return appCompatTextView;
    }

    private final void enableFields(boolean enable) {
        int childCount = this.binding.authCl.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            this.binding.authCl.getChildAt(i11).setEnabled(enable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$2$lambda$1(AuthViewHolder authViewHolder, View view) {
        Function0<Unit> onSberAuthClicked = authViewHolder.getOnSberAuthClicked();
        if (onSberAuthClicked != null) {
            onSberAuthClicked.invoke();
        }
    }

    private final void prepareHintButtons(AuthVO item) {
        LinearLayout linearLayout = this.binding.hintButtonsContainerLl;
        linearLayout.removeAllViews();
        for (AuthDTO.HintButton hintButton : item.getHintButtons()) {
            AppCompatTextView createButton = createButton(hintButton.getTitle());
            createButton.setOnClickListener(new AW.a(6, this, hintButton));
            linearLayout.addView(createButton);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prepareHintButtons$lambda$11$lambda$10$lambda$9$lambda$8(AuthViewHolder authViewHolder, AuthDTO.HintButton hintButton, View view) {
        Function1<HintClickDTO, Unit> onHintClicked = authViewHolder.getOnHintClicked();
        if (onHintClicked != null) {
            onHintClicked.invoke(new HintClickDTO(hintButton.getAction(), hintButton.getDeeplink(), hintButton.getType(), hintButton.getData()));
        }
    }

    private final void prepareSubmitButton(AuthVO item) {
        String title;
        Button button = this.binding.submitBtn;
        AuthDTO.SubmitButton submitButton = item.getSubmitButton();
        if (submitButton == null || (title = submitButton.getTitle()) == null) {
            Intrinsics.f(button);
            ViewExtKt.gone(button);
        } else {
            button.setText(title);
            ViewExtKt.show(button);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submit() {
        ConstraintLayout authCl = this.binding.authCl;
        Intrinsics.checkNotNullExpressionValue(authCl, "authCl");
        for (View view : ViewGroupExtKt.children(authCl)) {
            if (view instanceof MobilizationTextInputLayout) {
                view.clearAnimation();
            }
        }
        Function0<Unit> onSubmitButtonClicked = getOnSubmitButtonClicked();
        if (onSubmitButtonClicked != null) {
            onSubmitButtonClicked.invoke();
        }
    }

    @Override // ru.ozon.app.android.session.auth.presentation.viewHolder.AuthView
    public void bind(@NotNull AuthVO item, boolean silent) {
        String title;
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        WidgetAuthBinding widgetAuthBinding = this.binding;
        widgetAuthBinding.titleTv.setText(item.getTitle());
        TextView subtitleTv = widgetAuthBinding.subtitleTv;
        Intrinsics.checkNotNullExpressionValue(subtitleTv, "subtitleTv");
        TextViewExtKt.setTextOrGone(subtitleTv, item.getSubtitle());
        this.formAdapter.submitList(item.getInputs(), silent);
        CellWithSubtitleCheckboxRadioView advertisementCheckboxRadioView = widgetAuthBinding.advertisementCheckboxRadioView;
        Intrinsics.checkNotNullExpressionValue(advertisementCheckboxRadioView, "advertisementCheckboxRadioView");
        AuthVO.Advertisement advertisement = item.getAdvertisement();
        CellWithSubtitleCheckboxRadioHolderKt.bindOrGone(advertisementCheckboxRadioView, advertisement != null ? advertisement.getAtom() : null, this.onAdvertisementAction);
        widgetAuthBinding.advertisementCheckboxRadioView.resetTitleMaxLines();
        prepareSubmitButton(item);
        prepareHintButtons(item);
        LinearLayout divider = widgetAuthBinding.divider;
        Intrinsics.checkNotNullExpressionValue(divider, "divider");
        ViewExtKt.showOrGone(divider, Boolean.valueOf(item.getLoginBySberIdButton() != null));
        AuthVO.SberButtonVO loginBySberIdButton = item.getLoginBySberIdButton();
        if (loginBySberIdButton == null || (title = loginBySberIdButton.getTitle()) == null) {
            SberIdButton sberBtn = widgetAuthBinding.sberBtn;
            Intrinsics.checkNotNullExpressionValue(sberBtn, "sberBtn");
            ViewExtKt.gone(sberBtn);
        } else {
            SberIdButton sberBtn2 = widgetAuthBinding.sberBtn;
            Intrinsics.checkNotNullExpressionValue(sberBtn2, "sberBtn");
            ViewExtKt.show(sberBtn2);
            widgetAuthBinding.sberBtn.setText(title);
        }
        DisclaimerContainer annotation = widgetAuthBinding.annotation;
        Intrinsics.checkNotNullExpressionValue(annotation, "annotation");
        DisclaimerHolderKt.bindOrGone(annotation, item.getAnnotation(), this.actionHandler);
        TextAtomView termsOfUseText = widgetAuthBinding.termsOfUseText;
        Intrinsics.checkNotNullExpressionValue(termsOfUseText, "termsOfUseText");
        TextAtomHolderKt.bindOrGone(termsOfUseText, item.getTermsOfUseText(), this.actionHandler);
    }

    public Function1<FieldAction, Unit> getOnFieldAction() {
        return this.onFieldAction;
    }

    public Function1<HintClickDTO, Unit> getOnHintClicked() {
        return this.onHintClicked;
    }

    public Function0<Unit> getOnSberAuthClicked() {
        return this.onSberAuthClicked;
    }

    public Function0<Unit> getOnSubmitButtonClicked() {
        return this.onSubmitButtonClicked;
    }

    @Override // ru.ozon.app.android.session.auth.presentation.viewHolder.AuthView
    public void onDestroyView() {
        KeyboardUtilsKt.hideKeyboard(this.containerView);
        this.binding.formBlocksRv.setAdapter(null);
    }

    @Override // ru.ozon.app.android.session.auth.presentation.viewHolder.AuthView
    public void onError(String message) {
        OzonSpannableString ozonSpannableString;
        ViewGroup b11 = b.b(this.composerReferences);
        if (b11 != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            int i11 = R$drawable.ic_warning;
            if (message == null || (ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(message)) == null) {
                ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.common_universal_network_error));
            }
            FlashbarFactory.create$default(flashbarFactory, b11, null, ozonSpannableString, null, null, Integer.valueOf(i11), null, null, null, null, null, null, null, 3000L, null, null, this.viewOwner, 57306, null).show();
        }
    }

    @Override // ru.ozon.app.android.session.auth.presentation.viewHolder.AuthView
    public void onHideProgress() {
        enableFields(true);
        FrameLayout authProgressBar = this.binding.authProgressBar;
        Intrinsics.checkNotNullExpressionValue(authProgressBar, "authProgressBar");
        ViewExtKt.gone(authProgressBar);
    }

    @Override // ru.ozon.app.android.session.auth.presentation.viewHolder.AuthView
    public void onProgress() {
        FrameLayout authProgressBar = this.binding.authProgressBar;
        Intrinsics.checkNotNullExpressionValue(authProgressBar, "authProgressBar");
        ViewExtKt.show(authProgressBar);
        enableFields(false);
    }

    @Override // ru.ozon.app.android.session.auth.presentation.viewHolder.AuthView
    public void setOnFieldAction(Function1<? super FieldAction, Unit> function1) {
        this.onFieldAction = function1;
    }

    @Override // ru.ozon.app.android.session.auth.presentation.viewHolder.AuthView
    public void setOnHintClicked(Function1<? super HintClickDTO, Unit> function1) {
        this.onHintClicked = function1;
    }

    @Override // ru.ozon.app.android.session.auth.presentation.viewHolder.AuthView
    public void setOnSberAuthClicked(Function0<Unit> function0) {
        this.onSberAuthClicked = function0;
    }

    @Override // ru.ozon.app.android.session.auth.presentation.viewHolder.AuthView
    public void setOnSubmitButtonClicked(Function0<Unit> function0) {
        this.onSubmitButtonClicked = function0;
    }
}
