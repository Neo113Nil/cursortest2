package com.vk.clips.design.view.timeline;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.design.view.timeline.ActionButton;
import com.vk.clips.design.view.timeline.FragmentActionsView;
import com.vkontakte.android.R;
import xsna.ad0;
import xsna.ixd;
import xsna.las;
import xsna.s6k;
import xsna.tf3;
import xsna.zoj0;

/* compiled from: FragmentActionsView.kt */
/* loaded from: classes16.dex */
public final class b extends zoj0<las, FragmentActionsView.a> {
    public final /* synthetic */ FragmentActionsView e;

    public b(FragmentActionsView fragmentActionsView) {
        this.e = fragmentActionsView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        FragmentActionsView.a aVar = (FragmentActionsView.a) e0Var;
        las lasVar = (las) this.c.c(i);
        lasVar.getClass();
        aVar.n = lasVar;
        ActionButton actionButton = aVar.m;
        actionButton.setState(ActionButton.ActionButtonState.BUTTON_TOP);
        actionButton.setTitle(lasVar.c);
        actionButton.setIcon(lasVar.b);
        ixd ixdVar = ad0.g;
        if (ixdVar == null) {
            ixdVar = null;
        }
        ixd.b bVar = ixdVar.a;
        actionButton.setBadgeIcon(Integer.valueOf(R.drawable.vk_icon_help_12));
        actionButton.setBadgeVisible(false);
        actionButton.setEnabled(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new FragmentActionsView.a((ViewGroup) tf3.b(viewGroup, R.layout.timeline_fragment_action_button, viewGroup, false), new s6k(this.e, 16));
    }
}
