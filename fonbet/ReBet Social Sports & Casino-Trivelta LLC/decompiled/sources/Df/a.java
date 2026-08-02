package Df;

import android.graphics.Canvas;
import android.view.View;
import androidx.core.view.AbstractC2082d0;
import androidx.recyclerview.widget.RecyclerView;
import y2.AbstractC6849c;

/* loaded from: classes4.dex */
public class a extends b {
    private float e(RecyclerView recyclerView, View view) {
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

    @Override // Df.b, androidx.recyclerview.widget.l
    public void a(View view) {
        Object tag = view.getTag(AbstractC6849c.f68256a);
        if (tag != null && (tag instanceof Float)) {
            AbstractC2082d0.s0(view, ((Float) tag).floatValue());
        }
        view.setTag(AbstractC6849c.f68256a, null);
        super.a(view);
    }

    @Override // Df.b, androidx.recyclerview.widget.l
    public void c(Canvas canvas, RecyclerView recyclerView, View view, float f10, float f11, int i10, boolean z10) {
        if (z10 && view.getTag(AbstractC6849c.f68256a) == null) {
            Float valueOf = Float.valueOf(AbstractC2082d0.u(view));
            AbstractC2082d0.s0(view, e(recyclerView, view) + 1.0f);
            view.setTag(AbstractC6849c.f68256a, valueOf);
        }
        super.c(canvas, recyclerView, view, f10, f11, i10, z10);
    }
}
