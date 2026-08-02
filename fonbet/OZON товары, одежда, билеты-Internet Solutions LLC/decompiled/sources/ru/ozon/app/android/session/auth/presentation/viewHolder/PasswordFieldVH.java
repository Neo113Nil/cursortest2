package ru.ozon.app.android.session.auth.presentation.viewHolder;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.auth.data.AuthVO;
import ru.ozon.app.android.session.auth.data.FieldAction;
import ru.ozon.app.android.session.auth.presentation.viewHolder.PasswordFieldVH;
import ru.ozon.app.android.session.databinding.ItemAuthFieldInputPasswordBinding;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/session/auth/presentation/viewHolder/PasswordFieldVH;", "Lru/ozon/app/android/session/auth/presentation/viewHolder/FieldVH;", "containerView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "binding", "Lru/ozon/app/android/session/databinding/ItemAuthFieldInputPasswordBinding;", "currentItem", "Lru/ozon/app/android/session/auth/data/AuthVO$Input;", "textWatcher", "Lru/ozon/uni/android/uikit/common/SimpleTextWatcher;", "onFocusChangedListener", "Landroid/view/View$OnFocusChangeListener;", "bind", "", "item", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PasswordFieldVH extends FieldVH {

    @NotNull
    private final ItemAuthFieldInputPasswordBinding binding;
    private AuthVO.Input currentItem;

    @NotNull
    private final View.OnFocusChangeListener onFocusChangedListener;

    @NotNull
    private final SimpleTextWatcher textWatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasswordFieldVH(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        ItemAuthFieldInputPasswordBinding bind = ItemAuthFieldInputPasswordBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.textWatcher = new SimpleTextWatcher() { // from class: ru.ozon.app.android.session.auth.presentation.viewHolder.PasswordFieldVH$textWatcher$1
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                AuthVO.Input input;
                ItemAuthFieldInputPasswordBinding itemAuthFieldInputPasswordBinding;
                Intrinsics.checkNotNullParameter(editable, "editable");
                input = PasswordFieldVH.this.currentItem;
                if (input != null) {
                    PasswordFieldVH passwordFieldVH = PasswordFieldVH.this;
                    Function1<FieldAction, Unit> onAction = passwordFieldVH.getOnAction();
                    if (onAction != null) {
                        onAction.invoke(new FieldAction.TextChanged(input, editable.toString()));
                    }
                    itemAuthFieldInputPasswordBinding = passwordFieldVH.binding;
                    TextInputLayout textInputLayout = itemAuthFieldInputPasswordBinding.fieldTil;
                    textInputLayout.Z(null);
                    textInputLayout.a0(false);
                }
            }
        };
        this.onFocusChangedListener = new View.OnFocusChangeListener() { // from class: pJ.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                PasswordFieldVH.onFocusChangedListener$lambda$1(PasswordFieldVH.this, view, z11);
            }
        };
        final TextInputEditText fieldEt = bind.fieldEt;
        Intrinsics.checkNotNullExpressionValue(fieldEt, "fieldEt");
        fieldEt.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ru.ozon.app.android.session.auth.presentation.viewHolder.PasswordFieldVH$special$$inlined$setOnDoneClickListener$1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                AuthVO.Input input;
                Function1<FieldAction, Unit> onAction;
                if (i11 != 6) {
                    return false;
                }
                input = this.currentItem;
                if (input != null && (onAction = this.getOnAction()) != null) {
                    onAction.invoke(new FieldAction.Submit(input));
                }
                InputMethodManager inputMethodManager = (InputMethodManager) fieldEt.getContext().getSystemService("input_method");
                if (inputMethodManager != null && inputMethodManager.isActive(fieldEt)) {
                    inputMethodManager.hideSoftInputFromWindow(fieldEt.getWindowToken(), 0);
                }
                fieldEt.clearFocus();
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFocusChangedListener$lambda$1(PasswordFieldVH passwordFieldVH, View view, boolean z11) {
        Function1<FieldAction, Unit> onAction;
        AuthVO.Input input = passwordFieldVH.currentItem;
        if (input == null || !z11 || (onAction = passwordFieldVH.getOnAction()) == null) {
            return;
        }
        onAction.invoke(new FieldAction.SetFocus(input));
    }

    @Override // ru.ozon.app.android.session.auth.presentation.viewHolder.FieldVH
    public void bind(@NotNull AuthVO.Input item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.currentItem = item;
        ItemAuthFieldInputPasswordBinding itemAuthFieldInputPasswordBinding = this.binding;
        itemAuthFieldInputPasswordBinding.fieldEt.setOnFocusChangeListener(null);
        itemAuthFieldInputPasswordBinding.fieldEt.removeTextChangedListener(this.textWatcher);
        itemAuthFieldInputPasswordBinding.fieldEt.setText(item.getValue());
        itemAuthFieldInputPasswordBinding.fieldEt.setImeOptions(item.getImeOptions());
        String error = item.getError();
        if (error != null) {
            itemAuthFieldInputPasswordBinding.fieldTil.Z(error);
        } else {
            itemAuthFieldInputPasswordBinding.fieldTil.a0(false);
            Unit unit = Unit.f71690a;
        }
        itemAuthFieldInputPasswordBinding.fieldTil.d0(item.getPlaceholder());
        if (item.getRequestFocus()) {
            TextInputEditText fieldEt = itemAuthFieldInputPasswordBinding.fieldEt;
            Intrinsics.checkNotNullExpressionValue(fieldEt, "fieldEt");
            showKeyboardDelayed(fieldEt);
            TextInputEditText textInputEditText = itemAuthFieldInputPasswordBinding.fieldEt;
            String value = item.getValue();
            textInputEditText.setSelection(value != null ? value.length() : 0);
            itemAuthFieldInputPasswordBinding.fieldEt.requestFocus();
        }
        itemAuthFieldInputPasswordBinding.fieldEt.addTextChangedListener(this.textWatcher);
        itemAuthFieldInputPasswordBinding.fieldEt.setOnFocusChangeListener(this.onFocusChangedListener);
        itemAuthFieldInputPasswordBinding.fieldEt.setContentDescription("password");
    }
}
