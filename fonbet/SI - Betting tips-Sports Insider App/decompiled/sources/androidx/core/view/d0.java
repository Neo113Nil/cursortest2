package androidx.core.view;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.internal.ViewUtils;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1299b;

    public /* synthetic */ d0(int i5, View view) {
        this.f1298a = i5;
        this.f1299b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1298a) {
            case 0:
                View view = this.f1299b;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            case 1:
                this.f1299b.requestLayout();
                break;
            default:
                ViewUtils.requestFocusAndShowKeyboard(this.f1299b, false);
                break;
        }
    }
}
