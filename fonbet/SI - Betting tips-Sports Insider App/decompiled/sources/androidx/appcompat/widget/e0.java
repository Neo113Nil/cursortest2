package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f735a;

    /* renamed from: b, reason: collision with root package name */
    public final i2.d f736b;

    public e0(EditText editText) {
        this.f735a = editText;
        this.f736b = new i2.d(editText);
    }

    public final KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((l1.a) this.f736b.f10882b).getClass();
        if (keyListener instanceof l1.f) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new l1.f(keyListener);
    }

    public final void b(AttributeSet attributeSet, int i5) {
        TypedArray obtainStyledAttributes = this.f735a.getContext().obtainStyledAttributes(attributeSet, i.a.f10838i, i5, 0);
        try {
            boolean z5 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            d(z5);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final l1.c c(InputConnection inputConnection, EditorInfo editorInfo) {
        i2.d dVar = this.f736b;
        if (inputConnection == null) {
            dVar.getClass();
            inputConnection = null;
        } else {
            l1.a aVar = (l1.a) dVar.f10882b;
            aVar.getClass();
            if (!(inputConnection instanceof l1.c)) {
                inputConnection = new l1.c((EditText) aVar.f19314b, inputConnection, editorInfo);
            }
        }
        return (l1.c) inputConnection;
    }

    public final void d(boolean z5) {
        l1.j jVar = (l1.j) ((l1.a) this.f736b.f10882b).f19315c;
        if (jVar.f19334c != z5) {
            if (jVar.f19333b != null) {
                j1.j a7 = j1.j.a();
                l1.i iVar = jVar.f19333b;
                a7.getClass();
                rh.g.e(iVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a7.f18202a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a7.f18203b.remove(iVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            jVar.f19334c = z5;
            if (z5) {
                l1.j.a(jVar.f19332a, j1.j.a().b());
            }
        }
    }
}
