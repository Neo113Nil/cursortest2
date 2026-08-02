package m;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import androidx.core.view.AbstractC2114u;
import l.AbstractC5335a;

/* loaded from: classes.dex */
public class r extends androidx.activity.q implements InterfaceC5482d {

    /* renamed from: d, reason: collision with root package name */
    public AbstractC5484f f56038d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC2114u.a f56039e;

    public r(Context context, int i10) {
        super(context, f(context, i10));
        this.f56039e = new AbstractC2114u.a() { // from class: m.q
            @Override // androidx.core.view.AbstractC2114u.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return r.this.g(keyEvent);
            }
        };
        AbstractC5484f e10 = e();
        e10.Q(f(context, i10));
        e10.z(null);
    }

    private static int f(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC5335a.f55010y, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.q, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        e().e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        e().A();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC2114u.e(this.f56039e, getWindow().getDecorView(), this, keyEvent);
    }

    public AbstractC5484f e() {
        if (this.f56038d == null) {
            this.f56038d = AbstractC5484f.k(this, this);
        }
        return this.f56038d;
    }

    @Override // android.app.Dialog
    public View findViewById(int i10) {
        return e().l(i10);
    }

    public boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean h(int i10) {
        return e().I(i10);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        e().w();
    }

    @Override // androidx.activity.q, android.app.Dialog
    public void onCreate(Bundle bundle) {
        e().v();
        super.onCreate(bundle);
        e().z(bundle);
    }

    @Override // androidx.activity.q, android.app.Dialog
    public void onStop() {
        super.onStop();
        e().F();
    }

    @Override // m.InterfaceC5482d
    public androidx.appcompat.view.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    @Override // androidx.activity.q, android.app.Dialog
    public void setContentView(int i10) {
        c();
        e().K(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().R(charSequence);
    }

    @Override // androidx.activity.q, android.app.Dialog
    public void setContentView(View view) {
        c();
        e().L(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        e().R(getContext().getString(i10));
    }

    @Override // androidx.activity.q, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        e().M(view, layoutParams);
    }

    @Override // m.InterfaceC5482d
    public void onSupportActionModeFinished(androidx.appcompat.view.b bVar) {
    }

    @Override // m.InterfaceC5482d
    public void onSupportActionModeStarted(androidx.appcompat.view.b bVar) {
    }
}
