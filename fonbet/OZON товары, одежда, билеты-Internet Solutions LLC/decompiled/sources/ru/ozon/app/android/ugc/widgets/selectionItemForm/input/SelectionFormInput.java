package ru.ozon.app.android.ugc.widgets.selectionItemForm.input;

import E.c0;
import MW.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.method.TextKeyListener;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C5316f0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.input.SelectionFormInput;
import ru.ozon.uni.android.cell.label.SmartLabel;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.cell.text.data.TextFieldPresets;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 @2\u00020\u0001:\u0001@B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\b*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\b*\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\b*\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b%\u0010#J\r\u0010&\u001a\u00020 ¢\u0006\u0004\b&\u0010'J\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010(J)\u0010)\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b+\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00107\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u00103R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0013\u0010?\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInput;", "", "Landroid/view/ViewGroup;", "view", "<init>", "(Landroid/view/ViewGroup;)V", "Lru/ozon/uni/android/input/textinput/domain/OzonTextWatcher;", "textWatcher", "", "setTextWatcher", "(Lru/ozon/uni/android/input/textinput/domain/OzonTextWatcher;)V", "Lkotlin/Function1;", "", "onFocusChanged", "setFocusChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "hasFocus", "setFocusedState", "(Z)V", "Lru/ozon/uni/android/textArea/TextAreaView;", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInputVO;", "item", "bindTextArea", "(Lru/ozon/uni/android/textArea/TextAreaView;Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInputVO;)V", "Lru/ozon/uni/android/cell/text/TextFieldCellView;", "bindTextField", "(Lru/ozon/uni/android/cell/text/TextFieldCellView;Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInputVO;)V", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;", "truncateOnFocusLost", "(Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;Z)V", "bind", "(Lru/ozon/app/android/ugc/widgets/selectionItemForm/input/SelectionFormInputVO;)V", "", "error", "showError", "(Ljava/lang/String;)V", "hint", "clearError", "getText", "()Ljava/lang/String;", "()Z", "onAttach", "(Lru/ozon/uni/android/input/textinput/domain/OzonTextWatcher;Lkotlin/jvm/functions/Function1;)V", "onDetach", "Landroid/view/ViewGroup;", "getView", "()Landroid/view/ViewGroup;", "", "hintDefaultColor$delegate", "LSc/j;", "getHintDefaultColor", "()I", "hintDefaultColor", "hintErrorColor$delegate", "getHintErrorColor", "hintErrorColor", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "preventFocusChange", "Z", "getInputView", "()Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;", "inputView", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionFormInput {

    @NotNull
    private final Handler handler;

    /* renamed from: hintDefaultColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j hintDefaultColor;

    /* renamed from: hintErrorColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j hintErrorColor;
    private boolean preventFocusChange;

    @NotNull
    private final ViewGroup view;
    public static final int $stable = 8;

    public SelectionFormInput(@NotNull ViewGroup view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.hintDefaultColor = k.b(new SelectionFormInput$hintDefaultColor$2(this));
        this.hintErrorColor = k.b(new SelectionFormInput$hintErrorColor$2(this));
        this.handler = new Handler(Looper.getMainLooper());
    }

    private final void bindTextArea(TextAreaView textAreaView, SelectionFormInputVO selectionFormInputVO) {
        textAreaView.setLabel(selectionFormInputVO.getPlaceholder());
        textAreaView.setCaption(selectionFormInputVO.getHint());
        Integer maxLinesCount = selectionFormInputVO.getMaxLinesCount();
        textAreaView.setMaxLines(maxLinesCount != null ? maxLinesCount.intValue() : 1);
        Integer maxCounterValue = selectionFormInputVO.getMaxCounterValue();
        textAreaView.setMaxLength(maxCounterValue != null ? maxCounterValue.intValue() : 60);
        Boolean showCounter = selectionFormInputVO.getShowCounter();
        textAreaView.setHasCounter(showCounter != null ? showCounter.booleanValue() : false);
        Boolean showCounter2 = selectionFormInputVO.getShowCounter();
        textAreaView.setHasBottomBar(showCounter2 != null ? showCounter2.booleanValue() : false);
        textAreaView.setScrollbarEnabled(true);
        String text = selectionFormInputVO.getText();
        if (text == null) {
            text = "";
        }
        textAreaView.setInputText(text);
    }

    private final void bindTextField(TextFieldCellView textFieldCellView, SelectionFormInputVO selectionFormInputVO) {
        OzonTextInput inputView = getInputView();
        if (inputView != null) {
            String text = selectionFormInputVO.getText();
            if (text == null) {
                text = "";
            }
            inputView.setText(text);
        }
        textFieldCellView.setPreset(TextFieldPresets.INSTANCE.getDefault600End());
        textFieldCellView.setInputKeyboardAction(OzonTextInputLayoutModel.KeyboardAction.DONE);
        String text2 = selectionFormInputVO.getText();
        if (text2 == null) {
            text2 = "";
        }
        textFieldCellView.setInputText(text2);
        textFieldCellView.inputCanReset(true);
        String placeholder = selectionFormInputVO.getPlaceholder();
        if (placeholder == null) {
            placeholder = "";
        }
        textFieldCellView.setInputLabelText(placeholder);
        SmartLabel addonView = textFieldCellView.getAddonView();
        String hint = selectionFormInputVO.getHint();
        addonView.setText(hint != null ? hint : "");
        textFieldCellView.getAddonView().setTextColor(getHintDefaultColor());
        textFieldCellView.setTruncateOnLostFocus(true);
        Integer maxCounterValue = selectionFormInputVO.getMaxCounterValue();
        if (maxCounterValue != null) {
            int intValue = maxCounterValue.intValue();
            OzonTextInput inputView2 = getInputView();
            if (inputView2 != null) {
                inputView2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(intValue)});
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clearError$lambda$0(SelectionFormInput selectionFormInput, String str) {
        SmartLabel addonView = ((TextFieldCellView) selectionFormInput.view).getAddonView();
        if (str == null) {
            str = "";
        }
        addonView.setText(str);
        ((TextFieldCellView) selectionFormInput.view).setInputStatus(OzonTextInputLayoutModel.Status.NEUTRAL);
        ((TextFieldCellView) selectionFormInput.view).getAddonView().setTextColor(selectionFormInput.getHintDefaultColor());
    }

    private final int getHintDefaultColor() {
        return ((Number) this.hintDefaultColor.getValue()).intValue();
    }

    private final int getHintErrorColor() {
        return ((Number) this.hintErrorColor.getValue()).intValue();
    }

    private final void setFocusChangeListener(final Function1<? super Boolean, Unit> onFocusChanged) {
        OzonTextInput inputView = getInputView();
        if (inputView != null) {
            inputView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: MW.b
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    SelectionFormInput.setFocusChangeListener$lambda$3(SelectionFormInput.this, onFocusChanged, view, z11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFocusChangeListener$lambda$3(SelectionFormInput selectionFormInput, Function1 function1, View view, boolean z11) {
        if (selectionFormInput.preventFocusChange) {
            return;
        }
        selectionFormInput.setFocusedState(z11);
        Intrinsics.f(view);
        if (z11) {
            ViewExtKt.showKeyboard(view);
        } else {
            ViewExtKt.hideKeyboard(view);
        }
        function1.invoke(Boolean.valueOf(z11));
    }

    private final void setFocusedState(boolean hasFocus) {
        ViewGroup viewGroup = this.view;
        if (viewGroup instanceof TextAreaView) {
            ((TextAreaView) viewGroup).setState(hasFocus ? TextAreaView.State.ACTIVE : TextAreaView.State.DEFAULT);
            return;
        }
        if (viewGroup instanceof TextFieldCellView) {
            ((TextFieldCellView) viewGroup).getMainView().setState(hasFocus ? OzonTextInputLayoutModel.State.ACTIVE : OzonTextInputLayoutModel.State.DEFAULT);
            truncateOnFocusLost(((TextFieldCellView) this.view).getMainView().getInputViewGroup().getInputView(), hasFocus);
        } else {
            throw new IllegalStateException(("incorrect view type " + this.view).toString());
        }
    }

    private final void setTextWatcher(OzonTextWatcher textWatcher) {
        OzonTextInput inputView = getInputView();
        if (inputView != null) {
            inputView.addTextChangedListener(textWatcher);
        }
    }

    private final void truncateOnFocusLost(OzonTextInput ozonTextInput, boolean z11) {
        ozonTextInput.setKeyListener(z11 ? TextKeyListener.getInstance() : null);
        ozonTextInput.setFocusable(true);
        ozonTextInput.setFocusableInTouchMode(true);
        ozonTextInput.requestLayout();
    }

    public final void bind(@NotNull SelectionFormInputVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ViewGroup viewGroup = this.view;
        if (viewGroup instanceof TextAreaView) {
            bindTextArea((TextAreaView) viewGroup, item);
        } else {
            if (viewGroup instanceof TextFieldCellView) {
                bindTextField((TextFieldCellView) viewGroup, item);
                return;
            }
            throw new IllegalStateException(("incorrect view type " + this.view).toString());
        }
    }

    public final void clearError(String hint) {
        ViewGroup viewGroup = this.view;
        if ((viewGroup instanceof TextAreaView) && ((TextAreaView) viewGroup).getStatus() == TextAreaView.Status.ERROR) {
            TextAreaView textAreaView = (TextAreaView) this.view;
            if (hint == null) {
                hint = "";
            }
            textAreaView.setCaption(hint);
            ((TextAreaView) this.view).setStatus(TextAreaView.Status.NEUTRAL);
            return;
        }
        ViewGroup viewGroup2 = this.view;
        if ((viewGroup2 instanceof TextFieldCellView) && !Intrinsics.d(((TextFieldCellView) viewGroup2).getAddonView().getText(), hint) && ((TextFieldCellView) this.view).getAddonView().getCurrentTextColor() == getHintErrorColor()) {
            this.handler.post(new c0(1, this, hint));
        }
    }

    public final OzonTextInput getInputView() {
        ViewGroup viewGroup = this.view;
        if (viewGroup instanceof TextAreaView) {
            return (OzonTextInput) l.l(l.h(C5316f0.b(viewGroup), SelectionFormInput$special$$inlined$filterIsInstance$1.INSTANCE));
        }
        if (viewGroup instanceof TextFieldCellView) {
            return ((TextFieldCellView) viewGroup).getMainView().getInputViewGroup().getInputView();
        }
        throw new IllegalStateException(("incorrect view type " + this.view).toString());
    }

    @NotNull
    public final String getText() {
        Editable text;
        OzonTextInput inputView = getInputView();
        String obj = (inputView == null || (text = inputView.getText()) == null) ? null : text.toString();
        return obj == null ? "" : obj;
    }

    @NotNull
    public final ViewGroup getView() {
        return this.view;
    }

    public final boolean hasFocus() {
        OzonTextInput inputView = getInputView();
        return inputView != null && inputView.hasFocus();
    }

    public final void onAttach(@NotNull OzonTextWatcher textWatcher, @NotNull Function1<? super Boolean, Unit> onFocusChanged) {
        Intrinsics.checkNotNullParameter(textWatcher, "textWatcher");
        Intrinsics.checkNotNullParameter(onFocusChanged, "onFocusChanged");
        this.preventFocusChange = true;
        OzonTextInput inputView = getInputView();
        if (inputView != null) {
            ru.ozon.app.android.pdp.utils.ViewExtKt.forceClearFocus(inputView);
        }
        setTextWatcher(textWatcher);
        setFocusChangeListener(onFocusChanged);
        this.handler.post(new a(this, 0));
    }

    public final void onDetach(@NotNull OzonTextWatcher textWatcher) {
        Intrinsics.checkNotNullParameter(textWatcher, "textWatcher");
        this.preventFocusChange = true;
        this.handler.removeCallbacksAndMessages(null);
        OzonTextInput inputView = getInputView();
        if (inputView != null) {
            ViewExtKt.hideKeyboard(inputView);
            setFocusedState(false);
            inputView.removeTextChangedListener(textWatcher);
            inputView.setOnFocusChangeListener(null);
        }
    }

    public final void showError(@NotNull String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        ViewGroup viewGroup = this.view;
        if (viewGroup instanceof TextAreaView) {
            ((TextAreaView) viewGroup).setCaption(error);
            ((TextAreaView) this.view).setStatus(TextAreaView.Status.ERROR);
        } else if (viewGroup instanceof TextFieldCellView) {
            ((TextFieldCellView) viewGroup).getAddonView().setText(error);
            ((TextFieldCellView) this.view).setInputStatus(OzonTextInputLayoutModel.Status.ERROR);
            ((TextFieldCellView) this.view).getAddonView().setTextColor(getHintErrorColor());
        } else {
            throw new IllegalStateException(("incorrect view type " + this.view).toString());
        }
    }
}
