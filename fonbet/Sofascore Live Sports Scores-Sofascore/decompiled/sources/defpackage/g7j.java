package defpackage;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class g7j implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ EditText b;
    public final /* synthetic */ Object c;

    public g7j(JsPromptResult jsPromptResult, EditText editText) {
        this.c = jsPromptResult;
        this.b = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Object obj = this.c;
        EditText editText = this.b;
        switch (i2) {
            case 0:
                String obj2 = editText.getText().toString();
                lj2 lj2Var = (lj2) obj;
                if (lj2Var.r() instanceof oed) {
                    if (!c.v(obj2, "http", false)) {
                        obj2 = "https://".concat(obj2);
                    }
                    p2g p2gVar = w2g.b;
                    lj2Var.resumeWith(obj2);
                    break;
                }
                break;
            default:
                ((JsPromptResult) obj).confirm(editText.getText().toString());
                break;
        }
    }

    public g7j(EditText editText, lj2 lj2Var) {
        this.b = editText;
        this.c = lj2Var;
    }
}
