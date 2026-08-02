package com.vk.clips.design.view.editor.swap;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: SwapItemsView.kt */
/* loaded from: classes16.dex */
public final class SwapItemsView extends ConstraintLayout {
    public final RecyclerView t;
    public final VkButton u;
    public final VkText v;

    public SwapItemsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.clip_swap_layout, this);
        this.t = (RecyclerView) findViewById(R.id.clips_editor_swap_recycler_view);
        this.u = (VkButton) findViewById(R.id.clips_swap_items_ready_button);
        this.v = (VkText) findViewById(R.id.clips_editor_swap_hint);
    }

    public final VkButton getReadyButton() {
        return this.u;
    }

    public final RecyclerView getRecyclerView() {
        return this.t;
    }
}
