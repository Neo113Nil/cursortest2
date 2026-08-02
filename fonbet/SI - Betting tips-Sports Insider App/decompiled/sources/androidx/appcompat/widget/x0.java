package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import com.sports.insider.R;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x0 extends s2 implements y0 {
    public CharSequence D;
    public ListAdapter E;
    public final Rect F;
    public int G;
    public final /* synthetic */ z0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(z0 z0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.H = z0Var;
        this.F = new Rect();
        this.f930o = z0Var;
        this.f939y = true;
        this.f940z.setFocusable(true);
        this.f931p = new v0(0, this);
    }

    @Override // androidx.appcompat.widget.y0
    public final CharSequence e() {
        return this.D;
    }

    @Override // androidx.appcompat.widget.y0
    public final void h(CharSequence charSequence) {
        this.D = charSequence;
    }

    @Override // androidx.appcompat.widget.y0
    public final void j(int i5) {
        this.G = i5;
    }

    @Override // androidx.appcompat.widget.y0
    public final void k(int i5, int i10) {
        ViewTreeObserver viewTreeObserver;
        j0 j0Var = this.f940z;
        boolean isShowing = j0Var.isShowing();
        p();
        j0Var.setInputMethodMode(2);
        show();
        g2 g2Var = this.f919c;
        g2Var.setChoiceMode(1);
        g2Var.setTextDirection(i5);
        g2Var.setTextAlignment(i10);
        z0 z0Var = this.H;
        int selectedItemPosition = z0Var.getSelectedItemPosition();
        g2 g2Var2 = this.f919c;
        if (j0Var.isShowing() && g2Var2 != null) {
            g2Var2.setListSelectionHidden(false);
            g2Var2.setSelection(selectedItemPosition);
            if (g2Var2.getChoiceMode() != 0) {
                g2Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = z0Var.getViewTreeObserver()) == null) {
            return;
        }
        r0 r0Var = new r0(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(r0Var);
        j0Var.setOnDismissListener(new w0(this, r0Var));
    }

    @Override // androidx.appcompat.widget.s2, androidx.appcompat.widget.y0
    public final void m(ListAdapter listAdapter) {
        super.m(listAdapter);
        this.E = listAdapter;
    }

    public final void p() {
        int i5;
        z0 z0Var = this.H;
        Rect rect = z0Var.f1032h;
        j0 j0Var = this.f940z;
        Drawable background = j0Var.getBackground();
        if (background != null) {
            background.getPadding(rect);
            boolean z5 = u4.f982a;
            i5 = z0Var.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i5 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = z0Var.getPaddingLeft();
        int paddingRight = z0Var.getPaddingRight();
        int width = z0Var.getWidth();
        int i10 = z0Var.f1031g;
        if (i10 == -2) {
            int a7 = z0Var.a((SpinnerAdapter) this.E, j0Var.getBackground());
            int i11 = (z0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a7 > i11) {
                a7 = i11;
            }
            o(Math.max(a7, (width - paddingLeft) - paddingRight));
        } else if (i10 == -1) {
            o((width - paddingLeft) - paddingRight);
        } else {
            o(i10);
        }
        boolean z7 = u4.f982a;
        this.f922f = z0Var.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f921e) - this.G) + i5 : paddingLeft + this.G + i5;
    }
}
