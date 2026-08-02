package com.vk.music.notifications.inapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.vk.music.notifications.inapp.InAppNotification;
import com.vkontakte.android.R;
import xsna.q3;

/* compiled from: PopupNotification.kt */
/* loaded from: classes3.dex */
public abstract class c extends InAppNotification {
    public final int e = R.style.PopupNotificationDialogStyleStyle;
    public final int f = 17;
    public final InAppNotification.DisplayingStrategy g = InAppNotification.DisplayingStrategy.REPLACE_ANY_SAME;
    public final InAppNotification.NotificationType h = InAppNotification.NotificationType.POPUP;

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final View B(Context context) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.music_popup_layout, new FrameLayout(context));
        View inflate = LayoutInflater.from(context).inflate(G(), (ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0));
        this.d = inflate;
        d3(inflate);
        inflate.setOnClickListener(new q3(this, 10));
        ((ViewGroup) inflate).getChildAt(0).setClickable(true);
        return viewGroup;
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public InAppNotification.DisplayingStrategy E() {
        return this.g;
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public int F() {
        return this.f;
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final InAppNotification.NotificationType I() {
        return this.h;
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final int J() {
        return this.e;
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final void O(Window window) {
        window.getAttributes().width = -1;
    }
}
