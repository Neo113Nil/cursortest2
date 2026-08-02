package ru.ozon.android.messenger.blocks.input.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/android/messenger/blocks/input/views/PastePlainTextInputEditText;", "Lcom/google/android/material/textfield/TextInputEditText;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes10.dex */
public final class PastePlainTextInputEditText extends TextInputEditText {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PastePlainTextInputEditText(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i11) {
        if (i11 == 16908322) {
            i11 = android.R.id.pasteAsPlainText;
        }
        return super.onTextContextMenuItem(i11);
    }
}
