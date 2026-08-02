package ru.ozon.app.android.session.auth.presentation.viewHolder;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.auth.data.AuthVO;
import ru.ozon.app.android.session.auth.data.FieldAction;
import ru.ozon.app.android.session.auth.presentation.viewHolder.InputFieldVH;
import ru.ozon.app.android.session.databinding.ItemAuthFieldInputBinding;
import ru.ozon.app.android.uikit.text.OzonPhoneNumberFormattingTextWatcher;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/session/auth/presentation/viewHolder/InputFieldVH;", "Lru/ozon/app/android/session/auth/presentation/viewHolder/FieldVH;", "containerView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "binding", "Lru/ozon/app/android/session/databinding/ItemAuthFieldInputBinding;", "dp16", "", "currentItem", "Lru/ozon/app/android/session/auth/data/AuthVO$Input;", "textWatcher", "Lru/ozon/uni/android/uikit/common/SimpleTextWatcher;", "phoneTextWatcher", "Lru/ozon/app/android/uikit/text/OzonPhoneNumberFormattingTextWatcher;", "onFocusChangedListener", "Landroid/view/View$OnFocusChangeListener;", "bind", "", "item", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InputFieldVH extends FieldVH {

    @NotNull
    private final ItemAuthFieldInputBinding binding;
    private AuthVO.Input currentItem;
    private final int dp16;

    @NotNull
    private final View.OnFocusChangeListener onFocusChangedListener;

    @NotNull
    private final OzonPhoneNumberFormattingTextWatcher phoneTextWatcher;

    @NotNull
    private final SimpleTextWatcher textWatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputFieldVH(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        ItemAuthFieldInputBinding bind = ItemAuthFieldInputBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.dp16 = ResourceExtKt.toDp(16);
        this.textWatcher = new SimpleTextWatcher() { // from class: ru.ozon.app.android.session.auth.presentation.viewHolder.InputFieldVH$textWatcher$1
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                AuthVO.Input input;
                ItemAuthFieldInputBinding itemAuthFieldInputBinding;
                Intrinsics.checkNotNullParameter(editable, "editable");
                input = InputFieldVH.this.currentItem;
                if (input != null) {
                    InputFieldVH inputFieldVH = InputFieldVH.this;
                    Function1<FieldAction, Unit> onAction = inputFieldVH.getOnAction();
                    if (onAction != null) {
                        onAction.invoke(new FieldAction.TextChanged(input, editable.toString()));
                    }
                    itemAuthFieldInputBinding = inputFieldVH.binding;
                    TextInputLayout textInputLayout = itemAuthFieldInputBinding.fieldTil;
                    textInputLayout.Z(null);
                    textInputLayout.a0(false);
                    textInputLayout.P(0);
                }
            }
        };
        this.phoneTextWatcher = new OzonPhoneNumberFormattingTextWatcher(false, 1, null);
        this.onFocusChangedListener = new View.OnFocusChangeListener() { // from class: pJ.a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                InputFieldVH.onFocusChangedListener$lambda$1(InputFieldVH.this, view, z11);
            }
        };
        final TextInputEditText fieldEt = bind.fieldEt;
        Intrinsics.checkNotNullExpressionValue(fieldEt, "fieldEt");
        fieldEt.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ru.ozon.app.android.session.auth.presentation.viewHolder.InputFieldVH$special$$inlined$setOnDoneClickListener$1
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
    public static final void onFocusChangedListener$lambda$1(InputFieldVH inputFieldVH, View view, boolean z11) {
        Function1<FieldAction, Unit> onAction;
        AuthVO.Input input = inputFieldVH.currentItem;
        if (input == null || !z11 || (onAction = inputFieldVH.getOnAction()) == null) {
            return;
        }
        onAction.invoke(new FieldAction.SetFocus(input));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // ru.ozon.app.android.session.auth.presentation.viewHolder.FieldVH
    public void bind(@NotNull AuthVO.Input item) {
        int i11;
        Intrinsics.checkNotNullParameter(item, "item");
        this.currentItem = item;
        ItemAuthFieldInputBinding itemAuthFieldInputBinding = this.binding;
        itemAuthFieldInputBinding.fieldEt.setOnFocusChangeListener(null);
        itemAuthFieldInputBinding.fieldEt.removeTextChangedListener(this.textWatcher);
        itemAuthFieldInputBinding.fieldEt.removeTextChangedListener(this.phoneTextWatcher);
        TextInputEditText textInputEditText = itemAuthFieldInputBinding.fieldEt;
        String type = item.getType();
        String str = "text";
        switch (type.hashCode()) {
            case 3556653:
                if (type.equals("text")) {
                    i11 = 16385;
                    break;
                }
                i11 = 1;
                break;
            case 96619420:
                if (type.equals(Scopes.EMAIL)) {
                    i11 = 33;
                    break;
                }
                i11 = 1;
                break;
            case 106642798:
                if (type.equals("phone")) {
                    itemAuthFieldInputBinding.fieldEt.addTextChangedListener(this.phoneTextWatcher);
                    i11 = 3;
                    break;
                }
                i11 = 1;
                break;
            case 1216985755:
                if (type.equals("password")) {
                    i11 = UserVerificationMethods.USER_VERIFY_PATTERN;
                    break;
                }
                i11 = 1;
                break;
            default:
                i11 = 1;
                break;
        }
        textInputEditText.setInputType(i11);
        itemAuthFieldInputBinding.fieldEt.setText(item.getValue());
        itemAuthFieldInputBinding.fieldEt.setImeOptions(item.getImeOptions());
        String error = item.getError();
        if (error != null) {
            itemAuthFieldInputBinding.fieldTil.Z(error);
            itemAuthFieldInputBinding.fieldTil.P(this.dp16);
        } else {
            itemAuthFieldInputBinding.fieldTil.a0(false);
            itemAuthFieldInputBinding.fieldTil.P(0);
            Unit unit = Unit.f71690a;
        }
        itemAuthFieldInputBinding.fieldTil.d0(item.getPlaceholder());
        if (item.getRequestFocus()) {
            TextInputEditText fieldEt = itemAuthFieldInputBinding.fieldEt;
            Intrinsics.checkNotNullExpressionValue(fieldEt, "fieldEt");
            showKeyboardDelayed(fieldEt);
            TextInputEditText textInputEditText2 = itemAuthFieldInputBinding.fieldEt;
            Editable text = textInputEditText2.getText();
            textInputEditText2.setSelection(text != null ? text.length() : 0);
            itemAuthFieldInputBinding.fieldEt.requestFocus();
        }
        itemAuthFieldInputBinding.fieldEt.addTextChangedListener(this.textWatcher);
        itemAuthFieldInputBinding.fieldEt.setOnFocusChangeListener(this.onFocusChangedListener);
        TextInputEditText textInputEditText3 = itemAuthFieldInputBinding.fieldEt;
        String type2 = item.getType();
        int hashCode = type2.hashCode();
        if (hashCode != 96619420) {
            if (hashCode != 106642798) {
                if (hashCode == 1216985755 && type2.equals("password")) {
                    str = "password";
                }
            } else if (type2.equals("phone")) {
                str = "phone";
            }
        } else if (type2.equals(Scopes.EMAIL)) {
            str = Scopes.EMAIL;
        }
        textInputEditText3.setContentDescription(str);
    }
}
