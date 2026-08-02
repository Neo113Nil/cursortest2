package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.view.Y;
import i7.C7017a;
import ru.ozon.app.android.R;
import y7.C10856g;
import y7.C10858i;

/* loaded from: classes9.dex */
class a extends ConstraintLayout {

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f58830c;

    /* renamed from: d, reason: collision with root package name */
    private int f58831d;

    /* renamed from: e, reason: collision with root package name */
    private C10856g f58832e;

    /* renamed from: com.google.android.material.timepicker.a$a, reason: collision with other inner class name */
    final class RunnableC0893a implements Runnable {
        RunnableC0893a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.d();
        }
    }

    public a(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i11, layoutParams);
        if (view.getId() == -1) {
            int i12 = Y.f42258g;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            Runnable runnable = this.f58830c;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    public final int b() {
        return this.f58831d;
    }

    public void c(int i11) {
        this.f58831d = i11;
        d();
    }

    protected final void d() {
        int childCount = getChildCount();
        int i11 = 1;
        for (int i12 = 0; i12 < childCount; i12++) {
            if ("skip".equals(getChildAt(i12).getTag())) {
                i11++;
            }
        }
        d dVar = new d();
        dVar.p(this);
        float f7 = 0.0f;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                dVar.u(f7, childAt.getId(), this.f58831d);
                f7 = (360.0f / (childCount - i11)) + f7;
            }
        }
        dVar.f(this);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        d();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            Runnable runnable = this.f58830c;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i11) {
        this.f58832e.B(ColorStateList.valueOf(i11));
    }

    public a(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C10856g c10856g = new C10856g();
        this.f58832e = c10856g;
        c10856g.z(new C10858i(0.5f));
        this.f58832e.B(ColorStateList.valueOf(-1));
        C10856g c10856g2 = this.f58832e;
        int i12 = Y.f42258g;
        setBackground(c10856g2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7017a.f65924H, i11, 0);
        this.f58831d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f58830c = new RunnableC0893a();
        obtainStyledAttributes.recycle();
    }
}
