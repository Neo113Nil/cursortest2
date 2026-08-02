package ru.ozon.app.android.session.editUserFullName.presentation;

import android.content.Context;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.databinding.WidgetEditUserFullNameItemBinding;
import ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameVO;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/session/editUserFullName/presentation/TextFieldFactory;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO$InputVO;", "input", "Lkotlin/Function2;", "", "", "onTextChanged", "Lkotlin/Function0;", "onDoneClicked", "Lru/ozon/app/android/session/editUserFullName/presentation/TextField;", "createTextField", "(Landroid/content/Context;Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameVO$InputVO;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)Lru/ozon/app/android/session/editUserFullName/presentation/TextField;", "", "margin", "I", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TextFieldFactory {
    private final int margin = ResourceExtKt.toPx(4);

    @NotNull
    public final TextField createTextField(@NotNull Context context, @NotNull final EditUserFullNameVO.InputVO input, @NotNull final Function2<? super String, ? super String, Unit> onTextChanged, @NotNull final Function0<Unit> onDoneClicked) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(onTextChanged, "onTextChanged");
        Intrinsics.checkNotNullParameter(onDoneClicked, "onDoneClicked");
        WidgetEditUserFullNameItemBinding inflate = WidgetEditUserFullNameItemBinding.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        TextInputLayout constraintLayout = inflate.getConstraintLayout();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int i11 = this.margin;
        marginLayoutParams.topMargin = i11;
        marginLayoutParams.bottomMargin = i11;
        constraintLayout.setLayoutParams(marginLayoutParams);
        SimpleTextWatcher simpleTextWatcher = new SimpleTextWatcher() { // from class: ru.ozon.app.android.session.editUserFullName.presentation.TextFieldFactory$createTextField$textWatcher$1
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                Intrinsics.checkNotNullParameter(editable, "editable");
                onTextChanged.invoke(input.getName(), editable.toString());
            }
        };
        final TextInputEditText textInputEditText = inflate.inputEt;
        textInputEditText.addTextChangedListener(simpleTextWatcher);
        textInputEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ru.ozon.app.android.session.editUserFullName.presentation.TextFieldFactory$createTextField$lambda$1$$inlined$setOnDoneClickListener$1
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i12, KeyEvent keyEvent) {
                if (i12 != 6) {
                    return false;
                }
                Function0.this.invoke();
                InputMethodManager inputMethodManager = (InputMethodManager) textInputEditText.getContext().getSystemService("input_method");
                if (inputMethodManager != null && inputMethodManager.isActive(textInputEditText)) {
                    inputMethodManager.hideSoftInputFromWindow(textInputEditText.getWindowToken(), 0);
                }
                textInputEditText.clearFocus();
                return true;
            }
        });
        TextInputEditText inputEt = inflate.inputEt;
        Intrinsics.checkNotNullExpressionValue(inputEt, "inputEt");
        TextInputLayout constraintLayout2 = inflate.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
        return new TextField(inputEt, constraintLayout2, simpleTextWatcher);
    }
}
