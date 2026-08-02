package Ja;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f6015a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.material.textfield.a f6016b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f6017c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f6018d;

    public s(com.google.android.material.textfield.a aVar) {
        this.f6015a = aVar.f36329a;
        this.f6016b = aVar;
        this.f6017c = aVar.getContext();
        this.f6018d = aVar.r();
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return null;
    }

    public boolean i(int i10) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return false;
    }

    public final void r() {
        this.f6016b.L(false);
    }

    public boolean t() {
        return false;
    }

    public void s() {
    }

    public void u() {
    }

    public void a(Editable editable) {
    }

    public void n(EditText editText) {
    }

    public void q(boolean z10) {
    }

    public void o(View view, y0.z zVar) {
    }

    public void p(View view, AccessibilityEvent accessibilityEvent) {
    }

    public void b(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
