package ru.ozon.app.android.ugc.widgets.selectionItemForm.input;

import Ae.C2399j;
import Ae.C2408n0;
import WZ.l;
import android.text.Editable;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.SelectionFormViewModel;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.ViewIntent;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0002%(\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u0011J\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInputVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInputVO;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInput;", "selectionFormInput", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SelectionFormViewModel;", "selectionFormViewModel", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInputsDelegate;", "inputsDelegate", "<init>", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInput;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SelectionFormViewModel;Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInputsDelegate;)V", "", "observeSingleEvent", "()V", "item", "", "text", "onInputUpdate", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInputVO;Ljava/lang/String;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInputVO;Ll20/d;)V", "onAttach", "onDetach", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInput;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SelectionFormViewModel;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInputsDelegate;", "", "isInitialValue", "Z", "ru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInputVH$textWatcher$1", "textWatcher", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInputVH$textWatcher$1;", "ru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInputVH$lifecycleObserver$1", "lifecycleObserver", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInputVH$lifecycleObserver$1;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionFormInputVH extends k<SelectionFormInputVO> {

    @NotNull
    private final SelectionFormInputsDelegate inputsDelegate;
    private boolean isInitialValue;

    @NotNull
    private final SelectionFormInputVH$lifecycleObserver$1 lifecycleObserver;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final SelectionFormInput selectionFormInput;

    @NotNull
    private final SelectionFormViewModel selectionFormViewModel;

    @NotNull
    private final SelectionFormInputVH$textWatcher$1 textWatcher;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [ru.ozon.app.android.ugc.widgets.selectionItemForm.input.SelectionFormInputVH$textWatcher$1] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.I, ru.ozon.app.android.ugc.widgets.selectionItemForm.input.SelectionFormInputVH$lifecycleObserver$1] */
    public SelectionFormInputVH(@NotNull SelectionFormInput selectionFormInput, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull SelectionFormViewModel selectionFormViewModel, @NotNull SelectionFormInputsDelegate inputsDelegate) {
        super(selectionFormInput.getView());
        Intrinsics.checkNotNullParameter(selectionFormInput, "selectionFormInput");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(selectionFormViewModel, "selectionFormViewModel");
        Intrinsics.checkNotNullParameter(inputsDelegate, "inputsDelegate");
        this.selectionFormInput = selectionFormInput;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.selectionFormViewModel = selectionFormViewModel;
        this.inputsDelegate = inputsDelegate;
        this.isInitialValue = true;
        this.textWatcher = new OzonTextWatcher() { // from class: ru.ozon.app.android.ugc.widgets.selectionItemForm.input.SelectionFormInputVH$textWatcher$1
            @Override // ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                SelectionFormInputsDelegate selectionFormInputsDelegate;
                SelectionFormInput selectionFormInput2;
                SelectionFormInputVO boundData = SelectionFormInputVH.this.getBoundData();
                if (boundData != null) {
                    SelectionFormInputVH selectionFormInputVH = SelectionFormInputVH.this;
                    String obj = editable != null ? editable.toString() : null;
                    if (obj == null) {
                        obj = "";
                    }
                    selectionFormInputVH.onInputUpdate(boundData, obj);
                    selectionFormInput2 = selectionFormInputVH.selectionFormInput;
                    selectionFormInput2.clearError(boundData.getHint());
                }
                selectionFormInputsDelegate = SelectionFormInputVH.this.inputsDelegate;
                selectionFormInputsDelegate.onTextChanged();
            }
        };
        ?? r22 = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.ugc.widgets.selectionItemForm.input.SelectionFormInputVH$lifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                SelectionFormInputsDelegate selectionFormInputsDelegate;
                Intrinsics.checkNotNullParameter(owner, "owner");
                selectionFormInputsDelegate = SelectionFormInputVH.this.inputsDelegate;
                selectionFormInputsDelegate.onClear();
                owner.getLifecycle().e(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(J owner) {
                SelectionFormInputsDelegate selectionFormInputsDelegate;
                SelectionFormInput selectionFormInput2;
                ComposerReferences composerReferences;
                View view;
                Intrinsics.checkNotNullParameter(owner, "owner");
                selectionFormInputsDelegate = SelectionFormInputVH.this.inputsDelegate;
                selectionFormInput2 = SelectionFormInputVH.this.selectionFormInput;
                composerReferences = SelectionFormInputVH.this.refs;
                ComponentCallbacksC5392m c11 = composerReferences.getContainer().c();
                selectionFormInputsDelegate.setupInputsDelegate(selectionFormInput2, (c11 == null || (view = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerRecyclerView(view));
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                ComposerReferences composerReferences;
                SelectionFormInput selectionFormInput2;
                Intrinsics.checkNotNullParameter(owner, "owner");
                SelectionFormInputVO boundData = SelectionFormInputVH.this.getBoundData();
                if (boundData != null) {
                    SelectionFormInputVH selectionFormInputVH = SelectionFormInputVH.this;
                    composerReferences = selectionFormInputVH.refs;
                    InterfaceC7851b controller = composerReferences.getController();
                    long id2 = boundData.getId();
                    selectionFormInput2 = selectionFormInputVH.selectionFormInput;
                    controller.update(new SelectionFormInputUpdateKey(id2, selectionFormInput2.getText()));
                }
            }
        };
        this.lifecycleObserver = r22;
        refs.getContainer().g().getLifecycle().a(r22);
        observeSingleEvent();
    }

    private final void observeSingleEvent() {
        C2399j.C(new C2408n0(this.selectionFormViewModel.getSingleEvent(), new SelectionFormInputVH$observeSingleEvent$1(this, null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInputUpdate(SelectionFormInputVO item, String text) {
        this.selectionFormViewModel.onViewIntent(new ViewIntent.InputUpdated(item.getUploadKey(), text, item.getErrorRequiredText() != null, this.isInitialValue));
        this.isInitialValue = false;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.selectionFormInput.onAttach(this.textWatcher, new SelectionFormInputVH$onAttach$1(this));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.selectionFormInput.onDetach(this.textWatcher);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SelectionFormInputVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.selectionFormInput.bind(item);
        if (this.isInitialValue) {
            String text = item.getText();
            if (text == null) {
                text = "";
            }
            onInputUpdate(item, text);
        }
    }
}
