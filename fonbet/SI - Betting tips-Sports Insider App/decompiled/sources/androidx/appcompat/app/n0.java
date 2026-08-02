package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class n0 extends e.l implements p {
    private v mDelegate;
    private final androidx.core.view.m mKeyDispatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(Context context, boolean z5, DialogInterface.OnCancelListener onCancelListener) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mKeyDispatcher = new androidx.core.view.m() { // from class: androidx.appcompat.app.m0
            @Override // androidx.core.view.m
            public final boolean e(KeyEvent keyEvent) {
                return n0.this.superDispatchKeyEvent(keyEvent);
            }
        };
        setCancelable(z5);
        setOnCancelListener(onCancelListener);
    }

    @Override // e.l, android.app.Dialog
    public void addContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        l0 l0Var = (l0) getDelegate();
        l0Var.t();
        ((ViewGroup) l0Var.A.findViewById(R.id.content)).addView(view, layoutParams);
        l0Var.f307m.a(l0Var.f305l.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        getDelegate().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return rh.g.h(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i5) {
        l0 l0Var = (l0) getDelegate();
        l0Var.t();
        return (T) l0Var.f305l.findViewById(i5);
    }

    @NonNull
    public v getDelegate() {
        if (this.mDelegate == null) {
            k2.a0 a0Var = v.f353a;
            this.mDelegate = new l0(getContext(), getWindow(), this, this);
        }
        return this.mDelegate;
    }

    public a getSupportActionBar() {
        l0 l0Var = (l0) getDelegate();
        l0Var.y();
        return l0Var.f311o;
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        l0 l0Var = (l0) getDelegate();
        if (l0Var.f311o != null) {
            l0Var.y();
            l0Var.f311o.getClass();
            l0Var.z(0);
        }
    }

    @Override // e.l, android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().a();
        super.onCreate(bundle);
        getDelegate().c();
    }

    @Override // e.l, android.app.Dialog
    public void onStop() {
        super.onStop();
        l0 l0Var = (l0) getDelegate();
        l0Var.y();
        y0 y0Var = l0Var.f311o;
        if (y0Var != null) {
            y0Var.f399t = false;
            n.j jVar = y0Var.f398s;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // androidx.appcompat.app.p
    public n.b onWindowStartingSupportActionMode(n.a aVar) {
        return null;
    }

    @Override // e.l, android.app.Dialog
    public void setContentView(int i5) {
        initializeViewTreeOwners();
        getDelegate().g(i5);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().j(charSequence);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean supportRequestWindowFeature(int i5) {
        return getDelegate().f(i5);
    }

    @Override // e.l, android.app.Dialog
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().h(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i5) {
        super.setTitle(i5);
        getDelegate().j(getContext().getString(i5));
    }

    @Override // e.l, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().i(view, layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n0(Context context, int i5) {
        super(context, r2);
        int i10;
        if (i5 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.sports.insider.R.attr.dialogTheme, typedValue, true);
            i10 = typedValue.resourceId;
        } else {
            i10 = i5;
        }
        this.mKeyDispatcher = new androidx.core.view.m() { // from class: androidx.appcompat.app.m0
            @Override // androidx.core.view.m
            public final boolean e(KeyEvent keyEvent) {
                return n0.this.superDispatchKeyEvent(keyEvent);
            }
        };
        v delegate = getDelegate();
        if (i5 == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(com.sports.insider.R.attr.dialogTheme, typedValue2, true);
            i5 = typedValue2.resourceId;
        }
        ((l0) delegate).k0 = i5;
        delegate.c();
    }

    @Override // androidx.appcompat.app.p
    public void onSupportActionModeFinished(n.b bVar) {
    }

    @Override // androidx.appcompat.app.p
    public void onSupportActionModeStarted(n.b bVar) {
    }
}
