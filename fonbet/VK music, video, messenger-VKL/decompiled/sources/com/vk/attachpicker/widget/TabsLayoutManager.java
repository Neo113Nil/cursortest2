package com.vk.attachpicker.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import java.lang.reflect.Field;

/* loaded from: classes15.dex */
public class TabsLayoutManager extends LinearLayoutManager {
    public final Context r;

    public class a extends v {
        public a(Context context) {
            super(context);
            try {
                Field declaredField = v.class.getDeclaredField("mDecelerateInterpolator");
                declaredField.setAccessible(true);
                declaredField.set(this, new DecelerateInterpolator(3.0f));
            } catch (Exception unused) {
            }
        }

        @Override // androidx.recyclerview.widget.v
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 150.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.z
        public final PointF computeScrollVectorForPosition(int i) {
            return TabsLayoutManager.this.computeScrollVectorForPosition(i);
        }
    }

    public TabsLayoutManager(Context context) {
        super(0, false);
        this.r = context;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        a aVar = new a(this.r);
        aVar.setTargetPosition(i);
        startSmoothScroll(aVar);
    }
}
