package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetLegalDetailsEditorBinding;
import ru.ozon.app.android.fresh.feature.b2b.utils.UtilsKt;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorViewHolder;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.filesList.FileFieldAdapter;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.filesList.FileFieldItemDecoration;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.text.TextFieldCellApi;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.cell.text.data.TextFieldPresets;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonSettings;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.controls.button.ButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u00014\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0010*\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b!\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010.R \u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0010008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00067"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetLegalDetailsEditorBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorViewModel;", "viewModel", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetLegalDetailsEditorBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorViewModel;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "Lru/ozon/uni/android/cell/text/TextFieldCellView;", "", "errorText", "", "showError", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;Ljava/lang/String;)V", "hideError", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;)V", "message", "showErrorMessage", "(Ljava/lang/String;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO;Ll20/d;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onDetachViewModel", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetLegalDetailsEditorBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorViewModel;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/filesList/FileFieldAdapter;", "fileFieldAdapter$delegate", "LSc/j;", "getFileFieldAdapter", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/filesList/FileFieldAdapter;", "fileFieldAdapter", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/filesList/FileFieldItemDecoration;", "fileFieldsDecoration$delegate", "getFileFieldsDecoration", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/filesList/FileFieldItemDecoration;", "fileFieldsDecoration", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "requestActionHandler", "Lkotlin/jvm/functions/Function1;", "ru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorViewHolder$addressTextWatcher$1", "addressTextWatcher", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorViewHolder$addressTextWatcher$1;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LegalDetailsEditorViewHolder extends k<LegalDetailsEditorVO> {

    @NotNull
    private final LegalDetailsEditorViewHolder$addressTextWatcher$1 addressTextWatcher;

    @NotNull
    private final WidgetLegalDetailsEditorBinding binding;

    /* renamed from: fileFieldAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j fileFieldAdapter;

    /* renamed from: fileFieldsDecoration$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j fileFieldsDecoration;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final Function1<AtomAction, Unit> requestActionHandler;

    @NotNull
    private final LegalDetailsEditorViewModel viewModel;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorViewHolder$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            TextFieldCellView textFieldCellView = LegalDetailsEditorViewHolder.this.binding.addressInputLayout;
            textFieldCellView.clearFocus();
            ViewExtKt.hideKeyboard(textFieldCellView);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v6, types: [ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorViewHolder$addressTextWatcher$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LegalDetailsEditorViewHolder(@NotNull WidgetLegalDetailsEditorBinding binding, @NotNull ComposerReferences references, @NotNull LegalDetailsEditorViewModel viewModel, @NotNull HandlersInhibitor inhibitor) {
        super(r5);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.references = references;
        this.viewModel = viewModel;
        this.fileFieldAdapter = Sc.k.b(new LegalDetailsEditorViewHolder$fileFieldAdapter$2(this));
        this.fileFieldsDecoration = Sc.k.b(LegalDetailsEditorViewHolder$fileFieldsDecoration$2.INSTANCE);
        this.requestActionHandler = new ActionHandler.Builder(references, this).enableClickThrottling(inhibitor).onComposerAction(new LegalDetailsEditorViewHolder$requestActionHandler$1(this)).buildHandler();
        this.addressTextWatcher = new OzonTextWatcher() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorViewHolder$addressTextWatcher$1
            @Override // ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable text) {
                LegalDetailsEditorViewModel legalDetailsEditorViewModel;
                legalDetailsEditorViewModel = LegalDetailsEditorViewHolder.this.viewModel;
                legalDetailsEditorViewModel.updateAddress(String.valueOf(text));
            }

            @Override // ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher, android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                LegalDetailsEditorViewHolder legalDetailsEditorViewHolder = LegalDetailsEditorViewHolder.this;
                TextFieldCellView addressInputLayout = legalDetailsEditorViewHolder.binding.addressInputLayout;
                Intrinsics.checkNotNullExpressionValue(addressInputLayout, "addressInputLayout");
                legalDetailsEditorViewHolder.hideError(addressInputLayout);
            }
        };
        Iterator it = C7714v.b0(binding.textFieldBlock, binding.attachFieldBlock).iterator();
        while (it.hasNext()) {
            UtilsKt.setColoredDrawableBackground((ViewGroup) it.next(), R$color.layer_floor_1, Dimens.INSTANCE.getDPF_16());
        }
        RecyclerView recyclerView = this.binding.fileFieldRecyclerView;
        recyclerView.setAdapter(getFileFieldAdapter());
        recyclerView.addItemDecoration(getFileFieldsDecoration());
        final TextFieldCellView textFieldCellView = this.binding.addressInputLayout;
        textFieldCellView.getMainView().setTextWatcher(this.addressTextWatcher);
        textFieldCellView.setPreset(TextFieldPresets.INSTANCE.getDefault600End());
        textFieldCellView.setMainAddonSettings(MainAddonSettings.copy$default(textFieldCellView.getMainAddonSettings(), null, null, null, null, null, Dimens.INSTANCE.getDP_4(), 0, null, null, null, 991, null));
        textFieldCellView.setInputState(OzonTextInputLayoutModel.State.DEFAULT);
        hideError(textFieldCellView);
        textFieldCellView.getMainView().getInputViewGroup().getInputView().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: Wu.a
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean lambda$3$lambda$2;
                lambda$3$lambda$2 = LegalDetailsEditorViewHolder.lambda$3$lambda$2(TextFieldCellView.this, textView, i11, keyEvent);
                return lambda$3$lambda$2;
            }
        });
        TextAtomV2View sendPolicyText = this.binding.sendPolicyText;
        Intrinsics.checkNotNullExpressionValue(sendPolicyText, "sendPolicyText");
        ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.setOnClickListenerThrottle$default(sendPolicyText, 0L, new AnonymousClass4(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FileFieldAdapter getFileFieldAdapter() {
        return (FileFieldAdapter) this.fileFieldAdapter.getValue();
    }

    private final FileFieldItemDecoration getFileFieldsDecoration() {
        return (FileFieldItemDecoration) this.fileFieldsDecoration.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideError(TextFieldCellView textFieldCellView) {
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.NEUTRAL);
        textFieldCellView.setLabelText(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$3$lambda$2(TextFieldCellView textFieldCellView, TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 6 && (keyEvent == null || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        Intrinsics.f(textFieldCellView);
        ViewExtKt.hideKeyboard(textFieldCellView);
        textFieldCellView.clearFocus();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(TextFieldCellView textFieldCellView, String str) {
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.ERROR);
        Context context = textFieldCellView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextFieldCellApi.DefaultImpls.setLabelColor$default(textFieldCellView, ResourceExtKt.color(context, UniColors.TEXT_NEGATIVE.getResId()), 0.0f, 2, null);
        textFieldCellView.setLabelText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorMessage(String message) {
        ViewGroup rootView;
        if (message.length() == 0 || (rootView = ContextExtKt.getRootView(this.references.getContainer().j())) == null) {
            return;
        }
        FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(message), null, null, Integer.valueOf(R$drawable.ic_m_exclamation_filled), null, UniColors.GRAPHIC_WARNING_PRIMARY.getToken(), null, null, null, null, null, 3000L, null, null, this.references.getContainer().g(), 56666, null).show();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        C2399j.C(new C2408n0(this.viewModel.getAddressQuery(), new LegalDetailsEditorViewHolder$onAttachViewModel$1(this, null)), K.a(lifecycle));
        C2399j.C(new C2408n0(this.viewModel.getFileFields(), new LegalDetailsEditorViewHolder$onAttachViewModel$2(this, null)), K.a(lifecycle));
        C2399j.C(new C2408n0(this.viewModel.getFlashbarErrorMessage(), new LegalDetailsEditorViewHolder$onAttachViewModel$3(this, null)), K.a(lifecycle));
        C2399j.C(new C2408n0(this.viewModel.getShowGeneralLoader(), new LegalDetailsEditorViewHolder$onAttachViewModel$4(this, null)), K.a(lifecycle));
        this.viewModel.setDeeplinkActionHandler(new LegalDetailsEditorViewHolder$onAttachViewModel$5(this));
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onDetachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.viewModel.discardWidgetData();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull LegalDetailsEditorVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetLegalDetailsEditorBinding widgetLegalDetailsEditorBinding = this.binding;
        TextAtomV2View textFieldTitle = widgetLegalDetailsEditorBinding.textFieldTitle;
        Intrinsics.checkNotNullExpressionValue(textFieldTitle, "textFieldTitle");
        TextHolderKt.bind$default(textFieldTitle, item.getTextField().getTitle(), null, 2, null);
        TextAtomV2View attachFieldTitle = widgetLegalDetailsEditorBinding.attachFieldTitle;
        Intrinsics.checkNotNullExpressionValue(attachFieldTitle, "attachFieldTitle");
        TextHolderKt.bind$default(attachFieldTitle, item.getAttachField().getTitle(), null, 2, null);
        ButtonView submitButton = widgetLegalDetailsEditorBinding.submitButton;
        Intrinsics.checkNotNullExpressionValue(submitButton, "submitButton");
        ButtonHolderKt.bind(submitButton, item.getSubmitButton(), this.requestActionHandler);
        widgetLegalDetailsEditorBinding.addressInputLayout.setInputLabelText(item.getTextField().getPlaceholder());
        widgetLegalDetailsEditorBinding.addressInputLayout.setInputKeyboardAction(OzonTextInputLayoutModel.KeyboardAction.UNSPECIFIED);
        this.viewModel.initFields(item.getTextField(), item.getAttachField().getFileFields());
        TextAtomV2View sendPolicyText = widgetLegalDetailsEditorBinding.sendPolicyText;
        Intrinsics.checkNotNullExpressionValue(sendPolicyText, "sendPolicyText");
        TextHolderKt.bindOrGone$default(sendPolicyText, item.getPolicyField(), null, 2, null);
    }
}
