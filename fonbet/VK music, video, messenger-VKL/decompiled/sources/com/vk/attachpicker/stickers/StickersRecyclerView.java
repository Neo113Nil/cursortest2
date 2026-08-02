package com.vk.attachpicker.stickers;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* loaded from: classes15.dex */
public class StickersRecyclerView extends RecyclerView {
    public StickersRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int max = Math.max(3, getMeasuredWidth() / ((int) getResources().getDimension(R.dimen.picker_sticker_size)));
        if (getLayoutManager() != null) {
            ((GridLayoutManager) getLayoutManager()).setSpanCount(max);
        }
    }
}
