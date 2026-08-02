package com.vk.clips.design.view.timeline;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import xsna.b140;
import xsna.bpn0;
import xsna.gzs;
import xsna.jjc;
import xsna.k7l0;
import xsna.mlf0;
import xsna.s3q0;
import xsna.vpj0;

/* compiled from: TimelineEditingActionsView.kt */
/* loaded from: classes16.dex */
public final class TimelineEditingActionsView extends ConstraintLayout {
    public static final /* synthetic */ int x = 0;
    public gzs<s3q0> t;
    public gzs<s3q0> u;
    public final bpn0 v;
    public final bpn0 w;

    public TimelineEditingActionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.v = new bpn0(new vpj0(this, 8));
        this.w = new bpn0(new mlf0(this, 8));
        LayoutInflater.from(context).inflate(R.layout.timeline_editing_actions_view, this);
        setBackgroundColor(context.getColor(R.color.vk_black));
        jjc.g(getCancel(), new k7l0(this, 10));
        jjc.g(getDone(), new b140(this, 28));
    }

    private final VkButton getCancel() {
        return (VkButton) this.v.getValue();
    }

    private final VkButton getDone() {
        return (VkButton) this.w.getValue();
    }

    public final gzs<s3q0> getOnCancel() {
        return this.t;
    }

    public final gzs<s3q0> getOnDone() {
        return this.u;
    }

    public final void setOnCancel(gzs<s3q0> gzsVar) {
        this.t = gzsVar;
    }

    public final void setOnDone(gzs<s3q0> gzsVar) {
        this.u = gzsVar;
    }
}
