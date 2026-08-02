package com.vk.clips.design.view.timer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import java.util.Arrays;

/* compiled from: TimerView.kt */
/* loaded from: classes16.dex */
public final class TimerView extends ConstraintLayout {
    public final VkText t;
    public final VkText u;
    public final VkText v;
    public final VkText w;
    public final Group x;
    public final Group y;
    public final Group z;

    public TimerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.live_timer_layout, (ViewGroup) this, true);
        this.t = (VkText) findViewById(R.id.days_left);
        this.u = (VkText) findViewById(R.id.hours_left);
        this.v = (VkText) findViewById(R.id.minutes_left);
        this.w = (VkText) findViewById(R.id.seconds_left);
        this.x = (Group) findViewById(R.id.days_group);
        this.y = (Group) findViewById(R.id.hours_group);
        this.z = (Group) findViewById(R.id.minutes_group);
        if (isInEditMode()) {
            P4(365, 23, 59, 59);
        }
    }

    public final void P4(int i, int i2, int i3, int i4) {
        boolean z = true;
        boolean z2 = i > 0;
        boolean z3 = i3 > 0;
        boolean z4 = i2 > 0;
        VkText vkText = this.u;
        VkText vkText2 = this.v;
        VkText vkText3 = this.w;
        if (z2) {
            vkText3.setText(String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1)));
            vkText2.setText(String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1)));
            vkText.setText(String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)));
            this.t.setText(String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
        } else if (z4) {
            vkText3.setText(String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1)));
            vkText2.setText(String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1)));
            vkText.setText(String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)));
        } else if (z3) {
            vkText3.setText(String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1)));
            vkText2.setText(String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1)));
        } else {
            vkText3.setText(String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1)));
        }
        this.x.setVisibility(z2 ? 0 : 8);
        this.y.setVisibility(z4 || z2 ? 0 : 8);
        if (!z3 && !z4 && !z2) {
            z = false;
        }
        this.z.setVisibility(z ? 0 : 8);
    }
}
