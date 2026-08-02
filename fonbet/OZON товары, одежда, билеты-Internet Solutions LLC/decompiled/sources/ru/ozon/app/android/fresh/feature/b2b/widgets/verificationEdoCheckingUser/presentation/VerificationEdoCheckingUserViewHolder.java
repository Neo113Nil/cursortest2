package ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingUser.presentation;

import AW.c;
import Ae.C2399j;
import Ae.C2408n0;
import G.g;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import i10.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetVerificationEdoCheckingUserBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingUser.presentation.VerificationEdoCheckingUserVO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingUser.presentation.VerificationEdoCheckingUserViewHolder;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.text.TextFieldCellApi;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.cell.text.data.TextFieldPresets;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\b\u0001\u0018\u0000 <2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001<B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001d\u001a\u00020\u000f*\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010 \u001a\u00020\u000f*\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\u000f*\u00020\u0019H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010\u0018J\u000f\u0010)\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010\u0018J\u001f\u0010-\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0014¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u000f028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001a098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/presentation/VerificationEdoCheckingUserViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/presentation/VerificationEdoCheckingUserVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetVerificationEdoCheckingUserBinding;", "binding", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/presentation/VerificationEdoCheckingUserViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetVerificationEdoCheckingUserBinding;Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/presentation/VerificationEdoCheckingUserViewModel;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/presentation/VerificationEdoCheckingUserVO$Field;", "fields", "", "bindInputFields", "(Ljava/util/List;)V", "", "link", "queries", "openOperatorVerification", "(Ljava/lang/String;Ljava/lang/String;)V", "initKeyboardListener", "()V", "Lru/ozon/uni/android/cell/text/TextFieldCellView;", "", "index", "field", "bindInputField", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;ILru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/presentation/VerificationEdoCheckingUserVO$Field;)V", "errorText", "showError", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;Ljava/lang/String;)V", "hideError", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onAttach", "onDetach", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/presentation/VerificationEdoCheckingUserVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetVerificationEdoCheckingUserBinding;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/presentation/VerificationEdoCheckingUserViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroidx/core/view/D;", "insetsListener", "Landroidx/core/view/D;", "", "inputFieldsIds", "Ljava/util/List;", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VerificationEdoCheckingUserViewHolder extends k<VerificationEdoCheckingUserVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetVerificationEdoCheckingUserBinding binding;

    @NotNull
    private final List<Integer> inputFieldsIds;

    @NotNull
    private final D insetsListener;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final VerificationEdoCheckingUserViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingUser/presentation/VerificationEdoCheckingUserViewHolder$Companion;", "", "<init>", "()V", "ERROR_REQUIRED_TEXT", "", "SHEET_FRAGMENT_TAG", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VerificationEdoCheckingUserViewHolder(@NotNull WidgetVerificationEdoCheckingUserBinding binding, @NotNull VerificationEdoCheckingUserViewModel viewModel, @NotNull ComposerReferences references) {
        super(r0);
        ViewTreeObserver viewTreeObserver;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(references, "references");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.viewModel = viewModel;
        this.references = references;
        this.actionHandler = new ActionHandler.Builder(references, this).onPreProcess(new VerificationEdoCheckingUserViewHolder$actionHandler$1(this)).buildHandler();
        this.insetsListener = new c(this);
        this.inputFieldsIds = new ArrayList();
        final ViewGroup rootView = ContextExtKt.getRootView(references.getContainer().a());
        if (rootView == null || (viewTreeObserver = rootView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: vv.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                VerificationEdoCheckingUserViewHolder._init_$lambda$3(rootView, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(ViewGroup viewGroup, VerificationEdoCheckingUserViewHolder verificationEdoCheckingUserViewHolder) {
        Rect rect = new Rect();
        viewGroup.getWindowVisibleDisplayFrame(rect);
        if (viewGroup.getHeight() - (rect.bottom - rect.top) < 200) {
            verificationEdoCheckingUserViewHolder.binding.getConstraintLayout().requestFocus();
            int i11 = 0;
            for (Object obj : verificationEdoCheckingUserViewHolder.inputFieldsIds) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                ((Number) obj).intValue();
                View findViewById = verificationEdoCheckingUserViewHolder.binding.getConstraintLayout().findViewById(verificationEdoCheckingUserViewHolder.inputFieldsIds.get(i11).intValue());
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
                ((TextFieldCellView) findViewById).getMainView().getInputViewGroup().getInputView().setSelection(0);
                i11 = i12;
            }
        }
    }

    private final void bindInputField(final TextFieldCellView textFieldCellView, final int i11, VerificationEdoCheckingUserVO.Field field) {
        textFieldCellView.setId(View.generateViewId());
        TestInfo testInfo = field.getTestInfo();
        textFieldCellView.setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
        this.inputFieldsIds.add(Integer.valueOf(textFieldCellView.getId()));
        textFieldCellView.clearFocus();
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.NEUTRAL);
        textFieldCellView.setInputState(OzonTextInputLayoutModel.State.DEFAULT);
        textFieldCellView.setInputLabelText(field.getLabel());
        textFieldCellView.setPreset(TextFieldPresets.INSTANCE.getDefault600End());
        textFieldCellView.setLabelText(null);
        textFieldCellView.getMainView().getInputViewGroup().getInputView().addTextChangedListener(new TextWatcher() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingUser.presentation.VerificationEdoCheckingUserViewHolder$bindInputField$lambda$10$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                VerificationEdoCheckingUserViewModel verificationEdoCheckingUserViewModel;
                VerificationEdoCheckingUserViewHolder.this.hideError(textFieldCellView);
                verificationEdoCheckingUserViewModel = VerificationEdoCheckingUserViewHolder.this.viewModel;
                verificationEdoCheckingUserViewModel.onFieldTextChanged(i11, String.valueOf(s11));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
    }

    private final void bindInputFields(List<VerificationEdoCheckingUserVO.Field> fields) {
        LinearLayout linearLayout = this.binding.inputFieldsContainer;
        linearLayout.removeAllViews();
        int i11 = 0;
        for (Object obj : fields) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            Context context = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TextFieldCellView textFieldCellView = new TextFieldCellView(context, null, 0, 0, null, false, 62, null);
            bindInputField(textFieldCellView, i11, (VerificationEdoCheckingUserVO.Field) obj);
            linearLayout.addView(textFieldCellView);
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideError(TextFieldCellView textFieldCellView) {
        textFieldCellView.requestFocus();
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.NEUTRAL);
        textFieldCellView.setLabelText(null);
    }

    private final void initKeyboardListener() {
        Window window;
        r a11 = this.references.getContainer().a();
        if (a11 == null || (window = a11.getWindow()) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            window.setSoftInputMode(16);
        }
        Y.J(window.getDecorView(), this.insetsListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 insetsListener$lambda$1(VerificationEdoCheckingUserViewHolder verificationEdoCheckingUserViewHolder, View view, C5353y0 c5353y0) {
        View view2;
        ViewGroup composerContainer;
        int i11 = Ql.c.a(view, "view", c5353y0, "windowInsetsCompat", 8).f42129d - c5353y0.f(2).f42129d;
        if (i11 < 0) {
            i11 = 0;
        }
        ComponentCallbacksC5392m c11 = verificationEdoCheckingUserViewHolder.references.getContainer().c();
        if (c11 != null && (view2 = c11.getView()) != null && (composerContainer = ComposerViewExtensionKt.composerContainer(view2)) != null) {
            ViewGroup.LayoutParams layoutParams = composerContainer.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i11;
            composerContainer.setLayoutParams(marginLayoutParams);
        }
        return Y.u(view, c5353y0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openOperatorVerification(String link, String queries) {
        String str = null;
        ComposerNavigator.DefaultImpls.openBottomSheet$default(this.references.getNavigator(), "VerificationEdoCheckingUser", new ComposerScreenConfig(new h.c.a(g.c(link, kotlin.text.h.t(link, "?", false) ? "&" : "?", queries), str, str, 14), null, false, new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP, false, false, null, 0, false, false, false, false, false, false, 2046, null), false, false, false, false, null, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, 16777206, null), null, null, null, 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(TextFieldCellView textFieldCellView, String str) {
        textFieldCellView.setInputState(OzonTextInputLayoutModel.State.DEFAULT);
        textFieldCellView.setInputStatus(OzonTextInputLayoutModel.Status.ERROR);
        Context context = textFieldCellView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextFieldCellApi.DefaultImpls.setLabelColor$default(textFieldCellView, ResourceExtKt.color(context, UniColors.TEXT_NEGATIVE.getResId()), 0.0f, 2, null);
        textFieldCellView.setLabelText(str);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        initKeyboardListener();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        C2399j.C(new C2408n0(this.viewModel.getInputFields(), new VerificationEdoCheckingUserViewHolder$onAttachViewModel$1(this, null)), K.a(this));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        ViewGroup rootView;
        super.onDetach();
        r a11 = this.references.getContainer().a();
        if (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null) {
            return;
        }
        Y.J(rootView, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull VerificationEdoCheckingUserVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetVerificationEdoCheckingUserBinding widgetVerificationEdoCheckingUserBinding = this.binding;
        VerificationEdoCheckingUserViewModel verificationEdoCheckingUserViewModel = this.viewModel;
        VerificationEdoCheckingUserVO boundData = getBoundData();
        verificationEdoCheckingUserViewModel.initFields(boundData != null ? boundData.getFields() : null);
        TextAtomV2View title = widgetVerificationEdoCheckingUserBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextHolderKt.bindOrGone$default(title, item.getName(), null, 2, null);
        TextAtomV2View requisites = widgetVerificationEdoCheckingUserBinding.requisites;
        Intrinsics.checkNotNullExpressionValue(requisites, "requisites");
        TextHolderKt.bindOrGone$default(requisites, item.getRequisites(), null, 2, null);
        bindInputFields(item.getFields());
        ButtonV3View button = widgetVerificationEdoCheckingUserBinding.button;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        ButtonV3HolderKt.bind(button, item.getButton(), this.actionHandler);
    }
}
