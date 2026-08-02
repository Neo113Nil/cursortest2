package com.vk.attachpicker.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import com.vkontakte.android.R;
import me.grishka.appkit.views.UsableRecyclerView;

/* loaded from: classes15.dex */
public class GraffitiRecyclerView extends UsableRecyclerView {

    public class a extends GridLayoutManager.c {
        public final /* synthetic */ int d;

        public a(int i) {
            this.d = i;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            if (i == 0) {
                return this.d;
            }
            return 1;
        }
    }

    public GraffitiRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int max = Math.max(1, getMeasuredWidth() / ((int) getResources().getDimension(R.dimen.picker_graffiti_size)));
        if (getLayoutManager() != null) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) getLayoutManager();
            gridLayoutManager.setSpanCount(max);
            gridLayoutManager.x = new a(max);
        }
    }
}
