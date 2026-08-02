package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.b0;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import com.google.android.material.navigation.d;
import com.google.android.material.navigation.f;
import i7.C7017a;
import ru.ozon.app.android.R;
import s7.C9619n;
import s7.C9621p;

/* loaded from: classes9.dex */
public class c extends f {
    static final int MAX_ITEM_COUNT = 5;

    final class a implements C9621p.c {
        @Override // s7.C9621p.c
        @NonNull
        public final C5353y0 a(View view, @NonNull C5353y0 c5353y0, @NonNull C9621p.d dVar) {
            dVar.f98350d = c5353y0.i() + dVar.f98350d;
            int i11 = Y.f42258g;
            boolean z11 = view.getLayoutDirection() == 1;
            int j11 = c5353y0.j();
            int k11 = c5353y0.k();
            int i12 = dVar.f98347a + (z11 ? k11 : j11);
            dVar.f98347a = i12;
            int i13 = dVar.f98349c;
            if (!z11) {
                j11 = k11;
            }
            int i14 = i13 + j11;
            dVar.f98349c = i14;
            view.setPaddingRelative(i12, dVar.f98348b, i14, dVar.f98350d);
            return c5353y0;
        }
    }

    @Deprecated
    public interface b extends f.b {
    }

    @Deprecated
    /* renamed from: com.google.android.material.bottomnavigation.c$c, reason: collision with other inner class name */
    public interface InterfaceC0879c extends f.c {
    }

    public c(@NonNull Context context) {
        this(context, null);
    }

    private void addCompatibilityTopDivider(@NonNull Context context) {
        View view = new View(context);
        view.setBackgroundColor(androidx.core.content.a.getColor(context, R.color.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    private void applyWindowInsets() {
        C9621p.a(this, new a());
    }

    private int makeMinHeightSpec(int i11) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i11) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i11;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
    }

    private boolean shouldDrawCompatibilityTopDivider() {
        return false;
    }

    @Override // com.google.android.material.navigation.f
    @NonNull
    protected d createNavigationBarMenuView(@NonNull Context context) {
        return new com.google.android.material.bottomnavigation.b(context);
    }

    @Override // com.google.android.material.navigation.f
    public int getMaxItemCount() {
        return 5;
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return ((com.google.android.material.bottomnavigation.b) getMenuView()).Z();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, makeMinHeightSpec(i12));
    }

    public void setItemHorizontalTranslationEnabled(boolean z11) {
        com.google.android.material.bottomnavigation.b bVar = (com.google.android.material.bottomnavigation.b) getMenuView();
        if (bVar.Z() != z11) {
            bVar.a0(z11);
            getPresenter().e(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(b bVar) {
        setOnItemReselectedListener(bVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(InterfaceC0879c interfaceC0879c) {
        setOnItemSelectedListener(interfaceC0879c);
    }

    public c(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    public c(@NonNull Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, R.style.Widget_Design_BottomNavigationView);
    }

    public c(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Context context2 = getContext();
        b0 f7 = C9619n.f(context2, attributeSet, C7017a.f65938d, i11, i12, new int[0]);
        setItemHorizontalTranslationEnabled(f7.a(1, true));
        if (f7.s(0)) {
            setMinimumHeight(f7.f(0, 0));
        }
        f7.x();
        if (shouldDrawCompatibilityTopDivider()) {
            addCompatibilityTopDivider(context2);
        }
        applyWindowInsets();
    }
}
