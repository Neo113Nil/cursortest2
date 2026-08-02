package m;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.view.b;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5479a {
    public abstract void A(boolean z10);

    public abstract void B(CharSequence charSequence);

    public abstract void C(int i10);

    public abstract void D(CharSequence charSequence);

    public abstract void E(CharSequence charSequence);

    public androidx.appcompat.view.b F(b.a aVar) {
        return null;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z10);

    public abstract int i();

    public abstract Context j();

    public abstract void k();

    public boolean l() {
        return false;
    }

    public abstract boolean o(int i10, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(Drawable drawable);

    public abstract void s(boolean z10);

    public abstract void t(boolean z10);

    public abstract void u(boolean z10);

    public abstract void v(boolean z10);

    public abstract void w(int i10);

    public abstract void x(Drawable drawable);

    public abstract void y(boolean z10);

    public abstract void z(Drawable drawable);

    /* renamed from: m.a$a, reason: collision with other inner class name */
    public static class C0806a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f55919a;

        public C0806a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f55919a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.j.ActionBarLayout);
            this.f55919a = obtainStyledAttributes.getInt(l.j.f55358s, 0);
            obtainStyledAttributes.recycle();
        }

        public C0806a(int i10, int i11) {
            super(i10, i11);
            this.f55919a = 8388627;
        }

        public C0806a(C0806a c0806a) {
            super((ViewGroup.MarginLayoutParams) c0806a);
            this.f55919a = 0;
            this.f55919a = c0806a.f55919a;
        }

        public C0806a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f55919a = 0;
        }
    }

    public void n() {
    }

    public void m(Configuration configuration) {
    }
}
