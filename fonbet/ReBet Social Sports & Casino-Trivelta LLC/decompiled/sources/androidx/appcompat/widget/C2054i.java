package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* renamed from: androidx.appcompat.widget.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2054i {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f17313a;

    /* renamed from: b, reason: collision with root package name */
    public final Q0.a f17314b;

    public C2054i(EditText editText) {
        this.f17313a = editText;
        this.f17314b = new Q0.a(editText, false);
    }

    public KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f17314b.a(keyListener) : keyListener;
    }

    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public boolean c() {
        return this.f17314b.b();
    }

    public void d(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f17313a.getContext().obtainStyledAttributes(attributeSet, l.j.AppCompatTextView, i10, 0);
        try {
            boolean z10 = obtainStyledAttributes.hasValue(l.j.f55311i0) ? obtainStyledAttributes.getBoolean(l.j.f55311i0, true) : true;
            obtainStyledAttributes.recycle();
            f(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public InputConnection e(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f17314b.c(inputConnection, editorInfo);
    }

    public void f(boolean z10) {
        this.f17314b.d(z10);
    }
}
