package com.vk.music.notifications.inapp;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.Window;
import android.view.WindowManager;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.music.notifications.inapp.InAppNotification;
import java.util.Iterator;
import java.util.LinkedList;
import xsna.arf;
import xsna.byo;
import xsna.c63;
import xsna.e3m;
import xsna.io3;
import xsna.izs;
import xsna.s3q0;
import xsna.wqw;

/* compiled from: InAppNotificationManager.kt */
/* loaded from: classes3.dex */
public final class b {
    public static final LinkedList<wqw> a = new LinkedList<>();

    /* compiled from: InAppNotificationManager.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InAppNotification.DisplayingStrategy.values().length];
            try {
                iArr[InAppNotification.DisplayingStrategy.REPLACE_ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InAppNotification.DisplayingStrategy.REPLACE_ANY_SAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InAppNotification.DisplayingStrategy.DISCARD_IF_ANY_DISPLAYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InAppNotification.DisplayingStrategy.DISCARD_IF_ANY_SAME_NOTIFICATION_DISPLAYED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a() {
        c(new io3(22));
    }

    public static final void b() {
        c(new byo(5));
    }

    public static void c(izs izsVar) {
        Iterator<wqw> it = a.iterator();
        while (it.hasNext()) {
            wqw next = it.next();
            if (((Boolean) izsVar.invoke(next)).booleanValue()) {
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

    public static final void d(Context context, InAppNotification inAppNotification, DialogInterface.OnShowListener onShowListener, final DialogInterface.OnDismissListener onDismissListener) {
        int i = a.$EnumSwitchMapping$0[inAppNotification.E().ordinal()];
        LinkedList<wqw> linkedList = a;
        if (i == 1) {
            Iterator<wqw> it = linkedList.iterator();
            while (it.hasNext()) {
                wqw next = it.next();
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
        } else if (i == 2) {
            c(new arf(inAppNotification.I(), 23));
        } else if (i != 3) {
            if (i == 4 && (linkedList == null || !linkedList.isEmpty())) {
                Iterator<T> it2 = linkedList.iterator();
                while (it2.hasNext()) {
                    if (((wqw) it2.next()).b.I() == inAppNotification.I()) {
                        return;
                    }
                }
            }
        } else if (linkedList.size() > 0) {
            return;
        }
        final wqw wqwVar = new wqw(context, inAppNotification, inAppNotification.J());
        Context context2 = wqwVar.getContext();
        InAppNotification inAppNotification2 = wqwVar.b;
        wqwVar.setContentView(inAppNotification2.B(context2));
        Window window = wqwVar.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.gravity = inAppNotification2.F();
            }
            wqwVar.setCanceledOnTouchOutside(inAppNotification2.C());
            inAppNotification2.O(window);
        }
        UiTracker.i.h(wqwVar, true);
        wqwVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: xsna.xqw
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
                if (onDismissListener2 != null) {
                    onDismissListener2.onDismiss(dialogInterface);
                }
                com.vk.music.notifications.inapp.b.a.remove(wqwVar);
            }
        });
        wqwVar.setOnShowListener(onShowListener);
        wqwVar.show();
        linkedList.addLast(wqwVar);
    }

    public static void f(InAppNotification inAppNotification, DialogInterface.OnShowListener onShowListener, DialogInterface.OnDismissListener onDismissListener, int i) {
        if ((i & 2) != 0) {
            onShowListener = null;
        }
        if ((i & 4) != 0) {
            onDismissListener = null;
        }
        c63 c63Var = c63.a;
        Activity b = c63.b();
        if (b == null || b.isFinishing()) {
            return;
        }
        d(b, inAppNotification, onShowListener, onDismissListener);
    }
}
