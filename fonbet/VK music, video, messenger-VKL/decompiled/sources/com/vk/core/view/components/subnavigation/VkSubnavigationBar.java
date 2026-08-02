package com.vk.core.view.components.subnavigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.R$styleable;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import xsna.e43;
import xsna.fgg0;
import xsna.j5g;
import xsna.rl3;
import xsna.s3q0;

/* compiled from: VkSubnavigationBar.kt */
/* loaded from: classes17.dex */
public final class VkSubnavigationBar extends HorizontalScrollView {
    public boolean b;
    public SubnavigationBarAppearance c;
    public boolean d;
    public View.OnTouchListener e;
    public final ArrayList f;
    public final VkSubnavigationBarLayout g;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public final c m;
    public boolean n;
    public boolean o;

    /* compiled from: VkSubnavigationBar.kt */
    public static final class a<T extends View & SubnavigationButton> {
        public final T a;
        public boolean c;
        public int b = -1;
        public boolean d = true;

        public a(T t) {
            this.a = t;
        }

        public final void a(boolean z) {
            this.a.setActive(z);
            this.c = z;
        }

        public final void b(CharSequence charSequence) {
            this.a.setLabel(charSequence);
        }
    }

    /* compiled from: VkSubnavigationBar.kt */
    public interface b {
        void a(a<?> aVar);
    }

    /* compiled from: VkSubnavigationBar.kt */
    public final class c implements com.vk.core.view.components.subnavigation.b {
        public c() {
        }

        @Override // com.vk.core.view.components.subnavigation.b
        public final void a(SubnavigationButton subnavigationButton) {
            VkSubnavigationBar vkSubnavigationBar = VkSubnavigationBar.this;
            Iterator it = vkSubnavigationBar.h.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                if (((a) next).a.equals(subnavigationButton)) {
                    break;
                } else {
                    i++;
                }
            }
            Integer valueOf = i != -1 ? Integer.valueOf(i) : null;
            vkSubnavigationBar.b(valueOf != null ? valueOf.intValue() : -1);
        }

        @Override // com.vk.core.view.components.subnavigation.b
        public final SubnavigationBarAppearance b() {
            return VkSubnavigationBar.this.getAppearance();
        }

