package com.bytedance.sdk.openadsdk.core.vy;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.settings.vh;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private static volatile long gm;
    private static volatile pcc pcc;
    private static volatile boolean sf;
    private Handler vj;
    private final Queue<C0104pcc> oo = new LinkedList();
    private final vh wh = lu.oo();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.core.vy.pcc$pcc, reason: collision with other inner class name */
    public static class C0104pcc {
        private final long pcc;
        private final String sf;

        private C0104pcc(long j, String str) {
            this.pcc = j;
            this.sf = str;
        }
    }

    private pcc() {
    }

    private synchronized void pcc(long j) {
        try {
            Handler handler = this.vj;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                this.vj = handler;
            }
            handler.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.vy.pcc.1
                @Override // java.lang.Runnable
                public void run() {
                    pcc.this.pcc(false);
                }
            }, j);
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized boolean sf(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        int lq = this.wh.lq();
        long ye = this.wh.ye();
        if (this.oo.size() <= 0 || this.oo.size() < lq) {
            this.oo.offer(new C0104pcc(currentTimeMillis, str));
        } else {
            long abs = Math.abs(currentTimeMillis - this.oo.peek().pcc);
            if (abs <= ye) {
                sf(ye - abs);
                return true;
            }
            this.oo.poll();
            this.oo.offer(new C0104pcc(currentTimeMillis, str));
        }
        return false;
    }

    public synchronized String gm() {
        String str;
        try {
            HashMap hashMap = new HashMap();
            for (C0104pcc c0104pcc : this.oo) {
                if (hashMap.containsKey(c0104pcc.sf)) {
                    hashMap.put(c0104pcc.sf, Integer.valueOf(((Integer) hashMap.get(c0104pcc.sf)).intValue() + 1));
                } else {
                    hashMap.put(c0104pcc.sf, 1);
                }
            }
            str = "";
            int i = Integer.MIN_VALUE;
            for (String str2 : hashMap.keySet()) {
                int intValue = ((Integer) hashMap.get(str2)).intValue();
                if (i < intValue) {
                    str = str2;
                    i = intValue;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return str;
    }

    public static pcc pcc() {
        if (pcc == null) {
            synchronized (pcc.class) {
                try {
                    if (pcc == null) {
                        pcc = new pcc();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pcc;
    }

    public synchronized boolean pcc(String str) {
        try {
            if (sf(str)) {
                pcc(true);
                pcc(gm);
            } else {
                pcc(false);
            }
        } catch (Throwable th) {
            throw th;
        }
        return sf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void pcc(boolean z) {
        sf = z;
    }

    public synchronized boolean sf() {
        return sf;
    }

    private synchronized void sf(long j) {
        gm = j;
    }
}
