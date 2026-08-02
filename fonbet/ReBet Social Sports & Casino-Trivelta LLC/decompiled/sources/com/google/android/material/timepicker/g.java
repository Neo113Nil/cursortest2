package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class g extends ConstraintLayout {

    /* renamed from: A, reason: collision with root package name */
    public int f36460A;

    /* renamed from: B, reason: collision with root package name */
    public com.google.android.material.shape.i f36461B;

    /* renamed from: z, reason: collision with root package name */
    public final Runnable f36462z;

    public g(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(ia.i.f48481n, this);
        setBackground(y());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ia.m.RadialViewGroup, i10, 0);
        this.f36460A = obtainStyledAttributes.getDimensionPixelSize(ia.m.f49016r5, 0);
        this.f36462z = new Runnable() { // from class: com.google.android.material.timepicker.f
            @Override // java.lang.Runnable
            public final void run() {
                g.this.D();
            }
        };
        obtainStyledAttributes.recycle();
    }

    public static boolean C(View view) {
        return "skip".equals(view.getTag());
    }

    public int A() {
        return this.f36460A;
    }

    public void B(int i10) {
        this.f36460A = i10;
        D();
    }

    public void D() {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.f(this);
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != ia.g.f48423c && !C(childAt)) {
                int i11 = (Integer) childAt.getTag(ia.g.f48445n);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!hashMap.containsKey(i11)) {
                    hashMap.put(i11, new ArrayList());
                }
                ((List) hashMap.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            x((List) entry.getValue(), dVar, z(((Integer) entry.getKey()).intValue()));
        }
        dVar.c(this);
    }

    public final void E() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f36462z);
            handler.post(this.f36462z);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        E();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        D();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        E();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f36461B.f0(ColorStateList.valueOf(i10));
    }

    public final void x(List list, androidx.constraintlayout.widget.d dVar, int i10) {
        Iterator it = list.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            dVar.j(((View) it.next()).getId(), ia.g.f48423c, i10, f10);
            f10 += 360.0f / list.size();
        }
    }

    public final Drawable y() {
        com.google.android.material.shape.i iVar = new com.google.android.material.shape.i();
        this.f36461B = iVar;
        iVar.c0(new com.google.android.material.shape.l(0.5f));
        this.f36461B.f0(ColorStateList.valueOf(-1));
        return this.f36461B;
    }

    public int z(int i10) {
        return i10 == 2 ? Math.round(this.f36460A * 0.66f) : this.f36460A;
    }
}
