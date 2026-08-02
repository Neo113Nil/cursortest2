package com.bytedance.sdk.component;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.sdk.component.sf;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm {
    private static volatile Handler sf;
    private static final Object pcc = new Object();
    private static final LinkedList<Runnable> gm = new LinkedList<>();
    private static Object oo = new Object();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc extends Handler {
        public pcc(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    gm.gm();
                } catch (OutOfMemoryError unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void gm() {
        LinkedList linkedList;
        synchronized (oo) {
            try {
                synchronized (pcc) {
                    LinkedList<Runnable> linkedList2 = gm;
                    linkedList = (LinkedList) linkedList2.clone();
                    linkedList2.clear();
                    sf().removeMessages(1);
                }
                if (linkedList.size() > 0) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void pcc(Runnable runnable, boolean z) {
        try {
            Handler sf2 = sf();
            synchronized (pcc) {
                try {
                    gm.add(runnable);
                    if (z) {
                        sf2.sendEmptyMessageDelayed(1, 100L);
                    } else {
                        sf2.sendEmptyMessage(1);
                    }
                } finally {
                }
            }
        } catch (OutOfMemoryError unused) {
        }
    }

    private static Handler sf() {
        Handler handler;
        if (sf != null) {
            return sf;
        }
        synchronized (pcc) {
            try {
                if (sf == null) {
                    sf.pcc pccVar = sf.pcc;
                    HandlerThread pcc2 = pccVar != null ? pccVar.pcc("queued-work-looper", -2) : null;
                    if (pcc2 == null) {
                        pcc2 = new HandlerThread("queued-work-looper", -2);
                        pcc2.start();
                    }
                    sf = new pcc(pcc2.getLooper());
                }
                handler = sf;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }
}
