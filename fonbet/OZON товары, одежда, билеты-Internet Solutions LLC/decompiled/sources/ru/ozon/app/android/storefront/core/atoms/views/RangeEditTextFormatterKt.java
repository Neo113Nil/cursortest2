package ru.ozon.app.android.storefront.core.atoms.views;

import android.widget.EditText;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"setTextWithSelection", "", "Landroid/widget/EditText;", "text", "", "atoms_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RangeEditTextFormatterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTextWithSelection(EditText editText, String str) {
        editText.setText(str);
        editText.setSelection(str.length());
    }
}
