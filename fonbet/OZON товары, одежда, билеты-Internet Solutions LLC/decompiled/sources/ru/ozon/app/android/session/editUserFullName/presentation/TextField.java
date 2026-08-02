package ru.ozon.app.android.session.editUserFullName.presentation;

import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/session/editUserFullName/presentation/TextField;", "", "Lcom/google/android/material/textfield/TextInputEditText;", "textInputEditText", "Lcom/google/android/material/textfield/TextInputLayout;", "textInputLayout", "Landroid/text/TextWatcher;", "textWatcher", "<init>", "(Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputLayout;Landroid/text/TextWatcher;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/android/material/textfield/TextInputEditText;", "getTextInputEditText", "()Lcom/google/android/material/textfield/TextInputEditText;", "Lcom/google/android/material/textfield/TextInputLayout;", "getTextInputLayout", "()Lcom/google/android/material/textfield/TextInputLayout;", "Landroid/text/TextWatcher;", "getTextWatcher", "()Landroid/text/TextWatcher;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TextField {

    @NotNull
    private final TextInputEditText textInputEditText;

    @NotNull
    private final TextInputLayout textInputLayout;

    @NotNull
    private final TextWatcher textWatcher;

    public TextField(@NotNull TextInputEditText textInputEditText, @NotNull TextInputLayout textInputLayout, @NotNull TextWatcher textWatcher) {
        Intrinsics.checkNotNullParameter(textInputEditText, "textInputEditText");
        Intrinsics.checkNotNullParameter(textInputLayout, "textInputLayout");
        Intrinsics.checkNotNullParameter(textWatcher, "textWatcher");
        this.textInputEditText = textInputEditText;
        this.textInputLayout = textInputLayout;
        this.textWatcher = textWatcher;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextField)) {
            return false;
        }
        TextField textField = (TextField) other;
        return Intrinsics.d(this.textInputEditText, textField.textInputEditText) && Intrinsics.d(this.textInputLayout, textField.textInputLayout) && Intrinsics.d(this.textWatcher, textField.textWatcher);
    }

    @NotNull
    public final TextInputEditText getTextInputEditText() {
        return this.textInputEditText;
    }

    @NotNull
    public final TextInputLayout getTextInputLayout() {
        return this.textInputLayout;
    }

    @NotNull
    public final TextWatcher getTextWatcher() {
        return this.textWatcher;
    }

    public int hashCode() {
        return this.textWatcher.hashCode() + ((this.textInputLayout.hashCode() + (this.textInputEditText.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "TextField(textInputEditText=" + this.textInputEditText + ", textInputLayout=" + this.textInputLayout + ", textWatcher=" + this.textWatcher + ")";
    }
}
