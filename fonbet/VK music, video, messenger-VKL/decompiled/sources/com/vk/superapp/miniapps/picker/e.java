package com.vk.superapp.miniapps.picker;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.superapp.miniapps.picker.PickerItem;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.cws;
import xsna.iah0;

/* compiled from: ItemOpenViewHolder.kt */
/* loaded from: classes6.dex */
public final class e extends RecyclerView.e0 {
    public static final int o = iah0.a(44);
    public final k l;
    public final VkCell m;
    public PickerItem.c n;

    public e(View view, b bVar) {
        super(view);
        this.l = bVar;
        VkCell vkCell = (VkCell) view.findViewById(R.id.app_cell);
        this.m = vkCell;
        bwt0.i0(vkCell, new cws(this, 14));
    }
}
