package com.vk.clips.design.view.timeline;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.design.view.timeline.ActionButton;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import java.util.List;
import xsna.ad0;
import xsna.bpn0;
import xsna.e5p0;
import xsna.fv90;
import xsna.gzs;
import xsna.hwo0;
import xsna.i8n0;
import xsna.iwo0;
import xsna.ixd;
import xsna.jjc;
import xsna.m33;
import xsna.n2q;
import xsna.pg;
import xsna.s3q0;
import xsna.t60;
import xsna.tf3;
import xsna.tu80;
import xsna.wzs;
import xsna.y6c;
import xsna.zoj0;

/* compiled from: TimelineBottomActionsView.kt */
/* loaded from: classes16.dex */
public final class TimelineBottomActionsView extends ConstraintLayout {
    public static final /* synthetic */ int z = 0;
    public wzs<? super iwo0, ? super View, s3q0> t;
    public wzs<? super e5p0, ? super View, s3q0> u;
    public gzs<s3q0> v;
    public final bpn0 w;
    public final bpn0 x;
    public final b y;

    /* compiled from: TimelineBottomActionsView.kt */
    public static final class a extends RecyclerView.e0 {
        public final pg l;
        public final y6c m;
        public final ActionButton n;
        public iwo0 o;

        public a(ViewGroup viewGroup, pg pgVar, y6c y6cVar) {
            super(viewGroup);
            this.l = pgVar;
            this.m = y6cVar;
            this.n = (ActionButton) this.itemView.findViewById(R.id.bottom_action_button);
            viewGroup.setOnClickListener(new n2q(5, this, viewGroup));
            View view = this.itemView;
            if (!view.isLaidOut() || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new hwo0(this));
                return;
            }
            iwo0 iwo0Var = this.o;
            e5p0 e5p0Var = (iwo0Var == null ? null : iwo0Var).e;
            if (e5p0Var != null) {
                y6cVar.invoke(e5p0Var, this.itemView);
            }
        }
    }

    /* compiled from: TimelineBottomActionsView.kt */
    public final class b extends zoj0<iwo0, a> {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            a aVar = (a) e0Var;
            iwo0 iwo0Var = (iwo0) this.c.c(i);
            aVar.o = iwo0Var;
            ActionButton actionButton = aVar.n;
            actionButton.setState(ActionButton.ActionButtonState.BUTTON_BOTTOM);
            actionButton.setTitle(iwo0Var.c);
            actionButton.setIcon(m33.a(iwo0Var.b, actionButton.getContext()));
            ixd ixdVar = ad0.g;
            if (ixdVar == null) {
                ixdVar = null;
            }
            ixd.b bVar = ixdVar.a;
            actionButton.setBadgeIcon(Integer.valueOf(R.drawable.vk_icon_help_12));
            boolean z = false;
            actionButton.setBadgeVisible(false);
            t60 t60Var = iwo0Var.d;
            if (t60Var != null && t60Var.a()) {
                z = true;
            }
            actionButton.setEnabled(!z);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            ViewGroup viewGroup2 = (ViewGroup) tf3.b(viewGroup, R.layout.timeline_bottom_action_button, viewGroup, false);
            TimelineBottomActionsView timelineBottomActionsView = TimelineBottomActionsView.this;
            return new a(viewGroup2, new pg(timelineBottomActionsView, 9), new y6c(timelineBottomActionsView, 16));
        }
    }

    public TimelineBottomActionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.w = new bpn0(new tu80(this, 28));
        this.x = new bpn0(new i8n0(this, 2));
        b bVar = new b();
        this.y = bVar;
        LayoutInflater.from(context).inflate(R.layout.timeline_bottom_actions_view, this);
        setBackgroundColor(context.getColor(R.color.vk_black));
        jjc.g(getAccept(), new fv90(this, 29));
        RecyclerView actionsList = getActionsList();
        actionsList.setLayoutManager(new LinearLayoutManager(0, false));
        actionsList.setAdapter(bVar);
        actionsList.setItemAnimator(null);
    }

    private final VkButton getAccept() {
        return (VkButton) this.w.getValue();
    }

    private final RecyclerView getActionsList() {
        return (RecyclerView) this.x.getValue();
    }

    public final wzs<iwo0, View, s3q0> getOnActionListener$timeline_release() {
        return this.t;
    }

    public final gzs<s3q0> getOnApplyListener$timeline_release() {
        return this.v;
    }

    public final wzs<e5p0, View, s3q0> getShowOnboardingTooltip$timeline_release() {
        return this.u;
    }

    public final void setActions(List<iwo0> list) {
        this.y.setItems(list);
    }

    public final void setApplyButtonEnabled(boolean z2) {
        getAccept().setAlpha(z2 ? 1.0f : 0.64f);
    }

    public final void setApplyButtonText(int i) {
        getAccept().setText(getContext().getString(i));
    }

    public final void setOnActionListener$timeline_release(wzs<? super iwo0, ? super View, s3q0> wzsVar) {
        this.t = wzsVar;
    }

    public final void setOnApplyListener$timeline_release(gzs<s3q0> gzsVar) {
        this.v = gzsVar;
    }

    public final void setShowOnboardingTooltip$timeline_release(wzs<? super e5p0, ? super View, s3q0> wzsVar) {
        this.u = wzsVar;
    }
}
