package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.core.view.AbstractC2082d0;
import y2.AbstractC6849c;

/* loaded from: classes.dex */
public class m implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f23191a = new m();

    public static float e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            if (childAt != view) {
                float u10 = AbstractC2082d0.u(childAt);
                if (u10 > f10) {
                    f10 = u10;
                }
            }
        }
        return f10;
    }

    @Override // androidx.recyclerview.widget.l
    public void a(View view) {
        Object tag = view.getTag(AbstractC6849c.f68256a);
        if (tag instanceof Float) {
            AbstractC2082d0.s0(view, ((Float) tag).floatValue());
        }
        view.setTag(AbstractC6849c.f68256a, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.l
    public void b(View view) {
    }

    @Override // androidx.recyclerview.widget.l
    public void c(Canvas canvas, RecyclerView recyclerView, View view, float f10, float f11, int i10, boolean z10) {
        if (z10 && view.getTag(AbstractC6849c.f68256a) == null) {
            Float valueOf = Float.valueOf(AbstractC2082d0.u(view));
            AbstractC2082d0.s0(view, e(recyclerView, view) + 1.0f);
            view.setTag(AbstractC6849c.f68256a, valueOf);
        }
        view.setTranslationX(f10);
        view.setTranslationY(f11);
    }

    @Override // androidx.recyclerview.widget.l
    public void d(Canvas canvas, RecyclerView recyclerView, View view, float f10, float f11, int i10, boolean z10) {
    }
}
