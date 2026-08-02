package ma;

import Aa.i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.a0;
import androidx.core.view.F0;
import com.google.android.material.navigation.NavigationBarView;
import ia.l;
import ia.m;
import xa.o;

/* loaded from: classes3.dex */
public class c extends NavigationBarView {

    public class a implements o.c {
        public a() {
        }

        @Override // xa.o.c
        public F0 a(View view, F0 f02, o.d dVar) {
            dVar.f68091d += f02.j();
            boolean z10 = view.getLayoutDirection() == 1;
            int k10 = f02.k();
            int l10 = f02.l();
            dVar.f68088a += z10 ? l10 : k10;
            int i10 = dVar.f68090c;
            if (!z10) {
                k10 = l10;
            }
            dVar.f68090c = i10 + k10;
            dVar.a(view);
            return f02;
        }
    }

    public interface b extends NavigationBarView.b {
    }

    /* renamed from: ma.c$c, reason: collision with other inner class name */
    public interface InterfaceC0816c extends NavigationBarView.c {
    }

    public c(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public i c(Context context) {
        return new ma.b(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 6;
    }

    public final void j() {
        o.c(this, new a());
    }

    public final int k(int i10) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i10) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i10;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), Integer.MIN_VALUE);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, k(i11));
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom()));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        ma.b bVar = (ma.b) getMenuView();
        if (bVar.v() != z10) {
            bVar.setItemHorizontalTranslationEnabled(z10);
            getPresenter().g(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(b bVar) {
        setOnItemReselectedListener(bVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(InterfaceC0816c interfaceC0816c) {
        setOnItemSelectedListener(interfaceC0816c);
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ia.c.f48226c);
    }

    public c(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, l.f48574m);
    }

    public c(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a0 j10 = xa.l.j(getContext(), attributeSet, m.BottomNavigationView, i10, i11, new int[0]);
        setItemHorizontalTranslationEnabled(j10.a(m.f48881e0, true));
        if (j10.s(m.f48871d0)) {
            setMinimumHeight(j10.f(m.f48871d0, 0));
        }
        j10.x();
        j();
    }
}
