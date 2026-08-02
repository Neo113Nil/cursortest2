package ru.ozon.app.android.session.editUserFullName.presentation;

import android.text.TextWatcher;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameVO;
import ru.ozon.app.android.utils.KeyboardUtilsKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0014\u0010\n\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002J\u001c\u0010\n\u001a\u00020\u0005*\u00020\f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/session/editUserFullName/presentation/TextFieldBinder;", "", "<init>", "()V", "bindTextField", "", "textFiled", "Lru/ozon/app/android/session/editUserFullName/presentation/TextField;", "input", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO$InputVO;", "bind", "Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/google/android/material/textfield/TextInputEditText;", "textWatcher", "Landroid/text/TextWatcher;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldBinder {
    private final void bind(TextInputLayout textInputLayout, EditUserFullNameVO.InputVO inputVO) {
        textInputLayout.d0(inputVO.getPlaceholder());
        textInputLayout.Z(inputVO.getErrorMessage());
    }

    public final void bindTextField(@NotNull TextField textFiled, @NotNull EditUserFullNameVO.InputVO input) {
        Intrinsics.checkNotNullParameter(textFiled, "textFiled");
        Intrinsics.checkNotNullParameter(input, "input");
        bind(textFiled.getTextInputEditText(), input, textFiled.getTextWatcher());
        bind(textFiled.getTextInputLayout(), input);
    }

    private final void bind(final TextInputEditText textInputEditText, EditUserFullNameVO.InputVO inputVO, TextWatcher textWatcher) {
        if (inputVO.getShouldBindValue()) {
            textInputEditText.removeTextChangedListener(textWatcher);
            textInputEditText.setText(inputVO.getValue());
            textInputEditText.addTextChangedListener(textWatcher);
        }
        textInputEditText.setImeOptions(inputVO.getImeOptions());
        if (inputVO.getShouldRequestFocusAndOpenKeyboard()) {
            String value = inputVO.getValue();
            if (value != null) {
                textInputEditText.setSelection(value.length());
            }
            if (textInputEditText.isLaidOut() && !textInputEditText.isLayoutRequested()) {
                textInputEditText.requestFocus();
                KeyboardUtilsKt.showKeyboard(textInputEditText);
            } else {
                textInputEditText.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.session.editUserFullName.presentation.TextFieldBinder$bind$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view.removeOnLayoutChangeListener(this);
                        TextInputEditText.this.requestFocus();
                        KeyboardUtilsKt.showKeyboard(TextInputEditText.this);
                    }
                });
            }
        }
    }
}
