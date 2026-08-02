package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: androidx.appcompat.widget.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2060o extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f17350b = false;

    /* renamed from: a, reason: collision with root package name */
    public boolean f17351a;

    public C2060o(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    public final void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        a0 v10 = a0.v(context, attributeSet, l.j.PopupWindow, i10, i11);
        if (v10.s(l.j.f55176C1)) {
            b(v10.a(l.j.f55176C1, false));
        }
        setBackgroundDrawable(v10.g(l.j.f55172B1));
        v10.x();
    }

    public final void b(boolean z10) {
        if (f17350b) {
            this.f17351a = z10;
        } else {
            C0.i.a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f17350b && this.f17351a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f17350b && this.f17351a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f17350b && this.f17351a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}
