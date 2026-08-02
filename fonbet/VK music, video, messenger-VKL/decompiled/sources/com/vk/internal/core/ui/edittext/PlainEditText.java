package com.vk.internal.core.ui.edittext;

import android.R;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.Spanned;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import xsna.gz80;

/* compiled from: PlainEditText.kt */
/* loaded from: classes2.dex */
public class PlainEditText extends AppCompatEditText {
    public PlainEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        ClipData clipData;
        if (i == 16908322) {
            if (gz80.a(23)) {
                i = R.id.pasteAsPlainText;
            } else {
                ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
                ClipDescription clipDescription = null;
                try {
                    clipData = clipboardManager.getPrimaryClip();
                } catch (Throwable unused) {
                    clipData = null;
                }
                try {
                    clipDescription = clipboardManager.getPrimaryClipDescription();
                } catch (Throwable unused2) {
                }
                if (clipData != null && clipDescription != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i2 = 0; i2 < itemCount; i2++) {
                        CharSequence coerceToText = clipData.getItemAt(i2).coerceToText(getContext());
                        if ((coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText) != null) {
                            clipboardManager.setPrimaryClip(ClipData.newPlainText(clipDescription.getLabel(), coerceToText));
                        }
                    }
                }
            }
        }
        return super.onTextContextMenuItem(i);
    }

    public PlainEditText(Context context, AttributeSet attributeSet, Object obj) {
        super(context, attributeSet, com.vkontakte.android.R.attr.editTextStyle);
    }
}
