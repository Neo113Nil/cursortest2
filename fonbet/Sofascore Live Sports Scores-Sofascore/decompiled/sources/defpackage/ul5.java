package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ul5 extends al5 implements Runnable {
    public final WeakReference a;

    public ul5(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // defpackage.al5
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.a.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        vl5.a((EditText) this.a.get(), 1);
    }
}
