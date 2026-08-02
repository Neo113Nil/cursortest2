package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import androidx.appcompat.widget.b;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pc0 extends qcb implements qc0 {
    public CharSequence C;
    public mc0 D;
    public final Rect E;
    public int F;
    public final /* synthetic */ b G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc0(b bVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.G = bVar;
        this.E = new Rect();
        this.o = bVar;
        this.y = true;
        this.z.setFocusable(true);
        this.p = new nc0(this, 0);
    }

    @Override // defpackage.qc0
    public final CharSequence e() {
        return this.C;
    }

    @Override // defpackage.qc0
    public final void g(CharSequence charSequence) {
        this.C = charSequence;
    }

    @Override // defpackage.qc0
    public final void j(int i) {
        this.F = i;
    }

    @Override // defpackage.qc0
    public final void k(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        ec0 ec0Var = this.z;
        boolean isShowing = ec0Var.isShowing();
        r();
        ec0Var.setInputMethodMode(2);
        show();
        qc5 qc5Var = this.c;
        int i3 = 1;
        qc5Var.setChoiceMode(1);
        qc5Var.setTextDirection(i);
        qc5Var.setTextAlignment(i2);
        b bVar = this.G;
        int selectedItemPosition = bVar.getSelectedItemPosition();
        qc5 qc5Var2 = this.c;
        if (ec0Var.isShowing() && qc5Var2 != null) {
            qc5Var2.setListSelectionHidden(false);
            qc5Var2.setSelection(selectedItemPosition);
            if (qc5Var2.getChoiceMode() != 0) {
                qc5Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = bVar.getViewTreeObserver()) == null) {
            return;
        }
        jc0 jc0Var = new jc0(this, i3);
        viewTreeObserver.addOnGlobalLayoutListener(jc0Var);
        ec0Var.setOnDismissListener(new oc0(this, jc0Var));
    }

    @Override // defpackage.qcb, defpackage.qc0
    public final void m(ListAdapter listAdapter) {
        super.m(listAdapter);
        this.D = (mc0) listAdapter;
    }

    public final void r() {
        int i;
        ec0 ec0Var = this.z;
        Drawable background = ec0Var.getBackground();
        b bVar = this.G;
        Rect rect = bVar.h;
        if (background != null) {
            background.getPadding(rect);
            boolean z = lvk.a;
            i = bVar.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = bVar.getPaddingLeft();
        int paddingRight = bVar.getPaddingRight();
        int width = bVar.getWidth();
        int i2 = bVar.g;
        if (i2 == -2) {
            int a = bVar.a(this.D, ec0Var.getBackground());
            int i3 = (bVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a > i3) {
                a = i3;
            }
            q(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i2);
        }
        boolean z2 = lvk.a;
        this.f = bVar.getLayoutDirection() == 1 ? (((width - paddingRight) - this.e) - this.F) + i : paddingLeft + this.F + i;
    }
}
