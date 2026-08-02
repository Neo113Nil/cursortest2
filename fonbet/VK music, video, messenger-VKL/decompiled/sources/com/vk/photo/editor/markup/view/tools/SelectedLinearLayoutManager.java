package com.vk.photo.editor.markup.view.tools;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: SelectedLinearLayoutManager.kt */
/* loaded from: classes4.dex */
public final class SelectedLinearLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final View getFocusedChild() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && getPosition(childAt) == 0) {
                return childAt;
            }
        }
        return super.getFocusedChild();
    }
}
