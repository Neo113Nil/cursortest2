package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class wb0 extends cc3 implements db0 {
    public ub0 e;
    public final vb0 f;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [vb0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wb0(Context context, int i) {
        super(context, r2);
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        this.f = new tia() { // from class: vb0
            @Override // defpackage.tia
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return wb0.this.e(keyEvent);
            }
        };
        kb0 d = d();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((ub0) d).T = i;
        d.f();
    }

    @Override // defpackage.cc3, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        ub0 ub0Var = (ub0) d();
        ub0Var.A();
        ((ViewGroup) ub0Var.A.findViewById(android.R.id.content)).addView(view, layoutParams);
        ub0Var.m.a(ub0Var.l.getCallback());
    }

    public final kb0 d() {
        ub0 ub0Var = this.e;
        if (ub0Var != null) {
            return ub0Var;
        }
        n5h n5hVar = kb0.a;
        ub0 ub0Var2 = new ub0(getContext(), getWindow(), this, this);
        this.e = ub0Var2;
        return ub0Var2;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        d().g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return b0a.E(this.f, getWindow().getDecorView(), this, keyEvent);
    }

    public final boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        ub0 ub0Var = (ub0) d();
        ub0Var.A();
        return ub0Var.l.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().d();
    }

    @Override // defpackage.cc3, android.app.Dialog
    public void onCreate(Bundle bundle) {
        ub0 ub0Var = (ub0) d();
        LayoutInflater from = LayoutInflater.from(ub0Var.k);
        if (from.getFactory() == null) {
            from.setFactory2(ub0Var);
        } else {
            from.getFactory2();
        }
        super.onCreate(bundle);
        d().f();
    }

    @Override // defpackage.cc3, android.app.Dialog
    public final void onStop() {
        super.onStop();
        ub0 ub0Var = (ub0) d();
        ub0Var.F();
        o02 o02Var = ub0Var.n;
        if (o02Var != null) {
            o02Var.s0(false);
        }
    }

    @Override // defpackage.cc3, android.app.Dialog
    public void setContentView(int i) {
        b();
        d().k(i);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        d().o(getContext().getString(i));
    }

    @Override // defpackage.cc3, android.app.Dialog
    public void setContentView(View view) {
        b();
        d().l(view);
    }

    @Override // defpackage.cc3, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        d().m(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().o(charSequence);
    }
}
