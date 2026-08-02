package com.vk.music.notifications.inapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.vk.core.ui.tracking.UiTrackingScreen;
import java.util.Iterator;
import xsna.asp;
import xsna.e3m;
import xsna.epx;
import xsna.m0q0;
import xsna.s3q0;
import xsna.wqw;
import xsna.zrp;

/* compiled from: InAppNotificationManager.kt */
/* loaded from: classes3.dex */
public abstract class InAppNotification implements m0q0 {
    public final boolean b;
    public int c;
    public View d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InAppNotificationManager.kt */
    public static final class DisplayingStrategy {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DisplayingStrategy[] $VALUES;
        public static final DisplayingStrategy DISCARD_IF_ANY_DISPLAYED;
        public static final DisplayingStrategy DISCARD_IF_ANY_SAME_NOTIFICATION_DISPLAYED;
        public static final DisplayingStrategy MULTIPLE;
        public static final DisplayingStrategy REPLACE_ANY;
        public static final DisplayingStrategy REPLACE_ANY_SAME;

        static {
            DisplayingStrategy displayingStrategy = new DisplayingStrategy("MULTIPLE", 0);
            MULTIPLE = displayingStrategy;
            DisplayingStrategy displayingStrategy2 = new DisplayingStrategy("DISCARD_IF_ANY_DISPLAYED", 1);
            DISCARD_IF_ANY_DISPLAYED = displayingStrategy2;
            DisplayingStrategy displayingStrategy3 = new DisplayingStrategy("REPLACE_ANY", 2);
            REPLACE_ANY = displayingStrategy3;
            DisplayingStrategy displayingStrategy4 = new DisplayingStrategy("DISCARD_IF_ANY_SAME_NOTIFICATION_DISPLAYED", 3);
            DISCARD_IF_ANY_SAME_NOTIFICATION_DISPLAYED = displayingStrategy4;
            DisplayingStrategy displayingStrategy5 = new DisplayingStrategy("REPLACE_ANY_SAME", 4);
            REPLACE_ANY_SAME = displayingStrategy5;
            DisplayingStrategy[] displayingStrategyArr = {displayingStrategy, displayingStrategy2, displayingStrategy3, displayingStrategy4, displayingStrategy5};
            $VALUES = displayingStrategyArr;
            $ENTRIES = new asp(displayingStrategyArr);
        }

        public DisplayingStrategy() {
            throw null;
        }

        public static DisplayingStrategy valueOf(String str) {
            return (DisplayingStrategy) Enum.valueOf(DisplayingStrategy.class, str);
        }

        public static DisplayingStrategy[] values() {
            return (DisplayingStrategy[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InAppNotificationManager.kt */
    public static final class NotificationType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NotificationType[] $VALUES;
        public static final NotificationType HEADS_UP;
        public static final NotificationType NONE;
        public static final NotificationType POPUP;

        static {
            NotificationType notificationType = new NotificationType("NONE", 0);
            NONE = notificationType;
            NotificationType notificationType2 = new NotificationType("HEADS_UP", 1);
            HEADS_UP = notificationType2;
            NotificationType notificationType3 = new NotificationType("POPUP", 2);
            POPUP = notificationType3;
            NotificationType[] notificationTypeArr = {notificationType, notificationType2, notificationType3};
            $VALUES = notificationTypeArr;
            $ENTRIES = new asp(notificationTypeArr);
        }

        public NotificationType() {
            throw null;
        }

        public static NotificationType valueOf(String str) {
            return (NotificationType) Enum.valueOf(NotificationType.class, str);
        }

        public static NotificationType[] values() {
            return (NotificationType[]) $VALUES.clone();
        }
    }

    public InAppNotification() {
        DisplayingStrategy displayingStrategy = DisplayingStrategy.MULTIPLE;
        NotificationType notificationType = NotificationType.NONE;
        this.b = true;
    }

    public View B(Context context) {
        View inflate = LayoutInflater.from(context).inflate(G(), new FrameLayout(context));
        this.d = inflate;
        d3(inflate);
        return inflate;
    }

    public boolean C() {
        return this.b;
    }

    public abstract DisplayingStrategy E();

    public abstract int F();

    public abstract int G();

    public abstract NotificationType I();

    public abstract int J();

    public abstract void O(Window window);

    public boolean a0() {
        return false;
    }

    public void d() {
        Iterator<wqw> it = b.a.iterator();
        while (it.hasNext()) {
            wqw next = it.next();
            if (epx.f(next.b, this)) {
                Activity h = e3m.h(next.getContext());
                if (h != null && !h.isDestroyed()) {
                    try {
                        next.dismiss();
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable unused) {
                    }
                }
                it.remove();
            }
        }
    }

    public abstract void d3(View view);

    public void M() {
    }

    public void N() {
    }

    @Override // xsna.m0q0
    public void y(UiTrackingScreen uiTrackingScreen) {
    }
}
