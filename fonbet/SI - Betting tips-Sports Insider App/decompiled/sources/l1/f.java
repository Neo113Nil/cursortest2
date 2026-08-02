package l1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.app.v0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f19325a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.hints.j f19326b;

    public f(KeyListener keyListener) {
        io.sentry.hints.j jVar = new io.sentry.hints.j(27);
        this.f19325a = keyListener;
        this.f19326b = jVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i5) {
        this.f19325a.clearMetaKeyState(view, editable, i5);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f19325a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i5, KeyEvent keyEvent) {
        boolean z5;
        this.f19326b.getClass();
        if (i5 != 67 ? i5 != 112 ? false : v0.e(editable, keyEvent, true) : v0.e(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z5 = true;
        } else {
            z5 = false;
        }
        return z5 || this.f19325a.onKeyDown(view, editable, i5, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f19325a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i5, KeyEvent keyEvent) {
        return this.f19325a.onKeyUp(view, editable, i5, keyEvent);
    }
}
