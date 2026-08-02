package ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import U7.d;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.disclaimer.DisclaimerHolderKt;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.fresh.feature.b2b.R$string;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetAddEdoV2FormBinding;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.KeyboardUtils;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.text.TextFieldCellApi;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.cell.text.data.TextFieldPresets;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonSettings;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001(\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\r*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\r*\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\r0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoFormViewHolderV2;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoFormVOV2;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAddEdoV2FormBinding;", "binding", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAddEdoV2FormBinding;Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "errorMessage", "", "showErrorMessage", "(Ljava/lang/String;)V", "deeplink", "openNestedPage", "successGoBackRefresh", "()V", "Lru/ozon/uni/android/cell/text/TextFieldCellView;", "showError", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;)V", "hideError", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoFormVOV2;Ll20/d;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetAddEdoV2FormBinding;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "ru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoFormViewHolderV2$edoTextWatcher$1", "edoTextWatcher", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoFormViewHolderV2$edoTextWatcher$1;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddEdoFormViewHolderV2 extends k<AddEdoFormVOV2> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetAddEdoV2FormBinding binding;

    @NotNull
    private final AddEdoFormViewHolderV2$edoTextWatcher$1 edoTextWatcher;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final AddEdoViewModelV2 viewModel;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoFormViewHolderV2$edoTextWatcher$1, ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AddEdoFormViewHolderV2(@NotNull WidgetAddEdoV2FormBinding binding, @NotNull AddEdoViewModelV2 viewModel, @NotNull ComposerReferences references) {
        super(r4);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(references, "references");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.viewModel = viewModel;
        this.references = references;
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
        ?? r22 = new OzonTextWatcher() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoFormViewHolderV2$edoTextWatcher$1
            @Override // ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher, android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {
                WidgetAddEdoV2FormBinding widgetAddEdoV2FormBinding;
                AddEdoFormViewHolderV2 addEdoFormViewHolderV2 = AddEdoFormViewHolderV2.this;
                widgetAddEdoV2FormBinding = addEdoFormViewHolderV2.binding;
                TextFieldCellView addEdoTextFieldCellView = widgetAddEdoV2FormBinding.addEdoTextFieldCellView;
                Intrinsics.checkNotNullExpressionValue(addEdoTextFieldCellView, "addEdoTextFieldCellView");
                addEdoFormViewHolderV2.hideError(addEdoTextFieldCellView);
            }
        };
        this.edoTextWatcher = r22;
        d.c(references).a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoFormViewHolderV2.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                AddEdoFormViewHolderV2.this.references.getContainer().g().getLifecycle().e(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(J owner) {
                View view;
                ViewGroup composerContainer;
                Intrinsics.checkNotNullParameter(owner, "owner");
                r a11 = AddEdoFormViewHolderV2.this.references.getContainer().a();
                if (a11 != null) {
                    KeyboardUtils.INSTANCE.hideKeyboard(a11);
                }
                ComponentCallbacksC5392m c11 = AddEdoFormViewHolderV2.this.references.getContainer().c();
                if (c11 == null || (view = c11.getView()) == null || (composerContainer = ComposerViewExtensionKt.composerContainer(view)) == null) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = composerContainer.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = 0;
                composerContainer.setLayoutParams(marginLayoutParams);
            }
        });
        TextFieldCellView textFieldCellView = binding.addEdoTextFieldCellView;
        textFieldCellView.getMainView().setTextWatcher(r22);
        textFieldCellView.setPreset(TextFieldPresets.INSTANCE.getDefault600End());
        textFieldCellView.setMainAddonSettings(MainAddonSettings.copy$default(textFieldCellView.getMainAddonSettings(), null, null, null, null, null, Dimens.INSTANCE.getDP_4(), 0, null, null, null, 991, null));
        textFieldCellView.setInputState(OzonTextInputLayoutModel.State.DEFAULT);
        hideError(textFieldCellView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideError(TextFieldCellView textFieldCellView) {
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.NEUTRAL);
        textFieldCellView.setLabelText(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openNestedPage(String deeplink) {
        this.actionHandler.invoke(new AtomAction.OpenComposerNestedPage((String) null, deeplink, (AtomAction.CurtainShowConfig) new AtomAction.CurtainShowConfig.Wrap(null, 1, null), false, (Map) null, 9, (DefaultConstructorMarker) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(TextFieldCellView textFieldCellView) {
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.ERROR);
        Context context = textFieldCellView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextFieldCellApi.DefaultImpls.setLabelColor$default(textFieldCellView, ResourceExtKt.color(context, UniColors.TEXT_NEGATIVE.getResId()), 0.0f, 2, null);
        textFieldCellView.setLabelText(textFieldCellView.getContext().getText(R$string.required_field_text_android).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorMessage(String errorMessage) {
        String string = errorMessage == null ? StringProvider.getString(ru.ozon.app.android.uikit.R$string.error_common_message_service_error) : errorMessage;
        ViewGroup rootView = ContextExtKt.getRootView(this.references.getContainer().j());
        if (rootView != null) {
            FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(string), null, null, Integer.valueOf(R$drawable.ic_m_exclamation_filled), null, UniColors.GRAPHIC_WARNING_PRIMARY.getToken(), null, null, null, null, null, 3000L, null, null, this.references.getContainer().g(), 56666, null).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void successGoBackRefresh() {
        this.actionHandler.invoke(new AtomAction.DismissRefresh(null, null, null, null, null, null, 53, null));
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        C2399j.C(new C2408n0(this.viewModel.getSingleEvent(), new AddEdoFormViewHolderV2$onAttachViewModel$1(this, null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AddEdoFormVOV2 item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetAddEdoV2FormBinding widgetAddEdoV2FormBinding = this.binding;
        TextAtomV2View title = widgetAddEdoV2FormBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextHolderKt.bind$default(title, item.getTitle(), null, 2, null);
        widgetAddEdoV2FormBinding.addEdoTextFieldCellView.setInputLabelText(item.getInputField().getPlaceholder());
        DisclaimerContainer addEdoAnnotation = widgetAddEdoV2FormBinding.addEdoAnnotation;
        Intrinsics.checkNotNullExpressionValue(addEdoAnnotation, "addEdoAnnotation");
        DisclaimerHolderKt.bindOrGone(addEdoAnnotation, item.getAnnotation(), this.actionHandler);
    }
}
