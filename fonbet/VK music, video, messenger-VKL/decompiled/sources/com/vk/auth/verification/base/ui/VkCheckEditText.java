package com.vk.auth.verification.base.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.brm0;
import xsna.d3j0;
import xsna.e43;
import xsna.erm0;
import xsna.f4m;
import xsna.gqh0;
import xsna.hnj;
import xsna.i1x;
import xsna.j5g;
import xsna.l090;
import xsna.o1x;
import xsna.p490;
import xsna.vm9;
import xsna.xju0;

/* compiled from: VkCheckEditText.kt */
/* loaded from: classes15.dex */
public final class VkCheckEditText extends LinearLayout implements i1x {
    public final RecyclerView b;
    public final TextView c;
    public final TextView d;
    public final vm9 e;
    public boolean f;
    public final xju0 g;

    /* compiled from: VkCheckEditText.kt */
    public static final class a extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean canScrollHorizontally() {
            return false;
        }
    }

    public VkCheckEditText(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), attributeSet, 0, 0);
        this.e = new vm9(1);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.vk_auth_check_edit_text_view, (ViewGroup) this, true);
        TextView textView = new TextView(getContext());
        this.c = textView;
        f4m.j(textView);
        this.d = (TextView) inflate.findViewById(R.id.edit_text_error);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler);
        this.b = recyclerView;
        xju0 xju0Var = new xju0(this, new l090(context), new gqh0(this, 24), new d3j0(this, 23));
        this.g = xju0Var;
        recyclerView.setAdapter(xju0Var);
        getContext();
        recyclerView.setLayoutManager(new a(0, false));
        setOrientation(1);
    }

    private final int getDigitsCount() {
        return this.g.g;
    }

    private final List<o1x> getInputControllers() {
        ArrayList arrayList = new ArrayList();
        int digitsCount = getDigitsCount();
        for (int i = 0; i < digitsCount; i++) {
            arrayList.add(d(i));
        }
        return arrayList;
    }

    @Override // xsna.i1x
    public final void a(int i, String str, boolean z) {
        String D0;
        int i2 = 0;
        vm9 vm9Var = this.e;
        if (z || c(i, str).length() > 1) {
            if (z || !vm9Var.h(i)) {
                D0 = erm0.D0(getDigitsCount() - i, str);
            } else {
                o1x d = d(i);
                D0 = p490.l(getDigitsCount() - i, (d != null ? d.N1() : 0) == str.length() ? erm0.v0(1, str) : erm0.w0(1, str));
            }
            vm9Var.getClass();
            int i3 = 0;
            while (i2 < D0.length()) {
                ((Character[]) vm9Var.c)[i3 + i] = Character.valueOf(D0.charAt(i2));
                i2++;
                i3++;
            }
            g(i, D0);
            f(Math.min(D0.length() + i, getDigitsCount() - 1));
        } else if (str.length() == 0) {
            f(i);
            boolean h = vm9Var.h(i);
            Character[] chArr = (Character[]) vm9Var.c;
            if (h) {
                vm9Var.i(i);
                chArr[i] = null;
            } else {
                int i4 = i - 1;
                if (vm9Var.h(i4)) {
                    vm9Var.i(i4);
                    chArr[i4] = null;
                }
            }
        } else if (c(i, str).length() == 1 && vm9Var.h(i)) {
            String c = c(i, str);
            if (c.length() != 1) {
                throw new IllegalStateException("New text must contain a maximum of 1 new character.");
            }
            char charAt = c.charAt(0);
            vm9Var.i(i);
            ((Character[]) vm9Var.c)[i] = Character.valueOf(charAt);
            o1x d2 = d(i);
            if (d2 != null) {
                d2.l2(c);
            }
            f(i + 1);
        } else if (str.length() == 1) {
            if (str.length() != 1) {
                throw new IllegalStateException("EditText supports appending of only one character at a time.");
            }
            char charAt2 = str.charAt(0);
            vm9Var.i(i);
            ((Character[]) vm9Var.c)[i] = Character.valueOf(charAt2);
            f(i + 1);
        }
        this.c.setText(vm9Var.toString());
        if (this.f) {
            e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // xsna.i1x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i) {
        boolean z;
        o1x d;
        vm9 vm9Var = this.e;
        if (i < 0) {
            vm9Var.getClass();
        } else if (i <= ((Character[]) vm9Var.c).length - 1) {
            z = true;
            if (z) {
                return;
            }
            if (i <= 0 || vm9Var.h(i)) {
                if (!vm9Var.h(i) || (d = d(i)) == null) {
                    return;
                }
                d.l2("");
                return;
            }
            o1x d2 = d(i - 1);
            if (d2 != null) {
                d2.l2("");
                return;
            }
            return;
        }
        z = false;
        if (z) {
        }
    }

    public final String c(int i, String str) {
        vm9 vm9Var = this.e;
        vm9Var.i(i);
        Character ch = ((Character[]) vm9Var.c)[i];
        return ch != null ? brm0.A(str, String.valueOf(ch.charValue()), "") : str;
    }

    public final o1x d(int i) {
        Object findViewHolderForAdapterPosition = this.b.findViewHolderForAdapterPosition(i);
        if (findViewHolderForAdapterPosition instanceof o1x) {
            return (o1x) findViewHolderForAdapterPosition;
        }
        return null;
    }

    public final void e() {
        this.f = false;
        TextView textView = this.d;
        f4m.j(textView);
        textView.setText((CharSequence) null);
        for (o1x o1xVar : getInputControllers()) {
            if (o1xVar != null) {
                o1xVar.e1(this.f);
            }
        }
    }

    public final void f(int i) {
        o1x d;
        if (i < 0 || i > getDigitsCount() || (d = d(i)) == null) {
            return;
        }
        d.h5();
    }

    public final void g(int i, String str) {
        int i2;
        int i3 = 0;
        if (str.length() == 0) {
            for (Object obj : getInputControllers()) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    e43.t();
                    throw null;
                }
                o1x o1xVar = (o1x) obj;
                if (i3 >= i && o1xVar != null) {
                    o1xVar.l2("");
                }
                i3 = i4;
            }
            return;
        }
        for (Object obj2 : getInputControllers()) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                e43.t();
                throw null;
            }
            o1x o1xVar2 = (o1x) obj2;
            if (o1xVar2 != null && (i2 = i3 - i) >= 0 && i2 < str.length()) {
                o1xVar2.l2(String.valueOf(str.charAt(i2)));
            }
            i3 = i5;
        }
    }

    public final View getSelectedCellView() {
        int i = 0;
        for (Object obj : j5g.y0(getInputControllers())) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            o1x o1xVar = (o1x) obj;
            if (o1xVar != null && ((o1xVar.y0() && o1xVar.q0()) || i == getDigitsCount() - 1)) {
                return o1xVar.getView();
            }
            i = i2;
        }
        return this;
    }

    public final int getSelection() {
        return 0;
    }

    public final String getText() {
        return this.c.getText().toString();
    }

    public final void h(String str) {
        TextView textView = this.d;
        textView.setText(str);
        textView.setVisibility(0);
        this.f = true;
        for (o1x o1xVar : getInputControllers()) {
            if (o1xVar != null) {
                o1xVar.e1(this.f);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        f(0);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        Iterator it = j5g.y0(getInputControllers()).iterator();
        if (!it.hasNext()) {
            return super.requestFocus(i, rect);
        }
        o1x o1xVar = (o1x) it.next();
        return o1xVar != null && o1xVar.y0() && o1xVar.q0();
    }

    public final void setDigitsNumber(int i) {
        if (i == getDigitsCount()) {
            return;
        }
        xju0 xju0Var = this.g;
        xju0Var.g = i;
        xju0Var.notifyDataSetChanged();
    }

    public final void setIsEnabled(boolean z) {
        for (o1x o1xVar : getInputControllers()) {
            if (o1xVar != null) {
                o1xVar.setEnabled(z);
            }
        }
    }

    public final void setSelection(int i) {
        f(i);
    }

    public final void setText(String str) {
        g(0, str);
    }
}
