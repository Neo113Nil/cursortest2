package ru.ozon.app.android.session.editUserFullName.presentation;

import Sc.o;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.r;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import i10.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.session.databinding.WidgetEditUserFullNameBinding;
import ru.ozon.app.android.session.editUserFullName.core.EditUserFullNameUpdate;
import ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameResult;
import ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameVO;
import ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameViewModel;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00152\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00152\u0006\u0010'\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J#\u00101\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u00022\n\u00100\u001a\u00060.j\u0002`/H\u0014¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0015H\u0016¢\u0006\u0004\b3\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00106R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00107R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00150@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameViewModel;", "viewModel", "Lru/ozon/app/android/session/editUserFullName/presentation/TextFieldFactory;", "textFieldFactory", "Lru/ozon/app/android/session/editUserFullName/presentation/TextFieldBinder;", "textFieldBinder", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameViewModel;Lru/ozon/app/android/session/editUserFullName/presentation/TextFieldFactory;Lru/ozon/app/android/session/editUserFullName/presentation/TextFieldBinder;)V", "", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO$InputVO;", "inputs", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "submitButtonAction", "", "bindTextFields", "(Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "input", "createAndBindTextField", "(Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO$InputVO;Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "bindTextField", "(Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO$InputVO;)V", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "text", "onTextChanged", "(Ljava/lang/String;Ljava/lang/String;)V", "", "show", "showLoader", "(Z)V", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameViewModel$Result;", "result", "handleResult", "(Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameViewModel$Result;)V", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameViewModel$Result$Success;", "handleSuccessResult", "(Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameViewModel$Result$Success;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO;Ll20/d;)V", "onAttach", "()V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameViewModel;", "Lru/ozon/app/android/session/editUserFullName/presentation/TextFieldFactory;", "Lru/ozon/app/android/session/editUserFullName/presentation/TextFieldBinder;", "Lru/ozon/app/android/session/databinding/WidgetEditUserFullNameBinding;", "binding", "Lru/ozon/app/android/session/databinding/WidgetEditUserFullNameBinding;", "", "Lru/ozon/app/android/session/editUserFullName/presentation/TextField;", "textFields", "Ljava/util/Map;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EditUserFullNameViewHolder extends k<EditUserFullNameVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetEditUserFullNameBinding binding;

    @NotNull
    private final ComposerReferences composerReferences;

    @NotNull
    private final TextFieldBinder textFieldBinder;

    @NotNull
    private final TextFieldFactory textFieldFactory;

    @NotNull
    private final Map<String, TextField> textFields;

    @NotNull
    private final EditUserFullNameViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditUserFullNameViewHolder(@NotNull View containerView, @NotNull ComposerReferences composerReferences, @NotNull EditUserFullNameViewModel viewModel, @NotNull TextFieldFactory textFieldFactory, @NotNull TextFieldBinder textFieldBinder) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(textFieldFactory, "textFieldFactory");
        Intrinsics.checkNotNullParameter(textFieldBinder, "textFieldBinder");
        this.composerReferences = composerReferences;
        this.viewModel = viewModel;
        this.textFieldFactory = textFieldFactory;
        this.textFieldBinder = textFieldBinder;
        WidgetEditUserFullNameBinding bind = WidgetEditUserFullNameBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.textFields = new LinkedHashMap();
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).onComposerAction(new EditUserFullNameViewHolder$actionHandler$1(viewModel)).buildHandler();
    }

    private final void bindTextField(EditUserFullNameVO.InputVO input) {
        this.textFieldBinder.bindTextField((TextField) U.e(this.textFields, input.getName()), input);
    }

    private final void bindTextFields(List<EditUserFullNameVO.InputVO> inputs, AtomAction.ComposerAction submitButtonAction) {
        if (!this.textFields.isEmpty()) {
            Iterator<T> it = inputs.iterator();
            while (it.hasNext()) {
                bindTextField((EditUserFullNameVO.InputVO) it.next());
            }
            return;
        }
        Iterator<T> it2 = inputs.iterator();
        while (it2.hasNext()) {
            createAndBindTextField((EditUserFullNameVO.InputVO) it2.next(), submitButtonAction);
        }
        Map<String, TextField> map = this.textFields;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<String, TextField>> it3 = map.entrySet().iterator();
        while (it3.hasNext()) {
            arrayList.add(it3.next().getValue().getTextInputLayout());
        }
        LinearLayout linearLayout = this.binding.inputsLl;
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            linearLayout.addView((View) it4.next());
        }
    }

    private final void createAndBindTextField(EditUserFullNameVO.InputVO input, AtomAction.ComposerAction submitButtonAction) {
        this.textFields.put(input.getName(), this.textFieldFactory.createTextField(getContext(), input, new EditUserFullNameViewHolder$createAndBindTextField$1(this), new EditUserFullNameViewHolder$createAndBindTextField$2(submitButtonAction, this)));
        bindTextField(input);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleResult(EditUserFullNameViewModel.Result result) {
        r i11 = this.composerReferences.getContainer().i();
        if (result instanceof EditUserFullNameViewModel.Result.Success) {
            handleSuccessResult((EditUserFullNameViewModel.Result.Success) result);
        } else {
            if (!(result instanceof EditUserFullNameViewModel.Result.Failure)) {
                throw new o();
            }
            ViewGroup rootView = ContextExtKt.getRootView(i11);
            if (rootView != null) {
                FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, ((EditUserFullNameViewModel.Result.Failure) result).getMessage(), null, null, null, i11, 58, null).show();
            }
        }
    }

    private final void handleSuccessResult(EditUserFullNameViewModel.Result.Success result) {
        EditUserFullNameResult result2 = result.getResult();
        if (Intrinsics.d(result2, EditUserFullNameResult.Success.INSTANCE)) {
            ComposerExtKt.setResult$default(this.composerReferences.getContainer(), null, 0, null, 7, null);
            ComposerExtKt.closeFlow(this.composerReferences.getContainer());
        } else {
            if (!(result2 instanceof EditUserFullNameResult.Failure)) {
                throw new o();
            }
            this.composerReferences.getController().update(new EditUserFullNameUpdate.Error(((EditUserFullNameResult.Failure) result.getResult()).getFields()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTextChanged(String name, String text) {
        this.viewModel.onTextChanged(name, text);
        this.composerReferences.getController().update(new EditUserFullNameUpdate.TextChange(name, text));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLoader(boolean show) {
        InterfaceC7851b controller = this.composerReferences.getController();
        if (show) {
            controller.e(new l.a.C1079a(0L, null, 3));
        } else {
            controller.hideLoader();
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.viewModel.getShowLoader().observe(this, new EditUserFullNameViewHolder$onAttach$1(this));
        this.viewModel.getResult().observe(this, new EditUserFullNameViewHolder$onAttach$2(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull EditUserFullNameVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.onDataReceived(item.getInputs());
        this.binding.titleTv.setText(item.getTitle());
        bindTextFields(item.getInputs(), item.getSubmitButtonAction());
        LargeButtonView submitButtonView = this.binding.submitButtonView;
        Intrinsics.checkNotNullExpressionValue(submitButtonView, "submitButtonView");
        LargeButtonHolderKt.bind(submitButtonView, item.getSubmitButton(), this.actionHandler);
    }
}
