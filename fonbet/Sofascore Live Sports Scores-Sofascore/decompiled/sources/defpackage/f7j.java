package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class f7j implements DialogInterface.OnShowListener {
    public final /* synthetic */ EditText a;
    public final /* synthetic */ Context b;

    public f7j(EditText editText, Context context) {
        this.a = editText;
        this.b = context;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        EditText editText = this.a;
        editText.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) this.b.getSystemService(InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 1);
        }
    }
}
