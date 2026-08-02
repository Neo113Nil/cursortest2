package com.tonicartos.superslim;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tonicartos.superslim.LayoutManager;
import com.tonicartos.superslim.b;

/* compiled from: SectionLayoutManager.java */
/* loaded from: classes14.dex */
public abstract class e {
    public final LayoutManager a;

    public e(LayoutManager layoutManager) {
        this.a = layoutManager;
    }

    public final void a(b.a aVar, int i, LayoutManager.Direction direction, b bVar) {
        LayoutManager.Direction direction2 = LayoutManager.Direction.START;
        LayoutManager layoutManager = this.a;
        int childCount = direction == direction2 ? 0 : layoutManager.getChildCount();
        bVar.b(i);
        layoutManager.addView(aVar.a, childCount);
    }

    public abstract int b(int i, d dVar, b bVar);

    public abstract int c(int i, int i2, int i3, d dVar, b bVar);

    public abstract int d(int i, int i2, int i3, d dVar, b bVar);

    public abstract int e(int i, View view, b bVar, d dVar);

    public abstract int f(int i, View view, b bVar, d dVar);

    public LayoutManager.b g(Context context, AttributeSet attributeSet) {
        return new LayoutManager.b(context, attributeSet);
    }

    public final View i(int i, boolean z) {
        LayoutManager layoutManager = this.a;
        int childCount = layoutManager.getChildCount();
        int i2 = 0;
        View view = null;
        while (i2 < childCount) {
            View childAt = layoutManager.getChildAt(i2);
            LayoutManager.b bVar = (LayoutManager.b) childAt.getLayoutParams();
            if (i != bVar.i()) {
                break;
            }
            if (!bVar.f || !z) {
                return childAt;
            }
            i2++;
            view = childAt;
        }
        return view;
    }

    public int j(int i, int i2, int i3) {
        while (i2 >= 0) {
            LayoutManager layoutManager = this.a;
            View childAt = layoutManager.getChildAt(i2);
            LayoutManager.b bVar = (LayoutManager.b) childAt.getLayoutParams();
            if (bVar.i() != i) {
                break;
            }
            if (!bVar.f) {
                return layoutManager.getDecoratedBottom(childAt);
            }
            i2--;
        }
        return i3;
    }

    public LayoutManager.b h(LayoutManager.b bVar) {
        return bVar;
    }

    public e k(d dVar) {
        return this;
    }
}