        @Override // com.vk.core.view.components.subnavigation.b
        public final void c(VkSubnavigationButton vkSubnavigationButton) {
            VkSubnavigationBar.this.i.remove(vkSubnavigationButton);
        }
    }

    public VkSubnavigationBar(Context context) {
        this(context, null, 0, 14, 0);
    }

    public static void d(ArrayList arrayList, a aVar) {
        Iterator it = new fgg0(arrayList).iterator();
        while (true) {
            ListIterator<T> listIterator = ((fgg0.a) it).b;
            if (!listIterator.hasPrevious()) {
                return;
            } else {
                ((b) listIterator.previous()).a(aVar);
            }
        }
    }

    public final void a(a<?> aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar.d && (indexOf = (arrayList = this.h).indexOf(aVar)) >= 0 && indexOf < arrayList.size()) {
            if (!this.d) {
                b(indexOf);
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2.b == indexOf) {
                    boolean z = aVar2.c;
                    ArrayList arrayList2 = this.f;
                    if (z) {
                        aVar2.a(false);
                        d(this.l, aVar2);
                        arrayList2.remove(aVar2);
                    } else {
                        aVar2.a(true);
                        d(this.j, aVar2);
                        arrayList2.add(aVar2);
                    }
                }
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof SubnavigationButton) {
            c(new a<>(view));
        } else {
            super.addView(view, layoutParams);
        }
    }

    public final void b(int i) {
        ArrayList arrayList = this.f;
        a aVar = arrayList != null ? (a) j5g.a0(arrayList) : null;
        if (aVar != null && aVar.b == i) {
            d(this.k, aVar);
            return;
        }
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            if (aVar2.b == i) {
                aVar2.a(true);
                arrayList.add(aVar2);
            } else {
                aVar2.a(false);
                arrayList.remove(aVar2);
            }
        }
        if (aVar != null) {
            d(this.l, aVar);
        }
        a aVar3 = (a) j5g.a0(arrayList);
        if (aVar3 != null) {
            d(this.j, aVar3);
        }
    }

    public final void c(a<?> aVar) {
        T t = aVar.a;
        t.setParent(this.m);
        ArrayList arrayList = this.h;
        aVar.b = arrayList.size();
        arrayList.add(aVar);
        if (this.f.isEmpty() && !this.d) {
            a(aVar);
        }
        this.g.addView(t);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.e;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(int i) {
        ArrayList arrayList = this.h;
        if (i >= 0 && i < arrayList.size()) {
            arrayList.remove(i);
            this.g.removeViewAt(i);
            int i2 = 0;
            for (Object obj : arrayList.subList(i, arrayList.size())) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                ((a) obj).b = i2;
                i2 = i3;
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f;
        if (isEmpty) {
            arrayList2.clear();
            return;
        }
        a aVar = (a) j5g.a0(arrayList2);
        if (aVar != null) {
            int i4 = aVar.b;
            int i5 = e43.g(arrayList).c;
            if (i4 > i5) {
                i4 = i5;
            }
            b(i4);
        }
    }

    public final List<a<?>> getActiveButtons() {
        return this.f;
    }

    public final SubnavigationBarAppearance getAppearance() {
        return this.c;
    }

    public final List<a<?>> getButtons() {
        return Collections.unmodifiableList(this.h);
    }

    public final int getButtonsCount() {
        return this.h.size();
    }

    public final View.OnTouchListener getDispatchTouchListener() {
        return this.e;
    }

    public final boolean getLeftFadingEdgeEnabled() {
        return this.n;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getLeftFadingEdgeStrength() {
        return this.n ? super.getLeftFadingEdgeStrength() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final boolean getMultiSelectIsEnabled() {
        return this.d;
    }

    public final boolean getRightFadingEdgeEnabled() {
        return this.o;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getRightFadingEdgeStrength() {
        return this.o ? super.getRightFadingEdgeStrength() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        measureChildWithMargins(view, i, 0, i2, 0);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i);
        if (!this.b || mode == 0) {
            super.measureChild(view, i, i3);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i5 = size - paddingRight;
        if (i5 < 0) {
            i5 = 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), ViewGroup.getChildMeasureSpec(i3, paddingBottom, layoutParams.height));
    }

    public final void setDispatchTouchListener(View.OnTouchListener onTouchListener) {
        this.e = onTouchListener;
    }

    public final void setFixed(boolean z) {
        this.b = z;
        this.g.setFixed(z);
    }

    public final void setLeftFadingEdgeEnabled(boolean z) {
        this.n = z;
    }

    public final void setMultiSelect(boolean z) {
        this.d = z;
    }

    public final void setRightFadingEdgeEnabled(boolean z) {
        this.o = z;
    }

    public final void setVerticalPaddingEnabled(boolean z) {
        if (!z) {
            setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
        } else {
            int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R.dimen.vk_ui_spacing_size_xl);
            setPadding(getPaddingLeft(), dimensionPixelOffset, getPaddingRight(), dimensionPixelOffset);
        }
    }

    public VkSubnavigationBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public VkSubnavigationBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ VkSubnavigationBar(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, android.view.ViewGroup, android.widget.HorizontalScrollView, com.vk.core.view.components.subnavigation.VkSubnavigationBar] */
    public VkSubnavigationBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = SubnavigationBarAppearance.Neutral;
        this.f = new ArrayList();
        VkSubnavigationBarLayout vkSubnavigationBarLayout = new VkSubnavigationBarLayout(context, null, 0, 14, 0);
        this.g = vkSubnavigationBarLayout;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new c();
        addView(vkSubnavigationBarLayout, new FrameLayout.LayoutParams(-1, -2));
        setFillViewport(true);
        setClipChildren(false);
        setClipToPadding(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.C);
        setFixed(obtainStyledAttributes.getBoolean(3, this.b));
        SubnavigationBarAppearance subnavigationBarAppearance = this.c;
        ?? r0 = (Enum) rl3.S(obtainStyledAttributes.getInt(2, subnavigationBarAppearance.ordinal()), SubnavigationBarAppearance.values());
        this.c = r0 != 0 ? r0 : subnavigationBarAppearance;
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(0, context.getResources().getDimensionPixelOffset(R.dimen.vk_ui_base_padding_horizontal));
        int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(1, context.getResources().getDimensionPixelOffset(R.dimen.vk_ui_spacing_size_xl));
        setPaddingRelative(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2);
        s3q0 s3q0Var = s3q0.a;
        obtainStyledAttributes.recycle();
        this.n = true;
        this.o = true;
    }
}
