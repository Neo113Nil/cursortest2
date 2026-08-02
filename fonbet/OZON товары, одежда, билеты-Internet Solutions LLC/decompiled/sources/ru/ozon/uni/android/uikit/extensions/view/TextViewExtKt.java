package ru.ozon.uni.android.uikit.extensions.view;

import android.graphics.drawable.Drawable;
import android.widget.EditText;
import android.widget.TextView;
import androidx.vectordrawable.graphics.drawable.e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\n\u001a\u0011\u0010\f\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0011\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u0013\u001a\u00020\u0003*\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0017\u001a\u00020\u0003*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroid/widget/TextView;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "setTextOrGone", "(Landroid/widget/TextView;Ljava/lang/CharSequence;)V", "", "(Landroid/widget/TextView;Ljava/lang/Integer;)V", "resourceId", "setVectorDrawableStart", "(Landroid/widget/TextView;I)V", "setVectorDrawableEnd", "clearVectorDrawables", "(Landroid/widget/TextView;)V", "Lcom/google/android/material/textfield/TextInputLayout;", "", "errorText", "showError", "(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;)V", "hideError", "(Lcom/google/android/material/textfield/TextInputLayout;)V", "Landroid/widget/EditText;", "newText", "setTextWithSaveCursorPosition", "(Landroid/widget/EditText;Ljava/lang/CharSequence;)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TextViewExtKt {
    public static final void clearVectorDrawables(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public static final void hideError(@NotNull TextInputLayout textInputLayout) {
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        textInputLayout.Z(null);
        textInputLayout.a0(false);
    }

    public static final void setTextOrGone(@NotNull TextView textView, CharSequence charSequence) {
        int i11;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (charSequence != null) {
            if (h.z0(charSequence).length() <= 0) {
                charSequence = null;
            }
            if (charSequence != null) {
                textView.setText(charSequence);
                i11 = 0;
                textView.setVisibility(i11);
            }
        }
        i11 = 8;
        textView.setVisibility(i11);
    }

    public static final void setTextWithSaveCursorPosition(@NotNull EditText editText, @NotNull CharSequence newText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(newText, "newText");
        int min = Math.min(editText.getSelectionStart(), newText.length());
        editText.setText(newText);
        editText.setSelection(min);
    }

    public static final void setVectorDrawableEnd(@NotNull TextView textView, int i11) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        e a11 = e.a(textView.getResources(), i11, textView.getContext().getTheme());
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        Intrinsics.checkNotNullExpressionValue(compoundDrawables, "getCompoundDrawables(...)");
        textView.setCompoundDrawablesWithIntrinsicBounds(compoundDrawables[0], compoundDrawables[1], a11, compoundDrawables[3]);
    }

    public static final void setVectorDrawableStart(@NotNull TextView textView, int i11) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        e a11 = e.a(textView.getResources(), i11, textView.getContext().getTheme());
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        Intrinsics.checkNotNullExpressionValue(compoundDrawables, "getCompoundDrawables(...)");
        textView.setCompoundDrawablesWithIntrinsicBounds(a11, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }

    public static final void showError(@NotNull TextInputLayout textInputLayout, @NotNull String errorText) {
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        Intrinsics.checkNotNullParameter(errorText, "errorText");
        textInputLayout.Z(errorText);
        textInputLayout.a0(true);
    }

    public static final void setTextOrGone(@NotNull TextView textView, Integer num) {
        int i11;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (num != null) {
            textView.setText(num.intValue());
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
    }
}
