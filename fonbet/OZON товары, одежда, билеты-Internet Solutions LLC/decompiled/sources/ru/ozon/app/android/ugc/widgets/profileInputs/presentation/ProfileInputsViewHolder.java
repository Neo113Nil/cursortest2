package ru.ozon.app.android.ugc.widgets.profileInputs.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import B90.C2603e;
import B90.e0;
import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.ugc.databinding.WidgetProfileInputsBinding;
import ru.ozon.app.android.ugc.widgets.profileInputs.data.ProfileInputsDTO;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.cell.text.TextFieldCellApi;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.cell.text.data.TextFieldPresets;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationBarKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonSettings;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000«\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001E\b\u0001\u0018\u0000 O2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001OB3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u0013*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u00020\u0013*\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u00020\u0013*\u00020\u00162\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010$\u001a\u00020\u0013*\u00020\u00162\u0006\u0010#\u001a\u00020\u001bH\u0002¢\u0006\u0004\b$\u0010\u001eJ\u001b\u0010%\u001a\u00020\u0013*\u00020\u00162\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b%\u0010\"J\u0019\u0010(\u001a\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00132\u0006\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b,\u0010-J#\u00102\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u00022\n\u00101\u001a\u00060/j\u0002`0H\u0014¢\u0006\u0004\b2\u00103J)\u00108\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u00022\u0006\u00105\u001a\u0002042\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0013H\u0016¢\u0006\u0004\b:\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR \u0010L\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u00130J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR \u0010N\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u00130J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010M¨\u0006P"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileInputs/presentation/ProfileInputsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/profileInputs/presentation/ProfileInputsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/ugc/widgets/profileInputs/presentation/ProfileInputsViewModel;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/ugc/widgets/profileInputs/presentation/ProfileInputsViewModel;LWZ/l;)V", "Landroidx/core/view/D;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setOnApplyWindowInsetsListenerToRootView", "(Landroidx/core/view/D;)V", "Lru/ozon/uni/android/cell/text/TextFieldCellView;", "Lru/ozon/app/android/ugc/widgets/profileInputs/data/ProfileInputsDTO$InputField;", "input", "bindInput", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;Lru/ozon/app/android/ugc/widgets/profileInputs/data/ProfileInputsDTO$InputField;)V", "", "errorText", "showError", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;Ljava/lang/String;)V", "", "forceFocus", "showBottomLabelOrGone", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;Z)V", "bottomValue", "showBottomLabel", "hideBottomLabel", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/ugc/widgets/profileInputs/presentation/ProfileInputsVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/ugc/widgets/profileInputs/presentation/ProfileInputsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onDetach", "()V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/widgets/profileInputs/presentation/ProfileInputsViewModel;", "LWZ/l;", "Lru/ozon/app/android/ugc/databinding/WidgetProfileInputsBinding;", "binding", "Lru/ozon/app/android/ugc/databinding/WidgetProfileInputsBinding;", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "ru/ozon/app/android/ugc/widgets/profileInputs/presentation/ProfileInputsViewHolder$inputTextWatcher$1", "inputTextWatcher", "Lru/ozon/app/android/ugc/widgets/profileInputs/presentation/ProfileInputsViewHolder$inputTextWatcher$1;", "keyboardInsetsListener", "Landroidx/core/view/D;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandlerSubmit", "Lkotlin/jvm/functions/Function1;", "actionHandlerDismiss", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProfileInputsViewHolder extends k<ProfileInputsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandlerDismiss;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandlerSubmit;

    @NotNull
    private final WidgetProfileInputsBinding binding;

    @NotNull
    private final ProfileInputsViewHolder$inputTextWatcher$1 inputTextWatcher;

    @NotNull
    private final D keyboardInsetsListener;

    @NotNull
    private final Handler mHandler;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final ProfileInputsViewModel viewModel;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [ru.ozon.app.android.ugc.widgets.profileInputs.presentation.ProfileInputsViewHolder$inputTextWatcher$1, ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher] */
    public ProfileInputsViewHolder(@NotNull View containerView, @NotNull HandlersInhibitor inhibitor, @NotNull ComposerReferences refs, @NotNull ProfileInputsViewModel viewModel, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.refs = refs;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetProfileInputsBinding bind = WidgetProfileInputsBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.mHandler = new Handler(Looper.getMainLooper());
        ?? r52 = new OzonTextWatcher() { // from class: ru.ozon.app.android.ugc.widgets.profileInputs.presentation.ProfileInputsViewHolder$inputTextWatcher$1
            @Override // ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable text) {
                ProfileInputsDTO.InputField inputField;
                ProfileInputsViewModel profileInputsViewModel;
                ProfileInputsVO boundData = ProfileInputsViewHolder.this.getBoundData();
                if (boundData == null || (inputField = boundData.getInputField()) == null) {
                    return;
                }
                profileInputsViewModel = ProfileInputsViewHolder.this.viewModel;
                profileInputsViewModel.checkInputLocally(String.valueOf(text), inputField);
            }
        };
        this.inputTextWatcher = r52;
        C2603e c2603e = new C2603e(this);
        this.keyboardInsetsListener = c2603e;
        this.actionHandlerSubmit = new ActionHandler.Builder(refs, this).enableClickThrottling(inhibitor).onClick(new ProfileInputsViewHolder$actionHandlerSubmit$1(this)).buildHandler();
        this.actionHandlerDismiss = new ActionHandler.Builder(refs, this).buildHandler();
        setOnApplyWindowInsetsListenerToRootView(c2603e);
        bind.profileInputView.getMainView().setTextWatcher(r52);
    }

    private final void bindInput(TextFieldCellView textFieldCellView, ProfileInputsDTO.InputField inputField) {
        String value = inputField.getValue();
        if (value == null) {
            value = "";
        }
        textFieldCellView.setInputText(value);
        textFieldCellView.setPreset(TextFieldPresets.INSTANCE.getDefault600End());
        OzonTextInput inputView = textFieldCellView.getMainView().getInputViewGroup().getInputView();
        InputFilter[] filters = inputView.getFilters();
        Intrinsics.checkNotNullExpressionValue(filters, "getFilters(...)");
        inputView.setFilters((InputFilter[]) C7705l.U(filters, new InputFilter.LengthFilter(inputField.getMaxCount())));
        showBottomLabelOrGone(textFieldCellView, false);
    }

    private final void hideBottomLabel(TextFieldCellView textFieldCellView, boolean z11) {
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.NEUTRAL);
        textFieldCellView.getAddonView().setContentDescription("");
        if (textFieldCellView.getMainAddonSettings().getGap() != 0) {
            textFieldCellView.setMainAddonSettings(MainAddonSettings.copy$default(textFieldCellView.getMainAddonSettings(), null, null, null, null, null, 0, 0, null, null, null, 991, null));
        }
        ViewExtKt.gone(textFieldCellView.getAddonView());
        if (z11) {
            this.mHandler.post(new e0(textFieldCellView, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideBottomLabel$lambda$4(TextFieldCellView textFieldCellView) {
        textFieldCellView.getMainView().getInputViewGroup().getInputView().requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 keyboardInsetsListener$lambda$1(ProfileInputsViewHolder profileInputsViewHolder, View view, C5353y0 insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        boolean p11 = insets.p(8);
        TextFieldCellView textFieldCellView = profileInputsViewHolder.binding.profileInputView;
        if (p11) {
            textFieldCellView.getMainView().requestFocus();
        } else {
            textFieldCellView.clearFocus();
        }
        return Y.u(view, insets);
    }

    private final void setOnApplyWindowInsetsListenerToRootView(D listener) {
        ViewGroup rootView;
        r a11 = this.refs.getContainer().a();
        if (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null) {
            return;
        }
        Y.J(rootView, listener);
    }

    private final void showBottomLabel(TextFieldCellView textFieldCellView, String str) {
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.NEUTRAL);
        Context context = textFieldCellView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextFieldCellApi.DefaultImpls.setLabelColor$default(textFieldCellView, ResourceExtKt.color(context, UniColors.TEXT_SECONDARY.getResId()), 0.0f, 2, null);
        textFieldCellView.getAddonView().setContentDescription("inputBottomLabel");
        textFieldCellView.setLabelText(str + ((Object) this.binding.profileInputView.getInputText()));
        ViewExtKt.show(textFieldCellView.getAddonView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showBottomLabelOrGone(TextFieldCellView textFieldCellView, boolean z11) {
        ProfileInputsDTO.InputField inputField;
        ProfileInputsVO boundData = getBoundData();
        String bottomValue = (boundData == null || (inputField = boundData.getInputField()) == null) ? null : inputField.getBottomValue();
        if (bottomValue == null) {
            hideBottomLabel(textFieldCellView, z11);
        } else {
            showBottomLabel(textFieldCellView, bottomValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(TextFieldCellView textFieldCellView, String str) {
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.ERROR);
        Context context = textFieldCellView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextFieldCellApi.DefaultImpls.setLabelColor$default(textFieldCellView, ResourceExtKt.color(context, UniColors.TEXT_NEGATIVE.getResId()), 0.0f, 2, null);
        textFieldCellView.getAddonView().setContentDescription("inputErrorLabel");
        textFieldCellView.setLabelText(str);
        ViewExtKt.show(textFieldCellView.getAddonView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(NotificationDTO notification) {
        if (notification == null) {
            ProfileInputsVO boundData = getBoundData();
            notification = boundData != null ? boundData.getDefaultNotification() : null;
            if (notification == null) {
                return;
            }
        }
        NotificationDTO notificationDTO = notification;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        View view = c11 != null ? c11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        View composerNotificationBottomAnchor = ComposerViewExtensionKt.composerNotificationBottomAnchor(viewGroup, NotificationBarKt.isAboveBottomWidgets(notificationDTO));
        NotificationLayoutManager asNotificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager(viewGroup, composerNotificationBottomAnchor != null ? Integer.valueOf(composerNotificationBottomAnchor.getId()) : null);
        if (asNotificationLayoutManager == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager, notificationDTO, this.refs.getContainer().g(), null, 8, null).show();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        C2399j.C(new C2408n0(C5427n.a(this.viewModel.observeResultFlow(), lifecycle.getLifecycle(), AbstractC5434v.b.STARTED), new ProfileInputsViewHolder$onAttachViewModel$1(this, null)), K.a(lifecycle));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        setOnApplyWindowInsetsListenerToRootView(null);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ProfileInputsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetProfileInputsBinding widgetProfileInputsBinding = this.binding;
        TextFieldCellView profileInputView = widgetProfileInputsBinding.profileInputView;
        Intrinsics.checkNotNullExpressionValue(profileInputView, "profileInputView");
        bindInput(profileInputView, item.getInputField());
        ButtonV3View profileInputSubmitButton = widgetProfileInputsBinding.profileInputSubmitButton;
        Intrinsics.checkNotNullExpressionValue(profileInputSubmitButton, "profileInputSubmitButton");
        ButtonV3HolderKt.bind(profileInputSubmitButton, item.getSubmitButton(), this.actionHandlerSubmit);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull ProfileInputsVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
