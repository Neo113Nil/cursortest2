package Q0;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f9183a;

    /* renamed from: b, reason: collision with root package name */
    public int f9184b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f9185c = 0;

    /* renamed from: Q0.a$a, reason: collision with other inner class name */
    public static class C0179a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final EditText f9186a;

        /* renamed from: b, reason: collision with root package name */
        public final g f9187b;

        public C0179a(EditText editText, boolean z10) {
            this.f9186a = editText;
            g gVar = new g(editText, z10);
            this.f9187b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(Q0.b.getInstance());
        }

        @Override // Q0.a.b
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // Q0.a.b
        public boolean b() {
            return this.f9187b.b();
        }

        @Override // Q0.a.b
        public InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f9186a, inputConnection, editorInfo);
        }

        @Override // Q0.a.b
        public void d(boolean z10) {
            this.f9187b.d(z10);
        }
    }

    public static class b {
        public abstract KeyListener a(KeyListener keyListener);

        public abstract boolean b();

        public abstract InputConnection c(InputConnection inputConnection, EditorInfo editorInfo);

        public abstract void d(boolean z10);
    }

    public a(EditText editText, boolean z10) {
        x0.f.h(editText, "editText cannot be null");
        this.f9183a = new C0179a(editText, z10);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f9183a.a(keyListener);
    }

    public boolean b() {
        return this.f9183a.b();
    }

    public InputConnection c(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f9183a.c(inputConnection, editorInfo);
    }

    public void d(boolean z10) {
        this.f9183a.d(z10);
    }
}
