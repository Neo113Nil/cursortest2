package com.vk.music.notifications.inapp;

import android.view.Window;
import com.vk.music.notifications.inapp.InAppNotification;
import com.vkontakte.android.R;

/* compiled from: HeadsUpNotification.kt */
/* loaded from: classes3.dex */
public abstract class a extends InAppNotification {
    public final int e = R.style.HeadsUpNotificationDialogStyle;
    public final int f = 48;
    public final InAppNotification.DisplayingStrategy g = InAppNotification.DisplayingStrategy.DISCARD_IF_ANY_SAME_NOTIFICATION_DISPLAYED;
    public final InAppNotification.NotificationType h = InAppNotification.NotificationType.HEADS_UP;

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final InAppNotification.DisplayingStrategy E() {
        return this.g;
    }

    @Override // com.vk.music.notifications.inapp.InAppNotification
    public final int F() {
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
        window.addFlags(40);
        window.clearFlags(2);
        window.getAttributes().width = -1;
    }
}
