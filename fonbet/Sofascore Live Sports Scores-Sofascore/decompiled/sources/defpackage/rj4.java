package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.ironsource.U2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class rj4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ rj4(int i, View view) {
        this.a = i;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                view.requestFocus();
                view.post(new rj4(5, view));
                break;
            case 1:
                view.setVisibility(0);
                break;
            case 2:
                view.setVisibility(8);
                break;
            case 3:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            case 4:
                U2.a.a(view);
                break;
            default:
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                break;
        }
    }
}
