package com.vk.attachpicker.util;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import java.lang.reflect.Field;

/* loaded from: classes15.dex */
public class LocationPickerLayoutManager extends LinearLayoutManager {

    public class a extends v {
        public a() {
            super(null);
            try {
                Field declaredField = v.class.getDeclaredField("mDecelerateInterpolator");
                declaredField.setAccessible(true);
                declaredField.set(this, new DecelerateInterpolator(3.0f));
            } catch (Exception unused) {
            }
        }

        @Override // androidx.recyclerview.widget.v
        public final int calculateDyToMakeVisible(View view, int i) {
            super.calculateDyToMakeVisible(view, i);
            LocationPickerLayoutManager locationPickerLayoutManager = LocationPickerLayoutManager.this;
            locationPickerLayoutManager.getClass();
            locationPickerLayoutManager.getClass();
            throw null;
        }

        @Override // androidx.recyclerview.widget.v
        public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.z
        public final PointF computeScrollVectorForPosition(int i) {
            return LocationPickerLayoutManager.this.computeScrollVectorForPosition(i);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        a aVar = new a();
        aVar.setTargetPosition(i);
        startSmoothScroll(aVar);
    }
}
