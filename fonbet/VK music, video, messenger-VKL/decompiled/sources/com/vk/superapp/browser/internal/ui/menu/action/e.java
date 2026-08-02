package com.vk.superapp.browser.internal.ui.menu.action;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.cell.VkCell;
import com.vk.superapp.browser.internal.ui.menu.action.n;
import com.vkontakte.android.R;
import xsna.a820;
import xsna.f4m;
import xsna.iah0;
import xsna.jjc;
import xsna.m520;
import xsna.uv20;
import xsna.vjo;

/* compiled from: OtherActionViewHolder.kt */
/* loaded from: classes6.dex */
public final class e extends RecyclerView.e0 {
    public final m520 l;
    public final a820 m;
    public OtherAction n;
    public final VkCell o;
    public boolean p;

    public e(c cVar, n.b bVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater.inflate(R.layout.vk_action_menu_other_action_item, viewGroup, false));
        this.l = cVar;
        this.m = bVar;
        View view = this.itemView;
        this.o = (VkCell) view;
        jjc.g(view, new uv20(this, 15));
        View view2 = this.itemView;
        view2.setBackground(vjo.a(view2.getContext(), 0, 0, 0, iah0.b(8.0f), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 444));
        if (cVar.a.K()) {
            f4m.y(iah0.a(4), this.itemView);
        }
    }
}
