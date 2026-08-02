package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.view;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.databinding.TextInputWithErrorBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormVO;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/view/B2BTextWithErrorInputLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/app/android/fresh/feature/b2b/databinding/TextInputWithErrorBinding;", "bind", "", "item", "Lru/ozon/app/android/fresh/feature/b2b/widgets/docsdeliveryform/presentation/DocsDeliveryFormVO$Input$TextInput;", "bindError", "error", "", "setText", "newValue", "setInputEnabled", "enabled", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B2BTextWithErrorInputLayout extends LinearLayout {

    @NotNull
    private final TextInputWithErrorBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public B2BTextWithErrorInputLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bind(@NotNull DocsDeliveryFormVO.Input.TextInput item) {
        Intrinsics.checkNotNullParameter(item, "item");
        setText(item.getValue());
        setInputEnabled(item.getIsEnabled());
        this.binding.inputTIL.setHint(item.getPlaceholder());
        bindError(item.getError());
    }

    public final void bindError(String error) {
        TextInputWithErrorBinding textInputWithErrorBinding = this.binding;
        if (error == null) {
            textInputWithErrorBinding.inputTIL.setShowError(false);
            AppCompatTextView inputTextErrorTV = textInputWithErrorBinding.inputTextErrorTV;
            Intrinsics.checkNotNullExpressionValue(inputTextErrorTV, "inputTextErrorTV");
            ViewExtKt.gone(inputTextErrorTV);
            return;
        }
        textInputWithErrorBinding.inputTIL.setShowError(true);
        if (h.K(error)) {
            return;
        }
        textInputWithErrorBinding.inputTextErrorTV.setText(error);
        AppCompatTextView inputTextErrorTV2 = textInputWithErrorBinding.inputTextErrorTV;
        Intrinsics.checkNotNullExpressionValue(inputTextErrorTV2, "inputTextErrorTV");
        ViewExtKt.show(inputTextErrorTV2);
    }

    public final void setInputEnabled(boolean enabled) {
        TextInputWithErrorBinding textInputWithErrorBinding = this.binding;
        textInputWithErrorBinding.inputET.setEnabled(enabled);
        textInputWithErrorBinding.inputTIL.setEnabled(enabled);
    }

    public final void setText(String newValue) {
        AppCompatEditText appCompatEditText = this.binding.inputET;
        Editable text = appCompatEditText.getText();
        if (Intrinsics.d(text != null ? text.toString() : null, newValue)) {
            return;
        }
        appCompatEditText.setText(newValue);
        appCompatEditText.setSelection(newValue != null ? newValue.length() : 0);
    }

    public /* synthetic */ B2BTextWithErrorInputLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B2BTextWithErrorInputLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = TextInputWithErrorBinding.inflate(LayoutInflater.from(context), this);
        setOrientation(1);
    }
}
