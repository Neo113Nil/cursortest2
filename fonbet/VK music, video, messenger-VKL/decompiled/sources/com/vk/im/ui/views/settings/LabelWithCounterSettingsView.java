package com.vk.im.ui.views.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.im.ui.views.counter.AnimatedCounterView;
import com.vk.im.ui.views.dialogs.AnimatedDialogUnreadMarkerView;
import xsna.bpn0;
import xsna.iah0;
import xsna.mh3;

/* compiled from: LabelWithCounterSettingsView.kt */
/* loaded from: classes2.dex */
public final class LabelWithCounterSettingsView extends LabelSettingsView {
    public static final /* synthetic */ int A = 0;
    public final AnimatedDialogUnreadMarkerView y;
    public final bpn0 z;

    public LabelWithCounterSettingsView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final void setBadgeNew(boolean z) {
        bpn0 bpn0Var = this.z;
        if (!z) {
            if (bpn0Var.isInitialized()) {
                removeView((View) bpn0Var.getValue());
            }
        } else {
            TextView textView = (TextView) bpn0Var.getValue();
            if (textView.getParent() != null) {
                return;
            }
            addView(textView);
        }
    }

    public final void setUnreadCount(int i) {
        AnimatedDialogUnreadMarkerView animatedDialogUnreadMarkerView = this.y;
        AnimatedCounterView.c(animatedDialogUnreadMarkerView, i);
        animatedDialogUnreadMarkerView.setVisibility(i > 0 ? 0 : 8);
    }

    public LabelWithCounterSettingsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public LabelWithCounterSettingsView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ LabelWithCounterSettingsView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public LabelWithCounterSettingsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        AnimatedDialogUnreadMarkerView animatedDialogUnreadMarkerView = new AnimatedDialogUnreadMarkerView(context, null);
        this.y = animatedDialogUnreadMarkerView;
        this.z = new bpn0(new mh3(12, context, this));
        animatedDialogUnreadMarkerView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.i = 0;
        bVar.l = 0;
        bVar.h = 0;
        bVar.E = 1.0f;
        animatedDialogUnreadMarkerView.setLayoutParams(bVar);
        TextView subtitleView = getSubtitleView();
        ViewGroup.LayoutParams layoutParams = subtitleView.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams;
            bVar2.g = animatedDialogUnreadMarkerView.getId();
            bVar2.h = -1;
            ((ViewGroup.MarginLayoutParams) bVar2).rightMargin = iah0.a(16);
            subtitleView.setLayoutParams(bVar2);
            animatedDialogUnreadMarkerView.setVisibility(8);
            addView(animatedDialogUnreadMarkerView);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }
}
