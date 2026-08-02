package com.vk.voip.ui.call_invite.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.cn70;
import xsna.f4m;

/* compiled from: AnonymCallJoinContainerChildView.kt */
/* loaded from: classes7.dex */
public final class AnonymCallJoinContainerChildView extends ViewGroup {
    public final int b;
    public final View c;
    public final View d;
    public final View e;

    public AnonymCallJoinContainerChildView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = cn70.b(72);
        View inflate = LayoutInflater.from(context).inflate(R.layout.voip_group_call_invite_data_state, (ViewGroup) this, false);
        if (inflate instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) inflate;
            View findViewById = viewGroup.findViewById(R.id.voip_call_link_share_btn);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            View findViewById2 = viewGroup.findViewById(R.id.voip_call_invite_scan_device_qr_code_button);
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
            }
        }
        this.c = inflate;
        f4m.x(cn70.b(24), inflate);
        f4m.w(cn70.b(24), inflate);
        addView(inflate);
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.voip_group_call_invite_progress_state, (ViewGroup) this, false);
        this.d = inflate2;
        f4m.x(cn70.b(24), inflate2);
        f4m.w(cn70.b(24), inflate2);
        addView(inflate2);
        View inflate3 = LayoutInflater.from(context).inflate(R.layout.voip_group_call_bottom_view, (ViewGroup) this, false);
        this.e = inflate3;
        addView(inflate3);
    }

    public final View getBottomView() {
        return this.e;
    }

    public final View getDataContainer() {
        return this.c;
    }

    public final View getProgressContainer() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.c;
        boolean K = bwt0.K(view);
        View view2 = this.e;
        if (K) {
            int measuredWidth = (getMeasuredWidth() - view.getMeasuredWidth()) / 2;
            int measuredHeight = ((getMeasuredHeight() - view2.getMeasuredHeight()) - view.getMeasuredHeight()) / 2;
            view.layout(measuredWidth, measuredHeight, view.getMeasuredWidth() + measuredWidth, view.getMeasuredHeight() + measuredHeight);
        } else {
            View view3 = this.d;
            if (bwt0.K(view3)) {
                int measuredWidth2 = (getMeasuredWidth() - view3.getMeasuredWidth()) / 2;
                int measuredHeight2 = ((getMeasuredHeight() - view2.getMeasuredHeight()) - view3.getMeasuredHeight()) / 2;
                view3.layout(measuredWidth2, measuredHeight2, view3.getMeasuredWidth() + measuredWidth2, view3.getMeasuredHeight() + measuredHeight2);
            }
        }
        view2.layout(0, getMeasuredHeight() - view2.getMeasuredHeight(), view2.getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        View view = this.e;
        measureChild(view, i, i2);
        View view2 = this.c;
        if (bwt0.K(view2)) {
            measureChild(view2, i, i2);
            i3 = view2.getMeasuredHeight();
        } else {
            View view3 = this.d;
            if (bwt0.K(view3)) {
                measureChild(view3, i, i2);
                i3 = view3.getMeasuredHeight();
            } else {
                i3 = 0;
            }
        }
        int size = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) == 0) {
            size = view.getMeasuredHeight() + (this.b * 2) + i3;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
    }
}
