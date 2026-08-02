package com.vk.libvideo.design.view.overlay;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.core.view.components.button.VkButton;
import com.vk.libvideo.design.view.timer.LiveTimerView;
import com.vkontakte.android.R;

/* compiled from: LiveUpcomingView.kt */
/* loaded from: classes2.dex */
public final class LiveUpcomingView extends LinearLayout {
    public final LiveTimerView b;
    public final TextView c;
    public final VkButton d;

    public LiveUpcomingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setGravity(17);
        LayoutInflater.from(context).inflate(R.layout.view_vk_live_upcoming, (ViewGroup) this, true);
        this.b = (LiveTimerView) findViewById(R.id.live_timer);
        this.c = (TextView) findViewById(R.id.live_description);
        this.d = (VkButton) findViewById(R.id.notification_button);
    }
}
