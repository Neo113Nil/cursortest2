package com.vk.libvideo.design.view.timer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;

/* compiled from: LiveTimerView.kt */
/* loaded from: classes2.dex */
public final class LiveTimerView extends ConstraintLayout {
    public static final /* synthetic */ int y = 0;
    public c t;
    public final VkText u;
    public final VkText v;
    public final VkText w;
    public final VkText x;

    public LiveTimerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.overlay_live_timer_layout, (ViewGroup) this, true);
        this.u = (VkText) findViewById(R.id.days_left);
        this.v = (VkText) findViewById(R.id.hours_left);
        this.w = (VkText) findViewById(R.id.minutes_left);
        this.x = (VkText) findViewById(R.id.seconds_left);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.t;
        if (cVar != null) {
            cVar.dispose();
        }
    }
}
